/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int getheight(struct TreeNode* root)
{
    if(root == NULL)
    {
        return 0;
    }
    int lefth = getheight(root->left);
    int righth = getheight(root->right);

    return (lefth > righth ? lefth : righth) + 1;   
}
bool isBalanced(struct TreeNode* root) {
    if(root == NULL)
    {
        return true;
    }
    int left_hight = getheight(root->left);
    int right_hight = getheight(root->right);

    int diff = abs(left_hight - right_hight );
    if(diff  <= 1 && isBalanced(root->left) && isBalanced(root->right) )
    {
        return true;
    }
    else{
        return false;
    }
}
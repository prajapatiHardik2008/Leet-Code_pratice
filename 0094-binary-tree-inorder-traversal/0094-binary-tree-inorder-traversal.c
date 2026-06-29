/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int count(struct TreeNode* root)
 {
    if(root == NULL)
    {
        return 0;  // calling function while root not become null
    }
    return (1+ count(root->left) + count(root->right)); // + 1 for root node 
 }
void fillArray(struct TreeNode* root,int *out , int *index)
{
    if(root == NULL)
        return;
    
    fillArray(root->left,out,index);
    out[(*index)++] = root->val;
    fillArray(root->right,out,index);
}

int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    *returnSize = count(root); // getting return size from count function 
    int *out = (int*)malloc( (*returnSize) * sizeof(int) );
    int index = 0;

    fillArray(root,out,&index);
    return out;
}
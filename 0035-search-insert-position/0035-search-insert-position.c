int searchInsert(int* nums, int numsSize, int target) {
    int start = 0 , end = numsSize - 1 ;
    int mid; 
    while(start <= end)
    {
        mid = start + (end - start);
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(  nums[mid] > target )
        {
            end = mid - 1;

        }
        else {
            start = mid + 1;
        }
    }
    return start;
}
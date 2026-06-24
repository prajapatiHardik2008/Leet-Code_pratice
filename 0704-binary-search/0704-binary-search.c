int search(int* nums, int numsSize, int target) 
{
    int start=0,end = numsSize - 1;
   
    while(start <= end)
    {
        long mid = start + (end - start) / 2;
        if(nums[mid] == target)
        {
            return mid;
        }
        else if(nums[mid] < target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return -1;
}
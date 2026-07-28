class Solution(object):
    def smallestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s) <1:
            return s
        mid = len(s) // 2
        leftPart = sorted(s[:mid])
        midPart  = [s[mid]] if len(s)%2 == 1 else []
        rigthPart = leftPart[::-1]
        return "".join(leftPart + midPart + rigthPart)
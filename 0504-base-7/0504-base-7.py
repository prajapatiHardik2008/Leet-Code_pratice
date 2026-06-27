class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0:
            return "0"
        base7 = ""
        is_ng = num < 0
        num = abs(num)
        while(num > 0):
            base7 = str(num % 7) + base7
            num //= 7
        return "-"+base7 if is_ng else base7

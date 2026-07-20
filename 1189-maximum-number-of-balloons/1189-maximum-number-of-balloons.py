class Solution(object):
    def maxNumberOfBalloons(self, text):
        """
        :type text: str
        :rtype: int
        """
        charFrq = {
            'b':0,
            'a':0,
            'l':0,
            'o':0,
            'n':0
        }
        for Ch in text:
            if Ch == 'b' or Ch == 'a' or Ch == 'l' or Ch == 'o' or Ch == 'n':
                charFrq[Ch] += 1
    
        charFrq['l'] //= 2
        charFrq['o'] //= 2
        return min(charFrq.values())

        
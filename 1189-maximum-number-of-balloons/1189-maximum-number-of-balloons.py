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
                val = charFrq[Ch]+ 1
                charFrq.update({Ch:val})
        if charFrq['l'] < 2 or charFrq['o'] <2:
            return 0
        else:
            val = int(charFrq['l']/2)
            charFrq.update({'l':val})
            val = int(charFrq['o']/2)
            charFrq.update({'o':val})
        return min(charFrq.values())

        
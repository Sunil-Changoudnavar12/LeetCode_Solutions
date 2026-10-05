class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxwater=0 
        lp=0
        rp=len(height)-1
        while lp < rp:
            w =  rp - lp
            ht = min(height[lp] , height[rp])
            current = w * ht
            maxwater = max( maxwater , current )
            if height[lp] < height[rp]:
                lp+=1
            else:
                rp-=1
        return maxwater        
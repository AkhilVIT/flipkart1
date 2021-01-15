#Given a sorted array arr[] of distinct integers. Modify the array to look like a wave. In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
#Note: The converted array must be the lexicographically smallest wave array.



class Solution:
    def convertToWave(self, arr, N):
        for i in range(0,N-1,2):
            temp=arr[i]
            arr[i]=arr[i+1]
            arr[i+1]=temp
        return arr



#{ 
#  Driver Code Starts
#Initial Template for Python 3

import math
def main():
    T=int(input())
    while(T>0):
        N = int(input())
        arr = [int(x) for x in input().split()]
        ob = Solution()
        ob.convertToWave(arr,N)
        for i in arr:
            print(i,end=" ")
        print()
        T-=1

if __name__=="__main__":
    main()
# } Driver Code Ends

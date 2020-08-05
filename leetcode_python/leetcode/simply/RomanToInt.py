class Solution:
    def romanToInt(s):
        sDict = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000, 'IV':4, 'IX':9,
                 'XL':40, 'XC':90, 'CD':400, 'CM':900}
        sList = [s[0]]
        special = ['IV', 'IX', 'XL', 'XC', 'CD', 'CM']
        for i in s[1:len(s)]:
            if sList[len(sList)-1] + i in special:
                sList[len(sList)-1] = sList[len(sList)-1] + i
            else:
                sList.append(i)
        value = 0
        for i in sList:
            value += sDict[i]
        return value
    print(romanToInt("MCMXCIV"))
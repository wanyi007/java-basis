class Solution(object):
    def isValid(s):
        stack = []
        mapping = {")":"(","]":"[","}":"{"}
        for char in s:
            if char in mapping:
                top_element = stack.pop() if stack else "#"
                if mapping[char] != top_element:
                    return False
            else:
                stack.append(char)

        return not stack

    if __name__ == '__main__':
        print isValid("(){}[]")
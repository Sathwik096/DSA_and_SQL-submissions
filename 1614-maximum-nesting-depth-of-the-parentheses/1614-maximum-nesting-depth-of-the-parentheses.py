class Solution:
    def maxDepth(self, s: str) -> int:
        st = []
        depth = 0
        c = 0
        for ch in s:
            if ch == '(':
                st.append(ch)
                c += 1
            elif ch == ')' and st[-1] == '(':
                depth = max(depth,c)
                c -= 1
                st.pop()
        return depth

        
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:  # 类和方法的定义。在 Python 中使用缩进而非大括号来表示作用域。
        res = defaultdict(list)  # 使用 defaultdict 来自动初始化不存在的键对应的值为一个空列表。Java 需要显式检查键是否存在。
        for s in strs:  # 遍历字符串列表，与 Java 中的 for-each 循环类似。
            count = [0] * 26  # 创建一个长度为 26 的列表，所有元素初始化为 0，等同于 Java 中的 new int[26]。
            for c in s:  # 遍历字符串 s 中的每个字符。
                count[ord(c) - ord('a')] += 1  # ord() 获取字符的 ASCII 值，与 Java 中的 char 直接运算类似。
            res[tuple(count)].append(s)  # 将 count 数组转换为元组用作字典的键（Python 中的数组不可哈希，需转为元组），然后追加字符串 s 到对应的列表。
        return list(res.values())  # 返回字典的值的列表，每个值都是一个组，其中包含了具有相同字母频率的字符串。

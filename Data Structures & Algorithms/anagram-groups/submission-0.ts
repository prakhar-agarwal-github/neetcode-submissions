class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */

    reverse(str: string) {
        return str.split("").sort().join("");
    }
    groupAnagrams(strs: string[]): string[][] {
        const map = new Map<string, string[]>();

        for (let str of strs) {
            const reversedStr = this.reverse(str);
            if (map.has(reversedStr)) {
                map.set(reversedStr, [...map.get(reversedStr), str]);
            } else map.set(reversedStr, [str]);
        }

        const result: string[][] = [];

        for (const strArr of map.values()) {
            result.push(strArr)
        }

        return result;
    }
}

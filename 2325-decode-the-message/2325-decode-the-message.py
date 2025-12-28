class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        temp=97
        dici={}
        for keys in  key:
            if keys!=" " and keys not in dici:
                dici[keys]=chr(temp)
                temp+=1
        print(dici)
        ans=""
        for i in message:
            if i==" ":
                ans+=" "
            else:
                ans+=dici[i]
        return ans
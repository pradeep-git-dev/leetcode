class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st2 = new Stack<>();
        int num = 0;
        StringBuilder curr = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }else if(c == '['){
                st.push(num);
                st2.push(curr);
                num = 0;
                curr = new StringBuilder();
            }else if(c == ']'){
                int t = st.pop();
                StringBuilder str = st2.pop();
                while(t > 0){
                    str.append(curr);
                    t--;
                }
                curr = str;
            }else{
                curr.append(c);
            }
        }
        return curr.toString();
    }
}
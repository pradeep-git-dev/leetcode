class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int num : asteroids) {
            if(num > 0){
                st.push(num);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -num){
                    st.pop();
                }

                if(st.isEmpty() || st.peek() < 0 ){
                    st.push(num);
                }

                if(st.peek() == -num){
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        int i = res.length - 1;
        while(!st.isEmpty()){
            res[i--] = st.pop();
        }
        return res;
    }
}
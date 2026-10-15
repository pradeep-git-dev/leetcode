class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dir = new LinkedList<>();
        int i = 0;

        for(char ch : senate.toCharArray()){
            if(ch == 'R'){
                rad.offer(i++);
            }else{
                dir.offer(i++);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty()){
            if(rad.peek() < dir.peek()){
                rad.offer(n++);
            }else{
                dir.offer(n++);
            }
            rad.poll();
            dir.poll();
        }
        return rad.isEmpty() ? "Dire" : "Radiant" ;

    }
}
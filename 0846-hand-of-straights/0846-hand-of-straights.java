class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if( n % groupSize != 0) return false;
        Map<Integer , Integer> map = new HashMap<>();
        Arrays.sort(hand);
        int sum = 0;

        for(int num : hand){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        while(!map.isEmpty()){
            int prev = -1;
            for(int num : hand){
                if(map.containsKey(num)){
                    prev = num;
                    break;
                }
            }

            for(int i=0; i<groupSize; i++){
                int curr = prev + i;
                if(!map.containsKey(curr)){
                    return false;
                }

                if(map.get(curr) == 1){
                    map.remove(curr);
                }else{
                    map.replace(curr , map.get(curr) - 1);
                }
            }

        }
        return true;
        
    }
}
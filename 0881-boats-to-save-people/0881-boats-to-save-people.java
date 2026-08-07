class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c = 0;
        int n = people.length;
        Arrays.sort(people);
        int i=0, j = n - 1;
        while(i <= j){
            if(people[j] == limit){
                c++;
                j--;
            }else if(people[i] + people[j] <= limit){
                c++;
                i++; 
                j--;
            }else{
                c++; 
                j--;
            }
        }
        return c;
    }
}
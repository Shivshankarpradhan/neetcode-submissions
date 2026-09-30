class Solution {
    public int longestConsecutive(int[] nums) {



      Set<Integer>st = new HashSet<>();

        for(int num : nums){
              st.add(num);
        }
       
       int longest = 0;

        for(int num : nums){

              if(!st.contains(num-1)){
                  int current  = num ; 
                    int currStreak = 1;


                      while(st.contains(current + 1)){
                        current += 1;
                        currStreak += 1;
                      }

                      longest = Math.max(longest , currStreak);
              }
        }

return longest;

         
        
    }
}

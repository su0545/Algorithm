class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int aa = 0;
        int bb = 0;
        
        for ( int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0){
                aa++;
            }
            else{
                bb++;
            }
        }
        
        answer[0] = aa;
        answer[1] = bb;
        
        return answer;
    }
}
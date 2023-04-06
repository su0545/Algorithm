class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] aeiou = {"a","e","i","o","u"};
        for(int i = 0; i < aeiou.length; i++){
            if ( my_string.contains(aeiou[i])){
                answer = my_string.replaceAll(aeiou[i], "");
                my_string = answer;
            }else{
                answer = my_string;
            }
        }
        
        return answer;
        
    }
}
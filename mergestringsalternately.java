class Solution {

    public static void main(String args[]){
        String word1 = "kahjgk";
        Stign workd2 = "kdgi";
        System.out.println(mergeAlternately(word1,word2));
    }
    public String mergeAlternately(String word1, String word2) {
         StringBuilder sn = new StringBuilder();
        int i =0;
        int j=0;
        boolean flag = true;

        while(i < word1.length() && j < word2.length()){
            if(flag){
                sn.append(word1.charAt(i));
                i++;
            }else{
                sn.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }

        while(i < word1.length()){
            sn.append(word1.charAt(i));
            i++;
        }
         while(j < word2.length()){
            sn.append(word2.charAt(j));
            j++;
        }
        return sn.toString();
    }
}
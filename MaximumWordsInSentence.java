public class MaximumWordsInSentence {
    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i=0; i<sentences.length; i++){
            int words = 1;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j)== ' '){
                    words++;
                }
            }
            count = Math.max(count, words);
        }
        return count;
    }
    public static void main(String[] args) {
        String sentences[] = {"alice and bob love leetcode","i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}

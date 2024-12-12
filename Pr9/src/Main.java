public class Main {
    public static  int[] prefixFunction(char[] text) {
        int n = text.length;
        int[] pi =  new int[n];
        for(int i = 1; i < n; i++) {
            int j = pi[i-1];
            for(; j>0 && text[j] != text[i];){
                j = pi[j-1];
            }
            if(text[i] == text[j]) {
                j+=1;
            }
        }
        return pi;
    }

    public static int kmpSearch(char[] text, char[] subText, int startIndex){
        int j = 0;
        int[] pi = prefixFunction(subText);
        for (int i = startIndex; i < text.length; i++){
            for(;j>0 && text[i] != subText[j];){
                j = pi[j - 1];
            }
            if(text[i] == subText[j]){
                j += 1;
            }
            if(j >= subText.length){
                return i - j + 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args){
        char[] text = {'a', 'b', 'a', 'b', 'a', 'c', 'a', 'b', 'a', 'c'};
        char[] subText = {'a', 'b', 'a', 'c'};
        int endIndex = kmpSearch(text, subText, 3);
        int startIndex =  endIndex - subText.length + 1;
        System.out.println(startIndex + ":" + endIndex);
    }
}

// ЭТО РЕШЕНИЕ ПОД ВОПРОСОМ!(я точно не уверен, можно ли было length, charAt и String использовать)
//public class Main {
//    public static  int[] prefixFunction(String text) {
//        int n = text.length();
//        int[] pi =  new int[n];
//        for(int i = 1; i < pi.length; i++) {
//            int j = pi[i-1];
//            for(; j>0 && text.charAt(j) != text.charAt(i);){
//                j = pi[j-1];
//            }
//            if(text.charAt(i) == text.charAt(j)) {
//                j+=1;
//            }
//        }
//        return pi;
//    }
//
//    public static int kmpSearch(String text, String subText, int startIndex){
//        int j = 0;
//        int[] pi = prefixFunction(subText);
//        for (int i = startIndex; i < text.length(); i++){
//            for(;j>0 && text.charAt(i) != subText.charAt(j);){
//                j = pi[j - 1];
//            }
//            if(text.charAt(i) == subText.charAt(j)){
//                j += 1;
//            }
//            if(j >= subText.length()){
//                return i - j + 1;
//            }
//        }
//        return  -1;
//    }
//
//    public static void main(String[] args){
//        String text ="ababacabac";
//        String subtext = "abac";
//        System.out.println(kmpSearch(text, subtext, 3));
//    }
//}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 6;
        Custom[] arr = getArr(n);

        for(Custom r: arr){
            r.print();
        }
    }


    private static Custom[] getArr(int size){
        Custom[] ans = new Custom[size];

        for(int i = 0; i < size; i++){
            if(i % 2 == 0) ans[i] = new Custom(i + 1);
            else{
                switch (i){
                    case 1:
                        ans[i] = new Custom(new Second());
                        break;
                    case 3:
                        ans[i] = new Custom(new Fourth());
                        break;
                    case 5:
                        ans[i] = new Custom(new Sixth());
                        break;
                }
            };
        }
        return ans;
    }
}
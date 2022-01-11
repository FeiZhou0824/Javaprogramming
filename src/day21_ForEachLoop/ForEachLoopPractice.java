package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String [] words = {"Java Programming", "Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};

        for (String eachWord : words) {
            System.out.println(eachWord);
            String firstLastCh = eachWord.charAt(0) +"" + eachWord.charAt(eachWord.length()-1);
            System.out.println(firstLastCh);

        }




    }
}

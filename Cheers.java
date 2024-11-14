// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String str = args[0];
                int num = Integer.parseInt(args[1]);
                String anLetters = "AEFHIKMNORSX";
                for(int i=0;i<str.length();i++){
                        boolean initial = false;
                        for(int j = 0;j<anLetters.length();j++){
                                if (str.charAt(i)==anLetters.charAt(j)) {
                                        initial = true;
                                }
                        }
                        if (initial==true) {
                                System.out.println("Give me an "+str.charAt(i)+": "+str.charAt(i)+"!");
                        }
                        else{
                                System.out.println("Give me a "+str.charAt(i)+": "+str.charAt(i)+"!");
                        }
                }
                System.out.println("What does that spell?");
                for(int i = 0;i<num;i++){
                        System.out.println(str+"!!!");
                }
                
                }
}

import java.util.Scanner;

public class CountingConcenetsAndVowels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String  to enter ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
        int concenont = 0;
        int vowels = 0;
        for(char ch: str.toCharArray()){
            if (ch >= 'a' && ch <='z') {

                if (ch=='a'|| ch =='e' || ch == 'i' || ch=='o'|| ch=='u'){

                    vowels+=1;
                    
                }
                else{
                    concenont+=1;
                }
                
            }
        }
        System.out.println("conconets = "+ concenont +" and the vowels in "+str +" is "+ vowels);


    }
    
}

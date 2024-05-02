import java.util.Scanner;
    public class lexus{
      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
    
       int counter = 0;
       System.out.print("how many time would you play: ");
        int playTime = input.nextInt();
      while(counter < playTime){


     System.out.print("Enter a number: ");
     int number = input.nextInt();
  

     if(number == 1){
  System.out.println(0);
}
   else System.out.println(1);
   counter++;
  } 
}
}
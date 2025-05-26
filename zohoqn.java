import java.util.Scanner;



//2.circumference of the square
public class zohoqn {
    public static void main(String[] args)
{
    int size = 4;
    
    int square = 4 * size;

    System.out.println("the square value is " + square);
}
}

//1. binary,octal,hexadecimal covert

class binary{
    public static void main(String[] args)
    {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the number" );
      int number = scan.nextInt();
      int temp = number;
      String binary = "   ";
      
      if(temp == 0)
      {
        binary = "0";
      }
       while(temp > 0)
       {
        
        int remainder = temp % 2;
        binary = remainder + binary;
        temp = temp / 2;
       }
       System.out.println("The binary value is " + binary);
        
       temp = number;
       String octal = " ";
       if(temp == 0)
       {
        octal = "0";
       }
       while(temp > 0)
    {
        int remainder = temp % 8;
        octal = remainder + octal;
        temp = temp /8;
    }
    System.out.println("the octal value is " + octal);
    
    temp = number;
    String hexa =" ";
    char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    if(temp == 0)
    {
        hexa = "0";
    }
    while(temp > 0)
    {
        int remainder = temp % 16;
        hexa = ch[remainder] + hexa;
        temp = temp /16;
    }
    System.out.println("the hexadecimal value is" + hexa);
    
}
}

//3. rectangle
class rectangle{
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        
        int total  = 2 * (length + breadth);
        System.out.println("the rectangle total value is" + total);
    }
}

//4. cylinder

/*class cylinder{
    public static void main(String[] args)
}*/



//5. single program to generate a division and addition table for agiven number

class divadd{
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
         int num = scan.nextInt();
        for(int i = 1;i<=10;i++)
        {   
           
            System.out.println( i + "+" + num + "=" + (i + num));
        }
        for(int i=1;i<=10i++)
        {
            System.out.println(i + "/" +num +"=" + (i / num));
            
        }
    }
}

//6. print the all ASCII value of all alphabets

class ASCII{
     public static void main(String[] args)
     {

        System.out.println("the uppercase ascii value are" );

        for(char ch='A';ch<='Z';ch++)
        {
            int asciivalue = ch + 0;
            System.out.println(ch + "=" + asciivalue);
        }
     }
}

//7. compute quotient and remainder of given number

class quotient{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int divie = scan.nextInt();

        int remainder = num % divie;

        int quot = num/ divie;
        System.out.println("the remainder is =" + remainder );
        System.out.println("the quotient is = " + quot);
    }
}

//8.Demonstrate thw working of keyword long double

class longdouble{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        double d = l;
        System.out.println("the long ans is" + l);
        System.out.println("the double value is" + d);
    }
}

//9.swap to numbers
class swap{
   
    public static void main(String[] args){
        int a =10;
        int b = 30;

        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println( "a" + " = "  + a + " b "  + " = " + b );
    }

}

//10.check number even or odd
class evenodd{
    public static void main(String[] args) {

        int num = 17;
        if(num % 2 ==0)
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}

//11.check whether a character is vowel or constant

class vowels{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
         {
            System.out.println(ch + " this letter is vowels");
         }
         else{
            System.out.println(ch + " this is constant letter");
         }
    }
}

//12 . find the largest number amoung four numbers
/*class largestfour{
    public static void main(String[] args)
    {
         
    
}*/




class pat{
    public static void main(String[] args)
    {
        int rows = 10;
        for(int i=1;i<rows;i++)
        {
            for(int spa =0;spa<rows-i;spa++)
            {
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i+ " ");
                }
                System.out.println();
            }   
        }
        
    }



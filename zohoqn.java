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
class cylinder{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double cylindersum = 2 * 3.14 * r;
        System.out.println("The circumference of the cylinder = " + cylindersum);  
    }
}

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

//12 . find the largest number amoung four number
class largestfour{
    public static void main(String[] args)
    {
        int largest = 0;
         int[] nums = {10,34,21,33};
         for(int i =0;i<nums.length;i++)
         {
            if(nums[i] > largest)
            {
                largest = nums[i];
            }
         }
         System.out.println("the largest four number is" +largest);
    
}
}


//13. find the roots of a quadratic equations

class quadratic{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c = scan.nextInt();
        double withinroot = b * b - 4 *a*c;
        System.out.println("withinroot = " + withinroot);
        if(withinroot > 0)
        {
            double r1 = (-b + Math.sqrt(withinroot))/(2*a);
            double r2 = (-b - Math.sqrt(withinroot)) / (2*a);
            System.out.println("r1 = " + r1);
            System.out.println("r2 =" + r2);
        }
    }
}

//14.check whether is number positive or negative

class positive{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num > 0)
        {
            System.out.println("the num is positive");
        }
        else if(num < 0)
        {
            System.out.println("the num is negative");
        }
        else{
            System.out.println("the number is zero");
        }
    }

}

//15.character is alphabet or not

class alphabet{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
       
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch + " is a alphabet");
        }
        else{
            System.out.println(ch +" not a alphabet");
        }
         
}
}

//16.calculate the sum of natural numbers and find the smallest of the sum

class natural{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number N terms :");
        int num = scan.nextInt();
         
        int sum = num * (num + 1) / 2;
        System.out.println(num + " natural number sum is " + sum);

        
        int smallest  = 9;
        int temp = sum;

        while(temp > 0)
        {
            int digit = temp % 10;
            if(digit < smallest)
            {
                smallest = digit ;
            }
            temp /= 10;
        }
        System.out.println("the natural number smallest number is " + smallest);

    }
}

//17.define the functionality of a conditional operator
class conditional{
    public static void main(String[] args)
    {
        int marks = 45;

        String result = (marks > 35) ? "pass" : "fail";
        System.out.println("the result is" + result);
    }
}

//18.Given the radius of two concentric circle find the area of the space between the circels

class circle{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("The bigcircle redius is :");
        int R = scan.nextInt();
        System.out.println("The smallcircle redius is :");
        int  r = scan.nextInt();

        if(R <= r )
        {
            System.out.println("Error the  not same center point of the circle");;
        }
        else{
            double area = Math.PI *(R  * R - r * r); //pi = 3.14
            System.out.println("the circle of area value is" + area);
            
        }
        


    }
}

//19.evaluate expression

class expression{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        int result1 = ++a - --b;
        System.out.println("++a - --b = " + result1 );

         a = 10;
         b = 6;
        int result2 = a-- % b++;
        System.out.println("a-- % b++ = " + result2);
    
        a = 10;
        b =5;
        int result3 = a *= b += 5;
        System.out.println("a *= b += 5 = " + result3);
       
        int result4 = 69 >>>2;
        System.out.println("69 >>> 2 = " + result4);
        
        a = 28;

        int result5 = a += ++a + ++a + -a + a--;
        System.out.println("a += ++a + ++a + -a + a--  =" + result5);
        
        int x = 5;
        int result6  = ++x *2 + 3* --x;
        System.out.println("++x *2 + 3* --x =" + result6);
    
        int y = 10;
        int z = (++y * (y++ + 5));
        System.out.println("++y * (y++ + 5) = " + z);

        int X =5;
        int x1 = ++X - X++ + --X;
         System.out.println("++x - x++ + --x = " + x1);
    }
}

 //25 write a program to demonstrate the functionalities of final keyword

 //26 . two sorted array,merge them such  the elements are not repeated and print the repeated elements

class Merged{
    public static void main(String[] args)
        {
           int[] arr1 =  {2,4,5,6,7,9,10,13};
            int[] arr2= {2,3,4,5,6,7,8,9,11,25};

            int num1 = arr1.length;
            int num2 = arr2.length;
            int[] merge = new int[num1 + num2];

            for(int i=0;i<num1;i++)
            {
                    merge[i] = arr1[i];
            }
            for(int i=0;i<num2;i++)
            {
                    merge[num1 + i] = arr2[i];   
            }

            for(int i=0;i<merge.length-1;i++)
            {
                //ARRAY SORT
                    for(int j=0;j<merge.length-1-i;j++)
                    {
                        if(merge[j] > merge[j+1])
                        {
                            int temp  = merge[j];
                            merge[j] = merge[j+1];
                            merge[j+1] = temp;
                            
                        }
                       
                    }
                    
                }
                 System.out.println("Sorted Merged Array:");
                  
                 for (int i = 0; i < merge.length; i++) {
                   System.out.print(merge[i] + " ");
                }
                System.out.println();
                
                System.out.println("Repeated elements are :");
                  for(int k =1;k<merge.length-1;k++)
                    if(merge[k] == merge[k-1])
                    {
                        if(k==1 || merge[k] != merge[k-2])
                        {
                           System.out.print(merge[k] +" ");
                        }
                    }
                }
            }

//27 . program to right rotate the elements of a multidimensional array

class rotate{
    public static void main(String[] args)
    {

        int[][] arr ={
                     {1,3,4},
                     {4,5,6},
                      };
        int rows = arr.length;
        int cols = arr[0] .length;
        int[][] rotate = new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               rotate [j][rows-i-1] = arr[i][j];
            }
        }
        System.out.println("rotated matrix :");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
        {
            System.out.print(rotate[i][j] + " ");
        }
        System.out.println();
        }
}   
}             

//28. Alternate sorting ,rearrange the array in such a way that the first element is first minimum and the second element is first maximum

class rearrange{
    public static void main(String[] args)
    {
        int[]  arr = {2,1,3,7,5,6,4};
        for(int i=0;i<arr.length;i++)
        {
         for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i] > arr[j])
            {
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
           
        }
         System.out.println("the sorted array is" );
        for(int i=0;i<arr.length;i++)
         {
            System.out.print(arr[i] + " ");
         }

        int[] result = new int[arr.length];
        int left =0;
        int right=arr.length-1;
        int ind =0;

        while(left <= right)
        {
            if(ind % 2==0)
            {
                result[ind++] = arr[left++];
            }
            else{
                result[ind++] = arr[right--];
            }
        }
        System.out.println();
        System.out.println("rearranges array:");
        for(int k =0;k<result.length;k++)
        {
            System.out.print(result[k]+" ");
        }
    }
}


//29 . factorial of number and the factorial number reverse number

class fact{
    public static void main(String[] args)
    {
        int fact = 1;
        for(int i=1;i<=5;i++)
        {
          fact = fact *i;
          
        }
        System.out.println("factorial  numbers : " + fact);
    
       int reverse  =0;
      int temp = fact;
       while(temp > 0)
       {
       int digit = temp % 10;
        reverse = reverse * 10 +digit;
       temp = temp /10;
}
System.out.println("the reverse factorial number is :" + reverse);
}
}
    
//30. find the sum of elements of an array present on even position

class evenposition{
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,9,5,8,9};
        int sum =0;
        for(int i=0;i<arr.length;i+=2)
        {
            sum += arr[i];
        }
        System.out.println("the sum of elements even position :" + sum);   
    }
}

//31. find the sum of elements of an array present on odd position
 class oddposition{
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,6,9,8,5,4,8};
        int sum=0;
        for(int i =1;i<arr.length;i += 2)
        {
            sum += arr[i];
        }
        System.out.println("the odd position is " + sum);
    }
 }

 //32. print the 2nd largest element in array

 class seclargest{
    public static void main(String[] args) {
        int[] arr ={34,5,65,23,23,33};
        for(int i=0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
        {
            if(arr[i] < arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        }
        System.out.print("the second largest element is :" + arr[1]);
        
        }
    }
 
//33. print the 2nd largest element in array

 class secsmallest{
    public static void main(String[] args) {
        int[] arr ={34,5,65,23,23,33};
        for(int i=0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
        {
            if(arr[i]  > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        }
        System.out.print("the second largest element is :" + arr[1]);
        
        }
    }

    //34.java program to print the numbrer of elements present in an array
    class present{
        public static void main(String[] args) {
            int[] arr = {34,4,3,21,13,5,3};
            int count = arr.length;
            
                System.out.println("the number of elements present in array  :" + count);
            
        }
    }

    //35. copy all elements of one array into another array

    class copyarray{
        public static void main(String[] args)
        {
            int[] arr1 = {23,43,54,12};
            int[] arr2 = new int[arr1.length];
            
            for(int i=0;i<arr1.length;i++)
            {
                arr2[i] = arr1[i];
            }
            
            System.out.println("copy that all elements is :");
            for(int i=0;i<arr2.length;i++)
            {
                System.out.println(arr2[i]);
            }
            
            }
        }
//36 .the frequency of each elemant in the array

class frequencyele{
    public static void main(String[] args) {
        int[] a = {2,2,3,1,4,2,3};
        int[] freq = new int[a.length];
        for(int i =0;i<a.length;i++)
        { 
            int num = a[i];
            int count=1;

            for(int j =i+1;j<a.length;j++)
            {
                if(num == a[j])
                {  
                    freq[j]  = -1;
                    count ++;
                 }
            }
            if(freq[i] != -1)
            {
                freq[i] = count;
            } 
        }  
        
             for(int i =0;i<a.length;i++)
            {
            if(freq[i] > 0)
            {
             System.out.println(a[i] + "-- >" + freq[i]);
            }  
         }
    }
          
}

//37 . java program to reverse the elements of an array
class ReverseArray {
       public static void main(String[] args) {
           int[] arr = {1,2,44,8,5};
           for (int i = arr.length - 1; i >= 0; i--) {
               System.out.print(arr[i] + " ");
           }
       }
   }


//38 . java program to print the delete an elements of ana array
class delete{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("enter the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the " + size + "array");
        for(int  i =0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("select the delete element");
         int deleteele = scan.nextInt();
         boolean found = false;

         System.out.println("after deleted elements : " + deleteele);
          for(int i=0;i<arr.length;i++)
          {
            if(!found && arr[i] == deleteele)
            {
                found = true;
                continue;
            }
              System.out.print(arr[i]+ " ");
          }
          if(!found)
          {
            System.out.println("not found");
          }
    }     
}



//39 print the avgerage of all items of the array

class allavg{
    public static void main(String[] args) {
        int [] arr = {2,4,10,15};
        int sum=0;
        double avg;
        for(int i =0;i<arr.length;i++)
        {
         sum += arr[i];

        }
        avg = sum/arr.length;
        System.out.println("the avg of all elements is : " + avg);
    }
}

//40.java program to inverse the elements of an array
class inversearray{
    public static void main(String[] args) {
        int [] arr = {1,2,0};
        int [] inverse = new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            inverse[arr[i]] = i;
        }
        for(int i=0;i<inverse.length;i++)
        {
            System.out.println(inverse[i] + " ");
        }
    }
}


//41.pyramid pattern 
 
class pat{

    public static void main(String[] args)
    {
        int rows = 10;
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<rows;j++)
            {
                if(j < rows-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print(i + " ");
                }
            }    
            System.out.println();
        }   
      
    }
}  

//42 pyramid pattern 2

class pyramid2{
    public static void main(String[] args) {
        int rows =10;
        for(int i =1;i<rows;i++)
        { 
            int num =1;
            for(int j =1;j<=rows +i-1;j++)
            {
                if(j < rows-i)
                {
                    System.out.print(" ");
                }
                else if( j % 2 == 1)
                {
                    System.out.print(num);
                    num++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
     }
}

//43 pyramid 3

class pyramid3{
    public static void main(String[] args)
    {
        int rows = 10;
        for(int i =1;i<rows;i++)
        {
            for(int j =1;j<rows;j++)
            {
                if(j < rows-i)
                {
                    System.out.print( " ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}

//44. write a program to print the following pattern based on the alpgabet

class  alphabetpattern{
    public static void main(String[] args) {
   
    int n = 5; 
        for (int i = 1; i <= 2 * n - 1; i++) {
            int totalCols = (i <= n) ? i : (2 * n - i);
            char ch = (char) ('A' + totalCols - 1);
            for (int j = 1; j <= n; j++) {
                if (j <= n - totalCols) {
                    System.out.print(" ");
                } else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
        }
         
    }


//44 : 2 pattern


class alphabet22{
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= 2*n- 1; i++) {
            int totalCols = (i <= n) ? i : (2 * n - i); 
            char ch = (char) ('A' + totalCols - 1);
    
            for (int j = 1; j <= n; j++) {
    
                if (j <= n- totalCols) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(ch + " ");
                }
            }

            System.out.println();
        }
    }

}
    
//45 assume string in odd length
class oddlength{
    public static void main(String[] args) {
    int n =5;
   for(int i =1;i<= n;i++)
    {
    int totalcols = 2* n -1;

    for(int j=1;j<=totalcols;j++)
  {
    if (j==i || j == totalcols-i+1)
    {
        System.out.print(i);
    }
    else{
        System.out.print(" ");
    }
 }
System.out.println();
}
    }
}




//46 find the odd numbers in between in range

class oddnum{
    public static void main(String[] args) {
      for(int i =2;i<15;i++)
      {
        if(i % 2 ==0)
        {
            System.out.print("");
        }
        else{
            System.out.print(i + " ");
        }
      }
    }
}
  
//47 print the letters from 'A' to user input character without using strings

class letter{
    public static void main(String[] args) {
       
        for(char ch ='A';ch<='D';ch++)
        {
            System.out.print(ch + " ");
        }
    }
}

//  input f print
 class letter2{
    public static void main(String[] args) {
        for(char ch ='A' ;ch <= 'F';ch++)
        {
            System.out.print(ch + " ");
        }
    }
 }

 //48 find the sum of given number and its  reverse number

 class sumrev{
    public static void main(String[] args) {
        int num = 12345;
        int orginalnum = 12345;
        int rev =0;
        int sum =0;
        
        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;     //12345 + 54321
            num = num /10;
            
        }
        //System.out.println(orginalnum);
        //System.out.println(rev);
        sum = orginalnum + rev;

        System.out.println("12345  + 54321" + " = " + sum);
        
    }
 }

 //2. input 543

 class sumrev2{
    public static void main(String[] args) {
        int num = 543;
        int orginalnum = 543;
        int rev =0;
        int sum =0;
        for(int i = 0;i<num;i++)
        {
            int digit = num % 10;
            rev = rev *10 + digit;
            num = num/10;
        }
        sum = orginalnum + rev;
        System.out.println("543 + 345  = " + sum);
    }
 }

 //49 using recursion reverse the string such as 
  //eg 1
class revword{
    public static String reverseWords(String[] words, int index) {
        if (index < 0) {
            return "";
        }
        return words[index] + " " + reverseWords(words, index - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        String reversed = reverseWords(words, words.length - 1).trim();
        System.out.println("Reversed sentence: " + reversed);
    }
}
//eg2

class revword2{
    public static String reverseWords(String[] words, int index) {
        if (index < 0) {
            return "";
        }
        return words[index] + " " + reverseWords(words, index - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = input.trim().split("\\s+");
        String reversed = reverseWords(words, words.length - 1).trim();
        System.out.println("Reversed sentence: " + reversed);
    }
}
//50 
//input 234
  class numtoword{
    public static void main(String[] args) {
    
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number :");  

       String[] one ={"" , " one " , " two " ," three " , " four " , " five " , " six " ," seven " ," eight " , " nine " , " ten " , " eleven " ," twelve " , " thirteen " , " fourteen " ,
                      " fivteen " , " sixteen " ," seventeen "," eigtheen ", " nineteen " };

        String[] ten = {"", "" ,"twenty "," thirty "," forty "," fivety "," sixty "," seventy "," eighty "," ninety "};
    

        int num = scan.nextInt();
        
        if(num == 0)
        {
            System.out.println("zero");
        }
        else{

        if(num >= 100)
        {
            System.out.print( one[num/100] + " hundered ");
            num = num %100;

        }
        if(num < 20)
        {
            System.out.print(one[num]);
        }
        else{
            System.out.print(ten[num/10] + " " + one[num%10] );
        }    
    }
} 
 }


//51. sort the elements in odd positions in descending order and ele
//eg1
class ascdes{
    public static void main(String[] args) {
        
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        int oddCount = (arr.length + 1) / 2;
        int[] oddPos = new int[oddCount];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            oddPos[oddIndex++] = arr[i];
        }  
        //  even position 
        int evenCount = arr.length / 2;
        int[] evenPos = new int[evenCount];
        int evenIndex = 0;
        for (int i = 1; i < arr.length; i += 2) {
            evenPos[evenIndex++] = arr[i];
        }
        
        // Sort odd position 
        for (int i = 0; i < oddPos.length - 1; i++) {
            for (int j = 0; j < oddPos.length - 1 - i; j++) {
                if (oddPos[j] < oddPos[j + 1]) {
                    int temp = oddPos[j];
                    oddPos[j] = oddPos[j + 1];
                    oddPos[j + 1] = temp;
                }
            }
        }
        
        // Sort even position in ascending 
        for (int i = 0; i < evenPos.length - 1; i++) {
            for (int j = 0; j < evenPos.length - 1 - i; j++) {
                if (evenPos[j] > evenPos[j + 1]) {
                    int temp = evenPos[j];
                    evenPos[j] = evenPos[j + 1];
                    evenPos[j + 1] = temp;
                }
            }
        }
        
        // Merge sorted elements 
        oddIndex = 0;
        evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 
                arr[i] = oddPos[oddIndex++];
            } else {
                arr[i] = evenPos[evenIndex++];
            }
        }
        
        // Print 
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i] + " ");
        }
    }
}

//51 
//eg2
class ascdes2{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int oddCount = (arr.length + 1) / 2;
        int[] oddPos = new int[oddCount];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            oddPos[oddIndex++] = arr[i];
        }  
        //  even position 
        int evenCount = arr.length / 2;
        int[] evenPos = new int[evenCount];
        int evenIndex = 0;
        for (int i = 1; i < arr.length; i += 2) {
            evenPos[evenIndex++] = arr[i];
        }
        
        // Sort odd position 
        for (int i = 0; i < oddPos.length - 1; i++) {
            for (int j = 0; j < oddPos.length - 1 - i; j++) {
                if (oddPos[j] < oddPos[j + 1]) {
                    int temp = oddPos[j];
                    oddPos[j] = oddPos[j + 1];
                    oddPos[j + 1] = temp;
                }
            }
        }
        
        // Sort even position in ascending 
        for (int i = 0; i < evenPos.length - 1; i++) {
            for (int j = 0; j < evenPos.length - 1 - i; j++) {
                if (evenPos[j] > evenPos[j + 1]) {
                    int temp = evenPos[j];
                    evenPos[j] = evenPos[j + 1];
                    evenPos[j + 1] = temp;
                }
            }
        }
        
        // Merge sorted elements 
        oddIndex = 0;
        evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { 
                arr[i] = oddPos[oddIndex++];
            } else {
                arr[i] = evenPos[evenIndex++];
            }
        }
        
        // Print 
        System.out.print("Sorted array: ");
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i] + " ");
        }
    }
}



//52 print the alphabet 'C' with the stars based o the given numbers

class cpat{
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if( i == 0  || j == 0 )
                {
                    System.out.print("*");
                }
                else if(i == n-1)
                    {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}

//53 pattern like a pyramid with numbers increased 1

class pyramid10{
    public static void main(String[] args) {
        int n = 4;
        int num=1;
        for(int i =1;i<=n;i++)
        {
                for(int j=1;j<=n;j++)
                {
                    if(j <= n-i)
                    {
                        System.out.print(" ");
                    }
                    else{
                    System.out.print(num +" ");
                   num++;
                    }
                }
            System.out.println();
            

        }
        
        }
        
    }
    


//54 write a program to print the following pattern for the input number

//input12345

class oddlenpat{
    public static void main(String[] args) {
        String str = "12345";
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j == i || j == n-1-i )
                {
                    System.out.print(str.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//55 program to print the following pattern for the given input number

class fourtoone
{
    public static void main(String[] args) {
        int n = 5;
        int length = 2 * n - 1; // 7x7 
        int[][] matrix = new int[length][length];

        int top = 0;
        int bottom = length - 1;
        int left = 0;
        int right = length- 1;
        int Val = n;

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                matrix[top][i] = Val;
            }
            top++;

        
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = Val;
            }
            right--;

       
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = Val;
            }
            bottom--;

            
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = Val;
            }
            left++;

            Val--; 
        }

        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



            

//56 print the all the substring of the given string without using strings

class subst{
    public static void main(String[] args) {
        String input = "abc";
        for(int start =0;start < input.length();start++)
        {
            String temp ="";
            for(int end = start;end<input.length();end++)
            {
                temp = temp + input.charAt(end);
                System.out.println(temp);
            }
        }
    }
    }


   //57 print the numbers which are mismatched from two array
  
   class mismatched{
    public static void main(String[] args) {
        char[] arr1 = {'a','b','c','d','e','f','g','h','i'};
        char[] arr2 ={'a','b','d','e','e','g','g','i','i'};
        for(int i=0;i<arr1.length;i++)
        {
               if(arr1[i] != arr2[i])
               {
                System.out.print("" + arr1[i] + arr2[i]);
               System.out.print(", ");  
            }
        }
    }
   }

   //58 given s array of sum num digits 12,9 plus to sum print it
   
   class plussum{
    public static void main(String[] args) {
        int[] num1 = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[] num2 = {7,8,4,6,2,1,9,9,7};
        int len1 = num1.length;
        int len2 = num2.length;
        int maxlen;
        if(len1 > len2)
        {
            maxlen = len1;
        }
        else{
            maxlen = len2;
        }

        maxlen = maxlen +1; // space 

        int[]result = new int[maxlen];
       int i = len1-1;
       int j = len2-1;
       int k = maxlen-1;
       int carry = 0;

       while(i >= 0 || j >= 0 || carry > 0)
       {
        int digits12 = 0;
        int digits9 = 0;
        if(i >= 0)
        {
            digits12= num1[i];
        }
        if(j >= 0)
        {
            digits9 = num2[j];
        }
     
        int sum = digits12 + digits9 + carry;
        result[k] = sum % 10;
        carry = sum / 10;

        i = i-1;
        j = j-1;
        k = k-1;
       }
       
       //print it
    System.out.println("sum of arrays :");
    boolean started  =  false;
    for(int x =0;x<result.length;x++)
    {
        if(result[x] != 0)
        {
            started = true;
        }
      if(started)
      {
        System.out.print(result[x] +" ");
      }
    }
      if(!started)
      {
        System.out.print("0");
      }
      System.out.println();
    }

    }
   

   //59 write a program to print the below format


class patlast{
  public static void main(String[] args) {
    
        int rows = 2;   
        int height = 3; 

        for (int i = 0; i < rows; i++) {
            System.out.println("+===+===+");
            for (int j = 0; j< height; j++) {
                System.out.println("|  |  |");
            }
        }
        System.out.println("+===+===+"); 
    }
}


//60 welcometozohocorporation






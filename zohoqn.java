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

/*class quadratic{
    public static void main(String[] args)
    {
        Scanner scan = new scanner(System.in);

    }
}*/


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
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        System.out.println("Original matrix :");

        for(int i=0;i<arr.length;i++)
        {
            int col = arr[i].length;
            int last = arr[i][col-1];

            for(int j= col-1;j>0;j--)
            {
                arr[i][j] = arr[i][j-1];
            arr[i][0] = last;
            
            }        
    }

    System.out.println("mstrix sfter right rotations :");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i] .length;j++)
                {
                    System.out.print(arr[i][j] + " ");
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



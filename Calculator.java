import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,d;
        System.out.println("enter the value of a: ");
        a=sc.nextInt();
        System.out.println("enter the value of b: ");
        b=sc.nextInt();
        System.out.println("enter 1 to add , 2 to sub, 3 to mul,4 to div");
        int c=sc.nextInt();
        //addition function on bug123 branch
        if(c==1)
        {
            System.out.println("the sum of two numbers is: "+ a+b);
        }
        //subtraction fuction
        else if(c==2)
        {
            d=a-b;
            System.out.println("the sub of two numbers is: "+ d);
        }
        //multiplication function
        else if(c==3)
        {
            System.out.println("the mul of two numbers is: "+ a*b);
        }
        //division function
        else if(c==4)
        {
            System.out.println("the div of two numbers is: "+ a/b);
        }
        else
        {
            System.out.println("choose a valid number for performing arithmetic operations");
        }
    }
}
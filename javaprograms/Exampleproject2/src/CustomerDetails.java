import java.util.Scanner;
class CustomerDetails
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int s=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int s1=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int s2=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+s);
        System.out.println("No of puffs:"+s1);
        System.out.println("No of cooldrinks:"+s2);
        System.out.println("Total price="+((s*100)+(s1*20)+(s2*10)));
        System.out.println("ENJOY THE SHOW!!!");
    }
}
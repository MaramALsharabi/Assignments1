//Write a program that prints the balance of an account after the first, second, and third year.
// The account has an initial balance of $1,000 and earns 5 percent interest per year.
public class A_4 {
    public static void main(String[] args) {
        int F_C=1000+(1000*5)/100;
        int S_C=F_C+(F_C*5)/100;
        int TH_C=S_C+(S_C*5)/100;
        System.out.print("im the first year : ");
        System.out.println(F_C);
        System.out.print("im the first year : ");
        System.out.println(S_C);
        System.out.print("im the first year : ");
        System.out.println(TH_C);

}
}


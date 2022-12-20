public class BookLogicalOpTable {
    public static void main(String[] args) {
    int a,b;
    boolean isprime;
    for (a=2;a<100;a++){
        isprime = true;
        for (b=2;b<=a/b;b++)
            if ((a%b)==0)
                isprime=false;
        if (isprime)
            System.out.println(a+"-простое число");
    }
    }
}
class Fibonacci {
    public static void main(String[] args){
        int a = 0, b = 1, c = 0, n = 10;
        //Scanner scn = new Scanner(System.in);
        //n = scn.nextInt();
        if(a == 0 || b == 1){
            System.out.println("The fibonacci series is:" + a);
            System.out.println("The fibonacci series is:" + b);
        
        for(int i = 0; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println("The fibonacci series is:" + c);
        }
        
        }
}
}
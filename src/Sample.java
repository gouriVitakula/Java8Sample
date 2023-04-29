class Sample {

    // function to print where to shoot
    static void print(int n)
    {

        // no. of bombs required
        System.out.println(n + n / 2);

        // bomb all the even positions
        for (int i = 2; i <= n; i += 2)
            System.out.print( i + " ");

        // bomb all the odd positions
        for (int i = 1; i <= n; i += 2)
            System.out.print(i + " ");

        // bomb all the even positions again
        for (int i = 2; i <= n; i += 2)
            System.out.print( i + " ");
    }



    // Driver code
    public static void main (String[] args) {
        int n = 3;

        print(n);


    }
}
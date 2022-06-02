public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nPattern 1");
        int a = 1;
        int n=4;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            a +=2;
            System.out.println();
        } 
        int b = 7;
        for (int i=n;i>=1;i--)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            b -=2;
            System.out.println();
        } 

        System.out.println("\nPattern 2");
        n=5;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for (int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        } 
        
        System.out.println("\nPattern 3");
        n=5;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        
        System.out.println("\nPattern 4");
        for (int i=4;i>=0;i--)
        {
            int spaces = 5 + i;
            for (int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        } 


        System.out.println("\nPattern 5");
        n=4;
        for (int i=1; i<=n;i++)
        {
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");    
            }

            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces;j++)
            {
                System.out.print(" ");    
            }
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");    
            }
            System.out.println("");
        }
        // Lower half
        for (int i=n; i>=1;i--)
        {
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");    
            }

            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces;j++)
            {
                System.out.print(" ");    
            }
            for (int j=1; j<=i;j++)
            {
                System.out.print("*");    
            }
            System.out.println("");
        } 
    }
}

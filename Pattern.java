public class Pattern {
    public static void main(String[] args) {
        int n = 21, c= 0;
        for(int i = 0; i < n; i++) {
            if(i > n/2) {
                 c = (n - i - 1);
            } else {
                c = i; 
            }
            for (int j = 0; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// *      
// **     
// ***    
// ****   
// *****  
// ****   
// ***    
// **     
// *      

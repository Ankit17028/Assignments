package iNeuron.Assignment_1;

public class Question_4 {
    public static void main(String[] args) {
        int n = 14;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i-j >= (n-1)/2 || i+j >= (n-1)+(n-1)/2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
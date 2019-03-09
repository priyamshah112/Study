import java.util.*;
public class Queens {

    int[] x;
	int count=0;
    public Queens(int N) {
        x = new int[N];
    }

    public boolean canPlaceQueen(int r, int c) {

        for (int i = 0; i < r; i++) {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i])) 
            {
                return false;
            }
        }
        return true;
    }

    public void printQueens(int[] x) {
        int N = x.length;
		count=count+1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void placeNqueens(int r, int n) {

        for (int c = 0; c < n; c++) {
            if (canPlaceQueen(r, c)) {
                x[r] = c;
                if (r == n - 1) {
                    printQueens(x);
                } else {
                    placeNqueens(r + 1, n);
                }
            }
        }
    }


    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of queens");
        Queens Q = new Queens(sc.nextInt());
        Q.placeNqueens(0, Q.x.length);
		System.out.println("total possiblities = "+Q.count);
    }
}
/*

C:\Users\PRIYAM SHAH\Desktop\AOAD>javac Queens.java

C:\Users\PRIYAM SHAH\Desktop\AOAD>java Queens
Enter number of queens
8
Q * * * * * * *
* * * * Q * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * Q * * * *

Q * * * * * * *
* * * * * Q * *
* * * * * * * Q
* * Q * * * * *
* * * * * * Q *
* * * Q * * * *
* Q * * * * * *
* * * * Q * * *

Q * * * * * * *
* * * * * * Q *
* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * * Q * * *
* * Q * * * * *

Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
* * * * * Q * *
* * Q * * * * *

* Q * * * * * *
* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *

* Q * * * * * *
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *

* Q * * * * * *
* * * * Q * * *
* * * * * * Q *
* * * Q * * * *
Q * * * * * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *

* Q * * * * * *
* * * * * Q * *
Q * * * * * * *
* * * * * * Q *
* * * Q * * * *
* * * * * * * Q
* * Q * * * * *
* * * * Q * * *

* Q * * * * * *
* * * * * Q * *
* * * * * * * Q
* * Q * * * * *
Q * * * * * * *
* * * Q * * * *
* * * * * * Q *
* * * * Q * * *

* Q * * * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
* * * * Q * * *
Q * * * * * * *
* * * Q * * * *

* Q * * * * * *
* * * * * * Q *
* * * * Q * * *
* * * * * * * Q
Q * * * * * * *
* * * Q * * * *
* * * * * Q * *
* * Q * * * * *

* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *
* * * * * * Q *
* * * Q * * * *

* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
* * * * * Q * *

* * Q * * * * *
* * * * Q * * *
* Q * * * * * *
* * * * * * * Q
Q * * * * * * *
* * * * * * Q *
* * * Q * * * *
* * * * * Q * *

* * Q * * * * *
* * * * Q * * *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *
* * * * * * Q *
Q * * * * * * *

* * Q * * * * *
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *

* * Q * * * * *
* * * * Q * * *
* * * * * * * Q
* * * Q * * * *
Q * * * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *

* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * Q * * *
* * * * * * * Q
Q * * * * * * *
* * * * * * Q *
* * * Q * * * *

* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
Q * * * * * * *
* * * Q * * * *
* * * * * * * Q
* * * * Q * * *

* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
* * * * Q * * *
Q * * * * * * *
* * * * * * * Q
* * * Q * * * *

* * Q * * * * *
* * * * * Q * *
* * * Q * * * *
Q * * * * * * *
* * * * * * * Q
* * * * Q * * *
* * * * * * Q *
* Q * * * * * *

* * Q * * * * *
* * * * * Q * *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *

* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
Q * * * * * * *
* * * Q * * * *
* * * * * * Q *
* * * * Q * * *
* Q * * * * * *

* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
Q * * * * * * *
* * * * Q * * *
* * * * * * Q *
* Q * * * * * *
* * * Q * * * *

* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *

* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * * * Q
* * * * Q * * *
Q * * * * * * *
* * * Q * * * *
* * * * * Q * *

* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *
Q * * * * * * *
* * * * Q * * *

* * Q * * * * *
* * * * * * * Q
* * * Q * * * *
* * * * * * Q *
Q * * * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * Q * * *

* * * Q * * * *
Q * * * * * * *
* * * * Q * * *
* * * * * * * Q
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *

* * * Q * * * *
Q * * * * * * *
* * * * Q * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* Q * * * * * *

* * * Q * * * *
* Q * * * * * *
* * * * Q * * *
* * * * * * * Q
* * * * * Q * *
Q * * * * * * *
* * Q * * * * *
* * * * * * Q *

* * * Q * * * *
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
Q * * * * * * *
* * * * Q * * *

* * * Q * * * *
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *
* * * * * * * Q
* * * * Q * * *
Q * * * * * * *

* * * Q * * * *
* Q * * * * * *
* * * * * * Q *
* * * * Q * * *
Q * * * * * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *

* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *

* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *
* * * * * * Q *

* * * Q * * * *
* * * * * Q * *
Q * * * * * * *
* * * * Q * * *
* Q * * * * * *
* * * * * * * Q
* * Q * * * * *
* * * * * * Q *

* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *

* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* Q * * * * * *

* * * Q * * * *
* * * * * * Q *
Q * * * * * * *
* * * * * * * Q
* * * * Q * * *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *

* * * Q * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * * * Q
* Q * * * * * *
* * * * Q * * *
Q * * * * * * *
* * * * * Q * *

* * * Q * * * *
* * * * * * Q *
* * * * Q * * *
* Q * * * * * *
* * * * * Q * *
Q * * * * * * *
* * Q * * * * *
* * * * * * * Q

* * * Q * * * *
* * * * * * Q *
* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *

* * * Q * * * *
* * * * * * * Q
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
* * * * Q * * *

* * * Q * * * *
* * * * * * * Q
Q * * * * * * *
* * * * Q * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *

* * * Q * * * *
* * * * * * * Q
* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *

* * * * Q * * *
Q * * * * * * *
* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *

* * * * Q * * *
Q * * * * * * *
* * * * * * * Q
* * * Q * * * *
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *

* * * * Q * * *
Q * * * * * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * Q * * * *

* * * * Q * * *
* Q * * * * * *
* * * Q * * * *
* * * * * Q * *
* * * * * * * Q
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *

* * * * Q * * *
* Q * * * * * *
* * * Q * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * * * Q
* * * * * Q * *
Q * * * * * * *

* * * * Q * * *
* Q * * * * * *
* * * * * Q * *
Q * * * * * * *
* * * * * * Q *
* * * Q * * * *
* * * * * * * Q
* * Q * * * * *

* * * * Q * * *
* Q * * * * * *
* * * * * * * Q
Q * * * * * * *
* * * Q * * * *
* * * * * * Q *
* * Q * * * * *
* * * * * Q * *

* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
* * * * * * Q *

* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *

* * * * Q * * *
* * Q * * * * *
* * * * * * * Q
* * * Q * * * *
* * * * * * Q *
Q * * * * * * *
* * * * * Q * *
* Q * * * * * *

* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *
* Q * * * * * *

* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
* * Q * * * * *

* * * * Q * * *
* * * * * * Q *
* Q * * * * * *
* * * Q * * * *
* * * * * * * Q
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *

* * * * Q * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * Q * * * *
* * * * * * * Q

* * * * Q * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * * * * * Q
* * * Q * * * *

* * * * Q * * *
* * * * * * Q *
* * * Q * * * *
Q * * * * * * *
* * Q * * * * *
* * * * * * * Q
* * * * * Q * *
* Q * * * * * *

* * * * Q * * *
* * * * * * * Q
* * * Q * * * *
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * * * Q *

* * * * Q * * *
* * * * * * * Q
* * * Q * * * *
Q * * * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *

* * * * * Q * *
Q * * * * * * *
* * * * Q * * *
* Q * * * * * *
* * * * * * * Q
* * Q * * * * *
* * * * * * Q *
* * * Q * * * *

* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *
* * * * * * * Q
* * * Q * * * *

* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
Q * * * * * * *
* * * Q * * * *
* * * * * * * Q
* * * * Q * * *
* * Q * * * * *

* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *

* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * * * * * Q
* * * Q * * * *
* Q * * * * * *
* * * * * * Q *
* * * * Q * * *

* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * * * * * Q
* * * * Q * * *
* Q * * * * * *
* * * Q * * * *
* * * * * * Q *

* * * * * Q * *
* * Q * * * * *
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q

* * * * * Q * *
* * Q * * * * *
* * * * Q * * *
* * * * * * * Q
Q * * * * * * *
* * * Q * * * *
* Q * * * * * *
* * * * * * Q *

* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * Q * * * *
* * * * * * * Q
Q * * * * * * *
* * * * Q * * *

* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* Q * * * * * *
* * * * * * * Q
* * * * Q * * *
Q * * * * * * *
* * * Q * * * *

* * * * * Q * *
* * Q * * * * *
* * * * * * Q *
* * * Q * * * *
Q * * * * * * *
* * * * * * * Q
* Q * * * * * *
* * * * Q * * *

* * * * * Q * *
* * * Q * * * *
Q * * * * * * *
* * * * Q * * *
* * * * * * * Q
* Q * * * * * *
* * * * * * Q *
* * Q * * * * *

* * * * * Q * *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * Q * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *

* * * * * Q * *
* * * Q * * * *
* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *
* Q * * * * * *
* * * * * * * Q

* * * * * Q * *
* * * Q * * * *
* * * * * * Q *
Q * * * * * * *
* * * * * * * Q
* Q * * * * * *
* * * * Q * * *
* * Q * * * * *

* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* * Q * * * * *

* * * * * * Q *
Q * * * * * * *
* * Q * * * * *
* * * * * * * Q
* * * * * Q * *
* * * Q * * * *
* Q * * * * * *
* * * * Q * * *

* * * * * * Q *
* Q * * * * * *
* * * Q * * * *
Q * * * * * * *
* * * * * * * Q
* * * * Q * * *
* * Q * * * * *
* * * * * Q * *

* * * * * * Q *
* Q * * * * * *
* * * * * Q * *
* * Q * * * * *
Q * * * * * * *
* * * Q * * * *
* * * * * * * Q
* * * * Q * * *

* * * * * * Q *
* * Q * * * * *
Q * * * * * * *
* * * * * Q * *
* * * * * * * Q
* * * * Q * * *
* Q * * * * * *
* * * Q * * * *

* * * * * * Q *
* * Q * * * * *
* * * * * * * Q
* Q * * * * * *
* * * * Q * * *
Q * * * * * * *
* * * * * Q * *
* * * Q * * * *

* * * * * * Q *
* * * Q * * * *
* Q * * * * * *
* * * * Q * * *
* * * * * * * Q
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *

* * * * * * Q *
* * * Q * * * *
* Q * * * * * *
* * * * * * * Q
* * * * * Q * *
Q * * * * * * *
* * Q * * * * *
* * * * Q * * *

* * * * * * Q *
* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * Q * *
* * * * * * * Q
* Q * * * * * *
* * * Q * * * *

* * * * * * * Q
* Q * * * * * *
* * * Q * * * *
Q * * * * * * *
* * * * * * Q *
* * * * Q * * *
* * Q * * * * *
* * * * * Q * *

* * * * * * * Q
* Q * * * * * *
* * * * Q * * *
* * Q * * * * *
Q * * * * * * *
* * * * * * Q *
* * * Q * * * *
* * * * * Q * *

* * * * * * * Q
* * Q * * * * *
Q * * * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * Q * * *
* * * * * * Q *
* * * Q * * * *

* * * * * * * Q
* * * Q * * * *
Q * * * * * * *
* * Q * * * * *
* * * * * Q * *
* Q * * * * * *
* * * * * * Q *
* * * * Q * * *

total possiblities = 92
*/
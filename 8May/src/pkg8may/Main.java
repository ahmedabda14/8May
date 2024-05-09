/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8may;
import java.util.*;
import java.text.*;
/**
 *
 * @author ahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
Locale deLocale = new Locale("en","US");
long number=123456789L;
/*
NumberFormat dnf =NumberFormat.getInstance(deLocale);
Date now = new Date();
DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,enLocale);
System.out.println(dnf.format(number));*/

Locale deLocale = Locale.GERMANY;
Locale usLocale = Locale.US;

long number=123456789L;

NumberFormat denf = NumberFormat.getInstance(deLocale);
NumberFormat usnf = NumberFormat.getInstance(usLocale);
System.out.println(denf.format(number));
System.out.println(usnf.format(number));

/*

Big O(n) Complexity
bool findElement(int arr[], int n, int key)
{
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) {
            return true;
        }
    }
    return false;
}


Big O(log n) Complexity
nt binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
}
Big O(n2) Complexity
void bubbleSort(int arr[], int n)
{
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}

Big O(n3) Complexity
void multiply(int mat1[][N], int mat2[][N], int res[][N])
{
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            res[i][j] = 0;
            for (int k = 0; k < N; k++)
                res[i][j] += mat1[i][k] * mat2[k][j];
        }
    }
}

Finding all subsets of a set - O(2n
)
Finding all permutations of a string - O(n!)
Sorting using mergesort - O(nlog(n))
Iterating over all the cells in a matrix of size n by m - O(nm)
*/


    }
    
}

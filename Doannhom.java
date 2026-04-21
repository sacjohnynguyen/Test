
package doannhom;

import java.util.Random;
import java.util.*;
public class Doannhom {
    int []a;
    void sinhMang(int n){
        Random rd = new Random();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = rd.nextInt(1,10);
        }
    }
    void in(String t){
        System.out.println("\n"+ t);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            System.out.println("sat  ngu");
        }
    }
    public static void main(String[] args) {
        Doannhom l = new Doannhom();
        l.sinhMang(10);
        l.in("Hien thi mang");
    }
    
}

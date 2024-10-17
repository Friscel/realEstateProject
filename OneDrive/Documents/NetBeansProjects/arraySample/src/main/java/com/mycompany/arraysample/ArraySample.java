/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysample;
import java.util.Arrays;
/**
 *
 * @author Lenovo Ideapad
 */
public class ArraySample {

    public static void main(String[] args) throws InterruptedException {
         String[] fullName = new String[] {"Ed", "Dela", "Cruz"};
        int[] studentGrades = new int[100];
        boolean[] flag = new boolean[4];
        studentGrades[0] = 100;
        char middleInitials[] = {'A', 'B', 'C'};
        String[] grades = {"100", "99", "98"};
        double[] decimals = {1.00, 2.00, 3.00};
        float[] float1 = {1.0f, 2.0f, 3.2131231f};
//        
//        System.out.println(Arrays.toString(middleInitials));
//        System.out.println(Arrays.toString(fullName));
//        System.out.println(Arrays.toString(flag));
//        System.out.println(Arrays.toString(studentGrades));

        for(int i = 0; i<fullName.length; i++){
            System.out.println(fullName[i]);
            Thread.sleep(1000);
        }
        
    }
    
}
    


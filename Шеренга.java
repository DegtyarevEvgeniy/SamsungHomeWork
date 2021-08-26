package com.company;


import java.util.Scanner;

public class Main {


    public static int[] BubbleSort(int[] data) {

        int dataLength = data.length;
        int swap;
        boolean sorted;

        for (int i = 0; i < dataLength; i++) {

            sorted = true;

            for (int a = 1; a < (dataLength - i); a++) {

                if (data[a - 1] > data[a]) {
                    swap = data[a - 1];
                    data[a - 1] = data[a];
                    data[a] = swap;
                    sorted = false;
                }

            }


            if (sorted) break;
        }

        return data;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n;
        n = in.nextInt();

        int[] men = new int[n];
        int[] women = new int[n];

        int m = 0;
        int w = 0;

        for (int i = 0; i<n; i++){

            int cnt = in.nextInt();
            int num = in.nextInt();

            if(cnt == 0){
                men[m]= num;
                m++;
            }
            else{
                women[w] = num;
                w++;
            }
        }

        BubbleSort(men);
        BubbleSort(women);

        int f = 0;
        int rezMen = 0;

        while (men[f] == 0){
            rezMen = men[f+1];
            f++;
        }

        int rezWomen = women[women.length-1];

        int rez = rezWomen-rezMen;
        
        System.out.println(rez);

    }

}

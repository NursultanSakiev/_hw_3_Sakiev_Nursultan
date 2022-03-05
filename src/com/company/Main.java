package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[]homeWork={1.2, -1.5, 5.1, -6.7, 5.4, -12.5, -14.5, 5.7, -22.9, 14.0, -11.0, 22.2, -15.3, 14.0, -33};

boolean firsNegativeNumber=false;
double num=0;
double sum=0;
        for (Double number:homeWork) {
            if(number<0){firsNegativeNumber=true;}
                else { if (firsNegativeNumber){
                sum+=number;
                num++;
                }
            }
        }

        System.out.println(sum/num);

    }

}
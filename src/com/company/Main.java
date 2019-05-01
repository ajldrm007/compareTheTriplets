package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {1,2,3};
        int b[] = {3,2,1};
        int alice = 0;
        int bob = 0;

        for(int i = 0; i <3; i++)
        {
            if(a[i]<b[i])
            {bob++;}
            if(a[i]>b[i])
            {alice++;}
        }
        System.out.println("Bob's score: " + bob);
        System.out.println("Alice's score: " + alice);


    }
}
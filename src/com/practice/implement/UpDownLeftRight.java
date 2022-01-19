package com.practice.implement;

import java.util.Scanner;

public class UpDownLeftRight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
        }
    }
}

package com.company;

import java.util.Random;

public class Dicer {
    private int dicesNo;

    public Dicer(int dicesNo) {
        this.dicesNo = dicesNo;
    }

//    public void rzut(){
//        int[] rzut = new int[1];
//        for (int i=0; i<number+1; i++){
//            rzut[i] = (int) (Math.random() * 6 + 1);
//            System.out.println(rzut[i]);
//        }
//    }

    public void throwDices() {
        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < dicesNo; i++) {
            stringBuilder.append(random.nextInt(6) + 1).append(",");
        }

        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length());
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        new Dicer(1).throwDices();
        new Dicer(2).throwDices();
        new Dicer(3).throwDices();

    }
}

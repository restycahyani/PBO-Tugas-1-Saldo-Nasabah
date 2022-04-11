package com.company;
import java.util.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner hasilsoal = new Scanner(System.in);
            float saldo = hasilsoal.nextFloat();
            int setor = hasilsoal.nextInt();

            float nilai = saldo + setor;
            double sisaSaldo = potonganuang(nilai);
        }
        public static float potonganuang(float uang) {
            float uang1 = uang - 7000;
            float bonusuang = uang1 * 0.0005f;
            float totaluang = uang1 + bonusuang;
            System.out.println(totaluang);
            return totaluang;

        }
    }
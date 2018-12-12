/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class RandomCharacter {

    public static String randomUrl() {
        final String alphabet = "0123456789ABCDE";
        final int N = alphabet.length();
        String chuoi = "";
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            chuoi += alphabet.charAt(r.nextInt(N));
        }
        return chuoi;
    }

    public static void main(String[] args) {
        System.err.println(randomUrl());
        System.out.println(java.time.LocalDate.now());
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, +30);
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        Date date = cal.getTime();

        sdf2.format(date);
        System.out.println("Thời gian hiện tại sau khi thay đổi là " + sdf2.format(date));

    }
}

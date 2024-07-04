/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ontap;

import java.util.*;

/**
 *
 * @author TT
 */
public class Bai2 {
    
    private static String regex = "^(https?:\\/\\/)?(www\\.)?[a-zA-Z0-9]+(\\.[a-z]{2,6})(\\/[^\\s]*)?$";
    
    public static void main(String[] args) {
        String test = "https://tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        if(test.matches(regex)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

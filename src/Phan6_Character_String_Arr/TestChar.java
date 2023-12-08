package Phan6_Character_String_Arr;

import java.util.Scanner;

public class TestChar {

    public static void main(String[] args) {
        /* char, string, array */
        char[] helloArray = {'h', 'e', 'l', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        /* pt isLetter ky tu  */
        System.out.println(Character.isLetter('c'));
        /* pt isDigit so  */
        System.out.println(Character.isDigit('5'));
        /* pt isUpperCase kt hoa  */
        System.out.println(Character.isUpperCase('H'));
        /* pt isLowerCase kt thuong  */
        System.out.println(Character.isLowerCase('I'));
        /* pt toUpperCase tv hoa  */
        System.out.println(Character.toUpperCase('ê'));
        /* pt toUpperCase tv thuong  */
        System.out.println(Character.toLowerCase('p'));
        //to string

    }
}

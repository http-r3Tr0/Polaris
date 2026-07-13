package Polaris.Java.core.Strings.test;

public class StringTest02 {
    public static void main(String[] args){
        String nome = " Dante  ";
        System.out.println(nome.charAt(0));
        int[] nums = {1,2,3,4};
        System.out.println(nums.length);
        System.out.println(nome.length());
        System.out.println(nome.replace("D","V"));
        System.out.println(nome.trim());
    }
}

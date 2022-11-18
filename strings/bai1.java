/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;
import java.util.Scanner;

/**
 *  
 * @author ADMIN
 */
public class bai1 {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] cnt = new int[26];
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                cnt[str.charAt(i)- 'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(cnt[i]!=0){
                System.out.println((char)(i+'a')+" : "+cnt[i]);
            }
        }
    }

    
}


    
        



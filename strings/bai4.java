/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;


import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author ADMIN
 */
public class bai4 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s= s.trim();
		s=s.toLowerCase();
		String s1 = "";
		int d =1;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') continue;
			if(c==' ') {
				if(d==1) {
					continue;
				}
				d=1;
				s1+= c;
				continue;
			}
			if(d==1) {
				s1+=(char)(c-'a'+'A');
				d=0;
			}else {
				s1+=(char)(c);
			}
		}
		System.out.println(s1);
    }
}

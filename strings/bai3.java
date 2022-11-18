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
public class bai3 {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		float ans =0,cnt=0;
		boolean d =false;
		for(int i=0;i<s.length();i++) {
			 char c = s.charAt(i);
			 if(c >='0' && c<='9') {
				 d=true;
				 ans += (c-'0');
				 cnt++;
			 }
		}
		if(d==false) {
			System.out.println("false");
		}else {
			System.out.println("true");
			System.out.printf("%.3f", ans/cnt );
                }
    }
}
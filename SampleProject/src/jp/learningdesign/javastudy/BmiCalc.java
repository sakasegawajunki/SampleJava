package jp.learningdesign.javastudy;

import java.util.Scanner;

public class BmiCalc {
/* BMIを計算するプログラム
 * BMI=体重　/　（身長　*　身長）
 * 体重　kg 
 * 身長　cm
 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight,height,bmi;

		//weight = 59;
		//height = 166;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？（㎏）　：");
		weight =stdIn.nextDouble();
		System.out.println("身長は？(cm)　：");
		height = stdIn.nextDouble();
		
		
		height /= 100;
		
		bmi = weight /(height * height);
		
		System.out.println("あなたのBMIは　"+ bmi +" です。");
		
		if (bmi < 18.5) {
			System.out.println("やせ型です。");
		}else if (bmi < 25) {
			System.out.println("標準です。");
		}else {
			System.out.println("肥満型です。");
		}
	}

}

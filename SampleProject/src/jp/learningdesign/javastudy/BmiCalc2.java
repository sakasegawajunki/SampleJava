package jp.learningdesign.javastudy;

import java.util.Scanner;

public class BmiCalc2 {
/* BMI���v�Z����v���O����
 * BMI=�̏d�@/�@�i�g���@*�@�g���j
 * �̏d�@kg 
 * �g���@cm
 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		double weight,height,bmi;
		
		//weight = 59;
		//height = 166;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�̏d�́H�i�s�j�@�F");
		weight =stdIn.nextDouble();
		System.out.println("�g���́H(cm)�@�F");
		height = stdIn.nextDouble();
		
		
		
		height /= 100;
		
		bmi = weight /(height * height);
		
		System.out.println("BMI: "+ bmi+ " �ł��B");
	}

}

package jp.learningdesign.javastudy;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//2��3�̌��{���ȊO�̐���\������
		int i = 1;
		while(i < 50) {
			if(!((i % 2 == 0) && (i % 3 == 0))) {
				System.out.println(i);
			}
			i++;//�C���N�������g���Z�q
			
		}
			
	}

}

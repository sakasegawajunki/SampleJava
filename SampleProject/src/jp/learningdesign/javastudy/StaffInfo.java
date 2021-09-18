package jp.learningdesign.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
class RemoteStaff extends Staff {
	public String location; 
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}
	
}
public class StaffInfo {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Staff yamada = new Staff("Taro Yamada", 12345, "yamada@abc.com");
		RemoteStaff tanaka = new RemoteStaff("hanako Tanaka",123456, "tanaka@abc.com");
		tanaka.location = "���";
		//yamada.name = "Taro Yamada";
		//yamada.sayhello();
		//System.out.println(yamada.name);
		System.out.println("[�Ј����] ");
		System.out.println("�����F " + yamada.getName());
		System.out.println("�Ј��ԍ��F�@"+ yamada.getStaffid());
		System.out.println("Email: " + yamada.getEmail());

		System.out.println("[�Ј����] ");
		System.out.println("�����F " + tanaka.getName());
		System.out.println("�Ј��ԍ��F�@"+ tanaka.getStaffid());
		System.out.println("Email: " + tanaka.getEmail());
		System.out.println("�Ζ��n: " + tanaka.location);
	}
}

package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame {
// 상속받을 부모 클래스는 하나여야 함. (정체성 잃음)
	
	JButton btn;
	
	BTest() {
		super("나의 두번째창");
		btn = new JButton("확인2");
	}

	void addLayout() { // JFrame 에서 상속 받은 메소드
		// 붙이기 작업
		add(btn);	// JFrame 으로 상속받아 기능을 자식 클래스에서 그대로 사용 가능하다.
		
		// 화면 출력
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		BTest b = new BTest();
		b.addLayout();

	}

}

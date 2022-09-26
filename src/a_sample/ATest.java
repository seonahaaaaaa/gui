package a_sample;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 *  자바의 GUI (화면)
 * 	- AWT : 1.2 이전
 * 	- Swing : 1.2 이후
 *			  대부분 클래스 앞에 j
 */

public class ATest {

	JFrame f; // 변수만 선언시 null 값만 있음 ==> 객체 생성 필수
	JButton btn , bCancle;
	JCheckBox checkBox , checkBox1;	// 네모 버튼 : 다중 선택 가능
	JRadioButton man , woman;	// 둥근 버튼 : 하나만 선택
	JTextField tf;
	JTextArea ta;
	
	
	ATest() {
		f = new JFrame("나의 첫창"); // 타이틀 초기화	= f.setTitle
		btn = new JButton("클릭");
		bCancle = new JButton("취소");
		checkBox = new JCheckBox("자바");
		checkBox1 = new JCheckBox("오라클");
		man = new JRadioButton("남자");
		woman = new JRadioButton("여자");
		tf = new JTextField(20);	// 한줄 입력 받음 , 평균적인 알파벳 20개  
		ta = new JTextArea(40,20);	// 여러줄 입력 받음.
		// 그룹 지역변수 : 한번만 사용하면 이후 사용 할 일이 없기 때문에 멤버변수로 선언해주지 않는다. (멤버변수는 추가로 쓰일 수 있는 기능들만 취급함.)
		ButtonGroup group = new ButtonGroup();	// 동일한 주제의 버튼을 모아 그룹 형성하여 하나만 선택 될 수 있게 설정해줌. 1. group : 성별
		group.add(man);
		group.add(woman);
		
	}

	void addLayout() {
	//	FlowLayout f1 = new FlowLayout();	// 레이아웃 방식 지정 : 왼쪽에서 오른쪽으로 한줄로 배치 (오른쪽 공간 없으면 아래로 자동 배치)
	//	f.setLayout(new FlowLayout());		// 지정한 방식으로 레이아웃 설정
	//	f.setLayout(new GridLayout(3,3)); 	// GridLayout : 바둑판 정렬 (열과 행을 똑같이 나누어 레이아웃)
		f.setLayout(new BorderLayout()); 	// 동 서 남 북 가운데 배치 : 5개밖에 배치하지 못함.
		// 붙이기 작업
		f.add(btn , BorderLayout.NORTH);			// 버튼 : 클릭
		f.add(bCancle , BorderLayout.SOUTH);		// 버튼 : 취소
//		f.add(checkBox);	// 체크박스 : 자바
//		f.add(checkBox1);	// 체크박스 : 오라클
		
			JPanel pEast = new JPanel();
			pEast.add(man);
			pEast.add(woman);
		f.add(pEast , BorderLayout.EAST);
		
		f.add(new JLabel("입력하세요"), BorderLayout.WEST);	// 화면에 글씨 입력. (변수 선언 없이 바로 객체 생성 후 출력)
//		f.add(tf, BorderLayout.EAST);
		f.add(ta , BorderLayout.CENTER);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350); // 화면 출력 크기 (가로/세로 길이) 설정
		f.setVisible(true); // 화면에 나타나게 해줌. (출력)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame.EXIT_ON_CLOSE : X 창 클릭시 실행 종료 , 존재하지 않을시 창은 없어지나 실행은 계속 되고 있음.
	}

	public static void main(String[] args) {
		ATest a = new ATest();
		a.addLayout();

	}

}

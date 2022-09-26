package b_info;

import java.awt.*;	// awt 패키지 전부 : *


import javax.swing.*;	// swing 패키지 전부 : *


public class InfoView {

//	1. 멤버 변수 선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelate, bCancel, bExit;
	ImageIcon image;
	
//	2. 멤버 변수 객체생성
	InfoView(){
		// 타이틀
		f = new JFrame("DBTest");
		
		// 동쪽 입력값
		tfName = new JTextField(20);
		tfID = new JTextField(20);
		tfTel = new JTextField(20);
		tfGender = new JTextField(20);
		tfAge = new JTextField(20);
		tfHome = new JTextField(20);
		
		
		// 남쪽 버튼창
		bAdd = new JButton("Name");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelate = new JButton("Delate");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
		
		
		// center 입력창
		ta = new JTextArea(40,20);
		
	}
	
//	3. 화면 구성하고 출력
	/*
	 * 전체 프레임은 BorderLayout  지정
	 * 		- West	: JPanel 붙이기 (GridLayout(6,2))
	 * 		- Center : 텍스트에어리어
	 * 		- South : JPanel 붙이기 Button  (GridLayout(1,6))
	 * 
	 */
	public void addLayout() {
		f.setLayout(new BorderLayout());
		
		JPanel tfWest = new JPanel();
		tfWest.setLayout(new GridLayout(6,2));
		tfWest.add(new JLabel("Name",JLabel.CENTER));
		tfWest.add(tfName);
		tfWest.add(new JLabel("ID",JLabel.CENTER));
		tfWest.add(tfID);
		tfWest.add(new JLabel("Tel",JLabel.CENTER));
		tfWest.add(tfTel);
		tfWest.add(new JLabel("Sex",JLabel.CENTER));
		tfWest.add(tfGender);
		tfWest.add(new JLabel("Age",JLabel.CENTER));
		tfWest.add(tfAge);
		tfWest.add(new JLabel("Home",JLabel.CENTER));
		tfWest.add(tfHome);
	f.add(tfWest , BorderLayout.WEST);
	
		f.add(ta , BorderLayout.CENTER);	// 가운데 입력값
		
		JPanel bSouth = new JPanel();
		bSouth.setLayout(new GridLayout(1,2));
		bSouth.add(bAdd);
		bSouth.add(bShow);
		bSouth.add(bSearch);
		bSouth.add(bDelate);
		bSouth.add(bCancel);
		bSouth.add(bExit);
		f.add(bSouth, BorderLayout.SOUTH);
		
		
		// 화면 출력
		f.setBounds(300, 300, 900, 400); // 화면 출력 크기 (가로/세로 길이) 설정
		f.setVisible(true); // 화면에 나타나게 해줌. (출력)
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame.EXIT_ON_CLOSE : X 창 클릭시 실행 종료 , 존재하지 않을시 창은 없어지나 실행은 계속 되고 있음.
		f.setTitle("DBTest");
	}
	
	
	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();
		
	}

}

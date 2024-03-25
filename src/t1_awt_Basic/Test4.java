package t1_awt_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//  종료버튼처리..(인터페이스를 이용~)
@SuppressWarnings("serial")
public class Test4 extends Frame implements WindowListener{
	
	// 객체를 생성시에 UI설계 처리를 한다.
	public Test4() {
		super("AWT 프레임");    // 위아래 뭐로 해도 가능함  O
		//setTitle("AWT 프레임");
		setBounds(300, 200, 350, 250);	// 프레임의 위치/크기(x축, y축, 폭, 높이) : 픽셀단위
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new Test4();	
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);  // 윈도우 실행종료 0번 (윈도우 창 닫기) 
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}
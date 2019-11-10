package swingdemo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {
	SwingDemo (){
		
	JFrame jfrm = new JFrame("a testando");
	
	jfrm.setSize(230, 233);
	
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel jlab = new JLabel("teste 12");
	
	jfrm.add(jlab);
	
	jfrm.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SwingDemo();
			}
		});
	}
}

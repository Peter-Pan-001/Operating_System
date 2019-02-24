import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainInterface extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("欢迎来到磁盘臂调度模拟系统");
	private JLabel label2 = new JLabel("当前磁道:");
	private JLabel label3 = new JLabel("当前磁头移动方向:");
	private JLabel label4 = new JLabel("随机访问序列");
	private JButton JB1 = new JButton("随机");
	private JButton JB2 = new JButton("设置");
	private JButton JB3 = new JButton("FCFS");
	private JButton JB4 = new JButton("SSTF");
	private JButton JB5 = new JButton("SCAN");
	private JButton JB6 = new JButton("LOOK");
	private JPanel JP1 = new JPanel();
	private JPanel JP2 = new JPanel();
	private JPanel JP3 = new JPanel();
	private JPanel JP4 = new JPanel();
	private JPanel JP5 = new JPanel();
	private JTextField textfield1 = new JTextField();
	private JTextField textfield2 = new JTextField();
	private JTextField textfield3 = new JTextField();
	public MainInterface(){
		setTitle("磁盘臂调度模拟系统");
		JP1.setLayout(new FlowLayout());
		JP1.add(label2);
		JP1.add(textfield1);
		JP2.setLayout(new FlowLayout());
		JP2.add(label3);
		JP2.add(textfield2);
		JP3.setLayout(new FlowLayout());
		JP3.add(label4);
		JP3.add(textfield3);
		JP4.setLayout(new BorderLayout());
		JP4.add(JB1,BorderLayout.NORTH);
		JP4.add(JB2,BorderLayout.SOUTH);
		JP4.add(JP1,BorderLayout.WEST);
		JP4.add(JP2,BorderLayout.CENTER);
		JP4.add(JP3,BorderLayout.EAST);
		JP5.setLayout(new FlowLayout());
		JP5.add(JB3);
		JP5.add(JB4);
		JP5.add(JB5);
		JP5.add(JB6);
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(label1);
		getContentPane().add(JP4);
		getContentPane().add(JP5);
		setLocation(500,200);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String args[]){
		MainInterface app = new MainInterface();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

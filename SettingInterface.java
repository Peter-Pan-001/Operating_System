import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SettingInterface extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("��Խһ���ŵ�����ʱ��(ms):");
	private JLabel label2 = new JLabel("����ʱ��(ms):");
	private JLabel label3 = new JLabel("����ת��(rad/min):");
	private JLabel label4 = new JLabel("ÿ�ŵ�������(��):");
	private JLabel label5 = new JLabel("ÿ�����ֽ���(Byte):");
	private JTextField textfield1 = new JTextField();
	private JTextField textfield2 = new JTextField();
	private JTextField textfield3 = new JTextField();
	private JTextField textfield4 = new JTextField();
	private JTextField textfield5 = new JTextField();
	private JButton JB = new JButton("ȷ��");
	private JPanel JP1 = new JPanel();
	private JPanel JP2 = new JPanel();
	private JPanel JP3 = new JPanel();
	private JPanel JP4 = new JPanel();
	private JPanel JP5 = new JPanel();
	public SettingInterface(){
		setTitle("��������");
		JP1.setLayout(new FlowLayout());
		JP1.add(label1);
		JP1.add(textfield1);
		JP2.setLayout(new FlowLayout());
		JP2.add(label2);
		JP2.add(textfield2);
		JP3.setLayout(new FlowLayout());
		JP3.add(label3);
		JP3.add(textfield3);
		JP4.setLayout(new FlowLayout());
		JP4.add(label4);
		JP4.add(textfield4);
		JP5.setLayout(new FlowLayout());
		JP5.add(label5);
		JP5.add(textfield5);
		getContentPane().setLayout(new GridLayout(6,1));
		getContentPane().add(JP1);
		getContentPane().add(JP2);
		getContentPane().add(JP3);
		getContentPane().add(JP4);
		getContentPane().add(JP5);
		getContentPane().add(JB);
		setLocation(500,200);
		setSize(400,200);
		setVisible(true);
	}
}



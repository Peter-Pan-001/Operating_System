import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DisplayInterface extends JFrame implements ActionListener{
	private JLabel label1 = new JLabel("引臂移动序列:");
	private JLabel label2 = new JLabel("引臂移动量:");
	private JLabel label3 = new JLabel("寻道时间(s):");
	private JLabel label4 = new JLabel("平均旋转延迟时间(s):");
	private JLabel label5 = new JLabel("传输时间(s):");
	private JLabel label6 = new JLabel("总访问处理时间(s):");
	private JTextField textfield1 = new JTextField();
	private JTextField textfield2 = new JTextField();
	private JTextField textfield3 = new JTextField();
	private JTextField textfield4 = new JTextField();
	private JTextField textfield5 = new JTextField();
	private JTextField textfield6 = new JTextField();
	private JPanel JP1 = new JPanel();
	private JPanel JP2 = new JPanel();
	private JPanel JP3 = new JPanel();
	private JPanel JP4 = new JPanel();
	private JPanel JP5 = new JPanel();
	private JPanel JP6 = new JPanel();
	public DisplayInterface(){
		setTitle("结果");
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
		JP6.setLayout(new FlowLayout());
		JP6.add(label6);
		JP6.add(textfield6);
		getContentPane().setLayout(new GridLayout(6,1));
		getContentPane().add(JP1);
		getContentPane().add(JP2);
		getContentPane().add(JP3);
		getContentPane().add(JP4);
		getContentPane().add(JP5);
		getContentPane().add(JP6);
		setLocation(500,200);
		setSize(400,200);
		setVisible(true);
	}
}


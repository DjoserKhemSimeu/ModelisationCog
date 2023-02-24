package corsiPak;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUICorsi {

	private JFrame frame;
	private JTextField textField;
	private JTextField reponse;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICorsi window = new GUICorsi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICorsi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BlockPos b=new BlockPos();
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JRadioButton rdbtnCryptage = new JRadioButton("automatique");
		rdbtnCryptage.setSelected(true);
		buttonGroup.add(rdbtnCryptage);
		panel.add(rdbtnCryptage); 
		JRadioButton rdbtnManuel = new JRadioButton("Manuel");
		rdbtnCryptage.setSelected(false);
		buttonGroup.add(rdbtnManuel);
		panel.add(rdbtnManuel); 
		
		
		JLabel lblResultat = new JLabel("Sequence");
		panel.add(lblResultat);
		
		textField=new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		 gbc.weightx = 1;
		 gbc.weighty = 1;
		
		
		JButton bloc1= new JButton("1");
		bloc1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(1);
			}
		});
		 gbc.gridx = 0;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 1;
		 gbc.gridy = 0;
		 bloc1.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc1,gbc);
		
		JButton bloc2= new JButton("2");
		bloc2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(2);
			}
		});
		 gbc.gridx = 0;
		 gbc.gridwidth = 1;
		 gbc.gridheight = 3;
		 gbc.gridy = 1;
		 bloc2.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc2,gbc);
		JButton bloc3= new JButton("3");
		bloc3.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(3);
			}
		});
		 gbc.gridx = 1;
		 gbc.gridwidth = 1;
		 gbc.gridheight =-2;
		 gbc.gridy = 1;
		 bloc3.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc3,gbc);
		JButton bloc4= new JButton("4");
		bloc4.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(4);
			}
		});
		 gbc.gridx = 1;
		 gbc.gridwidth = 4;
		 gbc.gridheight = -4;
		 gbc.gridy = 2;
		 bloc4.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc4,gbc);
		JButton bloc5= new JButton("5");
		bloc5.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(5);
			}
		});
		gbc.gridx = 2;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 2;
		 gbc.gridy = 0;
		 bloc5.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc5,gbc);
		JButton bloc6= new JButton("6");
		bloc6.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(6);
			}
		});
		gbc.gridx = 1;
		 gbc.gridwidth = 1;
		 gbc.gridheight =-3;
		 gbc.gridy = 2;
		 bloc6.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc6,gbc);
		JButton bloc7= new JButton("7");
		bloc7.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(7);
			}
		});
		gbc.gridx = 3;
		 gbc.gridwidth = 4;
		 gbc.gridheight = -3;
		 gbc.gridy = 2;
		 bloc7.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc7,gbc);
		JButton bloc8= new JButton("8");
		bloc8.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(8);
			}
		});
		gbc.gridx = 0;
		 gbc.gridwidth = 2;
		 gbc.gridheight = 4;
		 gbc.gridy = 0;
		 bloc8.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc8,gbc);
		JButton bloc9= new JButton("9");
		bloc9.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(9);
			}
		});
		gbc.gridx = 2;
		 gbc.gridwidth = 4;
		 gbc.gridheight = -5;
		 gbc.gridy = 1;
		 bloc9.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc9,gbc);
		JButton bloc10= new JButton("10");
		bloc10.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.addSelect(10);
			}
		});
		 bloc10.setPreferredSize(new Dimension(50,50));
		panel2.add(bloc10);
		
		JPanel panel3=new JPanel();
		frame.getContentPane().add(panel3,BorderLayout.SOUTH);
		JButton rep= new JButton("reponse");
		rep.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnManuel.isSelected()) {
				 reponse.setText(b.reponse());
				}else {
					b.reset();
					String s=textField.getText();
					while (s.length()!=0) {
						if(s.charAt(0)=='1'&&s.charAt(1)=='0') {
							b.addSelect(10);
							s=s.substring(2,s.length());
						}else {
							b.addSelect(Integer.parseInt(s.substring(0,1)));
							s=s.substring(1,s.length());
						}
					}
					reponse.setText(b.reponse());
					
				}
			}
		});
		panel3.add(rep);
		reponse=new JTextField();
		panel3.add(reponse);
		reponse.setColumns(10);
		
	}

}

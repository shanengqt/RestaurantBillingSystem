

import java.awt.EventQueue;
import java.awt.print.*;
import javafx.print.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;

public class Restaurant {

	private JFrame frmBurgerHub;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args ){ 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frmBurgerHub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JLabel lblInsufecientPayment = new JLabel("Insufficient Payment!");
		lblInsufecientPayment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		lblInsufecientPayment.setBackground(new Color(70, 130, 180));
		frmBurgerHub = new JFrame();
		frmBurgerHub.setBackground(new Color(253, 245, 230));
		frmBurgerHub.setResizable(false);
		frmBurgerHub.setTitle(" Burger Hub Ordering And Billing System");
		frmBurgerHub.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dennis\\Pictures\\gsauce\\icon.png"));
		frmBurgerHub.addWindowListener(new WindowAdapter() {
			@Override
			
			public void windowOpened(WindowEvent arg0) {
				
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_15.setVisible(false);
				textField_16.setVisible(false);
				textField_17.setVisible(false);
				textField_18.setVisible(false);
				textField_19.setVisible(false);
				textField_20.setVisible(false);
				textField_21.setVisible(false);
				textField_22.setVisible(false);
				textField_23.setVisible(false);
				textField_24.setVisible(false);
				textField_25.setVisible(false);
				textField_26.setVisible(false);
				textField_27.setVisible(false);
				textField_28.setVisible(false);
				textField_29.setVisible(false);
				textField_30.setVisible(false);
				textField_31.setVisible(false);
				textField_32.setVisible(false);
				textField_33.setVisible(false);
				textField_34.setVisible(false);
				textField_35.setVisible(false);
				textField_36.setVisible(false);
				textField_37.setVisible(false);
			
				
			
				
				lblInsufecientPayment.setVisible(false);
				
				
				
			}
		});
		frmBurgerHub.getContentPane().setBackground(new Color(0, 0, 0));
		frmBurgerHub.setBounds( 0, 0, 1617, 1006);
		frmBurgerHub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBurgerHub.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 69, 0));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBorder(new LineBorder(new Color(222, 184, 135), 6));
		panel.setBounds(10, 114, 877, 441);
		frmBurgerHub.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGsauce = new JLabel("New label");
		lblGsauce.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\gsauce\\9.png"));
		lblGsauce.setBounds(454, 50, 399, 362);
		panel.add(lblGsauce);
		lblGsauce.setVisible(false);
		
		JLabel lblBigLord = new JLabel("New label");
		lblBigLord.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\gsauce\\11.png"));
		lblBigLord.setBounds(466, 66, 399, 362);
		panel.add(lblBigLord);
		lblBigLord.setVisible(false);
		
		
		JLabel lblBaconLord = new JLabel("New label");
		lblBaconLord.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\gsauce\\10.png"));
		lblBaconLord.setBounds(466, 66, 399, 362);
		panel.add(lblBaconLord);
		lblBaconLord.setVisible(false);
		
		
		JLabel lblChKingDeluxe = new JLabel("");
		lblChKingDeluxe.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\7.png"));
		lblChKingDeluxe.setBounds(454, 50, 399, 362);
		panel.add(lblChKingDeluxe);
		lblChKingDeluxe.setVisible(false);
		
		
		JLabel lblTexasDoubleWhooper_1 = new JLabel("");
		lblTexasDoubleWhooper_1.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\gsauce\\99.png"));
		lblTexasDoubleWhooper_1.setBounds(454, 50, 399, 362);
		panel.add(lblTexasDoubleWhooper_1);
		lblTexasDoubleWhooper_1.setVisible(false);
		
		JLabel lblTriple = new JLabel("New label");
		lblTriple.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\5.png"));
		lblTriple.setBounds(454, 50, 399, 362);
		panel.add(lblTriple);
		lblTriple.setVisible(false);
		
		
		JLabel lblDoubleWhooper_1 = new JLabel("New label");
		lblDoubleWhooper_1.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\4.png"));
		lblDoubleWhooper_1.setBounds(454, 50, 399, 362);
		panel.add(lblDoubleWhooper_1);
		lblDoubleWhooper_1.setVisible(false);
		
		JLabel lblBaconKing_1 = new JLabel("New label");
		lblBaconKing_1.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\3.png"));
		lblBaconKing_1.setBounds(454, 50, 399, 362);
		panel.add(lblBaconKing_1);
		lblBaconKing_1.setVisible(false);
		
		JLabel lblImpossibleWhooper_1 = new JLabel("New label");
		lblImpossibleWhooper_1.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\2.png"));
		lblImpossibleWhooper_1.setBounds(454, 50, 399, 362);
		panel.add(lblImpossibleWhooper_1);
		lblImpossibleWhooper_1.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Bunz");
		lblNewLabel_1.setBackground(new Color(70, 130, 180));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_1.setBounds(57, 13, 84, 38);
		panel.add(lblNewLabel_1);
		
		JLabel lblWhooper_1 = new JLabel("New label");
		lblWhooper_1.setBounds(454, 50, 399, 362);
		panel.add(lblWhooper_1);
		lblWhooper_1.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\1.png"));
		lblWhooper_1.setVisible(false);
		
		JLabel lblWhooper = new JLabel("Whooper");
		lblWhooper.setBackground(new Color(70, 130, 180));
		lblWhooper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Whooper");
				lblWhooper_1.setVisible(true);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				
				
			
			
				
			}
		});
		lblWhooper.setForeground(new Color(0, 0, 0));
		lblWhooper.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblWhooper.setBounds(23, 81, 152, 23);
		panel.add(lblWhooper);
		
		JLabel lblImpossibleWhooper = new JLabel("Impossible Whooper");
		lblImpossibleWhooper.setBackground(new Color(70, 130, 180));
		lblImpossibleWhooper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Impossible Whooper");
				lblImpossibleWhooper_1.setVisible(true);
				lblWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
				
				
				
				
			}
		});
		
		
			
		lblImpossibleWhooper.setForeground(new Color(0, 0, 0));
		lblImpossibleWhooper.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblImpossibleWhooper.setBounds(23, 115, 191, 23);
		panel.add(lblImpossibleWhooper);
		
		JLabel lblBaconKing = new JLabel("Bacon King\r\n");
		lblBaconKing.setBackground(new Color(70, 130, 180));
		lblBaconKing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Bacon King");
				lblBaconKing_1.setVisible(true);
				lblImpossibleWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
			}
		});
		
		
		lblBaconKing.setForeground(new Color(0, 0, 0));
		lblBaconKing.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblBaconKing.setBounds(23, 149, 180, 23);
		panel.add(lblBaconKing);
		
		
		JLabel lblDoubleWhooper = new JLabel("Double Whooper");
		lblDoubleWhooper.setBackground(new Color(70, 130, 180));
		lblDoubleWhooper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Double Whooper");
				lblDoubleWhooper_1.setVisible(true);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				
			}
		});
		
		
		lblDoubleWhooper.setForeground(new Color(0, 0, 0));
		lblDoubleWhooper.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblDoubleWhooper.setBounds(23, 183, 152, 23);
		panel.add(lblDoubleWhooper);
		
		JLabel lblTripleWhooperwithCheese = new JLabel("Triple Whooper with Cheese");
		lblTripleWhooperwithCheese.setBackground(new Color(70, 130, 180));
		lblTripleWhooperwithCheese.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Triple Whooper with Cheese");
				lblTriple.setVisible(true);
				lblDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				
				
			}
		});
		
		
		lblTripleWhooperwithCheese.setForeground(new Color(0, 0, 0));
		lblTripleWhooperwithCheese.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblTripleWhooperwithCheese.setBounds(23, 217, 227, 23);
		panel.add(lblTripleWhooperwithCheese);
		
		JLabel lblTexasDoubleWhooper = new JLabel("Texas Double Whooper");
		lblTexasDoubleWhooper.setBackground(new Color(70, 130, 180));
		lblTexasDoubleWhooper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Texas Double Whooper");
				lblTexasDoubleWhooper_1.setVisible(true);
				lblTriple.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
			}
		});
		
		
		lblTexasDoubleWhooper.setForeground(new Color(0, 0, 0));
		lblTexasDoubleWhooper.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblTexasDoubleWhooper.setBounds(23, 251, 227, 23);
		panel.add(lblTexasDoubleWhooper);
		
		JLabel lblChKingDeluxeSandwich = new JLabel("Ch'King Deluxe Sandwich\r\n");
		lblChKingDeluxeSandwich.setBackground(new Color(70, 130, 180));
		lblChKingDeluxeSandwich.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Ch'King Deluxe Sandwich");
				lblChKingDeluxe.setVisible(true);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				
			}
		});
		
		
		lblChKingDeluxeSandwich.setForeground(new Color(0, 0, 0));
		lblChKingDeluxeSandwich.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblChKingDeluxeSandwich.setBounds(23, 285, 211, 23);
		panel.add(lblChKingDeluxeSandwich);
		
		
		JLabel lblBaconCheeseBurger = new JLabel("Bacon Cheeseburger");
		lblBaconCheeseBurger.setBackground(new Color(70, 130, 180));
		lblBaconCheeseBurger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Bacon Cheeseburger");
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(true);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
			}
		});
		
		
		lblBaconCheeseBurger.setForeground(new Color(0, 0, 0));
		lblBaconCheeseBurger.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblBaconCheeseBurger.setBounds(23, 319, 191, 23);
		panel.add(lblBaconCheeseBurger);

		JLabel lblBigFish = new JLabel("Big Fish");
		lblBigFish.setBackground(new Color(70, 130, 180));
		lblBigFish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Big Fish");
				lblBaconLord.setVisible(true);
				lblGsauce.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				
			}
		});
		
		
		lblBigFish.setForeground(new Color(0, 0, 0));
		lblBigFish.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblBigFish.setBounds(23, 353, 152, 23);
		panel.add(lblBigFish);
		
		JLabel lblSpicyChKingDeluxe = new JLabel("Spicy Ch'King Deluxe ");
		lblSpicyChKingDeluxe.setBackground(new Color(70, 130, 180));
		lblSpicyChKingDeluxe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_12.setText("Spicy Ch'King Deluxe");
				lblGsauce.setVisible(true);
				lblBigLord.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblWhooper_1.setVisible(false);
			}
		});
		
		
		lblSpicyChKingDeluxe.setForeground(new Color(0, 0, 0));
		lblSpicyChKingDeluxe.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblSpicyChKingDeluxe.setBounds(23, 387, 211, 23);
		panel.add(lblSpicyChKingDeluxe);
		
		JLabel label_1 = new JLabel("105");
		label_1.setBackground(new Color(70, 130, 180));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_13.setText("105");
			}
		});
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_1.setBounds(278, 82, 37, 23);
		panel.add(label_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBackground(new Color(70, 130, 180));
		lblPrice.setForeground(new Color(0, 0, 0));
		lblPrice.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblPrice.setBounds(334, 13, 84, 38);
		panel.add(lblPrice);
		
		JLabel label_2 = new JLabel("155");
		label_2.setBackground(new Color(70, 130, 180));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			}
		});
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_2.setBounds(349, 82, 37, 23);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("195");
		label_3.setBackground(new Color(70, 130, 180));
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			;
			}
		});
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_3.setBounds(417, 81, 37, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("125");
		label_4.setBackground(new Color(70, 130, 180));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			}
		});
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_4.setBounds(278, 117, 37, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("175");
		label_5.setBackground(new Color(70, 130, 180));
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_5.setBounds(349, 117, 37, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("215");
		label_6.setBackground(new Color(70, 130, 180));
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_6.setBounds(417, 116, 37, 23);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("145");
		label_7.setBackground(new Color(70, 130, 180));
		label_7.setForeground(new Color(0, 0, 0));
		label_7.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_7.setBounds(278, 151, 37, 23);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("195");
		label_8.setBackground(new Color(70, 130, 180));
		label_8.setForeground(new Color(0, 0, 0));
		label_8.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_8.setBounds(349, 151, 37, 23);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("235");
		label_9.setBackground(new Color(70, 130, 180));
		label_9.setForeground(new Color(0, 0, 0));
		label_9.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_9.setBounds(417, 150, 37, 23);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("155");
		label_10.setBackground(new Color(70, 130, 180));
		label_10.setForeground(new Color(0, 0, 0));
		label_10.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_10.setBounds(278, 185, 37, 23);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("205");
		label_11.setBackground(new Color(70, 130, 180));
		label_11.setForeground(new Color(0, 0, 0));
		label_11.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_11.setBounds(349, 185, 37, 23);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("245");
		label_12.setBackground(new Color(70, 130, 180));
		label_12.setForeground(new Color(0, 0, 0));
		label_12.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_12.setBounds(417, 184, 37, 23);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("105");
		label_13.setBackground(new Color(70, 130, 180));
		label_13.setForeground(new Color(0, 0, 0));
		label_13.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_13.setBounds(278, 217, 37, 23);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("155");
		label_14.setBackground(new Color(70, 130, 180));
		label_14.setForeground(new Color(0, 0, 0));
		label_14.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_14.setBounds(349, 217, 37, 23);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("195");
		label_15.setBackground(new Color(70, 130, 180));
		label_15.setForeground(new Color(0, 0, 0));
		label_15.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_15.setBounds(417, 218, 37, 23);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("335");
		label_16.setBackground(new Color(70, 130, 180));
		label_16.setForeground(new Color(0, 0, 0));
		label_16.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_16.setBounds(417, 387, 37, 23);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("135");
		label_17.setBackground(new Color(70, 130, 180));
		label_17.setForeground(new Color(0, 0, 0));
		label_17.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_17.setBounds(278, 251, 37, 23);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("185");
		label_18.setBackground(new Color(70, 130, 180));
		label_18.setForeground(new Color(0, 0, 0));
		label_18.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_18.setBounds(349, 251, 37, 23);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("225");
		label_19.setBackground(new Color(70, 130, 180));
		label_19.setForeground(new Color(0, 0, 0));
		label_19.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_19.setBounds(417, 252, 37, 23);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("225");
		label_20.setBackground(new Color(70, 130, 180));
		label_20.setForeground(new Color(0, 0, 0));
		label_20.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_20.setBounds(417, 287, 37, 23);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("255");
		label_21.setBackground(new Color(70, 130, 180));
		label_21.setForeground(new Color(0, 0, 0));
		label_21.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_21.setBounds(417, 321, 37, 23);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("215");
		label_22.setBackground(new Color(70, 130, 180));
		label_22.setForeground(new Color(0, 0, 0));
		label_22.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_22.setBounds(349, 320, 37, 23);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("185");
		label_23.setBackground(new Color(70, 130, 180));
		label_23.setForeground(new Color(0, 0, 0));
		label_23.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_23.setBounds(349, 286, 37, 23);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("135");
		label_24.setBackground(new Color(70, 130, 180));
		label_24.setForeground(new Color(0, 0, 0));
		label_24.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_24.setBounds(278, 286, 37, 23);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("165");
		label_25.setBackground(new Color(70, 130, 180));
		label_25.setForeground(new Color(0, 0, 0));
		label_25.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_25.setBounds(278, 320, 37, 23);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("145");
		label_26.setBackground(new Color(70, 130, 180));
		label_26.setForeground(new Color(0, 0, 0));
		label_26.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_26.setBounds(278, 354, 37, 23);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("245");
		label_27.setBackground(new Color(70, 130, 180));
		label_27.setForeground(new Color(0, 0, 0));
		label_27.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_27.setBounds(278, 388, 37, 23);
		panel.add(label_27);
		
		JLabel label_28 = new JLabel("195");
		label_28.setBackground(new Color(70, 130, 180));
		label_28.setForeground(new Color(0, 0, 0));
		label_28.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_28.setBounds(349, 354, 37, 23);
		panel.add(label_28);
		
		JLabel label_29 = new JLabel("295");
		label_29.setBackground(new Color(70, 130, 180));
		label_29.setForeground(new Color(0, 0, 0));
		label_29.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label_29.setBounds(349, 388, 37, 23);
		panel.add(label_29);
		
		JLabel label = new JLabel("235");
		label.setBackground(new Color(70, 130, 180));
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Century Gothic", Font.BOLD, 18));
		label.setBounds(417, 354, 37, 23);
		panel.add(label);
		
		JLabel lblS = new JLabel("S");
		lblS.setForeground(new Color(0, 0, 0));
		lblS.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblS.setBounds(288, 48, 37, 23);
		panel.add(lblS);
		
		JLabel lblM = new JLabel("M");
		lblM.setForeground(new Color(0, 0, 0));
		lblM.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblM.setBounds(359, 48, 37, 23);
		panel.add(lblM);
		
		JLabel lblL = new JLabel("L");
		lblL.setForeground(new Color(0, 0, 0));
		lblL.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblL.setBounds(428, 48, 37, 23);
		panel.add(lblL);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 69, 0));
		panel_1.setBorder(new LineBorder(new Color(222, 184, 135), 6));
		panel_1.setBackground(new Color(255, 250, 205));
		panel_1.setBounds(899, 114, 688, 387);
		frmBurgerHub.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Item", "Leche Flan", "Banana ConYelo w/ Leche Flan", "Mais ConYelo w/ Leche Flan"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		comboBox_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_1.setBackground(new Color(253, 245, 230));
		comboBox_1.setBounds(22, 139, 289, 44);
		panel_1.add(comboBox_1);
		JButton button_1 = new JButton("Order");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setEnabled(false);
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Item", "Lasagna Supreme Solo", "Creamy Bacon Carbonara Solo", "Lemon Ricotta Pasta", "Penne Alla Vodka", "Pasta Puttanesca", "Stuffed Rigatoni", "Spaghetti", "Italian Pasta Salad"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setMaximumRowCount(10);
		comboBox_2.setForeground(new Color(0, 0, 0));
		comboBox_2.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		comboBox_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_2.setBackground(new Color(253, 245, 230));
		comboBox_2.setBounds(22, 58, 289, 44);
		panel_1.add(comboBox_2);
		
		JLabel label_30 = new JLabel("Quantity :");
		label_30.setBackground(new Color(70, 130, 180));
		label_30.setForeground(new Color(0, 0, 0));
		label_30.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		label_30.setBounds(392, 24, 70, 22);
		panel_1.add(label_30);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setForeground(new Color(0, 0, 0));
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(new Color(253, 245, 230));
		textField.setBounds(392, 63, 55, 20);
		panel_1.add(textField);
		JButton btnFinalizeOrder = new JButton("Finalize Order");
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(253, 245, 230));
		textField_1.setBounds(392, 144, 55, 20);
		panel_1.add(textField_1);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setBackground(new Color(70, 130, 180));
		lblPasta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPasta.setForeground(new Color(0, 0, 0));
		lblPasta.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		lblPasta.setBounds(26, 13, 84, 38);
		panel_1.add(lblPasta);
		
		JLabel lblDesserts = new JLabel("Desserts");
		lblDesserts.setBackground(new Color(70, 130, 180));
		lblDesserts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesserts.setForeground(new Color(0, 0, 0));
		lblDesserts.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		lblDesserts.setBounds(12, 100, 131, 38);
		panel_1.add(lblDesserts);
		
		JLabel label_31 = new JLabel("Quantity :");
		label_31.setBackground(new Color(70, 130, 180));
		label_31.setForeground(new Color(0, 0, 0));
		label_31.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		label_31.setBounds(392, 109, 70, 22);
		panel_1.add(label_31);
		JTextArea txtrCharlsBurgerHub = new JTextArea();
		txtrCharlsBurgerHub.setForeground(new Color(0, 0, 0));
		txtrCharlsBurgerHub.setBackground(new Color(255, 250, 205));
		txtrCharlsBurgerHub.setWrapStyleWord(true);
		JButton btnNewButton = new JButton("Add Order");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnFinalizeOrder.setEnabled(true);
				if (comboBox_1.getSelectedItem() == "Leche Flan"){
					int a = Integer.parseInt(textField_1.getText())*90;
					int b = Integer.parseInt(textField_27.getText())+a;
					
					textField_27.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Leche Flan"+ "                                           "+"90.00" +"                                       " +textField_1.getText());
					comboBox_1.setSelectedItem("Select Item");
				} 
				if (comboBox_1.getSelectedItem() == "Banana ConYelo w/ Leche Flan"){
					int a = Integer.parseInt(textField_1.getText())*70;
					int b = Integer.parseInt(textField_28.getText())+a;
					
					textField_28.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Banana ConYelo w/ Leche Flan"+ "              "+"70.00" +"                                           " +textField_1.getText());
					comboBox_1.setSelectedItem("Select Item");
				} 
				if (comboBox_1.getSelectedItem() == "Mais ConYelo w/ Leche Flan"){
					int a = Integer.parseInt(textField_1.getText())*80;
					int b = Integer.parseInt(textField_29.getText())+a;
					
					textField_29.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Mais ConYelo w/ Leche Flan"+ "                    "+"70.00" +"                                           " +textField_1.getText());
					comboBox_1.setSelectedItem("Select Item");
				} 
				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(533, 116, 111, 52);
		panel_1.add(btnNewButton);
		
		JButton btnOrder = new JButton("Add Order");
		btnOrder.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnOrder.setBackground(new Color(253, 245, 230));
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnFinalizeOrder.setEnabled(true);
				
			}
		});
		btnOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					if (comboBox_2.getSelectedItem() == "Lasagna Supreme Solo"){
						int a = Integer.parseInt(textField.getText())*80;
						int b = Integer.parseInt(textField_19.getText())+a;
						
						textField_19.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Lasagna Supreme Solo"+ "                      "+"80.00" +"                                        " +textField.getText());
					comboBox_2.setSelectedItem("Select Item");
					
				} 
				
					if (comboBox_2.getSelectedItem() == "Lasagna Supreme Solo"){
						int a = Integer.parseInt(textField.getText())*150;
						int b = Integer.parseInt(textField_20.getText())+a;
						
						textField_20.setText(String.valueOf(b));
						txtrCharlsBurgerHub.append("\n" + "Lasagna Supreme Solo"+ "                                                     "+"150.00"+ "                                            " +textField.getText());
						comboBox_2.setSelectedItem("Select Item");
				} 
					if (comboBox_2.getSelectedItem() == "Creamy Bacon Carbonara Solo"){
						int a = Integer.parseInt(textField.getText())*80;
						int b = Integer.parseInt(textField_21.getText())+a;
						
						textField_21.setText(String.valueOf(b));
						txtrCharlsBurgerHub.append("\n" + "Creamy Bacon Carbonara Solo"+ "                                                          "+"80.00"+ "                                            " +textField.getText());
						comboBox_2.setSelectedItem("Select Item");
			}
					if (comboBox_2.getSelectedItem() == "Creamy Bacon Carbonara Solo"){
						int a = Integer.parseInt(textField.getText())*150;
						int b = Integer.parseInt(textField_22.getText())+a;
						
						textField_22.setText(String.valueOf(b));
						txtrCharlsBurgerHub.append("\n" + "Creamy Bacon Carbonara Solo"+ "                                                        "+"150.00"+ "                                           " +textField.getText());
						comboBox_2.setSelectedItem("Select Item");
					}
			
			
			        if (comboBox_2.getSelectedItem() == "Lemon Ricotta Pasta"){
			        	int a = Integer.parseInt(textField.getText())*80;
						int b = Integer.parseInt(textField_23.getText())+a;
						
						textField_23.setText(String.valueOf(b));
			        	txtrCharlsBurgerHub.append("\n" + "Lemon Ricotta Pasta"+ "                                                  "+"80.00"+ "                                            " +textField.getText());
			        	comboBox_2.setSelectedItem("Select Item");
			        }
			
			if (comboBox_2.getSelectedItem() == "Lemon Ricotta Pasta"){
				int a = Integer.parseInt(textField.getText())*150;
				int b = Integer.parseInt(textField_24.getText())+a;
				
				textField_24.setText(String.valueOf(b));
				txtrCharlsBurgerHub.append("\n" + "Lemon Ricotta Pasta"+ "                                                "+"150.00"+ "                                           " +textField.getText());
				comboBox_2.setSelectedItem("Select Item");
			}
			if (comboBox_2.getSelectedItem() == "Penne Alla Vodka"){
				int a = Integer.parseInt(textField.getText())*95;
				int b = Integer.parseInt(textField_26.getText())+a;
				
				textField_26.setText(String.valueOf(b));
				txtrCharlsBurgerHub.append("\n" + "Penne Alla Vodka"+ "                                                            "+"95.00"+ "                                            " +textField.getText());
				comboBox_2.setSelectedItem("Select Item");
			}
			if (comboBox_2.getSelectedItem() == "Pasta Puttanesca"){
				int a = Integer.parseInt(textField.getText())*130;
				int b = Integer.parseInt(textField_25.getText())+a;
				
				textField_25.setText(String.valueOf(b));
				txtrCharlsBurgerHub.append("\n" + "Pasta Puttanesca"+ "                           "+"130.00"+ "                                            " +textField.getText());
				comboBox_2.setSelectedItem("Select Item");
			}
			}
		});
		btnOrder.setForeground(new Color(0, 0, 0));
		btnOrder.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		btnOrder.setBounds(533, 35, 111, 52);
		panel_1.add(btnOrder);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setBackground(new Color(70, 130, 180));
		lblDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrinks.setForeground(new Color(0, 0, 0));
		lblDrinks.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		lblDrinks.setBounds(12, 181, 111, 38);
		panel_1.add(lblDrinks);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Item", "Coke", "Sprite", "Mountain Dew", "San Mig Light", "Blue Lemonade", "Red Tea", "Ice Tea ", "Pineapple"}));
		comboBox_3.setToolTipText("");
		comboBox_3.setMaximumRowCount(10);
		comboBox_3.setForeground(new Color(0, 0, 0));
		comboBox_3.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		comboBox_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox_3.setBackground(new Color(253, 245, 230));
		comboBox_3.setBounds(22, 228, 289, 44);
		panel_1.add(comboBox_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(253, 245, 230));
		textField_2.setBounds(392, 233, 55, 20);
		panel_1.add(textField_2);
		
		JLabel label_34 = new JLabel("Quantity :");
		label_34.setBackground(new Color(70, 130, 180));
		label_34.setForeground(new Color(0, 0, 0));
		label_34.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		label_34.setBounds(392, 194, 65, 22);
		panel_1.add(label_34);
		
		JButton btnAddOrder = new JButton("Add Order");
		btnAddOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnAddOrder.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAddOrder.setBackground(new Color(253, 245, 230));
		
		btnFinalizeOrder.setEnabled(false);
		btnAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnFinalizeOrder.setEnabled(true);
				if (comboBox_3.getSelectedItem() == "Coke"){
					int a = Integer.parseInt(textField_2.getText())*20;
					int b = Integer.parseInt(textField_30.getText())+a;
					
					textField_30.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Coke  "+ "                                                   "+"20.00" +"                                       " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Sprite"){
					int a = Integer.parseInt(textField_2.getText())*20;
					int b = Integer.parseInt(textField_31.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Sprite"+ "                                       "+"20.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Mountain Dew"){
					int a = Integer.parseInt(textField_2.getText())*20;
					int b = Integer.parseInt(textField_32.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Mountain Dew"+ "                                       "+"20.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "San Mig Light"){
					int a = Integer.parseInt(textField_2.getText())*45;
					int b = Integer.parseInt(textField_33.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "San Mig Light"+ "                                       "+"45.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Blue Lemonade"){
					int a = Integer.parseInt(textField_2.getText())*45;
					int b = Integer.parseInt(textField_34.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Blue Lemonade"+ "                                       "+"45.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Red Tea"){
					int a = Integer.parseInt(textField_2.getText())*35;
					int b = Integer.parseInt(textField_35.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Red Tea"+ "                                       "+"35.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Ice Tea "){
					int a = Integer.parseInt(textField_2.getText())*45;
					int b = Integer.parseInt(textField_36.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Ice Tea"+ "                                       "+"45.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
				if (comboBox_3.getSelectedItem() == "Pineapple"){
					int a = Integer.parseInt(textField_2.getText())*45;
					int b = Integer.parseInt(textField_37.getText())+a;
					
					textField_31.setText(String.valueOf(b));
					txtrCharlsBurgerHub.append("\n" + "Pineapple"+ "                                       "+"45.00" +"                                        " +textField_2.getText());
					comboBox_3.setSelectedItem("Select Item");
				} 
			}
		});
		btnAddOrder.setForeground(new Color(0, 0, 0));
		btnAddOrder.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		btnAddOrder.setBounds(533, 204, 111, 52);
		panel_1.add(btnAddOrder);
		
		
		btnFinalizeOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button_1.setEnabled(true);
			}
		});
		btnFinalizeOrder.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnFinalizeOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int a,b,c,d,f,g;
				a =Integer.parseInt(textField_37.getText())+Integer.parseInt(textField_36.getText())+Integer.parseInt(textField_35.getText())+ Integer.parseInt(textField_34.getText())+Integer.parseInt(textField_33.getText())+Integer.parseInt(textField_32.getText())+Integer.parseInt(textField_31.getText())+Integer.parseInt(textField_30.getText())+Integer.parseInt(textField_29.getText())+Integer.parseInt(textField_28.getText())+Integer.parseInt(textField_27.getText())+Integer.parseInt(textField_26.getText())+Integer.parseInt(textField_25.getText())+Integer.parseInt(textField_24.getText())+Integer.parseInt(textField_23.getText())+Integer.parseInt(textField_22.getText())+Integer.parseInt(textField_21.getText())+Integer.parseInt(textField_20.getText())+Integer.parseInt(textField_19.getText())+Integer.parseInt(textField_18.getText())+Integer.parseInt(textField_17.getText())+Integer.parseInt(textField_16.getText())+Integer.parseInt(textField_15.getText())+Integer.parseInt(textField_11.getText())+Integer.parseInt(textField_6.getText())+Integer.parseInt(textField_7.getText())+Integer.parseInt(textField_8.getText())+Integer.parseInt(textField_9.getText())+Integer.parseInt(textField_10.getText());
				textField_3.setText(String.valueOf(a));
				
			}
		});
		btnFinalizeOrder.setForeground(new Color(0, 0, 0));
		btnFinalizeOrder.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		btnFinalizeOrder.setBackground(new Color(253, 245, 230));
		btnFinalizeOrder.setBounds(135, 293, 412, 57);
		panel_1.add(btnFinalizeOrder);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(255, 69, 0));
		panel_2.setBorder(new LineBorder(new Color(222, 184, 135), 4));
		panel_2.setBackground(new Color(253, 245, 230));
		panel_2.setBounds(899, 514, 688, 430);
		frmBurgerHub.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		
		
		txtrCharlsBurgerHub.setText(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = \r\n                                                           Burger Hub\r\n                                                Sta. Rita Batangas City \r\n                                         Tel No. : 403 - 21483 | 403 - 21560\r\n = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =    \nOrder :                                                  Price :                                     Quantity :"  );
		txtrCharlsBurgerHub.setLineWrap(true);
		txtrCharlsBurgerHub.setFont(new Font("Century Gothic", Font.BOLD, 18));
		txtrCharlsBurgerHub.setEditable(false);
		txtrCharlsBurgerHub.setBounds(12, 13, 666, 404);

		
		panel_2.add(txtrCharlsBurgerHub);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(255, 69, 0));
		panel_4.setBorder(new LineBorder(new Color(222, 184, 135), 4));
		panel_4.setBackground(new Color(255, 250, 205));
		panel_4.setBounds(495, 566, 391, 378);
		frmBurgerHub.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTotalAmount = new JLabel("Total Amount : ");
		lblTotalAmount.setBackground(new Color(70, 130, 180));
		lblTotalAmount.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalAmount.setForeground(new Color(0, 0, 0));
		lblTotalAmount.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 26));
		lblTotalAmount.setBounds(39, 67, 193, 38);
		panel_4.add(lblTotalAmount);
		
		JLabel lblPayment = new JLabel("Payment :");
		lblPayment.setBackground(new Color(70, 130, 180));
		lblPayment.setHorizontalAlignment(SwingConstants.LEFT);
		lblPayment.setForeground(new Color(0, 0, 0));
		lblPayment.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 26));
		lblPayment.setBounds(39, 118, 193, 38);
		panel_4.add(lblPayment);
		
		JLabel lblChange = new JLabel("Change :");
		lblChange.setBackground(new Color(70, 130, 180));
		lblChange.setHorizontalAlignment(SwingConstants.LEFT);
		lblChange.setForeground(new Color(0, 0, 0));
		lblChange.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 26));
		lblChange.setBounds(39, 169, 193, 38);
		panel_4.add(lblChange);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(0, 0, 0));
		textField_3.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(253, 245, 230));
		textField_3.setBounds(244, 81, 85, 20);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(new Color(0, 0, 0));
		textField_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(253, 245, 230));
		textField_4.setBounds(244, 132, 85, 20);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(new Color(0, 0, 0));
		textField_5.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(253, 245, 230));
		textField_5.setBounds(244, 183, 85, 20);
		panel_4.add(textField_5);
		
		
		button_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_1.setBackground(new Color(253, 245, 230));
		
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int a = Integer.parseInt(textField_3.getText());
				int b = Integer.parseInt(textField_4.getText());
				lblBigLord.setVisible(false);
				lblBaconLord.setVisible(false);
				lblGsauce.setVisible(false);
				lblChKingDeluxe.setVisible(false);
				lblTexasDoubleWhooper_1.setVisible(false);
				lblTriple.setVisible(false);
				lblDoubleWhooper_1.setVisible(false);
				lblBaconKing_1.setVisible(false);
				lblImpossibleWhooper_1.setVisible(false);
				lblWhooper_1.setVisible(false);
				
				if (b<a){
					JOptionPane.showMessageDialog(null,  "            Insufficient Payment!    ");
					lblInsufecientPayment.setVisible(true);
					textField_4.setText("");
				}
				else{
					lblInsufecientPayment.setVisible(false);
					int c = b-a;
					textField_5.setText(String.valueOf(c));
					txtrCharlsBurgerHub.append("\n" + "                                                                                            Total Amount : " + " " + textField_3.getText());
					txtrCharlsBurgerHub.append("\n" + "                                                                                            Change : " + " " + c);
				}
				
			}
		});
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		button_1.setBounds(144, 267, 89, 52);
		panel_4.add(button_1);
		
		lblInsufecientPayment.setHorizontalAlignment(SwingConstants.LEFT);
		lblInsufecientPayment.setForeground(new Color(0, 0, 0));
		lblInsufecientPayment.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 26));
		lblInsufecientPayment.setBounds(52, 220, 266, 43);
		panel_4.add(lblInsufecientPayment);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 69, 0));
		panel_5.setBorder(new LineBorder(new Color(222, 184, 135), 4));
		panel_5.setBackground(new Color(255, 250, 205));
		panel_5.setBounds(8, 568, 475, 252);
		frmBurgerHub.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_12.setBounds(91, 12, 245, 35);
		panel_5.add(textField_12);
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		textField_12.setForeground(new Color(0, 0, 0));
		textField_12.setBackground(new Color(253, 245, 230));
		textField_12.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_14.setText("0");
		textField_14.setForeground(new Color(0, 0, 0));
		textField_14.setBounds(191, 176, 55, 20);
		panel_5.add(textField_14);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBackground(new Color(253, 245, 230));
		
		JLabel label_32 = new JLabel("Quantity :");
		label_32.setBackground(new Color(70, 130, 180));
		label_32.setBounds(12, 171, 140, 25);
		panel_5.add(label_32);
		label_32.setForeground(new Color(0, 0, 0));
		label_32.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		
		textField_13 = new JTextField();
		textField_13.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_13.setBounds(91, 106, 106, 35);
		panel_5.add(textField_13);
		textField_13.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textField_13.setForeground(new Color(0, 0, 0));
		textField_13.setBackground(new Color(253, 245, 230));
		textField_13.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.ITALIC, 13));
		comboBox.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBox.setBackground(new Color(255, 250, 240));
		comboBox.setForeground(new Color(0, 0, 0));
		JButton btnNewButton_1 = new JButton("Add Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnFinalizeOrder.setEnabled(true);
			}
		});
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
String a = "Whooper" ;
String m = "Impossible Whooper" ;
String n = "Bacon King" ;
String v = "Double Whooper" ;
String l = "Triple Whooper with Cheese" ;
String x = "Texas Double Whooper" ;
String z = "Ch'King Deluxe Sandwich" ;
String u = "Bacon Cheeseburger" ;
String i = "Big Fish" ;
String o = "Spicy Ch'King Deluxe" ;

				if (textField_12.getText().equals(a)) {
					
					
					int d = Integer.parseInt(textField_6.getText());
					int b = Integer.parseInt(textField_13.getText());
			int w = Integer.parseInt(textField_14.getText());
					int c = w*b;
					int q = d+c;
					textField_6.setText(String.valueOf(q));
					
					
					txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				comboBox.setSelectedItem("Select");
				}
			
if (textField_12.getText().equals(m)) {
					
					
					int d = Integer.parseInt(textField_7.getText());
					int b = Integer.parseInt(textField_13.getText());
			int w = Integer.parseInt(textField_14.getText());
					int c = w*b;
					int q = d+c;
					textField_7.setText(String.valueOf(q));
					
					txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));
					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("");
					comboBox.setSelectedItem("Select");
				}

if (textField_12.getText().equals(n)) {
	
	
	int d = Integer.parseInt(textField_8.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_8.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}

if (textField_12.getText().equals(v)) {
	
	
	int d = Integer.parseInt(textField_9.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_9.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}

if (textField_12.getText().equals(l)) {
	
	
	int d = Integer.parseInt(textField_10.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_10.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
if (textField_12.getText().equals(x)) {
	
	
	int d = Integer.parseInt(textField_11.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_11.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
if (textField_12.getText().equals(z)) {
	
	
	int d = Integer.parseInt(textField_15.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_15.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
if (textField_12.getText().equals(u)) {
	
	
	int d = Integer.parseInt(textField_16.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_16.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
if (textField_12.getText().equals(i)) {
	
	
	int d = Integer.parseInt(textField_17.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_17.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")" +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
if (textField_12.getText().equals(o)) {
	
	
	int d = Integer.parseInt(textField_18.getText());
	int b = Integer.parseInt(textField_13.getText());
int w = Integer.parseInt(textField_14.getText());
	int c = w*b;
	int q = d+c;
	textField_18.setText(String.valueOf(q));
	
	txtrCharlsBurgerHub.append("\n" + (textField_12.getText())+"("+(comboBox.getSelectedItem())+")"  +"                                        "+(textField_13.getText())+".00" +"                                        "+(textField_14.getText()));	
	textField_12.setText("");
	textField_13.setText("");
	textField_14.setText("");
	comboBox.setSelectedItem("Select");
}
			}
		});
		
		
		comboBox.addItemListener(new ItemListener() {
			String a = "Whooper" ;
			String m = "Impossible Whooper" ;
			String n = "Bacon King" ;
			String v = "Double Whooper" ;
			String l = "Triple Whooper with Cheese" ;
			String x = "Texas Double Whooper" ;
			String z = "Ch'King Deluxe Sandwich" ;
			String u = "Bacon Cheeseburger" ;
			String i = "Big Fish" ;
			String o = "Spicy Ch'King Deluxe" ;
			public void itemStateChanged(ItemEvent arg0) {
				if (textField_12.getText().equals(a)) {
				if (comboBox.getSelectedItem() == "S"){
					textField_13.setText("105");	
				}

				else if (comboBox.getSelectedItem() == "M"){
					textField_13.setText("155");	
				}
				else if (comboBox.getSelectedItem() == "L"){
					textField_13.setText("195");	
				}
				else if (comboBox.getSelectedItem() == " "){
					textField_13.setText("");	
				}
				}
				if (textField_12.getText().equals(m)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("125");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("175");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("215");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(n)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("145");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("195");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("235");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(v)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("155");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("205");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("245");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(l)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("105");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("155");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("195");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(x)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("135");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("185");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("225");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				
				if (textField_12.getText().equals(z)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("135");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("185");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("225");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(u)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("165");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("215");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("255");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(i)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("145");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("195");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("235");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
				if (textField_12.getText().equals(o)) {
					if (comboBox.getSelectedItem() == "S"){
						textField_13.setText("245");	
					}

					else if (comboBox.getSelectedItem() == "M"){
						textField_13.setText("295");	
					}
					else if (comboBox.getSelectedItem() == "L"){
						textField_13.setText("335");	
					}
					else if (comboBox.getSelectedItem() == " "){
						textField_13.setText("");	
					}
					}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "S", "M", "L"}));
		comboBox.setBounds(91, 52, 96, 37);
		panel_5.add(comboBox);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(253, 245, 230));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnNewButton_1.setBounds(356, 90, 89, 47);
		panel_5.add(btnNewButton_1);
		
		JLabel lblBunz = new JLabel("Bunz :");
		lblBunz.setBackground(new Color(70, 130, 180));
		lblBunz.setForeground(new Color(0, 0, 0));
		lblBunz.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		lblBunz.setBounds(10, 13, 80, 22);
		panel_5.add(lblBunz);
		
		JLabel lblPrice_1 = new JLabel("Price :");
		lblPrice_1.setBackground(new Color(70, 130, 180));
		lblPrice_1.setForeground(new Color(0, 0, 0));
		lblPrice_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		lblPrice_1.setBounds(10, 115, 103, 22);
		panel_5.add(lblPrice_1);
		
		JLabel lblSize = new JLabel("Size :");
		lblSize.setBackground(new Color(70, 130, 180));
		lblSize.setForeground(new Color(0, 0, 0));
		lblSize.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 25));
		lblSize.setBounds(10, 67, 103, 22);
		panel_5.add(lblSize);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_6.setCaretColor(new Color(70, 130, 180));
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(new Color(70, 130, 180));
		textField_6.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(70, 130, 180));
		textField_6.setBounds(390, 18, 55, 20);
		panel_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_7.setCaretColor(new Color(70, 130, 180));
		textField_7.setText("0");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(new Color(70, 130, 180));
		textField_7.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(70, 130, 180));
		textField_7.setBounds(390, 18, 55, 20);
		panel_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_8.setCaretColor(new Color(70, 130, 180));
		textField_8.setText("0");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(new Color(70, 130, 180));
		textField_8.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(70, 130, 180));
		textField_8.setBounds(390, 18, 55, 20);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_9.setCaretColor(new Color(70, 130, 180));
		textField_9.setText("0");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setForeground(new Color(70, 130, 180));
		textField_9.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(70, 130, 180));
		textField_9.setBounds(390, 18, 55, 20);
		panel_5.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_10.setCaretColor(new Color(70, 130, 180));
		textField_10.setText("0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(new Color(70, 130, 180));
		textField_10.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBackground(new Color(70, 130, 180));
		textField_10.setBounds(12, 176, 55, 20);
		panel_5.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_11.setCaretColor(new Color(70, 130, 180));
		textField_11.setText("0");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(new Color(70, 130, 180));
		textField_11.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBackground(new Color(70, 130, 180));
		textField_11.setBounds(10, 176, 55, 20);
		panel_5.add(textField_11);
		
		textField_15 = new JTextField();
		textField_15.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_15.setCaretColor(new Color(70, 130, 180));
		textField_15.setText("0");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setForeground(new Color(70, 130, 180));
		textField_15.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBackground(new Color(70, 130, 180));
		textField_15.setBounds(10, 176, 55, 20);
		panel_5.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_16.setCaretColor(new Color(70, 130, 180));
		textField_16.setText("0");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setForeground(new Color(70, 130, 180));
		textField_16.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(70, 130, 180));
		textField_16.setBounds(10, 176, 55, 20);
		panel_5.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_17.setCaretColor(new Color(70, 130, 180));
		textField_17.setText("0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setForeground(new Color(70, 130, 180));
		textField_17.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBackground(new Color(70, 130, 180));
		textField_17.setBounds(10, 176, 55, 20);
		panel_5.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_18.setCaretColor(new Color(70, 130, 180));
		textField_18.setText("0");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setForeground(new Color(70, 130, 180));
		textField_18.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBackground(new Color(70, 130, 180));
		textField_18.setBounds(10, 176, 55, 20);
		panel_5.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_19.setCaretColor(new Color(70, 130, 180));
		textField_19.setText("0");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setForeground(new Color(70, 130, 180));
		textField_19.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_19.setColumns(10);
		textField_19.setBackground(new Color(70, 130, 180));
		textField_19.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_20.setCaretColor(new Color(70, 130, 180));
		textField_20.setText("0");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setForeground(new Color(70, 130, 180));
		textField_20.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_20.setColumns(10);
		textField_20.setBackground(new Color(70, 130, 180));
		textField_20.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_21.setCaretColor(new Color(70, 130, 180));
		textField_21.setText("0");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setForeground(new Color(70, 130, 180));
		textField_21.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_21.setColumns(10);
		textField_21.setBackground(new Color(70, 130, 180));
		textField_21.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_22.setCaretColor(new Color(70, 130, 180));
		textField_22.setText("0");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setForeground(new Color(70, 130, 180));
		textField_22.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_22.setColumns(10);
		textField_22.setBackground(new Color(70, 130, 180));
		textField_22.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_23.setCaretColor(new Color(70, 130, 180));
		textField_23.setText("0");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setForeground(new Color(70, 130, 180));
		textField_23.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_23.setColumns(10);
		textField_23.setBackground(new Color(70, 130, 180));
		textField_23.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_24.setCaretColor(new Color(70, 130, 180));
		textField_24.setText("0");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setForeground(new Color(70, 130, 180));
		textField_24.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_24.setColumns(10);
		textField_24.setBackground(new Color(70, 130, 180));
		textField_24.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_25.setCaretColor(new Color(70, 130, 180));
		textField_25.setText("0");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setForeground(new Color(70, 130, 180));
		textField_25.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_25.setColumns(10);
		textField_25.setBackground(new Color(70, 130, 180));
		textField_25.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_26.setCaretColor(new Color(70, 130, 180));
		textField_26.setText("0");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setForeground(new Color(70, 130, 180));
		textField_26.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_26.setColumns(10);
		textField_26.setBackground(new Color(70, 130, 180));
		textField_26.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_27.setCaretColor(new Color(70, 130, 180));
		textField_27.setText("0");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setForeground(new Color(70, 130, 180));
		textField_27.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_27.setColumns(10);
		textField_27.setBackground(new Color(70, 130, 180));
		textField_27.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_28.setCaretColor(new Color(70, 130, 180));
		textField_28.setText("0");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setForeground(new Color(70, 130, 180));
		textField_28.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_28.setColumns(10);
		textField_28.setBackground(new Color(70, 130, 180));
		textField_28.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_29.setCaretColor(new Color(70, 130, 180));
		textField_29.setText("0");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setForeground(new Color(70, 130, 180));
		textField_29.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_29.setColumns(10);
		textField_29.setBackground(new Color(70, 130, 180));
		textField_29.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_30.setCaretColor(new Color(70, 130, 180));
		textField_30.setText("0");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setForeground(new Color(70, 130, 180));
		textField_30.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_30.setColumns(10);
		textField_30.setBackground(new Color(70, 130, 180));
		textField_30.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_31.setCaretColor(new Color(70, 130, 180));
		textField_31.setText("0");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setForeground(new Color(70, 130, 180));
		textField_31.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_31.setColumns(10);
		textField_31.setBackground(new Color(70, 130, 180));
		textField_31.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_32.setCaretColor(new Color(70, 130, 180));
		textField_32.setText("0");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setForeground(new Color(70, 130, 180));
		textField_32.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_32.setColumns(10);
		textField_32.setBackground(new Color(70, 130, 180));
		textField_32.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_33.setCaretColor(new Color(70, 130, 180));
		textField_33.setText("0");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setForeground(new Color(70, 130, 180));
		textField_33.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_33.setColumns(10);
		textField_33.setBackground(new Color(70, 130, 180));
		textField_33.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_34.setCaretColor(new Color(70, 130, 180));
		textField_34.setText("0");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setForeground(new Color(70, 130, 180));
		textField_34.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_34.setColumns(10);
		textField_34.setBackground(new Color(70, 130, 180));
		textField_34.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_35.setCaretColor(new Color(70, 130, 180));
		textField_35.setText("0");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setForeground(new Color(70, 130, 180));
		textField_35.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_35.setColumns(10);
		textField_35.setBackground(new Color(70, 130, 180));
		textField_35.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_36.setCaretColor(new Color(70, 130, 180));
		textField_36.setText("0");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setForeground(new Color(70, 130, 180));
		textField_36.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_36.setColumns(10);
		textField_36.setBackground(new Color(70, 130, 180));
		textField_36.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_37.setCaretColor(new Color(70, 130, 180));
		textField_37.setText("0");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setForeground(new Color(70, 130, 180));
		textField_37.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		textField_37.setColumns(10);
		textField_37.setBackground(new Color(70, 130, 180));
		textField_37.setBounds(10, 4, 55, 20);
		frmBurgerHub.getContentPane().add(textField_37);
			
			JPanel panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.setForeground(new Color(255, 69, 0));
			panel_6.setBorder(new LineBorder(new Color(222, 184, 135), 4));
			panel_6.setBackground(new Color(255, 250, 205));
			panel_6.setBounds(10, 831, 473, 115);
			frmBurgerHub.getContentPane().add(panel_6);
			
			JButton btnClear = new JButton("Clear");
			btnClear.setBounds(84, 30, 110, 52);
			panel_6.add(btnClear);
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnClear.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			btnClear.setBackground(new Color(253, 245, 230));
			btnClear.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					txtrCharlsBurgerHub.setText(" = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =\r\n                                                        Charls Burger Hub\r\n                                                Malinis, Lemery, Batangas\r\n                                         Tel No. : 403 - 21483 | 403 - 21560\r\n = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = "+"\n" + "Order :" +"                                        " + "Price :"+ "                                        " + "Quantity :"  );
					textField.setText("0");

					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("0");
					textField_6.setText("0");
					textField_7.setText("0");
					textField_8.setText("0");
					textField_9.setText("0");
					textField_10.setText("0");
					textField_11.setText("0");
					textField_15.setText("0");
					textField_16.setText("0");
					textField_17.setText("0");
					textField_18.setText("0");
					textField_19.setText("0");
					textField_20.setText("0");
					textField_21.setText("0");
					textField_22.setText("0");
					textField_23.setText("0");
					textField_24.setText("0");
					textField_25.setText("0");
					textField_26.setText("0");
					textField_27.setText("0");
					textField_28.setText("0");
					textField_29.setText("0");
					textField_30.setText("0");
					textField_31.setText("0");
					textField_1.setText("0");
					textField_2.setText("0");
					textField_3.setText("0");
					textField_4.setText("0");
					textField_5.setText("0");
					
				
				}
			});
			
				btnClear.setForeground(new Color(0, 0, 0));
				btnClear.setFont(new Font("Century Gothic", Font.BOLD, 12));
				
				JButton btnLogOut = new JButton("Log Out");
				btnLogOut.setBounds(298, 30, 110, 52);
				panel_6.add(btnLogOut);
				btnLogOut.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnLogOut.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
				btnLogOut.setBackground(new Color(253, 245, 230));
				btnLogOut.setForeground(new Color(0, 0, 0));
				btnLogOut.setFont(new Font("Century Gothic", Font.BOLD, 12));
				
				JPanel panel_8 = new JPanel();
				panel_8.setBounds(10, 4, 1577, 101);
				frmBurgerHub.getContentPane().add(panel_8);
				panel_8.setLayout(null);
				panel_8.setForeground(new Color(255, 69, 0));
				panel_8.setBorder(new LineBorder(new Color(222, 184, 135), 6));
				panel_8.setBackground(new Color(255, 250, 205));
				
				JLabel label_33 = new JLabel("");
				label_33.setIcon(new ImageIcon("C:\\Users\\Dennis\\Pictures\\burgerss\\bg (2).png"));
				label_33.setBounds(0, 0, 1577, 101);
				panel_8.add(label_33);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
		
	}
}

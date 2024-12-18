package um.tds.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel norte = new JPanel();
		contentPane.add(norte, BorderLayout.NORTH);
		
		JLabel titulo = new JLabel("AppChat");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		norte.add(titulo);
		
		JPanel sur = new JPanel();
		contentPane.add(sur, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		sur.add(panel_2);
		
		JButton btnNewButton = new JButton("Registrar");
		panel_2.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setHgap(40);
		sur.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		sur.add(panel_3);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Aceptar");
		panel_3.add(btnNewButton_2);
		
		JPanel centro = new JPanel();
		centro.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		contentPane.add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Telefono:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		centro.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		centro.add(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.LEFT, 5, 40);
		panel.setLayout(fl_panel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(textField);
		textField.setColumns(15);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		centro.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		centro.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 40));
		
		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		panel_1.add(passwordField);
	}

}

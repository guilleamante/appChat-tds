package um.tds.vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class register extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			register dialog = new register();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public register() {
		setTitle("Registro");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{497, 0};
		gbl_contentPanel.rowHeights = new int[]{40, 40, 40, 40, 158, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			contentPanel.add(panel, gbc_panel);
			{
				JLabel lblNewLabel = new JLabel("  Nombre:     ");
				panel.add(lblNewLabel);
			}
			{
				textField_2 = new JTextField();
				panel.add(textField_2);
				textField_2.setColumns(30);
			}
		}
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			contentPanel.add(panel, gbc_panel);
			{
				JLabel lblNewLabel_1 = new JLabel("  Apellidos:    ");
				panel.add(lblNewLabel_1);
			}
			{
				textField = new JTextField();
				panel.add(textField);
				textField.setColumns(30);
			}
		}
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 2;
			contentPanel.add(panel, gbc_panel);
			{
				JLabel lblNewLabel_2 = new JLabel("  Teléfono:    ");
				panel.add(lblNewLabel_2);
			}
			{
				textField_1 = new JTextField();
				textField_1.setLocation(new Point(5, 0));
				panel.add(textField_1);
				textField_1.setColumns(20);
			}
		}
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.insets = new Insets(0, 0, 5, 0);
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 3;
			contentPanel.add(panel, gbc_panel);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblNewLabel_3 = new JLabel("Contraseña:");
					panel_1.add(lblNewLabel_3);
				}
				{
					passwordField = new JPasswordField();
					passwordField.setColumns(20);
					panel_1.add(passwordField);
				}
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1);
				{
					JLabel lblNewLabel_4 = new JLabel("Contraseña:");
					panel_1.add(lblNewLabel_4);
				}
				{
					passwordField_1 = new JPasswordField();
					passwordField_1.setColumns(20);
					panel_1.add(passwordField_1);
				}
			}
		}
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 4;
		contentPanel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{248, 248, 0};
		gbl_panel_2.rowHeights = new int[]{40, 147, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			panel_2.add(panel, gbc_panel);
			{
				JLabel lblNewLabel_6 = new JLabel("  Fecha:         ");
				panel.add(lblNewLabel_6);
			}
			{
				JDateChooser dateChooser = new JDateChooser();
				panel.add(dateChooser);
				dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 10));
				dateChooser.setDateFormatString("dd/MM/yyyy");
				
			}
		}
		{
			JLabel lblNewLabel_7 = new JLabel("   Imagen:");
			GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
			gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
			gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabel_7.gridx = 1;
			gbc_lblNewLabel_7.gridy = 0;
			panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);
		}
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 1;
			panel_2.add(panel, gbc_panel);
			{
				JLabel lblNewLabel_5 = new JLabel("  Saludo:        ");
				lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
				panel.add(lblNewLabel_5);
			}
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane);
				{
					JTextArea textArea = new JTextArea();
					scrollPane.setViewportView(textArea);
					textArea.setWrapStyleWord(true);
					textArea.setLineWrap(true);
					textArea.setColumns(20);
					textArea.setRows(7);
				}
			}
		}
		JPanel panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(90, 90));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panel_2.add(panel_1, gbc_panel_1);
		JLabel lblNewLabel_7 = new JLabel();
		lblNewLabel_7.setSize(new Dimension(90, 90));
		panel_1.add(lblNewLabel_7);
		try {
			
		    String path = "https://mibuenosairesquerido.com/wp-content/uploads/2017/06/messi_png-e1498205532947.png";
		    URL url = new URL(path);
		    BufferedImage image = ImageIO.read(url);
		    Image resizedImage = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		    lblNewLabel_7.setIcon(new ImageIcon(resizedImage));
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		{
			JPanel buttonPane = new JPanel();
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.CENTER);
			fl_buttonPane.setHgap(20);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}

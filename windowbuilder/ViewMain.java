package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMain extends JFrame {

	private JPanel contentPane;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMain frame = new ViewMain();
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
	public ViewMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrypt = new JButton("Criptografar");
		btnCrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passToCrypt = txtSenha.getText();
				int passSize = passToCrypt.length();
				System.out.print(passSize-1);
				//String[] letras = txttocrypt.split("", 9);
				
			}
		});
		btnCrypt.setBounds(107, 145, 108, 23);
		contentPane.add(btnCrypt);
		
		JButton btnDecrypt = new JButton("Descriptografar");
		btnDecrypt.setBounds(225, 145, 108, 23);
		contentPane.add(btnDecrypt);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(81, 48, 277, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(81, 31, 46, 14);
		contentPane.add(lblNewLabel);
	}
}

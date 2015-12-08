import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.*;
import java.net.*;
import java.util.*;

/*
 * Zappos: Is That Price right! is a simple game app that lets a user look at the image of the Zappos object and select information such as the items name, 
 * brand, and a fake or real price. The user must then decide if the price shown is indeed that objects price or not. 
 */ 



public class NameThatBrand extends JFrame {

	private JPanel contentPane;
// constants used for searching with the Zappos API
	private static final String PRODUCT_SEARCH = "http://api.zappos.com/Product?id=";
	private static final String SEARCH = "http://api.zappos.com/Search/term/";
	private static final String LIMIT = "?limit=1";
 
	// add Zappos API Key here to use this app
	private static final String API_KEY = "c6fa8146d5198a0dd55e1d104607482ae2b710c1";
	    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameThatBrand frame = new NameThatBrand();
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
	public NameThatBrand() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 556);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Lower");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Correct Price");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Higher");
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblZapposIsThat = new JLabel("Zappos: Is that Price Right!");
		panel_1.add(lblZapposIsThat);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Image");
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.WEST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{71, 0};
		gbl_panel_3.rowHeights = new int[]{65, 65, 65, 65, 65, 65, 65, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Information:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_3.add(label, gbc_label);
		
		JLabel lblProductName = new JLabel("Product Name:");
		GridBagConstraints gbc_lblProductName = new GridBagConstraints();
		gbc_lblProductName.fill = GridBagConstraints.BOTH;
		gbc_lblProductName.insets = new Insets(0, 0, 5, 0);
		gbc_lblProductName.gridx = 0;
		gbc_lblProductName.gridy = 2;
		panel_3.add(lblProductName, gbc_lblProductName);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 3;
		panel_3.add(label_1, gbc_label_1);
		
		JLabel lblBrandName = new JLabel("Brand Name:");
		GridBagConstraints gbc_lblBrandName = new GridBagConstraints();
		gbc_lblBrandName.fill = GridBagConstraints.BOTH;
		gbc_lblBrandName.insets = new Insets(0, 0, 5, 0);
		gbc_lblBrandName.gridx = 0;
		gbc_lblBrandName.gridy = 4;
		panel_3.add(lblBrandName, gbc_lblBrandName);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 5;
		panel_3.add(label_2, gbc_label_2);
		
		JLabel lblProducePrice = new JLabel("Produce Price:");
		GridBagConstraints gbc_lblProducePrice = new GridBagConstraints();
		gbc_lblProducePrice.fill = GridBagConstraints.BOTH;
		gbc_lblProducePrice.gridx = 0;
		gbc_lblProducePrice.gridy = 6;
		panel_3.add(lblProducePrice, gbc_lblProducePrice);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
		
		JLabel lblScore = new JLabel("Score");
		panel_4.add(lblScore);
	}
	// method used to make all URL requests returns the JSON string to the caller in order for it to be interpreted there
	private static String httpGet(String urlStr) throws IOException {
		URL url = new URL(urlStr);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		if (connection.getResponseCode() != 200) {
			throw new IOException(connection.getResponseMessage());
		}
		// Buffer the result into a string
		BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuilder responseString = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) 
			responseString.append(line);
		rd.close();
			connection.disconnect();
		return responseString.toString();
	}


}

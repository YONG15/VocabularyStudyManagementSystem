package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class VocabularyAdder extends JPanel {
	
	WindowFrame frame;
	
	public VocabularyAdder(WindowFrame frame) {
		this.frame = frame;
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelVoca = new JLabel("Vocabulary:", JLabel.TRAILING);
		JTextField fieldVoca = new JTextField(10);
		labelVoca.setLabelFor(fieldVoca);
		panel.add(labelVoca);
		panel.add(fieldVoca);

		JLabel labelMeaning = new JLabel("Meaning of the vocabulary:", JLabel.TRAILING);
		JTextField fieldMeaning = new JTextField(10);
		labelMeaning.setLabelFor(fieldMeaning);
		panel.add(labelMeaning);
		panel.add(fieldMeaning);

		JLabel labelExample = new JLabel("Example sentence:", JLabel.TRAILING);
		JTextField fieldExample = new JTextField(10);
		labelExample.setLabelFor(fieldExample);
		panel.add(labelExample);
		panel.add(fieldExample);

		JLabel labelMeaningES = new JLabel("Meaning of the example sentence:", JLabel.TRAILING);
		JTextField fieldMeaningES = new JTextField(10);
		labelMeaningES.setLabelFor(fieldMeaningES);
		panel.add(labelMeaningES);
		panel.add(fieldMeaningES);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);

		

		this.add(panel);
		this.setVisible(true);


	}

}

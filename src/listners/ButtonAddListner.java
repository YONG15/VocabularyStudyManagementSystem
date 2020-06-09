package listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.VocabularyAdder;
import gui.VocabularyViewer;
import gui.WindowFrame;

public class ButtonAddListner implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListner(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		VocabularyAdder adder = frame.getVocabularyadder();
		frame.setupPanel(adder);

	}

}

package listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import gui.VocabularyAdder;
import gui.WindowFrame;

public class ButtonAddListner implements ActionListener {

	WindowFrame frame;

	public ButtonAddListner(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VocabularyAdder adder = frame.getVocabularyadder();
		frame.setupPanel(adder);

	}

}

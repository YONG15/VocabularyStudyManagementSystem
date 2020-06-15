package listners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.VocabularyViewer;
import gui.WindowFrame;

public class ButtonViewListner implements ActionListener {

	WindowFrame frame;

	public ButtonViewListner(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		VocabularyViewer viewer = frame.getVocabularyviewer();
		frame.setupPanel(viewer);

	}

}

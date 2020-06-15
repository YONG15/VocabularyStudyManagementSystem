package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.VocabularyManager;

public class WindowFrame extends JFrame{

	VocabularyManager vocabularyManager;

	MenuSelection menuselection;
	VocabularyAdder vocabularyadder;
	VocabularyViewer vocabularyviewer;


	public WindowFrame(VocabularyManager vocabularyManager) {
		this.vocabularyManager = vocabularyManager;
		menuselection = new MenuSelection(this);
		vocabularyadder = new VocabularyAdder(this);
		vocabularyviewer = new VocabularyViewer(this, this.vocabularyManager);


		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public VocabularyAdder getVocabularyadder() {
		return vocabularyadder;
	}

	public void setVocabularyadder(VocabularyAdder vocabularyadder) {
		this.vocabularyadder = vocabularyadder;
	}

	public VocabularyViewer getVocabularyviewer() {
		return vocabularyviewer;
	}

	public void setVocabularyviewer(VocabularyViewer vocabularyviewer) {
		this.vocabularyviewer = vocabularyviewer;
	}


}

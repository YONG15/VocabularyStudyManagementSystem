package gui;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VocabularyViewer extends JPanel {
	
	WindowFrame frame;

	public VocabularyViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Vocabulary");
		model.addColumn("Meaning of the vocabulary");
		model.addColumn("Example sentence");
		model.addColumn("Meaning of the example sentence");

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

}

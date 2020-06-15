package gui;




import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.VocabularyManager;
import vocabulary.VocabularyInput;

public class VocabularyViewer extends JPanel {

	WindowFrame frame;
	VocabularyManager vocabularyManager;

	public VocabularyViewer(WindowFrame frame, VocabularyManager vocabularyManager) {
		this.frame = frame;
		this.vocabularyManager = vocabularyManager;

		System.out.println("***" + vocabularyManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Vocabulary");
		model.addColumn("Meaning of the vocabulary");
		model.addColumn("Example sentence");
		model.addColumn("Meaning of the example sentence");

		for(int i=0; i<vocabularyManager.size(); i++) {
			Vector row = new Vector();
			VocabularyInput si = vocabularyManager.get(i);
			row.add(si.getVoca());
			row.add(si.getMeaning());
			row.add(si.getExample());
			row.add(si.getMeaningOfTheExample());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

}

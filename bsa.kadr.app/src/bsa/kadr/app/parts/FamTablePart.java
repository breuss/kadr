 
package bsa.kadr.app.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

public class FamTablePart {
	private Table famTable;
	@Inject
	public FamTablePart() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void initFamTable(Composite parent) {
		
		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		famTable = tableViewer.getTable();
		
	}
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
	
}
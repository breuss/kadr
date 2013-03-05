 
package bsa.kadr.app.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridLayout;

public class SearchPart {
	private Text text;
	private Text text_1;
	@Inject
	public SearchPart() {
		//TODO Your code here
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new RowLayout(SWT.HORIZONTAL));
		//parent.setSize(409,36);
		
		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("Искать:");
		
		Label lblNewLabel_1 = new Label(parent, SWT.NONE);
		lblNewLabel_1.setText("фамилия");
		
		text = new Text(parent, SWT.BORDER);
		text.setText("фамилия");
		
		Label lblNewLabel_2 = new Label(parent, SWT.NONE);
		lblNewLabel_2.setText("дата рождения");
		
		text_1 = new Text(parent, SWT.BORDER);
		text_1.setText("01/01/1988");
		//TODO Your code here
	}
	
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
	
}
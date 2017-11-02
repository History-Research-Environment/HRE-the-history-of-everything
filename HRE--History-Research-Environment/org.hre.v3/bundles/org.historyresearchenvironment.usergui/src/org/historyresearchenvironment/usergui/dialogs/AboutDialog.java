package org.historyresearchenvironment.usergui.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

public class AboutDialog extends Dialog {

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public AboutDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("About HRE");
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		CLabel lblNewLabel = new CLabel(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 4));
		lblNewLabel.setImage(
				ResourceManager.getPluginImage("org.historyresearchenvironment.usergui", "icons/HRE-144.png"));
		lblNewLabel.setText("");

		Label lblHistoryResearch = new Label(container, SWT.NONE);
		lblHistoryResearch.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblHistoryResearch.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.BOLD));
		lblHistoryResearch.setText("History Research");

		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.BOLD));
		lblNewLabel_1.setText("Environment");

		Label lblBuild = new Label(container, SWT.NONE);
		lblBuild.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblBuild.setText("Build 0.00.0003");
		lblBuild.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.BOLD));

		Label label = new Label(container, SWT.NONE);
		label.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false, 1, 1));
		label.setText("2017");
		label.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.BOLD));
		
		Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		lblNewLabel_2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_2.setText("HRE code is copyright to HRE Pty Ltd, as released");
		
		Label lblUnderGnuAffero = new Label(container, SWT.NONE);
		lblUnderGnuAffero.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblUnderGnuAffero.setText("under GNU Affero General Public Licence ");
		lblUnderGnuAffero.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label label_1 = new Label(container, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		new Label(container, SWT.NONE);
		
		Label lblIconsUsedFrom = new Label(container, SWT.NONE);
		lblIconsUsedFrom.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblIconsUsedFrom.setText("Icons used from http://www.defaulticon.com       ");
		lblIconsUsedFrom.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblCopyrightInteractivemania = new Label(container, SWT.NONE);
		lblCopyrightInteractivemania.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblCopyrightInteractivemania.setText("\u00A9 copyright interactivemania 2010-2011,   ");
		lblCopyrightInteractivemania.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblAsReleasedUnder = new Label(container, SWT.NONE);
		lblAsReleasedUnder.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblAsReleasedUnder.setText("as released under CC BY ND 3.0  ");
		lblAsReleasedUnder.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label label_3 = new Label(container, SWT.NONE);
		label_3.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		new Label(container, SWT.NONE);
		
		Label lblPreferenceCodeUsed = new Label(container, SWT.NONE);
		lblPreferenceCodeUsed.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblPreferenceCodeUsed.setText("Preference code used from");
		lblPreferenceCodeUsed.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblHttpsgithubcomopcoachepreferences = new Label(container, SWT.NONE);
		lblHttpsgithubcomopcoachepreferences.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblHttpsgithubcomopcoachepreferences.setText("https://github.com/opcoach/e4Preferences");
		lblHttpsgithubcomopcoachepreferences.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblWhichIsLicensed = new Label(container, SWT.NONE);
		lblWhichIsLicensed.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblWhichIsLicensed.setText("which is licensed under the Eclipse Public License 1.0");
		lblWhichIsLicensed.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblNewLabel_3 = new Label(container, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		
		Label lblIfYouWish = new Label(container, SWT.NONE);
		lblIfYouWish.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblIfYouWish.setText("If you wish to donate to continued development ");
		lblIfYouWish.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblOfHrePlease = new Label(container, SWT.NONE);
		lblOfHrePlease.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblOfHrePlease.setText("of HRE, please go to our website at");
		lblOfHrePlease.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));
		
		Label lblWwwhistoryresearchenvironmentorgdonate = new Label(container, SWT.NONE);
		lblWwwhistoryresearchenvironmentorgdonate.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblWwwhistoryresearchenvironmentorgdonate.setText("www.historyresearchenvironment.org/Donate/");
		lblWwwhistoryresearchenvironmentorgdonate.setFont(SWTResourceManager.getFont("Calibri", 12, SWT.NORMAL));

		
		return container;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(363, 578);
	}
}

package com.morcinek.android.codegenerator.plugin.layouts.activity.page;

import com.morcinek.android.codegenerator.plugin.Activator;
import org.eclipse.cldt.managedbuilder.ui.properties.MultiLineTextFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


/**
 * Copyright 2014 Tomasz Morcinek. All rights reserved.
 */
public class ActivityTemplatePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    public ActivityTemplatePage() {
        super(GRID);
    }

    @Override
    public void init(IWorkbench iWorkbench) {
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
        setDescription("Setup Template for Activity code generation:");
    }

    @Override
    public void createFieldEditors() {
        addField(new MultiLineTextFieldEditor(Activator.ACTIVITY_TEMPLATE_PREFERENCE, "", getFieldEditorParent()));
    }
}
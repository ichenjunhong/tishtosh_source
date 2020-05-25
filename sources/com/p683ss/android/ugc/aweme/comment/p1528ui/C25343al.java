package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.text.Editable;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.al */
final /* synthetic */ class C25343al implements Runnable {

    /* renamed from: a */
    private final KeyboardDialogFragment f67017a;

    C25343al(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67017a = keyboardDialogFragment;
    }

    public final void run() {
        KeyboardDialogFragment keyboardDialogFragment = this.f67017a;
        keyboardDialogFragment.f66982r = true;
        int selectionStart = keyboardDialogFragment.mEditText.getSelectionStart();
        Editable text = keyboardDialogFragment.mEditText.getText();
        if (text != null) {
            text.insert(selectionStart, "@");
        }
    }
}

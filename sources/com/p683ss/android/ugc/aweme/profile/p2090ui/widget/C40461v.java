package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.inputmethod.InputMethodManager;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.v */
final /* synthetic */ class C40461v implements C0011g {

    /* renamed from: a */
    private final C40454p f103299a;

    C40461v(C40454p pVar) {
        this.f103299a = pVar;
    }

    public final Object then(C0013i iVar) {
        C40454p pVar = this.f103299a;
        if (pVar.f103281b != null) {
            pVar.f103281b.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) pVar.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(pVar.f103281b, 1);
            }
        }
        return null;
    }
}

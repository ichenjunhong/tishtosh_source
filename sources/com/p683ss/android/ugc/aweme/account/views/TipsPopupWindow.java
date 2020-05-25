package com.p683ss.android.ugc.aweme.account.views;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.account.views.TipsPopupWindow */
public final class TipsPopupWindow extends PopupWindow implements C0183j {
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        dismiss();
    }

    public final void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }
}

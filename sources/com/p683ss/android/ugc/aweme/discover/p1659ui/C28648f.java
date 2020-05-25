package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.discover.p1659ui.SearchIntermediateView.C28451b;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.f */
final /* synthetic */ class C28648f implements C28451b {

    /* renamed from: a */
    private final C28527b f75212a;

    C28648f(C28527b bVar) {
        this.f75212a = bVar;
    }

    /* renamed from: a */
    public final void mo58109a(MotionEvent motionEvent) {
        C28527b bVar = this.f75212a;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && bVar.f74978o != null && bVar.f74978o.canDismissKeyboardOnActionDown()) {
            KeyboardUtils.m58184c(bVar.f74969b);
            bVar.f74969b.setCursorVisible(false);
        }
    }
}

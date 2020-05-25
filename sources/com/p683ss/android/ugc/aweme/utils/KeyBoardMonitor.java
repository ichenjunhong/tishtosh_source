package com.p683ss.android.ugc.aweme.utils;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor */
public class KeyBoardMonitor implements C0183j, OnGlobalLayoutListener {

    /* renamed from: a */
    public View f120118a;

    /* renamed from: b */
    public C47648a f120119b;

    /* renamed from: com.ss.android.ugc.aweme.utils.KeyBoardMonitor$a */
    public interface C47648a {
        /* renamed from: a */
        void mo91495a();

        /* renamed from: b */
        void mo91496b();
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f120118a != null) {
            this.f120118a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        this.f120118a.getWindowVisibleDisplayFrame(rect);
        if (((float) (this.f120118a.getBottom() - rect.bottom)) > this.f120118a.getResources().getDisplayMetrics().density * 100.0f) {
            this.f120119b.mo91495a();
        } else {
            this.f120119b.mo91496b();
        }
    }

    public KeyBoardMonitor(C0184k kVar) {
        if (kVar != null) {
            kVar.getLifecycle().mo324a(this);
        }
    }
}

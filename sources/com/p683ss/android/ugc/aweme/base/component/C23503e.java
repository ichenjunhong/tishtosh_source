package com.p683ss.android.ugc.aweme.base.component;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.ss.android.ugc.aweme.base.component.e */
final /* synthetic */ class C23503e implements OnDismissListener {

    /* renamed from: a */
    private final Runnable f62596a;

    C23503e(Runnable runnable) {
        this.f62596a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f62596a.run();
    }
}

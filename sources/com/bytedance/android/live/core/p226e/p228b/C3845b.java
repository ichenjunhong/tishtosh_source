package com.bytedance.android.live.core.p226e.p228b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.live.core.e.b.b */
final /* synthetic */ class C3845b implements OnDismissListener {

    /* renamed from: a */
    private final Runnable f10826a;

    C3845b(Runnable runnable) {
        this.f10826a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f10826a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: com.bytedance.android.live.core.widget.b */
final /* synthetic */ class C4105b implements OnKeyListener {

    /* renamed from: a */
    private final C4104a f11298a;

    C4105b(C4104a aVar) {
        this.f11298a = aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C4104a aVar = this.f11298a;
        if (4 == i) {
            keyEvent.getAction();
        }
        return false;
    }
}

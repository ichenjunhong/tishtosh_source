package com.bytedance.android.livesdk.p416t;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

/* renamed from: com.bytedance.android.livesdk.t.i */
final /* synthetic */ class C8310i implements OnKeyListener {

    /* renamed from: a */
    static final OnKeyListener f22653a = new C8310i();

    private C8310i() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            dialogInterface.cancel();
        }
        return true;
    }
}

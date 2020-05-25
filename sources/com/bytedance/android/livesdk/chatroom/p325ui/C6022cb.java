package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cb */
final /* synthetic */ class C6022cb implements OnKeyListener {

    /* renamed from: a */
    private final C6013bz f15986a;

    C6022cb(C6013bz bzVar) {
        this.f15986a = bzVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C6013bz bzVar = this.f15986a;
        if (66 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        bzVar.f15952d.performClick();
        return true;
    }
}

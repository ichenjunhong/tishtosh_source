package com.bytedance.android.live.core.setting;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: com.bytedance.android.live.core.setting.m */
final /* synthetic */ class C4094m implements OnEditorActionListener {

    /* renamed from: a */
    private final C4090k f11261a;

    C4094m(C4090k kVar) {
        this.f11261a = kVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C4090k kVar = this.f11261a;
        if (keyEvent == null || keyEvent.getKeyCode() != 66) {
            return false;
        }
        kVar.mo9425a();
        return true;
    }
}

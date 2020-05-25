package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.er */
final /* synthetic */ class C6159er implements OnClickListener {

    /* renamed from: a */
    private final C6156eq f16530a;

    /* renamed from: b */
    private final View f16531b;

    /* renamed from: c */
    private final View f16532c;

    C6159er(C6156eq eqVar, View view, View view2) {
        this.f16530a = eqVar;
        this.f16531b = view;
        this.f16532c = view2;
    }

    public final void onClick(View view) {
        C6156eq eqVar = this.f16530a;
        View view2 = this.f16531b;
        View view3 = this.f16532c;
        eqVar.f16512S.setVisibility(8);
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (view3 != null) {
            view3.setVisibility(8);
        }
        eqVar.f16512S.setClickable(false);
    }
}

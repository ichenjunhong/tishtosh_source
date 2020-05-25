package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8068g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ev */
final /* synthetic */ class C6571ev implements OnClickListener {

    /* renamed from: a */
    private final TextMessageWidget f17905a;

    C6571ev(TextMessageWidget textMessageWidget) {
        this.f17905a = textMessageWidget;
    }

    public final void onClick(View view) {
        TextMessageWidget textMessageWidget = this.f17905a;
        if (textMessageWidget.isViewValid()) {
            C8068g.m16014a(textMessageWidget.context);
            textMessageWidget.mo12533a(C6406a.NORMAL);
        }
    }
}

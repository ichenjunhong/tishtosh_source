package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eu */
final /* synthetic */ class C6570eu implements OnTouchListener {

    /* renamed from: a */
    private final TextMessageWidget f17904a;

    C6570eu(TextMessageWidget textMessageWidget) {
        this.f17904a = textMessageWidget;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextMessageWidget textMessageWidget = this.f17904a;
        if (motionEvent.getAction() == 1) {
            if (!textMessageWidget.f17562a.canScrollVertically(1)) {
                textMessageWidget.mo12533a(C6406a.NORMAL);
            } else {
                textMessageWidget.mo12533a(C6406a.FOCUS);
                int l = textMessageWidget.f17563b.mo4751l();
                if (l > textMessageWidget.f17566e) {
                    textMessageWidget.mo12534b(textMessageWidget.f17565d - (l - textMessageWidget.f17566e));
                    textMessageWidget.f17566e = l;
                }
            }
        }
        return false;
    }
}

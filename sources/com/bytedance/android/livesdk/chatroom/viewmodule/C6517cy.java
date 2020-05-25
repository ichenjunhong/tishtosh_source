package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import com.bytedance.android.livesdk.widget.PKProgressBar;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cy */
final /* synthetic */ class C6517cy implements C5042b {

    /* renamed from: a */
    static final C5042b f17829a = new C6517cy();

    private C6517cy() {
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        PKProgressBar pKProgressBar = (PKProgressBar) view;
        Integer num = (Integer) obj;
        if (pKProgressBar.getRightValue() != num.intValue()) {
            pKProgressBar.setRightValue(num.intValue());
        }
    }
}

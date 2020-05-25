package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import com.bytedance.android.livesdk.widget.PKProgressBar;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cv */
final /* synthetic */ class C6514cv implements C5042b {

    /* renamed from: a */
    static final C5042b f17826a = new C6514cv();

    private C6514cv() {
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        PKProgressBar pKProgressBar = (PKProgressBar) view;
        Integer num = (Integer) obj;
        if (pKProgressBar.getLeftValue() != num.intValue()) {
            pKProgressBar.setLeftValue(num.intValue());
        }
    }
}

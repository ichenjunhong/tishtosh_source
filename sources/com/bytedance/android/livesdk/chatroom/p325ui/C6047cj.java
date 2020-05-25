package com.bytedance.android.livesdk.chatroom.p325ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.utils.C47905fy;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cj */
final class C6047cj {
    /* renamed from: a */
    static void m13210a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(toast);
        }
        toast.show();
    }
}

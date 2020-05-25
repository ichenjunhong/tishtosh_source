package com.bytedance.android.livesdk.chatroom.widget;

import android.widget.TextView;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.d */
public final /* synthetic */ class C6672d implements Runnable {

    /* renamed from: a */
    private final DebugInfoView f18217a;

    /* renamed from: b */
    private final float f18218b;

    public C6672d(DebugInfoView debugInfoView, float f) {
        this.f18217a = debugInfoView;
        this.f18218b = f;
    }

    public final void run() {
        DebugInfoView debugInfoView = this.f18217a;
        float f = this.f18218b;
        TextView textView = debugInfoView.f17999e;
        StringBuilder sb = new StringBuilder();
        sb.append((int) f);
        sb.append("kbps");
        C9432q.m18682a(textView, (CharSequence) sb.toString());
    }
}

package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3890e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.e */
final /* synthetic */ class C3770e implements C1710e {

    /* renamed from: a */
    private final C3764d f10656a;

    C3770e(C3764d dVar) {
        this.f10656a = dVar;
    }

    public final void accept(Object obj) {
        C3764d dVar = this.f10656a;
        Long l = (Long) obj;
        if (C3764d.f10633f >= 0) {
            TextView textView = dVar.f10635b;
            int i = C3764d.f10633f;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(C3890e.m9835c((long) i));
            stringBuffer.append("在线");
            textView.setText(stringBuffer.toString());
        }
        if (dVar.f10634a.getVisibility() == 0) {
            dVar.mo9139b();
        }
        if (dVar.f10636c.getVisibility() == 0) {
            dVar.mo9137a();
        }
    }
}

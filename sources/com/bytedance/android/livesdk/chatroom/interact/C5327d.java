package com.bytedance.android.livesdk.chatroom.interact;

import android.support.p030v4.app.C0654k.C0656b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5294c.C5296b;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d */
final /* synthetic */ class C5327d implements C0656b {

    /* renamed from: a */
    private final C5249a f14150a;

    C5327d(C5249a aVar) {
        this.f14150a = aVar;
    }

    /* renamed from: a */
    public final void mo2251a() {
        C5249a aVar = this.f14150a;
        C5296b bVar = aVar.f14028h.empty() ? null : (C5296b) aVar.f14028h.peek();
        if (aVar.getDialog() != null && bVar != null && bVar.mo8452l()) {
            aVar.f14025e.setText(bVar.mo11149b());
            aVar.f14023c.removeAllViews();
            aVar.f14024d.removeAllViews();
            if (bVar.mo11151d() != null) {
                aVar.f14023c.addView(bVar.mo11151d());
            }
            if (bVar.mo11152e() != null) {
                aVar.f14024d.addView(bVar.mo11152e());
            }
        }
    }
}

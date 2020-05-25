package com.bytedance.android.livesdk.player;

import com.bytedance.android.livesdk.player.C8086g.C8089c;

/* renamed from: com.bytedance.android.livesdk.player.w */
final /* synthetic */ class C8114w implements Runnable {

    /* renamed from: a */
    private final C81131 f22161a;

    /* renamed from: b */
    private final C8089c f22162b;

    /* renamed from: c */
    private final int f22163c;

    /* renamed from: d */
    private final String f22164d;

    C8114w(C81131 r1, C8089c cVar, int i, String str) {
        this.f22161a = r1;
        this.f22162b = cVar;
        this.f22163c = i;
        this.f22164d = str;
    }

    public final void run() {
        C81131 r0 = this.f22161a;
        C8089c cVar = this.f22162b;
        int i = this.f22163c;
        String str = this.f22164d;
        if (C8112v.this.f22154c != null) {
            C8112v.this.f22154c.mo14265a(cVar, i, str);
        }
    }
}

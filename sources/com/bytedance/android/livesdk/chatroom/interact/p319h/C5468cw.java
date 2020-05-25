package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.chatroom.interact.C5274ah;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj.C5455a;
import com.p683ss.android.medialib.camera.ImageFrame;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cw */
final /* synthetic */ class C5468cw implements C1710e {

    /* renamed from: a */
    private final C54541 f14478a;

    /* renamed from: b */
    private final int f14479b;

    /* renamed from: c */
    private final long f14480c;

    /* renamed from: d */
    private final Exception f14481d;

    C5468cw(C54541 r1, int i, long j, Exception exc) {
        this.f14478a = r1;
        this.f14479b = i;
        this.f14480c = j;
        this.f14481d = exc;
    }

    public final void accept(Object obj) {
        C54541 r0 = this.f14478a;
        int i = this.f14479b;
        long j = this.f14480c;
        Exception exc = this.f14481d;
        Integer num = (Integer) obj;
        switch (i) {
            case ImageFrame.NV21 /*-3*/:
                C5453cj cjVar = C5453cj.this;
                String message = exc.getMessage();
                if (cjVar.mo8518c() != null) {
                    ((C5455a) cjVar.mo8518c()).mo11360d();
                    ((C5455a) cjVar.mo8518c()).mo11357a("STREAM_ON_ERROR");
                }
                cjVar.f14454h = true;
                C5274ah.m11928a(cjVar.f14447a.getId(), String.valueOf(cjVar.f14450d.f12612c), cjVar.mo11353i().toString(), 401, message);
                break;
            case -2:
                C5453cj.this.mo11343a((int) j, exc.getMessage());
                return;
            case -1:
                C5453cj cjVar2 = C5453cj.this;
                int i2 = (int) j;
                String message2 = exc.getMessage();
                C5274ah.m11929a(cjVar2.mo11353i().toString(), 1, i2);
                if (cjVar2.mo8518c() != null) {
                    ((C5455a) cjVar2.mo8518c()).mo11359c();
                }
                if (cjVar2.f14451e != null) {
                    cjVar2.f14451e.dispose();
                }
                StringBuilder sb = new StringBuilder("code: ");
                sb.append(i2);
                sb.append(", desc: ");
                sb.append(message2);
                C5274ah.m11924a(1, 107, sb.toString(), "anchor", "pk", cjVar2.mo11353i().toString());
                cjVar2.f14450d.f12626q = 0;
                return;
        }
    }
}

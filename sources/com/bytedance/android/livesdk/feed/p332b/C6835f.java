package com.bytedance.android.livesdk.feed.p332b;

import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.b.f */
final /* synthetic */ class C6835f implements C1710e {

    /* renamed from: a */
    static final C1710e f18725a = new C6835f();

    private C6835f() {
    }

    public final void accept(Object obj) {
        List list = (List) obj;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                C6945f fVar = (C6945f) it.next();
                if (fVar != null) {
                    if (!fVar.mo13133b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C6856b.m14400c().mo13047i().notifyShowLiveIconEntrance(z);
    }
}

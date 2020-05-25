package com.bytedance.android.live.broadcast.p203e;

import com.bytedance.android.live.broadcast.p203e.C3187a.C3188a;
import com.bytedance.android.livesdk.p279af.C4604n;
import java.util.Locale;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.c */
final /* synthetic */ class C3190c implements C1710e {

    /* renamed from: a */
    private final C3187a f9251a;

    C3190c(C3187a aVar) {
        this.f9251a = aVar;
    }

    public final void accept(Object obj) {
        C3187a aVar = this.f9251a;
        Long l = (Long) obj;
        if (aVar.mo8518c() != null) {
            ((C3188a) aVar.mo8518c()).mo8438a(false, C4604n.m11051a(Locale.CHINA, aVar.f9239a, Long.valueOf((10 - l.longValue()) - 1)));
        }
    }
}

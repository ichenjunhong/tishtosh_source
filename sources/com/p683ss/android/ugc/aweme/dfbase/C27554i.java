package com.p683ss.android.ugc.aweme.dfbase;

import android.app.Application;
import com.bytedance.ies.ugc.p694a.C11010c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.dfbase.i */
final /* synthetic */ class C27554i implements C1710e {

    /* renamed from: a */
    private final C27536b f72441a;

    C27554i(C27536b bVar) {
        this.f72441a = bVar;
    }

    public final void accept(Object obj) {
        C27536b bVar = this.f72441a;
        Application application = (Application) obj;
        synchronized (C27536b.class) {
            if (C27536b.f72386a && C27536b.f72388c != null) {
                C11010c.m22280a().unregisterReceiver(C27536b.f72388c);
                C27536b.f72386a = false;
            }
        }
    }
}

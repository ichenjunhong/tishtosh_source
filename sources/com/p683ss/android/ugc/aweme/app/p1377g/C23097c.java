package com.p683ss.android.ugc.aweme.app.p1377g;

import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.g.c */
public final class C23097c {

    /* renamed from: d */
    private static C23097c f61503d;

    /* renamed from: a */
    public C23096b f61504a;

    /* renamed from: b */
    public ArrayList<String> f61505b;

    /* renamed from: c */
    public C23095a f61506c;

    /* renamed from: a */
    public static boolean m56658a() {
        if (f61503d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C23097c m56659b() {
        if (f61503d != null) {
            return f61503d;
        }
        throw new RuntimeException("UserActionPredict not init");
    }

    /* renamed from: c */
    public final void mo47839c() {
        C23096b bVar = this.f61504a;
        if (bVar.f61501a != null) {
            bVar.f61501a.sendMessage(bVar.f61501a.obtainMessage(1));
        }
    }
}

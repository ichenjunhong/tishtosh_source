package com.p683ss.android.ugc.aweme.account.login.twostep;

import com.p683ss.android.ugc.aweme.account.p1275h.C20979a;
import com.p683ss.android.ugc.aweme.account.p1275h.C20980b;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f */
public class C21515f {

    /* renamed from: a */
    public static final Object f58340a = new Object();

    /* renamed from: c */
    private static volatile C21515f f58341c;

    /* renamed from: b */
    public C20979a f58342b;

    private C21515f() {
    }

    /* renamed from: a */
    public static C21515f m54161a() {
        if (f58341c == null) {
            synchronized (C21515f.class) {
                if (f58341c == null) {
                    f58341c = new C21515f();
                }
            }
        }
        return f58341c;
    }

    /* renamed from: a */
    public final void mo45713a(C20980b bVar) {
        synchronized (f58340a) {
            if (this.f58342b != null) {
                this.f58342b.onComplete(bVar);
                this.f58342b = null;
            }
        }
    }
}

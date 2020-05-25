package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.main.p1939c.C36548a;
import com.p683ss.android.ugc.aweme.main.p1939c.C36549b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.main.b */
public class C36512b {

    /* renamed from: c */
    private static C36512b f93583c;

    /* renamed from: a */
    public boolean f93584a;

    /* renamed from: b */
    public boolean f93585b;

    /* renamed from: a */
    public static C36512b m82421a() {
        if (f93583c == null) {
            synchronized (C36512b.class) {
                if (f93583c == null) {
                    f93583c = new C36512b();
                }
            }
        }
        return f93583c;
    }

    /* renamed from: a */
    public final void mo75641a(boolean z) {
        if (z != this.f93584a) {
            this.f93584a = z;
            C47718bf.m103288a(new C36548a());
        }
    }

    /* renamed from: b */
    public final void mo75642b(boolean z) {
        if (this.f93585b != z) {
            this.f93585b = z;
            C47718bf.m103288a(new C36549b());
        }
    }
}

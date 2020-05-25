package com.p683ss.android.ugc.aweme.translation;

import android.support.p030v4.p038f.C0786h;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47357d;

/* renamed from: com.ss.android.ugc.aweme.translation.a */
public class C47352a {

    /* renamed from: a */
    private static volatile C47352a f119504a;

    /* renamed from: b */
    private C0786h<String, C47357d> f119505b = new C0786h<>(100);

    private C47352a() {
    }

    /* renamed from: a */
    public static C47352a m102708a() {
        if (f119504a == null) {
            synchronized (C47352a.class) {
                if (f119504a == null) {
                    f119504a = new C47352a();
                }
            }
        }
        return f119504a;
    }

    /* renamed from: a */
    public final C47357d mo94634a(String str) {
        if (str == null) {
            return null;
        }
        return (C47357d) this.f119505b.mo2501a(str);
    }

    /* renamed from: a */
    public final void mo94635a(String str, C47357d dVar) {
        if (str != null) {
            this.f119505b.mo2502a(str, dVar);
        }
    }
}

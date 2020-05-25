package com.p683ss.android.ugc.aweme.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.push.h */
public class C40906h {

    /* renamed from: b */
    private static volatile C40906h f104106b;

    /* renamed from: a */
    public boolean f104107a = false;

    /* renamed from: c */
    private List<C40908a> f104108c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.push.h$a */
    static class C40908a {

        /* renamed from: a */
        String f104109a;

        private C40908a() {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C40908a) || !TextUtils.equals(((C40908a) obj).f104109a, this.f104109a)) {
                return false;
            }
            return true;
        }
    }

    private C40906h() {
    }

    /* renamed from: a */
    public static final C40906h m90485a() {
        if (f104106b == null) {
            synchronized (C40906h.class) {
                if (f104106b == null) {
                    f104106b = new C40906h();
                }
            }
        }
        return f104106b;
    }

    /* renamed from: a */
    public final void mo83390a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C40908a aVar = new C40908a();
            aVar.f104109a = str;
            synchronized (this) {
                if (!this.f104108c.contains(aVar)) {
                    this.f104108c.add(aVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo83391b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            Iterator it = this.f104108c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40908a aVar = (C40908a) it.next();
                if (aVar != null && TextUtils.equals(aVar.f104109a, str)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }
}

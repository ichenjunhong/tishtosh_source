package com.p683ss.android.agilelogger.p1135e;

import android.text.TextUtils;
import com.p683ss.android.agilelogger.C18816f;
import com.p683ss.android.agilelogger.p1134d.C18810c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.agilelogger.e.a */
public final class C18812a {

    /* renamed from: a */
    public List<C18810c> f51976a = new ArrayList();

    /* renamed from: b */
    public volatile Set<String> f51977b = null;

    /* renamed from: com.ss.android.agilelogger.e.a$a */
    public static class C18813a {

        /* renamed from: a */
        public C18812a f51978a = new C18812a();
    }

    /* renamed from: a */
    public final void mo38407a() {
        if (this.f51976a != null) {
            for (C18810c a : this.f51976a) {
                a.mo38400a();
            }
        }
    }

    /* renamed from: a */
    public final void mo38408a(C18816f fVar) {
        if (this.f51976a != null) {
            if (this.f51977b == null || TextUtils.isEmpty(fVar.f51987c) || !this.f51977b.contains(fVar.f51987c)) {
                for (C18810c b : this.f51976a) {
                    b.mo38405b(fVar);
                }
            }
        }
    }
}

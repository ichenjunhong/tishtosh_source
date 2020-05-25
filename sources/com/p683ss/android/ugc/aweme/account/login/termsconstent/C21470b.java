package com.p683ss.android.ugc.aweme.account.login.termsconstent;

import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21468a.C21469a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.termsconstent.b */
public final class C21470b implements C21469a {

    /* renamed from: a */
    public final AuthResult f58244a;

    /* renamed from: b */
    public final C21471a f58245b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.termsconstent.b$a */
    public interface C21471a {
        /* renamed from: b */
        void mo45119b(int i, AuthResult authResult);
    }

    /* renamed from: b */
    public final void mo45652b() {
        m54107a(0);
    }

    /* renamed from: a */
    public final void mo45651a() {
        m54107a(-1);
    }

    /* renamed from: a */
    private void m54107a(int i) {
        this.f58245b.mo45119b(i, this.f58244a);
    }

    public C21470b(AuthResult authResult, C21471a aVar) {
        C52711k.m112240b(authResult, "authResult");
        C52711k.m112240b(aVar, "callback");
        this.f58244a = authResult;
        this.f58245b = aVar;
    }
}

package com.p683ss.android.ugc.aweme.account.agegate;

import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b.C20885a;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.a */
public final class C20860a implements C20885a {

    /* renamed from: a */
    private AuthResult f56803a;

    /* renamed from: b */
    private C20861a f56804b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a$a */
    public interface C20861a {
        /* renamed from: a */
        void mo44785a(int i, AuthResult authResult);
    }

    /* renamed from: a */
    public final void mo44781a() {
        m53183a(1);
    }

    /* renamed from: b */
    public final void mo44783b() {
        m53183a(0);
    }

    /* renamed from: c */
    public final void mo44784c() {
        m53183a(1);
    }

    /* renamed from: a */
    private void m53183a(int i) {
        if (this.f56804b != null) {
            this.f56804b.mo44785a(i, this.f56803a);
        }
    }

    /* renamed from: a */
    public final void mo44782a(Exception exc) {
        m53183a(-1);
    }

    public C20860a(AuthResult authResult, C20861a aVar) {
        this.f56803a = authResult;
        this.f56804b = aVar;
    }
}

package com.bytedance.android.livesdk.p270ab;

import com.bytedance.android.livesdk.C4960c;
import com.bytedance.android.livesdk.p271ac.C4519a;
import com.bytedance.android.livesdk.p271ac.C4520b;
import com.bytedance.android.livesdk.schema.C8251a;
import com.bytedance.android.livesdk.schema.C8252b;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8348m;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8801e;
import com.bytedance.android.livesdkapi.host.C8802f;
import com.bytedance.android.livesdkapi.host.C8803g;
import com.bytedance.android.livesdkapi.host.C8804h;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p445e.C8734d;
import com.bytedance.android.livesdkapi.service.C8861d;

/* renamed from: com.bytedance.android.livesdk.ab.c */
public final class C4502c implements C4504e {

    /* renamed from: a */
    private C8861d f12275a;

    /* renamed from: b */
    private C8333e f12276b;

    /* renamed from: c */
    private C4519a f12277c;

    /* renamed from: d */
    private C8252b f12278d;

    /* renamed from: e */
    private IHostApp f12279e;

    /* renamed from: a */
    public final IHostContext mo10308a() {
        return this.f12275a.mo13039a();
    }

    /* renamed from: b */
    public final C8777a mo10309b() {
        return this.f12275a.mo13040b();
    }

    /* renamed from: d */
    public final C8801e mo10311d() {
        return this.f12275a.mo13043e();
    }

    /* renamed from: g */
    public final C8802f mo10314g() {
        return this.f12275a.mo13048j();
    }

    /* renamed from: i */
    public final C8804h mo10316i() {
        return this.f12275a.mo13050l();
    }

    /* renamed from: j */
    public final C8734d mo10317j() {
        return this.f12275a.mo13051m();
    }

    /* renamed from: k */
    public final C8803g mo10318k() {
        return this.f12275a.mo13052n();
    }

    /* renamed from: l */
    public final C8794c mo10319l() {
        return this.f12275a.mo13053o();
    }

    /* renamed from: c */
    public final IHostApp mo10310c() {
        if (this.f12279e == null) {
            this.f12279e = new C4960c(this.f12275a.mo13041c());
        }
        return this.f12279e;
    }

    /* renamed from: e */
    public final C4519a mo10312e() {
        if (this.f12277c == null) {
            this.f12277c = new C4520b(this.f12275a.mo13045g());
        }
        return this.f12277c;
    }

    /* renamed from: f */
    public final C8252b mo10313f() {
        if (this.f12278d == null) {
            this.f12278d = new C8251a(this.f12275a.mo13047i());
        }
        return this.f12278d;
    }

    /* renamed from: h */
    public final C8333e mo10315h() {
        if (this.f12276b == null) {
            this.f12276b = new C8348m(this.f12275a.mo13049k());
        }
        return this.f12276b;
    }

    public C4502c(C8861d dVar) {
        this.f12275a = dVar;
        if (this.f12279e == null) {
            this.f12279e = new C4960c(dVar.mo13041c());
        }
    }
}

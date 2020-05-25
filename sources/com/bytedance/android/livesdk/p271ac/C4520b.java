package com.bytedance.android.livesdk.p271ac;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostShare.C8769a;
import p064c.p065a.C1680ad;
import p064c.p065a.p094l.C2187e;

/* renamed from: com.bytedance.android.livesdk.ac.b */
public final class C4520b implements C4519a {

    /* renamed from: a */
    public C2187e<Object> f12290a;

    /* renamed from: b */
    public C2187e<String> f12291b;

    /* renamed from: c */
    private IHostShare f12292c;

    /* renamed from: d */
    private C8632a f12293d = new C8632a() {
        /* renamed from: a */
        public final void mo8971a(Throwable th) {
            if (C4520b.this.f12290a != null) {
                C4520b.this.f12290a.onError(th);
                C4520b.this.f12290a = null;
            }
        }

        /* renamed from: a */
        public final void mo8970a(String str, String str2) {
            if (C4520b.this.f12290a != null) {
                C4520b.this.f12290a.onSuccess(new Object());
                C4520b.this.f12290a = null;
            }
        }
    };

    /* renamed from: e */
    private C8769a f12294e = new C8769a() {
        /* renamed from: a */
        public final void mo10344a(String str) {
            if (C4520b.this.f12291b != null) {
                C4520b.this.f12291b.onSuccess(str);
                C4520b.this.f12291b = null;
            }
        }
    };

    public C4520b(IHostShare iHostShare) {
        this.f12292c = iHostShare;
    }

    /* renamed from: a */
    public final C1680ad<String> mo10342a(String str) {
        this.f12292c.getShortUrl(str, this.f12294e);
        this.f12291b = C2187e.m6550d();
        return this.f12291b;
    }

    /* renamed from: a */
    public final C1680ad<Object> mo10341a(Activity activity, C8633b bVar) {
        this.f12292c.share(activity, bVar, this.f12293d);
        this.f12290a = C2187e.m6550d();
        return this.f12290a;
    }

    /* renamed from: a */
    public final void mo10343a(Activity activity, C8633b bVar, C8632a aVar) {
        this.f12292c.showShareDialog(activity, bVar, aVar);
    }
}

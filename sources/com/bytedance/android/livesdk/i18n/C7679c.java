package com.bytedance.android.livesdk.i18n;

import android.arch.p011c.p014b.C0141e;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.i18n.p384db.C7685b;
import com.bytedance.android.livesdk.i18n.p384db.C7689e;
import com.bytedance.android.livesdk.i18n.p384db.I18nDatabase;
import java.util.Map;
import java.util.concurrent.Callable;
import p064c.p065a.C2149h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.i18n.c */
final class C7679c {

    /* renamed from: b */
    static C7689e f21157b;

    /* renamed from: c */
    static C7685b f21158c;

    /* renamed from: a */
    String f21159a;

    /* renamed from: d */
    C7680a f21160d;

    /* renamed from: e */
    boolean f21161e;

    /* renamed from: f */
    boolean f21162f;

    /* renamed from: g */
    C1690c f21163g;

    /* renamed from: h */
    C1690c f21164h;

    /* renamed from: i */
    private long f21165i;

    /* renamed from: j */
    private Map<String, String> f21166j;

    /* renamed from: com.bytedance.android.livesdk.i18n.c$a */
    interface C7680a {
        /* renamed from: a */
        void mo14038a(String str, C7681b bVar);

        /* renamed from: a */
        void mo14039a(String str, Exception exc);
    }

    /* renamed from: com.bytedance.android.livesdk.i18n.c$b */
    static class C7681b {

        /* renamed from: a */
        String f21167a;

        /* renamed from: b */
        long f21168b;

        /* renamed from: c */
        Map<String, String> f21169c;

        C7681b() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14040a() {
        if (this.f21165i >= 0) {
            mo14041a(this.f21165i, this.f21166j);
            this.f21165i = -1;
            this.f21166j = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14042b() {
        if (!this.f21161e) {
            this.f21161e = true;
            this.f21163g = C2149h.m6452a((Callable<? extends T>) new C7682d<Object>(this)).mo6443a(C1667a.m5940a()).mo6452b(C2168a.m6521b()).mo6438a((C1710e<? super T>) new C7693e<Object>(this), (C1710e<? super Throwable>) new C7694f<Object>(this));
        }
    }

    C7679c(String str, C7680a aVar) {
        this.f21159a = str;
        this.f21160d = aVar;
        if (f21157b == null) {
            I18nDatabase i18nDatabase = (I18nDatabase) C0141e.m302a(C3922z.m9915e().getApplicationContext(), I18nDatabase.class, "i18n_live").mo252b();
            f21157b = i18nDatabase.mo14044g();
            f21158c = i18nDatabase.mo14045h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14041a(long j, Map<String, String> map) {
        if (TextUtils.isEmpty(this.f21159a) || map == null || map.isEmpty()) {
            TextUtils.isEmpty(this.f21159a);
        } else if (this.f21162f) {
            this.f21165i = j;
            this.f21166j = map;
        } else {
            this.f21162f = true;
            this.f21164h = C2149h.m6452a((Callable<? extends T>) new C7695g<Object>(this, map, j)).mo6443a(C1667a.m5940a()).mo6452b(C2168a.m6521b()).mo6438a((C1710e<? super T>) new C7696h<Object>(this), (C1710e<? super Throwable>) new C7697i<Object>(this));
        }
    }
}

package com.p683ss.android.ugc.aweme.sec.captcha;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p513c.C9282a;
import com.bytedance.p513c.C9289b;
import com.bytedance.p513c.C9296c;
import com.bytedance.p513c.C9296c.C9298a;
import com.bytedance.p513c.C9296c.C9299b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import com.p683ss.android.ugc.aweme.secapi.C41484b;
import java.lang.ref.WeakReference;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha */
public final class SecCaptcha implements C0183j, C9289b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105121a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SecCaptcha.class), "bdTuringConfig", "getBdTuringConfig()Lcom/bytedance/bdturing/BdTuringConfig;"))};

    /* renamed from: j */
    public static final C41469a f105122j = new C41469a(null);

    /* renamed from: b */
    public C9282a f105123b;

    /* renamed from: c */
    public WeakReference<Activity> f105124c;

    /* renamed from: d */
    public C41483a f105125d;

    /* renamed from: e */
    public String f105126e;

    /* renamed from: f */
    public String f105127f;

    /* renamed from: g */
    public final Context f105128g;

    /* renamed from: h */
    public final C41472a f105129h;

    /* renamed from: i */
    public final C41484b f105130i;

    /* renamed from: k */
    private final C52668f f105131k = C52732g.m112285a(new C41470b(this));

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$a */
    public static final class C41469a {
        private C41469a() {
        }

        public /* synthetic */ C41469a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$b */
    static final class C41470b extends C52712l implements C52670a<C9296c> {

        /* renamed from: a */
        final /* synthetic */ SecCaptcha f105132a;

        C41470b(SecCaptcha secCaptcha) {
            this.f105132a = secCaptcha;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C9298a().mo16897a(String.valueOf(this.f105132a.f105129h.f105136b)).mo16899b(this.f105132a.f105129h.f105137c).mo16900c(C11010c.m22294o()).mo16901d(this.f105132a.f105129h.f105135a).mo16902e(this.f105132a.f105129h.f105140f).mo16896a(C9299b.REGION_SINGAPOER).mo16898a(this.f105132a.f105128g.getApplicationContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.captcha.SecCaptcha$c */
    public static final class C41471c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecCaptcha f105133a;

        /* renamed from: b */
        final /* synthetic */ Activity f105134b;

        public C41471c(SecCaptcha secCaptcha, Activity activity) {
            this.f105133a = secCaptcha;
            this.f105134b = activity;
        }

        public final void run() {
            if (this.f105134b instanceof C0184k) {
                ((C0184k) this.f105134b).getLifecycle().mo324a(this.f105133a);
            }
        }
    }

    /* renamed from: a */
    public final C9296c mo84213a() {
        return (C9296c) this.f105131k.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void release() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f105124c;
        if (weakReference != null) {
            activity = (Activity) weakReference.get();
        } else {
            activity = null;
        }
        if (activity instanceof C0184k) {
            ((C0184k) activity).getLifecycle().mo325b(this);
        }
        C9282a aVar = this.f105123b;
        if (aVar != null) {
            aVar.mo16872b();
        }
    }

    /* renamed from: a */
    public final void mo16879a(int i) {
        String str = SecApiImpl.TAG;
        StringBuilder sb = new StringBuilder("popCaptcha-onFail, code=");
        sb.append(i);
        C32458a.m75141a(4, str, sb.toString());
        C41483a aVar = this.f105125d;
        if (aVar != null) {
            aVar.mo70446a(false, i);
        }
        if (!(i == 1 && i == 3)) {
            C41483a aVar2 = this.f105125d;
            if (aVar2 != null) {
                aVar2.mo70445a();
            }
        }
    }

    /* renamed from: a */
    public final void mo84214a(String str, String str2) {
        C52711k.m112240b(str, "deviceId");
        C52711k.m112240b(str2, "iid");
        this.f105129h.mo84218b(str);
        this.f105129h.mo84217a(str2);
        mo84213a().mo16891a(this.f105129h.f105138d);
        mo84213a().mo16892b(this.f105129h.f105139e);
    }

    /* renamed from: a */
    public final void mo16880a(int i, String str, String str2) {
        String str3 = SecApiImpl.TAG;
        StringBuilder sb = new StringBuilder("popCaptcha-onSuccess, code=");
        sb.append(i);
        C32458a.m75141a(4, str3, sb.toString());
        C41483a aVar = this.f105125d;
        if (aVar != null) {
            aVar.mo70446a(true, i);
        }
    }

    public SecCaptcha(Context context, C41472a aVar, C41484b bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "params");
        C52711k.m112240b(bVar, "secGetDataCallBack");
        this.f105128g = context;
        this.f105129h = aVar;
        this.f105130i = bVar;
        String a = this.f105130i.mo77260a();
        if (a == null) {
            a = "";
        }
        this.f105126e = a;
        String b = this.f105130i.mo77261b();
        if (b == null) {
            b = "";
        }
        this.f105127f = b;
    }
}

package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.Choreographer;
import com.bytedance.android.live.core.performance.BaseSampler.C3972a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.c */
final /* synthetic */ class C3978c implements Runnable {

    /* renamed from: a */
    private final C3974b f11089a;

    /* renamed from: b */
    private final String f11090b;

    /* renamed from: c */
    private final C0184k f11091c;

    /* renamed from: d */
    private final Context f11092d;

    /* renamed from: e */
    private final String f11093e;

    C3978c(C3974b bVar, String str, C0184k kVar, Context context, String str2) {
        this.f11089a = bVar;
        this.f11090b = str;
        this.f11091c = kVar;
        this.f11092d = context;
        this.f11093e = str2;
    }

    public final void run() {
        C3974b bVar = this.f11089a;
        String str = this.f11090b;
        C0184k kVar = this.f11091c;
        Context context = this.f11092d;
        String str2 = this.f11093e;
        FpsSampler fpsSampler = new FpsSampler(Choreographer.getInstance(), bVar.f11074b, 3000);
        bVar.f11075c.put(str, fpsSampler);
        kVar.getLifecycle().mo324a(fpsSampler);
        fpsSampler.f11067h = false;
        fpsSampler.f11065f.postFrameCallback(fpsSampler);
        fpsSampler.mo9359a(C3974b.f11070d, context, new C3972a(str2, kVar, fpsSampler) {

            /* renamed from: a */
            final /* synthetic */ String f11085a;

            /* renamed from: b */
            final /* synthetic */ C0184k f11086b;

            /* renamed from: c */
            final /* synthetic */ FpsSampler f11087c;

            /* renamed from: a */
            public final void mo9368a() {
                C3974b.m10063a(this.f11086b.getLifecycle(), (BaseSampler) this.f11087c);
            }

            /* renamed from: a */
            public final void mo9369a(ArrayList arrayList, HashMap<String, String> hashMap) {
                C3974b.f11070d.post(new C3981f(this, arrayList, this.f11085a, hashMap));
                C3974b.m10063a(this.f11086b.getLifecycle(), (BaseSampler) this.f11087c);
            }

            {
                this.f11085a = r2;
                this.f11086b = r3;
                this.f11087c = r4;
            }
        });
    }
}

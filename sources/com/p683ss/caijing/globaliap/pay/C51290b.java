package com.p683ss.caijing.globaliap.pay;

import android.app.Activity;
import android.os.Bundle;
import com.p683ss.base.mvp.C51166e;
import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2559d.C51238d;
import com.p683ss.caijing.globaliap.p2559d.C51238d.C51239a;
import com.p683ss.caijing.globaliap.p2559d.C51238d.C51243e;
import com.p683ss.caijing.globaliap.p2559d.C51249e;
import com.p683ss.caijing.globaliap.p2563f.C51283b;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import com.p683ss.caijing.globaliap.pay.C51288a.C51289a;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.pay.b */
public final class C51290b extends C51166e<C51289a> {

    /* renamed from: e */
    WeakReference<Activity> f128057e;

    /* renamed from: f */
    private String f128058f;

    /* renamed from: d */
    public final void mo101698d() {
        super.mo101698d();
        C51292c.m110277a(this.f128058f);
    }

    public C51290b(Class<C51289a> cls) {
        super(cls);
    }

    /* renamed from: c */
    public final void mo101697c(Bundle bundle) {
        super.mo101697c(bundle);
        bundle.putString("processId", this.f128058f);
    }

    /* renamed from: b */
    public final void mo101696b(Bundle bundle) {
        super.mo101696b(bundle);
        if (bundle == null || !bundle.containsKey("processId")) {
            super.mo101700f();
            this.f128058f = this.f127790c.getString("processId");
        } else {
            this.f128058f = bundle.getString("processId");
        }
        super.mo101700f();
        C51238d dVar = new C51238d(this.f127788a);
        this.f127791d.add(dVar);
        Activity activity = (Activity) this.f128057e.get();
        String str = this.f128058f;
        C512911 r2 = new C51243e() {
            /* renamed from: b */
            public final void mo101775b() {
                ((C51289a) C51290b.this.mo101699e()).mo101804c();
            }

            /* renamed from: a */
            public final void mo101773a() {
                C51289a aVar = (C51289a) C51290b.this.mo101699e();
                Bundle bundle = new Bundle();
                bundle.putInt("pay_result_code", 0);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("pay_result_detail_code", 0);
                bundle2.putString("pay_result_msg", "success");
                bundle.putBundle("pay_result_extra", bundle2);
                aVar.mo101803a(bundle);
            }

            /* renamed from: a */
            public final void mo101774a(Bundle bundle) {
                ((C51289a) C51290b.this.mo101699e()).mo101803a(bundle);
            }
        };
        dVar.f127964b = new C51249e(dVar.mo101695b());
        dVar.f127971i = new WeakReference<>(activity);
        dVar.f127963a = str;
        dVar.f127965c = r2;
        dVar.f127964b.mo101781a(new C51239a(dVar, 0));
        C51283b.m110249a(C51160c.m110046a(dVar.mo101695b()), "gp_model");
        String b = C51292c.m110281b(dVar.f127963a, "app_id", "");
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", b);
        C51284c.m110260a("caijing_iap_google_request", hashMap);
    }
}

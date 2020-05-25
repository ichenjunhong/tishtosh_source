package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48750f;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.f */
public final class C48865f extends C48656j {

    /* renamed from: a */
    private C48565a f122798a;

    /* renamed from: b */
    private C48890g f122799b;

    /* renamed from: f */
    private C48641b f122800f;

    /* renamed from: g */
    private List<String> f122801g = new ArrayList();

    /* renamed from: h */
    private String f122802h;

    /* renamed from: i */
    private boolean f122803i;

    /* renamed from: j */
    private int f122804j;

    /* renamed from: a */
    public final void mo96139a() {
        int i = 0;
        while (i < this.f122804j) {
            List<String> list = this.f122801g;
            boolean z = this.f122803i;
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f122799b.f122956b)) {
                hashMap.put("access_key", this.f122799b.f122956b);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122959e)) {
                hashMap.put("device_id", this.f122799b.f122959e);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122962h)) {
                hashMap.put("device_type", this.f122799b.f122962h);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122961g)) {
                hashMap.put("device_platform", this.f122799b.f122961g);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122965k)) {
                hashMap.put("region", this.f122799b.f122965k);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122957c)) {
                hashMap.put("sdk_version", this.f122799b.f122957c);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122958d)) {
                hashMap.put("app_version", this.f122799b.f122958d);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122960f)) {
                hashMap.put("channel", this.f122799b.f122960f);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122966l)) {
                hashMap.put("aid", this.f122799b.f122966l);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122967m)) {
                hashMap.put("app_language", this.f122799b.f122967m);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122968n)) {
                hashMap.put("longitude", this.f122799b.f122968n);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122969o)) {
                hashMap.put("latitude", this.f122799b.f122969o);
            }
            if (!TextUtils.isEmpty(this.f122799b.f122970p)) {
                hashMap.put("city_code", this.f122799b.f122970p);
            }
            if (!TextUtils.isEmpty(this.f122802h)) {
                hashMap.put("panel", this.f122802h);
            }
            hashMap.put("effect_ids", list);
            hashMap.put("type", Integer.valueOf(z ? 1 : 0));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122798a.mo96084a());
            sb.append(this.f122799b.f122955a);
            sb.append("/v3/effect/favorite");
            C48605b bVar = new C48605b("POST", sb.toString());
            bVar.f122201e = hashMap;
            bVar.f122202f = "application/json";
            try {
                this.f122799b.f122977w.mo96220a(bVar, this.f122800f, BaseNetResponse.class);
                mo96238a(40, new C48750f(true, this.f122801g, null));
                return;
            } catch (Exception e) {
                if (i == this.f122804j - 1 || (e instanceof C48636c)) {
                    mo96238a(40, new C48750f(false, this.f122801g, new C48649d(e)));
                    return;
                }
                i++;
            }
        }
    }

    public C48865f(C48565a aVar, String str, String str2, Handler handler, List<String> list, boolean z) {
        super(handler, str2);
        this.f122798a = aVar;
        this.f122799b = this.f122798a.f122047a;
        this.f122800f = this.f122798a.f122047a.f122976v;
        this.f122801g.clear();
        this.f122801g.addAll(list);
        this.f122803i = z;
        this.f122802h = str;
        this.f122804j = this.f122799b.f122973s;
    }
}

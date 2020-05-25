package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48755k;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.r */
public final class C48877r extends C48656j {

    /* renamed from: a */
    private C48890g f122900a;

    /* renamed from: b */
    private C48565a f122901b;

    /* renamed from: f */
    private int f122902f;

    /* renamed from: g */
    private Map<String, String> f122903g;

    /* renamed from: a */
    public final void mo96139a() {
        while (true) {
            int i = this.f122902f;
            this.f122902f = i - 1;
            if (i != 0) {
                try {
                    HashMap a = C48668f.f122308a.mo96252a(this.f122900a);
                    if (this.f122903g != null) {
                        a.putAll(this.f122903g);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122901b.mo96084a());
                    sb.append(this.f122900a.f122955a);
                    sb.append("/moji/resource");
                    ResourceListResponse resourceListResponse = (ResourceListResponse) this.f122900a.f122977w.mo96220a(new C48605b("GET", C48676l.m105346a(a, sb.toString())), this.f122900a.f122976v, ResourceListResponse.class);
                    if (resourceListResponse != null && resourceListResponse.checkValue()) {
                        mo96238a(24, new C48755k(resourceListResponse.getData()));
                        return;
                    }
                } catch (Exception e) {
                    if (this.f122902f == 0 || (e instanceof C48636c)) {
                        mo96238a(24, new C48755k(new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(24, new C48755k(new C48649d(e)));
    }

    public C48877r(C48565a aVar, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.f122903g = map;
        this.f122900a = aVar.f122047a;
        this.f122901b = aVar;
        this.f122902f = aVar.f122047a.f122973s;
    }
}

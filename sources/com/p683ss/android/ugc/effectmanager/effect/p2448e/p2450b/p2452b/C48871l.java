package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48752h;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.l */
public final class C48871l extends C48656j {

    /* renamed from: a */
    private C48890g f122851a;

    /* renamed from: b */
    private C48565a f122852b;

    /* renamed from: f */
    private int f122853f;

    /* renamed from: g */
    private List<String> f122854g;

    /* renamed from: h */
    private Map<String, String> f122855h;

    /* renamed from: a */
    public final void mo96139a() {
        while (true) {
            int i = this.f122853f;
            this.f122853f = i - 1;
            if (i != 0) {
                try {
                    List<String> list = this.f122854g;
                    HashMap a = C48668f.f122308a.mo96252a(this.f122851a);
                    if (this.f122855h != null) {
                        a.putAll(this.f122855h);
                    }
                    a.put("effect_ids", C48676l.m105345a(list));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122852b.mo96084a());
                    sb.append(this.f122851a.f122955a);
                    sb.append("/v3/effect/list");
                    EffectListResponse effectListResponse = (EffectListResponse) this.f122851a.f122977w.mo96220a(new C48605b("GET", C48676l.m105346a(a, sb.toString())), this.f122851a.f122976v, EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        C48669g.m105309a(this.f122851a.f122964j.getAbsolutePath(), effectListResponse.getData());
                        C48669g.m105309a(this.f122851a.f122964j.getAbsolutePath(), effectListResponse.getCollection());
                        mo96238a(23, new C48752h(effectListResponse, null));
                        return;
                    } else if (this.f122853f == 0) {
                        mo96238a(23, new C48752h(null, new C48649d(10014)));
                    }
                } catch (Exception e) {
                    if (this.f122853f == 0 || (e instanceof C48636c)) {
                        mo96238a(23, new C48752h(null, new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(23, new C48752h(null, new C48649d(e)));
    }

    public C48871l(C48565a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.f122855h = map;
        this.f122851a = aVar.f122047a;
        this.f122852b = aVar;
        this.f122854g = list;
        this.f122853f = aVar.f122047a.f122973s;
    }
}

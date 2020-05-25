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
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48748d;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.b */
public final class C48857b extends C48656j {

    /* renamed from: a */
    private C48890g f122763a;

    /* renamed from: b */
    private C48565a f122764b;

    /* renamed from: f */
    private int f122765f;

    /* renamed from: g */
    private List<String> f122766g;

    /* renamed from: h */
    private Map<String, String> f122767h;

    /* renamed from: a */
    public final void mo96139a() {
        while (true) {
            int i = this.f122765f;
            this.f122765f = i - 1;
            if (i != 0) {
                try {
                    List<String> list = this.f122766g;
                    HashMap a = C48668f.f122308a.mo96252a(this.f122763a);
                    if (this.f122767h != null) {
                        a.putAll(this.f122767h);
                    }
                    a.put("effect_ids", C48676l.m105345a(list));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122764b.mo96084a());
                    sb.append(this.f122763a.f122955a);
                    sb.append("/v3/effect/list");
                    EffectListResponse effectListResponse = (EffectListResponse) this.f122763a.f122977w.mo96220a(new C48605b("GET", C48676l.m105346a(a, sb.toString())), this.f122763a.f122976v, EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        C48669g.m105309a(this.f122763a.f122964j.getAbsolutePath(), effectListResponse.getData());
                        mo96238a(17, new C48748d(effectListResponse.getData(), null));
                        return;
                    } else if (this.f122765f == 0) {
                        mo96238a(17, new C48748d(new ArrayList(), new C48649d(10014)));
                    }
                } catch (Exception e) {
                    if (this.f122765f == 0 || (e instanceof C48636c)) {
                        mo96238a(17, new C48748d(new ArrayList(), new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(17, new C48748d(new ArrayList(), new C48649d(e)));
    }

    public C48857b(C48565a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.f122767h = map;
        this.f122763a = aVar.f122047a;
        this.f122764b = aVar;
        this.f122766g = list;
        this.f122765f = aVar.f122047a.f122973s;
    }
}

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

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.m */
public final class C48872m extends C48656j {

    /* renamed from: a */
    private C48890g f122856a;

    /* renamed from: b */
    private C48565a f122857b;

    /* renamed from: f */
    private int f122858f;

    /* renamed from: g */
    private List<String> f122859g;

    /* renamed from: h */
    private Map<String, String> f122860h;

    /* renamed from: a */
    public final void mo96139a() {
        while (true) {
            int i = this.f122858f;
            this.f122858f = i - 1;
            if (i != 0) {
                try {
                    List<String> list = this.f122859g;
                    HashMap a = C48668f.f122308a.mo96252a(this.f122856a);
                    if (this.f122860h != null) {
                        a.putAll(this.f122860h);
                    }
                    a.put("resource_ids", C48676l.m105345a(list));
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f122857b.mo96084a());
                    sb.append(this.f122856a.f122955a);
                    sb.append("/v3/effect/listByResourceId");
                    EffectListResponse effectListResponse = (EffectListResponse) this.f122856a.f122977w.mo96220a(new C48605b("GET", C48676l.m105346a(a, sb.toString())), this.f122856a.f122976v, EffectListResponse.class);
                    if (effectListResponse != null && effectListResponse.checkValue()) {
                        C48669g.m105309a(this.f122856a.f122964j.getAbsolutePath(), effectListResponse.getData());
                        C48669g.m105309a(this.f122856a.f122964j.getAbsolutePath(), effectListResponse.getCollection());
                        mo96238a(23, new C48752h(effectListResponse, null));
                        return;
                    } else if (this.f122858f == 0) {
                        mo96238a(23, new C48752h(null, new C48649d(10014)));
                    }
                } catch (Exception e) {
                    if (this.f122858f == 0 || (e instanceof C48636c)) {
                        mo96238a(23, new C48752h(null, new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(23, new C48752h(null, new C48649d(e)));
    }

    public C48872m(C48565a aVar, List<String> list, Handler handler, String str, Map<String, String> map) {
        super(handler, str);
        this.f122860h = map;
        this.f122856a = aVar.f122047a;
        this.f122857b = aVar;
        this.f122859g = list;
        this.f122858f = aVar.f122047a.f122973s;
    }
}

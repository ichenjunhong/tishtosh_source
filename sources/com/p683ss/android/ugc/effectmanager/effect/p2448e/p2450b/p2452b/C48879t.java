package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48636c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48760p;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.t */
public final class C48879t extends C48656j {

    /* renamed from: a */
    private C48890g f122908a;

    /* renamed from: b */
    private C48565a f122909b;

    /* renamed from: f */
    private C48641b f122910f = this.f122908a.f122976v;

    /* renamed from: g */
    private int f122911g;

    /* renamed from: h */
    private String f122912h;

    /* renamed from: i */
    private String f122913i;

    /* renamed from: j */
    private int f122914j;

    /* renamed from: k */
    private int f122915k;

    /* renamed from: l */
    private Map<String, String> f122916l;

    /* renamed from: a */
    public final void mo96139a() {
        String str = this.f122912h;
        int i = this.f122914j;
        int i2 = this.f122915k;
        HashMap a = C48668f.f122308a.mo96252a(this.f122908a);
        a.put("panel", this.f122913i);
        a.put("keyword", str);
        a.put("cursor", String.valueOf(i2));
        a.put("count", String.valueOf(i));
        if (this.f122916l != null) {
            a.putAll(this.f122916l);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122909b.mo96084a());
        sb.append(this.f122908a.f122955a);
        sb.append("/search");
        C48605b bVar = new C48605b("GET", C48676l.m105346a(a, sb.toString()));
        while (true) {
            int i3 = this.f122911g;
            this.f122911g = i3 - 1;
            if (i3 != 0) {
                try {
                    if (this.f122291c) {
                        mo96238a(60, new C48760p(null, new C48649d(10001)));
                        return;
                    }
                    SearchEffectResponse searchEffectResponse = (SearchEffectResponse) C48644a.m105250a(bVar, this.f122908a.f122977w.mo96221a(bVar), this.f122910f, SearchEffectResponse.class);
                    if (searchEffectResponse != null && searchEffectResponse.checkValid()) {
                        C48669g.m105308a(this.f122908a.f122964j.getAbsolutePath(), this.f122913i, searchEffectResponse.getEffects());
                        C48669g.m105308a(this.f122908a.f122964j.getAbsolutePath(), this.f122913i, searchEffectResponse.getCollection());
                        C48669g.m105308a(this.f122908a.f122964j.getAbsolutePath(), this.f122913i, searchEffectResponse.getBindEffects());
                        mo96238a(60, new C48760p(searchEffectResponse, null));
                        return;
                    } else if (this.f122911g == 0) {
                        mo96238a(60, new C48760p(null, new C48649d(10014)));
                    }
                } catch (Exception e) {
                    if (this.f122911g == 0 || (e instanceof C48636c)) {
                        mo96238a(60, new C48760p(null, new C48649d(e)));
                    }
                }
            } else {
                return;
            }
        }
        mo96238a(60, new C48760p(null, new C48649d(e)));
    }

    public C48879t(C48565a aVar, String str, String str2, int i, int i2, Map<String, String> map, Handler handler, String str3) {
        super(handler, str3);
        this.f122912h = str2;
        this.f122914j = i;
        this.f122915k = i2;
        this.f122913i = str;
        this.f122916l = map;
        this.f122908a = aVar.f122047a;
        this.f122909b = aVar;
        this.f122911g = aVar.f122047a.f122973s;
    }
}

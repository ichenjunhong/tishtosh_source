package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48605b;
import com.p683ss.android.ugc.effectmanager.common.p2437d.C48635b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48668f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48676l;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48753i;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.n */
public final class C48873n extends C48656j {

    /* renamed from: a */
    private C48565a f122861a;

    /* renamed from: b */
    private C48890g f122862b = this.f122861a.f122047a;

    /* renamed from: f */
    private C48641b f122863f = this.f122861a.f122047a.f122976v;

    /* renamed from: g */
    private String f122864g;

    /* renamed from: h */
    private int f122865h;

    /* renamed from: a */
    public final void mo96139a() {
        HashMap a = C48668f.f122308a.mo96252a(this.f122862b);
        if (!TextUtils.isEmpty(this.f122864g)) {
            a.put("panel", this.f122864g);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122861a.mo96084a());
        sb.append(this.f122862b.f122955a);
        sb.append("/v3/effect/my");
        C48605b bVar = new C48605b("GET", C48676l.m105346a(a, sb.toString()));
        int i = 0;
        while (i < this.f122865h) {
            try {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) this.f122862b.f122977w.mo96220a(bVar, this.f122863f, FetchFavoriteListResponse.class);
                if (fetchFavoriteListResponse == null || !fetchFavoriteListResponse.checkValue()) {
                    throw new C48635b(10002, "Download error");
                }
                C48669g.m105309a(this.f122862b.f122964j.getAbsolutePath(), fetchFavoriteListResponse.getEffects());
                C48669g.m105309a(this.f122862b.f122964j.getAbsolutePath(), fetchFavoriteListResponse.getCollectEffects());
                mo96238a(41, new C48753i(fetchFavoriteListResponse));
                return;
            } catch (Exception e) {
                if (i == this.f122865h - 1) {
                    mo96238a(41, new C48753i(new C48649d(e)));
                }
                i++;
            }
        }
    }

    public C48873n(C48565a aVar, String str, String str2, Handler handler) {
        super(handler, str2);
        this.f122861a = aVar;
        this.f122864g = str;
        this.f122865h = this.f122862b.f122973s;
    }
}

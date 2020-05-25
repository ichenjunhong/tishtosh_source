package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48670h;
import com.p683ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48751g;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.g */
public final class C48866g extends C48656j {

    /* renamed from: a */
    private C48565a f122805a;

    /* renamed from: b */
    private C48890g f122806b = this.f122805a.f122047a;

    /* renamed from: f */
    private C48620c f122807f = this.f122806b.f122972r;

    /* renamed from: g */
    private C48641b f122808g = this.f122806b.f122976v;

    /* renamed from: h */
    private String f122809h;

    /* renamed from: i */
    private String f122810i;

    /* renamed from: j */
    private int f122811j;

    /* renamed from: k */
    private int f122812k;

    /* renamed from: l */
    private int f122813l;

    /* renamed from: m */
    private C48642c f122814m = this.f122806b.f122978x;

    /* renamed from: n */
    private int f122815n = this.f122806b.f122975u;

    /* renamed from: a */
    public final void mo96139a() {
        CategoryEffectListResponse categoryEffectListResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream b = this.f122807f.mo96152b(C48667e.m105299a(this.f122809h, this.f122810i, this.f122811j, this.f122812k, this.f122813l));
        if (b == null) {
            mo96238a(21, new C48751g(null, new C48649d(10004)));
            return;
        }
        try {
            categoryEffectListResponse = (CategoryEffectListResponse) this.f122808g.mo59189a(b, CategoryEffectListResponse.class);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            categoryEffectListResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (categoryEffectListResponse == null || !categoryEffectListResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            if (this.f122814m != null) {
                this.f122814m.mo59187a("category_list_success_rate", 0, C48670h.m105314a().mo96255a("app_id", this.f122806b.f122966l).mo96255a("access_key", this.f122806b.f122956b).mo96255a("panel", this.f122809h).mo96255a("category", this.f122810i).mo96254a("duration", Long.valueOf(j)).mo96255a("from_cache", "true").mo96253a("request_strategy", Integer.valueOf(this.f122815n)).mo96256b());
            }
            mo96238a(21, new C48751g(null, new C48649d(10004)));
        } else {
            mo96238a(21, new C48751g(categoryEffectListResponse.getData(), null));
        }
        C48660a.m105288a(b);
    }

    public C48866g(C48565a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2);
        this.f122809h = str;
        this.f122810i = str3;
        this.f122811j = i;
        this.f122812k = i2;
        this.f122813l = i3;
        this.f122805a = aVar;
    }
}

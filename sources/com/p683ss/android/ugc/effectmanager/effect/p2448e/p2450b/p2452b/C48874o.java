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
import com.p683ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48754j;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.o */
public final class C48874o extends C48656j {

    /* renamed from: a */
    private C48565a f122866a;

    /* renamed from: b */
    private C48890g f122867b = this.f122866a.f122047a;

    /* renamed from: f */
    private C48620c f122868f = this.f122867b.f122972r;

    /* renamed from: g */
    private C48641b f122869g = this.f122867b.f122976v;

    /* renamed from: h */
    private String f122870h;

    /* renamed from: i */
    private C48642c f122871i = this.f122867b.f122978x;

    /* renamed from: j */
    private int f122872j = this.f122867b.f122975u;

    /* renamed from: a */
    public final void mo96139a() {
        PanelInfoResponse panelInfoResponse;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream b = this.f122868f.mo96152b(C48667e.m105300b(this.f122867b.f122960f, this.f122870h));
        if (b == null) {
            mo96238a(22, new C48754j(null, new C48649d(10004)));
            return;
        }
        try {
            panelInfoResponse = (PanelInfoResponse) this.f122869g.mo59189a(b, PanelInfoResponse.class);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            panelInfoResponse = null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (panelInfoResponse == null || !panelInfoResponse.checkValue()) {
            long j = currentTimeMillis2 - currentTimeMillis;
            if (this.f122871i != null) {
                this.f122871i.mo59187a("panel_info_success_rate", 0, C48670h.m105314a().mo96255a("app_id", this.f122867b.f122966l).mo96255a("access_key", this.f122867b.f122956b).mo96255a("panel", this.f122870h).mo96254a("duration", Long.valueOf(j)).mo96255a("from_cache", "true").mo96253a("request_strategy", Integer.valueOf(this.f122872j)).mo96256b());
            }
            mo96238a(22, new C48754j(null, new C48649d(10004)));
        } else {
            mo96238a(22, new C48754j(panelInfoResponse.getData(), null));
        }
        C48660a.m105288a(b);
    }

    public C48874o(C48565a aVar, String str, String str2, Handler handler) {
        super(handler, str2);
        this.f122870h = str;
        this.f122866a = aVar;
    }
}

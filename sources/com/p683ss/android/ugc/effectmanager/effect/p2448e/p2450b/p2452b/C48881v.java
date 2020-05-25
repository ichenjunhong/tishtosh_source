package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48761q;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.v */
public final class C48881v extends C48656j {

    /* renamed from: a */
    private C48620c f122929a;

    /* renamed from: b */
    private C48641b f122930b;

    /* renamed from: f */
    private HashMap<String, String> f122931f = new HashMap<>();

    /* renamed from: g */
    private String f122932g;

    /* renamed from: a */
    public final void mo96139a() {
        try {
            this.f122929a.mo96148a("updatetime", this.f122930b.mo59190a(this.f122931f));
            mo96238a(51, new C48761q(this.f122932g, null));
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    public C48881v(Handler handler, C48565a aVar, String str, HashMap<String, String> hashMap) {
        super(handler, str);
        this.f122929a = aVar.f122047a.f122972r;
        this.f122930b = aVar.f122047a.f122976v;
        this.f122931f.putAll(hashMap);
        this.f122932g = str;
    }
}

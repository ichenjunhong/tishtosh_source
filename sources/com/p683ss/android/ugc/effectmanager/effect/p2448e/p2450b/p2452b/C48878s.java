package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48758n;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.s */
public final class C48878s extends C48656j {

    /* renamed from: a */
    private C48620c f122904a;

    /* renamed from: b */
    private C48641b f122905b;

    /* renamed from: f */
    private String f122906f;

    /* renamed from: g */
    private String f122907g;

    /* renamed from: a */
    public final void mo96139a() {
        InputStream b = this.f122904a.mo96152b("updatetime");
        if (b == null) {
            mo96238a(52, new C48758n(this.f122906f, this.f122907g, null, new C48649d(10009)));
            return;
        }
        try {
            HashMap hashMap = (HashMap) this.f122905b.mo59189a(b, HashMap.class);
            if (hashMap != null) {
                mo96238a(52, new C48758n(this.f122906f, this.f122907g, hashMap, null));
            } else {
                mo96238a(52, new C48758n(this.f122906f, this.f122907g, null, new C48649d((Exception) new IllegalStateException("local file destroy"))));
            }
        } catch (Exception e) {
            mo96238a(52, new C48758n(this.f122906f, this.f122907g, null, new C48649d(e)));
        } finally {
            C48660a.m105288a(b);
        }
    }

    public C48878s(Handler handler, C48565a aVar, String str, String str2, String str3) {
        super(handler, str);
        this.f122904a = aVar.f122047a.f122972r;
        this.f122905b = aVar.f122047a.f122976v;
        this.f122906f = str2;
        this.f122907g = str3;
    }
}

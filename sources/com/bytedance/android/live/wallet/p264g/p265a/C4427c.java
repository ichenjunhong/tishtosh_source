package com.bytedance.android.live.wallet.p264g.p265a;

import android.app.Activity;
import com.bytedance.android.live.wallet.C4285a;
import com.bytedance.android.live.wallet.api.C4297c;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.p259b.C4312a;
import com.bytedance.android.live.wallet.p259b.C4327c;
import com.bytedance.android.live.wallet.p259b.C4327c.C4330a;
import com.bytedance.android.live.wallet.p259b.C4327c.C4331b;
import com.bytedance.android.live.wallet.p259b.C4332d;
import com.bytedance.android.live.wallet.p259b.C4333e;
import com.bytedance.android.live.wallet.p264g.p266b.C4450a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.wallet.g.a.c */
public final class C4427c extends C4425a<C4450a> {

    /* renamed from: a */
    public Activity f12070a;

    /* renamed from: b */
    public final JSONObject f12071b;

    /* renamed from: c */
    public C4327c f12072c;

    /* renamed from: d */
    public C4333e f12073d;

    /* renamed from: e */
    public C4332d f12074e;

    /* renamed from: f */
    private final C4297c f12075f;

    /* renamed from: g */
    private String f12076g;

    /* renamed from: h */
    private C4330a f12077h = new C4330a() {
        /* renamed from: a */
        public final void mo10105a() {
            C4333e eVar = C4427c.this.f12073d;
            if (eVar.f11871c && eVar.f11872d != null) {
                eVar.mo10118a();
            }
            C4332d dVar = C4427c.this.f12074e;
            if (dVar.f11868d) {
                dVar.f11868d = false;
                dVar.f11865a.mo10131c();
            }
        }
    };

    /* renamed from: a */
    public final void mo8247a() {
        if (this.f12072c != null) {
            this.f12072c.mo10113a(this.f12077h);
            C4327c cVar = this.f12072c;
            C4450a aVar = (C4450a) mo8518c();
            int decrementAndGet = cVar.f11860e.decrementAndGet();
            if (cVar.f11859d != null) {
                C4312a aVar2 = cVar.f11859d;
                if (aVar2.f11809e == aVar) {
                    aVar2.f11817m = null;
                    aVar2.f11818n.mo10109a();
                    aVar2.f11809e = null;
                    aVar2.f11812h = new JSONObject();
                }
            }
            if (decrementAndGet <= 0) {
                cVar.f11856a = null;
                cVar.f11857b = C4331b.CLOSED;
                if (cVar.f11859d != null) {
                    C4312a aVar3 = cVar.f11859d;
                    aVar3.f11817m = null;
                    aVar3.f11818n.mo10109a();
                    aVar3.f11813i = true;
                    aVar3.f11815k = false;
                    aVar3.f11814j = false;
                    aVar3.f11806b.clear();
                    aVar3.f11807c.clear();
                    aVar3.f11808d.removeCallbacksAndMessages(null);
                    aVar3.f11811g.mo10113a(aVar3.f11819o);
                    aVar3.f11809e = null;
                    cVar.f11859d = null;
                    C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
                    if (iVar != null) {
                        iVar.mo10082b();
                    }
                }
                cVar.f11858c.clear();
            }
            this.f12072c = null;
        }
        super.mo8247a();
        if (this.f12073d != null) {
            C4333e eVar = this.f12073d;
            eVar.f11871c = false;
            eVar.f11872d = null;
            eVar.f11869a.removeCallbacksAndMessages(null);
            eVar.f11870b.mo10113a(eVar.f11873e);
            this.f12073d = null;
        }
        if (this.f12074e != null) {
            C4332d dVar = this.f12074e;
            dVar.f11868d = false;
            dVar.f11866b.mo10113a(dVar.f11867c);
            this.f12074e = null;
        }
        this.f12070a = null;
    }

    /* renamed from: a */
    public final void mo8520a(C4450a aVar) {
        super.mo8520a(aVar);
    }

    public C4427c(Activity activity, C4297c cVar, String str, String str2, int i) {
        this.f12070a = activity;
        this.f12075f = cVar;
        this.f12071b = new JSONObject();
        this.f12076g = str;
    }
}

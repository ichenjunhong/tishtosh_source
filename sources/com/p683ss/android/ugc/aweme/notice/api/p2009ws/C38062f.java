package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.websocket.internal.C50853a;
import com.p683ss.android.websocket.p2539b.p2542c.C50828a;
import com.p683ss.android.websocket.p2539b.p2542c.C50829b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.f */
public final class C38062f implements C50829b {

    /* renamed from: a */
    private final C50829b f96834a = new C38060d();

    /* renamed from: b */
    private final C50829b f96835b = new C38063g();

    /* renamed from: c */
    private final C50829b f96836c;

    /* renamed from: d */
    private final C50829b f96837d = new C38059c();

    /* renamed from: e */
    private final C50829b f96838e;

    /* renamed from: f */
    private SparseArray<C50829b> f96839f;

    public C38062f() {
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        if (provideIMService_Monster != null) {
            this.f96836c = provideIMService_Monster.getImParser();
        } else {
            this.f96836c = new C50828a();
        }
        this.f96838e = new C38057a();
        this.f96839f = new SparseArray<>();
    }

    /* renamed from: a */
    public final Object mo72405a(C50853a aVar) {
        if (aVar.getMethod() == 1 && aVar.getService() == 1) {
            return this.f96834a.mo72405a(aVar);
        }
        if ((aVar.getMethod() == 1 && aVar.getService() == 5) || (aVar.getMethod() == 1 && aVar.getService() == 1015)) {
            return this.f96836c.mo72405a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 6) {
            return this.f96835b.mo72405a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 7) {
            return this.f96837d.mo72405a(aVar);
        }
        if (aVar.getMethod() == 1 && aVar.getService() == 1010) {
            return this.f96838e.mo72405a(aVar);
        }
        C50829b bVar = (C50829b) this.f96839f.get(aVar.getService());
        if (bVar != null) {
            return bVar.mo72405a(aVar);
        }
        return null;
    }
}

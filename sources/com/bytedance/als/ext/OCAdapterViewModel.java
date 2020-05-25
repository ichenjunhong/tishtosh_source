package com.bytedance.als.ext;

import android.arch.lifecycle.C0209x;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class OCAdapterViewModel extends C0209x {

    /* renamed from: a */
    public final C12366c f8323a;

    /* renamed from: b */
    private C12361b f8324b;

    public OCAdapterViewModel() {
        this(null, 1, null);
    }

    /* renamed from: b */
    public final C12361b mo7347b() {
        C12361b bVar = this.f8324b;
        if (bVar == null) {
            C52711k.m112234a();
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo7346a() {
        this.f8324b = this.f8323a.mo23376a();
    }

    public OCAdapterViewModel(C12361b bVar) {
        C12366c cVar;
        if (bVar == null) {
            cVar = new C12366c();
        } else {
            cVar = new C12366c(bVar);
        }
        this.f8323a = cVar;
    }

    private /* synthetic */ OCAdapterViewModel(C12361b bVar, int i, C52707g gVar) {
        this(null);
    }
}

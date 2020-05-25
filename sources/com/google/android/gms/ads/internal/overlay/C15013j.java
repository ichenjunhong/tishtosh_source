package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.internal.ads.C15563abr;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.aef;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.j */
final class C15013j extends C15563abr {

    /* renamed from: a */
    final /* synthetic */ C15006c f38814a;

    private C15013j(C15006c cVar) {
        this.f38814a = cVar;
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    /* renamed from: a */
    public final void mo27696a() {
        aef p = C14963ax.m30846p();
        Bitmap bitmap = (Bitmap) p.f40348a.get(Integer.valueOf(this.f38814a.f38787b.f38783o.f38861e));
        if (bitmap != null) {
            acd.f40245a.post(new C15014k(this, C14963ax.m30832b().mo28684a(this.f38814a.f38786a, bitmap, this.f38814a.f38787b.f38783o.f38859c, this.f38814a.f38787b.f38783o.f38860d)));
        }
    }
}

package com.airbnb.lottie.p108c.p111c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2302c;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2373n;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.f */
public final class C2392f extends C2382a {

    /* renamed from: g */
    private final C2302c f7474g;

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        super.mo6709a(rectF, matrix);
        this.f7474g.mo6709a(rectF, this.f7416a);
    }

    C2392f(C2455g gVar, C2388d dVar) {
        super(gVar, dVar);
        this.f7474g = new C2302c(gVar, this, new C2373n("__container", dVar.f7451a));
        this.f7474g.mo6712a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6754b(Canvas canvas, Matrix matrix, int i) {
        this.f7474g.mo6708a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6755b(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        this.f7474g.mo6710a(eVar, i, list, eVar2);
    }
}

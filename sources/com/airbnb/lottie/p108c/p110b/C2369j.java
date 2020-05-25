package com.airbnb.lottie.p108c.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2315n;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2347f;
import com.airbnb.lottie.p108c.p109a.C2354m;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.c.b.j */
public final class C2369j implements C2358b {

    /* renamed from: a */
    public final String f7372a;

    /* renamed from: b */
    public final C2354m<PointF, PointF> f7373b;

    /* renamed from: c */
    public final C2347f f7374c;

    /* renamed from: d */
    public final C2343b f7375d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.f7373b);
        sb.append(", size=");
        sb.append(this.f7374c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2315n(gVar, aVar, this);
    }

    public C2369j(String str, C2354m<PointF, PointF> mVar, C2347f fVar, C2343b bVar) {
        this.f7372a = str;
        this.f7373b = mVar;
        this.f7374c = fVar;
        this.f7375d = bVar;
    }
}

package com.airbnb.lottie.p108c.p110b;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2305f;
import com.airbnb.lottie.p108c.p109a.C2342a;
import com.airbnb.lottie.p108c.p109a.C2345d;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.c.b.m */
public final class C2372m implements C2358b {

    /* renamed from: a */
    public final FillType f7383a;

    /* renamed from: b */
    public final String f7384b;

    /* renamed from: c */
    public final C2342a f7385c;

    /* renamed from: d */
    public final C2345d f7386d;

    /* renamed from: e */
    private final boolean f7387e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.f7387e);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2305f(gVar, aVar, this);
    }

    public C2372m(String str, boolean z, FillType fillType, C2342a aVar, C2345d dVar) {
        this.f7384b = str;
        this.f7387e = z;
        this.f7383a = fillType;
        this.f7385c = aVar;
        this.f7386d = dVar;
    }
}

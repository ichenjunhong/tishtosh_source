package com.airbnb.lottie.p108c.p110b;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2318q;
import com.airbnb.lottie.p108c.p109a.C2342a;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2345d;
import com.airbnb.lottie.p108c.p111c.C2382a;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.b.p */
public final class C2375p implements C2358b {

    /* renamed from: a */
    public final String f7393a;

    /* renamed from: b */
    public final C2343b f7394b;

    /* renamed from: c */
    public final List<C2343b> f7395c;

    /* renamed from: d */
    public final C2342a f7396d;

    /* renamed from: e */
    public final C2345d f7397e;

    /* renamed from: f */
    public final C2343b f7398f;

    /* renamed from: g */
    public final C2377a f7399g;

    /* renamed from: h */
    public final C2378b f7400h;

    /* renamed from: i */
    public final float f7401i;

    /* renamed from: com.airbnb.lottie.c.b.p$a */
    public enum C2377a {
        Butt,
        Round,
        Unknown;

        public final Cap toPaintCap() {
            switch (this) {
                case Butt:
                    return Cap.BUTT;
                case Round:
                    return Cap.ROUND;
                default:
                    return Cap.SQUARE;
            }
        }
    }

    /* renamed from: com.airbnb.lottie.c.b.p$b */
    public enum C2378b {
        Miter,
        Round,
        Bevel;

        public final Join toPaintJoin() {
            switch (this) {
                case Bevel:
                    return Join.BEVEL;
                case Miter:
                    return Join.MITER;
                case Round:
                    return Join.ROUND;
                default:
                    return null;
            }
        }
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2318q(gVar, aVar, this);
    }

    public C2375p(String str, C2343b bVar, List<C2343b> list, C2342a aVar, C2345d dVar, C2343b bVar2, C2377a aVar2, C2378b bVar3, float f) {
        this.f7393a = str;
        this.f7394b = bVar;
        this.f7395c = list;
        this.f7396d = aVar;
        this.f7397e = dVar;
        this.f7398f = bVar2;
        this.f7399g = aVar2;
        this.f7400h = bVar3;
        this.f7401i = f;
    }
}

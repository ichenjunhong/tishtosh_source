package com.airbnb.lottie.p108c.p110b;

import android.graphics.PointF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2313m;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2354m;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.c.b.i */
public final class C2367i implements C2358b {

    /* renamed from: a */
    public final String f7361a;

    /* renamed from: b */
    public final C2368a f7362b;

    /* renamed from: c */
    public final C2343b f7363c;

    /* renamed from: d */
    public final C2354m<PointF, PointF> f7364d;

    /* renamed from: e */
    public final C2343b f7365e;

    /* renamed from: f */
    public final C2343b f7366f;

    /* renamed from: g */
    public final C2343b f7367g;

    /* renamed from: h */
    public final C2343b f7368h;

    /* renamed from: i */
    public final C2343b f7369i;

    /* renamed from: com.airbnb.lottie.c.b.i$a */
    public enum C2368a {
        Star(1),
        Polygon(2);
        

        /* renamed from: a */
        private final int f7371a;

        public static C2368a forValue(int i) {
            C2368a[] values;
            for (C2368a aVar : values()) {
                if (aVar.f7371a == i) {
                    return aVar;
                }
            }
            return null;
        }

        private C2368a(int i) {
            this.f7371a = i;
        }
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2313m(gVar, aVar, this);
    }

    public C2367i(String str, C2368a aVar, C2343b bVar, C2354m<PointF, PointF> mVar, C2343b bVar2, C2343b bVar3, C2343b bVar4, C2343b bVar5, C2343b bVar6) {
        this.f7361a = str;
        this.f7362b = aVar;
        this.f7363c = bVar;
        this.f7364d = mVar;
        this.f7365e = bVar2;
        this.f7366f = bVar3;
        this.f7367g = bVar4;
        this.f7368h = bVar5;
        this.f7369i = bVar6;
    }
}

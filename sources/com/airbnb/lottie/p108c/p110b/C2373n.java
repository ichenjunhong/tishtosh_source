package com.airbnb.lottie.p108c.p110b;

import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2302c;
import com.airbnb.lottie.p108c.p111c.C2382a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.b.n */
public final class C2373n implements C2358b {

    /* renamed from: a */
    public final String f7388a;

    /* renamed from: b */
    public final List<C2358b> f7389b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.f7388a);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.f7389b.toArray()));
        sb.append('}');
        return sb.toString();
    }

    public C2373n(String str, List<C2358b> list) {
        this.f7388a = str;
        this.f7389b = list;
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2302c(gVar, aVar, this);
    }
}

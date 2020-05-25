package com.airbnb.lottie.p108c.p110b;

import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2319r;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.c.b.q */
public final class C2379q implements C2358b {

    /* renamed from: a */
    public final String f7406a;

    /* renamed from: b */
    public final C2380a f7407b;

    /* renamed from: c */
    public final C2343b f7408c;

    /* renamed from: d */
    public final C2343b f7409d;

    /* renamed from: e */
    public final C2343b f7410e;

    /* renamed from: com.airbnb.lottie.c.b.q$a */
    public enum C2380a {
        Simultaneously,
        Individually;

        public static C2380a forId(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    StringBuilder sb = new StringBuilder("Unknown trim path type ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.f7408c);
        sb.append(", end: ");
        sb.append(this.f7409d);
        sb.append(", offset: ");
        sb.append(this.f7410e);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        return new C2319r(aVar, this);
    }

    public C2379q(String str, C2380a aVar, C2343b bVar, C2343b bVar2, C2343b bVar3) {
        this.f7406a = str;
        this.f7407b = aVar;
        this.f7408c = bVar;
        this.f7409d = bVar2;
        this.f7410e = bVar3;
    }
}

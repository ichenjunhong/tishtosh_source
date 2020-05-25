package com.airbnb.lottie.p108c.p110b;

import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2310k;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.c.b.h */
public final class C2365h implements C2358b {

    /* renamed from: a */
    public final String f7358a;

    /* renamed from: b */
    public final C2366a f7359b;

    /* renamed from: com.airbnb.lottie.c.b.h$a */
    public enum C2366a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        public static C2366a forId(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.f7359b);
        sb.append('}');
        return sb.toString();
    }

    public C2365h(String str, C2366a aVar) {
        this.f7358a = str;
        this.f7359b = aVar;
    }

    /* renamed from: a */
    public final C2301b mo6738a(C2455g gVar, C2382a aVar) {
        if (gVar.f7580k) {
            return new C2310k(this);
        }
        C2340c.m6968a("Animation contains merge paths but they are disabled.");
        return null;
    }
}

package com.p683ss.android.ugc.aweme.tutorial.p2374a;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.c */
public final class C47376c {

    /* renamed from: a */
    public final String f119555a;

    /* renamed from: b */
    public final int f119556b;

    public C47376c() {
        this(null, 0, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47376c) {
                C47376c cVar = (C47376c) obj;
                if (C52711k.m112239a((Object) this.f119555a, (Object) cVar.f119555a)) {
                    if (this.f119556b == cVar.f119556b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f119555a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f119556b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialCategory(tutorialCategoryName=");
        sb.append(this.f119555a);
        sb.append(", tutorialCategoryKey=");
        sb.append(this.f119556b);
        sb.append(")");
        return sb.toString();
    }

    public C47376c(String str, int i) {
        C52711k.m112240b(str, "tutorialCategoryName");
        this.f119555a = str;
        this.f119556b = i;
    }

    private /* synthetic */ C47376c(String str, int i, int i2, C52707g gVar) {
        this("", 0);
    }
}

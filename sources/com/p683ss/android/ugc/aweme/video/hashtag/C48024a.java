package com.p683ss.android.ugc.aweme.video.hashtag;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.a */
public final class C48024a {

    /* renamed from: a */
    public int f120700a;

    /* renamed from: b */
    public int f120701b;

    /* renamed from: c */
    public String f120702c;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.a$a */
    public static class C48025a implements Comparator<C48024a> {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C48024a aVar = (C48024a) obj;
            C48024a aVar2 = (C48024a) obj2;
            if (aVar.f120700a == aVar2.f120700a) {
                return 0;
            }
            if (aVar.f120700a < aVar2.f120700a) {
                return -1;
            }
            return 1;
        }
    }

    public C48024a() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f120700a), Integer.valueOf(this.f120701b), this.f120702c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f120702c);
        sb.append(": ");
        sb.append(this.f120700a);
        sb.append(", ");
        sb.append(this.f120701b);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C48024a aVar = (C48024a) obj;
        if (this.f120700a == aVar.f120700a && this.f120701b == aVar.f120701b && (this.f120702c == aVar.f120702c || (this.f120702c != null && this.f120702c.equals(aVar.f120702c)))) {
            return true;
        }
        return false;
    }

    public C48024a(String str, int i, int i2) {
        this.f120702c = str;
        this.f120700a = i;
        this.f120701b = i2;
    }
}

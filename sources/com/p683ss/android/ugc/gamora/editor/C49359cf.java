package com.p683ss.android.ugc.gamora.editor;

import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.cf */
public final class C49359cf {

    /* renamed from: d */
    public static final List<Integer> f123920d = C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)});

    /* renamed from: e */
    public static final C49360a f123921e = new C49360a(null);

    /* renamed from: a */
    public final int f123922a;

    /* renamed from: b */
    public final int f123923b;

    /* renamed from: c */
    public final int f123924c;

    /* renamed from: com.ss.android.ugc.gamora.editor.cf$a */
    public static final class C49360a {
        private C49360a() {
        }

        /* renamed from: a */
        public static List<Integer> m106441a() {
            return C49359cf.f123920d;
        }

        public /* synthetic */ C49360a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49359cf) {
                C49359cf cfVar = (C49359cf) obj;
                if (this.f123922a == cfVar.f123922a) {
                    if (this.f123923b == cfVar.f123923b) {
                        if (this.f123924c == cfVar.f123924c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f123922a * 31) + this.f123923b) * 31) + this.f123924c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditToolbarItemModel(type=");
        sb.append(this.f123922a);
        sb.append(", iconRes=");
        sb.append(this.f123923b);
        sb.append(", textRes=");
        sb.append(this.f123924c);
        sb.append(")");
        return sb.toString();
    }

    public C49359cf(int i, int i2, int i3) {
        this.f123922a = i;
        this.f123923b = i2;
        this.f123924c = i3;
    }
}

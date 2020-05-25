package com.p683ss.android.ugc.gamora.recorder.p2465b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.d */
public final class C49579d {

    /* renamed from: a */
    public int f124358a;

    /* renamed from: b */
    public final String f124359b;

    /* renamed from: c */
    public final String f124360c;

    /* renamed from: d */
    public final String f124361d;

    /* renamed from: e */
    public final boolean f124362e;

    /* renamed from: f */
    public final C49605j f124363f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49579d) {
                C49579d dVar = (C49579d) obj;
                if (C52711k.m112239a((Object) this.f124359b, (Object) dVar.f124359b) && C52711k.m112239a((Object) this.f124360c, (Object) dVar.f124360c) && C52711k.m112239a((Object) this.f124361d, (Object) dVar.f124361d)) {
                    if (!(this.f124362e == dVar.f124362e) || !C52711k.m112239a((Object) this.f124363f, (Object) dVar.f124363f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f124359b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124360c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f124361d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f124362e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        C49605j jVar = this.f124363f;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabItem(text=");
        sb.append(this.f124359b);
        sb.append(", tag=");
        sb.append(this.f124360c);
        sb.append(", shootMode=");
        sb.append(this.f124361d);
        sb.append(", defaultSelected=");
        sb.append(this.f124362e);
        sb.append(", listener=");
        sb.append(this.f124363f);
        sb.append(")");
        return sb.toString();
    }

    public C49579d(String str, String str2, String str3, boolean z, C49605j jVar) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(str3, "shootMode");
        this.f124359b = str;
        this.f124360c = str2;
        this.f124361d = str3;
        this.f124362e = z;
        this.f124363f = jVar;
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.p2195a;

import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a */
public final class C43488a implements C45868a {

    /* renamed from: a */
    public int f109963a;

    /* renamed from: b */
    public int f109964b;

    /* renamed from: c */
    public float f109965c;

    /* renamed from: d */
    public float f109966d;

    /* renamed from: e */
    public float f109967e;

    /* renamed from: f */
    public float f109968f;

    public C43488a() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43488a) {
                C43488a aVar = (C43488a) obj;
                if (this.f109963a == aVar.f109963a) {
                    if (!((this.f109964b == aVar.f109964b) && Float.compare(this.f109965c, aVar.f109965c) == 0 && Float.compare(this.f109966d, aVar.f109966d) == 0 && Float.compare(this.f109967e, aVar.f109967e) == 0 && Float.compare(this.f109968f, aVar.f109968f) == 0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.f109963a * 31) + this.f109964b) * 31) + Float.floatToIntBits(this.f109965c)) * 31) + Float.floatToIntBits(this.f109966d)) * 31) + Float.floatToIntBits(this.f109967e)) * 31) + Float.floatToIntBits(this.f109968f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoStickerTimeEditData(startTime=");
        sb.append(this.f109963a);
        sb.append(", endTime=");
        sb.append(this.f109964b);
        sb.append(", rotate=");
        sb.append(this.f109965c);
        sb.append(", scale=");
        sb.append(this.f109966d);
        sb.append(", xPercent=");
        sb.append(this.f109967e);
        sb.append(", yPercent=");
        sb.append(this.f109968f);
        sb.append(")");
        return sb.toString();
    }

    public C43488a(int i, int i2, float f, float f2, float f3, float f4) {
        this.f109963a = i;
        this.f109964b = i2;
        this.f109965c = f;
        this.f109966d = f2;
        this.f109967e = f3;
        this.f109968f = f4;
    }

    private /* synthetic */ C43488a(int i, int i2, float f, float f2, float f3, float f4, int i3, C52707g gVar) {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}

package com.bytedance.android.livesdk.app.dataholder;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.f */
public final class C4640f implements Cloneable {

    /* renamed from: a */
    public long[] f12683a;

    /* renamed from: b */
    public long[] f12684b;

    /* renamed from: c */
    public int f12685c;

    public C4640f() {
        this(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C4640f clone() {
        try {
            C4640f fVar = (C4640f) super.clone();
            try {
                fVar.f12683a = (long[]) this.f12683a.clone();
                fVar.f12684b = (long[]) this.f12684b.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f12685c <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12685c * 28);
        sb.append('{');
        for (int i = 0; i < this.f12685c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f12683a[i]);
            sb.append('=');
            sb.append(this.f12684b[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    private C4640f(int i) {
        int a = C4636b.m11112a(10);
        this.f12683a = new long[a];
        this.f12684b = new long[a];
        this.f12685c = 0;
    }
}

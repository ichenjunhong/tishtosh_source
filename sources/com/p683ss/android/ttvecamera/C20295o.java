package com.p683ss.android.ttvecamera;

/* renamed from: com.ss.android.ttvecamera.o */
public final class C20295o {

    /* renamed from: a */
    public int f55772a;

    /* renamed from: b */
    public int f55773b;

    /* renamed from: c */
    public int f55774c = 1;

    public final int hashCode() {
        return (this.f55772a * 65537) + 1 + this.f55773b;
    }

    /* renamed from: a */
    public final int[] mo42932a() {
        return new int[]{this.f55772a / this.f55774c, this.f55773b / this.f55774c};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f55772a / this.f55774c);
        sb.append(":");
        sb.append(this.f55773b / this.f55774c);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20295o)) {
            return false;
        }
        C20295o oVar = (C20295o) obj;
        if (this.f55772a == oVar.f55772a && this.f55773b == oVar.f55773b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int[] mo42933a(int i) {
        return new int[]{(this.f55772a / this.f55774c) * i, (this.f55773b / this.f55774c) * i};
    }

    public C20295o(int i, int i2) {
        this.f55772a = i;
        this.f55773b = 30;
        this.f55774c = 1;
    }
}

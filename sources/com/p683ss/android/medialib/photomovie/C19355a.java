package com.p683ss.android.medialib.photomovie;

/* renamed from: com.ss.android.medialib.photomovie.a */
public final class C19355a {

    /* renamed from: a */
    public int f53516a;

    /* renamed from: b */
    public int f53517b;

    /* renamed from: c */
    public int f53518c;

    public C19355a() {
        this.f53516a = 1;
        this.f53517b = 2500;
        this.f53518c = 500;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":");
        sb.append(this.f53516a);
        sb.append(",\"photoTime\":");
        sb.append(this.f53517b);
        sb.append(",\"transitionTime\":");
        sb.append(this.f53518c);
        sb.append('}');
        return sb.toString();
    }

    public C19355a(int i, int i2, int i3) {
        this.f53516a = 1;
        this.f53517b = 2500;
        this.f53518c = 500;
        this.f53516a = 1;
        this.f53517b = i2;
        this.f53518c = 500;
    }
}

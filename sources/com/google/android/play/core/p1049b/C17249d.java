package com.google.android.play.core.p1049b;

/* renamed from: com.google.android.play.core.b.d */
public final class C17249d extends C17247b {

    /* renamed from: a */
    private final int f48717a;

    /* renamed from: b */
    private final long f48718b;

    /* renamed from: c */
    private final long f48719c;

    /* renamed from: d */
    private final int f48720d;

    /* renamed from: e */
    private final String f48721e;

    public C17249d(int i, long j, long j2, int i2, String str) {
        this.f48717a = i;
        this.f48718b = j;
        this.f48719c = j2;
        this.f48720d = i2;
        if (str != null) {
            this.f48721e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final int mo33517a() {
        return this.f48717a;
    }

    /* renamed from: b */
    public final long mo33518b() {
        return this.f48718b;
    }

    /* renamed from: c */
    public final long mo33519c() {
        return this.f48719c;
    }

    /* renamed from: d */
    public final int mo33520d() {
        return this.f48720d;
    }

    /* renamed from: e */
    public final String mo33521e() {
        return this.f48721e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17247b) {
            C17247b bVar = (C17247b) obj;
            return this.f48717a == bVar.mo33517a() && this.f48718b == bVar.mo33518b() && this.f48719c == bVar.mo33519c() && this.f48720d == bVar.mo33520d() && this.f48721e.equals(bVar.mo33521e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f48717a ^ 1000003) * 1000003) ^ ((int) ((this.f48718b >>> 32) ^ this.f48718b))) * 1000003) ^ ((int) ((this.f48719c >>> 32) ^ this.f48719c))) * 1000003) ^ this.f48720d) * 1000003) ^ this.f48721e.hashCode();
    }

    public final String toString() {
        int i = this.f48717a;
        long j = this.f48718b;
        long j2 = this.f48719c;
        int i2 = this.f48720d;
        String str = this.f48721e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

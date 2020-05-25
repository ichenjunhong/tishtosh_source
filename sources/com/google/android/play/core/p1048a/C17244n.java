package com.google.android.play.core.p1048a;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.a.n */
final class C17244n extends C17231a {

    /* renamed from: a */
    private final String f48705a;

    /* renamed from: b */
    private final int f48706b;

    /* renamed from: c */
    private final int f48707c;

    /* renamed from: d */
    private final int f48708d;

    /* renamed from: e */
    private final int f48709e;

    /* renamed from: f */
    private final long f48710f;

    /* renamed from: g */
    private final long f48711g;

    /* renamed from: h */
    private final PendingIntent f48712h;

    /* renamed from: i */
    private final PendingIntent f48713i;

    C17244n(String str, int i, int i2, int i3, int i4, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (str != null) {
            this.f48705a = str;
            this.f48706b = i;
            this.f48707c = i2;
            this.f48708d = i3;
            this.f48709e = i4;
            this.f48710f = j;
            this.f48711g = j2;
            this.f48712h = pendingIntent;
            this.f48713i = pendingIntent2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo33491a() {
        return this.f48705a;
    }

    /* renamed from: b */
    public final int mo33493b() {
        return this.f48706b;
    }

    /* renamed from: c */
    public final int mo33494c() {
        return this.f48707c;
    }

    /* renamed from: d */
    public final int mo33495d() {
        return this.f48708d;
    }

    /* renamed from: e */
    public final int mo33496e() {
        return this.f48709e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17231a) {
            C17231a aVar = (C17231a) obj;
            return this.f48705a.equals(aVar.mo33491a()) && this.f48706b == aVar.mo33493b() && this.f48707c == aVar.mo33494c() && this.f48708d == aVar.mo33495d() && this.f48709e == aVar.mo33496e() && this.f48710f == aVar.mo33497f() && this.f48711g == aVar.mo33498g() && (this.f48712h != null ? this.f48712h.equals(aVar.mo33499h()) : aVar.mo33499h() == null) && (this.f48713i != null ? this.f48713i.equals(aVar.mo33500i()) : aVar.mo33500i() == null);
        }
    }

    /* renamed from: f */
    public final long mo33497f() {
        return this.f48710f;
    }

    /* renamed from: g */
    public final long mo33498g() {
        return this.f48711g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final PendingIntent mo33499h() {
        return this.f48712h;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((this.f48705a.hashCode() ^ 1000003) * 1000003) ^ this.f48706b) * 1000003) ^ this.f48707c) * 1000003) ^ this.f48708d) * 1000003) ^ this.f48709e) * 1000003) ^ ((int) ((this.f48710f >>> 32) ^ this.f48710f))) * 1000003) ^ ((int) ((this.f48711g >>> 32) ^ this.f48711g))) * 1000003) ^ (this.f48712h == null ? 0 : this.f48712h.hashCode())) * 1000003;
        if (this.f48713i != null) {
            i = this.f48713i.hashCode();
        }
        return hashCode ^ i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final PendingIntent mo33500i() {
        return this.f48713i;
    }

    public final String toString() {
        String str = this.f48705a;
        int i = this.f48706b;
        int i2 = this.f48707c;
        int i3 = this.f48708d;
        int i4 = this.f48709e;
        long j = this.f48710f;
        long j2 = this.f48711g;
        String valueOf = String.valueOf(this.f48712h);
        String valueOf2 = String.valueOf(this.f48713i);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 288 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

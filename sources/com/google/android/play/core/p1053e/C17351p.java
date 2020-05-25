package com.google.android.play.core.p1053e;

import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

/* renamed from: com.google.android.play.core.e.p */
final class C17351p extends C17342g {

    /* renamed from: a */
    private final int f48855a;

    /* renamed from: b */
    private final int f48856b;

    /* renamed from: c */
    private final int f48857c;

    /* renamed from: d */
    private final long f48858d;

    /* renamed from: e */
    private final long f48859e;

    /* renamed from: f */
    private final List<String> f48860f;

    /* renamed from: g */
    private final List<String> f48861g;

    /* renamed from: h */
    private final PendingIntent f48862h;

    /* renamed from: i */
    private final List<Intent> f48863i;

    C17351p(int i, int i2, int i3, long j, long j2, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f48855a = i;
        this.f48856b = i2;
        this.f48857c = i3;
        this.f48858d = j;
        this.f48859e = j2;
        this.f48860f = list;
        this.f48861g = list2;
        this.f48862h = pendingIntent;
        this.f48863i = list3;
    }

    /* renamed from: a */
    public final int mo33633a() {
        return this.f48855a;
    }

    /* renamed from: b */
    public final int mo33634b() {
        return this.f48856b;
    }

    /* renamed from: c */
    public final int mo33635c() {
        return this.f48857c;
    }

    /* renamed from: d */
    public final long mo33636d() {
        return this.f48858d;
    }

    /* renamed from: e */
    public final long mo33637e() {
        return this.f48859e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17342g) {
            C17342g gVar = (C17342g) obj;
            return this.f48855a == gVar.mo33633a() && this.f48856b == gVar.mo33634b() && this.f48857c == gVar.mo33635c() && this.f48858d == gVar.mo33636d() && this.f48859e == gVar.mo33637e() && (this.f48860f != null ? this.f48860f.equals(gVar.mo33638f()) : gVar.mo33638f() == null) && (this.f48861g != null ? this.f48861g.equals(gVar.mo33639g()) : gVar.mo33639g() == null) && (this.f48862h != null ? this.f48862h.equals(gVar.mo33642j()) : gVar.mo33642j() == null) && (this.f48863i != null ? this.f48863i.equals(gVar.mo33643k()) : gVar.mo33643k() == null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final List<String> mo33638f() {
        return this.f48860f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final List<String> mo33639g() {
        return this.f48861g;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((this.f48855a ^ 1000003) * 1000003) ^ this.f48856b) * 1000003) ^ this.f48857c) * 1000003) ^ ((int) ((this.f48858d >>> 32) ^ this.f48858d))) * 1000003) ^ ((int) ((this.f48859e >>> 32) ^ this.f48859e))) * 1000003) ^ (this.f48860f == null ? 0 : this.f48860f.hashCode())) * 1000003) ^ (this.f48861g == null ? 0 : this.f48861g.hashCode())) * 1000003) ^ (this.f48862h == null ? 0 : this.f48862h.hashCode())) * 1000003;
        if (this.f48863i != null) {
            i = this.f48863i.hashCode();
        }
        return hashCode ^ i;
    }

    /* renamed from: j */
    public final PendingIntent mo33642j() {
        return this.f48862h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final List<Intent> mo33643k() {
        return this.f48863i;
    }

    public final String toString() {
        int i = this.f48855a;
        int i2 = this.f48856b;
        int i3 = this.f48857c;
        long j = this.f48858d;
        long j2 = this.f48859e;
        String valueOf = String.valueOf(this.f48860f);
        String valueOf2 = String.valueOf(this.f48861g);
        String valueOf3 = String.valueOf(this.f48862h);
        String valueOf4 = String.valueOf(this.f48863i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 251 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

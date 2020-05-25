package com.p683ss.android.ugc.aweme;

import com.p683ss.android.ugc.aweme.p1807im.service.C35430c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35423b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bg */
public final class C23791bg {

    /* renamed from: a */
    public int f63393a;

    /* renamed from: b */
    public boolean f63394b;

    /* renamed from: c */
    public String f63395c;

    /* renamed from: d */
    public Object f63396d;

    /* renamed from: e */
    public C35423b f63397e;

    /* renamed from: f */
    public C35430c f63398f;

    public C23791bg() {
        this(0, false, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23791bg) {
                C23791bg bgVar = (C23791bg) obj;
                if (this.f63393a == bgVar.f63393a) {
                    if (!(this.f63394b == bgVar.f63394b) || !C52711k.m112239a((Object) this.f63395c, (Object) bgVar.f63395c) || !C52711k.m112239a(this.f63396d, bgVar.f63396d) || !C52711k.m112239a((Object) this.f63397e, (Object) bgVar.f63397e) || !C52711k.m112239a((Object) this.f63398f, (Object) bgVar.f63398f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f63393a * 31;
        boolean z = this.f63394b;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.f63395c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.f63396d;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        C35423b bVar = this.f63397e;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C35430c cVar = this.f63398f;
        if (cVar != null) {
            i3 = cVar.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallXParamas(type=");
        sb.append(this.f63393a);
        sb.append(", useNewDialogStyle=");
        sb.append(this.f63394b);
        sb.append(", newDialogMsg=");
        sb.append(this.f63395c);
        sb.append(", extra=");
        sb.append(this.f63396d);
        sb.append(", callback=");
        sb.append(this.f63397e);
        sb.append(", downloadApkListener=");
        sb.append(this.f63398f);
        sb.append(")");
        return sb.toString();
    }

    public C23791bg(int i, boolean z, String str, Object obj, C35423b bVar, C35430c cVar) {
        this.f63393a = i;
        this.f63394b = z;
        this.f63395c = str;
        this.f63396d = obj;
        this.f63397e = bVar;
        this.f63398f = cVar;
    }

    private /* synthetic */ C23791bg(int i, boolean z, String str, Object obj, C35423b bVar, C35430c cVar, int i2, C52707g gVar) {
        this(0, false, null, null, null, null);
    }
}

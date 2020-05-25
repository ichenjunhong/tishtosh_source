package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hr */
public class C16755hr {

    /* renamed from: d */
    private static final C16721gq f47119d = C16721gq.m40216a();

    /* renamed from: a */
    C16691fs f47120a;

    /* renamed from: b */
    volatile C16775ik f47121b;

    /* renamed from: c */
    volatile C16691fs f47122c;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16755hr)) {
            return false;
        }
        C16755hr hrVar = (C16755hr) obj;
        C16775ik ikVar = this.f47121b;
        C16775ik ikVar2 = hrVar.f47121b;
        if (ikVar == null && ikVar2 == null) {
            return mo32258c().equals(hrVar.mo32258c());
        }
        if (ikVar != null && ikVar2 != null) {
            return ikVar.equals(ikVar2);
        }
        if (ikVar != null) {
            return ikVar.equals(hrVar.m40331a(ikVar.mo32234j()));
        }
        return m40331a(ikVar2.mo32234j()).equals(ikVar2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C16775ik m40331a(com.google.android.gms.internal.measurement.C16775ik r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.ik r0 = r1.f47121b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.ik r0 = r1.f47121b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f47121b = r2     // Catch:{ hk -> 0x0012 }
            com.google.android.gms.internal.measurement.fs r0 = com.google.android.gms.internal.measurement.C16691fs.zzbtq     // Catch:{ hk -> 0x0012 }
            r1.f47122c = r0     // Catch:{ hk -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f47121b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.fs r2 = com.google.android.gms.internal.measurement.C16691fs.zzbtq     // Catch:{ all -> 0x001a }
            r1.f47122c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.ik r2 = r1.f47121b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16755hr.m40331a(com.google.android.gms.internal.measurement.ik):com.google.android.gms.internal.measurement.ik");
    }

    /* renamed from: b */
    public final int mo32257b() {
        if (this.f47122c != null) {
            return this.f47122c.size();
        }
        if (this.f47121b != null) {
            return this.f47121b.mo32230g();
        }
        return 0;
    }

    /* renamed from: c */
    public final C16691fs mo32258c() {
        if (this.f47122c != null) {
            return this.f47122c;
        }
        synchronized (this) {
            if (this.f47122c != null) {
                C16691fs fsVar = this.f47122c;
                return fsVar;
            }
            if (this.f47121b == null) {
                this.f47122c = C16691fs.zzbtq;
            } else {
                this.f47122c = this.f47121b.mo31987c();
            }
            C16691fs fsVar2 = this.f47122c;
            return fsVar2;
        }
    }
}

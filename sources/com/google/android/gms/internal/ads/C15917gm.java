package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.formats.C14916b.C14917a;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.ads.formats.C14930i;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.gm */
public final class C15917gm extends C14930i {

    /* renamed from: a */
    private final C15914gj f44995a;

    /* renamed from: b */
    private final List<C14918b> f44996b = new ArrayList();

    /* renamed from: c */
    private final C15869es f44997c;

    /* renamed from: d */
    private final C14937i f44998d = new C14937i();

    /* renamed from: e */
    private final C14917a f44999e;

    /* renamed from: f */
    private final List<Object> f45000f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[Catch:{ RemoteException -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6 A[Catch:{ RemoteException -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15917gm(com.google.android.gms.internal.ads.C15914gj r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f44996b = r0
            com.google.android.gms.ads.i r0 = new com.google.android.gms.ads.i
            r0.<init>()
            r4.f44998d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f45000f = r0
            r4.f44995a = r5
            r5 = 0
            com.google.android.gms.internal.ads.gj r0 = r4.f44995a     // Catch:{ RemoteException -> 0x005c }
            java.util.List r0 = r0.mo30938f()     // Catch:{ RemoteException -> 0x005c }
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x005c }
        L_0x0027:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x005c }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005c }
            if (r2 == 0) goto L_0x004e
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x004e
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x005c }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C15865eo     // Catch:{ RemoteException -> 0x005c }
            if (r3 == 0) goto L_0x0047
            r1 = r2
            com.google.android.gms.internal.ads.eo r1 = (com.google.android.gms.internal.ads.C15865eo) r1     // Catch:{ RemoteException -> 0x005c }
            goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.eq r2 = new com.google.android.gms.internal.ads.eq     // Catch:{ RemoteException -> 0x005c }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            if (r1 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.b$b> r2 = r4.f44996b     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads.es r3 = new com.google.android.gms.internal.ads.es     // Catch:{ RemoteException -> 0x005c }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r2.add(r3)     // Catch:{ RemoteException -> 0x005c }
            goto L_0x0027
        L_0x005c:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x0062:
            com.google.android.gms.internal.ads.gj r0 = r4.f44995a     // Catch:{ RemoteException -> 0x0091 }
            java.util.List r0 = r0.mo30989g()     // Catch:{ RemoteException -> 0x0091 }
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0091 }
        L_0x006e:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0091 }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0091 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0091 }
            if (r2 == 0) goto L_0x0083
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.ag r1 = com.google.android.gms.internal.ads.C15574ah.m32886a(r1)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0084
        L_0x0083:
            r1 = r5
        L_0x0084:
            if (r1 == 0) goto L_0x006e
            java.util.List<java.lang.Object> r2 = r4.f45000f     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.aj r3 = new com.google.android.gms.internal.ads.aj     // Catch:{ RemoteException -> 0x0091 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0091 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x006e
        L_0x0091:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x0097:
            com.google.android.gms.internal.ads.gj r0 = r4.f44995a     // Catch:{ RemoteException -> 0x00a5 }
            com.google.android.gms.internal.ads.eo r0 = r0.mo30992j()     // Catch:{ RemoteException -> 0x00a5 }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.es r1 = new com.google.android.gms.internal.ads.es     // Catch:{ RemoteException -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x00ab:
            r1 = r5
        L_0x00ac:
            r4.f44997c = r1
            com.google.android.gms.internal.ads.gj r0 = r4.f44995a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.ek r0 = r0.mo31003u()     // Catch:{ RemoteException -> 0x00c3 }
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.internal.ads.en r0 = new com.google.android.gms.internal.ads.en     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.gj r1 = r4.f44995a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.ek r1 = r1.mo31003u()     // Catch:{ RemoteException -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c3 }
            r5 = r0
            goto L_0x00c9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x00c9:
            r4.f44999e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15917gm.<init>(com.google.android.gms.internal.ads.gj):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final C14882b mo27393k() {
        try {
            return this.f44995a.mo30999q();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: l */
    public final Object mo27394l() {
        try {
            C14882b r = this.f44995a.mo31000r();
            if (r != null) {
                return C14886d.m30545a(r);
            }
        } catch (RemoteException e) {
            afc.m32793b("", e);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo27383a() {
        try {
            return this.f44995a.mo30982a();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final List<C14918b> mo27384b() {
        return this.f44996b;
    }

    /* renamed from: c */
    public final String mo27385c() {
        try {
            return this.f44995a.mo30991i();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final C14918b mo27386d() {
        return this.f44997c;
    }

    /* renamed from: e */
    public final String mo27387e() {
        try {
            return this.f44995a.mo30993k();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final Double mo27389g() {
        try {
            double m = this.f44995a.mo30995m();
            if (m == -1.0d) {
                return null;
            }
            return Double.valueOf(m);
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final String mo27390h() {
        try {
            return this.f44995a.mo30996n();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo27391i() {
        try {
            return this.f44995a.mo30997o();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C14937i mo27392j() {
        try {
            if (this.f44995a.mo30998p() != null) {
                this.f44998d.mo27431a(this.f44995a.mo30998p());
            }
        } catch (RemoteException e) {
            afc.m32793b("Exception occurred while getting video controller", e);
        }
        return this.f44998d;
    }

    /* renamed from: f */
    public final String mo27388f() {
        try {
            return this.f44995a.mo30994l();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }
}

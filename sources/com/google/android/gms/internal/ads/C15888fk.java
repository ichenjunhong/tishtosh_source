package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C14937i;
import com.google.android.gms.ads.formats.C14916b.C14917a;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.ads.formats.C14925g;
import com.google.android.gms.p1027a.C14882b;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.fk */
public final class C15888fk extends C14925g {

    /* renamed from: a */
    private final C15885fh f44985a;

    /* renamed from: b */
    private final List<C14918b> f44986b = new ArrayList();

    /* renamed from: c */
    private final C15869es f44987c;

    /* renamed from: d */
    private final C14937i f44988d = new C14937i();

    /* renamed from: e */
    private final C14917a f44989e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15888fk(com.google.android.gms.internal.ads.C15885fh r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f44986b = r0
            com.google.android.gms.ads.i r0 = new com.google.android.gms.ads.i
            r0.<init>()
            r4.f44988d = r0
            r4.f44985a = r5
            r5 = 0
            com.google.android.gms.internal.ads.fh r0 = r4.f44985a     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.mo30938f()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C15865eo     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.eo r1 = (com.google.android.gms.internal.ads.C15865eo) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.eq r2 = new com.google.android.gms.internal.ads.eq     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.b$b> r2 = r4.f44986b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.es r3 = new com.google.android.gms.internal.ads.es     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.fh r0 = r4.f44985a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.eo r0 = r0.mo30960j()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.es r1 = new com.google.android.gms.internal.ads.es     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.f44987c = r1
            com.google.android.gms.internal.ads.fh r0 = r4.f44985a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.ek r0 = r0.mo30966p()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.en r0 = new com.google.android.gms.internal.ads.en     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.fh r1 = r4.f44985a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.ek r1 = r1.mo30966p()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afc.m32793b(r1, r0)
        L_0x008d:
            r4.f44989e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15888fk.<init>(com.google.android.gms.internal.ads.fh):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C14882b mo27346a() {
        try {
            return this.f44985a.mo30964n();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo27375b() {
        try {
            return this.f44985a.mo30953a();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C14918b> mo27376c() {
        return this.f44986b;
    }

    /* renamed from: d */
    public final CharSequence mo27377d() {
        try {
            return this.f44985a.mo30959i();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C14918b mo27378e() {
        return this.f44987c;
    }

    /* renamed from: f */
    public final CharSequence mo27379f() {
        try {
            return this.f44985a.mo30961k();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final CharSequence mo27380g() {
        try {
            return this.f44985a.mo30962l();
        } catch (RemoteException e) {
            afc.m32793b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C14937i mo27381h() {
        try {
            if (this.f44985a.mo30963m() != null) {
                this.f44988d.mo27431a(this.f44985a.mo30963m());
            }
        } catch (RemoteException e) {
            afc.m32793b("Exception occurred while getting video controller", e);
        }
        return this.f44988d;
    }
}

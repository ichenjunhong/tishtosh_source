package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.common.util.C15514e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cu */
public final class C17055cu extends C17076do {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public C17124i f48131a;

    /* renamed from: b */
    public volatile Boolean f48132b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C17068dg f48133c;

    /* renamed from: d */
    private final C17119fc f48134d;

    /* renamed from: e */
    private final C17086dy f48135e;

    /* renamed from: f */
    private final List<Runnable> f48136f = new ArrayList();

    /* renamed from: g */
    private final C17119fc f48137g;

    protected C17055cu(C17005ay ayVar) {
        super(ayVar);
        this.f48135e = new C17086dy(ayVar.mo32849l());
        this.f48133c = new C17068dg(this);
        this.f48134d = new C17056cv(this, ayVar);
        this.f48137g = new C17060cz(this, ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo32997t() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo33035v() {
        mo32840c();
        mo33068C();
        return this.f48131a != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo33036w() {
        mo32840c();
        mo33068C();
        m41435a((Runnable) new C17062da(this, m41433a(true)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33028a(C17124i iVar, AbstractSafeParcelable abstractSafeParcelable, zzk zzk) {
        int i;
        mo32840c();
        mo33068C();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List a = mo32846i().mo33358a(100);
            if (a != null) {
                arrayList.addAll(a);
                i = a.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzag) {
                    try {
                        iVar.mo32950a((zzag) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e) {
                        mo32854q().f48445b.mo33377a("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzfv) {
                    try {
                        iVar.mo32952a((zzfv) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e2) {
                        mo32854q().f48445b.mo33377a("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzo) {
                    try {
                        iVar.mo32955a((zzo) abstractSafeParcelable2, zzk);
                    } catch (RemoteException e3) {
                        mo32854q().f48445b.mo33377a("Failed to send conditional property to the service", e3);
                    }
                } else {
                    mo32854q().f48445b.mo33376a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33029a(zzag zzag, String str) {
        boolean z;
        C15464q.m32123a(zzag);
        mo32840c();
        mo33068C();
        C17129n i = mo32846i();
        Parcel obtain = Parcel.obtain();
        zzag.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.mo32854q().f48448e.mo33376a("Event is too long for local database. Sending event directly to service");
            z = false;
        } else {
            z = i.mo33359a(0, marshall);
        }
        C17063db dbVar = new C17063db(this, true, z, zzag, m41433a(true), str);
        m41435a((Runnable) dbVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33031a(zzo zzo) {
        boolean z;
        C15464q.m32123a(zzo);
        mo32840c();
        mo33068C();
        C17129n i = mo32846i();
        i.mo32852o();
        byte[] a = C17102em.m41665a((Parcelable) zzo);
        if (a.length > 131072) {
            i.mo32854q().f48448e.mo33376a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = i.mo33359a(2, a);
        }
        C17064dc dcVar = new C17064dc(this, true, z, new zzo(zzo), m41433a(true), zzo);
        m41435a((Runnable) dcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33033a(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        mo32840c();
        mo33068C();
        C17065dd ddVar = new C17065dd(this, atomicReference, str, str2, str3, m41433a(false));
        m41435a((Runnable) ddVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33034a(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        mo32840c();
        mo33068C();
        C17066de deVar = new C17066de(this, atomicReference, str, str2, str3, z, m41433a(false));
        m41435a((Runnable) deVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33030a(zzfv zzfv) {
        boolean z;
        mo32840c();
        mo33068C();
        C17129n i = mo32846i();
        Parcel obtain = Parcel.obtain();
        boolean z2 = false;
        zzfv.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.mo32854q().f48448e.mo33376a("User property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = i.mo33359a(1, marshall);
        }
        if (z) {
            z2 = true;
        }
        m41435a((Runnable) new C17067df(this, z2, zzfv, m41433a(true)));
    }

    /* renamed from: a */
    public final void mo33032a(AtomicReference<String> atomicReference) {
        mo32840c();
        mo33068C();
        m41435a((Runnable) new C17057cw(this, atomicReference, m41433a(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo33037x() {
        mo32840c();
        mo33068C();
        m41435a((Runnable) new C17058cx(this, m41433a(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33026a(C17050cp cpVar) {
        mo32840c();
        mo33068C();
        m41435a((Runnable) new C17059cy(this, cpVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m41431F() {
        mo32840c();
        this.f48135e.mo33082a();
        this.f48134d.mo33344a(((Long) C17122h.f48352P.mo33351b()).longValue());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0115  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33038y() {
        /*
            r7 = this;
            r7.mo32840c()
            r7.mo33068C()
            boolean r0 = r7.mo33035v()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r7.f48132b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0122
            r7.mo32840c()
            r7.mo33068C()
            com.google.android.gms.measurement.internal.af r0 = r7.mo32855r()
            java.lang.Boolean r0 = r0.mo32876i()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x011c
        L_0x002c:
            com.google.android.gms.measurement.internal.l r0 = r7.mo32843f()
            int r0 = r0.mo33357z()
            if (r0 != r2) goto L_0x003a
        L_0x0036:
            r0 = 1
        L_0x0037:
            r3 = 1
            goto L_0x00fb
        L_0x003a:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r3 = "Checking service availability"
            r0.mo33376a(r3)
            com.google.android.gms.measurement.internal.em r0 = r7.mo32852o()
            com.google.android.gms.common.c r3 = com.google.android.gms.common.C15369c.getInstance()
            android.content.Context r0 = r0.mo32850m()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r3.isGooglePlayServicesAvailable(r0, r4)
            r3 = 9
            if (r0 == r3) goto L_0x00ee
            r3 = 18
            if (r0 == r3) goto L_0x00e1
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x0082;
                case 3: goto L_0x0076;
                default: goto L_0x0063;
            }
        L_0x0063:
            com.google.android.gms.measurement.internal.r r3 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r3 = r3.f48448e
            java.lang.String r4 = "Unexpected service status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo33377a(r4, r0)
        L_0x0072:
            r0 = 0
        L_0x0073:
            r3 = 0
            goto L_0x00fb
        L_0x0076:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r3 = "Service disabled"
            r0.mo33376a(r3)
            goto L_0x0072
        L_0x0082:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48452i
            java.lang.String r3 = "Service container out of date"
            r0.mo33376a(r3)
            com.google.android.gms.measurement.internal.em r0 = r7.mo32852o()
            java.lang.Integer r3 = r0.f48278a
            if (r3 != 0) goto L_0x00a9
            com.google.android.gms.common.c r3 = com.google.android.gms.common.C15369c.getInstance()
            android.content.Context r4 = r0.mo32850m()
            int r3 = r3.getApkVersion(r4)
            int r3 = r3 / 1000
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.f48278a = r3
        L_0x00a9:
            java.lang.Integer r0 = r0.f48278a
            int r0 = r0.intValue()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x00b4
            goto L_0x00d1
        L_0x00b4:
            com.google.android.gms.measurement.internal.af r0 = r7.mo32855r()
            java.lang.Boolean r0 = r0.mo32876i()
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0072
        L_0x00c4:
            r0 = 1
            goto L_0x0073
        L_0x00c6:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r3 = "Service missing"
            r0.mo33376a(r3)
        L_0x00d1:
            r0 = 0
            goto L_0x0037
        L_0x00d4:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r3 = "Service available"
            r0.mo33376a(r3)
            goto L_0x0036
        L_0x00e1:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r3 = "Service updating"
            r0.mo33376a(r3)
            goto L_0x0036
        L_0x00ee:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r3 = "Service invalid"
            r0.mo33376a(r3)
            goto L_0x0072
        L_0x00fb:
            if (r0 != 0) goto L_0x0113
            com.google.android.gms.measurement.internal.eu r4 = r7.mo32856s()
            boolean r4 = r4.mo33293u()
            if (r4 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.r r3 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r3 = r3.f48445b
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo33376a(r4)
            r3 = 0
        L_0x0113:
            if (r3 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.af r3 = r7.mo32855r()
            r3.mo32864a(r0)
        L_0x011c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.f48132b = r0
        L_0x0122:
            java.lang.Boolean r0 = r7.f48132b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0192
            com.google.android.gms.measurement.internal.dg r0 = r7.f48133c
            com.google.android.gms.measurement.internal.cu r1 = r0.f48190c
            r1.mo32840c()
            com.google.android.gms.measurement.internal.cu r1 = r0.f48190c
            android.content.Context r1 = r1.mo32850m()
            monitor-enter(r0)
            boolean r3 = r0.f48188a     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x014b
            com.google.android.gms.measurement.internal.cu r1 = r0.f48190c     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j     // Catch:{ all -> 0x018f }
            java.lang.String r2 = "Connection attempt already in progress"
            r1.mo33376a(r2)     // Catch:{ all -> 0x018f }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return
        L_0x014b:
            com.google.android.gms.measurement.internal.q r3 = r0.f48189b     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x016e
            com.google.android.gms.measurement.internal.q r3 = r0.f48189b     // Catch:{ all -> 0x018f }
            boolean r3 = r3.mo28405h()     // Catch:{ all -> 0x018f }
            if (r3 != 0) goto L_0x015f
            com.google.android.gms.measurement.internal.q r3 = r0.f48189b     // Catch:{ all -> 0x018f }
            boolean r3 = r3.mo28404g()     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x016e
        L_0x015f:
            com.google.android.gms.measurement.internal.cu r1 = r0.f48190c     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j     // Catch:{ all -> 0x018f }
            java.lang.String r2 = "Already awaiting connection attempt"
            r1.mo33376a(r2)     // Catch:{ all -> 0x018f }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return
        L_0x016e:
            com.google.android.gms.measurement.internal.q r3 = new com.google.android.gms.measurement.internal.q     // Catch:{ all -> 0x018f }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x018f }
            r3.<init>(r1, r4, r0, r0)     // Catch:{ all -> 0x018f }
            r0.f48189b = r3     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.cu r1 = r0.f48190c     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j     // Catch:{ all -> 0x018f }
            java.lang.String r3 = "Connecting to remote service"
            r1.mo33376a(r3)     // Catch:{ all -> 0x018f }
            r0.f48188a = r2     // Catch:{ all -> 0x018f }
            com.google.android.gms.measurement.internal.q r1 = r0.f48189b     // Catch:{ all -> 0x018f }
            r1.mo28409l()     // Catch:{ all -> 0x018f }
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            return
        L_0x018f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018f }
            throw r1
        L_0x0192:
            com.google.android.gms.measurement.internal.eu r0 = r7.mo32856s()
            boolean r0 = r0.mo33293u()
            if (r0 != 0) goto L_0x0228
            android.content.Context r0 = r7.mo32850m()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r7.mo32850m()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x01c2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c2
            r1 = 1
        L_0x01c2:
            if (r1 == 0) goto L_0x021d
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r3 = r7.mo32850m()
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r3, r4)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.dg r1 = r7.f48133c
            com.google.android.gms.measurement.internal.cu r3 = r1.f48190c
            r3.mo32840c()
            com.google.android.gms.measurement.internal.cu r3 = r1.f48190c
            android.content.Context r3 = r3.mo32850m()
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C15497a.m32246a()
            monitor-enter(r1)
            boolean r5 = r1.f48188a     // Catch:{ all -> 0x021a }
            if (r5 == 0) goto L_0x01fe
            com.google.android.gms.measurement.internal.cu r0 = r1.f48190c     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ all -> 0x021a }
            java.lang.String r2 = "Connection attempt already in progress"
            r0.mo33376a(r2)     // Catch:{ all -> 0x021a }
            monitor-exit(r1)     // Catch:{ all -> 0x021a }
            return
        L_0x01fe:
            com.google.android.gms.measurement.internal.cu r5 = r1.f48190c     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "Using local app measurement service"
            r5.mo33376a(r6)     // Catch:{ all -> 0x021a }
            r1.f48188a = r2     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.cu r2 = r1.f48190c     // Catch:{ all -> 0x021a }
            com.google.android.gms.measurement.internal.dg r2 = r2.f48133c     // Catch:{ all -> 0x021a }
            r5 = 129(0x81, float:1.81E-43)
            r4.mo28515a(r3, r0, r2, r5)     // Catch:{ all -> 0x021a }
            monitor-exit(r1)     // Catch:{ all -> 0x021a }
            return
        L_0x021a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021a }
            throw r0
        L_0x021d:
            com.google.android.gms.measurement.internal.r r0 = r7.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo33376a(r1)
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17055cu.mo33038y():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33027a(C17124i iVar) {
        mo32840c();
        C15464q.m32123a(iVar);
        this.f48131a = iVar;
        m41431F();
        mo33025A();
    }

    /* renamed from: z */
    public final void mo33039z() {
        mo32840c();
        mo33068C();
        C17068dg dgVar = this.f48133c;
        if (dgVar.f48189b != null && (dgVar.f48189b.mo28404g() || dgVar.f48189b.mo28405h())) {
            dgVar.f48189b.mo28403f();
        }
        dgVar.f48189b = null;
        try {
            C15497a.m32246a();
            C15497a.m32247a(mo32850m(), this.f48133c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f48131a = null;
    }

    /* renamed from: a */
    private final void m41435a(Runnable runnable) throws IllegalStateException {
        mo32840c();
        if (mo33035v()) {
            runnable.run();
        } else if (((long) this.f48136f.size()) >= 1000) {
            mo32854q().f48445b.mo33376a("Discarding data. Max runnable queue size reached");
        } else {
            this.f48136f.add(runnable);
            this.f48137g.mo33344a(60000);
            mo33038y();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final void mo33025A() {
        mo32840c();
        mo32854q().f48453j.mo33377a("Processing queued up service tasks", Integer.valueOf(this.f48136f.size()));
        for (Runnable run : this.f48136f) {
            try {
                run.run();
            } catch (Exception e) {
                mo32854q().f48445b.mo33377a("Task exception while flushing queue", e);
            }
        }
        this.f48136f.clear();
        this.f48137g.mo33346c();
    }

    /* renamed from: a */
    private final zzk m41433a(boolean z) {
        return mo32843f().mo33352a(z ? mo32854q().mo33372Q_() : null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16980a mo32841d() {
        return super.mo32841d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C17038cd mo32842e() {
        return super.mo32842e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C17127l mo32843f() {
        return super.mo32843f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C17055cu mo32844g() {
        return super.mo32844g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C17051cq mo32845h() {
        return super.mo32845h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C17129n mo32846i() {
        return super.mo32846i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C17080ds mo32847j() {
        return super.mo32847j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }

    /* renamed from: a */
    static /* synthetic */ void m41434a(C17055cu cuVar, ComponentName componentName) {
        cuVar.mo32840c();
        if (cuVar.f48131a != null) {
            cuVar.f48131a = null;
            cuVar.mo32854q().f48453j.mo33377a("Disconnected from device MeasurementService", componentName);
            cuVar.mo32840c();
            cuVar.mo33038y();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m41436b(C17055cu cuVar) {
        cuVar.mo32840c();
        if (cuVar.mo33035v()) {
            cuVar.mo32854q().f48453j.mo33376a("Inactivity, disconnecting from the service");
            cuVar.mo33039z();
        }
    }
}

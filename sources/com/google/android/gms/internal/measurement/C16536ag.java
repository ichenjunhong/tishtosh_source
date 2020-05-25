package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C15089c;
import com.google.android.gms.analytics.C15095i;
import com.google.android.gms.analytics.C15096j;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ag */
final class C16536ag extends C16860r {

    /* renamed from: a */
    private boolean f46461a;

    /* renamed from: c */
    private final C16533ad f46462c;

    /* renamed from: d */
    private final C16571bo f46463d;

    /* renamed from: e */
    private final C16569bm f46464e;

    /* renamed from: f */
    private final C16867y f46465f;

    /* renamed from: g */
    private long f46466g = Long.MIN_VALUE;

    /* renamed from: h */
    private final C16552aw f46467h;

    /* renamed from: i */
    private final C16552aw f46468i;

    /* renamed from: j */
    private final C16584ca f46469j;

    /* renamed from: k */
    private long f46470k;

    /* renamed from: l */
    private boolean f46471l;

    protected C16536ag(C16862t tVar, C16864v vVar) {
        super(tVar);
        C15464q.m32123a(vVar);
        this.f46464e = new C16569bm(tVar);
        this.f46462c = new C16533ad(tVar);
        this.f46463d = new C16571bo(tVar);
        this.f46465f = new C16867y(tVar);
        this.f46469j = new C16584ca(mo32504f());
        this.f46467h = new C16537ah(this, tVar);
        this.f46468i = new C16538ai(this, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        this.f46462c.mo32517s();
        this.f46463d.mo32517s();
        this.f46465f.mo32517s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31788b() {
        mo32516r();
        C15464q.m32130a(!this.f46461a, (Object) "Analytics backend already started");
        this.f46461a = true;
        mo32509j().mo27845a((Runnable) new C16539aj(this));
    }

    /* renamed from: g */
    private final boolean m39446g(String str) {
        return C15377d.m31951a(mo32506g()).mo28316a(str) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo31789c() {
        boolean z;
        mo32516r();
        C15098l.m31266b();
        Context context = this.f47329b.f47334a;
        if (!C16577bu.m39573a(context)) {
            mo32503e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C16578bv.m39574a(context)) {
            mo32505f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        C15464q.m32123a(context);
        if (CampaignTrackingReceiver.f38939a != null) {
            z = CampaignTrackingReceiver.f38939a.booleanValue();
        } else {
            z = C16585cb.m39591a(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
            CampaignTrackingReceiver.f38939a = Boolean.valueOf(z);
        }
        if (!z) {
            mo32503e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        mo32513n().mo31840b();
        if (!m39446g("android.permission.ACCESS_NETWORK_STATE")) {
            mo32505f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m39442A();
        }
        if (!m39446g("android.permission.INTERNET")) {
            mo32505f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m39442A();
        }
        if (C16578bv.m39574a(mo32506g())) {
            mo32493b("AnalyticsService registered in the app manifest and enabled");
        } else {
            mo32503e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.f46471l && !this.f46462c.mo31774e()) {
            m39447u();
        }
        mo31792t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo31790d() {
        C15098l.m31266b();
        this.f46470k = mo32504f().mo28523a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[LOOP:1: B:15:0x0044->B:23:?, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0040 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31791e() {
        /*
            r5 = this;
            com.google.android.gms.analytics.C15098l.m31266b()
            com.google.android.gms.analytics.C15098l.m31266b()
            r5.mo32516r()
            boolean r0 = com.google.android.gms.internal.measurement.C16550au.m39480b()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService"
            r5.mo32503e(r0)
        L_0x0014:
            com.google.android.gms.internal.measurement.y r0 = r5.f46465f
            boolean r0 = r0.mo32527b()
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Service not connected"
            r5.mo32493b(r0)
            return
        L_0x0022:
            com.google.android.gms.internal.measurement.ad r0 = r5.f46462c
            boolean r0 = r0.mo31774e()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "Dispatching local hits to device AnalyticsService"
            r5.mo32493b(r0)
        L_0x002f:
            com.google.android.gms.internal.measurement.ad r0 = r5.f46462c     // Catch:{ SQLiteException -> 0x0072 }
            int r1 = com.google.android.gms.internal.measurement.C16550au.m39484f()     // Catch:{ SQLiteException -> 0x0072 }
            long r1 = (long) r1     // Catch:{ SQLiteException -> 0x0072 }
            java.util.List r0 = r0.mo31764a(r1)     // Catch:{ SQLiteException -> 0x0072 }
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x0072 }
            if (r1 == 0) goto L_0x0044
            r5.mo31792t()     // Catch:{ SQLiteException -> 0x0072 }
            return
        L_0x0044:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x002f
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.bh r1 = (com.google.android.gms.internal.measurement.C16564bh) r1
            com.google.android.gms.internal.measurement.y r2 = r5.f46465f
            boolean r2 = r2.mo32526a(r1)
            if (r2 != 0) goto L_0x005d
            r5.mo31792t()
            return
        L_0x005d:
            r0.remove(r1)
            com.google.android.gms.internal.measurement.ad r2 = r5.f46462c     // Catch:{ SQLiteException -> 0x0068 }
            long r3 = r1.f46558c     // Catch:{ SQLiteException -> 0x0068 }
            r2.mo31769b(r3)     // Catch:{ SQLiteException -> 0x0068 }
            goto L_0x0044
        L_0x0068:
            r0 = move-exception
            java.lang.String r1 = "Failed to remove hit that was send for delivery"
            r5.mo32501d(r1, r0)
            r5.m39451y()
            return
        L_0x0072:
            r0 = move-exception
            java.lang.String r1 = "Failed to read hits from store"
            r5.mo32501d(r1, r0)
            r5.m39451y()
            return
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16536ag.mo31791e():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31786a(C16865w wVar) {
        C15098l.m31266b();
        mo32494b("Sending first hit to property", wVar.f47354c);
        if (!mo32513n().mo31841c().mo31858a(C16550au.m39489l())) {
            String t = mo32513n().mo31844t();
            if (!TextUtils.isEmpty(t)) {
                C16840kr a = C16585cb.m39587a(mo32507h(), t);
                mo32494b("Found relevant installation campaign", a);
                m39444a(wVar, a);
            }
        }
    }

    /* renamed from: u */
    private final void m39447u() {
        if (!this.f46471l && C16550au.m39480b() && !this.f46465f.mo32527b()) {
            if (this.f46469j.mo31858a(((Long) C16559bc.f46505C.f46547a).longValue())) {
                this.f46469j.mo31857a();
                mo32493b("Connecting to service");
                if (this.f46465f.mo32528c()) {
                    mo32493b("Connected to service");
                    this.f46469j.mo31859b();
                    mo31791e();
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo31783a(C16865w wVar, boolean z) {
        C15464q.m32123a(wVar);
        mo32516r();
        C15098l.m31266b();
        try {
            this.f46462c.mo31768b();
            C16533ad adVar = this.f46462c;
            long j = wVar.f47352a;
            String str = wVar.f47353b;
            C15464q.m32125a(str);
            adVar.mo32516r();
            C15098l.m31266b();
            int delete = adVar.mo31777v().delete("properties", "app_uid=? AND cid<>?", new String[]{String.valueOf(j), str});
            if (delete > 0) {
                adVar.mo32490a("Deleted property records", Integer.valueOf(delete));
            }
            long a = this.f46462c.mo31763a(wVar.f47352a, wVar.f47353b, wVar.f47354c);
            wVar.f47356e = 1 + a;
            C16533ad adVar2 = this.f46462c;
            C15464q.m32123a(wVar);
            adVar2.mo32516r();
            C15098l.m31266b();
            SQLiteDatabase v = adVar2.mo31777v();
            Map<String, String> map = wVar.f47357f;
            C15464q.m32123a(map);
            Builder builder = new Builder();
            for (Entry entry : map.entrySet()) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_uid", Long.valueOf(wVar.f47352a));
            contentValues.put("cid", wVar.f47353b);
            contentValues.put("tid", wVar.f47354c);
            contentValues.put("adid", Integer.valueOf(wVar.f47355d ? 1 : 0));
            contentValues.put("hits_count", Long.valueOf(wVar.f47356e));
            contentValues.put("params", encodedQuery);
            try {
                if (v.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                    adVar2.mo32505f("Failed to insert/update a property (got -1)");
                }
            } catch (SQLiteException e) {
                adVar2.mo32501d("Error storing a property", e);
            }
            this.f46462c.mo31771c();
            try {
            } catch (SQLiteException e2) {
                mo32501d("Failed to end transaction", e2);
            }
            return a;
        } catch (SQLiteException e3) {
            mo32501d("Failed to update Analytics property", e3);
            try {
            } catch (SQLiteException e4) {
                mo32501d("Failed to end transaction", e4);
            }
            return -1;
        } finally {
            try {
                this.f46462c.mo31773d();
            } catch (SQLiteException e5) {
                mo32501d("Failed to end transaction", e5);
            }
        }
    }

    /* renamed from: a */
    public final void mo31785a(C16564bh bhVar) {
        C15464q.m32123a(bhVar);
        C15098l.m31266b();
        mo32516r();
        if (this.f46471l) {
            mo32497c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            mo32490a("Delivering hit", bhVar);
        }
        if (TextUtils.isEmpty(bhVar.mo31823a("_m", ""))) {
            Pair b = mo32513n().f46575a.mo31846b();
            if (b != null) {
                Long l = (Long) b.second;
                String str = (String) b.first;
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap(bhVar.f46556a);
                hashMap.put("_m", sb2);
                C16564bh bhVar2 = new C16564bh(this, hashMap, bhVar.f46559d, bhVar.f46561f, bhVar.f46558c, bhVar.f46560e, bhVar.f46557b);
                bhVar = bhVar2;
            }
        }
        m39447u();
        if (this.f46465f.mo32526a(bhVar)) {
            mo32497c("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        try {
            this.f46462c.mo31766a(bhVar);
            mo31792t();
        } catch (SQLiteException e) {
            mo32501d("Delivery failed to save hit to a database", e);
            mo32507h().mo31826a(bhVar, "deliver: failed to insert hit to database");
        }
    }

    /* renamed from: v */
    private final boolean m39448v() {
        C15098l.m31266b();
        mo32516r();
        mo32493b("Dispatching a batch of local hits");
        boolean z = !this.f46463d.mo31836b();
        if (!(!this.f46465f.mo32527b()) || !z) {
            long max = (long) Math.max(C16550au.m39484f(), C16550au.m39485g());
            ArrayList arrayList = new ArrayList();
            long j = 0;
            while (true) {
                this.f46462c.mo31768b();
                arrayList.clear();
                try {
                    List<C16564bh> a = this.f46462c.mo31764a(max);
                    if (a.isEmpty()) {
                        mo32493b("Store is empty, nothing to dispatch");
                        m39451y();
                        try {
                            this.f46462c.mo31771c();
                            this.f46462c.mo31773d();
                            return false;
                        } catch (SQLiteException e) {
                            mo32501d("Failed to commit local dispatch transaction", e);
                            m39451y();
                            return false;
                        }
                    } else {
                        mo32490a("Hits loaded from store. count", Integer.valueOf(a.size()));
                        for (C16564bh bhVar : a) {
                            if (bhVar.f46558c == j) {
                                mo32502d("Database contains successfully uploaded hit", Long.valueOf(j), Integer.valueOf(a.size()));
                                m39451y();
                                try {
                                    this.f46462c.mo31771c();
                                    this.f46462c.mo31773d();
                                    return false;
                                } catch (SQLiteException e2) {
                                    mo32501d("Failed to commit local dispatch transaction", e2);
                                    m39451y();
                                    return false;
                                }
                            }
                        }
                        if (this.f46465f.mo32527b()) {
                            mo32493b("Service connected, sending hits to the service");
                            while (!a.isEmpty()) {
                                C16564bh bhVar2 = (C16564bh) a.get(0);
                                if (this.f46465f.mo32526a(bhVar2)) {
                                    j = Math.max(j, bhVar2.f46558c);
                                    a.remove(bhVar2);
                                    mo32494b("Hit sent do device AnalyticsService for delivery", bhVar2);
                                    try {
                                        this.f46462c.mo31769b(bhVar2.f46558c);
                                        arrayList.add(Long.valueOf(bhVar2.f46558c));
                                    } catch (SQLiteException e3) {
                                        mo32501d("Failed to remove hit that was send for delivery", e3);
                                        m39451y();
                                        try {
                                            return false;
                                        } catch (SQLiteException e4) {
                                            mo32501d("Failed to commit local dispatch transaction", e4);
                                            m39451y();
                                            return false;
                                        }
                                    } finally {
                                        try {
                                            this.f46462c.mo31771c();
                                            this.f46462c.mo31773d();
                                        } catch (SQLiteException e5) {
                                            mo32501d("Failed to commit local dispatch transaction", e5);
                                            m39451y();
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                        if (this.f46463d.mo31836b()) {
                            List<Long> a2 = this.f46463d.mo31835a(a);
                            for (Long longValue : a2) {
                                j = Math.max(j, longValue.longValue());
                            }
                            try {
                                this.f46462c.mo31767a(a2);
                                arrayList.addAll(a2);
                            } catch (SQLiteException e6) {
                                mo32501d("Failed to remove successfully uploaded hits", e6);
                                m39451y();
                                try {
                                    this.f46462c.mo31771c();
                                    this.f46462c.mo31773d();
                                    return false;
                                } catch (SQLiteException e7) {
                                    mo32501d("Failed to commit local dispatch transaction", e7);
                                    m39451y();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                return false;
                            } catch (SQLiteException e8) {
                                mo32501d("Failed to commit local dispatch transaction", e8);
                                m39451y();
                                return false;
                            }
                        } else {
                            try {
                                this.f46462c.mo31771c();
                                this.f46462c.mo31773d();
                            } catch (SQLiteException e9) {
                                mo32501d("Failed to commit local dispatch transaction", e9);
                                m39451y();
                                return false;
                            }
                        }
                    }
                } catch (SQLiteException e10) {
                    mo32498c("Failed to read hits from persisted store", e10);
                    m39451y();
                    try {
                        this.f46462c.mo31771c();
                        this.f46462c.mo31773d();
                        return false;
                    } catch (SQLiteException e11) {
                        mo32501d("Failed to commit local dispatch transaction", e11);
                        m39451y();
                        return false;
                    }
                }
            }
        } else {
            mo32493b("No network or service available. Will retry later");
            return false;
        }
    }

    /* renamed from: a */
    public final void mo31784a(C16557ba baVar) {
        long j = this.f46470k;
        C15098l.m31266b();
        mo32516r();
        long d = mo32513n().mo31842d();
        mo32494b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(d != 0 ? Math.abs(mo32504f().mo28523a() - d) : -1));
        m39447u();
        try {
            m39448v();
            mo32513n().mo31843e();
            mo31792t();
            if (baVar != null) {
                baVar.mo31795a(null);
            }
            if (this.f46470k != j) {
                this.f46464e.mo31831c();
            }
        } catch (Exception e) {
            mo32501d("Local dispatch failed", e);
            mo32513n().mo31843e();
            mo31792t();
            if (baVar != null) {
                baVar.mo31795a(e);
            }
        }
    }

    /* renamed from: w */
    private final long m39449w() {
        C15098l.m31266b();
        mo32516r();
        try {
            return this.f46462c.mo31776u();
        } catch (SQLiteException e) {
            mo32501d("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }

    /* renamed from: t */
    public final void mo31792t() {
        long j;
        C15098l.m31266b();
        mo32516r();
        boolean z = true;
        if (!(!this.f46471l && m39452z() > 0)) {
            this.f46464e.mo31830b();
            m39451y();
        } else if (this.f46462c.mo31774e()) {
            this.f46464e.mo31830b();
            m39451y();
        } else {
            if (!((Boolean) C16559bc.f46546z.f46547a).booleanValue()) {
                this.f46464e.mo31829a();
                z = this.f46464e.mo31832d();
            }
            if (z) {
                m39450x();
                long z2 = m39452z();
                long d = mo32513n().mo31842d();
                if (d != 0) {
                    j = z2 - Math.abs(mo32504f().mo28523a() - d);
                    if (j <= 0) {
                        j = Math.min(C16550au.m39482d(), z2);
                    }
                } else {
                    j = Math.min(C16550au.m39482d(), z2);
                }
                mo32490a("Dispatch scheduled (ms)", Long.valueOf(j));
                if (this.f46467h.mo31814c()) {
                    this.f46467h.mo31813b(Math.max(1, j + this.f46467h.mo31812b()));
                } else {
                    this.f46467h.mo31811a(j);
                }
            } else {
                m39451y();
                m39450x();
            }
        }
    }

    /* renamed from: x */
    private final void m39450x() {
        C16555az l = mo32511l();
        if (l.f46498a && !l.f46499c) {
            long w = m39449w();
            if (w != 0 && Math.abs(mo32504f().mo28523a() - w) <= ((Long) C16559bc.f46528h.f46547a).longValue()) {
                mo32490a("Dispatch alarm scheduled (ms)", Long.valueOf(C16550au.m39483e()));
                l.mo31818b();
            }
        }
    }

    /* renamed from: y */
    private final void m39451y() {
        if (this.f46467h.mo31814c()) {
            mo32493b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f46467h.mo31815d();
        C16555az l = mo32511l();
        if (l.f46499c) {
            l.mo31819c();
        }
    }

    /* renamed from: z */
    private final long m39452z() {
        if (this.f46466g != Long.MIN_VALUE) {
            return this.f46466g;
        }
        long longValue = ((Long) C16559bc.f46525e.f46547a).longValue();
        C16586cc m = mo32512m();
        m.mo32516r();
        if (m.f46605a) {
            C16586cc m2 = mo32512m();
            m2.mo32516r();
            longValue = ((long) m2.f46606c) * 1000;
        }
        return longValue;
    }

    /* renamed from: a */
    public final void mo31787a(String str) {
        C15464q.m32125a(str);
        C15098l.m31266b();
        C16840kr a = C16585cb.m39587a(mo32507h(), str);
        if (a == null) {
            mo32498c("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String t = mo32513n().mo31844t();
        if (str.equals(t)) {
            mo32503e("Ignoring duplicate install campaign");
        } else if (!TextUtils.isEmpty(t)) {
            mo32502d("Ignoring multiple install campaigns. original, new", t, str);
        } else {
            mo32513n().mo31839a(str);
            if (mo32513n().mo31841c().mo31858a(C16550au.m39489l())) {
                mo32498c("Campaign received too late, ignoring", a);
                return;
            }
            mo32494b("Received installation campaign", a);
            for (C16865w a2 : this.f46462c.mo31770c(0)) {
                m39444a(a2, a);
            }
        }
    }

    /* renamed from: a */
    private final void m39444a(C16865w wVar, C16840kr krVar) {
        C15464q.m32123a(wVar);
        C15464q.m32123a(krVar);
        C15089c cVar = new C15089c(this.f47329b);
        cVar.mo27830a(wVar.f47354c);
        cVar.f38949f = wVar.f47355d;
        C15095i b = cVar.mo27831b();
        C16699g gVar = (C16699g) b.mo27839b(C16699g.class);
        gVar.f46942a = "data";
        gVar.mo32034a(true);
        b.mo27838a((C15096j) krVar);
        C16556b bVar = (C16556b) b.mo27839b(C16556b.class);
        C16808jq jqVar = (C16808jq) b.mo27839b(C16808jq.class);
        for (Entry entry : wVar.f47357f.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                jqVar.f47209a = str2;
            } else if ("av".equals(str)) {
                jqVar.f47210b = str2;
            } else if ("aid".equals(str)) {
                jqVar.f47211c = str2;
            } else if ("aiid".equals(str)) {
                jqVar.f47212d = str2;
            } else if ("uid".equals(str)) {
                gVar.f46944c = str2;
            } else {
                bVar.mo31821a(str, str2);
            }
        }
        mo32495b("Sending installation campaign to", wVar.f47354c, krVar);
        b.f38960d = mo32513n().mo31840b();
        b.mo27840b();
    }

    /* renamed from: A */
    private final void m39442A() {
        mo32516r();
        C15098l.m31266b();
        this.f46471l = true;
        this.f46465f.mo32529d();
        mo31792t();
    }

    /* renamed from: b */
    static /* synthetic */ void m39445b(C16536ag agVar) {
        try {
            agVar.f46462c.mo31775t();
            agVar.mo31792t();
        } catch (SQLiteException e) {
            agVar.mo32498c("Failed to delete stale hits", e);
        }
        agVar.f46468i.mo31811a(FbUploadTokenTime.group0);
    }
}

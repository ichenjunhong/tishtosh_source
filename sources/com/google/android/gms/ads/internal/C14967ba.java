package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.C15017n;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.ads.C15563abr;
import com.google.android.gms.internal.ads.C15806ck;
import com.google.android.gms.internal.ads.C15889fl;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C16119nz;
import com.google.android.gms.internal.ads.C16127og;
import com.google.android.gms.internal.ads.C16134on;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16302ut;
import com.google.android.gms.internal.ads.C16324vo;
import com.google.android.gms.internal.ads.C16341we;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abd;
import com.google.android.gms.internal.ads.abe;
import com.google.android.gms.internal.ads.abp;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acm;
import com.google.android.gms.internal.ads.agf;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.bye.C15742a.C15744b;
import com.google.android.gms.internal.ads.byh;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.ba */
public abstract class C14967ba extends C14939a implements C14956aq, C15017n, C16119nz {

    /* renamed from: j */
    private transient boolean f38658j;

    /* renamed from: o */
    protected final C16134on f38659o;

    public C14967ba(Context context, zzyz zzyz, String str, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        this(new C14964ay(context, zzyz, str, zzbgz), onVar, null, btVar);
    }

    private C14967ba(C14964ay ayVar, C16134on onVar, C14953an anVar, C14986bt btVar) {
        super(ayVar, null, btVar);
        this.f38659o = onVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r6.isEmpty() == false) goto L_0x00c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27586a(com.google.android.gms.internal.ads.zzyv r16, com.google.android.gms.internal.ads.C15806ck r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r15.mo27577U()
            r2 = 0
            if (r1 != 0) goto L_0x0009
            return r2
        L_0x0009:
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r1 = r1.mo28595f()
            com.google.android.gms.internal.ads.bwo r1 = r1.mo28623a()
            r3 = 0
            if (r1 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            com.google.android.gms.internal.ads.abh r4 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r4 = r4.mo28595f()
            boolean r4 = r4.mo28636c()
            if (r4 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.abh r4 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r4 = r4.mo28595f()
            boolean r4 = r4.mo28640e()
            if (r4 != 0) goto L_0x00c1
        L_0x0036:
            boolean r4 = r1.f44150b
            if (r4 == 0) goto L_0x003d
            r1.mo30829a()
        L_0x003d:
            com.google.android.gms.internal.ads.bwj r1 = r1.f44152d
            com.google.android.gms.internal.ads.bwi r1 = r1.mo30811a()
            if (r1 == 0) goto L_0x0066
            java.lang.String r4 = r1.f44121f
            java.lang.String r5 = r1.f44122g
            java.lang.String r1 = r1.f44123h
            if (r4 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.abh r6 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r6 = r6.mo28595f()
            r6.mo28626a(r4)
        L_0x0058:
            if (r1 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.abh r6 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r6 = r6.mo28595f()
            r6.mo28631b(r1)
            goto L_0x007f
        L_0x0066:
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r1 = r1.mo28595f()
            java.lang.String r4 = r1.mo28637d()
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r1 = r1.mo28595f()
            java.lang.String r1 = r1.mo28642f()
            r5 = r3
        L_0x007f:
            android.os.Bundle r6 = new android.os.Bundle
            r7 = 1
            r6.<init>(r7)
            if (r1 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r7 = r7.mo28595f()
            boolean r7 = r7.mo28640e()
            if (r7 != 0) goto L_0x009a
            java.lang.String r7 = "v_fp_vertical"
            r6.putString(r7, r1)
        L_0x009a:
            if (r4 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r1 = r1.mo28595f()
            boolean r1 = r1.mo28636c()
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "fingerprint"
            r6.putString(r1, r4)
            boolean r1 = r4.equals(r5)
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "v_fp"
            r6.putString(r1, r5)
        L_0x00ba:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r6 = r3
        L_0x00c2:
            com.google.android.gms.ads.internal.an r1 = r0.f38500d
            r1.mo27540a()
            com.google.android.gms.ads.internal.ay r1 = r0.f38501e
            r1.f38618L = r2
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15740bx.f44291bY
            com.google.android.gms.internal.ads.bu r2 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r1 = r2.mo30717a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0107
            com.google.android.gms.internal.ads.abh r1 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r1 = r1.mo28595f()
            com.google.android.gms.internal.ads.abf r1 = r1.mo28647i()
            com.google.android.gms.ads.internal.f r7 = com.google.android.gms.ads.internal.C14963ax.m30838h()
            com.google.android.gms.ads.internal.ay r2 = r0.f38501e
            android.content.Context r8 = r2.f38629c
            com.google.android.gms.ads.internal.ay r2 = r0.f38501e
            com.google.android.gms.internal.ads.zzbgz r9 = r2.f38631e
            com.google.android.gms.ads.internal.ay r2 = r0.f38501e
            java.lang.String r13 = r2.f38628b
            java.lang.String r12 = r1.f40157c
            r10 = 0
            r14 = 0
            r11 = r1
            r7.mo27632a(r8, r9, r10, r11, r12, r13, r14)
            r2 = r18
            r3 = r1
            r1 = r16
            goto L_0x010b
        L_0x0107:
            r1 = r16
            r2 = r18
        L_0x010b:
            com.google.android.gms.internal.ads.vo r1 = r15.m30858a(r1, r6, r3, r2)
            r2 = r17
            boolean r1 = r15.mo27585a(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14967ba.mo27586a(com.google.android.gms.internal.ads.zzyv, com.google.android.gms.internal.ads.ck, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo27585a(C16324vo voVar, C15806ck ckVar) {
        C15563abr abr;
        this.f38497a = ckVar;
        ckVar.mo30900a("seq_num", voVar.f45766g);
        ckVar.mo30900a("request_id", voVar.f45781v);
        ckVar.mo30900a("session_id", voVar.f45767h);
        if (voVar.f45765f != null) {
            ckVar.mo30900a("app_version", String.valueOf(voVar.f45765f.versionCode));
        }
        C14964ay ayVar = this.f38501e;
        Context context = this.f38501e.f38629c;
        byh byh = this.f38505i.f38692d;
        if (voVar.f45761b.f46319c.getBundle("sdk_less_server_data") != null) {
            abr = new C16341we(context, voVar, this, byh);
        } else {
            abr = new C16302ut(context, voVar, this, byh);
        }
        abr.mo28619g();
        ayVar.f38633g = abr;
        return true;
    }

    /* renamed from: a */
    public boolean mo27478a(zzyv zzyv, C15806ck ckVar) {
        return mo27586a(zzyv, ckVar, 1);
    }

    /* renamed from: b */
    public final void mo27479b(abb abb) {
        super.mo27479b(abb);
        if (abb.f40117o != null) {
            abv.m32792b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.f38501e.f38632f != null) {
                C14965az azVar = this.f38501e.f38632f;
                abv.m32494a("Disable debug gesture detector on adFrame.");
                azVar.f38655c = false;
            }
            abv.m32792b("Pinging network fill URLs.");
            C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, false, abb.f40117o.f45280j);
            if (!(abb.f40120r == null || abb.f40120r.f45300g == null || abb.f40120r.f45300g.size() <= 0)) {
                abv.m32792b("Pinging urls remotely");
                C14963ax.m30831a().mo28668a(this.f38501e.f38629c, abb.f40120r.f45300g);
            }
        } else {
            abv.m32792b("Enable the debug gesture detector on the admob ad frame.");
            if (this.f38501e.f38632f != null) {
                C14965az azVar2 = this.f38501e.f38632f;
                abv.m32494a("Enable debug gesture detector on adFrame.");
                azVar2.f38655c = true;
            }
        }
        if (abb.f40106d == 3 && abb.f40120r != null && abb.f40120r.f45299f != null) {
            abv.m32792b("Pinging no fill URLs.");
            C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, false, abb.f40120r.f45299f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27477a(abb abb, abb abb2) {
        int i;
        if (!(abb == null || abb.f40121s == null)) {
            abb.f40121s.mo31205a((C16119nz) null);
        }
        if (abb2.f40121s != null) {
            abb2.f40121s.mo31205a((C16119nz) this);
        }
        int i2 = 0;
        if (abb2.f40120r != null) {
            i2 = abb2.f40120r.f45312s;
            i = abb2.f40120r.f45313t;
        } else {
            i = 0;
        }
        abp abp = this.f38501e.f38616J;
        synchronized (abp.f40197a) {
            abp.f40198b = i2;
            abp.f40199c = i;
            abp.f40200d.mo28613a(abp);
        }
        return true;
    }

    /* renamed from: e */
    public final void mo27201e() {
        if (this.f38501e.f38636j == null) {
            abv.m32798e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.f38501e.f38636j.f40120r == null || this.f38501e.f38636j.f40120r.f45296c == null)) {
            C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, this.f38501e.f38636j, this.f38501e.f38628b, false, mo27450a(this.f38501e.f38636j.f40120r.f45296c, this.f38501e.f38636j.f40097P));
        }
        if (!(this.f38501e.f38636j.f40117o == null || this.f38501e.f38636j.f40117o.f45276f == null)) {
            C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, this.f38501e.f38636j, this.f38501e.f38628b, false, this.f38501e.f38636j.f40117o.f45276f);
        }
        super.mo27201e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27476a(abb abb) {
        zzyv zzyv;
        boolean z = false;
        if (this.f38502f != null) {
            zzyv = this.f38502f;
            this.f38502f = null;
        } else {
            zzyv = abb.f40103a;
            if (zzyv.f46319c != null) {
                z = zzyv.f46319c.getBoolean("_noRefresh", false);
            }
        }
        return mo27527a(zzyv, abb, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27527a(zzyv zzyv, abb abb, boolean z) {
        if (!z && this.f38501e.mo27568c()) {
            if (abb.f40111i > 0) {
                this.f38500d.mo27542a(zzyv, abb.f40111i);
            } else if (abb.f40120r != null && abb.f40120r.f45303j > 0) {
                this.f38500d.mo27542a(zzyv, abb.f40120r.f45303j);
            } else if (!abb.f40116n && abb.f40106d == 2) {
                this.f38500d.mo27541a(zzyv);
            }
        }
        return this.f38500d.f38549b;
    }

    /* renamed from: l */
    public void mo27490l() {
        C15464q.m32132b("pause must be called on the main UI thread.");
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null || !this.f38501e.mo27568c())) {
            acm.m32635a(this.f38501e.f38636j.f40104b);
        }
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40118p == null)) {
            try {
                this.f38501e.f38636j.f40118p.mo31255d();
            } catch (RemoteException unused) {
                abv.m32798e("Could not pause mediation adapter.");
            }
        }
        this.f38503g.mo30746b(this.f38501e.f38636j);
        this.f38500d.mo27543b();
    }

    /* renamed from: m */
    public void mo27491m() {
        C15464q.m32132b("resume must be called on the main UI thread.");
        ama ama = (this.f38501e.f38636j == null || this.f38501e.f38636j.f40104b == null) ? null : this.f38501e.f38636j.f40104b;
        if (ama != null && this.f38501e.mo27568c()) {
            acm.m32636b(this.f38501e.f38636j.f40104b);
        }
        if (!(this.f38501e.f38636j == null || this.f38501e.f38636j.f40118p == null)) {
            try {
                this.f38501e.f38636j.f40118p.mo31256e();
            } catch (RemoteException unused) {
                abv.m32798e("Could not resume mediation adapter.");
            }
        }
        if (ama == null || !ama.mo29142F()) {
            this.f38500d.mo27544c();
        }
        this.f38503g.mo30747c(this.f38501e.f38636j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo27484c(zzyv zzyv) {
        return super.mo27484c(zzyv) && !this.f38658j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public boolean mo27577U() {
        return acd.m32590a(this.f38501e.f38629c, "android.permission.INTERNET") && acd.m32589a(this.f38501e.f38629c);
    }

    /* renamed from: y_ */
    public void mo27592y_() {
        this.f38658j = false;
        mo27496r();
        abd abd = this.f38501e.f38638l;
        synchronized (abd.f40142d) {
            if (abd.f40150l != -1 && !abd.f40141c.isEmpty()) {
                abe abe = (abe) abd.f40141c.getLast();
                if (abe.f40153b == -1) {
                    abe.f40153b = abe.f40154c.f40139a.mo28524b();
                    abd.f40140b.mo28612a(abd);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo27591d() {
        this.f38658j = true;
        mo27498t();
    }

    /* renamed from: b */
    public final void mo27587b() {
        this.f38503g.mo30746b(this.f38501e.f38636j);
    }

    /* renamed from: c */
    public final void mo27590c() {
        this.f38503g.mo30747c(this.f38501e.f38636j);
    }

    /* renamed from: T */
    public void mo27523T() {
        abv.m32798e("Mediated ad does not support onVideoEnd callback");
    }

    /* renamed from: R */
    public void mo27521R() {
        mo27201e();
    }

    /* renamed from: V */
    public final void mo27578V() {
        mo27592y_();
    }

    /* renamed from: W */
    public final void mo27579W() {
        mo27497s();
    }

    /* renamed from: X */
    public final void mo27580X() {
        mo27591d();
    }

    /* renamed from: Y */
    public final void mo27581Y() {
        if (this.f38501e.f38636j != null) {
            String str = this.f38501e.f38636j.f40119q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            abv.m32798e(sb.toString());
        }
        mo27583a(this.f38501e.f38636j, true);
        mo27588b(this.f38501e.f38636j, true);
        mo27499u();
    }

    /* renamed from: S */
    public void mo27522S() {
        mo27582Z();
    }

    /* renamed from: b */
    public final void mo27589b(String str, String str2) {
        mo27473a(str, str2);
    }

    /* renamed from: a */
    public final void mo27584a(C15889fl flVar, String str) {
        Object obj;
        C15900fw fwVar = null;
        if (flVar != null) {
            try {
                obj = flVar.mo30921c();
            } catch (RemoteException e) {
                abv.m32795c("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.f38501e.f38648v == null || obj == null)) {
            fwVar = (C15900fw) this.f38501e.f38648v.get(obj);
        }
        if (fwVar == null) {
            abv.m32798e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            fwVar.mo31078a(flVar, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0303  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C16324vo m30858a(com.google.android.gms.internal.ads.zzyv r69, android.os.Bundle r70, com.google.android.gms.internal.ads.abf r71, int r72) {
        /*
            r68 = this;
            r1 = r68
            r0 = r71
            com.google.android.gms.ads.internal.ay r2 = r1.f38501e
            android.content.Context r2 = r2.f38629c
            android.content.pm.ApplicationInfo r8 = r2.getApplicationInfo()
            r3 = 0
            com.google.android.gms.ads.internal.ay r4 = r1.f38501e     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.Context r4 = r4.f38629c     // Catch:{ NameNotFoundException -> 0x001d }
            com.google.android.gms.common.d.b r4 = com.google.android.gms.common.p1037d.C15377d.m31951a(r4)     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r5 = r8.packageName     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.PackageInfo r4 = r4.mo28321b(r5, r3)     // Catch:{ NameNotFoundException -> 0x001d }
            r9 = r4
            goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            com.google.android.gms.ads.internal.ay r4 = r1.f38501e
            android.content.Context r4 = r4.f38629c
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            com.google.android.gms.ads.internal.ay r5 = r1.f38501e
            com.google.android.gms.ads.internal.az r5 = r5.f38632f
            r6 = 1
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.ads.internal.ay r5 = r1.f38501e
            com.google.android.gms.ads.internal.az r5 = r5.f38632f
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x0096
            r5 = 2
            int[] r5 = new int[r5]
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e
            com.google.android.gms.ads.internal.az r7 = r7.f38632f
            r7.getLocationOnScreen(r5)
            r7 = r5[r3]
            r5 = r5[r6]
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            com.google.android.gms.ads.internal.az r10 = r10.f38632f
            int r10 = r10.getWidth()
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            com.google.android.gms.ads.internal.az r11 = r11.f38632f
            int r11 = r11.getHeight()
            com.google.android.gms.ads.internal.ay r12 = r1.f38501e
            com.google.android.gms.ads.internal.az r12 = r12.f38632f
            boolean r12 = r12.isShown()
            if (r12 == 0) goto L_0x0075
            int r12 = r7 + r10
            if (r12 <= 0) goto L_0x0075
            int r12 = r5 + r11
            if (r12 <= 0) goto L_0x0075
            int r12 = r4.widthPixels
            if (r7 > r12) goto L_0x0075
            int r12 = r4.heightPixels
            if (r5 > r12) goto L_0x0075
            r12 = 1
            goto L_0x0076
        L_0x0075:
            r12 = 0
        L_0x0076:
            android.os.Bundle r13 = new android.os.Bundle
            r14 = 5
            r13.<init>(r14)
            java.lang.String r14 = "x"
            r13.putInt(r14, r7)
            java.lang.String r7 = "y"
            r13.putInt(r7, r5)
            java.lang.String r5 = "width"
            r13.putInt(r5, r10)
            java.lang.String r5 = "height"
            r13.putInt(r5, r11)
            java.lang.String r5 = "visible"
            r13.putInt(r5, r12)
            goto L_0x0097
        L_0x0096:
            r13 = 0
        L_0x0097:
            com.google.android.gms.ads.internal.ay r5 = r1.f38501e
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abq r7 = r7.f40165c
            com.google.android.gms.common.util.e r10 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            java.lang.String r11 = r11.f38628b
            com.google.android.gms.internal.ads.abd r12 = new com.google.android.gms.internal.ads.abd
            com.google.android.gms.internal.ads.abo r14 = r7.f40203b
            java.lang.String r14 = r14.mo28605a()
            r12.<init>(r10, r7, r14, r11)
            r5.f38638l = r12
            com.google.android.gms.ads.internal.ay r5 = r1.f38501e
            com.google.android.gms.internal.ads.abd r5 = r5.f38638l
            java.lang.Object r7 = r5.f40142d
            monitor-enter(r7)
            com.google.android.gms.common.util.e r10 = r5.f40139a     // Catch:{ all -> 0x036e }
            long r10 = r10.mo28524b()     // Catch:{ all -> 0x036e }
            r5.f40149k = r10     // Catch:{ all -> 0x036e }
            com.google.android.gms.internal.ads.abq r10 = r5.f40140b     // Catch:{ all -> 0x036e }
            long r11 = r5.f40149k     // Catch:{ all -> 0x036e }
            r5 = r69
            r10.mo28614a(r5, r11)     // Catch:{ all -> 0x036e }
            monitor-exit(r7)     // Catch:{ all -> 0x036e }
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e
            android.content.Context r7 = r7.f38629c
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            com.google.android.gms.ads.internal.az r10 = r10.f38632f
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            com.google.android.gms.internal.ads.zzyz r11 = r11.f38635i
            java.lang.String r21 = com.google.android.gms.internal.ads.acd.m32576a(r7, r10, r11)
            r10 = 0
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e
            com.google.android.gms.internal.ads.v r7 = r7.f38643q
            if (r7 == 0) goto L_0x00f5
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e     // Catch:{ RemoteException -> 0x00f0 }
            com.google.android.gms.internal.ads.v r7 = r7.f38643q     // Catch:{ RemoteException -> 0x00f0 }
            long r14 = r7.mo30892a()     // Catch:{ RemoteException -> 0x00f0 }
            r22 = r14
            goto L_0x00f7
        L_0x00f0:
            java.lang.String r7 = "Cannot get correlation id, default to 0."
            com.google.android.gms.internal.ads.abv.m32798e(r7)
        L_0x00f5:
            r22 = r10
        L_0x00f7:
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r24 = r7.toString()
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abq r7 = r7.f40165c
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            android.content.Context r10 = r10.f38629c
            android.os.Bundle r14 = r7.mo28610a(r10, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r7 = 0
        L_0x0118:
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            android.support.v4.f.n<java.lang.String, com.google.android.gms.internal.ads.fz> r10 = r10.f38649w
            int r10 = r10.size()
            if (r7 >= r10) goto L_0x0149
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            android.support.v4.f.n<java.lang.String, com.google.android.gms.internal.ads.fz> r10 = r10.f38649w
            java.lang.Object r10 = r10.mo2576b(r7)
            java.lang.String r10 = (java.lang.String) r10
            r15.add(r10)
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            android.support.v4.f.n<java.lang.String, com.google.android.gms.internal.ads.fw> r11 = r11.f38648v
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x0146
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            android.support.v4.f.n<java.lang.String, com.google.android.gms.internal.ads.fw> r11 = r11.f38648v
            java.lang.Object r11 = r11.get(r10)
            if (r11 == 0) goto L_0x0146
            r12.add(r10)
        L_0x0146:
            int r7 = r7 + 1
            goto L_0x0118
        L_0x0149:
            com.google.android.gms.ads.internal.bd r7 = new com.google.android.gms.ads.internal.bd
            r7.<init>(r1)
            com.google.android.gms.internal.ads.aga r35 = com.google.android.gms.internal.ads.acb.m32567a(r7)
            com.google.android.gms.ads.internal.be r7 = new com.google.android.gms.ads.internal.be
            r7.<init>(r1)
            com.google.android.gms.internal.ads.aga r45 = com.google.android.gms.internal.ads.acb.m32567a(r7)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = r0.f40158d
            r36 = r0
            goto L_0x0164
        L_0x0162:
            r36 = 0
        L_0x0164:
            com.google.android.gms.ads.internal.ay r0 = r1.f38501e
            java.util.List<java.lang.String> r0 = r0.f38615I
            if (r0 == 0) goto L_0x01be
            com.google.android.gms.ads.internal.ay r0 = r1.f38501e
            java.util.List<java.lang.String> r0 = r0.f38615I
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01be
            if (r9 == 0) goto L_0x0179
            int r0 = r9.versionCode
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r7 = r7.mo28595f()
            int r7 = r7.mo28646h()
            if (r0 <= r7) goto L_0x019f
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r7 = r7.mo28595f()
            r7.mo28652n()
            com.google.android.gms.internal.ads.abh r7 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r7 = r7.mo28595f()
            r7.mo28624a(r0)
            goto L_0x01be
        L_0x019f:
            com.google.android.gms.internal.ads.abh r0 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r0 = r0.mo28595f()
            org.json.JSONObject r0 = r0.mo28651m()
            if (r0 == 0) goto L_0x01be
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e
            java.lang.String r7 = r7.f38628b
            org.json.JSONArray r0 = r0.optJSONArray(r7)
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = r0.toString()
            r47 = r0
            goto L_0x01c0
        L_0x01be:
            r47 = 0
        L_0x01c0:
            com.google.android.gms.internal.ads.vo r0 = new com.google.android.gms.internal.ads.vo
            com.google.android.gms.ads.internal.ay r7 = r1.f38501e
            com.google.android.gms.internal.ads.zzyz r7 = r7.f38635i
            com.google.android.gms.ads.internal.ay r10 = r1.f38501e
            java.lang.String r10 = r10.f38628b
            com.google.android.gms.ads.internal.ay r11 = r1.f38501e
            com.google.android.gms.internal.ads.abd r11 = r11.f38638l
            java.lang.String r11 = r11.f40143e
            java.lang.String r16 = com.google.android.gms.internal.ads.caf.m37100e()
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            com.google.android.gms.internal.ads.zzbgz r3 = r3.f38631e
            com.google.android.gms.ads.internal.ay r6 = r1.f38501e
            java.util.List<java.lang.String> r6 = r6.f38615I
            com.google.android.gms.internal.ads.abh r17 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r17 = r17.mo28595f()
            boolean r17 = r17.mo28633b()
            int r2 = r4.widthPixels
            r57 = r2
            int r2 = r4.heightPixels
            float r4 = r4.density
            java.util.List r25 = com.google.android.gms.internal.ads.C15740bx.m36940a()
            r58 = r3
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            java.lang.String r3 = r3.f38627a
            r59 = r3
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            com.google.android.gms.internal.ads.zzafl r3 = r3.f38650x
            r60 = r3
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            r61 = r4
            boolean r4 = r3.f38621O
            if (r4 == 0) goto L_0x020e
            boolean r4 = r3.f38622P
            if (r4 != 0) goto L_0x022a
        L_0x020e:
            boolean r4 = r3.f38621O
            if (r4 == 0) goto L_0x021c
            boolean r3 = r3.f38623Q
            if (r3 == 0) goto L_0x0219
            java.lang.String r3 = "top-scrollable"
            goto L_0x022c
        L_0x0219:
            java.lang.String r3 = "top-locked"
            goto L_0x022c
        L_0x021c:
            boolean r4 = r3.f38622P
            if (r4 == 0) goto L_0x022a
            boolean r3 = r3.f38623Q
            if (r3 == 0) goto L_0x0227
            java.lang.String r3 = "bottom-scrollable"
            goto L_0x022c
        L_0x0227:
            java.lang.String r3 = "bottom-locked"
            goto L_0x022c
        L_0x022a:
            java.lang.String r3 = ""
        L_0x022c:
            r28 = r3
            com.google.android.gms.internal.ads.acy r3 = com.google.android.gms.ads.internal.C14963ax.m30835e()
            float r29 = r3.mo28700a()
            com.google.android.gms.internal.ads.acy r3 = com.google.android.gms.ads.internal.C14963ax.m30835e()
            boolean r30 = r3.mo28703b()
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            android.content.Context r3 = r3.f38629c
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            if (r3 != 0) goto L_0x024b
            r31 = 0
            goto L_0x024f
        L_0x024b:
            int r3 = r3.targetSdkVersion
            r31 = r3
        L_0x024f:
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            com.google.android.gms.ads.internal.az r3 = r3.f38632f
            int r32 = com.google.android.gms.internal.ads.acd.m32605d(r3)
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            android.content.Context r3 = r3.f38629c
            boolean r4 = r3 instanceof android.app.Activity
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r3 = r3.mo28595f()
            boolean r34 = r3.mo28645g()
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abk r3 = r3.f40170h
            r3.mo28598a()
            int r3 = r3.f40178a
            r62 = r4
            int r4 = com.google.android.gms.internal.ads.abl.f40182b
            if (r3 != r4) goto L_0x027d
            r37 = 1
            goto L_0x027f
        L_0x027d:
            r37 = 0
        L_0x027f:
            com.google.android.gms.internal.ads.aks r3 = com.google.android.gms.ads.internal.C14963ax.m30848r()
            java.util.List<com.google.android.gms.internal.ads.akq> r3 = r3.f40781a
            int r38 = r3.size()
            android.os.Bundle r39 = com.google.android.gms.internal.ads.acd.m32600c()
            com.google.android.gms.internal.ads.adi r3 = com.google.android.gms.ads.internal.C14963ax.m30839i()
            java.lang.String r40 = r3.mo28717a()
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            com.google.android.gms.internal.ads.zzabp r4 = r3.f38607A
            com.google.android.gms.internal.ads.adi r3 = com.google.android.gms.ads.internal.C14963ax.m30839i()
            boolean r42 = r3.mo28721b()
            com.google.android.gms.internal.ads.ku r3 = com.google.android.gms.internal.ads.C16033ku.m37942a()
            r63 = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r64 = r4
            java.lang.String r4 = "ipl"
            int r5 = r3.f45130a
            r2.putInt(r4, r5)
            java.lang.String r4 = "ipds"
            int r5 = r3.f45131b
            r2.putInt(r4, r5)
            java.lang.String r4 = "ipde"
            int r5 = r3.f45132c
            r2.putInt(r4, r5)
            java.lang.String r4 = "iph"
            int r5 = r3.f45133d
            r2.putInt(r4, r5)
            java.lang.String r4 = "ipm"
            int r3 = r3.f45134e
            r2.putInt(r4, r3)
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abx r3 = r3.mo28595f()
            com.google.android.gms.ads.internal.ay r4 = r1.f38501e
            java.lang.String r4 = r4.f38628b
            boolean r44 = r3.mo28641e(r4)
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            java.util.List<java.lang.Integer> r5 = r3.f38609C
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            android.content.Context r3 = r3.f38629c
            com.google.android.gms.common.d.b r3 = com.google.android.gms.common.p1037d.C15377d.m31951a(r3)
            boolean r50 = r3.mo28319a()
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.abk r3 = r3.f40170h
            r3.mo28598a()
            int r3 = r3.f40178a
            int r4 = com.google.android.gms.internal.ads.abl.f40183c
            if (r3 != r4) goto L_0x0303
            r51 = 1
            goto L_0x0305
        L_0x0303:
            r51 = 0
        L_0x0305:
            boolean r52 = com.google.android.gms.internal.ads.acm.m32637c()
            com.google.android.gms.internal.ads.abh r3 = com.google.android.gms.ads.internal.C14963ax.m30834d()
            com.google.android.gms.internal.ads.aga r3 = r3.mo28596g()
            r65 = r5
            r4 = 1000(0x3e8, double:4.94E-321)
            r66 = r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r67 = r12
            r12 = 0
            java.lang.Object r3 = com.google.android.gms.internal.ads.afp.m32826a(r3, r12, r4, r6)
            r53 = r3
            java.util.ArrayList r53 = (java.util.ArrayList) r53
            com.google.android.gms.internal.ads.acd r3 = com.google.android.gms.ads.internal.C14963ax.m30831a()
            com.google.android.gms.ads.internal.ay r4 = r1.f38501e
            android.content.Context r4 = r4.f38629c
            java.lang.String r54 = r3.mo28675k(r4)
            com.google.android.gms.ads.internal.ay r3 = r1.f38501e
            com.google.android.gms.internal.ads.zzaks r3 = r3.f38652z
            r55 = r3
            com.google.android.gms.internal.ads.acd r3 = com.google.android.gms.ads.internal.C14963ax.m30831a()
            com.google.android.gms.ads.internal.ay r4 = r1.f38501e
            android.content.Context r4 = r4.f38629c
            android.os.Bundle r56 = r3.mo28676l(r4)
            r12 = r58
            r26 = r59
            r27 = r60
            r3 = r0
            r20 = r61
            r33 = r62
            r41 = r64
            r4 = r13
            r46 = r65
            r5 = r69
            r18 = r66
            r6 = r7
            r7 = r10
            r10 = r11
            r11 = r16
            r48 = r67
            r13 = r14
            r14 = r18
            r16 = r70
            r18 = r57
            r19 = r63
            r43 = r2
            r49 = r72
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            return r0
        L_0x036e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x036e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14967ba.m30858a(com.google.android.gms.internal.ads.zzyv, android.os.Bundle, com.google.android.gms.internal.ads.abf, int):com.google.android.gms.internal.ads.vo");
    }

    /* renamed from: Z */
    public final void mo27582Z() {
        mo27583a(this.f38501e.f38636j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27583a(abb abb, boolean z) {
        if (abb == null) {
            abv.m32798e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (abb == null) {
            abv.m32798e("Ad state was null when trying to ping impression URLs.");
        } else {
            abv.m32792b("Pinging Impression URLs.");
            if (this.f38501e.f38638l != null) {
                abd abd = this.f38501e.f38638l;
                synchronized (abd.f40142d) {
                    if (abd.f40150l != -1 && abd.f40145g == -1) {
                        abd.f40145g = abd.f40139a.mo28524b();
                        abd.f40140b.mo28612a(abd);
                    }
                    abd.f40140b.mo28616b();
                }
            }
            abb.f40092K.mo30861a(C15744b.AD_IMPRESSION);
            if (abb.f40107e != null && !abb.f40085D) {
                acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, mo27450a(abb.f40107e, abb.f40097P));
                abb.f40085D = true;
            }
        }
        if (!abb.f40087F || z) {
            if (!(abb.f40120r == null || abb.f40120r.f45297d == null)) {
                C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, z, mo27450a(abb.f40120r.f45297d, abb.f40097P));
            }
            if (!(abb.f40117o == null || abb.f40117o.f45277g == null)) {
                C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, z, abb.f40117o.f45277g);
            }
            abb.f40087F = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27588b(abb abb, boolean z) {
        if (abb != null) {
            if (!(abb == null || abb.f40108f == null || abb.f40086E)) {
                acd.m32584a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, mo27449a(abb.f40108f));
                abb.f40086E = true;
            }
            if (!abb.f40088G || z) {
                if (!(abb.f40120r == null || abb.f40120r.f45298e == null)) {
                    C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, z, mo27449a(abb.f40120r.f45298e));
                }
                if (!(abb.f40117o == null || abb.f40117o.f45278h == null)) {
                    C16127og.m38184a(this.f38501e.f38629c, this.f38501e.f38631e.f46237a, abb, this.f38501e.f38628b, z, abb.f40117o.f45278h);
                }
                abb.f40088G = true;
            }
        }
    }

    /* renamed from: a */
    public final String mo27551a() {
        if (this.f38501e.f38636j == null) {
            return null;
        }
        return this.f38501e.f38636j.f40119q;
    }

    /* renamed from: B_ */
    public final String mo27550B_() {
        if (this.f38501e.f38636j == null) {
            return null;
        }
        return m30859c(this.f38501e.f38636j);
    }

    /* renamed from: c */
    static String m30859c(abb abb) {
        if (abb == null) {
            return null;
        }
        String str = abb.f40119q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && abb.f40117o != null) {
            try {
                return new JSONObject(abb.f40117o.f45281k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    /* renamed from: E */
    public void mo27508E() {
        abv.m32798e("showInterstitial is not supported for current ad type");
    }

    /* renamed from: C_ */
    public final void mo27548C_() {
        Executor executor = agf.f40430a;
        C14953an anVar = this.f38500d;
        anVar.getClass();
        executor.execute(new C14968bb(anVar));
    }

    /* renamed from: D_ */
    public final void mo27549D_() {
        Executor executor = agf.f40430a;
        C14953an anVar = this.f38500d;
        anVar.getClass();
        executor.execute(new C14969bc(anVar));
    }
}

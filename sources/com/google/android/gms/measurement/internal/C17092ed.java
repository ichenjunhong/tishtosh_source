package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.internal.measurement.C16642dx;
import com.google.android.gms.internal.measurement.C16647eb;
import com.google.android.gms.internal.measurement.C16648ec;
import com.google.android.gms.internal.measurement.C16650ee;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.ed */
public class C17092ed implements C17030bw {

    /* renamed from: f */
    private static volatile C17092ed f48234f;

    /* renamed from: a */
    C17048cn f48235a;

    /* renamed from: b */
    public final C17005ay f48236b;

    /* renamed from: c */
    List<Runnable> f48237c;

    /* renamed from: d */
    int f48238d;

    /* renamed from: e */
    int f48239e;

    /* renamed from: g */
    private C16999as f48240g;

    /* renamed from: h */
    private C17137v f48241h;

    /* renamed from: i */
    private C17113ex f48242i;

    /* renamed from: j */
    private C16984ad f48243j;

    /* renamed from: k */
    private C17087dz f48244k;

    /* renamed from: l */
    private C17107er f48245l;

    /* renamed from: m */
    private final C17099ej f48246m;

    /* renamed from: n */
    private boolean f48247n;

    /* renamed from: o */
    private boolean f48248o;

    /* renamed from: p */
    private boolean f48249p;

    /* renamed from: q */
    private long f48250q;

    /* renamed from: r */
    private boolean f48251r;

    /* renamed from: s */
    private boolean f48252s;

    /* renamed from: t */
    private boolean f48253t;

    /* renamed from: u */
    private FileLock f48254u;

    /* renamed from: v */
    private FileChannel f48255v;

    /* renamed from: w */
    private List<Long> f48256w;

    /* renamed from: x */
    private List<Long> f48257x;

    /* renamed from: y */
    private long f48258y;

    /* renamed from: com.google.android.gms.measurement.internal.ed$a */
    class C17093a implements C17115ez {

        /* renamed from: a */
        C16650ee f48259a;

        /* renamed from: b */
        List<Long> f48260b;

        /* renamed from: c */
        List<C16647eb> f48261c;

        /* renamed from: d */
        private long f48262d;

        private C17093a() {
        }

        /* renamed from: a */
        public final void mo33117a(C16650ee eeVar) {
            C15464q.m32123a(eeVar);
            this.f48259a = eeVar;
        }

        /* renamed from: a */
        public final boolean mo33118a(long j, C16647eb ebVar) {
            C15464q.m32123a(ebVar);
            if (this.f48261c == null) {
                this.f48261c = new ArrayList();
            }
            if (this.f48260b == null) {
                this.f48260b = new ArrayList();
            }
            if (this.f48261c.size() > 0 && m41610a((C16647eb) this.f48261c.get(0)) != m41610a(ebVar)) {
                return false;
            }
            long e = this.f48262d + ((long) ebVar.mo32479e());
            if (e >= ((long) Math.max(0, ((Integer) C17122h.f48407r.mo33351b()).intValue()))) {
                return false;
            }
            this.f48262d = e;
            this.f48261c.add(ebVar);
            this.f48260b.add(Long.valueOf(j));
            if (this.f48261c.size() >= Math.max(1, ((Integer) C17122h.f48408s.mo33351b()).intValue())) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private static long m41610a(C16647eb ebVar) {
            return ((ebVar.f46789c.longValue() / 1000) / 60) / 60;
        }

        /* synthetic */ C17093a(C17092ed edVar, C17094ee eeVar) {
            this();
        }
    }

    /* renamed from: a */
    public static C17092ed m41559a(Context context) {
        C15464q.m32123a(context);
        C15464q.m32123a(context.getApplicationContext());
        if (f48234f == null) {
            synchronized (C17092ed.class) {
                if (f48234f == null) {
                    f48234f = new C17092ed(new C17098ei(context));
                }
            }
        }
        return f48234f;
    }

    private C17092ed(C17098ei eiVar) {
        this(eiVar, null);
    }

    private C17092ed(C17098ei eiVar, C17005ay ayVar) {
        C15464q.m32123a(eiVar);
        this.f48236b = C17005ay.m41256a(eiVar.f48271a, (C17128m) null);
        this.f48258y = -1;
        C17099ej ejVar = new C17099ej(this);
        ejVar.mo33090t();
        this.f48246m = ejVar;
        C17137v vVar = new C17137v(this);
        vVar.mo33090t();
        this.f48241h = vVar;
        C16999as asVar = new C16999as(this);
        asVar.mo33090t();
        this.f48240g = asVar;
        this.f48236b.mo32853p().mo32912a((Runnable) new C17094ee(this, eiVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33092a() {
        this.f48236b.mo32853p().mo32840c();
        mo33106d().mo33336z();
        if (this.f48236b.mo32923b().f47875d.mo32882a() == 0) {
            this.f48236b.mo32923b().f47875d.mo32883a(this.f48236b.mo32849l().mo28523a());
        }
        mo33115n();
    }

    /* renamed from: b */
    public final C17110eu mo33100b() {
        return this.f48236b.f47966e;
    }

    /* renamed from: q */
    public final C17133r mo32854q() {
        return this.f48236b.mo32854q();
    }

    /* renamed from: p */
    public final C17000at mo32853p() {
        return this.f48236b.mo32853p();
    }

    /* renamed from: r */
    private final C16999as m41572r() {
        m41561a((C17091ec) this.f48240g);
        return this.f48240g;
    }

    /* renamed from: c */
    public final C17137v mo33105c() {
        m41561a((C17091ec) this.f48241h);
        return this.f48241h;
    }

    /* renamed from: d */
    public final C17113ex mo33106d() {
        m41561a((C17091ec) this.f48242i);
        return this.f48242i;
    }

    /* renamed from: s */
    private final C16984ad m41573s() {
        if (this.f48243j != null) {
            return this.f48243j;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: t */
    private final C17087dz m41574t() {
        m41561a((C17091ec) this.f48244k);
        return this.f48244k;
    }

    /* renamed from: e */
    public final C17107er mo33108e() {
        m41561a((C17091ec) this.f48245l);
        return this.f48245l;
    }

    /* renamed from: f */
    public final C17099ej mo33109f() {
        m41561a((C17091ec) this.f48246m);
        return this.f48246m;
    }

    /* renamed from: g */
    public final C17131p mo33110g() {
        return this.f48236b.mo32927f();
    }

    /* renamed from: m */
    public final Context mo32850m() {
        return this.f48236b.mo32850m();
    }

    /* renamed from: l */
    public final C15514e mo32849l() {
        return this.f48236b.mo32849l();
    }

    /* renamed from: h */
    public final C17102em mo33111h() {
        return this.f48236b.mo32926e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo33112i() {
        this.f48236b.mo32853p().mo32840c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo33113j() {
        if (!this.f48247n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: a */
    static void m41561a(C17091ec ecVar) {
        if (ecVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!ecVar.mo33088i()) {
            String valueOf = String.valueOf(ecVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: u */
    private final long m41575u() {
        long a = this.f48236b.mo32849l().mo28523a();
        C16986af b = this.f48236b.mo32923b();
        b.mo32980w();
        b.mo32840c();
        long a2 = b.f47879h.mo32882a();
        if (a2 == 0) {
            a2 = 1 + ((long) b.mo32852o().mo33155g().nextInt(C38588b.f98133g));
            b.f47879h.mo32883a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33095a(zzag zzag, String str) {
        zzag zzag2 = zzag;
        String str2 = str;
        C17104eo b = mo33106d().mo33317b(str2);
        if (b == null || TextUtils.isEmpty(b.mo33192i())) {
            this.f48236b.mo32854q().f48452i.mo33377a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m41570b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzag2.f48475a)) {
                this.f48236b.mo32854q().f48448e.mo33377a("Could not find package. appId", C17133r.m41997a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f48236b.mo32854q().f48445b.mo33377a("App version does not match; dropping event. appId", C17133r.m41997a(str));
            return;
        }
        zzk zzk = r2;
        C17104eo eoVar = b;
        zzk zzk2 = new zzk(str, b.mo33173c(), b.mo33192i(), b.mo33194j(), b.mo33195k(), b.mo33196l(), b.mo33197m(), (String) null, b.mo33198n(), false, eoVar.mo33183f(), eoVar.mo33204t(), 0, 0, eoVar.mo33205u(), eoVar.mo33206v(), false, eoVar.mo33177d());
        mo33094a(zzag2, zzk);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33094a(zzag zzag, zzk zzk) {
        List<zzo> list;
        List<zzo> list2;
        List<zzo> list3;
        zzag zzag2 = zzag;
        zzk zzk2 = zzk;
        C15464q.m32123a(zzk);
        C15464q.m32125a(zzk2.f48487a);
        mo33112i();
        mo33113j();
        String str = zzk2.f48487a;
        long j = zzag2.f48478d;
        if (mo33109f().mo33128a(zzag2, zzk2)) {
            if (!zzk2.f48494h) {
                mo33104c(zzk2);
                return;
            }
            mo33106d().mo33326e();
            try {
                C17113ex d = mo33106d();
                C15464q.m32125a(str);
                d.mo32840c();
                d.mo33089j();
                if (j < 0) {
                    d.mo32854q().f48448e.mo33378a("Invalid time querying timed out conditional properties", C17133r.m41997a(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo33307a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzo zzo : list) {
                    if (zzo != null) {
                        this.f48236b.mo32854q().f48452i.mo33379a("User property timed out", zzo.f48505a, this.f48236b.mo32927f().mo33371c(zzo.f48507c.f48479a), zzo.f48507c.mo33393a());
                        if (zzo.f48511g != null) {
                            m41571b(new zzag(zzo.f48511g, j), zzk2);
                        }
                        mo33106d().mo33324e(str, zzo.f48507c.f48479a);
                    }
                }
                C17113ex d2 = mo33106d();
                C15464q.m32125a(str);
                d2.mo32840c();
                d2.mo33089j();
                if (j < 0) {
                    d2.mo32854q().f48448e.mo33378a("Invalid time querying expired conditional properties", C17133r.m41997a(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo33307a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzo zzo2 : list2) {
                    if (zzo2 != null) {
                        this.f48236b.mo32854q().f48452i.mo33379a("User property expired", zzo2.f48505a, this.f48236b.mo32927f().mo33371c(zzo2.f48507c.f48479a), zzo2.f48507c.mo33393a());
                        mo33106d().mo33319b(str, zzo2.f48507c.f48479a);
                        if (zzo2.f48515k != null) {
                            arrayList.add(zzo2.f48515k);
                        }
                        mo33106d().mo33324e(str, zzo2.f48507c.f48479a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    m41571b(new zzag((zzag) obj, j), zzk2);
                }
                C17113ex d3 = mo33106d();
                String str2 = zzag2.f48475a;
                C15464q.m32125a(str);
                C15464q.m32125a(str2);
                d3.mo32840c();
                d3.mo33089j();
                if (j < 0) {
                    d3.mo32854q().f48448e.mo33379a("Invalid time querying triggered conditional properties", C17133r.m41997a(str), d3.mo32851n().mo33369a(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo33307a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzo zzo3 : list3) {
                    if (zzo3 != null) {
                        zzfv zzfv = zzo3.f48507c;
                        C17101el elVar = r4;
                        C17101el elVar2 = new C17101el(zzo3.f48505a, zzo3.f48506b, zzfv.f48479a, j, zzfv.mo33393a());
                        if (mo33106d().mo33314a(elVar)) {
                            this.f48236b.mo32854q().f48452i.mo33379a("User property triggered", zzo3.f48505a, this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                        } else {
                            this.f48236b.mo32854q().f48445b.mo33379a("Too many active user properties, ignoring", C17133r.m41997a(zzo3.f48505a), this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                        }
                        if (zzo3.f48513i != null) {
                            arrayList3.add(zzo3.f48513i);
                        }
                        zzo3.f48507c = new zzfv(elVar);
                        zzo3.f48509e = true;
                        mo33106d().mo33315a(zzo3);
                    }
                }
                m41571b(zzag, zzk);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    m41571b(new zzag((zzag) obj2, j), zzk2);
                }
                mo33106d().mo33331u();
            } finally {
                mo33106d().mo33332v();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:186:0x071c, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024d A[Catch:{ SQLiteException -> 0x021c, all -> 0x07c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x027e A[Catch:{ SQLiteException -> 0x021c, all -> 0x07c7 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m41571b(com.google.android.gms.measurement.internal.zzag r26, com.google.android.gms.measurement.internal.zzk r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.gms.common.internal.C15464q.m32123a(r27)
            java.lang.String r0 = r3.f48487a
            com.google.android.gms.common.internal.C15464q.m32125a(r0)
            long r4 = java.lang.System.nanoTime()
            r25.mo33112i()
            r25.mo33113j()
            java.lang.String r15 = r3.f48487a
            com.google.android.gms.measurement.internal.ej r0 = r25.mo33109f()
            boolean r0 = r0.mo33128a(r2, r3)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r0 = r3.f48494h
            if (r0 != 0) goto L_0x002d
            r1.mo33104c(r3)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.as r0 = r25.m41572r()
            java.lang.String r6 = r2.f48475a
            boolean r0 = r0.mo32899b(r15, r6)
            r14 = 0
            r21 = 1
            if (r0 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r3 = "Dropping blacklisted event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b
            com.google.android.gms.measurement.internal.p r5 = r5.mo32927f()
            java.lang.String r6 = r2.f48475a
            java.lang.String r5 = r5.mo33369a(r6)
            r0.mo33378a(r3, r4, r5)
            com.google.android.gms.measurement.internal.as r0 = r25.m41572r()
            boolean r0 = r0.mo32907f(r15)
            if (r0 != 0) goto L_0x006d
            com.google.android.gms.measurement.internal.as r0 = r25.m41572r()
            boolean r0 = r0.mo32909g(r15)
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r14 = 1
        L_0x006e:
            if (r14 != 0) goto L_0x008b
            java.lang.String r0 = "_err"
            java.lang.String r3 = r2.f48475a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b
            com.google.android.gms.measurement.internal.em r6 = r0.mo32926e()
            r8 = 11
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f48475a
            r11 = 0
            r7 = r15
            r6.mo33144a(r7, r8, r9, r10, r11)
        L_0x008b:
            if (r14 == 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            com.google.android.gms.measurement.internal.eo r0 = r0.mo33317b(r15)
            if (r0 == 0) goto L_0x00d2
            long r2 = r0.mo33201q()
            long r4 = r0.mo33200p()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b
            com.google.android.gms.common.util.e r4 = r4.mo32849l()
            long r4 = r4.mo28523a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r4 = com.google.android.gms.measurement.internal.C17122h.f48345I
            java.lang.Object r4 = r4.mo33351b()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ay r2 = r1.f48236b
            com.google.android.gms.measurement.internal.r r2 = r2.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48452i
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.mo33376a(r3)
            r1.m41563a(r0)
        L_0x00d2:
            return
        L_0x00d3:
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()
            r13 = 2
            boolean r0 = r0.mo33374a(r13)
            if (r0 == 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r6 = "Logging event"
            com.google.android.gms.measurement.internal.ay r7 = r1.f48236b
            com.google.android.gms.measurement.internal.p r7 = r7.mo32927f()
            java.lang.String r7 = r7.mo33368a(r2)
            r0.mo33377a(r6, r7)
        L_0x00f7:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33326e()
            r1.mo33104c(r3)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = "_iap"
            java.lang.String r6 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "ecommerce_purchase"
            java.lang.String r6 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x028d
        L_0x0115:
            com.google.android.gms.measurement.internal.zzad r0 = r2.f48476b     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "currency"
            java.lang.String r0 = r0.mo33387d(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "ecommerce_purchase"
            java.lang.String r7 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x017b
            com.google.android.gms.measurement.internal.zzad r6 = r2.f48476b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Double r6 = r6.mo33386c(r7)     // Catch:{ all -> 0x07c7 }
            double r6 = r6.doubleValue()     // Catch:{ all -> 0x07c7 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r8
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0152
            com.google.android.gms.measurement.internal.zzad r6 = r2.f48476b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo33385b(r7)     // Catch:{ all -> 0x07c7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07c7 }
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
        L_0x0152:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0163
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0163
            long r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x07c7 }
            goto L_0x0187
        L_0x0163:
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo33378a(r8, r9, r6)     // Catch:{ all -> 0x07c7 }
            r0 = 0
            goto L_0x027c
        L_0x017b:
            com.google.android.gms.measurement.internal.zzad r6 = r2.f48476b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo33385b(r7)     // Catch:{ all -> 0x07c7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07c7 }
        L_0x0187:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07c7 }
            if (r8 != 0) goto L_0x027b
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r0.toUpperCase(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r0.matches(r8)     // Catch:{ all -> 0x07c7 }
            if (r8 == 0) goto L_0x027b
            java.lang.String r8 = "_ltv_"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07c7 }
            int r9 = r0.length()     // Catch:{ all -> 0x07c7 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x07c7 }
        L_0x01af:
            r9 = r0
            goto L_0x01b7
        L_0x01b1:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x07c7 }
            r0.<init>(r8)     // Catch:{ all -> 0x07c7 }
            goto L_0x01af
        L_0x01b7:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r0 = r0.mo33321c(r15, r9)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r8 = r0.f48276e     // Catch:{ all -> 0x07c7 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x07c7 }
            if (r8 != 0) goto L_0x01c8
            goto L_0x01ec
        L_0x01c8:
            java.lang.Object r0 = r0.f48276e     // Catch:{ all -> 0x07c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x07c7 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r0 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f48477c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r12 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.util.e r12 = r12.mo32849l()     // Catch:{ all -> 0x07c7 }
            long r16 = r12.mo28523a()     // Catch:{ all -> 0x07c7 }
            r12 = 0
            long r10 = r10 + r6
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r6 = r0
            r7 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07c7 }
            goto L_0x0243
        L_0x01ec:
            com.google.android.gms.measurement.internal.ex r8 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r0 = r0.f47966e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C17122h.f48350N     // Catch:{ all -> 0x07c7 }
            int r0 = r0.mo33275b(r15, r10)     // Catch:{ all -> 0x07c7 }
            int r0 = r0 + -1
            com.google.android.gms.common.internal.C15464q.m32125a(r15)     // Catch:{ all -> 0x07c7 }
            r8.mo32840c()     // Catch:{ all -> 0x07c7 }
            r8.mo33089j()     // Catch:{ all -> 0x07c7 }
            android.database.sqlite.SQLiteDatabase r10 = r8.mo33333w()     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r11 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x021c }
            r12[r14] = r15     // Catch:{ SQLiteException -> 0x021c }
            r12[r21] = r15     // Catch:{ SQLiteException -> 0x021c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x021c }
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x021c }
            r10.execSQL(r11, r12)     // Catch:{ SQLiteException -> 0x021c }
            goto L_0x022c
        L_0x021c:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r8 = r8.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            r8.mo33378a(r10, r11, r0)     // Catch:{ all -> 0x07c7 }
        L_0x022c:
            com.google.android.gms.measurement.internal.el r0 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f48477c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r10 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.util.e r10 = r10.mo32849l()     // Catch:{ all -> 0x07c7 }
            long r10 = r10.mo28523a()     // Catch:{ all -> 0x07c7 }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r6 = r0
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07c7 }
        L_0x0243:
            com.google.android.gms.measurement.internal.ex r6 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6.mo33314a(r0)     // Catch:{ all -> 0x07c7 }
            if (r6 != 0) goto L_0x027b
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r6 = r6.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo32927f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r0.f48274c     // Catch:{ all -> 0x07c7 }
            java.lang.String r9 = r9.mo33371c(r10)     // Catch:{ all -> 0x07c7 }
            java.lang.Object r0 = r0.f48276e     // Catch:{ all -> 0x07c7 }
            r6.mo33379a(r7, r8, r9, r0)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo32926e()     // Catch:{ all -> 0x07c7 }
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r15
            r6.mo33144a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
        L_0x027b:
            r0 = 1
        L_0x027c:
            if (r0 != 0) goto L_0x028d
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r0.mo33331u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            return
        L_0x028d:
            java.lang.String r0 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r0 = com.google.android.gms.measurement.internal.C17102em.m41662a(r0)     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_err"
            java.lang.String r7 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r16 = r6.equals(r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r6 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            long r7 = r25.m41575u()     // Catch:{ all -> 0x07c7 }
            r10 = 1
            r12 = 0
            r17 = 0
            r9 = r15
            r11 = r0
            r13 = r16
            r22 = r4
            r4 = 0
            r14 = r17
            com.google.android.gms.measurement.internal.ey r5 = r6.mo33302a(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x07c7 }
            long r6 = r5.f48326b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C17122h.f48409t     // Catch:{ all -> 0x07c7 }
            java.lang.Object r8 = r8.mo33351b()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x07c7 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x07c7 }
            long r8 = (long) r8     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            r13 = 0
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x02f9
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02ea
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            long r4 = r5.f48326b     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo33378a(r2, r3, r4)     // Catch:{ all -> 0x07c7 }
        L_0x02ea:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r0.mo33331u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            return
        L_0x02f9:
            if (r0 == 0) goto L_0x0351
            long r6 = r5.f48325a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C17122h.f48411v     // Catch:{ all -> 0x07c7 }
            java.lang.Object r12 = r12.mo33351b()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x07c7 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x07c7 }
            r24 = r5
            long r4 = (long) r12     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r4
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x034f
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x032f
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            r5 = r24
            long r5 = r5.f48325a     // Catch:{ all -> 0x07c7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07c7 }
            r0.mo33378a(r3, r4, r5)     // Catch:{ all -> 0x07c7 }
        L_0x032f:
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo32926e()     // Catch:{ all -> 0x07c7 }
            r8 = 16
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            r11 = 0
            r7 = r15
            r6.mo33144a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r0.mo33331u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            return
        L_0x034f:
            r5 = r24
        L_0x0351:
            if (r16 == 0) goto L_0x039d
            long r6 = r5.f48328d     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47966e     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C17122h.f48410u     // Catch:{ all -> 0x07c7 }
            int r4 = r4.mo33275b(r8, r9)     // Catch:{ all -> 0x07c7 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x07c7 }
            r12 = 0
            int r4 = java.lang.Math.max(r12, r4)     // Catch:{ all -> 0x07c7 }
            long r8 = (long) r4     // Catch:{ all -> 0x07c7 }
            long r6 = r6 - r8
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x039e
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x038e
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            long r4 = r5.f48328d     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo33378a(r2, r3, r4)     // Catch:{ all -> 0x07c7 }
        L_0x038e:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r0.mo33331u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            return
        L_0x039d:
            r12 = 0
        L_0x039e:
            com.google.android.gms.measurement.internal.zzad r4 = r2.f48476b     // Catch:{ all -> 0x07c7 }
            android.os.Bundle r4 = r4.mo33384b()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo32926e()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r2.f48477c     // Catch:{ all -> 0x07c7 }
            r5.mo33143a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo32926e()     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.mo33154f(r15)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x03db
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo32926e()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r5.mo33143a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r5 = r5.mo32926e()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "_r"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07c7 }
            r5.mo33143a(r4, r6, r7)     // Catch:{ all -> 0x07c7 }
        L_0x03db:
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r5 = r5.f47966e     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.mo33288i(r6)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            java.lang.String r5 = "_s"
            java.lang.String r6 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.ex r5 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.el r5 = r5.mo33321c(r6, r7)     // Catch:{ all -> 0x07c7 }
            if (r5 == 0) goto L_0x0412
            java.lang.Object r6 = r5.f48276e     // Catch:{ all -> 0x07c7 }
            boolean r6 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x0412
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r6.mo32926e()     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_sno"
            java.lang.Object r5 = r5.f48276e     // Catch:{ all -> 0x07c7 }
            r6.mo33143a(r4, r7, r5)     // Catch:{ all -> 0x07c7 }
        L_0x0412:
            com.google.android.gms.measurement.internal.ex r5 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            long r5 = r5.mo33320c(r15)     // Catch:{ all -> 0x07c7 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0433
            com.google.android.gms.measurement.internal.ay r7 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r7 = r7.f48448e     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C17133r.m41997a(r15)     // Catch:{ all -> 0x07c7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07c7 }
            r7.mo33378a(r8, r9, r5)     // Catch:{ all -> 0x07c7 }
        L_0x0433:
            com.google.android.gms.measurement.internal.c r5 = new com.google.android.gms.measurement.internal.c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r2.f48477c     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r2.f48475a     // Catch:{ all -> 0x07c7 }
            long r12 = r2.f48478d     // Catch:{ all -> 0x07c7 }
            r16 = 0
            r6 = r5
            r9 = r15
            r2 = 0
            r11 = r12
            r13 = r16
            r2 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r4 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r5.f48061b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo33301a(r2, r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x04ba
            com.google.android.gms.measurement.internal.ex r4 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            long r6 = r4.mo33327f(r2)     // Catch:{ all -> 0x07c7 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x04a0
            if (r0 == 0) goto L_0x04a0
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r2)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r6 = r6.mo32927f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r5 = r5.f48061b     // Catch:{ all -> 0x07c7 }
            java.lang.String r5 = r6.mo33369a(r5)     // Catch:{ all -> 0x07c7 }
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo33379a(r3, r4, r5, r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r6 = r0.mo32926e()     // Catch:{ all -> 0x07c7 }
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            r6.mo33144a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            return
        L_0x04a0:
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x07c7 }
            java.lang.String r8 = r5.f48061b     // Catch:{ all -> 0x07c7 }
            r9 = 0
            r11 = 0
            long r13 = r5.f48062c     // Catch:{ all -> 0x07c7 }
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r0
            r7 = r2
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x07c7 }
            goto L_0x04c8
        L_0x04ba:
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            long r6 = r4.f48151e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.c r5 = r5.mo32983a(r0, r6)     // Catch:{ all -> 0x07c7 }
            long r6 = r5.f48062c     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.d r0 = r4.mo33044a(r6)     // Catch:{ all -> 0x07c7 }
        L_0x04c8:
            com.google.android.gms.measurement.internal.ex r2 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r2.mo33308a(r0)     // Catch:{ all -> 0x07c7 }
            r25.mo33112i()     // Catch:{ all -> 0x07c7 }
            r25.mo33113j()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15464q.m32123a(r5)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15464q.m32123a(r27)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r5.f48060a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15464q.m32125a(r0)     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r5.f48060a     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.common.internal.C15464q.m32133b(r0)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.ee r2 = new com.google.android.gms.internal.measurement.ee     // Catch:{ all -> 0x07c7 }
            r2.<init>()     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x07c7 }
            r2.f46815a = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = "android"
            r2.f46823i = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            r2.f46829o = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f48490d     // Catch:{ all -> 0x07c7 }
            r2.f46828n = r0     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r3.f48489c     // Catch:{ all -> 0x07c7 }
            r2.f46830p = r0     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48496j     // Catch:{ all -> 0x07c7 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            r0 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0512
            r4 = r0
            goto L_0x0519
        L_0x0512:
            long r6 = r3.f48496j     // Catch:{ all -> 0x07c7 }
            int r4 = (int) r6     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07c7 }
        L_0x0519:
            r2.f46802C = r4     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48491e     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r2.f46831q = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48488b     // Catch:{ all -> 0x07c7 }
            r2.f46839y = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48504r     // Catch:{ all -> 0x07c7 }
            r2.f46808I = r4     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48492f     // Catch:{ all -> 0x07c7 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0535
            r4 = r0
            goto L_0x053b
        L_0x0535:
            long r6 = r3.f48492f     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
        L_0x053b:
            r2.f46836v = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47966e     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C17122h.f48384at     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo33280d(r6, r7)     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x0555
            com.google.android.gms.measurement.internal.ej r4 = r25.mo33109f()     // Catch:{ all -> 0x07c7 }
            int[] r4 = r4.mo33133e()     // Catch:{ all -> 0x07c7 }
            r2.f46810K = r4     // Catch:{ all -> 0x07c7 }
        L_0x0555:
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.af r4 = r4.mo32923b()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            android.util.Pair r4 = r4.mo32863a(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07c7 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x07c7 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x07c7 }
            if (r6 != 0) goto L_0x057c
            boolean r6 = r3.f48501o     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x05d5
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07c7 }
            r2.f46833s = r6     // Catch:{ all -> 0x07c7 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x07c7 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x07c7 }
            r2.f46834t = r4     // Catch:{ all -> 0x07c7 }
            goto L_0x05d5
        L_0x057c:
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo32932k()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            android.content.Context r6 = r6.mo32850m()     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo32942a(r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x05d5
            boolean r4 = r3.f48502p     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x05d5
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            android.content.Context r4 = r4.mo32850m()     // Catch:{ all -> 0x07c7 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r6)     // Catch:{ all -> 0x07c7 }
            if (r4 != 0) goto L_0x05ba
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r4 = r4.f48448e     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = "null secure ID. appId"
            java.lang.String r7 = r2.f46829o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17133r.m41997a(r7)     // Catch:{ all -> 0x07c7 }
            r4.mo33377a(r6, r7)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = "null"
            goto L_0x05d3
        L_0x05ba:
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x05d3
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r6 = r6.f48448e     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "empty secure ID. appId"
            java.lang.String r10 = r2.f46829o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C17133r.m41997a(r10)     // Catch:{ all -> 0x07c7 }
            r6.mo33377a(r7, r10)     // Catch:{ all -> 0x07c7 }
        L_0x05d3:
            r2.f46803D = r4     // Catch:{ all -> 0x07c7 }
        L_0x05d5:
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo32932k()     // Catch:{ all -> 0x07c7 }
            r4.mo32980w()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x07c7 }
            r2.f46825k = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo32932k()     // Catch:{ all -> 0x07c7 }
            r4.mo32980w()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x07c7 }
            r2.f46824j = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo32932k()     // Catch:{ all -> 0x07c7 }
            long r6 = r4.mo32941P_()     // Catch:{ all -> 0x07c7 }
            int r4 = (int) r6     // Catch:{ all -> 0x07c7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07c7 }
            r2.f46827m = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo32932k()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo32943f()     // Catch:{ all -> 0x07c7 }
            r2.f46826l = r4     // Catch:{ all -> 0x07c7 }
            r2.f46832r = r0     // Catch:{ all -> 0x07c7 }
            r2.f46818d = r0     // Catch:{ all -> 0x07c7 }
            r2.f46819e = r0     // Catch:{ all -> 0x07c7 }
            r2.f46820f = r0     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48498l     // Catch:{ all -> 0x07c7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r2.f46805F = r4     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            boolean r4 = r4.mo32936s()     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x062c
            boolean r4 = com.google.android.gms.measurement.internal.C17110eu.m41773t()     // Catch:{ all -> 0x07c7 }
            if (r4 == 0) goto L_0x062c
            r2.f46806G = r0     // Catch:{ all -> 0x07c7 }
        L_0x062c:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eo r0 = r0.mo33317b(r4)     // Catch:{ all -> 0x07c7 }
            if (r0 != 0) goto L_0x069a
            com.google.android.gms.measurement.internal.eo r0 = new com.google.android.gms.measurement.internal.eo     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.em r4 = r4.mo32926e()     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo33156i()     // Catch:{ all -> 0x07c7 }
            r0.mo33167a(r4)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48497k     // Catch:{ all -> 0x07c7 }
            r0.mo33182e(r4)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48488b     // Catch:{ all -> 0x07c7 }
            r0.mo33171b(r4)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.af r4 = r4.mo32923b()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r4.mo32866b(r6)     // Catch:{ all -> 0x07c7 }
            r0.mo33179d(r4)     // Catch:{ all -> 0x07c7 }
            r0.mo33184f(r8)     // Catch:{ all -> 0x07c7 }
            r0.mo33166a(r8)     // Catch:{ all -> 0x07c7 }
            r0.mo33170b(r8)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48489c     // Catch:{ all -> 0x07c7 }
            r0.mo33185f(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48496j     // Catch:{ all -> 0x07c7 }
            r0.mo33174c(r6)     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = r3.f48490d     // Catch:{ all -> 0x07c7 }
            r0.mo33188g(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48491e     // Catch:{ all -> 0x07c7 }
            r0.mo33178d(r6)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48492f     // Catch:{ all -> 0x07c7 }
            r0.mo33181e(r6)     // Catch:{ all -> 0x07c7 }
            boolean r4 = r3.f48494h     // Catch:{ all -> 0x07c7 }
            r0.mo33168a(r4)     // Catch:{ all -> 0x07c7 }
            long r6 = r3.f48498l     // Catch:{ all -> 0x07c7 }
            r0.mo33193i(r6)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r4 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r4.mo33309a(r0)     // Catch:{ all -> 0x07c7 }
        L_0x069a:
            java.lang.String r4 = r0.mo33169b()     // Catch:{ all -> 0x07c7 }
            r2.f46835u = r4     // Catch:{ all -> 0x07c7 }
            java.lang.String r0 = r0.mo33183f()     // Catch:{ all -> 0x07c7 }
            r2.f46801B = r0     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = r3.f48487a     // Catch:{ all -> 0x07c7 }
            java.util.List r0 = r0.mo33304a(r3)     // Catch:{ all -> 0x07c7 }
            int r3 = r0.size()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.eh[] r3 = new com.google.android.gms.internal.measurement.C16653eh[r3]     // Catch:{ all -> 0x07c7 }
            r2.f46817c = r3     // Catch:{ all -> 0x07c7 }
            r3 = 0
        L_0x06b9:
            int r4 = r0.size()     // Catch:{ all -> 0x07c7 }
            if (r3 >= r4) goto L_0x06f2
            com.google.android.gms.internal.measurement.eh r4 = new com.google.android.gms.internal.measurement.eh     // Catch:{ all -> 0x07c7 }
            r4.<init>()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.internal.measurement.eh[] r6 = r2.f46817c     // Catch:{ all -> 0x07c7 }
            r6[r3] = r4     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r6 = (com.google.android.gms.measurement.internal.C17101el) r6     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r6.f48274c     // Catch:{ all -> 0x07c7 }
            r4.f46850b = r6     // Catch:{ all -> 0x07c7 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r6 = (com.google.android.gms.measurement.internal.C17101el) r6     // Catch:{ all -> 0x07c7 }
            long r6 = r6.f48275d     // Catch:{ all -> 0x07c7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07c7 }
            r4.f46849a = r6     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ej r6 = r25.mo33109f()     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = r0.get(r3)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.el r7 = (com.google.android.gms.measurement.internal.C17101el) r7     // Catch:{ all -> 0x07c7 }
            java.lang.Object r7 = r7.f48276e     // Catch:{ all -> 0x07c7 }
            r6.mo33126a(r4, r7)     // Catch:{ all -> 0x07c7 }
            int r3 = r3 + 1
            goto L_0x06b9
        L_0x06f2:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ IOException -> 0x075e }
            long r3 = r0.mo33299a(r2)     // Catch:{ IOException -> 0x075e }
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.zzad r2 = r5.f48064e     // Catch:{ all -> 0x07c7 }
            if (r2 == 0) goto L_0x0754
            com.google.android.gms.measurement.internal.zzad r2 = r5.f48064e     // Catch:{ all -> 0x07c7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x07c7 }
        L_0x0708:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x071e
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = "_r"
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x07c7 }
            if (r6 == 0) goto L_0x0708
        L_0x071c:
            r2 = 1
            goto L_0x0755
        L_0x071e:
            com.google.android.gms.measurement.internal.as r2 = r25.m41572r()     // Catch:{ all -> 0x07c7 }
            java.lang.String r6 = r5.f48060a     // Catch:{ all -> 0x07c7 }
            java.lang.String r7 = r5.f48061b     // Catch:{ all -> 0x07c7 }
            boolean r2 = r2.mo32901c(r6, r7)     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ex r10 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            long r11 = r25.m41575u()     // Catch:{ all -> 0x07c7 }
            java.lang.String r13 = r5.f48060a     // Catch:{ all -> 0x07c7 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.ey r6 = r10.mo33302a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x07c7 }
            if (r2 == 0) goto L_0x0754
            long r6 = r6.f48329e     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r2 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.eu r2 = r2.f47966e     // Catch:{ all -> 0x07c7 }
            java.lang.String r10 = r5.f48060a     // Catch:{ all -> 0x07c7 }
            int r2 = r2.mo33272a(r10)     // Catch:{ all -> 0x07c7 }
            long r10 = (long) r2     // Catch:{ all -> 0x07c7 }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0754
            goto L_0x071c
        L_0x0754:
            r2 = 0
        L_0x0755:
            boolean r0 = r0.mo33313a(r5, r3, r2)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x0772
            r1.f48250q = r8     // Catch:{ all -> 0x07c7 }
            goto L_0x0772
        L_0x075e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r3 = r3.f48445b     // Catch:{ all -> 0x07c7 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.f46829o     // Catch:{ all -> 0x07c7 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C17133r.m41997a(r2)     // Catch:{ all -> 0x07c7 }
            r3.mo33378a(r4, r2, r0)     // Catch:{ all -> 0x07c7 }
        L_0x0772:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()     // Catch:{ all -> 0x07c7 }
            r0.mo33331u()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            r2 = 2
            boolean r0 = r0.mo33374a(r2)     // Catch:{ all -> 0x07c7 }
            if (r0 == 0) goto L_0x079d
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ all -> 0x07c7 }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x07c7 }
            com.google.android.gms.measurement.internal.p r3 = r3.mo32927f()     // Catch:{ all -> 0x07c7 }
            java.lang.String r3 = r3.mo33367a(r5)     // Catch:{ all -> 0x07c7 }
            r0.mo33377a(r2, r3)     // Catch:{ all -> 0x07c7 }
        L_0x079d:
            com.google.android.gms.measurement.internal.ex r0 = r25.mo33106d()
            r0.mo33332v()
            r25.mo33115n()
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r2 = "Background event processing time, ms"
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo33377a(r2, r3)
            return
        L_0x07c7:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ex r2 = r25.mo33106d()
            r2.mo33332v()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.m41571b(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:88|89) */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1.f48236b.mo32854q().f48445b.mo33378a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C17133r.m41997a(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0276 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33114k() {
        /*
            r17 = this;
            r1 = r17
            r17.mo33112i()
            r17.mo33113j()
            r0 = 1
            r1.f48253t = r0
            r2 = 0
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.cu r3 = r3.mo32931j()     // Catch:{ all -> 0x02b1 }
            java.lang.Boolean r3 = r3.f48132b     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x0029
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.mo33376a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x0029:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02b1 }
            if (r3 == 0) goto L_0x0042
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.mo33376a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x0042:
            long r3 = r1.f48250q     // Catch:{ all -> 0x02b1 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0053
            r17.mo33115n()     // Catch:{ all -> 0x02b1 }
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x0053:
            r17.mo33112i()     // Catch:{ all -> 0x02b1 }
            java.util.List<java.lang.Long> r3 = r1.f48256w     // Catch:{ all -> 0x02b1 }
            if (r3 == 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            if (r3 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.mo33376a(r3)     // Catch:{ all -> 0x02b1 }
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x0072:
            com.google.android.gms.measurement.internal.v r3 = r17.mo33105c()     // Catch:{ all -> 0x02b1 }
            boolean r3 = r3.mo33380e()     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo33376a(r3)     // Catch:{ all -> 0x02b1 }
            r17.mo33115n()     // Catch:{ all -> 0x02b1 }
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x0092:
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.common.util.e r3 = r3.mo32849l()     // Catch:{ all -> 0x02b1 }
            long r3 = r3.mo28523a()     // Catch:{ all -> 0x02b1 }
            long r7 = com.google.android.gms.measurement.internal.C17110eu.m41772i()     // Catch:{ all -> 0x02b1 }
            r9 = 0
            long r7 = r3 - r7
            r9 = 0
            r1.m41566a(r9, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo32923b()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f47875d     // Catch:{ all -> 0x02b1 }
            long r7 = r7.mo32882a()     // Catch:{ all -> 0x02b1 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r5 = r5.f48452i     // Catch:{ all -> 0x02b1 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            r10 = 0
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02b1 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02b1 }
            r5.mo33377a(r6, r7)     // Catch:{ all -> 0x02b1 }
        L_0x00cf:
            com.google.android.gms.measurement.internal.ex r5 = r17.mo33106d()     // Catch:{ all -> 0x02b1 }
            java.lang.String r5 = r5.mo33334x()     // Catch:{ all -> 0x02b1 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02b1 }
            r7 = -1
            if (r6 != 0) goto L_0x0288
            long r10 = r1.f48258y     // Catch:{ all -> 0x02b1 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.ex r6 = r17.mo33106d()     // Catch:{ all -> 0x02b1 }
            long r6 = r6.mo33298E()     // Catch:{ all -> 0x02b1 }
            r1.f48258y = r6     // Catch:{ all -> 0x02b1 }
        L_0x00ef:
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r6 = r6.f47966e     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C17122h.f48405p     // Catch:{ all -> 0x02b1 }
            int r6 = r6.mo33275b(r5, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ay r7 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r7 = r7.f47966e     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C17122h.f48406q     // Catch:{ all -> 0x02b1 }
            int r7 = r7.mo33275b(r5, r8)     // Catch:{ all -> 0x02b1 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ex r8 = r17.mo33106d()     // Catch:{ all -> 0x02b1 }
            java.util.List r6 = r8.mo33305a(r5, r6, r7)     // Catch:{ all -> 0x02b1 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02b1 }
            if (r7 != 0) goto L_0x02ab
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02b1 }
        L_0x0119:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02b1 }
            if (r8 == 0) goto L_0x0134
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02b1 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02b1 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee r8 = (com.google.android.gms.internal.measurement.C16650ee) r8     // Catch:{ all -> 0x02b1 }
            java.lang.String r10 = r8.f46833s     // Catch:{ all -> 0x02b1 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x0119
            java.lang.String r7 = r8.f46833s     // Catch:{ all -> 0x02b1 }
            goto L_0x0135
        L_0x0134:
            r7 = r9
        L_0x0135:
            if (r7 == 0) goto L_0x0160
            r8 = 0
        L_0x0138:
            int r10 = r6.size()     // Catch:{ all -> 0x02b1 }
            if (r8 >= r10) goto L_0x0160
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02b1 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee r10 = (com.google.android.gms.internal.measurement.C16650ee) r10     // Catch:{ all -> 0x02b1 }
            java.lang.String r11 = r10.f46833s     // Catch:{ all -> 0x02b1 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02b1 }
            if (r11 != 0) goto L_0x015d
            java.lang.String r10 = r10.f46833s     // Catch:{ all -> 0x02b1 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x015d
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02b1 }
            goto L_0x0160
        L_0x015d:
            int r8 = r8 + 1
            goto L_0x0138
        L_0x0160:
            com.google.android.gms.internal.measurement.ed r7 = new com.google.android.gms.internal.measurement.ed     // Catch:{ all -> 0x02b1 }
            r7.<init>()     // Catch:{ all -> 0x02b1 }
            int r8 = r6.size()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee[] r8 = new com.google.android.gms.internal.measurement.C16650ee[r8]     // Catch:{ all -> 0x02b1 }
            r7.f46798a = r8     // Catch:{ all -> 0x02b1 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02b1 }
            int r10 = r6.size()     // Catch:{ all -> 0x02b1 }
            r8.<init>(r10)     // Catch:{ all -> 0x02b1 }
            boolean r10 = com.google.android.gms.measurement.internal.C17110eu.m41773t()     // Catch:{ all -> 0x02b1 }
            if (r10 == 0) goto L_0x0188
            com.google.android.gms.measurement.internal.ay r10 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eu r10 = r10.f47966e     // Catch:{ all -> 0x02b1 }
            boolean r10 = r10.mo33277c(r5)     // Catch:{ all -> 0x02b1 }
            if (r10 == 0) goto L_0x0188
            r10 = 1
            goto L_0x0189
        L_0x0188:
            r10 = 0
        L_0x0189:
            r11 = 0
        L_0x018a:
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            int r12 = r12.length     // Catch:{ all -> 0x02b1 }
            if (r11 >= r12) goto L_0x01d5
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02b1 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee r13 = (com.google.android.gms.internal.measurement.C16650ee) r13     // Catch:{ all -> 0x02b1 }
            r12[r11] = r13     // Catch:{ all -> 0x02b1 }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x02b1 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02b1 }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x02b1 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x02b1 }
            r8.add(r12)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            r13 = 14710(0x3976, double:7.2677E-320)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02b1 }
            r12.f46832r = r13     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x02b1 }
            r12.f46818d = r13     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02b1 }
            r12.f46840z = r13     // Catch:{ all -> 0x02b1 }
            if (r10 != 0) goto L_0x01d2
            com.google.android.gms.internal.measurement.ee[] r12 = r7.f46798a     // Catch:{ all -> 0x02b1 }
            r12 = r12[r11]     // Catch:{ all -> 0x02b1 }
            r12.f46806G = r9     // Catch:{ all -> 0x02b1 }
        L_0x01d2:
            int r11 = r11 + 1
            goto L_0x018a
        L_0x01d5:
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo32854q()     // Catch:{ all -> 0x02b1 }
            r10 = 2
            boolean r6 = r6.mo33374a(r10)     // Catch:{ all -> 0x02b1 }
            if (r6 == 0) goto L_0x01ea
            com.google.android.gms.measurement.internal.ej r6 = r17.mo33109f()     // Catch:{ all -> 0x02b1 }
            java.lang.String r9 = r6.mo33131b(r7)     // Catch:{ all -> 0x02b1 }
        L_0x01ea:
            com.google.android.gms.measurement.internal.ej r6 = r17.mo33109f()     // Catch:{ all -> 0x02b1 }
            byte[] r14 = r6.mo33129a(r7)     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.h$a<java.lang.String> r6 = com.google.android.gms.measurement.internal.C17122h.f48415z     // Catch:{ all -> 0x02b1 }
            java.lang.Object r6 = r6.mo33351b()     // Catch:{ all -> 0x02b1 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x02b1 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0276 }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x0276 }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x0276 }
            r10 = r10 ^ r0
            com.google.android.gms.common.internal.C15464q.m32133b(r10)     // Catch:{ MalformedURLException -> 0x0276 }
            java.util.List<java.lang.Long> r10 = r1.f48256w     // Catch:{ MalformedURLException -> 0x0276 }
            if (r10 == 0) goto L_0x0219
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.t r8 = r8.f48445b     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.mo33376a(r10)     // Catch:{ MalformedURLException -> 0x0276 }
            goto L_0x0220
        L_0x0219:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0276 }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x0276 }
            r1.f48256w = r10     // Catch:{ MalformedURLException -> 0x0276 }
        L_0x0220:
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.af r8 = r8.mo32923b()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ai r8 = r8.f47876e     // Catch:{ MalformedURLException -> 0x0276 }
            r8.mo32883a(r3)     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.ee[] r4 = r7.f46798a     // Catch:{ MalformedURLException -> 0x0276 }
            int r4 = r4.length     // Catch:{ MalformedURLException -> 0x0276 }
            if (r4 <= 0) goto L_0x0238
            com.google.android.gms.internal.measurement.ee[] r3 = r7.f46798a     // Catch:{ MalformedURLException -> 0x0276 }
            r3 = r3[r2]     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r3 = r3.f46829o     // Catch:{ MalformedURLException -> 0x0276 }
        L_0x0238:
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.t r4 = r4.f48453j     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0276 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0276 }
            r4.mo33379a(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x0276 }
            r1.f48252s = r0     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.v r11 = r17.mo33105c()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ef r0 = new com.google.android.gms.measurement.internal.ef     // Catch:{ MalformedURLException -> 0x0276 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0276 }
            r11.mo32840c()     // Catch:{ MalformedURLException -> 0x0276 }
            r11.mo33089j()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15464q.m32123a(r13)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15464q.m32123a(r14)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.common.internal.C15464q.m32123a(r0)     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.at r3 = r11.mo32853p()     // Catch:{ MalformedURLException -> 0x0276 }
            com.google.android.gms.measurement.internal.ab r4 = new com.google.android.gms.measurement.internal.ab     // Catch:{ MalformedURLException -> 0x0276 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0276 }
            r3.mo32914b(r4)     // Catch:{ MalformedURLException -> 0x0276 }
            goto L_0x02ab
        L_0x0276:
            com.google.android.gms.measurement.internal.ay r0 = r1.f48236b     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo32854q()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ all -> 0x02b1 }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r5)     // Catch:{ all -> 0x02b1 }
            r0.mo33378a(r3, r4, r6)     // Catch:{ all -> 0x02b1 }
            goto L_0x02ab
        L_0x0288:
            r1.f48258y = r7     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.ex r0 = r17.mo33106d()     // Catch:{ all -> 0x02b1 }
            long r5 = com.google.android.gms.measurement.internal.C17110eu.m41772i()     // Catch:{ all -> 0x02b1 }
            r7 = 0
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo33303a(r3)     // Catch:{ all -> 0x02b1 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02b1 }
            if (r3 != 0) goto L_0x02ab
            com.google.android.gms.measurement.internal.ex r3 = r17.mo33106d()     // Catch:{ all -> 0x02b1 }
            com.google.android.gms.measurement.internal.eo r0 = r3.mo33317b(r0)     // Catch:{ all -> 0x02b1 }
            if (r0 == 0) goto L_0x02ab
            r1.m41563a(r0)     // Catch:{ all -> 0x02b1 }
        L_0x02ab:
            r1.f48253t = r2
            r17.m41577w()
            return
        L_0x02b1:
            r0 = move-exception
            r1.f48253t = r2
            r17.m41577w()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.mo33114k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r5 = r1;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0adc, code lost:
        if (r18 != r14) goto L_0x0ade;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v68 android.database.Cursor) = (r3v63 android.database.Cursor), (r3v63 android.database.Cursor), (r3v63 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v71 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:47:0x00e2, B:53:0x00ef, B:54:?, B:24:0x0080, B:30:0x008d, B:32:0x0091, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x026a A[SYNTHETIC, Splitter:B:132:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0271 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027f A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x038f A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0391 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0394 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0395 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0594 A[ADDED_TO_REGION, Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0651 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x06d2 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0821 A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x083b A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x085b A[Catch:{ IOException -> 0x0224, all -> 0x0d8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0afe A[Catch:{ all -> 0x0b9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b4a A[Catch:{ all -> 0x0b9e }] */
    /* JADX WARNING: Removed duplicated region for block: B:559:0x0d6f  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0d86 A[SYNTHETIC, Splitter:B:567:0x0d86] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0838 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m41566a(java.lang.String r53, long r54) {
        /*
            r52 = this;
            r1 = r52
            com.google.android.gms.measurement.internal.ex r2 = r52.mo33106d()
            r2.mo33326e()
            com.google.android.gms.measurement.internal.ed$a r2 = new com.google.android.gms.measurement.internal.ed$a     // Catch:{ all -> 0x0d8d }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            long r5 = r1.f48258y     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.internal.C15464q.m32123a(r2)     // Catch:{ all -> 0x0d8d }
            r4.mo32840c()     // Catch:{ all -> 0x0d8d }
            r4.mo33089j()     // Catch:{ all -> 0x0d8d }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo33333w()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            if (r13 == 0) goto L_0x00a0
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r5 = r1
            r8 = r3
            goto L_0x0252
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0259
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r7 = r16.length()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            if (r7 != 0) goto L_0x008d
            if (r3 == 0) goto L_0x026d
            r3.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x008d:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r22 = r3
            r3 = r7
            r7 = r13
            goto L_0x00fa
        L_0x009d:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x00a0:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            goto L_0x00b5
        L_0x00b0:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
        L_0x00b5:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00be
        L_0x00bc:
            java.lang.String r7 = ""
        L_0x00be:
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r13 = r13.length()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x0255, all -> 0x024f }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            if (r7 != 0) goto L_0x00ef
            if (r3 == 0) goto L_0x026d
            r3.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x00ef:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x024a, all -> 0x0040 }
            r22 = r3
            r7 = r13
            r3 = 0
        L_0x00fa:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r23 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0244, all -> 0x023f }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x023b }
            if (r9 != 0) goto L_0x0139
            com.google.android.gms.measurement.internal.r r5 = r4.mo32854q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r5 = r5.f48445b     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r5.mo33377a(r6, r7)     // Catch:{ SQLiteException -> 0x023b }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x0139:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x023b }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.internal.measurement.kq r9 = com.google.android.gms.internal.measurement.C16839kq.m40832a(r9, r11, r13)     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.internal.measurement.ee r13 = new com.google.android.gms.internal.measurement.ee     // Catch:{ SQLiteException -> 0x023b }
            r13.<init>()     // Catch:{ SQLiteException -> 0x023b }
            r13.mo31923a(r9)     // Catch:{ IOException -> 0x0224 }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x023b }
            if (r9 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.r r9 = r4.mo32854q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r9 = r9.f48448e     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r9.mo33377a(r14, r15)     // Catch:{ SQLiteException -> 0x023b }
        L_0x015f:
            r8.close()     // Catch:{ SQLiteException -> 0x023b }
            r2.mo33117a(r13)     // Catch:{ SQLiteException -> 0x023b }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x017f
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x023b }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x023b }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x023b }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x023b }
            r16 = r9
            r17 = r14
            goto L_0x018b
        L_0x017f:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x023b }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x023b }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x023b }
            r16 = r5
            r17 = r6
        L_0x018b:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x023b }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r23
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x023b }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.r r6 = r4.mo32854q()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.measurement.internal.t r6 = r6.f48448e     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r6.mo33377a(r7, r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x01cb:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            int r8 = r9.length     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.internal.measurement.kq r8 = com.google.android.gms.internal.measurement.C16839kq.m40832a(r9, r11, r8)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.internal.measurement.eb r9 = new com.google.android.gms.internal.measurement.eb     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.<init>()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.mo31923a(r8)     // Catch:{ IOException -> 0x01fe }
            java.lang.String r8 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.f46788b = r8     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r9.f46789c = r8     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            boolean r6 = r2.mo33118a(r6, r9)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x020f
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x01fe:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.r r7 = r4.mo32854q()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            com.google.android.gms.measurement.internal.t r7 = r7.f48445b     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            r7.mo33378a(r8, r9, r6)     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
        L_0x020f:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021f, all -> 0x021b }
            if (r6 != 0) goto L_0x01cb
            if (r5 == 0) goto L_0x026d
            r5.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x021b:
            r0 = move-exception
            r8 = r5
            goto L_0x0d81
        L_0x021f:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x0224:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.r r6 = r4.mo32854q()     // Catch:{ SQLiteException -> 0x023b }
            com.google.android.gms.measurement.internal.t r6 = r6.f48445b     // Catch:{ SQLiteException -> 0x023b }
            java.lang.String r7 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ SQLiteException -> 0x023b }
            r6.mo33378a(r7, r9, r5)     // Catch:{ SQLiteException -> 0x023b }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d8d }
            goto L_0x026d
        L_0x023b:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x023f:
            r0 = move-exception
            r5 = r1
            r8 = r22
            goto L_0x0252
        L_0x0244:
            r0 = move-exception
            r7 = r3
            r8 = r22
            goto L_0x0048
        L_0x024a:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x024f:
            r0 = move-exception
            r5 = r1
            r8 = 0
        L_0x0252:
            r1 = r0
            goto L_0x0d84
        L_0x0255:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0259:
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ all -> 0x0d80 }
            com.google.android.gms.measurement.internal.t r4 = r4.f48445b     // Catch:{ all -> 0x0d80 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C17133r.m41997a(r7)     // Catch:{ all -> 0x0d80 }
            r4.mo33378a(r5, r6, r3)     // Catch:{ all -> 0x0d80 }
            if (r8 == 0) goto L_0x026d
            r8.close()     // Catch:{ all -> 0x0d8d }
        L_0x026d:
            java.util.List<com.google.android.gms.internal.measurement.eb> r3 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            if (r3 == 0) goto L_0x027c
            java.util.List<com.google.android.gms.internal.measurement.eb> r3 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0d8d }
            if (r3 == 0) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r3 = 0
            goto L_0x027d
        L_0x027c:
            r3 = 1
        L_0x027d:
            if (r3 != 0) goto L_0x0d6f
            com.google.android.gms.internal.measurement.ee r3 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.util.List<com.google.android.gms.internal.measurement.eb> r4 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            int r4 = r4.size()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eb[] r4 = new com.google.android.gms.internal.measurement.C16647eb[r4]     // Catch:{ all -> 0x0d8d }
            r3.f46816b = r4     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47966e     // Catch:{ all -> 0x0d8d }
            java.lang.String r5 = r3.f46829o     // Catch:{ all -> 0x0d8d }
            boolean r4 = r4.mo33279d(r5)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r5 = r5.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r6 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r6 = r6.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C17122h.f48380ap     // Catch:{ all -> 0x0d8d }
            boolean r5 = r5.mo33280d(r6, r7)     // Catch:{ all -> 0x0d8d }
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x02aa:
            java.util.List<com.google.android.gms.internal.measurement.eb> r7 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            int r7 = r7.size()     // Catch:{ all -> 0x0d8d }
            r16 = 1
            if (r8 >= r7) goto L_0x072e
            java.util.List<com.google.android.gms.internal.measurement.eb> r7 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eb r7 = (com.google.android.gms.internal.measurement.C16647eb) r7     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.as r12 = r52.m41572r()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r11 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r11.f46829o     // Catch:{ all -> 0x0d8d }
            r24 = r9
            java.lang.String r9 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r9 = r12.mo32899b(r11, r9)     // Catch:{ all -> 0x0d8d }
            if (r9 == 0) goto L_0x033d
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.ee r12 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = r12.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C17133r.m41997a(r12)     // Catch:{ all -> 0x0d8d }
            r25 = r8
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.p r8 = r8.mo32927f()     // Catch:{ all -> 0x0d8d }
            r26 = r13
            java.lang.String r13 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r8.mo33369a(r13)     // Catch:{ all -> 0x0d8d }
            r9.mo33378a(r11, r12, r8)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.as r8 = r52.m41572r()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.mo32907f(r9)     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.as r8 = r52.m41572r()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.mo32909g(r9)     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x0310
            goto L_0x0312
        L_0x0310:
            r8 = 0
            goto L_0x0313
        L_0x0312:
            r8 = 1
        L_0x0313:
            if (r8 != 0) goto L_0x0338
            java.lang.String r8 = "_err"
            java.lang.String r9 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x0338
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.em r16 = r8.mo32926e()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r8 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r8.f46829o     // Catch:{ all -> 0x0d8d }
            r18 = 11
            java.lang.String r19 = "_ev"
            java.lang.String r7 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            r21 = 0
            r17 = r8
            r20 = r7
            r16.mo33144a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0d8d }
        L_0x0338:
            r9 = r24
            r13 = 3
            goto L_0x0726
        L_0x033d:
            r25 = r8
            r26 = r13
            com.google.android.gms.measurement.internal.as r8 = r52.m41572r()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.mo32901c(r9, r11)     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x039b
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.internal.C15464q.m32125a(r11)     // Catch:{ all -> 0x0d8d }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0d8d }
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r13) goto L_0x0381
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r13) goto L_0x0377
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r13) goto L_0x036d
            goto L_0x038b
        L_0x036d:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x038b
            r11 = 1
            goto L_0x038c
        L_0x0377:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x038b
            r11 = 2
            goto L_0x038c
        L_0x0381:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x038b
            r11 = 0
            goto L_0x038c
        L_0x038b:
            r11 = -1
        L_0x038c:
            switch(r11) {
                case 0: goto L_0x0391;
                case 1: goto L_0x0391;
                case 2: goto L_0x0391;
                default: goto L_0x038f;
            }     // Catch:{ all -> 0x0d8d }
        L_0x038f:
            r11 = 0
            goto L_0x0392
        L_0x0391:
            r11 = 1
        L_0x0392:
            if (r11 == 0) goto L_0x0395
            goto L_0x039b
        L_0x0395:
            r37 = r14
            r39 = r24
            goto L_0x0584
        L_0x039b:
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            if (r11 != 0) goto L_0x03a4
            r11 = 0
            com.google.android.gms.internal.measurement.ec[] r12 = new com.google.android.gms.internal.measurement.C16648ec[r11]     // Catch:{ all -> 0x0d8d }
            r7.f46787a = r12     // Catch:{ all -> 0x0d8d }
        L_0x03a4:
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r12 = r11.length     // Catch:{ all -> 0x0d8d }
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x03ac:
            if (r13 >= r12) goto L_0x03e0
            r9 = r11[r13]     // Catch:{ all -> 0x0d8d }
            r28 = r11
            java.lang.String r11 = "_c"
            r29 = r12
            java.lang.String r12 = r9.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x03c7
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d8d }
            r9.f46795c = r11     // Catch:{ all -> 0x0d8d }
            r18 = 1
            goto L_0x03d9
        L_0x03c7:
            java.lang.String r11 = "_r"
            java.lang.String r12 = r9.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x03d9
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d8d }
            r9.f46795c = r11     // Catch:{ all -> 0x0d8d }
            r19 = 1
        L_0x03d9:
            int r13 = r13 + 1
            r11 = r28
            r12 = r29
            goto L_0x03ac
        L_0x03e0:
            if (r18 != 0) goto L_0x0420
            if (r8 == 0) goto L_0x0420
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48453j     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.ay r12 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.p r12 = r12.mo32927f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r13 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = r12.mo33369a(r13)     // Catch:{ all -> 0x0d8d }
            r9.mo33377a(r11, r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r9 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r11 = r11.length     // Catch:{ all -> 0x0d8d }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r9 = (com.google.android.gms.internal.measurement.C16648ec[]) r9     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec r11 = new com.google.android.gms.internal.measurement.ec     // Catch:{ all -> 0x0d8d }
            r11.<init>()     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "_c"
            r11.f46793a = r12     // Catch:{ all -> 0x0d8d }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d8d }
            r11.f46795c = r12     // Catch:{ all -> 0x0d8d }
            int r12 = r9.length     // Catch:{ all -> 0x0d8d }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0d8d }
            r7.f46787a = r9     // Catch:{ all -> 0x0d8d }
        L_0x0420:
            if (r19 != 0) goto L_0x045e
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48453j     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.ay r12 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.p r12 = r12.mo32927f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r13 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = r12.mo33369a(r13)     // Catch:{ all -> 0x0d8d }
            r9.mo33377a(r11, r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r9 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r11 = r11.length     // Catch:{ all -> 0x0d8d }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r9 = (com.google.android.gms.internal.measurement.C16648ec[]) r9     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec r11 = new com.google.android.gms.internal.measurement.ec     // Catch:{ all -> 0x0d8d }
            r11.<init>()     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "_r"
            r11.f46793a = r12     // Catch:{ all -> 0x0d8d }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d8d }
            r11.f46795c = r12     // Catch:{ all -> 0x0d8d }
            int r12 = r9.length     // Catch:{ all -> 0x0d8d }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0d8d }
            r7.f46787a = r9     // Catch:{ all -> 0x0d8d }
        L_0x045e:
            com.google.android.gms.measurement.internal.ex r28 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            long r29 = r52.m41575u()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0d8d }
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            r31 = r9
            com.google.android.gms.measurement.internal.ey r9 = r28.mo33302a(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d8d }
            long r11 = r9.f48329e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r9 = r9.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r13 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r13 = r13.f46829o     // Catch:{ all -> 0x0d8d }
            int r9 = r9.mo33272a(r13)     // Catch:{ all -> 0x0d8d }
            r37 = r14
            long r13 = (long) r9     // Catch:{ all -> 0x0d8d }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x04c7
            r9 = 0
        L_0x0490:
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r11 = r11.length     // Catch:{ all -> 0x0d8d }
            if (r9 >= r11) goto L_0x04c4
            java.lang.String r11 = "_r"
            com.google.android.gms.internal.measurement.ec[] r12 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            r12 = r12[r9]     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = r12.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x04c1
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r11 = r11.length     // Catch:{ all -> 0x0d8d }
            r12 = 1
            int r11 = r11 - r12
            com.google.android.gms.internal.measurement.ec[] r11 = new com.google.android.gms.internal.measurement.C16648ec[r11]     // Catch:{ all -> 0x0d8d }
            if (r9 <= 0) goto L_0x04b2
            com.google.android.gms.internal.measurement.ec[] r12 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            r13 = 0
            java.lang.System.arraycopy(r12, r13, r11, r13, r9)     // Catch:{ all -> 0x0d8d }
        L_0x04b2:
            int r12 = r11.length     // Catch:{ all -> 0x0d8d }
            if (r9 >= r12) goto L_0x04be
            com.google.android.gms.internal.measurement.ec[] r12 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r13 = r9 + 1
            int r14 = r11.length     // Catch:{ all -> 0x0d8d }
            int r14 = r14 - r9
            java.lang.System.arraycopy(r12, r13, r11, r9, r14)     // Catch:{ all -> 0x0d8d }
        L_0x04be:
            r7.f46787a = r11     // Catch:{ all -> 0x0d8d }
            goto L_0x04c4
        L_0x04c1:
            int r9 = r9 + 1
            goto L_0x0490
        L_0x04c4:
            r9 = r24
            goto L_0x04c8
        L_0x04c7:
            r9 = 1
        L_0x04c8:
            java.lang.String r11 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r11 = com.google.android.gms.measurement.internal.C17102em.m41662a(r11)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x0582
            if (r8 == 0) goto L_0x0582
            com.google.android.gms.measurement.internal.ex r12 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            long r13 = r52.m41575u()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r11 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r15 = r11.f46829o     // Catch:{ all -> 0x0d8d }
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            com.google.android.gms.measurement.internal.ey r11 = r12.mo33302a(r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0d8d }
            long r11 = r11.f48327c     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r13 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r13 = r13.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r14 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r14 = r14.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C17122h.f48412w     // Catch:{ all -> 0x0d8d }
            int r13 = r13.mo33275b(r14, r15)     // Catch:{ all -> 0x0d8d }
            long r13 = (long) r13     // Catch:{ all -> 0x0d8d }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0582
            com.google.android.gms.measurement.internal.ay r11 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r11 = r11.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r11 = r11.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.ee r13 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r13 = r13.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C17133r.m41997a(r13)     // Catch:{ all -> 0x0d8d }
            r11.mo33377a(r12, r13)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r11 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r12 = r11.length     // Catch:{ all -> 0x0d8d }
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x051c:
            if (r13 >= r12) goto L_0x0546
            r39 = r9
            r9 = r11[r13]     // Catch:{ all -> 0x0d8d }
            r40 = r11
            java.lang.String r11 = "_c"
            r41 = r12
            java.lang.String r12 = r9.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0d8d }
            if (r11 == 0) goto L_0x0532
            r15 = r9
            goto L_0x053d
        L_0x0532:
            java.lang.String r11 = "_err"
            java.lang.String r9 = r9.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d8d }
            if (r9 == 0) goto L_0x053d
            r14 = 1
        L_0x053d:
            int r13 = r13 + 1
            r9 = r39
            r11 = r40
            r12 = r41
            goto L_0x051c
        L_0x0546:
            r39 = r9
            if (r14 == 0) goto L_0x055d
            if (r15 == 0) goto L_0x055d
            com.google.android.gms.internal.measurement.ec[] r9 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            r11 = 1
            com.google.android.gms.internal.measurement.ec[] r12 = new com.google.android.gms.internal.measurement.C16648ec[r11]     // Catch:{ all -> 0x0d8d }
            r11 = 0
            r12[r11] = r15     // Catch:{ all -> 0x0d8d }
            java.lang.Object[] r9 = com.google.android.gms.common.util.C15511b.m32266a((T[]) r9, (T[]) r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r9 = (com.google.android.gms.internal.measurement.C16648ec[]) r9     // Catch:{ all -> 0x0d8d }
            r7.f46787a = r9     // Catch:{ all -> 0x0d8d }
            goto L_0x0584
        L_0x055d:
            if (r15 == 0) goto L_0x056c
            java.lang.String r9 = "_err"
            r15.f46793a = r9     // Catch:{ all -> 0x0d8d }
            r11 = 10
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d8d }
            r15.f46795c = r9     // Catch:{ all -> 0x0d8d }
            goto L_0x0584
        L_0x056c:
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48445b     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.ee r12 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = r12.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C17133r.m41997a(r12)     // Catch:{ all -> 0x0d8d }
            r9.mo33377a(r11, r12)     // Catch:{ all -> 0x0d8d }
            goto L_0x0584
        L_0x0582:
            r39 = r9
        L_0x0584:
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r9 = r9.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r11 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r11.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C17122h.f48370af     // Catch:{ all -> 0x0d8d }
            boolean r9 = r9.mo33278c(r11, r12)     // Catch:{ all -> 0x0d8d }
            if (r9 == 0) goto L_0x0640
            if (r8 == 0) goto L_0x0640
            com.google.android.gms.internal.measurement.ec[] r8 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            r9 = 0
            r11 = -1
            r12 = -1
        L_0x059b:
            int r13 = r8.length     // Catch:{ all -> 0x0d8d }
            if (r9 >= r13) goto L_0x05bc
            java.lang.String r13 = "value"
            r14 = r8[r9]     // Catch:{ all -> 0x0d8d }
            java.lang.String r14 = r14.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0d8d }
            if (r13 == 0) goto L_0x05ac
            r11 = r9
            goto L_0x05b9
        L_0x05ac:
            java.lang.String r13 = "currency"
            r14 = r8[r9]     // Catch:{ all -> 0x0d8d }
            java.lang.String r14 = r14.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0d8d }
            if (r13 == 0) goto L_0x05b9
            r12 = r9
        L_0x05b9:
            int r9 = r9 + 1
            goto L_0x059b
        L_0x05bc:
            r9 = -1
            if (r11 == r9) goto L_0x05ea
            r9 = r8[r11]     // Catch:{ all -> 0x0d8d }
            java.lang.Long r9 = r9.f46795c     // Catch:{ all -> 0x0d8d }
            if (r9 != 0) goto L_0x05ec
            r9 = r8[r11]     // Catch:{ all -> 0x0d8d }
            java.lang.Double r9 = r9.f46796d     // Catch:{ all -> 0x0d8d }
            if (r9 != 0) goto L_0x05ec
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48450g     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "Value must be specified with a numeric type."
            r9.mo33376a(r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r8 = m41567a(r8, r11)     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.ec[] r8 = m41569a(r8, r9)     // Catch:{ all -> 0x0d8d }
            r9 = 18
            java.lang.String r11 = "value"
            com.google.android.gms.internal.measurement.ec[] r8 = m41568a(r8, r9, r11)     // Catch:{ all -> 0x0d8d }
        L_0x05ea:
            r13 = 3
            goto L_0x063d
        L_0x05ec:
            r9 = -1
            if (r12 != r9) goto L_0x05f2
            r9 = 1
            r13 = 3
            goto L_0x061c
        L_0x05f2:
            r9 = r8[r12]     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46794b     // Catch:{ all -> 0x0d8d }
            if (r9 == 0) goto L_0x061a
            int r12 = r9.length()     // Catch:{ all -> 0x0d8d }
            r13 = 3
            if (r12 == r13) goto L_0x0600
            goto L_0x061b
        L_0x0600:
            r12 = 0
        L_0x0601:
            int r14 = r9.length()     // Catch:{ all -> 0x0d8d }
            if (r12 >= r14) goto L_0x0618
            int r14 = r9.codePointAt(r12)     // Catch:{ all -> 0x0d8d }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0d8d }
            if (r15 != 0) goto L_0x0612
            goto L_0x061b
        L_0x0612:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0d8d }
            int r12 = r12 + r14
            goto L_0x0601
        L_0x0618:
            r9 = 0
            goto L_0x061c
        L_0x061a:
            r13 = 3
        L_0x061b:
            r9 = 1
        L_0x061c:
            if (r9 == 0) goto L_0x063d
            com.google.android.gms.measurement.internal.ay r9 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r9 = r9.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r9 = r9.f48450g     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r9.mo33376a(r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r8 = m41567a(r8, r11)     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.ec[] r8 = m41569a(r8, r9)     // Catch:{ all -> 0x0d8d }
            r9 = 19
            java.lang.String r11 = "currency"
            com.google.android.gms.internal.measurement.ec[] r8 = m41568a(r8, r9, r11)     // Catch:{ all -> 0x0d8d }
        L_0x063d:
            r7.f46787a = r8     // Catch:{ all -> 0x0d8d }
            goto L_0x0641
        L_0x0640:
            r13 = 3
        L_0x0641:
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r8 = r8.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C17122h.f48379ao     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.mo33280d(r9, r11)     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x06c0
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d8d }
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x068b
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.ec r8 = com.google.android.gms.measurement.internal.C17099ej.m41615a(r7, r8)     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x06c0
            if (r6 == 0) goto L_0x0689
            java.lang.Long r8 = r6.f46789c     // Catch:{ all -> 0x0d8d }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d8d }
            java.lang.Long r10 = r7.f46789c     // Catch:{ all -> 0x0d8d }
            long r14 = r10.longValue()     // Catch:{ all -> 0x0d8d }
            r10 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0d8d }
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x0689
            boolean r8 = r1.m41565a(r7, r6)     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x0689
        L_0x0686:
            r6 = 0
            r10 = 0
            goto L_0x06c0
        L_0x0689:
            r10 = r7
            goto L_0x06c0
        L_0x068b:
            java.lang.String r8 = "_vs"
            java.lang.String r9 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x06c0
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = "_et"
            com.google.android.gms.internal.measurement.ec r8 = com.google.android.gms.measurement.internal.C17099ej.m41615a(r7, r8)     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x06c0
            if (r10 == 0) goto L_0x06bf
            java.lang.Long r6 = r10.f46789c     // Catch:{ all -> 0x0d8d }
            long r8 = r6.longValue()     // Catch:{ all -> 0x0d8d }
            java.lang.Long r6 = r7.f46789c     // Catch:{ all -> 0x0d8d }
            long r14 = r6.longValue()     // Catch:{ all -> 0x0d8d }
            r6 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0d8d }
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x06bf
            boolean r6 = r1.m41565a(r10, r7)     // Catch:{ all -> 0x0d8d }
            if (r6 == 0) goto L_0x06bf
            goto L_0x0686
        L_0x06bf:
            r6 = r7
        L_0x06c0:
            if (r4 == 0) goto L_0x071a
            if (r5 != 0) goto L_0x071a
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x071a
            com.google.android.gms.internal.measurement.ec[] r8 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x0705
            com.google.android.gms.internal.measurement.ec[] r8 = r7.f46787a     // Catch:{ all -> 0x0d8d }
            int r8 = r8.length     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x06d8
            goto L_0x0705
        L_0x06d8:
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = "_et"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r7, r8)     // Catch:{ all -> 0x0d8d }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x06fb
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r8 = r8.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.ee r11 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r11.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C17133r.m41997a(r11)     // Catch:{ all -> 0x0d8d }
            r8.mo33377a(r9, r11)     // Catch:{ all -> 0x0d8d }
            goto L_0x071a
        L_0x06fb:
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d8d }
            r11 = 0
            long r14 = r37 + r8
            r37 = r14
            goto L_0x071a
        L_0x0705:
            com.google.android.gms.measurement.internal.ay r8 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r8 = r8.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.ee r11 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r11 = r11.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C17133r.m41997a(r11)     // Catch:{ all -> 0x0d8d }
            r8.mo33377a(r9, r11)     // Catch:{ all -> 0x0d8d }
        L_0x071a:
            com.google.android.gms.internal.measurement.eb[] r8 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            int r9 = r26 + 1
            r8[r26] = r7     // Catch:{ all -> 0x0d8d }
            r26 = r9
            r14 = r37
            r9 = r39
        L_0x0726:
            int r8 = r25 + 1
            r13 = r26
            r11 = 0
            r12 = 1
            goto L_0x02aa
        L_0x072e:
            r24 = r9
            r26 = r13
            r37 = r14
            if (r5 == 0) goto L_0x078f
            r13 = r26
            r14 = r37
            r5 = 0
        L_0x073b:
            if (r5 >= r13) goto L_0x078c
            com.google.android.gms.internal.measurement.eb[] r6 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            r6 = r6[r5]     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "_e"
            java.lang.String r8 = r6.f46788b     // Catch:{ all -> 0x0d8d }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0d8d }
            if (r7 == 0) goto L_0x0768
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "_fr"
            com.google.android.gms.internal.measurement.ec r7 = com.google.android.gms.measurement.internal.C17099ej.m41615a(r6, r7)     // Catch:{ all -> 0x0d8d }
            if (r7 == 0) goto L_0x0768
            com.google.android.gms.internal.measurement.eb[] r6 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            int r7 = r5 + 1
            com.google.android.gms.internal.measurement.eb[] r8 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            int r9 = r13 - r5
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r7, r8, r5, r9)     // Catch:{ all -> 0x0d8d }
            int r13 = r13 + -1
            int r5 = r5 + -1
            goto L_0x0789
        L_0x0768:
            if (r4 == 0) goto L_0x0789
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "_et"
            com.google.android.gms.internal.measurement.ec r6 = com.google.android.gms.measurement.internal.C17099ej.m41615a(r6, r7)     // Catch:{ all -> 0x0d8d }
            if (r6 == 0) goto L_0x0789
            java.lang.Long r6 = r6.f46795c     // Catch:{ all -> 0x0d8d }
            if (r6 == 0) goto L_0x0789
            long r7 = r6.longValue()     // Catch:{ all -> 0x0d8d }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0789
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d8d }
            r8 = 0
            long r14 = r14 + r6
        L_0x0789:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x073b
        L_0x078c:
            r37 = r14
            goto L_0x0791
        L_0x078f:
            r13 = r26
        L_0x0791:
            java.util.List<com.google.android.gms.internal.measurement.eb> r5 = r2.f48261c     // Catch:{ all -> 0x0d8d }
            int r5 = r5.size()     // Catch:{ all -> 0x0d8d }
            if (r13 >= r5) goto L_0x07a3
            com.google.android.gms.internal.measurement.eb[] r5 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eb[] r5 = (com.google.android.gms.internal.measurement.C16647eb[]) r5     // Catch:{ all -> 0x0d8d }
            r3.f46816b = r5     // Catch:{ all -> 0x0d8d }
        L_0x07a3:
            if (r4 == 0) goto L_0x0871
            com.google.android.gms.measurement.internal.ex r4 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            java.lang.String r5 = r3.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r6 = "_lte"
            com.google.android.gms.measurement.internal.el r4 = r4.mo33321c(r5, r6)     // Catch:{ all -> 0x0d8d }
            if (r4 == 0) goto L_0x07df
            java.lang.Object r5 = r4.f48276e     // Catch:{ all -> 0x0d8d }
            if (r5 != 0) goto L_0x07b8
            goto L_0x07df
        L_0x07b8:
            com.google.android.gms.measurement.internal.el r5 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = r3.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.util.e r6 = r6.mo32849l()     // Catch:{ all -> 0x0d8d }
            long r10 = r6.mo28523a()     // Catch:{ all -> 0x0d8d }
            java.lang.Object r4 = r4.f48276e     // Catch:{ all -> 0x0d8d }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0d8d }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0d8d }
            r4 = 0
            long r12 = r12 + r37
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d8d }
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0d8d }
            r4 = r5
            goto L_0x07fc
        L_0x07df:
            com.google.android.gms.measurement.internal.el r4 = new com.google.android.gms.measurement.internal.el     // Catch:{ all -> 0x0d8d }
            java.lang.String r5 = r3.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r27 = "auto"
            java.lang.String r28 = "_lte"
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.util.e r6 = r6.mo32849l()     // Catch:{ all -> 0x0d8d }
            long r29 = r6.mo28523a()     // Catch:{ all -> 0x0d8d }
            java.lang.Long r31 = java.lang.Long.valueOf(r37)     // Catch:{ all -> 0x0d8d }
            r25 = r4
            r26 = r5
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0d8d }
        L_0x07fc:
            com.google.android.gms.internal.measurement.eh r5 = new com.google.android.gms.internal.measurement.eh     // Catch:{ all -> 0x0d8d }
            r5.<init>()     // Catch:{ all -> 0x0d8d }
            java.lang.String r6 = "_lte"
            r5.f46850b = r6     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.util.e r6 = r6.mo32849l()     // Catch:{ all -> 0x0d8d }
            long r6 = r6.mo28523a()     // Catch:{ all -> 0x0d8d }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d8d }
            r5.f46849a = r6     // Catch:{ all -> 0x0d8d }
            java.lang.Object r6 = r4.f48276e     // Catch:{ all -> 0x0d8d }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0d8d }
            r5.f46852d = r6     // Catch:{ all -> 0x0d8d }
            r6 = 0
        L_0x081c:
            com.google.android.gms.internal.measurement.eh[] r7 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            int r7 = r7.length     // Catch:{ all -> 0x0d8d }
            if (r6 >= r7) goto L_0x0838
            java.lang.String r7 = "_lte"
            com.google.android.gms.internal.measurement.eh[] r8 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            r8 = r8[r6]     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r8.f46850b     // Catch:{ all -> 0x0d8d }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0d8d }
            if (r7 == 0) goto L_0x0835
            com.google.android.gms.internal.measurement.eh[] r7 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            r7[r6] = r5     // Catch:{ all -> 0x0d8d }
            r6 = 1
            goto L_0x0839
        L_0x0835:
            int r6 = r6 + 1
            goto L_0x081c
        L_0x0838:
            r6 = 0
        L_0x0839:
            if (r6 != 0) goto L_0x0855
            com.google.android.gms.internal.measurement.eh[] r6 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eh[] r7 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            int r7 = r7.length     // Catch:{ all -> 0x0d8d }
            r8 = 1
            int r7 = r7 + r8
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eh[] r6 = (com.google.android.gms.internal.measurement.C16653eh[]) r6     // Catch:{ all -> 0x0d8d }
            r3.f46817c = r6     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eh[] r6 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eh[] r7 = r7.f46817c     // Catch:{ all -> 0x0d8d }
            int r7 = r7.length     // Catch:{ all -> 0x0d8d }
            r8 = 1
            int r7 = r7 - r8
            r6[r7] = r5     // Catch:{ all -> 0x0d8d }
        L_0x0855:
            r5 = 0
            int r7 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0871
            com.google.android.gms.measurement.internal.ex r5 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            r5.mo33314a(r4)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r5 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r5 = r5.f48452i     // Catch:{ all -> 0x0d8d }
            java.lang.String r6 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r4 = r4.f48276e     // Catch:{ all -> 0x0d8d }
            r5.mo33377a(r6, r4)     // Catch:{ all -> 0x0d8d }
        L_0x0871:
            java.lang.String r4 = r3.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eh[] r5 = r3.f46817c     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.eb[] r6 = r3.f46816b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.common.internal.C15464q.m32125a(r4)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.er r7 = r52.mo33108e()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.dz[] r4 = r7.mo33269a(r4, r6, r5)     // Catch:{ all -> 0x0d8d }
            r3.f46800A = r4     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.ay r4 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.eu r4 = r4.f47966e     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r5 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r5 = r5.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r6 = "1"
            com.google.android.gms.measurement.internal.ew r4 = r4.f48313a     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "measurement.event_sampling_enabled"
            java.lang.String r4 = r4.mo32896a(r5, r7)     // Catch:{ all -> 0x0d8d }
            boolean r4 = r6.equals(r4)     // Catch:{ all -> 0x0d8d }
            if (r4 == 0) goto L_0x0ba4
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0b9e }
            r4.<init>()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.eb[] r5 = r3.f46816b     // Catch:{ all -> 0x0b9e }
            int r5 = r5.length     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.eb[] r5 = new com.google.android.gms.internal.measurement.C16647eb[r5]     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.em r6 = r6.mo32926e()     // Catch:{ all -> 0x0b9e }
            java.security.SecureRandom r6 = r6.mo33155g()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.eb[] r7 = r3.f46816b     // Catch:{ all -> 0x0b9e }
            int r8 = r7.length     // Catch:{ all -> 0x0b9e }
            r9 = 0
            r10 = 0
        L_0x08b5:
            if (r9 >= r8) goto L_0x0b6c
            r11 = r7[r9]     // Catch:{ all -> 0x0b9e }
            java.lang.String r12 = r11.f46788b     // Catch:{ all -> 0x0b9e }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0b9e }
            if (r12 == 0) goto L_0x0940
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r11, r12)     // Catch:{ all -> 0x0d8d }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d8d }
            java.lang.Object r13 = r4.get(r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.d r13 = (com.google.android.gms.measurement.internal.C17061d) r13     // Catch:{ all -> 0x0d8d }
            if (r13 != 0) goto L_0x08e5
            com.google.android.gms.measurement.internal.ex r13 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r14 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r14 = r14.f46829o     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.d r13 = r13.mo33301a(r14, r12)     // Catch:{ all -> 0x0d8d }
            r4.put(r12, r13)     // Catch:{ all -> 0x0d8d }
        L_0x08e5:
            java.lang.Long r12 = r13.f48154h     // Catch:{ all -> 0x0d8d }
            if (r12 != 0) goto L_0x0932
            java.lang.Long r12 = r13.f48155i     // Catch:{ all -> 0x0d8d }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0d8d }
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0902
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r12 = r11.f46787a     // Catch:{ all -> 0x0d8d }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.f48155i     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r12 = com.google.android.gms.measurement.internal.C17099ej.m41624a(r12, r14, r15)     // Catch:{ all -> 0x0d8d }
            r11.f46787a = r12     // Catch:{ all -> 0x0d8d }
        L_0x0902:
            java.lang.Boolean r12 = r13.f48156j     // Catch:{ all -> 0x0d8d }
            if (r12 == 0) goto L_0x091f
            java.lang.Boolean r12 = r13.f48156j     // Catch:{ all -> 0x0d8d }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0d8d }
            if (r12 == 0) goto L_0x091f
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r12 = r11.f46787a     // Catch:{ all -> 0x0d8d }
            java.lang.String r13 = "_efs"
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r12 = com.google.android.gms.measurement.internal.C17099ej.m41624a(r12, r13, r14)     // Catch:{ all -> 0x0d8d }
            r11.f46787a = r12     // Catch:{ all -> 0x0d8d }
        L_0x091f:
            int r12 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d8d }
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            r10 = r12
            goto L_0x0b5c
        L_0x0932:
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            goto L_0x0b5c
        L_0x0940:
            com.google.android.gms.measurement.internal.as r12 = r52.m41572r()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ee r13 = r2.f48259a     // Catch:{ all -> 0x0b9e }
            java.lang.String r13 = r13.f46829o     // Catch:{ all -> 0x0b9e }
            long r12 = r12.mo32905e(r13)     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.ay r14 = r1.f48236b     // Catch:{ all -> 0x0b9e }
            r14.mo32926e()     // Catch:{ all -> 0x0b9e }
            java.lang.Long r14 = r11.f46789c     // Catch:{ all -> 0x0b9e }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0b9e }
            long r14 = com.google.android.gms.measurement.internal.C17102em.m41654a(r14, r12)     // Catch:{ all -> 0x0b9e }
            r42 = r7
            java.lang.String r7 = "_dbg"
            r43 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b9e }
            boolean r18 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b9e }
            if (r18 != 0) goto L_0x099a
            if (r8 != 0) goto L_0x096e
            goto L_0x099a
        L_0x096e:
            r44 = r3
            com.google.android.gms.internal.measurement.ec[] r3 = r11.f46787a     // Catch:{ all -> 0x0d8d }
            r45 = r9
            int r9 = r3.length     // Catch:{ all -> 0x0d8d }
            r46 = r12
            r12 = 0
        L_0x0978:
            if (r12 >= r9) goto L_0x09a0
            r13 = r3[r12]     // Catch:{ all -> 0x0d8d }
            r48 = r3
            java.lang.String r3 = r13.f46793a     // Catch:{ all -> 0x0d8d }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0d8d }
            if (r3 == 0) goto L_0x0995
            boolean r3 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0d8d }
            if (r3 == 0) goto L_0x09a0
            java.lang.Long r3 = r13.f46795c     // Catch:{ all -> 0x0d8d }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0d8d }
            if (r3 != 0) goto L_0x0993
            goto L_0x09a0
        L_0x0993:
            r3 = 1
            goto L_0x09a1
        L_0x0995:
            int r12 = r12 + 1
            r3 = r48
            goto L_0x0978
        L_0x099a:
            r44 = r3
            r45 = r9
            r46 = r12
        L_0x09a0:
            r3 = 0
        L_0x09a1:
            if (r3 != 0) goto L_0x09b2
            com.google.android.gms.measurement.internal.as r3 = r52.m41572r()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = r7.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            int r12 = r3.mo32902d(r7, r8)     // Catch:{ all -> 0x0d8d }
            goto L_0x09b3
        L_0x09b2:
            r12 = 1
        L_0x09b3:
            if (r12 > 0) goto L_0x09d3
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r3 = r3.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r3 = r3.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0d8d }
            r3.mo33378a(r7, r8, r9)     // Catch:{ all -> 0x0d8d }
            int r3 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d8d }
            r50 = r2
            r10 = r3
            r49 = r6
            goto L_0x0b5c
        L_0x09d3:
            java.lang.String r3 = r11.f46788b     // Catch:{ all -> 0x0b9e }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C17061d) r3     // Catch:{ all -> 0x0b9e }
            if (r3 != 0) goto L_0x0a25
            com.google.android.gms.measurement.internal.ex r3 = r52.mo33106d()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = r7.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.d r3 = r3.mo33301a(r7, r8)     // Catch:{ all -> 0x0d8d }
            if (r3 != 0) goto L_0x0a25
            com.google.android.gms.measurement.internal.ay r3 = r1.f48236b     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.r r3 = r3.mo32854q()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.t r3 = r3.f48448e     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.ee r8 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r8.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            r3.mo33378a(r7, r8, r9)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.d r3 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8d }
            java.lang.String r7 = r7.f46829o     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            r28 = 1
            r30 = 1
            java.lang.Long r9 = r11.f46789c     // Catch:{ all -> 0x0d8d }
            long r32 = r9.longValue()     // Catch:{ all -> 0x0d8d }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r25 = r3
            r26 = r7
            r27 = r8
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0d8d }
        L_0x0a25:
            r52.mo33109f()     // Catch:{ all -> 0x0b9e }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r11, r7)     // Catch:{ all -> 0x0b9e }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0b9e }
            if (r7 == 0) goto L_0x0a34
            r8 = 1
            goto L_0x0a35
        L_0x0a34:
            r8 = 0
        L_0x0a35:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0b9e }
            r9 = 1
            if (r12 != r9) goto L_0x0a63
            int r7 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d8d }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x0a5c
            java.lang.Long r8 = r3.f48154h     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x0a52
            java.lang.Long r8 = r3.f48155i     // Catch:{ all -> 0x0d8d }
            if (r8 != 0) goto L_0x0a52
            java.lang.Boolean r8 = r3.f48156j     // Catch:{ all -> 0x0d8d }
            if (r8 == 0) goto L_0x0a5c
        L_0x0a52:
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo33046a(r8, r8, r8)     // Catch:{ all -> 0x0d8d }
            java.lang.String r8 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            r4.put(r8, r3)     // Catch:{ all -> 0x0d8d }
        L_0x0a5c:
            r50 = r2
            r49 = r6
            r10 = r7
            goto L_0x0b5c
        L_0x0a63:
            int r9 = r6.nextInt(r12)     // Catch:{ all -> 0x0b9e }
            if (r9 != 0) goto L_0x0aa4
            r52.mo33109f()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r7 = r11.f46787a     // Catch:{ all -> 0x0d8d }
            java.lang.String r9 = "_sr"
            long r12 = (long) r12     // Catch:{ all -> 0x0d8d }
            r49 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.internal.measurement.ec[] r6 = com.google.android.gms.measurement.internal.C17099ej.m41624a(r7, r9, r6)     // Catch:{ all -> 0x0d8d }
            r11.f46787a = r6     // Catch:{ all -> 0x0d8d }
            int r6 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0d8d }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0d8d }
            if (r7 == 0) goto L_0x0a90
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d8d }
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo33046a(r8, r7, r8)     // Catch:{ all -> 0x0d8d }
        L_0x0a90:
            java.lang.String r7 = r11.f46788b     // Catch:{ all -> 0x0d8d }
            java.lang.Long r8 = r11.f46789c     // Catch:{ all -> 0x0d8d }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d8d }
            com.google.android.gms.measurement.internal.d r3 = r3.mo33045a(r8, r14)     // Catch:{ all -> 0x0d8d }
            r4.put(r7, r3)     // Catch:{ all -> 0x0d8d }
            r50 = r2
            r10 = r6
            goto L_0x0b5c
        L_0x0aa4:
            r49 = r6
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.eu r6 = r6.f47966e     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ee r9 = r2.f48259a     // Catch:{ all -> 0x0b9e }
            java.lang.String r9 = r9.f46829o     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C17122h.f48371ag     // Catch:{ all -> 0x0b9e }
            boolean r6 = r6.mo33278c(r9, r13)     // Catch:{ all -> 0x0b9e }
            if (r6 == 0) goto L_0x0ae2
            java.lang.Long r6 = r3.f48153g     // Catch:{ all -> 0x0b9e }
            if (r6 == 0) goto L_0x0ac5
            java.lang.Long r6 = r3.f48153g     // Catch:{ all -> 0x0d8d }
            long r18 = r6.longValue()     // Catch:{ all -> 0x0d8d }
            r50 = r2
            r51 = r7
            goto L_0x0ada
        L_0x0ac5:
            com.google.android.gms.measurement.internal.ay r6 = r1.f48236b     // Catch:{ all -> 0x0b9e }
            r6.mo32926e()     // Catch:{ all -> 0x0b9e }
            java.lang.Long r6 = r11.f46790d     // Catch:{ all -> 0x0b9e }
            r50 = r2
            long r1 = r6.longValue()     // Catch:{ all -> 0x0b9e }
            r51 = r7
            r6 = r46
            long r18 = com.google.android.gms.measurement.internal.C17102em.m41654a(r1, r6)     // Catch:{ all -> 0x0b9e }
        L_0x0ada:
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0ae0
        L_0x0ade:
            r1 = 1
            goto L_0x0afc
        L_0x0ae0:
            r1 = 0
            goto L_0x0afc
        L_0x0ae2:
            r50 = r2
            r51 = r7
            long r1 = r3.f48152f     // Catch:{ all -> 0x0b9e }
            java.lang.Long r6 = r11.f46789c     // Catch:{ all -> 0x0b9e }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b9e }
            r9 = 0
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0b9e }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x0ae0
            goto L_0x0ade
        L_0x0afc:
            if (r1 == 0) goto L_0x0b4a
            r52.mo33109f()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ec[] r1 = r11.f46787a     // Catch:{ all -> 0x0b9e }
            java.lang.String r2 = "_efs"
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ec[] r1 = com.google.android.gms.measurement.internal.C17099ej.m41624a(r1, r2, r6)     // Catch:{ all -> 0x0b9e }
            r11.f46787a = r1     // Catch:{ all -> 0x0b9e }
            r52.mo33109f()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ec[] r1 = r11.f46787a     // Catch:{ all -> 0x0b9e }
            java.lang.String r2 = "_sr"
            long r6 = (long) r12     // Catch:{ all -> 0x0b9e }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.ec[] r1 = com.google.android.gms.measurement.internal.C17099ej.m41624a(r1, r2, r9)     // Catch:{ all -> 0x0b9e }
            r11.f46787a = r1     // Catch:{ all -> 0x0b9e }
            int r1 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0b9e }
            boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0b9e }
            if (r2 == 0) goto L_0x0b39
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b9e }
            r6 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0b9e }
            r6 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo33046a(r6, r2, r7)     // Catch:{ all -> 0x0b9e }
        L_0x0b39:
            java.lang.String r2 = r11.f46788b     // Catch:{ all -> 0x0b9e }
            java.lang.Long r6 = r11.f46789c     // Catch:{ all -> 0x0b9e }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.d r3 = r3.mo33045a(r6, r14)     // Catch:{ all -> 0x0b9e }
            r4.put(r2, r3)     // Catch:{ all -> 0x0b9e }
            r10 = r1
            goto L_0x0b5c
        L_0x0b4a:
            boolean r1 = r8.booleanValue()     // Catch:{ all -> 0x0b9e }
            if (r1 == 0) goto L_0x0b5c
            java.lang.String r1 = r11.f46788b     // Catch:{ all -> 0x0b9e }
            r7 = r51
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo33046a(r7, r2, r2)     // Catch:{ all -> 0x0b9e }
            r4.put(r1, r3)     // Catch:{ all -> 0x0b9e }
        L_0x0b5c:
            int r9 = r45 + 1
            r7 = r42
            r8 = r43
            r3 = r44
            r6 = r49
            r2 = r50
            r1 = r52
            goto L_0x08b5
        L_0x0b6c:
            r50 = r2
            r1 = r3
            com.google.android.gms.internal.measurement.eb[] r2 = r1.f46816b     // Catch:{ all -> 0x0b9e }
            int r2 = r2.length     // Catch:{ all -> 0x0b9e }
            if (r10 >= r2) goto L_0x0b7c
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r10)     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.internal.measurement.eb[] r2 = (com.google.android.gms.internal.measurement.C16647eb[]) r2     // Catch:{ all -> 0x0b9e }
            r1.f46816b = r2     // Catch:{ all -> 0x0b9e }
        L_0x0b7c:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0b9e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0b9e }
        L_0x0b84:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0b9e }
            if (r3 == 0) goto L_0x0ba7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0b9e }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo33106d()     // Catch:{ all -> 0x0b9e }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0b9e }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C17061d) r3     // Catch:{ all -> 0x0b9e }
            r4.mo33308a(r3)     // Catch:{ all -> 0x0b9e }
            goto L_0x0b84
        L_0x0b9e:
            r0 = move-exception
            r1 = r0
            r5 = r52
            goto L_0x0d90
        L_0x0ba4:
            r50 = r2
            r1 = r3
        L_0x0ba7:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d6b }
            r1.f46819e = r2     // Catch:{ all -> 0x0d6b }
            r2 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d6b }
            r1.f46820f = r2     // Catch:{ all -> 0x0d6b }
            r2 = 0
        L_0x0bbb:
            com.google.android.gms.internal.measurement.eb[] r3 = r1.f46816b     // Catch:{ all -> 0x0d6b }
            int r3 = r3.length     // Catch:{ all -> 0x0d6b }
            if (r2 >= r3) goto L_0x0bef
            com.google.android.gms.internal.measurement.eb[] r3 = r1.f46816b     // Catch:{ all -> 0x0b9e }
            r3 = r3[r2]     // Catch:{ all -> 0x0b9e }
            java.lang.Long r4 = r3.f46789c     // Catch:{ all -> 0x0b9e }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b9e }
            java.lang.Long r6 = r1.f46819e     // Catch:{ all -> 0x0b9e }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b9e }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0bd8
            java.lang.Long r4 = r3.f46789c     // Catch:{ all -> 0x0b9e }
            r1.f46819e = r4     // Catch:{ all -> 0x0b9e }
        L_0x0bd8:
            java.lang.Long r4 = r3.f46789c     // Catch:{ all -> 0x0b9e }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b9e }
            java.lang.Long r6 = r1.f46820f     // Catch:{ all -> 0x0b9e }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0b9e }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0bec
            java.lang.Long r3 = r3.f46789c     // Catch:{ all -> 0x0b9e }
            r1.f46820f = r3     // Catch:{ all -> 0x0b9e }
        L_0x0bec:
            int r2 = r2 + 1
            goto L_0x0bbb
        L_0x0bef:
            r2 = r50
            com.google.android.gms.internal.measurement.ee r3 = r2.f48259a     // Catch:{ all -> 0x0d6b }
            java.lang.String r3 = r3.f46829o     // Catch:{ all -> 0x0d6b }
            com.google.android.gms.measurement.internal.ex r4 = r52.mo33106d()     // Catch:{ all -> 0x0d6b }
            com.google.android.gms.measurement.internal.eo r4 = r4.mo33317b(r3)     // Catch:{ all -> 0x0d6b }
            if (r4 != 0) goto L_0x0c17
            r5 = r52
            com.google.android.gms.measurement.internal.ay r4 = r5.f48236b     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.t r4 = r4.f48445b     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8a }
            java.lang.String r7 = r7.f46829o     // Catch:{ all -> 0x0d8a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17133r.m41997a(r7)     // Catch:{ all -> 0x0d8a }
            r4.mo33377a(r6, r7)     // Catch:{ all -> 0x0d8a }
            goto L_0x0c80
        L_0x0c17:
            r5 = r52
            com.google.android.gms.internal.measurement.eb[] r6 = r1.f46816b     // Catch:{ all -> 0x0d8a }
            int r6 = r6.length     // Catch:{ all -> 0x0d8a }
            if (r6 <= 0) goto L_0x0c80
            long r6 = r4.mo33189h()     // Catch:{ all -> 0x0d8a }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c2d
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d8a }
            goto L_0x0c2e
        L_0x0c2d:
            r8 = 0
        L_0x0c2e:
            r1.f46822h = r8     // Catch:{ all -> 0x0d8a }
            long r8 = r4.mo33186g()     // Catch:{ all -> 0x0d8a }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c3b
            goto L_0x0c3c
        L_0x0c3b:
            r6 = r8
        L_0x0c3c:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c45
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d8a }
            goto L_0x0c46
        L_0x0c45:
            r6 = 0
        L_0x0c46:
            r1.f46821g = r6     // Catch:{ all -> 0x0d8a }
            r4.mo33202r()     // Catch:{ all -> 0x0d8a }
            long r6 = r4.mo33199o()     // Catch:{ all -> 0x0d8a }
            int r6 = (int) r6     // Catch:{ all -> 0x0d8a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0d8a }
            r1.f46837w = r6     // Catch:{ all -> 0x0d8a }
            java.lang.Long r6 = r1.f46819e     // Catch:{ all -> 0x0d8a }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d8a }
            r4.mo33166a(r6)     // Catch:{ all -> 0x0d8a }
            java.lang.Long r6 = r1.f46820f     // Catch:{ all -> 0x0d8a }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d8a }
            r4.mo33170b(r6)     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.ay r6 = r4.f48286a     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.at r6 = r6.mo32853p()     // Catch:{ all -> 0x0d8a }
            r6.mo32840c()     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = r4.f48293h     // Catch:{ all -> 0x0d8a }
            r7 = 0
            r4.mo33191h(r7)     // Catch:{ all -> 0x0d8a }
            r1.f46838x = r6     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.ex r6 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            r6.mo33309a(r4)     // Catch:{ all -> 0x0d8a }
        L_0x0c80:
            com.google.android.gms.internal.measurement.eb[] r4 = r1.f46816b     // Catch:{ all -> 0x0d8a }
            int r4 = r4.length     // Catch:{ all -> 0x0d8a }
            if (r4 <= 0) goto L_0x0cce
            com.google.android.gms.measurement.internal.as r4 = r52.m41572r()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.internal.measurement.ee r6 = r2.f48259a     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = r6.f46829o     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.internal.measurement.dx r4 = r4.mo32895a(r6)     // Catch:{ all -> 0x0d8a }
            if (r4 == 0) goto L_0x0c9d
            java.lang.Long r6 = r4.f46763a     // Catch:{ all -> 0x0d8a }
            if (r6 != 0) goto L_0x0c98
            goto L_0x0c9d
        L_0x0c98:
            java.lang.Long r4 = r4.f46763a     // Catch:{ all -> 0x0d8a }
            r1.f46804E = r4     // Catch:{ all -> 0x0d8a }
            goto L_0x0cc5
        L_0x0c9d:
            com.google.android.gms.internal.measurement.ee r4 = r2.f48259a     // Catch:{ all -> 0x0d8a }
            java.lang.String r4 = r4.f46839y     // Catch:{ all -> 0x0d8a }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d8a }
            if (r4 == 0) goto L_0x0cb0
            r6 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d8a }
            r1.f46804E = r4     // Catch:{ all -> 0x0d8a }
            goto L_0x0cc5
        L_0x0cb0:
            com.google.android.gms.measurement.internal.ay r4 = r5.f48236b     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.t r4 = r4.f48448e     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.ee r7 = r2.f48259a     // Catch:{ all -> 0x0d8a }
            java.lang.String r7 = r7.f46829o     // Catch:{ all -> 0x0d8a }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17133r.m41997a(r7)     // Catch:{ all -> 0x0d8a }
            r4.mo33377a(r6, r7)     // Catch:{ all -> 0x0d8a }
        L_0x0cc5:
            com.google.android.gms.measurement.internal.ex r4 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            r9 = r24
            r4.mo33312a(r1, r9)     // Catch:{ all -> 0x0d8a }
        L_0x0cce:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            java.util.List<java.lang.Long> r2 = r2.f48260b     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.common.internal.C15464q.m32123a(r2)     // Catch:{ all -> 0x0d8a }
            r1.mo32840c()     // Catch:{ all -> 0x0d8a }
            r1.mo33089j()     // Catch:{ all -> 0x0d8a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x0d8a }
            r6 = 0
        L_0x0ce5:
            int r7 = r2.size()     // Catch:{ all -> 0x0d8a }
            if (r6 >= r7) goto L_0x0d02
            if (r6 == 0) goto L_0x0cf2
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0d8a }
        L_0x0cf2:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0d8a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d8a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d8a }
            r4.append(r7)     // Catch:{ all -> 0x0d8a }
            int r6 = r6 + 1
            goto L_0x0ce5
        L_0x0d02:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x0d8a }
            android.database.sqlite.SQLiteDatabase r6 = r1.mo33333w()     // Catch:{ all -> 0x0d8a }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0d8a }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x0d8a }
            int r6 = r2.size()     // Catch:{ all -> 0x0d8a }
            if (r4 == r6) goto L_0x0d33
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b     // Catch:{ all -> 0x0d8a }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0d8a }
            int r2 = r2.size()     // Catch:{ all -> 0x0d8a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d8a }
            r1.mo33378a(r6, r4, r2)     // Catch:{ all -> 0x0d8a }
        L_0x0d33:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            android.database.sqlite.SQLiteDatabase r2 = r1.mo33333w()     // Catch:{ all -> 0x0d8a }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0d4a }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d4a }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d4a }
            r2.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0d4a }
            goto L_0x0d5b
        L_0x0d4a:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b     // Catch:{ all -> 0x0d8a }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r3)     // Catch:{ all -> 0x0d8a }
            r1.mo33378a(r4, r3, r2)     // Catch:{ all -> 0x0d8a }
        L_0x0d5b:
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            r1.mo33331u()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()
            r1.mo33332v()
            r1 = 1
            return r1
        L_0x0d6b:
            r0 = move-exception
            r5 = r52
            goto L_0x0d8f
        L_0x0d6f:
            r5 = r1
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()     // Catch:{ all -> 0x0d8a }
            r1.mo33331u()     // Catch:{ all -> 0x0d8a }
            com.google.android.gms.measurement.internal.ex r1 = r52.mo33106d()
            r1.mo33332v()
            r1 = 0
            return r1
        L_0x0d80:
            r0 = move-exception
        L_0x0d81:
            r5 = r1
            goto L_0x0252
        L_0x0d84:
            if (r8 == 0) goto L_0x0d8c
            r8.close()     // Catch:{ all -> 0x0d8a }
            goto L_0x0d8c
        L_0x0d8a:
            r0 = move-exception
            goto L_0x0d8f
        L_0x0d8c:
            throw r1     // Catch:{ all -> 0x0d8a }
        L_0x0d8d:
            r0 = move-exception
            r5 = r1
        L_0x0d8f:
            r1 = r0
        L_0x0d90:
            com.google.android.gms.measurement.internal.ex r2 = r52.mo33106d()
            r2.mo33332v()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.m41566a(java.lang.String, long):boolean");
    }

    /* renamed from: a */
    private final boolean m41565a(C16647eb ebVar, C16647eb ebVar2) {
        Object obj;
        C15464q.m32133b("_e".equals(ebVar.f46788b));
        mo33109f();
        C16648ec a = C17099ej.m41615a(ebVar, "_sc");
        String str = null;
        if (a == null) {
            obj = null;
        } else {
            obj = a.f46794b;
        }
        mo33109f();
        C16648ec a2 = C17099ej.m41615a(ebVar2, "_pc");
        if (a2 != null) {
            str = a2.f46794b;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo33109f();
        C16648ec a3 = C17099ej.m41615a(ebVar, "_et");
        if (a3.f46795c == null || a3.f46795c.longValue() <= 0) {
            return true;
        }
        long longValue = a3.f46795c.longValue();
        mo33109f();
        C16648ec a4 = C17099ej.m41615a(ebVar2, "_et");
        if (!(a4 == null || a4.f46795c == null || a4.f46795c.longValue() <= 0)) {
            longValue += a4.f46795c.longValue();
        }
        mo33109f();
        ebVar2.f46787a = C17099ej.m41624a(ebVar2.f46787a, "_et", (Object) Long.valueOf(longValue));
        mo33109f();
        ebVar.f46787a = C17099ej.m41624a(ebVar.f46787a, "_fr", (Object) Long.valueOf(1));
        return true;
    }

    /* renamed from: a */
    private static C16648ec[] m41569a(C16648ec[] ecVarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= ecVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(ecVarArr[i].f46793a)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return ecVarArr;
        }
        return m41567a(ecVarArr, i);
    }

    /* renamed from: a */
    private static C16648ec[] m41567a(C16648ec[] ecVarArr, int i) {
        C16648ec[] ecVarArr2 = new C16648ec[(ecVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(ecVarArr, 0, ecVarArr2, 0, i);
        }
        if (i < ecVarArr2.length) {
            System.arraycopy(ecVarArr, i + 1, ecVarArr2, i, ecVarArr2.length - i);
        }
        return ecVarArr2;
    }

    /* renamed from: a */
    private static C16648ec[] m41568a(C16648ec[] ecVarArr, int i, String str) {
        for (C16648ec ecVar : ecVarArr) {
            if ("_err".equals(ecVar.f46793a)) {
                return ecVarArr;
            }
        }
        C16648ec[] ecVarArr2 = new C16648ec[(ecVarArr.length + 2)];
        System.arraycopy(ecVarArr, 0, ecVarArr2, 0, ecVarArr.length);
        C16648ec ecVar2 = new C16648ec();
        ecVar2.f46793a = "_err";
        ecVar2.f46795c = Long.valueOf((long) i);
        C16648ec ecVar3 = new C16648ec();
        ecVar3.f46793a = "_ev";
        ecVar3.f46794b = str;
        ecVarArr2[ecVarArr2.length - 2] = ecVar2;
        ecVarArr2[ecVarArr2.length - 1] = ecVar3;
        return ecVarArr2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33093a(int i, Throwable th, byte[] bArr, String str) {
        C17113ex d;
        mo33112i();
        mo33113j();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f48252s = false;
                m41577w();
                throw th2;
            }
        }
        List<Long> list = this.f48256w;
        this.f48256w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f48236b.mo32923b().f47875d.mo32883a(this.f48236b.mo32849l().mo28523a());
                this.f48236b.mo32923b().f47876e.mo32883a(0);
                mo33115n();
                this.f48236b.mo32854q().f48453j.mo33378a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo33106d().mo33326e();
                try {
                    for (Long l : list) {
                        try {
                            d = mo33106d();
                            long longValue = l.longValue();
                            d.mo32840c();
                            d.mo33089j();
                            if (d.mo33333w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            d.mo32854q().f48445b.mo33377a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f48257x == null || !this.f48257x.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo33106d().mo33331u();
                    mo33106d().mo33332v();
                    this.f48257x = null;
                    if (!mo33105c().mo33380e() || !m41576v()) {
                        this.f48258y = -1;
                        mo33115n();
                    } else {
                        mo33114k();
                    }
                    this.f48250q = 0;
                } catch (Throwable th3) {
                    mo33106d().mo33332v();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f48236b.mo32854q().f48445b.mo33377a("Database error while trying to delete uploaded bundles", e3);
                this.f48250q = this.f48236b.mo32849l().mo28524b();
                this.f48236b.mo32854q().f48453j.mo33377a("Disable upload, time", Long.valueOf(this.f48250q));
            }
        } else {
            this.f48236b.mo32854q().f48453j.mo33378a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f48236b.mo32923b().f47876e.mo32883a(this.f48236b.mo32849l().mo28523a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f48236b.mo32923b().f47877f.mo32883a(this.f48236b.mo32849l().mo28523a());
            }
            if (this.f48236b.f47966e.mo33278c(str, C17122h.f48362Z)) {
                mo33106d().mo33311a(list);
            }
            mo33115n();
        }
        this.f48252s = false;
        m41577w();
    }

    /* renamed from: v */
    private final boolean m41576v() {
        mo33112i();
        mo33113j();
        return mo33106d().mo33296C() || !TextUtils.isEmpty(mo33106d().mo33334x());
    }

    /* renamed from: a */
    private final void m41563a(C17104eo eoVar) {
        Map map;
        mo33112i();
        if (!TextUtils.isEmpty(eoVar.mo33173c()) || (C17110eu.m41774v() && !TextUtils.isEmpty(eoVar.mo33177d()))) {
            Builder builder = new Builder();
            String c = eoVar.mo33173c();
            if (TextUtils.isEmpty(c) && C17110eu.m41774v()) {
                c = eoVar.mo33177d();
            }
            Builder encodedAuthority = builder.scheme((String) C17122h.f48403n.mo33351b()).encodedAuthority((String) C17122h.f48404o.mo33351b());
            String str = "config/app/";
            String valueOf = String.valueOf(c);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", eoVar.mo33169b()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "14710");
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f48236b.mo32854q().f48453j.mo33377a("Fetching remote configuration", eoVar.mo33165a());
                C16642dx a = m41572r().mo32895a(eoVar.mo33165a());
                String b = m41572r().mo32898b(eoVar.mo33165a());
                if (a == null || TextUtils.isEmpty(b)) {
                    map = null;
                } else {
                    C0777a aVar = new C0777a();
                    aVar.put("If-Modified-Since", b);
                    map = aVar;
                }
                this.f48251r = true;
                C17137v c2 = mo33105c();
                String a2 = eoVar.mo33165a();
                C17096eg egVar = new C17096eg(this);
                c2.mo32840c();
                c2.mo33089j();
                C15464q.m32123a(url);
                C15464q.m32123a(egVar);
                C17000at p = c2.mo32853p();
                C16982ab abVar = new C16982ab(c2, a2, url, null, map, egVar);
                p.mo32914b((Runnable) abVar);
            } catch (MalformedURLException unused) {
                this.f48236b.mo32854q().f48445b.mo33378a("Failed to parse config URL. Not fetching. appId", C17133r.m41997a(eoVar.mo33165a()), uri);
            }
        } else {
            mo33099a(eoVar.mo33165a(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138 A[Catch:{ all -> 0x0187, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146 A[Catch:{ all -> 0x0187, all -> 0x000f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33099a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.mo33112i()
            r6.mo33113j()
            com.google.android.gms.common.internal.C15464q.m32125a(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r7 = move-exception
            goto L_0x0190
        L_0x0012:
            com.google.android.gms.measurement.internal.ay r1 = r6.f48236b     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x000f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x000f }
            r1.mo33377a(r2, r3)     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ex r1 = r6.mo33106d()     // Catch:{ all -> 0x000f }
            r1.mo33326e()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ex r1 = r6.mo33106d()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.eo r1 = r1.mo33317b(r7)     // Catch:{ all -> 0x0187 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0040
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0040
            if (r8 != r4) goto L_0x0044
        L_0x0040:
            if (r9 != 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.ay r8 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r8 = r8.f48448e     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C17133r.m41997a(r7)     // Catch:{ all -> 0x0187 }
            r8.mo33377a(r9, r7)     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00c8
            if (r8 != r5) goto L_0x0061
            goto L_0x00c8
        L_0x0061:
            com.google.android.gms.measurement.internal.ay r10 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r10 = r10.mo32849l()     // Catch:{ all -> 0x0187 }
            long r10 = r10.mo28523a()     // Catch:{ all -> 0x0187 }
            r1.mo33190h(r10)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r10 = r6.mo33106d()     // Catch:{ all -> 0x0187 }
            r10.mo33309a(r1)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r10 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r10 = r10.mo32854q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r10 = r10.f48453j     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0187 }
            r10.mo33378a(r11, r1, r9)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.as r9 = r6.m41572r()     // Catch:{ all -> 0x0187 }
            r9.mo32900c(r7)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r7 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo32923b()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f47876e     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r9 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r9 = r9.mo32849l()     // Catch:{ all -> 0x0187 }
            long r9 = r9.mo28523a()     // Catch:{ all -> 0x0187 }
            r7.mo32883a(r9)     // Catch:{ all -> 0x0187 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ac
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            if (r3 == 0) goto L_0x00c3
            com.google.android.gms.measurement.internal.ay r7 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.af r7 = r7.mo32923b()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ai r7 = r7.f47877f     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ay r8 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r8 = r8.mo32849l()     // Catch:{ all -> 0x0187 }
            long r8 = r8.mo28523a()     // Catch:{ all -> 0x0187 }
            r7.mo32883a(r8)     // Catch:{ all -> 0x0187 }
        L_0x00c3:
            r6.mo33115n()     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x00c8:
            r9 = 0
            if (r11 == 0) goto L_0x00d4
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0187 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0187 }
            goto L_0x00d5
        L_0x00d4:
            r11 = r9
        L_0x00d5:
            if (r11 == 0) goto L_0x00e4
            int r2 = r11.size()     // Catch:{ all -> 0x0187 }
            if (r2 <= 0) goto L_0x00e4
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0187 }
            goto L_0x00e5
        L_0x00e4:
            r11 = r9
        L_0x00e5:
            if (r8 == r5) goto L_0x0101
            if (r8 != r4) goto L_0x00ea
            goto L_0x0101
        L_0x00ea:
            com.google.android.gms.measurement.internal.as r9 = r6.m41572r()     // Catch:{ all -> 0x0187 }
            boolean r9 = r9.mo32897a(r7, r10, r11)     // Catch:{ all -> 0x0187 }
            if (r9 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.ex r7 = r6.mo33106d()     // Catch:{ all -> 0x000f }
            r7.mo33332v()     // Catch:{ all -> 0x000f }
            r6.f48251r = r0
            r6.m41577w()
            return
        L_0x0101:
            com.google.android.gms.measurement.internal.as r11 = r6.m41572r()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.measurement.dx r11 = r11.mo32895a(r7)     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.as r11 = r6.m41572r()     // Catch:{ all -> 0x0187 }
            boolean r9 = r11.mo32897a(r7, r9, r9)     // Catch:{ all -> 0x0187 }
            if (r9 != 0) goto L_0x0122
            com.google.android.gms.measurement.internal.ex r7 = r6.mo33106d()     // Catch:{ all -> 0x000f }
            r7.mo33332v()     // Catch:{ all -> 0x000f }
            r6.f48251r = r0
            r6.m41577w()
            return
        L_0x0122:
            com.google.android.gms.measurement.internal.ay r9 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.common.util.e r9 = r9.mo32849l()     // Catch:{ all -> 0x0187 }
            long r2 = r9.mo28523a()     // Catch:{ all -> 0x0187 }
            r1.mo33187g(r2)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r9 = r6.mo33106d()     // Catch:{ all -> 0x0187 }
            r9.mo33309a(r1)     // Catch:{ all -> 0x0187 }
            if (r8 != r5) goto L_0x0146
            com.google.android.gms.measurement.internal.ay r8 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo32854q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r8 = r8.f48450g     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo33377a(r9, r7)     // Catch:{ all -> 0x0187 }
            goto L_0x015c
        L_0x0146:
            com.google.android.gms.measurement.internal.ay r7 = r6.f48236b     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo32854q()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.t r7 = r7.f48453j     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0187 }
            int r10 = r10.length     // Catch:{ all -> 0x0187 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0187 }
            r7.mo33378a(r9, r8, r10)     // Catch:{ all -> 0x0187 }
        L_0x015c:
            com.google.android.gms.measurement.internal.v r7 = r6.mo33105c()     // Catch:{ all -> 0x0187 }
            boolean r7 = r7.mo33380e()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0170
            boolean r7 = r6.m41576v()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0170
            r6.mo33114k()     // Catch:{ all -> 0x0187 }
            goto L_0x0173
        L_0x0170:
            r6.mo33115n()     // Catch:{ all -> 0x0187 }
        L_0x0173:
            com.google.android.gms.measurement.internal.ex r7 = r6.mo33106d()     // Catch:{ all -> 0x0187 }
            r7.mo33331u()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.measurement.internal.ex r7 = r6.mo33106d()     // Catch:{ all -> 0x000f }
            r7.mo33332v()     // Catch:{ all -> 0x000f }
            r6.f48251r = r0
            r6.m41577w()
            return
        L_0x0187:
            r7 = move-exception
            com.google.android.gms.measurement.internal.ex r8 = r6.mo33106d()     // Catch:{ all -> 0x000f }
            r8.mo33332v()     // Catch:{ all -> 0x000f }
            throw r7     // Catch:{ all -> 0x000f }
        L_0x0190:
            r6.f48251r = r0
            r6.m41577w()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.mo33099a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b7  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33115n() {
        /*
            r20 = this;
            r0 = r20
            r20.mo33112i()
            r20.mo33113j()
            boolean r1 = r20.m41579y()
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.eu r1 = r1.f47966e
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C17122h.f48383as
            boolean r1 = r1.mo33274a(r2)
            if (r1 != 0) goto L_0x001b
            return
        L_0x001b:
            long r1 = r0.f48250q
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.common.util.e r1 = r1.mo32849l()
            long r1 = r1.mo28524b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f48250q
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo33377a(r2, r3)
            com.google.android.gms.measurement.internal.ad r1 = r20.m41573s()
            r1.mo32860b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m41574t()
            r1.mo33084e()
            return
        L_0x005c:
            r0.f48250q = r3
        L_0x005e:
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            boolean r1 = r1.mo32939v()
            if (r1 == 0) goto L_0x025c
            boolean r1 = r20.m41576v()
            if (r1 != 0) goto L_0x006e
            goto L_0x025c
        L_0x006e:
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.common.util.e r1 = r1.mo32849l()
            long r1 = r1.mo28523a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C17122h.f48346J
            java.lang.Object r5 = r5.mo33351b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ex r7 = r20.mo33106d()
            boolean r7 = r7.mo33297D()
            if (r7 != 0) goto L_0x009f
            com.google.android.gms.measurement.internal.ex r7 = r20.mo33106d()
            boolean r7 = r7.mo33335y()
            if (r7 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7 = 0
            goto L_0x00a0
        L_0x009f:
            r7 = 1
        L_0x00a0:
            if (r7 == 0) goto L_0x00da
            com.google.android.gms.measurement.internal.ay r9 = r0.f48236b
            com.google.android.gms.measurement.internal.eu r9 = r9.f47966e
            java.lang.String r9 = r9.mo33289j()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c9
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C17122h.f48341E
            java.lang.Object r9 = r9.mo33351b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00c9:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C17122h.f48340D
            java.lang.Object r9 = r9.mo33351b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00da:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C17122h.f48339C
            java.lang.Object r9 = r9.mo33351b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
        L_0x00ea:
            com.google.android.gms.measurement.internal.ay r11 = r0.f48236b
            com.google.android.gms.measurement.internal.af r11 = r11.mo32923b()
            com.google.android.gms.measurement.internal.ai r11 = r11.f47875d
            long r11 = r11.mo32882a()
            com.google.android.gms.measurement.internal.ay r13 = r0.f48236b
            com.google.android.gms.measurement.internal.af r13 = r13.mo32923b()
            com.google.android.gms.measurement.internal.ai r13 = r13.f47876e
            long r13 = r13.mo32882a()
            com.google.android.gms.measurement.internal.ex r15 = r20.mo33106d()
            r16 = r9
            long r8 = r15.mo33294A()
            com.google.android.gms.measurement.internal.ex r10 = r20.mo33106d()
            r18 = r5
            long r5 = r10.mo33295B()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0121
        L_0x011e:
            r8 = r3
            goto L_0x0197
        L_0x0121:
            r8 = 0
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0148
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0148
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0148:
            com.google.android.gms.measurement.internal.ej r7 = r20.mo33109f()
            r12 = r16
            boolean r7 = r7.mo33127a(r8, r12)
            if (r7 != 0) goto L_0x0156
            long r8 = r8 + r12
            goto L_0x0157
        L_0x0156:
            r8 = r10
        L_0x0157:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0197
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0197
            r5 = 0
        L_0x0160:
            r6 = 20
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C17122h.f48348L
            java.lang.Object r7 = r7.mo33351b()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x011e
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r11 = com.google.android.gms.measurement.internal.C17122h.f48347K
            java.lang.Object r11 = r11.mo33351b()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0194
            goto L_0x0197
        L_0x0194:
            int r5 = r5 + 1
            goto L_0x0160
        L_0x0197:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01b7
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "Next upload time is 0"
            r1.mo33376a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m41573s()
            r1.mo32860b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m41574t()
            r1.mo33084e()
            return
        L_0x01b7:
            com.google.android.gms.measurement.internal.v r1 = r20.mo33105c()
            boolean r1 = r1.mo33380e()
            if (r1 != 0) goto L_0x01dd
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "No network"
            r1.mo33376a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m41573s()
            r1.mo32859a()
            com.google.android.gms.measurement.internal.dz r1 = r20.m41574t()
            r1.mo33084e()
            return
        L_0x01dd:
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.af r1 = r1.mo32923b()
            com.google.android.gms.measurement.internal.ai r1 = r1.f47877f
            long r1 = r1.mo32882a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C17122h.f48337A
            java.lang.Object r5 = r5.mo33351b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ej r7 = r20.mo33109f()
            boolean r7 = r7.mo33127a(r1, r5)
            if (r7 != 0) goto L_0x0208
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0208:
            com.google.android.gms.measurement.internal.ad r1 = r20.m41573s()
            r1.mo32860b()
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.common.util.e r1 = r1.mo32849l()
            long r1 = r1.mo28523a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0243
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C17122h.f48342F
            java.lang.Object r1 = r1.mo33351b()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.af r1 = r1.mo32923b()
            com.google.android.gms.measurement.internal.ai r1 = r1.f47875d
            com.google.android.gms.measurement.internal.ay r2 = r0.f48236b
            com.google.android.gms.common.util.e r2 = r2.mo32849l()
            long r2 = r2.mo28523a()
            r1.mo32883a(r2)
        L_0x0243:
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r1.mo33377a(r2, r3)
            com.google.android.gms.measurement.internal.dz r1 = r20.m41574t()
            r1.mo33083a(r8)
            return
        L_0x025c:
            com.google.android.gms.measurement.internal.ay r1 = r0.f48236b
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo33376a(r2)
            com.google.android.gms.measurement.internal.ad r1 = r20.m41573s()
            r1.mo32860b()
            com.google.android.gms.measurement.internal.dz r1 = r20.m41574t()
            r1.mo33084e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.mo33115n():void");
    }

    /* renamed from: w */
    private final void m41577w() {
        mo33112i();
        if (this.f48251r || this.f48252s || this.f48253t) {
            this.f48236b.mo32854q().f48453j.mo33379a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f48251r), Boolean.valueOf(this.f48252s), Boolean.valueOf(this.f48253t));
            return;
        }
        this.f48236b.mo32854q().f48453j.mo33376a("Stopping uploading service(s)");
        if (this.f48237c != null) {
            for (Runnable run : this.f48237c) {
                run.run();
            }
            this.f48237c.clear();
        }
    }

    /* renamed from: b */
    private final Boolean m41570b(C17104eo eoVar) {
        try {
            if (eoVar.mo33194j() != -2147483648L) {
                if (eoVar.mo33194j() == ((long) C15377d.m31951a(this.f48236b.mo32850m()).mo28321b(eoVar.mo33165a(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C15377d.m31951a(this.f48236b.mo32850m()).mo28321b(eoVar.mo33165a(), 0).versionName;
                if (eoVar.mo33192i() != null && eoVar.mo33192i().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: x */
    private final boolean m41578x() {
        mo33112i();
        try {
            this.f48255v = new RandomAccessFile(new File(this.f48236b.mo32850m().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f48254u = this.f48255v.tryLock();
            if (this.f48254u != null) {
                this.f48236b.mo32854q().f48453j.mo33376a("Storage concurrent access okay");
                return true;
            }
            this.f48236b.mo32854q().f48445b.mo33376a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            this.f48236b.mo32854q().f48445b.mo33377a("Failed to acquire storage lock", e);
        } catch (IOException e2) {
            this.f48236b.mo32854q().f48445b.mo33377a("Failed to access storage lock file", e2);
        }
    }

    /* renamed from: a */
    private final int m41558a(FileChannel fileChannel) {
        int i;
        mo33112i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f48236b.mo32854q().f48445b.mo33376a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f48236b.mo32854q().f48448e.mo33377a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f48236b.mo32854q().f48445b.mo33377a("Failed to read from channel", e);
            i = 0;
        }
    }

    /* renamed from: a */
    private final boolean m41564a(int i, FileChannel fileChannel) {
        mo33112i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f48236b.mo32854q().f48445b.mo33376a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f48236b.mo32854q().f48445b.mo33377a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f48236b.mo32854q().f48445b.mo33377a("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo33116o() {
        mo33112i();
        mo33113j();
        if (!this.f48249p) {
            this.f48249p = true;
            mo33112i();
            mo33113j();
            if ((this.f48236b.f47966e.mo33274a(C17122h.f48383as) || m41579y()) && m41578x()) {
                int a = m41558a(this.f48255v);
                int y = this.f48236b.mo32933n().mo33356y();
                mo33112i();
                if (a > y) {
                    this.f48236b.mo32854q().f48445b.mo33378a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                } else if (a < y) {
                    if (m41564a(y, this.f48255v)) {
                        this.f48236b.mo32854q().f48453j.mo33378a("Storage version upgraded. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                    } else {
                        this.f48236b.mo32854q().f48445b.mo33378a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a), Integer.valueOf(y));
                    }
                }
            }
        }
        if (!this.f48248o && !this.f48236b.f47966e.mo33274a(C17122h.f48383as)) {
            this.f48236b.mo32854q().f48451h.mo33376a("This instance being marked as an uploader");
            this.f48248o = true;
            mo33115n();
        }
    }

    /* renamed from: y */
    private final boolean m41579y() {
        mo33112i();
        mo33113j();
        return this.f48248o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33097a(zzk zzk) {
        if (this.f48256w != null) {
            this.f48257x = new ArrayList();
            this.f48257x.addAll(this.f48256w);
        }
        C17113ex d = mo33106d();
        String str = zzk.f48487a;
        C15464q.m32125a(str);
        d.mo32840c();
        d.mo33089j();
        try {
            SQLiteDatabase w = d.mo33333w();
            String[] strArr = {str};
            int delete = w.delete("apps", "app_id=?", strArr) + 0 + w.delete("events", "app_id=?", strArr) + w.delete("user_attributes", "app_id=?", strArr) + w.delete("conditional_properties", "app_id=?", strArr) + w.delete("raw_events", "app_id=?", strArr) + w.delete("raw_events_metadata", "app_id=?", strArr) + w.delete("queue", "app_id=?", strArr) + w.delete("audience_filter_values", "app_id=?", strArr) + w.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo32854q().f48453j.mo33378a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo32854q().f48445b.mo33378a("Error resetting analytics data. appId, error", C17133r.m41997a(str), e);
        }
        zzk a = m41560a(this.f48236b.mo32850m(), zzk.f48487a, zzk.f48488b, zzk.f48494h, zzk.f48501o, zzk.f48502p, zzk.f48499m, zzk.f48504r);
        if (!this.f48236b.f47966e.mo33282e(zzk.f48487a) || zzk.f48494h) {
            mo33102b(a);
        }
    }

    /* renamed from: a */
    private final zzk m41560a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5 = str;
        String str6 = "Unknown";
        String str7 = "Unknown";
        String str8 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f48236b.mo32854q().f48445b.mo33376a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str6 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            this.f48236b.mo32854q().f48445b.mo33377a("Error retrieving installer package name. appId", C17133r.m41997a(str));
        }
        if (str6 == null) {
            str6 = "manual_install";
        } else if ("com.android.vending".equals(str6)) {
            str6 = "";
        }
        String str9 = str6;
        try {
            PackageInfo b = C15377d.m31951a(context).mo28321b(str5, 0);
            if (b != null) {
                CharSequence b2 = C15377d.m31951a(context).mo28322b(str5);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                str4 = b.versionName;
                i = b.versionCode;
            } else {
                str4 = str7;
                i = DynamicTabYellowPointVersion.DEFAULT;
            }
            zzk zzk = new zzk(str, str2, str4, (long) i, str9, 14710, this.f48236b.mo32926e().mo33136a(context, str5), (String) null, z, false, "", 0, this.f48236b.f47966e.mo33278c(str5, C17122h.f48369ae) ? j : 0, 0, z2, z3, false, str3);
            return zzk;
        } catch (NameNotFoundException unused2) {
            this.f48236b.mo32854q().f48445b.mo33378a("Error retrieving newly installed package info. appId, appName", C17133r.m41997a(str), str8);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33096a(zzfv zzfv, zzk zzk) {
        mo33112i();
        mo33113j();
        if (TextUtils.isEmpty(zzk.f48488b) && TextUtils.isEmpty(zzk.f48504r)) {
            return;
        }
        if (!zzk.f48494h) {
            mo33104c(zzk);
            return;
        }
        int c = this.f48236b.mo32926e().mo33151c(zzfv.f48479a);
        if (c != 0) {
            this.f48236b.mo32926e();
            this.f48236b.mo32926e().mo33144a(zzk.f48487a, c, "_ev", C17102em.m41658a(zzfv.f48479a, 24, true), zzfv.f48479a != null ? zzfv.f48479a.length() : 0);
            return;
        }
        int b = this.f48236b.mo32926e().mo33149b(zzfv.f48479a, zzfv.mo33393a());
        if (b != 0) {
            this.f48236b.mo32926e();
            String a = C17102em.m41658a(zzfv.f48479a, 24, true);
            Object a2 = zzfv.mo33393a();
            this.f48236b.mo32926e().mo33144a(zzk.f48487a, b, "_ev", a, (a2 == null || (!(a2 instanceof String) && !(a2 instanceof CharSequence))) ? 0 : String.valueOf(a2).length());
            return;
        }
        this.f48236b.mo32926e();
        Object c2 = C17102em.m41669c(zzfv.f48479a, zzfv.mo33393a());
        if (c2 != null) {
            if (this.f48236b.f47966e.mo33288i(zzk.f48487a) && "_sno".equals(zzfv.f48479a)) {
                long j = 0;
                C17101el c3 = mo33106d().mo33321c(zzk.f48487a, "_sno");
                if (c3 == null || !(c3.f48276e instanceof Long)) {
                    C17061d a3 = mo33106d().mo33301a(zzk.f48487a, "_s");
                    if (a3 != null) {
                        j = a3.f48149c;
                        this.f48236b.mo32854q().f48453j.mo33377a("Backfill the session number. Last used session number", Long.valueOf(j));
                    }
                } else {
                    j = ((Long) c3.f48276e).longValue();
                }
                c2 = Long.valueOf(j + 1);
            }
            C17101el elVar = new C17101el(zzk.f48487a, zzfv.f48483e, zzfv.f48479a, zzfv.f48480b, c2);
            this.f48236b.mo32854q().f48452i.mo33378a("Setting user property", this.f48236b.mo32927f().mo33371c(elVar.f48274c), c2);
            mo33106d().mo33326e();
            try {
                mo33104c(zzk);
                boolean a4 = mo33106d().mo33314a(elVar);
                mo33106d().mo33331u();
                if (a4) {
                    this.f48236b.mo32854q().f48452i.mo33378a("User property set", this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                } else {
                    this.f48236b.mo32854q().f48445b.mo33378a("Too many unique user properties are set. Ignoring user property", this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                    this.f48236b.mo32926e().mo33144a(zzk.f48487a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo33106d().mo33332v();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33101b(zzfv zzfv, zzk zzk) {
        mo33112i();
        mo33113j();
        if (TextUtils.isEmpty(zzk.f48488b) && TextUtils.isEmpty(zzk.f48504r)) {
            return;
        }
        if (!zzk.f48494h) {
            mo33104c(zzk);
            return;
        }
        this.f48236b.mo32854q().f48452i.mo33377a("Removing user property", this.f48236b.mo32927f().mo33371c(zzfv.f48479a));
        mo33106d().mo33326e();
        try {
            mo33104c(zzk);
            mo33106d().mo33319b(zzk.f48487a, zzfv.f48479a);
            mo33106d().mo33331u();
            this.f48236b.mo32854q().f48452i.mo33377a("User property removed", this.f48236b.mo32927f().mo33371c(zzfv.f48479a));
        } finally {
            mo33106d().mo33332v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33102b(zzk zzk) {
        int i;
        C17104eo b;
        long j;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        boolean z;
        C17113ex d;
        String a;
        zzk zzk2 = zzk;
        mo33112i();
        mo33113j();
        C15464q.m32123a(zzk);
        C15464q.m32125a(zzk2.f48487a);
        if (!TextUtils.isEmpty(zzk2.f48488b) || !TextUtils.isEmpty(zzk2.f48504r)) {
            C17104eo b2 = mo33106d().mo33317b(zzk2.f48487a);
            if (b2 != null && TextUtils.isEmpty(b2.mo33173c()) && !TextUtils.isEmpty(zzk2.f48488b)) {
                b2.mo33187g(0);
                mo33106d().mo33309a(b2);
                m41572r().mo32903d(zzk2.f48487a);
            }
            if (!zzk2.f48494h) {
                mo33104c(zzk);
                return;
            }
            long j2 = zzk2.f48499m;
            if (j2 == 0) {
                j2 = this.f48236b.mo32849l().mo28523a();
            }
            int i2 = zzk2.f48500n;
            if (i2 == 0 || i2 == 1) {
                i = i2;
            } else {
                this.f48236b.mo32854q().f48448e.mo33378a("Incorrect app type, assuming installed app. appId, appType", C17133r.m41997a(zzk2.f48487a), Integer.valueOf(i2));
                i = 0;
            }
            mo33106d().mo33326e();
            try {
                b = mo33106d().mo33317b(zzk2.f48487a);
                if (b != null) {
                    this.f48236b.mo32926e();
                    if (C17102em.m41664a(zzk2.f48488b, b.mo33173c(), zzk2.f48504r, b.mo33177d())) {
                        this.f48236b.mo32854q().f48448e.mo33377a("New GMP App Id passed in. Removing cached database data. appId", C17133r.m41997a(b.mo33165a()));
                        d = mo33106d();
                        a = b.mo33165a();
                        d.mo33089j();
                        d.mo32840c();
                        C15464q.m32125a(a);
                        SQLiteDatabase w = d.mo33333w();
                        String[] strArr = {a};
                        int delete = w.delete("events", "app_id=?", strArr) + 0 + w.delete("user_attributes", "app_id=?", strArr) + w.delete("conditional_properties", "app_id=?", strArr) + w.delete("apps", "app_id=?", strArr) + w.delete("raw_events", "app_id=?", strArr) + w.delete("raw_events_metadata", "app_id=?", strArr) + w.delete("event_filters", "app_id=?", strArr) + w.delete("property_filters", "app_id=?", strArr) + w.delete("audience_filter_values", "app_id=?", strArr);
                        if (delete > 0) {
                            d.mo32854q().f48453j.mo33378a("Deleted application data. app, records", a, Integer.valueOf(delete));
                        }
                        b = null;
                    }
                }
            } catch (SQLiteException e) {
                d.mo32854q().f48445b.mo33378a("Error deleting application data. appId, error", C17133r.m41997a(a), e);
            } catch (Throwable th) {
                mo33106d().mo33332v();
                throw th;
            }
            if (b != null) {
                if (b.mo33194j() != -2147483648L) {
                    if (b.mo33194j() != zzk2.f48496j) {
                        Bundle bundle = new Bundle();
                        bundle.putString("_pv", b.mo33192i());
                        zzag zzag = new zzag("_au", new zzad(bundle), "auto", j2);
                        mo33094a(zzag, zzk2);
                    }
                } else if (b.mo33192i() != null && !b.mo33192i().equals(zzk2.f48489c)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_pv", b.mo33192i());
                    zzag zzag2 = new zzag("_au", new zzad(bundle2), "auto", j2);
                    mo33094a(zzag2, zzk2);
                }
            }
            mo33104c(zzk);
            C17061d dVar = i == 0 ? mo33106d().mo33301a(zzk2.f48487a, "_f") : i == 1 ? mo33106d().mo33301a(zzk2.f48487a, "_v") : null;
            if (dVar == null) {
                long j3 = ((j2 / 3600000) + 1) * 3600000;
                if (i == 0) {
                    j = 1;
                    zzfv zzfv = new zzfv("_fot", j2, Long.valueOf(j3), "auto");
                    mo33096a(zzfv, zzk2);
                    if (this.f48236b.f47966e.mo33286g(zzk2.f48488b)) {
                        mo33112i();
                        this.f48236b.f47970i.mo32888a(zzk2.f48487a);
                    }
                    mo33112i();
                    mo33113j();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1);
                    bundle3.putLong("_r", 1);
                    bundle3.putLong("_uwa", 0);
                    bundle3.putLong("_pfo", 0);
                    bundle3.putLong("_sys", 0);
                    bundle3.putLong("_sysu", 0);
                    if (this.f48236b.f47966e.mo33292l(zzk2.f48487a)) {
                        bundle3.putLong("_et", 1);
                    }
                    if (this.f48236b.f47966e.mo33282e(zzk2.f48487a) && zzk2.f48503q) {
                        bundle3.putLong("_dac", 1);
                    }
                    if (this.f48236b.mo32850m().getPackageManager() == null) {
                        this.f48236b.mo32854q().f48445b.mo33377a("PackageManager is null, first open report might be inaccurate. appId", C17133r.m41997a(zzk2.f48487a));
                    } else {
                        try {
                            packageInfo = C15377d.m31951a(this.f48236b.mo32850m()).mo28321b(zzk2.f48487a, 0);
                        } catch (NameNotFoundException e2) {
                            this.f48236b.mo32854q().f48445b.mo33378a("Package info is null, first open report might be inaccurate. appId", C17133r.m41997a(zzk2.f48487a), e2);
                            packageInfo = null;
                        }
                        if (!(packageInfo == null || packageInfo.firstInstallTime == 0)) {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1);
                                z = false;
                            } else {
                                z = true;
                            }
                            zzfv zzfv2 = r7;
                            zzfv zzfv3 = new zzfv("_fi", j2, Long.valueOf(z ? 1 : 0), "auto");
                            mo33096a(zzfv2, zzk2);
                        }
                        try {
                            applicationInfo = C15377d.m31951a(this.f48236b.mo32850m()).mo28318a(zzk2.f48487a, 0);
                        } catch (NameNotFoundException e3) {
                            this.f48236b.mo32854q().f48445b.mo33378a("Application info is null, first open report might be inaccurate. appId", C17133r.m41997a(zzk2.f48487a), e3);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1);
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                bundle3.putLong("_sysu", 1);
                            }
                        }
                    }
                    C17113ex d2 = mo33106d();
                    String str = zzk2.f48487a;
                    C15464q.m32125a(str);
                    d2.mo32840c();
                    d2.mo33089j();
                    long h = d2.mo33330h(str, "first_open_count");
                    if (h >= 0) {
                        bundle3.putLong("_pfo", h);
                    }
                    zzag zzag3 = new zzag("_f", new zzad(bundle3), "auto", j2);
                    mo33094a(zzag3, zzk2);
                } else {
                    j = 1;
                    if (i == 1) {
                        zzfv zzfv4 = new zzfv("_fvt", j2, Long.valueOf(j3), "auto");
                        mo33096a(zzfv4, zzk2);
                        mo33112i();
                        mo33113j();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1);
                        bundle4.putLong("_r", 1);
                        if (this.f48236b.f47966e.mo33292l(zzk2.f48487a)) {
                            bundle4.putLong("_et", 1);
                        }
                        if (this.f48236b.f47966e.mo33282e(zzk2.f48487a) && zzk2.f48503q) {
                            bundle4.putLong("_dac", 1);
                        }
                        zzag zzag4 = new zzag("_v", new zzad(bundle4), "auto", j2);
                        mo33094a(zzag4, zzk2);
                    }
                }
                if (!this.f48236b.f47966e.mo33280d(zzk2.f48487a, C17122h.f48380ap)) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putLong("_et", j);
                    if (this.f48236b.f47966e.mo33292l(zzk2.f48487a)) {
                        bundle5.putLong("_fr", j);
                    }
                    zzag zzag5 = new zzag("_e", new zzad(bundle5), "auto", j2);
                    mo33094a(zzag5, zzk2);
                }
            } else if (zzk2.f48495i) {
                zzag zzag6 = new zzag("_cd", new zzad(new Bundle()), "auto", j2);
                mo33094a(zzag6, zzk2);
            }
            mo33106d().mo33331u();
            mo33106d().mo33332v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzk mo33091a(String str) {
        String str2 = str;
        C17104eo b = mo33106d().mo33317b(str2);
        if (b == null || TextUtils.isEmpty(b.mo33192i())) {
            this.f48236b.mo32854q().f48452i.mo33377a("No app data available; dropping", str2);
            return null;
        }
        Boolean b2 = m41570b(b);
        if (b2 == null || b2.booleanValue()) {
            C17104eo eoVar = b;
            zzk zzk = new zzk(str, b.mo33173c(), b.mo33192i(), b.mo33194j(), b.mo33195k(), b.mo33196l(), b.mo33197m(), (String) null, b.mo33198n(), false, b.mo33183f(), eoVar.mo33204t(), 0, 0, eoVar.mo33205u(), eoVar.mo33206v(), false, eoVar.mo33177d());
            return zzk;
        }
        this.f48236b.mo32854q().f48445b.mo33377a("App version does not match; dropping. appId", C17133r.m41997a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33098a(zzo zzo, zzk zzk) {
        C15464q.m32123a(zzo);
        C15464q.m32125a(zzo.f48505a);
        C15464q.m32123a(zzo.f48506b);
        C15464q.m32123a(zzo.f48507c);
        C15464q.m32125a(zzo.f48507c.f48479a);
        mo33112i();
        mo33113j();
        if (TextUtils.isEmpty(zzk.f48488b) && TextUtils.isEmpty(zzk.f48504r)) {
            return;
        }
        if (!zzk.f48494h) {
            mo33104c(zzk);
            return;
        }
        zzo zzo2 = new zzo(zzo);
        boolean z = false;
        zzo2.f48509e = false;
        mo33106d().mo33326e();
        try {
            zzo d = mo33106d().mo33322d(zzo2.f48505a, zzo2.f48507c.f48479a);
            if (d != null && !d.f48506b.equals(zzo2.f48506b)) {
                this.f48236b.mo32854q().f48448e.mo33379a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f48236b.mo32927f().mo33371c(zzo2.f48507c.f48479a), zzo2.f48506b, d.f48506b);
            }
            if (d != null && d.f48509e) {
                zzo2.f48506b = d.f48506b;
                zzo2.f48508d = d.f48508d;
                zzo2.f48512h = d.f48512h;
                zzo2.f48510f = d.f48510f;
                zzo2.f48513i = d.f48513i;
                zzo2.f48509e = d.f48509e;
                zzfv zzfv = new zzfv(zzo2.f48507c.f48479a, d.f48507c.f48480b, zzo2.f48507c.mo33393a(), d.f48507c.f48483e);
                zzo2.f48507c = zzfv;
            } else if (TextUtils.isEmpty(zzo2.f48510f)) {
                zzfv zzfv2 = new zzfv(zzo2.f48507c.f48479a, zzo2.f48508d, zzo2.f48507c.mo33393a(), zzo2.f48507c.f48483e);
                zzo2.f48507c = zzfv2;
                zzo2.f48509e = true;
                z = true;
            }
            if (zzo2.f48509e) {
                zzfv zzfv3 = zzo2.f48507c;
                C17101el elVar = new C17101el(zzo2.f48505a, zzo2.f48506b, zzfv3.f48479a, zzfv3.f48480b, zzfv3.mo33393a());
                if (mo33106d().mo33314a(elVar)) {
                    this.f48236b.mo32854q().f48452i.mo33379a("User property updated immediately", zzo2.f48505a, this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                } else {
                    this.f48236b.mo32854q().f48445b.mo33379a("(2)Too many active user properties, ignoring", C17133r.m41997a(zzo2.f48505a), this.f48236b.mo32927f().mo33371c(elVar.f48274c), elVar.f48276e);
                }
                if (z && zzo2.f48513i != null) {
                    m41571b(new zzag(zzo2.f48513i, zzo2.f48508d), zzk);
                }
            }
            if (mo33106d().mo33315a(zzo2)) {
                this.f48236b.mo32854q().f48452i.mo33379a("Conditional property added", zzo2.f48505a, this.f48236b.mo32927f().mo33371c(zzo2.f48507c.f48479a), zzo2.f48507c.mo33393a());
            } else {
                this.f48236b.mo32854q().f48445b.mo33379a("Too many conditional properties, ignoring", C17133r.m41997a(zzo2.f48505a), this.f48236b.mo32927f().mo33371c(zzo2.f48507c.f48479a), zzo2.f48507c.mo33393a());
            }
            mo33106d().mo33331u();
        } finally {
            mo33106d().mo33332v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33103b(zzo zzo, zzk zzk) {
        C15464q.m32123a(zzo);
        C15464q.m32125a(zzo.f48505a);
        C15464q.m32123a(zzo.f48507c);
        C15464q.m32125a(zzo.f48507c.f48479a);
        mo33112i();
        mo33113j();
        if (TextUtils.isEmpty(zzk.f48488b) && TextUtils.isEmpty(zzk.f48504r)) {
            return;
        }
        if (!zzk.f48494h) {
            mo33104c(zzk);
            return;
        }
        mo33106d().mo33326e();
        try {
            mo33104c(zzk);
            zzo d = mo33106d().mo33322d(zzo.f48505a, zzo.f48507c.f48479a);
            if (d != null) {
                this.f48236b.mo32854q().f48452i.mo33378a("Removing conditional user property", zzo.f48505a, this.f48236b.mo32927f().mo33371c(zzo.f48507c.f48479a));
                mo33106d().mo33324e(zzo.f48505a, zzo.f48507c.f48479a);
                if (d.f48509e) {
                    mo33106d().mo33319b(zzo.f48505a, zzo.f48507c.f48479a);
                }
                if (zzo.f48515k != null) {
                    Bundle bundle = null;
                    if (zzo.f48515k.f48476b != null) {
                        bundle = zzo.f48515k.f48476b.mo33384b();
                    }
                    Bundle bundle2 = bundle;
                    m41571b(this.f48236b.mo32926e().mo33140a(zzo.f48505a, zzo.f48515k.f48475a, bundle2, d.f48506b, zzo.f48515k.f48478d, true, false), zzk);
                }
            } else {
                this.f48236b.mo32854q().f48448e.mo33378a("Conditional user property doesn't exist", C17133r.m41997a(zzo.f48505a), this.f48236b.mo32927f().mo33371c(zzo.f48507c.f48479a));
            }
            mo33106d().mo33331u();
        } finally {
            mo33106d().mo33332v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C17104eo mo33104c(com.google.android.gms.measurement.internal.zzk r9) {
        /*
            r8 = this;
            r8.mo33112i()
            r8.mo33113j()
            com.google.android.gms.common.internal.C15464q.m32123a(r9)
            java.lang.String r0 = r9.f48487a
            com.google.android.gms.common.internal.C15464q.m32125a(r0)
            com.google.android.gms.measurement.internal.ex r0 = r8.mo33106d()
            java.lang.String r1 = r9.f48487a
            com.google.android.gms.measurement.internal.eo r0 = r0.mo33317b(r1)
            com.google.android.gms.measurement.internal.ay r1 = r8.f48236b
            com.google.android.gms.measurement.internal.af r1 = r1.mo32923b()
            java.lang.String r2 = r9.f48487a
            java.lang.String r1 = r1.mo32866b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.eo r0 = new com.google.android.gms.measurement.internal.eo
            com.google.android.gms.measurement.internal.ay r3 = r8.f48236b
            java.lang.String r4 = r9.f48487a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.ay r3 = r8.f48236b
            com.google.android.gms.measurement.internal.em r3 = r3.mo32926e()
            java.lang.String r3 = r3.mo33156i()
            r0.mo33167a(r3)
            r0.mo33179d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo33180e()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo33179d(r1)
            com.google.android.gms.measurement.internal.ay r1 = r8.f48236b
            com.google.android.gms.measurement.internal.em r1 = r1.mo32926e()
            java.lang.String r1 = r1.mo33156i()
            r0.mo33167a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.f48488b
            java.lang.String r4 = r0.mo33173c()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.f48488b
            r0.mo33171b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r9.f48504r
            java.lang.String r4 = r0.mo33177d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.f48504r
            r0.mo33175c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r9.f48497k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.f48497k
            java.lang.String r4 = r0.mo33183f()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.f48497k
            r0.mo33182e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r9.f48491e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f48491e
            long r5 = r0.mo33196l()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f48491e
            r0.mo33178d(r3)
            r1 = 1
        L_0x00b4:
            java.lang.String r3 = r9.f48489c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.f48489c
            java.lang.String r4 = r0.mo33192i()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.f48489c
            r0.mo33185f(r1)
            r1 = 1
        L_0x00ce:
            long r3 = r9.f48496j
            long r5 = r0.mo33194j()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.f48496j
            r0.mo33174c(r3)
            r1 = 1
        L_0x00de:
            java.lang.String r3 = r9.f48490d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.f48490d
            java.lang.String r4 = r0.mo33195k()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.f48490d
            r0.mo33188g(r1)
            r1 = 1
        L_0x00f4:
            long r3 = r9.f48492f
            long r5 = r0.mo33197m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f48492f
            r0.mo33181e(r3)
            r1 = 1
        L_0x0104:
            boolean r3 = r9.f48494h
            boolean r4 = r0.mo33198n()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.f48494h
            r0.mo33168a(r1)
            r1 = 1
        L_0x0112:
            java.lang.String r3 = r9.f48493g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.f48493g
            java.lang.String r4 = r0.mo33203s()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.f48493g
            r0.mo33191h(r1)
            r1 = 1
        L_0x012c:
            long r3 = r9.f48498l
            long r5 = r0.mo33204t()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.f48498l
            r0.mo33193i(r3)
            r1 = 1
        L_0x013c:
            boolean r3 = r9.f48501o
            boolean r4 = r0.mo33205u()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.f48501o
            r0.mo33172b(r1)
            r1 = 1
        L_0x014a:
            boolean r3 = r9.f48502p
            boolean r4 = r0.mo33206v()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.f48502p
            r0.mo33176c(r9)
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.ex r9 = r8.mo33106d()
            r9.mo33309a(r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17092ed.mo33104c(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.eo");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo33107d(zzk zzk) {
        try {
            return (String) this.f48236b.mo32853p().mo32911a((Callable<V>) new C17097eh<V>(this, zzk)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f48236b.mo32854q().f48445b.mo33378a("Failed to get app instance id. appId", C17133r.m41997a(zzk.f48487a), e);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m41562a(C17092ed edVar, C17098ei eiVar) {
        edVar.f48236b.mo32853p().mo32840c();
        C17113ex exVar = new C17113ex(edVar);
        exVar.mo33090t();
        edVar.f48242i = exVar;
        edVar.f48236b.f47966e.f48313a = edVar.f48240g;
        C17107er erVar = new C17107er(edVar);
        erVar.mo33090t();
        edVar.f48245l = erVar;
        C17048cn cnVar = new C17048cn(edVar);
        cnVar.mo33090t();
        edVar.f48235a = cnVar;
        C17087dz dzVar = new C17087dz(edVar);
        dzVar.mo33090t();
        edVar.f48244k = dzVar;
        edVar.f48243j = new C16984ad(edVar);
        if (edVar.f48238d != edVar.f48239e) {
            edVar.f48236b.mo32854q().f48445b.mo33378a("Not all upload components initialized", Integer.valueOf(edVar.f48238d), Integer.valueOf(edVar.f48239e));
        }
        edVar.f48247n = true;
    }
}

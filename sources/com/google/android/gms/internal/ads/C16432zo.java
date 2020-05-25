package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15524o;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.zo */
public final class C16432zo implements C16442zy {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static List<Future<Void>> f46038b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    private static ScheduledExecutorService f46039c = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: a */
    final Object f46040a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final bcl f46041d;

    /* renamed from: e */
    private final LinkedHashMap<String, bcs> f46042e;

    /* renamed from: f */
    private final List<String> f46043f = new ArrayList();

    /* renamed from: g */
    private final List<String> f46044g = new ArrayList();

    /* renamed from: h */
    private final Context f46045h;

    /* renamed from: i */
    private final aaa f46046i;

    /* renamed from: j */
    private boolean f46047j;

    /* renamed from: k */
    private final zzbbq f46048k;

    /* renamed from: l */
    private final aab f46049l;

    /* renamed from: m */
    private HashSet<String> f46050m = new HashSet<>();

    /* renamed from: n */
    private boolean f46051n = false;

    /* renamed from: o */
    private boolean f46052o = false;

    /* renamed from: p */
    private boolean f46053p = false;

    public C16432zo(Context context, zzbgz zzbgz, zzbbq zzbbq, String str, aaa aaa) {
        C15464q.m32124a(zzbbq, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f46045h = context;
        this.f46042e = new LinkedHashMap<>();
        this.f46046i = aaa;
        this.f46048k = zzbbq;
        for (String lowerCase : this.f46048k.f46232e) {
            this.f46050m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f46050m.remove("cookie".toLowerCase(Locale.ENGLISH));
        bcl bcl = new bcl();
        bcl.f41847c = Integer.valueOf(8);
        bcl.f41848d = str;
        bcl.f41849e = str;
        bcl.f41850f = new bcm();
        bcl.f41850f.f41865c = this.f46048k.f46228a;
        bct bct = new bct();
        bct.f41887c = zzbgz.f46237a;
        bct.f41889e = Boolean.valueOf(C15377d.m31951a(this.f46045h).mo28319a());
        long apkVersion = (long) C15369c.getInstance().getApkVersion(this.f46045h);
        if (apkVersion > 0) {
            bct.f41888d = Long.valueOf(apkVersion);
        }
        bcl.f41854j = bct;
        this.f46041d = bcl;
        this.f46049l = new aab(this.f46045h, this.f46048k.f46235h, this);
    }

    /* renamed from: a */
    public final zzbbq mo31544a() {
        return this.f46048k;
    }

    /* renamed from: a */
    public final void mo31546a(String str) {
        synchronized (this.f46040a) {
            this.f46041d.f41852h = str;
        }
    }

    /* renamed from: b */
    public final boolean mo31550b() {
        return C15524o.m32297e() && this.f46048k.f46230c && !this.f46052o;
    }

    /* renamed from: a */
    public final void mo31545a(View view) {
        Bitmap bitmap;
        if (this.f46048k.f46230c && !this.f46052o) {
            if (view == null) {
                bitmap = null;
            } else {
                Bitmap b = acd.m32595b(view);
                if (b == null) {
                    bitmap = acd.m32571a(view);
                } else {
                    bitmap = b;
                }
            }
            if (bitmap == null) {
                C16441zx.m39256a("Failed to capture the webview bitmap.");
                return;
            }
            this.f46052o = true;
            acd.m32586a((Runnable) new C16435zr(this, bitmap));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31547a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f46040a
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x000d
            r2 = 1
            r6.f46053p = r2     // Catch:{ all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r7 = move-exception
            goto L_0x00ca
        L_0x000d:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bcs> r2 = r6.f46042e     // Catch:{ all -> 0x000a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0027
            if (r9 != r1) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bcs> r8 = r6.f46042e     // Catch:{ all -> 0x000a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bcs r7 = (com.google.android.gms.internal.ads.bcs) r7     // Catch:{ all -> 0x000a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r7.f41881f = r8     // Catch:{ all -> 0x000a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.bcs r1 = new com.google.android.gms.internal.ads.bcs     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f41881f = r9     // Catch:{ all -> 0x000a }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bcs> r9 = r6.f46042e     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f41878c = r9     // Catch:{ all -> 0x000a }
            r1.f41879d = r7     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bco r9 = new com.google.android.gms.internal.ads.bco     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            r1.f41880e = r9     // Catch:{ all -> 0x000a }
            java.util.HashSet<java.lang.String> r9 = r6.f46050m     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            if (r9 <= 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000a }
        L_0x005e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x000a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x000a }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r3 = ""
        L_0x0079:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.util.HashSet<java.lang.String> r5 = r6.f46050m     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 != 0) goto L_0x0097
            goto L_0x005e
        L_0x0097:
            com.google.android.gms.internal.ads.bcn r4 = new com.google.android.gms.internal.ads.bcn     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f41867c = r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f41868d = r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x005e
        L_0x00b0:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.C16441zx.m39256a(r2)     // Catch:{ all -> 0x000a }
            goto L_0x005e
        L_0x00b6:
            int r8 = r9.size()     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bcn[] r8 = new com.google.android.gms.internal.ads.bcn[r8]     // Catch:{ all -> 0x000a }
            r9.toArray(r8)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bco r9 = r1.f41880e     // Catch:{ all -> 0x000a }
            r9.f41869c = r8     // Catch:{ all -> 0x000a }
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bcs> r8 = r6.f46042e     // Catch:{ all -> 0x000a }
            r8.put(r7, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16432zo.mo31547a(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31549b(String str) {
        synchronized (this.f46040a) {
            this.f46043f.add(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo31552c(String str) {
        synchronized (this.f46040a) {
            this.f46044g.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r6 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo31548a(java.lang.String[] r12) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.aab r0 = r11.f46049l
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.length
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x007b
            r5 = r12[r4]
            java.util.List<java.lang.String> r6 = r0.f40044c
            java.util.Iterator r6 = r6.iterator()
        L_0x0014:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x004a
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = r7.equals(r5)
            if (r9 == 0) goto L_0x0029
        L_0x0027:
            r6 = 1
            goto L_0x004b
        L_0x0029:
            java.lang.String r9 = "android.webkit.resource."
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r10 = r7.length()
            if (r10 == 0) goto L_0x003e
            java.lang.String r7 = r9.concat(r7)
            goto L_0x0043
        L_0x003e:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
        L_0x0043:
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0014
            goto L_0x0027
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 == 0) goto L_0x0073
            java.util.Map<java.lang.String, java.lang.String> r6 = com.google.android.gms.internal.ads.aab.f40042a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0067
            android.content.Context r6 = r0.f40043b
            java.util.Map<java.lang.String, java.lang.String> r7 = com.google.android.gms.internal.ads.aab.f40042a
            java.lang.Object r7 = r7.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = com.google.android.gms.internal.ads.acd.m32590a(r6, r7)
            if (r6 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 == 0) goto L_0x006d
            r1.add(r5)
            goto L_0x0078
        L_0x006d:
            com.google.android.gms.internal.ads.zo r6 = r0.f40045d
            r6.mo31552c(r5)
            goto L_0x0078
        L_0x0073:
            com.google.android.gms.internal.ads.zo r6 = r0.f40045d
            r6.mo31549b(r5)
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x007b:
            java.lang.String[] r12 = new java.lang.String[r3]
            java.lang.Object[] r12 = r1.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16432zo.mo31548a(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: c */
    public final void mo31551c() {
        this.f46051n = true;
    }

    /* renamed from: d */
    private final bcs m39236d(String str) {
        bcs bcs;
        synchronized (this.f46040a) {
            bcs = (bcs) this.f46042e.get(str);
        }
        return bcs;
    }

    /* renamed from: d */
    public final void mo31553d() {
        synchronized (this.f46040a) {
            aga a = afp.m32822a(this.f46046i.mo28548a(this.f46045h, this.f46042e.keySet()), (afk<? super A, ? extends B>) new C16433zp<Object,Object>(this), agf.f40431b);
            aga a2 = afp.m32821a(a, 10, TimeUnit.SECONDS, f46039c);
            afp.m32827a(a, (afm<? super V>) new C16436zs<Object>(this, a2), agf.f40431b);
            f46038b.add(a2);
        }
    }

    /* renamed from: f */
    private final aga<Void> m39238f() {
        aga<Void> a;
        bcs[] bcsArr;
        if (!((this.f46047j && this.f46048k.f46234g) || (this.f46053p && this.f46048k.f46233f) || (!this.f46047j && this.f46048k.f46231d))) {
            return afp.m32820a(null);
        }
        synchronized (this.f46040a) {
            this.f46041d.f41851g = new bcs[this.f46042e.size()];
            this.f46042e.values().toArray(this.f46041d.f41851g);
            this.f46041d.f41855k = (String[]) this.f46043f.toArray(new String[0]);
            this.f46041d.f41856l = (String[]) this.f46044g.toArray(new String[0]);
            if (C16441zx.m39257a()) {
                String str = this.f46041d.f41848d;
                String str2 = this.f46041d.f41852h;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (bcs bcs : this.f46041d.f41851g) {
                    sb2.append("    [");
                    sb2.append(bcs.f41882g.length);
                    sb2.append("] ");
                    sb2.append(bcs.f41879d);
                }
                C16441zx.m39256a(sb2.toString());
            }
            aga a2 = new adr(this.f46045h).mo28734a(1, this.f46048k.f46229b, null, bby.m35340a((bby) this.f46041d));
            if (C16441zx.m39257a()) {
                a2.mo28797a(new C16437zt(this), acb.f40240a);
            }
            a = afp.m32823a(a2, C16434zq.f46055a, agf.f40431b);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ aga mo31543a(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f46040a) {
                            int length = optJSONArray.length();
                            bcs d = m39236d(str);
                            if (d == null) {
                                String str2 = "Cannot find the corresponding resource object for ";
                                String valueOf = String.valueOf(str);
                                C16441zx.m39256a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                d.f41882g = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    d.f41882g[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f46047j;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f46047j = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                String str3 = "Failed to get SafeBrowsing metadata";
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44353ch)).booleanValue()) {
                    abv.m32790a(str3, e);
                }
                return new afy(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f46047j) {
            synchronized (this.f46040a) {
                this.f46041d.f41847c = Integer.valueOf(9);
            }
        }
        return m39238f();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.wr */
public final class C16354wr extends C16330vu {

    /* renamed from: a */
    private static final Object f45832a = new Object();

    /* renamed from: b */
    private static C16354wr f45833b;

    /* renamed from: c */
    private final Context f45834c;

    /* renamed from: d */
    private final C16353wq f45835d;

    /* renamed from: e */
    private final ScheduledExecutorService f45836e = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: a */
    public static C16354wr m38963a(Context context, C16353wq wqVar) {
        C16354wr wrVar;
        synchronized (f45832a) {
            if (f45833b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                C15740bx.m36941a(context);
                f45833b = new C16354wr(context, wqVar);
                if (context.getApplicationContext() != null) {
                    C14963ax.m30831a().mo28672b(context);
                }
                abt.m32491a(context);
            }
            wrVar = f45833b;
        }
        return wrVar;
    }

    /* renamed from: a */
    public final void mo31446a(zzaxx zzaxx, C16335vz vzVar) {
        abv.m32494a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo31447b(zzaxx zzaxx, C16335vz vzVar) {
        abv.m32494a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static zzaxi m38964a(Context context, C16353wq wqVar, zzaxe zzaxe, ScheduledExecutorService scheduledExecutorService) {
        String str;
        char c;
        Context context2 = context;
        C16353wq wqVar2 = wqVar;
        zzaxe zzaxe2 = zzaxe;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        abv.m32792b("Starting ad request from service using: google.afma.request.getAdDictionary");
        C15806ck ckVar = new C15806ck(((Boolean) caf.m37099d().mo30717a(C15740bx.f44200N)).booleanValue(), "load_ad", zzaxe2.f46133d.f46338a);
        if (zzaxe2.f46123a > 10 && zzaxe2.f46097A != -1) {
            ckVar.mo30902a(ckVar.mo30898a(zzaxe2.f46097A), "cts");
        }
        C15804ci a = ckVar.mo30897a();
        aga a2 = afp.m32821a(wqVar2.f45828g.mo31376a(context2), ((Long) caf.m37099d().mo30717a(C15740bx.f44352cg)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a3 = afp.m32820a(null);
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44339cT)).booleanValue()) {
            a3 = wqVar2.f45823b.mo28578a(zzaxe2.f46136g.packageName);
        }
        aga b = wqVar2.f45823b.mo28579b(zzaxe2.f46136g.packageName);
        aga a4 = wqVar2.f45829h.mo28581a(zzaxe2.f46137h, zzaxe2.f46136g);
        Future a5 = C14963ax.m30840j().mo31465a(context2);
        aga a6 = afp.m32820a(null);
        Bundle bundle = zzaxe2.f46132c.f46319c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzaxe2.f46103G && !z) {
            a6 = wqVar2.f45826e.mo31194a(zzaxe2.f46135f);
        }
        C15804ci ciVar = a;
        aga a7 = afp.m32821a(a6, ((Long) caf.m37099d().mo30717a(C15740bx.f44290bX)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a8 = afp.m32820a(null);
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44218aE)).booleanValue()) {
            a8 = afp.m32821a(wqVar2.f45829h.mo28580a(context2), ((Long) caf.m37099d().mo30717a(C15740bx.f44219aF)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzaxe2.f46123a < 4 || zzaxe2.f46144o == null) ? null : zzaxe2.f46144o;
        if (acd.m32590a(context2, "android.permission.ACCESS_NETWORK_STATE") && C16355ws.m38971a((ConnectivityManager) context2.getSystemService("connectivity")) == null) {
            abv.m32792b("Device is offline.");
        }
        if (zzaxe2.f46123a >= 7) {
            str = zzaxe2.f46151v;
        } else {
            str = UUID.randomUUID().toString();
        }
        if (zzaxe2.f46132c.f46319c != null) {
            String string = zzaxe2.f46132c.f46319c.getString("_ad");
            if (string != null) {
                return C16360wx.m38976a(context2, zzaxe2, string);
            }
        }
        List<String> a9 = wqVar2.f45824c.mo30270a(zzaxe2.f46152w);
        Object obj = str;
        C15806ck ckVar2 = ckVar;
        Bundle bundle3 = (Bundle) afp.m32826a((Future<T>) a2, null, ((Long) caf.m37099d().mo30717a(C15740bx.f44352cg)).longValue(), TimeUnit.MILLISECONDS);
        Location location = (Location) afp.m32825a((Future<T>) a7, null);
        C14903a aVar = (C14903a) afp.m32825a(a8, null);
        String str2 = (String) afp.m32825a((Future<T>) a4, null);
        String str3 = (String) afp.m32825a(a3, null);
        String str4 = (String) afp.m32825a((Future<T>) b, null);
        C16365xb xbVar = (C16365xb) afp.m32825a(a5, null);
        if (xbVar == null) {
            abv.m32798e("Error fetching device info. This is not recoverable.");
            return new zzaxi(0);
        }
        C16352wp wpVar = new C16352wp();
        wpVar.f45818i = zzaxe2;
        wpVar.f45819j = xbVar;
        wpVar.f45813d = location;
        wpVar.f45811b = bundle3;
        wpVar.f45816g = str2;
        wpVar.f45817h = aVar;
        if (a9 == null) {
            wpVar.f45812c.clear();
        }
        wpVar.f45812c = a9;
        wpVar.f45810a = bundle2;
        wpVar.f45814e = str3;
        wpVar.f45815f = str4;
        wpVar.f45820k = wqVar2.f45822a.mo30853a(context2);
        wpVar.f45821l = wqVar2.f45830i;
        JSONObject a10 = C16360wx.m38980a(context2, wpVar);
        if (a10 == null) {
            return new zzaxi(0);
        }
        if (zzaxe2.f46123a < 7) {
            try {
                a10.put("request_id", obj);
            } catch (JSONException unused) {
            }
        }
        C15804ci ciVar2 = ciVar;
        C15806ck ckVar3 = ckVar2;
        ckVar3.mo30902a(ciVar2, "arc");
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        aga a11 = afp.m32821a(afp.m32822a(wqVar2.f45831j.mo31461a().mo31188b(a10), C16356wt.f45837a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        aga a12 = wqVar2.f45825d.mo31467a();
        if (a12 != null) {
            afn.m32817a(a12, "AdRequestServiceImpl.loadAd.flags");
        }
        zzaxi zzaxi = null;
        C16364xa xaVar = (C16364xa) afp.m32825a((Future<T>) a11, null);
        if (xaVar == null) {
            return new zzaxi(0);
        }
        if (xaVar.f45888f != -2) {
            return new zzaxi(xaVar.f45888f);
        }
        if (!TextUtils.isEmpty(xaVar.f45886d)) {
            zzaxi = C16360wx.m38976a(context2, zzaxe2, xaVar.f45886d);
        }
        if (zzaxi == null && !TextUtils.isEmpty(xaVar.f45887e)) {
            zzaxi = m38965a(zzaxe, context, zzaxe2.f46140k.f46237a, xaVar.f45887e, str3, str4, xaVar, ckVar3, wqVar);
        }
        if (zzaxi == null) {
            c = 0;
            zzaxi = new zzaxi(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        ckVar3.mo30902a(ciVar2, strArr);
        zzaxi.f46205w = ckVar3.mo30903b();
        zzaxi.f46176U = xaVar.f45890h;
        return zzaxi;
    }

    /* renamed from: a */
    private static void m38966a(String str, Map<String, List<String>> map, String str2, int i) {
        if (abv.m32791a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            abv.m32494a(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    abv.m32494a(sb2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf);
                        abv.m32494a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            abv.m32494a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    abv.m32494a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                abv.m32494a("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            abv.m32494a(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029e, code lost:
        r3 = r91;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r0 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e6, code lost:
        if (com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r7) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e8, code lost:
        com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r7.getURL(), null, null, r7.getContentType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f4, code lost:
        r3 = new java.io.InputStreamReader(r15.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r7 = com.google.android.gms.internal.ads.acd.m32577a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        com.google.android.gms.common.util.C15521l.m32290a(r3);
        r5.mo28764a(r7);
        m38966a(r0, r10, r7, r8);
        r6.f45859c = r7;
        r6.mo31463a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        if (r2 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
        r2.mo30902a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        r10 = r6.f45855N;
        r11 = r6.f45858b;
        r12 = r6.f45859c;
        r13 = r6.f45860d;
        r14 = r6.f45864h;
        r2 = r6.f45866j;
        r4 = r6.f45867k;
        r5 = r6.f45868l;
        r7 = r6.f45869m;
        r9 = r6.f45870n;
        r61 = r7;
        r7 = r6.f45857a;
        r63 = r6.f45862f;
        r64 = r6.f45863g;
        r65 = r6.f45871o;
        r66 = r6.f45872p;
        r67 = r6.f45873q;
        r68 = r6.f45874r;
        r69 = r6.f45876t;
        r70 = r6.f45877u;
        r71 = r6.f45878v;
        r72 = r6.f45879w;
        r73 = r6.f45880x;
        r74 = r6.f45881y;
        r75 = r6.f45882z;
        r76 = r6.f45842A;
        r77 = r6.f45843B;
        r78 = r6.f45844C;
        r79 = r6.f45845D;
        r80 = r6.f45846E;
        r81 = r6.f45847F;
        r82 = r6.f45848G;
        r83 = r6.f45861e;
        r84 = r6.f45875s;
        r85 = r6.f45849H;
        r8 = r6.f45850I;
        r86 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019a, code lost:
        if (r1.f45889g == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019c, code lost:
        r52 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019f, code lost:
        r52 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b7, code lost:
        r9 = r9;
        r91 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9 = new com.google.android.gms.internal.ads.zzaxi(r10, r11, r12, r13, r14, r2, r4, -1, r5, r61, r86, r7, r25, r63, r64, r65, r66, r67, r68, false, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r8, r52, r6.f45851J, r6.f45865i, r6.f45852K, r6.f45853L, r1.f45890h, r1.f45891i, r6.f45854M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r91.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0209, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020b, code lost:
        r91 = r15;
        r60 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0210, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0211, code lost:
        r91 = r15;
        r60 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        com.google.android.gms.common.util.C15521l.m32290a(r60);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0218, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00b2, all -> 0x02a1 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxi m38965a(com.google.android.gms.internal.ads.zzaxe r92, android.content.Context r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, com.google.android.gms.internal.ads.C16364xa r98, com.google.android.gms.internal.ads.C15806ck r99, com.google.android.gms.internal.ads.C16353wq r100) {
        /*
            r0 = r92
            r1 = r98
            r2 = r99
            if (r2 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.ci r4 = r99.mo30897a()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            com.google.android.gms.internal.ads.wy r6 = new com.google.android.gms.internal.ads.wy     // Catch:{ IOException -> 0x02a7 }
            java.lang.String r7 = r1.f45883a     // Catch:{ IOException -> 0x02a7 }
            r6.<init>(r0, r7)     // Catch:{ IOException -> 0x02a7 }
            java.lang.String r7 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r8 = java.lang.String.valueOf(r95)     // Catch:{ IOException -> 0x02a7 }
            int r9 = r8.length()     // Catch:{ IOException -> 0x02a7 }
            if (r9 == 0) goto L_0x0026
            java.lang.String r7 = r7.concat(r8)     // Catch:{ IOException -> 0x02a7 }
            goto L_0x002c
        L_0x0026:
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x02a7 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x02a7 }
            r7 = r8
        L_0x002c:
            com.google.android.gms.internal.ads.abv.m32792b(r7)     // Catch:{ IOException -> 0x02a7 }
            java.net.URL r7 = new java.net.URL     // Catch:{ IOException -> 0x02a7 }
            r8 = r95
            r7.<init>(r8)     // Catch:{ IOException -> 0x02a7 }
            com.google.android.gms.common.util.e r8 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ IOException -> 0x02a7 }
            long r25 = r8.mo28524b()     // Catch:{ IOException -> 0x02a7 }
            r8 = 0
            r9 = 0
        L_0x0040:
            java.net.URLConnection r10 = r7.openConnection()     // Catch:{ IOException -> 0x02a7 }
            r15 = r10
            java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch:{ IOException -> 0x02a7 }
            com.google.android.gms.internal.ads.acd r10 = com.google.android.gms.ads.internal.C14963ax.m30831a()     // Catch:{ all -> 0x02a1 }
            r11 = r93
            r12 = r94
            r10.mo28667a(r11, r12, r8, r15)     // Catch:{ all -> 0x02a1 }
            boolean r10 = r1.f45885c     // Catch:{ all -> 0x02a1 }
            if (r10 == 0) goto L_0x0074
            boolean r10 = android.text.TextUtils.isEmpty(r96)     // Catch:{ all -> 0x02a1 }
            if (r10 != 0) goto L_0x0064
            java.lang.String r10 = "x-afma-drt-cookie"
            r13 = r96
            com.google.android.gms.internal.ads.C16355ws.m38972a(r15, r10, r13)     // Catch:{ all -> 0x02a1 }
            goto L_0x0066
        L_0x0064:
            r13 = r96
        L_0x0066:
            boolean r10 = android.text.TextUtils.isEmpty(r97)     // Catch:{ all -> 0x02a1 }
            if (r10 != 0) goto L_0x0076
            java.lang.String r10 = "x-afma-drt-v2-cookie"
            r14 = r97
            com.google.android.gms.internal.ads.C16355ws.m38972a(r15, r10, r14)     // Catch:{ all -> 0x02a1 }
            goto L_0x0078
        L_0x0074:
            r13 = r96
        L_0x0076:
            r14 = r97
        L_0x0078:
            java.lang.String r10 = r0.f46104H     // Catch:{ all -> 0x02a1 }
            boolean r16 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02a1 }
            if (r16 != 0) goto L_0x008a
            java.lang.String r16 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.abv.m32792b(r16)     // Catch:{ all -> 0x02a1 }
            java.lang.String r5 = "Cookie"
            com.google.android.gms.internal.ads.C16355ws.m38972a(r15, r5, r10)     // Catch:{ all -> 0x02a1 }
        L_0x008a:
            r5 = 1
            if (r1 == 0) goto L_0x00bb
            java.lang.String r10 = r1.f45884b     // Catch:{ all -> 0x02a1 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02a1 }
            if (r10 != 0) goto L_0x00bb
            r15.setDoOutput(r5)     // Catch:{ all -> 0x02a1 }
            java.lang.String r10 = r1.f45884b     // Catch:{ all -> 0x02a1 }
            byte[] r10 = r10.getBytes()     // Catch:{ all -> 0x02a1 }
            int r8 = r10.length     // Catch:{ all -> 0x02a1 }
            r15.setFixedLengthStreamingMode(r8)     // Catch:{ all -> 0x02a1 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00b5 }
            java.io.OutputStream r5 = r15.getOutputStream()     // Catch:{ all -> 0x00b5 }
            r8.<init>(r5)     // Catch:{ all -> 0x00b5 }
            r8.write(r10)     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.common.util.C15521l.m32290a(r8)     // Catch:{ all -> 0x02a1 }
            goto L_0x00bc
        L_0x00b2:
            r0 = move-exception
            r3 = r8
            goto L_0x00b7
        L_0x00b5:
            r0 = move-exception
            r3 = 0
        L_0x00b7:
            com.google.android.gms.common.util.C15521l.m32290a(r3)     // Catch:{ all -> 0x02a1 }
            throw r0     // Catch:{ all -> 0x02a1 }
        L_0x00bb:
            r10 = 0
        L_0x00bc:
            com.google.android.gms.internal.ads.aew r5 = new com.google.android.gms.internal.ads.aew     // Catch:{ all -> 0x02a1 }
            java.lang.String r8 = r0.f46151v     // Catch:{ all -> 0x02a1 }
            r5.<init>(r8)     // Catch:{ all -> 0x02a1 }
            r5.mo28767a(r15, r10)     // Catch:{ all -> 0x02a1 }
            int r8 = r15.getResponseCode()     // Catch:{ all -> 0x02a1 }
            java.util.Map r10 = r15.getHeaderFields()     // Catch:{ all -> 0x02a1 }
            r5.mo28766a(r15, r8)     // Catch:{ all -> 0x02a1 }
            r3 = 200(0xc8, float:2.8E-43)
            r0 = 300(0x12c, float:4.2E-43)
            if (r8 < r3) goto L_0x0219
            if (r8 >= r0) goto L_0x0219
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x02a1 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0210 }
            r7 = r15
            java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ all -> 0x0210 }
            boolean r9 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r7)     // Catch:{ all -> 0x0210 }
            if (r9 == 0) goto L_0x00f4
            java.net.URL r9 = r7.getURL()     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = r7.getContentType()     // Catch:{ all -> 0x0210 }
            r11 = 0
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r9, r11, r11, r7)     // Catch:{ all -> 0x0210 }
        L_0x00f4:
            java.io.InputStream r7 = r15.getInputStream()     // Catch:{ all -> 0x0210 }
            r3.<init>(r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = com.google.android.gms.internal.ads.acd.m32577a(r3)     // Catch:{ all -> 0x020a }
            com.google.android.gms.common.util.C15521l.m32290a(r3)     // Catch:{ all -> 0x02a1 }
            r5.mo28764a(r7)     // Catch:{ all -> 0x02a1 }
            m38966a(r0, r10, r7, r8)     // Catch:{ all -> 0x02a1 }
            r6.f45859c = r7     // Catch:{ all -> 0x02a1 }
            r6.mo31463a(r10)     // Catch:{ all -> 0x02a1 }
            if (r2 == 0) goto L_0x011a
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x02a1 }
            java.lang.String r0 = "ufe"
            r5 = 0
            r3[r5] = r0     // Catch:{ all -> 0x02a1 }
            r2.mo30902a(r4, r3)     // Catch:{ all -> 0x02a1 }
        L_0x011a:
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x02a1 }
            com.google.android.gms.internal.ads.zzaxe r10 = r6.f45855N     // Catch:{ all -> 0x02a1 }
            java.lang.String r11 = r6.f45858b     // Catch:{ all -> 0x02a1 }
            java.lang.String r12 = r6.f45859c     // Catch:{ all -> 0x02a1 }
            java.util.List<java.lang.String> r13 = r6.f45860d     // Catch:{ all -> 0x02a1 }
            java.util.List<java.lang.String> r14 = r6.f45864h     // Catch:{ all -> 0x02a1 }
            long r2 = r6.f45866j     // Catch:{ all -> 0x02a1 }
            boolean r4 = r6.f45867k     // Catch:{ all -> 0x02a1 }
            r18 = -1
            java.util.List<java.lang.String> r5 = r6.f45868l     // Catch:{ all -> 0x02a1 }
            long r7 = r6.f45869m     // Catch:{ all -> 0x02a1 }
            int r9 = r6.f45870n     // Catch:{ all -> 0x02a1 }
            r61 = r7
            java.lang.String r7 = r6.f45857a     // Catch:{ all -> 0x02a1 }
            java.lang.String r8 = r6.f45862f     // Catch:{ all -> 0x02a1 }
            r63 = r8
            java.lang.String r8 = r6.f45863g     // Catch:{ all -> 0x02a1 }
            r64 = r8
            boolean r8 = r6.f45871o     // Catch:{ all -> 0x02a1 }
            r65 = r8
            boolean r8 = r6.f45872p     // Catch:{ all -> 0x02a1 }
            r66 = r8
            boolean r8 = r6.f45873q     // Catch:{ all -> 0x02a1 }
            r67 = r8
            boolean r8 = r6.f45874r     // Catch:{ all -> 0x02a1 }
            r33 = 0
            r68 = r8
            java.lang.String r8 = r6.f45876t     // Catch:{ all -> 0x02a1 }
            r69 = r8
            boolean r8 = r6.f45877u     // Catch:{ all -> 0x02a1 }
            r70 = r8
            boolean r8 = r6.f45878v     // Catch:{ all -> 0x02a1 }
            r71 = r8
            com.google.android.gms.internal.ads.zzbaz r8 = r6.f45879w     // Catch:{ all -> 0x02a1 }
            r72 = r8
            java.util.List<java.lang.String> r8 = r6.f45880x     // Catch:{ all -> 0x02a1 }
            r73 = r8
            java.util.List<java.lang.String> r8 = r6.f45881y     // Catch:{ all -> 0x02a1 }
            r74 = r8
            boolean r8 = r6.f45882z     // Catch:{ all -> 0x02a1 }
            r75 = r8
            com.google.android.gms.internal.ads.zzaxk r8 = r6.f45842A     // Catch:{ all -> 0x02a1 }
            r76 = r8
            boolean r8 = r6.f45843B     // Catch:{ all -> 0x02a1 }
            r77 = r8
            java.lang.String r8 = r6.f45844C     // Catch:{ all -> 0x02a1 }
            r78 = r8
            java.util.List<java.lang.String> r8 = r6.f45845D     // Catch:{ all -> 0x02a1 }
            r79 = r8
            boolean r8 = r6.f45846E     // Catch:{ all -> 0x02a1 }
            r80 = r8
            java.lang.String r8 = r6.f45847F     // Catch:{ all -> 0x02a1 }
            r81 = r8
            com.google.android.gms.internal.ads.zzbbq r8 = r6.f45848G     // Catch:{ all -> 0x02a1 }
            r82 = r8
            java.lang.String r8 = r6.f45861e     // Catch:{ all -> 0x02a1 }
            r83 = r8
            boolean r8 = r6.f45875s     // Catch:{ all -> 0x02a1 }
            r84 = r8
            boolean r8 = r6.f45849H     // Catch:{ all -> 0x02a1 }
            r85 = r8
            boolean r8 = r6.f45850I     // Catch:{ all -> 0x02a1 }
            r86 = r9
            boolean r9 = r1.f45889g     // Catch:{ all -> 0x02a1 }
            if (r9 == 0) goto L_0x019f
            r52 = 2
            goto L_0x01a1
        L_0x019f:
            r52 = 1
        L_0x01a1:
            boolean r9 = r6.f45851J     // Catch:{ all -> 0x02a1 }
            r87 = r8
            java.util.List<java.lang.String> r8 = r6.f45865i     // Catch:{ all -> 0x02a1 }
            r88 = r8
            boolean r8 = r6.f45852K     // Catch:{ all -> 0x02a1 }
            r89 = r8
            java.lang.String r8 = r6.f45853L     // Catch:{ all -> 0x02a1 }
            r90 = r8
            java.lang.String r8 = r1.f45890h     // Catch:{ all -> 0x02a1 }
            boolean r1 = r1.f45891i     // Catch:{ all -> 0x02a1 }
            boolean r6 = r6.f45854M     // Catch:{ all -> 0x02a1 }
            r53 = r9
            r23 = r86
            r9 = r0
            r91 = r15
            r15 = r2
            r17 = r4
            r20 = r5
            r21 = r61
            r24 = r7
            r27 = r63
            r28 = r64
            r29 = r65
            r30 = r66
            r31 = r67
            r32 = r68
            r34 = r69
            r35 = r70
            r36 = r71
            r37 = r72
            r38 = r73
            r39 = r74
            r40 = r75
            r41 = r76
            r42 = r77
            r43 = r78
            r44 = r79
            r45 = r80
            r46 = r81
            r47 = r82
            r48 = r83
            r49 = r84
            r50 = r85
            r51 = r87
            r54 = r88
            r55 = r89
            r56 = r90
            r57 = r8
            r58 = r1
            r59 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ all -> 0x029d }
            r91.disconnect()     // Catch:{ IOException -> 0x02a7 }
            return r0
        L_0x020a:
            r0 = move-exception
            r91 = r15
            r60 = r3
            goto L_0x0215
        L_0x0210:
            r0 = move-exception
            r91 = r15
            r60 = 0
        L_0x0215:
            com.google.android.gms.common.util.C15521l.m32290a(r60)     // Catch:{ all -> 0x029d }
            throw r0     // Catch:{ all -> 0x029d }
        L_0x0219:
            r91 = r15
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x029d }
            r5 = 0
            m38966a(r3, r10, r5, r8)     // Catch:{ all -> 0x029d }
            if (r8 < r0) goto L_0x0279
            r0 = 400(0x190, float:5.6E-43)
            if (r8 >= r0) goto L_0x0279
            java.lang.String r0 = "Location"
            r3 = r91
            java.lang.String r0 = r3.getHeaderField(r0)     // Catch:{ all -> 0x029b }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029b }
            if (r7 == 0) goto L_0x0246
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.abv.m32798e(r0)     // Catch:{ all -> 0x029b }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x029b }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x029b }
            r3.disconnect()     // Catch:{ IOException -> 0x02a7 }
            return r0
        L_0x0246:
            java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x029b }
            r7.<init>(r0)     // Catch:{ all -> 0x029b }
            r0 = 1
            int r9 = r9 + r0
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C15740bx.f44333cN     // Catch:{ all -> 0x029b }
            com.google.android.gms.internal.ads.bu r8 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x029b }
            java.lang.Object r0 = r8.mo30717a(r0)     // Catch:{ all -> 0x029b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x029b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x029b }
            if (r9 <= r0) goto L_0x026e
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.abv.m32798e(r0)     // Catch:{ all -> 0x029b }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x029b }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x029b }
            r3.disconnect()     // Catch:{ IOException -> 0x02a7 }
            return r0
        L_0x026e:
            r6.mo31463a(r10)     // Catch:{ all -> 0x029b }
            r3.disconnect()     // Catch:{ IOException -> 0x02a7 }
            r0 = r92
            r8 = 0
            goto L_0x0040
        L_0x0279:
            r3 = r91
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029b }
            r1.<init>(r0)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            r1.append(r8)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029b }
            com.google.android.gms.internal.ads.abv.m32798e(r0)     // Catch:{ all -> 0x029b }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x029b }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x029b }
            r3.disconnect()     // Catch:{ IOException -> 0x02a7 }
            return r0
        L_0x029b:
            r0 = move-exception
            goto L_0x02a3
        L_0x029d:
            r0 = move-exception
            r3 = r91
            goto L_0x02a3
        L_0x02a1:
            r0 = move-exception
            r3 = r15
        L_0x02a3:
            r3.disconnect()     // Catch:{ IOException -> 0x02a7 }
            throw r0     // Catch:{ IOException -> 0x02a7 }
        L_0x02a7:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x02bd
            java.lang.String r0 = r1.concat(r0)
            goto L_0x02c2
        L_0x02bd:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x02c2:
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16354wr.m38965a(com.google.android.gms.internal.ads.zzaxe, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.ck, com.google.android.gms.internal.ads.wq):com.google.android.gms.internal.ads.zzaxi");
    }

    private C16354wr(Context context, C16353wq wqVar) {
        this.f45834c = context;
        this.f45835d = wqVar;
    }

    /* renamed from: a */
    public final zzaxi mo31444a(zzaxe zzaxe) {
        return m38964a(this.f45834c, this.f45835d, zzaxe, this.f45836e);
    }

    /* renamed from: a */
    public final void mo31445a(zzaxe zzaxe, C16332vw vwVar) {
        C14963ax.m30834d().mo28586a(this.f45834c, zzaxe.f46140k);
        aga a = acb.m32566a((Runnable) new C16357wu(this, zzaxe, vwVar));
        C14963ax.m30844n().mo28747a();
        C14963ax.m30844n().f40344a.postDelayed(new C16358wv(this, a), 60000);
    }
}

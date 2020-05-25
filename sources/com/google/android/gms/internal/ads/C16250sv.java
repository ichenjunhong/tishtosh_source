package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.C15033t;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.sv */
public final class C16250sv extends C16239sk {

    /* renamed from: h */
    private C16134on f45550h;

    /* renamed from: i */
    private C16116nw f45551i;

    /* renamed from: j */
    private C16118ny f45552j;

    /* renamed from: k */
    private C16125oe f45553k;

    /* renamed from: l */
    private final C15806ck f45554l;

    /* renamed from: m */
    private final ama f45555m;

    /* renamed from: n */
    private boolean f45556n;

    C16250sv(Context context, abc abc, C16134on onVar, C16244sp spVar, C15806ck ckVar, ama ama) {
        super(context, abc, spVar);
        this.f45550h = onVar;
        this.f45552j = abc.f40131c;
        this.f45554l = ckVar;
        this.f45555m = ama;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final abb mo31381a(int i) {
        String name;
        String str;
        boolean z;
        C16118ny nyVar;
        long j;
        zzaxk zzaxk;
        String str2;
        String str3;
        boolean z2;
        C16118ny nyVar2;
        long j2;
        Iterator it;
        C16118ny nyVar3;
        int i2;
        zzaxe zzaxe = this.f45536e.f40129a;
        zzyv zzyv = zzaxe.f46132c;
        ama ama = this.f45555m;
        List<String> list = this.f45537f.f46185c;
        List<String> list2 = this.f45537f.f46187e;
        List<String> list3 = this.f45537f.f46191i;
        int i3 = this.f45537f.f46193k;
        long j3 = this.f45537f.f46192j;
        String str4 = zzaxe.f46138i;
        boolean z3 = this.f45537f.f46189g;
        C16117nx nxVar = this.f45553k != null ? this.f45553k.f45342b : null;
        C16138or orVar = this.f45553k != null ? this.f45553k.f45343c : null;
        if (this.f45553k != null) {
            name = this.f45553k.f45344d;
        } else {
            name = AdMobAdapter.class.getName();
        }
        String str5 = name;
        C16118ny nyVar4 = this.f45552j;
        C16121oa oaVar = this.f45553k != null ? this.f45553k.f45345e : null;
        C16117nx nxVar2 = nxVar;
        C16138or orVar2 = orVar;
        long j4 = this.f45537f.f46190h;
        zzyz zzyz = this.f45536e.f40132d;
        long j5 = j4;
        long j6 = this.f45537f.f46188f;
        long j7 = this.f45536e.f40134f;
        long j8 = this.f45537f.f46195m;
        String str6 = this.f45537f.f46196n;
        JSONObject jSONObject = this.f45536e.f40136h;
        zzbaz zzbaz = this.f45537f.f46156A;
        List<String> list4 = this.f45537f.f46157B;
        List<String> list5 = this.f45537f.f46158C;
        zzyz zzyz2 = zzyz;
        boolean z4 = this.f45552j != null ? this.f45552j.f45308o : false;
        zzaxk zzaxk2 = this.f45537f.f46160E;
        if (this.f45551i != null) {
            List b = this.f45551i.mo31198b();
            String str7 = "";
            if (b == null) {
                nyVar = nyVar4;
                zzaxk = zzaxk2;
                str2 = str7.toString();
                str = str4;
                z = z3;
                j = j8;
            } else {
                Iterator it2 = b.iterator();
                String str8 = str7;
                while (it2.hasNext()) {
                    zzaxk zzaxk3 = zzaxk2;
                    C16125oe oeVar = (C16125oe) it2.next();
                    if (oeVar != null) {
                        it = it2;
                        if (oeVar.f45342b == null || TextUtils.isEmpty(oeVar.f45342b.f45274d)) {
                            nyVar3 = nyVar4;
                        } else {
                            String valueOf = String.valueOf(str8);
                            j2 = j8;
                            String str9 = oeVar.f45342b.f45274d;
                            switch (oeVar.f45341a) {
                                case -1:
                                    i2 = 4;
                                    break;
                                case 0:
                                    nyVar2 = nyVar4;
                                    i2 = 0;
                                    break;
                                case 1:
                                    nyVar2 = nyVar4;
                                    i2 = 1;
                                    break;
                                case 3:
                                    i2 = 2;
                                    break;
                                case 4:
                                    i2 = 3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = 6;
                                    break;
                            }
                            nyVar2 = nyVar4;
                            long j9 = oeVar.f45347g;
                            z2 = z3;
                            str3 = str4;
                            StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 33);
                            sb.append(str9);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(i2);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(j9);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append("_");
                            str8 = sb3.toString();
                            zzaxk2 = zzaxk3;
                            it2 = it;
                            j8 = j2;
                            nyVar4 = nyVar2;
                            z3 = z2;
                            str4 = str3;
                        }
                    } else {
                        nyVar3 = nyVar4;
                        it = it2;
                    }
                    str3 = str4;
                    z2 = z3;
                    j2 = j8;
                    zzaxk2 = zzaxk3;
                    it2 = it;
                    j8 = j2;
                    nyVar4 = nyVar2;
                    z3 = z2;
                    str4 = str3;
                }
                nyVar = nyVar4;
                zzaxk = zzaxk2;
                str = str4;
                z = z3;
                j = j8;
                str2 = str8.substring(0, Math.max(0, str8.length() - 1));
            }
        } else {
            nyVar = nyVar4;
            zzaxk = zzaxk2;
            str = str4;
            z = z3;
            j = j8;
            str2 = null;
        }
        abb abb = new abb(zzyv, ama, list, i, list2, list3, i3, j3, str, z, nxVar2, orVar2, str5, nyVar, oaVar, j5, zzyz2, j6, j7, j, str6, jSONObject, null, zzbaz, list4, list5, z4, zzaxk, str2, this.f45537f.f46163H, this.f45537f.f46167L, this.f45536e.f40137i, this.f45537f.f46170O, this.f45536e.f40138j, this.f45537f.f46172Q, this.f45537f.f46173R, this.f45537f.f46174S, this.f45537f.f46175T, this.f45537f.f46177V, this.f45537f.f46178W);
        return abb;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.nw] */
    /* JADX WARNING: type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.ok] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.android.gms.internal.ads.ok] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.oh] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [com.google.android.gms.internal.ads.ok]
      assigns: [com.google.android.gms.internal.ads.ok, com.google.android.gms.internal.ads.oh]
      uses: [com.google.android.gms.internal.ads.ok, com.google.android.gms.internal.ads.nw, com.google.android.gms.internal.ads.oh]
      mth insns count: 151
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31382a(long r32) throws com.google.android.gms.internal.ads.C16242sn {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r2 = r1.f45535d
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ny r0 = r1.f45552j     // Catch:{ all -> 0x0174 }
            int r0 = r0.f45306m     // Catch:{ all -> 0x0174 }
            r3 = -1
            if (r0 == r3) goto L_0x0043
            com.google.android.gms.internal.ads.oh r0 = new com.google.android.gms.internal.ads.oh     // Catch:{ all -> 0x0174 }
            android.content.Context r5 = r1.f45533b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abc r3 = r1.f45536e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxe r6 = r3.f40129a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.on r7 = r1.f45550h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ny r8 = r1.f45552j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f45537f     // Catch:{ all -> 0x0174 }
            boolean r9 = r3.f46201s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f45537f     // Catch:{ all -> 0x0174 }
            boolean r10 = r3.f46208z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r3 = r1.f45537f     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r3.f46165J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r3 = com.google.android.gms.internal.ads.C15740bx.f44308bp     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bu r4 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x0174 }
            java.lang.Object r3 = r4.mo30717a(r3)     // Catch:{ all -> 0x0174 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0174 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0174 }
            r16 = 2
            com.google.android.gms.internal.ads.abc r3 = r1.f45536e     // Catch:{ all -> 0x0174 }
            boolean r3 = r3.f40138j     // Catch:{ all -> 0x0174 }
            r4 = r0
            r12 = r32
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ all -> 0x0174 }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.ok r0 = new com.google.android.gms.internal.ads.ok     // Catch:{ all -> 0x0174 }
            android.content.Context r3 = r1.f45533b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abc r4 = r1.f45536e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxe r4 = r4.f40129a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.on r5 = r1.f45550h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ny r6 = r1.f45552j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r7 = r1.f45537f     // Catch:{ all -> 0x0174 }
            boolean r7 = r7.f46201s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r8 = r1.f45537f     // Catch:{ all -> 0x0174 }
            boolean r8 = r8.f46208z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaxi r9 = r1.f45537f     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = r9.f46165J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bl<java.lang.Long> r10 = com.google.android.gms.internal.ads.C15740bx.f44308bp     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bu r11 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x0174 }
            java.lang.Object r10 = r11.mo30717a(r10)     // Catch:{ all -> 0x0174 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0174 }
            long r27 = r10.longValue()     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ck r10 = r1.f45554l     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.abc r11 = r1.f45536e     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.f40138j     // Catch:{ all -> 0x0174 }
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r32
            r29 = r10
            r30 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x0174 }
        L_0x008a:
            r1.f45551i = r0     // Catch:{ all -> 0x0174 }
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.android.gms.internal.ads.ny r2 = r1.f45552j
            java.util.List<com.google.android.gms.internal.ads.nx> r2 = r2.f45294a
            r0.<init>(r2)
            com.google.android.gms.internal.ads.abc r2 = r1.f45536e
            com.google.android.gms.internal.ads.zzaxe r2 = r2.f40129a
            com.google.android.gms.internal.ads.zzyv r2 = r2.f46132c
            android.os.Bundle r2 = r2.f46329m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00b0
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00cf
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.nx r5 = (com.google.android.gms.internal.ads.C16117nx) r5
            java.util.List<java.lang.String> r5 = r5.f45273c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b7
            r2.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.nw r2 = r1.f45551i
            com.google.android.gms.internal.ads.oe r0 = r2.mo31196a(r0)
            r1.f45553k = r0
            com.google.android.gms.internal.ads.oe r0 = r1.f45553k
            int r0 = r0.f45341a
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fb;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.google.android.gms.internal.ads.sn r0 = new com.google.android.gms.internal.ads.sn
            com.google.android.gms.internal.ads.oe r2 = r1.f45553k
            int r2 = r2.f45341a
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00fb:
            com.google.android.gms.internal.ads.sn r0 = new com.google.android.gms.internal.ads.sn
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0104:
            com.google.android.gms.internal.ads.oe r0 = r1.f45553k
            com.google.android.gms.internal.ads.nx r0 = r0.f45342b
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.oe r0 = r1.f45553k
            com.google.android.gms.internal.ads.nx r0 = r0.f45342b
            java.lang.String r0 = r0.f45287q
            if (r0 == 0) goto L_0x0173
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r0.<init>(r2)
            android.os.Handler r2 = com.google.android.gms.internal.ads.acd.f40245a
            com.google.android.gms.internal.ads.sw r3 = new com.google.android.gms.internal.ads.sw
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014d }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x014d }
            java.lang.Object r2 = r1.f45535d
            monitor-enter(r2)
            boolean r0 = r1.f45556n     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0142
            com.google.android.gms.internal.ads.ama r0 = r1.f45555m     // Catch:{ all -> 0x014a }
            boolean r0 = r0.mo29139C()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x013a
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            return
        L_0x013a:
            com.google.android.gms.internal.ads.sn r0 = new com.google.android.gms.internal.ads.sn     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0142:
            com.google.android.gms.internal.ads.sn r0 = new com.google.android.gms.internal.ads.sn     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x014d:
            r0 = move-exception
            com.google.android.gms.internal.ads.sn r2 = new com.google.android.gms.internal.ads.sn
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x0173:
            return
        L_0x0174:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16250sv.mo31382a(long):void");
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
        synchronized (this.f45535d) {
            super.mo27697x_();
            if (this.f45551i != null) {
                this.f45551i.mo31197a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo31388a(CountDownLatch countDownLatch) {
        synchronized (this.f45535d) {
            this.f45556n = C15033t.m31095a(this.f45555m, this.f45553k, countDownLatch);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.yy */
public final class C16415yy extends C15563abr implements C16414yx {

    /* renamed from: a */
    final C16378xo f46023a;

    /* renamed from: b */
    private final abc f46024b;

    /* renamed from: c */
    private final Context f46025c;

    /* renamed from: d */
    private final ArrayList<C16405yo> f46026d;

    /* renamed from: e */
    private final List<C16408yr> f46027e;

    /* renamed from: f */
    private final HashSet<String> f46028f;

    /* renamed from: h */
    private final Object f46029h;

    /* renamed from: i */
    private final long f46030i;

    public C16415yy(Context context, abc abc, C16378xo xoVar) {
        Context context2 = context;
        abc abc2 = abc;
        C16378xo xoVar2 = xoVar;
        this(context2, abc2, xoVar2, ((Long) caf.m37099d().mo30717a(C15740bx.f44265az)).longValue());
    }

    /* renamed from: a */
    public final void mo31514a(String str, int i) {
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    private C16415yy(Context context, abc abc, C16378xo xoVar, long j) {
        this.f46026d = new ArrayList<>();
        this.f46027e = new ArrayList();
        this.f46028f = new HashSet<>();
        this.f46029h = new Object();
        this.f46025c = context;
        this.f46024b = abc;
        this.f46023a = xoVar;
        this.f46030i = j;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x015a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27696a() {
        /*
            r19 = this;
            r11 = r19
            com.google.android.gms.internal.ads.abc r0 = r11.f46024b
            com.google.android.gms.internal.ads.ny r0 = r0.f40131c
            java.util.List<com.google.android.gms.internal.ads.nx> r0 = r0.f45294a
            java.util.Iterator r12 = r0.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r12.next()
            r13 = r0
            com.google.android.gms.internal.ads.nx r13 = (com.google.android.gms.internal.ads.C16117nx) r13
            java.lang.String r14 = r13.f45281k
            java.util.List<java.lang.String> r0 = r13.f45273c
            java.util.Iterator r15 = r0.iterator()
        L_0x0021:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b2 }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.f46029h
            monitor-enter(r9)
            com.google.android.gms.internal.ads.xo r0 = r11.f46023a     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.zc r7 = r0.mo31468a(r3)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.yw r0 = r7.f46036b     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.or r0 = r7.f46035a     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            com.google.android.gms.internal.ads.yo r0 = new com.google.android.gms.internal.ads.yo     // Catch:{ all -> 0x00ab }
            android.content.Context r2 = r11.f46025c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.internal.ads.abc r6 = r11.f46024b     // Catch:{ all -> 0x00ab }
            long r4 = r11.f46030i     // Catch:{ all -> 0x00ab }
            r1 = r0
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r19
            r18 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.xo r1 = r11.f46023a     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.gw r1 = r1.f45968b     // Catch:{ all -> 0x00b0 }
            r0.f45994e = r1     // Catch:{ all -> 0x00b0 }
            java.util.ArrayList<com.google.android.gms.internal.ads.yo> r1 = r11.f46026d     // Catch:{ all -> 0x00b0 }
            r1.add(r0)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            goto L_0x0021
        L_0x0083:
            r18 = r9
            java.util.List<com.google.android.gms.internal.ads.yr> r0 = r11.f46027e     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yt r1 = new com.google.android.gms.internal.ads.yt     // Catch:{ all -> 0x00b0 }
            r1.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r13.f45274d     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yt r1 = r1.mo31524b(r2)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yt r1 = r1.mo31523a(r3)     // Catch:{ all -> 0x00b0 }
            r2 = 0
            com.google.android.gms.internal.ads.yt r1 = r1.mo31522a(r2)     // Catch:{ all -> 0x00b0 }
            r2 = 7
            com.google.android.gms.internal.ads.yt r1 = r1.mo31521a(r2)     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.yr r1 = r1.mo31520a()     // Catch:{ all -> 0x00b0 }
            r0.add(r1)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            goto L_0x0021
        L_0x00ab:
            r0 = move-exception
            r18 = r9
        L_0x00ae:
            monitor-exit(r18)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b0:
            r0 = move-exception
            goto L_0x00ae
        L_0x00b2:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.ads.abv.m32793b(r1, r0)
            goto L_0x0021
        L_0x00ba:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<com.google.android.gms.internal.ads.yo> r1 = r11.f46026d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x00c9:
            if (r4 >= r2) goto L_0x00df
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.yo r5 = (com.google.android.gms.internal.ads.C16405yo) r5
            java.lang.String r6 = r5.f45990a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x00c9
            r5.mo31515d()
            goto L_0x00c9
        L_0x00df:
            java.util.ArrayList<com.google.android.gms.internal.ads.yo> r0 = r11.f46026d
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L_0x00e8:
            if (r3 >= r2) goto L_0x0193
            java.lang.Object r0 = r1.get(r3)
            int r3 = r3 + 1
            r4 = r0
            com.google.android.gms.internal.ads.yo r4 = (com.google.android.gms.internal.ads.C16405yo) r4
            java.util.concurrent.Future r0 = r4.mo31515d()     // Catch:{ InterruptedException -> 0x015a, Exception -> 0x013b }
            r0.get()     // Catch:{ InterruptedException -> 0x015a, Exception -> 0x013b }
            java.lang.Object r5 = r11.f46029h
            monitor-enter(r5)
            java.lang.String r0 = r4.f45990a     // Catch:{ all -> 0x0136 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0136 }
            if (r0 != 0) goto L_0x010e
            java.util.List<com.google.android.gms.internal.ads.yr> r0 = r11.f46027e     // Catch:{ all -> 0x0136 }
            com.google.android.gms.internal.ads.yr r6 = r4.mo31516e()     // Catch:{ all -> 0x0136 }
            r0.add(r6)     // Catch:{ all -> 0x0136 }
        L_0x010e:
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            java.lang.Object r6 = r11.f46029h
            monitor-enter(r6)
            java.util.HashSet<java.lang.String> r0 = r11.f46028f     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = r4.f45990a     // Catch:{ all -> 0x0133 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r4.f45990a     // Catch:{ all -> 0x0133 }
            com.google.android.gms.internal.ads.nx r1 = r4.f45993d     // Catch:{ all -> 0x0133 }
            r2 = -2
            com.google.android.gms.internal.ads.abb r0 = r11.m39183a(r2, r0, r1)     // Catch:{ all -> 0x0133 }
            android.os.Handler r1 = com.google.android.gms.internal.ads.aes.f40377a     // Catch:{ all -> 0x0133 }
            com.google.android.gms.internal.ads.yz r2 = new com.google.android.gms.internal.ads.yz     // Catch:{ all -> 0x0133 }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x0133 }
            r1.post(r2)     // Catch:{ all -> 0x0133 }
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            return
        L_0x0131:
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            goto L_0x00e8
        L_0x0133:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0133 }
            throw r0
        L_0x0136:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0136 }
            throw r0
        L_0x0139:
            r0 = move-exception
            goto L_0x017a
        L_0x013b:
            r0 = move-exception
            java.lang.String r5 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.ads.abv.m32795c(r5, r0)     // Catch:{ all -> 0x0139 }
            java.lang.Object r5 = r11.f46029h
            monitor-enter(r5)
            java.lang.String r0 = r4.f45990a     // Catch:{ all -> 0x0157 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x0155
            java.util.List<com.google.android.gms.internal.ads.yr> r0 = r11.f46027e     // Catch:{ all -> 0x0157 }
            com.google.android.gms.internal.ads.yr r4 = r4.mo31516e()     // Catch:{ all -> 0x0157 }
            r0.add(r4)     // Catch:{ all -> 0x0157 }
        L_0x0155:
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            goto L_0x00e8
        L_0x0157:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            throw r0
        L_0x015a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0139 }
            r0.interrupt()     // Catch:{ all -> 0x0139 }
            java.lang.Object r1 = r11.f46029h
            monitor-enter(r1)
            java.lang.String r0 = r4.f45990a     // Catch:{ all -> 0x0177 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0177 }
            if (r0 != 0) goto L_0x0175
            java.util.List<com.google.android.gms.internal.ads.yr> r0 = r11.f46027e     // Catch:{ all -> 0x0177 }
            com.google.android.gms.internal.ads.yr r2 = r4.mo31516e()     // Catch:{ all -> 0x0177 }
            r0.add(r2)     // Catch:{ all -> 0x0177 }
        L_0x0175:
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            goto L_0x0193
        L_0x0177:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0177 }
            throw r0
        L_0x017a:
            java.lang.Object r1 = r11.f46029h
            monitor-enter(r1)
            java.lang.String r2 = r4.f45990a     // Catch:{ all -> 0x0190 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0190 }
            if (r2 != 0) goto L_0x018e
            java.util.List<com.google.android.gms.internal.ads.yr> r2 = r11.f46027e     // Catch:{ all -> 0x0190 }
            com.google.android.gms.internal.ads.yr r3 = r4.mo31516e()     // Catch:{ all -> 0x0190 }
            r2.add(r3)     // Catch:{ all -> 0x0190 }
        L_0x018e:
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            throw r0
        L_0x0190:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0190 }
            throw r0
        L_0x0193:
            r0 = 3
            r1 = 0
            com.google.android.gms.internal.ads.abb r0 = r11.m39183a(r0, r1, r1)
            android.os.Handler r1 = com.google.android.gms.internal.ads.aes.f40377a
            com.google.android.gms.internal.ads.za r2 = new com.google.android.gms.internal.ads.za
            r2.<init>(r11, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16415yy.mo27696a():void");
    }

    /* renamed from: a */
    public final void mo31513a(String str) {
        synchronized (this.f46029h) {
            this.f46028f.add(str);
        }
    }

    /* renamed from: a */
    private final abb m39183a(int i, String str, C16117nx nxVar) {
        boolean z;
        long j;
        String str2;
        zzyz zzyz;
        String str3;
        long j2;
        int i2;
        zzyv zzyv = this.f46024b.f40129a.f46132c;
        List<String> list = this.f46024b.f40130b.f46185c;
        List<String> list2 = this.f46024b.f40130b.f46187e;
        List<String> list3 = this.f46024b.f40130b.f46191i;
        int i3 = this.f46024b.f40130b.f46193k;
        long j3 = this.f46024b.f40130b.f46192j;
        String str4 = this.f46024b.f40129a.f46138i;
        boolean z2 = this.f46024b.f40130b.f46189g;
        C16118ny nyVar = this.f46024b.f40131c;
        long j4 = this.f46024b.f40130b.f46190h;
        zzyz zzyz2 = this.f46024b.f40132d;
        long j5 = j4;
        C16118ny nyVar2 = nyVar;
        long j6 = this.f46024b.f40130b.f46188f;
        long j7 = this.f46024b.f40134f;
        long j8 = this.f46024b.f40130b.f46195m;
        String str5 = this.f46024b.f40130b.f46196n;
        JSONObject jSONObject = this.f46024b.f40136h;
        zzbaz zzbaz = this.f46024b.f40130b.f46156A;
        JSONObject jSONObject2 = jSONObject;
        List<String> list4 = this.f46024b.f40130b.f46157B;
        List<String> list5 = this.f46024b.f40130b.f46158C;
        boolean z3 = this.f46024b.f40130b.f46159D;
        zzaxk zzaxk = this.f46024b.f40130b.f46160E;
        zzbaz zzbaz2 = zzbaz;
        StringBuilder sb = new StringBuilder("");
        if (this.f46027e == null) {
            str3 = sb.toString();
            zzyz = zzyz2;
            z = z2;
            str2 = str5;
            j = j8;
        } else {
            Iterator it = this.f46027e.iterator();
            while (true) {
                zzyz = zzyz2;
                if (it.hasNext()) {
                    C16408yr yrVar = (C16408yr) it.next();
                    if (yrVar != null) {
                        Iterator it2 = it;
                        if (!TextUtils.isEmpty(yrVar.f46011a)) {
                            String str6 = yrVar.f46011a;
                            String str7 = str5;
                            switch (yrVar.f46012b) {
                                case 3:
                                    j2 = j8;
                                    i2 = 1;
                                    break;
                                case 4:
                                    j2 = j8;
                                    i2 = 2;
                                    break;
                                case 5:
                                    j2 = j8;
                                    i2 = 4;
                                    break;
                                case 6:
                                    j2 = j8;
                                    i2 = 0;
                                    break;
                                case 7:
                                    j2 = j8;
                                    i2 = 3;
                                    break;
                                default:
                                    j2 = j8;
                                    i2 = 6;
                                    break;
                            }
                            long j9 = yrVar.f46013c;
                            boolean z4 = z2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 33);
                            sb2.append(str6);
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(i2);
                            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb2.append(j9);
                            sb.append(String.valueOf(sb2.toString()).concat("_"));
                            zzyz2 = zzyz;
                            it = it2;
                            str5 = str7;
                            j8 = j2;
                            z2 = z4;
                        } else {
                            zzyz2 = zzyz;
                            it = it2;
                        }
                    } else {
                        zzyz2 = zzyz;
                    }
                } else {
                    z = z2;
                    str2 = str5;
                    j = j8;
                    str3 = sb.substring(0, Math.max(0, sb.length() - 1));
                }
            }
        }
        long j10 = j5;
        long j11 = j6;
        long j12 = j7;
        long j13 = j;
        JSONObject jSONObject3 = jSONObject2;
        zzyz zzyz3 = zzyz;
        int i4 = i;
        boolean z5 = z;
        String str8 = str2;
        C16117nx nxVar2 = nxVar;
        C16118ny nyVar3 = nyVar2;
        String str9 = str;
        abb abb = new abb(zzyv, null, list, i4, list2, list3, i3, j3, str4, z5, nxVar2, null, str9, nyVar3, null, j10, zzyz3, j11, j12, j13, str8, jSONObject3, null, zzbaz2, list4, list5, z3, zzaxk, str3, this.f46024b.f40130b.f46163H, this.f46024b.f40130b.f46167L, this.f46024b.f40137i, this.f46024b.f40130b.f46170O, this.f46024b.f40138j, this.f46024b.f40130b.f46172Q, this.f46024b.f40130b.f46173R, this.f46024b.f40130b.f46174S, this.f46024b.f40130b.f46175T, this.f46024b.f40130b.f46177V, this.f46024b.f40130b.f46178W);
        return abb;
    }
}

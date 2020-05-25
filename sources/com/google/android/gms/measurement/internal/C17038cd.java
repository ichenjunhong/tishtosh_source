package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C15333e;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cd */
public final class C17038cd extends C17076do {

    /* renamed from: a */
    protected C17047cm f48075a;

    /* renamed from: b */
    public final AtomicReference<String> f48076b = new AtomicReference<>();

    /* renamed from: c */
    protected boolean f48077c = true;

    /* renamed from: d */
    private C17035ca f48078d;

    /* renamed from: e */
    private final Set<Object> f48079e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f48080f;

    protected C17038cd(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo32997t() {
        return false;
    }

    /* renamed from: a */
    public final void mo32996a(boolean z) {
        mo33068C();
        mo32853p().mo32912a((Runnable) new C17046cl(this, z));
    }

    /* renamed from: a */
    public final void mo32991a(String str, String str2, Bundle bundle) {
        mo32992a(str, str2, bundle, true, true, mo32849l().mo28523a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32990a(String str, String str2, long j, Bundle bundle) {
        mo32840c();
        m41348a(str, str2, j, bundle, true, this.f48078d == null || C17102em.m41673e(str2), false, null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m41348a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r1 = r27
            r8 = r28
            r6 = r29
            r2 = r32
            r7 = r36
            com.google.android.gms.common.internal.C15464q.m32125a(r28)
            com.google.android.gms.measurement.internal.eu r0 = r27.mo32856s()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C17122h.f48386av
            boolean r0 = r0.mo33280d(r7, r5)
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.common.internal.C15464q.m32125a(r29)
        L_0x001c:
            com.google.android.gms.common.internal.C15464q.m32123a(r32)
            r27.mo32840c()
            r27.mo33068C()
            com.google.android.gms.measurement.internal.ay r0 = r1.f48052r
            boolean r0 = r0.mo32936s()
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.measurement.internal.r r0 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48452i
            java.lang.String r2 = "Event not sent since app measurement is disabled"
            r0.mo33376a(r2)
            return
        L_0x0039:
            boolean r0 = r1.f48080f
            r5 = 0
            r16 = 0
            r15 = 1
            if (r0 != 0) goto L_0x0079
            r1.f48080f = r15
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0061 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r16] = r11     // Catch:{ Exception -> 0x0061 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0061 }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0061 }
            android.content.Context r10 = r27.mo32850m()     // Catch:{ Exception -> 0x0061 }
            r9[r16] = r10     // Catch:{ Exception -> 0x0061 }
            r0.invoke(r5, r9)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r27.mo32854q()     // Catch:{ ClassNotFoundException -> 0x006e }
            com.google.android.gms.measurement.internal.t r9 = r9.f48448e     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.String r10 = "Failed to invoke Tag Manager's initialize() method"
            r9.mo33377a(r10, r0)     // Catch:{ ClassNotFoundException -> 0x006e }
            goto L_0x0079
        L_0x006e:
            com.google.android.gms.measurement.internal.r r0 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48451h
            java.lang.String r9 = "Tag Manager is not found and thus will not be used"
            r0.mo33376a(r9)
        L_0x0079:
            r0 = 40
            r9 = 2
            if (r35 == 0) goto L_0x00e1
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.ay r10 = r1.f48052r
            com.google.android.gms.measurement.internal.em r10 = r10.mo32926e()
            java.lang.String r11 = "event"
            boolean r11 = r10.mo33146a(r11, r6)
            if (r11 != 0) goto L_0x0096
        L_0x0094:
            r10 = 2
            goto L_0x00ad
        L_0x0096:
            java.lang.String r11 = "event"
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.C17031bx.f48054a
            boolean r11 = r10.mo33147a(r11, r12, r6)
            if (r11 != 0) goto L_0x00a3
            r10 = 13
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r11 = "event"
            boolean r10 = r10.mo33145a(r11, r0, r6)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0094
        L_0x00ac:
            r10 = 0
        L_0x00ad:
            if (r10 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.r r2 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48447d
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r4 = r27.mo32851n()
            java.lang.String r4 = r4.mo33369a(r6)
            r2.mo33377a(r3, r4)
            com.google.android.gms.measurement.internal.ay r2 = r1.f48052r
            r2.mo32926e()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C17102em.m41658a(r6, r0, r15)
            if (r6 == 0) goto L_0x00d4
            int r16 = r29.length()
            r2 = r16
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            com.google.android.gms.measurement.internal.ay r3 = r1.f48052r
            com.google.android.gms.measurement.internal.em r3 = r3.mo32926e()
            java.lang.String r4 = "_ev"
            r3.mo33141a(r10, r4, r0, r2)
            return
        L_0x00e1:
            com.google.android.gms.measurement.internal.cq r10 = r27.mo32845h()
            com.google.android.gms.measurement.internal.cp r14 = r10.mo33021v()
            if (r14 == 0) goto L_0x00f5
            java.lang.String r10 = "_sc"
            boolean r10 = r2.containsKey(r10)
            if (r10 != 0) goto L_0x00f5
            r14.f48118d = r15
        L_0x00f5:
            if (r33 == 0) goto L_0x00fb
            if (r35 == 0) goto L_0x00fb
            r10 = 1
            goto L_0x00fc
        L_0x00fb:
            r10 = 0
        L_0x00fc:
            com.google.android.gms.measurement.internal.C17051cq.m41394a(r14, r2, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            boolean r10 = com.google.android.gms.measurement.internal.C17102em.m41673e(r29)
            if (r33 == 0) goto L_0x012f
            com.google.android.gms.measurement.internal.ca r3 = r1.f48078d
            if (r3 == 0) goto L_0x012f
            if (r10 != 0) goto L_0x012f
            if (r17 != 0) goto L_0x012f
            com.google.android.gms.measurement.internal.r r0 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48452i
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            com.google.android.gms.measurement.internal.p r4 = r27.mo32851n()
            java.lang.String r4 = r4.mo33369a(r6)
            com.google.android.gms.measurement.internal.p r5 = r27.mo32851n()
            java.lang.String r2 = r5.mo33366a(r2)
            r0.mo33378a(r3, r4, r2)
            return
        L_0x012f:
            com.google.android.gms.measurement.internal.ay r3 = r1.f48052r
            boolean r3 = r3.mo32939v()
            if (r3 != 0) goto L_0x0138
            return
        L_0x0138:
            com.google.android.gms.measurement.internal.em r3 = r27.mo32852o()
            int r3 = r3.mo33148b(r6)
            if (r3 == 0) goto L_0x017c
            com.google.android.gms.measurement.internal.r r2 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48447d
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r27.mo32851n()
            java.lang.String r5 = r5.mo33369a(r6)
            r2.mo33377a(r4, r5)
            r27.mo32852o()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C17102em.m41658a(r6, r0, r15)
            if (r6 == 0) goto L_0x0164
            int r2 = r29.length()
            r16 = r2
        L_0x0164:
            com.google.android.gms.measurement.internal.ay r2 = r1.f48052r
            com.google.android.gms.measurement.internal.em r2 = r2.mo32926e()
            java.lang.String r4 = "_ev"
            r28 = r2
            r29 = r36
            r30 = r3
            r31 = r4
            r32 = r0
            r33 = r16
            r28.mo33144a(r29, r30, r31, r32, r33)
            return
        L_0x017c:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = "_o"
            r0[r16] = r3
            java.lang.String r3 = "_sn"
            r0[r15] = r3
            java.lang.String r3 = "_sc"
            r0[r9] = r3
            r3 = 3
            java.lang.String r9 = "_si"
            r0[r3] = r9
            java.util.List r0 = com.google.android.gms.common.util.C15515f.m32274a(r0)
            com.google.android.gms.measurement.internal.em r9 = r27.mo32852o()
            r3 = 1
            r10 = r36
            r11 = r29
            r12 = r32
            r13 = r0
            r18 = r14
            r14 = r35
            r5 = 1
            r15 = r3
            android.os.Bundle r3 = r9.mo33139a(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x01de
            java.lang.String r9 = "_sc"
            boolean r9 = r3.containsKey(r9)
            if (r9 == 0) goto L_0x01de
            java.lang.String r9 = "_si"
            boolean r9 = r3.containsKey(r9)
            if (r9 != 0) goto L_0x01bd
            goto L_0x01de
        L_0x01bd:
            java.lang.String r9 = "_sn"
            java.lang.String r9 = r3.getString(r9)
            java.lang.String r10 = "_sc"
            java.lang.String r10 = r3.getString(r10)
            java.lang.String r11 = "_si"
            long r11 = r3.getLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.cp r12 = new com.google.android.gms.measurement.internal.cp
            long r13 = r11.longValue()
            r12.<init>(r9, r10, r13)
            r14 = r12
            goto L_0x01df
        L_0x01de:
            r14 = 0
        L_0x01df:
            if (r14 != 0) goto L_0x01e4
            r15 = r18
            goto L_0x01e5
        L_0x01e4:
            r15 = r14
        L_0x01e5:
            com.google.android.gms.measurement.internal.eu r9 = r27.mo32856s()
            boolean r9 = r9.mo33292l(r7)
            r10 = 0
            if (r9 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.cq r9 = r27.mo32845h()
            com.google.android.gms.measurement.internal.cp r9 = r9.mo33021v()
            if (r9 == 0) goto L_0x0216
            java.lang.String r9 = "_ae"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.ds r9 = r27.mo32847j()
            long r12 = r9.mo33079w()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0216
            com.google.android.gms.measurement.internal.em r9 = r27.mo32852o()
            r9.mo33142a(r3, r12)
        L_0x0216:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r3)
            com.google.android.gms.measurement.internal.em r9 = r27.mo32852o()
            java.security.SecureRandom r9 = r9.mo33155g()
            long r12 = r9.nextLong()
            com.google.android.gms.measurement.internal.eu r9 = r27.mo32856s()
            com.google.android.gms.measurement.internal.l r18 = r27.mo32843f()
            java.lang.String r5 = r18.mo33353v()
            boolean r5 = r9.mo33291k(r5)
            if (r5 == 0) goto L_0x0260
            java.lang.String r5 = "extend_session"
            long r9 = r3.getLong(r5, r10)
            r18 = 1
            int r5 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x0260
            com.google.android.gms.measurement.internal.r r5 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j
            java.lang.String r9 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r5.mo33376a(r9)
            com.google.android.gms.measurement.internal.ay r5 = r1.f48052r
            com.google.android.gms.measurement.internal.ds r5 = r5.mo32924c()
            r10 = r30
            r9 = 1
            r5.mo33075a(r10, r9)
            goto L_0x0262
        L_0x0260:
            r10 = r30
        L_0x0262:
            java.util.Set r5 = r3.keySet()
            int r2 = r32.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.Arrays.sort(r2)
            int r5 = r2.length
            r4 = 0
            r9 = 0
        L_0x0278:
            if (r9 >= r5) goto L_0x0313
            r21 = r5
            r5 = r2[r9]
            java.lang.Object r18 = r3.get(r5)
            r27.mo32852o()
            r22 = r2
            android.os.Bundle[] r2 = com.google.android.gms.measurement.internal.C17102em.m41666a(r18)
            if (r2 == 0) goto L_0x02f7
            int r7 = r2.length
            r3.putInt(r5, r7)
            r23 = r9
            r7 = 0
        L_0x0294:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x02ed
            r9 = r2[r7]
            r1 = 1
            com.google.android.gms.measurement.internal.C17051cq.m41394a(r15, r9, r1)
            com.google.android.gms.measurement.internal.em r18 = r27.mo32852o()
            java.lang.String r19 = "_ep"
            r20 = 0
            r24 = r9
            r9 = r18
            r10 = r36
            r11 = r19
            r25 = r2
            r1 = r12
            r12 = r24
            r13 = r0
            r26 = r0
            r0 = r14
            r14 = r35
            r18 = r15
            r15 = r20
            android.os.Bundle r9 = r9.mo33139a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            java.lang.String r10 = "_eid"
            r9.putLong(r10, r1)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            java.lang.String r10 = "_ll"
            r11 = r25
            int r12 = r11.length
            r9.putInt(r10, r12)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r7)
            r0.add(r9)
            int r7 = r7 + 1
            r14 = r0
            r12 = r1
            r2 = r11
            r15 = r18
            r0 = r26
            r1 = r27
            r10 = r30
            goto L_0x0294
        L_0x02ed:
            r26 = r0
            r11 = r2
            r1 = r12
            r0 = r14
            r18 = r15
            int r5 = r11.length
            int r4 = r4 + r5
            goto L_0x02ff
        L_0x02f7:
            r26 = r0
            r23 = r9
            r1 = r12
            r0 = r14
            r18 = r15
        L_0x02ff:
            int r9 = r23 + 1
            r10 = r30
            r14 = r0
            r12 = r1
            r15 = r18
            r5 = r21
            r2 = r22
            r0 = r26
            r1 = r27
            r7 = r36
            goto L_0x0278
        L_0x0313:
            r1 = r12
            r0 = r14
            if (r4 == 0) goto L_0x0321
            java.lang.String r5 = "_eid"
            r3.putLong(r5, r1)
            java.lang.String r1 = "_epc"
            r3.putInt(r1, r4)
        L_0x0321:
            r1 = 0
        L_0x0322:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x039d
            java.lang.Object r2 = r0.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r1 == 0) goto L_0x0332
            r3 = 1
            goto L_0x0333
        L_0x0332:
            r3 = 0
        L_0x0333:
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = "_ep"
            goto L_0x0339
        L_0x0338:
            r3 = r6
        L_0x0339:
            java.lang.String r4 = "_o"
            r2.putString(r4, r8)
            if (r34 == 0) goto L_0x0348
            com.google.android.gms.measurement.internal.em r4 = r27.mo32852o()
            android.os.Bundle r2 = r4.mo33138a(r2)
        L_0x0348:
            r10 = r2
            com.google.android.gms.measurement.internal.r r2 = r27.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48452i
            java.lang.String r4 = "Logging event (FE)"
            com.google.android.gms.measurement.internal.p r5 = r27.mo32851n()
            java.lang.String r5 = r5.mo33369a(r6)
            com.google.android.gms.measurement.internal.p r7 = r27.mo32851n()
            java.lang.String r7 = r7.mo33366a(r10)
            r2.mo33378a(r4, r5, r7)
            com.google.android.gms.measurement.internal.zzag r11 = new com.google.android.gms.measurement.internal.zzag
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r10)
            r2 = r11
            r12 = 1
            r5 = r28
            r13 = r6
            r14 = r36
            r6 = r30
            r2.<init>(r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.cu r2 = r27.mo32844g()
            r2.mo33029a(r11, r14)
            if (r17 != 0) goto L_0x0397
            r2 = r27
            java.util.Set<java.lang.Object> r3 = r2.f48079e
            java.util.Iterator r3 = r3.iterator()
        L_0x0388:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0399
            r3.next()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r10)
            goto L_0x0388
        L_0x0397:
            r2 = r27
        L_0x0399:
            int r1 = r1 + 1
            r6 = r13
            goto L_0x0322
        L_0x039d:
            r13 = r6
            r2 = r27
            r12 = 1
            com.google.android.gms.measurement.internal.cq r0 = r27.mo32845h()
            com.google.android.gms.measurement.internal.cp r0 = r0.mo33021v()
            if (r0 == 0) goto L_0x03ba
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x03ba
            com.google.android.gms.measurement.internal.ds r0 = r27.mo32847j()
            r0.mo33076a(r12, r12)
        L_0x03ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17038cd.m41348a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo32992a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        C17038cd cdVar;
        Bundle bundle2;
        String str3 = str == null ? "app" : str;
        if (bundle == null) {
            cdVar = this;
            bundle2 = new Bundle();
        } else {
            cdVar = this;
            bundle2 = bundle;
        }
        m41352b(str3, str2, j, bundle2, true, cdVar.f48078d == null || C17102em.m41673e(str2), !z, null);
    }

    /* renamed from: b */
    private final void m41352b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C17102em.m41667b(bundle);
        C17000at p = mo32853p();
        C17040cf cfVar = new C17040cf(this, str, str2, j, b, z, z2, z3, null);
        p.mo32912a((Runnable) cfVar);
    }

    /* renamed from: a */
    public final void mo32994a(String str, String str2, Object obj, boolean z) {
        m41350a(str, str2, obj, true, mo32849l().mo28523a());
    }

    /* renamed from: a */
    private void m41350a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo32852o().mo33151c(str2);
        } else {
            C17102em o = mo32852o();
            if (o.mo33146a("user property", str2)) {
                if (!o.mo33147a("user property", C17033bz.f48058a, str2)) {
                    i = 15;
                } else if (o.mo33145a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo32852o();
            String a = C17102em.m41658a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f48052r.mo32926e().mo33141a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo32852o().mo33149b(str2, obj);
            if (b != 0) {
                mo32852o();
                String a2 = C17102em.m41658a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f48052r.mo32926e().mo33141a(b, "_ev", a2, i2);
                return;
            }
            mo32852o();
            Object c = C17102em.m41669c(str2, obj);
            if (c != null) {
                m41349a(str3, str2, j, c);
            }
        } else {
            m41349a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m41349a(String str, String str2, long j, Object obj) {
        C17000at p = mo32853p();
        C17041cg cgVar = new C17041cg(this, str, str2, obj, j);
        p.mo32912a((Runnable) cgVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32993a(String str, String str2, Object obj, long j) {
        C15464q.m32125a(str);
        C15464q.m32125a(str2);
        mo32840c();
        mo33068C();
        if (!this.f48052r.mo32936s()) {
            mo32854q().f48452i.mo33376a("User property not set since app measurement is disabled");
        } else if (this.f48052r.mo32939v()) {
            mo32854q().f48452i.mo33378a("Setting user property (FE)", mo32851n().mo33369a(str2), obj);
            zzfv zzfv = new zzfv(str2, j, obj, str);
            mo32844g().mo33030a(zzfv);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32989a(String str) {
        this.f48076b.set(str);
    }

    /* renamed from: v */
    public final void mo32998v() {
        mo32840c();
        mo33068C();
        if (this.f48052r.mo32939v()) {
            mo32844g().mo33037x();
            this.f48077c = false;
            String u = mo32855r().mo32879u();
            if (!TextUtils.isEmpty(u)) {
                mo32848k().mo32980w();
                if (!u.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", u);
                    mo32991a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo32988a(ConditionalUserProperty conditionalUserProperty) {
        long a = mo32849l().mo28523a();
        C15464q.m32123a(conditionalUserProperty);
        C15464q.m32125a(conditionalUserProperty.mName);
        C15464q.m32125a(conditionalUserProperty.mOrigin);
        C15464q.m32123a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo32852o().mo33151c(str) != 0) {
            mo32854q().f48445b.mo33377a("Invalid conditional user property name", mo32851n().mo33371c(str));
        } else if (mo32852o().mo33149b(str, obj) != 0) {
            mo32854q().f48445b.mo33378a("Invalid conditional user property value", mo32851n().mo33371c(str), obj);
        } else {
            mo32852o();
            Object c = C17102em.m41669c(str, obj);
            if (c == null) {
                mo32854q().f48445b.mo33378a("Unable to normalize conditional user property value", mo32851n().mo33371c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo32854q().f48445b.mo33378a("Invalid conditional user property time to live", mo32851n().mo33371c(str), Long.valueOf(j2));
                } else {
                    mo32853p().mo32912a((Runnable) new C17042ch(this, conditionalUserProperty));
                }
            } else {
                mo32854q().f48445b.mo33378a("Invalid conditional user property timeout", mo32851n().mo33371c(str), Long.valueOf(j));
            }
        }
    }

    /* renamed from: a */
    public final void mo32995a(String str, String str2, String str3, Bundle bundle) {
        long a = mo32849l().mo28523a();
        C15464q.m32125a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo32853p().mo32912a((Runnable) new C17043ci(this, conditionalUserProperty));
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo32986a(String str, String str2, String str3) {
        if (mo32853p().mo32915f()) {
            mo32854q().f48445b.mo33376a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C17108es.m41769a()) {
            mo32854q().f48445b.mo33376a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C17000at p = this.f48052r.mo32853p();
                C17044cj cjVar = new C17044cj(this, atomicReference, str, str2, str3);
                p.mo32912a((Runnable) cjVar);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo32854q().f48448e.mo33378a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzo> list = (List) atomicReference.get();
            if (list == null) {
                mo32854q().f48448e.mo33377a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzo zzo : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzo.f48505a;
                conditionalUserProperty.mOrigin = zzo.f48506b;
                conditionalUserProperty.mCreationTimestamp = zzo.f48508d;
                conditionalUserProperty.mName = zzo.f48507c.f48479a;
                conditionalUserProperty.mValue = zzo.f48507c.mo33393a();
                conditionalUserProperty.mActive = zzo.f48509e;
                conditionalUserProperty.mTriggerEventName = zzo.f48510f;
                if (zzo.f48511g != null) {
                    conditionalUserProperty.mTimedOutEventName = zzo.f48511g.f48475a;
                    if (zzo.f48511g.f48476b != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzo.f48511g.f48476b.mo33384b();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzo.f48512h;
                if (zzo.f48513i != null) {
                    conditionalUserProperty.mTriggeredEventName = zzo.f48513i.f48475a;
                    if (zzo.f48513i.f48476b != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzo.f48513i.f48476b.mo33384b();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzo.f48507c.f48480b;
                conditionalUserProperty.mTimeToLive = zzo.f48514j;
                if (zzo.f48515k != null) {
                    conditionalUserProperty.mExpiredEventName = zzo.f48515k.f48475a;
                    if (zzo.f48515k.f48476b != null) {
                        conditionalUserProperty.mExpiredEventParams = zzo.f48515k.f48476b.mo33384b();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo32987a(String str, String str2, String str3, boolean z) {
        if (mo32853p().mo32915f()) {
            mo32854q().f48445b.mo33376a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C17108es.m41769a()) {
            mo32854q().f48445b.mo33376a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C17000at p = this.f48052r.mo32853p();
                C17045ck ckVar = new C17045ck(this, atomicReference, str, str2, str3, z);
                p.mo32912a((Runnable) ckVar);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo32854q().f48448e.mo33377a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzfv> list = (List) atomicReference.get();
            if (list == null) {
                mo32854q().f48448e.mo33376a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            C0777a aVar = new C0777a(list.size());
            for (zzfv zzfv : list) {
                aVar.put(zzfv.f48479a, zzfv.mo33393a());
            }
            return aVar;
        }
    }

    /* renamed from: w */
    public final String mo32999w() {
        C17050cp w = this.f48052r.mo32930i().mo33022w();
        if (w != null) {
            return w.f48115a;
        }
        return null;
    }

    /* renamed from: x */
    public final String mo33000x() {
        C17050cp w = this.f48052r.mo32930i().mo33022w();
        if (w != null) {
            return w.f48116b;
        }
        return null;
    }

    /* renamed from: y */
    public final String mo33001y() {
        if (this.f48052r.f47962a != null) {
            return this.f48052r.f47962a;
        }
        try {
            return C15333e.m31885a();
        } catch (IllegalStateException e) {
            this.f48052r.mo32854q().f48445b.mo33377a("getGoogleAppId failed with exception", e);
            return null;
        }
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
    static /* synthetic */ void m41345a(C17038cd cdVar) {
        if (!cdVar.mo32856s().mo33282e(cdVar.mo32843f().mo33353v()) || !cdVar.f48052r.mo32936s() || !cdVar.f48077c) {
            cdVar.mo32854q().f48452i.mo33376a("Updating Scion state (FE)");
            cdVar.mo32844g().mo33036w();
            return;
        }
        cdVar.mo32854q().f48452i.mo33376a("Recording app launch after enabling measurement for the first time (FE)");
        cdVar.mo32998v();
    }

    /* renamed from: a */
    static /* synthetic */ void m41346a(C17038cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        cdVar.mo32840c();
        cdVar.mo33068C();
        C15464q.m32123a(conditionalUserProperty);
        C15464q.m32125a(conditionalUserProperty2.mName);
        C15464q.m32125a(conditionalUserProperty2.mOrigin);
        C15464q.m32123a(conditionalUserProperty2.mValue);
        if (!cdVar.f48052r.mo32936s()) {
            cdVar.mo32854q().f48452i.mo33376a("Conditional property not sent since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzag a = cdVar.mo32852o().mo33140a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a2 = cdVar.mo32852o().mo33140a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a3 = cdVar.mo32852o().mo33140a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzo zzo = r2;
            zzo zzo2 = new zzo(conditionalUserProperty2.mAppId, conditionalUserProperty2.mOrigin, zzfv, conditionalUserProperty2.mCreationTimestamp, false, conditionalUserProperty2.mTriggerEventName, a2, conditionalUserProperty2.mTriggerTimeout, a, conditionalUserProperty2.mTimeToLive, a3);
            cdVar.mo32844g().mo33031a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m41351b(C17038cd cdVar, ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        cdVar.mo32840c();
        cdVar.mo33068C();
        C15464q.m32123a(conditionalUserProperty);
        C15464q.m32125a(conditionalUserProperty2.mName);
        if (!cdVar.f48052r.mo32936s()) {
            cdVar.mo32854q().f48452i.mo33376a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, 0, null, null);
        try {
            zzag a = cdVar.mo32852o().mo33140a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            long j3 = conditionalUserProperty2.mTimeToLive;
            zzo zzo = r2;
            zzo zzo2 = new zzo(str, str2, zzfv, j, z, str3, null, j2, null, j3, a);
            cdVar.mo32844g().mo33031a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }
}

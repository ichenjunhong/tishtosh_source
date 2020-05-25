package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ahj.C15575a;
import com.google.android.gms.internal.ads.amq.C15587a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.util.concurrent.ExecutionException;

public final class bfo extends bgm {

    /* renamed from: d */
    private static final bgn<ban> f42281d = new bgn<>();

    /* renamed from: e */
    private final Context f42282e;

    /* renamed from: f */
    private C15575a f42283f;

    public bfo(bey bey, String str, String str2, C15588a aVar, int i, int i2, Context context, C15575a aVar2) {
        super(bey, str, str2, aVar, i, 27);
        this.f42282e = context;
        this.f42283f = aVar2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30119a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.bgn<com.google.android.gms.internal.ads.ban> r0 = f42281d
            android.content.Context r1 = r8.f42282e
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.mo30130a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ban r1 = (com.google.android.gms.internal.ads.ban) r1     // Catch:{ all -> 0x012a }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f41724a     // Catch:{ all -> 0x012a }
            boolean r4 = com.google.android.gms.internal.ads.bfg.m35545b(r4)     // Catch:{ all -> 0x012a }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f41724a     // Catch:{ all -> 0x012a }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x012a }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f41724a     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.ahj$a r1 = r8.f42283f     // Catch:{ all -> 0x012a }
            java.lang.String r1 = m35558a(r1)     // Catch:{ all -> 0x012a }
            boolean r1 = com.google.android.gms.internal.ads.bfg.m35545b(r1)     // Catch:{ all -> 0x012a }
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.ajl r1 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x012a }
            goto L_0x008f
        L_0x0048:
            com.google.android.gms.internal.ads.ahj$a r1 = r8.f42283f     // Catch:{ all -> 0x012a }
            java.lang.String r4 = m35558a(r1)     // Catch:{ all -> 0x012a }
            boolean r4 = com.google.android.gms.internal.ads.bfg.m35545b(r4)     // Catch:{ all -> 0x012a }
            if (r4 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            int r4 = r1.zzdi     // Catch:{ all -> 0x012a }
            r4 = r4 & r3
            if (r4 != r3) goto L_0x005d
            r4 = 1
            goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            if (r4 == 0) goto L_0x0079
            com.google.android.gms.internal.ads.ahj$b r4 = r1.zzdv     // Catch:{ all -> 0x012a }
            if (r4 != 0) goto L_0x0067
            com.google.android.gms.internal.ads.ahj$b r1 = com.google.android.gms.internal.ads.ahj.C15577b.zzdz     // Catch:{ all -> 0x012a }
            goto L_0x0069
        L_0x0067:
            com.google.android.gms.internal.ads.ahj$b r1 = r1.zzdv     // Catch:{ all -> 0x012a }
        L_0x0069:
            int r1 = r1.zzdy     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ajl r1 = com.google.android.gms.internal.ads.ajl.zzd(r1)     // Catch:{ all -> 0x012a }
            if (r1 != 0) goto L_0x0073
            com.google.android.gms.internal.ads.ajl r1 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x012a }
        L_0x0073:
            com.google.android.gms.internal.ads.ajl r4 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x012a }
            if (r1 != r4) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x012a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.bey r1 = r8.f42314a     // Catch:{ all -> 0x012a }
            boolean r1 = r1.f42227l     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.ajl r1 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x012a }
            goto L_0x008f
        L_0x008d:
            com.google.android.gms.internal.ads.ajl r1 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x012a }
        L_0x008f:
            java.lang.reflect.Method r4 = r8.f42316c     // Catch:{ all -> 0x012a }
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x012a }
            android.content.Context r7 = r8.f42282e     // Catch:{ all -> 0x012a }
            r6[r2] = r7     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ajl r7 = com.google.android.gms.internal.ads.ajl.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x012a }
            if (r1 != r7) goto L_0x009e
            r2 = 1
        L_0x009e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x012a }
            r6[r3] = r2     // Catch:{ all -> 0x012a }
            r2 = 2
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15740bx.f44317by     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x012a }
            java.lang.Object r3 = r7.mo30717a(r3)     // Catch:{ all -> 0x012a }
            r6[r2] = r3     // Catch:{ all -> 0x012a }
            java.lang.Object r2 = r4.invoke(r5, r6)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ban r3 = new com.google.android.gms.internal.ads.ban     // Catch:{ all -> 0x012a }
            r3.<init>(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r3.f41724a     // Catch:{ all -> 0x012a }
            boolean r2 = com.google.android.gms.internal.ads.bfg.m35545b(r2)     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x00ce
            java.lang.String r2 = r3.f41724a     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "E"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x00f1
        L_0x00ce:
            int[] r2 = com.google.android.gms.internal.ads.bfp.f42284a     // Catch:{ all -> 0x012a }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x012a }
            r1 = r2[r1]     // Catch:{ all -> 0x012a }
            switch(r1) {
                case 1: goto L_0x00e7;
                case 2: goto L_0x00da;
                default: goto L_0x00d9;
            }     // Catch:{ all -> 0x012a }
        L_0x00d9:
            goto L_0x00f1
        L_0x00da:
            java.lang.String r1 = r8.m35559c()     // Catch:{ all -> 0x012a }
            boolean r2 = com.google.android.gms.internal.ads.bfg.m35545b(r1)     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x00f1
            r3.f41724a = r1     // Catch:{ all -> 0x012a }
            goto L_0x00f1
        L_0x00e7:
            com.google.android.gms.internal.ads.ahj$a r1 = r8.f42283f     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ahj$c r1 = r1.mo28887b()     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r1.zzei     // Catch:{ all -> 0x012a }
            r3.f41724a = r1     // Catch:{ all -> 0x012a }
        L_0x00f1:
            r0.set(r3)     // Catch:{ all -> 0x012a }
        L_0x00f4:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.ban r1 = (com.google.android.gms.internal.ads.ban) r1     // Catch:{ all -> 0x012a }
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            com.google.android.gms.internal.ads.amq$a$a r2 = r8.f42315b
            monitor-enter(r2)
            if (r1 == 0) goto L_0x0126
            com.google.android.gms.internal.ads.amq$a$a r0 = r8.f42315b     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r1.f41724a     // Catch:{ all -> 0x0124 }
            r0.mo29284c(r3)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.amq$a$a r0 = r8.f42315b     // Catch:{ all -> 0x0124 }
            long r3 = r1.f41725b     // Catch:{ all -> 0x0124 }
            r0.mo29304p(r3)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.amq$a$a r0 = r8.f42315b     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r1.f41726c     // Catch:{ all -> 0x0124 }
            r0.mo29289e(r3)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.amq$a$a r0 = r8.f42315b     // Catch:{ all -> 0x0124 }
            java.lang.String r3 = r1.f41727d     // Catch:{ all -> 0x0124 }
            r0.mo29291f(r3)     // Catch:{ all -> 0x0124 }
            com.google.android.gms.internal.ads.amq$a$a r0 = r8.f42315b     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = r1.f41728e     // Catch:{ all -> 0x0124 }
            r0.mo29293g(r1)     // Catch:{ all -> 0x0124 }
            goto L_0x0126
        L_0x0124:
            r0 = move-exception
            goto L_0x0128
        L_0x0126:
            monitor-exit(r2)     // Catch:{ all -> 0x0124 }
            return
        L_0x0128:
            monitor-exit(r2)     // Catch:{ all -> 0x0124 }
            throw r0
        L_0x012a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bfo.mo30119a():void");
    }

    /* renamed from: a */
    private static String m35558a(C15575a aVar) {
        if (aVar == null || !aVar.mo28886a() || bfg.m35545b(aVar.mo28887b().zzei)) {
            return null;
        }
        return aVar.mo28887b().zzei;
    }

    /* renamed from: c */
    private final String m35559c() {
        try {
            if (this.f42314a.f42224i != null) {
                this.f42314a.f42224i.get();
            }
            C15587a aVar = this.f42314a.f42223h;
            if (aVar != null && aVar.mo29260a()) {
                return aVar.zzei;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }
}

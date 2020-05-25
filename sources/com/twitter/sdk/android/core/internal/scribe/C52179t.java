package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C52119l;
import com.twitter.sdk.android.core.internal.scribe.C52181v.C52182a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.t */
public class C52179t {

    /* renamed from: a */
    final ConcurrentHashMap<Long, C52186z> f129876a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private final Context f129877b;

    /* renamed from: c */
    private final ScheduledExecutorService f129878c;

    /* renamed from: d */
    private final C52180u f129879d;

    /* renamed from: e */
    private final C52182a f129880e;

    /* renamed from: f */
    private final TwitterAuthConfig f129881f;

    /* renamed from: g */
    private final C52189k<? extends C52188j<TwitterAuthToken>> f129882g;

    /* renamed from: h */
    private final C52072e f129883h;

    /* renamed from: i */
    private final C52119l f129884i;

    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.twitter.sdk.android.core.internal.scribe.o] */
    /* JADX WARNING: type inference failed for: r22v1, types: [com.twitter.sdk.android.core.internal.scribe.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0079 A[Catch:{ IOException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00bf A[Catch:{ IOException -> 0x00ec }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo108914a(com.twitter.sdk.android.core.internal.scribe.C52181v r26, long r27) {
        /*
            r25 = this;
            r1 = r25
            r12 = r27
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.twitter.sdk.android.core.internal.scribe.z> r0 = r1.f129876a     // Catch:{ IOException -> 0x00ec }
            java.lang.Long r2 = java.lang.Long.valueOf(r27)     // Catch:{ IOException -> 0x00ec }
            boolean r0 = r0.containsKey(r2)     // Catch:{ IOException -> 0x00ec }
            if (r0 != 0) goto L_0x00d8
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.twitter.sdk.android.core.internal.scribe.z> r0 = r1.f129876a     // Catch:{ IOException -> 0x00ec }
            java.lang.Long r15 = java.lang.Long.valueOf(r27)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.s r6 = new com.twitter.sdk.android.core.internal.scribe.s     // Catch:{ IOException -> 0x00ec }
            android.content.Context r2 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.b.a r3 = new com.twitter.sdk.android.core.internal.b.a     // Catch:{ IOException -> 0x00ec }
            android.content.Context r4 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            r3.<init>(r4)     // Catch:{ IOException -> 0x00ec }
            android.content.Context r3 = r3.f129710a     // Catch:{ IOException -> 0x00ec }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ IOException -> 0x00ec }
            if (r3 == 0) goto L_0x0036
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00ec }
            if (r4 != 0) goto L_0x0037
            boolean r4 = r3.mkdirs()     // Catch:{ IOException -> 0x00ec }
            if (r4 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ec }
            r4.<init>()     // Catch:{ IOException -> 0x00ec }
            r4.append(r12)     // Catch:{ IOException -> 0x00ec }
            java.lang.String r5 = "_se.tap"
            r4.append(r5)     // Catch:{ IOException -> 0x00ec }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00ec }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ec }
            r5.<init>()     // Catch:{ IOException -> 0x00ec }
            r5.append(r12)     // Catch:{ IOException -> 0x00ec }
            java.lang.String r7 = "_se_to_send"
            r5.append(r7)     // Catch:{ IOException -> 0x00ec }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00ec }
            r6.<init>(r2, r3, r4, r5)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.x r11 = new com.twitter.sdk.android.core.internal.scribe.x     // Catch:{ IOException -> 0x00ec }
            android.content.Context r3 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.v$a r4 = r1.f129880e     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.p r5 = new com.twitter.sdk.android.core.internal.p     // Catch:{ IOException -> 0x00ec }
            r5.<init>()     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.u r2 = r1.f129879d     // Catch:{ IOException -> 0x00ec }
            int r7 = r2.f129891g     // Catch:{ IOException -> 0x00ec }
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.z r10 = new com.twitter.sdk.android.core.internal.scribe.z     // Catch:{ IOException -> 0x00ec }
            android.content.Context r9 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.u r2 = r1.f129879d     // Catch:{ IOException -> 0x00ec }
            boolean r2 = r2.f129885a     // Catch:{ IOException -> 0x00ec }
            if (r2 == 0) goto L_0x00bf
            android.content.Context r2 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            java.lang.String r3 = "Scribe enabled"
            com.twitter.sdk.android.core.internal.C52114g.m111464a(r2, r3)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.d r22 = new com.twitter.sdk.android.core.internal.scribe.d     // Catch:{ IOException -> 0x00ec }
            android.content.Context r8 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            java.util.concurrent.ScheduledExecutorService r7 = r1.f129878c     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.u r5 = r1.f129879d     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender r21 = new com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender     // Catch:{ IOException -> 0x00ec }
            android.content.Context r3 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.u r4 = r1.f129879d     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.TwitterAuthConfig r6 = r1.f129881f     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.k<? extends com.twitter.sdk.android.core.j<com.twitter.sdk.android.core.TwitterAuthToken>> r2 = r1.f129882g     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.e r14 = r1.f129883h     // Catch:{ IOException -> 0x00ec }
            r23 = r10
            java.util.concurrent.ScheduledExecutorService r10 = r1.f129878c     // Catch:{ IOException -> 0x00ec }
            r24 = r11
            com.twitter.sdk.android.core.internal.l r11 = r1.f129884i     // Catch:{ IOException -> 0x00ec }
            r16 = r2
            r2 = r21
            r20 = r5
            r17 = r6
            r5 = r27
            r18 = r7
            r7 = r17
            r17 = r8
            r8 = r16
            r12 = r9
            r9 = r14
            r13 = r23
            r14 = r24
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x00ec }
            r16 = r22
            r19 = r14
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException -> 0x00ec }
            goto L_0x00ce
        L_0x00bf:
            r12 = r9
            r13 = r10
            r14 = r11
            android.content.Context r2 = r1.f129877b     // Catch:{ IOException -> 0x00ec }
            java.lang.String r3 = "Scribe disabled"
            com.twitter.sdk.android.core.internal.C52114g.m111464a(r2, r3)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.b r22 = new com.twitter.sdk.android.core.internal.scribe.b     // Catch:{ IOException -> 0x00ec }
            r22.<init>()     // Catch:{ IOException -> 0x00ec }
        L_0x00ce:
            r2 = r22
            java.util.concurrent.ScheduledExecutorService r3 = r1.f129878c     // Catch:{ IOException -> 0x00ec }
            r13.<init>(r12, r2, r14, r3)     // Catch:{ IOException -> 0x00ec }
            r0.putIfAbsent(r15, r13)     // Catch:{ IOException -> 0x00ec }
        L_0x00d8:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.twitter.sdk.android.core.internal.scribe.z> r0 = r1.f129876a     // Catch:{ IOException -> 0x00ec }
            java.lang.Long r2 = java.lang.Long.valueOf(r27)     // Catch:{ IOException -> 0x00ec }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x00ec }
            com.twitter.sdk.android.core.internal.scribe.z r0 = (com.twitter.sdk.android.core.internal.scribe.C52186z) r0     // Catch:{ IOException -> 0x00ec }
            r2 = r26
            r3 = 0
            r0.mo108890a(r2, r3)     // Catch:{ IOException -> 0x00ec }
            r0 = 1
            return r0
        L_0x00ec:
            r0 = move-exception
            android.content.Context r2 = r1.f129877b
            java.lang.String r3 = "Failed to scribe event"
            com.twitter.sdk.android.core.internal.C52114g.m111465a(r2, r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.scribe.C52179t.mo108914a(com.twitter.sdk.android.core.internal.scribe.v, long):boolean");
    }

    public C52179t(Context context, ScheduledExecutorService scheduledExecutorService, C52180u uVar, C52182a aVar, TwitterAuthConfig twitterAuthConfig, C52189k<? extends C52188j<TwitterAuthToken>> kVar, C52072e eVar, C52119l lVar) {
        this.f129877b = context;
        this.f129878c = scheduledExecutorService;
        this.f129879d = uVar;
        this.f129880e = aVar;
        this.f129881f = twitterAuthConfig;
        this.f129882g = kVar;
        this.f129883h = eVar;
        this.f129884i = lVar;
    }
}

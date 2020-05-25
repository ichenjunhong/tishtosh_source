package com.p683ss.android.ugc.aweme.feed.helper;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ttnet.p885c.C13302e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.feed.C30129af;
import com.p683ss.android.ugc.aweme.feed.api.C30144b;
import com.p683ss.android.ugc.aweme.feed.api.C30149g;
import com.p683ss.android.ugc.aweme.feed.api.C30157o;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.b */
public final class C30361b {

    /* renamed from: a */
    public static volatile FeedItemList f79285a = new FeedItemList();

    /* renamed from: b */
    public static Object f79286b = new Object();

    /* renamed from: c */
    public static AtomicBoolean f79287c = new AtomicBoolean(false);

    /* renamed from: d */
    public static AtomicInteger f79288d = new AtomicInteger(1);

    /* renamed from: e */
    public static AtomicInteger f79289e = new AtomicInteger(1);

    /* renamed from: a */
    public static FeedItemList m71275a(C30149g gVar, int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Long l, String str9, String str10, String str11, C13302e eVar, Integer num3, Long l2, String str12, Integer num4, C30157o oVar) {
        String str13;
        double a = AudioUtils.m57293a();
        String str14 = "enter_auto";
        if (str2 == null) {
            str13 = "";
        } else {
            str13 = str2;
        }
        try {
            return C30144b.m70744a((C22977c) gVar.mo60427a(i, j, j2, i2, num, str, a, i3, str14, str13, str3, str4, str5, C23794bh.m58390d().mo47107d(), str6, str7, num2, Integer.valueOf(C47945d.m103731a()), Integer.valueOf(C47945d.m103733b()), str8, l, str9, str10, str11, eVar, num3, l2, str12, num4, C30129af.m70699a(C11010c.m22280a()), C23794bh.m58381G().mo47257r()).get(), oVar);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00af */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.feed.model.FeedItemList m71277b(com.p683ss.android.ugc.aweme.feed.api.C30149g r64, int r65, long r66, long r68, int r70, java.lang.Integer r71, java.lang.String r72, int r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.Integer r80, java.lang.String r81, java.lang.Long r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, com.bytedance.ttnet.p885c.C13302e r86, java.lang.Integer r87, java.lang.Long r88, java.lang.String r89, java.lang.Integer r90, com.p683ss.android.ugc.aweme.feed.api.C30157o r91) {
        /*
            r3 = r64
            r4 = r65
            r5 = r66
            r7 = r68
            r9 = r70
            r10 = r71
            r11 = r72
            r12 = r73
            r13 = r74
            r14 = r75
            r15 = r76
            r16 = r77
            r17 = r78
            r18 = r79
            r19 = r80
            r20 = r81
            r21 = r82
            r22 = r83
            r23 = r84
            r24 = r85
            r25 = r86
            r26 = r87
            r27 = r88
            r28 = r89
            r29 = r90
            r30 = r91
            r34 = r64
            r35 = r65
            r36 = r66
            r38 = r68
            r40 = r70
            r41 = r71
            r42 = r72
            r43 = r73
            r44 = r74
            r45 = r75
            r46 = r76
            r47 = r77
            r48 = r78
            r49 = r79
            r50 = r80
            r51 = r81
            r52 = r82
            r53 = r83
            r54 = r84
            r55 = r85
            r56 = r86
            r57 = r87
            r58 = r88
            r59 = r89
            r60 = r90
            r61 = r91
            long r32 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.feed.model.FeedCompoundConfig r0 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70965f()
            int r1 = r0.threshold
            java.util.List<java.lang.String> r0 = r0.requestDomains
            int r2 = r0.size()
            com.ss.android.ugc.aweme.feed.helper.c r0 = new com.ss.android.ugc.aweme.feed.helper.c
            r31 = r0
            r31.<init>(r32, r34, r35, r36, r38, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r62 = r1
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58902c()
            p001a.C0013i.m18a(r0, r1)
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ss.android.ugc.aweme.feed.helper.b$1 r31 = new com.ss.android.ugc.aweme.feed.helper.b$1
            r63 = r0
            r0 = r62
            r1 = r31
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            long r0 = (long) r0
            r64 = r63
            r65 = r31
            r66 = r0
            r68 = r0
            r64.scheduleAtFixedRate(r65, r66, r68)
            java.lang.Object r1 = f79286b
            monitor-enter(r1)
            java.lang.Object r0 = f79286b     // Catch:{ InterruptedException -> 0x00af }
            r0.wait()     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x00af
        L_0x00ad:
            r0 = move-exception
            goto L_0x00bc
        L_0x00af:
            java.util.concurrent.atomic.AtomicBoolean r0 = f79287c     // Catch:{ all -> 0x00ad }
            r2 = 1
            r0.set(r2)     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)     // Catch:{ all -> 0x00ad }
            r63.cancel()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = f79285a
            return r0
        L_0x00bc:
            monitor-exit(r1)     // Catch:{ all -> 0x00ad }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.helper.C30361b.m71277b(com.ss.android.ugc.aweme.feed.api.g, int, long, long, int, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.c.e, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.feed.api.o):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* renamed from: a */
    static final /* synthetic */ Object m71276a(long j, C30149g gVar, int i, long j2, long j3, int i2, Integer num, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Long l, String str9, String str10, String str11, C13302e eVar, Integer num3, Long l2, String str12, Integer num4, C30157o oVar) throws Exception {
        try {
            C22574a.m55738f().mo46915a("cold_boot_feed_compound_thread", System.currentTimeMillis() - j);
            f79285a = m71275a(gVar, i, j2, j3, i2, num, str, i3, str2, str3, str4, str5, str6, str7, num2, str8, l, str9, str10, str11, eVar, num3, l2, str12, num4, oVar);
            synchronized (f79286b) {
                f79286b.notify();
            }
        } catch (Throwable th) {
            synchronized (f79286b) {
                f79286b.notify();
                throw th;
            }
        }
        return null;
    }
}

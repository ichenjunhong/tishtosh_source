package com.p683ss.android.ugc.aweme.freeflowcard;

import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32497f;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b */
public class C32472b {

    /* renamed from: d */
    private static final String f84551d = "b";

    /* renamed from: g */
    private static C32472b f84552g;

    /* renamed from: a */
    public int f84553a = -1;

    /* renamed from: b */
    public boolean f84554b;

    /* renamed from: c */
    public boolean f84555c = true;

    /* renamed from: e */
    private String f84556e = "";

    /* renamed from: f */
    private String f84557f = "https://aweme.snssdk.com/falcon/douyin_falcon/douyinCard/enter/?hide_nav_bar=1";

    private C32472b() {
    }

    /* renamed from: a */
    public static C32472b m75185a() {
        if (f84552g == null) {
            synchronized (C32472b.class) {
                if (f84552g == null) {
                    f84552g = new C32472b();
                }
            }
        }
        return f84552g;
    }

    /* renamed from: b */
    public static void m75186b() {
        C32497f a = C32497f.m75248a();
        C32497f.f84596a = true;
        C0013i.m16a((Callable<TResult>) new Callable<Boolean>() {
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
                if (r0.size() == 1) goto L_0x0167;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
                if (r0.size() == 1) goto L_0x0167;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                /*
                    r14 = this;
                    com.ss.android.ugc.aweme.freeflowcard.strategy.f r0 = com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32497f.this
                    long[] r0 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75181a()
                    com.ss.android.ugc.aweme.freeflowcard.data.a r1 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r2 = 0
                    r3 = r0[r2]
                    r5 = 1
                    r6 = r0[r5]
                    java.util.List r0 = r1.mo65789a(r3, r6)
                    if (r0 == 0) goto L_0x0166
                    int r1 = r0.size()
                    r3 = 20
                    if (r1 >= r3) goto L_0x0020
                    goto L_0x0166
                L_0x0020:
                    java.util.Iterator r1 = r0.iterator()
                    r3 = 0
                L_0x0025:
                    boolean r4 = r1.hasNext()
                    if (r4 == 0) goto L_0x0038
                    java.lang.Object r4 = r1.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r4 = (com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a) r4
                    int r4 = r4.mode
                    if (r4 != r5) goto L_0x0025
                    int r3 = r3 + 1
                    goto L_0x0025
                L_0x0038:
                    float r1 = (float) r3
                    r3 = 1065353216(0x3f800000, float:1.0)
                    float r1 = r1 * r3
                    int r0 = r0.size()
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    r0 = 1031127695(0x3d75c28f, float:0.06)
                    r4 = 25
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x00c7
                    r0 = 2
                    long[] r1 = new long[r0]
                    java.util.Calendar r6 = java.util.Calendar.getInstance()
                    java.util.Date r7 = new java.util.Date
                    r7.<init>()
                    r6.setTime(r7)
                    r7 = 5
                    r6.set(r7, r5)
                    r8 = 11
                    r6.set(r8, r2)
                    r9 = 12
                    r6.set(r9, r2)
                    r10 = 13
                    r6.set(r10, r2)
                    long r11 = r6.getTimeInMillis()
                    r1[r2] = r11
                    java.util.Date r11 = new java.util.Date
                    r11.<init>()
                    r6.setTime(r11)
                    r6.add(r0, r5)
                    r6.set(r7, r5)
                    r6.set(r8, r2)
                    r6.set(r9, r2)
                    r6.set(r10, r2)
                    r0 = -1
                    r6.add(r10, r0)
                    long r6 = r6.getTimeInMillis()
                    r1[r5] = r6
                    com.ss.android.ugc.aweme.freeflowcard.data.a r8 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r9 = r1[r2]
                    r11 = r1[r5]
                    r13 = 0
                    java.util.List r0 = r8.mo65790a(r9, r11, r13)
                    if (r0 == 0) goto L_0x00ac
                    int r0 = r0.size()
                    if (r0 != r5) goto L_0x00ac
                    goto L_0x0167
                L_0x00ac:
                    long[] r0 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75182a(r4)
                    com.ss.android.ugc.aweme.freeflowcard.data.a r6 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r7 = r0[r2]
                    r9 = r0[r5]
                    r11 = 0
                    java.util.List r0 = r6.mo65790a(r7, r9, r11)
                    if (r0 == 0) goto L_0x00c7
                    int r0 = r0.size()
                    if (r0 != r5) goto L_0x00c7
                    goto L_0x0167
                L_0x00c7:
                    com.ss.android.ugc.aweme.freeflowcard.data.a r0 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r1 = 7
                    long[] r6 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75183a(r5, r1)
                    r7 = r6[r2]
                    long[] r1 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75183a(r5, r1)
                    r9 = r1[r5]
                    java.util.List r0 = r0.mo65789a(r7, r9)
                    com.ss.android.ugc.aweme.freeflowcard.data.a r1 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r6 = 19
                    long[] r7 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75183a(r6, r4)
                    r8 = r7[r2]
                    long[] r6 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75183a(r6, r4)
                    r10 = r6[r5]
                    java.util.List r1 = r1.mo65789a(r8, r10)
                    if (r0 == 0) goto L_0x0166
                    int r6 = r0.size()
                    if (r6 <= 0) goto L_0x0166
                    if (r1 == 0) goto L_0x0166
                    int r6 = r1.size()
                    if (r6 <= 0) goto L_0x0166
                    java.util.Iterator r6 = r0.iterator()
                    r7 = 0
                L_0x0107:
                    boolean r8 = r6.hasNext()
                    if (r8 == 0) goto L_0x011a
                    java.lang.Object r8 = r6.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r8 = (com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a) r8
                    int r8 = r8.mode
                    if (r8 != r5) goto L_0x0107
                    int r7 = r7 + 1
                    goto L_0x0107
                L_0x011a:
                    java.util.Iterator r6 = r1.iterator()
                    r8 = 0
                L_0x011f:
                    boolean r9 = r6.hasNext()
                    if (r9 == 0) goto L_0x0132
                    java.lang.Object r9 = r6.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r9 = (com.p683ss.android.ugc.aweme.freeflowcard.data.p1786b.C32488a) r9
                    int r9 = r9.mode
                    if (r9 != r5) goto L_0x011f
                    int r8 = r8 + 1
                    goto L_0x011f
                L_0x0132:
                    float r6 = (float) r7
                    float r6 = r6 * r3
                    int r0 = r0.size()
                    float r0 = (float) r0
                    float r6 = r6 / r0
                    float r0 = (float) r8
                    float r0 = r0 * r3
                    int r1 = r1.size()
                    float r1 = (float) r1
                    float r0 = r0 / r1
                    float r6 = r6 - r0
                    r0 = 1045220557(0x3e4ccccd, float:0.2)
                    int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0166
                    long[] r0 = com.p683ss.android.ugc.aweme.freeflowcard.C32470a.m75182a(r4)
                    com.ss.android.ugc.aweme.freeflowcard.data.a r6 = com.p683ss.android.ugc.aweme.freeflowcard.data.C32474a.m75189a()
                    r7 = r0[r2]
                    r9 = r0[r5]
                    r11 = 0
                    java.util.List r0 = r6.mo65790a(r7, r9, r11)
                    if (r0 == 0) goto L_0x0166
                    int r0 = r0.size()
                    if (r0 != r5) goto L_0x0166
                    goto L_0x0167
                L_0x0166:
                    r2 = 1
                L_0x0167:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32497f.C324992.call():java.lang.Object");
            }
        }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Void>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                C32497f.f84596a = ((Boolean) iVar.mo34e()).booleanValue();
                return null;
            }
        });
    }
}

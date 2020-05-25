package com.p683ss.android.ugc.effectmanager;

import android.content.Context;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2436c.C48631g;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48642c;
import com.p683ss.android.ugc.effectmanager.common.p2439f.C48644a;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48718a;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.effectmanager.g */
public final class C48890g {

    /* renamed from: A */
    public C48903k f122948A;

    /* renamed from: B */
    public C48693a f122949B;

    /* renamed from: C */
    public Context f122950C;

    /* renamed from: D */
    public List<Host> f122951D;

    /* renamed from: E */
    public C48718a f122952E;

    /* renamed from: F */
    public C48631g f122953F;

    /* renamed from: G */
    public boolean f122954G;

    /* renamed from: a */
    public String f122955a;

    /* renamed from: b */
    public String f122956b;

    /* renamed from: c */
    public String f122957c;

    /* renamed from: d */
    public String f122958d;

    /* renamed from: e */
    public String f122959e;

    /* renamed from: f */
    public String f122960f;

    /* renamed from: g */
    public String f122961g;

    /* renamed from: h */
    public String f122962h;

    /* renamed from: i */
    public String f122963i;

    /* renamed from: j */
    public File f122964j;

    /* renamed from: k */
    public String f122965k;

    /* renamed from: l */
    public String f122966l;

    /* renamed from: m */
    public String f122967m;

    /* renamed from: n */
    public String f122968n;

    /* renamed from: o */
    public String f122969o;

    /* renamed from: p */
    public String f122970p;

    /* renamed from: q */
    public C48681i f122971q;

    /* renamed from: r */
    public C48620c f122972r;

    /* renamed from: s */
    public int f122973s;

    /* renamed from: t */
    public ArrayList<String> f122974t;

    /* renamed from: u */
    public int f122975u;

    /* renamed from: v */
    public C48641b f122976v;

    /* renamed from: w */
    public C48644a f122977w;

    /* renamed from: x */
    public C48642c f122978x;

    /* renamed from: y */
    public ExecutorService f122979y;

    /* renamed from: z */
    public String f122980z;

    /* renamed from: com.ss.android.ugc.effectmanager.g$a */
    public static final class C48892a {

        /* renamed from: A */
        public List<Host> f122981A;

        /* renamed from: B */
        public boolean f122982B;

        /* renamed from: C */
        public C48631g f122983C;

        /* renamed from: a */
        public String f122984a;

        /* renamed from: b */
        public String f122985b;

        /* renamed from: c */
        public String f122986c;

        /* renamed from: d */
        public String f122987d;

        /* renamed from: e */
        public String f122988e;

        /* renamed from: f */
        public String f122989f;

        /* renamed from: g */
        public String f122990g;

        /* renamed from: h */
        public String f122991h;

        /* renamed from: i */
        public File f122992i;

        /* renamed from: j */
        public String f122993j;

        /* renamed from: k */
        public String f122994k;

        /* renamed from: l */
        public C48640a f122995l;

        /* renamed from: m */
        public C48641b f122996m;

        /* renamed from: n */
        public C48620c f122997n;

        /* renamed from: o */
        public int f122998o = 3;

        /* renamed from: p */
        public String f122999p;

        /* renamed from: q */
        public C48693a f123000q;

        /* renamed from: r */
        public C48642c f123001r;

        /* renamed from: s */
        public ExecutorService f123002s;

        /* renamed from: t */
        public String f123003t;

        /* renamed from: u */
        public String f123004u;

        /* renamed from: v */
        public String f123005v;

        /* renamed from: w */
        public String f123006w;

        /* renamed from: x */
        public ArrayList<String> f123007x;

        /* renamed from: y */
        public int f123008y;

        /* renamed from: z */
        public Context f123009z;

        /* renamed from: a */
        public final C48890g mo96662a() {
            return new C48890g(this);
        }

        /* renamed from: a */
        public final C48892a mo96661a(C48693a aVar) {
            this.f123000q = aVar;
            return this;
        }
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [com.ss.android.ugc.effectmanager.effect.a.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C48890g(com.p683ss.android.ugc.effectmanager.C48890g.C48892a r9) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = "online"
            r8.f122960f = r0
            r0 = 3
            r8.f122973s = r0
            java.lang.String r0 = "/effect/api"
            r8.f122955a = r0
            java.lang.String r0 = r9.f122984a
            r8.f122956b = r0
            java.lang.String r0 = r9.f122985b
            r8.f122957c = r0
            java.lang.String r0 = r9.f122986c
            r8.f122958d = r0
            java.lang.String r0 = r9.f122987d
            r8.f122959e = r0
            java.lang.String r0 = "test"
            java.lang.String r1 = r9.f122988e
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "local_test"
            java.lang.String r1 = r9.f122988e
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            java.lang.String r0 = "online"
            goto L_0x0038
        L_0x0036:
            java.lang.String r0 = "test"
        L_0x0038:
            r8.f122960f = r0
            java.lang.String r0 = r9.f122989f
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "android"
            goto L_0x0043
        L_0x0041:
            java.lang.String r0 = r9.f122989f
        L_0x0043:
            r8.f122961g = r0
            java.lang.String r0 = r9.f122990g
            r8.f122962h = r0
            android.content.Context r0 = r9.f123009z
            r8.f122950C = r0
            java.io.File r0 = r9.f122992i
            if (r0 != 0) goto L_0x0065
            android.content.Context r0 = r8.f122950C
            if (r0 == 0) goto L_0x0065
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r8.f122950C
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "effect"
            r0.<init>(r1, r2)
            r8.f122964j = r0
            goto L_0x0069
        L_0x0065:
            java.io.File r0 = r9.f122992i
            r8.f122964j = r0
        L_0x0069:
            java.io.File r0 = r9.f122992i
            r8.f122964j = r0
            com.ss.android.ugc.effectmanager.common.f.a r0 = new com.ss.android.ugc.effectmanager.common.f.a
            com.ss.android.ugc.effectmanager.common.e.a r1 = r9.f122995l
            android.content.Context r2 = r9.f123009z
            r0.<init>(r1, r2)
            r8.f122977w = r0
            java.lang.String r0 = r9.f122993j
            r8.f122965k = r0
            com.ss.android.ugc.effectmanager.common.b.c r0 = r9.f122997n
            r8.f122972r = r0
            int r0 = r9.f122998o
            r8.f122973s = r0
            com.ss.android.ugc.effectmanager.common.e.b r0 = r9.f122996m
            r8.f122976v = r0
            java.lang.String r0 = r9.f122994k
            if (r0 != 0) goto L_0x008f
            java.lang.String r0 = "0"
            goto L_0x0091
        L_0x008f:
            java.lang.String r0 = r9.f122994k
        L_0x0091:
            r8.f122966l = r0
            java.lang.String r0 = r9.f122999p
            r8.f122967m = r0
            java.lang.String r0 = r9.f123004u
            r8.f122968n = r0
            java.lang.String r0 = r9.f123005v
            r8.f122969o = r0
            java.lang.String r0 = r9.f123006w
            r8.f122970p = r0
            com.ss.android.ugc.effectmanager.common.e.c r0 = r9.f123001r
            r8.f122978x = r0
            java.util.concurrent.ExecutorService r0 = r9.f123002s
            r8.f122979y = r0
            com.ss.android.ugc.effectmanager.common.c.g r0 = r9.f122983C
            r8.f122953F = r0
            boolean r0 = r9.f122982B
            r8.f122954G = r0
            com.ss.android.ugc.effectmanager.effect.a.a r0 = r9.f123000q
            if (r0 != 0) goto L_0x00ca
            com.ss.android.ugc.effectmanager.effect.e.b.a r0 = new com.ss.android.ugc.effectmanager.effect.e.b.a
            com.ss.android.ugc.effectmanager.common.f.a r2 = r8.f122977w
            com.ss.android.ugc.effectmanager.common.c.g r3 = r8.f122953F
            com.ss.android.ugc.effectmanager.common.e.c r4 = r8.f122978x
            java.lang.String r5 = r8.f122966l
            java.lang.String r6 = r8.f122956b
            boolean r7 = r8.f122954G
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x00cc
        L_0x00ca:
            com.ss.android.ugc.effectmanager.effect.a.a r0 = r9.f123000q
        L_0x00cc:
            r8.f122949B = r0
            java.lang.String r0 = r9.f123003t
            r8.f122980z = r0
            com.ss.android.ugc.effectmanager.k r0 = new com.ss.android.ugc.effectmanager.k
            r0.<init>()
            r8.f122948A = r0
            com.ss.android.ugc.effectmanager.effect.d.a.a r0 = new com.ss.android.ugc.effectmanager.effect.d.a.a
            r0.<init>()
            r8.f122952E = r0
            java.util.ArrayList<java.lang.String> r0 = r9.f123007x
            r8.f122974t = r0
            java.lang.String r0 = r9.f122991h
            r8.f122963i = r0
            int r0 = r9.f123008y
            r8.f122975u = r0
            java.util.List<com.ss.android.ugc.effectmanager.link.model.host.Host> r9 = r9.f122981A
            r8.f122951D = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.C48890g.<init>(com.ss.android.ugc.effectmanager.g$a):void");
    }
}

package com.p683ss.android.ugc.p1235a;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.a.a */
public final class C20302a {

    /* renamed from: a */
    public Class f55792a;

    /* renamed from: b */
    private String f55793b;

    /* renamed from: c */
    private Class f55794c;

    /* renamed from: d */
    private Object[] f55795d;

    /* renamed from: e */
    private Class f55796e;

    /* renamed from: f */
    private C20309c f55797f;

    /* renamed from: g */
    private C20313f f55798g;

    /* renamed from: h */
    private C20310d f55799h;

    /* renamed from: i */
    private int f55800i = 1001;

    /* renamed from: j */
    private C20312e<Class> f55801j;

    /* renamed from: b */
    public final <T> T mo42948b() {
        return m50071c();
    }

    /* renamed from: a */
    public final C20302a mo42946a() {
        this.f55800i = BaseNotice.CHECK_PROFILE;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m50071c() {
        /*
            r5 = this;
            com.ss.android.ugc.a.c r0 = r5.f55797f
            r1 = 0
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r5.f55793b
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.a.c r0 = r5.f55797f
            java.lang.String r0 = r5.f55793b
            java.lang.Object[] r2 = r5.f55795d
            com.p683ss.android.ugc.p1235a.C20309c.m50083a()
            com.ss.android.ugc.a.g r3 = com.p683ss.android.ugc.p1235a.C20309c.f55807b
            if (r3 == 0) goto L_0x003d
            com.ss.android.ugc.a.g r3 = com.p683ss.android.ugc.p1235a.C20309c.f55807b
            com.ss.android.ugc.a.g r3 = r3.mo42952a(r0)
            java.lang.Object r0 = r3.mo42949a(r0, r2)
            goto L_0x003e
        L_0x0021:
            java.lang.Class r0 = r5.f55794c
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.a.c r0 = r5.f55797f
            java.lang.Class r0 = r5.f55794c
            java.lang.Object[] r2 = r5.f55795d
            com.p683ss.android.ugc.p1235a.C20309c.m50083a()
            com.ss.android.ugc.a.g r3 = com.p683ss.android.ugc.p1235a.C20309c.f55807b
            if (r3 == 0) goto L_0x003d
            com.ss.android.ugc.a.g r3 = com.p683ss.android.ugc.p1235a.C20309c.f55807b
            com.ss.android.ugc.a.g r3 = r3.mo42951a(r0)
            java.util.List r0 = r3.mo42950a(r0, r2)
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            if (r0 != 0) goto L_0x004a
            com.ss.android.ugc.a.f r2 = r5.f55798g
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = r5.f55793b
            java.lang.Object r0 = com.p683ss.android.ugc.p1235a.C20313f.m50085a(r0)
        L_0x004a:
            if (r0 != 0) goto L_0x005a
            com.ss.android.ugc.a.d r2 = r5.f55799h
            if (r2 == 0) goto L_0x005a
            com.ss.android.ugc.a.d r0 = r5.f55799h
            java.lang.Class r2 = r5.f55796e
            java.lang.Class r3 = r5.f55792a
            java.lang.Object r0 = r0.get(r2, r3)
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x00b9
        L_0x005d:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r2 == 0) goto L_0x00ab
            int r2 = r5.f55800i
            r4 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r4) goto L_0x0078
            java.util.List r0 = (java.util.List) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0072
            goto L_0x00b9
        L_0x0072:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            goto L_0x00b9
        L_0x0078:
            int r1 = r5.f55800i
            if (r1 != r3) goto L_0x00b8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.ss.android.ugc.a.e<java.lang.Class> r2 = r5.f55801j
            if (r2 == 0) goto L_0x00a5
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x008b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.a.e<java.lang.Class> r3 = r5.f55801j
            java.lang.Class r4 = r2.getClass()
            boolean r3 = r3.mo42955a(r4)
            if (r3 == 0) goto L_0x008b
            r1.add(r2)
            goto L_0x008b
        L_0x00a5:
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            goto L_0x00b9
        L_0x00ab:
            int r1 = r5.f55800i
            if (r1 != r3) goto L_0x00b8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            goto L_0x00b9
        L_0x00b8:
            r1 = r0
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p1235a.C20302a.m50071c():java.lang.Object");
    }

    /* renamed from: a */
    public static C20302a m50070a(Class cls) {
        return new C20302a(cls, cls);
    }

    /* renamed from: a */
    public final C20302a mo42947a(C20310d dVar) {
        dVar.getClass();
        this.f55799h = dVar;
        return this;
    }

    public C20302a(Class cls, Class cls2) {
        cls.getClass();
        this.f55794c = cls;
        this.f55796e = cls2;
        C203031 r1 = new C20309c() {
        };
        r1.getClass();
        this.f55797f = r1;
        mo42947a((C20310d) new C20310d() {
        });
    }
}

package com.p683ss.android.agilelogger;

import android.os.Looper;
import com.p683ss.android.agilelogger.C18778a.C18781c;
import com.p683ss.android.agilelogger.p1136f.C18817a.C18818a;

/* renamed from: com.ss.android.agilelogger.f */
public final class C18816f {

    /* renamed from: o */
    private static C18816f f51980o;

    /* renamed from: p */
    private static C18816f f51981p;

    /* renamed from: q */
    private static int f51982q;

    /* renamed from: r */
    private static int f51983r;

    /* renamed from: s */
    private static final Object f51984s = new Object();

    /* renamed from: a */
    public int f51985a = -1;

    /* renamed from: b */
    public int f51986b;

    /* renamed from: c */
    public String f51987c;

    /* renamed from: d */
    public String f51988d;

    /* renamed from: e */
    public long f51989e;

    /* renamed from: f */
    public boolean f51990f;

    /* renamed from: g */
    public C18818a f51991g;

    /* renamed from: h */
    public Object f51992h;

    /* renamed from: i */
    public Object f51993i;

    /* renamed from: j */
    public String f51994j;

    /* renamed from: k */
    public String f51995k;

    /* renamed from: l */
    public String f51996l;

    /* renamed from: m */
    public C18781c f51997m;

    /* renamed from: n */
    private C18816f f51998n;

    /* renamed from: a */
    public static C18816f m45895a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (f51984s) {
                if (f51980o != null) {
                    C18816f fVar = f51980o;
                    f51980o = fVar.f51998n;
                    fVar.f51998n = null;
                    f51982q--;
                    return fVar;
                }
            }
        } else if (f51981p != null) {
            C18816f fVar2 = f51981p;
            f51981p = fVar2.f51998n;
            fVar2.f51998n = null;
            f51983r--;
            return fVar2;
        }
        return new C18816f();
    }

    /* renamed from: b */
    public final void mo38409b() {
        this.f51986b = 0;
        this.f51987c = "";
        this.f51988d = "";
        this.f51991g = C18818a.MSG;
        this.f51989e = -1;
        this.f51990f = false;
        this.f51992h = null;
        this.f51993i = null;
        this.f51997m = null;
        this.f51994j = "";
        this.f51995k = "";
        this.f51996l = "";
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (f51984s) {
                if (f51982q < 60) {
                    this.f51998n = f51980o;
                    f51980o = this;
                    f51982q++;
                }
            }
        } else if (f51983r < 60) {
            this.f51998n = f51981p;
            f51981p = this;
            f51983r++;
        }
    }

    /* renamed from: a */
    public static C18816f m45896a(int i, String str, String str2, long j, boolean z) {
        C18816f a = m45895a();
        a.f51986b = i;
        a.f51987c = str;
        a.f51988d = str2;
        a.f51989e = j;
        a.f51990f = z;
        return a;
    }
}

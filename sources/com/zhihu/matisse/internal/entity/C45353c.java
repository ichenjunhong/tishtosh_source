package com.zhihu.matisse.internal.entity;

import com.zhihu.matisse.C45333b;
import com.zhihu.matisse.p2249a.C45332a;
import com.zhihu.matisse.p2250b.C45334a;
import com.zhihu.matisse.p2250b.C45336c;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.entity.c */
public final class C45353c {

    /* renamed from: a */
    public Set<C45333b> f114664a = null;

    /* renamed from: b */
    public boolean f114665b = true;

    /* renamed from: c */
    public boolean f114666c = false;

    /* renamed from: d */
    public int f114667d;

    /* renamed from: e */
    public int f114668e;

    /* renamed from: f */
    public boolean f114669f;

    /* renamed from: g */
    public int f114670g;

    /* renamed from: h */
    public int f114671h;

    /* renamed from: i */
    public int f114672i;

    /* renamed from: j */
    public List<C45332a> f114673j;

    /* renamed from: k */
    public boolean f114674k;

    /* renamed from: l */
    public C45351a f114675l;

    /* renamed from: m */
    public int f114676m;

    /* renamed from: n */
    public int f114677n;

    /* renamed from: o */
    public float f114678o;

    /* renamed from: p */
    public boolean f114679p;

    /* renamed from: q */
    public C45336c f114680q;

    /* renamed from: r */
    public boolean f114681r;

    /* renamed from: s */
    public boolean f114682s;

    /* renamed from: t */
    public int f114683t;

    /* renamed from: u */
    public C45334a f114684u;

    /* renamed from: com.zhihu.matisse.internal.entity.c$a */
    static final class C45355a {

        /* renamed from: a */
        public static final C45353c f114685a = new C45353c();
    }

    private C45353c() {
    }

    /* renamed from: a */
    public static C45353c m98893a() {
        return C45355a.f114685a;
    }

    /* renamed from: c */
    public final boolean mo91673c() {
        if (this.f114668e != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo91672b() {
        if (this.f114669f || (this.f114670g != 1 && (this.f114671h != 1 || this.f114672i != 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo91674d() {
        if (!this.f114666c || !C45333b.ofImage().containsAll(this.f114664a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo91675e() {
        if (!this.f114666c || !C45333b.ofVideo().containsAll(this.f114664a)) {
            return false;
        }
        return true;
    }
}

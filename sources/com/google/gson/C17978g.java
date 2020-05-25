package com.google.gson;

import com.google.gson.internal.C17982a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.C18012j;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.p1077b.C17956a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.g */
public final class C17978g {

    /* renamed from: a */
    public Excluder f49902a = Excluder.f49919a;

    /* renamed from: b */
    public boolean f49903b = false;

    /* renamed from: c */
    public boolean f49904c = false;

    /* renamed from: d */
    private C18092v f49905d = C18092v.DEFAULT;

    /* renamed from: e */
    private C17970e f49906e = C17963d.IDENTITY;

    /* renamed from: f */
    private final Map<Type, C17979h<?>> f49907f = new HashMap();

    /* renamed from: g */
    private final List<C18097x> f49908g = new ArrayList();

    /* renamed from: h */
    private final List<C18097x> f49909h = new ArrayList();

    /* renamed from: i */
    private boolean f49910i = false;

    /* renamed from: j */
    private String f49911j;

    /* renamed from: k */
    private int f49912k = 2;

    /* renamed from: l */
    private int f49913l = 2;

    /* renamed from: m */
    private boolean f49914m = false;

    /* renamed from: n */
    private boolean f49915n = true;

    /* renamed from: o */
    private boolean f49916o = false;

    /* renamed from: p */
    private boolean f49917p = false;

    /* renamed from: a */
    public final C17978g mo34892a() {
        this.f49910i = true;
        return this;
    }

    /* renamed from: b */
    public final C17978g mo34898b() {
        this.f49916o = true;
        return this;
    }

    /* renamed from: c */
    public final C17978g mo34899c() {
        this.f49915n = false;
        return this;
    }

    /* renamed from: d */
    public final C17971f mo34900d() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f49908g.size() + this.f49909h.size() + 3);
        arrayList2.addAll(this.f49908g);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f49909h);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m44100a(this.f49911j, this.f49912k, this.f49913l, arrayList2);
        C17971f fVar = new C17971f(this.f49902a, this.f49906e, this.f49907f, this.f49910i, this.f49903b, this.f49917p, this.f49915n, this.f49916o, this.f49904c, this.f49914m, this.f49905d, this.f49911j, this.f49912k, this.f49913l, this.f49908g, this.f49909h, arrayList);
        return fVar;
    }

    /* renamed from: a */
    public final C17978g mo34893a(C17963d dVar) {
        this.f49906e = dVar;
        return this;
    }

    /* renamed from: a */
    public final C17978g mo34894a(C18097x xVar) {
        this.f49908g.add(xVar);
        return this;
    }

    /* renamed from: a */
    public final C17978g mo34897a(C17955b... bVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.f49902a = this.f49902a.mo34915a(bVarArr[0], true, true);
        }
        return this;
    }

    /* renamed from: a */
    public final C17978g mo34895a(Class<?> cls, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C18090t;
        if (z2 || (obj instanceof C18081k) || (obj instanceof C18095w)) {
            z = true;
        } else {
            z = false;
        }
        C17982a.m44134a(z);
        if ((obj instanceof C18081k) || z2) {
            this.f49909h.add(TreeTypeAdapter.m44165a(cls, obj));
        }
        if (obj instanceof C18095w) {
            this.f49908g.add(C18012j.m44216b(cls, (C18095w) obj));
        }
        return this;
    }

    /* renamed from: a */
    public final C17978g mo34896a(Type type, Object obj) {
        boolean z;
        boolean z2 = obj instanceof C18090t;
        if (z2 || (obj instanceof C18081k) || (obj instanceof C17979h) || (obj instanceof C18095w)) {
            z = true;
        } else {
            z = false;
        }
        C17982a.m44134a(z);
        if (obj instanceof C17979h) {
            this.f49907f.put(type, (C17979h) obj);
        }
        if (z2 || (obj instanceof C18081k)) {
            this.f49908g.add(TreeTypeAdapter.m44164a(C17956a.m44007a(type), obj));
        }
        if (obj instanceof C18095w) {
            this.f49908g.add(C18012j.m44213a(C17956a.m44007a(type), (C18095w) obj));
        }
        return this;
    }

    /* renamed from: a */
    private static void m44100a(String str, int i, int i2, List<C18097x> list) {
        C17949a aVar;
        C17949a aVar2;
        C17949a aVar3;
        if (str != null && !"".equals(str.trim())) {
            C17949a aVar4 = new C17949a(Date.class, str);
            aVar = new C17949a(Timestamp.class, str);
            aVar3 = new C17949a(java.sql.Date.class, str);
            aVar2 = aVar4;
        } else if (i != 2 && i2 != 2) {
            aVar2 = new C17949a(Date.class, i, i2);
            C17949a aVar5 = new C17949a(Timestamp.class, i, i2);
            C17949a aVar6 = new C17949a(java.sql.Date.class, i, i2);
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(C18012j.m44214a(Date.class, (C18095w<TT>) aVar2));
        list.add(C18012j.m44214a(Timestamp.class, (C18095w<TT>) aVar));
        list.add(C18012j.m44214a(java.sql.Date.class, (C18095w<TT>) aVar3));
    }
}

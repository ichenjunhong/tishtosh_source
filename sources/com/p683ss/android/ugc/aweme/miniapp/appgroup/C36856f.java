package com.p683ss.android.ugc.aweme.miniapp.appgroup;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.f */
public final class C36856f {

    /* renamed from: d */
    public static final int f94194d;

    /* renamed from: e */
    public static final int f94195e;

    /* renamed from: f */
    public static final int f94196f;

    /* renamed from: g */
    public static final int f94197g;

    /* renamed from: h */
    public static final int f94198h;

    /* renamed from: i */
    public static final C36857a f94199i = new C36857a(null);

    /* renamed from: j */
    private static int f94200j;

    /* renamed from: a */
    public final int f94201a;

    /* renamed from: b */
    public final C36966e f94202b;

    /* renamed from: c */
    public final String f94203c;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.f$a */
    public static final class C36857a {
        private C36857a() {
        }

        /* renamed from: a */
        public static int m82922a() {
            return C36856f.f94194d;
        }

        /* renamed from: b */
        public static int m82923b() {
            return C36856f.f94195e;
        }

        /* renamed from: c */
        public static int m82924c() {
            return C36856f.f94196f;
        }

        /* renamed from: d */
        public static int m82925d() {
            return C36856f.f94197g;
        }

        /* renamed from: e */
        public static int m82926e() {
            return C36856f.f94198h;
        }

        public /* synthetic */ C36857a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final ArrayList<C36856f> mo76056a(List<? extends C36966e> list) {
            if (C9376b.m18558a((Collection<T>) list)) {
                return new ArrayList<>();
            }
            if (list == null) {
                C52711k.m112234a();
            }
            ArrayList<C36856f> arrayList = new ArrayList<>(list.size());
            for (C36966e fVar : list) {
                C36856f fVar2 = new C36856f(m82924c(), fVar, null, 4, null);
                arrayList.add(fVar2);
            }
            return arrayList;
        }
    }

    static {
        int i = f94200j + 1;
        f94200j = i;
        f94194d = i;
        int i2 = f94200j + 1;
        f94200j = i2;
        f94195e = i2;
        int i3 = f94200j + 1;
        f94200j = i3;
        f94196f = i3;
        int i4 = f94200j + 1;
        f94200j = i4;
        f94197g = i4;
        int i5 = f94200j + 1;
        f94200j = i5;
        f94198h = i5;
    }

    private C36856f(int i, C36966e eVar, String str) {
        this.f94201a = i;
        this.f94202b = eVar;
        this.f94203c = str;
    }

    public /* synthetic */ C36856f(int i, C36966e eVar, String str, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            eVar = null;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        this(i, eVar, str);
    }
}

package com.bytedance.scene;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.navigation.C12960f;
import com.bytedance.scene.p841c.C12875h;
import com.bytedance.scene.p841c.C12879k;
import com.bytedance.scene.p841c.C12880l;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.scene.h */
public final class C12921h {

    /* renamed from: a */
    private static final WeakHashMap<Activity, HashSet<String>> f33822a = new WeakHashMap<>();

    /* renamed from: com.bytedance.scene.h$a */
    public static final class C12923a {

        /* renamed from: a */
        private final Activity f33823a;

        /* renamed from: b */
        private final Class<? extends C12924i> f33824b;

        /* renamed from: c */
        private Bundle f33825c;

        /* renamed from: d */
        private boolean f33826d;

        /* renamed from: e */
        private boolean f33827e;

        /* renamed from: f */
        private int f33828f;

        /* renamed from: g */
        private int f33829g;

        /* renamed from: h */
        private boolean f33830h;

        /* renamed from: i */
        private C12930k f33831i;

        /* renamed from: j */
        private String f33832j;

        /* renamed from: k */
        private boolean f33833k;

        /* renamed from: a */
        public final C12935m mo24453a() {
            C12960f fVar = new C12960f(this.f33824b, this.f33825c);
            fVar.f33944c = this.f33826d;
            fVar.f33945d = this.f33827e;
            fVar.f33946e = this.f33828f;
            return C12921h.m25904a(this.f33823a, this.f33829g, fVar, this.f33831i, this.f33830h, this.f33832j, this.f33833k);
        }

        /* renamed from: a */
        public final C12923a mo24450a(int i) {
            this.f33829g = i;
            return this;
        }

        /* renamed from: b */
        public final C12923a mo24454b(boolean z) {
            this.f33826d = false;
            return this;
        }

        /* renamed from: c */
        public final C12923a mo24455c(boolean z) {
            this.f33827e = false;
            return this;
        }

        /* renamed from: d */
        public final C12923a mo24456d(boolean z) {
            this.f33833k = false;
            return this;
        }

        /* renamed from: a */
        public final C12923a mo24451a(C12930k kVar) {
            this.f33831i = kVar;
            return this;
        }

        /* renamed from: a */
        public final C12923a mo24452a(boolean z) {
            this.f33830h = z;
            return this;
        }

        private C12923a(Activity activity, Class<? extends C12924i> cls) {
            this.f33826d = true;
            this.f33827e = true;
            this.f33829g = 16908290;
            this.f33832j = "LifeCycleFragment";
            this.f33833k = true;
            this.f33823a = (Activity) C12880l.m25801a(activity, "Activity can't be null");
            this.f33824b = (Class) C12880l.m25801a(cls, "Root Scene class can't be null");
        }
    }

    /* renamed from: a */
    public static C12923a m25903a(Activity activity, Class<? extends C12924i> cls) {
        return new C12923a(activity, cls);
    }

    /* renamed from: b */
    static void m25907b(Activity activity, String str) {
        ((HashSet) f33822a.get(activity)).remove(str);
    }

    /* renamed from: a */
    public static void m25906a(Activity activity, String str) {
        if (f33822a.get(activity) == null || !((HashSet) f33822a.get(activity)).contains(str)) {
            HashSet hashSet = (HashSet) f33822a.get(activity);
            if (hashSet == null) {
                hashSet = new HashSet();
                f33822a.put(activity, hashSet);
            }
            hashSet.add(str);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Activity");
    }

    /* renamed from: a */
    public static C12935m m25905a(Activity activity, Bundle bundle, C12960f fVar, boolean z) {
        return m25904a(activity, 16908290, fVar, null, false, "LifeCycleFragment", true);
    }

    /* renamed from: a */
    public static C12935m m25904a(Activity activity, int i, C12960f fVar, C12930k kVar, boolean z, String str, boolean z2) {
        C12973u a;
        C12879k.m25799a();
        if (str != null) {
            m25906a(activity, str);
            C12942d dVar = (C12942d) C12875h.m25796a(C12942d.class, fVar.mo24555a());
            if (!C12880l.m25806a(activity)) {
                return new C12865c(dVar);
            }
            dVar.f33887i = kVar;
            FragmentManager fragmentManager = activity.getFragmentManager();
            C12890f fVar2 = (C12890f) fragmentManager.findFragmentByTag(str);
            if (fVar2 != null && !z) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(fVar2);
                C12880l.m25804a(fragmentManager, beginTransaction, z2);
                fVar2 = null;
            }
            C12890f fVar3 = fVar2;
            C12827a aVar = new C12827a(activity);
            if (fVar3 != null) {
                a = C12973u.m26089a(activity, str, false, z2);
                C12963o oVar = new C12963o(i, aVar, dVar, a, z);
                fVar3.f33732b = oVar;
            } else {
                fVar3 = C12890f.m25812a(z);
                FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.add(i, fVar3, str);
                a = C12973u.m26089a(activity, str, !z, z2);
                C12963o oVar2 = new C12963o(i, aVar, dVar, a, z);
                fVar3.f33732b = oVar2;
                C12880l.m25804a(fragmentManager, beginTransaction2, z2);
            }
            C12892g gVar = new C12892g(activity, dVar, fVar3, a, z2);
            return gVar;
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}

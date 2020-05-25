package com.airbnb.lottie;

import android.support.p030v4.p038f.C0779b;
import android.support.p030v4.p038f.C0794k;
import com.airbnb.lottie.p114f.C2452d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.m */
public final class C2479m {

    /* renamed from: a */
    public boolean f7672a;

    /* renamed from: b */
    private final Set<Object> f7673b = new C0779b();

    /* renamed from: c */
    private final Map<String, C2452d> f7674c = new HashMap();

    /* renamed from: d */
    private final Comparator<C0794k<String, Float>> f7675d = new Comparator<C0794k<String, Float>>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C0794k kVar = (C0794k) obj2;
            float floatValue = ((Float) ((C0794k) obj).f2712b).floatValue();
            float floatValue2 = ((Float) kVar.f2712b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    /* renamed from: a */
    public final void mo6878a(String str, float f) {
        if (this.f7672a) {
            C2452d dVar = (C2452d) this.f7674c.get(str);
            if (dVar == null) {
                dVar = new C2452d();
                this.f7674c.put(str, dVar);
            }
            dVar.f7561a += f;
            dVar.f7562b++;
            if (dVar.f7562b == Integer.MAX_VALUE) {
                dVar.f7561a /= 2.0f;
                dVar.f7562b /= 2;
            }
            if (str.equals("__container")) {
                Iterator it = this.f7673b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}

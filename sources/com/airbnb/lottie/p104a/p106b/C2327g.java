package com.airbnb.lottie.p104a.p106b;

import android.graphics.Path;
import com.airbnb.lottie.p108c.p110b.C2363g;
import com.airbnb.lottie.p108c.p110b.C2371l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
public final class C2327g {

    /* renamed from: a */
    public final List<C2320a<C2371l, Path>> f7257a;

    /* renamed from: b */
    public final List<C2320a<Integer, Integer>> f7258b;

    /* renamed from: c */
    public final List<C2363g> f7259c;

    public C2327g(List<C2363g> list) {
        this.f7259c = list;
        this.f7257a = new ArrayList(list.size());
        this.f7258b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f7257a.add(((C2363g) list.get(i)).f7355b.mo6735a());
            this.f7258b.add(((C2363g) list.get(i)).f7356c.mo6735a());
        }
    }
}

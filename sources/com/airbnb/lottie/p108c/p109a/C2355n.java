package com.airbnb.lottie.p108c.p109a;

import com.airbnb.lottie.p115g.C2468a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.a.n */
abstract class C2355n<V, O> implements C2354m<V, O> {

    /* renamed from: a */
    final List<C2468a<V>> f7314a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f7314a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f7314a.toArray()));
        }
        return sb.toString();
    }

    C2355n(List<C2468a<V>> list) {
        this.f7314a = list;
    }

    C2355n(V v) {
        this(Collections.singletonList(new C2468a(v)));
    }
}

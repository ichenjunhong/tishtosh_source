package com.bytedance.p782n;

import com.bytedance.p782n.C12383e.C12384a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.n.c */
public final class C12381c {
    /* renamed from: a */
    public static <IN> C12378b<IN> m24938a(List<C12388h> list, C12383e eVar) {
        return m24939a(list, null, null);
    }

    /* renamed from: a */
    static <IN> C12378b<IN> m24939a(List<C12388h> list, C12383e eVar, C12382d dVar) {
        if (list != null) {
            if (eVar == null) {
                eVar = new C12384a();
            }
            return new C12391i(Collections.unmodifiableList(new ArrayList(list)), 0, eVar, dVar);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}

package com.bytedance.p782n;

import com.bytedance.p782n.C12395l.C12396a;
import java.util.List;

/* renamed from: com.bytedance.n.a */
public abstract class C12376a<IN, OUT> extends C12395l<IN, OUT> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo18062a(C12378b<OUT> bVar, IN in);

    /* renamed from: a_ */
    public final Object mo18063a_(C12378b<OUT> bVar, IN in) throws Throwable {
        String a = mo18062a(new C12398m(bVar), in);
        C12396a aVar = (C12396a) this.f32638h.get(a);
        if (aVar != null) {
            List<C12388h> list = aVar.f32639a;
            Object a2 = C12381c.m24939a(list, ((C12391i) bVar).f32632a, this).mo23391a(in);
            if (!m24965a(list)) {
                return a2;
            }
            return bVar.mo23391a(a2);
        }
        StringBuilder sb = new StringBuilder("找不到对应分支，分支名：");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }
}

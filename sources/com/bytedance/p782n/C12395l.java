package com.bytedance.p782n;

import com.bytedance.p782n.C12388h.C12390a;
import com.bytedance.p782n.p784b.C12379a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.n.l */
public abstract class C12395l<IN, OUT> extends C12382d<IN, OUT> {

    /* renamed from: h */
    public Map<String, C12396a> f32638h;

    /* renamed from: com.bytedance.n.l$a */
    public static final class C12396a {

        /* renamed from: a */
        List<C12388h> f32639a = new ArrayList();

        /* renamed from: a */
        public final C12396a mo23403a(C12388h hVar) {
            this.f32639a.add(hVar);
            return this;
        }

        /* renamed from: a */
        public final C12396a mo23404a(List<C12388h> list) {
            this.f32639a.addAll(list);
            return this;
        }
    }

    /* renamed from: com.bytedance.n.l$b */
    public static final class C12397b {

        /* renamed from: a */
        private Map<String, C12396a> f32640a = new HashMap();

        /* renamed from: b */
        private C12379a f32641b;

        /* renamed from: a */
        public final C12388h mo23405a(Class<? extends C12395l> cls) {
            return C12390a.m24949a().mo23400a(cls).mo23401a(this.f32640a).mo23399a(this.f32641b).mo23402b();
        }

        /* renamed from: a */
        public final C12396a mo23406a(String str) {
            if (!this.f32640a.containsKey(str)) {
                C12396a aVar = new C12396a();
                this.f32640a.put(str, aVar);
                return aVar;
            }
            throw new IllegalArgumentException("分支名重复");
        }
    }

    C12395l() {
    }

    /* renamed from: a */
    static boolean m24965a(List<C12388h> list) {
        if (!list.isEmpty() && ((C12388h) list.get(list.size() - 1)).f32626a == C12385f.class) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        if (objArr == null || objArr.length != 1 || objArr[0] == null) {
            throw new IllegalStateException("参数错误");
        }
        try {
            this.f32638h = objArr[0];
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

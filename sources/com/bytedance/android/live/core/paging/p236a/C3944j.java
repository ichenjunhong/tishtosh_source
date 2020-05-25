package com.bytedance.android.live.core.paging.p236a;

import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3924b;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.paging.a.j */
public abstract class C3944j<T> extends C3930c<T> {

    /* renamed from: l */
    public Map<Integer, C3924b> f10979l;

    /* renamed from: m */
    public Object[] f10980m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9308a(int i, T t) {
        return -8888;
    }

    public C3944j(C1212c<T> cVar, Map<Integer, C3924b> map) {
        super(cVar);
        this.f10979l = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1352v mo9309a(ViewGroup viewGroup, int i) {
        C3924b bVar = (C3924b) this.f10979l.get(Integer.valueOf(i));
        if (bVar == null) {
            return new C3929b(viewGroup);
        }
        return bVar.mo9284a(viewGroup, this.f10980m);
    }
}

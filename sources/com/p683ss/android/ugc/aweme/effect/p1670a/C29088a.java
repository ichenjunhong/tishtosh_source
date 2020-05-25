package com.p683ss.android.ugc.aweme.effect.p1670a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.p683ss.android.ugc.aweme.effect.EffectModel;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.a.a */
public abstract class C29088a<VH extends C1352v> extends C1322a<VH> {

    /* renamed from: a */
    private List<Integer> f76251a = new ArrayList();

    /* renamed from: b */
    private final RecyclerView f76252b;

    /* renamed from: c */
    public List<EffectModel> f76253c = new ArrayList();

    /* renamed from: d */
    private final C29126a f76254d;

    /* renamed from: a */
    private final void m68540a() {
        this.f76251a.clear();
        for (EffectModel a : this.f76253c) {
            this.f76251a.add(Integer.valueOf(m68539a(a)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58933a(int i) {
        return ((Number) this.f76251a.get(i)).intValue();
    }

    /* renamed from: a */
    public final void mo58935a(List<? extends EffectModel> list) {
        if (list != null) {
            this.f76253c.clear();
            this.f76253c.addAll(list);
            m68540a();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private final int m68539a(EffectModel effectModel) {
        if (C50200d.m108346a(effectModel.resDir)) {
            return 3;
        }
        C29126a aVar = this.f76254d;
        if (aVar == null || !aVar.mo59000a(effectModel)) {
            C29126a aVar2 = this.f76254d;
            if (aVar2 == null || !aVar2.mo59002b(effectModel)) {
                return 0;
            }
        }
        return 2;
    }

    public C29088a(RecyclerView recyclerView, C29126a aVar) {
        this.f76252b = recyclerView;
        this.f76254d = aVar;
    }

    /* renamed from: a */
    public final void mo58934a(int i, int i2) {
        if (this.f76251a.size() > i && ((Number) this.f76251a.get(i)).intValue() != i2) {
            this.f76251a.set(i, Integer.valueOf(i2));
            notifyItemChanged(i);
        }
    }
}

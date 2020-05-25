package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.h */
public abstract class C27901h<T> extends C1352v {

    /* renamed from: a */
    protected TextView f73280a = ((TextView) this.itemView.findViewById(R.id.dhb));

    /* renamed from: b */
    protected View f73281b = this.itemView.findViewById(R.id.bgl);

    /* renamed from: c */
    protected TagFlowLayout f73282c = ((TagFlowLayout) this.itemView.findViewById(R.id.czi));

    /* renamed from: d */
    protected View f73283d = this.itemView.findViewById(R.id.bgs);

    /* renamed from: e */
    protected View f73284e = this.itemView.findViewById(R.id.dr2);

    /* renamed from: f */
    protected List<T> f73285f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo56311a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo56313b(List<T> list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo56314c(List<T> list);

    /* renamed from: a */
    public void mo56310a() {
        int visibleViewCount = this.f73282c.getVisibleViewCount();
        int i = 0;
        while (i < visibleViewCount && i < this.f73285f.size()) {
            mo56311a(this.f73285f.get(i), i);
            i++;
        }
    }

    public C27901h(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo56312a(List<T> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            C23729p.m58257a(this.itemView, 8);
        } else if (!mo56313b(list)) {
            mo56314c(list);
            this.f73282c.post(new C27902i(this));
        }
    }
}

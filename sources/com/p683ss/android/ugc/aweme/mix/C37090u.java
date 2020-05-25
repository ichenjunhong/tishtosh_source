package com.p683ss.android.ugc.aweme.mix;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.p051e.C1208c.C1212c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.u */
public final class C37090u extends C23466e<Aweme> {

    /* renamed from: c */
    Set<CommonLogicViewHolder> f94733c;

    /* renamed from: d */
    public Aweme f94734d;

    /* renamed from: e */
    public long f94735e;

    /* renamed from: f */
    public long f94736f;

    /* renamed from: g */
    public boolean f94737g;

    /* renamed from: h */
    public final C0184k f94738h;

    /* renamed from: i */
    public final C24579d f94739i;

    /* renamed from: j */
    public final C37022d f94740j;

    /* renamed from: k */
    public final C11850b f94741k;

    /* renamed from: e */
    public final int mo48643e() {
        if (!this.f94737g) {
            return 0;
        }
        return super.mo48643e();
    }

    /* renamed from: a */
    public final void mo76378a(boolean z) {
        this.f62535a.mo22700a(z);
    }

    /* renamed from: d */
    public final void mo76379d(boolean z) {
        this.f62535a.mo22700a(z);
    }

    /* renamed from: b_ */
    public final void mo48642b_(View view) {
        boolean z;
        super.mo48642b_(view);
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        this.f94737g = z;
        if (view == null) {
            notifyItemRemoved(0);
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof CommonLogicViewHolder) {
            this.f94733c.remove(vVar);
        }
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, Aweme> mo48638a(ViewGroup viewGroup) {
        int i;
        C52711k.m112240b(viewGroup, "parent");
        C24579d dVar = this.f94739i;
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(dVar, "onItemClickListener");
        C52711k.m112240b(this, "adapter");
        if (MixCellStyleExperiment.singleRow) {
            i = R.layout.aa_;
        } else {
            i = R.layout.bld;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        inflate.setOnClickListener(C36987a.f94478a);
        if (MixCellStyleExperiment.singleRow) {
            C52711k.m112236a((Object) inflate, "itemView");
            return new MixListViewHolder<>(inflate, dVar, this);
        }
        C52711k.m112236a((Object) inflate, "itemView");
        return new MixDoubleRowListViewHolder<>(inflate, dVar, this);
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        boolean z;
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        View view = vVar.itemView;
        C52711k.m112236a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (getItemViewType(vVar.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            layoutParams2.f4918b = z;
            layoutParams.height = -2;
        }
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && getItemViewType(vVar.getLayoutPosition()) == Integer.MAX_VALUE) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f4918b = true;
        }
        if (vVar instanceof CommonLogicViewHolder) {
            this.f94733c.add(vVar);
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        super.onBindViewHolder(vVar, i, list);
        if (vVar instanceof CommonLogicViewHolder) {
            CommonLogicViewHolder commonLogicViewHolder = (CommonLogicViewHolder) vVar;
            Aweme aweme = (Aweme) mo48635b(i, true);
            long j = this.f94735e;
            if (aweme != null) {
                MixStruct mixInfo = aweme.getMixInfo();
                if (mixInfo != null) {
                    MixStatisStruct mixStatisStruct = mixInfo.statis;
                    if (mixStatisStruct != null && mixStatisStruct.currentEpisode == j) {
                        commonLogicViewHolder.mo76300p();
                    }
                }
            }
        }
        if (vVar instanceof MixDoubleRowListViewHolder) {
            MixDoubleRowListViewHolder mixDoubleRowListViewHolder = (MixDoubleRowListViewHolder) vVar;
            Aweme aweme2 = (Aweme) mo48635b(i, true);
            long j2 = this.f94736f;
            if (aweme2 != null) {
                aweme2.getMixInfo();
            }
        }
    }

    private C37090u(C0184k kVar, C24579d dVar, C37022d dVar2, C11850b bVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(dVar, "onItemClickListener");
        C52711k.m112240b(dVar2, "listener");
        super(kVar, (C1212c<T>) new C37006a<T>(), bVar);
        this.f94738h = kVar;
        this.f94739i = dVar;
        this.f94740j = dVar2;
        this.f94741k = bVar;
        this.f94733c = new LinkedHashSet();
        this.f62535a.mo22700a(false);
    }

    public /* synthetic */ C37090u(C0184k kVar, C24579d dVar, C37022d dVar2, C11850b bVar, int i, C52707g gVar) {
        this(kVar, dVar, dVar2, null);
    }
}

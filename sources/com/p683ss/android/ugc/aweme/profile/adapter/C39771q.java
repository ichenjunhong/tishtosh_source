package com.p683ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p683ss.android.ugc.aweme.base.arch.C23466e;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.q */
public final class C39771q extends C23466e<MixStruct> {

    /* renamed from: c */
    public static final MixStruct f101523c = new MixStruct();

    /* renamed from: d */
    public static final C39772a f101524d = new C39772a(null);

    /* renamed from: e */
    private final MediaMixListViewModel f101525e;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.q$a */
    public static final class C39772a {
        private C39772a() {
        }

        /* renamed from: a */
        public static MixStruct m88483a() {
            return C39771q.f101523c;
        }

        public /* synthetic */ C39772a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        if (((MixStruct) aH_().mo22595a(i, false)) == f101523c) {
            return DynamicTabYellowPointVersion.DEFAULT;
        }
        return super.mo48641a(i);
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11796d, MixStruct> mo48638a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        MediaMixViewHolder mediaMixViewHolder = new MediaMixViewHolder(viewGroup, this.f101525e, null, 4, null);
        return mediaMixViewHolder;
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        C1352v a_ = super.mo49730a_(viewGroup);
        View view = a_.itemView;
        C52711k.m112236a((Object) view, "holder.itemView");
        view.getLayoutParams().width = (int) C9432q.m18687b(viewGroup.getContext(), 72.0f);
        C52711k.m112236a((Object) a_, "holder");
        return a_;
    }

    public C39771q(C0184k kVar, MediaMixListViewModel mediaMixListViewModel) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(mediaMixListViewModel, "mMediaMixListViewModel");
        super(kVar, new C39743d(), null, 4, null);
        this.f101525e = mediaMixListViewModel;
        this.f70699x = false;
    }
}

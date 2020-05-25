package com.p683ss.android.ugc.aweme.tools.music.p2364d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b.C47198a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.e */
public final class C47193e extends C47182b {

    /* renamed from: o */
    private List<MusicModel> f119154o;

    /* renamed from: a */
    public final void mo80638a(C42482c cVar) {
        if (C9190h.m18253a(this.f119154o)) {
            this.f119154o = new ArrayList();
        }
        if (cVar != null) {
            List<MusicModel> list = this.f119154o;
            if (list == null) {
                C52711k.m112234a();
            }
            list.add(0, C47198a.m102456a(cVar));
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo80639a(List<C42482c> list) {
        if (!C9190h.m18253a(list) && C9190h.m18253a(this.f119154o)) {
            if (list == null) {
                C52711k.m112234a();
            }
            for (C42482c cVar : list) {
                List<MusicModel> list2 = this.f119154o;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                list2.add(C47198a.m102456a(cVar));
            }
            notifyDataSetChanged();
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (getItemViewType(i) == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fr, viewGroup, false);
            C52711k.m112236a((Object) inflate, "contentView");
            return new C47189d(inflate, this.f119133k, this);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fp, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "contentView");
        return new C47194f(inflate2, this);
    }

    public C47193e(int i, List<MusicModel> list, C24441j jVar) {
        C52711k.m112240b(jVar, "onItemClickListener");
        super(i, list, jVar);
        this.f119154o = list;
    }
}

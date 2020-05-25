package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1852a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e.C34473a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e.C34475b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e.C34477c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a.a */
public class C34443a extends C1322a<C34477c> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88848a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34443a.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: c */
    public static final C34444a f88849c = new C34444a(null);

    /* renamed from: b */
    public RecyclerView f88850b;

    /* renamed from: d */
    private final C52668f f88851d = C52732g.m112285a(C34445b.f88854a);

    /* renamed from: e */
    private int f88852e = -1;

    /* renamed from: f */
    private final MediaChooseViewModel f88853f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a.a$a */
    public static final class C34444a {
        private C34444a() {
        }

        public /* synthetic */ C34444a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a.a$b */
    static final class C34445b extends C52712l implements C52670a<List<C34409a>> {

        /* renamed from: a */
        public static final C34445b f88854a = new C34445b();

        C34445b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    private List<C34409a> m78382a() {
        return (List) this.f88851d.getValue();
    }

    public int getItemCount() {
        return m78382a().size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f88850b = recyclerView;
        super.onAttachedToRecyclerView(recyclerView);
    }

    public C34443a(MediaChooseViewModel mediaChooseViewModel) {
        C52711k.m112240b(mediaChooseViewModel, "viewModel");
        this.f88853f = mediaChooseViewModel;
    }

    /* renamed from: a */
    public final void mo72465a(List<C34409a> list) {
        C52711k.m112240b(list, "list");
        m78382a().clear();
        m78382a().addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        if (((C34409a) m78382a().get(i)).isVideo()) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C34477c cVar = (C34477c) vVar;
        C52711k.m112240b(cVar, "holder");
        super.onViewAttachedToWindow(cVar);
        cVar.mo72502f();
    }

    public /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C34477c cVar = (C34477c) vVar;
        C52711k.m112240b(cVar, "holder");
        super.onViewDetachedFromWindow(cVar);
        cVar.f88925k.mo72510e().removeObserver(cVar.f88924j);
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C34477c cVar = (C34477c) vVar;
        C52711k.m112240b(cVar, "viewHolder");
        if (this.f88852e <= 0) {
            RecyclerView recyclerView = this.f88850b;
            if (recyclerView != null) {
                i2 = recyclerView.getMeasuredWidth();
            } else {
                i2 = -1;
            }
            this.f88852e = i2 / 4;
        }
        cVar.mo72500a((C34409a) m78382a().get(i), this.f88852e, this.f88852e);
    }

    public /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C34477c cVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            MediaChooseViewModel mediaChooseViewModel = this.f88853f;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(mediaChooseViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdg, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            cVar = new C34475b(inflate, mediaChooseViewModel);
        } else {
            MediaChooseViewModel mediaChooseViewModel2 = this.f88853f;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(mediaChooseViewModel2, "viewModel");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdf, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "itemView");
            cVar = new C34473a(inflate2, mediaChooseViewModel2);
        }
        return cVar;
    }
}

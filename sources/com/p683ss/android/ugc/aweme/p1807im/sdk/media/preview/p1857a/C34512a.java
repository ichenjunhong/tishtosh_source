package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1857a;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d.C34524a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d.C34527c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d.C34530d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a.a */
public final class C34512a extends C1322a<C34524a> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88984a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34512a.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: d */
    public static final C34513a f88985d = new C34513a(null);

    /* renamed from: b */
    public RecyclerView f88986b;

    /* renamed from: c */
    final MediaPreviewViewModel f88987c;

    /* renamed from: e */
    private final C52668f f88988e = C52732g.m112285a(C34514b.f88989a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a.a$a */
    public static final class C34513a {
        private C34513a() {
        }

        public /* synthetic */ C34513a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a.a$b */
    static final class C34514b extends C52712l implements C52670a<List<C34409a>> {

        /* renamed from: a */
        public static final C34514b f88989a = new C34514b();

        C34514b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.a.a$c */
    public static final class C34515c extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C34512a f88990a;

        C34515c(C34512a aVar) {
            this.f88990a = aVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2;
            boolean z;
            C52711k.m112240b(recyclerView, "recyclerView");
            C34512a aVar = this.f88990a;
            C52711k.m112240b(recyclerView, "recyclerView");
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                i2 = linearLayoutManager.mo4749j();
            } else {
                i2 = -1;
            }
            int size = aVar.mo72528a().size();
            if (i2 >= 0 && size > i2) {
                C23275b n = aVar.f88987c.mo72558n();
                Object obj = aVar.mo72528a().get(i2);
                if (((C34409a) obj) != ((C34409a) n.getValue())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    obj = null;
                }
                C34409a aVar2 = (C34409a) obj;
                if (aVar2 != null) {
                    n.setValue(aVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final List<C34409a> mo72528a() {
        return (List) this.f88988e.getValue();
    }

    public final int getItemCount() {
        return mo72528a().size();
    }

    public C34512a(MediaPreviewViewModel mediaPreviewViewModel) {
        C52711k.m112240b(mediaPreviewViewModel, "viewModel");
        this.f88987c = mediaPreviewViewModel;
    }

    public final int getItemViewType(int i) {
        if (((C34409a) mo72528a().get(i)).isVideo()) {
            return 2;
        }
        return 1;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo4801a((C1340m) new C34515c(this));
        this.f88986b = recyclerView;
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C34524a aVar = (C34524a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        aVar.mo72538e();
    }

    public final /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C34524a aVar = (C34524a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewDetachedFromWindow(aVar);
        aVar.mo72539f();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C34524a aVar = (C34524a) vVar;
        C52711k.m112240b(aVar, "viewHolder");
        aVar.mo70626a((C34409a) mo72528a().get(i));
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C34524a aVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i == 2) {
            MediaPreviewViewModel mediaPreviewViewModel = this.f88987c;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(mediaPreviewViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdk, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            aVar = new C34530d(inflate, mediaPreviewViewModel);
        } else {
            MediaPreviewViewModel mediaPreviewViewModel2 = this.f88987c;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(mediaPreviewViewModel2, "viewModel");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdj, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "itemView");
            aVar = new C34527c(inflate2, mediaPreviewViewModel2);
        }
        return aVar;
    }
}

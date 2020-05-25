package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1870a;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c.C34711a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c.C34714b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c.C34727c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a */
public final class C34700a extends C1322a<C34711a> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89392a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34700a.class), "data", "getData()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34700a.class), "attachedViewHolders", "getAttachedViewHolders()Ljava/util/ArrayList;"))};

    /* renamed from: f */
    public static final C34702a f89393f = new C34702a(null);

    /* renamed from: b */
    public boolean f89394b = true;

    /* renamed from: c */
    boolean f89395c = true;

    /* renamed from: d */
    final C34703b f89396d;

    /* renamed from: e */
    final RecyclerView f89397e;

    /* renamed from: g */
    private final C52668f f89398g = C34706b.m78699a(C34705d.f89402a);

    /* renamed from: h */
    private final C52668f f89399h = C34706b.m78699a(C34704c.f89401a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a$a */
    public static final class C34702a {
        private C34702a() {
        }

        public /* synthetic */ C34702a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a$b */
    public interface C34703b {
        /* renamed from: j */
        void mo72757j();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a$c */
    static final class C34704c extends C52712l implements C52670a<ArrayList<C34711a>> {

        /* renamed from: a */
        public static final C34704c f89401a = new C34704c();

        C34704c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a.a$d */
    static final class C34705d extends C52712l implements C52670a<List<C34710a<BaseContent>>> {

        /* renamed from: a */
        public static final C34705d f89402a = new C34705d();

        C34705d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final List<C34710a<BaseContent>> mo72760a() {
        return (List) this.f89398g.getValue();
    }

    /* renamed from: b */
    public final ArrayList<C34711a> mo72761b() {
        return (ArrayList) this.f89399h.getValue();
    }

    public final int getItemCount() {
        return mo72760a().size();
    }

    public final int getItemViewType(int i) {
        BaseContent baseContent = (BaseContent) ((C34710a) mo72760a().get(i)).f89410a;
        if (baseContent instanceof StoryVideoContent) {
            return 1;
        }
        if (baseContent instanceof StoryPictureContent) {
            return 2;
        }
        boolean z = baseContent instanceof OnlyPictureContent;
        return 3;
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C34711a aVar = (C34711a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        aVar.f89416c = true;
        mo72761b().add(aVar);
    }

    public final /* synthetic */ void onViewDetachedFromWindow(C1352v vVar) {
        C34711a aVar = (C34711a) vVar;
        C52711k.m112240b(aVar, "holder");
        super.onViewDetachedFromWindow(aVar);
        aVar.mo72776f();
        mo72761b().remove(aVar);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C34711a aVar = (C34711a) vVar;
        C52711k.m112240b(aVar, "viewHolder");
        aVar.mo72770a((C34710a) mo72760a().get(i));
    }

    public C34700a(C34703b bVar, RecyclerView recyclerView) {
        C52711k.m112240b(bVar, "callback");
        C52711k.m112240b(recyclerView, "recyclerView");
        this.f89396d = bVar;
        this.f89397e = recyclerView;
        this.f89397e.mo4801a((C1340m) new C1340m(this) {

            /* renamed from: a */
            final /* synthetic */ C34700a f89400a;

            {
                this.f89400a = r1;
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C52711k.m112240b(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                C34700a aVar = this.f89400a;
                if (aVar.f89394b) {
                    if (aVar.f89395c) {
                        aVar.f89395c = false;
                        return;
                    }
                    C1332i layoutManager = aVar.f89397e.getLayoutManager();
                    if (layoutManager != null) {
                        int m = ((LinearLayoutManager) layoutManager).mo4752m();
                        if (m >= 0 && 2 >= m) {
                            aVar.f89396d.mo72757j();
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                }
            }
        });
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C34711a aVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i != 1) {
            RecyclerView recyclerView = this.f89397e;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(recyclerView, "recyclerView");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdd, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            aVar = new C34714b(inflate, recyclerView);
        } else {
            RecyclerView recyclerView2 = this.f89397e;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(recyclerView2, "recyclerView");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bde, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "itemView");
            aVar = new C34727c(inflate2, recyclerView2);
        }
        return aVar;
    }
}

package com.p683ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.p683ss.android.ugc.aweme.common.p1593e.C26873e;
import com.p683ss.android.ugc.aweme.feed.adapter.C30038ay;
import com.p683ss.android.ugc.aweme.feed.adapter.C30039az;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView */
public final class RecommendSuperUserView extends RelativeLayout {

    /* renamed from: a */
    public RecyclerView f79104a;

    /* renamed from: b */
    public C30038ay f79105b;

    /* renamed from: c */
    public GalleryLayoutManager f79106c;

    /* renamed from: d */
    private String f79107d = "";

    /* renamed from: e */
    private List<UserWithAweme> f79108e = new ArrayList();

    public final List<UserWithAweme> getMCardItems() {
        return this.f79108e;
    }

    public final String getRequestId() {
        return this.f79107d;
    }

    public final C30038ay getAdapter() {
        C30038ay ayVar = this.f79105b;
        if (ayVar == null) {
            C52711k.m112237a("adapter");
        }
        return ayVar;
    }

    public final GalleryLayoutManager getLayoutManager() {
        GalleryLayoutManager galleryLayoutManager = this.f79106c;
        if (galleryLayoutManager == null) {
            C52711k.m112237a("layoutManager");
        }
        return galleryLayoutManager;
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.f79104a;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        return recyclerView;
    }

    /* renamed from: b */
    private void m71172b() {
        this.f79104a = new RecyclerView(getContext());
        RecyclerView recyclerView = this.f79104a;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        addView(recyclerView, new LayoutParams(-1, -1));
        this.f79106c = new GalleryLayoutManager(0);
        GalleryLayoutManager galleryLayoutManager = this.f79106c;
        if (galleryLayoutManager == null) {
            C52711k.m112237a("layoutManager");
        }
        RecyclerView recyclerView2 = this.f79104a;
        if (recyclerView2 == null) {
            C52711k.m112237a("list");
        }
        if (recyclerView2 != null) {
            galleryLayoutManager.f79089k = recyclerView2;
            galleryLayoutManager.f79079a = Math.max(0, 0);
            recyclerView2.setLayoutManager(galleryLayoutManager);
            galleryLayoutManager.f79082d.mo5634a(recyclerView2);
            recyclerView2.mo4801a((C1340m) galleryLayoutManager.f79083e);
            GalleryLayoutManager galleryLayoutManager2 = this.f79106c;
            if (galleryLayoutManager2 == null) {
                C52711k.m112237a("layoutManager");
            }
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            galleryLayoutManager2.f79087i = new C30285h(context);
            GalleryLayoutManager galleryLayoutManager3 = this.f79106c;
            if (galleryLayoutManager3 == null) {
                C52711k.m112237a("layoutManager");
            }
            C52711k.m112240b(galleryLayoutManager3, "layoutManager");
            C30038ay ayVar = new C30038ay(galleryLayoutManager3);
            ayVar.mo54798c(false);
            ayVar.mo51189c(this.f79108e);
            this.f79105b = ayVar;
            RecyclerView recyclerView3 = this.f79104a;
            if (recyclerView3 == null) {
                C52711k.m112237a("list");
            }
            C30038ay ayVar2 = this.f79105b;
            if (ayVar2 == null) {
                C52711k.m112237a("adapter");
            }
            recyclerView3.setAdapter(ayVar2);
            RecyclerView recyclerView4 = this.f79104a;
            if (recyclerView4 == null) {
                C52711k.m112237a("list");
            }
            RecyclerView recyclerView5 = this.f79104a;
            if (recyclerView5 == null) {
                C52711k.m112237a("list");
            }
            recyclerView4.setItemAnimator(new C30290k(recyclerView5));
            return;
        }
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    /* renamed from: a */
    public final void mo60653a() {
        RecyclerView recyclerView = this.f79104a;
        if (recyclerView == null) {
            C52711k.m112237a("list");
        }
        GalleryLayoutManager galleryLayoutManager = this.f79106c;
        if (galleryLayoutManager == null) {
            C52711k.m112237a("layoutManager");
        }
        C1352v f = recyclerView.mo4847f(galleryLayoutManager.f79080b);
        if (f != null) {
            if (f != null) {
                ((C30039az) f).mo60317f();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            }
        }
        RecyclerView recyclerView2 = this.f79104a;
        if (recyclerView2 == null) {
            C52711k.m112237a("list");
        }
        GalleryLayoutManager galleryLayoutManager2 = this.f79106c;
        if (galleryLayoutManager2 == null) {
            C52711k.m112237a("layoutManager");
        }
        C1352v f2 = recyclerView2.mo4847f(galleryLayoutManager2.f79080b + 1);
        if (f2 != null) {
            if (f2 != null) {
                ((C30039az) f2).mo60314c();
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            }
        }
        RecyclerView recyclerView3 = this.f79104a;
        if (recyclerView3 == null) {
            C52711k.m112237a("list");
        }
        GalleryLayoutManager galleryLayoutManager3 = this.f79106c;
        if (galleryLayoutManager3 == null) {
            C52711k.m112237a("layoutManager");
        }
        C1352v f3 = recyclerView3.mo4847f(galleryLayoutManager3.f79080b - 1);
        if (f3 == null) {
            return;
        }
        if (f3 != null) {
            ((C30039az) f3).mo60314c();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
    }

    public final void setAdapter(C30038ay ayVar) {
        C52711k.m112240b(ayVar, "<set-?>");
        this.f79105b = ayVar;
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        C52711k.m112240b(galleryLayoutManager, "<set-?>");
        this.f79106c = galleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "<set-?>");
        this.f79104a = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f79108e = list;
    }

    public final void setRequestId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f79107d = str;
    }

    public RecommendSuperUserView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m71172b();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(motionEvent, "ev");
        ViewParent parent = getParent();
        if (parent != null) {
            if (!(parent instanceof RecyclerView)) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setContainer(WeakReference<Activity> weakReference) {
        C52711k.m112240b(weakReference, "activityRef");
        GalleryLayoutManager galleryLayoutManager = this.f79106c;
        if (galleryLayoutManager == null) {
            C52711k.m112237a("layoutManager");
        }
        galleryLayoutManager.f79086h = weakReference;
    }

    public final void setOnItemOperationListener(C40443b bVar) {
        C52711k.m112240b(bVar, "onItemOperationListener");
        C30038ay ayVar = this.f79105b;
        if (ayVar == null) {
            C52711k.m112237a("adapter");
        }
        C52711k.m112240b(bVar, "onItemOperationListener");
        ayVar.f78408c = bVar;
    }

    public final void setOnViewFirstShowListener(C26873e<C30039az> eVar) {
        C52711k.m112240b(eVar, "onViewAttachedToWindowListener");
        C30038ay ayVar = this.f79105b;
        if (ayVar == null) {
            C52711k.m112237a("adapter");
        }
        C52711k.m112240b(eVar, "onViewFirstShowListener");
        ayVar.f78407b = eVar;
    }

    public final void setData(List<UserWithAweme> list) {
        C52711k.m112240b(list, "users");
        this.f79107d = this.f79107d;
        this.f79108e = list;
        C30038ay ayVar = this.f79105b;
        if (ayVar == null) {
            C52711k.m112237a("adapter");
        }
        ayVar.mo50303a(this.f79108e);
        C30038ay ayVar2 = this.f79105b;
        if (ayVar2 == null) {
            C52711k.m112237a("adapter");
        }
        String str = this.f79107d;
        C52711k.m112240b(str, "<set-?>");
        ayVar2.f78406a = str;
        C30038ay ayVar3 = this.f79105b;
        if (ayVar3 == null) {
            C52711k.m112237a("adapter");
        }
        ayVar3.notifyDataSetChanged();
    }

    public RecommendSuperUserView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        m71172b();
    }

    public RecommendSuperUserView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        m71172b();
    }
}

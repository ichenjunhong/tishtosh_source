package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.emojiPageV2.C29317a.C29318a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.g */
public final class C29330g extends C29317a<C29285a> {

    /* renamed from: f */
    public final C0184k f76780f;

    /* renamed from: g */
    private final float f76781g = 16.0f;

    /* renamed from: h */
    private final float f76782h = 4.0f;

    /* renamed from: i */
    private final float f76783i = 8.0f;

    /* renamed from: j */
    private final int f76784j = ((int) C9432q.m18687b(this.f76720d, this.f76783i));

    /* renamed from: k */
    private final int f76785k = ((int) C9432q.m18687b(this.f76720d, this.f76781g));

    /* renamed from: l */
    private final int f76786l = ((int) C9432q.m18687b(this.f76720d, this.f76782h));

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.g$a */
    public static final class C29331a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ StaggeredGridLayoutManager f76787a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f76788b;

        C29331a(StaggeredGridLayoutManager staggeredGridLayoutManager, RecyclerView recyclerView) {
            this.f76787a = staggeredGridLayoutManager;
            this.f76788b = recyclerView;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i == 0) {
                int[] a = this.f76787a.mo5240a((int[]) null);
                if (a[0] <= 1 && a[1] <= 1) {
                    this.f76787a.mo5245h();
                    this.f76788b.mo4881m();
                }
            }
        }
    }

    /* renamed from: j */
    public final int mo59264j() {
        return R.layout.b9z;
    }

    public C29330g(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f76780f = kVar;
    }

    /* renamed from: a */
    public final void mo59260a(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "rv");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(this.f76785k, this.f76786l, this.f76785k, this.f76786l);
            StaggeredGridLayoutManager wrapStaggeredGridLayoutManager = new WrapStaggeredGridLayoutManager(this.f76719c, 1);
            recyclerView.setLayoutManager(wrapStaggeredGridLayoutManager);
            recyclerView.setItemAnimator(null);
            recyclerView.mo4801a((C1340m) new C29331a(wrapStaggeredGridLayoutManager, recyclerView));
            recyclerView.mo4798a((C1331h) new C29321c(this.f76719c, this.f76784j));
            recyclerView.setAdapter(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo59261a(C29318a aVar, int i) {
        if (!(mo50673a() == null || mo50673a().size() <= 0 || aVar == null)) {
            RemoteImageView remoteImageView = aVar.f76722a;
            if (remoteImageView != null) {
                C13833a aVar2 = (C13833a) remoteImageView.getHierarchy();
                if (aVar2 != null) {
                    aVar2.mo25902b((int) R.color.ayg);
                }
            }
            Object obj = mo50673a().get(i);
            C52711k.m112236a(obj, "data[position]");
            C29285a aVar3 = (C29285a) obj;
            C29366a aVar4 = aVar3.f76668d;
            C52711k.m112236a((Object) aVar4, "emoji.detailEmoji");
            if (aVar4.getStickerType() == 10 && aVar.f76722a != null) {
                if (aVar3.f76665a == R.drawable.y7) {
                    m69122a(aVar.f76722a, this.f76720d, aVar3.f76665a);
                    aVar.f76722a.setContentDescription(this.f76720d.getString(R.string.ax3));
                    return;
                }
                m69123a(aVar.f76722a, aVar3);
                aVar.f76722a.setContentDescription(this.f76720d.getString(R.string.ax2));
            }
        }
    }
}

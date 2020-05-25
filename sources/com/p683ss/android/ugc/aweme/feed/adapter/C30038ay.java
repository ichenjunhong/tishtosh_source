package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1593e.C26873e;
import com.p683ss.android.ugc.aweme.feed.adapter.C30039az.C30042a;
import com.p683ss.android.ugc.aweme.feed.adapter.C30039az.C30043b;
import com.p683ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ay */
public final class C30038ay extends C26840g<UserWithAweme> implements C30042a, C30043b {

    /* renamed from: a */
    public String f78406a = "";

    /* renamed from: b */
    public C26873e<C30039az> f78407b;

    /* renamed from: c */
    public C40443b f78408c;

    /* renamed from: d */
    private final GalleryLayoutManager f78409d;

    /* renamed from: b */
    public final void mo60309b(int i) {
        this.f78409d.mo4672a(i + 1);
    }

    public C30038ay(GalleryLayoutManager galleryLayoutManager) {
        C52711k.m112240b(galleryLayoutManager, "mLayoutManager");
        this.f78409d = galleryLayoutManager;
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aut, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(view…d_card, viewGroup, false)");
        return new C30039az(inflate, this, this, this.f78409d);
    }

    /* renamed from: a */
    public final void mo60308a(User user, int i) {
        boolean z;
        C52711k.m112240b(user, "user");
        GalleryLayoutManager galleryLayoutManager = this.f78409d;
        if (galleryLayoutManager.f79080b < 0 || galleryLayoutManager.f79080b != i || galleryLayoutManager.f79089k == null || galleryLayoutManager.f79089k.mo4880l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo50673a().remove(this.f78409d.f79080b);
            notifyItemRemoved(this.f78409d.f79080b);
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        UserWithAweme userWithAweme;
        C52711k.m112240b(vVar, "viewHolder");
        C30039az azVar = (C30039az) vVar;
        C40443b bVar = this.f78408c;
        C26873e<C30039az> eVar = this.f78407b;
        if (this.f70670n == null || i < 0 || i >= this.f70670n.size()) {
            userWithAweme = null;
        } else {
            userWithAweme = (UserWithAweme) this.f70670n.get(i);
        }
        if (userWithAweme == null) {
            C52711k.m112234a();
        }
        String str = this.f78406a;
        C52711k.m112240b(userWithAweme, "user");
        C52711k.m112240b(str, "requestId");
        azVar.f78419j = userWithAweme;
        azVar.f78413d = bVar;
        azVar.f78414e = eVar;
        azVar.f78418i = userWithAweme.getAweme().getVideo();
        int i2 = azVar.f78411b;
        int i3 = azVar.f78412c;
        Video video = azVar.f78418i;
        if (video != null) {
            i3 = C52733a.m112277a((((float) i2) / ((float) video.getWidth())) * ((float) video.getHeight()));
        }
        azVar.mo60310a().getLayoutParams().width = i2;
        azVar.mo60310a().getLayoutParams().height = i3;
        azVar.mo60313b().getLayoutParams().width = i2;
        azVar.mo60313b().getLayoutParams().height = i3;
        azVar.mo60310a().setVisibility(0);
        RemoteImageView a = azVar.mo60310a();
        Video video2 = azVar.f78418i;
        if (video2 == null) {
            C52711k.m112234a();
        }
        C23515d.m57669a(a, video2.getOriginCover());
        azVar.mo60320i();
    }
}

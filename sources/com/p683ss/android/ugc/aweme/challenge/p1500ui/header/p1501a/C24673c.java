package com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24674d.C24677b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a.c */
public final class C24673c extends C1322a<C24674d> {

    /* renamed from: a */
    public final C24677b f65316a;

    /* renamed from: b */
    private final List<Aweme> f65317b;

    /* renamed from: c */
    private final boolean f65318c;

    public final int getItemCount() {
        return this.f65317b.size();
    }

    /* renamed from: a */
    public final void mo50553a(List<? extends Aweme> list) {
        Collection collection = list;
        if (!C9376b.m18558a(collection)) {
            this.f65317b.clear();
            List<Aweme> list2 = this.f65317b;
            if (list == null) {
                C52711k.m112234a();
            }
            list2.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public C24673c(C24677b bVar, boolean z) {
        C52711k.m112240b(bVar, "listener");
        this.f65316a = bVar;
        this.f65318c = z;
        this.f65317b = new ArrayList();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C24674d dVar = (C24674d) vVar;
        C52711k.m112240b(dVar, "viewHolder");
        Aweme aweme = (Aweme) this.f65317b.get(i);
        if (aweme != null && aweme.getVideo() != null) {
            RemoteImageView remoteImageView = dVar.f65320a;
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "aweme.video");
            C23515d.m57669a(remoteImageView, video.getCover());
            dVar.f65321b = aweme;
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C24677b bVar = this.f65316a;
        boolean z = this.f65318c;
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(bVar, "listener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b59, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C24674d(inflate, bVar);
    }

    public /* synthetic */ C24673c(C24677b bVar, boolean z, int i, C52707g gVar) {
        this(bVar, false);
    }
}

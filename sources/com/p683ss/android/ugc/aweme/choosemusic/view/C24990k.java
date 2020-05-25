package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.k */
public final class C24990k extends BaseMusicListView<MusicModel> {

    /* renamed from: g */
    public long f66157g;

    /* renamed from: h */
    public final Context f66158h;

    /* renamed from: i */
    public final View f66159i;

    /* renamed from: j */
    public final C24832a<MusicModel> f66160j;

    /* renamed from: k */
    public final C37306l<C24806c> f66161k;

    /* renamed from: l */
    public final int f66162l;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C26840g<MusicModel> mo50934f() {
        C24816b bVar = new C24816b(null, this.f66090c);
        bVar.f65703i = this.f66091d;
        return bVar;
    }

    /* renamed from: a */
    public final void mo50979a(boolean z) {
        C26840g gVar = this.f66088a;
        if (!(gVar instanceof C24816b)) {
            gVar = null;
        }
        C24816b bVar = (C24816b) gVar;
        if (bVar != null) {
            bVar.f65702h = z;
        }
    }

    /* renamed from: a */
    public final void mo50977a(C24803a aVar) {
        C52711k.m112240b(aVar, "musicMobBean");
        C26840g gVar = this.f66088a;
        if (!(gVar instanceof C24816b)) {
            gVar = null;
        }
        C24816b bVar = (C24816b) gVar;
        if (bVar != null) {
            bVar.f65700f = aVar;
        }
    }

    /* renamed from: a */
    public final void mo50978a(C24833b bVar) {
        C52711k.m112240b(bVar, "iSelectMusic");
        C26840g gVar = this.f66088a;
        if (!(gVar instanceof C24816b)) {
            gVar = null;
        }
        C24816b bVar2 = (C24816b) gVar;
        if (bVar2 != null) {
            bVar2.f65695a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo48215a(List<? extends MusicModel> list, boolean z) {
        super.mo48215a(list, z);
        if (list != null && this.f66157g > 0) {
            C24963c.m60716a(System.currentTimeMillis() - this.f66157g);
        }
    }

    public C24990k(Context context, View view, C24832a<MusicModel> aVar, C37306l<C24806c> lVar, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aVar, "listener");
        C52711k.m112240b(lVar, "onInternalEventListener");
        super(context, view, aVar, R.string.c0s, null, lVar, i);
        this.f66158h = context;
        this.f66159i = view;
        this.f66160j = aVar;
        this.f66161k = lVar;
        this.f66162l = i;
        TextTitleBar textTitleBar = this.mTitleBar;
        C52711k.m112236a((Object) textTitleBar, "mTitleBar");
        textTitleBar.setVisibility(8);
        RecyclerView recyclerView = this.mRecyclerView;
        C52711k.m112236a((Object) recyclerView, "mRecyclerView");
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            RecyclerView recyclerView2 = this.mRecyclerView;
            C52711k.m112236a((Object) recyclerView2, "mRecyclerView");
            marginLayoutParams.topMargin = (int) C9432q.m18687b(recyclerView2.getContext(), 10.0f);
            RecyclerView recyclerView3 = this.mRecyclerView;
            C52711k.m112236a((Object) recyclerView3, "mRecyclerView");
            recyclerView3.setOverScrollMode(2);
            View inflate = LayoutInflater.from(this.f66159i.getContext()).inflate(R.layout.vm, null);
            DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.bi3);
            if (C37249a.m83512c() == 2) {
                C52711k.m112236a((Object) dmtTextView, "title");
                dmtTextView.setText(this.f66159i.getContext().getString(R.string.cem));
            } else {
                C52711k.m112236a((Object) dmtTextView, "title");
                dmtTextView.setText(this.f66159i.getContext().getString(R.string.cel));
            }
            this.mStatusView.setBuilder(this.mStatusView.mo19207c().mo19231b(inflate));
            this.mStatusView.mo19209d();
            mo50933e();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}

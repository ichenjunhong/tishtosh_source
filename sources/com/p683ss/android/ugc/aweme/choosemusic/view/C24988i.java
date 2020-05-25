package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.i */
public final class C24988i extends BaseMusicListView<MusicModel> {
    /* renamed from: c */
    public final void mo48218c() {
        super.mo48218c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C26840g mo50934f() {
        C24816b bVar = new C24816b(null, this.f66090c);
        bVar.f65703i = this.f66091d;
        return bVar;
    }

    /* renamed from: a */
    public final void mo50974a(C24803a aVar) {
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65700f = aVar;
        }
    }

    /* renamed from: a */
    public final void mo50975a(C24833b bVar) {
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65695a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo50976a(boolean z) {
        if (this.f66088a instanceof C24816b) {
            ((C24816b) this.f66088a).f65702h = z;
        }
    }

    public C24988i(Context context, View view, C24832a aVar, C26846a aVar2, C37306l<C24806c> lVar, int i) {
        super(context, view, aVar, R.string.ch3, aVar2, lVar, i);
        this.mTitleBar.setVisibility(8);
        ((MarginLayoutParams) this.mRecyclerView.getLayoutParams()).topMargin = (int) C9432q.m18687b(this.mRecyclerView.getContext(), 10.0f);
        this.mRecyclerView.setOverScrollMode(2);
        this.mStatusView.setBuilder(this.mStatusView.mo19207c().mo19231b(LayoutInflater.from(view.getContext()).inflate(R.layout.auc, null)));
    }
}

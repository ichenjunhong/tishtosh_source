package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24992m;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p.C24997a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.t */
public final class C24946t extends C24908a implements C24832a<Music>, C26846a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50728a(Object obj, int i) {
    }

    public final void ar_() {
    }

    /* renamed from: c */
    public final String mo48208c() {
        return "hot_music_list_data";
    }

    /* renamed from: d */
    public final String mo48209d() {
        return "refresh_status_hot_music_list";
    }

    /* renamed from: e */
    public final String mo48210e() {
        return "loadmore_status_hot_music_list";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo50875m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final String mo50876n() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo50877o() {
        return R.layout.om;
    }

    /* renamed from: a */
    public final void mo48207a() {
        super.mo48207a();
        this.f65963d.mo50752d(0, 20);
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f65963d != null) {
            this.f65963d.mo50752d(0, 20);
        }
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c mo50872b(View view) {
        C24992m mVar;
        if (C24954a.m60699b()) {
            mVar = new C24992m(getContext(), view, this, R.string.fx3, this, this, this.f65966k, true);
        } else {
            mVar = new C24992m(getContext(), view, this, R.string.chg, this, this, this.f65966k, true);
        }
        mVar.mo50981a((int) R.string.d4u);
        if (mVar.mTitleLayout != null) {
            mVar.mTitleLayout.setVisibility(8);
        }
        mVar.mo50983a((C24833b) this);
        if (getContext() != null) {
            mVar.mo50982a(new C24803a("lyricsticker_song_search", getContext().getString(R.string.d4u), "click_lyric", C24963c.m60726b()));
        }
        mVar.mo50932a((C24997a) new C24947u(this), 10);
        return mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50908a(int i, int i2) {
        ar_();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo50877o(), viewGroup, false);
        inflate.findViewById(R.id.e9y).setBackgroundResource(R.color.a8w);
        inflate.findViewById(R.id.bop).setBackgroundResource(R.color.a8w);
        return inflate;
    }
}

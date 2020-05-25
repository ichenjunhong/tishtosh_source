package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.arch.C23269c;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24832a;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24856l;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24992m;
import com.p683ss.android.ugc.aweme.choosemusic.view.C24995p.C24997a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.n */
public final class C24938n extends C24908a implements C24832a<Music>, C26846a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo50728a(Object obj, int i) {
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
        this.f65963d.mo50751c(0, 20);
    }

    /* renamed from: q */
    public final void mo50729q() {
        if (this.f65963d != null) {
            this.f65963d.mo50751c(0, 20);
        }
    }

    /* renamed from: r */
    public final void mo50730r() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public final void ar_() {
        if (this.f65965j != null) {
            this.f65965j.mo48214a();
        }
        if (this.f65963d != null && this.f65964e != null) {
            C23268b bVar = (C23268b) this.f65964e.mo48229a(mo48208c());
            C24842a aVar = this.f65963d;
            int intValue = ((Integer) bVar.mo48213a("list_cursor")).intValue();
            if (!aVar.f65745h) {
                aVar.f65745h = true;
                aVar.f65738a.getHotMusicList(intValue, 20).mo20a((C0011g<TResult, TContinuationResult>) new C24856l<TResult,TContinuationResult>(aVar), C0013i.f25b);
            }
        }
    }

    /* renamed from: a */
    public static Fragment m60616a(int i) {
        C24938n nVar = new C24938n();
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        nVar.setArguments(bundle);
        return nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C23269c mo50872b(View view) {
        C24992m mVar;
        if (C24954a.m60699b()) {
            mVar = new C24992m(getContext(), view, this, R.string.fx3, this, this, this.f65966k);
        } else {
            mVar = new C24992m(getContext(), view, this, R.string.chg, this, this, this.f65966k);
        }
        mVar.mo50981a((int) R.string.d4u);
        mVar.mo50983a((C24833b) this);
        if (getContext() != null) {
            mVar.mo50982a(new C24803a("change_music_page_detail", getContext().getString(R.string.d4u), "click_more", C24963c.m60726b()));
        }
        mVar.mo50932a((C24997a) new C24939o(this), 10);
        return mVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50903a(int i, int i2) {
        ar_();
    }
}

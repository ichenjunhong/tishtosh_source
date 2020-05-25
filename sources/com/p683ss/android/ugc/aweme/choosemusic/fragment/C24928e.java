package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment.C24889c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p683ss.android.ugc.aweme.music.p1975c.C37350c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.e */
final /* synthetic */ class C24928e implements C24889c {

    /* renamed from: a */
    private final C24923c f66016a;

    C24928e(C24923c cVar) {
        this.f66016a = cVar;
    }

    /* renamed from: a */
    public final void mo50832a() {
        C24923c cVar = this.f66016a;
        String b = cVar.f65992d.mo50941b();
        KeyboardUtils.m58184c(cVar.f65995k);
        if (cVar.getActivity() != null && !C9431p.m18664a(b)) {
            cVar.f66001q.mo50677a().setValue(Integer.valueOf(0));
            NewMusicListFragment e = cVar.mo50885e();
            if (e != null) {
                cVar.mo50885e().mo50820h();
            }
            if (cVar.f66000p) {
                C24840c.m60407c().mo50743b(new MusicSearchHistory(b));
            } else {
                C24841d.m60410c().mo50743b(new MusicSearchHistory(b));
            }
            if (e != null) {
                e.mo50826n();
            }
            cVar.f65989a.mo76936a(b, C24923c.m60580h(), cVar.f66000p);
            C47718bf.m103289b(new C37350c("search_result"));
            C24963c.m60734f();
        }
    }
}

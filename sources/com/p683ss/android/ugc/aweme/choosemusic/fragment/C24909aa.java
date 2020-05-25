package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24866v;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1508a.C24874a;
import com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1510c.C24881b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.aa */
final /* synthetic */ class C24909aa implements C0199s {

    /* renamed from: a */
    private final NewMusicListFragment f65968a;

    C24909aa(NewMusicListFragment newMusicListFragment) {
        this.f65968a = newMusicListFragment;
    }

    public final void onChanged(Object obj) {
        NewMusicListFragment newMusicListFragment = this.f65968a;
        Integer num = (Integer) obj;
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    C24866v vVar = (C24866v) newMusicListFragment.f65857d.mo50679c().getValue();
                    if (vVar != null && vVar.f65799b == 3) {
                        String str = vVar.f65800c;
                        C26890h.m65011a("search_sug", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("log_pb", C29981aa.m70153a().mo60161a(newMusicListFragment.f65864o)).mo47829a("sug_keyword", newMusicListFragment.f65863n).mo47829a("search_keyword", str).mo47829a("search_type", "video_music").mo47826a("order", vVar.f65802e).f61491a);
                        break;
                    }
                case 1:
                    newMusicListFragment.mo50817e();
                    return;
                case 2:
                    newMusicListFragment.mo50826n();
                    newMusicListFragment.mo50818f();
                    newMusicListFragment.mo50825m();
                    if (newMusicListFragment.f65856c == null) {
                        newMusicListFragment.f65856c = new C24874a(newMusicListFragment.getActivity());
                    }
                    if (newMusicListFragment.mListView.getAdapter() != newMusicListFragment.f65856c) {
                        newMusicListFragment.mListView.setAdapter(newMusicListFragment.f65856c);
                    }
                    C24881b bVar = newMusicListFragment.f65854a;
                    bVar.f65832c = newMusicListFragment.f65863n;
                    bVar.f65833d = "music_create";
                    bVar.f65831b.removeCallbacks(bVar.f65834e);
                    bVar.f65831b.postDelayed(bVar.f65834e, 150);
                    return;
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.music.presenter;

import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12718t;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter */
public final class EditOriginMusicTitlePresenter {

    /* renamed from: a */
    public C37394b f95404a;

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$MusicTitleApi */
    public interface MusicTitleApi {
        @C12718t(mo23886a = "/aweme/v1/music/update/")
        @C12705g
        C2201v<C37393a> alterMusicTitle(@C12703e(mo23873a = "music_id") String str, @C12703e(mo23873a = "title") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$a */
    public static class C37393a {

        /* renamed from: a */
        public int f95406a;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.presenter.EditOriginMusicTitlePresenter$b */
    public interface C37394b {
        /* renamed from: a */
        void mo76903a();

        /* renamed from: b */
        void mo76904b();
    }

    public EditOriginMusicTitlePresenter(C37394b bVar) {
        this.f95404a = bVar;
    }
}

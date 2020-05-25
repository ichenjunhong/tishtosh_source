package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.g */
final /* synthetic */ class C24851g implements C0011g {

    /* renamed from: a */
    private final C24842a f65769a;

    C24851g(C24842a aVar) {
        this.f65769a = aVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65769a;
        aVar.f65743f = false;
        if (iVar.mo33d()) {
            aVar.f65739b.mo48228a("refresh_status_music_list", (Object) Integer.valueOf(1));
        } else if (iVar.mo26b()) {
            aVar.f65739b.mo48228a("refresh_status_music_list", (Object) Integer.valueOf(0));
            MusicList musicList = (MusicList) iVar.mo34e();
            C23268b bVar = new C23268b();
            bVar.mo48212a("list_cursor", Integer.valueOf(musicList.getCursor())).mo48212a("list_hasmore", Integer.valueOf(musicList.hasMore)).mo48212a("action_type", Integer.valueOf(1)).mo48212a("list_data", C24964d.m60738a(musicList.items));
            aVar.f65739b.mo48228a("music_list", (Object) bVar);
        }
        return null;
    }
}

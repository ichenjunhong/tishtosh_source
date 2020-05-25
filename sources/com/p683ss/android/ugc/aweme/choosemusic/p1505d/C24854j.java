package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.j */
public final /* synthetic */ class C24854j implements C0011g {

    /* renamed from: a */
    private final C24842a f65773a;

    public C24854j(C24842a aVar) {
        this.f65773a = aVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65773a;
        aVar.f65744g = false;
        if (iVar.mo33d()) {
            aVar.f65739b.mo48228a("loadmore_status_user_collected_music", (Object) Integer.valueOf(1));
        } else if (iVar.mo26b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo34e();
            List list = (List) ((C23268b) aVar.f65739b.mo48229a("user_collected_music_list")).mo48213a("list_data");
            list.addAll(C24964d.m60738a(collectedMusicList.items));
            C23268b bVar = new C23268b();
            bVar.mo48212a("loadmore_status_user_collected_music", Integer.valueOf(0)).mo48212a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo48212a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo48212a("action_type", Integer.valueOf(2)).mo48212a("list_data", list);
            aVar.f65739b.mo48228a("user_collected_music_list", (Object) bVar);
        }
        return null;
    }
}

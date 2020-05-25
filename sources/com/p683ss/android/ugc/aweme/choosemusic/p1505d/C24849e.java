package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.music.model.MusicCollection;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.e */
final /* synthetic */ class C24849e implements C0011g {

    /* renamed from: a */
    private final C24842a f65767a;

    C24849e(C24842a aVar) {
        this.f65767a = aVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65767a;
        if (iVar.mo33d()) {
            aVar.f65739b.mo48228a("refresh_status_music_sheet", (Object) Integer.valueOf(1));
        } else if (iVar.mo26b()) {
            aVar.f65739b.mo48228a("refresh_status_music_sheet", (Object) Integer.valueOf(0));
            MusicCollection musicCollection = (MusicCollection) iVar.mo34e();
            C23268b bVar = new C23268b();
            bVar.mo48212a("list_cursor", Long.valueOf(musicCollection.cursor)).mo48212a("list_hasmore", Boolean.valueOf(musicCollection.hasMore)).mo48212a("action_type", Integer.valueOf(1)).mo48212a("list_data", musicCollection.getItems());
            aVar.f65739b.mo48228a("music_sheet_list", (Object) bVar);
        }
        return null;
    }
}

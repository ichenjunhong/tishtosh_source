package com.p683ss.android.ugc.aweme.choosemusic.p1505d;

import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.concurrent.TimeUnit;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.i */
final /* synthetic */ class C24853i implements C0011g {

    /* renamed from: a */
    private final C24842a f65771a;

    /* renamed from: b */
    private final C17429o f65772b;

    C24853i(C24842a aVar, C17429o oVar) {
        this.f65771a = aVar;
        this.f65772b = oVar;
    }

    public final Object then(C0013i iVar) {
        C24842a aVar = this.f65771a;
        C17429o oVar = this.f65772b;
        aVar.f65744g = false;
        long a = oVar.mo33754a(TimeUnit.MILLISECONDS);
        if (iVar.mo33d()) {
            aVar.f65739b.mo48228a("refresh_status_user_collected_music", (Object) Integer.valueOf(1));
            aVar.f65742e.onEventV3("tool_performance_api", C23089d.m56640a().mo47829a("api_type", "music_list").mo47827a("duration", a).mo47829a("scene", "favorite").mo47826a("status", 1).mo47829a("error_domain", TutorialVideoApiManager.f96873a).mo47826a("error_code", -1).f61491a);
        } else if (iVar.mo26b()) {
            CollectedMusicList collectedMusicList = (CollectedMusicList) iVar.mo34e();
            C23268b bVar = new C23268b();
            bVar.mo48212a("refresh_status_user_collected_music", Integer.valueOf(0)).mo48212a("list_cursor", Integer.valueOf(collectedMusicList.cursor)).mo48212a("list_hasmore", Integer.valueOf(collectedMusicList.hasMore)).mo48212a("action_type", Integer.valueOf(1)).mo48212a("list_data", C24964d.m60738a(collectedMusicList.items));
            aVar.f65739b.mo48228a("user_collected_music_list", (Object) bVar);
            aVar.f65742e.onEventV3("tool_performance_api", C23089d.m56640a().mo47829a("api_type", "music_list").mo47827a("duration", a).mo47829a("scene", "favorite").mo47826a("status", 0).f61491a);
        }
        return null;
    }
}

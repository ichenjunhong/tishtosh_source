package com.p683ss.android.ugc.aweme.music.service;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.p683ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p683ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.p683ss.android.ugc.aweme.music.presenter.C37405j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.service.MusicDetailService */
public class MusicDetailService implements IMusicDetailService {
    public C26875a createMusicAwemeModel() {
        return new C37405j();
    }

    public IMusicRecordService getRecordService() {
        return new C37437d();
    }

    public static IMusicDetailService createIMusicDetailServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IMusicDetailService.class);
        if (a != null) {
            return (IMusicDetailService) a;
        }
        if (C27991b.f73463aT == null) {
            synchronized (IMusicDetailService.class) {
                if (C27991b.f73463aT == null) {
                    C27991b.f73463aT = new MusicDetailService();
                }
            }
        }
        return (MusicDetailService) C27991b.f73463aT;
    }

    public void mobRefreshInMusicAweme(C26875a<?, ?> aVar, List<? extends Aweme> list) {
        if (aVar instanceof C37405j) {
            C37405j jVar = (C37405j) aVar;
            jVar.setItems(new ArrayList(list));
            ((MusicAwemeList) jVar.mData).cursor = (long) list.size();
        }
    }

    public OriginalMusicList fetchOriginalMusicList(String str, String str2, int i, int i2) throws Exception {
        return (OriginalMusicList) MusicAwemeApi.f95244a.fetchOriginalMusicList(str, str2, i, i2).get();
    }
}

package com.p683ss.android.ugc.aweme.music.service;

import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.OriginalMusicList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.service.IMusicDetailService */
public interface IMusicDetailService {
    C26875a<?, ?> createMusicAwemeModel();

    OriginalMusicList fetchOriginalMusicList(String str, String str2, int i, int i2) throws Exception;

    IMusicRecordService getRecordService();

    void mobRefreshInMusicAweme(C26875a<?, ?> aVar, List<? extends Aweme> list);
}

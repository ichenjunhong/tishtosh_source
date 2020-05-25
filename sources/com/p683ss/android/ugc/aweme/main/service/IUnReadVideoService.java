package com.p683ss.android.ugc.aweme.main.service;

import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;

/* renamed from: com.ss.android.ugc.aweme.main.service.IUnReadVideoService */
public interface IUnReadVideoService {

    /* renamed from: com.ss.android.ugc.aweme.main.service.IUnReadVideoService$a */
    public interface C36678a {
    }

    boolean checkEnableExperiment(int i);

    C36678a createUnReadListController(UnReadCircleView unReadCircleView, String str);

    void updateUnReadCount(String str, int i);
}

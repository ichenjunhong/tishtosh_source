package com.p683ss.android.ugc.aweme.p1308ad.services;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b;
import com.p683ss.android.ugc.aweme.p1308ad.services.p1322a.C22430d;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22449c;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22450d;

/* renamed from: com.ss.android.ugc.aweme.ad.services.IAdService */
public interface IAdService {
    C22412b getAdLandPagePreloadService();

    C22396a getLatestRecommendFeedAdInfo();

    C22449c getViewForType(Context context, C22430d dVar);

    C22450d getViewHolderForType(Context context, C22430d dVar);

    void init(Application application);
}

package com.p683ss.android.ugc.aweme.feed.service;

import android.app.Activity;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.commercialize.C25934i;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.adapter.C30011ab;
import com.p683ss.android.ugc.aweme.feed.adapter.C30021al;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;

/* renamed from: com.ss.android.ugc.aweme.feed.service.IFeedComponentService */
public interface IFeedComponentService {
    C25934i getDownloadDepend();

    C30011ab getFeedAdapterService();

    IMovieRecordService getMovieRecordService();

    Fragment getSpecialTopicFragment();

    IStickerRecordService getStickerRecordService();

    C30021al getVideoViewHolderService();

    Boolean isPauseVideoByRecommendUserDialog(Activity activity);

    C30180e newDialogController(String str, int i, C30313ae<C30332aw> aeVar, C30447d dVar);
}

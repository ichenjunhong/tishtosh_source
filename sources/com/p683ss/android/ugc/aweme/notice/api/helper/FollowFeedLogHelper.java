package com.p683ss.android.ugc.aweme.notice.api.helper;

import com.p683ss.android.ugc.aweme.notice.api.bean.C38040g;

/* renamed from: com.ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper */
public interface FollowFeedLogHelper {
    String getLaunchType(int i);

    C38040g providerNoticePointInfo();

    void putFollowTabChannelCount(int i, int i2);

    void resetFetchState();

    void setLastLaunchType(int i);

    void setLastLongLinkAuthorId(long j);

    void setLastLongLinkItemId(long j);

    void setLastYellowDotRequestId(String str);
}

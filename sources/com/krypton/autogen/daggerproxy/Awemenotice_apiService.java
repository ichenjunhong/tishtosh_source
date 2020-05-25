package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p683ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p683ss.android.ugc.aweme.notice.api.helper.FollowFeedLogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.I18nLogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCaptchaHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeDuetWithMovieHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.WSHelper;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.NoticeABService;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38029b;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38030c;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38031d;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38045b;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil;
import com.p683ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil;

public interface Awemenotice_apiService {
    DeepLinkReturnHelperService provideDeepLinkReturnHelperService();

    FollowFeedLogHelper provideFollowFeedLogHelper();

    I18nLogHelper provideI18nLogHelper();

    IMainServiceHelper provideIMainServiceHelper();

    C38027b provideLivePushService();

    LogHelper provideLogHelper();

    NoticeABService provideNoticeABService();

    NoticeCaptchaHelper provideNoticeCaptchaHelper();

    NoticeChallengePropertyUtil provideNoticeChallengePropertyUtil();

    NoticeCommentHelperService provideNoticeCommentHelperService();

    C38029b provideNoticeCountService();

    NoticeDuetWithMovieHelper provideNoticeDuetWithMovieHelper();

    C38045b provideNoticeListService();

    NoticeLiveServiceAdapter provideNoticeLiveServiceAdapter();

    NoticeLiveWatcherUtil provideNoticeLiveWatcherUtil();

    NotificationClickHelper provideNotificationClickHelper();

    C38030c provideOldRedPointService();

    C38031d provideRedPointService();

    SchemaPageHelper provideSchemaPageHelper();

    WSHelper provideWSHelper();
}

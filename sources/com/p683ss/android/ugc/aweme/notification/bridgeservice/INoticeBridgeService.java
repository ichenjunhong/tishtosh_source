package com.p683ss.android.ugc.aweme.notification.bridgeservice;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38028a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38144x;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService */
public interface INoticeBridgeService {
    C26840g<BaseNotice> getMsgHeadExtraAdapter(Fragment fragment, C52670a<C52860x> aVar);

    <T extends C23526a> Class<? extends T> getNoticeFragmentClass();

    C38144x getNotificationAdapter(int i, FragmentActivity fragmentActivity, int i2, String str, int i3);

    C38028a getOvRedPointManager();

    C38153a getViewModelHelper();

    void recordGuideBundle(Bundle bundle, int i);

    void recordNoticeView(NoticeView noticeView);
}

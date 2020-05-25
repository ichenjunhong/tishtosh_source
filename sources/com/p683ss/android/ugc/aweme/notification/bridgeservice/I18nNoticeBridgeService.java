package com.p683ss.android.ugc.aweme.notification.bridgeservice;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38028a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38297c;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38267i;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38144x;
import com.p683ss.android.ugc.aweme.notification.util.C38430b;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService */
public final class I18nNoticeBridgeService implements INoticeBridgeService {
    public final C26840g<BaseNotice> getMsgHeadExtraAdapter(Fragment fragment, C52670a<C52860x> aVar) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(aVar, "onEmptyListener");
        return null;
    }

    public final C38028a getOvRedPointManager() {
        return null;
    }

    public final C38153a getViewModelHelper() {
        return new C38430b();
    }

    public final <T extends C23526a> Class<? extends T> getNoticeFragmentClass() {
        if (MTNotificationTabMergeExperiment.m85061a()) {
            return C38297c.class;
        }
        return null;
    }

    public static INoticeBridgeService createINoticeBridgeServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(INoticeBridgeService.class);
        if (a != null) {
            return (INoticeBridgeService) a;
        }
        return new I18nNoticeBridgeService();
    }

    public final void recordNoticeView(NoticeView noticeView) {
        C52711k.m112240b(noticeView, "noticeView");
        C52711k.m112240b(noticeView, "noticeView");
        C38443j.f97845d = new WeakReference<>(noticeView);
    }

    public final void recordGuideBundle(Bundle bundle, int i) {
        C38443j.m85761a(bundle, i);
    }

    public final C38144x getNotificationAdapter(int i, FragmentActivity fragmentActivity, int i2, String str, int i3) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(str, "enterFrom");
        if (!C38415g.m85731c()) {
            return new C38144x(i, fragmentActivity, i2, str);
        }
        C38267i iVar = new C38267i(fragmentActivity, str, i3, i, i2);
        return iVar;
    }
}

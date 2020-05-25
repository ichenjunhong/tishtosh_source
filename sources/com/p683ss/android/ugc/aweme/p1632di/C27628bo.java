package com.p683ss.android.ugc.aweme.p1632di;

import com.p683ss.android.ugc.aweme.comment.p1526k.C25242m;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26430bo;
import com.p683ss.android.ugc.aweme.message.C36776a;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.C38018a;
import com.p683ss.android.ugc.aweme.notice.C38079b;
import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import com.p683ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p683ss.android.ugc.aweme.notice.api.helper.DeepLinkReturnHelperService;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
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
import com.p683ss.android.ugc.aweme.push.C40885b;
import com.p683ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p683ss.android.ugc.aweme.services.NoticeABServiceImpl;
import com.p683ss.android.ugc.aweme.story.live.C46648i;
import com.p683ss.android.ugc.aweme.story.live.C46649j;
import com.p683ss.android.ugc.aweme.utils.C47817dl;
import com.p683ss.android.ugc.aweme.utils.C47862et;
import com.p683ss.android.ugc.aweme.utils.C47925go;

/* renamed from: com.ss.android.ugc.aweme.di.bo */
public final class C27628bo {
    /* renamed from: a */
    public static NoticeABService m66306a() {
        return new NoticeABServiceImpl();
    }

    /* renamed from: b */
    public static LogHelper m66307b() {
        return new C26052as();
    }

    /* renamed from: c */
    public static DeepLinkReturnHelperService m66308c() {
        return new C40885b();
    }

    /* renamed from: d */
    public static NoticeChallengePropertyUtil m66309d() {
        return new C26430bo();
    }

    /* renamed from: e */
    public static NoticeLiveWatcherUtil m66310e() {
        return new C46649j();
    }

    /* renamed from: f */
    public static SchemaPageHelper m66311f() {
        return new C47862et();
    }

    /* renamed from: g */
    public static WSHelper m66312g() {
        return new C47925go();
    }

    /* renamed from: h */
    public static NotificationClickHelper m66313h() {
        return new C47817dl();
    }

    /* renamed from: i */
    public static NoticeLiveServiceAdapter m66314i() {
        return new C46648i();
    }

    /* renamed from: j */
    public static NoticeCommentHelperService m66315j() {
        return new C25242m();
    }

    /* renamed from: k */
    public static C38029b m66316k() {
        return new C38018a();
    }

    /* renamed from: l */
    public static C38045b m66317l() {
        return new C38079b();
    }

    /* renamed from: m */
    public static C38031d m66318m() {
        return C36782d.m82775a();
    }

    /* renamed from: n */
    public static C38030c m66319n() {
        return C36782d.m82775a();
    }

    /* renamed from: o */
    public static C38027b m66320o() {
        return C36776a.m82766a();
    }

    /* renamed from: p */
    public static IMainServiceHelper m66321p() {
        return new MainServiceHelperImpl();
    }
}

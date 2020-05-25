package com.p683ss.android.ugc.aweme.notification.newstyle;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.NoticeCollapsilitySetting */
public final class NoticeCollapsilitySetting {
    public static final NoticeCollapsilitySetting INSTANCE = new NoticeCollapsilitySetting();
    @C10179b
    private static final NoticeCollapsibility NOTICE_COLLAPSIBILTY = null;

    private NoticeCollapsilitySetting() {
    }

    public final NoticeCollapsibility getNOTICE_COLLAPSIBILTY() {
        return NOTICE_COLLAPSIBILTY;
    }

    public static final int getCutOffDays() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) C10193n.m20607a().mo18202a(NoticeCollapsilitySetting.class, "notice_collapsibility", C10181b.m20511a().mo18175c().getNoticeCollapsibility(), "com.ss.android.ugc.aweme.notification.newstyle.NoticeCollapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.cutOffDays;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final int getNoticeCount() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) C10193n.m20607a().mo18202a(NoticeCollapsilitySetting.class, "notice_collapsibility", C10181b.m20511a().mo18175c().getNoticeCollapsibility(), "com.ss.android.ugc.aweme.notification.newstyle.NoticeCollapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.extraNoticeCount;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final boolean needCollapse() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) C10193n.m20607a().mo18202a(NoticeCollapsilitySetting.class, "notice_collapsibility", C10181b.m20511a().mo18175c().getNoticeCollapsibility(), "com.ss.android.ugc.aweme.notification.newstyle.NoticeCollapsibility", NoticeCollapsibility.class);
            if (!(noticeCollapsibility == null || noticeCollapsibility.cutOffDays == 0 || noticeCollapsibility.extraNoticeCount == 0)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}

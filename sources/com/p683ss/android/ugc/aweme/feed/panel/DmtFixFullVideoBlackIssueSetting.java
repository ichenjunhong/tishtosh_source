package com.p683ss.android.ugc.aweme.feed.panel;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.feed.panel.DmtFixFullVideoBlackIssueSetting */
public final class DmtFixFullVideoBlackIssueSetting {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DmtFixFullVideoBlackIssueSetting.class), "settingValue", "getSettingValue()J"))};
    public static final DmtFixFullVideoBlackIssueSetting INSTANCE = new DmtFixFullVideoBlackIssueSetting();
    @C10179b
    public static final long NOT_FIX = -1;
    private static final C52668f settingValue$delegate = C52732g.m112285a(C30589a.f79896a);

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.DmtFixFullVideoBlackIssueSetting$a */
    static final class C30589a extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        public static final C30589a f79896a = new C30589a();

        C30589a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(C10193n.m20607a().mo18201a(DmtFixFullVideoBlackIssueSetting.class, "dmt_fix_full_video_black_issue", C10181b.m20511a().mo18175c().getDmtFixFullVideoBlackIssue(), -1));
        }
    }

    private DmtFixFullVideoBlackIssueSetting() {
    }

    private final long getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).longValue();
    }

    public final long getDelayMillis() {
        return getSettingValue();
    }

    public final boolean disable() {
        if (getSettingValue() < 0) {
            return true;
        }
        return false;
    }
}

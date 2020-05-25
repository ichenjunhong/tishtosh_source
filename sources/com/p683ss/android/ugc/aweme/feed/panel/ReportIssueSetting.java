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
/* renamed from: com.ss.android.ugc.aweme.feed.panel.ReportIssueSetting */
public final class ReportIssueSetting {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ReportIssueSetting.class), "enable", "getEnable()Z"))};
    @C10179b
    public static final boolean CLOSE = false;
    public static final ReportIssueSetting INSTANCE = new ReportIssueSetting();
    private static final C52668f enable$delegate = C52732g.m112285a(C30591a.f79898a);

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.ReportIssueSetting$a */
    static final class C30591a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C30591a f79898a = new C30591a();

        C30591a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C10193n.m20607a().mo18204a(ReportIssueSetting.class, "dmt_fix_full_video_black_issue_parent_report", C10181b.m20511a().mo18175c().getDmtFixFullVideoBlackIssueParentReport(), false));
        }
    }

    private ReportIssueSetting() {
    }

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}

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
/* renamed from: com.ss.android.ugc.aweme.feed.panel.MaxParentNumbersToCount */
public final class MaxParentNumbersToCount {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MaxParentNumbersToCount.class), "maxNumber", "getMaxNumber()I"))};
    @C10179b
    public static final int DEFAULT = 20;
    public static final MaxParentNumbersToCount INSTANCE = new MaxParentNumbersToCount();
    private static final C52668f maxNumber$delegate = C52732g.m112285a(C30590a.f79897a);

    /* renamed from: com.ss.android.ugc.aweme.feed.panel.MaxParentNumbersToCount$a */
    static final class C30590a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C30590a f79897a = new C30590a();

        C30590a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C10193n.m20607a().mo18200a(MaxParentNumbersToCount.class, "dmt_fix_full_video_black_issue_parent_count", C10181b.m20511a().mo18175c().getDmtFixFullVideoBlackIssueParentCount(), 20));
        }
    }

    private MaxParentNumbersToCount() {
    }

    public final int getMaxNumber() {
        return ((Number) maxNumber$delegate.getValue()).intValue();
    }
}

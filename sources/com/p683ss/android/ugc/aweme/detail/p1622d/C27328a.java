package com.p683ss.android.ugc.aweme.detail.p1622d;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23641a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.d.a */
public final class C27328a extends C23641a {

    /* renamed from: a */
    private final FragmentActivity f72076a;

    public C27328a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f72076a = fragmentActivity;
    }

    /* renamed from: a */
    public final boolean mo49061a(int i) {
        boolean z;
        if (i == -1 && C32969a.m75907a(this.f72076a).mo69868b("page_feed")) {
            Aweme a = AwemeChangeCallBack.m82601a(this.f72076a);
            if (a == null || a.getAuthor() == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }
}

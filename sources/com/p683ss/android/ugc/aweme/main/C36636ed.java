package com.p683ss.android.ugc.aweme.main;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23699m;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.profile.C39940m;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39798b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.main.ed */
public final class C36636ed implements C36670n {

    /* renamed from: a */
    private Context f93751a;

    /* renamed from: b */
    private ScrollableViewPager f93752b;

    /* renamed from: c */
    private C23699m f93753c;

    /* renamed from: d */
    private ScrollSwitchStateManager f93754d;

    /* renamed from: e */
    private HomePageDataViewModel f93755e;

    /* renamed from: a */
    public final boolean mo75735a() {
        return m82538b(null);
    }

    /* renamed from: b */
    private boolean m82537b() {
        boolean z;
        boolean b = this.f93754d.mo69868b("page_feed");
        boolean z2 = this.f93754d.mo69873d("page_feed") instanceof MainPageFragment;
        if (this.f93753c == null || !z2) {
            z = false;
        } else {
            z = true;
        }
        if (!b || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75734a(Boolean bool) {
        m82538b(null);
    }

    /* renamed from: a */
    public final void mo75732a(C0997e eVar) {
        if (this.f93752b != null) {
            this.f93752b.mo2957a(eVar);
        }
    }

    /* renamed from: b */
    private boolean m82538b(Boolean bool) {
        C47718bf.m103288a(new C39798b());
        if (this.f93752b != null) {
            if (!this.f93754d.mo69868b("page_feed")) {
                if (bool != null) {
                    this.f93754d.mo69860a("page_feed", bool.booleanValue());
                } else {
                    this.f93754d.mo69859a("page_feed");
                }
                return true;
            } else if (!m82537b()) {
                return this.f93754d.mo69873d("page_feed") instanceof MainPageFragment;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo75733a(Aweme aweme, String str) {
        if (this.f93752b != null) {
            this.f93755e.f85657k = true;
            C23689d d = this.f93754d.mo69873d("page_profile");
            if (d instanceof C39940m) {
                C39940m mVar = (C39940m) d;
                mVar.mo81073a(str);
                mVar.mo81070a(this.f93755e.f85657k);
            }
            this.f93754d.mo69860a("page_profile", true);
        }
        C2667b.m7668c(C22858c.f61207c, C22858c.f61205a, 0);
    }

    public C36636ed(Context context, ScrollableViewPager scrollableViewPager, C23699m mVar) {
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            this.f93754d = ScrollSwitchStateManager.m75876a(fragmentActivity);
            this.f93755e = HomePageDataViewModel.m75866a(fragmentActivity);
        }
        this.f93751a = context;
        this.f93752b = scrollableViewPager;
        this.f93753c = mVar;
    }
}

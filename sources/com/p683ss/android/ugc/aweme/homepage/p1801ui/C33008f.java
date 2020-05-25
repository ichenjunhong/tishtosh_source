package com.p683ss.android.ugc.aweme.homepage.p1801ui;

import android.arch.lifecycle.C0198r;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32971a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.main.TabChangeManager.C36481a;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.f */
public final class C33008f {

    /* renamed from: a */
    public FragmentTabHost f85728a;

    /* renamed from: b */
    public TabChangeManager f85729b;

    /* renamed from: c */
    public ScrollSwitchStateManager f85730c;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.f$a */
    public static final class C33009a extends C0198r<Fragment> {

        /* renamed from: a */
        final /* synthetic */ C33008f f85731a;

        public final /* synthetic */ Object getValue() {
            TabChangeManager tabChangeManager = this.f85731a.f85729b;
            if (tabChangeManager != null) {
                return tabChangeManager.mo75609a();
            }
            return null;
        }

        public C33009a(C33008f fVar) {
            this.f85731a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.f$b */
    public static final class C33010b implements C36481a {

        /* renamed from: a */
        final /* synthetic */ C33008f f85732a;

        public C33010b(C33008f fVar) {
            this.f85732a = fVar;
        }

        /* renamed from: a */
        public final void mo69927a(String str) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f85732a.f85730c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f85674g = str;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.f$c */
    public static final class C33011c implements C32971a {

        /* renamed from: a */
        final /* synthetic */ C33008f f85733a;

        public C33011c(C33008f fVar) {
            this.f85733a = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.f$d */
    public static final class C33012d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11079a f85734a;

        public C33012d(C11079a aVar) {
            this.f85734a = aVar;
        }

        public final void run() {
            HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().runInTabHostRunnable(this.f85734a);
        }
    }
}

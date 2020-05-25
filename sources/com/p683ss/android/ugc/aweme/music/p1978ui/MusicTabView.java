package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10736b;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView */
public final class MusicTabView {

    /* renamed from: a */
    int f95663a;

    /* renamed from: b */
    final View f95664b;

    /* renamed from: c */
    private final boolean f95665c;
    public DmtTabLayout tabLayout;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView$a */
    static final class C37485a implements C10736b {

        /* renamed from: a */
        public static final C37485a f95666a = new C37485a();

        C37485a() {
        }

        /* renamed from: a */
        public final void mo19399a(C10742f fVar) {
            fVar.mo19417a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.MusicTabView$b */
    public static final class C37486b implements C10737c {

        /* renamed from: a */
        final /* synthetic */ MusicTabView f95667a;

        C37486b(MusicTabView musicTabView) {
            this.f95667a = musicTabView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b3, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19400a(com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x00b4
                com.ss.android.ugc.aweme.music.ui.MusicTabView r0 = r3.f95667a
                int r4 = r4.f28860e
                switch(r4) {
                    case 0: goto L_0x0082;
                    case 1: goto L_0x0033;
                    case 2: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x00b3
            L_0x000b:
                int r4 = r0.f95663a
                r1 = 2
                if (r4 == r1) goto L_0x00b3
                r0.mo77026a(r1)
                com.ss.android.ugc.aweme.music.c.i r4 = new com.ss.android.ugc.aweme.music.c.i
                r4.<init>(r1)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r4)
                com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c.m60733e()
                java.lang.String r4 = "change_music_tab"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "tab_name"
                java.lang.String r2 = "local_song"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
                goto L_0x00b3
            L_0x0033:
                com.ss.android.ugc.aweme.IAccountService r4 = com.p683ss.android.ugc.aweme.AccountService.createIAccountServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.IAccountService r4 = (com.p683ss.android.ugc.aweme.IAccountService) r4
                com.ss.android.ugc.aweme.IAccountUserService r4 = r4.userService()
                java.lang.String r1 = "ServiceManager.get().get…class.java).userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r1)
                boolean r4 = r4.isLogin()
                r1 = 1
                if (r4 != 0) goto L_0x0052
                com.ss.android.ugc.aweme.music.c.a r4 = new com.ss.android.ugc.aweme.music.c.a
                r4.<init>(r1)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r4)
                goto L_0x00b3
            L_0x0052:
                int r4 = r0.f95663a
                if (r4 == r1) goto L_0x00b4
                r0.mo77026a(r1)
                com.ss.android.ugc.aweme.music.c.i r4 = new com.ss.android.ugc.aweme.music.c.i
                r4.<init>(r1)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r4)
                com.ss.android.ugc.aweme.music.c.c r4 = new com.ss.android.ugc.aweme.music.c.c
                java.lang.String r0 = "music_collection"
                r4.<init>(r0)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103289b(r4)
                com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c.m60727b(r1)
                java.lang.String r4 = "change_music_tab"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "tab_name"
                java.lang.String r2 = "favorite_song"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
                goto L_0x00b4
            L_0x0082:
                int r4 = r0.f95663a
                if (r4 == 0) goto L_0x00b4
                r4 = 0
                r0.mo77026a(r4)
                com.ss.android.ugc.aweme.music.c.i r0 = new com.ss.android.ugc.aweme.music.c.i
                r0.<init>(r4)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
                com.ss.android.ugc.aweme.music.c.c r0 = new com.ss.android.ugc.aweme.music.c.c
                java.lang.String r1 = "popular_song"
                r0.<init>(r1)
                com.p683ss.android.ugc.aweme.utils.C47718bf.m103289b(r0)
                com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c.m60727b(r4)
                java.lang.String r4 = "change_music_tab"
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "tab_name"
                java.lang.String r2 = "popular_song"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
                goto L_0x00b4
            L_0x00b3:
                return
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.MusicTabView.C37486b.mo19400a(com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f):void");
        }
    }

    /* renamed from: a */
    public final void mo77026a(int i) {
        this.f95663a = i;
        DmtTabLayout dmtTabLayout = this.tabLayout;
        if (dmtTabLayout == null) {
            C52711k.m112237a("tabLayout");
        }
        C10742f b = dmtTabLayout.mo19357b(i);
        if (b != null) {
            b.mo19417a();
        }
    }

    public MusicTabView(View view, boolean z) {
        boolean z2;
        C52711k.m112240b(view, "view");
        this.f95664b = view;
        this.f95665c = z;
        ButterKnife.bind((Object) this, this.f95664b);
        DmtTabLayout dmtTabLayout = this.tabLayout;
        if (dmtTabLayout == null) {
            C52711k.m112237a("tabLayout");
        }
        C10742f a = dmtTabLayout.mo19344a((int) R.layout.xi);
        C52711k.m112236a((Object) a, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
        a.mo19418b(R.string.cen);
        DmtTabLayout dmtTabLayout2 = this.tabLayout;
        if (dmtTabLayout2 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout2.mo19350a(a);
        DmtTabLayout dmtTabLayout3 = this.tabLayout;
        if (dmtTabLayout3 == null) {
            C52711k.m112237a("tabLayout");
        }
        C10742f a2 = dmtTabLayout3.mo19344a((int) R.layout.xi);
        C52711k.m112236a((Object) a2, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
        a2.mo19418b(R.string.cej);
        DmtTabLayout dmtTabLayout4 = this.tabLayout;
        if (dmtTabLayout4 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout4.mo19350a(a2);
        if (this.f95665c) {
            DmtTabLayout dmtTabLayout5 = this.tabLayout;
            if (dmtTabLayout5 == null) {
                C52711k.m112237a("tabLayout");
            }
            C10742f a3 = dmtTabLayout5.mo19344a((int) R.layout.xi);
            C52711k.m112236a((Object) a3, "tabLayout.newTab(R.layou…em_music_tab_layout_item)");
            if (C37249a.m83512c() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                a3.mo19418b(R.string.cem);
            } else {
                a3.mo19418b(R.string.cel);
            }
            DmtTabLayout dmtTabLayout6 = this.tabLayout;
            if (dmtTabLayout6 == null) {
                C52711k.m112237a("tabLayout");
            }
            dmtTabLayout6.mo19350a(a3);
        }
        DmtTabLayout dmtTabLayout7 = this.tabLayout;
        if (dmtTabLayout7 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout7.setSelectedTabIndicatorHeight(C23728o.m58241a(2.0d));
        DmtTabLayout dmtTabLayout8 = this.tabLayout;
        if (dmtTabLayout8 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout8.setTabMode(0);
        DmtTabLayout dmtTabLayout9 = this.tabLayout;
        if (dmtTabLayout9 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout9.setAutoFillWhenScrollable(true);
        DmtTabLayout dmtTabLayout10 = this.tabLayout;
        if (dmtTabLayout10 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout10.setOnTabClickListener(C37485a.f95666a);
        DmtTabLayout dmtTabLayout11 = this.tabLayout;
        if (dmtTabLayout11 == null) {
            C52711k.m112237a("tabLayout");
        }
        dmtTabLayout11.mo19349a((C10737c) new C37486b(this));
    }
}

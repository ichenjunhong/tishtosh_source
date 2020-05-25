package com.p683ss.android.ugc.aweme.discover.adapter.music;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27934y;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27729g;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27729g.C27731a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.utils.C47794cz;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.c */
public final class C27914c extends C27849b implements OnClickListener, C26908d, C27731a, C27912a, C27913b {

    /* renamed from: f */
    public static final C27915a f73313f = new C27915a(null);

    /* renamed from: c */
    public C27729g f73314c;

    /* renamed from: d */
    public String f73315d;

    /* renamed from: e */
    public final C27934y f73316e;

    /* renamed from: g */
    private final RemoteImageView f73317g;

    /* renamed from: h */
    private final ImageView f73318h;

    /* renamed from: i */
    private final TextView f73319i;

    /* renamed from: j */
    private final TextView f73320j;

    /* renamed from: k */
    private final TextView f73321k;

    /* renamed from: l */
    private final TextView f73322l;

    /* renamed from: m */
    private final TextView f73323m;

    /* renamed from: n */
    private Music f73324n;

    /* renamed from: o */
    private String f73325o;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.c$a */
    public static final class C27915a {
        private C27915a() {
        }

        public /* synthetic */ C27915a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.music.c$b */
    static final class C27916b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C27914c f73326a;

        C27916b(C27914c cVar) {
            this.f73326a = cVar;
        }

        public final void run() {
            C27914c.m66662a(this.f73326a, false, null, 2, null);
        }
    }

    /* renamed from: d */
    public final View mo56209d() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        return view;
    }

    /* renamed from: g */
    private final int m66665g() {
        if (this.f73316e != null) {
            C27934y yVar = this.f73316e;
            Music music = this.f73324n;
            if (music == null) {
                C52711k.m112234a();
            }
            int a = yVar.mo56250a(music);
            if (a >= 0) {
                return a;
            }
        }
        return getAdapterPosition();
    }

    /* renamed from: a */
    public final void mo56164a(int i) {
        switch (i) {
            case 0:
                m66662a(this, false, "click_play_music", 1, null);
                return;
            case 1:
                m66662a(this, false, "click_pause_music", 1, null);
                break;
        }
    }

    /* renamed from: a */
    public final void mo56261a(String str) {
        C52711k.m112240b(str, "enterFrom");
        this.f73325o = str;
        C27729g gVar = this.f73314c;
        if (gVar != null) {
            gVar.mo56161a(str);
        }
    }

    /* renamed from: a */
    private final void m66663a(Music music) {
        if (TextUtils.isEmpty(music.getLyricShort())) {
            this.f73323m.setVisibility(8);
            return;
        }
        this.f73323m.setVisibility(0);
        this.f73323m.setText(C23710a.m58191a(mo56271b(), mo56271b().getResources().getString(R.string.gs1, new Object[]{music.getLyricShort()}), music.getLyricShortPosition(), 3, (int) R.color.a0n));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        if (r2 == null) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
            if (r13 != 0) goto L_0x0006
            return
        L_0x0006:
            int r0 = r13.getId()
            r1 = 2132024205(0x7f141b8d, float:1.968688E38)
            r2 = 2
            if (r0 != r1) goto L_0x01a5
            boolean r13 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r13)
            if (r13 != 0) goto L_0x01a4
            com.ss.android.ugc.aweme.discover.a.g r13 = r12.f73314c
            if (r13 == 0) goto L_0x00c7
            android.support.v4.app.FragmentActivity r0 = r12.mo56273c()
            com.ss.android.ugc.aweme.music.model.Music r1 = r12.f73324n
            if (r1 != 0) goto L_0x0025
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0025:
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.lang.String r3 = "music"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper r3 = r13.f72773a
            java.lang.String r13 = r13.f72775c
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            java.lang.String r4 = "music"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r4)
            com.ss.android.ugc.aweme.music.e r4 = r3.f73985b
            if (r4 != 0) goto L_0x005c
            com.ss.android.ugc.aweme.music.e r4 = new com.ss.android.ugc.aweme.music.e
            r6 = r0
            android.content.Context r6 = (android.content.Context) r6
            r7 = 1
            r8 = 1
            r9 = 1
            java.lang.String r10 = "MusicPlayHelper"
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r3.f73985b = r4
            com.ss.android.ugc.aweme.music.e r4 = r3.f73985b
            if (r4 == 0) goto L_0x005c
            r4.f95347a = r2
        L_0x005c:
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            boolean r4 = com.p683ss.android.ugc.aweme.discover.helper.C28198g.m67092a(r2)
            if (r4 != 0) goto L_0x0070
            r13 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r13 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r2, r13)
            r13.mo19066a()
            goto L_0x00c7
        L_0x0070:
            r3.f73989f = r13
            com.ss.android.ugc.aweme.services.IExternalService r2 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r2 = (com.p683ss.android.ugc.aweme.services.IExternalService) r2
            if (r2 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.services.external.IConfigService r2 = r2.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r2 = r2.avsettingsConfig()
            boolean r2 = r2.needLoginBeforeRecord()
            if (r2 == 0) goto L_0x00a7
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2132549143(0x7f1c1e17, float:2.075158E38)
            java.lang.String r1 = r1.getString(r2)
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r2 = "click_music_shoot"
            com.ss.android.ugc.aweme.utils.ab r3 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r4 = "login_title"
            com.ss.android.ugc.aweme.utils.ab r1 = r3.mo94972a(r4, r1)
            android.os.Bundle r1 = r1.f120139a
            com.p683ss.android.ugc.aweme.login.C27965f.m66720a(r0, r13, r2, r1)
            goto L_0x00c7
        L_0x00a7:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r1.convertToMusicModel()
            r3.mo56585a()
            com.ss.android.ugc.aweme.music.e r13 = r3.f73985b
            if (r13 == 0) goto L_0x00c7
            java.lang.String r0 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b r0 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b
            r0.<init>(r3, r4)
            r5 = r0
            com.ss.android.ugc.aweme.music.service.b r5 = (com.p683ss.android.ugc.aweme.music.service.C37435b) r5
            r6 = 0
            r7 = 1
            r8 = 4
            r9 = 0
            r3 = r13
            r3.mo76656a(r4, r5, -1, true)
        L_0x00c7:
            com.ss.android.ugc.aweme.discover.mob.aj r13 = com.p683ss.android.ugc.aweme.discover.mob.C28390aj.f74551a
            java.lang.String r13 = r12.f73325o
            if (r13 != 0) goto L_0x00cf
            java.lang.String r13 = ""
        L_0x00cf:
            com.ss.android.ugc.aweme.discover.adapter.ad r0 = r12.mo56269a()
            java.lang.String r0 = r0.f73041d
            java.lang.String r1 = r12.f73315d
            com.ss.android.ugc.aweme.music.model.Music r2 = r12.f73324n
            if (r2 == 0) goto L_0x00e1
            java.lang.String r2 = r2.getMid()
            if (r2 != 0) goto L_0x00e3
        L_0x00e1:
            java.lang.String r2 = ""
        L_0x00e3:
            int r3 = r12.m66665g()
            java.lang.String r4 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r4)
            java.lang.String r4 = "labelName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            java.lang.String r4 = "searchKeyWord"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "musicId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            java.lang.String r4 = "labelName"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            int r0 = com.p683ss.android.ugc.aweme.discover.mob.C28390aj.m67370a(r0)
            if (r0 >= 0) goto L_0x0109
            java.lang.String r0 = ""
            goto L_0x0115
        L_0x0109:
            com.ss.android.ugc.aweme.discover.mob.ab r4 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.m67359d()
            java.lang.String r0 = r4.mo56813a(r0)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = ""
        L_0x0115:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r5 = r5.mo60161a(r0)
            java.lang.String r6 = "shoot"
            com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r8 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r13)
            java.lang.String r8 = "enter_method"
            java.lang.String r9 = "click_search_result"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "shoot_way"
            java.lang.String r9 = "search_music"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r9)
            java.lang.String r8 = "log_pb"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r5)
            java.lang.String r8 = "music_id"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r8, r2)
            java.lang.String r8 = "search_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r7.mo47829a(r8, r0)
            java.lang.String r7 = "creation_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r7, r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            java.lang.String r0 = "search_result_click"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r13 = r4.mo47829a(r6, r13)
            java.lang.String r4 = "token_type"
            java.lang.String r6 = "music"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r4, r6)
            java.lang.String r4 = "search_keyword"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r4, r1)
            java.lang.String r1 = "log_pb"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r1, r5)
            java.lang.String r1 = "is_aladdin"
            java.lang.String r4 = "0"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r1, r4)
            java.lang.String r1 = "rank"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47826a(r1, r3)
            java.lang.String r1 = "button_type"
            java.lang.String r3 = "click_shoot"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r1, r3)
            java.lang.String r1 = "search_result_id"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r13)
        L_0x01a4:
            return
        L_0x01a5:
            boolean r13 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75679a(r13)
            if (r13 != 0) goto L_0x02e4
            int r4 = r12.m66665g()
            com.ss.android.ugc.aweme.music.model.Music r13 = r12.f73324n
            r0 = 0
            r1 = 3
            r11 = 1
            if (r13 == 0) goto L_0x0267
            com.ss.android.ugc.aweme.music.service.IMusicService r13 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.IMusicService r13 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r13
            com.ss.android.ugc.aweme.music.model.Music r3 = r12.f73324n
            if (r3 != 0) goto L_0x01c3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01c3:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.convertToMusicModel()
            android.view.View r5 = r12.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            boolean r13 = r13.checkValidMusic(r3, r5, r11)
            if (r13 != 0) goto L_0x020e
            java.lang.String r13 = "enter_music_detail_failed"
            com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
            r0.<init>()
            java.lang.String r1 = "group_id"
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "author_id"
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "music_id"
            com.ss.android.ugc.aweme.music.model.Music r2 = r12.f73324n
            if (r2 != 0) goto L_0x01f8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01f8:
            java.lang.String r2 = r2.getMid()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r12.f73325o
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r0)
            return
        L_0x020e:
            java.lang.String r13 = r12.f73315d
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0267
            java.lang.String r13 = "click_search_music(%d-%s): %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r5 = r4 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3[r0] = r6
            com.ss.android.ugc.aweme.music.model.Music r6 = r12.f73324n
            if (r6 != 0) goto L_0x022b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x022b:
            java.lang.String r6 = r6.getMid()
            r3[r11] = r6
            com.ss.android.ugc.aweme.music.model.Music r6 = r12.f73324n
            if (r6 != 0) goto L_0x0238
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0238:
            java.lang.String r6 = r6.getMusicName()
            r3[r2] = r6
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r13 = com.C2240a.m6772a(r13, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r2)
            java.lang.String r13 = "click_search_music"
            java.lang.String r2 = "music_id"
            com.ss.android.ugc.aweme.music.model.Music r3 = r12.f73324n
            if (r3 != 0) goto L_0x0256
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0256:
            java.lang.String r3 = r3.getMid()
            java.lang.String r6 = "client_order"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.Map r2 = com.p683ss.android.ugc.aweme.utils.C47794cz.m103426a(r2, r3, r6, r5)
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r2)
        L_0x0267:
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r10 = r13.toString()
            java.lang.String r13 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r13)
            com.ss.android.ugc.aweme.router.w r13 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "aweme://music/detail/"
            r2.<init>(r3)
            com.ss.android.ugc.aweme.music.model.Music r3 = r12.f73324n
            if (r3 != 0) goto L_0x0286
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0286:
            java.lang.String r3 = r3.getMid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.router.y r2 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r2)
            java.lang.String r3 = "extra_music_from"
            java.lang.String r5 = r12.f73325o
            com.ss.android.ugc.aweme.router.y r2 = r2.mo83870a(r3, r5)
            java.lang.String r3 = "process_id"
            com.ss.android.ugc.aweme.router.y r2 = r2.mo83870a(r3, r10)
            java.lang.String r2 = r2.mo83871a()
            r13.mo83861a(r2)
            com.ss.android.ugc.aweme.discover.adapter.ad r13 = r12.f73167b
            boolean r13 = r13.f73038a
            if (r13 == 0) goto L_0x02b2
            r6 = 3
            goto L_0x02b3
        L_0x02b2:
            r6 = 1
        L_0x02b3:
            com.ss.android.ugc.aweme.discover.adapter.ad r13 = r12.f73167b
            java.lang.String r13 = r13.f73043f
            if (r13 != 0) goto L_0x02c4
            java.lang.String r13 = r12.f73315d
            java.lang.String r13 = com.p683ss.android.ugc.aweme.discover.mob.C28393ak.m67382a(r13)
            java.lang.String r1 = "SearchStatistics.getEnterMethod(keyword)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
        L_0x02c4:
            r9 = r13
            android.view.View r3 = r12.itemView
            java.lang.String r5 = r12.f73315d
            com.ss.android.ugc.aweme.music.model.Music r13 = r12.f73324n
            if (r13 != 0) goto L_0x02d0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02d0:
            java.lang.String r7 = r13.getRequestId()
            com.ss.android.ugc.aweme.music.model.Music r8 = r12.f73324n
            if (r8 != 0) goto L_0x02db
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02db:
            com.p683ss.android.ugc.aweme.discover.mob.C28393ak.m67386a(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r13 = "click_info"
            r1 = 0
            m66662a(r12, r0, r13, r11, r1)
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.music.C27914c.onClick(android.view.View):void");
    }

    /* renamed from: a */
    private final void m66664a(boolean z, String str) {
        int i;
        String str2;
        String str3;
        String str4;
        if (this.f73167b.f73038a) {
            i = 3;
        } else {
            i = 1;
        }
        String a = C28381ab.m67359d().mo56813a(i);
        String a2 = C29981aa.m70153a().mo60161a(a);
        C23089d a3 = C23089d.m56640a().mo47829a("token_type", "music");
        String str5 = "enter_from";
        if (this.f73167b.f73038a) {
            str2 = "general_search";
        } else {
            str2 = "search_result";
        }
        C23089d a4 = a3.mo47829a(str5, str2).mo47829a("impr_id", a).mo47829a("log_pb", a2).mo47829a("search_id", a).mo47829a("search_keyword", mo56269a().mo56235b()).mo47826a("rank", m66665g());
        String str6 = "search_result_id";
        Music music = this.f73324n;
        if (music != null) {
            str3 = music.getMid();
        } else {
            str3 = null;
        }
        C23089d a5 = a4.mo47829a(str6, str3).mo47829a("is_aladdin", "0");
        if (z) {
            a5.mo47829a("button_type", str);
        }
        if (z) {
            str4 = "search_result_click";
        } else {
            str4 = "search_result_show";
        }
        C26890h.m65011a(str4, a5.f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56260a(com.p683ss.android.ugc.aweme.music.model.Music r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "keyword"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            if (r12 != 0) goto L_0x0008
            return
        L_0x0008:
            r11.f73315d = r13
            com.ss.android.ugc.aweme.discover.a.g r0 = r11.f73314c
            if (r0 == 0) goto L_0x0011
            r0.mo56162b(r13)
        L_0x0011:
            r11.f73324n = r12
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r12.getCoverThumb()
            if (r13 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r13 = r11.f73317g
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.getCoverThumb()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r13, r0)
        L_0x0022:
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment> r2 = com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment.class
            r3 = 1
            java.lang.String r4 = "remove_15s_cap_music"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 1
            boolean r13 = r1.mo18172a(r2, r3, r4, r5, r6)
            if (r13 == 0) goto L_0x003f
            int r13 = r12.getPresenterDuration()
            int r13 = r13 * 1000
            java.lang.String r13 = com.p683ss.android.ugc.aweme.utils.C47902fv.m103621a(r13)
            goto L_0x0049
        L_0x003f:
            int r13 = r12.getDuration()
            int r13 = r13 * 1000
            java.lang.String r13 = com.p683ss.android.ugc.aweme.utils.C47902fv.m103621a(r13)
        L_0x0049:
            int r0 = r12.getUserCount()
            long r0 = (long) r0
            java.lang.String r0 = com.p683ss.android.ugc.aweme.i18n.C33095b.m76068a(r0)
            android.widget.TextView r1 = r11.f73321k
            android.content.Context r2 = r11.mo56271b()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r5 = 2132546830(0x7f1c150e, float:2.0746889E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r13
            r6[r3] = r0
            java.lang.String r13 = r2.getString(r5, r6)
            if (r13 == 0) goto L_0x0073
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            goto L_0x0077
        L_0x0073:
            java.lang.String r13 = ""
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
        L_0x0077:
            r1.setText(r13)
            java.lang.String r13 = r12.getMusicName()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            r0 = 8
            if (r13 != 0) goto L_0x00cb
            boolean r13 = r12.isOriginMusic()
            if (r13 == 0) goto L_0x0094
            android.widget.ImageView r13 = r11.f73318h
            r13.setVisibility(r4)
            goto L_0x0099
        L_0x0094:
            android.widget.ImageView r13 = r11.f73318h
            r13.setVisibility(r0)
        L_0x0099:
            android.widget.TextView r13 = r11.f73319i
            android.content.Context r13 = r13.getContext()
            com.ss.android.ugc.aweme.music.model.Music r1 = r11.f73324n
            if (r1 != 0) goto L_0x00a6
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a6:
            java.lang.String r1 = r1.getMusicName()
            com.ss.android.ugc.aweme.music.model.Music r2 = r11.f73324n
            if (r2 != 0) goto L_0x00b1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b1:
            java.util.List r2 = r2.getPositions()
            android.text.SpannableString r13 = com.p683ss.android.ugc.aweme.base.utils.C23710a.m58189a(r13, r1, r2)
            android.widget.TextView r1 = r11.f73319i
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r1.setText(r13)
            com.ss.android.ugc.aweme.music.service.IMusicService r13 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.IMusicService r13 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r13
            android.widget.TextView r1 = r11.f73319i
            r13.attachPartnerTag(r1, r12, r3)
        L_0x00cb:
            java.lang.String r13 = r12.getAuthorName()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x00e3
            android.widget.TextView r13 = r11.f73320j
            java.lang.String r1 = r12.getAuthorName()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r13.setText(r1)
            goto L_0x00e8
        L_0x00e3:
            android.widget.TextView r13 = r11.f73320j
            r13.setVisibility(r0)
        L_0x00e8:
            com.ss.android.ugc.aweme.discover.a.g r13 = r11.f73314c
            if (r13 == 0) goto L_0x00ef
            r13.mo56160a(r12)
        L_0x00ef:
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment> r6 = com.p683ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment.class
            r7 = 1
            java.lang.String r8 = "music_card_style"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            int r13 = r5.mo18168a(r6, r7, r8, r9, r10)
            switch(r13) {
                case 1: goto L_0x0121;
                case 2: goto L_0x0116;
                case 3: goto L_0x010d;
                default: goto L_0x0102;
            }
        L_0x0102:
            android.widget.TextView r12 = r11.f73322l
            r12.setVisibility(r0)
            android.widget.TextView r12 = r11.f73323m
            r12.setVisibility(r0)
            goto L_0x0129
        L_0x010d:
            android.widget.TextView r13 = r11.f73322l
            r13.setVisibility(r4)
            r11.m66663a(r12)
            goto L_0x0129
        L_0x0116:
            android.widget.TextView r12 = r11.f73323m
            r12.setVisibility(r0)
            android.widget.TextView r12 = r11.f73322l
            r12.setVisibility(r4)
            goto L_0x0129
        L_0x0121:
            android.widget.TextView r13 = r11.f73322l
            r13.setVisibility(r0)
            r11.m66663a(r12)
        L_0x0129:
            android.view.View r12 = r11.itemView
            com.ss.android.ugc.aweme.discover.adapter.music.c$b r13 = new com.ss.android.ugc.aweme.discover.adapter.music.c$b
            r13.<init>(r11)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            r12.post(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.music.C27914c.mo56260a(com.ss.android.ugc.aweme.music.model.Music, java.lang.String):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m66662a(C27914c cVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        cVar.m66664a(z, str);
    }

    /* renamed from: a */
    public final void mo54862a(int i, Object obj, C1352v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0 && this.f73324n != null && TextUtils.isEmpty(this.f73315d)) {
            String str = "show_search_music(%d-%s): %s";
            Object[] objArr = new Object[3];
            int g = m66665g() + 1;
            objArr[0] = Integer.valueOf(g);
            Music music = this.f73324n;
            if (music == null) {
                C52711k.m112234a();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f73324n;
            if (music2 == null) {
                C52711k.m112234a();
            }
            objArr[2] = music2.getMusicName();
            C52711k.m112236a((Object) C2240a.m6772a(str, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
            String str2 = "show_search_music";
            String str3 = "music_id";
            Music music3 = this.f73324n;
            if (music3 == null) {
                C52711k.m112234a();
            }
            C26890h.m65011a(str2, C47794cz.m103426a(str3, music3.getMid(), "client_order", String.valueOf(g)));
        }
    }
}

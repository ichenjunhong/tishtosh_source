package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.adapter.music.C27912a;
import com.p683ss.android.ugc.aweme.discover.adapter.music.C27913b;
import com.p683ss.android.ugc.aweme.discover.adapter.music.SearchMusicDepentServiceImpl;
import com.p683ss.android.ugc.aweme.discover.mixfeed.p1656c.C28310a;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27729g;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.service.IMusicService;
import com.p683ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47794cz;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.az */
public final class C27840az extends C27849b implements C26908d, C27912a, C27913b {

    /* renamed from: k */
    public static final C27845a f73131k = new C27845a(null);

    /* renamed from: c */
    public Music f73132c;

    /* renamed from: d */
    public String f73133d;

    /* renamed from: e */
    public String f73134e = "";

    /* renamed from: f */
    public boolean f73135f;

    /* renamed from: g */
    public C28310a f73136g;

    /* renamed from: h */
    public int f73137h = -1;

    /* renamed from: i */
    public final C27846b f73138i;

    /* renamed from: j */
    public final C27934y f73139j;

    /* renamed from: l */
    private final ImageView f73140l;

    /* renamed from: m */
    private final SmartRoundImageView f73141m;

    /* renamed from: n */
    private final ImageView f73142n;

    /* renamed from: o */
    private final TextView f73143o;

    /* renamed from: p */
    private final TextView f73144p;

    /* renamed from: q */
    private final TextView f73145q;

    /* renamed from: r */
    private final TextView f73146r;

    /* renamed from: s */
    private final RecyclerView f73147s;

    /* renamed from: t */
    private C27729g f73148t = new C27729g(this.f73140l, mo56273c(), this.f73139j, (C52670a<C52860x>) new C52670a<C52860x>(this) {

        /* renamed from: a */
        final /* synthetic */ C27840az f73149a;

        {
            this.f73149a = r1;
        }

        public final /* synthetic */ Object invoke() {
            String str;
            if (this.f73149a.f73135f) {
                str = "click_pause_music";
            } else {
                str = "click_play_music";
            }
            final String str2 = str;
            final C28310a aVar = this.f73149a.f73136g;
            final Music music = this.f73149a.f73132c;
            final int i = this.f73149a.f73137h;
            C278421 r1 = new Callable<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C278411 f73150a;

                {
                    this.f73150a = r1;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
                    if (r4 == null) goto L_0x0026;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object call() {
                    /*
                        r6 = this;
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r0 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r0 = r0.f73149a
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r1 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r1 = r1.f73149a
                        java.util.Map r1 = r1.mo56210e()
                        r2 = 0
                        if (r1 == 0) goto L_0x00f7
                        java.lang.String r3 = "token_type"
                        java.lang.String r4 = "music"
                        r1.put(r3, r4)
                        java.lang.String r3 = "search_result_id"
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r4 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73149a
                        com.ss.android.ugc.aweme.music.model.Music r4 = r4.f73132c
                        if (r4 == 0) goto L_0x0026
                        java.lang.String r4 = r4.getMid()
                        if (r4 != 0) goto L_0x0028
                    L_0x0026:
                        java.lang.String r4 = ""
                    L_0x0028:
                        r1.put(r3, r4)
                        java.lang.String r3 = "is_aladdin"
                        java.lang.String r4 = "0"
                        r1.put(r3, r4)
                        java.lang.String r3 = "rank"
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r4 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73149a
                        int r4 = r4.getAdapterPosition()
                        java.lang.String r4 = java.lang.String.valueOf(r4)
                        r1.put(r3, r4)
                        java.lang.String r3 = "enter_from"
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r4 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73149a
                        java.lang.String r4 = r4.f73133d
                        if (r4 != 0) goto L_0x004f
                        java.lang.String r4 = "search_result"
                    L_0x004f:
                        r1.put(r3, r4)
                        java.lang.String r3 = "button_type"
                        java.lang.String r4 = r3
                        r1.put(r3, r4)
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r3 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r3 = r3.f73149a
                        com.ss.android.ugc.aweme.music.model.Music r3 = r3.f73132c
                        if (r3 == 0) goto L_0x0066
                        java.util.List r3 = r3.getMusicTags()
                        goto L_0x0067
                    L_0x0066:
                        r3 = r2
                    L_0x0067:
                        if (r3 == 0) goto L_0x0095
                        java.lang.String r3 = "music_tag_info"
                        com.ss.android.ugc.aweme.utils.GsonProvider r4 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()
                        java.lang.String r5 = "GsonProvider.get()"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                        com.google.gson.f r4 = r4.getGson()
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r5 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r5 = r5.f73149a
                        com.ss.android.ugc.aweme.music.model.Music r5 = r5.f73132c
                        if (r5 == 0) goto L_0x0084
                        java.util.List r2 = r5.getMusicTags()
                    L_0x0084:
                        if (r2 != 0) goto L_0x0089
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0089:
                        java.lang.String r2 = r4.mo34889b(r2)
                        java.lang.String r4 = "GsonProvider.get().gson.…Json(mMusic?.musicTags!!)"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
                        r1.put(r3, r2)
                    L_0x0095:
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r2 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r2 = r2.f73149a
                        java.lang.String r2 = r2.f73133d
                        java.lang.String r3 = "search_result"
                        boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                        if (r2 == 0) goto L_0x00c6
                        com.ss.android.ugc.aweme.discover.mob.ab r2 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.f74518i
                        r3 = 1
                        java.lang.String r2 = r2.mo56813a(r3)
                        com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                        java.lang.String r3 = r3.mo60161a(r2)
                        java.lang.String r4 = "search_id"
                        if (r2 != 0) goto L_0x00b8
                        java.lang.String r2 = ""
                    L_0x00b8:
                        r1.put(r4, r2)
                        java.lang.String r2 = "log_pb"
                        java.lang.String r4 = "logPb"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                        r1.put(r2, r3)
                        goto L_0x00f8
                    L_0x00c6:
                        com.ss.android.ugc.aweme.discover.adapter.az$1 r2 = r6.f73150a
                        com.ss.android.ugc.aweme.discover.adapter.az r2 = r2.f73149a
                        java.lang.String r2 = r2.f73133d
                        java.lang.String r3 = "general_search"
                        boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                        if (r2 == 0) goto L_0x00f8
                        com.ss.android.ugc.aweme.discover.mixfeed.c.a r2 = r4
                        if (r2 == 0) goto L_0x00f8
                        com.ss.android.ugc.aweme.music.model.Music r2 = r5
                        com.ss.android.ugc.aweme.discover.mixfeed.c.a r3 = r4
                        com.p683ss.android.ugc.aweme.discover.adapter.C27840az.m66585a(r1, r2, r3)
                        java.lang.String r2 = "aladdin_button_type"
                        java.lang.String r3 = r3
                        r1.put(r2, r3)
                        java.lang.String r2 = "aladdin_rank"
                        int r3 = r6
                        java.lang.String r3 = java.lang.String.valueOf(r3)
                        r1.put(r2, r3)
                        java.lang.String r2 = "button_type"
                        r1.remove(r2)
                        goto L_0x00f8
                    L_0x00f7:
                        r1 = r2
                    L_0x00f8:
                        r0.mo56272b(r1)
                        d.x r0 = p2628d.C52860x.f131107a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C278411.C278421.call():java.lang.Object");
                }
            };
            C0013i.m18a((Callable<TResult>) r1, (Executor) C26890h.m65003a());
            this.f73149a.f73135f = !this.f73149a.f73135f;
            return C52860x.f131107a;
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.az$a */
    public static final class C27845a {
        private C27845a() {
        }

        public /* synthetic */ C27845a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C27840az m66591a(ViewGroup viewGroup, C27846b bVar, C27934y yVar) {
            C52711k.m112240b(viewGroup, "parent");
            return new C27840az(C41457i.f105090b.mo84196a(viewGroup, R.layout.bsj), bVar, yVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.az$b */
    public interface C27846b {
        /* renamed from: a */
        void mo56266a(Music music, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.az$c */
    public static final class C27847c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27840az f73161a;

        C27847c(C27840az azVar) {
            this.f73161a = azVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73161a.itemView.performClick();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.az$d */
    static final class C27848d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27840az f73162a;

        /* renamed from: b */
        final /* synthetic */ Music f73163b;

        /* renamed from: c */
        final /* synthetic */ int f73164c;

        /* renamed from: d */
        final /* synthetic */ C28310a f73165d;

        C27848d(C27840az azVar, Music music, int i, C28310a aVar) {
            this.f73162a = azVar;
            this.f73163b = music;
            this.f73164c = i;
            this.f73165d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r4 == null) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.discover.adapter.az r0 = r6.f73162a
                com.ss.android.ugc.aweme.discover.adapter.az r1 = r6.f73162a
                java.util.Map r1 = r1.mo56210e()
                r2 = 0
                if (r1 == 0) goto L_0x00b0
                java.lang.String r3 = "token_type"
                java.lang.String r4 = "music"
                r1.put(r3, r4)
                java.lang.String r3 = "enter_from"
                com.ss.android.ugc.aweme.discover.adapter.az r4 = r6.f73162a
                java.lang.String r4 = r4.f73133d
                if (r4 != 0) goto L_0x001c
                java.lang.String r4 = "search_result"
            L_0x001c:
                r1.put(r3, r4)
                java.lang.String r3 = "search_result_id"
                com.ss.android.ugc.aweme.music.model.Music r4 = r6.f73163b
                if (r4 == 0) goto L_0x002b
                java.lang.String r4 = r4.getMid()
                if (r4 != 0) goto L_0x002d
            L_0x002b:
                java.lang.String r4 = ""
            L_0x002d:
                r1.put(r3, r4)
                java.lang.String r3 = "is_aladdin"
                java.lang.String r4 = "0"
                r1.put(r3, r4)
                java.lang.String r3 = "rank"
                int r4 = r6.f73164c
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.put(r3, r4)
                java.lang.String r3 = "enter_from"
                com.ss.android.ugc.aweme.discover.adapter.az r4 = r6.f73162a
                java.lang.String r4 = r4.f73133d
                if (r4 != 0) goto L_0x004c
                java.lang.String r4 = "search_result"
            L_0x004c:
                r1.put(r3, r4)
                com.ss.android.ugc.aweme.music.model.Music r3 = r6.f73163b
                if (r3 == 0) goto L_0x0058
                java.util.List r3 = r3.getMusicTags()
                goto L_0x0059
            L_0x0058:
                r3 = r2
            L_0x0059:
                if (r3 == 0) goto L_0x008d
                com.ss.android.ugc.aweme.music.model.Music r3 = r6.f73163b
                if (r3 == 0) goto L_0x0064
                java.util.List r3 = r3.getMusicTags()
                goto L_0x0065
            L_0x0064:
                r3 = r2
            L_0x0065:
                int r3 = r3.size()
                if (r3 <= 0) goto L_0x008d
                java.lang.String r3 = "music_tag_info"
                com.ss.android.ugc.aweme.utils.GsonProvider r4 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()
                com.google.gson.f r4 = r4.getGson()
                com.ss.android.ugc.aweme.music.model.Music r5 = r6.f73163b
                if (r5 == 0) goto L_0x007d
                java.util.List r2 = r5.getMusicTags()
            L_0x007d:
                if (r2 != 0) goto L_0x0082
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0082:
                java.lang.String r2 = r4.mo34889b(r2)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r1.put(r3, r2)
            L_0x008d:
                com.ss.android.ugc.aweme.discover.adapter.az r2 = r6.f73162a
                java.lang.String r2 = r2.f73133d
                java.lang.String r3 = "general_search"
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                if (r2 == 0) goto L_0x00b1
                com.ss.android.ugc.aweme.discover.mixfeed.c.a r2 = r6.f73165d
                if (r2 == 0) goto L_0x00b1
                com.ss.android.ugc.aweme.music.model.Music r2 = r6.f73163b
                com.ss.android.ugc.aweme.discover.mixfeed.c.a r3 = r6.f73165d
                com.p683ss.android.ugc.aweme.discover.adapter.C27840az.m66585a(r1, r2, r3)
                java.lang.String r2 = "aladdin_rank"
                int r3 = r6.f73164c
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r1.put(r2, r3)
                goto L_0x00b1
            L_0x00b0:
                r1 = r2
            L_0x00b1:
                r0.mo56208a(r1)
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C27848d.call():java.lang.Object");
        }
    }

    /* renamed from: d */
    public final View mo56209d() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        return view;
    }

    /* renamed from: g */
    public final int mo56262g() {
        if (!(this.f73139j == null || this.f73132c == null)) {
            C27934y yVar = this.f73139j;
            Music music = this.f73132c;
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
    public final void mo56261a(String str) {
        C52711k.m112240b(str, "enterFrom");
        this.f73133d = str;
        C27729g gVar = this.f73148t;
        if (gVar != null) {
            gVar.mo56161a(str);
        }
    }

    /* renamed from: a */
    public final void mo56260a(Music music, String str) {
        C52711k.m112240b(str, "keyword");
        if (music != null) {
            this.f73134e = str;
            C27729g gVar = this.f73148t;
            if (gVar != null) {
                gVar.mo56162b(str);
            }
            this.f73132c = music;
            if (music.getCoverThumb() != null) {
                C12203q.m24645a((Object) C23608p.m57874a(music.getCoverThumb())).mo23125b(C47788ct.m103417a(301)).mo23118a("SearchMusicViewHolder").mo23116a((C12197k) this.f73141m).mo23121a();
            }
            if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
                this.f73146r.setText(C47902fv.m103621a(music.getPresenterDuration() * 1000));
            } else {
                this.f73146r.setText(C47902fv.m103621a(music.getDuration() * 1000));
            }
            this.f73145q.setText(C33095b.m76068a((long) music.getUserCount()));
            if (!TextUtils.isEmpty(music.getMusicName())) {
                if (music.isOriginMusic()) {
                    this.f73142n.setVisibility(0);
                } else {
                    this.f73142n.setVisibility(8);
                }
                Context context = this.f73143o.getContext();
                Music music2 = this.f73132c;
                if (music2 == null) {
                    C52711k.m112234a();
                }
                String musicName = music2.getMusicName();
                Music music3 = this.f73132c;
                if (music3 == null) {
                    C52711k.m112234a();
                }
                this.f73143o.setText(C23710a.m58189a(context, musicName, music3.getPositions()));
                MusicService.createIMusicServicebyMonsterPlugin().attachPartnerTag(this.f73143o, music, true);
            }
            if (!TextUtils.isEmpty(music.getAuthorName())) {
                this.f73144p.setText(music.getAuthorName());
            } else {
                this.f73144p.setVisibility(8);
            }
            C27729g gVar2 = this.f73148t;
            if (gVar2 != null) {
                gVar2.mo56160a(music);
            }
            if (music.getMusicTags() == null || music.getMusicTags().size() <= 0) {
                this.f73147s.setVisibility(8);
                RecyclerView recyclerView = this.f73147s;
                if (recyclerView != null) {
                    recyclerView.removeAllViews();
                }
            } else {
                ISearchMusicDepentService createISearchMusicDepentServicebyMonsterPlugin = SearchMusicDepentServiceImpl.createISearchMusicDepentServicebyMonsterPlugin();
                RecyclerView recyclerView2 = this.f73147s;
                List musicTags = music.getMusicTags();
                if (musicTags == null) {
                    C52711k.m112234a();
                }
                createISearchMusicDepentServicebyMonsterPlugin.showSearchMusicTags(recyclerView2, musicTags, new C27847c(this));
            }
            this.f73137h = mo56262g();
            C0013i.m18a((Callable<TResult>) new C27848d<TResult>(this, music, this.f73137h, this.f73136g), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public static void m66585a(Map<String, String> map, Music music, C28310a aVar) {
        String str;
        if (map != null && music != null && aVar != null) {
            String str2 = "search_result_id";
            String searchResultId = aVar.getSearchResultId();
            if (searchResultId == null) {
                searchResultId = "";
            }
            map.put(str2, searchResultId);
            String str3 = "is_aladdin";
            if (aVar.isAladdin()) {
                str = "1";
            } else {
                str = "0";
            }
            map.put(str3, str);
            map.put("rank", String.valueOf(aVar.getRank()));
            String str4 = "token_type";
            String tokenType = aVar.getTokenType();
            if (tokenType == null) {
                tokenType = "";
            }
            map.put(str4, tokenType);
            map.put("list_result_type", "top_song");
            String mid = music.getMid();
            C52711k.m112236a((Object) mid, "music.mid");
            map.put("list_item_id", mid);
            String musicName = music.getMusicName();
            C52711k.m112236a((Object) musicName, "music.musicName");
            map.put("aladdin_words", musicName);
        }
    }

    public C27840az(final View view, C27846b bVar, C27934y yVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73138i = bVar;
        this.f73139j = yVar;
        View findViewById = view.findViewById(R.id.b39);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_play_status)");
        this.f73140l = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ay2);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.f73141m = (SmartRoundImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b2v);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.iv_original_tag)");
        this.f73142n = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.dci);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_music_title)");
        this.f73143o = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dcc);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.tv_music_author)");
        this.f73144p = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.di9);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.tv_used_count)");
        this.f73145q = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.dcf);
        C52711k.m112236a((Object) findViewById7, "itemView.findViewById(R.id.tv_music_duration)");
        this.f73146r = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.emg);
        C52711k.m112236a((Object) findViewById8, "itemView.findViewById(R.id.music_tags_container)");
        this.f73147s = (RecyclerView) findViewById8;
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C27840az f73155a;

            {
                this.f73155a = r1;
            }

            public final void onClick(View view) {
                String str;
                int i;
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view)) {
                    int g = this.f73155a.mo56262g();
                    if (this.f73155a.f73132c != null) {
                        IMusicService createIMusicServicebyMonsterPlugin = MusicService.createIMusicServicebyMonsterPlugin();
                        Music music = this.f73155a.f73132c;
                        if (music == null) {
                            C52711k.m112234a();
                        }
                        if (!createIMusicServicebyMonsterPlugin.checkValidMusic(music.convertToMusicModel(), view.getContext(), true)) {
                            String str2 = "enter_music_detail_failed";
                            C23089d a = new C23089d().mo47829a("group_id", "").mo47829a("author_id", "");
                            String str3 = "music_id";
                            Music music2 = this.f73155a.f73132c;
                            if (music2 == null) {
                                C52711k.m112234a();
                            }
                            C26890h.m65011a(str2, a.mo47829a(str3, music2.getMid()).mo47829a("enter_from", this.f73155a.f73133d).f61491a);
                            return;
                        }
                        if (TextUtils.isEmpty(this.f73155a.f73134e)) {
                            String str4 = "click_search_music(%d-%s): %s";
                            Object[] objArr = new Object[3];
                            int i2 = g + 1;
                            objArr[0] = Integer.valueOf(i2);
                            Music music3 = this.f73155a.f73132c;
                            if (music3 == null) {
                                C52711k.m112234a();
                            }
                            objArr[1] = music3.getMid();
                            Music music4 = this.f73155a.f73132c;
                            if (music4 == null) {
                                C52711k.m112234a();
                            }
                            objArr[2] = music4.getMusicName();
                            C52711k.m112236a((Object) C2240a.m6772a(str4, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
                            String str5 = "click_search_music";
                            String str6 = "music_id";
                            Music music5 = this.f73155a.f73132c;
                            if (music5 == null) {
                                C52711k.m112234a();
                            }
                            C26890h.m65011a(str5, C47794cz.m103426a(str6, music5.getMid(), "client_order", Integer.toString(i2)));
                        }
                        final C28310a aVar = this.f73155a.f73136g;
                        final Music music6 = this.f73155a.f73132c;
                        final int i3 = this.f73155a.f73137h;
                        C0013i.m18a((Callable<TResult>) new Callable<C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C278432 f73157a;

                            {
                                this.f73157a = r1;
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
                                if (r4 == null) goto L_0x0035;
                             */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ java.lang.Object call() {
                                /*
                                    r6 = this;
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r0 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r0 = r0.f73155a
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r1 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r1 = r1.f73155a
                                    java.util.Map r1 = r1.mo56210e()
                                    r2 = 0
                                    if (r1 == 0) goto L_0x00ec
                                    java.lang.String r3 = "token_type"
                                    java.lang.String r4 = "music"
                                    r1.put(r3, r4)
                                    java.lang.String r3 = "enter_from"
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r4 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73155a
                                    java.lang.String r4 = r4.f73133d
                                    if (r4 != 0) goto L_0x0022
                                    java.lang.String r4 = "search_result"
                                L_0x0022:
                                    r1.put(r3, r4)
                                    java.lang.String r3 = "search_result_id"
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r4 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73155a
                                    com.ss.android.ugc.aweme.music.model.Music r4 = r4.f73132c
                                    if (r4 == 0) goto L_0x0035
                                    java.lang.String r4 = r4.getMid()
                                    if (r4 != 0) goto L_0x0037
                                L_0x0035:
                                    java.lang.String r4 = ""
                                L_0x0037:
                                    r1.put(r3, r4)
                                    java.lang.String r3 = "is_aladdin"
                                    java.lang.String r4 = "0"
                                    r1.put(r3, r4)
                                    java.lang.String r3 = "rank"
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r4 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r4 = r4.f73155a
                                    int r4 = r4.getAdapterPosition()
                                    java.lang.String r4 = java.lang.String.valueOf(r4)
                                    r1.put(r3, r4)
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r3 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r3 = r3.f73155a
                                    com.ss.android.ugc.aweme.music.model.Music r3 = r3.f73132c
                                    if (r3 == 0) goto L_0x005f
                                    java.util.List r3 = r3.getMusicTags()
                                    goto L_0x0060
                                L_0x005f:
                                    r3 = r2
                                L_0x0060:
                                    if (r3 == 0) goto L_0x0088
                                    java.lang.String r3 = "music_tag_info"
                                    com.ss.android.ugc.aweme.utils.GsonProvider r4 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()
                                    com.google.gson.f r4 = r4.getGson()
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r5 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r5 = r5.f73155a
                                    com.ss.android.ugc.aweme.music.model.Music r5 = r5.f73132c
                                    if (r5 == 0) goto L_0x0078
                                    java.util.List r2 = r5.getMusicTags()
                                L_0x0078:
                                    if (r2 != 0) goto L_0x007d
                                    p2628d.p2639f.p2641b.C52711k.m112234a()
                                L_0x007d:
                                    java.lang.String r2 = r4.mo34889b(r2)
                                    java.lang.String r2 = java.lang.String.valueOf(r2)
                                    r1.put(r3, r2)
                                L_0x0088:
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r2 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r2 = r2.f73155a
                                    java.lang.String r2 = r2.f73133d
                                    java.lang.String r3 = "search_result"
                                    boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                                    if (r2 == 0) goto L_0x00c0
                                    com.ss.android.ugc.aweme.discover.mob.ab r2 = com.p683ss.android.ugc.aweme.discover.mob.C28381ab.f74518i
                                    r3 = 1
                                    java.lang.String r2 = r2.mo56813a(r3)
                                    com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                                    java.lang.String r3 = r3.mo60161a(r2)
                                    java.lang.String r4 = "search_id"
                                    if (r2 != 0) goto L_0x00ab
                                    java.lang.String r2 = ""
                                L_0x00ab:
                                    r1.put(r4, r2)
                                    java.lang.String r2 = "log_pb"
                                    java.lang.String r4 = "logPb"
                                    p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                                    r1.put(r2, r3)
                                    java.lang.String r2 = "button_type"
                                    java.lang.String r3 = "click_info"
                                    r1.put(r2, r3)
                                    goto L_0x00ed
                                L_0x00c0:
                                    com.ss.android.ugc.aweme.discover.adapter.az$2 r2 = r6.f73157a
                                    com.ss.android.ugc.aweme.discover.adapter.az r2 = r2.f73155a
                                    java.lang.String r2 = r2.f73133d
                                    java.lang.String r3 = "general_search"
                                    boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
                                    if (r2 == 0) goto L_0x00ed
                                    com.ss.android.ugc.aweme.discover.mixfeed.c.a r2 = r9
                                    if (r2 == 0) goto L_0x00ed
                                    com.ss.android.ugc.aweme.music.model.Music r2 = r3
                                    com.ss.android.ugc.aweme.discover.mixfeed.c.a r3 = r9
                                    com.p683ss.android.ugc.aweme.discover.adapter.C27840az.m66585a(r1, r2, r3)
                                    java.lang.String r2 = "aladdin_button_type"
                                    java.lang.String r3 = "click_music"
                                    r1.put(r2, r3)
                                    java.lang.String r2 = "aladdin_rank"
                                    int r3 = r4
                                    java.lang.String r3 = java.lang.String.valueOf(r3)
                                    r1.put(r2, r3)
                                    goto L_0x00ed
                                L_0x00ec:
                                    r1 = r2
                                L_0x00ed:
                                    r0.mo56272b(r1)
                                    d.x r0 = p2628d.C52860x.f131107a
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27840az.C278432.C278441.call():java.lang.Object");
                            }
                        }, (Executor) C26890h.m65003a());
                    }
                    String uuid = UUID.randomUUID().toString();
                    C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.f73155a.mo56271b(), "//music/detail");
                    String str7 = "id";
                    Music music7 = this.f73155a.f73132c;
                    if (music7 != null) {
                        str = music7.getMid();
                    } else {
                        str = null;
                    }
                    buildRoute.withParam(str7, str).withParam("extra_music_from", this.f73155a.f73133d).withParam("process_id", uuid).open();
                    if (this.f73155a.f73138i == null) {
                        if (this.f73155a.f73167b.f73038a) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        String str8 = this.f73155a.f73167b.f73043f;
                        if (str8 == null) {
                            str8 = C28393ak.m67382a(this.f73155a.f73134e);
                            C52711k.m112236a((Object) str8, "SearchStatistics.getEnterMethod(keyword)");
                        }
                        String str9 = str8;
                        View view2 = view;
                        String str10 = this.f73155a.f73134e;
                        Music music8 = this.f73155a.f73132c;
                        if (music8 == null) {
                            C52711k.m112234a();
                        }
                        String requestId = music8.getRequestId();
                        Music music9 = this.f73155a.f73132c;
                        if (music9 == null) {
                            C52711k.m112234a();
                        }
                        C28393ak.m67386a(view2, g, str10, i, requestId, music9, str9, uuid);
                        return;
                    }
                    C27846b bVar = this.f73155a.f73138i;
                    Music music10 = this.f73155a.f73132c;
                    if (music10 == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo56266a(music10, g);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo54862a(int i, Object obj, C1352v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0 && this.f73132c != null && TextUtils.isEmpty(this.f73134e)) {
            String str = "show_search_music(%d-%s): %s";
            Object[] objArr = new Object[3];
            int g = mo56262g() + 1;
            objArr[0] = Integer.valueOf(g);
            Music music = this.f73132c;
            if (music == null) {
                C52711k.m112234a();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f73132c;
            if (music2 == null) {
                C52711k.m112234a();
            }
            objArr[2] = music2.getMusicName();
            C52711k.m112236a((Object) C2240a.m6772a(str, Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
            String str2 = "show_search_music";
            String str3 = "music_id";
            Music music3 = this.f73132c;
            if (music3 == null) {
                C52711k.m112234a();
            }
            C26890h.m65011a(str2, C47794cz.m103426a(str3, music3.getMid(), "client_order", Integer.toString(g)));
        }
    }
}

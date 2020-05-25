package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12187e;
import com.bytedance.lighten.p766a.C12187e.C12189a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27884c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27884c.C27887b;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.mob.C28407l;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingStruct;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23246p;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder */
public final class DiscoverV4NewTrendingViewHolder extends JediSimpleViewHolder<DiscoverV4NewTrendingStruct> implements C27887b, C38923d {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f75644f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4NewTrendingViewHolder.class), "mContext", "getMContext()Landroid/content/Context;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DiscoverV4NewTrendingViewHolder.class), "mLayoutManager", "getMLayoutManager()Lcom/ss/android/ugc/aweme/views/WrapLinearLayoutManager;"))};

    /* renamed from: g */
    public static final C28879a f75645g = new C28879a(null);

    /* renamed from: n */
    private static final String f75646n = f75646n;

    /* renamed from: j */
    private final C52668f f75647j = C52732g.m112285a(new C28885g(this));

    /* renamed from: k */
    private C24633ag f75648k;

    /* renamed from: l */
    private final C52668f f75649l = C52732g.m112285a(new C28886h(this));

    /* renamed from: m */
    private C27884c f75650m;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$a */
    public static final class C28879a {
        private C28879a() {
        }

        public /* synthetic */ C28879a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$b */
    public static final class C28880b extends C12168c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75651a;

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        }

        C28880b(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75651a = discoverV4NewTrendingViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            View view2 = this.f75651a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            ((SmartImageView) view2.findViewById(R.id.b55)).setImageResource(R.color.c8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$c */
    public static final class C28881c extends C12168c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75652a;

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        }

        C28881c(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75652a = discoverV4NewTrendingViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            View view2 = this.f75652a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            ((SmartImageView) view2.findViewById(R.id.b55)).setImageResource(R.color.c8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$d */
    public static final class C28882d extends C12168c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75653a;

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        }

        C28882d(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75653a = discoverV4NewTrendingViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            View view2 = this.f75653a.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            ((SmartImageView) view2.findViewById(R.id.b55)).setImageResource(R.color.c8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$e */
    static final class C28883e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75654a;

        C28883e(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75654a = discoverV4NewTrendingViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75654a.mo58456a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$f */
    public static final class C28884f extends C1340m {
        C28884f() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C26890h.m65004a((Context) null, "cell_slide", "slide", 0, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$g */
    static final class C28885g extends C52712l implements C52670a<Context> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75655a;

        C28885g(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75655a = discoverV4NewTrendingViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75655a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.getContext();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4NewTrendingViewHolder$h */
    static final class C28886h extends C52712l implements C52670a<WrapLinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4NewTrendingViewHolder f75656a;

        C28886h(DiscoverV4NewTrendingViewHolder discoverV4NewTrendingViewHolder) {
            this.f75656a = discoverV4NewTrendingViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f75656a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return new WrapLinearLayoutManager(view.getContext(), 0, false);
        }
    }

    /* renamed from: s */
    private final Context m68185s() {
        return (Context) this.f75647j.getValue();
    }

    /* renamed from: t */
    private final WrapLinearLayoutManager m68186t() {
        return (WrapLinearLayoutManager) this.f75649l.getValue();
    }

    /* renamed from: p */
    public final void mo58451p() {
    }

    /* renamed from: q */
    public final void mo58452q() {
    }

    /* renamed from: r */
    public final void mo58453r() {
    }

    public final void aM_() {
        mo58456a(true);
    }

    /* renamed from: k */
    public final void mo22675k() {
        super.mo22675k();
        m68188v();
    }

    /* renamed from: l */
    public final void mo22676l() {
        super.mo22676l();
        m68189w();
    }

    /* renamed from: u */
    private static String m68187u() {
        if (NewDiscoverV4Experiment.m69621e()) {
            return "discovery_trending";
        }
        return "discovery_tab";
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        m68184b(false);
        m68189w();
    }

    /* renamed from: v */
    private void m68188v() {
        C24633ag agVar = this.f75648k;
        if (agVar != null) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            agVar.mo50495a((RecyclerView) view.findViewById(R.id.cg7), false);
        }
    }

    /* renamed from: w */
    private void m68189w() {
        if (this.f75648k != null) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C24633ag.m60129a((RecyclerView) view.findViewById(R.id.cg7));
        }
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        m68184b(true);
        Category category = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
        if (category != null) {
            Challenge challenge = category.getChallenge();
            if (!NewDiscoverV4Experiment.m69621e()) {
                Music music = category.getMusic();
                C46069d effect = category.getEffect();
                User author = category.getAuthor();
                switch (category.getCategoryType()) {
                    case 0:
                        if (challenge != null) {
                            C26403au.m63865a(challenge.getSchema(), challenge.getCid());
                            C28396b.m67419b(challenge.getCid(), this.f31643i - 1, 0);
                            if (category.isAd()) {
                                C27936b.m66695c(m68185s(), category);
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (music != null) {
                            C28396b.m67419b(music.getMid(), this.f31643i - 1, 1);
                            break;
                        }
                        break;
                    case 2:
                        if (author != null) {
                            C28396b.m67419b(author.getUid(), this.f31643i - 1, 2);
                            break;
                        }
                        break;
                    case 3:
                        if (effect != null) {
                            C28396b.m67419b(effect.f116246id, this.f31643i - 1, 3);
                            break;
                        }
                        break;
                }
            } else if (challenge != null) {
                C0013i.m18a((Callable<TResult>) new C28407l<TResult>(challenge.getCid(), this.f31643i), (Executor) C26890h.m65003a());
            }
        }
        m68188v();
    }

    /* renamed from: b */
    private void m68184b(boolean z) {
        C27884c cVar = this.f75650m;
        if (cVar != null) {
            cVar.f73255i = z;
        }
    }

    public DiscoverV4NewTrendingViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bhw, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…_trending, parent, false)");
        super(inflate);
    }

    /* renamed from: a */
    public final void mo58456a(boolean z) {
        Challenge challenge;
        Music music;
        User user;
        String str;
        if (!C47915gg.m103651b() && ((DiscoverV4NewTrendingStruct) mo22689o()).category != null) {
            Category category = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
            C46069d dVar = null;
            if (category != null) {
                challenge = category.getChallenge();
            } else {
                challenge = null;
            }
            Category category2 = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
            if (category2 != null) {
                music = category2.getMusic();
            } else {
                music = null;
            }
            Category category3 = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
            if (category3 != null) {
                user = category3.getAuthor();
            } else {
                user = null;
            }
            Category category4 = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
            if (category4 != null) {
                dVar = category4.getEffect();
            }
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            if (challenge != null) {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "//challenge/detail").withParam("id", challenge.getCid()).withParam("enter_from", m68187u()).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).withParam("process_id", uuid);
                String str2 = "is_commerce";
                if (C26403au.m63866b(challenge)) {
                    str = "1";
                } else {
                    str = "0";
                }
                withParam.withParam(str2, str).open();
                Category category5 = ((DiscoverV4NewTrendingStruct) mo22689o()).category;
                if (category5 != null && category5.isAd()) {
                    if (z) {
                        C27936b.m66690a(m68185s(), ((DiscoverV4NewTrendingStruct) mo22689o()).category);
                    } else {
                        C27936b.m66693b(m68185s(), ((DiscoverV4NewTrendingStruct) mo22689o()).category);
                    }
                }
                if (NewDiscoverV4Experiment.m69621e()) {
                    new C23250t().mo48150f("discovery_trending").mo48154t(challenge.getCid()).mo48155u(uuid).mo48076e();
                } else {
                    ((C23250t) new C23250t().mo48150f("discovery_tab").mo48154t(challenge.getCid()).mo48100j(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())).mo48076e();
                }
                C30578o.m71566a(C29988ad.CHALLENGE);
            } else if (music != null) {
                if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(music.convertToMusicModel(), m68185s(), true)) {
                    C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", "").mo47829a("author_id", "").mo47829a("music_id", music.getMid()).mo47829a("enter_from", "discovery").f61491a);
                    return;
                }
                ((C23246p) new C23246p().mo48124g("discovery_tab").mo48127t(music.getMid()).mo48100j(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())).mo48076e();
                View view2 = this.itemView;
                C52711k.m112236a((Object) view2, "itemView");
                SmartRouter.buildRoute(view2.getContext(), "//music/detail").withParam("extra_music_from", m68187u()).withParam("process_id", uuid).withParam("id", music.getMid()).open();
                C30578o.m71566a(C29988ad.MUSICAL);
            } else if (user != null) {
                ((C23249s) new C23249s().mo48137c("discovery_tab").mo48144s(user.getUid()).mo48100j(DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())).mo48076e();
                SmartRouter.buildRoute(m68185s(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", m68187u()).withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").open();
                C30578o.m71566a(C29988ad.PROFILE);
            } else {
                if (dVar != null) {
                    C28396b.m67406a(dVar.f116246id, this.f31643i - 1, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST());
                    SmartRouter.buildRoute(m68185s(), "aweme://stickers/detail").withParam("extra_music_from", m68187u()).withParam("extra_stickers", (Serializable) C17593ar.m43277a((E[]) new String[]{dVar.f116246id})).open();
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        int i;
        DiscoverV4NewTrendingStruct discoverV4NewTrendingStruct = (DiscoverV4NewTrendingStruct) obj;
        C52711k.m112240b(discoverV4NewTrendingStruct, "item");
        Category category = discoverV4NewTrendingStruct.category;
        if (category != null) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cfc);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new C28883e(this));
            }
            this.f75648k = new C24633ag();
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            int color = context.getResources().getColor(R.color.pm);
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.cg7);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(m68186t());
            }
            View view4 = this.itemView;
            C52711k.m112236a((Object) view4, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view4.findViewById(R.id.cg7);
            if (recyclerView2 != null) {
                i = recyclerView2.getItemDecorationCount();
            } else {
                i = 0;
            }
            if (i > 0) {
                View view5 = this.itemView;
                C52711k.m112236a((Object) view5, "itemView");
                RecyclerView recyclerView3 = (RecyclerView) view5.findViewById(R.id.cg7);
                if (recyclerView3 != null) {
                    int itemDecorationCount = recyclerView3.getItemDecorationCount();
                    if (itemDecorationCount > 0) {
                        int itemDecorationCount2 = recyclerView3.getItemDecorationCount();
                        if (itemDecorationCount2 > 0) {
                            recyclerView3.mo4815b((C1331h) recyclerView3.f4705p.get(0));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(0);
                            sb.append(" is an invalid index for size ");
                            sb.append(itemDecorationCount2);
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("0");
                        sb2.append(" is an invalid index for size ");
                        sb2.append(itemDecorationCount);
                        throw new IndexOutOfBoundsException(sb2.toString());
                    }
                }
            }
            View view6 = this.itemView;
            C52711k.m112236a((Object) view6, "itemView");
            RecyclerView recyclerView4 = (RecyclerView) view6.findViewById(R.id.cg7);
            if (recyclerView4 != null) {
                View view7 = this.itemView;
                C52711k.m112236a((Object) view7, "itemView");
                recyclerView4.mo4798a((C1331h) new C32528d(color, (int) C9432q.m18687b(view7.getContext(), 2.0f), 0));
            }
            View view8 = this.itemView;
            C52711k.m112236a((Object) view8, "itemView");
            RecyclerView recyclerView5 = (RecyclerView) view8.findViewById(R.id.cg7);
            if (recyclerView5 != null) {
                recyclerView5.mo4832d();
            }
            View view9 = this.itemView;
            C52711k.m112236a((Object) view9, "itemView");
            RecyclerView recyclerView6 = (RecyclerView) view9.findViewById(R.id.cg7);
            if (recyclerView6 != null) {
                C24633ag agVar = this.f75648k;
                if (agVar == null) {
                    C52711k.m112234a();
                }
                recyclerView6.mo4801a((C1340m) agVar);
            }
            View view10 = this.itemView;
            C52711k.m112236a((Object) view10, "itemView");
            RecyclerView recyclerView7 = (RecyclerView) view10.findViewById(R.id.cg7);
            if (recyclerView7 != null) {
                recyclerView7.mo4801a((C1340m) new C28884f());
            }
            if (C47915gg.m103651b()) {
                View view11 = this.itemView;
                C52711k.m112236a((Object) view11, "itemView");
                C23729p.m58257a((View) (LinearLayout) view11.findViewById(R.id.bb3), 8);
            }
            if (this.f75650m == null) {
                this.f75650m = new C27884c();
                View view12 = new View(m68185s());
                view12.setLayoutParams(new LayoutParams((int) C9432q.m18687b(m68185s(), 14.0f), -1));
                C27884c cVar = this.f75650m;
                if (cVar != null) {
                    cVar.mo49209c_(view12);
                }
                View view13 = this.itemView;
                C52711k.m112236a((Object) view13, "itemView");
                RecyclerView recyclerView8 = (RecyclerView) view13.findViewById(R.id.cg7);
                if (recyclerView8 != null) {
                    recyclerView8.setAdapter(this.f75650m);
                }
                C27884c cVar2 = this.f75650m;
                if (cVar2 != null) {
                    cVar2.f73251e = this;
                }
            }
            C27884c cVar3 = this.f75650m;
            if (cVar3 != null) {
                cVar3.f73256j = m68187u();
            }
            C27884c cVar4 = this.f75650m;
            if (cVar4 != null) {
                cVar4.f73252f = category;
            }
            C27884c cVar5 = this.f75650m;
            if (cVar5 != null) {
                cVar5.mo50303a(category.getItems());
            }
            View view14 = this.itemView;
            C52711k.m112236a((Object) view14, "itemView");
            SmartImageView smartImageView = (SmartImageView) view14.findViewById(R.id.b55);
            if (smartImageView != null) {
                smartImageView.setImageResource(R.color.c8);
            }
            View view15 = this.itemView;
            C52711k.m112236a((Object) view15, "itemView");
            LinearLayout linearLayout = (LinearLayout) view15.findViewById(R.id.bb3);
            C52711k.m112236a((Object) linearLayout, "itemView.linearLayout2");
            linearLayout.setVisibility(0);
            switch (category.getCategoryType()) {
                case 0:
                    Challenge challenge = category.getChallenge();
                    if (!(challenge == null || category == null)) {
                        View view16 = this.itemView;
                        C52711k.m112236a((Object) view16, "itemView");
                        ImageView imageView = (ImageView) view16.findViewById(R.id.a65);
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        View view17 = this.itemView;
                        C52711k.m112236a((Object) view17, "itemView");
                        SmartImageView smartImageView2 = (SmartImageView) view17.findViewById(R.id.b55);
                        if (smartImageView2 != null) {
                            smartImageView2.setImageResource(R.drawable.cv3);
                        }
                        View view18 = this.itemView;
                        C52711k.m112236a((Object) view18, "itemView");
                        DmtTextView dmtTextView = (DmtTextView) view18.findViewById(R.id.di0);
                        if (dmtTextView != null) {
                            dmtTextView.setText(category.getDesc());
                        }
                        View view19 = this.itemView;
                        C52711k.m112236a((Object) view19, "itemView");
                        DmtTextView dmtTextView2 = (DmtTextView) view19.findViewById(R.id.d8u);
                        if (dmtTextView2 != null) {
                            dmtTextView2.setText(C33095b.m76068a(challenge.getDisplayCount()));
                        }
                        View view20 = this.itemView;
                        C52711k.m112236a((Object) view20, "itemView");
                        DmtTextView dmtTextView3 = (DmtTextView) view20.findViewById(R.id.dhb);
                        if (dmtTextView3 != null) {
                            dmtTextView3.setText(challenge.getChallengeName());
                        }
                        View view21 = this.itemView;
                        C52711k.m112236a((Object) view21, "itemView");
                        DmtTextView dmtTextView4 = (DmtTextView) view21.findViewById(R.id.d8u);
                        if (dmtTextView4 != null) {
                            dmtTextView4.setVisibility(0);
                        }
                        C27884c cVar6 = this.f75650m;
                        if (cVar6 != null) {
                            cVar6.f73254h = challenge.getCid();
                        }
                        C27884c cVar7 = this.f75650m;
                        if (cVar7 != null) {
                            cVar7.f73253g = 0;
                            break;
                        }
                    }
                    break;
                case 1:
                    Music music = category.getMusic();
                    if (!(music == null || category == null)) {
                        C12208t a = C12203q.m24645a((Object) C23608p.m57874a(music.getCoverThumb())).mo23119a(true).mo23118a("PlayListVideoViewHolder").mo23110a((int) R.color.c8);
                        View view22 = this.itemView;
                        C52711k.m112236a((Object) view22, "itemView");
                        a.mo23116a((C12197k) (SmartImageView) view22.findViewById(R.id.b55)).mo23122a((C12175j) new C28882d(this));
                        View view23 = this.itemView;
                        C52711k.m112236a((Object) view23, "itemView");
                        ImageView imageView2 = (ImageView) view23.findViewById(R.id.a65);
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                        View view24 = this.itemView;
                        C52711k.m112236a((Object) view24, "itemView");
                        DmtTextView dmtTextView5 = (DmtTextView) view24.findViewById(R.id.d8u);
                        if (dmtTextView5 != null) {
                            dmtTextView5.setVisibility(0);
                        }
                        View view25 = this.itemView;
                        C52711k.m112236a((Object) view25, "itemView");
                        DmtTextView dmtTextView6 = (DmtTextView) view25.findViewById(R.id.d8u);
                        if (dmtTextView6 != null) {
                            dmtTextView6.setText(C33095b.m76068a((long) music.getUserCount()));
                        }
                        View view26 = this.itemView;
                        C52711k.m112236a((Object) view26, "itemView");
                        DmtTextView dmtTextView7 = (DmtTextView) view26.findViewById(R.id.dhb);
                        if (dmtTextView7 != null) {
                            dmtTextView7.setText(music.getMusicName());
                        }
                        if (!TextUtils.isEmpty(category.getDesc())) {
                            View view27 = this.itemView;
                            C52711k.m112236a((Object) view27, "itemView");
                            DmtTextView dmtTextView8 = (DmtTextView) view27.findViewById(R.id.di0);
                            if (dmtTextView8 != null) {
                                dmtTextView8.setText(category.getDesc());
                            }
                        }
                        C27884c cVar8 = this.f75650m;
                        if (cVar8 != null) {
                            cVar8.f73254h = String.valueOf(music.getId());
                        }
                        C27884c cVar9 = this.f75650m;
                        if (cVar9 != null) {
                            cVar9.f73253g = 1;
                            break;
                        }
                    }
                    break;
                case 2:
                    User author = category.getAuthor();
                    if (!(author == null || category == null)) {
                        C12208t a2 = C12203q.m24645a((Object) C23608p.m57874a(author.getAvatarThumb())).mo23119a(true);
                        C12189a a3 = C12187e.m24632a().mo23105a(true);
                        View view28 = this.itemView;
                        C52711k.m112236a((Object) view28, "itemView");
                        Context context2 = view28.getContext();
                        C52711k.m112236a((Object) context2, "itemView.context");
                        C12187e a4 = a3.mo23104a(context2.getResources().getColor(R.color.aso), 0.5f).mo23106a();
                        C52711k.m112236a((Object) a4, "CircleOptions.newBuilder…\n                .build()");
                        C12208t a5 = a2.mo23115a(a4).mo23118a("PlayListVideoViewHolder").mo23110a((int) R.color.c8);
                        View view29 = this.itemView;
                        C52711k.m112236a((Object) view29, "itemView");
                        a5.mo23116a((C12197k) (SmartImageView) view29.findViewById(R.id.b55)).mo23122a((C12175j) new C28880b(this));
                        View view30 = this.itemView;
                        C52711k.m112236a((Object) view30, "itemView");
                        ImageView imageView3 = (ImageView) view30.findViewById(R.id.a65);
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                        }
                        View view31 = this.itemView;
                        C52711k.m112236a((Object) view31, "itemView");
                        LinearLayout linearLayout2 = (LinearLayout) view31.findViewById(R.id.bb3);
                        C52711k.m112236a((Object) linearLayout2, "itemView.linearLayout2");
                        linearLayout2.setVisibility(8);
                        View view32 = this.itemView;
                        C52711k.m112236a((Object) view32, "itemView");
                        DmtTextView dmtTextView9 = (DmtTextView) view32.findViewById(R.id.dhb);
                        if (dmtTextView9 != null) {
                            dmtTextView9.setText(author.getNickname());
                        }
                        View view33 = this.itemView;
                        C52711k.m112236a((Object) view33, "itemView");
                        DmtTextView dmtTextView10 = (DmtTextView) view33.findViewById(R.id.di0);
                        if (dmtTextView10 != null) {
                            dmtTextView10.setText(category.getDesc());
                        }
                        C27884c cVar10 = this.f75650m;
                        if (cVar10 != null) {
                            cVar10.f73253g = 2;
                        }
                        C27884c cVar11 = this.f75650m;
                        if (cVar11 != null) {
                            cVar11.f73254h = author.getUid().toString();
                        }
                        if (!TextUtils.isEmpty(category.getDesc())) {
                            View view34 = this.itemView;
                            C52711k.m112236a((Object) view34, "itemView");
                            DmtTextView dmtTextView11 = (DmtTextView) view34.findViewById(R.id.di0);
                            if (dmtTextView11 != null) {
                                dmtTextView11.setText(category.getDesc());
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    C46069d effect = category.getEffect();
                    if (!(effect == null || category == null)) {
                        C12208t c = C12203q.m24645a((Object) C23608p.m57874a(effect.iconUrl)).mo23119a(true).mo23118a("PlayListVideoViewHolder").mo23110a((int) R.color.c8).mo23127c(false);
                        View view35 = this.itemView;
                        C52711k.m112236a((Object) view35, "itemView");
                        c.mo23116a((C12197k) (SmartImageView) view35.findViewById(R.id.b55)).mo23122a((C12175j) new C28881c(this));
                        View view36 = this.itemView;
                        C52711k.m112236a((Object) view36, "itemView");
                        DmtTextView dmtTextView12 = (DmtTextView) view36.findViewById(R.id.d8u);
                        if (dmtTextView12 != null) {
                            dmtTextView12.setVisibility(0);
                        }
                        View view37 = this.itemView;
                        C52711k.m112236a((Object) view37, "itemView");
                        ImageView imageView4 = (ImageView) view37.findViewById(R.id.a65);
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                        }
                        View view38 = this.itemView;
                        C52711k.m112236a((Object) view38, "itemView");
                        DmtTextView dmtTextView13 = (DmtTextView) view38.findViewById(R.id.di0);
                        if (dmtTextView13 != null) {
                            dmtTextView13.setText(category.getDesc());
                        }
                        View view39 = this.itemView;
                        C52711k.m112236a((Object) view39, "itemView");
                        DmtTextView dmtTextView14 = (DmtTextView) view39.findViewById(R.id.dhb);
                        if (dmtTextView14 != null) {
                            dmtTextView14.setText(effect.name);
                        }
                        View view40 = this.itemView;
                        C52711k.m112236a((Object) view40, "itemView");
                        DmtTextView dmtTextView15 = (DmtTextView) view40.findViewById(R.id.d8u);
                        if (dmtTextView15 != null) {
                            dmtTextView15.setText(C33095b.m76068a(effect.userCount));
                        }
                        C27884c cVar12 = this.f75650m;
                        if (cVar12 != null) {
                            cVar12.f73253g = 3;
                        }
                        C27884c cVar13 = this.f75650m;
                        if (cVar13 != null) {
                            cVar13.f73254h = effect.f116246id;
                        }
                        if (!TextUtils.isEmpty(category.getDesc())) {
                            View view41 = this.itemView;
                            C52711k.m112236a((Object) view41, "itemView");
                            DmtTextView dmtTextView16 = (DmtTextView) view41.findViewById(R.id.di0);
                            if (dmtTextView16 != null) {
                                dmtTextView16.setText(category.getDesc());
                                break;
                            }
                        }
                    }
                    break;
            }
            try {
                m68186t().mo4721a(0, 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo58449a(boolean z, boolean z2) {
        if (z) {
            m68189w();
        } else {
            m68188v();
        }
    }
}

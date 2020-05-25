package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.api.C24553d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c.C26908d;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.discover.C27936b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27884c.C27887b;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23211aq;
import com.p683ss.android.ugc.aweme.p1382aq.C23246p;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.CategoryViewHolder */
public class CategoryViewHolder extends C1352v implements C26908d, C27887b {

    /* renamed from: a */
    public static final Category f72826a = new Category();

    /* renamed from: b */
    public final WrapLinearLayoutManager f72827b;

    /* renamed from: c */
    public Category f72828c;

    /* renamed from: d */
    public int f72829d;

    /* renamed from: e */
    public C27884c f72830e;

    /* renamed from: f */
    public Context f72831f;

    /* renamed from: g */
    public View f72832g;

    /* renamed from: h */
    private C24633ag f72833h = new C24633ag();
    public View mCategoryCountView;
    public RemoteImageView mIvType;
    public RecyclerView mListView;
    public View mRoot;
    public TextView mTvCount;
    public TextView mTvTitle;
    public TextView mTvType;
    public ImageView mViewDiscoverBg;
    public ViewStub mViewStubPlaceHolder;

    /* renamed from: b */
    private static String m66415b(boolean z) {
        return z ? "cell_slide" : "cell_click";
    }

    /* renamed from: c */
    private static String m66416c(boolean z) {
        return z ? "into" : "header_click";
    }

    /* renamed from: d */
    private int m66417d() {
        return this.f72829d + 1;
    }

    public final void aM_() {
        mo56173a(true);
    }

    /* renamed from: b */
    public final void mo56175b() {
        if (this.f72833h != null) {
            this.f72833h.mo50495a(this.mListView, false);
        }
    }

    /* renamed from: c */
    public final void mo56176c() {
        if (this.f72833h != null) {
            C24633ag.m60129a(this.mListView);
        }
    }

    public CategoryViewHolder(View view) {
        super(view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CategoryViewHolder.this.mo56173a(false);
            }
        });
        this.f72831f = view.getContext();
        ButterKnife.bind((Object) this, view);
        int color = view.getContext().getResources().getColor(R.color.pm);
        this.f72827b = new WrapLinearLayoutManager(view.getContext(), 0, false);
        this.mListView.setLayoutManager(this.f72827b);
        this.mListView.mo4798a((C1331h) new C32528d(color, (int) C9432q.m18687b(view.getContext(), 2.0f), 0));
        this.mListView.mo4801a((C1340m) this.f72833h);
        this.mListView.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C26890h.m65004a((Context) null, "cell_slide", "slide", 0, 0);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo56173a(boolean z) {
        String str;
        if (!C47915gg.m103651b() && this.f72828c != null) {
            Challenge challenge = this.f72828c.getChallenge();
            if (challenge != null) {
                String uuid = UUID.randomUUID().toString();
                if (!C23794bh.m58375A().mo56135a() || z || !challenge.isPgcshow()) {
                    SmartRoute withParam = SmartRouter.buildRoute(this.itemView.getContext(), "//challenge/detail").withParam("id", challenge.getCid()).withParam("enter_from", "discovery").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).withParam("process_id", uuid);
                    String str2 = "is_commerce";
                    if (C26403au.m63866b(challenge)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    withParam.withParam(str2, str).open();
                    C26890h.m65011a("cell_click", new C23089d().mo47829a("enter_from", "discovery").mo47829a("tag_id", challenge.getCid()).mo47826a("client_order", m66417d()).f61491a);
                    C26890h.onEvent(MobClick.obtain().setEventName(m66415b(z)).setLabelName(m66416c(z)).setValue(challenge.getCid()).setJsonObject(new C23088c().mo47824a("cell_type", "challenge").mo47825b()));
                    if (this.f72828c.isAd()) {
                        if (z) {
                            C27936b.m66690a(this.f72831f, this.f72828c);
                        } else {
                            C27936b.m66693b(this.f72831f, this.f72828c);
                        }
                    }
                } else {
                    C26875a createChallengeAwemeModel = C24553d.m59968a().createChallengeAwemeModel();
                    createChallengeAwemeModel.setItems(new ArrayList());
                    C31213v.m72896a(createChallengeAwemeModel);
                    C41302w a = C41302w.m91042a();
                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                    sb.append(((Aweme) this.f72828c.getItems().get(0)).getAid());
                    a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "discovery").mo83870a("video_from", "from_challenge").mo83870a("challenge_id", challenge.getCid()).mo83871a());
                }
                ((C23250t) new C23250t().mo48150f("discovery").mo47941a("click_discovery_cover")).mo48154t(challenge.getCid()).mo48155u(uuid).mo48076e();
                C30578o.m71566a(C29988ad.CHALLENGE);
                return;
            }
            Music music = this.f72828c.getMusic();
            if (music != null) {
                if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(music.convertToMusicModel(), this.f72831f, true)) {
                    C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", "").mo47829a("author_id", "").mo47829a("music_id", music.getMid()).mo47829a("enter_from", "discovery").f61491a);
                    return;
                }
                String uuid2 = UUID.randomUUID().toString();
                SmartRouter.buildRoute(this.itemView.getContext(), "//music/detail").withParam("id", music.getMid()).withParam("process_id", uuid2).open();
                C26890h.m65011a("cell_click", new C23089d().mo47829a("enter_from", "discovery").mo47829a("music_id", music.getMid()).mo47826a("client_order", m66417d()).f61491a);
                C26890h.onEvent(MobClick.obtain().setEventName(m66415b(z)).setLabelName(m66416c(z)).setValue(String.valueOf(music.getMid())).setJsonObject(new C23088c().mo47824a("cell_type", "music").mo47825b()));
                ((C23246p) new C23246p().mo48124g("discovery").mo48127t(music.getMid()).mo48128u(uuid2).mo47941a("click_discovery_cover")).mo48076e();
                C30578o.m71566a(C29988ad.MUSICAL);
            }
        }
    }

    /* renamed from: a */
    public final void mo54862a(int i, Object obj, C1352v vVar, View view, int i2, int i3) {
        if (i2 == 0 && i3 != 0) {
            Category category = this.f72828c;
            if (category != null) {
                Challenge challenge = category.getChallenge();
                Music music = category.getMusic();
                if (challenge != null) {
                    C26403au.m63865a(challenge.getSchema(), challenge.getCid());
                    C26890h.m65005a(this.mListView.getContext(), "show_challenge", "discovery", challenge.getCid(), 0);
                    C23211aq aqVar = new C23211aq();
                    aqVar.f61772a = "discovery";
                    aqVar.f61773b = challenge.getCid();
                    aqVar.mo48076e();
                    C26890h.m65011a("cell_show", new C23089d().mo47829a("enter_from", "discovery").mo47829a("tag_id", challenge.getCid()).mo47826a("client_order", m66417d()).f61491a);
                    if (this.f72828c.isAd()) {
                        C27936b.m66695c(this.f72831f, this.f72828c);
                    }
                } else if (music != null) {
                    C26890h.m65005a(this.mListView.getContext(), "show_music", "discovery", music.getMid(), 0);
                    C26890h.m65011a("cell_show", new C23089d().mo47829a("enter_from", "discovery").mo47829a("music_id", music.getMid()).mo47826a("client_order", m66417d()).f61491a);
                }
            }
        }
    }
}

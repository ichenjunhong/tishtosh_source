package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p030v4.app.C0643c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.api.C24553d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1589a.C26837d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.experiment.CoverOptimizeExperiment;
import com.p683ss.android.ugc.aweme.discover.model.Category;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.speed.C28432a;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.music.service.C37436c;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.c */
public final class C27884c extends C26837d implements C24579d {

    /* renamed from: e */
    public C27887b f73251e;

    /* renamed from: f */
    public Category f73252f;

    /* renamed from: g */
    public int f73253g;

    /* renamed from: h */
    public String f73254h;

    /* renamed from: i */
    public boolean f73255i = true;

    /* renamed from: j */
    public String f73256j = "discovery";

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$a */
    static class C27885a extends C1352v {
        C27885a(View view, final C27887b bVar) {
            super(view);
            view.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (bVar != null) {
                        bVar.aM_();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$b */
    public interface C27887b {
        void aM_();
    }

    /* renamed from: a */
    public final void mo51182a(C1352v vVar) {
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        if (!C47915gg.m103651b() && (!NewDiscoverV4Experiment.m69617a() || this.f70670n.size() >= 4)) {
            return new C27885a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9k, viewGroup, false), this.f73251e);
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new LayoutParams((int) C9432q.m18687b(viewGroup.getContext(), 14.0f), -1));
        return new C27885a(view, null);
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        return new CoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9j, viewGroup, false), this);
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        CoverViewHolder coverViewHolder = (CoverViewHolder) vVar;
        coverViewHolder.mo54774a((Aweme) this.f70670n.get(i), i);
        coverViewHolder.mo54779c(this.f73255i);
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        int i;
        String str2;
        String str3;
        View view2 = view;
        if (aweme != null) {
            String str4 = "";
            String str5 = "";
            C26875a aVar = null;
            if (this.f73253g == 0) {
                if (C47915gg.m103651b()) {
                    str2 = "from_challenge_children_mode";
                } else {
                    str2 = "from_discovery_challenge";
                }
                str5 = "challenge_id";
                aVar = C24553d.m59968a().createChallengeAwemeModel();
                C28432a.m67475a(aVar, this.f70670n);
                if (this.f73252f != null && this.f73252f.isAd()) {
                    Context context = view.getContext();
                    Category category = this.f73252f;
                    C25945k.m62911b().mo53116a(context, category.getCreativeId(), category.getLogExtra(), category.getClickTrackUrlList(), aweme.getAid());
                }
                i = 2;
            } else {
                if (this.f73253g == 1) {
                    if (C47915gg.m103651b()) {
                        str4 = "from_music_children_mode";
                    } else {
                        str4 = "from_music";
                    }
                    str5 = "music_id";
                    aVar = C37436c.f95476a.createMusicAwemeModel();
                    C28432a.m67475a(aVar, this.f70670n);
                } else if (this.f73253g == 2) {
                    str4 = "from_profile_other";
                    str5 = "userid";
                    aVar = C40733z.f103767a.createAwemeModel();
                    C31213v.m72896a(aVar);
                } else if (this.f73253g == 3) {
                    str2 = "from_sticker";
                    C26875a b = C23794bh.m58375A().mo56136b();
                    C28432a.m67475a(b, this.f70670n);
                    str5 = "sticker_id";
                    aVar = b;
                    i = 15;
                }
                i = 0;
            }
            if (this.f73252f != null) {
                C23089d dVar = new C23089d();
                if (NewDiscoverV4Experiment.m69617a()) {
                    dVar.mo47829a("group_id", aweme.getAid());
                    if (NewDiscoverV4Experiment.m69618b()) {
                        dVar.mo47829a("enter_from", "discovery_tab");
                        dVar.mo47829a("tab_name", DiscoverV4PlayListDataCenter.TRENDING_PLAYLIST);
                    } else if (NewDiscoverV4Experiment.m69621e()) {
                        dVar.mo47829a("enter_from", "discovery_trending");
                        dVar.mo47829a("tab_name", DiscoverV4PlayListDataCenter.TRENDING_PLAYLIST);
                    }
                } else {
                    dVar.mo47829a("enter_from", "discovery");
                }
                if (this.f73253g == 0 && this.f73252f.getChallenge() != null) {
                    dVar.mo47829a("tag_id", this.f73252f.getChallenge().getCid());
                } else if (this.f73253g == 1 && this.f73252f.getMusic() != null) {
                    dVar.mo47829a("music_id", this.f73252f.getMusic().getMid());
                } else if (this.f73253g == 2 && this.f73252f.getAuthor() != null) {
                    dVar.mo47829a("to_user_id", this.f73252f.getAuthor().getUid());
                } else if (this.f73253g == 3 && this.f73252f.getEffect() != null) {
                    dVar.mo47829a("prop_id", this.f73252f.getEffect().f116246id);
                }
                C26890h.m65011a("feed_enter", dVar.f61491a);
            }
            C31213v.m72896a(aVar);
            SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "//aweme/detail").withParam("id", aweme.getAid()).withParam("refer", this.f73256j).withParam("video_from", str2).withParam("video_type", i).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam(str5, this.f73254h);
            if (C47915gg.m103651b()) {
                String str6 = "ids";
                StringBuilder sb = new StringBuilder();
                if (!C9376b.m18558a((Collection<T>) this.f70670n)) {
                    for (int i2 = 0; i2 < this.f70670n.size(); i2++) {
                        Aweme aweme2 = (Aweme) this.f70670n.get(i2);
                        if (aweme2 != null) {
                            if (i2 < this.f70670n.size() - 1) {
                                sb.append(aweme2.getAid());
                                sb.append(",");
                            } else {
                                sb.append(aweme2.getAid());
                            }
                        }
                    }
                }
                withParam.withParam(str6, sb.toString());
            }
            boolean a = C10181b.m20511a().mo18172a(CoverOptimizeExperiment.class, true, "enable_reuse_external_image", 31744, false);
            if (view2 != null && a) {
                withParam.withBundleAnimation(C0643c.m1729b(view2, 0, 0, view.getWidth(), view.getHeight()).mo2171a());
            }
            withParam.open();
            if (TextUtils.equals(str2, "from_discovery_challenge")) {
                str3 = "challenge";
            } else {
                str3 = "music";
            }
            C26890h.onEvent(MobClick.obtain().setEventName("cell_click").setLabelName("video_click").setValue(aweme.getAid()).setJsonObject(new C23088c().mo47824a("cell_type", str3).mo47825b()));
        }
    }
}

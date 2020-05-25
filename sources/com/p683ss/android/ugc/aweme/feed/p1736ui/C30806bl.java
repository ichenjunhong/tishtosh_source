package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.main.p1938b.C36513a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23246p;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bl */
public abstract class C30806bl extends C31009h {

    /* renamed from: a */
    protected C25908e f80702a;

    /* renamed from: b */
    protected OnClickListener f80703b = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (C30806bl.this.f81192l.getMusic() == null || TextUtils.isEmpty(C30806bl.this.f81192l.getMusic().getMid())) {
                str = "";
            } else {
                str = C30806bl.this.f81192l.getMusic().getMid();
            }
            Aweme aweme = C30806bl.this.f81192l;
            C26890h.m65011a("homepage_hot_click_cover", C23089d.m56640a().mo47829a("music_id", str).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("group_id", aweme.getAid()).f61491a);
            if (!C47915gg.m103651b()) {
                if (C30806bl.this.f81192l.getMusic() != null && C30806bl.this.f81192l.getMusic().getId() == 0 && C30806bl.this.f81198r != null) {
                    C10691a.m21542b(C30806bl.this.f81198r, (int) R.string.ce6).mo19066a();
                } else if (C26503d.m64061d(C30806bl.this.f81192l) && C30806bl.this.f81192l.getCommerceVideoAuthInfo() != null && C30806bl.this.f81192l.getCommerceVideoAuthInfo().getAdSource() == 1) {
                } else {
                    if (C30806bl.this.mo63785c()) {
                        if (!C30806bl.this.mo63522d() && C30806bl.this.f80702a != null) {
                            C30806bl.this.f80702a.mo53251g();
                        }
                    } else if (!C32800a.m75679a(view)) {
                        if (C47950q.m103752a(C30806bl.this.f81192l)) {
                            C10691a.m21542b(C30806bl.this.f81198r, (int) R.string.ffs).mo19066a();
                        } else if (C30806bl.this.f81192l.isCanPlay() || !C30806bl.m72202b(C30806bl.this.f81192l)) {
                            if (C30806bl.this.f81192l.getMusic() != null && C30806bl.this.f80702a != null && C30806bl.this.f80702a.mo53248d() && !C30806bl.this.f81192l.getMusic().isAuthorDeleted()) {
                                C30806bl.this.f80702a.mo53251g();
                                if (C30806bl.this.f81192l.getMusic() == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(C30806bl.this.f81192l.getMusic().convertToMusicModel(), C30806bl.this.f81198r, true, C30806bl.this.mo63520a(C30806bl.this.f81192l))) {
                                    String uuid = UUID.randomUUID().toString();
                                    SmartRouter.buildRoute(C30806bl.this.f81198r, "aweme://music/detail/").withParam("id", str).withParam("aweme_id", C30806bl.this.f81192l.getAid()).withParam("extra_music_from", C30806bl.this.f81193m).withParam("sticker_id", C30806bl.this.f81192l.getStickerIDs()).withParam("process_id", uuid).open(10086);
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("music_id", str);
                                        jSONObject.put("enter_method", "click_cover");
                                        jSONObject.put("group_id", C30806bl.this.f81192l.getAid());
                                        String str3 = "is_photo";
                                        if (C30806bl.this.f81192l.isImage()) {
                                            str2 = "1";
                                        } else {
                                            str2 = "0";
                                        }
                                        jSONObject.put(str3, str2);
                                        jSONObject.put("request_id", C23198ae.m56847a(C30806bl.this.f81192l, C30806bl.this.f81196p));
                                        if (!TextUtils.isEmpty(C23198ae.m56861e(C30806bl.this.f81192l))) {
                                            jSONObject.put("poi_id", C23198ae.m56861e(C30806bl.this.f81192l));
                                        }
                                        if (C23198ae.m56858c(C30806bl.this.f81193m)) {
                                            jSONObject.put("poi_type", C23198ae.m56867h(C30806bl.this.f81192l));
                                            jSONObject.put("poi_channel", C23198ae.m56852b());
                                            jSONObject.put("city_info", C23198ae.m56845a());
                                            jSONObject.put("distance_info", C23198ae.m56869i(C30806bl.this.f81192l));
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    if (C30806bl.this.f81197q != null) {
                                        C30806bl.this.f81197q.mo48228a("feed_internal_event", (Object) new C30332aw(35, C30806bl.this.f81192l));
                                    }
                                    C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(C30806bl.this.f81193m).setValue(C30806bl.this.f81192l.getAid()).setExtValueString(str).setJsonObject(jSONObject));
                                    String str4 = "click_cover";
                                    if (view.getId() == R.id.bot) {
                                        str4 = "click_name";
                                    }
                                    ((C23246p) ((C23246p) ((C23246p) ((C23246p) ((C23246p) ((C23246p) new C23246p().mo47954f(C30806bl.this.f81192l).mo47940a(C30806bl.this.f81198r)).mo48124g(C30806bl.this.f81193m).mo47941a(str4)).mo48098a(Boolean.valueOf(C31190f.m72834b(C30806bl.this.f81192l)))).mo48125h(C30806bl.this.f81192l.getAid()).mo48127t(str).mo48128u(uuid).mo48119c(FeedParamProvider.m71941a(C30806bl.this.f81198r).getPreviousPage()).mo48120d((String) C30806bl.this.f81197q.mo48230b("playlist_type", "")).mo48123f((String) C30806bl.this.f81197q.mo48230b("playlist_id", "")).mo48122e((String) C30806bl.this.f81197q.mo48230b("playlist_id_key", "")).mo48100j((String) C30806bl.this.f81197q.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(C30806bl.this.f81192l, C30806bl.this.f81196p))).mo48129v(C23198ae.m56847a(C30806bl.this.f81192l, C30806bl.this.f81196p)).mo48107r(FeedParamProvider.m71941a(C30806bl.this.f81198r).getSearchId())).mo48076e();
                                    C30578o.m71566a(C29988ad.MUSICAL);
                                } else {
                                    return;
                                }
                            } else if (C30806bl.this.f81192l.isAd() && !C30806bl.this.f80702a.mo53248d()) {
                                C10691a.m21542b(C30806bl.this.f81198r, (int) R.string.dm).mo19066a();
                            }
                            C47718bf.m103288a(new C36513a());
                        } else if (C30806bl.this.f81192l.isImage()) {
                            C10691a.m21542b(C30806bl.this.f81198r, (int) R.string.bqo).mo19066a();
                        } else {
                            C10691a.m21542b(C30806bl.this.f81198r, (int) R.string.fc_).mo19066a();
                        }
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo49781a() {
        mo63523e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49783a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49784a(DataCenter dataCenter) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo63523e();

    /* renamed from: d */
    public final boolean mo63522d() {
        String str = this.f81193m;
        Aweme aweme = this.f81192l;
        if (aweme.isAd() && aweme.isWithPromotionalMusic()) {
            return TextUtils.equals(str, "homepage_hot");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo63524f() {
        boolean z;
        if (!super.mo63524f()) {
            Aweme aweme = this.f81192l;
            if (aweme == null || !aweme.isWithPromotionalMusic()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C30806bl(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo63521b(VideoItemParams videoItemParams) {
        super.mo63521b(videoItemParams);
        if (videoItemParams != null) {
            this.f80702a = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: b */
    protected static boolean m72202b(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Music music = aweme.getMusic();
        User author = aweme.getAuthor();
        if (!aweme.isLawCriticalCountry() || music == null || author == null || TextUtils.isEmpty(music.getOwnerId()) || !TextUtils.equals(music.getOwnerId(), author.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo63520a(Aweme aweme) {
        if (!C26503d.m64061d(aweme) || this.f80702a == null || !this.f80702a.mo53248d()) {
            return false;
        }
        if (C26503d.m64063f(aweme) || C26503d.m64065h(aweme)) {
            return true;
        }
        return false;
    }
}

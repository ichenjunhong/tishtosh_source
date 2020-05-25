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
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30241a;
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

/* renamed from: com.ss.android.ugc.aweme.feed.ui.i */
public abstract class C31010i extends C30241a {

    /* renamed from: p */
    protected C25908e f81203p;

    /* renamed from: q */
    protected OnClickListener f81204q = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (C31010i.this.f79011d.getMusic() == null || TextUtils.isEmpty(C31010i.this.f79011d.getMusic().getMid())) {
                str = "";
            } else {
                str = C31010i.this.f79011d.getMusic().getMid();
            }
            C26890h.m65011a("homepage_hot_click_cover", C23089d.m56640a().mo47829a("music_id", str).mo47829a("author_id", C31010i.this.f79011d.getAuthorUid()).mo47829a("group_id", C31010i.this.f79011d.getAid()).f61491a);
            if (!C47915gg.m103651b()) {
                if (C31010i.this.f79011d.getMusic() != null && C31010i.this.f79011d.getMusic().getId() == 0 && C31010i.this.f79017j != null) {
                    C10691a.m21542b(C31010i.this.f79017j, (int) R.string.ce6).mo19066a();
                } else if (C26503d.m64061d(C31010i.this.f79011d) && C31010i.this.f79011d.getCommerceVideoAuthInfo() != null && C31010i.this.f79011d.getCommerceVideoAuthInfo().getAdSource() == 1) {
                } else {
                    if (C31010i.this.mo60602f()) {
                        C31010i iVar = C31010i.this;
                        boolean z = false;
                        if (iVar.f79011d.isAd() && iVar.f79011d.isWithPromotionalMusic()) {
                            z = TextUtils.equals(iVar.f79012e, "homepage_hot");
                        }
                        if (!z && C31010i.this.f81203p != null) {
                            C31010i.this.f81203p.mo53251g();
                        }
                    } else if (!C32800a.m75679a(view)) {
                        if (C47950q.m103752a(C31010i.this.f79011d)) {
                            C10691a.m21542b(C31010i.this.f79017j, (int) R.string.ffs).mo19066a();
                        } else if (C31010i.this.f79011d.isCanPlay() || !C31010i.m72610b(C31010i.this.f79011d)) {
                            if (C31010i.this.f79011d.getMusic() != null && C31010i.this.f81203p != null && C31010i.this.f81203p.mo53248d() && !C31010i.this.f79011d.getMusic().isAuthorDeleted()) {
                                C31010i.this.f81203p.mo53251g();
                                if (C31010i.this.f79011d.getMusic() == null || MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(C31010i.this.f79011d.getMusic().convertToMusicModel(), C31010i.this.f79017j, true, C31010i.this.mo63787a(C31010i.this.f79011d))) {
                                    String uuid = UUID.randomUUID().toString();
                                    SmartRouter.buildRoute(C31010i.this.f79017j, "aweme://music/detail/").withParam("id", str).withParam("aweme_id", C31010i.this.f79011d.getAid()).withParam("extra_music_from", C31010i.this.f79012e).withParam("sticker_id", C31010i.this.f79011d.getStickerIDs()).withParam("process_id", uuid).open(10086);
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("music_id", str);
                                        jSONObject.put("enter_method", "click_cover");
                                        jSONObject.put("group_id", C31010i.this.f79011d.getAid());
                                        String str3 = "is_photo";
                                        if (C31010i.this.f79011d.isImage()) {
                                            str2 = "1";
                                        } else {
                                            str2 = "0";
                                        }
                                        jSONObject.put(str3, str2);
                                        jSONObject.put("request_id", C23198ae.m56847a(C31010i.this.f79011d, C31010i.this.f79015h));
                                        if (!TextUtils.isEmpty(C23198ae.m56861e(C31010i.this.f79011d))) {
                                            jSONObject.put("poi_id", C23198ae.m56861e(C31010i.this.f79011d));
                                        }
                                        if (C23198ae.m56858c(C31010i.this.f79012e)) {
                                            jSONObject.put("poi_type", C23198ae.m56867h(C31010i.this.f79011d));
                                            jSONObject.put("poi_channel", C23198ae.m56852b());
                                            jSONObject.put("city_info", C23198ae.m56845a());
                                            jSONObject.put("distance_info", C23198ae.m56869i(C31010i.this.f79011d));
                                        }
                                    } catch (JSONException unused) {
                                    }
                                    if (C31010i.this.f79016i != null) {
                                        C31010i.this.f79016i.mo48228a("feed_internal_event", (Object) new C30332aw(35, C31010i.this.f79011d));
                                    }
                                    C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(C31010i.this.f79012e).setValue(C31010i.this.f79011d.getAid()).setExtValueString(str).setJsonObject(jSONObject));
                                    String str4 = "click_cover";
                                    if (view.getId() == R.id.bot) {
                                        str4 = "click_name";
                                    }
                                    ((C23246p) ((C23246p) ((C23246p) ((C23246p) ((C23246p) new C23246p().mo47954f(C31010i.this.f79011d).mo47940a(C31010i.this.f79017j)).mo48124g(C31010i.this.f79012e).mo47941a(str4)).mo48098a(Boolean.valueOf(C31190f.m72834b(C31010i.this.f79011d)))).mo48125h(C31010i.this.f79011d.getAid()).mo48127t(str).mo48128u(uuid).mo48119c(FeedParamProvider.m71941a(C31010i.this.f79017j).getPreviousPage()).mo48120d((String) C31010i.this.f79016i.mo48230b("playlist_type", "")).mo48123f((String) C31010i.this.f79016i.mo48230b("playlist_id", "")).mo48122e((String) C31010i.this.f79016i.mo48230b("playlist_id_key", "")).mo48100j((String) C31010i.this.f79016i.mo48230b("tab_name", ""))).mo48101k(C23198ae.m56854b(C31010i.this.f79011d, C31010i.this.f79015h))).mo48129v(C23198ae.m56847a(C31010i.this.f79011d, C31010i.this.f79015h)).mo48076e();
                                    C30578o.m71566a(C29988ad.MUSICAL);
                                } else {
                                    return;
                                }
                            } else if (C31010i.this.f79011d.isAd() && !C31010i.this.f81203p.mo53248d()) {
                                C10691a.m21542b(C31010i.this.f79017j, (int) R.string.dm).mo19066a();
                            }
                            C47718bf.m103288a(new C36513a());
                        } else if (C31010i.this.f79011d.isImage()) {
                            C10691a.m21542b(C31010i.this.f79017j, (int) R.string.bqo).mo19066a();
                        } else {
                            C10691a.m21542b(C31010i.this.f79017j, (int) R.string.fc_).mo19066a();
                        }
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public void mo60585a(View view) {
    }

    /* renamed from: a */
    public void mo60586a(DataCenter dataCenter) {
    }

    /* renamed from: e */
    public final void mo60599e() {
        mo63700j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo63700j();

    /* renamed from: g */
    public final boolean mo60603g() {
        if (super.mo60603g() || (this.f79011d != null && this.f79011d.isWithPromotionalMusic())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo60593b(VideoItemParams videoItemParams) {
        super.mo60593b(videoItemParams);
        if (videoItemParams != null) {
            this.f81203p = videoItemParams.mAdViewController;
        }
    }

    /* renamed from: b */
    protected static boolean m72610b(Aweme aweme) {
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
    public final boolean mo63787a(Aweme aweme) {
        if (!C26503d.m64061d(aweme) || this.f81203p == null || !this.f81203p.mo53248d()) {
            return false;
        }
        if (C26503d.m64063f(aweme) || C26503d.m64065h(aweme)) {
            return true;
        }
        return false;
    }

    public C31010i(View view, boolean z) {
        super(view, z);
    }
}

package com.p683ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b.C8635a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.list.C25259h;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25171f;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29694b;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29743l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30491n;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30493o;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31013k;
import com.p683ss.android.ugc.aweme.feed.utils.C31205q;
import com.p683ss.android.ugc.aweme.feed.utils.C31205q.C31207a;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.setting.C41581bc;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.share.C41976ao;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.h */
public final class C30303h extends C30180e {

    /* renamed from: a */
    public C30493o f79178a;

    /* renamed from: b */
    public boolean f79179b;

    /* renamed from: j */
    private C29743l f79180j;

    /* renamed from: k */
    private C30313ae<C30332aw> f79181k;

    /* renamed from: l */
    private C30447d f79182l;

    /* renamed from: m */
    private Dialog f79183m;

    /* renamed from: n */
    private String f79184n;

    /* renamed from: o */
    private String f79185o;

    /* renamed from: p */
    private String f79186p;

    /* renamed from: q */
    private String f79187q;

    /* renamed from: r */
    private String f79188r = "";

    /* renamed from: c */
    public final Activity mo60470c() {
        return this.f78758c;
    }

    /* renamed from: d */
    public final Context mo60471d() {
        return this.f78758c;
    }

    /* renamed from: e */
    public final Fragment mo60472e() {
        return this.f78759d;
    }

    /* renamed from: f */
    public final String mo60473f() {
        return this.f78762g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60708a(final Aweme aweme, C30332aw awVar) {
        if (awVar.f79228a == 20) {
            boolean z = false;
            this.f79178a.mo60917a(aweme, 0);
            if (aweme.getStatus() == null || aweme.getStatus().isPrivate()) {
                String uid = C20854a.m53167g().getCurUser().getUid();
                if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null) {
                        z = TextUtils.equals(author.getUid(), uid);
                    }
                }
                if (z) {
                    new C10643a(mo60471d()).mo18899b((int) R.string.cxi).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C26890h.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                        }
                    }).mo18886a((int) R.string.buu, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C30303h.this.f79178a.mo44934a_(aweme.getAid(), Integer.valueOf(1));
                            C26890h.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                        }
                    }).mo18897a().mo18882b();
                }
            }
        }
        if (!TextUtils.equals("homepage_follow", this.f78760e)) {
            C25280a.m61493a().sendCommentEvent(this.f78760e, aweme, m71229b(aweme), false, C32401a.m74897a());
        }
    }

    /* renamed from: b */
    public final void mo60468b() {
        super.mo60468b();
        if (this.f79178a != null) {
            this.f79178a.aq_();
        }
    }

    /* renamed from: g */
    public final boolean mo60710g() {
        if (this.f79183m == null || !this.f79183m.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo60711h() {
        if (mo60710g()) {
            this.f79183m.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo60465a() {
        this.f79178a = new C30493o(mo60471d());
        this.f79178a.mo54799a(new C30491n());
        try {
            C0654k j = mo60475j();
            Fragment a = j.mo2224a("comment");
            if (a != null) {
                C0679r a2 = j.mo2225a();
                a2.mo2177a(a);
                a2.mo2189b();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo60466a(String str) {
        this.f79188r = str;
    }

    /* renamed from: b_ */
    public final void mo60469b_(String str) {
        this.f78762g = str;
    }

    /* renamed from: b */
    private JSONObject m71229b(Aweme aweme) {
        return m71226a(C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, this.f78761f), aweme);
    }

    /* renamed from: c */
    private void m71231c(Aweme aweme) {
        if (mo60470c() != null && !mo60470c().isFinishing()) {
            if (this.f79180j == null) {
                this.f79180j = new C29743l(mo60470c(), aweme, this.f78760e);
            }
            try {
                if (!this.f79180j.isShowing()) {
                    this.f79180j.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m71228a(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsPrivateAvailable().mo47782d()).booleanValue();
        if (C47950q.m103755d(aweme) || C47950q.m103754c(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAuthor() == null || !C9431p.m18665a(C20902b.m53242a().getCurUserId(), aweme.getAuthor().getUid())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!booleanValue || !z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51536a(C25164b bVar) {
        boolean z;
        String str;
        C26129j jVar;
        Aweme aweme = bVar.f66637a;
        if (aweme != null) {
            if (mo60470c() == null) {
                C25069a.m60928b("getActivity() is null");
                return;
            }
            boolean z2 = true;
            if (!C23198ae.m56880p(aweme) || !aweme.isProhibited()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C10691a.m21542b((Context) mo60470c(), (int) R.string.wa).mo19066a();
                return;
            }
            C25171f requestId = new C25171f(aweme.getAid()).setRequestId(m71229b(aweme).optString("request_id"));
            if (aweme.getAuthor() != null) {
                str = aweme.getAuthor().getUid();
            } else {
                str = "";
            }
            C25171f enableComment = ((C25171f) requestId.setAuthorUid(str)).setEventType(this.f78760e).setSource(0).setMyProfile(this.f78764i).setPlayListId(this.f79186p).setPlayListIdKey(this.f79185o).setPlayListType(this.f79184n).setPageType(this.f78761f).setTabName(this.f79187q).setEnableComment(!aweme.isCmtSwt());
            if (aweme.getAdCommentStruct() == null) {
                jVar = null;
            } else {
                jVar = aweme.getAdCommentStruct().setAid(aweme.getAid());
            }
            C25171f commentClose = enableComment.setAdCommentStruct(jVar).setCommentClose(C41626j.m91502b(aweme));
            if (C41626j.m91502b(aweme) || C41626j.m91501a(aweme)) {
                z2 = false;
            }
            C25171f isLongItem = commentClose.setCommentLimited(z2).setForceHideKeyboard(bVar.f66641e).forceRefresh(bVar.f66644h).setPoiId(bVar.f66643g).setScrollToTop(bVar.f66639c).setCreationId(bVar.f66653q).setIsLongItem(C36351a.m82034a(this.f78758c));
            if (!TextUtils.isEmpty(bVar.f66638b)) {
                isLongItem.setInsertCids(bVar.f66638b, bVar.f66640d, bVar.f66642f);
            }
            if (TextUtils.equals("click_comment_chain", this.f78760e)) {
                isLongItem.setEnterMethod(this.f78762g);
            }
            C25259h showCommentList = C25280a.m61493a().showCommentList(mo60470c(), aweme, isLongItem);
            if (showCommentList != null) {
                if (!showCommentList.isAdded() && aweme.getAuthor() != null && aweme.isCmtSwt()) {
                    if (aweme.getAuthor().isAdFake() || aweme.isAd()) {
                        StringBuilder sb = new StringBuilder(" aweme id = ");
                        sb.append(aweme.getAid());
                        sb.append(" author id = ");
                        sb.append(aweme.getAuthorUid());
                        sb.append(" current uid = ");
                        sb.append(C20902b.m53242a().getCurUserId());
                        C32458a.m75150b("CommentForbidRight", sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder(" aweme id = ");
                        sb2.append(aweme.getAid());
                        sb2.append(" author id = ");
                        sb2.append(aweme.getAuthorUid());
                        sb2.append(" current uid = ");
                        sb2.append(C20902b.m53242a().getCurUserId());
                        C32458a.m75150b("CommentForbidError", sb2.toString());
                    }
                }
                showCommentList.mo51542a(new C30404i(this, aweme));
            }
        }
    }

    /* renamed from: a */
    private void m71227a(final Activity activity, final Aweme aweme) {
        if (!this.f79179b && aweme != null && ((aweme.getAwemeControl() == null || aweme.getAwemeControl().canShare()) && !C47915gg.m103651b())) {
            this.f79179b = true;
            C31205q.m72868a(aweme, (C31207a) new C31207a() {
                /* renamed from: a */
                public final void mo60265a() {
                    C30303h.this.f79179b = false;
                }

                /* renamed from: b */
                public final void mo60267b() {
                    C30303h.this.f79179b = false;
                }

                /* renamed from: a */
                public final void mo60266a(Room room) {
                    String str;
                    C30303h.this.f79179b = false;
                    if (room.getOwner() == null) {
                        C31208r.m72883a(aweme, "ttlive_cny_share_all", false, "Room.owner is null");
                        return;
                    }
                    IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                    if (baseUserService_Monster != null) {
                        str = baseUserService_Monster.getCurrentUserID();
                    } else {
                        str = "";
                    }
                    long j = 0;
                    try {
                        j = Long.parseLong(str);
                    } catch (Exception unused) {
                    }
                    C8635a a = C8633b.m17040a(room);
                    a.f23673v = room.getId();
                    a.f23674w = room.getOwnerUserId();
                    a.mo15111a(j);
                    LiveSharePackage.m92558a(activity, a.mo15117b(room.getUserShareText()).mo15115a(false).mo15116a(), new C8632a() {
                        /* renamed from: a */
                        public final void mo8971a(Throwable th) {
                            C31208r.m72883a(aweme, "ttlive_cny_share_all", false, th.getMessage());
                            C31208r.m72883a(aweme, "ttlive_cny_share_error", false, th.getMessage());
                        }

                        /* renamed from: a */
                        public final void mo8970a(String str, String str2) {
                            C31208r.m72882a(aweme, "ttlive_cny_share_all", true);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    private JSONObject m71226a(JSONObject jSONObject, Aweme aweme) {
        boolean z;
        if (this.f78763h != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("enter_from", this.f78760e);
                if ("like_banner".equals(this.f78763h)) {
                    jSONObject.put("previous_page", this.f78763h);
                } else {
                    jSONObject.put("enter_method", this.f78763h);
                }
                if (aweme == null || aweme.getAwemeType() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    jSONObject.put("is_photo", 1);
                } else {
                    jSONObject.put("is_photo", 0);
                }
                jSONObject.put("author_id", aweme.getAuthorUid());
                if (!TextUtils.isEmpty(C23198ae.m56861e(aweme))) {
                    jSONObject.put("poi_id", C23198ae.m56861e(aweme));
                }
                if (C23198ae.m56858c(this.f78760e)) {
                    jSONObject.put("poi_type", C23198ae.m56867h(aweme));
                    jSONObject.put("city_info", C23198ae.m56845a());
                    jSONObject.put("distance_info", C23198ae.m56869i(aweme));
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    private void m71230c(Activity activity, Aweme aweme, C41976ao aoVar) {
        Bundle bundle = new Bundle();
        bundle.putString("play_list_type", this.f79184n);
        bundle.putString("play_list_id_key", this.f79185o);
        bundle.putString("play_list_id_value", this.f79186p);
        bundle.putString("play_list_id", this.f79186p);
        bundle.putString("play_list_type", this.f79184n);
        bundle.putString("play_list_id_key", this.f79185o);
        bundle.putString("tab_name", this.f79187q);
        bundle.putString("event_type", this.f79182l.mo60874g(true));
        bundle.putString("enter_method", this.f78763h);
        bundle.putString("creation_id", this.f79188r);
        if (aoVar != null) {
            aoVar.mo86065a(bundle);
        }
        this.f79183m = C41979aq.m91946a().shareAweme(activity, this.f78759d, aweme, m71228a(aweme), this.f79181k, bundle);
    }

    /* renamed from: b */
    public final void mo60709b(Activity activity, Aweme aweme, C41976ao aoVar) {
        if (activity == null) {
            activity = mo60470c();
        }
        Activity activity2 = activity;
        if (activity2 != null && !activity2.isFinishing()) {
            if (C26235d.m63571b(aweme)) {
                m71227a(activity2, aweme);
            } else if (C29694b.m69744a(aweme, this.f78760e)) {
                m71231c(aweme);
            } else if ((!C23198ae.m56880p(aweme) || !aweme.isProhibited()) && !C36330a.m81965b(aweme)) {
                Bundle bundle = new Bundle();
                bundle.putString("play_list_type", this.f79184n);
                bundle.putString("play_list_id_key", this.f79185o);
                bundle.putString("play_list_id_value", this.f79186p);
                bundle.putString("play_list_id", this.f79186p);
                bundle.putString("play_list_type", this.f79184n);
                bundle.putString("play_list_id_key", this.f79185o);
                bundle.putString("tab_name", this.f79187q);
                bundle.putString("event_type", this.f79182l.mo60874g(true));
                bundle.putString("enter_method", this.f78763h);
                bundle.putString("creation_id", this.f79188r);
                if (aoVar != null) {
                    aoVar.mo86065a(bundle);
                }
                this.f79183m = C41979aq.m91946a().showMore(activity2, this.f78759d, aweme, this.f79181k, bundle);
            } else {
                C31013k kVar = new C31013k(activity2, this.f79181k, this.f78760e, this.f78761f);
                kVar.f81209f = aweme;
                kVar.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo60707a(Activity activity, Aweme aweme, C41976ao aoVar) {
        boolean z;
        boolean z2;
        if (activity == null) {
            activity = mo60470c();
        }
        Activity activity2 = activity;
        if (activity2 != null && !activity2.isFinishing() && aweme.getVideo() != null) {
            boolean z3 = true;
            if (RefineShareInSiteExperiment.INSTANCE.mo73737b()) {
                boolean isMe = C20854a.m53167g().isMe(aweme.getAuthorUid());
                boolean d = C47950q.m103755d(aweme);
                if (!C47950q.m103756e(aweme) || isMe) {
                    z = false;
                } else {
                    z = true;
                }
                if (aweme.isProhibited() || aweme.isDelete() || (aweme.isSelfSee() && aweme.isReviewed())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean a = C36330a.m81964a(aweme);
                boolean z4 = !aweme.getAwemeControl().canShare();
                if (!d && !z && !z2 && !a && !z4) {
                    z3 = false;
                }
                if (z3) {
                    C10691a.m21548c((Context) activity2, (int) R.string.fqx).mo19066a();
                } else {
                    m71230c(activity2, aweme, aoVar);
                }
            } else if (C26235d.m63571b(aweme)) {
                m71227a(activity2, aweme);
            } else if (C29694b.m69744a(aweme, this.f78760e)) {
                m71231c(aweme);
            } else if ((C23198ae.m56880p(aweme) && aweme.isProhibited()) || C36330a.m81965b(aweme)) {
                C31013k kVar = new C31013k(activity2, this.f79181k, this.f78760e, this.f78761f);
                kVar.f81209f = aweme;
                kVar.show();
            } else if (m71228a(aweme)) {
                Bundle bundle = new Bundle();
                bundle.putString("play_list_type", this.f79184n);
                bundle.putString("play_list_id_key", this.f79185o);
                bundle.putString("play_list_id_value", this.f79186p);
                bundle.putString("play_list_id", this.f79186p);
                bundle.putString("play_list_type", this.f79184n);
                bundle.putString("play_list_id_key", this.f79185o);
                bundle.putString("tab_name", this.f79187q);
                bundle.putString("event_type", this.f79182l.mo60874g(true));
                bundle.putString("enter_method", this.f78763h);
                if (aoVar != null) {
                    aoVar.mo86065a(bundle);
                }
                this.f79183m = C41979aq.m91946a().sharePrivateAweme(activity2, this.f78759d, aweme, this.f79181k, bundle);
            } else {
                m71230c(activity2, aweme, aoVar);
            }
        }
    }

    public C30303h(String str, int i, C30313ae<C30332aw> aeVar, C30447d dVar) {
        super(str, i);
        this.f79181k = aeVar;
        this.f79182l = dVar;
        C41581bc.m91416a();
    }

    /* renamed from: a */
    public final void mo60467a(String str, String str2, String str3, String str4) {
        this.f79186p = str3;
        this.f79184n = str;
        this.f79185o = str2;
        this.f79187q = str4;
    }
}

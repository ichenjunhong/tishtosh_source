package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26036ac;
import com.p683ss.android.ugc.aweme.commercialize.log.C26037ad;
import com.p683ss.android.ugc.aweme.commercialize.log.C26038ae;
import com.p683ss.android.ugc.aweme.commercialize.log.C26057av;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26081f;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.log.C26093q;
import com.p683ss.android.ugc.aweme.commercialize.log.C26096t;
import com.p683ss.android.ugc.aweme.commercialize.log.C26097u;
import com.p683ss.android.ugc.aweme.commercialize.model.C26147z.C26148a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedAdAsyncLogExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ac */
public final class C25869ac implements C25882an {
    /* renamed from: a */
    public final void mo53127a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        C26088l.m63300a(context, str, str2, jSONObject, str3, j);
    }

    /* renamed from: a */
    public final void mo53128a(C26057av avVar, Collection<String> collection, boolean z) {
        C26081f.m63237a((C26057av) null, collection, false);
    }

    /* renamed from: a */
    public final void mo53129a(String str, UrlModel urlModel, Long l, String str2, C52682m<Object, Boolean, Object> mVar) {
        C26060ay.f68819a.mo53545a(str, urlModel, l, str2, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25870ad<Object,Object,Object>(mVar));
    }

    /* renamed from: a */
    public final void mo53126a(Context context, String str, String str2, String str3, String str4, String str5) {
        C26077e.m63190a().mo53582a(str).mo53593b(str2).mo53604i(str3).mo53602g(str4).mo53596c(str5).mo53586a(context);
    }

    /* renamed from: a */
    public final void mo53125a(Context context, String str, String str2, String str3) {
        C26088l.m63297a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo53124a(Context context, String str, Aweme aweme) {
        if (C26088l.m63256C(context, aweme)) {
            HashMap hashMap = new HashMap();
            if (aweme.getAuthor() != null) {
                hashMap.put("anchor_id", aweme.getAuthor().getUid());
                long j = aweme.getAuthor().roomId;
                if (!(j != 0 || aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null)) {
                    j = aweme.getRoomFeedCellStruct().getNewLiveRoomData().f79734id;
                }
                hashMap.put("room_id", String.valueOf(j));
            }
            C26088l.m63299a(context, str, "live_click_source", C26088l.m63264a(context, aweme, "ad live click", false, C26088l.m63261a((Map<String, Object>) hashMap)), aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public final void mo53123a(Context context, AwemeRawAd awemeRawAd, String str) {
        if (C26088l.m63351e(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            C26088l.m63299a(context, str, "hide_app", C26088l.m63329c(context, awemeRawAd, "ad hide app event"), awemeRawAd);
        }
    }

    /* renamed from: a */
    public final long mo53113a(AwemeRawAd awemeRawAd) {
        return C26088l.m63259a(awemeRawAd);
    }

    /* renamed from: A */
    public final void mo53110A(Context context, Aweme aweme) {
        C26088l.m63385v(context, aweme);
    }

    /* renamed from: B */
    public final void mo53111B(Context context, Aweme aweme) {
        C26088l.m63386w(context, aweme);
    }

    /* renamed from: C */
    public final void mo53112C(Context context, Aweme aweme) {
        C26088l.m63388y(context, aweme);
    }

    /* renamed from: b */
    public final void mo53132b(Context context, Aweme aweme) {
        C26088l.m63330c(context, aweme);
    }

    /* renamed from: d */
    public final void mo53139d(Context context, Aweme aweme) {
        C26088l.m63380q(context, aweme);
    }

    /* renamed from: f */
    public final void mo53142f(Context context, Aweme aweme) {
        C26088l.m63367j(context, aweme);
    }

    /* renamed from: g */
    public final void mo53143g(Context context, Aweme aweme) {
        C26088l.m63369k(context, aweme);
    }

    /* renamed from: k */
    public final void mo53147k(Context context, Aweme aweme) {
        C26088l.m63311b(context, aweme);
    }

    /* renamed from: x */
    public final void mo53160x(Context context, Aweme aweme) {
        C26088l.m63383t(context, aweme);
    }

    /* renamed from: z */
    public final void mo53162z(Context context, Aweme aweme) {
        C26088l.m63384u(context, aweme);
    }

    /* renamed from: i */
    public final void mo53145i(Context context, Aweme aweme) {
        C26088l.m63322b(context, "logo_show", aweme, C26088l.m63373m(context, aweme, "raw ad logo show"));
    }

    /* renamed from: l */
    public final void mo53148l(Context context, Aweme aweme) {
        C26088l.m63322b(context, "play_failed", aweme, C26088l.m63263a(context, aweme, "raw ad play failed", false));
    }

    /* renamed from: m */
    public final void mo53149m(Context context, Aweme aweme) {
        C26088l.m63293a(context, "landing_open_url_app", aweme, C26088l.m63373m(context, aweme, "landing ad open url"));
    }

    /* renamed from: o */
    public final void mo53151o(Context context, Aweme aweme) {
        C26088l.m63293a(context, "landing_deeplink_failed", aweme, C26088l.m63373m(context, aweme, "landing ad deeplink failed"));
    }

    /* renamed from: p */
    public final void mo53152p(Context context, Aweme aweme) {
        C26088l.m63322b(context, "open_card_show", aweme, C26088l.m63373m(context, aweme, "open app hint show"));
    }

    /* renamed from: q */
    public final void mo53153q(Context context, Aweme aweme) {
        C26088l.m63322b(context, "open_card_close", aweme, C26088l.m63373m(context, aweme, "open app hint close"));
    }

    /* renamed from: r */
    public final void mo53154r(Context context, Aweme aweme) {
        C26088l.m63322b(context, "open_card_jump", aweme, C26088l.m63373m(context, aweme, "open app hint jump"));
    }

    /* renamed from: s */
    public final void mo53155s(Context context, Aweme aweme) {
        C26088l.m63343d(context, "homepagelink_click", aweme, C26088l.m63373m(context, aweme, "raw ad homepage follow"));
    }

    /* renamed from: w */
    public final void mo53159w(Context context, Aweme aweme) {
        C26088l.m63343d(context, "button_show", aweme, C26088l.m63373m(context, aweme, "raw homepage ad button show"));
    }

    /* renamed from: a */
    public final void mo53118a(Context context, Aweme aweme) {
        C26088l.m63281a(context, aweme, (FollowStatus) null);
    }

    /* renamed from: c */
    public final void mo53137c(Context context, Aweme aweme) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63296a(context, "draw_ad", "live_show", aweme, C26088l.m63373m(context, aweme, "live_show"));
        }
    }

    /* renamed from: e */
    public final void mo53141e(Context context, Aweme aweme) {
        C26077e.m63190a().mo53582a("draw_ad").mo53593b("otherclick").mo53590b(aweme).mo53602g("comment_sign").mo53586a(context);
    }

    /* renamed from: j */
    public final void mo53146j(Context context, Aweme aweme) {
        if (FeedAdAsyncLogExperiment.m70945a()) {
            C26088l.m63305a((Callable) new C26096t(context, aweme));
        } else {
            C26088l.m63379p(context, aweme);
        }
    }

    /* renamed from: t */
    public final void mo53156t(Context context, Aweme aweme) {
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("click_call_dy").mo53590b(aweme).mo53586a(context);
    }

    /* renamed from: u */
    public final void mo53157u(Context context, Aweme aweme) {
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("click_download").mo53590b(aweme).mo53586a(context);
    }

    /* renamed from: v */
    public final void mo53158v(Context context, Aweme aweme) {
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("click_website").mo53590b(aweme).mo53586a(context);
    }

    /* renamed from: h */
    public final void mo53144h(Context context, Aweme aweme) {
        C26088l.m63322b(context, "logo_click", aweme, C26088l.m63373m(context, aweme, "raw ad logo click"));
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26093q<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: n */
    public final void mo53150n(Context context, Aweme aweme) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63293a(context, "landing_deeplink_success", aweme, C26088l.m63373m(context, aweme, "landing ad deeplink success"));
            new C26148a().mo53762a("landing_ad").mo53760a(System.currentTimeMillis() - 5000).mo53761a(aweme.getAwemeRawAd()).mo53763a();
        }
    }

    /* renamed from: y */
    public final void mo53161y(Context context, Aweme aweme) {
        C26088l.m63343d(context, "click", aweme, C26088l.m63263a(context, aweme, "raw homepage ad click", true));
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26097u<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: a */
    public final void mo53119a(Context context, Aweme aweme, int i) {
        C26088l.m63278a(context, aweme, i);
    }

    /* renamed from: b */
    public final void mo53133b(Context context, Aweme aweme, FollowStatus followStatus) {
        C26088l.m63314b(context, aweme, followStatus);
    }

    /* renamed from: a */
    public final JSONObject mo53114a(Context context, JSONObject jSONObject, String str) throws JSONException {
        return C26088l.m63268a(context, jSONObject, str);
    }

    /* renamed from: b */
    public final void mo53134b(Context context, Aweme aweme, String str) {
        C26088l.m63376n(context, aweme, str);
    }

    /* renamed from: b */
    public final void mo53131b(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C26077e.m63190a().mo53593b("click").mo53604i(banner.getLogExtra()).mo53582a("discovery_ad").mo53602g("banner").mo53580a(Long.valueOf(banner.getCreativeId())).mo53581a((Object) hashMap).mo53586a(context);
        C26060ay.f68819a.mo53547a("click", banner.getClickTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new C26038ae(hashMap, banner));
    }

    /* renamed from: a */
    public final void mo53117a(Context context, Banner banner, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("banner_order", Integer.valueOf(i));
        C26077e.m63190a().mo53593b("show").mo53604i(banner.getLogExtra()).mo53582a("discovery_ad").mo53602g("banner").mo53580a(Long.valueOf(banner.getCreativeId())).mo53581a((Object) hashMap).mo53586a(context);
        C26060ay.f68819a.mo53547a("show", banner.getTrackUrlList(), Long.valueOf(banner.getCreativeId()), banner.getLogExtra(), new JSONObject(hashMap), new C26037ad(hashMap, banner));
    }

    /* renamed from: a */
    public final void mo53120a(Context context, Aweme aweme, FollowStatus followStatus) {
        C26088l.m63281a(context, aweme, followStatus);
    }

    /* renamed from: a */
    public final void mo53121a(Context context, Aweme aweme, String str) {
        C26088l.m63340d(context, aweme, str);
    }

    /* renamed from: a */
    public final void mo53122a(Context context, Aweme aweme, JSONObject jSONObject) {
        C26088l.m63288a(context, aweme, jSONObject);
    }

    /* renamed from: c */
    public final void mo53138c(Context context, String str, String str2, String str3) {
        C26088l.m63337c(context, str, str2, str3);
    }

    /* renamed from: d */
    public final void mo53140d(Context context, String str, String str2, String str3) {
        C26088l.m63344d(context, str, str2, str3);
    }

    /* renamed from: b */
    public final void mo53135b(Context context, String str, String str2, String str3) {
        C26088l.m63325b(context, str, str2, str3);
    }

    /* renamed from: b */
    public final void mo53130b(Context context, long j, String str, UrlModel urlModel) {
        C26077e.m63190a().mo53593b("click").mo53604i(str).mo53582a("discovery_ad").mo53602g("title").mo53580a(Long.valueOf(j)).mo53586a(context);
        C26060ay.f68819a.mo53545a("click", urlModel, Long.valueOf(j), str, null);
    }

    /* renamed from: c */
    public final void mo53136c(Context context, long j, String str, UrlModel urlModel) {
        C26077e.m63190a().mo53593b("show").mo53604i(str).mo53582a("discovery_ad").mo53602g("hashtag").mo53580a(Long.valueOf(j)).mo53586a(context);
        C26060ay.f68819a.mo53545a("show", urlModel, Long.valueOf(j), str, null);
    }

    /* renamed from: a */
    public final void mo53115a(Context context, long j, String str, UrlModel urlModel) {
        C26077e.m63190a().mo53593b("video_slide").mo53604i(str).mo53582a("discovery_ad").mo53602g("video").mo53580a(Long.valueOf(j)).mo53586a(context);
        C26077e.m63190a().mo53593b("click").mo53604i(str).mo53582a("discovery_ad").mo53602g("video").mo53580a(Long.valueOf(j)).mo53586a(context);
        C26060ay.f68819a.mo53545a("click", urlModel, Long.valueOf(j), str, null);
    }

    /* renamed from: a */
    public final void mo53116a(Context context, long j, String str, UrlModel urlModel, String str2) {
        C26080b i = C26077e.m63190a().mo53593b("auto_full_screen").mo53582a("discovery_ad").mo53602g("video").mo53580a(Long.valueOf(j)).mo53604i(str);
        i.f68872a.mo53571a("item_id", (Object) str2);
        i.mo53586a(context);
        C26060ay.f68819a.mo53545a("click", urlModel, Long.valueOf(j), str, C26036ac.f68782a);
    }
}

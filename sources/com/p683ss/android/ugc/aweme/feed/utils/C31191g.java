package com.p683ss.android.ugc.aweme.feed.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23212ar;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.g */
public final class C31191g {
    /* renamed from: a */
    public static void m72852a(C30332aw awVar, C30669b bVar, String str) {
        C0013i.m18a((Callable<TResult>) new C31192h<TResult>(awVar, str, bVar), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m72848a(C30332aw awVar, String str, C30669b bVar) throws Exception {
        String str2 = "";
        String str3 = "";
        int i = awVar.f79228a;
        if (i == 19) {
            str2 = "head";
            str3 = "click_head";
        } else if (i == 18) {
            str2 = LeakCanaryFileProvider.f132049i;
            str3 = "click_name";
        }
        C26898j jVar = new C26898j();
        try {
            jVar.mo54849a("group_id", ((Aweme) awVar.f79229b).getAid());
            jVar.mo54849a("request_id", str);
            if (C31190f.m72836d((Aweme) awVar.f79229b)) {
                jVar.mo54849a("is_photo", "1");
            }
            jVar.mo54849a("to_user_id", ((Aweme) awVar.f79229b).getAuthorUid());
            jVar.mo54849a("author_id", ((Aweme) awVar.f79229b).getAuthorUid());
            if (!TextUtils.isEmpty(C23198ae.m56861e((Aweme) awVar.f79229b))) {
                jVar.mo54849a("poi_id", C23198ae.m56861e((Aweme) awVar.f79229b));
            }
            if (C23198ae.m56858c(bVar.getEventType())) {
                jVar.mo54849a("poi_type", C23198ae.m56867h((Aweme) awVar.f79229b));
                jVar.mo54849a("poi_channel", C23198ae.m56852b());
                jVar.mo54849a("city_info", C23198ae.m56845a());
                jVar.mo54849a("distance_info", C23198ae.m56869i((Aweme) awVar.f79229b));
            }
            C26890h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(bVar.getEventType()).setValue(((Aweme) awVar.f79229b).getAuthor().getUid()).setJsonObject(jVar.mo54850a()));
            jVar.mo54849a("enter_from", bVar.getEventType());
            jVar.mo54849a("enter_method", str3);
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(((Aweme) awVar.f79229b).getAuthor().getUid()).setJsonObject(jVar.mo54850a()));
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static void m72851a(Context context, Aweme aweme, JSONObject jSONObject, C30669b bVar, String str) {
        String str2;
        int pageType = bVar.getPageType();
        if (pageType == 7) {
            str2 = "homepage_fresh";
        } else if (pageType != 11) {
            switch (pageType) {
                case 0:
                    str2 = "homepage_hot";
                    break;
                case 1:
                    str2 = "homepage_follow";
                    break;
                default:
                    return;
            }
        } else {
            str2 = "categorized_city_poi";
        }
        C31193i iVar = new C31193i(jSONObject, aweme, str2, str, context, aweme.getAid(), bVar);
        C0013i.m18a((Callable<TResult>) iVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m72850a(boolean z, String str, String str2, String str3, String str4, C30669b bVar) throws Exception {
        String str5;
        String str6;
        String str7;
        MobClick obtain = MobClick.obtain();
        if (z) {
            str5 = "slide_down";
        } else {
            str5 = "slide_up";
        }
        C26890h.onEvent(obtain.setEventName(str5).setLabelName("homepage_hot").setJsonObject(C23088c.m56631a().mo47824a("request_id", str).mo47824a("author_id", str2).mo47824a("from_group_id", str3).mo47824a("to_group_id", str4).mo47825b()));
        C23089d a = C23089d.m56640a().mo47829a("request_id", str).mo47829a("author_id", str2).mo47829a("from_group_id", str3).mo47829a("to_group_id", str4).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str4));
        if (TextUtils.equals("homepage_hot", bVar.getEventType())) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(str));
            a.mo47829a("enter_play_method", "manul_play");
            if (z) {
                str7 = "homepage_hot_slide_down";
            } else {
                str7 = "homepage_hot_slide_up";
            }
            C26890h.m65012a(str7, C23198ae.m56851a(a.f61491a));
        } else {
            if (z) {
                str6 = "homepage_hot_slide_down";
            } else {
                str6 = "homepage_hot_slide_up";
            }
            C26890h.m65011a(str6, a.f61491a);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m72849a(JSONObject jSONObject, Aweme aweme, String str, String str2, Context context, String str3, C30669b bVar) throws Exception {
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", aweme.getAuthorUid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (!TextUtils.isEmpty(C23198ae.m56861e(aweme))) {
                jSONObject.put("poi_id", C23198ae.m56861e(aweme));
            }
            if (C23198ae.m56858c(str)) {
                jSONObject.put("poi_type", C23198ae.m56867h(aweme));
                jSONObject.put("city_info", C23198ae.m56845a());
                jSONObject.put("distance_info", C23198ae.m56869i(aweme));
            }
            if (C23198ae.m56862e(str2)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", C23198ae.m56879o(aweme));
                if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                    jSONObject.put("is_reposted", "1");
                    jSONObject.put("repost_from_group_id", aweme.getRepostFromGroupId());
                    jSONObject.put("repost_from_user_id", aweme.getRepostFromUserId());
                }
            }
        } catch (JSONException unused) {
        }
        C26890h.m65006a(context, "show", str, str3, 0, jSONObject);
        if (C23198ae.m56862e(str2)) {
            jSONObject.put("enter_from", str);
            C26890h.m65014b("show", jSONObject);
        }
        C26890h.m65011a("video_show", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", str3).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56872j(str3))).mo47826a("_staging_flag", 0).mo47827a("feed_count", aweme.getFeedCount()).mo47829a("order", C23198ae.m56854b(aweme, bVar.getPageType())).f61491a);
        new C23212ar().mo47997a(str2).mo47999c(aweme, bVar.getPageType()).mo48076e();
        return null;
    }
}

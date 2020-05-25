package com.p683ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import com.p683ss.android.ugc.aweme.p1382aq.C23246p;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.ak */
public final class C28393ak {

    /* renamed from: a */
    private static Map<Integer, String> f74558a;

    /* renamed from: a */
    private static void m67389a(View view, String str, Aweme aweme, String str2, int i, String str3, String str4) {
        if (str.equals("general_search") || str.equals("search_result") || str.equals("similar_videos") || str.equals("ecommerce") || str.equals("homepage_fresh_search")) {
            C28381ab.m67350a(view, aweme.getAid(), -1);
            C28394al alVar = new C28394al(aweme, str, str2, -1, str3, str4);
            C0013i.m18a((Callable<TResult>) alVar, (Executor) C24076h.m58904e());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f74558a = hashMap;
        hashMap.put(Integer.valueOf(3), "general_search");
        f74558a.put(Integer.valueOf(6), "search_sug");
        f74558a.put(Integer.valueOf(C41440e.FROM_NEARBY), "homepage_fresh_search");
    }

    /* renamed from: a */
    public static String m67382a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "click_search_recommend";
        }
        return "click_search_result";
    }

    /* renamed from: a */
    public static String m67381a(int i) {
        String str = (String) f74558a.get(Integer.valueOf(i));
        if (str == null || TextUtils.isEmpty(str)) {
            return "search_result";
        }
        return str;
    }

    /* renamed from: a */
    public static void m67387a(View view, String str, Aweme aweme) {
        m67388a(view, str, aweme, "");
    }

    /* renamed from: a */
    private static void m67383a(int i, String str, Music music) {
        if (i != 3) {
            C23088c a = C23088c.m56631a();
            if (!TextUtils.isEmpty(str)) {
                a.mo47824a("search_keyword", str);
                C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setExtValueString(music.getMid()).setJsonObject(a.mo47825b()));
            } else {
                a.mo47824a("source", "recommend");
                a.mo47824a("id", music.getMid());
                C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("search_result").setJsonObject(a.mo47825b()));
            }
        } else {
            C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("general_search").setValue(music.getMid()));
        }
    }

    /* renamed from: b */
    public static void m67390b(int i, String str, String str2) {
        if (i == 3) {
            C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("general_search").setValue(str));
            return;
        }
        C23088c a = C23088c.m56631a();
        if (!TextUtils.isEmpty(str2)) {
            a.mo47824a("search_keyword", str2);
            C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setExtValueString(str).setJsonObject(a.mo47825b()));
            return;
        }
        a.mo47824a("source", "recommend");
        a.mo47824a("id", str);
        C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName("search_result").setJsonObject(a.mo47825b()));
    }

    /* renamed from: a */
    public static void m67384a(int i, String str, String str2) {
        C23088c a = C23088c.m56631a();
        if (i != 3) {
            a.mo47824a("group_id", "");
            a.mo47824a("request_id", str);
            a.mo47824a("enter_from", "search_result");
            a.mo47824a("enter_method", "click_card");
            a.mo47824a("enter_type", "normal_way");
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(a.mo47825b()));
            return;
        }
        a.mo47824a("enter_from", "general_search");
        a.mo47824a("enter_method", "click_card");
        a.mo47824a("enter_type", "normal_way");
        C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str2).setJsonObject(a.mo47825b()));
    }

    /* renamed from: a */
    public static void m67388a(View view, String str, Aweme aweme, String str2) {
        m67389a(view, str, aweme, str2, -1, "", "");
    }

    /* renamed from: a */
    public static void m67385a(int i, String str, String str2, C23231d dVar, int i2, String str3) {
        new C28383ad().setOrder(i).setSearchKeyword(str).setRid(str2).setEnterFrom(m67381a(i2)).setEnterMethod(str3).installToMetrics(dVar);
        dVar.mo48076e();
    }

    /* renamed from: a */
    static final /* synthetic */ Object m67380a(Aweme aweme, String str, String str2, int i, String str3, String str4) throws Exception {
        C26890h.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(C23088c.m56631a().mo47824a("request_id", C23198ae.m56857c(aweme)).mo47825b()));
        C23089d dVar = new C23089d();
        dVar.mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid()).mo47829a("search_keyword", str2).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
        dVar.mo47829a("video_tag", "");
        if (i >= 0) {
            dVar.mo47826a("rank", i);
        }
        if (!TextUtils.isEmpty(str3)) {
            dVar.mo47829a("search_result_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            dVar.mo47829a("list_item_id", str4);
        }
        C26890h.m65012a("feed_enter", C23198ae.m56851a(dVar.f61491a));
        return null;
    }

    /* renamed from: a */
    public static void m67386a(View view, int i, String str, int i2, String str2, Music music, String str3, String str4) {
        C28381ab.m67350a(view, music.getMid(), i);
        if (TextUtils.isEmpty(str2)) {
            str2 = C28381ab.m67359d().mo56813a(i2);
        }
        String str5 = str2;
        m67385a(i, str, str5, (C23231d) ((C23246p) ((C23246p) ((C23246p) new C23246p().mo47942a(true)).mo48127t(music.getMid()).mo48124g(m67381a(i2)).mo47944b(false)).mo47943b(String.valueOf(i))).mo48128u(str4).mo48129v(str5), i2, str3);
        m67383a(i2, str, music);
    }
}

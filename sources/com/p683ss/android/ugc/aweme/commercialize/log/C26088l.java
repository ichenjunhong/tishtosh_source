package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.commercialize.link.p1573a.C25948a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26055au.C26056a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26075d.C26076a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.model.C26147z.C26148a;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26252s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26461ca;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedAdAsyncLogExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.l */
public final class C26088l {

    /* renamed from: a */
    private static C26055au f68889a;

    /* renamed from: e */
    public static boolean m63351e(Context context, AwemeRawAd awemeRawAd) {
        return (context == null || awemeRawAd == null) ? false : true;
    }

    /* renamed from: a */
    private static JSONObject m63270a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C18085o m = new C18087q().mo35029a(jSONObject.getString("log_extra")).mo35009m();
            JSONObject jSONObject2 = new JSONObject();
            if (m.mo35022b("rit") != null) {
                jSONObject2.put("ctr_rit", m.mo35022b("rit").mo34905c());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m63305a(Callable callable) {
        C0013i.m18a(callable, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m63277a(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        if (C26512f.m64070m(aweme)) {
            HashMap hashMap2 = new HashMap();
            int i = 1;
            if (!C26252s.m63617d()) {
                i = 2;
            }
            hashMap2.put("awemelaunch", String.valueOf(i));
            hashMap2.put("ad_sequence", Integer.valueOf(SplashAdManagerHolder.m99458a((Context) AwemeApplication.m56199a()).mo38122h()));
            hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        }
        m63322b(context, "show", aweme, m63264a(context, aweme, "raw ad show", false, (Map<String, String>) hashMap));
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            C26060ay.f68819a.mo53545a("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26090n<Object,Object,Object>(aweme));
        }
        C26471cd.m64019b(aweme);
        C23131p.m56692a("ctr_monitor", "ctr_show", m63270a(m63373m(context, aweme, "raw ad show")));
    }

    /* renamed from: a */
    public static void m63288a(Context context, Aweme aweme, JSONObject jSONObject) {
        m63322b(context, "show_failed", aweme, m63328c(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m63278a(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("filter_reason", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        m63322b(context, "item_repeat", aweme, m63264a(context, aweme, "raw ad item repeat", false, (Map<String, String>) hashMap));
    }

    /* renamed from: a */
    public static void m63293a(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "landing_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m63280a(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        if (FeedAdAsyncLogExperiment.m70945a()) {
            C26045al alVar = new C26045al(context, aweme, j, i, str, num);
            m63305a((Callable) alVar);
            return;
        }
        m63332c(context, aweme, j, i, str, num);
    }

    /* renamed from: a */
    public static void m63282a(Context context, Aweme aweme, String str) {
        if (C26461ca.m63988e(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trueview_play_type", str);
            m63322b(context, "trueview_play", aweme, m63264a(context, aweme, "trueview_play", false, m63261a((Map<String, Object>) hashMap)));
        } else {
            m63322b(context, "trueview_play", aweme, m63373m(context, aweme, "trueview_play"));
        }
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("play_valid", awemeRawAd.getEffectivePlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26046am<Object,Object,Object>(aweme));
        }
    }

    /* renamed from: a */
    public static void m63276a(Context context, C26448c cVar) {
        if (context != null && cVar != null) {
            String str = cVar.f69712b;
            Aweme aweme = cVar.f69711a;
            JSONObject e = m63345e(context, aweme, str, cVar.f69713c);
            HashMap hashMap = new HashMap();
            hashMap.put("fail_reason", cVar.f69714d);
            hashMap.put("card_type", cVar.f69715e);
            hashMap.put("status", cVar.f69716f);
            hashMap.put("is_preload", Boolean.valueOf(cVar.f69717g));
            m63306a(e, (Map<String, Object>) hashMap);
            m63322b(context, str, aweme, e);
            if (TextUtils.equals(cVar.f69712b, "click") && TextUtils.equals(cVar.f69713c, "card")) {
                C27170a.m65583a("draw_ad", "card");
            }
        }
    }

    /* renamed from: a */
    private static void m63306a(JSONObject jSONObject, Map<String, Object> map) {
        if (jSONObject != null && map.size() != 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map.entrySet()) {
                    if (!(entry.getValue() instanceof String) || !TextUtils.isEmpty((String) entry.getValue())) {
                        optJSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (optJSONObject.length() > 0) {
                    jSONObject.put("ad_extra_data", optJSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m63283a(Context context, Aweme aweme, String str, String str2) {
        m63322b(context, str, aweme, m63345e(context, aweme, str, str2));
    }

    /* renamed from: a */
    public static void m63286a(Context context, Aweme aweme, String str, Map<String, String> map) {
        JSONObject a = m63264a(context, aweme, "raw ad click", true, map);
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63322b(context, "click", aweme, a);
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26048ao<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: b */
    public static void m63317b(Context context, Aweme aweme, String str, Map<String, Object> map) {
        JSONObject a = m63264a(context, aweme, "raw ad click source", false, map == null ? null : m63261a(map));
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63322b(context, "click_source", aweme, a);
    }

    /* renamed from: a */
    public static void m63287a(Context context, Aweme aweme, Map<String, String> map) {
        HashMap hashMap;
        if (map.size() != 0) {
            hashMap = new HashMap();
            hashMap.put("ad_extra_data", new C17971f().mo34889b(map));
        } else {
            hashMap = null;
        }
        m63336c(context, "othershow", aweme, m63264a(context, aweme, "raw ad background show", false, (Map<String, String>) hashMap));
    }

    /* renamed from: b */
    public static void m63318b(Context context, Aweme aweme, Map<String, String> map) {
        m63336c(context, "click", aweme, m63264a(context, aweme, "raw ad background click", true, map));
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26095s<Object,Object,Object>(awemeRawAd));
        }
        C27170a.m65583a("background_ad", (String) map.get("refer"));
    }

    /* renamed from: a */
    public static void m63281a(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        if (C26512f.m64065h(aweme)) {
            HashMap hashMap = new HashMap();
            int i = 1;
            hashMap.put("is_cheated_follow", Integer.valueOf((followStatus == null || !followStatus.isCheating()) ? 0 : 1));
            String str = "follow_status";
            if (followStatus != null) {
                i = followStatus.followStatus;
            }
            hashMap.put(str, Integer.valueOf(i));
            jSONObject = m63264a(context, aweme, "raw ad follow", false, m63261a((Map<String, Object>) hashMap));
        } else {
            jSONObject = m63373m(context, aweme, "raw ad follow");
        }
        m63322b(context, "follow", aweme, jSONObject);
    }

    /* renamed from: a */
    public static void m63291a(Context context, AwemeRawAd awemeRawAd, String str) {
        m63324b(context, "click", awemeRawAd, m63265a(context, awemeRawAd, "raw feed comment click", true), str);
        if (awemeRawAd != null) {
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26100x<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: b */
    private static void m63324b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject, String str2) {
        if (jSONObject == null) {
            jSONObject = m63329c(context, awemeRawAd, "extJson miss");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m63294a(context, str, awemeRawAd, jSONObject);
    }

    /* renamed from: a */
    public static void m63290a(Context context, AwemeRawAd awemeRawAd) {
        m63323b(context, "comment_end_show", awemeRawAd, m63329c(context, awemeRawAd, "raw feed comment end show"));
    }

    /* renamed from: b */
    public static void m63320b(Context context, AwemeRawAd awemeRawAd) {
        m63323b(context, "othershow", awemeRawAd, m63329c(context, awemeRawAd, "raw feed comment end show"));
    }

    /* renamed from: b */
    public static void m63321b(Context context, AwemeRawAd awemeRawAd, String str) {
        m63295a(context, "click", awemeRawAd, m63265a(context, awemeRawAd, "raw feed comment end click", true), str);
        if (awemeRawAd != null) {
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26101y<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: a */
    public static void m63295a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject, String str2) {
        if (jSONObject == null) {
            jSONObject = m63329c(context, awemeRawAd, "extJson miss");
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m63323b(context, str, awemeRawAd, jSONObject);
    }

    /* renamed from: b */
    public static void m63319b(Context context, Aweme aweme, JSONObject jSONObject) {
        m63322b(context, "show_failed", aweme, m63328c(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m63289a(Context context, Aweme aweme, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("splash_id", C26512f.m64120V(aweme));
            jSONObject2.put("splash_ready", z);
            jSONObject2.put("show_immediately", z2);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException unused) {
        }
        m63322b(context, "splash_pick", aweme, m63328c(context, aweme, jSONObject));
    }

    /* renamed from: a */
    public static void m63273a(Context context, long j, String str, long j2) {
        JSONObject jSONObject;
        if (m63307a()) {
            try {
                JSONObject a = m63268a(context, (JSONObject) null, str);
                try {
                    jSONObject = m63271a(a, j2);
                } catch (JSONException unused) {
                    jSONObject = a;
                }
            } catch (JSONException unused2) {
                jSONObject = new JSONObject();
            }
            Context context2 = context;
            C26890h.m65006a(context2, "splash_ad", "first_view", String.valueOf(j), 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static boolean m63307a() {
        if (C26252s.m63616c()) {
            return false;
        }
        C26252s.m63615b(true);
        return true;
    }

    /* renamed from: a */
    public static JSONObject m63271a(JSONObject jSONObject, long j) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("launchduration", Long.valueOf(j));
            jSONObject.put("ad_extra_data", new C17971f().mo34889b(hashMap));
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m63284a(Context context, Aweme aweme, String str, String str2, Long l) {
        if (C26503d.m64061d(aweme)) {
            HashMap hashMap = new HashMap();
            if (!(aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null)) {
                LiveRoomStruct newLiveRoomData = aweme.getRoomFeedCellStruct().getNewLiveRoomData();
                hashMap.put("anchor_id", String.valueOf(newLiveRoomData.getAnchorId()));
                hashMap.put("room_id", String.valueOf(newLiveRoomData.f79734id));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            JSONObject a = m63264a(context, aweme, sb.toString(), false, m63261a((Map<String, Object>) hashMap));
            char c = 65535;
            switch (str.hashCode()) {
                case -1063031003:
                    if (str.equals("live_click_source")) {
                        c = 8;
                        break;
                    }
                    break;
                case -178769800:
                    if (str.equals("otherclick")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3423444:
                    if (str.equals("over")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3529469:
                    if (str.equals("show")) {
                        c = 0;
                        break;
                    }
                    break;
                case 94001407:
                    if (str.equals("break")) {
                        c = 5;
                        break;
                    }
                    break;
                case 94750088:
                    if (str.equals("click")) {
                        c = 9;
                        break;
                    }
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        c = 3;
                        break;
                    }
                    break;
                case 508681452:
                    if (str.equals("live_show_failed")) {
                        c = 1;
                        break;
                    }
                    break;
                case 702731954:
                    if (str.equals("click_source")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m63299a(context, "draw_ad", "show", a, aweme.getAwemeRawAd());
                    if (!C26503d.m64064g(aweme) || C26503d.m64051C(aweme)) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        C26060ay.f68819a.mo53545a("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), C26102z.f68907a);
                        return;
                    }
                case 1:
                    hashMap.put("live_show_failed_reason", Integer.valueOf(2));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(":");
                    sb2.append(str2);
                    m63299a(context, "draw_ad", "live_show_failed", m63264a(context, aweme, sb2.toString(), false, m63261a((Map<String, Object>) hashMap)), aweme.getAwemeRawAd());
                    return;
                case 2:
                    m63299a(context, "draw_ad", "play", a, aweme.getAwemeRawAd());
                    if (!C26503d.m64064g(aweme) || C26503d.m64051C(aweme)) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        C26060ay.f68819a.mo53545a("play", awemeRawAd2.getPlayTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), C26034aa.f68780a);
                        return;
                    }
                case 3:
                    m63299a(context, "draw_ad", "slide", a, aweme.getAwemeRawAd());
                    return;
                case 4:
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            a.put("refer", str2);
                        } catch (JSONException unused) {
                        }
                    }
                    if (l.longValue() >= 0) {
                        try {
                            a.put("duration", l);
                        } catch (JSONException unused2) {
                        }
                    }
                    m63299a(context, "draw_ad", "otherclick", a, aweme.getAwemeRawAd());
                    return;
                case 5:
                    if (l.longValue() >= 0) {
                        try {
                            a.put("duration", l);
                        } catch (JSONException unused3) {
                        }
                    }
                    m63299a(context, "draw_ad", "break", a, aweme.getAwemeRawAd());
                    if ((!C26503d.m64064g(aweme) || C26503d.m64051C(aweme)) && ((float) l.longValue()) >= aweme.getAwemeRawAd().getEffectivePlayTime().floatValue() * 1000.0f) {
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        C26060ay.f68819a.mo53546a("play_valid", aweme.getRawAdEffectivePlayTrackUrlList(), awemeRawAd3.getCreativeId(), awemeRawAd3.getLogExtra(), null);
                        return;
                    }
                case 6:
                    if (l.longValue() >= 0) {
                        try {
                            a.put("duration", l);
                        } catch (JSONException unused4) {
                        }
                    }
                    m63299a(context, "draw_ad", "over", a, aweme.getAwemeRawAd());
                    if (!C26503d.m64064g(aweme) || C26503d.m64051C(aweme)) {
                        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                        C26060ay.f68819a.mo53545a("play_over", awemeRawAd4.getPlayOverTrackUrlList(), awemeRawAd4.getCreativeId(), awemeRawAd4.getLogExtra(), C26035ab.f68781a);
                        return;
                    }
                case 7:
                    if (l.longValue() >= 0) {
                        try {
                            a.put("duration", l);
                        } catch (JSONException unused5) {
                        }
                    }
                    m63299a(context, "draw_ad", "click_source", a, aweme.getAwemeRawAd());
                    return;
                case 8:
                    if (l.longValue() >= 0) {
                        try {
                            a.put("duration", l);
                        } catch (JSONException unused6) {
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            a.put("refer", str2);
                        } catch (JSONException unused7) {
                        }
                    }
                    m63299a(context, "draw_ad", "live_click_source", a, aweme.getAwemeRawAd());
                    return;
                case 9:
                    HashMap hashMap2 = new HashMap();
                    if (!(aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().getNewLiveRoomData() == null)) {
                        LiveRoomStruct newLiveRoomData2 = aweme.getRoomFeedCellStruct().getNewLiveRoomData();
                        hashMap2.put("anchor_id", String.valueOf(newLiveRoomData2.getAnchorId()));
                        hashMap2.put("room_id", String.valueOf(newLiveRoomData2.f79734id));
                    }
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
                    if (l.longValue() >= 0) {
                        hashMap3.put("duration", String.valueOf(l));
                    }
                    m63286a(context, aweme, str2, (Map<String, String>) hashMap3);
                    break;
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m63267a(Context context, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            m63268a(context, jSONObject, awemeRawAd.getLogExtra());
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m63268a(Context context, JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("log_extra", str);
        }
        jSONObject.put("is_ad_event", "1");
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        if (!C9431p.m18664a(networkAccessType)) {
            jSONObject.put("nt", networkAccessType);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m63297a(Context context, String str, String str2, String str3) {
        m63298a(context, "show", str, str2, str3);
    }

    /* renamed from: b */
    public static void m63325b(Context context, String str, String str2, String str3) {
        m63298a(context, "click", str, str2, str3);
    }

    /* renamed from: a */
    private static JSONObject m63269a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str);
            jSONObject.put("log_extra", str2);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m63298a(Context context, String str, String str2, String str3, String str4) {
        m63300a(context, "result_ad", str, m63269a(str3, str4), str2, 0);
    }

    /* renamed from: b */
    public static void m63326b(Context context, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str3);
            jSONObject.put("log_extra", str4);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        m63300a(context, "draw_ad", str, jSONObject, str2, 0);
    }

    /* renamed from: b */
    public static void m63322b(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "draw_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m63296a(Context context, String str, String str2, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, str, str2, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static void m63294a(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m63351e(context, awemeRawAd)) {
            m63299a(context, "comment_first_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: b */
    public static void m63323b(Context context, String str, AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (m63351e(context, awemeRawAd)) {
            m63299a(context, "comment_end_ad", str, jSONObject, awemeRawAd);
        }
    }

    /* renamed from: a */
    public static void m63292a(Context context, AwemeRawAd awemeRawAd, String str, JSONObject jSONObject, String str2) {
        if (m63351e(context, awemeRawAd) && !TextUtils.isEmpty(str)) {
            m63299a(context, "poi_ad", str, C26050aq.m63099a(jSONObject, str2), awemeRawAd);
        }
    }

    /* renamed from: a */
    public static void m63299a(Context context, String str, String str2, JSONObject jSONObject, AwemeRawAd awemeRawAd) {
        String pageFrom = awemeRawAd.getPageFrom();
        if (TextUtils.equals(pageFrom, "challenge") || TextUtils.equals(pageFrom, "challenge_fresh")) {
            str = TextUtils.equals(str, "background_ad") ? "background_ads" : "topic_ads";
        }
        String str3 = str;
        if (TextUtils.equals("click", str2)) {
            C26471cd.m64011a(awemeRawAd);
        }
        m63300a(context, str3, str2, jSONObject, m63309b(awemeRawAd), m63259a(awemeRawAd));
    }

    /* renamed from: a */
    public static void m63300a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (f68889a != null) {
            C26055au auVar = f68889a;
            C26056a aVar = new C26056a(context, str, str2, str3, j, jSONObject);
            if (auVar.mo53544c(aVar)) {
                return;
            }
        }
        m63327b(context, str, str2, jSONObject, str3, j);
    }

    /* renamed from: b */
    private static void m63327b(Context context, String str, String str2, JSONObject jSONObject, String str3, long j) {
        if (TextUtils.equals("click", str2)) {
            C26461ca.m63984a(str3);
            m63304a(str, str3, j, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException unused) {
            }
        }
        C26890h.m65006a(context, str, str2, str3, j, jSONObject);
    }

    /* renamed from: a */
    public static void m63304a(String str, String str2, long j, JSONObject jSONObject) {
        long j2;
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception unused) {
            j2 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (!TextUtils.equals("has_v3", str3)) {
                    try {
                        jSONObject2.put(str3, jSONObject.opt(str3));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        new C26076a().mo53568b(str).mo53564a("realtime_click").mo53563a(j2).mo53567b(j).mo53565a(jSONObject2).mo53566a().mo53562a();
        C23131p.m56692a("ctr_monitor", "ctr_click", m63270a(jSONObject));
    }

    /* renamed from: a */
    public static void m63275a(Context context, C26138s sVar, Aweme aweme, boolean z) {
        m63303a("link_click", context, sVar, aweme, z, null, false);
    }

    /* renamed from: a */
    public static void m63301a(Aweme aweme, String str, String str2) {
        JSONObject m = m63373m(C11010c.m22280a(), aweme, "uniplay");
        if (!TextUtils.isEmpty(str2)) {
            try {
                m.put("refer", str2);
            } catch (JSONException unused) {
            }
        }
        m63296a(C11010c.m22280a(), str, "uniplay", aweme, m);
    }

    /* renamed from: a */
    public static void m63303a(String str, Context context, C26138s sVar, Aweme aweme, boolean z, String str2, boolean z2) {
        JSONObject e;
        String b;
        if (context != null && sVar != null) {
            if (z2 || (aweme != null && aweme.isAd())) {
                String str3 = "link";
                if (!z) {
                    switch (sVar.feedShowType) {
                        case 1:
                            str3 = "link_logo";
                            break;
                        case 2:
                            str3 = "link_bar";
                            break;
                    }
                }
                if (z2) {
                    e = m63262a(context, sVar, str3, aweme.getAid());
                    b = sVar.creativeId;
                } else {
                    e = m63345e(context, aweme, "logAdLink", str3);
                    b = m63309b(aweme.getAwemeRawAd());
                }
                m63300a(context, z ? "comment_ad" : "draw_ad", str, e, b, m63258a(aweme));
                if (!z) {
                    C27170a.m65583a("draw_ad", str3);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m63274a(Context context, C25948a aVar) {
        JSONObject e;
        String b;
        if (context != null && aVar != null && aVar.f68508b != null) {
            if (aVar.f68511e || (aVar.f68509c != null && aVar.f68509c.isAd())) {
                C26138s sVar = aVar.f68508b;
                Aweme aweme = aVar.f68509c;
                String str = "link";
                if (!aVar.f68510d) {
                    switch (sVar.feedShowType) {
                        case 1:
                            str = "link_logo";
                            break;
                        case 2:
                            str = "link_bar";
                            break;
                    }
                }
                if (sVar.feedShowType == 3) {
                    str = aVar.f68514h;
                }
                if (aVar.f68511e) {
                    e = m63262a(context, sVar, str, aweme.getAid());
                    b = sVar.creativeId;
                } else {
                    e = m63345e(context, aweme, "logAdLink", str);
                    b = m63309b(aweme.getAwemeRawAd());
                }
                JSONObject jSONObject = e;
                String str2 = b;
                aVar.mo53288b(jSONObject);
                aVar.mo53287a(jSONObject);
                m63300a(context, aVar.f68510d ? "comment_ad" : "draw_ad", aVar.f68507a, jSONObject, str2, m63258a(aweme));
                if (TextUtils.equals(aVar.f68507a, "show") || TextUtils.equals(aVar.f68507a, "comment_show")) {
                    C26060ay.f68819a.mo53545a("show", sVar.trackUrlList, C52830p.m112396d(sVar.creativeId), sVar.logExtra, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26040ag<Object,Object,Object>(sVar));
                    return;
                }
                if (TextUtils.equals(aVar.f68507a, "click")) {
                    C26060ay.f68819a.mo53545a("click", sVar.clickTrackUrlList, C52830p.m112396d(sVar.creativeId), sVar.logExtra, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26041ah<Object,Object,Object>(sVar));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m63285a(Context context, Aweme aweme, String str, String str2, String str3) {
        if (m63256C(context, aweme)) {
            JSONObject m = m63373m(context, aweme, "comment location");
            try {
                m.put("refer", str3);
            } catch (JSONException unused) {
            }
            m63300a(context, str2, "location_click", C26050aq.m63099a(m, str), aweme.getAwemeRawAdIdStr(), m63258a(aweme));
        }
    }

    /* renamed from: a */
    public static void m63272a(Context context, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            m63268a(context, jSONObject, str);
        } catch (JSONException unused) {
        }
        m63300a(context, "splash_ad", "open_url_app", jSONObject, String.valueOf(j), 0);
        C27170a.m65583a("splash_ad", null);
    }

    /* renamed from: a */
    public static void m63279a(Context context, Aweme aweme, long j, int i) {
        if (aweme != null && aweme.isAd()) {
            HashMap hashMap = new HashMap();
            if (C26461ca.m63988e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C26461ca.m63987d(aweme) ? 1 : 0));
            }
            JSONObject a = m63264a(context, aweme, "raw ad over duration", false, m63261a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                a.put("video_length", i);
            } catch (JSONException unused) {
            }
            C26461ca.m63983a(aweme, j);
            m63322b(context, "break", aweme, a);
        }
    }

    /* renamed from: c */
    public static void m63337c(Context context, String str, String str2, String str3) {
        m63298a(context, "otherclick", str, str2, str3);
    }

    /* renamed from: a */
    public static void m63302a(String str, Context context, C26138s sVar, Aweme aweme, boolean z) {
        m63303a(str, context, sVar, aweme, z, null, true);
    }

    /* renamed from: a */
    public static long m63259a(AwemeRawAd awemeRawAd) {
        Long groupId = awemeRawAd.getGroupId();
        if (groupId == null) {
            return 0;
        }
        return groupId.longValue();
    }

    /* renamed from: b */
    public static String m63309b(AwemeRawAd awemeRawAd) {
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null) {
            return "0";
        }
        return String.valueOf(creativeId);
    }

    /* renamed from: a */
    public static long m63258a(Aweme aweme) {
        if (!aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return 0;
        }
        return m63259a(awemeRawAd);
    }

    /* renamed from: a */
    public static Map<String, String> m63260a(int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_order", Integer.valueOf(i));
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        return hashMap;
    }

    /* renamed from: b */
    private static HashMap<String, String> m63310b(Aweme aweme) {
        if (aweme.getPromotion() == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("commodity_id", aweme.getPromotion().getPromotionId());
        hashMap2.put("commodity_type", Integer.valueOf(aweme.getPromotion().getPromotionSource()));
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m63261a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_extra_data", new C17971f().mo34889b(map));
        return hashMap;
    }

    /* renamed from: i */
    public static void m63365i(Context context, Aweme aweme) {
        m63368j(context, aweme, "");
    }

    /* renamed from: A */
    public static void m63254A(Context context, Aweme aweme) {
        m63349e(context, "load_fail", aweme, m63373m(context, aweme, "raw feed form load fail"));
    }

    /* renamed from: B */
    public static void m63255B(Context context, Aweme aweme) {
        m63322b(context, "data_invalid", aweme, m63373m(context, aweme, "raw ad data_invalid"));
    }

    /* renamed from: C */
    public static boolean m63256C(Context context, Aweme aweme) {
        if (context == null || aweme == null) {
            return false;
        }
        return aweme.isAd();
    }

    /* renamed from: d */
    public static void m63338d(Context context, Aweme aweme) {
        m63322b(context, "open_url_app", aweme, m63373m(context, aweme, "raw ad open_url_app"));
    }

    /* renamed from: f */
    public static void m63352f(Context context, Aweme aweme) {
        m63322b(context, "deeplink_failed", aweme, m63373m(context, aweme, "raw ad deeplink failed"));
    }

    /* renamed from: g */
    public static void m63359g(Context context, Aweme aweme) {
        m63322b(context, "open_url_h5", aweme, m63373m(context, aweme, "raw ad open_url_h5"));
    }

    /* renamed from: j */
    public static void m63367j(Context context, Aweme aweme) {
        m63322b(context, "like", aweme, m63373m(context, aweme, "raw like"));
    }

    /* renamed from: k */
    public static void m63369k(Context context, Aweme aweme) {
        m63322b(context, "like_cancel", aweme, m63373m(context, aweme, "raw cancel like"));
    }

    /* renamed from: l */
    public static void m63371l(Context context, Aweme aweme) {
        m63322b(context, "open_url_window_show", aweme, m63373m(context, aweme, "raw open url window show"));
    }

    /* renamed from: m */
    public static void m63374m(Context context, Aweme aweme) {
        m63336c(context, "button_show", aweme, m63373m(context, aweme, "raw ad background button show"));
    }

    /* renamed from: o */
    public static void m63378o(Context context, Aweme aweme) {
        m63336c(context, "click_button", aweme, m63373m(context, aweme, "raw ad background button click"));
    }

    /* renamed from: q */
    public static void m63380q(Context context, Aweme aweme) {
        m63322b(context, "challenge_click", aweme, m63373m(context, aweme, "raw ad challenge click"));
    }

    /* renamed from: r */
    public static void m63381r(Context context, Aweme aweme) {
        m63322b(context, "share", aweme, m63373m(context, aweme, "raw ad share"));
    }

    /* renamed from: s */
    public static void m63382s(Context context, Aweme aweme) {
        m63322b(context, "click_redpacket", aweme, m63373m(context, aweme, "raw ad click red packet"));
    }

    /* renamed from: t */
    public static void m63383t(Context context, Aweme aweme) {
        m63343d(context, "click_button", aweme, m63373m(context, aweme, "raw homepage ad button click"));
    }

    /* renamed from: u */
    public static void m63384u(Context context, Aweme aweme) {
        m63343d(context, "click_start", aweme, m63373m(context, aweme, "raw homepage ad click start"));
    }

    /* renamed from: v */
    public static void m63385v(Context context, Aweme aweme) {
        m63343d(context, "click_call", aweme, m63373m(context, aweme, "raw homepage ad click call"));
    }

    /* renamed from: w */
    public static void m63386w(Context context, Aweme aweme) {
        m63343d(context, "click_form", aweme, m63373m(context, aweme, "raw homepage ad click form"));
    }

    /* renamed from: x */
    public static void m63387x(Context context, Aweme aweme) {
        m63343d(context, "load_fail", aweme, m63373m(context, aweme, "raw homepage load fail"));
    }

    /* renamed from: y */
    public static void m63388y(Context context, Aweme aweme) {
        m63343d(context, "click_redpacket", aweme, m63373m(context, aweme, "raw homepage click red packet"));
    }

    /* renamed from: z */
    public static void m63389z(Context context, Aweme aweme) {
        m63349e(context, "click_cancel", aweme, m63373m(context, aweme, "raw feed form click cancel"));
    }

    /* renamed from: b */
    public static void m63311b(Context context, Aweme aweme) {
        m63361g(context, "receive", aweme, m63373m(context, aweme, "receive_ad"));
    }

    /* renamed from: c */
    public static void m63330c(Context context, Aweme aweme) {
        m63340d(context, aweme, (String) null);
    }

    /* renamed from: d */
    public static void m63342d(Context context, AwemeRawAd awemeRawAd) {
        m63323b(context, "ad_click", awemeRawAd, m63329c(context, awemeRawAd, "raw feed comment end ad click"));
    }

    /* renamed from: h */
    public static void m63363h(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "lynx");
        m63322b(context, "open_url_h5", aweme, m63264a(context, aweme, "raw ad open_url_h5", false, m63261a((Map<String, Object>) hashMap)));
    }

    /* renamed from: p */
    public static void m63379p(Context context, Aweme aweme) {
        m63322b(context, "button_show", aweme, m63373m(context, aweme, "raw ad button show"));
        m63322b(context, "othershow", aweme, m63345e(context, aweme, "raw ad button show refer", "button"));
    }

    /* renamed from: e */
    public static void m63346e(Context context, Aweme aweme) {
        if (m63256C(context, aweme)) {
            m63322b(context, "deeplink_success", aweme, m63373m(context, aweme, "raw ad deeplink success"));
            new C26148a().mo53762a("draw_ad").mo53760a(System.currentTimeMillis() - 5000).mo53761a(aweme.getAwemeRawAd()).mo53763a();
        }
    }

    /* renamed from: n */
    public static void m63375n(Context context, Aweme aweme) {
        m63336c(context, "replay", aweme, m63345e(context, aweme, "raw ad background replay", "button"));
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26094r<Object,Object,Object>(aweme));
        }
    }

    /* renamed from: c */
    public static void m63335c(Context context, AwemeRawAd awemeRawAd) {
        m63321b(context, awemeRawAd, (String) null);
    }

    /* renamed from: c */
    public static JSONObject m63329c(Context context, AwemeRawAd awemeRawAd, String str) {
        return m63265a(context, awemeRawAd, str, false);
    }

    /* renamed from: g */
    public static void m63360g(Context context, Aweme aweme, String str) {
        m63317b(context, aweme, str, null);
    }

    /* renamed from: m */
    public static JSONObject m63373m(Context context, Aweme aweme, String str) {
        return m63263a(context, aweme, str, false);
    }

    /* renamed from: n */
    public static void m63376n(Context context, Aweme aweme, String str) {
        m63355f(context, aweme, str, (String) null);
    }

    /* renamed from: c */
    public static JSONObject m63328c(Context context, Aweme aweme, JSONObject jSONObject) {
        if (!m63256C(context, aweme)) {
            return jSONObject;
        }
        return m63267a(context, aweme.getAwemeRawAd(), jSONObject);
    }

    /* renamed from: e */
    public static void m63347e(Context context, Aweme aweme, int i) {
        m63322b(context, "mute", aweme, m63358g(context, aweme, i));
    }

    /* renamed from: f */
    public static void m63353f(Context context, Aweme aweme, int i) {
        m63322b(context, "unmute", aweme, m63362h(context, aweme, i));
    }

    /* renamed from: c */
    static void m63331c(Context context, Aweme aweme, int i) {
        C26058aw.m63131a(context, aweme, i);
        C26461ca.m63982a(aweme);
    }

    /* renamed from: f */
    public static void m63354f(Context context, Aweme aweme, String str) {
        JSONObject a = m63263a(context, aweme, "raw ad other click", false);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63356f(context, "otherclick", aweme, a);
    }

    /* renamed from: g */
    private static JSONObject m63358g(Context context, Aweme aweme, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("playervol", Float.valueOf(0.0f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m63264a(context, aweme, "raw ad play", false, m63261a((Map<String, Object>) hashMap));
    }

    /* renamed from: h */
    public static void m63364h(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        m63322b(context, "open_url_app", aweme, m63264a(context, aweme, "raw ad open_url_app", false, (Map<String, String>) hashMap));
    }

    /* renamed from: i */
    public static void m63366i(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("fail_reason", "app_uninstalled");
        hashMap2.put("url", str);
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        m63322b(context, "deeplink_failed", aweme, m63264a(context, aweme, "raw ad deeplink failed", false, (Map<String, String>) hashMap));
    }

    /* renamed from: j */
    public static void m63368j(Context context, Aweme aweme, String str) {
        JSONObject m = m63373m(context, aweme, "raw ad slide");
        if (!TextUtils.isEmpty(str)) {
            try {
                m.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63322b(context, "slide", aweme, m);
        if (C26512f.m64065h(aweme)) {
            m63322b(context, "click", aweme, m63373m(context, aweme, "raw ad slide+click"));
        }
    }

    /* renamed from: k */
    public static void m63370k(Context context, Aweme aweme, String str) {
        JSONObject a = m63263a(context, aweme, "raw homepage ad click with refer", true);
        try {
            if (!TextUtils.isEmpty(str)) {
                a.put("refer", str);
            }
        } catch (JSONException unused) {
        }
        m63343d(context, "click", aweme, a);
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26098v<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: l */
    public static void m63372l(Context context, Aweme aweme, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_extra_data", new C17971f().mo34889b(hashMap));
        m63322b(context, "download_video_no_download", aweme, m63264a(context, aweme, "raw ad download video no download", false, (Map<String, String>) hashMap2));
    }

    /* renamed from: o */
    public static JSONObject m63377o(Context context, Aweme aweme, String str) {
        JSONObject a = m63263a(context, aweme, "play fun", false);
        try {
            a.put("refer", "fancy");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_fancy", 1);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("type", str);
            }
            a.put("ad_extra_data", jSONObject);
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: b */
    public static void m63312b(Context context, Aweme aweme, int i) {
        if (FeedAdAsyncLogExperiment.m70945a()) {
            m63305a((Callable) new C26099w(context, aweme, i));
        } else {
            m63331c(context, aweme, i);
        }
    }

    /* renamed from: d */
    public static void m63339d(Context context, Aweme aweme, int i) {
        int i2;
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        HashMap hashMap = new HashMap();
        hashMap.put("play_order", Integer.valueOf(i));
        int i3 = -1;
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
        } else {
            i2 = -1;
        }
        if (audioManager != null) {
            i3 = audioManager.getStreamMaxVolume(3);
        }
        float f = 0.0f;
        if (i2 > 0 && i3 > 0) {
            f = ((float) i2) / ((float) i3);
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f * 1000.0f))) * 0.001f));
        m63322b(context, "play", aweme, m63264a(context, aweme, "raw ad play", false, m63261a((Map<String, Object>) hashMap)));
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26043aj<Object,Object,Object>(aweme));
        }
    }

    /* renamed from: e */
    public static void m63348e(Context context, Aweme aweme, String str) {
        JSONObject a = m63263a(context, aweme, "raw ad other click", false);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63322b(context, "otherclick", aweme, a);
    }

    /* renamed from: h */
    private static JSONObject m63362h(Context context, Aweme aweme, int i) {
        int i2;
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        HashMap hashMap = new HashMap();
        int i3 = -1;
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
        } else {
            i2 = -1;
        }
        if (audioManager != null) {
            i3 = audioManager.getStreamMaxVolume(3);
        }
        float f = 0.0f;
        if (i2 > 0 && i3 > 0) {
            f = ((float) i2) / ((float) i3);
        }
        hashMap.put("playervol", Float.valueOf(((float) ((int) (f * 1000.0f))) * 0.001f));
        hashMap.put("play_order", Integer.valueOf(i));
        return m63264a(context, aweme, "raw ad play", false, m63261a((Map<String, Object>) hashMap));
    }

    /* renamed from: c */
    public static void m63333c(Context context, Aweme aweme, String str) {
        if (C26512f.m64064g(aweme)) {
            m63296a(context, str, "shopping_click", aweme, m63264a(context, aweme, "raw ad click shopping", false, (Map<String, String>) m63310b(aweme)));
        }
    }

    /* renamed from: d */
    public static void m63340d(Context context, Aweme aweme, String str) {
        JSONObject a = m63263a(context, aweme, "raw ad click", true);
        if (str != null) {
            try {
                a.put("refer", str);
            } catch (JSONException unused) {
            }
        }
        m63322b(context, "click", aweme, a);
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26091o<Object,Object,Object>(awemeRawAd));
        }
        if (C26503d.m64057a(aweme)) {
            C27170a.m65583a("draw_ad", str);
        }
    }

    /* renamed from: b */
    public static void m63314b(Context context, Aweme aweme, FollowStatus followStatus) {
        JSONObject jSONObject;
        int i;
        if (C26512f.m64065h(aweme)) {
            HashMap hashMap = new HashMap();
            String str = "is_cheated_follow";
            int i2 = 1;
            if (followStatus == null || !followStatus.isCheating()) {
                i = 0;
            } else {
                i = 1;
            }
            hashMap.put(str, Integer.valueOf(i));
            String str2 = "follow_status";
            if (followStatus != null) {
                i2 = followStatus.followStatus;
            }
            hashMap.put(str2, Integer.valueOf(i2));
            jSONObject = m63264a(context, aweme, "raw ad follow", false, m63261a((Map<String, Object>) hashMap));
        } else {
            jSONObject = m63373m(context, aweme, "raw ad follow");
        }
        m63343d(context, "follow", aweme, jSONObject);
    }

    /* renamed from: b */
    public static void m63315b(Context context, Aweme aweme, String str) {
        if (C26512f.m64064g(aweme)) {
            m63296a(context, str, "click_cart", aweme, m63264a(context, aweme, "raw ad click cart", false, (Map<String, String>) m63310b(aweme)));
        }
    }

    /* renamed from: a */
    public static JSONObject m63263a(Context context, Aweme aweme, String str, boolean z) {
        return m63264a(context, aweme, str, z, null);
    }

    /* renamed from: d */
    public static void m63344d(Context context, String str, String str2, String str3) {
        m63298a(context, "othershow", str, str2, str3);
    }

    /* renamed from: e */
    public static void m63350e(Context context, String str, String str2, String str3) {
        m63298a(context, "button_show", str, str2, str3);
    }

    /* renamed from: f */
    public static void m63357f(Context context, String str, String str2, String str3) {
        m63326b(context, "click", str, str2, str3);
    }

    /* renamed from: e */
    public static JSONObject m63345e(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m63263a(context, aweme, str, false);
        try {
            if (!TextUtils.isEmpty(str2)) {
                a.put("refer", str2);
            }
        } catch (JSONException unused) {
        }
        return a;
    }

    /* renamed from: g */
    private static void m63361g(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "receive_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: d */
    public static void m63341d(Context context, Aweme aweme, String str, String str2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("fail_reason", str2);
        }
        hashMap.put("ad_extra_data", new C17971f().mo34889b(hashMap2));
        m63322b(context, "deeplink_failed", aweme, m63264a(context, aweme, "raw ad deeplink failed", false, (Map<String, String>) hashMap));
    }

    /* renamed from: f */
    private static void m63355f(Context context, Aweme aweme, String str, String str2) {
        JSONObject m = m63373m(context, aweme, "applet_click");
        try {
            m.put("refer", null);
        } catch (JSONException unused) {
        }
        m63296a(context, str, "applet_click", aweme, m);
    }

    /* renamed from: a */
    private static JSONObject m63262a(Context context, C26138s sVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            m63268a(context, jSONObject, sVar.logExtra);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
                jSONObject.put("item_id", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m63313b(Context context, Aweme aweme, long j, int i) {
        if (aweme != null && aweme.isAd()) {
            HashMap hashMap = new HashMap();
            if (C26461ca.m63988e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C26461ca.m63987d(aweme) ? 1 : 0));
            }
            JSONObject a = m63264a(context, aweme, "raw ad over duration", false, m63261a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                a.put("video_length", i);
            } catch (JSONException unused) {
            }
            C26461ca.m63985b(aweme);
            m63322b(context, "over", aweme, a);
            if (C26503d.m64061d(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                C26060ay.f68819a.mo53545a("play_over", awemeRawAd.getPlayOverTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26042ai<Object,Object,Object>(aweme));
            }
        }
    }

    /* renamed from: e */
    private static void m63349e(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "feed_form", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: f */
    private static void m63356f(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "comment_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: c */
    public static void m63334c(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m63264a(context, aweme, "raw ad click", true, (Map<String, String>) m63310b(aweme));
        try {
            a.put("refer", str2);
        } catch (JSONException unused) {
        }
        m63296a(context, str, "click", aweme, a);
        if (C26503d.m64061d(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26092p<Object,Object,Object>(awemeRawAd));
        }
    }

    /* renamed from: d */
    public static void m63343d(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "homepage_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static JSONObject m63265a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        return m63266a(context, awemeRawAd, str, z, null);
    }

    /* renamed from: b */
    public static void m63316b(Context context, Aweme aweme, String str, String str2) {
        JSONObject a = m63264a(context, aweme, "raw ad product click", false, (Map<String, String>) m63310b(aweme));
        try {
            a.put("refer", str2);
        } catch (JSONException unused) {
        }
        m63296a(context, str, "click_product", aweme, a);
    }

    /* renamed from: c */
    public static void m63336c(Context context, String str, Aweme aweme, JSONObject jSONObject) {
        if (m63256C(context, aweme)) {
            m63299a(context, "background_ad", str, jSONObject, aweme.getAwemeRawAd());
        }
    }

    /* renamed from: a */
    public static JSONObject m63264a(Context context, Aweme aweme, String str, boolean z, Map<String, String> map) {
        if (!m63256C(context, aweme)) {
            return new JSONObject();
        }
        return m63266a(context, aweme.getAwemeRawAd(), str, z, map);
    }

    /* renamed from: a */
    public static JSONObject m63266a(Context context, AwemeRawAd awemeRawAd, String str, boolean z, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (awemeRawAd == null) {
            return jSONObject;
        }
        try {
            m63268a(context, jSONObject, awemeRawAd.getLogExtra());
            if (z) {
                jSONObject.put("has_v3", "1");
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m63332c(Context context, Aweme aweme, long j, int i, String str, Integer num) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("play_order", Integer.valueOf(i));
            if (C26461ca.m63988e(aweme)) {
                hashMap.put("is_pre_valid_action", Integer.valueOf(C26461ca.m63987d(aweme) ? 1 : 0));
            }
            int i2 = 0;
            JSONObject a = m63264a(context, aweme, "raw ad over duration", false, m63261a((Map<String, Object>) hashMap));
            try {
                a.put("duration", j);
                if (aweme.getVideo() != null) {
                    i2 = aweme.getVideo().getVideoLength();
                }
                a.put("video_length", i2);
                if (TextUtils.equals(str, "play_break")) {
                    a.put("user_id", C20902b.m53242a().getCurUserId());
                }
                if (num != null) {
                    a.put("break_reason", num);
                }
            } catch (JSONException unused) {
            }
            C26461ca.m63983a(aweme, j);
            m63322b(context, str, aweme, a);
            C26471cd.m64015a("pause", aweme, "play_break");
        }
    }
}

package com.p683ss.android.ugc.aweme.p1382aq;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.NearbyCities.CityBean;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aq.ae */
public final class C23198ae {

    /* renamed from: a */
    public static String f61671a = "";

    /* renamed from: b */
    public static String f61672b = "";

    /* renamed from: b */
    public static String m56852b() {
        return f61671a;
    }

    /* renamed from: x */
    public static String m56888x(Aweme aweme) {
        return "";
    }

    /* renamed from: a */
    public static String m56845a() {
        CityBean d = C30228f.m70980d();
        if (d == null) {
            CityBean e = C30228f.m70981e();
            if (e == null) {
                return "";
            }
            if (e.code == null) {
                return "";
            }
            return e.code;
        } else if (d.code == null) {
            return "";
        } else {
            return d.code;
        }
    }

    /* renamed from: f */
    public static boolean m56864f(String str) {
        return TextUtils.equals("homepage_familiar", str);
    }

    /* renamed from: g */
    public static boolean m56866g(String str) {
        return TextUtils.equals("challenge", str);
    }

    /* renamed from: h */
    public static boolean m56868h(String str) {
        return TextUtils.equals("single_song", str);
    }

    /* renamed from: i */
    public static boolean m56870i(String str) {
        return "homepage_hot".equals(str);
    }

    /* renamed from: j */
    public static String m56872j(String str) {
        return m56850a(str, 0);
    }

    /* renamed from: u */
    public static String m56885u(Aweme aweme) {
        return C23195ac.m56839a(aweme);
    }

    /* renamed from: b */
    public static String m56855b(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    /* renamed from: i */
    public static String m56869i(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return m56856b(aweme.getDistance());
    }

    /* renamed from: k */
    public static String m56874k(String str) {
        return C29981aa.m70153a().mo60161a(m56850a(str, 0));
    }

    /* renamed from: l */
    private static Object m56875l(String str) throws JSONException {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return C29981aa.m70153a().mo60161a(str);
        }
    }

    /* renamed from: m */
    public static String m56877m(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    /* renamed from: q */
    public static String m56881q(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return aweme.getDesc();
    }

    /* renamed from: r */
    public static String m56882r(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAuthorUid();
        }
        return "";
    }

    /* renamed from: t */
    public static String m56884t(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        return aweme.getMixId();
    }

    /* renamed from: a */
    public static String m56846a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAuthor() != null) {
            return aweme.getAuthor().getUid();
        }
        return "";
    }

    /* renamed from: c */
    public static String m56857c(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRequestId() != null) {
            return aweme.getRequestId();
        }
        return "";
    }

    /* renamed from: d */
    public static String m56859d(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null || !aweme.isImage()) {
            return "0";
        }
        return "1";
    }

    /* renamed from: e */
    public static String m56861e(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getPoiId();
        }
        return "";
    }

    /* renamed from: f */
    public static String m56863f(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getBackendTypeCode();
        }
        return "";
    }

    /* renamed from: g */
    public static String m56865g(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return aweme.getPoiStruct().getPoiName();
        }
        return "";
    }

    /* renamed from: h */
    public static String m56867h(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getPoiStruct() != null) {
            return String.valueOf(aweme.getPoiStruct().typeCode);
        }
        return "";
    }

    /* renamed from: l */
    public static String m56876l(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        int awemeType = aweme.getAwemeType();
        if (awemeType == 2) {
            return "photo";
        }
        if (awemeType != 101) {
            return "video";
        }
        return CustomActionPushReceiver.f104061f;
    }

    /* renamed from: n */
    public static String m56878n(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "1";
        }
        return "0";
    }

    /* renamed from: o */
    public static String m56879o(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isImage()) {
            return "photo";
        }
        if (aweme.isLive()) {
            return CustomActionPushReceiver.f104061f;
        }
        return "video";
    }

    /* renamed from: p */
    public static boolean m56880p(Aweme aweme) {
        IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
        if (aweme == null || !TextUtils.equals(aweme.getAuthorUid(), userService.getCurUserId())) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static String m56886v(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme() || !TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return "repost";
        }
        return "item";
    }

    /* renamed from: y */
    public static String m56889y(Aweme aweme) {
        if (aweme == null || aweme.getRelationRecommendInfo() == null) {
            return "";
        }
        return String.valueOf(aweme.getRelationRecommendInfo().getRecommendType());
    }

    /* renamed from: b */
    public static String m56853b(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(author.roomId);
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m56858c(String str) {
        if ("homepage_fresh".equalsIgnoreCase(str) || "poi_page".equalsIgnoreCase(str) || "poi_page_hot".equalsIgnoreCase(str) || "poi_page_new".equalsIgnoreCase(str) || "categorized_city_poi".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m56862e(String str) {
        if (TextUtils.equals("homepage_follow", str) || TextUtils.equals("homepage_friends", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static Long m56871j(Aweme aweme) {
        long j = 0;
        if (aweme == null) {
            return Long.valueOf(0);
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return Long.valueOf(0);
        }
        if (aweme.getMusic() != null) {
            j = aweme.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    /* renamed from: k */
    public static String m56873k(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return "";
        }
        if (aweme.getMusic() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(aweme.getMusic().getId());
        return sb.toString();
    }

    /* renamed from: s */
    public static String m56883s(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() == 3) {
            return "long_with_short";
        }
        return "";
    }

    /* renamed from: w */
    public static String m56887w(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return aweme.getAuthorUid();
        }
        if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
            return aweme.getRepostFromUserId();
        }
        return aweme.getAuthorUid();
    }

    /* renamed from: a */
    public static String m56848a(User user) {
        if (user != null) {
            return user.getUid();
        }
        return "";
    }

    /* renamed from: b */
    public static String m56856b(String str) {
        float f;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("<1km".equalsIgnoreCase(str)) {
            return "type_0_1";
        }
        if (">100km".equalsIgnoreCase(str)) {
            return "type_20+";
        }
        int indexOf = str.indexOf("km");
        if (indexOf == -1) {
            return "";
        }
        try {
            f = Float.parseFloat(str.substring(0, indexOf));
        } catch (Exception unused) {
            f = 0.0f;
        }
        if (f <= 1.0f) {
            return "type_0_1";
        }
        if (f > 1.0f && f <= 3.0f) {
            return "type_1_3";
        }
        if (f > 3.0f && f <= 5.0f) {
            return "type_3_5";
        }
        if (f > 5.0f && f <= 10.0f) {
            return "type_5_10";
        }
        if (f > 10.0f && f <= 20.0f) {
            return "type_10_20";
        }
        if (f > 20.0f) {
            return "type_20+";
        }
        return "";
    }

    /* renamed from: a */
    public static String m56849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf("km");
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        return "";
    }

    /* renamed from: d */
    public static boolean m56860d(String str) {
        if ("homepage_hot".equals(str) || "homepage_follow".equals(str) || "rec_follow".equals(str) || "homepage_fresh".equals(str) || "general_search".equals(str) || "search_result".equals(str) || "search_sug".equals(str) || "homepage_channel".equals(str) || "others_homepage".equals(str) || "find_friends".equals(str) || "categorized_city_poi".equalsIgnoreCase(str) || "challenge".equalsIgnoreCase(str) || "hot_search_video_board".equals(str) || "homepage_country".equals(str) || "homepage_friends".equals(str) || "personal_homepage".equals(str) || "playlist".equals(str) || "homepage_fresh_feed".equalsIgnoreCase(str) || "like_list".equals(str) || "homepage_familiar".equals(str) || TextUtils.equals("discovery_category", str) || "compilation_detail".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m56851a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    String str2 = (String) map.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, m56875l(str2));
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e) {
                    C32458a.m75148a((Throwable) e);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m56847a(Aweme aweme, int i) {
        if (aweme == null) {
            return "";
        }
        return m56850a(aweme.getAid(), i);
    }

    /* renamed from: b */
    public static String m56854b(Aweme aweme, int i) {
        JSONObject requestIdAndOrderJsonObject = C23325e.m57379a().getRequestIdAndOrderJsonObject(aweme, i);
        if (requestIdAndOrderJsonObject != null) {
            return requestIdAndOrderJsonObject.optString("order");
        }
        return "";
    }

    /* renamed from: a */
    public static String m56850a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        return C23325e.m57379a().getRequestIdAndIndex(sb.toString()).f62324a;
    }
}

package com.p683ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.f */
public final class C30366f {
    /* renamed from: a */
    public static String m71280a(String str, boolean z) {
        if ("opus".equals(str)) {
            if (z) {
                return "personal_homepage";
            }
            return "others_homepage";
        } else if (!"collection".equals(str)) {
            return str;
        } else {
            if (z) {
                return "personal_collection";
            }
            return "others_collection";
        }
    }

    /* renamed from: a */
    public static String m71279a(int i, String str, boolean z) {
        if (TextUtils.equals(str, "following_window")) {
            return "following_window";
        }
        switch (i) {
            case 0:
                return "homepage_hot";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_fresh";
            case 1000:
                return "personal_homepage";
            case 1001:
                return "personal_collection";
            case 2000:
                return "others_homepage";
            case 2001:
                return "others_collection";
            case 3002:
                return "challenge_hot";
            case 3003:
                return "challenge_fresh";
            case 4000:
                if (z) {
                    return "single_song";
                }
                return "single_song_hot";
            case 4001:
                return "single_Msong_fresh";
            case 9000:
                return "discovery";
            case 9001:
                return "playlist";
            default:
                if (TextUtils.equals(str, "upload")) {
                    return "release";
                }
                return str;
        }
    }

    /* renamed from: a */
    public static JSONObject m71281a(JSONObject jSONObject, String str, String str2, Aweme aweme) {
        if (str != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!"update_tips".equals(str2)) {
                    jSONObject.put("enter_from", str2);
                }
                if ("like_banner".equals(str)) {
                    jSONObject.put("previous_page", str);
                } else {
                    jSONObject.put("enter_method", str);
                }
                if (aweme.getAwemeType() == 2) {
                    jSONObject.put("is_photo", 1);
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }
}

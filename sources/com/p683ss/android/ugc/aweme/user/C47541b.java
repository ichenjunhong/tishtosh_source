package com.p683ss.android.ugc.aweme.user;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.user.b */
public final class C47541b {

    /* renamed from: a */
    public static final String f119952a;

    /* renamed from: b */
    public static final String f119953b;

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append("/aweme/v1/commit/user/");
        f119952a = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(C24095a.m58955l());
        sb2.append("/passport/login_name/update/");
        f119953b = sb2.toString();
    }

    /* renamed from: a */
    private static Set<String> m102969a(Set<String> set) {
        if (set.contains("avatar_uri")) {
            set.remove("avatar_uri");
            set.add("avatar_larger");
            set.add("avatar_thumb");
            set.add("avatar_medium");
        }
        if (set.contains("video_icon_virtual_URI")) {
            set.remove("video_icon_virtual_URI");
            set.add("video_icon");
        }
        if (set.contains("poi_id")) {
            set.remove("poi_id");
            set.add("school_poi_id");
        }
        return set;
    }

    /* renamed from: a */
    public static UserResponse m102967a(Map<String, String> map) throws Exception {
        String str;
        User user;
        UserResponse userResponse;
        String str2 = f119952a;
        if (map.containsKey("mt_update_username")) {
            str2 = f119953b;
            map.remove("mt_update_username");
        }
        HashMap hashMap = new HashMap();
        C47549c.m102974a();
        hashMap.put("uid", C47549c.m102979e());
        hashMap.putAll(map);
        if (!str2.equals(f119953b)) {
            str = C24514cb.m59920a().mo46190b(Integer.MAX_VALUE, str2, hashMap);
        } else {
            str = C24514cb.m59920a().mo46188a(Integer.MAX_VALUE, str2, hashMap);
        }
        C47549c.m102974a();
        User b = C47549c.m102975b();
        if (m102971a(b, map, str)) {
            userResponse = new UserResponse();
            user = b.clone();
            userResponse.setUser(user);
        } else {
            userResponse = (UserResponse) C24514cb.m59920a().mo46183a().mo34884a(str, UserResponse.class);
            user = userResponse.getUser();
            m102970a(b, user, m102969a((Set<String>) new HashSet<String>(map.keySet())));
        }
        if (!(b == null || user == null || (!TextUtils.isEmpty(b.getUid()) && !TextUtils.isEmpty(user.getUid())))) {
            C22089b.m54870a("aweme_user_manager_null_uid", C23088c.m56631a().mo47824a("local_user_json", new C17971f().mo34889b(b)).mo47824a("server_user_json", new C17971f().mo34889b(user)).mo47824a("map", map.toString()).mo47825b());
        }
        return userResponse;
    }

    /* renamed from: a */
    public static User m102968a(String str, boolean z) throws Exception {
        String str2;
        C18922i iVar = new C18922i(str);
        String str3 = "is_after_login";
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        iVar.mo38778a(str3, str2);
        return ((UserResponse) C24514cb.m59920a().mo46183a().mo34884a(C24514cb.m59920a().mo46187a(Integer.MAX_VALUE, iVar.toString()), UserResponse.class)).getUser();
    }

    /* renamed from: a */
    private static void m102970a(User user, User user2, Set<String> set) {
        Field[] declaredFields;
        if (set != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            for (Field field : User.class.getDeclaredFields()) {
                C17952c cVar = (C17952c) field.getAnnotation(C17952c.class);
                if (cVar != null && !set.contains(cVar.mo34828a())) {
                    try {
                        field.setAccessible(true);
                        field.set(user2, field.get(user));
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m102971a(User user, Map<String, String> map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (map.containsKey("login_name")) {
                if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "success")) {
                    map.put("unique_id", map.get("login_name"));
                    map.remove("login_name");
                    user.setUniqueId(jSONObject.getJSONObject("data").getString("login_name"));
                    user.setHandleModified(new Date().getTime() / 1000);
                    return true;
                } else if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "error")) {
                    throw new C23459a(jSONObject.getJSONObject("data").optInt("error_code")).setErrorMsg(jSONObject.getJSONObject("data").optString("description"));
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}

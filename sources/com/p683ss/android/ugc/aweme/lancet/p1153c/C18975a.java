package com.p683ss.android.ugc.aweme.lancet.p1153c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12689e;
import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.internal.C18061g;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.commerce.model.C25517c;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.a */
public final class C18975a {

    /* renamed from: a */
    public static final C17971f f52277a = new C17971f();

    /* renamed from: b */
    public static final C18975a f52278b = new C18975a();

    private C18975a() {
    }

    /* renamed from: a */
    public static boolean m46147a(String str, Object obj) {
        String str2;
        C52711k.m112240b(str, "url");
        C52711k.m112240b(obj, "body");
        if (obj instanceof String) {
            if (TextUtils.isEmpty((CharSequence) obj)) {
                return false;
            }
            if (!TextUtils.equals("musically", "tiktok") && !TextUtils.equals("tiktok", "tiktok")) {
                CharSequence charSequence = "/aweme/v1/user/";
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    str2 = parse.getPath();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(charSequence, str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) obj);
                        if ((jSONObject.has("status_code") && jSONObject.optInt("status_code") != 0) || !jSONObject.has("user")) {
                            return false;
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                        if (C52711k.m112239a(jSONObject2.opt("uid"), (Object) Integer.valueOf(0)) || TextUtils.isEmpty(jSONObject2.optString("nickname"))) {
                            return false;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
            return true;
        } else if (obj instanceof BaseResponse) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.status_code == 0 || C52711k.m112239a((Object) baseResponse.message, (Object) "success")) {
                return true;
            }
            return false;
        } else if (obj instanceof C25517c) {
            C25517c cVar = (C25517c) obj;
            if (cVar.statusCode == 0 || C52711k.m112239a((Object) cVar.message, (Object) "success")) {
                return true;
            }
            return false;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) obj;
            if (jSONObject3.has("statusCode") && jSONObject3.optInt("statusCode") == 0) {
                return true;
            }
            if (jSONObject3.has("status_code") && jSONObject3.optInt("status_code") == 0) {
                return true;
            }
            if (!jSONObject3.has("message") || !TextUtils.equals("success", jSONObject3.optString("message"))) {
                return false;
            }
            return true;
        } else if (obj instanceof C18085o) {
            C18085o oVar = (C18085o) obj;
            if (oVar.mo35021a("statusCode")) {
                C18082l b = oVar.mo35022b("statusCode");
                C52711k.m112236a((Object) b, "body.get(\"statusCode\")");
                if (b.mo34910g() == 0) {
                    return true;
                }
            }
            if (oVar.mo35021a("status_code")) {
                C18082l b2 = oVar.mo35022b("status_code");
                C52711k.m112236a((Object) b2, "body.get(\"status_code\")");
                if (b2.mo34910g() == 0) {
                    return true;
                }
            }
            if (oVar.mo35021a("message")) {
                CharSequence charSequence2 = "success";
                C18082l b3 = oVar.mo35022b("message");
                C52711k.m112236a((Object) b3, "body.get(\"message\")");
                if (TextUtils.equals(charSequence2, b3.mo34905c())) {
                    return true;
                }
            }
            return false;
        } else if (!(obj instanceof FeedItemList)) {
            return ((obj instanceof TypedInput) || (obj instanceof TypedOutput) || (obj instanceof C12689e) || (obj instanceof C18061g) || (obj instanceof C24047a)) ? true : true;
        } else {
            FeedItemList feedItemList = (FeedItemList) obj;
            if (feedItemList.getItems() == null || feedItemList.getItems().size() <= 0) {
                return false;
            }
            return true;
        }
    }
}

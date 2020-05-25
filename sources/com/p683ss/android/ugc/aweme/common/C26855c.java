package com.p683ss.android.ugc.aweme.common;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.c */
public abstract class C26855c implements Serializable {
    public String callerLocalEntry;
    public String mAnchorInfo;
    public String mAppName;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mChallengeName;
    public String mClientKey;
    public String mCurrentPage;
    public String mExtras;
    public ArrayList<String> mHashTags;
    public String mMicroAppInfo;
    public boolean mNeedShowDialog;
    public String mOpenPlatformContent;
    public String mState;
    public int mTargetSceneType;
    public String oldHashTag;

    public String getChallengeName() {
        return this.mChallengeName;
    }

    public C26855c() {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
    }

    public Bundle getShareRequestBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
        bundle.putStringArrayList("_aweme_open_sdk_params_hashtag_list", this.mHashTags);
        bundle.putString("_aweme_open_sdk_params_micro_app_info", this.mMicroAppInfo);
        bundle.putInt("_aweme_open_sdk_params_target_landpage_scene", this.mTargetSceneType);
        bundle.putString("_aweme_open_sdk_params_anchor_info", this.mAnchorInfo);
        bundle.putString("_open_platform_content_json", this.mOpenPlatformContent);
        if (this.mExtras != null && !this.mExtras.isEmpty()) {
            Bundle bundle2 = new Bundle();
            try {
                String str = (String) new JSONObject(this.mExtras).get("style_id");
                if (!str.isEmpty()) {
                    bundle2.putString("style_id", str);
                }
                bundle.putBundle("_bytedance_params_extra", bundle2);
            } catch (JSONException unused) {
            }
        }
        return bundle;
    }

    public void setChallengeName(String str) {
        this.mChallengeName = str;
    }

    /* renamed from: a */
    private static String m64942a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, wrap(bundle.get(str)));
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    public static JSONArray toJSONArray(Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                jSONArray.put(wrap(Array.get(obj, i)));
            }
            return jSONArray;
        }
        StringBuilder sb = new StringBuilder("Not a primitive array: ");
        sb.append(obj.getClass());
        throw new JSONException(sb.toString());
    }

    public C26855c(Bundle bundle) {
        this.mHashTags = new ArrayList<>();
        this.mNeedShowDialog = true;
        this.mTargetSceneType = 0;
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
        this.oldHashTag = bundle.getString("_aweme_open_sdk_params_target_scene");
        this.mHashTags = bundle.getStringArrayList("_aweme_open_sdk_params_hashtag_list");
        if (!C9376b.m18558a((Collection<T>) this.mHashTags)) {
            for (int i = 0; i < this.mHashTags.size(); i++) {
                ArrayList<String> arrayList = this.mHashTags;
                arrayList.set(i, ((String) arrayList.get(i)).trim());
            }
        } else if (!TextUtils.isEmpty(this.oldHashTag)) {
            this.mHashTags = new ArrayList<>();
            this.mHashTags.add(this.oldHashTag.trim());
        }
        this.mMicroAppInfo = bundle.getString("_aweme_open_sdk_params_micro_app_info");
        this.mAnchorInfo = bundle.getString("_aweme_open_sdk_params_anchor_info");
        this.mExtras = m64942a(bundle.getBundle("_bytedance_params_extra"));
        this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_landpage_scene");
        this.mOpenPlatformContent = bundle.getString("_open_platform_content_json");
    }

    public static Object wrap(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return toJSONArray(obj);
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }
}

package com.p683ss.android.p1147d;

import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.C23060d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.d.h */
public final class C18946h implements Serializable {
    private static final long serialVersionUID = -6027923654002990158L;

    /* renamed from: a */
    protected String f52187a;

    /* renamed from: b */
    private transient boolean f52188b;
    public volatile boolean mDownloaded;
    public int mHeight;
    public boolean mIsGif;
    public boolean mIsVideo;
    public String mKey;
    public boolean mNeedAlpha;
    public String mOpenUrl;
    public String mUri;
    public String mUrlList;
    public int mWidth;

    public final String getExtraKey() {
        return this.f52187a;
    }

    public final boolean isFixedDisplaySize() {
        return this.f52188b;
    }

    public final boolean isValid() {
        if (this.mWidth <= 0 || this.mHeight <= 0 || TextUtils.isEmpty(this.mUri) || TextUtils.isEmpty(this.mUrlList)) {
            return false;
        }
        return true;
    }

    public final JSONObject toJsonObj() {
        if (TextUtils.isEmpty(this.mUri)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", this.mUri);
            jSONObject.put("width", this.mWidth);
            jSONObject.put("height", this.mHeight);
            if (this.mOpenUrl != null) {
                jSONObject.put(C23060d.f61428b, this.mOpenUrl);
            }
            if (!TextUtils.isEmpty(this.mUrlList)) {
                try {
                    jSONObject.put("url_list", new JSONArray(this.mUrlList));
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final void setExtraKey(String str) {
        this.f52187a = str;
    }

    public static C18946h fromJsonStr(String str) {
        return fromJsonStr(str, true);
    }

    public static boolean isHttpUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static JSONArray toJsonArray(List<C18946h> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C18946h jsonObj : list) {
            JSONObject jsonObj2 = jsonObj.toJsonObj();
            if (jsonObj2 != null) {
                jSONArray.put(jsonObj2);
            }
        }
        return jSONArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18946h hVar = (C18946h) obj;
        if (this.mWidth != hVar.mWidth || this.mHeight != hVar.mHeight || this.mIsGif != hVar.mIsGif || this.mDownloaded != hVar.mDownloaded || this.mIsVideo != hVar.mIsVideo || this.f52188b != hVar.f52188b) {
            return false;
        }
        if (this.mUri == null ? hVar.mUri != null : !this.mUri.equals(hVar.mUri)) {
            return false;
        }
        if (this.mOpenUrl == null ? hVar.mOpenUrl != null : !this.mOpenUrl.equals(hVar.mOpenUrl)) {
            return false;
        }
        if (this.mUrlList == null ? hVar.mUrlList != null : !this.mUrlList.equals(hVar.mUrlList)) {
            return false;
        }
        if (this.f52187a == null ? hVar.f52187a != null : !this.f52187a.equals(hVar.f52187a)) {
            return false;
        }
        if (this.mKey == null ? hVar.mKey != null : !this.mKey.equals(hVar.mKey)) {
            return false;
        }
        return true;
    }

    public C18946h(String str, String str2) {
        this(str, str2, 0, 0, false);
    }

    public static C18946h fromJsonStr(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str), z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<C18946h> parseImageList(JSONArray jSONArray, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            C18946h fromJson = fromJson(jSONArray.getJSONObject(i), z);
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public static String getUrlFromImageInfo(C18946h hVar, boolean z) {
        String str;
        String str2 = null;
        if (hVar == null) {
            return null;
        }
        if (z) {
            str = hVar.mUri;
        } else {
            str = null;
        }
        List extractImageUrlList = extractImageUrlList(str, hVar.mUrlList);
        if (extractImageUrlList != null && extractImageUrlList.size() > 0) {
            str2 = ((C18956k) extractImageUrlList.get(0)).f52243a;
        }
        return str2;
    }

    public static ArrayList<C18946h> optImageList(JSONArray jSONArray, boolean z) {
        ArrayList<C18946h> arrayList = null;
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                C18946h fromJson = fromJson(optJSONObject, z);
                if (fromJson != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fromJson);
                }
            }
        }
        return arrayList;
    }

    public static C18946h fromJson(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("uri");
        String optString2 = jSONObject.optString("url_list");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("r_width", -1);
        int optInt4 = jSONObject.optInt("r_height", -1);
        if (optInt3 != -1) {
            optInt = optInt3;
        }
        if (optInt4 != -1) {
            optInt2 = optInt4;
        }
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        if (z && (optInt <= 0 || optInt2 <= 0)) {
            return null;
        }
        C18946h hVar = new C18946h(optString, optString2, optInt, optInt2);
        hVar.mOpenUrl = jSONObject.optString(C23060d.f61428b, null);
        return hVar;
    }

    public static List<C18956k> extractImageUrlList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                int length = jSONArray.length();
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("url");
                    if (!TextUtils.isEmpty(string)) {
                        C18956k kVar = new C18956k(string);
                        arrayList.add(kVar);
                        JSONObject optJSONObject = jSONObject.optJSONObject("header");
                        if (optJSONObject != null) {
                            Iterator keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String str3 = (String) keys.next();
                                String string2 = optJSONObject.getString(str3);
                                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(string2)) {
                                    kVar.f52244b.add(new C19180e(str3, string2));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (arrayList.isEmpty() && !TextUtils.isEmpty(str) && isHttpUrl(str.toLowerCase())) {
            arrayList.add(new C18956k(str));
        }
        return arrayList;
    }

    public static ArrayList<C18946h> optImageList(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || str == null || str.length() == 0 || !jSONObject.has(str)) {
            return null;
        }
        return optImageList(jSONObject.optJSONArray(str), z);
    }

    public C18946h(String str, String str2, int i, int i2) {
        this(str, str2, i, i2, false);
    }

    public C18946h(String str, String str2, int i, int i2, boolean z) {
        this.mUri = str;
        this.mUrlList = str2;
        this.mKey = C9395d.m18571a(this.mUri);
        this.mWidth = i;
        this.mHeight = i2;
        if (this.mWidth > 0 && this.mHeight > 0) {
            this.f52188b = z;
        }
    }
}

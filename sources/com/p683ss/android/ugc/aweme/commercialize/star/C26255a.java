package com.p683ss.android.ugc.aweme.commercialize.star;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.a */
public final class C26255a {

    /* renamed from: a */
    static C26256a f69323a;

    /* renamed from: b */
    public static final C26255a f69324b = new C26255a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.a$a */
    public interface C26256a {
        void setStarAtlasContent(String str);

        void setStarAtlasHashTag(String str);
    }

    private C26255a() {
    }

    /* renamed from: a */
    public static void m63624a(C26256a aVar) {
        f69323a = aVar;
    }

    /* renamed from: a */
    public static final void m63625a(String str) {
        C26256a aVar = f69323a;
        if (aVar != null) {
            aVar.setStarAtlasContent(str);
        }
    }

    /* renamed from: b */
    public static final void m63626b(String str) {
        C26256a aVar = f69323a;
        if (aVar != null) {
            aVar.setStarAtlasHashTag(str);
        }
    }

    /* renamed from: c */
    public static final String m63627c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("brand_name", null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}

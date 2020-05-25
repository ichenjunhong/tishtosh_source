package com.p683ss.android.ugc.aweme.p1963ml;

import com.p683ss.android.p1192ml.C19497b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.c */
final /* synthetic */ class C37104c implements C19497b {

    /* renamed from: a */
    static final C19497b f94753a = new C37104c();

    private C37104c() {
    }

    /* renamed from: a */
    public final void mo40656a(String str, int i, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", str);
            String str4 = "state";
            switch (i) {
                case 1:
                    str3 = "STATE_DOWNLOAD_SUCCESS";
                    break;
                case 2:
                    str3 = "STATE_DOWNLOAD_FAILED";
                    break;
                case 3:
                    str3 = "STATE_UNZIP_SUCCESS";
                    break;
                case 4:
                    str3 = "STATE_UNZIP_FAILED";
                    break;
                case 5:
                    str3 = "STATE_LOAD_CONFIG_SUCCESS";
                    break;
                case 6:
                    str3 = "STATE_LOAD_CONFIG_FAILED";
                    break;
                case 7:
                    str3 = "STATE_LOAD_MODEL_SUCCESS";
                    break;
                case 8:
                    str3 = "STATE_LOAD_MODEL_FAILED";
                    break;
                default:
                    str3 = "unknown";
                    break;
            }
            jSONObject.put(str4, str3);
            jSONObject.put("message", str2);
        } catch (JSONException unused) {
        }
        C23131p.m57779a("ml-evaluator", jSONObject);
    }
}

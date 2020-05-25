package com.appsflyer;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.q */
final class C2534q extends OneLinkHttpTask {

    /* renamed from: ॱ */
    private static List<String> f7864 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: ˋ */
    private String f7865;

    /* renamed from: ˎ */
    public C2535e f7866;

    /* renamed from: com.appsflyer.q$e */
    interface C2535e {
        /* renamed from: ˋ */
        void mo6956(String str);

        /* renamed from: ॱ */
        void mo6957(Map<String, String> map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo6988() {
        this.f7866.mo6956("Can't get one link data");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final boolean mo7038() {
        if (TextUtils.isEmpty(this.f7771) || TextUtils.isEmpty(this.f7865)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final String mo6989() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f7771);
        sb.append("?id=");
        sb.append(this.f7865);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo6990(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo6987(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.f7866.mo6957(hashMap);
        } catch (JSONException e) {
            this.f7866.mo6956("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    C2534q(Uri uri, AppsFlyerLib appsFlyerLib) {
        super(appsFlyerLib);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f7864) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.f7771 = split[1];
                this.f7865 = split[2];
            }
        }
    }
}

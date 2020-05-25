package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.tools.AVApi;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVApiImpl */
public class AVApiImpl implements AVApi {
    public String getAPI_URL_PREFIX_SI() {
        return Api.f61282b;
    }

    public static AVApi createAVApibyMonsterPlugin() {
        Object a = C27991b.m66756a(AVApi.class);
        if (a != null) {
            return (AVApi) a;
        }
        return new AVApiImpl();
    }

    public <T> T executeGetJSONObject(String str, Class<T> cls, String str2) throws Exception {
        return Api.m56465a(0, str, cls, str2, (C19181f) null);
    }
}

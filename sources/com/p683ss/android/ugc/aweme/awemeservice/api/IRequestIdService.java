package com.p683ss.android.ugc.aweme.awemeservice.api;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService */
public interface IRequestIdService {

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService$a */
    public static class C23319a {

        /* renamed from: a */
        public final String f62324a;

        /* renamed from: b */
        public final Integer f62325b;

        public C23319a() {
        }

        public C23319a(String str, int i) {
            this.f62324a = str;
            this.f62325b = Integer.valueOf(i);
        }
    }

    String getRequestId(Aweme aweme, int i);

    C23319a getRequestIdAndIndex(String str);

    JSONObject getRequestIdAndOrderJsonObject(Aweme aweme, int i);

    void setRequestIdAndIndex(String str, String str2, int i);
}

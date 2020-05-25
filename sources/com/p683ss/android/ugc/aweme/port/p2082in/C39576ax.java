package com.p683ss.android.ugc.aweme.port.p2082in;

import com.google.gson.C17971f;
import okhttp3.C53682y;

/* renamed from: com.ss.android.ugc.aweme.port.in.ax */
public interface C39576ax {
    String getApiHost();

    C53682y getOKHttpClient();

    C17971f getRetrofitFactoryGson();

    <T> T retrofitCreate(String str, Class<T> cls);
}

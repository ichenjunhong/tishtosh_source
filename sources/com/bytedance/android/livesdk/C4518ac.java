package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.C8808i;
import com.bytedance.android.livesdkapi.service.C8862e;

/* renamed from: com.bytedance.android.livesdk.ac */
public final class C4518ac implements C8808i {
    /* renamed from: a */
    public final C8862e mo10339a() {
        return TTLiveSDKContext.getLiveService();
    }

    /* renamed from: a */
    public final <T> T mo10340a(Class<T> cls) {
        return TTLiveSDKContext.getService(cls);
    }
}

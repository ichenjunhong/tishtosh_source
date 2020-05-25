package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2974a;

/* renamed from: com.bytedance.android.livesdk.feed.a */
public interface C6804a {

    /* renamed from: com.bytedance.android.livesdk.feed.a$a */
    public enum C6805a {
        REFRESH,
        LOAD_MORE
    }

    /* renamed from: a */
    void mo12991a(C6805a aVar, String str);

    /* renamed from: a */
    void mo12992a(C6805a aVar, String str, C2974a aVar2);

    /* renamed from: a */
    void mo12993a(C6805a aVar, String str, Throwable th);
}

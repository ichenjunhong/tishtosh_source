package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0209x;
import android.support.p030v4.p038f.C0777a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel */
public class StatusStoreViewModel extends C0209x {

    /* renamed from: a */
    private Map<String, Object> f107161a = new C0777a();

    public void onCleared() {
        super.onCleared();
        this.f107161a.clear();
    }

    /* renamed from: a */
    public final <T> void mo86405a(String str, T t) {
        this.f107161a.put(str, t);
    }
}

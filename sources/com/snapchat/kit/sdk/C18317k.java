package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

/* renamed from: com.snapchat.kit.sdk.k */
public final class C18317k implements C52867d<SharedPreferences> {

    /* renamed from: a */
    private final C18249c f50559a;

    public final /* synthetic */ Object get() {
        return (SharedPreferences) C52869f.m112471a(C35807d.m80935a(this.f50559a.f50410a, "com.snapchat.connect.sdk.sharedPreferences", 0), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18317k(C18249c cVar) {
        this.f50559a = cVar;
    }
}

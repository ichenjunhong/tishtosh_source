package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.business.C18279h;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.g */
public final class C18284g implements C52867d<C18279h> {

    /* renamed from: a */
    private final C53188a<SharedPreferences> f50480a;

    public final /* synthetic */ Object get() {
        C18279h hVar = new C18279h((SharedPreferences) this.f50480a.get());
        hVar.f50473b = hVar.f50472a.getLong("sequence_id_max", 0);
        return (C18279h) C52869f.m112471a(hVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18284g(C53188a<SharedPreferences> aVar) {
        this.f50480a = aVar;
    }
}

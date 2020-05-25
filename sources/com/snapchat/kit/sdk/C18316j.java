package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.google.gson.C17971f;
import com.snapchat.kit.sdk.core.security.C18301g;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;
import javax.p2677a.C53188a;

/* renamed from: com.snapchat.kit.sdk.j */
public final class C18316j implements C52867d<C18301g> {

    /* renamed from: a */
    private final C18249c f50556a;

    /* renamed from: b */
    private final C53188a<C17971f> f50557b;

    /* renamed from: c */
    private final C53188a<SharedPreferences> f50558c;

    public final /* synthetic */ Object get() {
        return (C18301g) C52869f.m112471a(this.f50556a.mo36396a((C17971f) this.f50557b.get(), (SharedPreferences) this.f50558c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C18316j(C18249c cVar, C53188a<C17971f> aVar, C53188a<SharedPreferences> aVar2) {
        this.f50556a = cVar;
        this.f50557b = aVar;
        this.f50558c = aVar2;
    }
}

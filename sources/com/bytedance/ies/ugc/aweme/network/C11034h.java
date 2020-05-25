package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.retrofit2.C12792q;

/* renamed from: com.bytedance.ies.ugc.aweme.network.h */
final class C11034h implements C11030f {

    /* renamed from: a */
    private final C12792q f29639a;

    /* renamed from: a */
    public final <T> T mo19930a(Class<T> cls) {
        return this.f29639a.mo23937a(cls);
    }

    C11034h(C11025a aVar) {
        this.f29639a = RetrofitFactory.createRetrofit(aVar);
    }
}

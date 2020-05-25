package com.p683ss.android.ugc.aweme.favorites.model;

import com.p683ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.e */
final /* synthetic */ class C29710e implements Callable {

    /* renamed from: a */
    private final int f77621a;

    /* renamed from: b */
    private final int f77622b;

    C29710e(int i, int i2) {
        this.f77621a = i;
        this.f77622b = i2;
    }

    public final Object call() {
        return UserFavoritesApi.m69720b(this.f77621a, this.f77622b);
    }
}

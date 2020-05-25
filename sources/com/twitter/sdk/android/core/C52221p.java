package com.twitter.sdk.android.core;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: com.twitter.sdk.android.core.p */
public final class C52221p {

    /* renamed from: a */
    final Context f130036a;

    /* renamed from: b */
    final C52075g f130037b;

    /* renamed from: c */
    final TwitterAuthConfig f130038c;

    /* renamed from: d */
    final ExecutorService f130039d;

    /* renamed from: e */
    final Boolean f130040e;

    /* renamed from: com.twitter.sdk.android.core.p$a */
    public static class C52223a {

        /* renamed from: a */
        public Boolean f130041a;

        /* renamed from: b */
        private final Context f130042b;

        /* renamed from: c */
        private C52075g f130043c;

        /* renamed from: d */
        private TwitterAuthConfig f130044d;

        /* renamed from: e */
        private ExecutorService f130045e;

        /* renamed from: a */
        public final C52221p mo108940a() {
            C52221p pVar = new C52221p(this.f130042b, this.f130043c, this.f130044d, this.f130045e, this.f130041a);
            return pVar;
        }

        /* renamed from: a */
        public final C52223a mo108939a(TwitterAuthConfig twitterAuthConfig) {
            this.f130044d = twitterAuthConfig;
            return this;
        }

        public C52223a(Context context) {
            if (context != null) {
                this.f130042b = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private C52221p(Context context, C52075g gVar, TwitterAuthConfig twitterAuthConfig, ExecutorService executorService, Boolean bool) {
        this.f130036a = context;
        this.f130037b = gVar;
        this.f130038c = twitterAuthConfig;
        this.f130039d = executorService;
        this.f130040e = bool;
    }
}

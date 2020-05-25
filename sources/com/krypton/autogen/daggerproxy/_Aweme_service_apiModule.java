package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.p2416c.C48514f;

public class _Aweme_service_apiModule {
    public IAwemeService provideIAwemeService() {
        return ((Aweme_service_apiService) C48514f.m104950a(Aweme_service_apiService.class)).provideIAwemeService();
    }

    public IRequestIdService provideIRequestIdService() {
        return ((Aweme_service_apiService) C48514f.m104950a(Aweme_service_apiService.class)).provideIRequestIdService();
    }
}

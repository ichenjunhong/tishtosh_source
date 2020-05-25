package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.share.ShareDependService;
import com.p683ss.android.ugc.aweme.share.ShareExtService;
import com.p683ss.android.ugc.aweme.share.ShareService;
import com.p683ss.android.ugc.p2416c.C48514f;

public class _Share_apiModule {
    public ShareDependService provideShareDependService() {
        return ((Share_apiService) C48514f.m104950a(Share_apiService.class)).provideShareDependService();
    }

    public ShareExtService provideShareExtService() {
        return ((Share_apiService) C48514f.m104950a(Share_apiService.class)).provideShareExtService();
    }

    public ShareService provideShareService() {
        return ((Share_apiService) C48514f.m104950a(Share_apiService.class)).provideShareService();
    }
}

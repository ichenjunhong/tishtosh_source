package com.p683ss.android.ugc.aweme.p1632di;

import android.app.Application;
import com.p683ss.android.ugc.aweme.app.host.HostApplication;
import com.p683ss.android.ugc.bridge.BridgeServices;

/* renamed from: com.ss.android.ugc.aweme.di.AppComponent */
public interface AppComponent extends BridgeServices {

    /* renamed from: com.ss.android.ugc.aweme.di.AppComponent$a */
    public interface C27579a {
        /* renamed from: a */
        C27579a mo56054a(Application application);

        /* renamed from: a */
        C27579a mo56055a(C27595ai aiVar);

        /* renamed from: a */
        AppComponent mo56056a();
    }

    void inject(HostApplication hostApplication);
}

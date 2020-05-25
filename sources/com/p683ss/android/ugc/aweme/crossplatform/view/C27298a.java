package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27234c;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.a */
public interface C27298a extends C27149c {
    /* renamed from: a */
    <T extends C27308i> T mo55670a(Class<T> cls);

    /* renamed from: a */
    void mo55672a(Activity activity);

    /* renamed from: a */
    void mo55673a(C23481a aVar);

    /* renamed from: a */
    boolean mo55681a();

    /* renamed from: b */
    void mo55682b(Activity activity);

    /* renamed from: c */
    void mo55685c(Activity activity);

    /* renamed from: d */
    void mo55687d(Activity activity);

    /* renamed from: g */
    void mo55690g(Activity activity);

    String getCurrentUrl();

    C22521l getMonitorSession();

    C27305g getViewStatusRegistry();

    void setCrossPlatformActivityContainer(C27114h hVar);

    void setFullScreen(C27234c cVar);
}

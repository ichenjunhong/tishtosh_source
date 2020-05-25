package com.p683ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.sdk.webview.C19750e;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService */
public interface IAmeJsMessageHandlerService {
    List<String> getSafeHosts();

    boolean isSafeDomain(String str);

    void registerJavaMethod(C19750e eVar, WeakReference<Context> weakReference, Activity activity);
}

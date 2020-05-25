package com.p683ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.sdk.webview.C19750e;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.net.C37777i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.AmeJsMessageHandlerServiceImpl */
public class AmeJsMessageHandlerServiceImpl implements IAmeJsMessageHandlerService {
    private List<String> safeHostList = new ArrayList<String>() {
        {
            add("iesdouyin.com");
            add("douyincdn.com");
            add("douyinact.com");
            add("douyin.com");
            add("tiktok.com");
            add("tiktokv.com");
            add("musical.ly");
        }
    };

    public List<String> getSafeHosts() {
        return this.safeHostList;
    }

    public void registerJavaMethod(C19750e eVar, WeakReference<Context> weakReference, Activity activity) {
    }

    public static IAmeJsMessageHandlerService createIAmeJsMessageHandlerServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAmeJsMessageHandlerService.class);
        if (a != null) {
            return (IAmeJsMessageHandlerService) a;
        }
        return new AmeJsMessageHandlerServiceImpl();
    }

    public boolean isSafeDomain(String str) {
        if (C37777i.m84365a(str, "tiktokv.com") || C37777i.m84365a(str, "tiktok.com") || C37777i.m84365a(str, "amemv.com") || C37777i.m84365a(str, "snssdk.com") || C37777i.m84365a(str, "toutiao.com") || C37777i.m84365a(str, "neihanshequ.com") || C37777i.m84365a(str, "youdianyisi.com") || C37777i.m84365a(str, "admin.bytedance.com") || C37777i.m84365a(str, "musical.ly")) {
            return true;
        }
        return false;
    }
}

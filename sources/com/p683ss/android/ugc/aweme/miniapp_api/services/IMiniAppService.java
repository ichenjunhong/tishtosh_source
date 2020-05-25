package com.p683ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36919a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36920b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36921c;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36922d;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36923e;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36924f;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36925g;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36926h;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36927i;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36928j;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36929k;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36930l;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36945g;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService */
public interface IMiniAppService {

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a */
    public static class C36982a {

        /* renamed from: a */
        public String f94442a;

        /* renamed from: b */
        public String f94443b;

        /* renamed from: c */
        public String f94444c;

        /* renamed from: d */
        public String f94445d;

        /* renamed from: e */
        public String f94446e;

        /* renamed from: f */
        public Locale f94447f;

        /* renamed from: g */
        public C36927i f94448g;

        /* renamed from: h */
        public C36922d f94449h;

        /* renamed from: i */
        public C36925g f94450i;

        /* renamed from: j */
        public C36923e f94451j;

        /* renamed from: k */
        public C36919a f94452k;

        /* renamed from: l */
        public C36920b f94453l;

        /* renamed from: m */
        public C36929k f94454m;

        /* renamed from: n */
        public C36924f f94455n;

        /* renamed from: o */
        public C36921c f94456o;

        /* renamed from: p */
        public C36928j f94457p;

        /* renamed from: q */
        public C36926h f94458q;

        /* renamed from: r */
        public C36930l f94459r;
    }

    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    void getShareInfo(String str, C36945g gVar);

    void handleActivityImageResult(int i, int i2, Intent intent);

    void initMiniApp();

    void initialize(Application application, C36982a aVar);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void notifyLocaleChange(Locale locale);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, C36966e eVar, C36960b bVar);

    boolean openMiniApp(Context context, String str, C36960b bVar);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);
}

package com.p683ss.android.ugc.aweme.login.larksso;

import android.os.Bundle;
import android.webkit.WebSettings;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.login.larksso.LarkSsoHelper.C36299a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso */
public final class CrossPlatformActivityForLarkSso extends CrossPlatformActivity {

    /* renamed from: f */
    public static C36299a f92900f;

    /* renamed from: g */
    public static final C36296a f92901g = new C36296a(null);

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$a */
    public static final class C36296a {
        private C36296a() {
        }

        /* renamed from: a */
        public static C36299a m81940a() {
            return CrossPlatformActivityForLarkSso.f92900f;
        }

        public /* synthetic */ C36296a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$b */
    public static final class C36297b implements C36299a {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformActivityForLarkSso f92902a;

        /* renamed from: a */
        public final void mo75190a() {
            C36299a a = C36296a.m81940a();
            if (a != null) {
                a.mo75190a();
            }
            this.f92902a.finish();
        }

        C36297b(CrossPlatformActivityForLarkSso crossPlatformActivityForLarkSso) {
            this.f92902a = crossPlatformActivityForLarkSso;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso$c */
    static final class C36298c implements Runnable {

        /* renamed from: a */
        public static final C36298c f92903a = new C36298c();

        C36298c() {
        }

        public final void run() {
        }
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        LarkSsoHelper.m81942a((C36299a) null);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onCreate", true);
        super.onCreate(bundle);
        C27309j jVar = (C27309j) mo55383a(C27309j.class);
        if (jVar != null) {
            SingleWebView a = jVar.mo55729a();
            if (a != null) {
                WebSettings settings = a.getSettings();
                if (settings != null) {
                    settings.setUserAgentString("Mozilla/5.0 (Windows NT 6.1; WOW64) SSOMobileTest");
                }
            }
        }
        LarkSsoHelper.m81942a((C36299a) new C36297b(this));
        this.f71479a.mo55368a((Runnable) C36298c.f92903a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso", "onCreate", false);
    }
}

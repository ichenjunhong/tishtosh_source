package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.C1460bg;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.monitor.privacy.PrivacyCheckerInitializer;
import com.p683ss.android.newmedia.p1197c.C19546a;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.C35999r;
import com.p683ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeApplication */
public abstract class AwemeApplication extends Application {

    /* renamed from: a */
    protected static AwemeApplication f61138a;

    /* renamed from: b */
    protected static AwemeApplication f61139b;

    /* renamed from: c */
    public boolean f61140c;

    /* renamed from: d */
    protected long f61141d;

    /* renamed from: a */
    public static AwemeApplication m56199a() {
        return f61138a;
    }

    /* renamed from: c */
    public static AwemeApplication m56201c() {
        return f61139b;
    }

    public Resources getResources() {
        return super.getResources();
    }

    /* renamed from: b */
    public static Activity m56200b() {
        Activity g = C11016e.m22312g();
        if (g != null) {
            return g;
        }
        return null;
    }

    public void onCreate() {
        f61139b = this;
        super.onCreate();
        C52711k.m112240b(this, "application");
        C20315a.f55812b = this;
        if (this.f61140c) {
            C35857a.m81001b().mo74526a(C35999r.m81184d()).mo74526a(C35999r.m81182b()).mo74527a();
        }
        C35857a.m81001b().mo74526a(new PrivacyCheckerInitializer()).mo74527a();
        NetworkUtils.setAppContext(this);
        NetworkUtils.setApiProcessHook(new C19546a());
        NetworkUtils.setDefaultUserAgent(System.getProperty("http.agent"));
        C18933b.f52162a = "/aweme";
        if (this.f61140c) {
            C23794bh.m58412z().mo47729m();
            C35857a.m81001b().mo74526a(new JsBridge2InitTask()).mo74527a();
        }
        C1460bg.f5276a = true;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}

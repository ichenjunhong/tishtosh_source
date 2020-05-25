package com.p683ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36872a;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36891d;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36892e;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36893f;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36898i;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36905n;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36907o;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36908p;
import com.p683ss.android.ugc.aweme.miniapp.impl.NetWorkImpl;
import com.p683ss.android.ugc.aweme.miniapp.setting.MiniappInitEnableSetting;
import com.p683ss.android.ugc.aweme.miniapp_api.C36931b;
import com.p683ss.android.ugc.aweme.miniapp_api.C36931b.C36934a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36920b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36927i;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.C36982a;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask */
public class MiniAppInitTask implements LegoTask {
    public static boolean hasBuilderSet;
    private boolean mIsMainProcess;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        initMiniApp(context);
    }

    public static void initMiniAppAfterAppbundleInstalled(Context context) {
        injectInitParamsInAdvance(context);
        C36983a.m83185b().mo76294a().initMiniApp();
    }

    private void initMiniApp(Context context) {
        if (VERSION.SDK_INT >= 21) {
            injectInitParamsInAdvance(context);
            IMiniAppService a = C36983a.m83185b().mo76294a();
            if (a != null && this.mIsMainProcess && MiniappInitEnableSetting.get()) {
                a.initMiniApp();
            }
        }
    }

    public static void injectInitParamsInAdvance(Context context) {
        if (!hasBuilderSet) {
            hasBuilderSet = true;
            Locale a = C33106b.m76104a(context);
            C36982a aVar = new C36982a();
            aVar.f94442a = String.valueOf(C11010c.m22289j());
            aVar.f94447f = a;
            aVar.f94446e = C11010c.m22283d();
            aVar.f94443b = C11010c.m22295p();
            aVar.f94444c = String.valueOf(C11010c.m22286g());
            aVar.f94445d = String.valueOf(C11010c.m22286g());
            aVar.f94449h = new C36892e();
            aVar.f94451j = new C36893f();
            aVar.f94454m = new C36907o();
            aVar.f94450i = new C36908p();
            aVar.f94455n = new NetWorkImpl();
            aVar.f94452k = new C36872a();
            aVar.f94453l = (C36920b) C23794bh.m58412z().mo47732p();
            aVar.f94448g = (C36927i) C23794bh.m58412z().mo47733q();
            aVar.f94457p = new C36905n();
            aVar.f94458q = new C36898i();
            aVar.f94456o = new C36891d();
            C36983a.f94461b = TrillApplication.m56199a();
            C36983a.f94462c = aVar;
        }
    }

    public MiniAppInitTask(boolean z, final Context context) {
        this.mIsMainProcess = z;
        C36931b.f94306a = new C36934a() {
            /* renamed from: a */
            public final void mo76184a() {
                MiniAppInitTask.initMiniAppAfterAppbundleInstalled(context);
            }
        };
    }
}

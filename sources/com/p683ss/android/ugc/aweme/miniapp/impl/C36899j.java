package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p2615tt.appbrandimpl.C51927c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.C27947k;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1363a.C22883a;
import com.p683ss.android.ugc.aweme.app.services.C23150af;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.C26453a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p683ss.android.ugc.aweme.main.service.C36680b;
import com.p683ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36957c;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36927i;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36943e;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p683ss.android.ugc.aweme.share.improve.C42044a;
import com.p683ss.android.ugc.aweme.share.improve.C42146c;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.MicroAppSharePackage.C42187a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.j */
public final class C36899j implements C36927i {

    /* renamed from: a */
    C42146c f94276a;

    /* renamed from: a */
    public final boolean mo76141a(Context context, String str, String str2) {
        if (!TextUtils.equals(C23057c.f61423a, str2) && !TextUtils.equals(C23057c.f61425c, str2)) {
            return false;
        }
        C23060d.f61431e.mo47789a(context, str, (String) null);
        return true;
    }

    /* renamed from: a */
    public final boolean mo76139a() {
        return !m83011a(C11010c.m22280a()) || System.currentTimeMillis() - C23137q.m56698a().f61568a.f73373g < 5000;
    }

    /* renamed from: a */
    public final boolean mo76140a(Activity activity, String str, List<String> list, int i) {
        C0013i.m18a((Callable<TResult>) new C36902k<TResult>(activity, list, i), C0013i.f25b);
        return true;
    }

    /* renamed from: a */
    public final boolean mo76143a(Context context, String str, boolean z) {
        return C26540w.m64226a(context, str, false);
    }

    /* renamed from: a */
    public final void mo76138a(Context context, String str, String str2, String str3, long j, String str4, String str5, String str6) {
        C26453a aVar = new C26453a();
        aVar.f69731b = str3;
        aVar.f69730a = Long.valueOf(j);
        aVar.f69732c = str4;
        aVar.f69733d = str5;
        aVar.f69734e = str6;
        aVar.f69737h = 7;
        C26540w.m64225a(context, str, str2, false, null, true, aVar);
    }

    /* renamed from: a */
    public final boolean mo76142a(Context context, String str, String str2, String str3, String str4) {
        if (!(context == null || str == null || str.equals(""))) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_method", str4);
            intent.putExtra("enter_from", str3);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
        return true;
    }

    /* renamed from: c */
    public final Activity mo76147c() {
        return (Activity) C27947k.m66703b().get();
    }

    /* renamed from: b */
    public final void mo76144b() {
        ServiceManager.get().bind(C36680b.class, new ServiceProvider<C36680b>() {
            public final /* synthetic */ Object get() {
                return new C23150af();
            }
        }).asSingleton();
        C22883a.m56347a(AwemeApplication.m56199a());
    }

    /* renamed from: d */
    public final boolean mo76148d() {
        return ((Boolean) SharePrefCache.inst().getShowMiniAppFreshGuideDialog().mo47782d()).booleanValue();
    }

    /* renamed from: e */
    public final void mo76149e() {
        SharePrefCache.inst().getShowMiniAppFreshGuideDialog().mo47776a(Boolean.valueOf(false));
    }

    /* renamed from: a */
    private static boolean m83011a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return C18920g.m46055c(context, context.getPackageName());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo76130a(final Activity activity) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (activity != null && !activity.isFinishing()) {
                    new C51927c(activity).show();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo76136a(Activity activity, boolean z) {
        QRCodePermissionActivity.m90501a(activity, true);
    }

    /* renamed from: b */
    public final boolean mo76146b(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("web_url");
            String optString2 = jSONObject.optString("title");
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setFlags(268435456);
            if (!TextUtils.isEmpty(optString2)) {
                intent.putExtra("title", optString2);
            }
            intent.setData(Uri.parse(optString));
            context.startActivity(intent);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo76132a(Activity activity, Intent intent) {
        intent.setClass(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo76134a(Activity activity, C36943e eVar) {
        C0013i.m18a((Callable<TResult>) new C36903l<TResult>(this, activity, eVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo76137a(Context context, String str) {
        C23060d.f61431e.mo47789a(context, str, (String) null);
    }

    /* renamed from: b */
    public final void mo76145b(Context context, String str, String str2) {
        C26540w.m64222a(context, str, str2);
    }

    /* renamed from: a */
    public final void mo76131a(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, MiniAppMediaChooseEmptyActivity.class);
        intent.putExtra("key_choose_num", i2);
        switch (i) {
            case 1:
                intent.putExtra("key_choose_type", 1);
                break;
            case 2:
                intent.putExtra("key_choose_type", 2);
                break;
        }
        activity.startActivityForResult(intent, 11);
    }

    /* renamed from: a */
    public final void mo76135a(Activity activity, C36957c cVar, C36943e eVar) {
        if (cVar != null) {
            if (!TextUtils.equals(cVar.f94348k, "chat_mergeIM")) {
                SharePackage a = this.f94276a.mo86145a();
                if (a instanceof MicroAppSharePackage) {
                    MicroAppSharePackage a2 = MicroAppSharePackage.m92570a(cVar, (MicroAppSharePackage) a);
                    C42307b a3 = C42044a.m92009a(cVar.f94348k, activity);
                    if (a3 != null) {
                        C42318f a4 = a2.mo73884a(a3);
                        if (a3.mo86132a((Context) activity, a4)) {
                            a3.mo49947a(a4, (Context) activity);
                        }
                    }
                }
            } else if (this.f94276a != null) {
                cVar.f94348k = "chat_merge";
                SharePackage a5 = this.f94276a.mo86145a();
                if (a5 instanceof MicroAppSharePackage) {
                    this.f94276a.mo86146a(MicroAppSharePackage.m92570a(cVar, (MicroAppSharePackage) a5), eVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo76133a(Activity activity, Intent intent, C36957c cVar, C36943e eVar) {
        intent.putExtra("share_package", C42187a.m92573a(cVar, (C36943e) null));
        activity.startActivity(intent);
    }
}

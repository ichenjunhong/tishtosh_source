package com.p683ss.android.ugc.aweme.util;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.bytedance.jirafast.p749b.C11997a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18922i;

/* renamed from: com.ss.android.ugc.aweme.util.h */
final /* synthetic */ class C47624h implements C11997a {

    /* renamed from: a */
    static final C11997a f120092a = new C47624h();

    private C47624h() {
    }

    /* renamed from: a */
    public final void mo22734a(Context context, String str) {
        C18922i iVar = new C18922i("https://www.tiktokv.com/aweme/faq_beta_version/");
        iVar.mo38778a("enter_from", "settings");
        iVar.mo38778a("imgUrl", str);
        SmartRouter.buildRoute(context, "//webview").withParam("url", (Parcelable) Uri.parse(iVar.toString())).withParam("hide_nav_bar", true).open();
    }
}

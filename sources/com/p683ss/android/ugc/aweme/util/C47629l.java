package com.p683ss.android.ugc.aweme.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.jirafast.p749b.C11997a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.language.C35837h;

/* renamed from: com.ss.android.ugc.aweme.util.l */
final /* synthetic */ class C47629l implements C11997a {

    /* renamed from: a */
    static final C11997a f120097a = new C47629l();

    private C47629l() {
    }

    /* renamed from: a */
    public final void mo22734a(Context context, String str) {
        String str2 = C35837h.m80977b() ? "https://www.tiktokv.com/aweme/faq_beta_version/" : "https://m.tiktok.com/aweme/faq_beta_version/";
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        C18922i iVar = new C18922i(str2);
        iVar.mo38778a("enter_from", "settings");
        iVar.mo38778a("imgUrl", str);
        intent.setData(Uri.parse(iVar.toString()));
        intent.putExtra("hide_nav_bar", true);
        context.startActivity(intent);
    }
}

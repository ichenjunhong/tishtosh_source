package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.o */
public final class C29909o {
    /* renamed from: a */
    public static final boolean m70062a(Activity activity, SharePackage sharePackage, String str) {
        C52711k.m112240b(sharePackage, "sharePackage");
        if (activity == null) {
            return false;
        }
        sharePackage.f106900i.putString("url_for_im_share", str);
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C27965f.m66719a(activity, "", "click_shareim_button");
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_package", sharePackage);
        C33194e.m76279d().enterChooseContact(activity, bundle, null);
        C30130ag.m70700a("chat_merge");
        return true;
    }
}

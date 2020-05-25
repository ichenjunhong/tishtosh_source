package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23060d.C23061a;
import com.p683ss.android.ugc.aweme.app.C23085f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.et */
public final class C47862et implements SchemaPageHelper {
    /* renamed from: a */
    public static SchemaPageHelper m103534a() {
        if (C27991b.f73519o == null) {
            synchronized (SchemaPageHelper.class) {
                if (C27991b.f73519o == null) {
                    C27991b.f73519o = C27628bo.m66311f();
                }
            }
        }
        return (SchemaPageHelper) C27991b.f73519o;
    }

    public final String getChannel() {
        String p = C11010c.m22295p();
        if (p == null) {
            return "";
        }
        return p;
    }

    public final void showUidRequestPermissionDialog(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C32616c.f84865a.getContactService().mo66139a(activity, null, "");
    }

    public final Intent handleAmeWebViewBrowser(Context context, Uri uri) {
        return C23085f.m56626a(context, uri);
    }

    public final Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri) {
        C52711k.m112240b(context, "context");
        return C23061a.m56597a(context, uri, false);
    }

    public final void startAdsAppActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        C23060d.f61431e.mo47789a(context, str, "");
    }

    public final Intent handleAmeWebViewBrowserForDeeplink(String str, Context context) {
        C52711k.m112240b(str, "schema");
        C52711k.m112240b(context, "context");
        return C23061a.m56597a(context, Uri.parse(str), false);
    }

    public final void openCrossPlatformActivity(Context context, boolean z, boolean z2, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "url");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_load_dialog", z);
        intent.putExtra("hide_nav_bar", z2);
        intent.putExtras(bundle);
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    public final boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str2, "title");
        return C26540w.m64223a(context, str, str2, z, map);
    }
}

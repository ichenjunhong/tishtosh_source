package com.p683ss.android.ugc.aweme.qrcode.p2102a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.j */
public final class C40936j implements C40930d {
    /* renamed from: a */
    public final String mo83410a() {
        return "web";
    }

    /* renamed from: a */
    public final boolean mo83412a(String str, int i) {
        boolean z;
        boolean z2;
        if (TextUtils.isEmpty(str) || (!str.startsWith("aweme://webview/") && !str.startsWith("aweme://reactnative/"))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C41302w.m91042a().mo83861a(str);
            return true;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("snssdk1128")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        Context a = C11010c.m22280a();
        Intent intent = new Intent(a, DeepLinkHandlerActivity.class);
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        a.startActivity(intent);
        return true;
    }
}

package com.p683ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.util.e */
public final class C22263e {

    /* renamed from: a */
    public static final C22263e f60037a = new C22263e();

    private C22263e() {
    }

    /* renamed from: a */
    public static final boolean m55110a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        if (context == null) {
            try {
                C52711k.m112234a();
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static final void m55109a(Context context, String str, boolean z) {
        Object obj;
        if (str == 0) {
            obj = context;
        } else {
            obj = str;
        }
        if (obj != 0) {
            C36703x xVar = (C36703x) C23826bi.m58450a(C36703x.class);
            if (context == 0) {
                C52711k.m112234a();
            }
            if (str == 0) {
                C52711k.m112234a();
            }
            xVar.mo47870a(context, str, true);
        }
    }
}

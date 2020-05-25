package com.p683ss.android.ugc.aweme.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.app.C23041b;

/* renamed from: com.ss.android.ugc.aweme.router.t */
public final class C41299t {
    /* renamed from: b */
    public static boolean m91034b(Context context, Uri uri, Intent intent, boolean z) {
        if (z) {
            C23041b.m56555a("mine", uri, intent.getBooleanExtra("is_from_push", false));
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91033a(Context context, Uri uri, Intent intent, boolean z) {
        if (z) {
            String queryParameter = uri.getQueryParameter("tab");
            boolean booleanExtra = intent.getBooleanExtra("is_from_push", false);
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C23041b.m56555a("discovery", uri, booleanExtra);
                } else if (parseInt == 5) {
                    C23041b.m56555a("follow", uri, booleanExtra);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}

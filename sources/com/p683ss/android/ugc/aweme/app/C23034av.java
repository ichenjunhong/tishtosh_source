package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.av */
public final class C23034av {

    /* renamed from: a */
    public static final C23035a f61389a = new C23035a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.av$a */
    public static final class C23035a {
        private C23035a() {
        }

        public /* synthetic */ C23035a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m56552a(Activity activity, Intent intent, String str) {
            C52711k.m112240b(activity, "activity");
            if (!C11016e.m22311f()) {
                Intent intent2 = new Intent();
                C23129n.m56687a(intent2, activity, C11010c.m22292m());
                activity.startActivity(intent2);
            }
            Intent intent3 = new Intent(activity, PushLoginActivity.class);
            if (intent != null) {
                intent3.putExtra("next_step", intent);
            }
            intent3.putExtra("multi_account_push_uid", str);
            return intent3;
        }
    }
}

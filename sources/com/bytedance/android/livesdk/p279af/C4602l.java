package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.af.l */
public final class C4602l {
    /* renamed from: a */
    public static void m11046a(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                String alert = aVar.getAlert();
                String prompt = aVar.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    m11045a(context, alert, context.getResources().getString(R.string.e6a));
                } else {
                    if (!TextUtils.isEmpty(prompt)) {
                        C4204a.m10423a(context, prompt);
                    }
                }
            } else {
                C4204a.m10421a(context, (int) R.string.e84);
            }
        }
    }

    /* renamed from: a */
    public static void m11045a(Context context, String str, String str2) {
        if (context != null) {
            C4221a aVar = new C4221a(context);
            aVar.mo9689a((CharSequence) context.getResources().getString(R.string.e8f));
            aVar.mo9695b((CharSequence) str);
            aVar.mo9690a((CharSequence) str2, (OnClickListener) null);
            aVar.mo9692a().show();
        }
    }

    /* renamed from: a */
    public static void m11047a(Context context, Throwable th, int i) {
        if (th != null && context != null) {
            if (th instanceof C2949a) {
                C2949a aVar = (C2949a) th;
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m11045a(context, alert, context.getResources().getString(R.string.e6a));
                } else if (!TextUtils.isEmpty(prompt)) {
                    C4204a.m10423a(context, prompt);
                } else {
                    C4204a.m10421a(context, i);
                }
            } else {
                C4204a.m10421a(context, i);
            }
        }
    }
}

package com.bytedance.android.live.core.p226e.p228b;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.e.b.a */
public final class C3844a {
    /* renamed from: a */
    public static boolean m9757a(Exception exc) {
        boolean z;
        if (exc instanceof C2949a) {
            if (((C2949a) exc).getErrorCode() == 20047) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m9755a(Context context, Throwable th) {
        m9756a(context, th, (String) null, (Runnable) null);
    }

    /* renamed from: a */
    private static void m9754a(Context context, String str, String str2, Runnable runnable) {
        if (context != null) {
            C4221a aVar = new C4221a(context);
            aVar.mo9689a((CharSequence) context.getResources().getString(R.string.e8f));
            aVar.mo9695b((CharSequence) str);
            aVar.mo9690a((CharSequence) str2, (OnClickListener) null);
            aVar.mo9687a((OnDismissListener) new C3845b(runnable));
            aVar.mo9692a().show();
        }
    }

    /* renamed from: a */
    public static void m9756a(Context context, Throwable th, String str, Runnable runnable) {
        if (th instanceof C2949a) {
            C2949a aVar = (C2949a) th;
            if (aVar.getErrorCode() != 20006) {
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m9754a(context, alert, context.getResources().getString(R.string.e6a), (Runnable) null);
                } else if (!TextUtils.isEmpty(prompt)) {
                    C4204a.m10423a(context, prompt);
                } else {
                    C4204a.m10423a(context, str);
                    return;
                }
            }
        }
        C4204a.m10423a(context, str);
    }
}

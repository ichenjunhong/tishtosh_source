package com.bytedance.android.livesdk.p279af;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: com.bytedance.android.livesdk.af.ak */
public final class C4571ak {

    /* renamed from: com.bytedance.android.livesdk.af.ak$a */
    static class C4572a extends ProgressDialog {
        public final void show() {
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        C4572a(Context context) {
            super(context);
        }
    }

    /* renamed from: b */
    public static ProgressDialog m10973b(Context context, String str) {
        C4572a aVar = new C4572a(context);
        aVar.setMessage(str);
        return aVar;
    }

    /* renamed from: a */
    public static ProgressDialog m10972a(Context context, String str) {
        C4572a aVar = new C4572a(context);
        aVar.setMessage(str);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }
}

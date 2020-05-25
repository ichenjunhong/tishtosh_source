package com.bytedance.android.livesdk.p279af;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.af.ar */
public final class C4579ar {

    /* renamed from: com.bytedance.android.livesdk.af.ar$a */
    static class C4580a extends ProgressDialog {
        public final void setMessage(CharSequence charSequence) {
        }

        public final void show() {
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        public C4580a(Context context) {
            this(context, 0);
        }

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.as_);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
                window.clearFlags(2);
            }
        }

        private C4580a(Context context, int i) {
            super(context, 0);
        }
    }

    /* renamed from: a */
    public static ProgressDialog m10999a(Context context) {
        C4580a aVar = new C4580a(context);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }
}

package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.text.TextUtils;
import android.widget.EditText;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.b */
public final class C21994b {

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.b$a */
    static final class C21995a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditText f59449a;

        C21995a(EditText editText) {
            this.f59449a = editText;
        }

        public final void run() {
            this.f59449a.requestFocus();
            KeyboardUtils.m58183b(this.f59449a);
        }
    }

    /* renamed from: b */
    public static final boolean m54753b(EditText editText) {
        C52711k.m112240b(editText, "$this$isEmpty");
        return TextUtils.isEmpty(editText.getText());
    }

    /* renamed from: a */
    public static final void m54752a(EditText editText) {
        C52711k.m112240b(editText, "editText");
        editText.postDelayed(new C21995a(editText), 500);
    }
}

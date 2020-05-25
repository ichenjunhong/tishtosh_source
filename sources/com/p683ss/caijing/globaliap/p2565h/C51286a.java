package com.p683ss.caijing.globaliap.p2565h;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.caijing.globaliap.h.a */
public final class C51286a extends ProgressDialog {
    public C51286a(Context context) {
        super(context, R.style.mi);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hj);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.clearFlags(2);
        }
    }
}

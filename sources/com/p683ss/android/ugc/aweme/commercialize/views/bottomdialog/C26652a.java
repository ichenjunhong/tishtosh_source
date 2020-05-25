package com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.view.Window;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.a */
public abstract class C26652a extends C1164e {
    /* renamed from: a */
    public abstract int mo54484a();

    public C26652a(Context context) {
        super(context, R.style.a1h);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo54484a());
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }
}

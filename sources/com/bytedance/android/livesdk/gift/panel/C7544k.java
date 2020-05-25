package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.C0199s;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.panel.k */
final /* synthetic */ class C7544k implements C0199s {

    /* renamed from: a */
    private final View f20703a;

    C7544k(View view) {
        this.f20703a = view;
    }

    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        View findViewById = this.f20703a.findViewById(R.id.akt);
        if (findViewById != null && bool != null) {
            if (bool.booleanValue()) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
            }
        }
    }
}

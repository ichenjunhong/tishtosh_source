package com.bytedance.android.live.core.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

/* renamed from: com.bytedance.android.live.core.setting.d */
final /* synthetic */ class C4082d implements OnClickListener {

    /* renamed from: a */
    private final LinearLayout f11238a;

    C4082d(LinearLayout linearLayout) {
        this.f11238a = linearLayout;
    }

    public final void onClick(View view) {
        LinearLayout linearLayout = this.f11238a;
        if (linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }
}

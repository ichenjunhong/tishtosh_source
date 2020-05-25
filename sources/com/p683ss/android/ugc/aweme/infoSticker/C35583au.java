package com.p683ss.android.ugc.aweme.infoSticker;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.au */
public final class C35583au extends C1352v {

    /* renamed from: a */
    ImageView f91455a;

    /* renamed from: b */
    ObjectAnimator f91456b;

    public C35583au(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cfc);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C9432q.m18670a(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f91455a = (ImageView) view.findViewById(R.id.bh6);
    }
}

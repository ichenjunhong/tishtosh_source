package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2306b;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.b.i */
public final class C46147i extends C1352v {

    /* renamed from: a */
    public ImageView f116461a;

    /* renamed from: b */
    public ObjectAnimator f116462b;

    public C46147i(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cfc);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C9432q.m18670a(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f116461a = (ImageView) view.findViewById(R.id.bh6);
    }
}

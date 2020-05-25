package com.p683ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.view.b */
public final class C22310b extends FrameLayout {
    public C22310b(Context context) {
        this(context, null, null, 0, 14, null);
    }

    private C22310b(Context context, String str, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "text");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.azp, this);
        View findViewById = findViewById(R.id.bhk);
        if (!(findViewById instanceof DmtLoadingLayout)) {
            findViewById = null;
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) findViewById;
        if (dmtLoadingLayout != null) {
            dmtLoadingLayout.setVisibility(0);
        }
    }

    private /* synthetic */ C22310b(Context context, String str, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, "", null, 0);
    }
}

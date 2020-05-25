package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout */
public final class HorizontalBusinessComponentLayout extends LinearLayout {
    public HorizontalBusinessComponentLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo80441a(List<C39488e> list) {
        int i = 0;
        boolean z = false;
        for (C39488e eVar : list) {
            if (i > 0) {
                LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(getContext(), 0.5f), (int) C9432q.m18687b(getContext(), 20.0f));
                View view = new View(getContext());
                view.setBackgroundColor(352321535);
                addView(view, layoutParams);
            }
            LayoutParams layoutParams2 = new LayoutParams(-1, (int) C9432q.m18687b(getContext(), 68.0f));
            layoutParams2.weight = 1.0f;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bnb, null);
            TextView textView = (TextView) inflate.findViewById(R.id.bz3);
            C23515d.m57669a((RemoteImageView) inflate.findViewById(R.id.bz2), eVar.f101018b);
            C52711k.m112236a((Object) textView, "txt");
            textView.setText(eVar.f101017a);
            if (eVar.f101020d != null) {
                inflate.setOnClickListener(eVar.f101020d);
            }
            addView(inflate, layoutParams2);
            i++;
            z = true;
        }
        if (z) {
            setVisibility(0);
        }
    }

    public HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

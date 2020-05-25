package com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2070b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.b.a */
public final class C39169a implements C39170c {

    /* renamed from: a */
    private SparseArray<View> f99909a = new SparseArray<>();

    /* renamed from: a */
    public final void mo79813a(int i) {
        View view = (View) this.f99909a.get(i);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo79815b(int i) {
        View view = (View) this.f99909a.get(i);
        if (view != null) {
            view.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo79814a(int i, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(context);
        dmtLoadingLayout.setLayoutParams(layoutParams);
        frameLayout.addView(dmtLoadingLayout, frameLayout.getChildCount());
        this.f99909a.put(i, dmtLoadingLayout);
        dmtLoadingLayout.setVisibility(0);
    }
}

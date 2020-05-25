package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.C30273d;
import com.p683ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.h */
public final class C30285h implements C30273d {

    /* renamed from: a */
    public final Context f79120a;

    public C30285h(Context context) {
        C52711k.m112240b(context, "context");
        this.f79120a = context;
    }

    /* renamed from: a */
    public final void mo60652a(GalleryLayoutManager galleryLayoutManager, View view, float f) {
        C52711k.m112240b(galleryLayoutManager, "layoutManager");
        C52711k.m112240b(view, "page");
        if (f < -1.0f || f > 1.0f) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            view.setAlpha(0.34f);
        } else {
            float abs = ((1.0f - Math.abs(f)) * 0.100000024f) + 0.9f;
            float abs2 = ((1.0f - Math.abs(f)) * 0.65999997f) + 0.34f;
            float abs3 = ((1.0f - Math.abs(f)) * 1.0f) + 7.0f;
            float abs4 = Math.abs(f) * 12.0f;
            view.setScaleX(abs);
            view.setScaleY(abs);
            view.setAlpha(abs2);
            view.setTranslationY(C9432q.m18687b(this.f79120a, abs4));
            RectCornerRelativeLayout rectCornerRelativeLayout = (RectCornerRelativeLayout) view.findViewById(R.id.a0o);
            if (rectCornerRelativeLayout != null) {
                rectCornerRelativeLayout.setRadius((int) C9432q.m18687b(this.f79120a, abs3));
            }
        }
    }
}

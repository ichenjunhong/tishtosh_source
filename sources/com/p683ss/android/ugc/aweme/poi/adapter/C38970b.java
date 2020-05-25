package com.p683ss.android.ugc.aweme.poi.adapter;

import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39178c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45206o;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.b */
public final class C38970b extends C45206o implements C39178c {

    /* renamed from: d */
    private View f99256d;

    /* renamed from: e */
    private int f99257e;

    /* renamed from: b */
    public final int mo79128b() {
        return this.f99257e;
    }

    /* renamed from: a */
    public final View mo79127a() {
        return this.f99256d;
    }

    /* renamed from: a */
    private void m86794a(View view) {
        this.f99256d = view;
    }

    public final void setPrimaryItem(View view, int i, Object obj) {
        super.setPrimaryItem(view, i, obj);
        m86794a(view);
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        m86794a(viewGroup);
    }

    public C38970b(PagerAdapter pagerAdapter, int i, boolean z) {
        super(pagerAdapter);
        this.f99257e = i;
        if (this.f99257e > 0) {
            this.f114366c = z;
            return;
        }
        throw new IllegalArgumentException("loopSize should be a positive value");
    }
}

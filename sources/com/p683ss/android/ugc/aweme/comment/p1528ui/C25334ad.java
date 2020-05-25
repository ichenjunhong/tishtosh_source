package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ad */
public final class C25334ad extends C1331h {

    /* renamed from: a */
    public static final C25335a f67008a = new C25335a(null);

    /* renamed from: b */
    private static final int f67009b = ((int) C9432q.m18687b(C11010c.m22280a(), 4.0f));

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.ad$a */
    public static final class C25335a {
        private C25335a() {
        }

        public /* synthetic */ C25335a(C52707g gVar) {
            this();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        float f;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        Context a = C11010c.m22280a();
        if (RecyclerView.m4275f(view) != 0) {
            f = 0.0f;
        } else {
            f = 16.0f;
        }
        int b = (int) C9432q.m18687b(a, f);
        if (C47918gj.m103682a(view.getContext())) {
            rect.set(f67009b, 0, b, 0);
        } else {
            rect.set(b, 0, f67009b, 0);
        }
    }
}

package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bp */
public final class C37558bp extends C1331h {

    /* renamed from: a */
    public static final C37559a f95816a = new C37559a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bp$a */
    public static final class C37559a {
        private C37559a() {
        }

        public /* synthetic */ C37559a(C52707g gVar) {
            this();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m4275f(view) == 0) {
            i = 0;
        } else {
            i = (int) C9432q.m18687b(view.getContext(), -10.0f);
        }
        if (C47918gj.m103682a(view.getContext())) {
            rect.set(0, 0, i, 0);
        } else {
            rect.set(i, 0, 0, 0);
        }
    }
}

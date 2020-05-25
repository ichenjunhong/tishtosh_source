package com.p683ss.android.ugc.aweme.music.p1978ui.viewholder;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.a */
public final class C37669a extends C1331h {

    /* renamed from: a */
    public static final float f96067a;

    /* renamed from: b */
    public static final double f96068b;

    /* renamed from: c */
    public static final C37670a f96069c = new C37670a(null);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.a$a */
    public static final class C37670a {
        private C37670a() {
        }

        public /* synthetic */ C37670a(C52707g gVar) {
            this();
        }
    }

    static {
        float a = ((float) C9432q.m18670a(C11010c.m22280a())) - C9432q.m18687b(C11010c.m22280a(), 33.0f);
        f96067a = a;
        double d = (double) ((a / 2.0f) * 1.3333334f);
        Double.isNaN(d);
        double d2 = d * 0.15d;
        double b = (double) C9432q.m18687b(C11010c.m22280a(), 16.0f);
        Double.isNaN(b);
        f96068b = d2 + b;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        int i2 = 0;
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (f == i - 1) {
            i2 = (int) f96068b;
        }
        rect.bottom = i2;
    }
}

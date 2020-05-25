package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0776f;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.q */
public final class C35420q extends C1331h {

    /* renamed from: a */
    private final int f91089a;

    /* renamed from: b */
    private final int f91090b;

    /* renamed from: c */
    private final int f91091c;

    public C35420q(int i, int i2, int i3) {
        this.f91089a = i;
        this.f91090b = i2;
        this.f91091c = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (VERSION.SDK_INT < 17 || C0776f.m2189a(Locale.getDefault()) != 1) {
                if (f == 0) {
                    rect.left = this.f91089a;
                } else {
                    rect.left = this.f91090b;
                }
                if (f == itemCount - 1) {
                    rect.right = this.f91091c;
                }
            } else {
                if (f == 0) {
                    rect.right = this.f91089a;
                } else {
                    rect.right = this.f91090b;
                }
                if (f == itemCount - 1) {
                    rect.left = this.f91091c;
                }
            }
        }
    }
}

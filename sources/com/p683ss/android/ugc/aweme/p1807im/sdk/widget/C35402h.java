package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0776f;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.h */
public final class C35402h extends C1331h {

    /* renamed from: a */
    private int f90992a;

    public C35402h(int i) {
        this.f90992a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        if (VERSION.SDK_INT < 17 || C0776f.m2189a(Locale.getDefault()) != 1) {
            if (RecyclerView.m4275f(view) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
                rect.left = 0;
            } else {
                rect.left = this.f90992a;
            }
        } else if (RecyclerView.m4275f(view) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
            rect.right = 0;
        } else {
            rect.right = this.f90992a;
        }
    }
}

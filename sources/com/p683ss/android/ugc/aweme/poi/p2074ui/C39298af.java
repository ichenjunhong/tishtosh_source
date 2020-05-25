package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.af */
public final class C39298af extends C1331h {

    /* renamed from: a */
    private int f100447a;

    /* renamed from: b */
    private int f100448b;

    public C39298af(int i) {
        this.f100447a = i;
        this.f100448b = this.f100447a / 8;
    }

    public C39298af(int i, int i2) {
        this.f100447a = i;
        this.f100448b = i2 / 2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        if (f == 0) {
            rect.left = this.f100447a;
        } else {
            rect.left = this.f100448b;
        }
        if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = this.f100447a;
        } else {
            rect.right = this.f100448b;
        }
    }
}

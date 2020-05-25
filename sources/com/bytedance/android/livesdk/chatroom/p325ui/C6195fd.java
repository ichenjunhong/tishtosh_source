package com.bytedance.android.livesdk.chatroom.p325ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.fd */
public final class C6195fd extends C1331h {

    /* renamed from: a */
    private int f16644a;

    /* renamed from: b */
    private int f16645b = 1;

    public C6195fd(int i, int i2) {
        this.f16644a = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int e = recyclerView.mo4843e(view);
        if (this.f16645b == 0) {
            if (e != 0) {
                rect.left = this.f16644a;
            }
        } else if (1 == this.f16645b) {
            rect.top = this.f16644a;
        }
    }
}

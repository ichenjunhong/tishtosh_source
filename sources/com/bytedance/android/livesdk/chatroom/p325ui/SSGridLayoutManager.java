package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager */
public class SSGridLayoutManager extends GridLayoutManager {
    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4665a(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

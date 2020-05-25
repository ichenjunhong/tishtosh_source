package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import com.p683ss.p2544b.p2545a.C51151a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager */
public class SSLinearLayoutManager extends LinearLayoutManager {
    public SSLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (Exception e) {
            C51151a.m110020b("SSLinearLayoutManager", (Throwable) e);
        }
    }

    public SSLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, false);
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4665a(i, oVar, sVar);
        } catch (Exception e) {
            C51151a.m110020b("SSLinearLayoutManager", (Throwable) e);
            return 0;
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (Exception e) {
            C51151a.m110020b("SSLinearLayoutManager", (Throwable) e);
            return 0;
        }
    }

    public SSLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

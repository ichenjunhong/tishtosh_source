package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager */
public final class MultiEditRecyleViewLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private final C43743a f110748a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.MultiEditRecyleViewLayoutManager$a */
    public final class C43743a extends C1415af {
        /* renamed from: a */
        public final float mo5490a(DisplayMetrics displayMetrics) {
            C52711k.m112240b(displayMetrics, "displayMetrics");
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: b */
        public final int mo5495b(int i) {
            if (i > 2000) {
                i = 2000;
            }
            return super.mo5495b(i);
        }

        public C43743a(Context context) {
            super(context);
        }
    }

    public MultiEditRecyleViewLayoutManager(Context context) {
        super(context, 0, false);
        this.f110748a = new C43743a(context);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C43743a aVar = this.f110748a;
        aVar.f4778g = i;
        mo5022a((C1346r) aVar);
    }
}

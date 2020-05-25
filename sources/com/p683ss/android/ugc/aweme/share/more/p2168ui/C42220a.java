package com.p683ss.android.ugc.aweme.share.more.p2168ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import java.util.Iterator;
import p2628d.p2629a.C52549aa;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.share.more.ui.a */
public final class C42220a extends C1331h {

    /* renamed from: a */
    int f106742a;

    /* renamed from: b */
    int f106743b;

    /* renamed from: c */
    private final Paint f106744c;

    /* renamed from: d */
    private final int f106745d;

    public C42220a(int i, int i2) {
        this.f106745d = i;
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStyle(Style.FILL);
        this.f106744c = paint;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        if (!recyclerView.mo4880l()) {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                C52711k.m112236a((Object) layoutManager, "parent.layoutManager ?: return");
                Iterator it = C52753d.m112320b(0, recyclerView.getChildCount() - 1).iterator();
                while (it.hasNext()) {
                    View childAt = recyclerView.getChildAt(((C52549aa) it).mo110114a());
                    recyclerView.mo4812b(childAt);
                    int i = layoutManager.mo5053i(childAt);
                    int j = layoutManager.mo5055j(childAt);
                    canvas.drawRect(((float) layoutManager.mo5049g(childAt)) + ((float) this.f106742a), (float) (j - this.f106745d), ((float) i) - ((float) this.f106743b), (float) j, this.f106744c);
                }
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46249k.C46250a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.StickerCenterLayoutManager */
public final class StickerCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.StickerCenterLayoutManager$a */
    static final class C46209a extends C1415af {
        public C46209a(Context context) {
            C52711k.m112240b(context, "context");
            super(context);
        }

        /* renamed from: a */
        public final float mo5490a(DisplayMetrics displayMetrics) {
            C52711k.m112240b(displayMetrics, "displayMetrics");
            return C46250a.m100430a();
        }

        /* renamed from: a */
        public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public StickerCenterLayoutManager(Context context, int i, boolean z) {
        C52711k.m112240b(context, "context");
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        C52711k.m112236a((Object) context, "recyclerView.context");
        C46209a aVar = new C46209a(context);
        aVar.f4778g = i;
        mo5022a((C1346r) aVar);
    }

    public StickerCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i, i2);
    }
}

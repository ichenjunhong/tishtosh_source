package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C39000b;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39389l;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiHeaderLayout */
public final class PoiHeaderLayout extends LinearLayout {

    /* renamed from: a */
    public PoiDetailHeaderInfoPresenter f100941a;

    public PoiHeaderLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo80450a(PoiDetail poiDetail) {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = this.f100941a;
        if (poiDetailHeaderInfoPresenter != null) {
            poiDetailHeaderInfoPresenter.mo79148a(poiDetail);
        }
    }

    public PoiHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.bnm, this);
    }

    /* renamed from: a */
    public final void mo80449a(C11079a aVar, C38999a aVar2, C39389l lVar, C39000b bVar) {
        PoiDetailHeaderInfoPresenter poiDetailHeaderInfoPresenter = new PoiDetailHeaderInfoPresenter(aVar, aVar2, this, lVar, bVar);
        this.f100941a = poiDetailHeaderInfoPresenter;
    }

    public /* synthetic */ PoiHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

package com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c.C39175a;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.a.a */
public final class C39172a extends C39174c {

    /* renamed from: a */
    public C39174c f99913a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo79818a() {
        return this.f99913a.mo79818a();
    }

    public final int getCount() {
        if (this.f99913a.mo79818a()) {
            return Integer.MAX_VALUE;
        }
        return this.f99913a.getCount();
    }

    /* renamed from: a */
    public final TransferImage mo79816a(int i) {
        return this.f99913a.mo79816a(i);
    }

    /* renamed from: b */
    public final FrameLayout mo79819b(int i) {
        return this.f99913a.mo79819b(i);
    }

    public C39172a(C39174c cVar) {
        C52711k.m112240b(cVar, "adapter");
        this.f99913a = cVar;
    }

    /* renamed from: a */
    public final void mo79817a(C39175a aVar) {
        this.f99913a.mo79817a(aVar);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        Object instantiateItem = this.f99913a.instantiateItem(viewGroup, i % this.f99913a.getCount());
        C52711k.m112236a(instantiateItem, "adapter.instantiateItem(…position % adapter.count)");
        return instantiateItem;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C52711k.m112240b(view, "p0");
        C52711k.m112240b(obj, "p1");
        return this.f99913a.isViewFromObject(view, obj);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "object");
        this.f99913a.destroyItem(viewGroup, i / this.f99913a.getCount(), obj);
    }
}

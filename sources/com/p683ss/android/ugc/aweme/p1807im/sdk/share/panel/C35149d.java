package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1889a.C35139a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1908a.C35477b;
import com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b.C35479a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d */
public final class C35149d extends C35165h {

    /* renamed from: a */
    public SharePanelWidget f90400a;

    /* renamed from: b */
    public final C35479a f90401b;

    /* renamed from: c */
    public final C35477b f90402c;

    /* renamed from: a */
    public final View mo73264a() {
        SharePanelWidget sharePanelWidget = this.f90400a;
        if (sharePanelWidget == null) {
            return null;
        }
        View view = sharePanelWidget.f90352f;
        if (view == null) {
            C52711k.m112237a("editLayout");
        }
        return view;
    }

    /* renamed from: b */
    public final List<IMContact> mo73267b() {
        SharePanelWidget sharePanelWidget = this.f90400a;
        if (sharePanelWidget == null) {
            return null;
        }
        SharePanelViewModel sharePanelViewModel = sharePanelWidget.f90349c;
        if (sharePanelViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        return C52575l.m112139e((Collection<? extends T>) sharePanelViewModel.mo73280a());
    }

    /* renamed from: c */
    public final void mo73268c() {
        SharePanelWidget sharePanelWidget = this.f90400a;
        if (sharePanelWidget != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.f90349c;
            if (sharePanelViewModel == null) {
                C52711k.m112237a("viewModel");
            }
            sharePanelViewModel.mo73280a().clear();
            C35139a aVar = sharePanelWidget.f90351e;
            if (aVar == null) {
                C52711k.m112237a("headAdapter");
            }
            aVar.notifyDataSetChanged();
            RecyclerView recyclerView = sharePanelWidget.f90350d;
            if (recyclerView == null) {
                C52711k.m112237a("headRecyclerView");
            }
            recyclerView.mo4814b(0);
            sharePanelWidget.mo73253c();
            sharePanelWidget.mo73254d();
        }
    }

    /* renamed from: a */
    public final void mo73266a(boolean z) {
        SharePanelWidget sharePanelWidget = this.f90400a;
        if (sharePanelWidget != null && z) {
            C35142b bVar = sharePanelWidget.f90355i;
            if (bVar != null) {
                bVar.mo73262c();
            }
        }
    }

    /* renamed from: a */
    public final void mo73265a(C42348d dVar) {
        C52711k.m112240b(dVar, "config");
        SharePanelWidget sharePanelWidget = this.f90400a;
        if (sharePanelWidget != null) {
            SharePackage sharePackage = dVar.f106953i;
            C52711k.m112240b(sharePackage, "sharePackage");
            C35479a aVar = sharePanelWidget.f90356j;
            C52711k.m112240b(sharePackage, "<set-?>");
            aVar.f91202g = sharePackage;
            sharePanelWidget.mo73253c();
        }
        this.f90402c.mo70331a(dVar);
    }

    public C35149d(C35479a aVar, C35477b bVar) {
        C52711k.m112240b(aVar, "payload");
        C52711k.m112240b(bVar, "callback");
        super(aVar);
        this.f90401b = aVar;
        this.f90402c = bVar;
    }
}

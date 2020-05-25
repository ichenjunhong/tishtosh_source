package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiOptimizedRoutePresenter_ViewBinding */
public class PoiOptimizedRoutePresenter_ViewBinding extends PoiRoutePresenter_ViewBinding {

    /* renamed from: a */
    private PoiOptimizedRoutePresenter f100348a;

    /* renamed from: b */
    private View f100349b;

    /* renamed from: c */
    private View f100350c;

    /* renamed from: d */
    private View f100351d;

    public void unbind() {
        PoiOptimizedRoutePresenter poiOptimizedRoutePresenter = this.f100348a;
        if (poiOptimizedRoutePresenter != null) {
            this.f100348a = null;
            poiOptimizedRoutePresenter.mRouteDriveLayout = null;
            poiOptimizedRoutePresenter.mRouteBusLayout = null;
            poiOptimizedRoutePresenter.mRouteWalkingLayout = null;
            poiOptimizedRoutePresenter.mRouteDriveImg = null;
            poiOptimizedRoutePresenter.mRouteBusImg = null;
            poiOptimizedRoutePresenter.mRouteWalkingImg = null;
            poiOptimizedRoutePresenter.mShareBtn = null;
            poiOptimizedRoutePresenter.mMoreActionBtn = null;
            this.f100349b.setOnClickListener(null);
            this.f100349b = null;
            this.f100350c.setOnClickListener(null);
            this.f100350c = null;
            this.f100351d.setOnClickListener(null);
            this.f100351d = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiOptimizedRoutePresenter_ViewBinding(final PoiOptimizedRoutePresenter poiOptimizedRoutePresenter, View view) {
        super(poiOptimizedRoutePresenter, view);
        this.f100348a = poiOptimizedRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, R.id.c28, "field 'mRouteDriveLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteDriveLayout = findRequiredView;
        this.f100349b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c25, "field 'mRouteBusLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteBusLayout = findRequiredView2;
        this.f100350c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c2i, "field 'mRouteWalkingLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteWalkingLayout = findRequiredView3;
        this.f100351d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiOptimizedRoutePresenter.onClick(view);
            }
        });
        poiOptimizedRoutePresenter.mRouteDriveImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.c27, "field 'mRouteDriveImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteBusImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.c24, "field 'mRouteBusImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteWalkingImg = (ImageView) Utils.findRequiredViewAsType(view, R.id.c2h, "field 'mRouteWalkingImg'", ImageView.class);
        poiOptimizedRoutePresenter.mShareBtn = view.findViewById(R.id.cmr);
        poiOptimizedRoutePresenter.mMoreActionBtn = view.findViewById(R.id.elh);
    }
}

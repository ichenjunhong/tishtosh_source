package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRoutePresenter_ViewBinding */
public class PoiRoutePresenter_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRoutePresenter f100396a;

    /* renamed from: b */
    private View f100397b;

    /* renamed from: c */
    private View f100398c;

    /* renamed from: d */
    private View f100399d;

    public void unbind() {
        PoiRoutePresenter poiRoutePresenter = this.f100396a;
        if (poiRoutePresenter != null) {
            this.f100396a = null;
            poiRoutePresenter.mRouteDrive = null;
            poiRoutePresenter.mRouteBus = null;
            poiRoutePresenter.mRouteWalking = null;
            poiRoutePresenter.mTitle = null;
            poiRoutePresenter.mRouteTab = null;
            this.f100397b.setOnClickListener(null);
            this.f100397b = null;
            this.f100398c.setOnClickListener(null);
            this.f100398c = null;
            this.f100399d.setOnClickListener(null);
            this.f100399d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRoutePresenter_ViewBinding(final PoiRoutePresenter poiRoutePresenter, View view) {
        this.f100396a = poiRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, R.id.c26, "field 'mRouteDrive' and method 'onClick'");
        poiRoutePresenter.mRouteDrive = (TextView) Utils.castView(findRequiredView, R.id.c26, "field 'mRouteDrive'", TextView.class);
        this.f100397b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.c23, "field 'mRouteBus' and method 'onClick'");
        poiRoutePresenter.mRouteBus = (TextView) Utils.castView(findRequiredView2, R.id.c23, "field 'mRouteBus'", TextView.class);
        this.f100398c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.c2g, "field 'mRouteWalking' and method 'onClick'");
        poiRoutePresenter.mRouteWalking = (TextView) Utils.castView(findRequiredView3, R.id.c2g, "field 'mRouteWalking'", TextView.class);
        this.f100399d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRoutePresenter.onClick(view);
            }
        });
        poiRoutePresenter.mTitle = (TextView) Utils.findOptionalViewAsType(view, R.id.c2b, "field 'mTitle'", TextView.class);
        poiRoutePresenter.mRouteTab = Utils.findRequiredView(view, R.id.c2_, "field 'mRouteTab'");
    }
}

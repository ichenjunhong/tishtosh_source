package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiRouteFragment_ViewBinding */
public class PoiRouteFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PoiRouteFragment f100375a;

    /* renamed from: b */
    private View f100376b;

    public void unbind() {
        if (this.f100375a != null) {
            this.f100375a = null;
            this.f100376b.setOnClickListener(null);
            this.f100376b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PoiRouteFragment_ViewBinding(final PoiRouteFragment poiRouteFragment, View view) {
        this.f100375a = poiRouteFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.c22, "method 'onClick'");
        this.f100376b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                poiRouteFragment.onClick(view);
            }
        });
    }
}

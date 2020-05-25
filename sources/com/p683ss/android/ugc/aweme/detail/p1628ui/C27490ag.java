package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.ag */
public final class C27490ag extends C27514r {

    /* renamed from: p */
    private HashMap f72283p;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f72283p != null) {
            this.f72283p.clear();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b8u, viewGroup, false);
    }
}

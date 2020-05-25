package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.poi.map.C39075g;
import com.p683ss.android.ugc.aweme.poi.map.C39084p;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiOptimizedRoutePresenter */
public class PoiOptimizedRoutePresenter extends PoiRoutePresenter implements C39084p {

    /* renamed from: m */
    private boolean f100345m;
    View mMoreActionBtn;
    ImageView mRouteBusImg;
    View mRouteBusLayout;
    ImageView mRouteDriveImg;
    View mRouteDriveLayout;
    ImageView mRouteWalkingImg;
    View mRouteWalkingLayout;
    View mShareBtn;

    /* renamed from: n */
    private boolean f100346n;

    /* renamed from: f */
    public final boolean mo80068f() {
        return this.f100345m;
    }

    /* renamed from: g */
    public final C39084p mo80069g() {
        return this;
    }

    /* renamed from: a */
    public final void mo79285a() {
        if (this.f100389k) {
            mo80086k();
        }
    }

    /* renamed from: h */
    public final int mo80070h() {
        if (this.f100389k) {
            return R.layout.bnf;
        }
        return R.layout.bne;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo80064b() {
        Object tag = this.mRouteDriveLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteDrive);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo80065c() {
        Object tag = this.mRouteBusLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteTransit);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo80066d() {
        Object tag = this.mRouteWalkingLayout.getTag();
        if (tag != null && (tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            mo80082b(C39075g.RouteWalking);
        }
    }

    /* renamed from: e */
    public final void mo80067e() {
        boolean z;
        if (!this.f100346n) {
            if (this.f100379a != null) {
                z = this.f100379a.isViewValid();
            } else {
                z = false;
            }
            if (z && this.f100386h != null) {
                this.f100346n = true;
                mo80077a(this.f100386h[0], this.f100386h[1]);
                if (this.f100389k) {
                    this.f100345m = true;
                    if (this.f100381c != null) {
                        Object obj = null;
                        switch (this.f100381c) {
                            case RouteDrive:
                                obj = this.mRouteDriveLayout.getTag();
                                break;
                            case RouteTransit:
                                obj = this.mRouteBusLayout.getTag();
                                break;
                            case RouteWalking:
                                obj = this.mRouteWalkingLayout.getTag();
                                break;
                        }
                        if (obj != null && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                            mo80083c(this.f100381c);
                            mo80080a(this.f100381c);
                        }
                    }
                    mo80085j();
                    this.f100380b.mo79265a(this.f100387i, this.f100388j, this.f100386h[0], this.f100386h[1]);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo80063a(PoiStruct poiStruct) {
        return super.mo80063a(poiStruct);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.c28) {
            mo80064b();
        } else if (id == R.id.c25) {
            mo80065c();
        } else if (id == R.id.c2i) {
            mo80066d();
        } else {
            super.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80062a(C39075g gVar, boolean z) {
        int i;
        int i2;
        int i3;
        if (gVar != null) {
            switch (gVar) {
                case RouteDrive:
                    View view = this.mRouteDriveLayout;
                    ImageView imageView = this.mRouteDriveImg;
                    TextView textView = this.mRouteDrive;
                    if (z) {
                        i = R.drawable.dko;
                    } else {
                        i = R.drawable.dkn;
                    }
                    m87281a(view, imageView, textView, i, z);
                    return;
                case RouteTransit:
                    View view2 = this.mRouteBusLayout;
                    ImageView imageView2 = this.mRouteBusImg;
                    TextView textView2 = this.mRouteBus;
                    if (z) {
                        i2 = R.drawable.dkm;
                    } else {
                        i2 = R.drawable.dkl;
                    }
                    m87281a(view2, imageView2, textView2, i2, z);
                    return;
                case RouteWalking:
                    View view3 = this.mRouteWalkingLayout;
                    ImageView imageView3 = this.mRouteWalkingImg;
                    TextView textView3 = this.mRouteWalking;
                    if (z) {
                        i3 = R.drawable.dlb;
                    } else {
                        i3 = R.drawable.dla;
                    }
                    m87281a(view3, imageView3, textView3, i3, z);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m87281a(View view, ImageView imageView, TextView textView, int i, boolean z) {
        int i2;
        imageView.setImageResource(i);
        Resources i3 = mo80084i();
        if (z) {
            i2 = R.color.a36;
        } else {
            i2 = R.color.a1k;
        }
        textView.setTextColor(i3.getColor(i2));
        view.setSelected(z);
    }
}

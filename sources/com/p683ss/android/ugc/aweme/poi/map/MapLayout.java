package com.p683ss.android.ugc.aweme.poi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p118b.p119a.p120a.p121a.C2578a;
import com.p118b.p119a.p120a.p121a.C2581b;
import com.p118b.p119a.p120a.p121a.C2582c;
import com.p683ss.android.ugc.aweme.p1359ao.p1360a.C22784a;

/* renamed from: com.ss.android.ugc.aweme.poi.map.MapLayout */
public class MapLayout extends BaseMapLayout {

    /* renamed from: b */
    public C2578a f99667b;

    /* renamed from: c */
    private C39083o f99668c;

    public float getZoomBig() {
        return 14.0f;
    }

    public float getZoomSmall() {
        return 10.0f;
    }

    public void setOnCameraChangeListener(C2581b bVar) {
    }

    /* renamed from: a */
    public final void mo79264a() {
        this.f99667b.mo7083a();
    }

    /* renamed from: b */
    public final void mo79270b() {
        this.f99667b.mo7094e();
    }

    /* renamed from: c */
    public final void mo79271c() {
        this.f99667b.mo7091b();
    }

    /* renamed from: d */
    public final void mo79272d() {
        this.f99667b.mo7092c();
    }

    /* renamed from: e */
    public final void mo79274e() {
        this.f99667b.mo7093d();
    }

    /* renamed from: f */
    public final void mo79275f() {
        this.f99667b.mo7095f();
    }

    public void setOnMapZoomGestureListener(C39083o oVar) {
        this.f99668c = oVar;
    }

    public MapLayout(Context context) {
        this(context, null);
    }

    public void setOnMapClickListener(C39082n nVar) {
        this.f99667b.mo7090a((C2582c) new C39071c(nVar));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 261 && this.f99668c != null) {
            this.f99668c.bE_();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo79268a(Bundle bundle) {
        this.f99667b.mo7087a(bundle);
    }

    public MapLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo79269a(Bundle bundle, C39078j jVar) {
        this.f99667b = new C22784a(this);
        this.f99667b.mo7088a(bundle, new C39069a(jVar));
    }

    public MapLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo79266a(Bitmap bitmap, double d, double d2) {
        this.f99667b.mo7085a(bitmap, d, d2);
    }

    /* renamed from: a */
    public final void mo79265a(double d, double d2, double d3, double d4) {
        this.f99667b.mo7084a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo79267a(Bitmap bitmap, double d, double d2, float f, C39077i iVar) {
        this.f99667b.mo7086a(bitmap, d, d2, f, new C39070b(iVar));
    }
}

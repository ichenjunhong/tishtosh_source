package com.p683ss.android.ugc.asve.recorder.camera.p1247b;

import android.content.Context;
import android.content.res.Resources;
import android.support.p030v4.view.C1034d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.asve.recorder.view.C20566d;
import com.p683ss.android.ugc.asve.recorder.view.C20571i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a */
public final class C20458a extends C20571i implements C20566d {

    /* renamed from: a */
    public final C20484e f56094a;

    /* renamed from: b */
    private boolean f56095b = true;

    /* renamed from: c */
    private final ScaleGestureDetector f56096c = new ScaleGestureDetector(this.f56098e, new C20460b(this));

    /* renamed from: d */
    private final C1034d f56097d;

    /* renamed from: e */
    private final Context f56098e;

    /* renamed from: f */
    private final ASCameraView f56099f;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$a */
    public static final class C20459a implements OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C20458a f56100a;

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        C20459a(C20458a aVar) {
            this.f56100a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f56100a.mo43404a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return this.f56100a.mo43405a(motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$b */
    public static final class C20460b implements OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C20458a f56101a;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
        }

        C20460b(C20458a aVar) {
            this.f56101a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            return this.f56101a.f56094a.mo43253b().mo43360b(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan());
        }
    }

    /* renamed from: a */
    public final boolean mo43404a() {
        if (!this.f56095b) {
            return false;
        }
        this.f56099f.mo43639e();
        return true;
    }

    /* renamed from: a */
    public final void mo43403a(boolean z) {
        this.f56095b = z;
    }

    /* renamed from: a */
    public final void mo43402a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        this.f56096c.onTouchEvent(motionEvent);
        this.f56097d.mo3213a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo43405a(float f, float f2) {
        C20457b b = this.f56094a.mo43253b();
        int width = this.f56099f.getPresentView().getWidth();
        int height = this.f56099f.getPresentView().getHeight();
        Resources resources = this.f56098e.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        if (b.mo43353a(width, height, resources.getDisplayMetrics().density, new float[]{f, f2})) {
            this.f56099f.getCameraViewHelper$tools_asve_release().mo43412a((int) f, (int) f2);
        }
        return true;
    }

    public C20458a(Context context, ASCameraView aSCameraView, C20484e eVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aSCameraView, "rootView");
        C52711k.m112240b(eVar, "recorder");
        this.f56098e = context;
        this.f56099f = aSCameraView;
        this.f56094a = eVar;
        C1034d dVar = new C1034d(this.f56098e, new SimpleOnGestureListener());
        dVar.mo3211a((OnDoubleTapListener) new C20459a(this));
        this.f56097d = dVar;
    }
}

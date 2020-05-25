package com.p683ss.android.ugc.asve.recorder.reaction.p1249a;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1034d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b;
import com.p683ss.android.ugc.asve.p1241e.p1242a.C20382b.C20384b;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.asve.recorder.view.C20566d;
import com.p683ss.android.ugc.asve.recorder.view.C20571i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a */
public final class C20532a extends C20571i implements C20566d {

    /* renamed from: a */
    final C20457b f56241a;

    /* renamed from: b */
    private boolean f56242b = true;

    /* renamed from: c */
    private final ScaleGestureDetector f56243c;

    /* renamed from: d */
    private final C20382b f56244d;

    /* renamed from: e */
    private final C1034d f56245e;

    /* renamed from: f */
    private final ASCameraView f56246f;

    /* renamed from: g */
    private final C20531a f56247g;

    /* renamed from: h */
    private final C20536b f56248h;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$a */
    public static final class C20533a implements OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C20532a f56249a;

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        C20533a(C20532a aVar) {
            this.f56249a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f56249a.mo43404a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            this.f56249a.mo43405a(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$b */
    public static final class C20534b implements C20384b {

        /* renamed from: a */
        final /* synthetic */ C20532a f56250a;

        C20534b(C20532a aVar) {
            this.f56250a = aVar;
        }

        /* renamed from: b */
        public final void mo43214b(C20382b bVar) {
            C52711k.m112240b(bVar, "detector");
            this.f56250a.mo43579b();
        }

        /* renamed from: a */
        public final boolean mo43212a(C20382b bVar) {
            C52711k.m112240b(bVar, "detector");
            return this.f56250a.mo43581c(bVar.f55897i.x, bVar.f55897i.y);
        }

        /* renamed from: a */
        public final boolean mo43213a(C20382b bVar, float f, float f2) {
            C52711k.m112240b(bVar, "detector");
            return this.f56250a.mo43580b(f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$c */
    public static final class C20535c implements OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C20532a f56251a;

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
        }

        C20535c(C20532a aVar) {
            this.f56251a = aVar;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            C20532a aVar = this.f56251a;
            return true;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            return this.f56251a.f56241a.mo43360b(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan());
        }
    }

    /* renamed from: a */
    public final boolean mo43405a(float f, float f2) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo43404a() {
        if (!this.f56242b) {
            return false;
        }
        this.f56246f.mo43639e();
        return true;
    }

    /* renamed from: b */
    public final void mo43579b() {
        View a = this.f56248h.mo43588a();
        if (a != null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo43403a(boolean z) {
        this.f56242b = z;
    }

    /* renamed from: a */
    public final void mo43402a(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        this.f56244d.mo43209a(motionEvent);
        this.f56243c.onTouchEvent(motionEvent);
        this.f56245e.mo3213a(motionEvent);
    }

    /* renamed from: c */
    public final boolean mo43581c(float f, float f2) {
        this.f56247g.mo43571a((int) f, (int) f2);
        return true;
    }

    /* renamed from: b */
    public final boolean mo43580b(float f, float f2) {
        int i;
        LayoutParams layoutParams = this.f56246f.getPresentView().getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (VERSION.SDK_INT >= 17) {
                i = Math.min(marginLayoutParams.getMarginStart(), marginLayoutParams.leftMargin);
            } else {
                i = marginLayoutParams.leftMargin;
            }
            if (!this.f56247g.mo43573b((int) (f - ((float) i)), (int) (f2 - ((float) marginLayoutParams.topMargin)))) {
                return false;
            }
            View a = this.f56248h.mo43588a();
            if (a != null) {
                a.setVisibility(0);
            }
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C20532a(Context context, ASCameraView aSCameraView, C20531a aVar, C20457b bVar, C20536b bVar2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aSCameraView, "rootView");
        C52711k.m112240b(aVar, "reactionCtrl");
        C52711k.m112240b(bVar, "cameraController");
        C52711k.m112240b(bVar2, "viewHelper");
        this.f56246f = aSCameraView;
        this.f56247g = aVar;
        this.f56241a = bVar;
        this.f56248h = bVar2;
        this.f56243c = new ScaleGestureDetector(context, new C20535c(this));
        this.f56244d = new C20382b(context, new C20534b(this));
        C1034d dVar = new C1034d(context, new SimpleOnGestureListener());
        dVar.mo3211a((OnDoubleTapListener) new C20533a(this));
        this.f56245e = dVar;
    }
}

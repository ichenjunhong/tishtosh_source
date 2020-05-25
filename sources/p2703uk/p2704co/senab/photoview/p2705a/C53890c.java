package p2703uk.p2704co.senab.photoview.p2705a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

/* renamed from: uk.co.senab.photoview.a.c */
public final class C53890c extends C53889b {

    /* renamed from: f */
    protected final ScaleGestureDetector f133531f;

    /* renamed from: a */
    public final boolean mo113977a() {
        return this.f133531f.isInProgress();
    }

    public C53890c(Context context) {
        super(context);
        this.f133531f = new ScaleGestureDetector(context, new OnScaleGestureListener() {
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C53890c.this.f133522a.mo113985b(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    /* renamed from: c */
    public final boolean mo113979c(MotionEvent motionEvent) {
        this.f133531f.onTouchEvent(motionEvent);
        return super.mo113979c(motionEvent);
    }
}

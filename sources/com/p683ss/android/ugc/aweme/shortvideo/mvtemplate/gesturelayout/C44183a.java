package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import java.lang.reflect.Field;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a */
public final class C44183a {

    /* renamed from: a */
    ScaleGestureDetector f111930a;

    /* renamed from: b */
    GestureDetector f111931b;

    /* renamed from: c */
    public C44184a f111932c;

    /* renamed from: d */
    boolean f111933d;

    /* renamed from: e */
    boolean f111934e;

    /* renamed from: f */
    boolean f111935f;

    /* renamed from: g */
    public MotionEvent f111936g;

    /* renamed from: h */
    private final OnGestureListener f111937h = new C44185b(this);

    /* renamed from: i */
    private final OnScaleGestureListener f111938i = new C44186c(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$a */
    public static class C44184a implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {
        /* renamed from: a */
        public void mo90056a() {
        }

        /* renamed from: a */
        public void mo90057a(int i) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C52711k.m112240b(motionEvent, "e1");
            C52711k.m112240b(motionEvent2, "e2");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            return false;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C52711k.m112240b(motionEvent, "e1");
            C52711k.m112240b(motionEvent2, "e2");
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$b */
    public static final class C44185b implements OnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C44183a f111939a;

        C44185b(C44183a aVar) {
            this.f111939a = aVar;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar != null) {
                aVar.onLongPress(motionEvent);
            }
        }

        public final void onShowPress(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar != null) {
                aVar.onShowPress(motionEvent);
            }
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar != null) {
                return aVar.onDown(motionEvent);
            }
            return false;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar == null) {
                C52711k.m112234a();
            }
            return aVar.onSingleTapUp(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C52711k.m112240b(motionEvent, "e1");
            C52711k.m112240b(motionEvent2, "e2");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar != null) {
                return aVar.onFling(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C52711k.m112240b(motionEvent, "e1");
            C52711k.m112240b(motionEvent2, "e2");
            C44184a aVar = this.f111939a.f111932c;
            if (aVar != null) {
                return aVar.onScroll(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a$c */
    public static final class C44186c implements OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C44183a f111940a;

        C44186c(C44183a aVar) {
            this.f111940a = aVar;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            C44184a aVar = this.f111940a.f111932c;
            if (aVar != null) {
                aVar.onScaleEnd(scaleGestureDetector);
            }
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            C44184a aVar = this.f111940a.f111932c;
            if (aVar != null) {
                return aVar.onScale(scaleGestureDetector);
            }
            return false;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C52711k.m112240b(scaleGestureDetector, "detector");
            if (this.f111940a.f111936g != null) {
                MotionEvent motionEvent = this.f111940a.f111936g;
                if (motionEvent == null) {
                    C52711k.m112234a();
                }
                if (motionEvent.getPointerCount() <= 1) {
                    return false;
                }
            }
            C44184a aVar = this.f111940a.f111932c;
            if (aVar == null) {
                C52711k.m112234a();
            }
            return aVar.onScaleBegin(scaleGestureDetector);
        }
    }

    public C44183a(Context context, C44184a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "callback");
        this.f111932c = aVar;
        this.f111931b = new GestureDetector(context, this.f111937h);
        GestureDetector gestureDetector = this.f111931b;
        if (gestureDetector == null) {
            C52711k.m112234a();
        }
        gestureDetector.setOnDoubleTapListener(aVar);
        this.f111930a = new ScaleGestureDetector(context, this.f111938i);
        if (VERSION.SDK_INT >= 19) {
            ScaleGestureDetector scaleGestureDetector = this.f111930a;
            if (scaleGestureDetector == null) {
                C52711k.m112234a();
            }
            scaleGestureDetector.setQuickScaleEnabled(false);
        }
        try {
            Field declaredField = ScaleGestureDetector.class.getDeclaredField("mMinSpan");
            C52711k.m112236a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            declaredField.set(this.f111930a, Integer.valueOf(1));
        } catch (Throwable unused) {
        }
    }
}

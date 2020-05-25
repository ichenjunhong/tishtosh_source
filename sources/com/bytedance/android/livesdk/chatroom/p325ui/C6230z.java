package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p030v4.view.C1034d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.chatroom.event.C5154aa;
import com.bytedance.android.livesdk.chatroom.event.C5154aa.C5155a;
import com.bytedance.android.livesdk.p269aa.C4495a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.z */
public final class C6230z implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {

    /* renamed from: a */
    C1034d f16718a;

    /* renamed from: b */
    ScaleGestureDetector f16719b;

    /* renamed from: c */
    boolean f16720c;

    /* renamed from: d */
    boolean f16721d;

    /* renamed from: e */
    MotionEvent f16722e;

    /* renamed from: f */
    private int f16723f;

    /* renamed from: g */
    private int f16724g;

    /* renamed from: h */
    private float f16725h = 1.0f;

    /* renamed from: i */
    private C6231a f16726i = C6231a.BEF_GESTURE_TYPE_PAN;

    /* renamed from: j */
    private Context f16727j;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.z$a */
    enum C6231a {
        BEF_GESTURE_TYPE_UNKNOWN,
        BEF_GESTURE_TYPE_TAP,
        BEF_GESTURE_TYPE_PAN,
        BEF_GESTURE_TYPE_ROTATE,
        BEF_GESTURE_TYPE_SCALE,
        BEF_GESTURE_TYPE_LONG_PRESS
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: a */
    private C5155a m13401a() {
        if (this.f16722e != null) {
            return mo12265a(this.f16722e, true);
        }
        return null;
    }

    /* renamed from: a */
    private C5155a m13402a(MotionEvent motionEvent) {
        return mo12265a(motionEvent, false);
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f16725h = 1.0f;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f16726i = C6231a.BEF_GESTURE_TYPE_TAP;
        if (this.f16722e != null) {
            m13403a(201, m13401a());
            this.f16722e = null;
        }
        m13403a(206, m13402a(motionEvent));
        return false;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f16726i = C6231a.BEF_GESTURE_TYPE_SCALE;
        if (this.f16722e != null) {
            m13403a(201, m13401a());
            this.f16722e = null;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() / this.f16725h;
        C5155a aVar = new C5155a();
        aVar.f13823g = scaleFactor;
        aVar.f13822f = 3.0f;
        m13403a(205, aVar);
        this.f16725h = scaleGestureDetector.getScaleFactor();
        return false;
    }

    public C6230z(Context context) {
        this.f16727j = context;
        this.f16723f = context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        this.f16724g = context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        this.f16718a = new C1034d(context, this);
        this.f16718a.mo3212a(false);
        this.f16718a.mo3211a((OnDoubleTapListener) this);
        this.f16719b = new ScaleGestureDetector(context, this);
    }

    /* renamed from: a */
    static void m13403a(int i, C5155a aVar) {
        if (aVar != null) {
            C4495a.m10823a().mo10301a((Object) new C5154aa(i, aVar));
            return;
        }
        StringBuilder sb = new StringBuilder("notifyTouchEvent event is null, action: ");
        sb.append(i);
        C3831a.m9716d("EffectGestureDetector", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5155a mo12265a(MotionEvent motionEvent, boolean z) {
        C5155a aVar = new C5155a();
        aVar.f13818b = motionEvent.getX() / ((float) this.f16723f);
        aVar.f13819c = motionEvent.getY() / ((float) this.f16724g);
        if (z && this.f16726i != null) {
            aVar.f13817a = this.f16726i.ordinal();
        }
        return aVar;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f16721d) {
            this.f16721d = false;
        }
        this.f16726i = C6231a.BEF_GESTURE_TYPE_PAN;
        if (this.f16722e != null) {
            m13403a(201, m13401a());
            this.f16722e = null;
        }
        C5155a a = m13402a(motionEvent2);
        a.f13820d = f / ((float) this.f16723f);
        a.f13821e = f2 / ((float) this.f16724g);
        a.f13822f = 1.0f;
        m13403a(203, a);
        return true;
    }
}

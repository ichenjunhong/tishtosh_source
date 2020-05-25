package android.support.p030v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.d */
public final class C1034d {

    /* renamed from: a */
    private final C1035a f3296a;

    /* renamed from: android.support.v4.view.d$a */
    interface C1035a {
        /* renamed from: a */
        void mo3214a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        void mo3215a(boolean z);

        /* renamed from: a */
        boolean mo3216a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.d$b */
    static class C1036b implements C1035a {

        /* renamed from: l */
        private static final int f3297l = ViewConfiguration.getLongPressTimeout();

        /* renamed from: m */
        private static final int f3298m = ViewConfiguration.getTapTimeout();

        /* renamed from: n */
        private static final int f3299n = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        final Handler f3300a;

        /* renamed from: b */
        final OnGestureListener f3301b;

        /* renamed from: c */
        OnDoubleTapListener f3302c;

        /* renamed from: d */
        boolean f3303d;

        /* renamed from: e */
        boolean f3304e;

        /* renamed from: f */
        boolean f3305f;

        /* renamed from: g */
        MotionEvent f3306g;

        /* renamed from: h */
        private int f3307h;

        /* renamed from: i */
        private int f3308i;

        /* renamed from: j */
        private int f3309j;

        /* renamed from: k */
        private int f3310k;

        /* renamed from: o */
        private boolean f3311o;

        /* renamed from: p */
        private boolean f3312p;

        /* renamed from: q */
        private MotionEvent f3313q;

        /* renamed from: r */
        private boolean f3314r;

        /* renamed from: s */
        private float f3315s;

        /* renamed from: t */
        private float f3316t;

        /* renamed from: u */
        private float f3317u;

        /* renamed from: v */
        private float f3318v;

        /* renamed from: w */
        private boolean f3319w;

        /* renamed from: x */
        private VelocityTracker f3320x;

        /* renamed from: android.support.v4.view.d$b$a */
        class C1037a extends Handler {
            C1037a() {
            }

            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C1036b.this.f3301b.onShowPress(C1036b.this.f3306g);
                        return;
                    case 2:
                        C1036b bVar = C1036b.this;
                        bVar.f3300a.removeMessages(3);
                        bVar.f3304e = false;
                        bVar.f3305f = true;
                        bVar.f3301b.onLongPress(bVar.f3306g);
                        return;
                    case 3:
                        if (C1036b.this.f3302c == null) {
                            return;
                        }
                        if (!C1036b.this.f3303d) {
                            C1036b.this.f3302c.onSingleTapConfirmed(C1036b.this.f3306g);
                            return;
                        } else {
                            C1036b.this.f3304e = true;
                            return;
                        }
                    default:
                        StringBuilder sb = new StringBuilder("Unknown message ");
                        sb.append(message);
                        throw new RuntimeException(sb.toString());
                }
            }

            C1037a(Handler handler) {
                super(handler.getLooper());
            }
        }

        /* renamed from: a */
        public final void mo3214a(OnDoubleTapListener onDoubleTapListener) {
            this.f3302c = onDoubleTapListener;
        }

        /* renamed from: a */
        public final void mo3215a(boolean z) {
            this.f3319w = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x0273  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x028c  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x024b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo3216a(android.view.MotionEvent r14) {
            /*
                r13 = this;
                int r0 = r14.getAction()
                android.view.VelocityTracker r1 = r13.f3320x
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r13.f3320x = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r13.f3320x
                r1.addMovement(r14)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r1 = 1
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                if (r1 == 0) goto L_0x0024
                int r4 = r14.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r4 = -1
            L_0x0025:
                int r5 = r14.getPointerCount()
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x002d:
                if (r7 >= r5) goto L_0x003e
                if (r4 == r7) goto L_0x003b
                float r10 = r14.getX(r7)
                float r8 = r8 + r10
                float r10 = r14.getY(r7)
                float r9 = r9 + r10
            L_0x003b:
                int r7 = r7 + 1
                goto L_0x002d
            L_0x003e:
                if (r1 == 0) goto L_0x0043
                int r1 = r5 + -1
                goto L_0x0044
            L_0x0043:
                r1 = r5
            L_0x0044:
                float r1 = (float) r1
                float r8 = r8 / r1
                float r9 = r9 / r1
                r1 = 1000(0x3e8, float:1.401E-42)
                r4 = 0
                r7 = 2
                r10 = 3
                switch(r0) {
                    case 0: goto L_0x01f4;
                    case 1: goto L_0x0161;
                    case 2: goto L_0x00ec;
                    case 3: goto L_0x00c4;
                    case 4: goto L_0x004f;
                    case 5: goto L_0x009d;
                    case 6: goto L_0x0051;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x02bb
            L_0x0051:
                r13.f3315s = r8
                r13.f3317u = r8
                r13.f3316t = r9
                r13.f3318v = r9
                android.view.VelocityTracker r0 = r13.f3320x
                int r2 = r13.f3310k
                float r2 = (float) r2
                r0.computeCurrentVelocity(r1, r2)
                int r0 = r14.getActionIndex()
                int r1 = r14.getPointerId(r0)
                android.view.VelocityTracker r2 = r13.f3320x
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r13.f3320x
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0076:
                if (r4 >= r5) goto L_0x02bb
                if (r4 == r0) goto L_0x009a
                int r7 = r14.getPointerId(r4)
                android.view.VelocityTracker r8 = r13.f3320x
                float r8 = r8.getXVelocity(r7)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r13.f3320x
                float r7 = r9.getYVelocity(r7)
                float r7 = r7 * r1
                float r8 = r8 + r7
                int r7 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x009a
                android.view.VelocityTracker r14 = r13.f3320x
                r14.clear()
                goto L_0x02bb
            L_0x009a:
                int r4 = r4 + 1
                goto L_0x0076
            L_0x009d:
                r13.f3315s = r8
                r13.f3317u = r8
                r13.f3316t = r9
                r13.f3318v = r9
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r2)
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r7)
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r10)
                r13.f3314r = r3
                r13.f3311o = r3
                r13.f3312p = r3
                r13.f3304e = r3
                boolean r14 = r13.f3305f
                if (r14 == 0) goto L_0x02bb
                r13.f3305f = r3
                goto L_0x02bb
            L_0x00c4:
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r2)
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r7)
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r10)
                android.view.VelocityTracker r14 = r13.f3320x
                r14.recycle()
                r13.f3320x = r4
                r13.f3314r = r3
                r13.f3303d = r3
                r13.f3311o = r3
                r13.f3312p = r3
                r13.f3304e = r3
                boolean r14 = r13.f3305f
                if (r14 == 0) goto L_0x02bb
                r13.f3305f = r3
                goto L_0x02bb
            L_0x00ec:
                boolean r0 = r13.f3305f
                if (r0 != 0) goto L_0x02bb
                float r0 = r13.f3315s
                float r0 = r0 - r8
                float r1 = r13.f3316t
                float r1 = r1 - r9
                boolean r4 = r13.f3314r
                if (r4 == 0) goto L_0x0103
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3302c
                boolean r14 = r0.onDoubleTapEvent(r14)
                r3 = r3 | r14
                goto L_0x02bb
            L_0x0103:
                boolean r4 = r13.f3311o
                if (r4 == 0) goto L_0x0141
                float r4 = r13.f3317u
                float r4 = r8 - r4
                int r4 = (int) r4
                float r5 = r13.f3318v
                float r5 = r9 - r5
                int r5 = (int) r5
                int r4 = r4 * r4
                int r5 = r5 * r5
                int r4 = r4 + r5
                int r5 = r13.f3307h
                if (r4 <= r5) goto L_0x0138
                android.view.GestureDetector$OnGestureListener r5 = r13.f3301b
                android.view.MotionEvent r6 = r13.f3306g
                boolean r14 = r5.onScroll(r6, r14, r0, r1)
                r13.f3315s = r8
                r13.f3316t = r9
                r13.f3311o = r3
                android.os.Handler r0 = r13.f3300a
                r0.removeMessages(r10)
                android.os.Handler r0 = r13.f3300a
                r0.removeMessages(r2)
                android.os.Handler r0 = r13.f3300a
                r0.removeMessages(r7)
                goto L_0x0139
            L_0x0138:
                r14 = 0
            L_0x0139:
                int r0 = r13.f3307h
                if (r4 <= r0) goto L_0x01f1
                r13.f3312p = r3
                goto L_0x01f1
            L_0x0141:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0153
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x02bb
            L_0x0153:
                android.view.GestureDetector$OnGestureListener r2 = r13.f3301b
                android.view.MotionEvent r3 = r13.f3306g
                boolean r3 = r2.onScroll(r3, r14, r0, r1)
                r13.f3315s = r8
                r13.f3316t = r9
                goto L_0x02bb
            L_0x0161:
                r13.f3303d = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
                boolean r5 = r13.f3314r
                if (r5 == 0) goto L_0x0173
                android.view.GestureDetector$OnDoubleTapListener r1 = r13.f3302c
                boolean r14 = r1.onDoubleTapEvent(r14)
                r14 = r14 | r3
                goto L_0x01cd
            L_0x0173:
                boolean r5 = r13.f3305f
                if (r5 == 0) goto L_0x017f
                android.os.Handler r14 = r13.f3300a
                r14.removeMessages(r10)
                r13.f3305f = r3
                goto L_0x01c3
            L_0x017f:
                boolean r5 = r13.f3311o
                if (r5 == 0) goto L_0x0198
                android.view.GestureDetector$OnGestureListener r1 = r13.f3301b
                boolean r1 = r1.onSingleTapUp(r14)
                boolean r5 = r13.f3304e
                if (r5 == 0) goto L_0x0196
                android.view.GestureDetector$OnDoubleTapListener r5 = r13.f3302c
                if (r5 == 0) goto L_0x0196
                android.view.GestureDetector$OnDoubleTapListener r5 = r13.f3302c
                r5.onSingleTapConfirmed(r14)
            L_0x0196:
                r14 = r1
                goto L_0x01cd
            L_0x0198:
                android.view.VelocityTracker r5 = r13.f3320x
                int r6 = r14.getPointerId(r3)
                int r8 = r13.f3310k
                float r8 = (float) r8
                r5.computeCurrentVelocity(r1, r8)
                float r1 = r5.getYVelocity(r6)
                float r5 = r5.getXVelocity(r6)
                float r6 = java.lang.Math.abs(r1)
                int r8 = r13.f3309j
                float r8 = (float) r8
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x01c5
                float r6 = java.lang.Math.abs(r5)
                int r8 = r13.f3309j
                float r8 = (float) r8
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 <= 0) goto L_0x01c3
                goto L_0x01c5
            L_0x01c3:
                r14 = 0
                goto L_0x01cd
            L_0x01c5:
                android.view.GestureDetector$OnGestureListener r6 = r13.f3301b
                android.view.MotionEvent r8 = r13.f3306g
                boolean r14 = r6.onFling(r8, r14, r5, r1)
            L_0x01cd:
                android.view.MotionEvent r1 = r13.f3313q
                if (r1 == 0) goto L_0x01d6
                android.view.MotionEvent r1 = r13.f3313q
                r1.recycle()
            L_0x01d6:
                r13.f3313q = r0
                android.view.VelocityTracker r0 = r13.f3320x
                if (r0 == 0) goto L_0x01e3
                android.view.VelocityTracker r0 = r13.f3320x
                r0.recycle()
                r13.f3320x = r4
            L_0x01e3:
                r13.f3314r = r3
                r13.f3304e = r3
                android.os.Handler r0 = r13.f3300a
                r0.removeMessages(r2)
                android.os.Handler r0 = r13.f3300a
                r0.removeMessages(r7)
            L_0x01f1:
                r3 = r14
                goto L_0x02bb
            L_0x01f4:
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3302c
                if (r0 == 0) goto L_0x0266
                android.os.Handler r0 = r13.f3300a
                boolean r0 = r0.hasMessages(r10)
                if (r0 == 0) goto L_0x0205
                android.os.Handler r1 = r13.f3300a
                r1.removeMessages(r10)
            L_0x0205:
                android.view.MotionEvent r1 = r13.f3306g
                if (r1 == 0) goto L_0x025e
                android.view.MotionEvent r1 = r13.f3313q
                if (r1 == 0) goto L_0x025e
                if (r0 == 0) goto L_0x025e
                android.view.MotionEvent r0 = r13.f3306g
                android.view.MotionEvent r1 = r13.f3313q
                boolean r4 = r13.f3312p
                if (r4 == 0) goto L_0x0248
                long r4 = r14.getEventTime()
                long r11 = r1.getEventTime()
                long r4 = r4 - r11
                int r1 = f3299n
                long r11 = (long) r1
                int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r1 > 0) goto L_0x0248
                float r1 = r0.getX()
                int r1 = (int) r1
                float r4 = r14.getX()
                int r4 = (int) r4
                int r1 = r1 - r4
                float r0 = r0.getY()
                int r0 = (int) r0
                float r4 = r14.getY()
                int r4 = (int) r4
                int r0 = r0 - r4
                int r1 = r1 * r1
                int r0 = r0 * r0
                int r1 = r1 + r0
                int r0 = r13.f3308i
                if (r1 >= r0) goto L_0x0248
                r0 = 1
                goto L_0x0249
            L_0x0248:
                r0 = 0
            L_0x0249:
                if (r0 == 0) goto L_0x025e
                r13.f3314r = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3302c
                android.view.MotionEvent r1 = r13.f3306g
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r13.f3302c
                boolean r1 = r1.onDoubleTapEvent(r14)
                r0 = r0 | r1
                goto L_0x0267
            L_0x025e:
                android.os.Handler r0 = r13.f3300a
                int r1 = f3299n
                long r4 = (long) r1
                r0.sendEmptyMessageDelayed(r10, r4)
            L_0x0266:
                r0 = 0
            L_0x0267:
                r13.f3315s = r8
                r13.f3317u = r8
                r13.f3316t = r9
                r13.f3318v = r9
                android.view.MotionEvent r1 = r13.f3306g
                if (r1 == 0) goto L_0x0278
                android.view.MotionEvent r1 = r13.f3306g
                r1.recycle()
            L_0x0278:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                r13.f3306g = r1
                r13.f3311o = r2
                r13.f3312p = r2
                r13.f3303d = r2
                r13.f3305f = r3
                r13.f3304e = r3
                boolean r1 = r13.f3319w
                if (r1 == 0) goto L_0x02a4
                android.os.Handler r1 = r13.f3300a
                r1.removeMessages(r7)
                android.os.Handler r1 = r13.f3300a
                android.view.MotionEvent r3 = r13.f3306g
                long r3 = r3.getDownTime()
                int r5 = f3298m
                long r5 = (long) r5
                long r3 = r3 + r5
                int r5 = f3297l
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r7, r3)
            L_0x02a4:
                android.os.Handler r1 = r13.f3300a
                android.view.MotionEvent r3 = r13.f3306g
                long r3 = r3.getDownTime()
                int r5 = f3298m
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r13.f3301b
                boolean r14 = r1.onDown(r14)
                r3 = r0 | r14
            L_0x02bb:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.view.C1034d.C1036b.mo3216a(android.view.MotionEvent):boolean");
        }

        C1036b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3300a = new C1037a(handler);
            } else {
                this.f3300a = new C1037a();
            }
            this.f3301b = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo3214a((OnDoubleTapListener) onGestureListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f3301b != null) {
                this.f3319w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f3309j = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3310k = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3307h = scaledTouchSlop * scaledTouchSlop;
                this.f3308i = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }
    }

    /* renamed from: android.support.v4.view.d$c */
    static class C1038c implements C1035a {

        /* renamed from: a */
        private final GestureDetector f3322a;

        /* renamed from: a */
        public final void mo3214a(OnDoubleTapListener onDoubleTapListener) {
            this.f3322a.setOnDoubleTapListener(onDoubleTapListener);
        }

        /* renamed from: a */
        public final void mo3215a(boolean z) {
            this.f3322a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public final boolean mo3216a(MotionEvent motionEvent) {
            return this.f3322a.onTouchEvent(motionEvent);
        }

        C1038c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f3322a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public final void mo3211a(OnDoubleTapListener onDoubleTapListener) {
        this.f3296a.mo3214a(onDoubleTapListener);
    }

    /* renamed from: a */
    public final void mo3212a(boolean z) {
        this.f3296a.mo3215a(false);
    }

    /* renamed from: a */
    public final boolean mo3213a(MotionEvent motionEvent) {
        return this.f3296a.mo3216a(motionEvent);
    }

    public C1034d(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    private C1034d(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f3296a = new C1038c(context, onGestureListener, null);
        } else {
            this.f3296a = new C1036b(context, onGestureListener, null);
        }
    }
}

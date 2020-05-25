package com.p683ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.os.Message;
import android.support.p030v4.p038f.C0794k;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout */
public final class DoubleClickDiggFrameLayout extends DiggLayout implements C9382a {

    /* renamed from: e */
    private final int f93165e;

    /* renamed from: f */
    private final int f93166f;

    /* renamed from: g */
    private float f93167g;

    /* renamed from: h */
    private float f93168h;

    /* renamed from: i */
    private int f93169i;

    /* renamed from: j */
    private int f93170j;

    /* renamed from: k */
    private int f93171k;

    /* renamed from: l */
    private int f93172l;

    /* renamed from: m */
    private boolean f93173m;

    /* renamed from: n */
    private boolean f93174n;

    /* renamed from: o */
    private boolean f93175o;

    /* renamed from: p */
    private MotionEvent f93176p;

    /* renamed from: q */
    private MotionEvent f93177q;

    /* renamed from: r */
    private C9381g f93178r;

    /* renamed from: s */
    private C36389a f93179s;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout$a */
    public interface C36389a {
        /* renamed from: a */
        void mo75252a();

        /* renamed from: b */
        void mo75253b();
    }

    public final C9381g getMHandler() {
        return this.f93178r;
    }

    public final int getMSG_AUTO_CLEAN() {
        return this.f93166f;
    }

    public final int getMSG_TAP() {
        return this.f93165e;
    }

    public final void setMHandler(C9381g gVar) {
        this.f93178r = gVar;
    }

    public DoubleClickDiggFrameLayout(Context context) {
        this(context, null);
    }

    public final void setOnDiggListener(C36389a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f93179s = aVar;
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        int i = this.f93165e;
        if (num != null && num.intValue() == i) {
            C36389a aVar = this.f93179s;
            if (aVar != null) {
                aVar.mo75253b();
            }
            C9381g gVar = this.f93178r;
            if (gVar != null) {
                gVar.removeMessages(this.f93166f);
            }
        } else {
            int i2 = this.f93166f;
            if (num != null && num.intValue() == i2) {
                C9381g gVar2 = this.f93178r;
                if (gVar2 != null) {
                    gVar2.removeMessages(this.f93166f);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo75310a(MotionEvent motionEvent) {
        Message message;
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        switch (motionEvent.getAction()) {
            case 0:
                C9381g gVar = this.f93178r;
                if (gVar != null && gVar.hasMessages(this.f93165e)) {
                    C9381g gVar2 = this.f93178r;
                    if (gVar2 != null) {
                        gVar2.removeMessages(this.f93165e);
                    }
                }
                C9381g gVar3 = this.f93178r;
                if (gVar3 != null && gVar3.hasMessages(this.f93166f)) {
                    C9381g gVar4 = this.f93178r;
                    if (gVar4 != null) {
                        gVar4.removeMessages(this.f93166f);
                    }
                }
                MotionEvent motionEvent2 = this.f93176p;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f93176p = MotionEvent.obtain(motionEvent);
                this.f93175o = false;
                MotionEvent motionEvent3 = this.f93176p;
                MotionEvent motionEvent4 = this.f93177q;
                if (!(motionEvent3 == null || motionEvent4 == null || motionEvent == null || !this.f93173m)) {
                    long eventTime = motionEvent.getEventTime() - motionEvent4.getEventTime();
                    if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                        int x = ((int) motionEvent3.getX()) - ((int) motionEvent.getX());
                        int y = ((int) motionEvent3.getY()) - ((int) motionEvent.getY());
                        if ((x * x) + (y * y) < this.f93172l) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.f93175o = true;
                    MotionEvent motionEvent5 = this.f93176p;
                    if (motionEvent5 != null) {
                        mo54895a(motionEvent5.getX(), motionEvent5.getY());
                        C36389a aVar = this.f93179s;
                        if (aVar != null) {
                            aVar.mo75252a();
                        }
                    }
                }
                MotionEvent motionEvent6 = this.f93177q;
                if (motionEvent6 != null) {
                    motionEvent6.recycle();
                }
                this.f93177q = MotionEvent.obtain(motionEvent);
                this.f93174n = true;
                this.f93173m = true;
                this.f93167g = motionEvent.getX();
                this.f93168h = motionEvent.getY();
                break;
            case 1:
                if (this.f93174n && !this.f93175o) {
                    if (!(this.f93176p == null || motionEvent == null || !this.f93174n)) {
                        z = true;
                    }
                    if (z) {
                        C9381g gVar5 = this.f93178r;
                        if (gVar5 != null) {
                            C9381g gVar6 = this.f93178r;
                            if (gVar6 != null) {
                                message = gVar6.obtainMessage(this.f93165e, new C0794k(Float.valueOf(this.f93167g), Float.valueOf(this.f93168h)));
                            } else {
                                message = null;
                            }
                            long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                            MotionEvent motionEvent7 = this.f93176p;
                            if (motionEvent7 == null) {
                                C52711k.m112234a();
                            }
                            gVar5.sendMessageDelayed(message, doubleTapTimeout + motionEvent7.getEventTime());
                            break;
                        }
                    }
                }
                break;
            case 2:
                int x2 = (int) (motionEvent.getX() - this.f93167g);
                int y2 = (int) (motionEvent.getY() - this.f93168h);
                int i = (x2 * x2) + (y2 * y2);
                if (i > this.f93171k || Math.abs(x2) >= this.f93170j) {
                    this.f93174n = false;
                    C9381g gVar7 = this.f93178r;
                    if (gVar7 != null) {
                        gVar7.removeMessages(this.f93165e);
                    }
                }
                if (i > this.f93172l) {
                    this.f93173m = false;
                    break;
                }
                break;
        }
        return true;
    }

    public DoubleClickDiggFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleClickDiggFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f93166f = 1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f93169i = viewConfiguration.getScaledDoubleTapSlop();
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        C52711k.m112236a((Object) viewConfiguration2, "ViewConfiguration.get(context)");
        this.f93170j = viewConfiguration2.getScaledTouchSlop() * 3;
        this.f93171k = this.f93170j * this.f93170j;
        this.f93172l = this.f93169i * this.f93169i;
        this.f93178r = new C9381g(this);
    }
}

package com.p683ss.android.push.window.oppo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView */
public class PushWindowScrollView extends FrameLayout {

    /* renamed from: a */
    protected VelocityTracker f54090a;

    /* renamed from: b */
    protected int f54091b = -1;

    /* renamed from: c */
    boolean f54092c;

    /* renamed from: d */
    private C19642a f54093d;

    /* renamed from: e */
    private int f54094e;

    /* renamed from: f */
    private int f54095f;

    /* renamed from: g */
    private int f54096g;

    /* renamed from: h */
    private float f54097h;

    /* renamed from: i */
    private float f54098i;

    /* renamed from: j */
    private float f54099j;

    /* renamed from: k */
    private float f54100k;

    /* renamed from: l */
    private boolean f54101l;

    /* renamed from: m */
    private int f54102m;

    /* renamed from: n */
    private boolean f54103n;

    /* renamed from: o */
    private boolean f54104o;

    /* renamed from: p */
    private int f54105p;

    /* renamed from: com.ss.android.push.window.oppo.PushWindowScrollView$a */
    public interface C19642a {
        /* renamed from: a */
        void mo40952a();

        /* renamed from: a */
        void mo40953a(float f, float f2);

        /* renamed from: a */
        void mo40954a(boolean z);
    }

    /* renamed from: b */
    private void m47992b() {
        this.f54103n = true;
        this.f54104o = false;
        this.f54092c = false;
    }

    /* renamed from: c */
    private void m47993c() {
        this.f54104o = false;
        this.f54103n = false;
        this.f54101l = false;
        this.f54091b = -1;
        if (this.f54090a != null) {
            this.f54090a.recycle();
            this.f54090a = null;
        }
    }

    /* renamed from: a */
    private void m47990a() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f54094e = viewConfiguration.getScaledTouchSlop();
        this.f54095f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f54096g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f54102m = (int) (getContext().getResources().getDisplayMetrics().density * 25.0f);
    }

    public void setOnScrollListener(C19642a aVar) {
        this.f54093d = aVar;
    }

    public PushWindowScrollView(Context context) {
        super(context);
        m47990a();
    }

    /* renamed from: a */
    private void m47991a(MotionEvent motionEvent) {
        int i = this.f54091b;
        int a = m47989a(motionEvent, i);
        if (i != -1 && a != -1) {
            float x = motionEvent.getX(a);
            float abs = Math.abs(x - this.f54097h);
            float y = motionEvent.getY(a);
            float abs2 = Math.abs(y - this.f54098i);
            if (abs2 <= ((float) this.f54094e) || abs2 <= abs) {
                if (abs > ((float) this.f54094e)) {
                    this.f54101l = true;
                }
                return;
            }
            m47992b();
            this.f54097h = x;
            this.f54098i = y;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 1 || (action != 0 && this.f54101l)) {
            m47993c();
            return false;
        }
        int i = action & NormalGiftView.ALPHA_255;
        if (i == 0) {
            int actionIndex = motionEvent.getActionIndex();
            this.f54091b = motionEvent.getPointerId(actionIndex);
            if (this.f54091b != -1) {
                float x = motionEvent.getX(actionIndex);
                this.f54100k = x;
                this.f54097h = x;
                float y = motionEvent.getY(actionIndex);
                this.f54098i = y;
                this.f54099j = y;
                this.f54103n = false;
                this.f54101l = false;
            }
        } else if (i == 2) {
            int a = m47989a(motionEvent, this.f54091b);
            if (this.f54091b != -1) {
                motionEvent.getY(a);
                m47991a(motionEvent);
            }
        }
        if (!this.f54103n) {
            if (this.f54090a == null) {
                this.f54090a = VelocityTracker.obtain();
            }
            this.f54090a.addMovement(motionEvent);
        }
        if (this.f54103n || this.f54104o) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f54090a == null) {
            this.f54090a = VelocityTracker.obtain();
        }
        this.f54090a.addMovement(motionEvent);
        switch (motionEvent.getAction() & NormalGiftView.ALPHA_255) {
            case 0:
                this.f54091b = motionEvent.getPointerId(motionEvent.getActionIndex());
                float y = motionEvent.getY();
                this.f54099j = y;
                this.f54098i = y;
                float x = motionEvent.getX();
                this.f54100k = x;
                this.f54097h = x;
                break;
            case 1:
            case 3:
                if (this.f54103n) {
                    VelocityTracker velocityTracker = this.f54090a;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f54096g);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.f54091b);
                    int a = m47989a(motionEvent, this.f54091b);
                    if (this.f54091b != -1) {
                        int y2 = (int) (motionEvent.getY(a) - this.f54099j);
                        if (Math.abs(y2) <= this.f54102m || Math.abs(yVelocity) <= this.f54095f) {
                            if (this.f54093d != null) {
                                this.f54093d.mo40952a();
                            }
                        } else if (yVelocity <= 0 || y2 <= 0) {
                            if (yVelocity >= 0 || y2 >= 0) {
                                if (this.f54093d != null) {
                                    this.f54093d.mo40952a();
                                }
                            } else if (this.f54093d != null) {
                                this.f54093d.mo40954a(true);
                            }
                        } else if (this.f54093d != null) {
                            this.f54093d.mo40954a(false);
                        }
                    }
                    this.f54091b = -1;
                    m47993c();
                    break;
                }
                break;
            case 2:
                if (!this.f54103n) {
                    m47991a(motionEvent);
                    if (this.f54101l) {
                        return false;
                    }
                }
                if (this.f54103n) {
                    int a2 = m47989a(motionEvent, this.f54091b);
                    if (this.f54091b != -1) {
                        float y3 = motionEvent.getY(a2);
                        float f = this.f54098i - y3;
                        this.f54098i = y3;
                        float f2 = ((float) this.f54105p) + f;
                        int i = (int) f2;
                        this.f54097h += f2 - ((float) i);
                        this.f54105p = i;
                        if (this.f54093d != null) {
                            this.f54093d.mo40953a(0.0f, f);
                            break;
                        }
                    }
                }
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f54098i = motionEvent.getY(actionIndex);
                this.f54097h = motionEvent.getX(actionIndex);
                this.f54091b = motionEvent.getPointerId(actionIndex);
                break;
            case 6:
                int a3 = m47989a(motionEvent, this.f54091b);
                if (this.f54091b != -1) {
                    this.f54098i = motionEvent.getY(a3);
                    this.f54097h = motionEvent.getX(a3);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m47989a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.f54091b = -1;
        }
        return findPointerIndex;
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47990a();
    }

    public PushWindowScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m47990a();
    }
}

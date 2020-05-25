package com.bytedance.jirafast.p752ui;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.jirafast.p751d.C12048o;

/* renamed from: com.bytedance.jirafast.ui.e */
public final class C12098e extends FrameLayout {

    /* renamed from: m */
    static C12098e f32003m;

    /* renamed from: a */
    final Handler f32004a;

    /* renamed from: b */
    int f32005b;

    /* renamed from: c */
    int f32006c;

    /* renamed from: d */
    WindowManager f32007d;

    /* renamed from: e */
    LayoutParams f32008e;

    /* renamed from: f */
    public int f32009f;

    /* renamed from: g */
    public int f32010g;

    /* renamed from: h */
    public int f32011h;

    /* renamed from: i */
    public int f32012i;

    /* renamed from: j */
    View f32013j;

    /* renamed from: k */
    View f32014k;

    /* renamed from: l */
    View f32015l;

    /* renamed from: n */
    private final int f32016n;

    /* renamed from: o */
    private float f32017o;

    /* renamed from: p */
    private float f32018p;

    /* renamed from: q */
    private float f32019q;

    /* renamed from: r */
    private float f32020r;

    /* renamed from: s */
    private float f32021s;

    /* renamed from: t */
    private float f32022t;

    /* renamed from: u */
    private float f32023u;

    /* renamed from: v */
    private float f32024v;

    /* renamed from: w */
    private long f32025w;

    /* renamed from: x */
    private long f32026x;

    /* renamed from: y */
    private TextView f32027y;

    /* renamed from: a */
    public static boolean m24527a() {
        if (f32003m != null) {
            return true;
        }
        return false;
    }

    public final void setTitle(String str) {
        if (this.f32027y != null) {
            this.f32027y.setText(str);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        if ((this.f32013j.getVisibility() != 0 && this.f32015l.getVisibility() != 0) || getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        this.f32019q = motionEvent.getRawX();
        this.f32020r = motionEvent.getRawY() - ((float) this.f32016n);
        int i4 = 0;
        switch (motionEvent.getAction()) {
            case 0:
                this.f32017o = motionEvent.getX();
                this.f32018p = motionEvent.getY();
                this.f32023u = motionEvent.getRawX();
                this.f32024v = motionEvent.getRawY();
                this.f32025w = System.currentTimeMillis();
                break;
            case 1:
                this.f32021s = motionEvent.getRawX();
                this.f32022t = motionEvent.getRawY();
                this.f32026x = System.currentTimeMillis();
                if (this.f32026x - this.f32025w < 500 && ((double) Math.abs(this.f32023u - this.f32021s)) < 20.0d && ((double) Math.abs(this.f32024v - this.f32022t)) < 20.0d && this.f32013j.getVisibility() == 0) {
                    this.f32014k.setVisibility(0);
                    this.f32013j.setVisibility(8);
                    this.f32015l.setVisibility(8);
                    this.f32008e.width = (int) C12048o.m24503a(getContext(), 212.0f);
                    this.f32008e.height = (int) C12048o.m24503a(getContext(), 84.0f);
                    if (this.f32011h > this.f32005b / 2) {
                        this.f32008e.x = this.f32011h - (this.f32008e.width / 2);
                    }
                    this.f32008e.y = (this.f32012i + (((int) C12048o.m24503a(getContext(), 50.0f)) / 2)) - (this.f32008e.height / 2);
                    this.f32007d.updateViewLayout(this, this.f32008e);
                    this.f32004a.removeCallbacksAndMessages(null);
                    this.f32004a.postDelayed(new Runnable() {
                        public final void run() {
                            C12098e eVar = C12098e.this;
                            eVar.f32008e.x = eVar.f32011h;
                            eVar.f32008e.y = eVar.f32012i;
                            eVar.f32014k.setVisibility(8);
                            eVar.f32013j.setVisibility(0);
                            eVar.f32015l.setVisibility(8);
                            eVar.f32008e.width = (int) C12048o.m24503a(eVar.getContext(), 40.0f);
                            eVar.f32008e.height = (int) C12048o.m24503a(eVar.getContext(), 40.0f);
                            eVar.f32007d.updateViewLayout(eVar, eVar.f32008e);
                            eVar.f32004a.removeCallbacksAndMessages(null);
                        }
                    }, 4000);
                    break;
                }
            case 2:
                this.f32008e.x = (int) (this.f32019q - this.f32017o);
                LayoutParams layoutParams = this.f32008e;
                if (this.f32008e.x < 0) {
                    i = 0;
                } else {
                    i = this.f32008e.x;
                }
                layoutParams.x = i;
                LayoutParams layoutParams2 = this.f32008e;
                if (this.f32008e.x > this.f32005b - this.f32010g) {
                    i2 = this.f32005b - this.f32010g;
                } else {
                    i2 = this.f32008e.x;
                }
                layoutParams2.x = i2;
                this.f32008e.y = (int) (this.f32020r - this.f32018p);
                LayoutParams layoutParams3 = this.f32008e;
                if (this.f32008e.y >= 0) {
                    i4 = this.f32008e.y;
                }
                layoutParams3.y = i4;
                LayoutParams layoutParams4 = this.f32008e;
                if (this.f32008e.y > this.f32006c - this.f32009f) {
                    i3 = this.f32006c - this.f32009f;
                } else {
                    i3 = this.f32008e.y;
                }
                layoutParams4.y = i3;
                this.f32011h = this.f32008e.x;
                this.f32012i = this.f32008e.y;
                this.f32007d.updateViewLayout(this, this.f32008e);
                break;
        }
        return true;
    }
}

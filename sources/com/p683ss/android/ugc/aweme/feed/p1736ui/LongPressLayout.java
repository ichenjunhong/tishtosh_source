package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30461n;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout */
public class LongPressLayout extends View {

    /* renamed from: a */
    public float f80447a;

    /* renamed from: b */
    public float f80448b;

    /* renamed from: c */
    public boolean f80449c;

    /* renamed from: d */
    public boolean f80450d;

    /* renamed from: e */
    public C30722a f80451e;

    /* renamed from: f */
    public long f80452f;

    /* renamed from: g */
    OnClickListener f80453g;

    /* renamed from: h */
    OnClickListener f80454h;

    /* renamed from: i */
    boolean f80455i;

    /* renamed from: j */
    public C30461n f80456j;

    /* renamed from: k */
    private Context f80457k;

    /* renamed from: l */
    private float f80458l;

    /* renamed from: m */
    private float f80459m;

    /* renamed from: n */
    private int f80460n;

    /* renamed from: o */
    private int f80461o;

    /* renamed from: p */
    private OnTouchListener f80462p;

    /* renamed from: q */
    private Runnable f80463q;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LongPressLayout$a */
    public interface C30722a {
        /* renamed from: a */
        void mo60340a(float f, float f2);
    }

    public C30461n getInterceptListener() {
        return this.f80456j;
    }

    public int getTimeInterval() {
        return this.f80461o;
    }

    public void setInLongPressMode(boolean z) {
        this.f80449c = z;
    }

    public void setInterceptListener(C30461n nVar) {
        this.f80456j = nVar;
    }

    public void setListener(C30722a aVar) {
        this.f80451e = aVar;
    }

    public void setScrollMode(boolean z) {
        this.f80450d = z;
    }

    public void setTapListener(OnTouchListener onTouchListener) {
        this.f80462p = onTouchListener;
    }

    public void setTimeInterval(int i) {
        this.f80461o = i;
    }

    public LongPressLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setDisabilityOnClickListener(OnClickListener onClickListener) {
        this.f80454h = onClickListener;
        super.setOnClickListener(new C30793bg(this));
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        if (this.f80454h == null) {
            super.setOnClickListener(onClickListener);
        }
        this.f80453g = onClickListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f80455i = true;
        switch (motionEvent.getAction()) {
            case 0:
                this.f80447a = motionEvent.getX();
                this.f80448b = motionEvent.getY();
                this.f80452f = SystemClock.elapsedRealtime();
                C18842a.m45933a(this.f80463q, this.f80461o);
                if (this.f80462p != null) {
                    this.f80462p.onTouch(this, motionEvent);
                    break;
                }
                break;
            case 1:
            case 3:
                C18842a.m45935c(this.f80463q);
                if (SystemClock.elapsedRealtime() - this.f80452f < ((long) this.f80461o) && this.f80462p != null) {
                    this.f80462p.onTouch(this, motionEvent);
                    break;
                }
            case 2:
                this.f80458l = motionEvent.getX();
                this.f80459m = motionEvent.getY();
                float abs = Math.abs(this.f80447a - this.f80458l);
                float abs2 = Math.abs(this.f80448b - this.f80459m);
                if (abs > ((float) this.f80460n) || abs2 > ((float) this.f80460n)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C18842a.m45935c(this.f80463q);
                }
                if (this.f80462p != null) {
                    this.f80462p.onTouch(this, motionEvent);
                    break;
                }
                break;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public LongPressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LongPressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f80460n = -1;
        this.f80461o = 500;
        this.f80463q = new Runnable() {
            public final void run() {
                if (LongPressLayout.this.f80451e != null) {
                    ViewParent parent = LongPressLayout.this.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (LongPressLayout.this.f80456j == null || LongPressLayout.this.f80456j.mo60882a()) {
                        LongPressLayout.this.f80451e.mo60340a(LongPressLayout.this.f80447a, LongPressLayout.this.f80448b);
                    }
                }
            }
        };
        this.f80457k = context;
        this.f80460n = ViewConfiguration.get(this.f80457k).getScaledTouchSlop();
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
    }
}

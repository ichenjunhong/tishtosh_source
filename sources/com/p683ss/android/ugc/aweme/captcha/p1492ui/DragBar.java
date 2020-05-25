package com.p683ss.android.ugc.aweme.captcha.p1492ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.captcha.ui.DragBar */
public class DragBar extends FrameLayout {

    /* renamed from: a */
    public C24506a f64898a;

    /* renamed from: b */
    public ImageView f64899b;

    /* renamed from: c */
    public boolean f64900c = true;

    /* renamed from: d */
    public boolean f64901d;

    /* renamed from: com.ss.android.ugc.aweme.captcha.ui.DragBar$a */
    public interface C24506a {
        /* renamed from: a */
        void mo50272a();

        /* renamed from: a */
        void mo50273a(float f);

        /* renamed from: b */
        void mo50274b(float f);
    }

    /* renamed from: a */
    public final void mo50267a() {
        setDragViewTranslationX(0.0f);
        this.f64901d = false;
    }

    public void setCanDragged(boolean z) {
        this.f64900c = z;
    }

    public void setOnDragListener(C24506a aVar) {
        this.f64898a = aVar;
    }

    public DragBar(Context context) {
        super(context);
        m59901a(context);
    }

    /* renamed from: a */
    private void m59901a(Context context) {
        this.f64899b = (ImageView) LayoutInflater.from(context).inflate(R.layout.bkr, this, true).findViewById(R.id.b06);
        this.f64899b.setOnTouchListener(new OnTouchListener() {

            /* renamed from: a */
            float f64902a;

            /* renamed from: b */
            float f64903b;

            /* renamed from: c */
            float f64904c;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!DragBar.this.f64900c) {
                    return false;
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        if (DragBar.this.f64898a != null) {
                            DragBar.this.f64898a.mo50272a();
                        }
                        this.f64902a = motionEvent.getRawX();
                        this.f64903b = 0.0f;
                        return true;
                    case 1:
                        DragBar.this.setCanDragged(false);
                        if (DragBar.this.f64898a != null && !DragBar.this.f64901d) {
                            DragBar.this.f64901d = true;
                            int measuredWidth = DragBar.this.getMeasuredWidth() - DragBar.this.f64899b.getMeasuredWidth();
                            this.f64903b = Math.max(this.f64903b, 0.0f);
                            float f = (float) measuredWidth;
                            this.f64903b = Math.min(this.f64903b, f);
                            DragBar.this.f64899b.setTranslationX(this.f64903b);
                            if (measuredWidth != 0) {
                                DragBar.this.f64898a.mo50274b(this.f64903b / f);
                            }
                        }
                        this.f64902a = 0.0f;
                        this.f64903b = 0.0f;
                        return true;
                    case 2:
                        this.f64903b = motionEvent.getRawX() - this.f64902a;
                        DragBar.this.setDragViewTranslationX(this.f64903b);
                        this.f64904c = this.f64903b;
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    public void setDragViewTranslationX(float f) {
        int measuredWidth = getMeasuredWidth() - this.f64899b.getMeasuredWidth();
        float f2 = (float) measuredWidth;
        float min = Math.min(Math.max(f, 0.0f), f2);
        this.f64899b.setTranslationX(min);
        if (this.f64898a != null && measuredWidth != 0) {
            this.f64898a.mo50273a(min / f2);
        }
    }

    public DragBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m59901a(context);
    }

    public DragBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m59901a(context);
    }
}

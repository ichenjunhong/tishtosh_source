package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1051p;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a */
    Drawable f1494a;

    /* renamed from: b */
    Rect f1495b;

    /* renamed from: c */
    private Rect f1496c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1126a(C1018ac acVar) {
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1494a != null) {
            this.f1494a.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1494a != null) {
            this.f1494a.setCallback(null);
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1495b != null && this.f1494a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.f1496c.set(0, 0, width, this.f1495b.top);
            this.f1494a.setBounds(this.f1496c);
            this.f1494a.draw(canvas);
            this.f1496c.set(0, height - this.f1495b.bottom, width, height);
            this.f1494a.setBounds(this.f1496c);
            this.f1494a.draw(canvas);
            this.f1496c.set(0, this.f1495b.top, this.f1495b.left, height - this.f1495b.bottom);
            this.f1494a.setBounds(this.f1496c);
            this.f1494a.draw(canvas);
            this.f1496c.set(width - this.f1495b.right, this.f1495b.top, width, height - this.f1495b.bottom);
            this.f1494a.setBounds(this.f1496c);
            this.f1494a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1496c = new Rect();
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray a = C0456f.m1107a(context2, attributeSet2, new int[]{R.attr.ot}, i, R.style.r2, new int[0]);
        this.f1494a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        C1056u.m3032a((View) this, (C1051p) new C1051p() {
            /* renamed from: a */
            public final C1018ac mo1130a(View view, C1018ac acVar) {
                boolean z;
                if (ScrimInsetsFrameLayout.this.f1495b == null) {
                    ScrimInsetsFrameLayout.this.f1495b = new Rect();
                }
                ScrimInsetsFrameLayout.this.f1495b.set(acVar.mo3184a(), acVar.mo3186b(), acVar.mo3187c(), acVar.mo3188d());
                ScrimInsetsFrameLayout.this.mo1126a(acVar);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
                boolean z2 = false;
                if (VERSION.SDK_INT >= 20) {
                    z = ((WindowInsets) acVar.f3271a).hasSystemWindowInsets();
                } else {
                    z = false;
                }
                if (!z || ScrimInsetsFrameLayout.this.f1494a == null) {
                    z2 = true;
                }
                scrimInsetsFrameLayout.setWillNotDraw(z2);
                C1056u.m3052d(ScrimInsetsFrameLayout.this);
                if (VERSION.SDK_INT >= 20) {
                    return new C1018ac((Object) ((WindowInsets) acVar.f3271a).consumeSystemWindowInsets());
                }
                return null;
            }
        });
    }
}

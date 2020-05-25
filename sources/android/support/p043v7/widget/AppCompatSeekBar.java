package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatSeekBar */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    private final C1490l f4470a;

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C1490l lVar = this.f4470a;
        if (lVar.f5363c != null) {
            lVar.f5363c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1490l lVar = this.f4470a;
        Drawable drawable = lVar.f5363c;
        if (drawable != null && drawable.isStateful() && drawable.setState(lVar.f5362b.getDrawableState())) {
            lVar.f5362b.invalidateDrawable(drawable);
        }
    }

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C1490l lVar = this.f4470a;
        if (lVar.f5363c != null) {
            int max = lVar.f5362b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = lVar.f5363c.getIntrinsicWidth();
                int intrinsicHeight = lVar.f5363c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                lVar.f5363c.setBounds(-i, -i2, i, i2);
                float width = ((float) ((lVar.f5362b.getWidth() - lVar.f5362b.getPaddingLeft()) - lVar.f5362b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) lVar.f5362b.getPaddingLeft(), (float) (lVar.f5362b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    lVar.f5363c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a1c);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4470a = new C1490l(this);
        this.f4470a.mo5787a(attributeSet, i);
    }
}

package android.support.constraint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.constraint.c */
public final class C0362c extends View {

    /* renamed from: a */
    int f1219a;

    /* renamed from: b */
    View f1220b;

    /* renamed from: c */
    int f1221c;

    public final View getContent() {
        return this.f1220b;
    }

    public final int getEmptyVisibility() {
        return this.f1221c;
    }

    public final void setEmptyVisibility(int i) {
        this.f1221c = i;
    }

    public final void setContentId(int i) {
        if (this.f1219a != i) {
            if (this.f1220b != null) {
                this.f1220b.setVisibility(0);
                ((LayoutParams) this.f1220b.getLayoutParams()).f845aa = false;
                this.f1220b = null;
            }
            this.f1219a = i;
            if (i != -1) {
                View findViewById = ((View) getParent()).findViewById(i);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(NormalGiftView.ALPHA_255, 210, 210, 210);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Align.LEFT);
            String str = "?";
            paint.getTextBounds(str, 0, str.length(), rect);
            canvas.drawText(str, ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }
}

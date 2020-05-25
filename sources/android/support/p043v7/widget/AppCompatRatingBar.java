package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatRatingBar */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a */
    private final C1489k f4469a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xw);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f4469a.f5360a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4469a = new C1489k(this);
        this.f4469a.mo5787a(attributeSet, i);
    }
}

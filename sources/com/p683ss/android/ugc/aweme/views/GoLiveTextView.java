package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.GoLiveTextView */
public class GoLiveTextView extends DmtTextView {

    /* renamed from: b */
    private Path f121126b;

    public GoLiveTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private int m104379a(float f) {
        return (int) ((getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.f121126b == null) {
            this.f121126b = new Path();
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        this.f121126b.lineTo(0.0f, (float) getHeight());
        this.f121126b.lineTo((float) (getWidth() - m104379a(10.0f)), (float) getHeight());
        this.f121126b.lineTo((float) getWidth(), (float) (getHeight() / 2));
        this.f121126b.lineTo((float) (getWidth() - m104379a(10.0f)), 0.0f);
        this.f121126b.lineTo(0.0f, 0.0f);
        this.f121126b.close();
        Paint paint = new Paint(1);
        paint.setColor(-16711936);
        canvas2.drawPath(this.f121126b, paint);
        if (C47918gj.m103682a(getContext())) {
            Matrix matrix = new Matrix();
            matrix.postScale(-1.0f, 1.0f);
            createBitmap = Bitmap.createBitmap(createBitmap, 0, 0, getWidth(), getHeight(), matrix, true);
        }
        Drawable drawable = getResources().getDrawable(R.drawable.lf);
        Bitmap createBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        Canvas canvas3 = new Canvas(createBitmap2);
        drawable.setBounds(0, 0, canvas3.getWidth(), canvas3.getHeight());
        drawable.draw(canvas3);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Style.FILL);
        paint2.setColor(-16711936);
        paint2.setFilterBitmap(true);
        if (VERSION.SDK_INT < 19) {
            setLayerType(1, null);
        } else {
            setLayerType(2, paint2);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        paint2.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint2);
        if (createBitmap2 != null && !createBitmap2.isRecycled()) {
            createBitmap2.recycle();
        }
        if (createBitmap != null && !createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        super.onDraw(canvas);
    }

    public GoLiveTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GoLiveTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

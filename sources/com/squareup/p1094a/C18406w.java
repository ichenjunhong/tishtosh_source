package com.squareup.p1094a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.squareup.p1094a.C18396v.C18402d;

/* renamed from: com.squareup.a.w */
final class C18406w extends BitmapDrawable {

    /* renamed from: e */
    private static final Paint f50829e = new Paint();

    /* renamed from: a */
    Drawable f50830a;

    /* renamed from: b */
    long f50831b;

    /* renamed from: c */
    boolean f50832c;

    /* renamed from: d */
    int f50833d = NormalGiftView.ALPHA_255;

    /* renamed from: f */
    private final boolean f50834f;

    /* renamed from: g */
    private final float f50835g;

    /* renamed from: h */
    private final C18402d f50836h;

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f50830a != null) {
            this.f50830a.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.f50833d = i;
        if (this.f50830a != null) {
            this.f50830a.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f50830a != null) {
            this.f50830a.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (!this.f50832c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f50831b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f50832c = false;
                this.f50830a = null;
                super.draw(canvas);
            } else {
                if (this.f50830a != null) {
                    this.f50830a.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f50833d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f50833d);
                if (VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.f50834f) {
            f50829e.setColor(-1);
            canvas.drawPath(m44686a(new Point(0, 0), (int) (this.f50835g * 16.0f)), f50829e);
            f50829e.setColor(this.f50836h.f50826a);
            canvas.drawPath(m44686a(new Point(0, 0), (int) (this.f50835g * 15.0f)), f50829e);
        }
    }

    /* renamed from: a */
    private static Path m44686a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: a */
    static void m44688a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    static void m44687a(ImageView imageView, Context context, Bitmap bitmap, C18402d dVar, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        C18406w wVar = new C18406w(context, bitmap, drawable, dVar, z, z2);
        imageView.setImageDrawable(wVar);
    }

    private C18406w(Context context, Bitmap bitmap, Drawable drawable, C18402d dVar, boolean z, boolean z2) {
        boolean z3;
        super(context.getResources(), bitmap);
        this.f50834f = z2;
        this.f50835g = context.getResources().getDisplayMetrics().density;
        this.f50836h = dVar;
        if (dVar == C18402d.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f50830a = drawable;
            this.f50832c = true;
            this.f50831b = SystemClock.uptimeMillis();
        }
    }
}

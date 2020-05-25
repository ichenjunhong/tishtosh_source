package android.support.p043v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.p030v4.graphics.drawable.C0815f;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.k */
class C1489k {

    /* renamed from: b */
    private static final int[] f5359b = {16843067, 16843068};

    /* renamed from: a */
    public Bitmap f5360a;

    /* renamed from: c */
    private final ProgressBar f5361c;

    C1489k(ProgressBar progressBar) {
        this.f5361c = progressBar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5787a(AttributeSet attributeSet, int i) {
        C1451bb a = C1451bb.m5032a(this.f5361c.getContext(), attributeSet, f5359b, i, 0);
        Drawable b = a.mo5656b(0);
        if (b != 0) {
            ProgressBar progressBar = this.f5361c;
            if (b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m5235a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b);
        }
        Drawable b2 = a.mo5656b(1);
        if (b2 != null) {
            this.f5361c.setProgressDrawable(m5235a(b2, false));
        }
        a.mo5653a();
    }

    /* renamed from: a */
    private Drawable m5235a(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof C0815f) {
            C0815f fVar = (C0815f) drawable;
            Drawable a = fVar.mo2623a();
            if (a != null) {
                fVar.mo2624a(m5235a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = m5235a(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f5360a == null) {
                this.f5360a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}

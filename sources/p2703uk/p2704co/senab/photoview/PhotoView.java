package p2703uk.p2704co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import p2703uk.p2704co.senab.photoview.C53894b.C53898c;
import p2703uk.p2704co.senab.photoview.C53894b.C53899d;
import p2703uk.p2704co.senab.photoview.C53894b.C53900e;

/* renamed from: uk.co.senab.photoview.PhotoView */
public class PhotoView extends ImageView {

    /* renamed from: a */
    private final C53894b f133520a;

    /* renamed from: b */
    private ScaleType f133521b;

    public Matrix getDisplayMatrix() {
        return this.f133520a.mo113994f();
    }

    public RectF getDisplayRect() {
        return this.f133520a.mo113990b();
    }

    public float getMaxScale() {
        return getMaximumScale();
    }

    public float getMaximumScale() {
        return this.f133520a.f133539e;
    }

    public float getMediumScale() {
        return this.f133520a.f133538d;
    }

    public float getMidScale() {
        return getMediumScale();
    }

    public float getMinScale() {
        return getMinimumScale();
    }

    public float getMinimumScale() {
        return this.f133520a.f133537c;
    }

    public float getScale() {
        return this.f133520a.mo113992d();
    }

    public ScaleType getScaleType() {
        return this.f133520a.f133546l;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f133520a.mo113986a();
        super.onDetachedFromWindow();
    }

    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    public void setMidScale(float f) {
        setMediumScale(f);
    }

    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f133520a.f133540f = z;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f133520a.f133545k = onLongClickListener;
    }

    public void setOnMatrixChangeListener(C53898c cVar) {
        this.f133520a.f133542h = cVar;
    }

    public void setOnPhotoTapListener(C53899d dVar) {
        this.f133520a.f133543i = dVar;
    }

    public void setOnViewTapListener(C53900e eVar) {
        this.f133520a.f133544j = eVar;
    }

    public void setZoomable(boolean z) {
        this.f133520a.mo113989a(z);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f133520a != null) {
            this.f133520a.mo113993e();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.f133520a != null) {
            this.f133520a.mo113993e();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f133520a != null) {
            this.f133520a.mo113993e();
        }
    }

    public void setMaximumScale(float f) {
        C53894b bVar = this.f133520a;
        C53894b.m114571a(bVar.f133537c, bVar.f133538d, f);
        bVar.f133539e = f;
    }

    public void setMediumScale(float f) {
        C53894b bVar = this.f133520a;
        C53894b.m114571a(bVar.f133537c, f, bVar.f133539e);
        bVar.f133538d = f;
    }

    public void setMinimumScale(float f) {
        C53894b bVar = this.f133520a;
        C53894b.m114571a(f, bVar.f133538d, bVar.f133539e);
        bVar.f133537c = f;
    }

    public void setPhotoViewRotation(float f) {
        C53894b bVar = this.f133520a;
        float f2 = f % 360.0f;
        bVar.f133541g.postRotate(bVar.f133547m - f2);
        bVar.f133547m = f2;
        bVar.mo113995g();
    }

    public void setScale(float f) {
        C53894b bVar = this.f133520a;
        ImageView c = bVar.mo113991c();
        if (c != null) {
            bVar.mo113987a(f, (float) (c.getRight() / 2), (float) (c.getBottom() / 2), false);
        }
    }

    public void setScaleType(ScaleType scaleType) {
        boolean z;
        if (this.f133520a != null) {
            C53894b bVar = this.f133520a;
            if (scaleType == null) {
                z = false;
            } else if (C53894b.m114577h()[scaleType.ordinal()] != 8) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(scaleType.name()));
                sb.append(" is not supported in PhotoView");
                throw new IllegalArgumentException(sb.toString());
            }
            if (z && scaleType != bVar.f133546l) {
                bVar.f133546l = scaleType;
                bVar.mo113993e();
            }
            return;
        }
        this.f133521b = scaleType;
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ScaleType.MATRIX);
        this.f133520a = new C53894b(this);
        if (this.f133521b != null) {
            setScaleType(this.f133521b);
            this.f133521b = null;
        }
    }
}

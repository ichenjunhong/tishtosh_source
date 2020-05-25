package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.widget.C1118q;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.AppCompatImageView */
public class AppCompatImageView extends ImageView implements C1054s, C1118q {

    /* renamed from: a */
    private final C1478e f4462a;

    /* renamed from: b */
    private final C1487i f4463b;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4462a != null) {
            return this.f4462a.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4462a != null) {
            return this.f4462a.mo5763b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f4463b != null) {
            return this.f4463b.mo5781b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        if (this.f4463b != null) {
            return this.f4463b.mo5782c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4462a != null) {
            this.f4462a.mo5764c();
        }
        if (this.f4463b != null) {
            this.f4463b.mo5783d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f4463b.mo5780a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4462a != null) {
            this.f4462a.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4462a != null) {
            this.f4462a.mo5758a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f4463b != null) {
            this.f4463b.mo5783d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f4463b != null) {
            this.f4463b.mo5783d();
        }
    }

    public void setImageResource(int i) {
        if (this.f4463b != null) {
            this.f4463b.mo5776a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f4463b != null) {
            this.f4463b.mo5783d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4462a != null) {
            this.f4462a.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4462a != null) {
            this.f4462a.mo5760a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f4463b != null) {
            this.f4463b.mo5777a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f4463b != null) {
            this.f4463b.mo5778a(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.f4462a = new C1478e(this);
        this.f4462a.mo5762a(attributeSet, i);
        this.f4463b = new C1487i(this);
        this.f4463b.mo5779a(attributeSet, i);
    }
}

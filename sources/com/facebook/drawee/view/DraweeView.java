package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13685h.C13687a;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.drawee.view.C13846a.C13847a;
import com.facebook.imagepipeline.p976p.C14237b;

public class DraweeView<DH extends C13843b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio = 0.0f;
    private C13848b<DH> mDraweeHolder;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;
    private final C13847a mMeasureSpec = new C13847a();

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    /* access modifiers changed from: protected */
    public void onAttach() {
        doAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetach() {
        doDetach();
    }

    /* access modifiers changed from: protected */
    public void doAttach() {
        this.mDraweeHolder.mo25982b();
    }

    /* access modifiers changed from: protected */
    public void doDetach() {
        this.mDraweeHolder.mo25983c();
    }

    public C13842a getController() {
        return this.mDraweeHolder.f36129c;
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.mo25984d();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.mo25985e();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.f36129c != null) {
            return true;
        }
        return false;
    }

    public boolean hasHierarchy() {
        if (this.mDraweeHolder.f36128b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    private void maybeOverrideVisibilityHandling() {
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public String toString() {
        String str;
        C13687a a = C13685h.m27644a(this);
        String str2 = "holder";
        if (this.mDraweeHolder != null) {
            str = this.mDraweeHolder.toString();
        } else {
            str = "<no holder set>";
        }
        return a.mo25581a(str2, (Object) str).toString();
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.mo25981a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        if (f != this.mAspectRatio) {
            this.mAspectRatio = f;
            requestLayout();
        }
    }

    public void setController(C13842a aVar) {
        this.mDraweeHolder.mo25979a(aVar);
        super.setImageDrawable(this.mDraweeHolder.mo25985e());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.mo25980a(dh);
        super.setImageDrawable(this.mDraweeHolder.mo25985e());
    }

    public DraweeView(Context context) {
        super(context);
        init(context);
    }

    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.mo25979a((C13842a) null);
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.mo25979a((C13842a) null);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.mo25979a((C13842a) null);
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.mo25979a((C13842a) null);
        super.setImageURI(uri);
    }

    private void init(Context context) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("DraweeView#init");
            }
            if (!this.mInitialised) {
                boolean z = true;
                this.mInitialised = true;
                this.mDraweeHolder = C13848b.m28154a(null, context);
                if (VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList == null) {
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                        return;
                    }
                    setColorFilter(imageTintList.getDefaultColor());
                }
                if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.mLegacyVisibilityHandlingEnabled = z;
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
            }
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.mMeasureSpec.f36125a = i;
        this.mMeasureSpec.f36126b = i2;
        C13847a aVar = this.mMeasureSpec;
        float f = this.mAspectRatio;
        LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f > 0.0f && layoutParams != null) {
            if (C13846a.m28153a(layoutParams.height)) {
                aVar.f36126b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f36125a) - paddingLeft)) / f) + ((float) paddingTop)), aVar.f36126b), 1073741824);
            } else if (C13846a.m28153a(layoutParams.width)) {
                aVar.f36125a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f36126b) - paddingTop)) * f) + ((float) paddingLeft)), aVar.f36125a), 1073741824);
            }
        }
        super.onMeasure(this.mMeasureSpec.f36125a, this.mMeasureSpec.f36126b);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}

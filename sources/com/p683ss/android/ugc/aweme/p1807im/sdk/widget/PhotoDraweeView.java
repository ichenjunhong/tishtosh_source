package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView.ScaleType;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.C13848b;
import p2703uk.p2704co.senab.photoview.PhotoView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView */
public class PhotoDraweeView extends PhotoView {

    /* renamed from: a */
    public C13848b<C13833a> f90856a;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f90856a.mo25982b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f90856a.mo25983c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f90856a.mo25982b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f90856a.mo25983c();
    }

    public PhotoDraweeView(Context context) {
        this(context, null);
    }

    public void setProgressBarImage(Drawable drawable) {
        ((C13833a) this.f90856a.mo25984d()).mo25891a(3, drawable);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f90856a.mo25981a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == ((C13833a) this.f90856a.mo25984d()).mo25888a()) {
            return true;
        }
        return false;
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.f90856a == null) {
            this.f90856a = C13848b.m28154a(new C13834b(getResources()).mo25912a(), context);
        }
        setScaleType(ScaleType.CENTER_CROP);
    }
}

package com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.p1147d.p1148a.C18928a;
import com.p683ss.android.p1147d.p1148a.C18929b;
import com.p683ss.android.p1147d.p1148a.C18931d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.PhotoDraweeView */
public class PhotoDraweeView extends SimpleDraweeView {

    /* renamed from: a */
    private C35415a f91054a;

    /* renamed from: b */
    private boolean f91055b;

    public float getMaximumScale() {
        return this.f91054a.mo73721e();
    }

    public float getMediumScale() {
        return this.f91054a.mo73720d();
    }

    public float getMinimumScale() {
        return this.f91054a.mo73719c();
    }

    public C18928a getOnPhotoTapListener() {
        return this.f91054a.mo73723g();
    }

    public C18931d getOnViewTapListener() {
        return this.f91054a.mo73724h();
    }

    public float getScale() {
        return this.f91054a.mo73722f();
    }

    public void onAttachedToWindow() {
        m80053c();
        this.f91055b = true;
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f91055b = false;
        this.f91054a.mo73727k();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m80053c() {
        if (this.f91054a == null || this.f91054a.mo73718b() == null) {
            this.f91054a = new C35415a(this);
        }
    }

    /* renamed from: a */
    public final boolean mo73696a() {
        if (!this.f91055b) {
            return false;
        }
        RectF a = this.f91054a.mo73716a(this.f91054a.f91063h);
        if (a == null) {
            return false;
        }
        float height = (float) getHeight();
        if (a.bottom - a.top >= height && a.bottom > height) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo73697b() {
        if (!this.f91055b) {
            return false;
        }
        RectF a = this.f91054a.mo73716a(this.f91054a.f91063h);
        if (a == null) {
            return false;
        }
        if (a.bottom - a.top >= ((float) getHeight()) && a.top < 0.0f) {
            return true;
        }
        return false;
    }

    public PhotoDraweeView(Context context) {
        super(context);
        m80053c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f91054a.f91062g = z;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f91054a.f91068m = onLongClickListener;
    }

    public void setOnPhotoTapListener(C18928a aVar) {
        this.f91054a.f91066k = aVar;
    }

    public void setOnScaleChangeListener(C18929b bVar) {
        this.f91054a.f91069n = bVar;
    }

    public void setOnViewTapListener(C18931d dVar) {
        this.f91054a.f91067l = dVar;
    }

    public void setMaximumScale(float f) {
        C35415a aVar = this.f91054a;
        C35415a.m80059b(aVar.f91057b, aVar.f91058c, f);
        aVar.f91059d = f;
    }

    public void setMediumScale(float f) {
        C35415a aVar = this.f91054a;
        C35415a.m80059b(aVar.f91057b, f, aVar.f91059d);
        aVar.f91058c = f;
    }

    public void setMinimumScale(float f) {
        C35415a aVar = this.f91054a;
        C35415a.m80059b(f, aVar.f91058c, aVar.f91059d);
        aVar.f91057b = f;
    }

    public void setZoomTransitionDuration(long j) {
        C35415a aVar = this.f91054a;
        if (j < 0) {
            j = 200;
        }
        aVar.f91060e = j;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.f91054a.f91063h);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        C35415a aVar = this.f91054a;
        if (onDoubleTapListener != null) {
            aVar.f91061f.mo3211a(onDoubleTapListener);
        } else {
            aVar.f91061f.mo3211a((OnDoubleTapListener) new C35419b(aVar));
        }
    }

    public void setScale(float f) {
        C35415a aVar = this.f91054a;
        DraweeView b = aVar.mo73718b();
        if (b != null) {
            aVar.mo73717a(f, (float) (b.getRight() / 2), (float) (b.getBottom() / 2), false);
        }
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80053c();
    }

    public PhotoDraweeView(Context context, C13833a aVar) {
        super(context, aVar);
        m80053c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73695a(int r8, int r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a r6 = r7.f91054a
            r6.f91065j = r8
            r6.f91064i = r9
            int r8 = r6.f91065j
            r9 = -1
            if (r8 != r9) goto L_0x000f
            int r8 = r6.f91064i
            if (r8 == r9) goto L_0x0079
        L_0x000f:
            com.facebook.drawee.view.DraweeView r8 = r6.mo73718b()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0040
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.heightPixels
            float r1 = (float) r1
            float r1 = r1 * r9
            int r2 = r6.f91064i
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.f91065j
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            int r2 = r0.widthPixels
            if (r1 < r2) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            int r0 = r0.widthPixels
            float r0 = (float) r0
            float r0 = r0 * r9
            float r1 = (float) r1
            float r0 = r0 / r1
            r3 = r0
            goto L_0x0042
        L_0x0040:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0042:
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            android.graphics.RectF r0 = r6.mo73725i()
            if (r0 == 0) goto L_0x006c
            float r9 = r9 * r3
            r6.f91057b = r9
            r9 = 1071644672(0x3fe00000, float:1.75)
            float r9 = r9 * r3
            r6.f91058c = r9
            r9 = 1077936128(0x40400000, float:3.0)
            float r9 = r9 * r3
            r6.f91059d = r9
            com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a r9 = new com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a
            float r4 = r0.centerX()
            r5 = 0
            r0 = r9
            r1 = r6
            r2 = r3
            r0.<init>(r2, r3, r4, r5)
            r8.post(r9)
        L_0x006c:
            android.graphics.Matrix r9 = r6.f91063h
            r9.reset()
            r6.mo73726j()
            if (r8 == 0) goto L_0x0079
            r8.invalidate()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.photodraweeview.PhotoDraweeView.mo73695a(int, int):void");
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m80053c();
    }
}

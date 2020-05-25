package com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.p942h.C13842a;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.e */
public class C22388e extends C22383a {

    /* renamed from: c */
    public volatile boolean f60293c;

    /* renamed from: d */
    private Paint f60294d;

    /* renamed from: e */
    private Bitmap f60295e;

    /* renamed from: f */
    private Drawable f60296f;

    /* renamed from: g */
    private BitmapShader f60297g;

    /* renamed from: h */
    private Canvas f60298h;

    /* renamed from: i */
    private int f60299i;

    /* renamed from: j */
    private boolean f60300j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46606a() {
        super.mo46606a();
        C13837e eVar = new C13837e();
        eVar.mo25937a(true);
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
        m55395b();
    }

    /* renamed from: b */
    private void m55395b() {
        Config config;
        if (this.f60300j) {
            this.f60296f = getDrawable();
            if (this.f60296f != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f60296f.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f60296f.getIntrinsicWidth();
                int intrinsicHeight = this.f60296f.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f60295e != null) {
                    if (intrinsicWidth == this.f60295e.getWidth() && intrinsicHeight == this.f60295e.getHeight()) {
                        if (this.f60298h != null) {
                            this.f60298h.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f60295e.isRecycled()) {
                        this.f60295e.recycle();
                    }
                }
                this.f60299i = intrinsicWidth / 2;
                this.f60295e = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f60298h = new Canvas(this.f60295e);
                this.f60296f.setBounds(0, 0, this.f60298h.getWidth(), this.f60298h.getHeight());
                Bitmap bitmap = this.f60295e;
                TileMode tileMode = TileMode.CLAMP;
                this.f60297g = new BitmapShader(bitmap, tileMode, tileMode);
                this.f60294d.setAntiAlias(true);
                this.f60294d.setShader(this.f60297g);
            }
        }
    }

    public void setController(C13842a aVar) {
        if (this.f60300j) {
            this.f60293c = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f60300j) {
            if (this.f60293c) {
                m55395b();
                this.f60293c = false;
            }
            if (!(this.f60296f == null || this.f60298h == null)) {
                this.f60296f.draw(this.f60298h);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f60299i, this.f60294d);
            return;
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m55395b();
    }
}

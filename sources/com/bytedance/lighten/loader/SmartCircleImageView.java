package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.p942h.C13842a;

public class SmartCircleImageView extends SmartImageView {

    /* renamed from: a */
    public volatile boolean f32268a = true;

    /* renamed from: c */
    private Paint f32269c = new Paint();

    /* renamed from: d */
    private Bitmap f32270d;

    /* renamed from: e */
    private Drawable f32271e;

    /* renamed from: f */
    private Canvas f32272f;

    /* renamed from: g */
    private int f32273g;

    /* renamed from: h */
    private boolean f32274h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23132a() {
        super.mo23132a();
        C13837e eVar = ((C13833a) getHierarchy()).f36079a;
        if (eVar == null) {
            eVar = new C13837e();
        }
        eVar.mo25937a(true);
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
        m24671d();
    }

    /* renamed from: d */
    private void m24671d() {
        Config config;
        if (this.f32274h) {
            this.f32271e = getDrawable();
            if (this.f32271e != null && getWidth() > 0 && getHeight() > 0) {
                if (this.f32271e.getOpacity() != -1) {
                    config = Config.ARGB_8888;
                } else {
                    config = Config.RGB_565;
                }
                int intrinsicWidth = this.f32271e.getIntrinsicWidth();
                int intrinsicHeight = this.f32271e.getIntrinsicHeight();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = getWidth();
                }
                if (intrinsicHeight <= 0) {
                    intrinsicHeight = getHeight();
                }
                if (this.f32270d != null) {
                    if (intrinsicWidth == this.f32270d.getWidth() && intrinsicHeight == this.f32270d.getHeight()) {
                        if (this.f32272f != null) {
                            this.f32272f.drawColor(0, Mode.CLEAR);
                        }
                        return;
                    } else if (!this.f32270d.isRecycled()) {
                        this.f32270d.recycle();
                    }
                }
                this.f32273g = intrinsicWidth / 2;
                this.f32270d = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                this.f32272f = new Canvas(this.f32270d);
                this.f32271e.setBounds(0, 0, this.f32272f.getWidth(), this.f32272f.getHeight());
                Bitmap bitmap = this.f32270d;
                TileMode tileMode = TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f32269c.setAntiAlias(true);
                this.f32269c.setShader(bitmapShader);
            }
        }
    }

    public SmartCircleImageView(Context context) {
        super(context);
    }

    public void setController(C13842a aVar) {
        if (this.f32274h) {
            this.f32268a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    /* renamed from: a */
    public final void mo23133a(C12207s sVar) {
        this.f32274h = sVar.f32191J;
        if (this.f32274h) {
            final C12175j jVar = sVar.f32187F;
            if (jVar == null) {
                sVar.f32187F = new C12168c() {
                    /* renamed from: a */
                    public final void mo23095a(Uri uri, View view, Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                        SmartCircleImageView.this.f32268a = true;
                    }
                };
            } else {
                sVar.f32187F = new C12175j() {
                    /* renamed from: a */
                    public final void mo23085a(Uri uri) {
                        jVar.mo23085a(uri);
                    }

                    /* renamed from: a */
                    public final void mo23086a(Uri uri, View view) {
                        jVar.mo23086a(uri, view);
                    }

                    /* renamed from: a */
                    public final void mo23087a(Uri uri, Throwable th) {
                        jVar.mo23087a(uri, th);
                    }

                    /* renamed from: a */
                    public final void mo23095a(Uri uri, View view, Throwable th) {
                        jVar.mo23095a(uri, view, th);
                    }

                    /* renamed from: a */
                    public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                        SmartCircleImageView.this.f32268a = true;
                        jVar.mo23094a(uri, view, nVar, animatable);
                    }
                };
            }
        }
        super.mo23133a(sVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f32274h) {
            if (this.f32268a) {
                m24671d();
                this.f32268a = false;
            }
            if (!(this.f32271e == null || this.f32272f == null)) {
                this.f32271e.draw(this.f32272f);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f32273g, this.f32269c);
            return;
        }
        super.onDraw(canvas);
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m24671d();
    }
}

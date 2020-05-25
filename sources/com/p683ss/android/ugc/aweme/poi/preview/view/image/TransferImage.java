package com.p683ss.android.ugc.aweme.poi.preview.view.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.view.C13848b;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage */
public class TransferImage extends PhotoView {

    /* renamed from: E */
    public int f100092E;

    /* renamed from: F */
    public int f100093F;

    /* renamed from: G */
    public int f100094G;

    /* renamed from: H */
    public int f100095H;

    /* renamed from: I */
    public int f100096I;

    /* renamed from: J */
    public int f100097J;

    /* renamed from: K */
    public int f100098K;

    /* renamed from: L */
    public boolean f100099L;

    /* renamed from: M */
    public Paint f100100M;

    /* renamed from: N */
    public C39213c f100101N;

    /* renamed from: O */
    public C39212b f100102O;

    /* renamed from: P */
    private C13848b<C13833a> f100103P;

    /* renamed from: Q */
    private long f100104Q;

    /* renamed from: R */
    private Matrix f100105R;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a */
    class C39211a implements Cloneable {

        /* renamed from: a */
        float f100111a;

        /* renamed from: b */
        float f100112b;

        /* renamed from: c */
        float f100113c;

        /* renamed from: d */
        float f100114d;

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[left:");
            sb.append(this.f100111a);
            sb.append(" top:");
            sb.append(this.f100112b);
            sb.append(" width:");
            sb.append(this.f100113c);
            sb.append(" height:");
            sb.append(this.f100114d);
            sb.append("]");
            return sb.toString();
        }

        private C39211a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$b */
    public interface C39212b {
        /* renamed from: a */
        void mo79865a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c */
    class C39213c {

        /* renamed from: a */
        float f100116a;

        /* renamed from: b */
        float f100117b;

        /* renamed from: c */
        float f100118c;

        /* renamed from: d */
        int f100119d;

        /* renamed from: e */
        C39211a f100120e;

        /* renamed from: f */
        C39211a f100121f;

        /* renamed from: g */
        C39211a f100122g;

        C39213c(boolean z) {
            int i;
            if (z) {
                i = NormalGiftView.ALPHA_255;
            } else {
                i = 0;
            }
            this.f100119d = i;
        }
    }

    public long getDuration() {
        return this.f100104Q;
    }

    public int getState() {
        return this.f100092E;
    }

    /* renamed from: e */
    public final void mo79929e() {
        this.f100092E = 3;
        this.f100099L = true;
    }

    public C13842a getController() {
        return this.f100103P.f36129c;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f100103P.mo25982b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f100103P.mo25983c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f100103P.mo25982b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f100103P.mo25983c();
    }

    /* renamed from: f */
    public final void mo79930f() {
        this.f100093F = 100;
        this.f100092E = 1;
        this.f100099L = true;
        this.f100100M.setAlpha(0);
        invalidate();
    }

    /* renamed from: g */
    public final void mo79931g() {
        this.f100093F = 100;
        this.f100092E = 2;
        this.f100099L = true;
        this.f100100M.setAlpha(NormalGiftView.ALPHA_255);
        invalidate();
    }

    public void setDuration(long j) {
        this.f100104Q = j;
    }

    public void setOnTransferListener(C39212b bVar) {
        this.f100102O = bVar;
    }

    public void setState(int i) {
        this.f100092E = i;
    }

    public TransferImage(Context context) {
        this(context, null);
    }

    public void setController(C13842a aVar) {
        this.f100103P.mo25979a(aVar);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f100103P.mo25981a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == ((C13833a) this.f100103P.mo25984d()).mo25888a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo79926a(int i) {
        this.f100093F = 200;
        this.f100092E = 1;
        this.f100094G = i;
        this.f100099L = true;
        if (this.f100094G == 201) {
            this.f100100M.setAlpha(0);
        } else {
            this.f100100M.setAlpha(NormalGiftView.ALPHA_255);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            android.graphics.drawable.Drawable r0 = r13.getDrawable()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r13.f100092E
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x04ed
            boolean r0 = r13.f100099L
            r2 = 201(0xc9, float:2.82E-43)
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0101
            int r0 = r13.f100092E
            if (r0 != r5) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            android.graphics.drawable.Drawable r8 = r13.getDrawable()
            if (r8 == 0) goto L_0x0101
            int r9 = r13.getWidth()
            if (r9 == 0) goto L_0x0101
            int r9 = r13.getHeight()
            if (r9 != 0) goto L_0x0035
            goto L_0x0101
        L_0x0035:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c
            r9.<init>(r0)
            r13.f100101N = r9
            int r0 = r13.f100095H
            float r0 = (float) r0
            int r9 = r8.getIntrinsicWidth()
            float r9 = (float) r9
            float r0 = r0 / r9
            int r9 = r13.f100096I
            float r9 = (float) r9
            int r10 = r8.getIntrinsicHeight()
            float r10 = (float) r10
            float r9 = r9 / r10
            int r10 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r10 <= 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r9
        L_0x0054:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            r9.f100116a = r0
            int r9 = r13.getWidth()
            float r9 = (float) r9
            int r10 = r8.getIntrinsicWidth()
            float r10 = (float) r10
            float r9 = r9 / r10
            int r10 = r13.getHeight()
            float r10 = (float) r10
            int r11 = r8.getIntrinsicHeight()
            float r11 = (float) r11
            float r10 = r10 / r11
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r9 = r10
        L_0x0074:
            int r10 = r13.f100093F
            if (r10 != r3) goto L_0x0081
            int r10 = r13.f100094G
            if (r10 != r2) goto L_0x0081
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            r9.f100117b = r0
            goto L_0x0085
        L_0x0081:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            r0.f100117b = r9
        L_0x0085:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r9 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r10 = 0
            r9.<init>()
            r0.f100120e = r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.f100120e
            int r9 = r13.f100097J
            float r9 = (float) r9
            r0.f100111a = r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.f100120e
            int r9 = r13.f100098K
            float r9 = (float) r9
            r0.f100112b = r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.f100120e
            int r9 = r13.f100095H
            float r9 = (float) r9
            r0.f100113c = r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.f100120e
            int r9 = r13.f100096I
            float r9 = (float) r9
            r0.f100114d = r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r9 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r9.<init>()
            r0.f100121f = r9
            int r0 = r8.getIntrinsicWidth()
            float r0 = (float) r0
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            float r9 = r9.f100117b
            float r0 = r0 * r9
            int r8 = r8.getIntrinsicHeight()
            float r8 = (float) r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            float r9 = r9.f100117b
            float r8 = r8 * r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r9 = r9.f100121f
            int r11 = r13.getWidth()
            float r11 = (float) r11
            float r11 = r11 - r0
            float r11 = r11 / r4
            r9.f100111a = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r9 = r9.f100121f
            int r11 = r13.getHeight()
            float r11 = (float) r11
            float r11 = r11 - r8
            float r11 = r11 / r4
            r9.f100112b = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r9 = r9.f100121f
            r9.f100113c = r0
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r0 = r0.f100121f
            r0.f100114d = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a
            r8.<init>()
            r0.f100122g = r8
        L_0x0101:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            if (r0 != 0) goto L_0x0109
            super.onDraw(r14)
            return
        L_0x0109:
            boolean r0 = r13.f100099L
            if (r0 == 0) goto L_0x014c
            int r0 = r13.f100092E
            switch(r0) {
                case 1: goto L_0x013c;
                case 2: goto L_0x012b;
                case 3: goto L_0x0113;
                default: goto L_0x0112;
            }
        L_0x0112:
            goto L_0x014c
        L_0x0113:
            android.graphics.Paint r0 = r13.f100100M
            r0.setAlpha(r1)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            float r1 = r0.f100116a
            r0.f100118c = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.f100121f     // Catch:{ CloneNotSupportedException -> 0x0129 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x0129 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage.C39211a) r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
            r0.f100122g = r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
            goto L_0x014c
        L_0x0129:
            goto L_0x014c
        L_0x012b:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            float r1 = r0.f100117b
            r0.f100118c = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.f100121f     // Catch:{ CloneNotSupportedException -> 0x0129 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x0129 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage.C39211a) r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
            r0.f100122g = r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
            goto L_0x014c
        L_0x013c:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r0 = r13.f100101N
            float r1 = r0.f100116a
            r0.f100118c = r1
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r0.f100120e     // Catch:{ CloneNotSupportedException -> 0x0129 }
            java.lang.Object r1 = r1.clone()     // Catch:{ CloneNotSupportedException -> 0x0129 }
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = (com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage.C39211a) r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
            r0.f100122g = r1     // Catch:{ CloneNotSupportedException -> 0x0129 }
        L_0x014c:
            android.graphics.Paint r0 = r13.f100100M
            r14.drawPaint(r0)
            int r0 = r14.getSaveCount()
            r14.save()
            android.graphics.drawable.Drawable r1 = r13.getDrawable()
            if (r1 == 0) goto L_0x019f
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            if (r8 != 0) goto L_0x0163
            goto L_0x019f
        L_0x0163:
            android.graphics.Matrix r8 = r13.f100105R
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            float r9 = r9.f100118c
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            float r10 = r10.f100118c
            r8.setScale(r9, r10)
            android.graphics.Matrix r8 = r13.f100105R
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r9 = r13.f100101N
            float r9 = r9.f100118c
            int r10 = r1.getIntrinsicWidth()
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 / r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100122g
            float r10 = r10.f100113c
            float r10 = r10 / r4
            float r9 = r9 - r10
            float r9 = -r9
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            float r10 = r10.f100118c
            int r1 = r1.getIntrinsicHeight()
            float r1 = (float) r1
            float r10 = r10 * r1
            float r10 = r10 / r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100122g
            float r1 = r1.f100114d
            float r1 = r1 / r4
            float r10 = r10 - r1
            float r1 = -r10
            r8.postTranslate(r9, r1)
        L_0x019f:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100122g
            float r1 = r1.f100111a
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f100122g
            float r4 = r4.f100112b
            r14.translate(r1, r4)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100122g
            float r1 = r1.f100113c
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f100122g
            float r4 = r4.f100114d
            r8 = 0
            r14.clipRect(r8, r8, r1, r4)
            android.graphics.Matrix r1 = r13.f100105R
            r14.concat(r1)
            android.graphics.drawable.Drawable r1 = r13.getDrawable()
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r13.f100101N
            int r4 = r4.f100119d
            r1.setAlpha(r4)
            android.graphics.drawable.Drawable r1 = r13.getDrawable()
            r1.draw(r14)
            r14.restoreToCount(r0)
            boolean r14 = r13.f100099L
            if (r14 == 0) goto L_0x04ec
            int r14 = r13.f100092E
            r0 = 3
            if (r14 == r0) goto L_0x04ec
            r13.f100099L = r6
            int r14 = r13.f100093F
            r1 = 100
            r4 = 5
            r9 = 4
            if (r14 == r1) goto L_0x0321
            if (r14 == r3) goto L_0x01ef
            goto L_0x04ec
        L_0x01ef:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r14 = r13.f100101N
            if (r14 == 0) goto L_0x04ec
            android.animation.ValueAnimator r14 = new android.animation.ValueAnimator
            r14.<init>()
            long r10 = r13.f100104Q
            r14.setDuration(r10)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r14.setInterpolator(r1)
            int r1 = r13.f100094G
            if (r1 != r2) goto L_0x0280
            java.lang.String r1 = "left"
            float[] r2 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f100120e
            float r3 = r3.f100111a
            r2[r6] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f100121f
            float r3 = r3.f100111a
            r2[r7] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "top"
            float[] r3 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f100120e
            float r4 = r4.f100112b
            r3[r6] = r4
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r4 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r4 = r4.f100121f
            float r4 = r4.f100112b
            r3[r7] = r4
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "width"
            float[] r4 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100120e
            float r8 = r8.f100113c
            r4[r6] = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100121f
            float r8 = r8.f100113c
            r4[r7] = r8
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r4)
            java.lang.String r4 = "height"
            float[] r8 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100120e
            float r10 = r10.f100114d
            r8[r6] = r10
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100121f
            float r10 = r10.f100114d
            r8[r7] = r10
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r8)
            android.animation.PropertyValuesHolder[] r8 = new android.animation.PropertyValuesHolder[r9]
            r8[r6] = r1
            r8[r7] = r2
            r8[r5] = r3
            r8[r0] = r4
            r14.setValues(r8)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$1 r0 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$1
            r0.<init>()
            r14.addUpdateListener(r0)
            goto L_0x030b
        L_0x0280:
            java.lang.String r1 = "left"
            float[] r2 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f100120e
            float r3 = r3.f100111a
            r2[r6] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r3 = r3.f100121f
            float r3 = r3.f100111a
            r2[r7] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "top"
            float[] r3 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100120e
            float r8 = r8.f100112b
            r3[r6] = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100121f
            float r8 = r8.f100112b
            r3[r7] = r8
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "width"
            float[] r8 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100120e
            float r10 = r10.f100113c
            r8[r6] = r10
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100121f
            float r10 = r10.f100113c
            r8[r7] = r10
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r8)
            java.lang.String r8 = "height"
            float[] r10 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100120e
            float r11 = r11.f100114d
            r10[r6] = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100121f
            float r11 = r11.f100114d
            r10[r7] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            java.lang.String r10 = "scale"
            float[] r11 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            float r12 = r12.f100116a
            r11[r6] = r12
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            float r12 = r12.f100117b
            r11[r7] = r12
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r10, r11)
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
            r4[r6] = r10
            r4[r7] = r1
            r4[r5] = r2
            r4[r0] = r3
            r4[r9] = r8
            r14.setValues(r4)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$2 r0 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$2
            r0.<init>()
            r14.addUpdateListener(r0)
        L_0x030b:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$3 r0 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$3
            r0.<init>()
            r14.addListener(r0)
            int r0 = r13.f100092E
            if (r0 != r7) goto L_0x031c
            r14.start()
            goto L_0x0502
        L_0x031c:
            r14.reverse()
            goto L_0x04ec
        L_0x0321:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r14 = r13.f100101N
            if (r14 == 0) goto L_0x0502
            android.animation.ValueAnimator r14 = new android.animation.ValueAnimator
            r14.<init>()
            long r1 = r13.f100104Q
            r14.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r14.setInterpolator(r1)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100120e
            float r1 = r1.f100113c
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x044d
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100120e
            float r1 = r1.f100114d
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x034d
            goto L_0x044d
        L_0x034d:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100121f
            float r1 = r1.f100113c
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x03d8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r1 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r1 = r1.f100121f
            float r1 = r1.f100114d
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0362
            goto L_0x03d8
        L_0x0362:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100116a
            r2[r6] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100117b
            r2[r7] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100120e
            float r8 = r8.f100111a
            r3[r6] = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100121f
            float r8 = r8.f100111a
            r3[r7] = r8
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r8 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100120e
            float r10 = r10.f100112b
            r8[r6] = r10
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100121f
            float r10 = r10.f100112b
            r8[r7] = r10
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r8)
            java.lang.String r8 = "width"
            float[] r10 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100120e
            float r11 = r11.f100113c
            r10[r6] = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100121f
            float r11 = r11.f100113c
            r10[r7] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            java.lang.String r10 = "height"
            float[] r11 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100120e
            float r12 = r12.f100114d
            r11[r6] = r12
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100121f
            float r12 = r12.f100114d
            r11[r7] = r12
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r10, r11)
            goto L_0x04c1
        L_0x03d8:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100116a
            r2[r6] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100116a
            r2[r7] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100120e
            float r8 = r8.f100111a
            r3[r6] = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100120e
            float r8 = r8.f100111a
            r3[r7] = r8
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r8 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100120e
            float r10 = r10.f100112b
            r8[r6] = r10
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100120e
            float r10 = r10.f100112b
            r8[r7] = r10
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r8)
            java.lang.String r8 = "width"
            float[] r10 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100120e
            float r11 = r11.f100113c
            r10[r6] = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100120e
            float r11 = r11.f100113c
            r10[r7] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            java.lang.String r10 = "height"
            float[] r11 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100120e
            float r12 = r12.f100114d
            r11[r6] = r12
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100120e
            float r12 = r12.f100114d
            r11[r7] = r12
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r10, r11)
            goto L_0x04c1
        L_0x044d:
            java.lang.String r1 = "scale"
            float[] r2 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100117b
            r2[r6] = r3
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r3 = r13.f100101N
            float r3 = r3.f100117b
            r2[r7] = r3
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            java.lang.String r2 = "left"
            float[] r3 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100121f
            float r8 = r8.f100111a
            r3[r6] = r8
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r8 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r8 = r8.f100121f
            float r8 = r8.f100111a
            r3[r7] = r8
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r2, r3)
            java.lang.String r3 = "top"
            float[] r8 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100121f
            float r10 = r10.f100112b
            r8[r6] = r10
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r10 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r10 = r10.f100121f
            float r10 = r10.f100112b
            r8[r7] = r10
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r3, r8)
            java.lang.String r8 = "width"
            float[] r10 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100121f
            float r11 = r11.f100113c
            r10[r6] = r11
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r11 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r11 = r11.f100121f
            float r11 = r11.f100113c
            r10[r7] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r8, r10)
            java.lang.String r10 = "height"
            float[] r11 = new float[r5]
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100121f
            float r12 = r12.f100114d
            r11[r6] = r12
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c r12 = r13.f100101N
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a r12 = r12.f100121f
            float r12 = r12.f100114d
            r11[r7] = r12
            android.animation.PropertyValuesHolder r10 = android.animation.PropertyValuesHolder.ofFloat(r10, r11)
        L_0x04c1:
            android.animation.PropertyValuesHolder[] r4 = new android.animation.PropertyValuesHolder[r4]
            r4[r6] = r1
            r4[r7] = r2
            r4[r5] = r3
            r4[r0] = r8
            r4[r9] = r10
            r14.setValues(r4)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$4 r0 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$4
            r0.<init>()
            r14.addUpdateListener(r0)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$5 r0 = new com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$5
            r0.<init>()
            r14.addListener(r0)
            int r0 = r13.f100092E
            if (r0 != r7) goto L_0x04e8
            r14.start()
            goto L_0x04ec
        L_0x04e8:
            r14.reverse()
            goto L_0x0502
        L_0x04ec:
            return
        L_0x04ed:
            android.graphics.Paint r0 = r13.f100100M
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r13.f100100M
            r14.drawPaint(r0)
            android.graphics.drawable.Drawable r0 = r13.getDrawable()     // Catch:{ Exception -> 0x0502 }
            r0.setAlpha(r1)     // Catch:{ Exception -> 0x0502 }
            super.onDraw(r14)     // Catch:{ Exception -> 0x0502 }
            return
        L_0x0502:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage.onDraw(android.graphics.Canvas):void");
    }

    public TransferImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransferImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f100093F = 100;
        this.f100094G = 201;
        this.f100104Q = 300;
        this.f100105R = new Matrix();
        this.f100100M = new Paint();
        if (this.f100103P == null) {
            this.f100103P = C13848b.m28154a(new C13834b(getResources()).mo25912a(), getContext());
        }
    }

    /* renamed from: a */
    public final void mo79927a(int i, int i2, int i3, int i4) {
        this.f100097J = i;
        this.f100098K = i2;
        this.f100095H = i3;
        this.f100096I = i4;
    }

    /* renamed from: a */
    public final void mo79928a(Drawable drawable, int i, int i2, int i3, int i4) {
        Rect b = m87152b(drawable, i, i2, i3, i4);
        this.f100097J = b.left;
        this.f100098K = b.top;
        this.f100095H = b.right;
        this.f100096I = b.bottom;
    }

    /* renamed from: b */
    private static Rect m87152b(Drawable drawable, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        float intrinsicWidth = ((float) i) / ((float) drawable.getIntrinsicWidth());
        float intrinsicHeight = ((float) i2) / ((float) drawable.getIntrinsicHeight());
        if (intrinsicWidth <= intrinsicHeight) {
            intrinsicWidth = intrinsicHeight;
        }
        float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * intrinsicWidth;
        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * intrinsicWidth;
        rect.left = (int) ((((float) i3) - intrinsicWidth2) / 2.0f);
        rect.top = (int) ((((float) i4) - intrinsicHeight2) / 2.0f);
        rect.right = (int) intrinsicWidth2;
        rect.bottom = (int) intrinsicHeight2;
        return rect;
    }
}

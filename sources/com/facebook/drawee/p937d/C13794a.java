package com.facebook.drawee.p937d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.C2240a;
import com.facebook.drawee.p937d.p938a.C13796b;
import com.facebook.drawee.p939e.C13816q.C13818b;

/* renamed from: com.facebook.drawee.d.a */
public final class C13794a extends Drawable implements C13796b {

    /* renamed from: a */
    public int f35929a;

    /* renamed from: b */
    public String f35930b;

    /* renamed from: c */
    public C13818b f35931c;

    /* renamed from: d */
    public long f35932d;

    /* renamed from: e */
    private String f35933e;

    /* renamed from: f */
    private String f35934f;

    /* renamed from: g */
    private int f35935g;

    /* renamed from: h */
    private int f35936h;

    /* renamed from: i */
    private int f35937i;

    /* renamed from: j */
    private int f35938j;

    /* renamed from: k */
    private int f35939k = 80;

    /* renamed from: l */
    private final Paint f35940l = new Paint(1);

    /* renamed from: m */
    private final Matrix f35941m = new Matrix();

    /* renamed from: n */
    private final Rect f35942n = new Rect();

    /* renamed from: o */
    private final RectF f35943o = new RectF();

    /* renamed from: p */
    private int f35944p;

    /* renamed from: q */
    private int f35945q;

    /* renamed from: r */
    private int f35946r;

    /* renamed from: s */
    private int f35947s;

    /* renamed from: t */
    private int f35948t;

    /* renamed from: u */
    private String f35949u;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C13794a() {
        mo25768a();
    }

    /* renamed from: a */
    public final void mo25768a() {
        this.f35935g = -1;
        this.f35936h = -1;
        this.f35929a = -1;
        this.f35937i = -1;
        this.f35938j = -1;
        this.f35930b = null;
        mo25771a((String) null);
        this.f35932d = -1;
        this.f35949u = null;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25772b(String str) {
        this.f35949u = str;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo25770a(long j) {
        this.f35932d = j;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo25771a(String str) {
        if (str == null) {
            str = "none";
        }
        this.f35933e = str;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        int i;
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f35940l.setTextSize((float) min);
        this.f35946r = min + 8;
        if (this.f35939k == 80) {
            this.f35946r *= -1;
        }
        this.f35944p = rect.left + 10;
        if (this.f35939k == 80) {
            i = rect.bottom - 10;
        } else {
            i = rect.top + 10 + 10;
        }
        this.f35945q = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r7 = r20
            android.graphics.Rect r8 = r19.getBounds()
            android.graphics.Paint r1 = r0.f35940l
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.f35940l
            r2 = 1073741824(0x40000000, float:2.0)
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r0.f35940l
            r2 = -26624(0xffffffffffff9800, float:NaN)
            r1.setColor(r2)
            int r1 = r8.left
            float r2 = (float) r1
            int r1 = r8.top
            float r3 = (float) r1
            int r1 = r8.right
            float r4 = (float) r1
            int r1 = r8.bottom
            float r5 = (float) r1
            android.graphics.Paint r6 = r0.f35940l
            r1 = r20
            r1.drawRect(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.f35940l
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.f35940l
            int r2 = r0.f35935g
            int r3 = r0.f35936h
            com.facebook.drawee.e.q$b r9 = r0.f35931c
            android.graphics.Rect r4 = r19.getBounds()
            int r4 = r4.width()
            android.graphics.Rect r5 = r19.getBounds()
            int r5 = r5.height()
            r6 = 0
            r16 = 1727284022(0x66f44336, float:5.7674862E23)
            r15 = 0
            if (r4 <= 0) goto L_0x00f1
            if (r5 <= 0) goto L_0x00f1
            if (r2 <= 0) goto L_0x00f1
            if (r3 > 0) goto L_0x005e
            goto L_0x00f1
        L_0x005e:
            if (r9 == 0) goto L_0x00b5
            android.graphics.Rect r10 = r0.f35942n
            android.graphics.Rect r11 = r0.f35942n
            r11.top = r15
            r10.left = r15
            android.graphics.Rect r10 = r0.f35942n
            r10.right = r4
            android.graphics.Rect r10 = r0.f35942n
            r10.bottom = r5
            android.graphics.Matrix r10 = r0.f35941m
            r10.reset()
            android.graphics.Matrix r10 = r0.f35941m
            android.graphics.Rect r11 = r0.f35942n
            r14 = 0
            r17 = 0
            r12 = r2
            r13 = r3
            r18 = 0
            r15 = r17
            r9.mo25873a(r10, r11, r12, r13, r14, r15)
            android.graphics.RectF r9 = r0.f35943o
            android.graphics.RectF r10 = r0.f35943o
            r10.top = r6
            r9.left = r6
            android.graphics.RectF r9 = r0.f35943o
            float r10 = (float) r2
            r9.right = r10
            android.graphics.RectF r9 = r0.f35943o
            float r10 = (float) r3
            r9.bottom = r10
            android.graphics.Matrix r9 = r0.f35941m
            android.graphics.RectF r10 = r0.f35943o
            r9.mapRect(r10)
            android.graphics.RectF r9 = r0.f35943o
            float r9 = r9.width()
            int r9 = (int) r9
            android.graphics.RectF r10 = r0.f35943o
            float r10 = r10.height()
            int r10 = (int) r10
            int r4 = java.lang.Math.min(r4, r9)
            int r5 = java.lang.Math.min(r5, r10)
            goto L_0x00b7
        L_0x00b5:
            r18 = 0
        L_0x00b7:
            float r9 = (float) r4
            r10 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r9 * r10
            r12 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 * r12
            float r13 = (float) r5
            float r10 = r10 * r13
            float r13 = r13 * r12
            int r2 = r2 - r4
            int r2 = java.lang.Math.abs(r2)
            int r3 = r3 - r5
            int r3 = java.lang.Math.abs(r3)
            float r2 = (float) r2
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e1
            float r4 = (float) r3
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e1
            r16 = 1716301648(0x664caf50, float:2.4164918E23)
            r2 = 1716301648(0x664caf50, float:2.4164918E23)
            goto L_0x00f6
        L_0x00e1:
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f3
            float r2 = (float) r3
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x00f3
            r16 = 1728026624(0x66ff9800, float:6.0350368E23)
            r2 = 1728026624(0x66ff9800, float:6.0350368E23)
            goto L_0x00f6
        L_0x00f1:
            r18 = 0
        L_0x00f3:
            r2 = 1727284022(0x66f44336, float:5.7674862E23)
        L_0x00f6:
            r1.setColor(r2)
            int r1 = r8.left
            float r2 = (float) r1
            int r1 = r8.top
            float r3 = (float) r1
            int r1 = r8.right
            float r4 = (float) r1
            int r1 = r8.bottom
            float r5 = (float) r1
            android.graphics.Paint r9 = r0.f35940l
            r1 = r20
            r10 = 0
            r6 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
            android.graphics.Paint r1 = r0.f35940l
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.f35940l
            r1.setStrokeWidth(r10)
            android.graphics.Paint r1 = r0.f35940l
            r2 = -1
            r1.setColor(r2)
            int r1 = r0.f35944p
            r0.f35947s = r1
            int r1 = r0.f35945q
            r0.f35948t = r1
            java.lang.String r1 = r0.f35934f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x013e
            java.lang.String r1 = "IDs: %s, %s"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r0.f35933e
            r4[r18] = r5
            java.lang.String r5 = r0.f35934f
            r4[r3] = r5
            r0.m27970a(r7, r1, r4)
            goto L_0x0149
        L_0x013e:
            java.lang.String r1 = "ID: %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r0.f35933e
            r4[r18] = r5
            r0.m27970a(r7, r1, r4)
        L_0x0149:
            java.lang.String r1 = "D: %dx%d"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r8.width()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r18] = r5
            int r5 = r8.height()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            r0.m27970a(r7, r1, r4)
            java.lang.String r1 = "I: %dx%d"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r0.f35935g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r18] = r5
            int r5 = r0.f35936h
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            r0.m27970a(r7, r1, r4)
            java.lang.String r1 = "I: %d KiB"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.f35929a
            int r5 = r5 / 1024
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r18] = r5
            r0.m27970a(r7, r1, r4)
            java.lang.String r1 = r0.f35930b
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "i format: %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r0.f35930b
            r4[r18] = r5
            r0.m27970a(r7, r1, r4)
        L_0x019b:
            int r1 = r0.f35937i
            if (r1 <= 0) goto L_0x01b6
            java.lang.String r1 = "anim: f %d, l %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r4 = r0.f35937i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r18] = r4
            int r4 = r0.f35938j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r0.m27970a(r7, r1, r2)
        L_0x01b6:
            com.facebook.drawee.e.q$b r1 = r0.f35931c
            if (r1 == 0) goto L_0x01c5
            java.lang.String r1 = "scale: %s"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.facebook.drawee.e.q$b r4 = r0.f35931c
            r2[r18] = r4
            r0.m27970a(r7, r1, r2)
        L_0x01c5:
            long r1 = r0.f35932d
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x01dc
            java.lang.String r1 = "t: %d ms"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            long r4 = r0.f35932d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2[r18] = r4
            r0.m27970a(r7, r1, r2)
        L_0x01dc:
            java.lang.String r1 = r0.f35949u
            if (r1 == 0) goto L_0x01eb
            java.lang.String r1 = "origin: %s"
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = r0.f35949u
            r2[r18] = r3
            r0.m27970a(r7, r1, r2)
        L_0x01eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p937d.C13794a.draw(android.graphics.Canvas):void");
    }

    /* renamed from: a */
    public final void mo25769a(int i, int i2) {
        this.f35935g = i;
        this.f35936h = i2;
        invalidateSelf();
    }

    /* renamed from: a */
    private void m27970a(Canvas canvas, String str, Object... objArr) {
        canvas.drawText(C2240a.m6772a(str, objArr), (float) this.f35947s, (float) this.f35948t, this.f35940l);
        this.f35948t += this.f35946r;
    }
}

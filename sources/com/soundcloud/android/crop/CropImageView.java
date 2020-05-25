package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.soundcloud.android.crop.ImageViewTouchBase.C18330a;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase {

    /* renamed from: a */
    ArrayList<C18334b> f50586a = new ArrayList<>();

    /* renamed from: b */
    C18334b f50587b;

    /* renamed from: c */
    Context f50588c;

    /* renamed from: k */
    private float f50589k;

    /* renamed from: l */
    private float f50590l;

    /* renamed from: m */
    private int f50591m;

    /* renamed from: n */
    private int f50592n;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36746a() {
        super.mo36746a();
    }

    public /* bridge */ /* synthetic */ Matrix getUnrotatedMatrix() {
        return super.getUnrotatedMatrix();
    }

    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public /* bridge */ /* synthetic */ void setRecycler(C18330a aVar) {
        super.setRecycler(aVar);
    }

    public CropImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m44513a(C18334b bVar) {
        Rect rect = bVar.f50621b;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 != 0) {
            min2 = max2;
        }
        if (max != 0 || min2 != 0) {
            mo36761b((float) max, (float) min2);
        }
    }

    /* renamed from: b */
    private void m44514b(C18334b bVar) {
        Rect rect = bVar.f50621b;
        float width = (float) getWidth();
        float max = Math.max(1.0f, Math.min((width / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {bVar.f50620a.centerX(), bVar.f50620a.centerY()};
            getUnrotatedMatrix().mapPoints(fArr);
            mo36759a(max, fArr[0], fArr[1], 300.0f);
        }
        m44513a(bVar);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.f50586a.iterator();
        while (it.hasNext()) {
            C18334b bVar = (C18334b) it.next();
            canvas.save();
            Path path = new Path();
            bVar.f50625f.setStrokeWidth(bVar.f50636q);
            if (!bVar.f50637r) {
                bVar.f50625f.setColor(-16777216);
                canvas.drawRect(bVar.f50621b, bVar.f50625f);
            } else {
                Rect rect = new Rect();
                bVar.f50627h.getDrawingRect(rect);
                path.addRect(new RectF(bVar.f50621b), Direction.CW);
                bVar.f50625f.setColor(bVar.f50630k);
                boolean z = true;
                if (VERSION.SDK_INT == 17 || (VERSION.SDK_INT >= 14 && VERSION.SDK_INT <= 15 && canvas.isHardwareAccelerated())) {
                    z = false;
                }
                if (z) {
                    canvas.clipPath(path, Op.DIFFERENCE);
                    canvas.drawRect(rect, bVar.f50624e);
                } else {
                    canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) bVar.f50621b.top, bVar.f50624e);
                    canvas.drawRect(0.0f, (float) bVar.f50621b.bottom, (float) canvas.getWidth(), (float) canvas.getHeight(), bVar.f50624e);
                    canvas.drawRect(0.0f, (float) bVar.f50621b.top, (float) bVar.f50621b.left, (float) bVar.f50621b.bottom, bVar.f50624e);
                    canvas.drawRect((float) bVar.f50621b.right, (float) bVar.f50621b.top, (float) canvas.getWidth(), (float) bVar.f50621b.bottom, bVar.f50624e);
                }
                canvas.restore();
                canvas.drawPath(path, bVar.f50625f);
                if (bVar.f50628i) {
                    bVar.f50625f.setStrokeWidth(1.0f);
                    float f = (float) ((bVar.f50621b.right - bVar.f50621b.left) / 3);
                    float f2 = (float) ((bVar.f50621b.bottom - bVar.f50621b.top) / 3);
                    canvas.drawLine(((float) bVar.f50621b.left) + f, (float) bVar.f50621b.top, ((float) bVar.f50621b.left) + f, (float) bVar.f50621b.bottom, bVar.f50625f);
                    float f3 = f * 2.0f;
                    canvas.drawLine(((float) bVar.f50621b.left) + f3, (float) bVar.f50621b.top, ((float) bVar.f50621b.left) + f3, (float) bVar.f50621b.bottom, bVar.f50625f);
                    canvas.drawLine((float) bVar.f50621b.left, ((float) bVar.f50621b.top) + f2, (float) bVar.f50621b.right, ((float) bVar.f50621b.top) + f2, bVar.f50625f);
                    float f4 = f2 * 2.0f;
                    canvas.drawLine((float) bVar.f50621b.left, ((float) bVar.f50621b.top) + f4, (float) bVar.f50621b.right, ((float) bVar.f50621b.top) + f4, bVar.f50625f);
                }
                if (bVar.f50629j) {
                    bVar.f50625f.setStrokeWidth(1.0f);
                    canvas.drawOval(new RectF(bVar.f50621b), bVar.f50625f);
                }
                if (bVar.f50632m == C18335a.Always || (bVar.f50632m == C18335a.Changing && bVar.f50631l == C18336b.Grow)) {
                    int i = bVar.f50621b.left + ((bVar.f50621b.right - bVar.f50621b.left) / 2);
                    float f5 = (float) (bVar.f50621b.top + ((bVar.f50621b.bottom - bVar.f50621b.top) / 2));
                    canvas.drawCircle((float) bVar.f50621b.left, f5, bVar.f50635p, bVar.f50626g);
                    float f6 = (float) i;
                    canvas.drawCircle(f6, (float) bVar.f50621b.top, bVar.f50635p, bVar.f50626g);
                    canvas.drawCircle((float) bVar.f50621b.right, f5, bVar.f50635p, bVar.f50626g);
                    canvas.drawCircle(f6, (float) bVar.f50621b.bottom, bVar.f50635p, bVar.f50626g);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        C18336b bVar;
        int i3;
        if (((CropImageActivity) this.f50588c).f50566f) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f50586a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C18334b bVar2 = (C18334b) it.next();
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        Rect a = bVar2.mo36772a();
                        if (y < ((float) a.top) - 20.0f || y >= ((float) a.bottom) + 20.0f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (x < ((float) a.left) - 20.0f || x >= ((float) a.right) + 20.0f) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (Math.abs(((float) a.left) - x) >= 20.0f || !z) {
                            i = 1;
                        } else {
                            i = 3;
                        }
                        if (Math.abs(((float) a.right) - x) < 20.0f && z) {
                            i |= 4;
                        }
                        if (Math.abs(((float) a.top) - y) < 20.0f && z2) {
                            i |= 8;
                        }
                        if (Math.abs(((float) a.bottom) - y) >= 20.0f || !z2) {
                            i2 = i;
                        } else {
                            i2 = i | 16;
                        }
                        if (i2 == 1 && a.contains((int) x, (int) y)) {
                            i2 = 32;
                            continue;
                        }
                        if (i2 != 1) {
                            this.f50591m = i2;
                            this.f50587b = bVar2;
                            this.f50589k = motionEvent.getX();
                            this.f50590l = motionEvent.getY();
                            this.f50592n = motionEvent.getPointerId(motionEvent.getActionIndex());
                            C18334b bVar3 = this.f50587b;
                            if (i2 == 32) {
                                bVar = C18336b.Move;
                            } else {
                                bVar = C18336b.Grow;
                            }
                            bVar3.mo36773a(bVar);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (this.f50587b != null) {
                    m44514b(this.f50587b);
                    this.f50587b.mo36773a(C18336b.None);
                }
                this.f50587b = null;
                mo36760b();
                break;
            case 2:
                if (this.f50587b != null && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f50592n) {
                    C18334b bVar4 = this.f50587b;
                    int i4 = this.f50591m;
                    float x2 = motionEvent.getX() - this.f50589k;
                    float y2 = motionEvent.getY() - this.f50590l;
                    Rect a2 = bVar4.mo36772a();
                    if (i4 == 32) {
                        float width = x2 * (bVar4.f50620a.width() / ((float) a2.width()));
                        float height = y2 * (bVar4.f50620a.height() / ((float) a2.height()));
                        Rect rect = new Rect(bVar4.f50621b);
                        bVar4.f50620a.offset(width, height);
                        bVar4.f50620a.offset(Math.max(0.0f, bVar4.f50623d.left - bVar4.f50620a.left), Math.max(0.0f, bVar4.f50623d.top - bVar4.f50620a.top));
                        bVar4.f50620a.offset(Math.min(0.0f, bVar4.f50623d.right - bVar4.f50620a.right), Math.min(0.0f, bVar4.f50623d.bottom - bVar4.f50620a.bottom));
                        bVar4.f50621b = bVar4.mo36772a();
                        rect.union(bVar4.f50621b);
                        rect.inset(-((int) bVar4.f50635p), -((int) bVar4.f50635p));
                        bVar4.f50627h.invalidate(rect);
                    } else {
                        if ((i4 & 6) == 0) {
                            x2 = 0.0f;
                        }
                        if ((i4 & 24) == 0) {
                            y2 = 0.0f;
                        }
                        float width2 = x2 * (bVar4.f50620a.width() / ((float) a2.width()));
                        float height2 = y2 * (bVar4.f50620a.height() / ((float) a2.height()));
                        int i5 = -1;
                        if ((i4 & 2) != 0) {
                            i3 = -1;
                        } else {
                            i3 = 1;
                        }
                        float f = ((float) i3) * width2;
                        if ((i4 & 8) == 0) {
                            i5 = 1;
                        }
                        float f2 = ((float) i5) * height2;
                        if (bVar4.f50633n) {
                            if (f != 0.0f) {
                                f2 = f / bVar4.f50634o;
                            } else if (f2 != 0.0f) {
                                f = bVar4.f50634o * f2;
                            }
                        }
                        RectF rectF = new RectF(bVar4.f50620a);
                        if (f > 0.0f && rectF.width() + (f * 2.0f) > bVar4.f50623d.width()) {
                            f = (bVar4.f50623d.width() - rectF.width()) / 2.0f;
                            if (bVar4.f50633n) {
                                f2 = f / bVar4.f50634o;
                            }
                        }
                        if (f2 > 0.0f && rectF.height() + (f2 * 2.0f) > bVar4.f50623d.height()) {
                            f2 = (bVar4.f50623d.height() - rectF.height()) / 2.0f;
                            if (bVar4.f50633n) {
                                f = bVar4.f50634o * f2;
                            }
                        }
                        rectF.inset(-f, -f2);
                        float f3 = 25.0f;
                        if (rectF.width() < 25.0f) {
                            rectF.inset((-(25.0f - rectF.width())) / 2.0f, 0.0f);
                        }
                        if (bVar4.f50633n) {
                            f3 = 25.0f / bVar4.f50634o;
                        }
                        if (rectF.height() < f3) {
                            rectF.inset(0.0f, (-(f3 - rectF.height())) / 2.0f);
                        }
                        if (rectF.left < bVar4.f50623d.left) {
                            rectF.offset(bVar4.f50623d.left - rectF.left, 0.0f);
                        } else if (rectF.right > bVar4.f50623d.right) {
                            rectF.offset(-(rectF.right - bVar4.f50623d.right), 0.0f);
                        }
                        if (rectF.top < bVar4.f50623d.top) {
                            rectF.offset(0.0f, bVar4.f50623d.top - rectF.top);
                        } else if (rectF.bottom > bVar4.f50623d.bottom) {
                            rectF.offset(0.0f, -(rectF.bottom - bVar4.f50623d.bottom));
                        }
                        bVar4.f50620a.set(rectF);
                        bVar4.f50621b = bVar4.mo36772a();
                        bVar4.f50627h.invalidate();
                    }
                    this.f50589k = motionEvent.getX();
                    this.f50590l = motionEvent.getY();
                }
                if (getScale() == 1.0f) {
                    mo36760b();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36749a(Bitmap bitmap, boolean z) {
        super.mo36749a(bitmap, z);
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36750a(C18340d dVar, boolean z) {
        super.mo36750a(dVar, z);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36747a(float f, float f2) {
        super.mo36747a(f, f2);
        Iterator it = this.f50586a.iterator();
        while (it.hasNext()) {
            C18334b bVar = (C18334b) it.next();
            bVar.f50622c.postTranslate(f, f2);
            bVar.mo36774b();
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36748a(float f, float f2, float f3) {
        super.mo36748a(f, f2, f3);
        Iterator it = this.f50586a.iterator();
        while (it.hasNext()) {
            C18334b bVar = (C18334b) it.next();
            bVar.f50622c.set(getUnrotatedMatrix());
            bVar.mo36774b();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f50598f.f50647a != null) {
            Iterator it = this.f50586a.iterator();
            while (it.hasNext()) {
                C18334b bVar = (C18334b) it.next();
                bVar.f50622c.set(getUnrotatedMatrix());
                bVar.mo36774b();
                if (bVar.f50637r) {
                    m44514b(bVar);
                }
            }
        }
    }
}

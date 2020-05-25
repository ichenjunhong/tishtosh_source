package com.bytedance.android.livesdk.gift.effect.doodle.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.gift.effect.doodle.p361b.C7348a;
import com.bytedance.android.livesdk.gift.effect.doodle.p362c.C7350a;
import com.bytedance.android.livesdk.gift.effect.doodle.p362c.C7351b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoodleGiftView extends View {

    /* renamed from: A */
    private float f20086A;

    /* renamed from: B */
    private float f20087B;

    /* renamed from: C */
    private int f20088C;

    /* renamed from: D */
    private Matrix f20089D;

    /* renamed from: E */
    private Bitmap f20090E;

    /* renamed from: F */
    private long f20091F;

    /* renamed from: G */
    private int f20092G;

    /* renamed from: a */
    public List<C7350a> f20093a;

    /* renamed from: b */
    public C7368a f20094b;

    /* renamed from: c */
    C7348a f20095c;

    /* renamed from: d */
    boolean f20096d;

    /* renamed from: e */
    private float f20097e;

    /* renamed from: f */
    private float f20098f;

    /* renamed from: g */
    private C7351b f20099g;

    /* renamed from: h */
    private HashMap<String, Bitmap> f20100h;

    /* renamed from: i */
    private Paint f20101i;

    /* renamed from: j */
    private float f20102j;

    /* renamed from: k */
    private float f20103k;

    /* renamed from: l */
    private float f20104l;

    /* renamed from: m */
    private float f20105m;

    /* renamed from: n */
    private float f20106n;

    /* renamed from: o */
    private float f20107o;

    /* renamed from: p */
    private long f20108p;

    /* renamed from: q */
    private long f20109q;

    /* renamed from: r */
    private long f20110r;

    /* renamed from: s */
    private long f20111s;

    /* renamed from: t */
    private long f20112t;

    /* renamed from: u */
    private long f20113u;

    /* renamed from: v */
    private boolean f20114v;

    /* renamed from: w */
    private int f20115w;

    /* renamed from: x */
    private float f20116x;

    /* renamed from: y */
    private float f20117y;

    /* renamed from: z */
    private float f20118z;

    /* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView$a */
    public enum C7368a {
        play,
        draw
    }

    public int getDrawPointNum() {
        return this.f20093a.size();
    }

    /* renamed from: b */
    private void m15207b() {
        float f;
        int c = C3922z.m9910c();
        int b = C3922z.m9908b();
        this.f20106n = this.f20099g.f20057f;
        this.f20107o = this.f20099g.f20058g;
        float f2 = this.f20099g.f20055d;
        float f3 = this.f20099g.f20056e;
        float f4 = (float) c;
        float f5 = this.f20099g.f20052a / f4;
        this.f20102j = f2 / f5;
        this.f20103k = f3 / f5;
        if (this.f20092G == 1) {
            f = 0.8f;
        } else {
            f = 0.5f;
        }
        this.f20097e = f;
        float f6 = this.f20102j / this.f20103k;
        if (this.f20102j > this.f20097e * f4) {
            this.f20102j = this.f20097e * f4;
            this.f20103k = this.f20102j / f6;
        }
        float f7 = (float) b;
        if (this.f20103k > this.f20097e * f7) {
            this.f20103k = this.f20097e * f7;
            this.f20102j = this.f20103k * f6;
        }
        this.f20104l = (f4 - this.f20102j) / 2.0f;
        this.f20105m = (f7 - this.f20103k) / 2.0f;
        if (this.f20099g.f20054c.size() > 30) {
            this.f20109q = 1500 / ((long) this.f20099g.f20054c.size());
        } else {
            this.f20109q = 64;
        }
        this.f20108p = 1200;
        this.f20111s = (this.f20109q * ((long) this.f20099g.f20054c.size())) + 60;
        this.f20112t = this.f20111s + this.f20108p;
        this.f20110r = this.f20111s + this.f20108p + 300;
        for (int i = 0; i < this.f20099g.f20054c.size(); i++) {
            ((C7350a) this.f20099g.f20054c.get(i)).f20050d = ((long) i) * this.f20109q;
            m15206a(((C7350a) this.f20099g.f20054c.get(i)).f20049c);
        }
    }

    /* renamed from: a */
    public final void mo13634a() {
        if (this.f20094b == C7368a.play) {
            this.f20096d = false;
            this.f20114v = false;
            this.f20113u = 0;
            if (this.f20095c != null) {
                this.f20095c.mo13621a(300, this.f20105m);
            }
            invalidate();
        }
    }

    /* renamed from: a */
    public final DoodleGiftView mo13633a(C7368a aVar) {
        this.f20094b = aVar;
        return this;
    }

    public DoodleGiftView(Context context) {
        super(context);
        m15205a(context);
    }

    /* renamed from: a */
    private void m15206a(String str) {
        if (!this.f20100h.containsKey(str)) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile != null) {
                this.f20100h.put(str, Bitmap.createBitmap(decodeFile));
            }
        }
    }

    /* renamed from: a */
    private void m15205a(Context context) {
        this.f20093a = new ArrayList();
        this.f20100h = new HashMap<>();
        this.f20094b = C7368a.draw;
        this.f20089D = new Matrix();
        this.f20101i = new Paint();
        this.f20098f = getResources().getDimension(R.dimen.oe);
        this.f20092G = context.getResources().getConfiguration().orientation;
    }

    /* renamed from: a */
    public final DoodleGiftView mo13632a(C7351b bVar) {
        if (bVar == null) {
            return this;
        }
        this.f20099g = bVar;
        m15207b();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        switch (this.f20094b) {
            case play:
                if (!this.f20096d && this.f20099g != null && !this.f20099g.f20054c.isEmpty()) {
                    List<C7350a> list = this.f20099g.f20054c;
                    if (this.f20113u <= this.f20112t) {
                        this.f20115w = list.size();
                        while (i < this.f20115w) {
                            this.f20090E = (Bitmap) this.f20100h.get(((C7350a) list.get(i)).f20049c);
                            if (this.f20090E != null) {
                                if (((C7350a) list.get(i)).f20050d <= this.f20113u) {
                                    this.f20116x = ((this.f20102j * (((float) ((C7350a) list.get(i)).f20047a) - this.f20106n)) / this.f20099g.f20055d) + this.f20104l;
                                    this.f20117y = ((this.f20103k * (((float) ((C7350a) list.get(i)).f20048b) - this.f20107o)) / this.f20099g.f20056e) + this.f20105m;
                                    this.f20118z = this.f20116x - ((float) (this.f20090E.getWidth() / 2));
                                    this.f20086A = this.f20117y - ((float) (this.f20090E.getHeight() / 2));
                                    this.f20087B = m15204a(this.f20090E.getWidth(), this.f20090E.getHeight()) * 0.9f;
                                    this.f20088C = NormalGiftView.ALPHA_255;
                                    if (!((C7350a) list.get(i)).f20051e) {
                                        this.f20091F = this.f20113u - ((C7350a) list.get(i)).f20050d;
                                        if (this.f20091F > 60) {
                                            ((C7350a) list.get(i)).f20051e = true;
                                        } else {
                                            this.f20087B = (((float) this.f20091F) / 60.0f) * this.f20087B;
                                            this.f20088C = (int) ((((float) this.f20091F) / 60.0f) * 255.0f);
                                        }
                                    }
                                    this.f20089D.setScale(this.f20087B, this.f20087B, (float) (this.f20090E.getWidth() / 2), (float) (this.f20090E.getHeight() / 2));
                                    this.f20089D.postTranslate(this.f20118z, this.f20086A);
                                    this.f20101i.setAlpha(this.f20088C);
                                    canvas.drawBitmap(this.f20090E, this.f20089D, this.f20101i);
                                }
                            }
                            i++;
                        }
                    } else {
                        if (this.f20095c != null && !this.f20114v) {
                            this.f20095c.mo13620a(300);
                            this.f20114v = true;
                        }
                        this.f20115w = list.size();
                        while (i < this.f20115w) {
                            this.f20090E = (Bitmap) this.f20100h.get(((C7350a) list.get(i)).f20049c);
                            if (this.f20090E != null) {
                                this.f20116x = ((this.f20102j * (((float) ((C7350a) list.get(i)).f20047a) - this.f20106n)) / this.f20099g.f20055d) + this.f20104l;
                                this.f20117y = ((this.f20103k * (((float) ((C7350a) list.get(i)).f20048b) - this.f20107o)) / this.f20099g.f20056e) + this.f20105m;
                                this.f20118z = this.f20116x - ((float) (this.f20090E.getWidth() / 2));
                                this.f20086A = this.f20117y - ((float) (this.f20090E.getHeight() / 2));
                                this.f20091F = this.f20110r - this.f20113u;
                                this.f20087B = m15204a(this.f20090E.getWidth(), this.f20090E.getHeight()) * 0.9f;
                                this.f20087B += (1.0f - (((float) this.f20091F) / 300.0f)) * 0.5f;
                                this.f20088C = (int) ((((float) this.f20091F) / 300.0f) * 255.0f);
                                this.f20089D.setScale(this.f20087B, this.f20087B, (float) (this.f20090E.getWidth() / 2), (float) (this.f20090E.getHeight() / 2));
                                this.f20089D.postTranslate(this.f20118z, this.f20086A);
                                this.f20101i.setAlpha(this.f20088C);
                                canvas.drawBitmap(this.f20090E, this.f20089D, this.f20101i);
                            }
                            i++;
                        }
                    }
                    this.f20113u += 20;
                    if (this.f20113u < this.f20110r) {
                        postInvalidateDelayed(20);
                        break;
                    } else {
                        this.f20096d = true;
                        this.f20099g = null;
                        if (this.f20095c != null) {
                            this.f20095c.mo13619a();
                        }
                        return;
                    }
                }
            case draw:
                if (!this.f20093a.isEmpty()) {
                    int drawPointNum = getDrawPointNum();
                    while (i < drawPointNum) {
                        C7350a aVar = (C7350a) this.f20093a.get(i);
                        Bitmap bitmap = (Bitmap) this.f20100h.get(aVar.f20049c);
                        if (bitmap != null) {
                            int width = aVar.f20047a - (bitmap.getWidth() / 2);
                            int height = aVar.f20048b - (bitmap.getHeight() / 2);
                            this.f20087B = m15204a(bitmap.getWidth(), bitmap.getHeight()) * 0.9f;
                            this.f20089D.setScale(this.f20087B, this.f20087B, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                            this.f20089D.postTranslate((float) width, (float) height);
                            canvas.drawBitmap(bitmap, this.f20089D, this.f20101i);
                        }
                        i++;
                    }
                    break;
                }
                break;
        }
    }

    public DoodleGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15205a(context);
    }

    /* renamed from: a */
    private float m15204a(int i, int i2) {
        return this.f20098f / ((float) Math.max(i, i2));
    }

    public DoodleGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15205a(context);
    }

    /* renamed from: a */
    public final void mo13635a(int i, int i2, String str) {
        if (this.f20094b == C7368a.draw && str != null) {
            this.f20093a.add(new C7350a(i, i2, str));
            m15206a(str);
            invalidate();
        }
    }
}

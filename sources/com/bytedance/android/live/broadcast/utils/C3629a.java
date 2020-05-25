package com.bytedance.android.live.broadcast.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.facebook.common.p918b.C13660a;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p966f.C14024b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.p929d.C13745c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.utils.a */
public final class C3629a extends HandlerThread implements Callback {

    /* renamed from: a */
    public Bitmap f10339a;

    /* renamed from: b */
    public Handler f10340b;

    /* renamed from: c */
    private int[] f10341c = {R.drawable.bdu, R.drawable.bdv, R.drawable.bdw, R.drawable.bdx, R.drawable.bdy, R.drawable.bdz, R.drawable.be0, R.drawable.be1, R.drawable.be2, R.drawable.be3, R.drawable.be4, R.drawable.be5, R.drawable.be6, R.drawable.be7, R.drawable.be8};

    /* renamed from: d */
    private Surface f10342d;

    /* renamed from: e */
    private C3631a f10343e;

    /* renamed from: f */
    private int f10344f = -1;

    /* renamed from: g */
    private Bitmap f10345g;

    /* renamed from: h */
    private Bitmap f10346h;

    /* renamed from: i */
    private Bitmap[] f10347i;

    /* renamed from: j */
    private Paint f10348j;

    /* renamed from: k */
    private Paint f10349k;

    /* renamed from: l */
    private int f10350l;

    /* renamed from: m */
    private Rect f10351m;

    /* renamed from: n */
    private Rect f10352n;

    /* renamed from: o */
    private Rect f10353o;

    /* renamed from: p */
    private boolean f10354p;

    /* renamed from: com.bytedance.android.live.broadcast.utils.a$a */
    public static class C3631a {

        /* renamed from: a */
        public String f10356a;

        /* renamed from: b */
        public int f10357b;

        /* renamed from: c */
        public int f10358c;
    }

    public final boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        if (this.f10340b != null) {
            this.f10340b.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f10340b = new Handler(getLooper(), this);
        mo9008a();
        C14017k.m28587a().mo26211e().mo26182a(C14229b.fromUri(this.f10343e.f10356a), (Object) null).mo25666a(new C14024b() {
            public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
            }

            /* renamed from: a */
            public final void mo9012a(Bitmap bitmap) {
                if (bitmap != null) {
                    if (C3629a.this.f10339a != null) {
                        C3629a.this.f10339a.recycle();
                    }
                    C3629a.this.f10339a = bitmap.copy(Config.ARGB_8888, false);
                    C3629a.this.mo9008a();
                }
            }
        }, C13660a.m27612a());
    }

    /* renamed from: a */
    public final void mo9008a() {
        try {
            if (this.f10345g != null && !this.f10345g.isRecycled()) {
                this.f10345g.recycle();
            }
            this.f10345g = Bitmap.createScaledBitmap(this.f10339a, this.f10343e.f10357b, this.f10343e.f10358c, false);
            NativeBlurFilter.iterativeBoxBlur(this.f10345g, 3, 10);
            if (this.f10346h != null && !this.f10346h.isRecycled()) {
                this.f10346h.recycle();
            }
            int i = (int) (((float) this.f10343e.f10357b) * 0.41935483f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f10339a, i, i, false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle((float) (createScaledBitmap.getWidth() / 2), (float) (createScaledBitmap.getHeight() / 2), (float) (createScaledBitmap.getWidth() / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
            canvas.drawBitmap(createScaledBitmap, rect, rect, paint);
            this.f10346h = createBitmap;
            createScaledBitmap.recycle();
            this.f10350l = this.f10341c.length;
            this.f10347i = new Bitmap[this.f10350l];
            Resources resources = C3922z.m9915e().getResources();
            for (int i2 = 0; i2 < this.f10350l; i2++) {
                this.f10347i[i2] = BitmapFactory.decodeResource(resources, this.f10341c[i2]);
            }
            if (this.f10340b != null) {
                this.f10340b.sendEmptyMessage(233);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean handleMessage(Message message) {
        Bitmap[] bitmapArr;
        switch (message.what) {
            case 233:
                if (!this.f10354p) {
                    try {
                        if (this.f10342d.isValid()) {
                            Canvas lockCanvas = this.f10342d.lockCanvas(this.f10351m);
                            if (lockCanvas != null) {
                                if (this.f10345g.isRecycled() && this.f10339a != null && !this.f10339a.isRecycled()) {
                                    this.f10345g = Bitmap.createScaledBitmap(this.f10339a, this.f10343e.f10357b, this.f10343e.f10358c, false);
                                }
                                lockCanvas.drawBitmap(this.f10345g, null, this.f10351m, null);
                                lockCanvas.drawRect(this.f10351m, this.f10349k);
                                if (this.f10344f >= 0) {
                                    Bitmap[] bitmapArr2 = this.f10347i;
                                    int i = this.f10344f;
                                    this.f10344f = i + 1;
                                    Bitmap bitmap = bitmapArr2[i];
                                    if (bitmap != null && !bitmap.isRecycled()) {
                                        lockCanvas.drawBitmap(bitmap, null, this.f10353o, this.f10348j);
                                    }
                                    if (this.f10344f >= this.f10350l) {
                                        this.f10344f = -1;
                                    }
                                }
                                if (this.f10346h != null && !this.f10346h.isRecycled()) {
                                    lockCanvas.drawBitmap(this.f10346h, null, this.f10352n, this.f10348j);
                                }
                                this.f10342d.unlockCanvasAndPost(lockCanvas);
                                if (this.f10340b != null) {
                                    this.f10340b.sendEmptyMessageDelayed(233, 130);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        C8064d.m16005b();
                        C8064d.m9718a(6, e.getStackTrace());
                    }
                }
                break;
            case 234:
                if (this.f10344f < 0) {
                    this.f10344f = 0;
                    break;
                }
                break;
            case 235:
                this.f10354p = true;
                if (this.f10339a != null && !this.f10339a.isRecycled()) {
                    this.f10339a.recycle();
                    this.f10339a = null;
                }
                if (this.f10345g != null && !this.f10345g.isRecycled()) {
                    this.f10345g.recycle();
                    this.f10345g = null;
                }
                if (this.f10346h != null && !this.f10346h.isRecycled()) {
                    this.f10346h.recycle();
                    this.f10346h = null;
                }
                if (this.f10347i != null) {
                    for (Bitmap bitmap2 : this.f10347i) {
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                    }
                    this.f10347i = null;
                }
                this.f10342d.release();
                this.f10342d = null;
                break;
        }
        return true;
    }

    public C3629a(Surface surface, C3631a aVar) {
        super("AudioEffectDrewThread");
        this.f10342d = surface;
        this.f10343e = aVar;
        this.f10351m = new Rect(0, 0, aVar.f10357b, aVar.f10358c);
        int i = (int) (((float) aVar.f10357b) * 0.41935483f);
        int i2 = (aVar.f10357b - i) / 2;
        int i3 = (aVar.f10358c - i) / 2;
        this.f10352n = new Rect(i2, i3, i2 + i, i + i3);
        int i4 = (int) (((float) aVar.f10357b) * 0.5645161f);
        int i5 = (aVar.f10357b - i4) / 2;
        int i6 = (aVar.f10358c - i4) / 2;
        this.f10353o = new Rect(i5, i6, i5 + i4, i4 + i6);
        this.f10348j = new Paint(1);
        this.f10348j.setAntiAlias(true);
        this.f10348j.setFilterBitmap(true);
        this.f10348j.setDither(true);
        this.f10349k = new Paint(1);
        this.f10349k.setAntiAlias(true);
        this.f10349k.setFilterBitmap(true);
        this.f10349k.setDither(true);
        this.f10349k.setColor(Color.parseColor("#80000000"));
        this.f10339a = BitmapFactory.decodeResource(C3922z.m9915e().getResources(), R.drawable.buk);
    }
}

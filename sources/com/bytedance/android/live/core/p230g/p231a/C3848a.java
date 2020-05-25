package com.bytedance.android.live.core.p230g.p231a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.p940f.C13837e;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.drawee.view.C13848b;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.g.a.a */
public final class C3848a {

    /* renamed from: A */
    private List<Drawable> f10835A = null;

    /* renamed from: B */
    private Drawable f10836B = null;

    /* renamed from: C */
    private boolean f10837C = false;

    /* renamed from: D */
    private boolean f10838D = false;

    /* renamed from: E */
    private boolean f10839E = false;

    /* renamed from: F */
    private boolean f10840F = false;

    /* renamed from: G */
    private boolean f10841G = false;

    /* renamed from: a */
    public C13848b<C13843b> f10842a = null;

    /* renamed from: b */
    private Context f10843b;

    /* renamed from: c */
    private boolean f10844c;

    /* renamed from: d */
    private C3850a f10845d = null;

    /* renamed from: e */
    private C14234d f10846e = null;

    /* renamed from: f */
    private C13791d f10847f = null;

    /* renamed from: g */
    private Uri f10848g;

    /* renamed from: h */
    private Uri f10849h;

    /* renamed from: i */
    private ImageModel f10850i;

    /* renamed from: j */
    private C13952d f10851j;

    /* renamed from: k */
    private float f10852k = 0.0f;

    /* renamed from: l */
    private boolean f10853l = true;

    /* renamed from: m */
    private int f10854m = 300;

    /* renamed from: n */
    private Drawable f10855n = null;

    /* renamed from: o */
    private Drawable f10856o = null;

    /* renamed from: p */
    private Drawable f10857p = null;

    /* renamed from: q */
    private Drawable f10858q = null;

    /* renamed from: r */
    private Drawable f10859r = null;

    /* renamed from: s */
    private C13818b f10860s = C13834b.f36085a;

    /* renamed from: t */
    private C13818b f10861t = C13834b.f36085a;

    /* renamed from: u */
    private C13818b f10862u = C13834b.f36085a;

    /* renamed from: v */
    private C13818b f10863v = C13834b.f36085a;

    /* renamed from: w */
    private C13818b f10864w = C13834b.f36086b;

    /* renamed from: x */
    private PointF f10865x = null;

    /* renamed from: y */
    private ColorFilter f10866y = null;

    /* renamed from: z */
    private C13837e f10867z = null;

    /* renamed from: com.bytedance.android.live.core.g.a.a$1 */
    static /* synthetic */ class C38491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10868a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10868a = r0
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f10868a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p230g.p231a.C3848a.C38491.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.live.core.g.a.a$a */
    class C3850a implements OnAttachStateChangeListener, OnTouchListener {
        private C3850a() {
        }

        public final void onViewAttachedToWindow(View view) {
            if (C3848a.this.f10842a != null) {
                C3848a.this.f10842a.mo25982b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C3848a.this.f10842a != null) {
                C3848a.this.f10842a.mo25983c();
            }
        }

        /* synthetic */ C3850a(C3848a aVar, C38491 r2) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (C3848a.this.f10842a == null || !C3848a.this.f10842a.mo25981a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final C3848a mo9221a(Uri uri) {
        this.f10848g = uri;
        return this;
    }

    /* renamed from: a */
    public final C3848a mo9225a(String str) {
        return mo9221a(Uri.parse(str));
    }

    /* renamed from: a */
    public final C3848a mo9223a(ImageModel imageModel) {
        this.f10850i = imageModel;
        return this;
    }

    /* renamed from: a */
    public final C3848a mo9222a(ScaleType scaleType) {
        this.f10864w = m9762a(scaleType, C13834b.f36086b);
        return this;
    }

    /* renamed from: a */
    public final C3848a mo9226a(boolean z) {
        this.f10838D = true;
        return this;
    }

    /* renamed from: a */
    public final C3848a mo9224a(C13791d dVar) {
        this.f10847f = dVar;
        return this;
    }

    /* renamed from: a */
    public final void mo9227a(ImageView imageView) {
        if (imageView != null) {
            if (this.f10848g != null || this.f10850i != null) {
                if (this.f10842a == null) {
                    Object a = C3859i.m9787a(imageView);
                    if (a instanceof C13848b) {
                        this.f10842a = (C13848b) a;
                    }
                }
                if (this.f10851j == null && imageView.getMeasuredWidth() > 0 && imageView.getMeasuredHeight() > 0) {
                    mo9220a(imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
                }
                if (this.f10842a == null) {
                    this.f10842a = C13848b.m28154a(null, imageView.getContext());
                    if (this.f10845d == null) {
                        this.f10845d = new C3850a(this, null);
                    }
                    this.f10842a.mo25980a(new C13834b(imageView.getResources()).mo25916a(this.f10855n).mo25917a(this.f10860s).mo25924c(this.f10857p).mo25925c(this.f10862u).mo25927d(this.f10858q).mo25928d(this.f10863v).mo25921b(this.f10856o).mo25922b(this.f10861t).mo25913a(this.f10854m).mo25915a(this.f10865x).mo25914a(this.f10866y).mo25930e(this.f10864w).mo25929e(this.f10859r).mo25919a(this.f10835A).mo25931f(this.f10836B).mo25918a(this.f10867z).mo25912a());
                    C14229b[] a2 = m9765a(this.f10848g, this.f10850i, this.f10851j, this.f10846e);
                    if (a2 != null && a2.length != 0) {
                        C13773e eVar = (C13773e) ((C13773e) ((C13773e) ((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25762c(this.f10838D)).mo25751a(this.f10847f)).mo25759b(this.f10842a.f36129c)).mo25755a((REQUEST[]) a2)).mo25758b(this.f10839E)).mo25754a(this.f10837C);
                        if (this.f10849h != null) {
                            eVar.mo25761c(C14229b.fromUri(this.f10849h));
                        }
                        this.f10842a.mo25979a((C13842a) eVar.mo25763d());
                        if (this.f10844c) {
                            C3851b.m9777a(imageView, this.f10845d);
                        } else {
                            if (m9764a((View) imageView)) {
                                this.f10845d.onViewAttachedToWindow(imageView);
                            }
                            imageView.addOnAttachStateChangeListener(this.f10845d);
                        }
                        imageView.setOnTouchListener(this.f10845d);
                        C3859i.m9789a((View) imageView, (Object) this.f10842a);
                    } else {
                        return;
                    }
                } else {
                    this.f10842a.mo25983c();
                    this.f10842a.mo25980a(new C13834b(imageView.getResources()).mo25916a(this.f10855n).mo25917a(this.f10860s).mo25924c(this.f10857p).mo25925c(this.f10862u).mo25927d(this.f10858q).mo25928d(this.f10863v).mo25921b(this.f10856o).mo25922b(this.f10861t).mo25913a(this.f10854m).mo25915a(this.f10865x).mo25914a(this.f10866y).mo25930e(this.f10864w).mo25929e(this.f10859r).mo25919a(this.f10835A).mo25931f(this.f10836B).mo25918a(this.f10867z).mo25912a());
                    C14229b[] a3 = m9765a(this.f10848g, this.f10850i, this.f10851j, this.f10846e);
                    if (a3 != null && a3.length != 0) {
                        C13773e eVar2 = (C13773e) ((C13773e) ((C13773e) ((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25762c(this.f10838D)).mo25751a(this.f10847f)).mo25755a((REQUEST[]) a3)).mo25759b(this.f10842a.f36129c)).mo25758b(this.f10839E)).mo25754a(this.f10837C);
                        if (this.f10849h != null) {
                            eVar2.mo25761c(C14229b.fromUri(this.f10849h));
                        }
                        this.f10842a.mo25979a((C13842a) eVar2.mo25763d());
                        this.f10842a.mo25982b();
                    } else {
                        return;
                    }
                }
                if (this.f10852k != 0.0f) {
                    LayoutParams layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        int i = layoutParams.width;
                        int i2 = layoutParams.height;
                        if (this.f10853l) {
                            if (i > 0 && i2 == 0) {
                                double d = (double) i;
                                Double.isNaN(d);
                                double d2 = d * 1.0d;
                                double d3 = (double) this.f10852k;
                                Double.isNaN(d3);
                                i2 = (int) ((d2 / d3) + 0.5d);
                                if (!(i == -1 || i2 == -1)) {
                                    layoutParams.width = i;
                                    layoutParams.height = i2;
                                    imageView.requestLayout();
                                }
                            }
                        } else if (i2 > 0 && i == 0) {
                            i = (int) ((((float) i2) * this.f10852k) + 0.5f);
                            layoutParams.width = i;
                            layoutParams.height = i2;
                            imageView.requestLayout();
                        }
                        i = -1;
                        i2 = -1;
                        layoutParams.width = i;
                        layoutParams.height = i2;
                        imageView.requestLayout();
                    }
                }
                imageView.setImageDrawable(this.f10842a.mo25985e());
            }
        }
    }

    /* renamed from: a */
    public final C3848a mo9217a() {
        if (this.f10867z == null) {
            this.f10867z = new C13837e();
        }
        this.f10867z.mo25937a(true);
        return this;
    }

    /* renamed from: a */
    private C3848a m9761a(Drawable drawable) {
        this.f10855n = drawable;
        return this;
    }

    /* renamed from: a */
    public static C3848a m9760a(Context context) {
        if (context != null) {
            return new C3848a(context);
        }
        throw new IllegalArgumentException("appContext == null");
    }

    private C3848a(Context context) {
        this.f10843b = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m9764a(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C3848a mo9218a(int i) {
        return m9761a(this.f10843b.getResources().getDrawable(i));
    }

    /* renamed from: a */
    public final C3848a mo9220a(int i, int i2) {
        this.f10851j = new C13952d(i, i2);
        return this;
    }

    /* renamed from: a */
    private static C14229b m9763a(Uri uri, C13952d dVar) {
        if (uri == null) {
            return null;
        }
        C14232c a = C14232c.m29169a(uri);
        if (dVar != null) {
            a.mo26453a(dVar);
        }
        return a.mo26449a();
    }

    /* renamed from: a */
    private static C13818b m9762a(ScaleType scaleType, C13818b bVar) {
        switch (C38491.f10868a[scaleType.ordinal()]) {
            case 1:
                return C13818b.f36065e;
            case 2:
                return C13818b.f36067g;
            case 3:
                return C13818b.f36066f;
            case 4:
                return C13818b.f36063c;
            case 5:
                return C13818b.f36062b;
            case 6:
                return C13818b.f36064d;
            case 7:
                return C13818b.f36061a;
            case 8:
                return C13818b.f36068h;
            default:
                return bVar;
        }
    }

    /* renamed from: a */
    public final C3848a mo9219a(int i, float f) {
        if (this.f10867z == null) {
            this.f10867z = new C13837e();
        }
        this.f10867z.mo25935a(i, f);
        return this;
    }

    /* renamed from: a */
    private static C14229b[] m9765a(Uri uri, ImageModel imageModel, C13952d dVar, C14234d dVar2) {
        if (uri == null && (imageModel == null || C9414h.m18630a(imageModel.getUrls()))) {
            return new C14229b[0];
        }
        ArrayList arrayList = new ArrayList();
        C14229b a = m9763a(uri, dVar);
        if (a != null) {
            arrayList.add(a);
        }
        if (imageModel != null && !C9414h.m18630a(imageModel.getUrls())) {
            C3853c cVar = new C3853c();
            for (String str : imageModel.getUrls()) {
                if (!C9431p.m18664a(str)) {
                    C14232c a2 = C14232c.m29169a(Uri.parse(str));
                    if (dVar2 != null) {
                        a2.mo26458a(dVar2);
                    }
                    if (dVar != null) {
                        a2.mo26453a(dVar);
                    }
                    cVar.mo9234a(a2);
                    arrayList.add(a2.mo26449a());
                }
            }
        }
        if (arrayList.size() == 0) {
            return new C14229b[0];
        }
        return (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
    }
}

package com.p683ss.android.ugc.awemepushlib.widget;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.C0621ad;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.widget.C1119r;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.awemepushlib.interaction.C48444c;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.widget.a */
public final class C48486a extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    final C1119r f121909a;

    /* renamed from: b */
    final ViewConfiguration f121910b;

    /* renamed from: c */
    View f121911c;

    /* renamed from: d */
    final Handler f121912d = new C9381g(Looper.getMainLooper(), new C9382a() {
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: e */
    final int f121913e;

    /* renamed from: f */
    final int f121914f;

    /* renamed from: g */
    final long f121915g;

    /* renamed from: h */
    final boolean f121916h;

    /* renamed from: i */
    final ImageView f121917i;

    /* renamed from: j */
    final boolean f121918j;

    /* renamed from: k */
    int f121919k;

    /* renamed from: l */
    JSONObject f121920l;

    /* renamed from: m */
    final Runnable f121921m = new Runnable() {
        public final void run() {
            C48486a.this.mo95969a();
        }
    };

    /* renamed from: n */
    final Runnable f121922n = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(7:(3:0|1|(1:3))|4|(2:7|8)|9|10|(1:12)|13) */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Throwable -> 0x0039 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r2 = this;
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x000e }
                android.widget.ImageView r0 = r0.f121917i     // Catch:{ Throwable -> 0x000e }
                if (r0 == 0) goto L_0x000e
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x000e }
                android.widget.ImageView r0 = r0.f121917i     // Catch:{ Throwable -> 0x000e }
                r1 = 0
                r0.setImageDrawable(r1)     // Catch:{ Throwable -> 0x000e }
            L_0x000e:
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this
                boolean r0 = r0.f121918j
                if (r0 == 0) goto L_0x002b
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x002b }
                android.content.Context r0 = r0.getContext()     // Catch:{ Throwable -> 0x002b }
                android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x002b }
                java.lang.String r1 = "window"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Throwable -> 0x002b }
                android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Throwable -> 0x002b }
                com.ss.android.ugc.awemepushlib.widget.a r1 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x002b }
                r0.removeView(r1)     // Catch:{ Throwable -> 0x002b }
            L_0x002b:
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x0039 }
                com.ss.android.ugc.awemepushlib.widget.a$a r0 = r0.f121923o     // Catch:{ Throwable -> 0x0039 }
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.awemepushlib.widget.a r0 = com.p683ss.android.ugc.awemepushlib.widget.C48486a.this     // Catch:{ Throwable -> 0x0039 }
                com.ss.android.ugc.awemepushlib.widget.a$a r0 = r0.f121923o     // Catch:{ Throwable -> 0x0039 }
                r0.mo95965a()     // Catch:{ Throwable -> 0x0039 }
            L_0x0038:
                return
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.widget.C48486a.C484915.run():void");
        }
    };

    /* renamed from: o */
    C48492a f121923o;

    /* renamed from: p */
    private boolean f121924p = true;

    /* renamed from: q */
    private final Intent f121925q;

    /* renamed from: r */
    private final C48428b f121926r;

    /* renamed from: s */
    private float f121927s;

    /* renamed from: t */
    private float f121928t;

    /* renamed from: u */
    private C48493b f121929u;

    /* renamed from: com.ss.android.ugc.awemepushlib.widget.a$a */
    public interface C48492a {
        /* renamed from: a */
        void mo95965a();
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.widget.a$b */
    final class C48493b implements Runnable {
        public final void run() {
            if (!C48486a.this.f121916h || !C48486a.this.f121918j) {
                C48486a.this.performClick();
            } else {
                LayoutParams layoutParams = C48486a.this.getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    try {
                        ((WindowManager.LayoutParams) layoutParams).flags = 128;
                        ((WindowManager) C48486a.this.getContext().getSystemService("window")).updateViewLayout(C48486a.this, layoutParams);
                        C48486a.this.f121912d.post(new Runnable() {
                            public final void run() {
                                C48486a.this.performClick();
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        private C48493b() {
        }
    }

    public final void computeScroll() {
        if (this.f121909a.mo3576a(true)) {
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            this.f121909a.mo3578b();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f121924p) {
            this.f121912d.post(new Runnable() {
                public final void run() {
                    C48486a.this.f121911c.setTranslationY((float) (-C48486a.this.f121911c.getHeight()));
                    C48486a.this.f121911c.animate().translationY(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(300).start();
                    C48486a.this.f121912d.postDelayed(C48486a.this.f121921m, C48486a.this.f121915g);
                    C48444c.m104836a(C48486a.this.getContext(), "news_notify_anim_push_show", (long) C48486a.this.f121913e, (long) C48486a.this.f121914f, C48486a.this.f121920l);
                }
            });
            this.f121924p = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo95969a() {
        this.f121911c.animate().translationY((float) (-this.f121911c.getHeight())).setDuration(300).start();
        this.f121912d.postDelayed(this.f121922n, 300);
    }

    public final void setDismissListener(C48492a aVar) {
        this.f121923o = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f121909a.mo3574a(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo95970a(int i) {
        C0621ad.m1696a(getContext()).mo2143a("app_notify_ame", i);
    }

    /* renamed from: b */
    private static String m104917b(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder("0");
        sb.append(i);
        return sb.toString();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        getContext().startActivity(this.f121925q);
        mo95970a(this.f121913e);
        this.f121912d.removeCallbacks(this.f121921m);
        mo95969a();
        C48444c.m104836a(getContext(), "news_notify_anim_push_click", (long) this.f121913e, (long) this.f121914f, this.f121920l);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f121912d.removeCallbacks(this.f121921m);
        this.f121909a.mo3580b(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (C1044i.m2981a(motionEvent)) {
            case 0:
                this.f121927s = x;
                this.f121928t = y;
                this.f121929u = new C48493b();
                break;
            case 1:
                if (Math.abs(x - this.f121927s) >= ((float) this.f121910b.getScaledTouchSlop()) || Math.abs(y - this.f121928t) >= ((float) this.f121910b.getScaledTouchSlop())) {
                    this.f121929u = null;
                } else if (this.f121929u != null) {
                    this.f121929u.run();
                }
                this.f121929u = null;
                break;
            case 2:
                if (Math.abs(x - this.f121927s) >= ((float) this.f121910b.getScaledTouchSlop()) || Math.abs(y - this.f121928t) >= ((float) this.f121910b.getScaledTouchSlop())) {
                    this.f121929u = null;
                    break;
                }
            case 3:
                this.f121929u = null;
                break;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48486a(android.content.Context r5, int r6, com.p683ss.android.ugc.awemepushlib.p2406a.C48428b r7, android.graphics.Bitmap r8, android.content.Intent r9, long r10, boolean r12, int r13) {
        /*
            r4 = this;
            r4.<init>(r5)
            r0 = 1
            r4.f121924p = r0
            com.bytedance.common.utility.b.g r1 = new com.bytedance.common.utility.b.g
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            com.ss.android.ugc.awemepushlib.widget.a$1 r3 = new com.ss.android.ugc.awemepushlib.widget.a$1
            r3.<init>()
            r1.<init>(r2, r3)
            r4.f121912d = r1
            com.ss.android.ugc.awemepushlib.widget.a$4 r1 = new com.ss.android.ugc.awemepushlib.widget.a$4
            r1.<init>()
            r4.f121921m = r1
            com.ss.android.ugc.awemepushlib.widget.a$5 r1 = new com.ss.android.ugc.awemepushlib.widget.a$5
            r1.<init>()
            r4.f121922n = r1
            r4.f121925q = r9
            r4.f121914f = r6
            r4.f121926r = r7
            r4.f121919k = r13
            int r6 = r7.f121792id
            r4.f121913e = r6
            r1 = 0
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0038
            r10 = 5000(0x1388, double:2.4703E-320)
        L_0x0038:
            r4.f121915g = r10
            java.lang.String r6 = "oppo"
            java.lang.String r10 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r10)
            r4.f121916h = r6
            r4.f121918j = r12
            r6 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r10.<init>()     // Catch:{ Throwable -> 0x006f }
            r4.f121920l = r10     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.f121920l     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "isWindowMode"
            r10.put(r11, r12)     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.f121920l     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "with_pic"
            java.lang.String r12 = "message_with_pic"
            boolean r12 = r9.getBooleanExtra(r12, r6)     // Catch:{ Throwable -> 0x006f }
            r10.put(r11, r12)     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r10 = r4.f121920l     // Catch:{ Throwable -> 0x006f }
            java.lang.String r11 = "download_pic"
            java.lang.String r12 = "message_download_pic"
            boolean r9 = r9.getBooleanExtra(r12, r6)     // Catch:{ Throwable -> 0x006f }
            r10.put(r11, r9)     // Catch:{ Throwable -> 0x006f }
        L_0x006f:
            java.lang.String r9 = r7.title
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x007e
            r9 = 2132541961(0x7f1c0209, float:2.0737013E38)
            java.lang.String r9 = r5.getString(r9)
        L_0x007e:
            boolean r10 = r4.f121916h
            r11 = 2132023369(0x7f141849, float:1.9685184E38)
            r12 = 2132018494(0x7f14053e, float:1.9675296E38)
            r13 = 2132023392(0x7f141860, float:1.968523E38)
            if (r10 == 0) goto L_0x00dd
            com.ss.android.ugc.awemepushlib.manager.a r10 = com.p683ss.android.ugc.awemepushlib.manager.C48479a.m104895a()
            int r10 = r10.f121884i
            if (r10 <= 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            if (r0 != 0) goto L_0x00dd
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r5)
            r0 = 2132215458(0x7f1706a2, float:2.0074787E38)
            android.view.View r6 = r10.inflate(r0, r4, r6)
            r4.f121911c = r6
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r10 = "HH:mm"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r6.<init>(r10, r0)
            android.view.View r10 = r4.f121911c
            android.view.View r10 = r10.findViewById(r11)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.util.Date r11 = new java.util.Date
            r11.<init>()
            java.lang.String r6 = r6.format(r11)
            r10.setText(r6)
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r12)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
            goto L_0x0189
        L_0x00dd:
            int r10 = r4.f121919k
            r0 = 21
            r1 = 11
            if (r10 == r1) goto L_0x00e9
            int r10 = r4.f121919k
            if (r10 != r0) goto L_0x0164
        L_0x00e9:
            if (r8 == 0) goto L_0x0164
            boolean r10 = r7.functionalPush
            if (r10 != 0) goto L_0x0164
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r5)
            int r2 = r4.f121919k
            if (r2 != r1) goto L_0x00ff
            r2 = 2132215648(0x7f170760, float:2.0075172E38)
            goto L_0x0102
        L_0x00ff:
            r2 = 2132215650(0x7f170762, float:2.0075176E38)
        L_0x0102:
            android.view.View r6 = r12.inflate(r2, r4, r6)
            r4.f121911c = r6
            int r6 = r4.f121919k
            if (r6 != r0) goto L_0x0117
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
        L_0x0117:
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r10.get(r1)
            java.lang.String r12 = m104917b(r12)
            r11.append(r12)
            java.lang.String r12 = ":"
            r11.append(r12)
            r12 = 12
            int r10 = r10.get(r12)
            java.lang.String r10 = m104917b(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r6.setText(r10)
            android.view.View r6 = r4.f121911c
            r10 = 2132024279(0x7f141bd7, float:1.968703E38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            goto L_0x0189
        L_0x0164:
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r5)
            r11 = 2132215443(0x7f170693, float:2.0074756E38)
            android.view.View r6 = r10.inflate(r11, r4, r6)
            r4.f121911c = r6
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r9)
            android.view.View r6 = r4.f121911c
            android.view.View r6 = r6.findViewById(r12)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r7.text
            r6.setText(r7)
        L_0x0189:
            android.view.View r6 = r4.f121911c
            r4.addView(r6)
            r6 = 2132019629(0x7f1409ad, float:1.9677598E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4.f121917i = r6
            if (r8 == 0) goto L_0x01a1
            android.widget.ImageView r6 = r4.f121917i
            r6.setImageBitmap(r8)
            goto L_0x01b0
        L_0x01a1:
            android.widget.ImageView r6 = r4.f121917i
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r6.setScaleType(r7)
            android.widget.ImageView r6 = r4.f121917i
            r7 = 2131955413(0x7f130ed5, float:1.9547353E38)
            r6.setImageResource(r7)
        L_0x01b0:
            com.ss.android.ugc.awemepushlib.widget.a$2 r6 = new com.ss.android.ugc.awemepushlib.widget.a$2
            r6.<init>()
            android.support.v4.widget.r r6 = android.support.p030v4.widget.C1119r.m3272a(r4, r6)
            r4.f121909a = r6
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            r4.f121910b = r5
            r4.setOnClickListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.widget.C48486a.<init>(android.content.Context, int, com.ss.android.ugc.awemepushlib.a.b, android.graphics.Bitmap, android.content.Intent, long, boolean, int):void");
    }
}

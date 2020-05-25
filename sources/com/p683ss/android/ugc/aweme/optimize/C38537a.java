package com.p683ss.android.ugc.aweme.optimize;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p683ss.p2566d.C51295a;
import com.p683ss.p2566d.C51297b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.optimize.a */
public final class C38537a {

    /* renamed from: b */
    public static Handler f98027b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static C38537a f98028c;

    /* renamed from: d */
    public static boolean f98029d;

    /* renamed from: e */
    public static final C38538a f98030e = new C38538a(null);

    /* renamed from: a */
    TextView f98031a;

    /* renamed from: f */
    private WindowManager f98032f;

    /* renamed from: g */
    private Activity f98033g;

    /* renamed from: h */
    private final C38541b f98034h = new C38541b(this);

    /* renamed from: com.ss.android.ugc.aweme.optimize.a$a */
    public static final class C38538a {

        /* renamed from: com.ss.android.ugc.aweme.optimize.a$a$a */
        public static final class C38539a implements C51297b {

            /* renamed from: com.ss.android.ugc.aweme.optimize.a$a$a$a */
            static final class C38540a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ float f98035a;

                C38540a(float f) {
                    this.f98035a = f;
                }

                public final void run() {
                    TextView textView;
                    int i;
                    C38537a a = C38538a.m85875a();
                    if (a == null) {
                        C52711k.m112234a();
                    }
                    float f = this.f98035a;
                    if (f > 600.0f) {
                        textView = a.f98031a;
                        if (textView == null) {
                            C52711k.m112234a();
                        }
                        i = -65536;
                    } else {
                        textView = a.f98031a;
                        if (textView == null) {
                            C52711k.m112234a();
                        }
                        i = -16711936;
                    }
                    textView.setBackgroundColor(i);
                    TextView textView2 = a.f98031a;
                    if (textView2 == null) {
                        C52711k.m112234a();
                    }
                    Drawable background = textView2.getBackground();
                    C52711k.m112236a((Object) background, "electricView!!.background");
                    background.setAlpha(153);
                    TextView textView3 = a.f98031a;
                    if (textView3 == null) {
                        C52711k.m112234a();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append(" ma");
                    textView3.setText(sb.toString());
                }
            }

            C38539a() {
            }

            /* renamed from: a */
            public final void mo48202a() {
                C38537a a = C38538a.m85875a();
                if (a == null) {
                    C52711k.m112234a();
                }
                TextView textView = a.f98031a;
                if (textView == null) {
                    C52711k.m112234a();
                }
                textView.setOnTouchListener(null);
                a.mo78445a(true);
                C38538a.m85876a(false);
            }

            /* renamed from: a */
            public final void mo48203a(float f, float f2, long j) {
                C38537a.f98027b.post(new C38540a(f));
            }
        }

        private C38538a() {
        }

        /* renamed from: a */
        public static C38537a m85875a() {
            return C38537a.f98028c;
        }

        public /* synthetic */ C38538a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m85876a(boolean z) {
            C38537a.f98029d = z;
        }

        /* renamed from: a */
        public final void mo78446a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            if (!C38537a.f98029d) {
                m85876a(true);
                C38537a.f98028c = new C38537a(activity);
                C51295a.m110290a(activity, new C38539a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.optimize.a$b */
    public static final class C38541b extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C38537a f98036a;

        C38541b(C38537a aVar) {
            this.f98036a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            C52711k.m112240b(motionEvent, "e");
            this.f98036a.mo78445a(false);
            return super.onDoubleTap(motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo78445a(boolean z) {
        TextView textView = this.f98031a;
        if (textView == null) {
            C52711k.m112234a();
        }
        textView.setVisibility(8);
        if (z) {
            WindowManager windowManager = this.f98032f;
            if (windowManager == null) {
                C52711k.m112234a();
            }
            windowManager.removeView(this.f98031a);
        }
    }

    public C38537a(Activity activity) {
        int i;
        C52711k.m112240b(activity, "context");
        this.f98033g = activity;
        Activity activity2 = this.f98033g;
        if (activity2 == null) {
            C52711k.m112234a();
        }
        this.f98031a = new TextView(activity2.getApplicationContext());
        LayoutParams layoutParams = new LayoutParams(25, 25);
        TextView textView = this.f98031a;
        if (textView == null) {
            C52711k.m112234a();
        }
        textView.setLayoutParams(layoutParams);
        TextView textView2 = this.f98031a;
        if (textView2 == null) {
            C52711k.m112234a();
        }
        textView2.setBackgroundColor(-7829368);
        TextView textView3 = this.f98031a;
        if (textView3 == null) {
            C52711k.m112234a();
        }
        textView3.setGravity(17);
        TextView textView4 = this.f98031a;
        if (textView4 == null) {
            C52711k.m112234a();
        }
        textView4.setPadding(10, 10, 10, 10);
        TextView textView5 = this.f98031a;
        if (textView5 == null) {
            C52711k.m112234a();
        }
        textView5.setTextColor(-1);
        TextView textView6 = this.f98031a;
        if (textView6 == null) {
            C52711k.m112234a();
        }
        textView6.setTextSize(19.0f);
        TextView textView7 = this.f98031a;
        if (textView7 == null) {
            C52711k.m112234a();
        }
        textView7.setText("");
        TextView textView8 = this.f98031a;
        if (textView8 == null) {
            C52711k.m112234a();
        }
        Object systemService = textView8.getContext().getSystemService("window");
        if (systemService != null) {
            this.f98032f = (WindowManager) systemService;
            TextView textView9 = this.f98031a;
            if (textView9 == null) {
                C52711k.m112234a();
            }
            View view = textView9;
            if (VERSION.SDK_INT >= 26) {
                i = 2038;
            } else {
                i = 2002;
            }
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, i, 8, -3);
            layoutParams2.gravity = 8388659;
            layoutParams2.x = 100;
            layoutParams2.y = 100;
            WindowManager windowManager = this.f98032f;
            if (windowManager != null) {
                windowManager.addView(view, layoutParams2);
            }
            view.setOnTouchListener(new C38543c(layoutParams2, this.f98032f, new GestureDetector(view.getContext(), this.f98034h)));
            view.setHapticFeedbackEnabled(false);
            TextView textView10 = this.f98031a;
            if (textView10 == null) {
                C52711k.m112234a();
            }
            textView10.setVisibility(0);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.WindowManager");
    }
}

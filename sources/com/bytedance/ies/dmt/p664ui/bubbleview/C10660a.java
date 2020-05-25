package com.bytedance.ies.dmt.p664ui.bubbleview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p665a.C10640e;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a */
public final class C10660a extends PopupWindow {

    /* renamed from: j */
    public static volatile int f28346j;

    /* renamed from: k */
    public static final C10662b f28347k = new C10662b(null);

    /* renamed from: A */
    private String f28348A = "";

    /* renamed from: B */
    private int f28349B;

    /* renamed from: C */
    private float f28350C = 13.0f;

    /* renamed from: D */
    private int f28351D;

    /* renamed from: E */
    private Typeface f28352E;

    /* renamed from: F */
    private boolean f28353F = true;

    /* renamed from: G */
    private float f28354G = 12.0f;

    /* renamed from: H */
    private int f28355H;

    /* renamed from: I */
    private int f28356I;

    /* renamed from: J */
    private boolean f28357J = true;

    /* renamed from: K */
    private boolean f28358K = true;

    /* renamed from: L */
    private boolean f28359L;

    /* renamed from: M */
    private TextView f28360M;

    /* renamed from: N */
    private boolean f28361N;

    /* renamed from: O */
    private int f28362O;

    /* renamed from: P */
    private Activity f28363P;

    /* renamed from: Q */
    private View f28364Q;

    /* renamed from: R */
    private C10640e<Point> f28365R;

    /* renamed from: S */
    private final Runnable f28366S;

    /* renamed from: a */
    public int f28367a;

    /* renamed from: b */
    public boolean f28368b;

    /* renamed from: c */
    public long f28369c = 200;

    /* renamed from: d */
    public int f28370d;

    /* renamed from: e */
    public DmtBubbleLayout f28371e;

    /* renamed from: f */
    public AnimatorSet f28372f;

    /* renamed from: g */
    public C10663c f28373g;

    /* renamed from: h */
    public C10665e f28374h;

    /* renamed from: i */
    public C10664d f28375i;

    /* renamed from: l */
    private float f28376l;

    /* renamed from: m */
    private float f28377m;

    /* renamed from: n */
    private int f28378n;

    /* renamed from: o */
    private int f28379o;

    /* renamed from: p */
    private boolean f28380p = true;

    /* renamed from: q */
    private boolean f28381q;

    /* renamed from: r */
    private boolean f28382r;

    /* renamed from: s */
    private int f28383s;

    /* renamed from: t */
    private boolean f28384t;

    /* renamed from: u */
    private int f28385u;

    /* renamed from: v */
    private int f28386v;

    /* renamed from: w */
    private long f28387w = 5000;

    /* renamed from: x */
    private boolean f28388x = true;

    /* renamed from: y */
    private int f28389y;

    /* renamed from: z */
    private int f28390z;

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$a */
    public static final class C10661a {

        /* renamed from: A */
        public boolean f28391A = true;

        /* renamed from: B */
        public boolean f28392B;

        /* renamed from: C */
        public int f28393C;

        /* renamed from: D */
        public boolean f28394D = true;

        /* renamed from: E */
        public Activity f28395E;

        /* renamed from: a */
        public int f28396a;

        /* renamed from: b */
        public float f28397b;

        /* renamed from: c */
        public int f28398c;

        /* renamed from: d */
        public int f28399d;

        /* renamed from: e */
        public boolean f28400e = true;

        /* renamed from: f */
        public boolean f28401f;

        /* renamed from: g */
        public boolean f28402g;

        /* renamed from: h */
        public boolean f28403h;

        /* renamed from: i */
        public int f28404i;

        /* renamed from: j */
        public int f28405j;

        /* renamed from: k */
        public long f28406k = 800;

        /* renamed from: l */
        public long f28407l = 5000;

        /* renamed from: m */
        public boolean f28408m = true;

        /* renamed from: n */
        public View f28409n;

        /* renamed from: o */
        public int f28410o;

        /* renamed from: p */
        public int f28411p;

        /* renamed from: q */
        public String f28412q = "";

        /* renamed from: r */
        public int f28413r;

        /* renamed from: s */
        public float f28414s = 13.0f;

        /* renamed from: t */
        public Typeface f28415t;

        /* renamed from: u */
        public int f28416u;

        /* renamed from: v */
        public C10663c f28417v;

        /* renamed from: w */
        public C10664d f28418w;

        /* renamed from: x */
        public C10665e f28419x;

        /* renamed from: y */
        public boolean f28420y = true;

        /* renamed from: z */
        public float f28421z = 12.0f;

        /* renamed from: a */
        public final C10660a mo19014a() {
            return new C10660a(this);
        }

        /* renamed from: a */
        public final C10661a mo19009a(int i) {
            this.f28416u = i;
            return this;
        }

        /* renamed from: b */
        public final C10661a mo19015b(int i) {
            this.f28413r = i;
            return this;
        }

        /* renamed from: c */
        public final C10661a mo19017c(boolean z) {
            this.f28400e = z;
            return this;
        }

        /* renamed from: d */
        public final C10661a mo19018d(boolean z) {
            this.f28408m = false;
            return this;
        }

        /* renamed from: a */
        public final C10661a mo19008a(float f) {
            this.f28421z = 8.0f;
            return this;
        }

        /* renamed from: b */
        public final C10661a mo19016b(boolean z) {
            this.f28420y = true;
            return this;
        }

        /* renamed from: a */
        public final C10661a mo19010a(long j) {
            this.f28407l = j;
            return this;
        }

        /* renamed from: a */
        public final C10661a mo19011a(View view) {
            C52711k.m112240b(view, "view");
            this.f28409n = view;
            return this;
        }

        public C10661a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            this.f28395E = activity;
        }

        /* renamed from: a */
        public final C10661a mo19012a(String str) {
            C52711k.m112240b(str, "str");
            this.f28412q = str;
            return this;
        }

        /* renamed from: a */
        public final C10661a mo19013a(boolean z) {
            this.f28391A = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$b */
    public static final class C10662b {
        private C10662b() {
        }

        public /* synthetic */ C10662b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$c */
    public interface C10663c {
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$d */
    public interface C10664d {
        /* renamed from: a */
        void mo19019a();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$e */
    public interface C10665e {
        /* renamed from: a */
        void mo19020a();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$f */
    static final class C10666f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10660a f28422a;

        /* renamed from: b */
        final /* synthetic */ DmtBubbleLayout f28423b;

        /* renamed from: c */
        final /* synthetic */ boolean f28424c;

        C10666f(C10660a aVar, DmtBubbleLayout dmtBubbleLayout, boolean z) {
            this.f28422a = aVar;
            this.f28423b = dmtBubbleLayout;
            this.f28424c = z;
        }

        public final void run() {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            if (this.f28422a.f28372f != null) {
                int i3 = this.f28422a.f28367a;
                if (i3 == 3) {
                    i2 = (int) (this.f28423b.getX() + ((float) this.f28423b.getMeasuredWidth()));
                    i = (int) (this.f28423b.getY() + C10660a.m21465a(this.f28422a).getBubbleOffset());
                } else if (i3 == 5) {
                    i2 = (int) this.f28423b.getX();
                    i = (int) (this.f28423b.getY() + C10660a.m21465a(this.f28422a).getBubbleOffset());
                } else if (i3 == 48) {
                    i2 = (int) (this.f28423b.getX() + C10660a.m21465a(this.f28422a).getBubbleOffset());
                    i = (int) (this.f28423b.getY() + ((float) this.f28423b.getMeasuredHeight()));
                } else if (i3 != 80) {
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = (int) (this.f28423b.getX() + C10660a.m21465a(this.f28422a).getBubbleOffset());
                    i = (int) this.f28423b.getY();
                }
                this.f28423b.setPivotY((float) i);
                this.f28423b.setPivotX((float) i2);
                DmtBubbleLayout dmtBubbleLayout = this.f28423b;
                String str = "scaleX";
                float[] fArr = new float[2];
                if (this.f28424c) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (this.f28424c) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtBubbleLayout, str, fArr);
                C52711k.m112236a((Object) ofFloat, "scaleX");
                ofFloat.setDuration(200);
                DmtBubbleLayout dmtBubbleLayout2 = this.f28423b;
                String str2 = "scaleY";
                float[] fArr2 = new float[2];
                if (this.f28424c) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                fArr2[0] = f3;
                if (this.f28424c) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                fArr2[1] = f4;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtBubbleLayout2, str2, fArr2);
                C52711k.m112236a((Object) ofFloat2, "scaleY");
                ofFloat2.setDuration(200);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f28423b, "translationY", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat3, "translationDownAnimL");
                if (this.f28424c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f28423b, "translationY", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat4, "translationUpAnimL");
                if (this.f28424c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f28423b, "translationX", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat5, "translationLeftAnimL");
                if (this.f28424c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f28423b, "translationX", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat6, "translationRightAnimL");
                if (this.f28424c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f28423b, "translationY", new float[]{0.0f, 10.0f});
                C52711k.m112236a((Object) ofFloat7, "translationDownAnimS");
                if (this.f28424c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f28423b, "translationY", new float[]{0.0f, -10.0f});
                C52711k.m112236a((Object) ofFloat8, "translationUpAnimS");
                if (this.f28424c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f28423b, "translationX", new float[]{0.0f, -10.0f});
                C52711k.m112236a((Object) ofFloat9, "translationLeftAnimS");
                if (this.f28424c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f28423b, "translationX", new float[]{0.0f, 10.0f});
                C52711k.m112236a((Object) ofFloat10, "translationRightAnimS");
                if (this.f28424c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f28423b.setVisibility(0);
                if (this.f28424c) {
                    int i4 = this.f28422a.f28367a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C10673c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet = this.f28422a.f28372f;
                        if (animatorSet != null) {
                            Builder play = animatorSet.play(ofFloat);
                            if (play != null) {
                                Builder with = play.with(ofFloat2);
                                if (with != null) {
                                    Builder with2 = with.with(ofFloat9);
                                    if (with2 != null) {
                                        with2.before(ofFloat6);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new C10673c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f28422a.f28372f;
                        if (animatorSet2 != null) {
                            Builder play2 = animatorSet2.play(ofFloat);
                            if (play2 != null) {
                                Builder with3 = play2.with(ofFloat2);
                                if (with3 != null) {
                                    Builder with4 = with3.with(ofFloat10);
                                    if (with4 != null) {
                                        with4.before(ofFloat5);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new C10673c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f28422a.f28372f;
                        if (animatorSet3 != null) {
                            Builder play3 = animatorSet3.play(ofFloat);
                            if (play3 != null) {
                                Builder with5 = play3.with(ofFloat2);
                                if (with5 != null) {
                                    Builder with6 = with5.with(ofFloat8);
                                    if (with6 != null) {
                                        with6.before(ofFloat3);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new C10673c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f28422a.f28372f;
                        if (animatorSet4 != null) {
                            Builder play4 = animatorSet4.play(ofFloat);
                            if (play4 != null) {
                                Builder with7 = play4.with(ofFloat2);
                                if (with7 != null) {
                                    Builder with8 = with7.with(ofFloat7);
                                    if (with8 != null) {
                                        with8.before(ofFloat4);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i5 = this.f28422a.f28367a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C10672b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f28422a.f28372f;
                        if (animatorSet5 != null) {
                            Builder play5 = animatorSet5.play(ofFloat);
                            if (play5 != null) {
                                Builder with9 = play5.with(ofFloat2);
                                if (with9 != null) {
                                    Builder with10 = with9.with(ofFloat6);
                                    if (with10 != null) {
                                        with10.after(ofFloat9);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new C10672b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f28422a.f28372f;
                        if (animatorSet6 != null) {
                            Builder play6 = animatorSet6.play(ofFloat);
                            if (play6 != null) {
                                Builder with11 = play6.with(ofFloat2);
                                if (with11 != null) {
                                    Builder with12 = with11.with(ofFloat5);
                                    if (with12 != null) {
                                        with12.after(ofFloat10);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new C10672b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f28422a.f28372f;
                        if (animatorSet7 != null) {
                            Builder play7 = animatorSet7.play(ofFloat);
                            if (play7 != null) {
                                Builder with13 = play7.with(ofFloat2);
                                if (with13 != null) {
                                    Builder with14 = with13.with(ofFloat3);
                                    if (with14 != null) {
                                        with14.after(ofFloat8);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new C10672b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f28422a.f28372f;
                        if (animatorSet8 != null) {
                            Builder play8 = animatorSet8.play(ofFloat);
                            if (play8 != null) {
                                Builder with15 = play8.with(ofFloat2);
                                if (with15 != null) {
                                    Builder with16 = with15.with(ofFloat4);
                                    if (with16 != null) {
                                        with16.after(ofFloat7);
                                    }
                                }
                            }
                        }
                    }
                }
                AnimatorSet animatorSet9 = this.f28422a.f28372f;
                if (animatorSet9 != null) {
                    animatorSet9.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a */
                        final /* synthetic */ C10666f f28425a;

                        {
                            this.f28425a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C52711k.m112240b(animator, "animation");
                            super.onAnimationEnd(animator);
                            if (!this.f28425a.f28424c) {
                                this.f28425a.f28423b.setVisibility(8);
                                C10664d dVar = this.f28425a.f28422a.f28375i;
                                if (dVar != null) {
                                    dVar.mo19019a();
                                }
                                this.f28425a.f28422a.mo19001b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            C52711k.m112240b(animator, "animation");
                            super.onAnimationStart(animator);
                            if (this.f28425a.f28424c) {
                                C10665e eVar = this.f28425a.f28422a.f28374h;
                                if (eVar != null) {
                                    eVar.mo19020a();
                                }
                                this.f28425a.f28423b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f28422a.f28368b) {
                    AnimatorSet animatorSet10 = this.f28422a.f28372f;
                    if (animatorSet10 != null) {
                        animatorSet10.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                }
                AnimatorSet animatorSet11 = this.f28422a.f28372f;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$g */
    static final class C10668g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10660a f28426a;

        C10668g(C10660a aVar) {
            this.f28426a = aVar;
        }

        public final void run() {
            this.f28426a.mo19000a(false, this.f28426a.f28367a);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$h */
    static final class C10669h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10660a f28427a;

        C10669h(C10660a aVar) {
            this.f28427a = aVar;
        }

        public final void onClick(View view) {
            this.f28427a.dismiss();
        }
    }

    /* renamed from: a */
    private static int m21464a(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i == 48) {
                return 3;
            }
            if (i == 80) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: c */
    public final int mo19002c() {
        mo18996a();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        return contentView.getMeasuredHeight();
    }

    /* renamed from: d */
    public final int mo19003d() {
        mo18996a();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f28361N) {
            mo19000a(false, this.f28367a);
            getContentView().removeCallbacks(this.f28366S);
            this.f28385u = 0;
            this.f28386v = 0;
        }
    }

    /* renamed from: a */
    public final void mo18996a() {
        if (this.f28389y == 0 || this.f28390z == 0) {
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f28389y, 1073741824), MeasureSpec.makeMeasureSpec(this.f28390z, 1073741824));
    }

    /* renamed from: b */
    public final void mo19001b() {
        AnimatorSet animatorSet = this.f28372f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f28372f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f28372f = null;
        if (!this.f28363P.isFinishing() && isShowing()) {
            try {
                C10670b.m21492a(this);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final int mo19005e() {
        mo18996a();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        DmtBubbleLayout dmtBubbleLayout = this.f28371e;
        if (dmtBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        return measuredWidth - (dmtBubbleLayout.getPADDING() * 4);
    }

    /* renamed from: f */
    public final void mo19006f() {
        if (!this.f28361N) {
            f28346j--;
            DmtBubbleLayout dmtBubbleLayout = this.f28371e;
            if (dmtBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.setVisibility(8);
            mo19001b();
            getContentView().removeCallbacks(this.f28366S);
            this.f28385u = 0;
            this.f28386v = 0;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtBubbleLayout m21465a(C10660a aVar) {
        DmtBubbleLayout dmtBubbleLayout = aVar.f28371e;
        if (dmtBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        return dmtBubbleLayout;
    }

    /* renamed from: a */
    private final void m21466a(View view) {
        this.f28371e = new DmtBubbleLayout(this.f28363P);
        DmtBubbleLayout dmtBubbleLayout = this.f28371e;
        if (dmtBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout.setBackgroundColor(0);
        DmtBubbleLayout dmtBubbleLayout2 = this.f28371e;
        if (dmtBubbleLayout2 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout2.addView(view);
        DmtBubbleLayout dmtBubbleLayout3 = this.f28371e;
        if (dmtBubbleLayout3 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout3.setGravity(17);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        DmtBubbleLayout dmtBubbleLayout4 = this.f28371e;
        if (dmtBubbleLayout4 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout4.setLayoutParams(marginLayoutParams);
        DmtBubbleLayout dmtBubbleLayout5 = this.f28371e;
        if (dmtBubbleLayout5 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout5.setVisibility(8);
        if (this.f28378n != 0) {
            DmtBubbleLayout dmtBubbleLayout6 = this.f28371e;
            if (dmtBubbleLayout6 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout6.setMBgColor(this.f28378n);
        }
        DmtBubbleLayout dmtBubbleLayout7 = this.f28371e;
        if (dmtBubbleLayout7 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout7.setMNeedPath(this.f28380p);
        DmtBubbleLayout dmtBubbleLayout8 = this.f28371e;
        if (dmtBubbleLayout8 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout8.setMNeedArrow(this.f28353F);
        DmtBubbleLayout dmtBubbleLayout9 = this.f28371e;
        if (dmtBubbleLayout9 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout9.setMNeedPressFade(this.f28381q);
        DmtBubbleLayout dmtBubbleLayout10 = this.f28371e;
        if (dmtBubbleLayout10 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout10.setMNeedShadow(this.f28382r);
        DmtBubbleLayout dmtBubbleLayout11 = this.f28371e;
        if (dmtBubbleLayout11 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout11.setMShadowColor(this.f28383s);
        DmtBubbleLayout dmtBubbleLayout12 = this.f28371e;
        if (dmtBubbleLayout12 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout12.setOnClickListener(new C10669h(this));
        DmtBubbleLayout dmtBubbleLayout13 = this.f28371e;
        if (dmtBubbleLayout13 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        setContentView(dmtBubbleLayout13);
        getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
    }

    public C10660a(C10661a aVar) {
        C52711k.m112240b(aVar, "builder");
        this.f28363P = aVar.f28395E;
        this.f28367a = aVar.f28396a;
        this.f28377m = aVar.f28397b;
        this.f28378n = aVar.f28398c;
        this.f28379o = aVar.f28399d;
        this.f28380p = aVar.f28400e;
        this.f28381q = aVar.f28401f;
        this.f28368b = aVar.f28402g;
        this.f28384t = aVar.f28403h;
        this.f28385u = aVar.f28404i;
        this.f28386v = aVar.f28405j;
        this.f28369c = aVar.f28406k;
        this.f28387w = aVar.f28407l;
        this.f28388x = aVar.f28408m;
        this.f28364Q = aVar.f28409n;
        this.f28390z = aVar.f28411p;
        this.f28389y = aVar.f28410o;
        this.f28348A = aVar.f28412q;
        this.f28349B = aVar.f28413r;
        this.f28350C = aVar.f28414s;
        this.f28351D = aVar.f28416u;
        this.f28352E = aVar.f28415t;
        this.f28373g = aVar.f28417v;
        this.f28375i = aVar.f28418w;
        this.f28374h = aVar.f28419x;
        this.f28353F = aVar.f28420y;
        this.f28354G = aVar.f28421z;
        this.f28357J = aVar.f28391A;
        this.f28382r = aVar.f28392B;
        this.f28383s = aVar.f28393C;
        this.f28358K = aVar.f28394D;
        this.f28370d = (int) C9432q.m18687b((Context) this.f28363P, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f28357J);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f28388x || this.f28364Q == null) {
            this.f28360M = new DmtTextView(this.f28363P);
            if (this.f28351D != 0) {
                TextView textView = this.f28360M;
                if (textView == null) {
                    C52711k.m112237a("mTextView");
                }
                textView.setTextColor(this.f28351D);
            } else {
                TextView textView2 = this.f28360M;
                if (textView2 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView2.setTextColor(this.f28363P.getResources().getColor(R.color.aoe));
            }
            TextView textView3 = this.f28360M;
            if (textView3 == null) {
                C52711k.m112237a("mTextView");
            }
            textView3.setTextSize(1, 13.0f);
            if (VERSION.SDK_INT >= 17) {
                TextView textView4 = this.f28360M;
                if (textView4 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView4.setTextAlignment(5);
            }
            TextView textView5 = this.f28360M;
            if (textView5 == null) {
                C52711k.m112237a("mTextView");
            }
            textView5.setLayoutParams(new LayoutParams(-2, -2));
            TextView textView6 = this.f28360M;
            if (textView6 == null) {
                C52711k.m112237a("mTextView");
            }
            textView6.setGravity(17);
            TextView textView7 = this.f28360M;
            if (textView7 == null) {
                C52711k.m112237a("mTextView");
            }
            textView7.setMaxWidth((int) C9432q.m18687b((Context) this.f28363P, 197.0f));
            TextView textView8 = this.f28360M;
            if (textView8 == null) {
                C52711k.m112237a("mTextView");
            }
            textView8.setMaxLines(2);
            TextView textView9 = this.f28360M;
            if (textView9 == null) {
                C52711k.m112237a("mTextView");
            }
            m21466a((View) textView9);
            this.f28384t = true;
            if (!TextUtils.isEmpty(this.f28348A)) {
                TextView textView10 = this.f28360M;
                if (textView10 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView10.setText(this.f28348A);
            }
            if (this.f28349B != 0) {
                TextView textView11 = this.f28360M;
                if (textView11 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView11.setText(this.f28349B);
            }
            if (this.f28350C != 0.0f) {
                TextView textView12 = this.f28360M;
                if (textView12 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView12.setTextSize(1, this.f28350C);
            }
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
        } else {
            m21466a(this.f28364Q);
            DmtBubbleLayout dmtBubbleLayout = this.f28371e;
            if (dmtBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.setUseDefaultView(false);
        }
        if (!(this.f28389y == 0 || this.f28390z == 0)) {
            setWidth(this.f28389y);
            setHeight(this.f28390z);
            DmtBubbleLayout.f28319l = getWidth();
            DmtBubbleLayout.f28320m = getHeight();
        }
        if (this.f28384t && this.f28384t) {
            if (VERSION.SDK_INT < 19) {
                View contentView = getContentView();
                C52711k.m112236a((Object) contentView, "contentView");
                contentView.setSystemUiVisibility(8);
            } else if (VERSION.SDK_INT >= 19) {
                View contentView2 = getContentView();
                C52711k.m112236a((Object) contentView2, "contentView");
                contentView2.setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
        if (this.f28378n != 0) {
            DmtBubbleLayout dmtBubbleLayout2 = this.f28371e;
            if (dmtBubbleLayout2 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout2.setMBgColor(this.f28378n);
        }
        if (this.f28379o != 0) {
            DmtBubbleLayout dmtBubbleLayout3 = this.f28371e;
            if (dmtBubbleLayout3 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout3.setMBorderColor(this.f28379o);
        }
        if (!this.f28358K) {
            DmtBubbleLayout dmtBubbleLayout4 = this.f28371e;
            if (dmtBubbleLayout4 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout4.setNeedAddColor(false);
        }
        DmtBubbleLayout dmtBubbleLayout5 = this.f28371e;
        if (dmtBubbleLayout5 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout5.setMNeedPath(this.f28380p);
        DmtBubbleLayout dmtBubbleLayout6 = this.f28371e;
        if (dmtBubbleLayout6 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        dmtBubbleLayout6.setBubbleOrientation(m21464a(this.f28367a));
        if (this.f28354G != 0.0f) {
            DmtBubbleLayout dmtBubbleLayout7 = this.f28371e;
            if (dmtBubbleLayout7 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout7.setMPadding(this.f28354G);
        }
        this.f28366S = new C10668g(this);
    }

    /* renamed from: a */
    public final void mo19000a(boolean z, int i) {
        DmtBubbleLayout dmtBubbleLayout = this.f28371e;
        if (dmtBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        if (!z) {
            f28346j--;
            this.f28361N = true;
        }
        this.f28372f = new AnimatorSet();
        if (dmtBubbleLayout != null) {
            dmtBubbleLayout.post(new C10666f(this, dmtBubbleLayout, z));
        }
    }

    /* renamed from: b */
    private final void m21468b(View view, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Point point;
        int[] iArr = new int[2];
        int i5 = 0;
        if (this.f28365R == null || VERSION.SDK_INT < 24) {
            view.getLocationOnScreen(iArr);
        } else {
            C10640e<Point> eVar = this.f28365R;
            if (eVar != null) {
                point = (Point) eVar.mo18879a();
            } else {
                point = null;
            }
            if (point == null) {
                C52711k.m112234a();
            }
            iArr[0] = point.x;
            iArr[1] = point.y;
        }
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - mo19002c()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, (iArr[0] + this.f28385u) - mo19003d(), iArr[1] + this.f28386v + i2 + ((int) C9432q.m18687b((Context) this.f28363P, 1.3f)));
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - mo19002c()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f28385u + view.getWidth(), iArr[1] + this.f28386v + i3 + ((int) C9432q.m18687b((Context) this.f28363P, 1.3f)));
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo19003d()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f28385u + i4 + ((int) C9432q.m18687b((Context) this.f28363P, 1.4f)), (iArr[1] - mo19002c()) + this.f28386v + ((int) C9432q.m18687b((Context) this.f28363P, 1.3f)));
        } else if (i == 80) {
            if (z) {
                i5 = (view.getMeasuredWidth() - mo19003d()) / 2;
            }
            showAsDropDown(view, this.f28385u + i5 + ((int) C9432q.m18687b((Context) this.f28363P, 1.4f)), this.f28386v + ((int) C9432q.m18687b((Context) this.f28363P, 1.3f)));
            mo19000a(true, i);
        }
    }

    /* renamed from: a */
    public final void mo18999a(View view, int i, boolean z) {
        if (!this.f28363P.isFinishing() && view != null && view.getWindowToken() != null) {
            this.f28355H = view.getMeasuredHeight();
            this.f28356I = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.f28366S);
            this.f28367a = i;
            DmtBubbleLayout dmtBubbleLayout = this.f28371e;
            if (dmtBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            this.f28362O = dmtBubbleLayout.getPADDING();
            if (!isShowing()) {
                int a = m21464a(i);
                if (this.f28389y == 0 || this.f28390z == 0) {
                    getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f28389y, 1073741824), MeasureSpec.makeMeasureSpec(this.f28390z, 1073741824));
                }
                if (z) {
                    if (i == 80 || i == 48) {
                        this.f28376l = ((float) mo19003d()) / 2.0f;
                    } else {
                        this.f28376l = ((float) mo19002c()) / 2.0f;
                    }
                } else if (!this.f28359L) {
                    this.f28377m += (float) (this.f28362O * 8);
                    this.f28359L = true;
                }
                DmtBubbleLayout dmtBubbleLayout2 = this.f28371e;
                if (dmtBubbleLayout2 == null) {
                    C52711k.m112237a("mDmtBubbleLayout");
                }
                dmtBubbleLayout2.mo18950a(a, this.f28376l + this.f28377m);
                m21468b(view, i, z);
                this.f28361N = false;
                if (this.f28387w > 0) {
                    getContentView().postDelayed(this.f28366S, this.f28387w);
                }
                f28346j++;
                return;
            }
            C10670b.m21492a(this);
        }
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C52711k.m112240b(view, "parent");
        try {
            super.showAtLocation(view, i, i2, i3);
            mo19000a(true, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo18997a(View view, int i, float f, int i2) {
        this.f28385u = i2;
        this.f28376l = f;
        mo18999a(view, 48, false);
    }

    /* renamed from: a */
    public final void mo18998a(View view, int i, int i2, int i3, float f) {
        C52711k.m112240b(view, "parent");
        try {
            this.f28367a = i;
            this.f28377m = f;
            DmtBubbleLayout dmtBubbleLayout = this.f28371e;
            if (dmtBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.mo18950a(m21464a(i), this.f28376l + this.f28377m);
            showAtLocation(view, 0, i2, i3);
            if (this.f28387w > 0) {
                getContentView().postDelayed(this.f28366S, this.f28387w);
            }
        } catch (Exception unused) {
        }
    }
}

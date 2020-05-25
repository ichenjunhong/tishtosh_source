package com.p683ss.android.ugc.tools.view.widget;

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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.tools.view.p2510c.C50219b;
import com.p683ss.android.ugc.tools.view.p2510c.C50221d;
import com.ss.android.ugc.trill.R;
import java.util.function.Supplier;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.view.widget.a */
public final class C50263a extends PopupWindow {

    /* renamed from: A */
    private int f126043A;

    /* renamed from: B */
    private float f126044B = 13.0f;

    /* renamed from: C */
    private int f126045C;

    /* renamed from: D */
    private Typeface f126046D;

    /* renamed from: E */
    private boolean f126047E = true;

    /* renamed from: F */
    private float f126048F = 12.0f;

    /* renamed from: G */
    private int f126049G;

    /* renamed from: H */
    private int f126050H;

    /* renamed from: I */
    private boolean f126051I = true;

    /* renamed from: J */
    private boolean f126052J = true;

    /* renamed from: K */
    private boolean f126053K;

    /* renamed from: L */
    private TextView f126054L;

    /* renamed from: M */
    private boolean f126055M;

    /* renamed from: N */
    private int f126056N;

    /* renamed from: O */
    private View f126057O;

    /* renamed from: P */
    private Supplier<Point> f126058P;

    /* renamed from: Q */
    private final Runnable f126059Q;

    /* renamed from: a */
    public int f126060a;

    /* renamed from: b */
    public float f126061b;

    /* renamed from: c */
    public boolean f126062c;

    /* renamed from: d */
    public int f126063d;

    /* renamed from: e */
    public long f126064e = 200;

    /* renamed from: f */
    public int f126065f;

    /* renamed from: g */
    public AVBubbleLayout f126066g;

    /* renamed from: h */
    public AnimatorSet f126067h;

    /* renamed from: i */
    Activity f126068i;

    /* renamed from: j */
    public C50265b f126069j;

    /* renamed from: k */
    public C50267d f126070k;

    /* renamed from: l */
    public C50266c f126071l;

    /* renamed from: m */
    private float f126072m;

    /* renamed from: n */
    private int f126073n;

    /* renamed from: o */
    private int f126074o;

    /* renamed from: p */
    private boolean f126075p = true;

    /* renamed from: q */
    private boolean f126076q;

    /* renamed from: r */
    private boolean f126077r;

    /* renamed from: s */
    private int f126078s;

    /* renamed from: t */
    private boolean f126079t;

    /* renamed from: u */
    private int f126080u;

    /* renamed from: v */
    private long f126081v = 5000;

    /* renamed from: w */
    private boolean f126082w = true;

    /* renamed from: x */
    private int f126083x;

    /* renamed from: y */
    private int f126084y;

    /* renamed from: z */
    private String f126085z = "";

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$a */
    public static final class C50264a {

        /* renamed from: A */
        public boolean f126086A = true;

        /* renamed from: B */
        public boolean f126087B;

        /* renamed from: C */
        public int f126088C;

        /* renamed from: D */
        public boolean f126089D = true;

        /* renamed from: E */
        public Activity f126090E;

        /* renamed from: a */
        public int f126091a;

        /* renamed from: b */
        public float f126092b;

        /* renamed from: c */
        public int f126093c;

        /* renamed from: d */
        public int f126094d;

        /* renamed from: e */
        public boolean f126095e = true;

        /* renamed from: f */
        public boolean f126096f;

        /* renamed from: g */
        public boolean f126097g;

        /* renamed from: h */
        public boolean f126098h;

        /* renamed from: i */
        public int f126099i;

        /* renamed from: j */
        public int f126100j;

        /* renamed from: k */
        public long f126101k = 800;

        /* renamed from: l */
        public long f126102l = 5000;

        /* renamed from: m */
        public boolean f126103m = true;

        /* renamed from: n */
        public View f126104n;

        /* renamed from: o */
        public int f126105o;

        /* renamed from: p */
        public int f126106p;

        /* renamed from: q */
        public String f126107q = "";

        /* renamed from: r */
        public int f126108r;

        /* renamed from: s */
        public float f126109s = 13.0f;

        /* renamed from: t */
        public Typeface f126110t;

        /* renamed from: u */
        public int f126111u;

        /* renamed from: v */
        public C50265b f126112v;

        /* renamed from: w */
        public C50266c f126113w;

        /* renamed from: x */
        public C50267d f126114x;

        /* renamed from: y */
        public boolean f126115y = true;

        /* renamed from: z */
        public float f126116z = 12.0f;

        public C50264a(Activity activity) {
            C52711k.m112240b(activity, "activity");
            this.f126090E = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$b */
    public interface C50265b {
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$c */
    public interface C50266c {
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$d */
    public interface C50267d {
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$e */
    static final class C50268e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50263a f126117a;

        /* renamed from: b */
        final /* synthetic */ AVBubbleLayout f126118b;

        /* renamed from: c */
        final /* synthetic */ boolean f126119c;

        C50268e(C50263a aVar, AVBubbleLayout aVBubbleLayout, boolean z) {
            this.f126117a = aVar;
            this.f126118b = aVBubbleLayout;
            this.f126119c = z;
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
            if (this.f126117a.f126067h != null) {
                int i3 = this.f126117a.f126060a;
                if (i3 == 3) {
                    i2 = (int) (this.f126118b.getX() + ((float) this.f126118b.getMeasuredWidth()));
                    i = (int) (this.f126118b.getY() + C50263a.m108517a(this.f126117a).getBubbleOffset());
                } else if (i3 == 5) {
                    i2 = (int) this.f126118b.getX();
                    i = (int) (this.f126118b.getY() + C50263a.m108517a(this.f126117a).getBubbleOffset());
                } else if (i3 == 48) {
                    i2 = (int) (this.f126118b.getX() + C50263a.m108517a(this.f126117a).getBubbleOffset());
                    i = (int) (this.f126118b.getY() + ((float) this.f126118b.getMeasuredHeight()));
                } else if (i3 != 80) {
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = (int) (this.f126118b.getX() + C50263a.m108517a(this.f126117a).getBubbleOffset());
                    i = (int) this.f126118b.getY();
                }
                this.f126118b.setPivotY((float) i);
                this.f126118b.setPivotX((float) i2);
                AVBubbleLayout aVBubbleLayout = this.f126118b;
                String str = "scaleX";
                float[] fArr = new float[2];
                if (this.f126119c) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (this.f126119c) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVBubbleLayout, str, fArr);
                C52711k.m112236a((Object) ofFloat, "scaleX");
                ofFloat.setDuration(200);
                AVBubbleLayout aVBubbleLayout2 = this.f126118b;
                String str2 = "scaleY";
                float[] fArr2 = new float[2];
                if (this.f126119c) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                fArr2[0] = f3;
                if (this.f126119c) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                fArr2[1] = f4;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVBubbleLayout2, str2, fArr2);
                C52711k.m112236a((Object) ofFloat2, "scaleY");
                ofFloat2.setDuration(200);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f126118b, "translationY", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat3, "translationDownAnimL");
                if (this.f126119c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f126118b, "translationY", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat4, "translationUpAnimL");
                if (this.f126119c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f126118b, "translationX", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat5, "translationLeftAnimL");
                if (this.f126119c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f126118b, "translationX", new float[]{0.0f});
                C52711k.m112236a((Object) ofFloat6, "translationRightAnimL");
                if (this.f126119c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f126118b, "translationY", new float[]{0.0f, 10.0f});
                C52711k.m112236a((Object) ofFloat7, "translationDownAnimS");
                if (this.f126119c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f126118b, "translationY", new float[]{0.0f, -10.0f});
                C52711k.m112236a((Object) ofFloat8, "translationUpAnimS");
                if (this.f126119c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f126118b, "translationX", new float[]{0.0f, -10.0f});
                C52711k.m112236a((Object) ofFloat9, "translationLeftAnimS");
                if (this.f126119c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f126118b, "translationX", new float[]{0.0f, 10.0f});
                C52711k.m112236a((Object) ofFloat10, "translationRightAnimS");
                if (this.f126119c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f126118b.setVisibility(0);
                if (this.f126119c) {
                    int i4 = this.f126117a.f126060a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C50221d());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet = this.f126117a.f126067h;
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
                        ofFloat10.setInterpolator(new C50221d());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f126117a.f126067h;
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
                        ofFloat8.setInterpolator(new C50221d());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f126117a.f126067h;
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
                        ofFloat7.setInterpolator(new C50221d());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f126117a.f126067h;
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
                    int i5 = this.f126117a.f126060a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C50219b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f126117a.f126067h;
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
                        ofFloat5.setInterpolator(new C50219b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f126117a.f126067h;
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
                        ofFloat3.setInterpolator(new C50219b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f126117a.f126067h;
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
                        ofFloat4.setInterpolator(new C50219b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f126117a.f126067h;
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
                AnimatorSet animatorSet9 = this.f126117a.f126067h;
                if (animatorSet9 != null) {
                    animatorSet9.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a */
                        final /* synthetic */ C50268e f126120a;

                        {
                            this.f126120a = r1;
                        }

                        public final void onAnimationStart(Animator animator) {
                            C52711k.m112240b(animator, "animation");
                            super.onAnimationStart(animator);
                            if (this.f126120a.f126119c) {
                                this.f126120a.f126118b.setVisibility(0);
                            }
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C52711k.m112240b(animator, "animation");
                            super.onAnimationEnd(animator);
                            if (!this.f126120a.f126119c) {
                                this.f126120a.f126118b.setVisibility(8);
                                C50263a aVar = this.f126120a.f126117a;
                                AnimatorSet animatorSet = aVar.f126067h;
                                if (animatorSet != null) {
                                    animatorSet.removeAllListeners();
                                }
                                AnimatorSet animatorSet2 = aVar.f126067h;
                                if (animatorSet2 != null) {
                                    animatorSet2.cancel();
                                }
                                aVar.f126067h = null;
                                if (!aVar.f126068i.isFinishing() && aVar.isShowing()) {
                                    try {
                                        C50272b.m108526a(aVar);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    });
                }
                if (this.f126117a.f126062c) {
                    AnimatorSet animatorSet10 = this.f126117a.f126067h;
                    if (animatorSet10 != null) {
                        animatorSet10.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                }
                AnimatorSet animatorSet11 = this.f126117a.f126067h;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$f */
    static final class C50270f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50263a f126121a;

        C50270f(C50263a aVar) {
            this.f126121a = aVar;
        }

        public final void run() {
            this.f126121a.mo98163a(false, this.f126121a.f126060a);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$g */
    static final class C50271g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50263a f126122a;

        C50271g(C50263a aVar) {
            this.f126122a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f126122a.dismiss();
        }
    }

    /* renamed from: a */
    private static int m108516a(int i) {
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

    /* renamed from: b */
    private int m108521b() {
        m108518a();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        return contentView.getMeasuredHeight();
    }

    /* renamed from: c */
    private int m108523c() {
        m108518a();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f126055M) {
            mo98163a(false, this.f126060a);
            getContentView().removeCallbacks(this.f126059Q);
            this.f126063d = 0;
            this.f126080u = 0;
        }
    }

    /* renamed from: a */
    private void m108518a() {
        if (this.f126083x == 0 || this.f126084y == 0) {
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f126083x, 1073741824), MeasureSpec.makeMeasureSpec(this.f126084y, 1073741824));
    }

    /* renamed from: a */
    public static final /* synthetic */ AVBubbleLayout m108517a(C50263a aVar) {
        AVBubbleLayout aVBubbleLayout = aVar.f126066g;
        if (aVBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        return aVBubbleLayout;
    }

    /* renamed from: a */
    private final void m108519a(View view) {
        this.f126066g = new AVBubbleLayout(this.f126068i);
        AVBubbleLayout aVBubbleLayout = this.f126066g;
        if (aVBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout.setBackgroundColor(0);
        AVBubbleLayout aVBubbleLayout2 = this.f126066g;
        if (aVBubbleLayout2 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout2.addView(view);
        AVBubbleLayout aVBubbleLayout3 = this.f126066g;
        if (aVBubbleLayout3 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout3.setGravity(17);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        AVBubbleLayout aVBubbleLayout4 = this.f126066g;
        if (aVBubbleLayout4 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout4.setLayoutParams(marginLayoutParams);
        AVBubbleLayout aVBubbleLayout5 = this.f126066g;
        if (aVBubbleLayout5 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout5.setVisibility(8);
        if (this.f126073n != 0) {
            AVBubbleLayout aVBubbleLayout6 = this.f126066g;
            if (aVBubbleLayout6 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout6.setMBgColor(this.f126073n);
        }
        AVBubbleLayout aVBubbleLayout7 = this.f126066g;
        if (aVBubbleLayout7 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout7.setMNeedPath(this.f126075p);
        AVBubbleLayout aVBubbleLayout8 = this.f126066g;
        if (aVBubbleLayout8 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout8.setMNeedArrow(this.f126047E);
        AVBubbleLayout aVBubbleLayout9 = this.f126066g;
        if (aVBubbleLayout9 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout9.setMNeedPressFade(this.f126076q);
        AVBubbleLayout aVBubbleLayout10 = this.f126066g;
        if (aVBubbleLayout10 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout10.setMNeedShadow(this.f126077r);
        AVBubbleLayout aVBubbleLayout11 = this.f126066g;
        if (aVBubbleLayout11 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout11.setMShadowColor(this.f126078s);
        AVBubbleLayout aVBubbleLayout12 = this.f126066g;
        if (aVBubbleLayout12 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout12.setOnClickListener(new C50271g(this));
        AVBubbleLayout aVBubbleLayout13 = this.f126066g;
        if (aVBubbleLayout13 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        setContentView(aVBubbleLayout13);
        getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
    }

    public C50263a(C50264a aVar) {
        C52711k.m112240b(aVar, "builder");
        this.f126068i = aVar.f126090E;
        this.f126060a = aVar.f126091a;
        this.f126072m = aVar.f126092b;
        this.f126073n = aVar.f126093c;
        this.f126074o = aVar.f126094d;
        this.f126075p = aVar.f126095e;
        this.f126076q = aVar.f126096f;
        this.f126062c = aVar.f126097g;
        this.f126079t = aVar.f126098h;
        this.f126063d = aVar.f126099i;
        this.f126080u = aVar.f126100j;
        this.f126064e = aVar.f126101k;
        this.f126081v = aVar.f126102l;
        this.f126082w = aVar.f126103m;
        this.f126057O = aVar.f126104n;
        this.f126084y = aVar.f126106p;
        this.f126083x = aVar.f126105o;
        this.f126085z = aVar.f126107q;
        this.f126043A = aVar.f126108r;
        this.f126044B = aVar.f126109s;
        this.f126045C = aVar.f126111u;
        this.f126046D = aVar.f126110t;
        this.f126069j = aVar.f126112v;
        this.f126071l = aVar.f126113w;
        this.f126070k = aVar.f126114x;
        this.f126047E = aVar.f126115y;
        this.f126048F = aVar.f126116z;
        this.f126051I = aVar.f126086A;
        this.f126077r = aVar.f126087B;
        this.f126078s = aVar.f126088C;
        this.f126052J = aVar.f126089D;
        this.f126065f = (int) C9432q.m18687b((Context) this.f126068i, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f126051I);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f126082w || this.f126057O == null) {
            this.f126054L = new AVTextView(this.f126068i);
            if (this.f126045C != 0) {
                TextView textView = this.f126054L;
                if (textView == null) {
                    C52711k.m112237a("mTextView");
                }
                textView.setTextColor(this.f126045C);
            } else {
                TextView textView2 = this.f126054L;
                if (textView2 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView2.setTextColor(this.f126068i.getResources().getColor(R.color.b1c));
            }
            TextView textView3 = this.f126054L;
            if (textView3 == null) {
                C52711k.m112237a("mTextView");
            }
            textView3.setTextSize(1, 13.0f);
            if (VERSION.SDK_INT >= 17) {
                TextView textView4 = this.f126054L;
                if (textView4 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView4.setTextAlignment(5);
            }
            TextView textView5 = this.f126054L;
            if (textView5 == null) {
                C52711k.m112237a("mTextView");
            }
            textView5.setLayoutParams(new LayoutParams(-2, -2));
            TextView textView6 = this.f126054L;
            if (textView6 == null) {
                C52711k.m112237a("mTextView");
            }
            textView6.setGravity(17);
            TextView textView7 = this.f126054L;
            if (textView7 == null) {
                C52711k.m112237a("mTextView");
            }
            textView7.setMaxWidth((int) C9432q.m18687b((Context) this.f126068i, 197.0f));
            TextView textView8 = this.f126054L;
            if (textView8 == null) {
                C52711k.m112237a("mTextView");
            }
            textView8.setMaxLines(2);
            TextView textView9 = this.f126054L;
            if (textView9 == null) {
                C52711k.m112237a("mTextView");
            }
            m108519a((View) textView9);
            this.f126079t = true;
            if (!TextUtils.isEmpty(this.f126085z)) {
                TextView textView10 = this.f126054L;
                if (textView10 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView10.setText(this.f126085z);
            }
            if (this.f126043A != 0) {
                TextView textView11 = this.f126054L;
                if (textView11 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView11.setText(this.f126043A);
            }
            if (this.f126044B != 0.0f) {
                TextView textView12 = this.f126054L;
                if (textView12 == null) {
                    C52711k.m112237a("mTextView");
                }
                textView12.setTextSize(1, this.f126044B);
            }
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
        } else {
            m108519a(this.f126057O);
            AVBubbleLayout aVBubbleLayout = this.f126066g;
            if (aVBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout.setUseDefaultView(false);
        }
        if (!(this.f126083x == 0 || this.f126084y == 0)) {
            setWidth(this.f126083x);
            setHeight(this.f126084y);
            AVBubbleLayout.f125863l = getWidth();
            AVBubbleLayout.f125864m = getHeight();
        }
        if (this.f126079t && this.f126079t) {
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
        if (this.f126073n != 0) {
            AVBubbleLayout aVBubbleLayout2 = this.f126066g;
            if (aVBubbleLayout2 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout2.setMBgColor(this.f126073n);
        }
        if (this.f126074o != 0) {
            AVBubbleLayout aVBubbleLayout3 = this.f126066g;
            if (aVBubbleLayout3 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout3.setMBorderColor(this.f126074o);
        }
        if (!this.f126052J) {
            AVBubbleLayout aVBubbleLayout4 = this.f126066g;
            if (aVBubbleLayout4 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout4.setNeedAddColor(false);
        }
        AVBubbleLayout aVBubbleLayout5 = this.f126066g;
        if (aVBubbleLayout5 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout5.setMNeedPath(this.f126075p);
        AVBubbleLayout aVBubbleLayout6 = this.f126066g;
        if (aVBubbleLayout6 == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        aVBubbleLayout6.setBubbleOrientation(m108516a(this.f126060a));
        if (this.f126048F != 0.0f) {
            AVBubbleLayout aVBubbleLayout7 = this.f126066g;
            if (aVBubbleLayout7 == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            aVBubbleLayout7.setMPadding(this.f126048F);
        }
        this.f126059Q = new C50270f(this);
    }

    /* renamed from: a */
    public final void mo98163a(boolean z, int i) {
        AVBubbleLayout aVBubbleLayout = this.f126066g;
        if (aVBubbleLayout == null) {
            C52711k.m112237a("mDmtBubbleLayout");
        }
        if (!z) {
            this.f126055M = true;
        }
        this.f126067h = new AnimatorSet();
        if (aVBubbleLayout != null) {
            aVBubbleLayout.post(new C50268e(this, aVBubbleLayout, z));
        }
    }

    /* renamed from: b */
    private final void m108522b(View view, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Point point;
        int[] iArr = new int[2];
        int i5 = 0;
        if (this.f126058P == null || VERSION.SDK_INT < 24) {
            view.getLocationOnScreen(iArr);
        } else {
            Supplier<Point> supplier = this.f126058P;
            if (supplier != null) {
                point = (Point) supplier.get();
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
                i2 = (view.getMeasuredHeight() - m108521b()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, (iArr[0] + this.f126063d) - m108523c(), iArr[1] + this.f126080u + i2 + ((int) C9432q.m18687b((Context) this.f126068i, 1.3f)));
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - m108521b()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f126063d + view.getWidth(), iArr[1] + this.f126080u + i3 + ((int) C9432q.m18687b((Context) this.f126068i, 1.3f)));
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - m108523c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f126063d + i4 + ((int) C9432q.m18687b((Context) this.f126068i, 1.4f)), (iArr[1] - m108521b()) + this.f126080u + ((int) C9432q.m18687b((Context) this.f126068i, 1.3f)));
        } else if (i == 80) {
            if (z) {
                i5 = (view.getMeasuredWidth() - m108523c()) / 2;
            }
            showAsDropDown(view, this.f126063d + i5 + ((int) C9432q.m18687b((Context) this.f126068i, 1.4f)), this.f126080u + ((int) C9432q.m18687b((Context) this.f126068i, 1.3f)));
            mo98163a(true, i);
        }
    }

    /* renamed from: a */
    public final void mo98162a(View view, int i, boolean z) {
        if (!this.f126068i.isFinishing() && view != null && view.getWindowToken() != null) {
            this.f126049G = view.getMeasuredHeight();
            this.f126050H = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.f126059Q);
            this.f126060a = i;
            AVBubbleLayout aVBubbleLayout = this.f126066g;
            if (aVBubbleLayout == null) {
                C52711k.m112237a("mDmtBubbleLayout");
            }
            this.f126056N = aVBubbleLayout.getPADDING();
            if (!isShowing()) {
                int a = m108516a(i);
                if (this.f126083x == 0 || this.f126084y == 0) {
                    getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f126083x, 1073741824), MeasureSpec.makeMeasureSpec(this.f126084y, 1073741824));
                }
                if (!this.f126053K) {
                    this.f126072m += (float) (this.f126056N * 8);
                    this.f126053K = true;
                }
                AVBubbleLayout aVBubbleLayout2 = this.f126066g;
                if (aVBubbleLayout2 == null) {
                    C52711k.m112237a("mDmtBubbleLayout");
                }
                aVBubbleLayout2.mo98031a(a, this.f126061b + this.f126072m);
                m108522b(view, i, false);
                this.f126055M = false;
                if (this.f126081v > 0) {
                    getContentView().postDelayed(this.f126059Q, this.f126081v);
                }
            } else {
                C50272b.m108526a(this);
            }
        }
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C52711k.m112240b(view, "parent");
        try {
            super.showAtLocation(view, i, i2, i3);
            mo98163a(true, i);
        } catch (Exception unused) {
        }
    }
}

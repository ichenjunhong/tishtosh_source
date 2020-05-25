package com.p683ss.android.ugc.gamora.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.poi.widget.BubbleLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.gamora.recorder.a */
public final class C49563a extends PopupWindow {

    /* renamed from: a */
    public static int f124312a;

    /* renamed from: b */
    public BubbleLayout f124313b;

    /* renamed from: c */
    Activity f124314c;

    /* renamed from: d */
    public boolean f124315d;

    /* renamed from: e */
    public int f124316e;

    /* renamed from: f */
    public int f124317f;

    /* renamed from: g */
    public int f124318g;

    /* renamed from: h */
    public int f124319h;

    /* renamed from: i */
    public boolean f124320i;

    /* renamed from: j */
    public boolean f124321j;

    /* renamed from: k */
    public long f124322k;

    /* renamed from: l */
    public AnimatorSet f124323l;

    /* renamed from: m */
    public long f124324m;

    /* renamed from: n */
    public long f124325n;

    /* renamed from: o */
    public C23524d<Point> f124326o;

    /* renamed from: p */
    private TextView f124327p;

    /* renamed from: q */
    private int f124328q;

    /* renamed from: r */
    private int f124329r;

    /* renamed from: s */
    private boolean f124330s;

    /* renamed from: t */
    private int f124331t;

    /* renamed from: u */
    private boolean f124332u;

    /* renamed from: v */
    private Runnable f124333v;

    /* renamed from: a */
    private int m106937a() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: b */
    private int m106939b() {
        return getContentView().getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f124330s) {
            mo97471a(false, this.f124318g);
            getContentView().removeCallbacks(this.f124333v);
            this.f124316e = 0;
            this.f124317f = 0;
        }
    }

    public C49563a(Activity activity) {
        this(activity, true);
    }

    /* renamed from: a */
    public final void mo97469a(String str) {
        this.f124327p.setText(str);
    }

    /* renamed from: a */
    public final void mo97470a(boolean z) {
        this.f124332u = true;
        if (this.f124313b != null) {
            this.f124313b.setNeedPath(true);
        }
    }

    /* renamed from: a */
    public final void mo97471a(final boolean z, final int i) {
        final BubbleLayout bubbleLayout = this.f124313b;
        if (!z) {
            this.f124330s = true;
        }
        if (this.f124323l == null) {
            this.f124323l = new AnimatorSet();
        } else {
            this.f124323l.removeAllListeners();
            this.f124323l.cancel();
        }
        bubbleLayout.post(new Runnable() {
            public final void run() {
                int i;
                int i2;
                float f;
                float f2;
                float f3;
                long j;
                if (C49563a.this.f124323l != null) {
                    int i3 = i;
                    if (i3 == 3) {
                        i2 = (int) (bubbleLayout.getX() + ((float) bubbleLayout.getMeasuredWidth()));
                        i = (int) (bubbleLayout.getY() + C49563a.this.f124313b.getBubbleOffset());
                    } else if (i3 == 5) {
                        i2 = (int) bubbleLayout.getX();
                        i = (int) (bubbleLayout.getY() + C49563a.this.f124313b.getBubbleOffset());
                    } else if (i3 == 48) {
                        i2 = (int) (bubbleLayout.getX() + C49563a.this.f124313b.getBubbleOffset());
                        i = (int) (bubbleLayout.getY() + ((float) bubbleLayout.getMeasuredHeight()));
                    } else if (i3 != 80) {
                        i2 = 0;
                        i = 0;
                    } else {
                        i2 = (int) (bubbleLayout.getX() + C49563a.this.f124313b.getBubbleOffset());
                        i = (int) bubbleLayout.getY();
                    }
                    bubbleLayout.setPivotY((float) i);
                    bubbleLayout.setPivotX((float) i2);
                    View view = bubbleLayout;
                    String str = "scaleX";
                    float[] fArr = new float[2];
                    float f4 = 0.0f;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    fArr[0] = f;
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    fArr[1] = f2;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
                    View view2 = bubbleLayout;
                    String str2 = "scaleY";
                    float[] fArr2 = new float[2];
                    if (z) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    fArr2[0] = f3;
                    if (z) {
                        f4 = 1.0f;
                    }
                    fArr2[1] = f4;
                    C49563a.this.f124323l.play(ofFloat).with(ObjectAnimator.ofFloat(view2, str2, fArr2));
                    AnimatorSet animatorSet = C49563a.this.f124323l;
                    if (z) {
                        j = C49563a.this.f124324m;
                    } else {
                        j = C49563a.this.f124325n;
                    }
                    animatorSet.setDuration(j);
                    if (C49563a.this.f124321j) {
                        C49563a.this.f124323l.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C49563a.this.f124323l.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                bubbleLayout.setVisibility(0);
                            }
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                bubbleLayout.setVisibility(8);
                                C49563a aVar = C49563a.this;
                                if (aVar.f124323l != null) {
                                    aVar.f124323l.removeAllListeners();
                                    aVar.f124323l.cancel();
                                    aVar.f124323l = null;
                                }
                                if (!aVar.f124314c.isFinishing() && aVar.isShowing()) {
                                    try {
                                        C49575b.m106971a(aVar);
                                    } catch (Exception e) {
                                        C32458a.m75143a(e);
                                    }
                                }
                            }
                        }
                    });
                    C49563a.this.f124323l.start();
                }
            }
        });
    }

    private C49563a(Activity activity, boolean z) {
        super(activity);
        this.f124332u = true;
        this.f124322k = 7000;
        this.f124333v = new Runnable() {
            public final void run() {
                C49563a.this.mo97471a(false, C49563a.this.f124318g);
            }
        };
        this.f124324m = 800;
        this.f124325n = 200;
        this.f124314c = activity;
        f124312a = (int) ((this.f124314c.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        this.f124327p = new DmtTextView(this.f124314c);
        this.f124327p.setTextColor(this.f124314c.getResources().getColor(R.color.a1k));
        this.f124327p.setTextSize(13.0f);
        this.f124327p.setLayoutParams(new LayoutParams(-2, -2));
        this.f124327p.setMaxLines(2);
        this.f124327p.setGravity(17);
        TextView textView = this.f124327p;
        this.f124313b = new BubbleLayout(this.f124314c);
        this.f124313b.setBackgroundColor(0);
        this.f124313b.addView(textView);
        this.f124313b.setGravity(17);
        this.f124313b.setLayoutParams(new MarginLayoutParams(-2, -2));
        this.f124313b.setVisibility(8);
        if (this.f124331t != 0) {
            this.f124313b.setBgColor(this.f124331t);
        }
        this.f124313b.setNeedPath(this.f124332u);
        this.f124313b.setNeedPressFade(this.f124320i);
        this.f124313b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C49563a.this.dismiss();
            }
        });
        setContentView(this.f124313b);
        this.f124315d = true;
        getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
    }

    /* renamed from: a */
    public final void mo97468a(View view, int i) {
        if (!this.f124314c.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.f124333v);
            this.f124318g = 48;
            if (!isShowing()) {
                if (this.f124328q == 0 || this.f124329r == 0) {
                    getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f124328q, 1073741824), MeasureSpec.makeMeasureSpec(this.f124329r, 1073741824));
                }
                this.f124313b.mo80423a(3, ((float) (m106939b() / 2)) + ((float) this.f124319h));
                int[] iArr = new int[2];
                if (this.f124326o != null) {
                    Point point = (Point) this.f124326o.mo48684a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                if (this.f124315d) {
                    if (VERSION.SDK_INT < 19) {
                        getContentView().setSystemUiVisibility(8);
                    } else if (VERSION.SDK_INT >= 19) {
                        getContentView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
                    }
                }
                showAtLocation(view, 0, iArr[0] + this.f124316e + ((view.getMeasuredWidth() - m106939b()) / 2), ((iArr[1] - m106937a()) + this.f124317f) - f124312a);
                mo97471a(true, 48);
                this.f124330s = false;
                if (this.f124322k > 0) {
                    getContentView().postDelayed(this.f124333v, this.f124322k);
                }
                return;
            }
            C49575b.m106971a(this);
        }
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}

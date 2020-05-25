package com.p683ss.android.ugc.aweme.poi.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
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
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.c */
public final class C39481c extends PopupWindow {

    /* renamed from: a */
    public int f100986a;

    /* renamed from: b */
    BubbleLayout f100987b;

    /* renamed from: c */
    public TextView f100988c;

    /* renamed from: d */
    public int f100989d;

    /* renamed from: e */
    public int f100990e;

    /* renamed from: f */
    public boolean f100991f;

    /* renamed from: g */
    public int f100992g;

    /* renamed from: h */
    public int f100993h;

    /* renamed from: i */
    public int f100994i;

    /* renamed from: j */
    public boolean f100995j;

    /* renamed from: k */
    public boolean f100996k;

    /* renamed from: l */
    public int f100997l;

    /* renamed from: m */
    public boolean f100998m;

    /* renamed from: n */
    public long f100999n;

    /* renamed from: o */
    public AnimatorSet f101000o;

    /* renamed from: p */
    public long f101001p;

    /* renamed from: q */
    public long f101002q;

    /* renamed from: r */
    public C23524d<Point> f101003r;

    /* renamed from: s */
    public C39486a f101004s;

    /* renamed from: t */
    private Activity f101005t;

    /* renamed from: u */
    private boolean f101006u;

    /* renamed from: v */
    private int f101007v;

    /* renamed from: w */
    private boolean f101008w;

    /* renamed from: x */
    private Runnable f101009x;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.c$a */
    public interface C39486a {
        /* renamed from: a */
        void mo51196a();
    }

    /* renamed from: d */
    private static int m87811d(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 1;
            default:
                return i;
        }
    }

    /* renamed from: e */
    private static int m87812e(int i) {
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo80494a() {
        return this.f100998m && C47918gj.m103682a(this.f101005t);
    }

    /* renamed from: h */
    private int m87814h() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: c */
    public final int mo80498c() {
        return getContentView().getMeasuredWidth();
    }

    /* renamed from: b */
    public final void mo80495b() {
        if (!this.f101006u) {
            this.f100987b.setVisibility(8);
            mo80501d();
            getContentView().removeCallbacks(this.f101009x);
            this.f100992g = 0;
            this.f100993h = 0;
        }
    }

    public final void dismiss() {
        if (!this.f101006u) {
            mo80493a(false, this.f100994i);
            getContentView().removeCallbacks(this.f101009x);
            this.f100992g = 0;
            this.f100993h = 0;
        }
    }

    /* renamed from: g */
    private void m87813g() {
        if (this.f100991f) {
            if (VERSION.SDK_INT < 19) {
                getContentView().setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                getContentView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: d */
    public final void mo80501d() {
        if (!this.f101005t.isFinishing() && isShowing()) {
            if (this.f101000o != null) {
                this.f101000o.removeAllListeners();
                this.f101000o.cancel();
                this.f101000o = null;
            }
            try {
                C39487d.m87834a(this);
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* renamed from: e */
    public final void mo80503e() {
        if (this.f100989d == 0 || this.f100990e == 0) {
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f100989d, 1073741824), MeasureSpec.makeMeasureSpec(this.f100990e, 1073741824));
    }

    /* renamed from: f */
    public final void mo80504f() {
        if (this.f100989d == 0 || this.f100990e == 0) {
            getContentView().measure(MeasureSpec.makeMeasureSpec(C23724k.m58224b(getContentView().getContext()), DynamicTabYellowPointVersion.DEFAULT), MeasureSpec.makeMeasureSpec(C23724k.m58221a(getContentView().getContext()), DynamicTabYellowPointVersion.DEFAULT));
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f100989d, 1073741824), MeasureSpec.makeMeasureSpec(this.f100990e, 1073741824));
    }

    public C39481c(Activity activity) {
        this(activity, true);
    }

    /* renamed from: a */
    public final void mo80486a(int i) {
        this.f100988c.setText(i);
    }

    /* renamed from: b */
    public final void mo80497b(View view) {
        mo80491a(view, 80, true, 0.0f);
    }

    /* renamed from: b */
    public final void mo80496b(int i) {
        this.f101007v = i;
        if (this.f100987b != null) {
            this.f100987b.setBgColor(i);
        }
    }

    /* renamed from: c */
    public final void mo80499c(int i) {
        if (this.f100987b != null) {
            this.f100987b.setBorderColor(i);
        }
    }

    /* renamed from: a */
    public final void mo80488a(View view) {
        this.f100987b = new BubbleLayout(this.f101005t);
        this.f100987b.setBackgroundColor(0);
        this.f100987b.addView(view);
        this.f100987b.setGravity(17);
        this.f100987b.setLayoutParams(new MarginLayoutParams(-2, -2));
        this.f100987b.setVisibility(8);
        if (this.f101007v != 0) {
            this.f100987b.setBgColor(this.f101007v);
        }
        this.f100987b.setNeedPath(this.f101008w);
        this.f100987b.setNeedPressFade(this.f100995j);
        this.f100987b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C39481c.this.f101004s != null) {
                    C39481c.this.f101004s.mo51196a();
                }
                C39481c.this.dismiss();
            }
        });
        setContentView(this.f100987b);
    }

    /* renamed from: c */
    public final void mo80500c(View view) {
        if (!this.f101005t.isFinishing() && view != null && view.getWindowToken() != null) {
            float b = C9432q.m18687b((Context) this.f101005t, 36.0f);
            float b2 = C9432q.m18687b((Context) this.f101005t, 64.0f);
            float b3 = C9432q.m18687b((Context) this.f101005t, 16.0f);
            getContentView().removeCallbacks(this.f101009x);
            if (!isShowing()) {
                int[] iArr = new int[2];
                if (this.f101003r != null) {
                    Point point = (Point) this.f101003r.mo48684a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                this.f100994i = 48;
                this.f100997l = -((int) C9432q.m18687b(view.getContext(), 3.5f));
                if (((float) (iArr[1] - m87814h())) - b < b2) {
                    this.f100994i = 80;
                }
                if (((float) iArr[0]) - (((float) mo80498c()) / 2.0f) < b3) {
                    this.f100992g = (int) (b3 - (((float) iArr[0]) - (((float) mo80498c()) / 2.0f)));
                }
                if (((float) C23724k.m58224b(this.f101005t)) - (((float) iArr[0]) + (((float) mo80498c()) / 2.0f)) < b3) {
                    this.f100992g = (int) ((((float) C23724k.m58224b(this.f101005t)) - (((float) iArr[0]) + (((float) mo80498c()) / 2.0f))) - b3);
                }
                float c = ((float) mo80498c()) / 2.0f;
                this.f100987b.mo80423a(m87812e(this.f100994i), (((float) this.f100997l) + c) - ((float) this.f100992g));
                m87813g();
                int i = this.f100994i;
                if (i == 48) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f100992g)) - c), (int) ((((float) (iArr[1] + this.f100993h)) - b) - ((float) m87814h())));
                    mo80493a(true, this.f100994i);
                } else if (i == 80) {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] + this.f100992g)) - c), (int) (((float) (iArr[1] + this.f100993h)) + b));
                    mo80493a(true, this.f100994i);
                }
                this.f101006u = false;
                if (this.f100999n > 0) {
                    getContentView().postDelayed(this.f101009x, this.f100999n);
                }
                return;
            }
            C39487d.m87834a(this);
        }
    }

    /* renamed from: a */
    public final void mo80492a(boolean z) {
        this.f101008w = false;
        if (this.f100987b != null) {
            this.f100987b.setNeedPath(false);
        }
    }

    /* renamed from: a */
    public final void mo80487a(int i, int i2) {
        this.f100989d = i;
        this.f100990e = i2;
        setWidth(i);
        setHeight(i2);
    }

    /* renamed from: a */
    public final void mo80489a(View view, int i) {
        mo80491a(view, i, true, 0.0f);
    }

    public C39481c(Activity activity, boolean z) {
        super(activity);
        this.f101008w = true;
        this.f100999n = 7000;
        this.f101009x = new Runnable() {
            public final void run() {
                C39481c.this.mo80493a(false, C39481c.this.f100994i);
            }
        };
        this.f101001p = 800;
        this.f101002q = 200;
        this.f101005t = activity;
        this.f100986a = (int) ((this.f101005t.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (z) {
            this.f100988c = new DmtTextView(this.f101005t);
            this.f100988c.setTextColor(this.f101005t.getResources().getColor(R.color.w2));
            this.f100988c.setTextSize(13.0f);
            this.f100988c.setLayoutParams(new LayoutParams(-2, -2));
            this.f100988c.setLines(1);
            this.f100988c.setGravity(17);
            mo80488a((View) this.f100988c);
            this.f100991f = true;
            getContentView().measure(DynamicTabYellowPointVersion.DEFAULT, DynamicTabYellowPointVersion.DEFAULT);
        }
    }

    /* renamed from: a */
    public final void mo80493a(final boolean z, final int i) {
        final BubbleLayout bubbleLayout = this.f100987b;
        if (!z) {
            this.f101006u = true;
        }
        if (this.f101000o == null) {
            this.f101000o = new AnimatorSet();
        } else {
            this.f101000o.removeAllListeners();
            this.f101000o.cancel();
        }
        bubbleLayout.post(new Runnable() {
            public final void run() {
                float f;
                float f2;
                float f3;
                long j;
                if (C39481c.this.f101000o != null) {
                    if (C39481c.this.mo80494a()) {
                        C39481c cVar = C39481c.this;
                        int i = i;
                        View view = bubbleLayout;
                        Point point = new Point(0, 0);
                        if (i == 3) {
                            point.x = (int) view.getX();
                            point.y = (int) (view.getY() + cVar.f100987b.getBubbleOffset());
                        } else if (i == 5) {
                            point.x = (int) (view.getX() + ((float) view.getMeasuredWidth()));
                            point.y = (int) (view.getY() + cVar.f100987b.getBubbleOffset());
                        } else if (i == 48) {
                            point.x = (int) (view.getX() + cVar.f100987b.getBubbleOffset());
                            point.y = (int) (view.getY() + ((float) view.getMeasuredHeight()));
                        } else if (i == 80) {
                            point.x = (int) (view.getX() + cVar.f100987b.getBubbleOffset());
                            point.y = (int) view.getY();
                        }
                        view.setPivotY((float) point.y);
                        view.setPivotX((float) point.x);
                    } else {
                        C39481c cVar2 = C39481c.this;
                        int i2 = i;
                        View view2 = bubbleLayout;
                        Point point2 = new Point(0, 0);
                        if (i2 == 3) {
                            point2.x = (int) (view2.getX() + ((float) view2.getMeasuredWidth()));
                            point2.y = (int) (view2.getY() + cVar2.f100987b.getBubbleOffset());
                        } else if (i2 == 5) {
                            point2.x = (int) view2.getX();
                            point2.y = (int) (view2.getY() + cVar2.f100987b.getBubbleOffset());
                        } else if (i2 == 48) {
                            point2.x = (int) (view2.getX() + cVar2.f100987b.getBubbleOffset());
                            point2.y = (int) (view2.getY() + ((float) view2.getMeasuredHeight()));
                        } else if (i2 == 80) {
                            point2.x = (int) (view2.getX() + cVar2.f100987b.getBubbleOffset());
                            point2.y = (int) view2.getY();
                        }
                        view2.setPivotY((float) point2.y);
                        view2.setPivotX((float) point2.x);
                    }
                    View view3 = bubbleLayout;
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
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, str, fArr);
                    View view4 = bubbleLayout;
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
                    C39481c.this.f101000o.play(ofFloat).with(ObjectAnimator.ofFloat(view4, str2, fArr2));
                    AnimatorSet animatorSet = C39481c.this.f101000o;
                    if (z) {
                        j = C39481c.this.f101001p;
                    } else {
                        j = C39481c.this.f101002q;
                    }
                    animatorSet.setDuration(j);
                    if (C39481c.this.f100996k) {
                        C39481c.this.f101000o.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                    C39481c.this.f101000o.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (!z) {
                                bubbleLayout.setVisibility(8);
                                C39481c.this.mo80501d();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            if (z) {
                                bubbleLayout.setVisibility(0);
                            }
                        }
                    });
                    C39481c.this.f101000o.start();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo80490a(View view, int i, int i2) {
        mo80489a(view, 80);
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* renamed from: a */
    private void m87808a(View view, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - m87814h()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f100992g + view.getWidth() + this.f100986a, iArr[1] + this.f100993h + i2);
            mo80493a(true, i);
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - m87814h()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, ((iArr[0] + this.f100992g) - mo80498c()) - this.f100986a, iArr[1] + this.f100993h + i3);
            mo80493a(true, i);
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo80498c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f100992g + i4, ((iArr[1] - m87814h()) + this.f100993h) - this.f100986a);
            mo80493a(true, i);
        } else if (i == 80) {
            if (z) {
                i5 = (-view.getMeasuredWidth()) + ((view.getMeasuredWidth() - mo80498c()) / 2);
            }
            showAsDropDown(view, this.f100992g + i5, this.f100986a + this.f100993h);
            mo80493a(true, i);
        }
    }

    /* renamed from: b */
    private void m87810b(View view, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - m87814h()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, ((iArr[0] + this.f100992g) - mo80498c()) - this.f100986a, iArr[1] + this.f100993h + i2);
            mo80493a(true, i);
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - m87814h()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f100992g + view.getWidth() + this.f100986a, iArr[1] + this.f100993h + i3);
            mo80493a(true, i);
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo80498c()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f100992g + i4, ((iArr[1] - m87814h()) + this.f100993h) - this.f100986a);
            mo80493a(true, i);
        } else if (i == 80) {
            if (z) {
                i5 = (view.getMeasuredWidth() - mo80498c()) / 2;
            }
            showAsDropDown(view, this.f100992g + i5, this.f100986a + this.f100993h);
            mo80493a(true, i);
        }
    }

    /* renamed from: a */
    public final void mo80491a(View view, int i, boolean z, float f) {
        float f2;
        if (!this.f101005t.isFinishing() && view != null && view.getWindowToken() != null) {
            getContentView().removeCallbacks(this.f101009x);
            this.f100994i = i;
            if (!isShowing()) {
                int e = m87812e(i);
                mo80503e();
                if (i == 80 || i == 48) {
                    f2 = (float) (mo80498c() / 2);
                } else {
                    f2 = (float) (m87814h() / 2);
                }
                int[] iArr = new int[2];
                if (this.f101003r != null) {
                    Point point = (Point) this.f101003r.mo48684a();
                    iArr[0] = point.x;
                    iArr[1] = point.y;
                } else {
                    view.getLocationOnScreen(iArr);
                }
                m87813g();
                if (mo80494a()) {
                    this.f100987b.mo80423a(m87811d(e), f2);
                    m87808a(view, i, true, iArr);
                } else {
                    this.f100987b.mo80423a(e, f2);
                    m87810b(view, i, true, iArr);
                }
                this.f101006u = false;
                if (this.f100999n > 0) {
                    getContentView().postDelayed(this.f101009x, this.f100999n);
                }
                return;
            }
            C39487d.m87834a(this);
        }
    }
}

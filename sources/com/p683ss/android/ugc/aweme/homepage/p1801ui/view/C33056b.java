package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29722e;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31353f;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.PreDrawableInflate;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.b */
public final class C33056b extends C33071k {

    /* renamed from: a */
    public ImageView f85859a;

    /* renamed from: b */
    public ImageView f85860b;

    /* renamed from: c */
    public View f85861c;

    /* renamed from: d */
    public ImageView f85862d;

    /* renamed from: g */
    private ImageView f85863g;

    /* renamed from: h */
    private TextView f85864h;

    /* renamed from: i */
    private PreDrawableInflate f85865i = ((PreDrawableInflate) C35857a.m81002b(PreDrawableInflate.class));

    /* renamed from: j */
    private boolean f85866j;

    /* renamed from: k */
    private boolean f85867k;

    /* renamed from: l */
    private boolean f85868l;

    public final ImageView getRefreshIcon() {
        return this.f85862d;
    }

    /* renamed from: f */
    public final void mo70013f() {
        m76009a((View) this.f85863g, 0, (Callable<View>) new C33065e<View>(this));
    }

    /* renamed from: g */
    public final void mo70014g() {
        m76009a((View) this.f85863g, 8, (Callable<View>) new C33066f<View>(this));
    }

    /* renamed from: a */
    public final void mo70006a() {
        if (m76010a(false, this.f85867k, false)) {
            m76011b(this.f85866j, this.f85867k, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo70009b() {
        if (m76010a(false, this.f85867k, false)) {
            m76011b(this.f85866j, this.f85867k, false);
        }
        m76012c(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo70010c() {
        if (m76010a(true, this.f85867k, false)) {
            m76011b(this.f85866j, this.f85867k, false);
        }
        m76012c(false);
    }

    /* renamed from: i */
    public final void mo70039i() {
        if (this.f85859a != null) {
            this.f85859a.setLayerType(0, null);
        }
        if (this.f85860b != null) {
            this.f85860b.setLayerType(0, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public View mo70043o() {
        if (this.f85859a == null) {
            this.f85859a = new ImageView(getContext());
            this.f85859a.setScaleType(ScaleType.CENTER);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f85859a.setLayoutParams(layoutParams);
            addView(this.f85859a);
        }
        return this.f85859a;
    }

    /* renamed from: t */
    private View m76014t() {
        if (this.f85862d == null) {
            this.f85862d = new ImageView(getContext());
            this.f85862d.setScaleType(ScaleType.CENTER);
            this.f85862d.setImageDrawable(this.f85865i.getDrawable(R.drawable.czt, getContext()));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f85862d.setLayoutParams(layoutParams);
            addView(this.f85862d);
        }
        return this.f85862d;
    }

    /* renamed from: h */
    public final void mo70016h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue <= 0.66f) {
                    float f = ((floatValue / 0.66f) * 0.04f) + 1.0f;
                    C33056b.this.f85860b.setScaleX(f);
                    C33056b.this.f85860b.setScaleY(f);
                    return;
                }
                float f2 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
                C33056b.this.f85860b.setScaleX(f2);
                C33056b.this.f85860b.setScaleY(f2);
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: k */
    public final void mo70019k() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && C31357a.m73095a()) {
            Boolean bool = (Boolean) this.f85860b.getTag(C31357a.aqq);
            if (bool == null || !bool.booleanValue()) {
                mo70018j();
            }
        }
    }

    /* renamed from: l */
    public final View mo70040l() {
        if (this.f85860b == null) {
            this.f85860b = new ImageView(getContext());
            this.f85860b.setScaleType(ScaleType.CENTER);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f85860b.setLayoutParams(layoutParams);
            addView(this.f85860b);
        }
        return this.f85860b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && this.f85860b != null && (this.f85860b.getDrawable() instanceof C31353f)) {
            C31353f fVar = (C31353f) this.f85860b.getDrawable();
            if (fVar.isRunning()) {
                fVar.stop();
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: e */
    public final void mo70012e() {
        m76014t();
        mo70043o();
        mo70040l();
        this.f85862d.setVisibility(8);
        this.f85862d.setAlpha(1.0f);
        if (this.f85859a != null) {
            this.f85859a.setVisibility(0);
        }
        if (this.f85860b != null) {
            this.f85860b.setVisibility(0);
        }
        if (isSelected()) {
            if (this.f85859a != null) {
                this.f85859a.setAlpha(1.0f);
            }
            if (this.f85860b != null) {
                this.f85860b.setAlpha(0.0f);
            }
        } else {
            if (this.f85859a != null) {
                this.f85859a.setAlpha(0.0f);
            }
            if (this.f85860b != null) {
                this.f85860b.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: j */
    public final void mo70018j() {
        if (TextUtils.equals(getTabType(), "PUBLISH")) {
            boolean z = false;
            if (C31357a.m73095a()) {
                Drawable festivalDrawable = this.f85865i.getFestivalDrawable();
                if (festivalDrawable != null) {
                    if (!this.f85890f) {
                        this.f85860b.setScaleType(ScaleType.CENTER_INSIDE);
                        this.f85860b.setImageDrawable(festivalDrawable);
                        z = true;
                    } else {
                        return;
                    }
                }
            }
            if (!z) {
                boolean z2 = this.f85868l;
                int i = R.drawable.cyy;
                if (!z2) {
                    this.f85868l = true;
                    this.f85860b.setImageDrawable(this.f85865i.getDrawable(R.drawable.cyy, getContext()));
                    return;
                }
                if (this.f85867k) {
                    i = R.drawable.cz0;
                }
                this.f85860b.setImageDrawable(this.f85865i.getDrawable(i, getContext()));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ View mo70041m() {
        if (this.f85863g == null) {
            this.f85863g = new ImageView(getContext());
            this.f85863g.setImageDrawable(this.f85865i.getDrawable(R.drawable.czv, getContext()));
            int a = C23728o.m58241a(8.0d);
            LayoutParams layoutParams = new LayoutParams(a, a);
            this.f85863g.setScaleType(ScaleType.FIT_CENTER);
            layoutParams.setMargins(C23728o.m58241a(14.0d), C23728o.m58241a(6.0d), 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23728o.m58241a(14.0d));
            }
            layoutParams.gravity = 49;
            this.f85863g.setLayoutParams(layoutParams);
            addView(this.f85863g);
        }
        return this.f85863g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo70011d() {
        m76014t();
        mo70043o();
        mo70040l();
        this.f85862d.setVisibility(0);
        this.f85862d.setLayerType(2, null);
        m76009a((View) this.f85859a, 8, (Callable<View>) new C33063c<View>(this));
        m76009a((View) this.f85860b, 8, (Callable<View>) new C33064d<View>(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, -360.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33056b.this.f85862d.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationRepeat(Animator animator) {
                if (!C33056b.this.f85889e) {
                    ofFloat.setRepeatCount(0);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
                if (r4.f85871b.f85860b != null) goto L_0x0035;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
                if (r4.f85871b.f85859a != null) goto L_0x0035;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationEnd(android.animation.Animator r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    boolean r5 = r5.isSelected()
                    r0 = 1
                    r1 = 0
                    if (r5 != 0) goto L_0x0021
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85860b
                    com.ss.android.ugc.aweme.homepage.ui.view.i r2 = new com.ss.android.ugc.aweme.homepage.ui.view.i
                    com.ss.android.ugc.aweme.homepage.ui.view.b r3 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    r2.<init>(r3)
                    com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.m76009a(r5, r1, r2)
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85860b
                    if (r5 == 0) goto L_0x001f
                    goto L_0x0035
                L_0x001f:
                    r0 = 0
                    goto L_0x0035
                L_0x0021:
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85859a
                    com.ss.android.ugc.aweme.homepage.ui.view.j r2 = new com.ss.android.ugc.aweme.homepage.ui.view.j
                    com.ss.android.ugc.aweme.homepage.ui.view.b r3 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    r2.<init>(r3)
                    com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.m76009a(r5, r1, r2)
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85859a
                    if (r5 == 0) goto L_0x001f
                L_0x0035:
                    if (r0 != 0) goto L_0x0052
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85859a
                    if (r5 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85859a
                    r5.setVisibility(r1)
                    return
                L_0x0045:
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85860b
                    if (r5 == 0) goto L_0x0052
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.this
                    android.widget.ImageView r5 = r5.f85860b
                    r5.setVisibility(r1)
                L_0x0052:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.C330582.onAnimationEnd(android.animation.Animator):void");
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33056b.this.f85862d.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C33056b.this.f85862d.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f85862d.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
        animatorSet.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ View mo70042n() {
        if (this.f85864h == null) {
            C29722e eVar = new C29722e(getContext());
            eVar.setBackground(this.f85865i.getDrawable(R.drawable.cys, getContext()));
            eVar.setClickable(false);
            eVar.setGravity(17);
            eVar.setLines(1);
            eVar.setIncludeFontPadding(false);
            eVar.setTextSize(1, 12.0f);
            eVar.setLineSpacing((float) C23728o.m58241a(2.0d), 1.0f);
            eVar.setTextColor(getResources().getColor(R.color.b03));
            eVar.setPadding(C23728o.m58241a(5.0d), 0, C23728o.m58241a(5.0d), 0);
            eVar.setFontType(C10751d.f28908g);
            eVar.setMinWidth(C23728o.m58241a(16.0d));
            eVar.setMinHeight(C23728o.m58241a(16.0d));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(C23728o.m58241a(13.0d), C23728o.m58241a(4.0d), 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23728o.m58241a(13.0d));
            }
            layoutParams.gravity = 49;
            eVar.setLayoutParams(layoutParams);
            addView(eVar);
            this.f85864h = eVar;
        }
        return this.f85864h;
    }

    public final void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f85860b != null) {
            this.f85860b.setSelected(z);
            this.f85860b.invalidate();
        }
        if (m76010a(this.f85866j, z, true)) {
            m76011b(this.f85866j, this.f85867k, true);
        }
    }

    /* renamed from: c */
    private void m76012c(final boolean z) {
        ValueAnimator valueAnimator;
        mo70039i();
        if (TextUtils.equals(getTabType(), "HOME")) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f, 1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        }
        valueAnimator.setDuration(400);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                if (C33056b.this.f85861c != null && C33056b.this.f85861c.getVisibility() == 0) {
                    if (!z) {
                        C33056b.this.f85861c.setTranslationY(C9432q.m18687b(C33056b.this.getContext(), 2.0f) - ((C9432q.m18687b(C33056b.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration())));
                        return;
                    }
                    C33056b.this.f85861c.setTranslationY((C9432q.m18687b(C33056b.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration()));
                }
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C33056b.this.mo70039i();
                if (C33056b.this.f85861c != null && C33056b.this.f85861c.getVisibility() == 0) {
                    if (!z) {
                        C33056b.this.f85861c.setTranslationY(0.0f);
                        return;
                    }
                    C33056b.this.f85861c.setTranslationY(C9432q.m18687b(C33056b.this.getContext(), 2.0f));
                }
            }
        });
        valueAnimator.start();
    }

    /* renamed from: a */
    public final void mo70007a(int i) {
        String str;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i <= 0) {
                m76009a((View) this.f85864h, 8, (Callable<View>) new C33067g<View>(this));
                return;
            }
            m76009a((View) this.f85864h, 0, (Callable<View>) new C33068h<View>(this));
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f85864h.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo70008a(boolean z) {
        if (m76010a(true, this.f85867k, false)) {
            m76011b(this.f85866j, this.f85867k, true);
        }
    }

    /* renamed from: a */
    public static void m76009a(View view, int i, Callable<View> callable) {
        if (i == 4 || i == 0) {
            if (view == null) {
                try {
                    view = (View) callable.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            view.setVisibility(i);
            return;
        }
        if (i == 8 && view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private boolean m76010a(boolean z, boolean z2, boolean z3) {
        if (this.f85866j == z && this.f85867k == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f85866j = z;
            if (z3) {
                mo70040l();
            }
        } else if (this.f85866j != z || z3) {
            this.f85866j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f85867k = z2;
        } else if (this.f85867k != z2) {
            this.f85867k = z2;
            if (!this.f85866j || getTabType().equals("PUBLISH")) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r9.equals("DISCOVER") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r9.equals("DISCOVER") != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m76011b(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = -1
            if (r9 == 0) goto L_0x00ce
            java.lang.String r9 = r8.getTabType()
            java.lang.String r7 = "PUBLISH"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x00ce
            r8.mo70043o()
            java.lang.String r9 = r8.getTabType()
            int r10 = r9.hashCode()
            r7 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r10 == r7) goto L_0x0053
            r5 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r10 == r5) goto L_0x0049
            r4 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r10 == r4) goto L_0x003f
            r3 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r10 == r3) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            java.lang.String r10 = "DISCOVER"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            goto L_0x005e
        L_0x003f:
            java.lang.String r10 = "USER"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0049:
            java.lang.String r10 = "HOME"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x0053:
            java.lang.String r10 = "NOTIFICATION"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            switch(r2) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0088;
                case 2: goto L_0x0075;
                case 3: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00ad
        L_0x0062:
            android.widget.ImageView r9 = r8.f85859a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953070(0x7f1305ae, float:1.95426E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00ad
        L_0x0075:
            android.widget.ImageView r9 = r8.f85859a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953064(0x7f1305a8, float:1.9542588E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00ad
        L_0x0088:
            android.widget.ImageView r9 = r8.f85859a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953087(0x7f1305bf, float:1.9542635E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00ad
        L_0x009b:
            android.widget.ImageView r9 = r8.f85859a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953060(0x7f1305a4, float:1.954258E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
        L_0x00ad:
            if (r11 == 0) goto L_0x01c4
            android.widget.ImageView r9 = r8.f85859a
            r9.setAlpha(r1)
            android.widget.ImageView r9 = r8.f85860b
            if (r9 == 0) goto L_0x00bd
            android.widget.ImageView r9 = r8.f85860b
            r9.setAlpha(r0)
        L_0x00bd:
            android.view.View r9 = r8.f85861c
            if (r9 == 0) goto L_0x01c4
            android.view.View r9 = r8.f85861c
            r10 = 0
            int r10 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r10)
            float r10 = (float) r10
            r9.setTranslationY(r10)
            return
        L_0x00ce:
            r8.mo70040l()
            java.lang.String r9 = r8.getTabType()
            int r7 = r9.hashCode()
            switch(r7) {
                case -1382453013: goto L_0x0104;
                case 2223327: goto L_0x00fa;
                case 2614219: goto L_0x00f0;
                case 482617583: goto L_0x00e6;
                case 1055811561: goto L_0x00dd;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            goto L_0x010e
        L_0x00dd:
            java.lang.String r3 = "DISCOVER"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x010e
            goto L_0x010f
        L_0x00e6:
            java.lang.String r2 = "PUBLISH"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010e
            r2 = 4
            goto L_0x010f
        L_0x00f0:
            java.lang.String r2 = "USER"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010e
            r2 = 3
            goto L_0x010f
        L_0x00fa:
            java.lang.String r2 = "HOME"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010e
            r2 = 0
            goto L_0x010f
        L_0x0104:
            java.lang.String r2 = "NOTIFICATION"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x010e
            r2 = 2
            goto L_0x010f
        L_0x010e:
            r2 = -1
        L_0x010f:
            switch(r2) {
                case 0: goto L_0x0192;
                case 1: goto L_0x016a;
                case 2: goto L_0x0142;
                case 3: goto L_0x0119;
                case 4: goto L_0x0114;
                default: goto L_0x0112;
            }
        L_0x0112:
            goto L_0x01a4
        L_0x0114:
            r8.mo70018j()
            goto L_0x01a4
        L_0x0119:
            if (r10 == 0) goto L_0x012f
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953072(0x7f1305b0, float:1.9542605E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x012f:
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953074(0x7f1305b2, float:1.9542609E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x0142:
            if (r10 == 0) goto L_0x0157
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953066(0x7f1305aa, float:1.9542592E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x0157:
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953068(0x7f1305ac, float:1.9542597E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x016a:
            if (r10 == 0) goto L_0x017f
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953076(0x7f1305b4, float:1.9542613E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x017f:
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953078(0x7f1305b6, float:1.9542617E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01a4
        L_0x0192:
            android.widget.ImageView r9 = r8.f85860b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f85865i
            r2 = 2131953062(0x7f1305a6, float:1.9542584E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
        L_0x01a4:
            if (r11 == 0) goto L_0x01c4
            android.widget.ImageView r9 = r8.f85860b
            r9.setAlpha(r1)
            android.widget.ImageView r9 = r8.f85859a
            if (r9 == 0) goto L_0x01b4
            android.widget.ImageView r9 = r8.f85859a
            r9.setAlpha(r0)
        L_0x01b4:
            android.view.View r9 = r8.f85861c
            if (r9 == 0) goto L_0x01c4
            android.view.View r9 = r8.f85861c
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r10 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r10)
            float r10 = (float) r10
            r9.setTranslationY(r10)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33056b.m76011b(boolean, boolean, boolean):void");
    }

    public C33056b(Context context, String str, MainBottomTabView mainBottomTabView, boolean z, boolean z2) {
        super(context, str, mainBottomTabView);
        int i = 0;
        if (m76010a(z, false, true)) {
            m76011b(this.f85866j, this.f85867k, true);
        }
        if (this.f85861c == null) {
            this.f85861c = new View(getContext());
            this.f85861c.setBackground(this.f85865i.getDrawable(2131953089, getContext()));
            LayoutParams layoutParams = new LayoutParams(C23728o.m58241a(28.0d), C23728o.m58241a(2.0d));
            layoutParams.gravity = 81;
            this.f85861c.setLayoutParams(layoutParams);
            addView(this.f85861c);
        }
        View view = this.f85861c;
        View view2 = this.f85861c;
        if (C22453b.m55510c()) {
            i = 8;
        }
        C23729p.m58257a(view2, i);
    }
}

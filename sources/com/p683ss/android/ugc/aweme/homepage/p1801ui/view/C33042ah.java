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
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29722e;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31353f;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.PreDrawableInflate;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.ah */
public final class C33042ah extends C33071k {

    /* renamed from: a */
    public ImageView f85836a;

    /* renamed from: b */
    public ImageView f85837b;

    /* renamed from: c */
    public ImageView f85838c;

    /* renamed from: d */
    private ImageView f85839d;

    /* renamed from: g */
    private TextView f85840g;

    /* renamed from: h */
    private DmtTextView f85841h;

    /* renamed from: i */
    private PreDrawableInflate f85842i = ((PreDrawableInflate) C35857a.m81002b(PreDrawableInflate.class));

    /* renamed from: j */
    private boolean f85843j;

    /* renamed from: k */
    private boolean f85844k;

    public final ImageView getRefreshIcon() {
        return this.f85838c;
    }

    /* renamed from: r */
    public final void mo70024r() {
        m75991u();
    }

    /* renamed from: a */
    public final void mo70006a() {
        if (m75987a(false, this.f85844k, false)) {
            m75991u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo70009b() {
        if (m75987a(false, this.f85844k, false)) {
            m75991u();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo70010c() {
        if (m75987a(true, this.f85844k, false)) {
            m75991u();
        }
    }

    /* renamed from: f */
    public final void mo70013f() {
        m75986a((View) this.f85839d, 0, (Callable<View>) new C33048ak<View>(this));
    }

    /* renamed from: g */
    public final void mo70014g() {
        m75986a((View) this.f85839d, 8, (Callable<View>) new C33049al<View>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public View mo70021m() {
        if (this.f85836a == null) {
            this.f85836a = new ImageView(getContext());
            this.f85836a.setScaleType(ScaleType.FIT_CENTER);
            int b = (int) C9432q.m18687b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f85836a.setLayoutParams(layoutParams);
            addView(this.f85836a);
        }
        return this.f85836a;
    }

    /* renamed from: h */
    public final void mo70016h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C33050am(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: i */
    public final View mo70017i() {
        if (this.f85837b == null) {
            this.f85837b = new ImageView(getContext());
            this.f85837b.setScaleType(ScaleType.FIT_CENTER);
            int b = (int) C9432q.m18687b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f85837b.setLayoutParams(layoutParams);
            addView(this.f85837b);
        }
        return this.f85837b;
    }

    /* renamed from: k */
    public final void mo70019k() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && C31357a.m73095a()) {
            Boolean bool = (Boolean) this.f85837b.getTag(C31357a.aqq);
            if (bool == null || !bool.booleanValue()) {
                mo70018j();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && this.f85837b != null && (this.f85837b.getDrawable() instanceof C31353f)) {
            C31353f fVar = (C31353f) this.f85837b.getDrawable();
            if (fVar.isRunning()) {
                fVar.stop();
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: t */
    private View m75990t() {
        if (this.f85838c == null) {
            this.f85838c = new ImageView(getContext());
            this.f85838c.setScaleType(ScaleType.FIT_CENTER);
            this.f85838c.setImageDrawable(this.f85842i.getDrawable(R.drawable.czt, getContext()));
            int b = (int) C9432q.m18687b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f85838c.setLayoutParams(layoutParams);
            addView(this.f85838c);
        }
        return this.f85838c;
    }

    /* renamed from: e */
    public final void mo70012e() {
        m75990t();
        mo70021m();
        mo70017i();
        m75989s();
        this.f85838c.setVisibility(8);
        this.f85838c.setAlpha(1.0f);
        if (this.f85836a != null) {
            this.f85836a.setVisibility(0);
        }
        if (this.f85837b != null) {
            this.f85837b.setVisibility(0);
        }
        if (isSelected()) {
            if (this.f85836a != null) {
                this.f85836a.setAlpha(1.0f);
            }
            if (this.f85837b != null) {
                this.f85837b.setAlpha(0.0f);
            }
        } else {
            if (this.f85836a != null) {
                this.f85836a.setAlpha(0.0f);
            }
            if (this.f85837b != null) {
                this.f85837b.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: j */
    public final void mo70018j() {
        if (TextUtils.equals(getTabType(), "PUBLISH")) {
            boolean z = false;
            if (C31357a.m73095a()) {
                Drawable festivalDrawable = this.f85842i.getFestivalDrawable();
                if (festivalDrawable != null) {
                    if (!this.f85890f) {
                        this.f85837b.setScaleType(ScaleType.CENTER_INSIDE);
                        this.f85837b.setImageDrawable(festivalDrawable);
                        z = true;
                    } else {
                        return;
                    }
                }
            }
            if (!z) {
                if (this.f85844k) {
                    this.f85837b.setImageDrawable(this.f85842i.getDrawable(R.drawable.cz0, getContext()));
                    return;
                }
                this.f85837b.setImageDrawable(this.f85842i.getDrawable(R.drawable.cyy, getContext()));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ View mo70020l() {
        if (this.f85839d == null) {
            this.f85839d = new ImageView(getContext());
            this.f85839d.setImageDrawable(this.f85842i.getDrawable(R.drawable.czv, getContext()));
            int a = C23728o.m58241a(8.0d);
            LayoutParams layoutParams = new LayoutParams(a, a);
            this.f85839d.setScaleType(ScaleType.FIT_CENTER);
            layoutParams.setMargins(C23728o.m58241a(16.0d), C23728o.m58241a(4.0d), 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23728o.m58241a(16.0d));
            }
            layoutParams.gravity = 49;
            this.f85839d.setLayoutParams(layoutParams);
            addView(this.f85839d);
        }
        return this.f85839d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo70011d() {
        m75990t();
        mo70021m();
        mo70017i();
        m75989s();
        this.f85838c.setVisibility(0);
        this.f85838c.setLayerType(2, null);
        m75986a((View) this.f85836a, 8, (Callable<View>) new C33046ai<View>(this));
        m75986a((View) this.f85837b, 8, (Callable<View>) new C33047aj<View>(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, -360.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33042ah.this.f85838c.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationRepeat(Animator animator) {
                if (!C33042ah.this.f85889e) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!C33042ah.this.isSelected()) {
                    C33042ah.m75986a((View) C33042ah.this.f85837b, 0, (Callable<View>) new C33053ap<View>(C33042ah.this));
                } else {
                    C33042ah.m75986a((View) C33042ah.this.f85836a, 0, (Callable<View>) new C33054aq<View>(C33042ah.this));
                }
                if (C33042ah.this.f85836a != null) {
                    C33042ah.this.f85836a.setVisibility(0);
                }
                if (C33042ah.this.f85837b != null) {
                    C33042ah.this.f85837b.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C33042ah.this.f85838c.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C33042ah.this.f85838c.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f85838c.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
        animatorSet.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ View mo70022n() {
        if (this.f85840g == null) {
            C29722e eVar = new C29722e(getContext());
            eVar.setBackground(this.f85842i.getDrawable(R.drawable.cys, getContext()));
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
            layoutParams.setMargins(C23728o.m58241a(13.0d), C23728o.m58241a(2.0d), 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23728o.m58241a(13.0d));
            }
            layoutParams.gravity = 49;
            eVar.setLayoutParams(layoutParams);
            addView(eVar);
            this.f85840g = eVar;
        }
        return this.f85840g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        if (r0.equals("DISCOVER") == false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0105  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m75989s() {
        /*
            r7 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            if (r0 != 0) goto L_0x012e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            r7.f85841h = r0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            java.lang.String r1 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r0.setFontType(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 1091567616(0x41100000, float:9.0)
            r2 = 1
            r0.setTextSize(r2, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            android.content.res.Resources r1 = r7.getResources()
            r3 = 2131822822(0x7f1108e6, float:1.9278426E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            android.content.Context r1 = r7.getContext()
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setLineSpacing(r1, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x004d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0.setLetterSpacing(r1)
        L_0x004d:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            java.lang.String r3 = r7.getTabType()
            java.lang.String r4 = "NOTIFICATION"
            boolean r3 = r3.equals(r4)
            r4 = -1
            if (r3 == 0) goto L_0x0071
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f85841h
            r3 = 17
            r1.setGravity(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f85841h
            r1.setSingleLine(r2)
        L_0x0071:
            r1 = 81
            r0.gravity = r1
            android.content.Context r1 = r7.getContext()
            r3 = 1082130432(0x40800000, float:4.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r3)
            int r1 = (int) r1
            r0.bottomMargin = r1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f85841h
            r1.setLayoutParams(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r7.addView(r0)
            java.lang.String r0 = r7.getTabType()
            int r1 = r0.hashCode()
            r3 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r3) goto L_0x00c6
            r3 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r3) goto L_0x00bc
            r3 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 == r3) goto L_0x00b2
            r3 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r1 == r3) goto L_0x00a9
            goto L_0x00d0
        L_0x00a9:
            java.lang.String r1 = "DISCOVER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00b2:
            java.lang.String r1 = "USER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 3
            goto L_0x00d1
        L_0x00bc:
            java.lang.String r1 = "HOME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 0
            goto L_0x00d1
        L_0x00c6:
            java.lang.String r1 = "NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 2
            goto L_0x00d1
        L_0x00d0:
            r2 = -1
        L_0x00d1:
            switch(r2) {
                case 0: goto L_0x0105;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x012e
        L_0x00d5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132546403(0x7f1c1363, float:2.0746023E38)
            r0.setText(r1)
            goto L_0x012e
        L_0x00de:
            com.ss.android.ugc.aweme.services.IMainService r0 = com.p683ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.p683ss.android.ugc.aweme.services.IMainService) r0
            boolean r0 = r0.isNotificationTabMStyle()
            if (r0 == 0) goto L_0x00f3
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132547139(0x7f1c1643, float:2.0747516E38)
            r0.setText(r1)
            goto L_0x012e
        L_0x00f3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132546404(0x7f1c1364, float:2.0746025E38)
            r0.setText(r1)
            goto L_0x012e
        L_0x00fc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132546401(0x7f1c1361, float:2.0746019E38)
            r0.setText(r1)
            goto L_0x012e
        L_0x0105:
            boolean r0 = com.p683ss.android.ugc.aweme.language.C35837h.m80982g()
            if (r0 == 0) goto L_0x0126
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment> r2 = com.p683ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment.class
            r3 = 1
            java.lang.String r4 = "for_you_new_translations"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            boolean r0 = r1.mo18172a(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0126
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132545111(0x7f1c0e57, float:2.0743402E38)
            r0.setText(r1)
            goto L_0x012e
        L_0x0126:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            r1 = 2132546402(0x7f1c1362, float:2.074602E38)
            r0.setText(r1)
        L_0x012e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f85841h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33042ah.m75989s():android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r0.equals("DISCOVER") == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0147, code lost:
        if (r9.equals("DISCOVER") != false) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ff  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m75991u() {
        /*
            r12 = this;
            boolean r0 = r12.f85843j
            boolean r1 = r12.f85844k
            r2 = 0
            r3 = 1
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -1
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = r12.getTabType()
            java.lang.String r9 = "PUBLISH"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0105
            r12.mo70021m()
            r12.m75989s()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f85841h
            java.lang.String r1 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28903b
            r0.setFontType(r1)
            java.lang.String r0 = r12.getTabType()
            int r1 = r0.hashCode()
            r9 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r9) goto L_0x0061
            r6 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r6) goto L_0x0057
            r5 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 == r5) goto L_0x004d
            r4 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r1 == r4) goto L_0x0044
            goto L_0x006b
        L_0x0044:
            java.lang.String r1 = "DISCOVER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006b
            goto L_0x006c
        L_0x004d:
            java.lang.String r1 = "USER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006b
            r3 = 3
            goto L_0x006c
        L_0x0057:
            java.lang.String r1 = "HOME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006b
            r3 = 0
            goto L_0x006c
        L_0x0061:
            java.lang.String r1 = "NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006b
            r3 = 2
            goto L_0x006c
        L_0x006b:
            r3 = -1
        L_0x006c:
            r0 = 2131820810(0x7f11010a, float:1.9274345E38)
            switch(r3) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00b4;
                case 2: goto L_0x0094;
                case 3: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x00f6
        L_0x0074:
            android.widget.ImageView r1 = r12.f85836a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r3 = r12.f85842i
            r4 = 2131953069(0x7f1305ad, float:1.9542599E38)
            android.content.Context r5 = r12.getContext()
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4, r5)
            r1.setImageDrawable(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.f85841h
            android.content.res.Resources r3 = r12.getResources()
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            goto L_0x00f6
        L_0x0094:
            android.widget.ImageView r1 = r12.f85836a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r3 = r12.f85842i
            r4 = 2131953063(0x7f1305a7, float:1.9542586E38)
            android.content.Context r5 = r12.getContext()
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4, r5)
            r1.setImageDrawable(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.f85841h
            android.content.res.Resources r3 = r12.getResources()
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            goto L_0x00f6
        L_0x00b4:
            android.widget.ImageView r1 = r12.f85836a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r3 = r12.f85842i
            r4 = 2131953086(0x7f1305be, float:1.9542633E38)
            android.content.Context r5 = r12.getContext()
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4, r5)
            r1.setImageDrawable(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.f85841h
            android.content.res.Resources r3 = r12.getResources()
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            goto L_0x00f6
        L_0x00d4:
            android.widget.ImageView r0 = r12.f85836a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953059(0x7f1305a3, float:1.9542578E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f85841h
            android.content.res.Resources r1 = r12.getResources()
            r3 = 2131820808(0x7f110108, float:1.9274341E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x00f6:
            android.widget.ImageView r0 = r12.f85836a
            r0.setAlpha(r7)
            android.widget.ImageView r0 = r12.f85837b
            if (r0 == 0) goto L_0x0223
            android.widget.ImageView r0 = r12.f85837b
            r0.setAlpha(r2)
            return
        L_0x0105:
            r12.mo70017i()
            r12.m75989s()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f85841h
            java.lang.String r9 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r0.setFontType(r9)
            r0 = 2131820809(0x7f110109, float:1.9274343E38)
            if (r1 == 0) goto L_0x0125
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r12.f85841h
            android.content.res.Resources r10 = r12.getResources()
            int r10 = r10.getColor(r0)
            r9.setTextColor(r10)
            goto L_0x0135
        L_0x0125:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r12.f85841h
            android.content.res.Resources r10 = r12.getResources()
            r11 = 2131820811(0x7f11010b, float:1.9274347E38)
            int r10 = r10.getColor(r11)
            r9.setTextColor(r10)
        L_0x0135:
            java.lang.String r9 = r12.getTabType()
            int r10 = r9.hashCode()
            switch(r10) {
                case -1382453013: goto L_0x0168;
                case 2223327: goto L_0x015e;
                case 2614219: goto L_0x0154;
                case 482617583: goto L_0x014a;
                case 1055811561: goto L_0x0141;
                default: goto L_0x0140;
            }
        L_0x0140:
            goto L_0x0172
        L_0x0141:
            java.lang.String r4 = "DISCOVER"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0172
            goto L_0x0173
        L_0x014a:
            java.lang.String r3 = "PUBLISH"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0172
            r3 = 4
            goto L_0x0173
        L_0x0154:
            java.lang.String r3 = "USER"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0172
            r3 = 3
            goto L_0x0173
        L_0x015e:
            java.lang.String r3 = "HOME"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0172
            r3 = 0
            goto L_0x0173
        L_0x0168:
            java.lang.String r3 = "NOTIFICATION"
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0172
            r3 = 2
            goto L_0x0173
        L_0x0172:
            r3 = -1
        L_0x0173:
            switch(r3) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01ce;
                case 2: goto L_0x01a6;
                case 3: goto L_0x017d;
                case 4: goto L_0x0178;
                default: goto L_0x0176;
            }
        L_0x0176:
            goto L_0x0215
        L_0x0178:
            r12.mo70018j()
            goto L_0x0215
        L_0x017d:
            if (r1 == 0) goto L_0x0193
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953071(0x7f1305af, float:1.9542603E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x0193:
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953073(0x7f1305b1, float:1.9542607E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x01a6:
            if (r1 == 0) goto L_0x01bb
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953065(0x7f1305a9, float:1.954259E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x01bb:
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953067(0x7f1305ab, float:1.9542595E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x01ce:
            if (r1 == 0) goto L_0x01e3
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953075(0x7f1305b3, float:1.954261E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x01e3:
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953077(0x7f1305b5, float:1.9542615E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
            goto L_0x0215
        L_0x01f6:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r12.f85841h
            android.content.res.Resources r3 = r12.getResources()
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            android.widget.ImageView r0 = r12.f85837b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r1 = r12.f85842i
            r3 = 2131953061(0x7f1305a5, float:1.9542582E38)
            android.content.Context r4 = r12.getContext()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r3, r4)
            r0.setImageDrawable(r1)
        L_0x0215:
            android.widget.ImageView r0 = r12.f85836a
            if (r0 == 0) goto L_0x021e
            android.widget.ImageView r0 = r12.f85836a
            r0.setAlpha(r2)
        L_0x021e:
            android.widget.ImageView r0 = r12.f85837b
            r0.setAlpha(r7)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33042ah.m75991u():void");
    }

    /* renamed from: a */
    public final void mo70008a(boolean z) {
        if (m75987a(true, this.f85844k, false)) {
            m75991u();
        }
    }

    public final void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f85837b != null) {
            this.f85837b.setSelected(z);
            this.f85837b.invalidate();
        }
        if (m75987a(this.f85843j, z, true)) {
            m75991u();
        }
    }

    /* renamed from: a */
    public final void mo70007a(int i) {
        String str;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i <= 0) {
                m75986a((View) this.f85840g, 8, (Callable<View>) new C33051an<View>(this));
                return;
            }
            m75986a((View) this.f85840g, 0, (Callable<View>) new C33052ao<View>(this));
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f85840g.setText(str);
        }
    }

    /* renamed from: a */
    public static void m75986a(View view, int i, Callable<View> callable) {
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
    private boolean m75987a(boolean z, boolean z2, boolean z3) {
        if (this.f85843j == z && this.f85844k == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f85843j = z;
            if (z3) {
                mo70017i();
                m75989s();
            }
        } else if (this.f85843j != z || z3) {
            this.f85843j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f85844k = z2;
        } else if (this.f85844k != z2) {
            this.f85844k = z2;
            if (!this.f85843j || getTabType().equals("PUBLISH")) {
                z3 = true;
            }
        }
        return z3;
    }

    public C33042ah(Context context, String str, MainBottomTabView mainBottomTabView, boolean z, boolean z2) {
        super(context, str, mainBottomTabView);
        mo70021m();
        if (m75987a(z, false, true)) {
            m75991u();
        }
    }
}

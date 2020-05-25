package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a.C37376a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem */
public final class StarTcmItem extends LinearLayout {

    /* renamed from: a */
    private View f66128a;

    /* renamed from: b */
    private ValueAnimator f66129b;

    /* renamed from: c */
    private HashMap f66130c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a */
    static final class C24977a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StarTcmItem f66131a;

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$a */
        static final class C24978a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C24977a f66132a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f66133b;

            /* renamed from: c */
            final /* synthetic */ int f66134c;

            C24978a(C24977a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f66132a = aVar;
                this.f66133b = marginLayoutParams;
                this.f66134c = i;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    StarTcmItem starTcmItem = this.f66132a.f66131a;
                    float f = 0.0f;
                    if (floatValue >= 0.0f && floatValue <= 200.0f) {
                        f = 1.0f - (floatValue / 200.0f);
                    }
                    starTcmItem.setAlpha(f);
                    if (floatValue >= 100.0f && floatValue <= 300.0f) {
                        View underView = this.f66132a.f66131a.getUnderView();
                        if (underView != null) {
                            float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f66132a.f66131a.getHeight()) + ((float) this.f66133b.topMargin) + ((float) this.f66133b.bottomMargin));
                            LayoutParams layoutParams = underView.getLayoutParams();
                            if (layoutParams != null) {
                                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = this.f66134c - ((int) height);
                                underView.setLayoutParams(marginLayoutParams);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a$b */
        public static final class C24979b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C24977a f66135a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f66136b;

            /* renamed from: c */
            final /* synthetic */ int f66137c;

            public final void onAnimationStart(Animator animator) {
                View underView = this.f66135a.f66131a.getUnderView();
                if (underView != null) {
                    LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f66135a.f66131a.getHeight() + this.f66136b.topMargin + this.f66136b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            C24979b(C24977a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f66135a = aVar;
                this.f66136b = marginLayoutParams;
                this.f66137c = i;
            }
        }

        C24977a(StarTcmItem starTcmItem) {
            this.f66131a = starTcmItem;
        }

        public final void onClick(View view) {
            LayoutParams layoutParams;
            ClickInstrumentation.onClick(view);
            C37376a.m83687a("show_tcm_info", Boolean.valueOf(false), "music_sp");
            LayoutParams layoutParams2 = this.f66131a.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                View underView = this.f66131a.getUnderView();
                if (underView != null) {
                    layoutParams = underView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    int i = ((MarginLayoutParams) layoutParams).topMargin;
                    StarTcmItem starTcmItem = this.f66131a;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 300.0f});
                    ofFloat.addUpdateListener(new C24978a(this, marginLayoutParams, i));
                    ofFloat.addListener(new C24979b(this, marginLayoutParams, i));
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    starTcmItem.setCurrentAnimator(ofFloat);
                    ValueAnimator currentAnimator = this.f66131a.getCurrentAnimator();
                    if (currentAnimator != null) {
                        currentAnimator.start();
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public StarTcmItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public StarTcmItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m60778a(int i) {
        if (this.f66130c == null) {
            this.f66130c = new HashMap();
        }
        View view = (View) this.f66130c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66130c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f66129b;
    }

    public final View getUnderView() {
        return this.f66128a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f66129b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    public final void mo50957a() {
        View a = m60778a(R.id.cxu);
        C52711k.m112236a((Object) a, "tcmSpace");
        a.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo50958b() {
        View a = m60778a(R.id.cxu);
        C52711k.m112236a((Object) a, "tcmSpace");
        a.setVisibility(0);
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f66129b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f66128a = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r7.intValue() == 0) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StarTcmItem(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            r4.<init>(r5, r6, r7)
            r6 = r4
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r7 = 2132216534(0x7f170ad6, float:2.007697E38)
            android.view.View.inflate(r5, r7, r6)
            r5 = 1
            r4.setOrientation(r5)
            r6 = 2132023262(0x7f1417de, float:1.9684967E38)
            android.view.View r6 = r4.m60778a(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a r7 = new com.ss.android.ugc.aweme.choosemusic.view.StarTcmItem$a
            r7.<init>(r4)
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r6.setOnClickListener(r7)
            r6 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r7 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)     // Catch:{ Exception -> 0x003f }
            java.lang.Integer r7 = r7.getTcmCtrySettings()     // Catch:{ Exception -> 0x003f }
            if (r7 != 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x003f }
            if (r7 != 0) goto L_0x0041
        L_0x003f:
            r7 = 1
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r1 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r0 = r0.getTcmNameCtry()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            java.lang.String r0 = "TCM"
        L_0x0052:
            r1 = 2132022955(0x7f1416ab, float:1.9684344E38)
            android.view.View r1 = r4.m60778a(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r7 == 0) goto L_0x0061
            r2 = 2131953879(0x7f1308d7, float:1.9544241E38)
            goto L_0x0064
        L_0x0061:
            r2 = 2131953878(0x7f1308d6, float:1.954424E38)
        L_0x0064:
            r1.setImageResource(r2)
            r1 = 2132022956(0x7f1416ac, float:1.9684346E38)
            android.view.View r1 = r4.m60778a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            java.lang.String r2 = "star_atlas_toast"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Context r2 = r4.getContext()
            if (r7 == 0) goto L_0x007f
            r7 = 2132546824(0x7f1c1508, float:2.0746877E38)
            goto L_0x0082
        L_0x007f:
            r7 = 2132546823(0x7f1c1507, float:2.0746875E38)
        L_0x0082:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r6] = r0
            java.lang.String r6 = r2.getString(r7, r3)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            r6 = 0
            r4.setLayerType(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.view.StarTcmItem.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ StarTcmItem(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

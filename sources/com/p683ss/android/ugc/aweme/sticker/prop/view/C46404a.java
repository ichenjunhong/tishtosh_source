package com.p683ss.android.ugc.aweme.sticker.prop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.view.a */
public class C46404a extends RelativeLayout implements OnGlobalLayoutListener {

    /* renamed from: a */
    public String f117067a;

    /* renamed from: b */
    public boolean f117068b;

    /* renamed from: c */
    int f117069c;

    /* renamed from: d */
    public boolean f117070d;

    /* renamed from: e */
    public TextView f117071e;

    /* renamed from: f */
    ImageView f117072f;

    /* renamed from: g */
    public ViewGroup f117073g;

    /* renamed from: h */
    private String f117074h;

    /* renamed from: i */
    private String f117075i;

    /* renamed from: j */
    private int f117076j;

    /* renamed from: k */
    private boolean f117077k;

    /* renamed from: l */
    private TextView f117078l;

    /* renamed from: m */
    private TextPaint f117079m;

    /* renamed from: a */
    public final void mo93116a() {
        String str;
        TextView textView = this.f117078l;
        if (this.f117068b) {
            str = this.f117074h;
        } else {
            str = this.f117075i;
        }
        textView.setText(str);
    }

    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f117077k = false;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (!this.f117067a.isEmpty()) {
            DynamicLayout dynamicLayout = new DynamicLayout(this.f117067a, this.f117079m, measuredWidth, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() > this.f117076j) {
                final String a = m100763a(dynamicLayout.getLineStart(this.f117076j - 1), dynamicLayout.getLineStart(this.f117076j) - 1, this.f117067a, measuredWidth);
                this.f117073g.setVisibility(0);
                final int a2 = m100762a(this.f117071e, measuredWidth, a);
                final int a3 = m100762a(this.f117071e, measuredWidth, this.f117067a);
                if (a2 == a3) {
                    this.f117068b = false;
                    this.f117071e.setText(this.f117067a);
                } else {
                    this.f117071e.setText(a);
                    this.f117068b = true;
                    this.f117069c = this.f117073g.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) this.f117073g.getLayoutParams();
                    layoutParams.topMargin = -this.f117069c;
                    this.f117073g.setLayoutParams(layoutParams);
                }
                this.f117073g.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        int i;
                        ValueAnimator valueAnimator;
                        ValueAnimator valueAnimator2;
                        ClickInstrumentation.onClick(view);
                        C46404a.this.f117068b = !C46404a.this.f117068b;
                        if (C46404a.this.f117070d) {
                            C46404a aVar = C46404a.this;
                            int i2 = a2;
                            int i3 = a3;
                            String str = a;
                            int i4 = -aVar.f117069c;
                            boolean z = aVar.f117068b;
                            int i5 = NormalGiftView.ALPHA_180;
                            if (!z) {
                                i = 0;
                            } else {
                                i = NormalGiftView.ALPHA_180;
                            }
                            if (aVar.f117068b) {
                                i5 = 0;
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f117072f, "rotation", new float[]{(float) i, (float) i5});
                            if (!aVar.f117068b) {
                                valueAnimator = ValueAnimator.ofInt(new int[]{i4, 0});
                            } else {
                                valueAnimator = ValueAnimator.ofInt(new int[]{0, i4});
                            }
                            if (!aVar.f117068b) {
                                valueAnimator2 = ValueAnimator.ofInt(new int[]{i2, i3});
                            } else {
                                valueAnimator2 = ValueAnimator.ofInt(new int[]{i3, i2});
                            }
                            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) C46404a.this.f117073g.getLayoutParams();
                                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    C46404a.this.f117073g.setLayoutParams(marginLayoutParams);
                                }
                            });
                            valueAnimator2.addUpdateListener(new AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    ViewGroup.LayoutParams layoutParams = C46404a.this.f117071e.getLayoutParams();
                                    layoutParams.height = intValue;
                                    C46404a.this.f117071e.setLayoutParams(layoutParams);
                                }
                            });
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.addListener(new AnimatorListenerAdapter(str) {

                                /* renamed from: a */
                                final /* synthetic */ String f117086a;

                                public final void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    if (C46404a.this.f117068b) {
                                        C46404a.this.f117071e.setText(this.f117086a);
                                    }
                                }

                                public final void onAnimationStart(Animator animator) {
                                    super.onAnimationStart(animator);
                                    if (!C46404a.this.f117068b) {
                                        C46404a.this.f117071e.setText(C46404a.this.f117067a);
                                    }
                                }

                                {
                                    this.f117086a = r2;
                                }
                            });
                            animatorSet.play(valueAnimator2).with(valueAnimator).with(ofFloat);
                            animatorSet.setDuration(400);
                            animatorSet.start();
                        } else {
                            C46404a aVar2 = C46404a.this;
                            String str2 = a;
                            LayoutParams layoutParams = (LayoutParams) aVar2.f117073g.getLayoutParams();
                            if (aVar2.f117068b) {
                                layoutParams.topMargin = -aVar2.f117069c;
                                aVar2.f117071e.setText(str2);
                                aVar2.f117072f.setRotation(0.0f);
                            } else {
                                layoutParams.topMargin = 0;
                                aVar2.f117071e.setText(aVar2.f117067a);
                                aVar2.f117072f.setRotation(180.0f);
                            }
                            aVar2.f117073g.setLayoutParams(layoutParams);
                        }
                        C46404a.this.mo93116a();
                    }
                });
            } else {
                this.f117068b = false;
                this.f117071e.setText(this.f117067a);
                this.f117073g.setVisibility(8);
            }
            mo93116a();
        }
    }

    public void setMaxLine(int i) {
        this.f117076j = i;
    }

    public void setUseAnimationWhenFold(boolean z) {
        this.f117070d = z;
    }

    public void setExpandTextColor(int i) {
        this.f117078l.setTextColor(i);
    }

    public void setExpandTextSize(int i) {
        this.f117078l.setTextSize(1, (float) i);
    }

    public void setMainTextColor(int i) {
        this.f117071e.setTextColor(i);
    }

    public void setMainTextSize(int i) {
        this.f117071e.setTextSize(1, (float) i);
    }

    public void setMainText(String str) {
        this.f117067a = str;
        this.f117071e.setLayoutParams(new LayoutParams(-1, -2));
        if (!this.f117077k) {
            this.f117077k = true;
            getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        requestLayout();
    }

    /* renamed from: a */
    private static int m100762a(TextView textView, int i, CharSequence charSequence) {
        TextView textView2 = new TextView(textView.getContext());
        textView2.setTextSize(0, textView.getTextSize());
        textView2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        textView2.setTypeface(textView.getTypeface());
        textView2.setIncludeFontPadding(textView.getIncludeFontPadding());
        textView2.setText(charSequence);
        textView2.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        textView2.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        return textView2.getMeasuredHeight();
    }

    /* renamed from: a */
    private String m100763a(int i, int i2, String str, int i3) {
        int i4;
        TextPaint textPaint = this.f117079m;
        StringBuilder sb = new StringBuilder("...");
        sb.append(this.f117074h);
        float measureText = textPaint.measureText(sb.toString());
        double d = (double) getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int i5 = (int) (((float) i3) - (measureText + ((float) ((int) ((d * 13.0d) + 0.5d)))));
        float measureText2 = this.f117079m.measureText(str.subSequence(i, i2).toString());
        float f = (float) i5;
        if (measureText2 > f) {
            float f2 = measureText2 - f;
            i4 = 1;
            while (i4 < 15 && this.f117079m.measureText(str.subSequence(i2 - i4, i2).toString()) <= f2) {
                i4++;
            }
        } else {
            i4 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.subSequence(0, (i2 - i4) - 1));
        sb2.append("...");
        return sb2.toString();
    }
}

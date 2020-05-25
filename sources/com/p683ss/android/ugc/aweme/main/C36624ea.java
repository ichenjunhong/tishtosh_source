package com.p683ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.ea */
public final class C36624ea extends C36483a {

    /* renamed from: a */
    private Activity f93730a;

    /* renamed from: b */
    private ViewGroup f93731b;

    /* renamed from: c */
    private ImageView f93732c;

    /* renamed from: e */
    private int[] f93733e = {0, 0, 0, 0};

    /* renamed from: f */
    private int[] f93734f = {7, 3, 6, 44};

    /* renamed from: g */
    private TextView[] f93735g = new TextView[4];

    /* renamed from: h */
    private int[] f93736h = {R.id.d8y, R.id.d8z, R.id.d8v, R.id.d8w};

    /* renamed from: i */
    private int[] f93737i = {R.drawable.ck3, R.drawable.ck4, R.drawable.ck1, R.drawable.ck2};

    /* renamed from: j */
    private AnimatorSet f93738j;

    public final View getContentView() {
        return this.f93731b;
    }

    /* renamed from: b */
    private boolean m82518b() {
        for (int i : this.f93733e) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo69995a() {
        if (this.f93738j != null && this.f93730a != null && !this.f93730a.isFinishing() && isShowing()) {
            getContentView().clearAnimation();
            this.f93738j.cancel();
            try {
                dismiss();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    private void m82517b(View view) {
        for (int i = 0; i < this.f93736h.length; i++) {
            this.f93735g[i] = (TextView) view.findViewById(this.f93736h[i]);
        }
        this.f93731b = (ViewGroup) view.findViewById(R.id.cfl);
        this.f93732c = (ImageView) view.findViewById(R.id.ayj);
    }

    public C36624ea(Activity activity) {
        super(activity);
        this.f93730a = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.b3a, null, false);
        setContentView(inflate);
        setBackgroundDrawable(new ColorDrawable(this.f93730a.getResources().getColor(R.color.arz)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
        m82517b(inflate);
    }

    /* renamed from: a */
    public final boolean mo69996a(View view) {
        float f;
        Drawable drawable;
        String str;
        View view2 = view;
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f93734f.length) {
                break;
            }
            this.f93733e[i] = C38046d.m85098a(this.f93734f[i]);
            if (this.f93733e[i] > 0) {
                TextView textView = this.f93735g[i2];
                int i3 = this.f93733e[i];
                if (i3 <= 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    if (i3 > 99) {
                        str = "99+";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        str = sb.toString();
                    }
                    textView.setText(str);
                }
                int i4 = this.f93737i[i];
                TextView textView2 = this.f93735g[i2];
                if (i2 >= this.f93734f.length - 1) {
                    z = false;
                }
                Drawable drawable2 = this.f93730a.getResources().getDrawable(i4);
                drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                if (z) {
                    drawable = this.f93730a.getResources().getDrawable(R.drawable.cju);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable2.getMinimumHeight());
                }
                textView2.setCompoundDrawables(drawable2, null, drawable, null);
                i2++;
            }
            i++;
        }
        if (i2 < this.f93733e.length && i2 > 0) {
            int i5 = i2 - 1;
            ((LayoutParams) this.f93735g[i5].getLayoutParams()).rightMargin = 0;
            this.f93735g[i5].setCompoundDrawables(this.f93735g[i5].getCompoundDrawables()[0], null, null, null);
        }
        if (!m82518b() || view2 == null) {
            dismiss();
            Runnable runnable = this.f93555d;
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        if (this.f93730a != null && !isShowing() && !this.f93730a.isFinishing()) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            getContentView().setVisibility(4);
            showAtLocation(view2, 51, iArr[0], iArr[1] - view.getHeight());
            this.f93731b.measure(0, 0);
            boolean a = C47918gj.m103682a(this.f93730a);
            int measuredWidth = this.f93731b.getMeasuredWidth();
            int measuredHeight = this.f93731b.getMeasuredHeight();
            int a2 = C9432q.m18670a((Context) this.f93730a);
            int measuredWidth2 = this.f93732c.getMeasuredWidth();
            int measuredWidth3 = view.getMeasuredWidth();
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            float f2 = (float) measuredWidth;
            float f3 = f2 / 2.0f;
            float f4 = ((float) iArr2[0]) + (((float) measuredWidth3) / 2.0f);
            if (!a) {
                float f5 = (float) a2;
                if (((float) (measuredWidth / 2)) + f4 >= f5) {
                    f = f2 - (f5 - f4);
                    int i6 = (int) (f - (((float) measuredWidth2) / 2.0f));
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f93732c.getLayoutParams();
                    marginLayoutParams.leftMargin = i6;
                    this.f93732c.setLayoutParams(marginLayoutParams);
                    update((int) (f4 - f3), (int) (((float) (iArr2[1] - view.getHeight())) - C9432q.m18687b(C11010c.m22280a(), 10.0f)), measuredWidth, measuredHeight);
                    this.f93731b.setPivotX(f);
                    this.f93731b.setPivotY((float) measuredHeight);
                    C26890h.m65011a("message_pop_notice_show", C23089d.m56640a().mo47826a("like_cnt", C38046d.m85098a(3)).mo47826a("comment_cnt", C38046d.m85098a(44)).mo47826a("mention_cnt", C38046d.m85098a(6)).mo47826a("follower_cnt", C38046d.m85098a(7)).mo47826a("message_cnt", 0).f61491a);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setDuration(200);
                    ofFloat.setInterpolator(new C10673c());
                    ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            C36624ea.this.getContentView().setVisibility(0);
                        }
                    });
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                    ofFloat2.setDuration(200);
                    ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                    ofFloat3.setDuration(500);
                    ofFloat3.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ofFloat3.setStartDelay(200);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                    ofFloat4.setDuration(150);
                    ofFloat4.setStartDelay(5700);
                    ofFloat4.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                    ofFloat5.setDuration(300);
                    ofFloat5.setStartDelay(5850);
                    ofFloat5.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat6.setDuration(300);
                    ofFloat6.setStartDelay(5850);
                    ofFloat6.setInterpolator(new C10672b());
                    ofFloat6.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    ofFloat6.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            C36624ea.this.mo69995a();
                        }
                    });
                    this.f93738j = new AnimatorSet();
                    this.f93738j.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
                    this.f93738j.start();
                }
            } else if (f4 - ((float) (measuredWidth / 2)) <= 0.0f) {
                f = f4;
                int i62 = (int) (f - (((float) measuredWidth2) / 2.0f));
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f93732c.getLayoutParams();
                marginLayoutParams2.leftMargin = i62;
                this.f93732c.setLayoutParams(marginLayoutParams2);
                update((int) (f4 - f3), (int) (((float) (iArr2[1] - view.getHeight())) - C9432q.m18687b(C11010c.m22280a(), 10.0f)), measuredWidth, measuredHeight);
                this.f93731b.setPivotX(f);
                this.f93731b.setPivotY((float) measuredHeight);
                C26890h.m65011a("message_pop_notice_show", C23089d.m56640a().mo47826a("like_cnt", C38046d.m85098a(3)).mo47826a("comment_cnt", C38046d.m85098a(44)).mo47826a("mention_cnt", C38046d.m85098a(6)).mo47826a("follower_cnt", C38046d.m85098a(7)).mo47826a("message_cnt", 0).f61491a);
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat7.setDuration(200);
                ofFloat7.setInterpolator(new C10673c());
                ofFloat7.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat7.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        C36624ea.this.getContentView().setVisibility(0);
                    }
                });
                ValueAnimator ofFloat22 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                ofFloat22.setDuration(200);
                ofFloat22.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ValueAnimator ofFloat32 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                ofFloat32.setDuration(500);
                ofFloat32.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat32.setStartDelay(200);
                ValueAnimator ofFloat42 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
                ofFloat42.setDuration(150);
                ofFloat42.setStartDelay(5700);
                ofFloat42.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ValueAnimator ofFloat52 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
                ofFloat52.setDuration(300);
                ofFloat52.setStartDelay(5850);
                ofFloat52.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ValueAnimator ofFloat62 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                ofFloat62.setDuration(300);
                ofFloat62.setStartDelay(5850);
                ofFloat62.setInterpolator(new C10672b());
                ofFloat62.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat62.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C36624ea.this.mo69995a();
                    }
                });
                this.f93738j = new AnimatorSet();
                this.f93738j.playTogether(new Animator[]{ofFloat7, ofFloat22, ofFloat32, ofFloat42, ofFloat52, ofFloat62});
                this.f93738j.start();
            }
            f = f3;
            int i622 = (int) (f - (((float) measuredWidth2) / 2.0f));
            MarginLayoutParams marginLayoutParams22 = (MarginLayoutParams) this.f93732c.getLayoutParams();
            marginLayoutParams22.leftMargin = i622;
            this.f93732c.setLayoutParams(marginLayoutParams22);
            update((int) (f4 - f3), (int) (((float) (iArr2[1] - view.getHeight())) - C9432q.m18687b(C11010c.m22280a(), 10.0f)), measuredWidth, measuredHeight);
            this.f93731b.setPivotX(f);
            this.f93731b.setPivotY((float) measuredHeight);
            C26890h.m65011a("message_pop_notice_show", C23089d.m56640a().mo47826a("like_cnt", C38046d.m85098a(3)).mo47826a("comment_cnt", C38046d.m85098a(44)).mo47826a("mention_cnt", C38046d.m85098a(6)).mo47826a("follower_cnt", C38046d.m85098a(7)).mo47826a("message_cnt", 0).f61491a);
            ValueAnimator ofFloat72 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat72.setDuration(200);
            ofFloat72.setInterpolator(new C10673c());
            ofFloat72.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat72.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C36624ea.this.getContentView().setVisibility(0);
                }
            });
            ValueAnimator ofFloat222 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
            ofFloat222.setDuration(200);
            ofFloat222.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ValueAnimator ofFloat322 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
            ofFloat322.setDuration(500);
            ofFloat322.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat322.setStartDelay(200);
            ValueAnimator ofFloat422 = ValueAnimator.ofFloat(new float[]{0.0f, -10.0f});
            ofFloat422.setDuration(150);
            ofFloat422.setStartDelay(5700);
            ofFloat422.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ValueAnimator ofFloat522 = ValueAnimator.ofFloat(new float[]{-10.0f, 0.0f});
            ofFloat522.setDuration(300);
            ofFloat522.setStartDelay(5850);
            ofFloat522.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ValueAnimator ofFloat622 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat622.setDuration(300);
            ofFloat622.setStartDelay(5850);
            ofFloat622.setInterpolator(new C10672b());
            ofFloat622.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C36624ea.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    C36624ea.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            ofFloat622.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C36624ea.this.mo69995a();
                }
            });
            this.f93738j = new AnimatorSet();
            this.f93738j.playTogether(new Animator[]{ofFloat72, ofFloat222, ofFloat322, ofFloat422, ofFloat522, ofFloat622});
            this.f93738j.start();
        }
        return true;
    }
}

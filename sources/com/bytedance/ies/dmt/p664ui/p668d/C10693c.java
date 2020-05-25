package com.bytedance.ies.dmt.p664ui.p668d;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.d.c */
public final class C10693c extends PopupWindow {

    /* renamed from: e */
    private static int f28482e;

    /* renamed from: a */
    public RelativeLayout f28483a;

    /* renamed from: b */
    private Context f28484b;

    /* renamed from: c */
    private ImageView f28485c;

    /* renamed from: d */
    private TextView f28486d;

    /* renamed from: f */
    private int f28487f;

    /* renamed from: g */
    private int f28488g;

    /* renamed from: h */
    private View f28489h = ((LayoutInflater) this.f28484b.getSystemService("layout_inflater")).inflate(R.layout.a8w, null);

    /* renamed from: b */
    private boolean m21563b() {
        if (this.f28488g == 1) {
            return true;
        }
        return false;
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private boolean m21561a() {
        if (this.f28484b == null || !(this.f28484b instanceof Activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m21564c() {
        try {
            if (this.f28484b != null && !isShowing()) {
                this.f28483a.setAlpha(0.0f);
                showAtLocation(((Activity) this.f28484b).getWindow().getDecorView(), 48, 0, f28482e + C9432q.m18695e(this.f28484b));
                mo19068a(true);
                int i = 2000;
                if (this.f28487f == 0) {
                    i = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        C10693c.this.mo19068a(false);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                C10693c.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo19068a(boolean z) {
        m21562b(z);
    }

    /* renamed from: a */
    public static C10693c m21558a(Context context) {
        return new C10693c(context);
    }

    /* renamed from: a */
    private void m21559a(int i) {
        f28482e = ((int) C9432q.m18687b(this.f28484b, 52.0f)) + i;
    }

    /* renamed from: b */
    private void m21562b(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                float f;
                final int height = C10693c.this.f28483a.getHeight();
                if (z) {
                    i = NormalSplashDelayExperiment.GROUP1;
                } else {
                    i = NormalGiftView.MASK_TRANSLATE_VALUE;
                }
                RelativeLayout relativeLayout = C10693c.this.f28483a;
                String str = "alpha";
                float[] fArr = new float[2];
                float f2 = 1.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (!z) {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, str, fArr);
                ofFloat.setDuration((long) i);
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (z) {
                            i = (int) (-(((float) height) - (((float) height) * animatedFraction)));
                        } else {
                            i = -((int) (((float) height) * animatedFraction));
                        }
                        C10693c.this.f28483a.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new C10673c());
                ofFloat.start();
            }
        }, 5);
    }

    private C10693c(Context context) {
        super(context);
        this.f28484b = context;
        if (m21561a()) {
            setContentView(this.f28489h);
            setWidth(C9432q.m18670a(this.f28484b));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(this.f28484b.getResources().getColor(R.color.arz)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.tj);
            update();
        }
        View view = this.f28489h;
        if (view != null) {
            this.f28483a = (RelativeLayout) view.findViewById(R.id.cdu);
            this.f28485c = (ImageView) view.findViewById(R.id.b1k);
            this.f28486d = (TextView) view.findViewById(R.id.d8j);
        }
    }

    /* renamed from: a */
    private void m21560a(String str, int i) {
        if (C10702g.m21573a().mo19076a(str)) {
            this.f28486d.setText(str);
            this.f28487f = i;
            int b = (int) C9432q.m18687b(this.f28484b, 16.0f);
            LayoutParams layoutParams = (LayoutParams) this.f28483a.getLayoutParams();
            if (!m21563b()) {
                layoutParams.setMargins(b, 0, b, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (m21561a()) {
                m21564c();
                return;
            }
            this.f28483a.setAlpha(1.0f);
            Toast toast = new Toast(this.f28484b);
            toast.setDuration(0);
            toast.setGravity(55, 0, f28482e);
            toast.setView(this.f28489h);
            C10698d.m21567a(toast);
        }
    }

    /* renamed from: a */
    public final C10693c mo19067a(String str, int i, int i2, int i3) {
        this.f28488g = i2;
        m21559a(i3);
        if (m21563b()) {
            this.f28483a.setBackgroundColor(this.f28484b.getResources().getColor(R.color.avx));
        } else {
            this.f28483a.setBackgroundResource(R.drawable.c_4);
        }
        this.f28485c.setVisibility(8);
        m21560a(str, i);
        return this;
    }
}

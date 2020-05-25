package com.p683ss.android.ugc.tools.view.widget;

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
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.view.p2510c.C50221d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.e */
public final class C50277e extends PopupWindow {

    /* renamed from: f */
    private static int f126148f;

    /* renamed from: a */
    Context f126149a;

    /* renamed from: b */
    public RelativeLayout f126150b;

    /* renamed from: c */
    ImageView f126151c;

    /* renamed from: d */
    int f126152d;

    /* renamed from: e */
    private TextView f126153e;

    /* renamed from: g */
    private int f126154g;

    /* renamed from: h */
    private View f126155h = ((LayoutInflater) this.f126149a.getSystemService("layout_inflater")).inflate(R.layout.bvb, null);

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m108546b() {
        if (this.f126149a == null || !(this.f126149a instanceof Activity)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo98178a() {
        if (this.f126152d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m108547c() {
        int i;
        try {
            if (this.f126149a != null && !isShowing()) {
                this.f126150b.setAlpha(0.0f);
                View decorView = ((Activity) this.f126149a).getWindow().getDecorView();
                if (mo98178a()) {
                    i = f126148f;
                } else {
                    i = (int) C9432q.m18687b(this.f126149a, 35.0f);
                }
                showAtLocation(decorView, 48, 0, i + C9432q.m18695e(this.f126149a));
                mo98177a(true);
                int i2 = 2000;
                if (this.f126154g == 0) {
                    i2 = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        C50277e.this.mo98177a(false);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                C50277e.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo98177a(boolean z) {
        m108545b(z);
    }

    /* renamed from: a */
    public static C50277e m108544a(Context context) {
        return new C50277e(context);
    }

    /* renamed from: b */
    private void m108545b(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                float f;
                final int height = C50277e.this.f126150b.getHeight();
                if (z) {
                    i = NormalSplashDelayExperiment.GROUP1;
                } else {
                    i = NormalGiftView.MASK_TRANSLATE_VALUE;
                }
                RelativeLayout relativeLayout = C50277e.this.f126150b;
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
                        C50277e.this.f126150b.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new C50221d());
                ofFloat.start();
            }
        }, 5);
    }

    /* renamed from: a */
    public final void mo98175a(int i) {
        f126148f = ((int) C9432q.m18687b(this.f126149a, 52.0f)) + i;
    }

    private C50277e(Context context) {
        super(context);
        this.f126149a = context;
        if (m108546b()) {
            setContentView(this.f126155h);
            setWidth(C9432q.m18670a(this.f126149a));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(this.f126149a.getResources().getColor(R.color.b2k)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.a8j);
            update();
        }
        View view = this.f126155h;
        if (view != null) {
            this.f126150b = (RelativeLayout) view.findViewById(R.id.cdu);
            this.f126151c = (ImageView) view.findViewById(R.id.b1k);
            this.f126153e = (TextView) view.findViewById(R.id.d8j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo98176a(String str, int i) {
        int i2;
        if (C39629l.m88232a().mo58564B().mo74266a(str)) {
            this.f126153e.setText(str);
            this.f126154g = i;
            int b = (int) C9432q.m18687b(this.f126149a, 16.0f);
            LayoutParams layoutParams = (LayoutParams) this.f126150b.getLayoutParams();
            if (!mo98178a()) {
                layoutParams.setMargins(b, f126148f - ((int) C9432q.m18687b(this.f126149a, 35.0f)), b, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (m108546b()) {
                m108547c();
                return;
            }
            this.f126150b.setAlpha(1.0f);
            Toast toast = new Toast(this.f126149a);
            toast.setDuration(0);
            if (mo98178a()) {
                i2 = f126148f;
            } else {
                i2 = 0;
            }
            toast.setGravity(55, 0, i2);
            toast.setView(this.f126155h);
            C50282f.m108552a(toast);
        }
    }
}

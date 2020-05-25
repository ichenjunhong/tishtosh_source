package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C22464ae;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.BaseAdBottomLabelView */
public abstract class BaseAdBottomLabelView extends FrameLayout {

    /* renamed from: g */
    private static final String f70060g = "BaseAdBottomLabelView";

    /* renamed from: a */
    protected View f70061a;

    /* renamed from: b */
    protected TextView f70062b;

    /* renamed from: c */
    protected TextView f70063c;

    /* renamed from: d */
    protected ImageView f70064d;

    /* renamed from: e */
    protected Aweme f70065e;

    /* renamed from: f */
    protected DataCenter f70066f;

    /* renamed from: h */
    private boolean f70067h;

    /* renamed from: i */
    private View f70068i;

    /* renamed from: j */
    private View f70069j;

    /* renamed from: k */
    private ObjectAnimator f70070k;

    /* renamed from: l */
    private ObjectAnimator f70071l;

    /* renamed from: m */
    private int f70072m;

    /* renamed from: n */
    private Context f70073n;

    /* renamed from: o */
    private String f70074o;

    /* renamed from: p */
    private Runnable f70075p;

    /* renamed from: q */
    private C25908e f70076q;

    /* renamed from: r */
    private Runnable f70077r;

    /* renamed from: s */
    private View f70078s;

    /* renamed from: t */
    private boolean f70079t;

    /* renamed from: u */
    private int f70080u;

    /* renamed from: v */
    private long f70081v;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo54363a(int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo54367a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo54369b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract boolean mo54370c();

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo54371d();

    public int getDefaultColor() {
        return this.f70080u;
    }

    /* access modifiers changed from: 0000 */
    public abstract int getLayoutId();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: 0000 */
    public abstract void setLabelVisibility(int i);

    /* renamed from: f */
    public final void mo54373f() {
        if (mo54367a()) {
        }
    }

    /* renamed from: o */
    private boolean m64398o() {
        if (this.f70072m == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m64399p() {
        if (this.f70072m == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m64400q() {
        if (this.f70072m == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo54372e() {
        if (!this.f70079t) {
            mo54390m();
            this.f70079t = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo54384l() {
        C25945k.m62911b().mo53146j(this.f70073n, this.f70065e);
    }

    /* renamed from: r */
    private void m64401r() {
        int i;
        if (this.f70066f != null) {
            DataCenter dataCenter = this.f70066f;
            String str = "ad_bottom_label_show";
            if (this.f70061a == null) {
                i = 0;
            } else {
                i = this.f70061a.getHeight();
            }
            dataCenter.mo48228a(str, (Object) Integer.valueOf(i));
        }
    }

    public int getBackGroundColor() {
        int i = this.f70080u;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public int getShowSeconds() {
        if (mo54380h()) {
            return 0;
        }
        return this.f70065e.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    /* renamed from: h */
    public final boolean mo54380h() {
        if (m64400q() || m64398o() || m64399p()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo54381i() {
        this.f70067h = false;
        if (this.f70075p != null) {
            removeCallbacks(this.f70075p);
        }
        if (this.f70077r != null) {
            removeCallbacks(this.f70077r);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo54382j() {
        if (mo54370c() && !mo54380h()) {
            mo54363a(Color.parseColor(C26503d.m64078u(this.f70065e)), 300);
            this.f70067h = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.f70074o)) {
            this.f70074o = null;
        }
        mo54391n();
    }

    /* renamed from: n */
    private void mo54391n() {
        if (this.f70070k != null) {
            this.f70070k.cancel();
            this.f70068i.clearAnimation();
        }
        if (this.f70071l != null) {
            this.f70071l.cancel();
            this.f70069j.clearAnimation();
        }
        if (this.f70068i != null) {
            this.f70068i.setBackgroundDrawable(null);
        }
        if (this.f70069j != null) {
            this.f70069j.setBackgroundDrawable(null);
        }
    }

    /* access modifiers changed from: 0000 */
    public int getColorChangeSeconds() {
        if (this.f70065e == null || !this.f70065e.isAd() || this.f70065e.getAwemeRawAd().getAnimationType() != 3) {
            return getShowSeconds();
        }
        return Math.max(getShowSeconds(), this.f70065e.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo54383k() {
        if (this.f70076q.mo53244a() && !mo54369b()) {
            mo54368b((View) this, (Runnable) new C26739h(this));
        }
        C25945k.m62916g().mo54095a(this.f70061a, 0, 300, true);
        m64401r();
    }

    /* renamed from: m */
    private void mo54390m() {
        this.f70061a = View.inflate(getContext(), getLayoutId(), this);
        this.f70068i = this.f70061a.findViewById(R.id.a80);
        this.f70069j = this.f70061a.findViewById(R.id.a81);
        this.f70062b = (TextView) this.f70061a.findViewById(R.id.bho);
        this.f70063c = (TextView) this.f70061a.findViewById(R.id.bhm);
        this.f70064d = (ImageView) this.f70061a.findViewById(R.id.a7z);
        this.f70078s = this.f70061a.findViewById(R.id.a88);
        C47795d.m103429a(this);
    }

    /* renamed from: g */
    public final void mo54374g() {
        if (mo54367a() && !m64398o() && !m64399p()) {
            mo54372e();
            mo54391n();
            this.f70068i.setVisibility(0);
            this.f70068i.setBackgroundResource(R.drawable.crk);
            int a = C9432q.m18670a(this.f70073n);
            this.f70070k = ObjectAnimator.ofFloat(this.f70068i, "translationX", new float[]{(float) (-a), (float) a});
            this.f70070k.setDuration(1500);
            this.f70070k.setRepeatCount(0);
            this.f70070k.start();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setDefaultColor(int i) {
        this.f70080u = i;
    }

    public void setDownloadUrl(String str) {
        this.f70074o = str;
    }

    public BaseAdBottomLabelView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo54364a(long j) {
        if (mo54367a()) {
            this.f70081v = j;
            mo54372e();
            if (!mo54369b()) {
                if (this.f70075p != null) {
                    removeCallbacks(this.f70075p);
                }
                int showSeconds = getShowSeconds();
                if (this.f70075p == null) {
                    this.f70075p = new C26727e(this);
                }
                long j2 = (long) showSeconds;
                if (this.f70081v >= j2) {
                    if (this.f70076q.mo53244a() && !mo54369b()) {
                        C25945k.m62911b().mo53146j(this.f70073n, this.f70065e);
                    }
                    if (this.f70061a != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f70061a.getLayoutParams();
                        marginLayoutParams.bottomMargin = 0;
                        this.f70061a.setLayoutParams(marginLayoutParams);
                        m64401r();
                    }
                } else {
                    postDelayed(this.f70075p, j2 - this.f70081v);
                }
            }
            if (mo54370c() && !mo54380h() && !this.f70067h) {
                int colorChangeSeconds = getColorChangeSeconds();
                if (this.f70077r != null) {
                    removeCallbacks(this.f70077r);
                }
                if (this.f70077r == null) {
                    this.f70077r = new C26728f(this);
                }
                long j3 = (long) colorChangeSeconds;
                if (this.f70081v < j3) {
                    postDelayed(this.f70077r, j3 - this.f70081v);
                } else if (mo54370c() && !mo54380h()) {
                    mo54363a(Color.parseColor(C26503d.m64078u(this.f70065e)), 0);
                    this.f70067h = true;
                }
            }
            this.f70081v = 0;
        }
    }

    public BaseAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54368b(View view, Runnable runnable) {
        if (runnable != null && view != null && C1056u.m3018B(view)) {
            if (!C23729p.m58267b(view) || C11016e.m22313h() || C22464ae.m55519a(view.getContext()) == 2) {
                view.postDelayed(new C26738g(this, view, runnable), 100);
            } else {
                runnable.run();
            }
        }
    }

    public BaseAdBottomLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70073n = context;
    }

    /* renamed from: a */
    public final void mo54366a(Aweme aweme, C25908e eVar, DataCenter dataCenter) {
        boolean z;
        this.f70076q = eVar;
        this.f70066f = dataCenter;
        this.f70065e = aweme;
        if (!mo54367a()) {
            setLabelVisibility(8);
            return;
        }
        if (this.f70065e == null || !this.f70065e.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo54372e();
            mo54371d();
            setLabelVisibility(0);
            String a = C25945k.m62916g().mo54094a(getContext(), aweme, false);
            if (aweme.isAppAd()) {
                mo54372e();
                mo54391n();
                this.f70072m = 0;
                this.f70068i.setVisibility(8);
                this.f70069j.setVisibility(8);
                this.f70063c.setTextColor(C0726c.m2098c(this.f70073n, R.color.aso));
                this.f70063c.setText(a);
                this.f70062b.setVisibility(8);
                this.f70064d.setVisibility(0);
            } else {
                if (mo54370c()) {
                    a = this.f70073n.getString(R.string.ur, new Object[]{a});
                }
                mo54372e();
                this.f70072m = 1;
                this.f70068i.setVisibility(8);
                this.f70069j.setVisibility(8);
                this.f70063c.setVisibility(0);
                this.f70063c.setText(a);
                this.f70063c.setTextColor(C0726c.m2098c(this.f70073n, R.color.aso));
                this.f70062b.setVisibility(8);
            }
        } else {
            setLabelVisibility(8);
        }
    }
}

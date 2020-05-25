package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView */
public class ButtonAdBottomLabelView extends BaseAdBottomLabelView {
    /* access modifiers changed from: 0000 */
    public int getLayoutId() {
        return R.layout.b72;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo54369b() {
        return C26503d.m64079v(this.f70065e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo54391n() {
        C25945k.m62911b().mo53146j(getContext(), this.f70065e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo54367a() {
        if (this.f70065e == null || !this.f70065e.isAd() || TextUtils.isEmpty(this.f70065e.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo54370c() {
        if (this.f70065e == null || this.f70065e.getAwemeRawAd() == null || (this.f70065e.getAwemeRawAd().getAnimationType() != 1 && this.f70065e.getAwemeRawAd().getAnimationType() != 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo54371d() {
        int b = C23724k.m58224b(getContext());
        View findViewById = this.f70061a.findViewById(R.id.e8z);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = b - ((int) C9432q.m18687b(getContext(), 110.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: m */
    public final void mo54390m() {
        int i;
        if (mo54367a()) {
            mo54372e();
            if (mo54369b()) {
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
                C25945k.m62916g().mo54095a(this, 0, 0, true);
                mo54368b((View) this, (Runnable) new C26740i(this));
            } else {
                C25945k.m62916g().mo54095a(this, getResources().getDimensionPixelOffset(R.dimen.yu), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (!mo54370c()) {
                defaultColor = Color.parseColor(C26503d.m64078u(this.f70065e));
            }
            mo54363a(defaultColor, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLabelVisibility(int i) {
        setVisibility(i);
    }

    public ButtonAdBottomLabelView(Context context) {
        this(context, null);
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo54363a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C9432q.m18687b(getContext(), 4.0f));
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        C47795d.m103431a(this, gradientDrawable, getBackGroundColor(), i, (long) i2);
    }

    public ButtonAdBottomLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDefaultColor(C0726c.m2098c(context, R.color.a3f));
    }
}

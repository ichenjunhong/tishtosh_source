package com.p683ss.android.ugc.aweme.following.p1770ui.view;

import android.content.Context;
import android.graphics.Paint;
import android.support.p030v4.widget.C1115o;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a.C10684a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10686c;
import com.bytedance.ies.dmt.p664ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.I18nFollowUserBtn */
public final class I18nFollowUserBtn extends FollowUserBtn {

    /* renamed from: f */
    public static final C32253a f84046f = new C32253a(null);

    /* renamed from: com.ss.android.ugc.aweme.following.ui.view.I18nFollowUserBtn$a */
    public static final class C32253a {
        private C32253a() {
        }

        public /* synthetic */ C32253a(C52707g gVar) {
            this();
        }
    }

    public final LayoutParams getButtonLayoutParams() {
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        LayoutParams layoutParams = niceWidthTextView.getLayoutParams();
        C52711k.m112236a((Object) layoutParams, "mMainBtn.layoutParams");
        return layoutParams;
    }

    public I18nFollowUserBtn(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m74604a(int i) {
        if (this.f84041a != null) {
            C1115o.m3256a((TextView) this.f84041a, i);
            this.f84041a.setPadding(8, 0, 8, 0);
            this.f84041a.setFontType(C10751d.f28908g);
        }
    }

    public final void setButtonLayoutParams(LayoutParams layoutParams) {
        C52711k.m112240b(layoutParams, "layoutParams");
        this.f84045e = layoutParams.width;
        Class cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        C10683a.m21511a(cls, new C10684a(mo19031a((TextView) niceWidthTextView)));
        NiceWidthTextView niceWidthTextView2 = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final int mo19031a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.b55));
        arrayList.add(Integer.valueOf(R.string.as8));
        arrayList.add(Integer.valueOf(R.string.b4y));
        arrayList.add(Integer.valueOf(R.string.as_));
        arrayList.add(Integer.valueOf(R.string.gfm));
        int a = C10686c.m21513a(textView, arrayList, (int) C9432q.m18687b(getContext(), 64.0f), (int) C9432q.m18687b(getContext(), 120.0f));
        if (a > this.f84045e) {
            return a;
        }
        return this.f84045e;
    }

    /* access modifiers changed from: protected */
    public final void setFollowButtonTextAndIcon(int i) {
        boolean z = true;
        if (i != 1 || !FollowToFollowBackExperiment.m69596a()) {
            super.setFollowButtonTextAndIcon(i);
            m74604a((int) R.style.un);
        } else {
            NiceWidthTextView niceWidthTextView = this.f84041a;
            C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
            niceWidthTextView.setText(getResources().getText(R.string.gfm));
            Paint paint = new Paint();
            paint.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
            if (paint.measureText(getContext().getString(R.string.gfm)) < 110.0f) {
                z = false;
            }
            if (z) {
                m74604a((int) R.style.uh);
            }
        }
    }

    public I18nFollowUserBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo65360a(int i, int i2) {
        m74604a((int) R.style.un);
        super.mo65360a(i, i2);
    }

    public I18nFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

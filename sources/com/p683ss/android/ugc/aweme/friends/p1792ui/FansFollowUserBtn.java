package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.widget.C1095b;
import android.support.p030v4.widget.C1115o;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a.C10684a;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10686c;
import com.bytedance.ies.dmt.p664ui.common.rebranding.NiceWidthTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn */
public class FansFollowUserBtn extends FollowUserBtn {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f84911f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FansFollowUserBtn.class), "horizontalWidthForTwo", "getHorizontalWidthForTwo()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FansFollowUserBtn.class), "horizontalWidthForFour", "getHorizontalWidthForFour()I"))};

    /* renamed from: g */
    public static final C32632a f84912g = new C32632a(null);

    /* renamed from: h */
    private final C52668f f84913h = C52732g.m112285a(new C32634c(this));

    /* renamed from: i */
    private final C52668f f84914i = C52732g.m112285a(new C32633b(this));

    /* renamed from: j */
    private float f84915j = 64.0f;

    /* renamed from: k */
    private int f84916k = R.drawable.ddz;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$a */
    public static final class C32632a {
        private C32632a() {
        }

        public /* synthetic */ C32632a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$b */
    static final class C32633b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f84917a;

        C32633b(FansFollowUserBtn fansFollowUserBtn) {
            this.f84917a = fansFollowUserBtn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f84917a.mo66155b(12, 4));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn$c */
    static final class C32634c extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f84918a;

        C32634c(FansFollowUserBtn fansFollowUserBtn) {
            this.f84918a = fansFollowUserBtn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f84918a.mo66155b(12, 2));
        }
    }

    private final int getHorizontalWidthForFour() {
        return ((Number) this.f84914i.getValue()).intValue();
    }

    private final int getHorizontalWidthForTwo() {
        return ((Number) this.f84913h.getValue()).intValue();
    }

    public float getDefaultWidth() {
        return this.f84915j;
    }

    public int getLayout() {
        return R.layout.b4v;
    }

    public final int getMaxWidth() {
        return this.f84045e;
    }

    public final int getDefaultMeasureNiceWidth() {
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        return mo19031a(niceWidthTextView);
    }

    /* renamed from: a */
    public final void mo66154a() {
        LayoutParams buttonLayoutParams = getButtonLayoutParams();
        if (buttonLayoutParams.height != C23728o.m58241a(24.0d) || buttonLayoutParams.width != C23728o.m58241a(64.0d)) {
            buttonLayoutParams.height = C23728o.m58241a(24.0d);
            buttonLayoutParams.width = C23728o.m58241a(64.0d);
            setButtonLayoutParams(buttonLayoutParams);
            getLayoutParams().height = buttonLayoutParams.height;
            requestLayout();
        }
    }

    public final void setClickedBgResId(int i) {
        this.f84916k = i;
    }

    public void setDefaultWidth(float f) {
        this.f84915j = f;
    }

    public final void setTypeAppearance(int i) {
        C1115o.m3256a((TextView) this.f84041a, i);
    }

    public final void setFontType(String str) {
        C52711k.m112240b(str, "fontType");
        this.f84041a.setFontType(str);
    }

    public final void setTextSize(float f) {
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setTextSize(f);
    }

    public final void setTypeface(Typeface typeface) {
        C52711k.m112240b(typeface, "typeface");
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setTypeface(typeface);
    }

    public final void setAutoSize(int[] iArr) {
        C52711k.m112240b(iArr, "array");
        TextView textView = this.f84041a;
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
            return;
        }
        if (textView instanceof C1095b) {
            ((C1095b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, 2);
        }
    }

    public FansFollowUserBtn(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public void setText(String str) {
        C52711k.m112240b(str, "text");
        setVisibility(0);
        setFollowButtonStyle(-1);
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setText(str);
        this.f84041a.setTextColor(getResources().getColor(R.color.jf));
        NiceWidthTextView niceWidthTextView2 = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setBackground(getResources().getDrawable(R.drawable.ddx));
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
        int a = C10686c.m21513a(textView, arrayList, (int) C9432q.m18687b(getContext(), getDefaultWidth()), (int) C9432q.m18687b(getContext(), getDefaultWidth()));
        if (a > this.f84045e) {
            return a;
        }
        return this.f84045e;
    }

    public void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f84041a.setPadding(0, 0, 0, 0);
            NiceWidthTextView niceWidthTextView = this.f84041a;
            C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
            niceWidthTextView.setGravity(17);
            this.f84041a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        Drawable drawable = context.getResources().getDrawable(i);
        C52711k.m112236a((Object) drawable, "mButtonStyle");
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f84041a.setPadding(mo65359a(drawable), 0, 0, 0);
        this.f84041a.setCompoundDrawables(drawable, null, null, null);
        NiceWidthTextView niceWidthTextView2 = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
        niceWidthTextView2.setGravity(16);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Class cls = getClass();
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        C10683a.m21511a(cls, new C10684a(mo19031a(niceWidthTextView)));
    }

    /* renamed from: b */
    public final int mo66155b(int i, int i2) {
        float b = C9432q.m18687b(getContext(), getDefaultWidth());
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        return (int) Math.max(0.0f, ((b - niceWidthTextView.getPaint().measureText(C52830p.m112397a("一", i2))) - C9432q.m18687b(getContext(), 14.0f)) / 2.0f);
    }

    public FansFollowUserBtn(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo65360a(int i, int i2) {
        setVisibility(0);
        switch (i) {
            case 0:
                setFollowButtonTextAndIcon(i2);
                this.f84041a.setTextColor(getResources().getColor(R.color.jf));
                NiceWidthTextView niceWidthTextView = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
                niceWidthTextView.setBackground(getResources().getDrawable(R.drawable.ddx));
                break;
            case 1:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView2 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView2, "mMainBtn");
                niceWidthTextView2.setText(getResources().getText(R.string.b55));
                this.f84041a.setTextColor(getResources().getColor(R.color.a17));
                NiceWidthTextView niceWidthTextView3 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView3, "mMainBtn");
                niceWidthTextView3.setBackground(getResources().getDrawable(this.f84916k));
                break;
            case 2:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView4 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView4, "mMainBtn");
                niceWidthTextView4.setText(getResources().getText(R.string.as8));
                this.f84041a.setTextColor(getResources().getColor(R.color.a17));
                NiceWidthTextView niceWidthTextView5 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView5, "mMainBtn");
                niceWidthTextView5.setBackground(getResources().getDrawable(this.f84916k));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setFollowButtonStyle(-1);
                NiceWidthTextView niceWidthTextView6 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView6, "mMainBtn");
                niceWidthTextView6.setText(getResources().getText(R.string.b4y));
                this.f84041a.setTextColor(getResources().getColor(R.color.a17));
                NiceWidthTextView niceWidthTextView7 = this.f84041a;
                C52711k.m112236a((Object) niceWidthTextView7, "mMainBtn");
                niceWidthTextView7.setBackground(getResources().getDrawable(this.f84916k));
                break;
        }
        this.f84042b = i;
    }

    public FansFollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo65361a(Context context, AttributeSet attributeSet, int i) {
        this.f84041a = (NiceWidthTextView) LayoutInflater.from(context).inflate(getLayout(), this, true).findViewById(R.id.ns);
        this.f84041a.mo19030a(this);
        this.f84042b = 0;
        NiceWidthTextView niceWidthTextView = this.f84041a;
        C52711k.m112236a((Object) niceWidthTextView, "mMainBtn");
        niceWidthTextView.setCompoundDrawablePadding((int) C9432q.m18687b(context, 2.0f));
    }
}

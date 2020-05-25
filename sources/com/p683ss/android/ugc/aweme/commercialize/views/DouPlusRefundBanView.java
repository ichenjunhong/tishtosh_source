package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView */
public final class DouPlusRefundBanView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70127a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DouPlusRefundBanView.class), "titleView", "getTitleView()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DouPlusRefundBanView.class), "refundView", "getRefundView()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DouPlusRefundBanView.class), "appealView", "getAppealView()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DouPlusRefundBanView.class), "cancelView", "getCancelView()Landroid/widget/TextView;"))};

    /* renamed from: e */
    public static final C26624a f70128e = new C26624a(null);

    /* renamed from: b */
    public OnClickListener f70129b;

    /* renamed from: c */
    public OnClickListener f70130c;

    /* renamed from: d */
    public OnClickListener f70131d;

    /* renamed from: f */
    private final C52668f f70132f = C52732g.m112286a(C52757k.NONE, new C26631h(this));

    /* renamed from: g */
    private final C52668f f70133g = C52732g.m112286a(C52757k.NONE, new C26630g(this));

    /* renamed from: h */
    private final C52668f f70134h = C52732g.m112286a(C52757k.NONE, new C26625b(this));

    /* renamed from: i */
    private final C52668f f70135i = C52732g.m112286a(C52757k.NONE, new C26626c(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$a */
    public static final class C26624a {
        private C26624a() {
        }

        public /* synthetic */ C26624a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m64449a(String str, String str2) {
            C26890h.m65011a(str, C52550ab.m112056b(C52856t.m112465a("toast_type", "dou_plus_refund"), C52856t.m112465a("scene_id", str2)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$b */
    static final class C26625b extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70136a;

        C26625b(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70136a = douPlusRefundBanView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70136a.findViewById(R.id.a79);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$c */
    static final class C26626c extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70137a;

        C26626c(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70137a = douPlusRefundBanView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70137a.findViewById(R.id.a7_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$d */
    static final class C26627d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70138a;

        C26627d(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70138a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26624a.m64449a("confirm_toast", "1001");
            OnClickListener onClickListener = this.f70138a.f70129b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$e */
    static final class C26628e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70139a;

        C26628e(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70139a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f70139a.f70130c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$f */
    static final class C26629f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70140a;

        C26629f(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70140a = douPlusRefundBanView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            OnClickListener onClickListener = this.f70140a.f70131d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$g */
    static final class C26630g extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70141a;

        C26630g(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70141a = douPlusRefundBanView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70141a.findViewById(R.id.a7a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView$h */
    static final class C26631h extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ DouPlusRefundBanView f70142a;

        C26631h(DouPlusRefundBanView douPlusRefundBanView) {
            this.f70142a = douPlusRefundBanView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f70142a.findViewById(R.id.a7b);
        }
    }

    public final TextView getAppealView() {
        return (TextView) this.f70134h.getValue();
    }

    public final TextView getCancelView() {
        return (TextView) this.f70135i.getValue();
    }

    public final TextView getRefundView() {
        return (TextView) this.f70133g.getValue();
    }

    public final TextView getTitleView() {
        return (TextView) this.f70132f.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C26624a.m64449a("show_toast", "1002");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        getRefundView().setOnClickListener(new C26627d(this));
        getAppealView().setOnClickListener(new C26628e(this));
        getCancelView().setOnClickListener(new C26629f(this));
    }

    public DouPlusRefundBanView(Context context) {
        super(context);
    }

    public DouPlusRefundBanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DouPlusRefundBanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

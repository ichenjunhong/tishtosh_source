package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar */
public final class AdPopUpWebTitleBar extends FrameLayout {

    /* renamed from: b */
    public static final C26771a f70514b = new C26771a(null);

    /* renamed from: a */
    String f70515a;

    /* renamed from: c */
    private C26772b f70516c;

    /* renamed from: d */
    private HashMap f70517d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$a */
    public static final class C26771a {
        private C26771a() {
        }

        public /* synthetic */ C26771a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$b */
    public interface C26772b {
        /* renamed from: a */
        void mo54647a();

        /* renamed from: b */
        void mo54648b();

        /* renamed from: c */
        void mo54649c();

        /* renamed from: d */
        void mo54650d();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$c */
    static final class C26773c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f70518a;

        C26773c(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f70518a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26772b titleBarListener = this.f70518a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo54648b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$d */
    static final class C26774d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f70519a;

        C26774d(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f70519a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26772b titleBarListener = this.f70519a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo54649c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$e */
    static final class C26775e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f70520a;

        C26775e(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f70520a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26772b titleBarListener = this.f70520a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo54647a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar$f */
    static final class C26776f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebTitleBar f70521a;

        C26776f(AdPopUpWebTitleBar adPopUpWebTitleBar) {
            this.f70521a = adPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26772b titleBarListener = this.f70521a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo54650d();
            }
        }
    }

    public AdPopUpWebTitleBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo54652a(int i) {
        if (this.f70517d == null) {
            this.f70517d = new HashMap();
        }
        View view = (View) this.f70517d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f70517d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getDefTitle() {
        return this.f70515a;
    }

    public final C26772b getTitleBarListener() {
        return this.f70516c;
    }

    /* renamed from: a */
    public final void mo54653a() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo54652a(R.id.eq2);
        C52711k.m112236a((Object) autoRTLImageView, "pop_up_web_go_back");
        autoRTLImageView.setVisibility(0);
        C26779b.f70533b = true;
    }

    /* renamed from: b */
    public final void mo54654b() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo54652a(R.id.eq2);
        C52711k.m112236a((Object) autoRTLImageView, "pop_up_web_go_back");
        autoRTLImageView.setVisibility(8);
        C26779b.f70533b = false;
    }

    public final void setDefTitle(String str) {
        this.f70515a = str;
    }

    public final void setTitleBarListener(C26772b bVar) {
        this.f70516c = bVar;
    }

    public AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.byv, this, true);
    }

    public /* synthetic */ AdPopUpWebTitleBar(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

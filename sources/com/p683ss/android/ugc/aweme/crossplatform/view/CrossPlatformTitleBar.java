package com.p683ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.p017a.p018a.C0227i;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27196e;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar */
public final class CrossPlatformTitleBar extends FrameLayout {

    /* renamed from: a */
    private C27281a f71965a;

    /* renamed from: b */
    private C27182a f71966b;

    /* renamed from: c */
    private HashMap f71967c;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$a */
    public interface C27281a {
        /* renamed from: a */
        void mo55412a();

        /* renamed from: a */
        void mo55413a(View view);

        /* renamed from: b */
        void mo55414b();

        /* renamed from: c */
        void mo55415c();

        /* renamed from: d */
        void mo55416d();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$b */
    static final class C27282b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f71968a;

        C27282b(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f71968a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27281a titleWrap = this.f71968a.getTitleWrap();
            if (titleWrap != null) {
                C52711k.m112236a((Object) view, "it");
                titleWrap.mo55413a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$c */
    static final class C27283c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f71969a;

        C27283c(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f71969a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27281a titleWrap = this.f71969a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo55412a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$d */
    static final class C27284d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f71970a;

        C27284d(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f71970a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27281a titleWrap = this.f71970a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo55416d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$e */
    static final class C27285e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f71971a;

        C27285e(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f71971a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27281a titleWrap = this.f71971a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo55415c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar$f */
    static final class C27286f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformTitleBar f71972a;

        C27286f(CrossPlatformTitleBar crossPlatformTitleBar) {
            this.f71972a = crossPlatformTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27281a titleWrap = this.f71972a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo55414b();
            }
        }
    }

    /* renamed from: a */
    public final View mo55654a(int i) {
        if (this.f71967c == null) {
            this.f71967c = new HashMap();
        }
        View view = (View) this.f71967c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f71967c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C27182a getCrossPlatformParams() {
        return this.f71966b;
    }

    public final C27281a getTitleWrap() {
        return this.f71965a;
    }

    /* renamed from: c */
    public final void mo55657c() {
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo55654a(R.id.ug);
        C52711k.m112236a((Object) autoRTLImageView, "close_all_webpage");
        autoRTLImageView.setVisibility(8);
    }

    /* renamed from: d */
    private final void m65734d() {
        LayoutInflater.from(getContext()).inflate(R.layout.b88, this, true);
        setBackgroundResource(R.drawable.de_);
        setMinimumHeight((int) getResources().getDimension(R.dimen.n8));
    }

    /* renamed from: a */
    public final void mo55655a() {
        setBackgroundColor(0);
        View a = mo55654a(R.id.jz);
        C52711k.m112236a((Object) a, "bg_browser_title");
        a.setVisibility(0);
        C27182a aVar = this.f71966b;
        if (aVar != null) {
            C27196e eVar = aVar.f71721d;
            if (eVar != null && eVar.f71793E) {
                View a2 = mo55654a(R.id.jz);
                C52711k.m112236a((Object) a2, "bg_browser_title");
                a2.setVisibility(8);
            }
        }
        DmtTextView dmtTextView = (DmtTextView) mo55654a(R.id.title);
        C52711k.m112236a((Object) dmtTextView, "title");
        dmtTextView.setVisibility(8);
        ((AutoRTLImageView) mo55654a(R.id.uj)).setImageResource(R.drawable.cti);
        ((AutoRTLImageView) mo55654a(R.id.ug)).setImageResource(R.drawable.ctl);
        ((AutoRTLImageView) mo55654a(R.id.p5)).setImageResource(R.drawable.ctr);
        ((AutoRTLImageView) mo55654a(R.id.cbl)).setImageResource(R.drawable.ctp);
        ((AutoRTLImageView) mo55654a(R.id.ccm)).setImageResource(R.drawable.ctn);
    }

    /* renamed from: b */
    public final void mo55656b() {
        C27182a aVar = this.f71966b;
        if (aVar != null) {
            if (aVar.f71721d.f71800f != -2) {
                setBackgroundColor(aVar.f71721d.f71800f);
            } else {
                setBackgroundResource(R.drawable.de_);
            }
            if (aVar.f71721d.f71802h != -2) {
                ((DmtTextView) mo55654a(R.id.title)).setTextColor(aVar.f71721d.f71802h);
                Context context = getContext();
                if (context != null) {
                    C0227i a = C0227i.m462a(context.getResources(), (int) R.drawable.ctk, context.getTheme());
                    if (a != null) {
                        a.setTint(aVar.f71721d.f71802h);
                    }
                    ((AutoRTLImageView) mo55654a(R.id.uj)).setImageDrawable(a);
                }
            } else {
                ((AutoRTLImageView) mo55654a(R.id.uj)).setImageResource(R.drawable.ctj);
            }
            View a2 = mo55654a(R.id.jz);
            C52711k.m112236a((Object) a2, "bg_browser_title");
            a2.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) mo55654a(R.id.title);
            C52711k.m112236a((Object) dmtTextView, "title");
            dmtTextView.setVisibility(0);
            ((AutoRTLImageView) mo55654a(R.id.ug)).setImageResource(R.drawable.ctm);
            ((AutoRTLImageView) mo55654a(R.id.p5)).setImageResource(R.drawable.cts);
            ((AutoRTLImageView) mo55654a(R.id.cbl)).setImageResource(R.drawable.ctq);
            ((AutoRTLImageView) mo55654a(R.id.ccm)).setImageResource(R.drawable.cto);
        }
    }

    public final void setTitleWrap(C27281a aVar) {
        this.f71965a = aVar;
    }

    public CrossPlatformTitleBar(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m65734d();
    }

    public final void setBackgroundAlpha(float f) {
        View a = mo55654a(R.id.jz);
        C52711k.m112236a((Object) a, "bg_browser_title");
        a.setAlpha(f);
    }

    public final void setTitle(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "str");
        DmtTextView dmtTextView = (DmtTextView) mo55654a(R.id.title);
        C52711k.m112236a((Object) dmtTextView, "title");
        dmtTextView.setText(charSequence);
    }

    public final void setCrossPlatformParams(C27182a aVar) {
        String str;
        this.f71966b = aVar;
        C27182a aVar2 = this.f71966b;
        if (aVar2 != null) {
            DmtTextView dmtTextView = (DmtTextView) mo55654a(R.id.title);
            C52711k.m112236a((Object) dmtTextView, "title");
            if (TextUtils.isEmpty(aVar2.f71721d.f71799e)) {
                str = getContext().getString(R.string.dow);
            } else {
                str = aVar2.f71721d.f71799e;
            }
            dmtTextView.setText(str);
            ((AutoRTLImageView) mo55654a(R.id.ccm)).setOnClickListener(new C27282b(this));
            ((AutoRTLImageView) mo55654a(R.id.uj)).setOnClickListener(new C27283c(this));
            ((AutoRTLImageView) mo55654a(R.id.ug)).setOnClickListener(new C27284d(this));
            if (aVar2.f71721d.f71797c) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo55654a(R.id.ccm);
                C52711k.m112236a((Object) autoRTLImageView, "right_menu");
                autoRTLImageView.setVisibility(8);
            }
            ((AutoRTLImageView) mo55654a(R.id.p5)).setOnClickListener(new C27285e(this));
            if (aVar2.f71721d.f71803i) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) mo55654a(R.id.uj);
                C52711k.m112236a((Object) autoRTLImageView2, "close_custom");
                autoRTLImageView2.setVisibility(0);
            }
            if (aVar2.f71721d.f71800f != -2) {
                DmtTextView dmtTextView2 = (DmtTextView) mo55654a(R.id.title);
                C52711k.m112236a((Object) dmtTextView2, "title");
                dmtTextView2.setBackground(new ColorDrawable(aVar2.f71721d.f71800f));
                setBackgroundColor(aVar2.f71721d.f71800f);
            }
            if (aVar2.f71721d.f71802h != -2) {
                ((DmtTextView) mo55654a(R.id.title)).setTextColor(aVar2.f71721d.f71802h);
                Context context = getContext();
                if (context != null) {
                    C0227i a = C0227i.m462a(context.getResources(), (int) R.drawable.ctk, context.getTheme());
                    if (a != null) {
                        a.setTint(aVar2.f71721d.f71802h);
                    }
                    ((AutoRTLImageView) mo55654a(R.id.uj)).setImageDrawable(a);
                }
            }
            if (aVar2.f71721d.f71797c) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) mo55654a(R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView3, "btn_share");
                autoRTLImageView3.setVisibility(8);
            }
            if (aVar2.f71721d.f71798d) {
                if (C23324d.m57378a().getRawAdAwemeById(aVar2.f71718a.f71713j) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) mo55654a(R.id.cbl);
                    C52711k.m112236a((Object) autoRTLImageView4, "report_ads");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) mo55654a(R.id.cbl)).setOnClickListener(new C27286f(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) mo55654a(R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView5, "btn_share");
                autoRTLImageView5.setVisibility(8);
            }
            if (aVar2.f71721d.f71790B == 2) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) mo55654a(R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView6, "btn_share");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) mo55654a(R.id.cbl);
                C52711k.m112236a((Object) autoRTLImageView7, "report_ads");
                autoRTLImageView7.setVisibility(8);
            } else if (aVar2.f71721d.f71790B == 1) {
                AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) mo55654a(R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView8, "btn_share");
                autoRTLImageView8.setVisibility(8);
                AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) mo55654a(R.id.cbl);
                C52711k.m112236a((Object) autoRTLImageView9, "report_ads");
                autoRTLImageView9.setVisibility(0);
            }
            AutoRTLImageView autoRTLImageView10 = (AutoRTLImageView) mo55654a(R.id.ccm);
            C52711k.m112236a((Object) autoRTLImageView10, "right_menu");
            C52711k.m112240b(aVar2, "crossPlatformParams");
            C52711k.m112240b(autoRTLImageView10, "right_menu");
        }
    }

    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        m65734d();
    }

    public CrossPlatformTitleBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        m65734d();
    }
}

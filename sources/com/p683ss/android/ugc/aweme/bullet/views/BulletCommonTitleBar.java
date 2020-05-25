package com.p683ss.android.ugc.aweme.bullet.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.p017a.p018a.C0227i;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10584e;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar */
public final class BulletCommonTitleBar extends FrameLayout {

    /* renamed from: a */
    private C24350a f64658a;

    /* renamed from: b */
    private HashMap f64659b;

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$a */
    public interface C24350a {
        /* renamed from: a */
        void mo50110a();

        /* renamed from: a */
        void mo50111a(View view);

        /* renamed from: b */
        void mo50112b();

        /* renamed from: c */
        void mo50113c();

        /* renamed from: d */
        void mo50114d();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$b */
    static final class C24351b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f64660a;

        C24351b(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f64660a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24350a titleWrap = this.f64660a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo50112b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$c */
    static final class C24352c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f64661a;

        C24352c(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f64661a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24350a titleWrap = this.f64661a.getTitleWrap();
            if (titleWrap != null) {
                C52711k.m112236a((Object) view, "it");
                titleWrap.mo50111a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$d */
    static final class C24353d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f64662a;

        C24353d(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f64662a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24350a titleWrap = this.f64662a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo50110a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$e */
    static final class C24354e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f64663a;

        C24354e(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f64663a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24350a titleWrap = this.f64663a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo50114d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$f */
    static final class C24355f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BulletCommonTitleBar f64664a;

        C24355f(BulletCommonTitleBar bulletCommonTitleBar) {
            this.f64664a = bulletCommonTitleBar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24350a titleWrap = this.f64664a.getTitleWrap();
            if (titleWrap != null) {
                titleWrap.mo50113c();
            }
        }
    }

    /* renamed from: a */
    public final View mo50149a(int i) {
        if (this.f64659b == null) {
            this.f64659b = new HashMap();
        }
        View view = (View) this.f64659b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f64659b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C24350a getTitleWrap() {
        return this.f64658a;
    }

    /* renamed from: a */
    private final void m59720a() {
        LayoutInflater.from(getContext()).inflate(R.layout.b3o, this, true);
        setBackgroundResource(R.drawable.ro);
        setMinimumHeight((int) getResources().getDimension(R.dimen.n8));
    }

    public final void setTitleWrap(C24350a aVar) {
        this.f64658a = aVar;
    }

    public BulletCommonTitleBar(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m59720a();
    }

    public final void setBackgroundAlpha(float f) {
        View a = mo50149a((int) R.id.jz);
        C52711k.m112236a((Object) a, "bg_browser_title");
        a.setAlpha(f);
    }

    public final void setTitle(CharSequence charSequence) {
        C52711k.m112240b(charSequence, "str");
        DmtTextView dmtTextView = (DmtTextView) mo50149a((int) R.id.title);
        C52711k.m112236a((Object) dmtTextView, "title");
        dmtTextView.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo50150a(C10578a aVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (aVar != null) {
            DmtTextView dmtTextView = (DmtTextView) mo50149a((int) R.id.title);
            C52711k.m112236a((Object) dmtTextView, "title");
            if (TextUtils.isEmpty((CharSequence) aVar.f28119x.mo18457b())) {
                Context context = getContext();
                C52711k.m112236a((Object) context, "context");
                Resources resources = context.getResources();
                if (resources != null) {
                    charSequence2 = resources.getString(R.string.dow);
                } else {
                    charSequence2 = null;
                }
                charSequence = charSequence2;
            } else {
                charSequence = (CharSequence) aVar.f28119x.mo18457b();
            }
            dmtTextView.setText(charSequence);
            ((AutoRTLImageView) mo50149a((int) R.id.ccm)).setOnClickListener(new C24352c(this));
            ((AutoRTLImageView) mo50149a((int) R.id.uj)).setOnClickListener(new C24353d(this));
            ((AutoRTLImageView) mo50149a((int) R.id.ug)).setOnClickListener(new C24354e(this));
            if (C52711k.m112239a((Object) (Boolean) aVar.f28097D.mo18457b(), (Object) Boolean.valueOf(true))) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo50149a((int) R.id.ccm);
                C52711k.m112236a((Object) autoRTLImageView, "right_menu");
                autoRTLImageView.setVisibility(8);
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) mo50149a((int) R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView2, "btn_share");
                autoRTLImageView2.setVisibility(8);
            }
            ((AutoRTLImageView) mo50149a((int) R.id.p5)).setOnClickListener(new C24355f(this));
            if (C52711k.m112239a((Object) (Boolean) aVar.f28094A.mo18457b(), (Object) Boolean.valueOf(true))) {
                AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) mo50149a((int) R.id.uj);
                C52711k.m112236a((Object) autoRTLImageView3, "close_custom");
                autoRTLImageView3.setVisibility(0);
            }
            C10584e eVar = (C10584e) aVar.f28120y.mo18457b();
            if (eVar != null) {
                int i = eVar.f28126a;
                if (i != -2) {
                    DmtTextView dmtTextView2 = (DmtTextView) mo50149a((int) R.id.title);
                    C52711k.m112236a((Object) dmtTextView2, "title");
                    dmtTextView2.setBackground(new ColorDrawable(i));
                    setBackgroundColor(i);
                }
            }
            C10584e eVar2 = (C10584e) aVar.f28121z.mo18457b();
            if (eVar2 != null) {
                int i2 = eVar2.f28126a;
                if (i2 != -2) {
                    ((DmtTextView) mo50149a((int) R.id.title)).setTextColor(i2);
                    Context context2 = getContext();
                    if (context2 != null) {
                        C0227i a = C0227i.m462a(context2.getResources(), (int) R.drawable.ctk, context2.getTheme());
                        if (a != null) {
                            a.setTint(i2);
                        }
                        ((AutoRTLImageView) mo50149a((int) R.id.uj)).setImageDrawable(a);
                    }
                }
            }
            if (C52711k.m112239a((Object) (Boolean) C10423r.m20983a(aVar, "show_report", null, 2, null), (Object) Boolean.valueOf(true))) {
                if (C23324d.m57378a().getRawAdAwemeById((String) C10423r.m20983a(aVar, "aweme_id", null, 2, null)) != null) {
                    AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) mo50149a((int) R.id.cbl);
                    C52711k.m112236a((Object) autoRTLImageView4, "report_ads");
                    autoRTLImageView4.setVisibility(0);
                    ((AutoRTLImageView) mo50149a((int) R.id.cbl)).setOnClickListener(new C24351b(this));
                }
                AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) mo50149a((int) R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView5, "btn_share");
                autoRTLImageView5.setVisibility(8);
            }
            Integer num = (Integer) aVar.f28099F.mo18457b();
            if (num != null && num.intValue() == 2) {
                AutoRTLImageView autoRTLImageView6 = (AutoRTLImageView) mo50149a((int) R.id.p5);
                C52711k.m112236a((Object) autoRTLImageView6, "btn_share");
                autoRTLImageView6.setVisibility(0);
                AutoRTLImageView autoRTLImageView7 = (AutoRTLImageView) mo50149a((int) R.id.cbl);
                C52711k.m112236a((Object) autoRTLImageView7, "report_ads");
                autoRTLImageView7.setVisibility(8);
            } else {
                Integer num2 = (Integer) aVar.f28099F.mo18457b();
                if (num2 != null && num2.intValue() == 1) {
                    AutoRTLImageView autoRTLImageView8 = (AutoRTLImageView) mo50149a((int) R.id.p5);
                    C52711k.m112236a((Object) autoRTLImageView8, "btn_share");
                    autoRTLImageView8.setVisibility(8);
                    AutoRTLImageView autoRTLImageView9 = (AutoRTLImageView) mo50149a((int) R.id.cbl);
                    C52711k.m112236a((Object) autoRTLImageView9, "report_ads");
                    autoRTLImageView9.setVisibility(0);
                }
            }
            C24362b.m59737a(aVar, (AutoRTLImageView) mo50149a((int) R.id.ccm), R.drawable.vr);
        }
    }

    public BulletCommonTitleBar(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        m59720a();
    }

    public BulletCommonTitleBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        m59720a();
    }
}

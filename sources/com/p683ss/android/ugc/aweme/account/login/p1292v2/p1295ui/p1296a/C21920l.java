package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l.C21600b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21852a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.timer.TimerHolder.C21853b;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22044a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22049e;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView;
import com.p683ss.android.ugc.aweme.account.p1307ui.CodeInputView.C22174a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingCircleView;
import com.p683ss.android.ugc.aweme.account.p1307ui.TimerTextView;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l */
public abstract class C21920l extends C21868b implements OnClickListener, C22174a {

    /* renamed from: d */
    public static final C21921a f59302d = new C21921a(null);

    /* renamed from: a */
    private C21853b f59303a;

    /* renamed from: b */
    public C21919k f59304b;

    /* renamed from: c */
    public boolean f59305c;

    /* renamed from: e */
    private C21598l f59306e;

    /* renamed from: j */
    private C21464e f59307j;

    /* renamed from: k */
    private boolean f59308k;

    /* renamed from: p */
    private boolean f59309p;

    /* renamed from: q */
    private boolean f59310q = true;

    /* renamed from: r */
    private final C21925e f59311r = new C21925e(this);

    /* renamed from: s */
    private HashMap f59312s;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l$a */
    public static final class C21921a {
        private C21921a() {
        }

        public /* synthetic */ C21921a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l$b */
    public static final class C21922b implements C22044a {

        /* renamed from: a */
        final /* synthetic */ C21920l f59313a;

        C21922b(C21920l lVar) {
            this.f59313a = lVar;
        }

        /* renamed from: a */
        public final void mo45313a(boolean z) {
            String str;
            StringBuilder sb = new StringBuilder("Voice code ");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
            this.f59313a.f59305c = z;
            FragmentActivity activity = this.f59313a.getActivity();
            C21848h p = this.f59313a.mo45970p();
            C21919k kVar = this.f59313a.f59304b;
            if (kVar == null) {
                C52711k.m112237a("config");
            }
            C21852a.m54531a(activity, p, kVar.mo46019a(), z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l$c */
    static final class C21923c<T> implements C0199s<String> {

        /* renamed from: a */
        final /* synthetic */ C21920l f59314a;

        C21923c(C21920l lVar) {
            this.f59314a = lVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f59314a.mo44862a((int) R.id.ecj)).setTextAndAutoCheck((String) obj);
            this.f59314a.mo46026w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l$d */
    public static final class C21924d extends C22313c {

        /* renamed from: a */
        final /* synthetic */ C21920l f59315a;

        public final void onClick(View view) {
            C52711k.m112240b(view, "view");
            if (!C32800a.m75679a(view) && this.f59315a.mo45998s()) {
                this.f59315a.onClick(view);
            }
        }

        C21924d(C21920l lVar, int i, int i2) {
            this.f59315a = lVar;
            super(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.l$e */
    public static final class C21925e extends C21600b {

        /* renamed from: a */
        final /* synthetic */ C21920l f59316a;

        /* renamed from: a */
        public final void mo45694a() {
            this.f59316a.mo46022j();
        }

        /* renamed from: b */
        public final void mo45695b() {
            if (this.f59316a.isViewValid()) {
                this.f59316a.mo46024u();
            }
        }

        C21925e(C21920l lVar) {
            this.f59316a = lVar;
        }

        /* renamed from: a */
        public final void mo45869a(long j) {
            if (this.f59316a.isViewValid()) {
                this.f59316a.mo46021a(j, true);
            }
        }
    }

    /* renamed from: a */
    public View mo44862a(int i) {
        if (this.f59312s == null) {
            this.f59312s = new HashMap();
        }
        View view = (View) this.f59312s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59312s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a_ */
    public abstract void mo44868a_(String str);

    public abstract C21919k ab_();

    public final void ad_() {
        m54635z();
    }

    /* renamed from: g */
    public void mo44866g() {
        if (this.f59312s != null) {
            this.f59312s.clear();
        }
    }

    /* renamed from: h */
    public abstract void mo44871h();

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.ayt;
    }

    public void onDestroyView() {
        C21464e eVar = this.f59307j;
        if (eVar != null) {
            eVar.mo45649c();
        }
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: v */
    public final void mo46025v() {
        if (isViewValid()) {
            mo46209x();
        } else {
            this.f59310q = true;
        }
    }

    /* renamed from: y */
    private final void m54634y() {
        C21919k kVar = this.f59304b;
        if (kVar == null) {
            C52711k.m112237a("config");
        }
        C22049e.m54782a(kVar.mo46019a(), new C21922b(this));
    }

    /* renamed from: z */
    private final void m54635z() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo44862a((int) R.id.ece);
        C52711k.m112236a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) mo44862a((int) R.id.ece)).mo46299a();
    }

    public void onStart() {
        super.onStart();
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        C21994b.m54752a(codeInputView);
    }

    /* renamed from: w */
    public final void mo46026w() {
        C26890h.m65011a("auto_fill_sms_verification", new C20856a().mo44776a("enter_method", mo45967m()).f56798a);
    }

    /* renamed from: e */
    public final void mo45584e() {
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo44862a((int) R.id.ece);
        C52711k.m112236a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) mo44862a((int) R.id.ece)).mo46300b();
    }

    /* renamed from: j */
    public final void mo46022j() {
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(0);
        }
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
    }

    /* renamed from: u */
    public final void mo46024u() {
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C52711k.m112236a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
            C52711k.m112236a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(true);
    }

    /* renamed from: x */
    private final void mo46209x() {
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
        ((TimerTextView) mo44862a((int) R.id.eci)).setCallback(this.f59311r);
        C21598l c = ((TimerTextView) mo44862a((int) R.id.eci)).mo46336c();
        FragmentActivity activity = getActivity();
        C21919k kVar = this.f59304b;
        if (kVar == null) {
            C52711k.m112237a("config");
        }
        C21852a.m54532a(activity, kVar.mo46019a(), new C21853b(c, null, 2, null), mo45970p());
        C21919k kVar2 = this.f59304b;
        if (kVar2 == null) {
            C52711k.m112237a("config");
        }
        if (kVar2.f59299b) {
            C21919k kVar3 = this.f59304b;
            if (kVar3 == null) {
                C52711k.m112237a("config");
            }
            if (C52711k.m112239a((Object) kVar3.f59300c, (Object) Boolean.valueOf(true))) {
                m54634y();
            }
        }
    }

    /* renamed from: a */
    public final void mo45688a(String str) {
        C52711k.m112240b(str, "codes");
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        C52711k.m112236a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(false);
        this.f59309p = false;
        m54635z();
        mo44868a_(str);
    }

    /* renamed from: b */
    public final void mo45690b(String str) {
        C52711k.m112240b(str, "currentText");
        if (isViewValid()) {
            if (this.f59309p) {
                ((CodeInputView) mo44862a((int) R.id.ecj)).setText("");
                this.f59309p = false;
            }
            ((InputResultIndicator) mo44862a((int) R.id.ecc)).mo45986a();
            ((CodeInputView) mo44862a((int) R.id.ecj)).mo46265d();
        }
    }

    public void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.ecf) {
            mo44871h();
            return;
        }
        if (num != null && num.intValue() == R.id.eck && this.f59305c) {
            this.f59308k = true;
            C21677s sVar = C21677s.f58713a;
            C21829b bVar = this;
            C21919k kVar = this.f59304b;
            if (kVar == null) {
                C52711k.m112237a("config");
            }
            sVar.mo45940a(bVar, kVar.mo46019a(), mo45970p(), mo45965k(), "user_click").mo6491b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59304b = ab_();
        C21919k kVar = this.f59304b;
        if (kVar == null) {
            C52711k.m112237a("config");
        }
        this.f59310q = kVar.f59301d;
        C21919k kVar2 = this.f59304b;
        if (kVar2 == null) {
            C52711k.m112237a("config");
        }
        if (kVar2.f59299b) {
            if (this.f59307j == null) {
                Context context = getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                this.f59307j = new C21464e(context);
            }
            C21464e eVar = this.f59307j;
            if (eVar == null) {
                C52711k.m112234a();
            }
            eVar.mo45648b();
            C21464e eVar2 = this.f59307j;
            if (eVar2 == null) {
                C52711k.m112234a();
            }
            eVar2.mo45647a();
        }
        mo45971q();
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        String str2;
        C52711k.m112240b(str, "message");
        if (!this.f59308k || i != 1206) {
            this.f59309p = true;
            CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
            C52711k.m112236a((Object) codeInputView, "inputCodeView");
            codeInputView.setEnabled(true);
            ((CodeInputView) mo44862a((int) R.id.ecj)).mo46264c();
            ((InputResultIndicator) mo44862a((int) R.id.ecc)).mo45987a(str);
            return;
        }
        this.f59308k = false;
        C10643a aVar = new C10643a(getContext());
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(R.string.fy0);
        } else {
            str2 = null;
        }
        aVar.mo18892a(str2).mo18886a((int) R.string.ahm, (DialogInterface.OnClickListener) null).mo18897a().mo18883c().setCancelable(false);
    }

    /* renamed from: a */
    public final void mo46021a(long j, boolean z) {
        if (this.f59305c && j <= 50000) {
            DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.eck);
            C52711k.m112236a((Object) dmtTextView, "inputCodeVoiceLayout");
            if (dmtTextView.getVisibility() != 0) {
                DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.eck);
                C52711k.m112236a((Object) dmtTextView2, "inputCodeVoiceLayout");
                dmtTextView2.setVisibility(0);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C21598l lVar;
        long j;
        Boolean bool;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        C10705c.m21579a((DmtTextView) mo44862a((int) R.id.ecf));
        mo45997a((DmtTextView) mo44862a((int) R.id.ecf), this);
        DmtTextView dmtTextView = (DmtTextView) mo44862a((int) R.id.ecf);
        C52711k.m112236a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
        CodeInputView codeInputView = (CodeInputView) mo44862a((int) R.id.ecj);
        codeInputView.setEnabled(true);
        codeInputView.mo46260a();
        codeInputView.mo46262b();
        codeInputView.setCallback(this);
        C21919k kVar = this.f59304b;
        if (kVar == null) {
            C52711k.m112237a("config");
        }
        if (kVar.f59299b) {
            i = 4;
        } else {
            i = 6;
        }
        codeInputView.setInputLength(i);
        String string = getString(R.string.fxz);
        C52711k.m112236a((Object) string, "getString(R.string.commo…ation_phone_voice_button)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.fy2, string));
        spannableStringBuilder.setSpan(new C21924d(this, getResources().getColor(R.color.ja), getResources().getColor(R.color.ja)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 34);
        DmtTextView dmtTextView2 = (DmtTextView) mo44862a((int) R.id.eck);
        C52711k.m112236a((Object) dmtTextView2, "inputCodeVoiceLayout");
        dmtTextView2.setText(spannableStringBuilder);
        DmtTextView dmtTextView3 = (DmtTextView) mo44862a((int) R.id.eck);
        C52711k.m112236a((Object) dmtTextView3, "inputCodeVoiceLayout");
        dmtTextView3.setMovementMethod(C22311a.m55214a());
        if (this.f59307j != null) {
            C21464e eVar = this.f59307j;
            if (eVar == null) {
                C52711k.m112234a();
            }
            C0198r<String> rVar = eVar.f58231b;
            C52711k.m112236a((Object) rVar, "mSmsVerifier!!.smsLiveData");
            CharSequence charSequence = (String) rVar.getValue();
            if (!TextUtils.isEmpty(charSequence)) {
                ((CodeInputView) mo44862a((int) R.id.ecj)).setTextAndAutoCheck(charSequence);
                C21464e eVar2 = this.f59307j;
                if (eVar2 == null) {
                    C52711k.m112234a();
                }
                C0198r<String> rVar2 = eVar2.f58231b;
                C52711k.m112236a((Object) rVar2, "mSmsVerifier!!.smsLiveData");
                rVar2.setValue("");
                mo46026w();
            } else {
                C21464e eVar3 = this.f59307j;
                if (eVar3 == null) {
                    C52711k.m112234a();
                }
                eVar3.f58231b.observe(this, new C21923c(this));
            }
        }
        FragmentActivity activity = getActivity();
        C21919k kVar2 = this.f59304b;
        if (kVar2 == null) {
            C52711k.m112237a("config");
        }
        this.f59303a = C21852a.m54530a(activity, kVar2.mo46019a(), mo45970p());
        C21853b bVar = this.f59303a;
        Boolean bool2 = null;
        if (bVar != null) {
            lVar = bVar.f59142a;
        } else {
            lVar = null;
        }
        this.f59306e = lVar;
        TimerTextView timerTextView = (TimerTextView) mo44862a((int) R.id.eci);
        C21598l lVar2 = this.f59306e;
        if (lVar2 != null) {
            j = lVar2.mo45881c();
        } else {
            j = 60000;
        }
        timerTextView.mo46333a(j, 60000, 1000, "s");
        if (this.f59310q) {
            this.f59310q = false;
            mo46209x();
        } else {
            C21853b bVar2 = this.f59303a;
            if (bVar2 != null) {
                bool = bVar2.f59143b;
            } else {
                bool = null;
            }
            if (bool != null) {
                C21853b bVar3 = this.f59303a;
                if (bVar3 != null) {
                    bool2 = bVar3.f59143b;
                }
                if (bool2 == null) {
                    C52711k.m112234a();
                }
                this.f59305c = bool2.booleanValue();
                C21598l lVar3 = this.f59306e;
                if (lVar3 == null) {
                    C52711k.m112234a();
                }
                mo46021a(lVar3.mo45881c(), false);
            }
            if (this.f59306e != null) {
                C21598l lVar4 = this.f59306e;
                if (lVar4 == null) {
                    C52711k.m112234a();
                }
                if (lVar4.mo45883e()) {
                    ((TimerTextView) mo44862a((int) R.id.eci)).setCallback(this.f59311r);
                    TimerTextView timerTextView2 = (TimerTextView) mo44862a((int) R.id.eci);
                    C21598l lVar5 = this.f59306e;
                    if (lVar5 == null) {
                        C52711k.m112234a();
                    }
                    timerTextView2.mo46335a(lVar5);
                    mo46022j();
                }
            }
            C21919k kVar3 = this.f59304b;
            if (kVar3 == null) {
                C52711k.m112237a("config");
            }
            if (kVar3.f59301d) {
                mo46024u();
            }
        }
        if (this.f59208o) {
            this.f59208o = false;
            m54635z();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15525p;
import com.google.android.gms.p1027a.C14882b;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;

@C16299uq
public final class aml extends FrameLayout implements ama {

    /* renamed from: a */
    final ama f40943a;

    /* renamed from: b */
    private final ahs f40944b;

    public aml(ama ama) {
        super(ama.getContext());
        this.f40943a = ama;
        this.f40944b = new ahs(ama.mo29186r(), this, this);
        addView(this.f40943a.getView());
    }

    public final View getView() {
        return this;
    }

    /* renamed from: a */
    public final ahs mo28930a() {
        return this.f40944b;
    }

    public final void onPause() {
        ahs ahs = this.f40944b;
        C15464q.m32132b("onPause must be called from the UI thread.");
        if (ahs.f40511d != null) {
            ahs.f40511d.mo28899i();
        }
        this.f40943a.onPause();
    }

    /* renamed from: D */
    public final void mo29140D() {
        this.f40944b.mo28913b();
        this.f40943a.mo29140D();
    }

    /* renamed from: K */
    public final void mo29147K() {
        setBackgroundColor(0);
        this.f40943a.setBackgroundColor(0);
    }

    /* renamed from: l */
    public final int mo28945l() {
        return getMeasuredHeight();
    }

    /* renamed from: m */
    public final int mo28946m() {
        return getMeasuredWidth();
    }

    /* renamed from: n */
    public final void mo28947n() {
        this.f40943a.mo28947n();
    }

    public final WebView getWebView() {
        return this.f40943a.getWebView();
    }

    /* renamed from: a */
    public final void mo29242a(String str, Map<String, ?> map) {
        this.f40943a.mo29242a(str, map);
    }

    /* renamed from: a */
    public final void mo29243a(String str, JSONObject jSONObject) {
        this.f40943a.mo29243a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo29157a(String str, C15948hq<? super ama> hqVar) {
        this.f40943a.mo29157a(str, hqVar);
    }

    /* renamed from: b */
    public final void mo29161b(String str, C15948hq<? super ama> hqVar) {
        this.f40943a.mo29161b(str, hqVar);
    }

    /* renamed from: a */
    public final void mo29156a(String str, C15525p<C15948hq<? super ama>> pVar) {
        this.f40943a.mo29156a(str, pVar);
    }

    /* renamed from: o */
    public final void mo29181o() {
        this.f40943a.mo29181o();
    }

    /* renamed from: a */
    public final void mo29149a(int i) {
        this.f40943a.mo29149a(i);
    }

    /* renamed from: p */
    public final void mo29184p() {
        this.f40943a.mo29184p();
    }

    /* renamed from: q */
    public final void mo29185q() {
        this.f40943a.mo29185q();
    }

    /* renamed from: a */
    public final void mo28935a(boolean z, long j) {
        this.f40943a.mo28935a(z, j);
    }

    /* renamed from: d */
    public final void mo29248d(String str) {
        this.f40943a.mo29248d(str);
    }

    /* renamed from: b */
    public final void mo29247b(String str, JSONObject jSONObject) {
        this.f40943a.mo29247b(str, jSONObject);
    }

    /* renamed from: d */
    public final Activity mo28938d() {
        return this.f40943a.mo28938d();
    }

    /* renamed from: r */
    public final Context mo29186r() {
        return this.f40943a.mo29186r();
    }

    /* renamed from: e */
    public final C14986bt mo28939e() {
        return this.f40943a.mo28939e();
    }

    /* renamed from: s */
    public final C15006c mo29187s() {
        return this.f40943a.mo29187s();
    }

    /* renamed from: A */
    public final C14882b mo29137A() {
        return this.f40943a.mo29137A();
    }

    /* renamed from: t */
    public final C15006c mo29194t() {
        return this.f40943a.mo29194t();
    }

    /* renamed from: u */
    public final anp mo29195u() {
        return this.f40943a.mo29195u();
    }

    /* renamed from: v */
    public final String mo29196v() {
        return this.f40943a.mo29196v();
    }

    /* renamed from: w */
    public final anj mo29197w() {
        return this.f40943a.mo29197w();
    }

    /* renamed from: x */
    public final WebViewClient mo29198x() {
        return this.f40943a.mo29198x();
    }

    /* renamed from: y */
    public final boolean mo29199y() {
        return this.f40943a.mo29199y();
    }

    /* renamed from: z */
    public final beh mo29200z() {
        return this.f40943a.mo29200z();
    }

    /* renamed from: k */
    public final zzbgz mo28944k() {
        return this.f40943a.mo28944k();
    }

    /* renamed from: B */
    public final boolean mo29138B() {
        return this.f40943a.mo29138B();
    }

    public final int getRequestedOrientation() {
        return this.f40943a.getRequestedOrientation();
    }

    /* renamed from: C */
    public final boolean mo29139C() {
        return this.f40943a.mo29139C();
    }

    /* renamed from: E */
    public final boolean mo29141E() {
        return this.f40943a.mo29141E();
    }

    /* renamed from: F */
    public final boolean mo29142F() {
        return this.f40943a.mo29142F();
    }

    /* renamed from: D_ */
    public final void mo27549D_() {
        this.f40943a.mo27549D_();
    }

    /* renamed from: C_ */
    public final void mo27548C_() {
        this.f40943a.mo27548C_();
    }

    /* renamed from: g */
    public final String mo28941g() {
        return this.f40943a.mo28941g();
    }

    /* renamed from: c */
    public final C15804ci mo28937c() {
        return this.f40943a.mo28937c();
    }

    /* renamed from: j */
    public final C15805cj mo28943j() {
        return this.f40943a.mo28943j();
    }

    /* renamed from: b */
    public final ams mo28936b() {
        return this.f40943a.mo28936b();
    }

    /* renamed from: a */
    public final void mo29152a(C15006c cVar) {
        this.f40943a.mo29152a(cVar);
    }

    /* renamed from: a */
    public final void mo29151a(C14882b bVar) {
        this.f40943a.mo29151a(bVar);
    }

    /* renamed from: a */
    public final void mo29153a(anp anp) {
        this.f40943a.mo29153a(anp);
    }

    /* renamed from: b */
    public final void mo29162b(boolean z) {
        this.f40943a.mo29162b(z);
    }

    /* renamed from: H */
    public final void mo29144H() {
        this.f40943a.mo29144H();
    }

    /* renamed from: a */
    public final void mo29150a(Context context) {
        this.f40943a.mo29150a(context);
    }

    /* renamed from: c */
    public final void mo29163c(boolean z) {
        this.f40943a.mo29163c(z);
    }

    public final void setRequestedOrientation(int i) {
        this.f40943a.setRequestedOrientation(i);
    }

    /* renamed from: b */
    public final void mo29159b(C15006c cVar) {
        this.f40943a.mo29159b(cVar);
    }

    /* renamed from: d */
    public final void mo29164d(boolean z) {
        this.f40943a.mo29164d(z);
    }

    /* renamed from: b */
    public final void mo29160b(String str) {
        this.f40943a.mo29160b(str);
    }

    /* renamed from: a */
    public final void mo28933a(String str, akt akt) {
        this.f40943a.mo28933a(str, akt);
    }

    /* renamed from: a */
    public final akt mo28931a(String str) {
        return this.f40943a.mo28931a(str);
    }

    /* renamed from: I */
    public final void mo29145I() {
        this.f40943a.mo29145I();
    }

    public final void destroy() {
        C14882b A = mo29137A();
        if (A != null) {
            C16219rr o = C14963ax.m30845o();
            synchronized (C16219rr.f45518a) {
                if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44334cO)).booleanValue()) {
                    if (C16219rr.f45519b) {
                        try {
                            o.f45521c.mo29423c(A);
                        } catch (RemoteException | NullPointerException e) {
                            afc.m32797d("#007 Could not call remote method.", e);
                        }
                    }
                }
            }
            acd.f40245a.postDelayed(new amm(this), (long) ((Integer) caf.m37099d().mo30717a(C15740bx.f44335cP)).intValue());
            return;
        }
        this.f40943a.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f40943a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f40943a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f40943a.loadUrl(str);
    }

    /* renamed from: a */
    public final void mo29158a(String str, String str2, String str3) {
        this.f40943a.mo29158a(str, str2, str3);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f40943a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f40943a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f40943a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f40943a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f40943a.stopLoading();
    }

    public final void onResume() {
        this.f40943a.onResume();
    }

    /* renamed from: L */
    public final void mo29148L() {
        TextView textView = new TextView(getContext());
        Resources c = C14963ax.m30834d().mo28592c();
        textView.setText(c != null ? c.getString(R.string.d9m) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: f */
    public final void mo29167f(boolean z) {
        this.f40943a.mo29167f(z);
    }

    /* renamed from: a */
    public final void mo29154a(C15824db dbVar) {
        this.f40943a.mo29154a(dbVar);
    }

    /* renamed from: a */
    public final void mo28549a(bvv bvv) {
        this.f40943a.mo28549a(bvv);
    }

    public final OnClickListener getOnClickListener() {
        return this.f40943a.getOnClickListener();
    }

    /* renamed from: a */
    public final void mo29155a(C15837do doVar) {
        this.f40943a.mo29155a(doVar);
    }

    /* renamed from: J */
    public final C15837do mo29146J() {
        return this.f40943a.mo29146J();
    }

    /* renamed from: a */
    public final void mo28932a(ams ams) {
        this.f40943a.mo28932a(ams);
    }

    /* renamed from: G */
    public final boolean mo29143G() {
        return this.f40943a.mo29143G();
    }

    /* renamed from: e */
    public final void mo29166e(boolean z) {
        this.f40943a.mo29166e(z);
    }

    /* renamed from: a */
    public final void mo28934a(boolean z) {
        this.f40943a.mo28934a(z);
    }

    /* renamed from: f */
    public final void mo28940f() {
        this.f40943a.mo28940f();
    }

    /* renamed from: a */
    public final void mo29241a(zzc zzc) {
        this.f40943a.mo29241a(zzc);
    }

    /* renamed from: a */
    public final void mo29244a(boolean z, int i) {
        this.f40943a.mo29244a(z, i);
    }

    /* renamed from: a */
    public final void mo29245a(boolean z, int i, String str) {
        this.f40943a.mo29245a(z, i, str);
    }

    /* renamed from: a */
    public final void mo29246a(boolean z, int i, String str, String str2) {
        this.f40943a.mo29246a(z, i, str, str2);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C14956aq;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.overlay.C15006c;
import com.google.android.gms.common.util.C15525p;
import com.google.android.gms.p1027a.C14882b;

@C16299uq
public interface ama extends C14956aq, aib, amy, amz, and, ang, anh, ani, bvw, C16037ky, C16063lx {
    /* renamed from: A */
    C14882b mo29137A();

    /* renamed from: B */
    boolean mo29138B();

    /* renamed from: C */
    boolean mo29139C();

    /* renamed from: D */
    void mo29140D();

    /* renamed from: E */
    boolean mo29141E();

    /* renamed from: F */
    boolean mo29142F();

    /* renamed from: G */
    boolean mo29143G();

    /* renamed from: H */
    void mo29144H();

    /* renamed from: I */
    void mo29145I();

    /* renamed from: J */
    C15837do mo29146J();

    /* renamed from: K */
    void mo29147K();

    /* renamed from: L */
    void mo29148L();

    /* renamed from: a */
    void mo29149a(int i);

    /* renamed from: a */
    void mo29150a(Context context);

    /* renamed from: a */
    void mo29151a(C14882b bVar);

    /* renamed from: a */
    void mo29152a(C15006c cVar);

    /* renamed from: a */
    void mo28932a(ams ams);

    /* renamed from: a */
    void mo29153a(anp anp);

    /* renamed from: a */
    void mo29154a(C15824db dbVar);

    /* renamed from: a */
    void mo29155a(C15837do doVar);

    /* renamed from: a */
    void mo29156a(String str, C15525p<C15948hq<? super ama>> pVar);

    /* renamed from: a */
    void mo28933a(String str, akt akt);

    /* renamed from: a */
    void mo29157a(String str, C15948hq<? super ama> hqVar);

    /* renamed from: a */
    void mo29158a(String str, String str2, String str3);

    /* renamed from: b */
    ams mo28936b();

    /* renamed from: b */
    void mo29159b(C15006c cVar);

    /* renamed from: b */
    void mo29160b(String str);

    /* renamed from: b */
    void mo29161b(String str, C15948hq<? super ama> hqVar);

    /* renamed from: b */
    void mo29162b(boolean z);

    /* renamed from: c */
    void mo29163c(boolean z);

    /* renamed from: d */
    Activity mo28938d();

    /* renamed from: d */
    void mo29164d(boolean z);

    void destroy();

    /* renamed from: e */
    C14986bt mo28939e();

    /* renamed from: e */
    void mo29166e(boolean z);

    /* renamed from: f */
    void mo29167f(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: j */
    C15805cj mo28943j();

    /* renamed from: k */
    zzbgz mo28944k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* renamed from: o */
    void mo29181o();

    void onPause();

    void onResume();

    /* renamed from: p */
    void mo29184p();

    /* renamed from: q */
    void mo29185q();

    /* renamed from: r */
    Context mo29186r();

    /* renamed from: s */
    C15006c mo29187s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    C15006c mo29194t();

    /* renamed from: u */
    anp mo29195u();

    /* renamed from: v */
    String mo29196v();

    /* renamed from: w */
    anj mo29197w();

    /* renamed from: x */
    WebViewClient mo29198x();

    /* renamed from: y */
    boolean mo29199y();

    /* renamed from: z */
    beh mo29200z();
}

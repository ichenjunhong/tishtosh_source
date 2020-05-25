package com.bytedance.android.livesdk.browser.p290d;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3011j;
import com.bytedance.android.live.browser.C3806b;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p226e.p228b.C3844a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3869ag;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p234c.C3887a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4000aa;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.android.live.uikit.p255a.C4197a;
import com.bytedance.android.live.uikit.p256b.C4198a;
import com.bytedance.android.live.uikit.p256b.C4200b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C4672a;
import com.bytedance.android.livesdk.browser.C4690b;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.jsbridge.C4769b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4846au.C4847a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4865bc;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4869bd;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4873be;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4875bg;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4901i.C4902a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4921p;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4921p.C4931a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4921p.C4932b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4935r;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4779e;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4779e.C4780a;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4791k;
import com.bytedance.android.livesdk.browser.p287a.C4687a;
import com.bytedance.android.livesdk.browser.p287a.C4688b;
import com.bytedance.android.livesdk.browser.p288b.C4691a;
import com.bytedance.android.livesdk.browser.p289c.C4705d;
import com.bytedance.android.livesdk.browser.p291e.C4746a;
import com.bytedance.android.livesdk.browser.p292f.C4750d;
import com.bytedance.android.livesdk.browser.p294h.C4757b;
import com.bytedance.android.livesdk.browser.p295i.C4761a;
import com.bytedance.android.livesdk.browser.view.C4956a;
import com.bytedance.android.livesdk.browser.view.C4957b;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4581b;
import com.bytedance.android.livesdk.p279af.p281b.C4584a;
import com.bytedance.android.livesdk.p279af.p281b.C4587d;
import com.bytedance.android.livesdk.p279af.p281b.C4588e;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p416t.C8302f;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdk.sign.C8270b;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.p431c.C8609a;
import com.bytedance.android.livesdkapi.p431c.C8610b;
import com.bytedance.android.monitor.webview.C8902j;
import com.bytedance.common.p520c.C9349a;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p677b.C10779d.C10781b;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.p675g.p678c.C10863s;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13756h;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C1680ad;
import p064c.p065a.C1681ae;
import p064c.p065a.C1683ag;
import p064c.p065a.C1686aj;
import p064c.p065a.C2149h;
import p064c.p065a.C2151i;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1792ad;
import p064c.p065a.p072e.p077e.p079b.C1856y;
import p064c.p065a.p072e.p077e.p082e.C2061q;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.browser.d.h */
public class C4720h extends C3846a implements OnClickListener, C4762a, C4780a, C4847a, C4902a, C8610b, C9382a {

    /* renamed from: A */
    public C4769b f12847A;

    /* renamed from: B */
    public boolean f12848B;

    /* renamed from: F */
    public C4761a f12849F;

    /* renamed from: G */
    public long f12850G;

    /* renamed from: H */
    public long f12851H;

    /* renamed from: I */
    public long f12852I;

    /* renamed from: J */
    public long f12853J;

    /* renamed from: K */
    public Map<String, Object> f12854K = new HashMap();

    /* renamed from: L */
    private FrameLayout f12855L;

    /* renamed from: M */
    private View f12856M;

    /* renamed from: N */
    private View f12857N;

    /* renamed from: O */
    private boolean f12858O;

    /* renamed from: P */
    private boolean f12859P = true;

    /* renamed from: Q */
    private boolean f12860Q;

    /* renamed from: R */
    private String f12861R;

    /* renamed from: S */
    private String f12862S;

    /* renamed from: T */
    private int f12863T;

    /* renamed from: U */
    private int f12864U = -1;

    /* renamed from: V */
    private C4198a f12865V;

    /* renamed from: W */
    private C4757b f12866W;

    /* renamed from: X */
    private C4691a f12867X;

    /* renamed from: Y */
    private boolean f12868Y;

    /* renamed from: Z */
    private boolean f12869Z;

    /* renamed from: a */
    public String f12870a;

    /* renamed from: aa */
    private Handler f12871aa;

    /* renamed from: ab */
    private JSONObject f12872ab;

    /* renamed from: ac */
    private boolean f12873ac;

    /* renamed from: ad */
    private String f12874ad;

    /* renamed from: ae */
    private String f12875ae;

    /* renamed from: af */
    private String f12876af;

    /* renamed from: ag */
    private OnClickListener f12877ag = new C4728i(this);

    /* renamed from: b */
    public String f12878b = "";

    /* renamed from: c */
    public C4726d f12879c;

    /* renamed from: d */
    public C4727e f12880d;

    /* renamed from: e */
    public C4723a f12881e;

    /* renamed from: f */
    public C3806b f12882f;

    /* renamed from: g */
    public boolean f12883g = true;

    /* renamed from: h */
    protected View f12884h;

    /* renamed from: i */
    View f12885i;

    /* renamed from: j */
    public TextView f12886j;

    /* renamed from: k */
    public FullscreenVideoFrame f12887k;

    /* renamed from: l */
    public View f12888l;

    /* renamed from: m */
    public CustomViewCallback f12889m;

    /* renamed from: n */
    public WebView f12890n;

    /* renamed from: o */
    public ViewGroup f12891o;

    /* renamed from: p */
    public View f12892p;

    /* renamed from: q */
    boolean f12893q;

    /* renamed from: r */
    public boolean f12894r = true;

    /* renamed from: s */
    C4724b f12895s;

    /* renamed from: t */
    C4865bc f12896t;

    /* renamed from: u */
    C4875bg f12897u;

    /* renamed from: v */
    C4869bd f12898v;

    /* renamed from: w */
    C4921p f12899w;

    /* renamed from: x */
    public boolean f12900x = true;

    /* renamed from: y */
    public long f12901y;

    /* renamed from: z */
    public boolean f12902z = true;

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$a */
    public interface C4723a {
        /* renamed from: a */
        void mo10539a(C4769b bVar);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$b */
    class C4724b extends C4688b {
        public final void onConsoleMessage(String str, int i, String str2) {
        }

        public final void onGeolocationPermissionsHidePrompt() {
            if (C4720h.this.f12847A != null) {
                C4720h.this.f12847A.mo10594d();
            }
        }

        public final void onHideCustomView() {
            if (C4720h.this.f12888l == null) {
                C4720h.this.f12889m = null;
                return;
            }
            C4720h hVar = C4720h.this;
            if (hVar.f12885i != null && !hVar.f12893q) {
                hVar.f12885i.setVisibility(0);
            }
            C4720h.this.f12887k.setVisibility(8);
            C4720h.this.f12887k.removeView(C4720h.this.f12888l);
            C9432q.m18671a((Activity) C4720h.this.getActivity(), false);
            C4720h.this.f12888l = null;
            C4720h.this.f12889m.onCustomViewHidden();
        }

        C4724b() {
            super(C4720h.this);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (C4720h.this.f12847A != null) {
                C4720h.this.f12847A.mo10592a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C8902j.m17571b().mo15896a(webView, i);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (C4720h.this.f12900x && C4720h.this.getActivity() != null && !C9431p.m18664a(str) && !TextUtils.equals(QuickShopBusiness.f64351b, str)) {
                C4720h hVar = C4720h.this;
                if (hVar.f12886j != null) {
                    hVar.f12886j.setText(str);
                }
                if (C4720h.this.f12880d != null) {
                    C4720h.this.f12880d.mo10540a(str);
                }
            }
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            if (C4720h.this.f12902z) {
                if (C4720h.this.f12888l != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                C4720h hVar = C4720h.this;
                if (hVar.f12885i != null) {
                    hVar.f12885i.setVisibility(8);
                }
                C4720h.this.f12889m = customViewCallback;
                C4720h.this.f12887k.addView(view);
                C4720h.this.f12888l = view;
                C9432q.m18671a((Activity) C4720h.this.getActivity(), true);
                C4720h.this.f12887k.setVisibility(0);
                C4720h.this.f12887k.requestFocus();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$c */
    class C4725c extends C4687a {
        C4725c(WebViewClient webViewClient) {
            super(null);
        }

        public final void onLoadResource(WebView webView, String str) {
            if (C9415i.m18635b()) {
                C4581b.m11009a(str);
            }
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            C4720h.this.f12901y = System.currentTimeMillis();
            if (C4720h.this.f12879c != null) {
                C4720h.this.f12879c.mo10542c();
            }
            if (C4720h.this.f12883g) {
                webView.clearHistory();
                C4720h.this.f12883g = false;
            }
            super.onPageFinished(webView, str);
            if (TextUtils.isEmpty(C4720h.this.f12878b) && C4720h.this.f12890n != null) {
                C4720h.this.f12878b = C4720h.this.f12890n.getTitle();
                C4720h.this.f12886j.setText(C4720h.this.f12878b);
            }
            if (C4720h.this.f12848B && C4720h.this.f12890n != null) {
                WebView webView2 = C4720h.this.f12890n;
                String str2 = QuickShopBusiness.f64351b;
                C18984e.m46161a(str2);
                webView2.loadUrl(str2);
            }
            if (!C4720h.this.f12894r) {
                C4720h.this.mo10559f();
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C4514j.m10883j().mo10322c().mo10500a(webView, str) || super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !WebKitApi.SCHEME_HTTP.equals(lowerCase) && !WebKitApi.SCHEME_HTTPS.equals(lowerCase)) {
                    return C4514j.m10883j().mo10328i().handle(C4720h.this.getContext(), parse);
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            String str2;
            C4746a.f12953a = System.currentTimeMillis();
            if (!TextUtils.isEmpty(str)) {
                WebResourceResponse a = C4514j.m10883j().mo10323d().mo10332d().mo10587a(str, webView);
                boolean z = false;
                if (a != null) {
                    if (TextUtils.equals("text/html", a.getMimeType())) {
                        C4720h.this.f12853J = System.currentTimeMillis();
                        C4720h.this.f12854K.put("intercept_delay", Long.valueOf((C4720h.this.f12853J - C4720h.this.f12852I) / 1000));
                    }
                    if (C4720h.m11262b(str)) {
                        C4746a.m11311a(C4720h.this.f12870a, str, 0);
                    }
                    C8902j.m17571b().mo15901a(webView, str, true);
                    Uri parse = Uri.parse(str);
                    if (parse.getPath() == null) {
                        str2 = "";
                    } else {
                        str2 = parse.getPath();
                    }
                    if (str2.endsWith("jpg") || str2.endsWith("jpeg") || str2.endsWith("png") || str2.endsWith("gif") || str2.endsWith("ico")) {
                        z = true;
                    }
                    if (z) {
                        C4720h hVar = C4720h.this;
                        Uri parse2 = Uri.parse(str);
                        C14001h c = C13771c.m27875c();
                        if (c.mo26194c(parse2)) {
                            C8902j.m17571b().mo15905b(webView, str, true);
                        } else {
                            C13619c c2 = c.f36483d.mo26147c(C14229b.fromUri(parse2), null);
                            C13756h h = C13756h.m27848h();
                            c.f36481b.mo26135d(c2).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C0011g<Boolean, C0013i<Boolean>>(c2) {

                                /* renamed from: a */
                                final /* synthetic */ C13619c f36499a;

                                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                                    if (iVar.mo31c() || iVar.mo33d() || !((Boolean) iVar.mo34e()).booleanValue()) {
                                        return C14001h.this.f36482c.mo26135d(this.f36499a);
                                    }
                                    return C0013i.m14a(Boolean.valueOf(true));
                                }

                                {
                                    this.f36499a = r2;
                                }
                            }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Void>(h) {

                                /* renamed from: a */
                                final /* synthetic */ C13756h f36497a;

                                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                                    boolean z;
                                    C13756h hVar = this.f36497a;
                                    if (iVar.mo31c() || iVar.mo33d() || !((Boolean) iVar.mo34e()).booleanValue()) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    hVar.mo25691b(Boolean.valueOf(z));
                                    return null;
                                }

                                {
                                    this.f36497a = r2;
                                }
                            });
                            h.mo25666a(new C13744b<Boolean>(webView, str) {

                                /* renamed from: a */
                                final /* synthetic */ WebView f12904a;

                                /* renamed from: b */
                                final /* synthetic */ String f12905b;

                                public final void onFailureImpl(C13745c<Boolean> cVar) {
                                    C8902j.m17571b().mo15905b(this.f12904a, this.f12905b, false);
                                }

                                public final void onNewResultImpl(C13745c<Boolean> cVar) {
                                    if (!cVar.mo25672b() || cVar.mo25674d() == null) {
                                        C8902j.m17571b().mo15905b(this.f12904a, this.f12905b, false);
                                    } else if (((Boolean) cVar.mo25674d()).booleanValue()) {
                                        C8902j.m17571b().mo15905b(this.f12904a, this.f12905b, true);
                                    } else {
                                        C8902j.m17571b().mo15905b(this.f12904a, this.f12905b, false);
                                    }
                                }

                                {
                                    this.f12904a = r2;
                                    this.f12905b = r3;
                                }
                            }, AsyncTask.THREAD_POOL_EXECUTOR);
                        }
                    }
                    return a;
                }
                if (C4720h.m11262b(str)) {
                    C4746a.m11311a(C4720h.this.f12870a, str, 1);
                }
                C8902j.m17571b().mo15901a(webView, str, false);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C8902j.m17571b().mo15898a(webView, str, bitmap);
            C4720h.this.f12851H = System.currentTimeMillis();
            C4720h.this.f12848B = false;
            TextUtils.equals(str, QuickShopBusiness.f64351b);
            C4720h.this.f12854K.put("constrution_duration", Long.valueOf((C4720h.this.f12851H - C4720h.this.f12850G) / 1000));
            if (C4720h.this.f12879c != null) {
                C4720h.this.f12879c.mo10541b();
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            new C1161a(webView.getContext()).mo3764a((CharSequence) "notification error ssl cert invalid").mo3765a((CharSequence) "continue", (DialogInterface.OnClickListener) new C4740u(sslErrorHandler)).mo3771b((CharSequence) "cancel", (DialogInterface.OnClickListener) new C4741v(sslErrorHandler)).mo3775c();
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "webview_receive_ssl_error");
            hashMap.put("error_detail", sslError.toString());
            C8064d.m16005b().mo9201c("ttlive_exception", (Map<String, ?>) hashMap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C4720h.this.f12901y = System.currentTimeMillis();
            C4720h.this.mo10559f();
            C4720h.this.f12848B = true;
            if (C4720h.this.f12879c != null) {
                C4720h.this.f12879c.mo10538a(i);
            }
            if (C4720h.this.f12849F != null) {
                C4720h.this.f12849F.mo10590a(2, i, str);
            }
            C4720h.this.mo10550a(1);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$d */
    public interface C4726d {
        /* renamed from: a */
        void mo10538a(int i);

        /* renamed from: b */
        void mo10541b();

        /* renamed from: c */
        void mo10542c();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.d.h$e */
    public interface C4727e {
        /* renamed from: a */
        void mo10540a(String str);
    }

    /* renamed from: c */
    public final Fragment mo10556c() {
        return this;
    }

    /* renamed from: d */
    public final C4757b mo10557d() {
        return this.f12866W;
    }

    /* renamed from: e */
    public final void mo10558e() {
        mo10559f();
    }

    /* renamed from: f */
    public final void mo10559f() {
        if (this.f12855L != null) {
            this.f12855L.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo10555b() {
        if (this.f12890n == null || !this.f12890n.canGoBack()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof C8609a) {
                activity.finish();
            }
            return;
        }
        this.f12890n.goBack();
    }

    /* renamed from: g */
    public final void mo10560g() {
        this.f12854K.put("first_loaded", Long.valueOf((System.currentTimeMillis() - this.f12850G) / 1000));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10549a() {
        if (this.f12890n != null) {
            this.f12890n.clearCache(false);
            if (this.f12872ab == null || this.f12872ab.length() <= 0) {
                C4581b.m11005a(this.f12875ae, this.f12890n, this.f12874ad, true);
            } else {
                HashMap hashMap = new HashMap();
                C4581b.m11008a(hashMap, (String) null, this.f12872ab);
                C4581b.m11006a(this.f12875ae, this.f12890n, (Map<String, String>) hashMap);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f12890n != null) {
            this.f12890n.getSettings().setBlockNetworkLoads(false);
            if (this.f12871aa != null) {
                this.f12871aa.removeMessages(10011);
            }
        }
        super.onResume();
        C9349a.m18526b(this.f12890n);
        if (this.f12865V != null) {
            this.f12865V.f11392i = false;
        }
        if (this.f12890n != null && this.f12864U != -1) {
            this.f12890n.reload();
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f12865V != null) {
            C4198a aVar = this.f12865V;
            aVar.dismiss();
            aVar.f11387d.clearAnimation();
            aVar.f11384a = null;
            C4200b a = C4200b.m10416a();
            a.f11412a.remove(aVar);
            while (a.f11412a.contains(aVar)) {
                a.f11412a.remove(aVar);
            }
            this.f12865V = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f12849F != null && this.f12901y == 0) {
            this.f12849F.mo10590a(3, 0, "");
        }
        mo10550a(0);
        C4514j.m10883j().mo10322c().mo10504b((C4762a) this);
        C4514j.m10883j().mo10323d().mo10330b().mo10589a(getActivity());
        if (this.f12847A != null) {
            this.f12847A.mo10484b();
        }
        if (this.f12890n != null) {
            try {
                C4514j.m10883j().mo10322c().mo10492a(this.f12890n);
            } catch (Exception unused) {
            }
        }
        if (this.f12871aa != null) {
            this.f12871aa.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 > 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r6 = this;
            super.onPause()
            android.support.v4.app.FragmentActivity r0 = r6.getActivity()
            android.webkit.WebView r1 = r6.f12890n
            com.bytedance.common.p520c.C9349a.m18525a(r1)
            android.support.v4.app.FragmentActivity r1 = r6.getActivity()
            com.bytedance.android.livesdk.browser.b.a r2 = r6.f12867X
            android.webkit.WebView r3 = r6.f12890n
            if (r1 == 0) goto L_0x0078
            if (r3 == 0) goto L_0x0078
            if (r2 != 0) goto L_0x001b
            goto L_0x0078
        L_0x001b:
            int r2 = r2.mo10481a()
            r4 = 1
            if (r2 != 0) goto L_0x002d
            int r2 = com.bytedance.android.livesdk.browser.C4695c.f12779b
            if (r2 >= 0) goto L_0x002b
            boolean r5 = com.bytedance.android.livesdk.browser.C4695c.f12778a
            if (r5 == 0) goto L_0x002b
            r2 = 1
        L_0x002b:
            if (r2 <= 0) goto L_0x0078
        L_0x002d:
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0078
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L_0x0078
            java.lang.String r2 = "about:blank"
            com.bytedance.android.live.core.p230g.C3915v.m9893a(r3, r2)     // Catch:{ Exception -> 0x0077 }
            int r2 = com.bytedance.android.livesdk.browser.C4695c.f12780c     // Catch:{ Exception -> 0x0077 }
            if (r2 <= 0) goto L_0x0078
            android.view.View r2 = r3.getRootView()     // Catch:{ Exception -> 0x0077 }
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x0077 }
            if (r3 == 0) goto L_0x0078
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ Exception -> 0x0077 }
            r5 = 0
            android.view.View r3 = r3.getChildAt(r5)     // Catch:{ Exception -> 0x0077 }
            r3.setDrawingCacheEnabled(r4)     // Catch:{ Exception -> 0x0077 }
            android.graphics.Bitmap r4 = r3.getDrawingCache()     // Catch:{ Exception -> 0x0077 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4)     // Catch:{ Exception -> 0x0077 }
            r3.setDrawingCacheEnabled(r5)     // Catch:{ Exception -> 0x0077 }
            android.widget.ImageView r3 = new android.widget.ImageView     // Catch:{ Exception -> 0x0077 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0077 }
            r3.setImageBitmap(r4)     // Catch:{ Exception -> 0x0077 }
            r3.setVisibility(r5)     // Catch:{ Exception -> 0x0077 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0077 }
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams     // Catch:{ Exception -> 0x0077 }
            r4 = -1
            r1.<init>(r4, r4)     // Catch:{ Exception -> 0x0077 }
            r2.addView(r3, r1)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            android.os.Handler r1 = r6.f12871aa
            if (r1 == 0) goto L_0x008e
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x008e
            android.os.Handler r0 = r6.f12871aa
            r1 = 10011(0x271b, float:1.4028E-41)
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r0.sendEmptyMessageDelayed(r1, r2)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.p290d.C4720h.onPause():void");
    }

    /* renamed from: a */
    public final void mo10553a(String str) {
        this.f12876af = str;
    }

    /* renamed from: a */
    public final void mo10551a(long j) {
        this.f12849F.mo10590a(1, 0, "");
    }

    /* renamed from: a */
    public final void mo10550a(int i) {
        if (!TextUtils.isEmpty(this.f12876af)) {
            C3837e.m9743a(this.f12876af, i, this.f12854K);
            this.f12876af = null;
            this.f12854K = null;
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 10011 && !this.f10827C && this.f12890n != null) {
            try {
                this.f12890n.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m11262b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            if (path.endsWith(".htm") || path.endsWith(".html") || path.endsWith(".css") || path.endsWith(".js")) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo10552a(C4757b bVar) {
        this.f12866W = bVar;
        this.f12856M.setVisibility(0);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.p5 || id == R.id.pf) {
            if (this.f12866W != null) {
                TTLiveSDKContext.getHostService().mo10312e().mo10343a(getActivity(), C8633b.m17039a().mo15119d(this.f12866W.f12959d).mo15117b(this.f12866W.f12957b).mo15118c(this.f12866W.f12958c).mo15116a(), new C8632a() {
                    /* renamed from: a */
                    public final void mo8970a(String str, String str2) {
                    }

                    /* renamed from: a */
                    public final void mo8971a(Throwable th) {
                    }
                });
            }
        } else if (id == R.id.pe) {
            mo10555b();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super.onCreate(bundle);
        if (TTLiveSDKContext.getHostService() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f12867X = C4514j.m10883j().mo10323d().mo10329a();
        if (VERSION.SDK_INT >= 19 && ((Boolean) C4690b.f12776i.mo9431a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        ((C4002ac) TTLiveSDKContext.getHostService().mo10315h().mo14537g().mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C4729j<Object>(this));
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.getBoolean("from_notification", false);
        String string = arguments.getString("url");
        if (!TextUtils.isEmpty(string)) {
            Uri parse = Uri.parse(string);
            if (!this.f12858O) {
                this.f12858O = arguments.getBoolean("hide_status_bar", false);
            }
            if (!this.f12893q) {
                this.f12893q = arguments.getBoolean("hide_nav_bar", false);
            }
            if (!this.f12859P) {
                this.f12859P = arguments.getBoolean("hide_more", false);
            }
            if (!this.f12860Q) {
                this.f12860Q = arguments.getBoolean("trans_status_bar", false);
            }
            this.f12863T = arguments.getInt("bundle_web_view_background_color", Color.parseColor("#ffffff"));
            if (parse != null) {
                try {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("web_bg_color"))) {
                        String queryParameter = parse.getQueryParameter("web_bg_color");
                        if (!queryParameter.startsWith("#")) {
                            StringBuilder sb = new StringBuilder("#");
                            sb.append(queryParameter);
                            queryParameter = sb.toString();
                        }
                        this.f12863T = Color.parseColor(queryParameter);
                    }
                } catch (Exception unused) {
                }
            }
            if (parse != null) {
                try {
                    if (parse.getQueryParameter("hide_nav_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_nav_bar")) == 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.f12893q = z5;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            if (!(parse == null || parse.getQueryParameter("hide_status_bar") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("hide_status_bar")) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f12858O = z4;
            }
            if (!(parse == null || parse.getQueryParameter("hide_more") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("hide_more")) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f12859P = z3;
            }
            if (!(parse == null || parse.getQueryParameter("trans_status_bar") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("trans_status_bar")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f12860Q = z2;
            }
            if (!(parse == null || parse.getQueryParameter("hide_loading") == null)) {
                if (C4568ah.m10970b(parse.getQueryParameter("hide_loading")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f12894r = z;
            }
            if (parse != null) {
                this.f12861R = parse.getQueryParameter("status_bar_color");
                this.f12862S = parse.getQueryParameter("status_bar_bg_color");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
            }
            if (arguments2 != null) {
                this.f12874ad = arguments2.getString("referer");
            }
            if (arguments2 != null) {
                this.f12878b = arguments2.getString("title");
            }
            if (parse != null && !TextUtils.isEmpty(parse.getQueryParameter("title"))) {
                this.f12878b = parse.getQueryParameter("title");
            }
            if (!(parse == null || parse.getQueryParameter("bundle_sale_show_status") == null)) {
                this.f12864U = Integer.parseInt(parse.getQueryParameter("bundle_sale_show_status"));
            }
        }
        if ("black".equals(this.f12861R)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C3887a.m9823a(activity.getWindow());
            }
        } else if ("white".equals(this.f12861R)) {
            C3887a.m9825b(getActivity().getWindow());
        }
        if (!C9431p.m18664a(this.f12862S)) {
            try {
                C4197a.m10408a(getActivity(), Color.parseColor(this.f12862S));
            } catch (Exception unused3) {
            }
        }
        if (this.f12858O) {
            C3865ac.m9796a((Activity) getActivity());
        }
        this.f12871aa = new C9381g(this);
        this.f12902z = ((Boolean) C4690b.f12771d.mo9431a()).booleanValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.f12873ac = arguments3.getBoolean("bundle_no_hw_acceleration", false);
            this.f12869Z = arguments3.getBoolean("bundle_enable_app_cache", false);
            this.f12875ae = arguments3.getString("url");
            if (this.f12875ae == null) {
                this.f12875ae = "";
            }
            this.f12874ad = arguments3.getString("referer");
            this.f12900x = arguments3.getBoolean("bundle_user_webview_title", true);
            String string2 = arguments3.getString("wap_headers");
            try {
                if (!C9431p.m18664a(string2)) {
                    this.f12872ab = new JSONObject(string2);
                }
            } catch (JSONException unused4) {
            }
            this.f12868Y = arguments3.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.f12873ac) {
            this.f12873ac = false;
        }
    }

    /* renamed from: a */
    public final void mo10554a(String str, Object obj) {
        this.f12854K.put(str, obj);
    }

    /* renamed from: a */
    public final void mo10525a(String str, JSONObject jSONObject) {
        if (this.f12847A != null) {
            this.f12847A.mo10483a().mo19581a(str, jSONObject);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebSettings webSettings;
        try {
            View inflate = layoutInflater.inflate(R.layout.agn, viewGroup, false);
            this.f12884h = inflate.findViewById(R.id.cfl);
            this.f12885i = inflate.findViewById(R.id.d10);
            View findViewById = inflate.findViewById(R.id.d15);
            inflate.findViewById(R.id.d4b).setVisibility(8);
            this.f12885i.findViewById(R.id.ij).setOnClickListener(this.f12877ag);
            this.f12886j = (TextView) this.f12885i.findViewById(R.id.title);
            this.f12886j.setText(this.f12878b);
            this.f12891o = (ViewGroup) inflate.findViewById(R.id.dud);
            this.f12892p = inflate.findViewById(R.id.due);
            this.f12857N = inflate.findViewById(R.id.du7);
            this.f12855L = (FrameLayout) inflate.findViewById(R.id.cre);
            int i = -1;
            this.f12855L.addView(new C4956a(getActivity()), new LayoutParams(-2, -1));
            if (!this.f12894r) {
                int i2 = VERSION.SDK_INT;
            } else {
                this.f12855L.setVisibility(8);
            }
            this.f12887k = (FullscreenVideoFrame) inflate.findViewById(R.id.a30);
            this.f12887k.setListener(new C4732m(this));
            this.f12856M = inflate.findViewById(R.id.p5);
            this.f12856M.setOnClickListener(this);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f12886j.getLayoutParams();
            marginLayoutParams.leftMargin = (int) C9432q.m18687b(getContext(), 50.0f);
            marginLayoutParams.rightMargin = (int) C9432q.m18687b(getContext(), 50.0f);
            this.f12886j.setLayoutParams(marginLayoutParams);
            this.f12886j.setSingleLine(true);
            this.f12886j.setEllipsize(TruncateAt.END);
            if (this.f12893q) {
                this.f12885i.setVisibility(8);
                findViewById.setVisibility(8);
                this.f12886j.setVisibility(8);
            }
            ((C4000aa) TTLiveSDKContext.getHostService().mo10315h().mo14533d().mo6455d().mo6447a(C4733n.f12914a).mo6448a((C2151i<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9402a(new C4734o(this));
            C4514j.m10883j().mo10322c().mo10497a((C4762a) this);
            C4705d.m11228a();
            this.f12850G = System.currentTimeMillis();
            this.f12854K.put("webview_cache", Integer.valueOf(C4514j.m10883j().mo10322c().mo10499a() ? 1 : 0));
            try {
                this.f12890n = C4514j.m10883j().mo10322c().mo10485a(getContext());
            } catch (Exception unused) {
            }
            if (this.f12890n == null) {
                return inflate;
            }
            this.f12891o.addView(this.f12890n);
            this.f12890n.setScrollBarStyle(0);
            this.f12890n.setBackgroundColor(this.f12863T);
            CookieManager.getInstance().setAcceptCookie(true);
            this.f12890n.setVerticalScrollBarEnabled(false);
            C4957b.m11447a((Context) getActivity()).mo10692a(!this.f12873ac).mo10693a(this.f12890n);
            this.f12895s = new C4724b();
            if (this.f12868Y) {
                webSettings = this.f12890n.getSettings();
                i = 2;
            } else {
                webSettings = this.f12890n.getSettings();
                if (this.f12869Z) {
                    i = 1;
                }
            }
            webSettings.setCacheMode(i);
            this.f12854K.put("page_cache", Integer.valueOf(this.f12890n.getSettings().getCacheMode()));
            this.f12847A = C4769b.m11328a(getActivity(), this.f12890n, new C4725c(null), this.f12895s);
            C10805r a = this.f12847A.mo10483a();
            C52711k.m112240b(a, "bridge");
            if (C4672a.f12740a) {
                C10863s.m22025a(a);
            }
            if (this.f12881e != null) {
                this.f12881e.mo10539a(this.f12847A);
            }
            this.f12847A.mo10483a().mo19578a("shareInfo", (C10781b) new C4735p(this));
            this.f12847A.mo10483a().mo19578a("sharePanel", (C10781b) new C4736q(this));
            this.f12847A.mo10483a().mo19578a("cancelLoading", (C10781b) new C4737r(this));
            this.f12847A.mo10483a().mo19578a("uploadPhoto", (C10781b) new C4738s(this));
            this.f12847A.mo10483a().mo19578a("uploadPicture", (C10781b) new C4739t(this));
            this.f12847A.mo10483a().mo19578a("uploadVideo", (C10781b) new C4730k(this));
            this.f12847A.mo10483a().mo19578a("upload", (C10781b) new C4731l(this));
            C4779e eVar = new C4779e(new WeakReference(this));
            this.f12847A.mo10593c().mo19585a("openHostVerify", (C10762d) new C8270b(getActivity(), null));
            this.f12847A.mo10593c().mo19585a("ttliveMonitorPage", (C10762d) eVar).mo19585a("share", (C10762d) new C4791k(new WeakReference(getContext()), this));
            this.f12852I = System.currentTimeMillis();
            if (this.f12872ab == null || this.f12872ab.length() <= 0) {
                C4581b.m11005a(this.f12875ae, this.f12890n, this.f12874ad, true);
            } else {
                HashMap hashMap = new HashMap();
                C4581b.m11008a(hashMap, (String) null, this.f12872ab);
                C4581b.m11006a(this.f12875ae, this.f12890n, (Map<String, String>) hashMap);
            }
            this.f12849F = new C4761a(this.f12870a, this.f12875ae, this.f12882f);
            this.f12849F.mo10590a(0, 0, "");
            return inflate;
        } catch (Exception e) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            C8064d.m16005b();
            C8064d.m9718a(6, e.getStackTrace());
            return new View(getContext());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        Uri uri;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        if (this.f12895s != null) {
            C4724b bVar = this.f12895s;
            if ((i3 == 2048 && bVar.f12759a != null) || bVar.f12760b != null) {
                if (i4 != 0 || !bVar.f12762d) {
                    if (intent2 == null || i4 != -1) {
                        uri = null;
                    } else {
                        uri = intent.getData();
                    }
                    if (uri == null && intent2 == null && i4 == -1) {
                        File file = new File(bVar.f12761c);
                        if (file.exists()) {
                            uri = Uri.fromFile(file);
                            bVar.mo10475a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                    if (bVar.f12759a != null) {
                        bVar.f12759a.onReceiveValue(uri);
                    }
                    if (bVar.f12760b != null) {
                        bVar.f12760b.onReceiveValue(uri == null ? null : new Uri[]{uri});
                    }
                    bVar.f12762d = false;
                    bVar.f12759a = null;
                    bVar.f12760b = null;
                } else {
                    bVar.f12762d = false;
                }
            }
        }
        if (this.f12896t != null) {
            C4865bc bcVar = this.f12896t;
            if (bcVar.f13097a != null) {
                bcVar.f13097a.mo9578a(i3, i4, intent2);
            }
        }
        if (this.f12898v != null) {
            C4869bd bdVar = this.f12898v;
            if (i3 == 40003) {
                if (i4 != -1 || intent2 == null || intent.getData() == null) {
                    bdVar.mo10633d();
                } else {
                    FragmentActivity activity = bdVar.f13110a.getActivity();
                    if (activity == null) {
                        bdVar.mo10633d();
                    } else {
                        Uri data = intent.getData();
                        String a = C4581b.m11001a((Context) activity, data);
                        if (C9431p.m18664a(a)) {
                            C9432q.m18673a((Context) activity, (int) R.drawable.bpe, (int) R.string.eyj);
                            bdVar.mo10633d();
                        } else if (!new File(a).exists()) {
                            C9432q.m18673a((Context) activity, (int) R.drawable.bpe, (int) R.string.eyj);
                            bdVar.mo10633d();
                        } else {
                            if ("file".equals(data.getScheme())) {
                                data = C4581b.m11000a((Context) activity, a);
                            }
                            bdVar.mo10630a(data, false);
                        }
                    }
                }
            } else if (i3 == 40004) {
                if (i4 == -1) {
                    try {
                        bdVar.mo10630a(bdVar.mo10631b(), true);
                    } catch (Exception e) {
                        C8064d.m16005b();
                        C8064d.m9718a(6, e.getStackTrace());
                    }
                }
            } else if (i3 == 40002) {
                if (i4 != -1) {
                    bdVar.mo10633d();
                } else {
                    FragmentActivity activity2 = bdVar.f13110a.getActivity();
                    if (activity2 == null) {
                        bdVar.mo10633d();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bdVar.f13111b);
                        sb.append("/");
                        sb.append(bdVar.mo10632c());
                        File file2 = new File(sb.toString());
                        if (!file2.exists()) {
                            C9432q.m18673a((Context) activity2, (int) R.drawable.bpe, (int) R.string.eyj);
                            bdVar.mo10633d();
                        } else if (!C4869bd.m11391a(file2.getAbsolutePath(), bdVar.f13114e.f13123c, bdVar.f13114e.f13124d)) {
                            C4581b.m11003a((Activity) activity2, bdVar.f13110a, 40003);
                        } else {
                            String absolutePath = file2.getAbsolutePath();
                            File file3 = new File(absolutePath);
                            if (!file3.exists()) {
                                bdVar.mo10633d();
                            } else if (file3.length() >= ((long) bdVar.f13114e.f13125e)) {
                                C4575an.m10987a(C3922z.m9905a((int) R.string.eo4, Integer.valueOf((bdVar.f13114e.f13125e / PreloadTask.BYTE_UNIT_NUMBER) / PreloadTask.BYTE_UNIT_NUMBER)));
                            } else {
                                if (bdVar.f13113d == null) {
                                    bdVar.f13113d = new ProgressDialog(bdVar.f13110a.getActivity());
                                    bdVar.f13113d.setMessage(C3922z.m9903a((int) R.string.eu_));
                                    bdVar.f13113d.setCancelable(false);
                                }
                                if (!bdVar.f13113d.isShowing()) {
                                    bdVar.f13113d.show();
                                }
                                MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                                multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file3));
                                C4587d dVar = (C4587d) ((UploadApi) C4514j.m10883j().mo10321b().mo9550a(UploadApi.class)).upload(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6153a((C1681ae<T, ? extends R>) new C4588e<T,Object>());
                                C4873be beVar = new C4873be(bdVar, file3);
                                C4584a aVar = new C4584a(C2150a.m6483a((C2149h<T>) new C2061q<T>(dVar.f12553a)));
                                C1745b.m6050a(beVar, "handler is null");
                                C2150a.m6480a((C1680ad<T>) new C1792ad<T>(C2150a.m6483a((C2149h<T>) new C1856y<T>(aVar.f12551a, beVar)), null)).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3011j>>(absolutePath, file3) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f13118a;

                                    /* renamed from: b */
                                    final /* synthetic */ File f13119b;

                                    public final void onSubscribe(C1690c cVar) {
                                        C4869bd.this.f13112c = cVar;
                                    }

                                    public final void onError(Throwable th) {
                                        Context context = C4869bd.this.f13110a.getContext();
                                        if (context != null) {
                                            C3844a.m9755a(context, th);
                                        }
                                        if (this.f13119b.length() > 0 || C4869bd.this.f13115f >= 10) {
                                            C4575an.m10981a((int) R.string.eyk);
                                            C4869bd.this.mo10633d();
                                        }
                                    }

                                    public final /* synthetic */ void onSuccess(Object obj) {
                                        C4177d dVar = (C4177d) obj;
                                        ((C3011j) dVar.data).f8849b = this.f13118a;
                                        C4869bd bdVar = C4869bd.this;
                                        C3011j jVar = (C3011j) dVar.data;
                                        String str = this.f13118a;
                                        bdVar.mo10629a();
                                        String str2 = jVar.f8848a;
                                        C4514j.m10883j().mo10323d().mo10332d();
                                        bdVar.finishWithResult(new C4872b(str2, C4750d.m11316a(str)));
                                    }

                                    {
                                        this.f13118a = r2;
                                        this.f13119b = r3;
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
        if (this.f12897u != null) {
            C4875bg bgVar = this.f12897u;
            if (9001 == i3 || 9002 == i3) {
                if (-1 != i4 || intent2 == null || intent.getData() == null) {
                    bgVar.mo10634a();
                } else {
                    FragmentActivity activity3 = bgVar.f13135b.getActivity();
                    if (activity3 == null) {
                        bgVar.mo10634a();
                    } else {
                        Uri data2 = intent.getData();
                        if (TextUtils.equals(C42311c.f106865i, data2.getScheme())) {
                            str2 = C3869ag.m9803a(bgVar.f13135b.getActivity(), data2);
                        } else {
                            str2 = intent.getData().getPath();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            bgVar.mo10634a();
                        } else {
                            File file4 = new File(str2);
                            if (!file4.exists()) {
                                bgVar.mo10634a();
                            } else {
                                bgVar.f13136c = ProgressDialog.show(activity3, C3922z.m9903a((int) R.string.era), C3922z.m9903a((int) R.string.er_), true, false);
                                if (!file4.exists()) {
                                    bgVar.mo10634a();
                                } else {
                                    C8302f.m16453a(bgVar.f13135b.getActivity()).mo14484a(new C8288d(file4) {

                                        /* renamed from: a */
                                        final /* synthetic */ File f13143a;

                                        /* renamed from: b */
                                        public final void mo9069b(String... strArr) {
                                        }

                                        /* renamed from: a */
                                        public final void mo9068a(String... strArr) {
                                            C4875bg bgVar = C4875bg.this;
                                            File file = this.f13143a;
                                            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                                            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
                                            ((UploadApi) C4514j.m10883j().mo10321b().mo9550a(UploadApi.class)).upload(multipartTypedOutput).mo6149a((C1686aj<? super T, ? extends R>) C4064k.m10182a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3011j>>(file.getAbsolutePath()) {

                                                /* renamed from: a */
                                                final /* synthetic */ String f13145a;

                                                public final void onSubscribe(C1690c cVar) {
                                                    C4875bg.this.f13134a = cVar;
                                                }

                                                public final void onError(Throwable th) {
                                                    if (C4875bg.this.f13135b != null) {
                                                        Context context = C4875bg.this.f13135b.getContext();
                                                        if (context != null) {
                                                            C3844a.m9755a(context, th);
                                                        }
                                                    }
                                                    C4875bg.this.mo10634a();
                                                }

                                                public final /* synthetic */ void onSuccess(Object obj) {
                                                    C4177d dVar = (C4177d) obj;
                                                    C4875bg bgVar = C4875bg.this;
                                                    C3011j jVar = (C3011j) dVar.data;
                                                    String str = this.f13145a;
                                                    if (bgVar.f13136c != null) {
                                                        bgVar.f13136c.dismiss();
                                                        bgVar.f13136c = null;
                                                    }
                                                    try {
                                                        String str2 = jVar.f8848a;
                                                        C4514j.m10883j().mo10323d().mo10332d();
                                                        C4880a aVar = new C4880a(str2, C4750d.m11316a(str));
                                                        bgVar.f13137d.mo19528a("H5_uploadVideoStatus", aVar);
                                                        bgVar.finishWithResult(aVar);
                                                    } catch (Exception unused) {
                                                    }
                                                }

                                                {
                                                    this.f13145a = r2;
                                                }
                                            });
                                        }

                                        {
                                            this.f13143a = r2;
                                        }
                                    }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f12899w != null) {
            C4921p pVar = this.f12899w;
            if (9001 == i3 || 9002 == i3) {
                if (-1 != i4) {
                    C4932b bVar2 = new C4932b(2, C3922z.m9903a((int) R.string.hp3), new C4931a());
                    pVar.finishWithResult(bVar2);
                } else if (intent2 == null || intent.getData() == null) {
                    pVar.mo10655b();
                } else {
                    FragmentActivity activity4 = pVar.f13225c.getActivity();
                    if (activity4 == null) {
                        pVar.mo10655b();
                        return;
                    }
                    Uri data3 = intent.getData();
                    if (TextUtils.equals(C42311c.f106865i, data3.getScheme())) {
                        str = C3869ag.m9803a(pVar.f13225c.getActivity(), data3);
                    } else {
                        str = intent.getData().getPath();
                    }
                    if (TextUtils.isEmpty(str)) {
                        pVar.mo10655b();
                        return;
                    }
                    File file5 = new File(str);
                    if (!file5.exists()) {
                        pVar.mo10655b();
                        return;
                    }
                    pVar.f13226d = ProgressDialog.show(activity4, C3922z.m9903a((int) R.string.era), C3922z.m9903a((int) R.string.er_), true, false);
                    if (!file5.exists()) {
                        pVar.mo10655b();
                    } else {
                        C8302f.m16453a(pVar.f13225c.getActivity()).mo14484a(new C8288d(file5) {

                            /* renamed from: a */
                            final /* synthetic */ File f13243a;

                            /* renamed from: b */
                            public final void mo9069b(String... strArr) {
                            }

                            /* renamed from: a */
                            public final void mo9068a(String... strArr) {
                                C4921p pVar = C4921p.this;
                                File file = this.f13243a;
                                String absolutePath = file.getAbsolutePath();
                                C2201v.m6601a((C2205y<T>) new C4934q<T>(pVar, absolutePath)).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C1711f<String, C2206z<C4933c>>(file) {

                                    /* renamed from: a */
                                    final /* synthetic */ File f13249a;

                                    public final /* synthetic */ Object apply(Object obj) throws Exception {
                                        return C2201v.m6601a((C2205y<T>) new C4936s<T>(this, this.f13249a, (String) obj));
                                    }

                                    {
                                        this.f13249a = r2;
                                    }
                                }).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6506a((C1710e<? super T>) new C1710e<C4933c>(absolutePath) {

                                    /* renamed from: a */
                                    final /* synthetic */ String f13245a;

                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                        C4933c cVar = (C4933c) obj;
                                        C4921p pVar = C4921p.this;
                                        C3011j jVar = (C3011j) cVar.f13262a.data;
                                        String str = this.f13245a;
                                        String str2 = cVar.f13263b;
                                        pVar.mo10653a();
                                        try {
                                            C4931a aVar = new C4931a();
                                            aVar.f13255a = jVar.f8848a;
                                            C4514j.m10883j().mo10323d().mo10332d();
                                            aVar.f13256b = C4750d.m11316a(str);
                                            C4514j.m10883j().mo10323d().mo10332d();
                                            aVar.f13257c = C4750d.m11316a(str2);
                                            C4932b bVar = new C4932b(0, C3922z.m9903a((int) R.string.hp6), aVar);
                                            pVar.f13227e.mo19528a("H5_uploadVideoStatus", bVar);
                                            pVar.finishWithResult(bVar);
                                        } catch (Exception unused) {
                                        }
                                    }

                                    {
                                        this.f13245a = r2;
                                    }
                                }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                                    public final /* synthetic */ void accept(Object obj) throws Exception {
                                        Throwable th = (Throwable) obj;
                                        if (C4921p.this.f13225c != null) {
                                            Context context = C4921p.this.f13225c.getContext();
                                            if (context != null) {
                                                C3844a.m9755a(context, th);
                                            }
                                        }
                                        C4921p.this.mo10655b();
                                    }
                                }, (C1706a) new C1706a() {
                                    /* renamed from: a */
                                    public final void mo6199a() throws Exception {
                                    }
                                });
                            }

                            {
                                this.f13243a = r2;
                            }
                        }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                }
            } else if (i3 == 40003) {
                if (-1 != i4) {
                    C4932b bVar3 = new C4932b(2, C3922z.m9903a((int) R.string.hp3), new C4931a());
                    pVar.finishWithResult(bVar3);
                } else if (intent2 == null || intent.getData() == null) {
                    pVar.mo10658e();
                } else {
                    FragmentActivity activity5 = pVar.f13225c.getActivity();
                    if (activity5 == null) {
                        pVar.mo10658e();
                        return;
                    }
                    Uri data4 = intent.getData();
                    String a2 = C4581b.m11001a((Context) activity5, data4);
                    if (C9431p.m18664a(a2)) {
                        C9432q.m18673a((Context) activity5, (int) R.drawable.bpe, (int) R.string.eyj);
                        pVar.mo10658e();
                    } else if (!new File(a2).exists()) {
                        C9432q.m18673a((Context) activity5, (int) R.drawable.bpe, (int) R.string.eyj);
                        pVar.mo10658e();
                    } else {
                        pVar.mo10654a(data4, false);
                    }
                }
            } else if (i3 == 40004) {
                if (-1 != i4) {
                    C4932b bVar4 = new C4932b(2, C3922z.m9903a((int) R.string.hp3), new C4931a());
                    pVar.finishWithResult(bVar4);
                    return;
                }
                try {
                    pVar.mo10654a(pVar.mo10656c(), true);
                } catch (Exception e2) {
                    C8064d.m16005b();
                    C8064d.m9718a(6, e2.getStackTrace());
                }
            } else if (i3 == 40002) {
                if (-1 != i4) {
                    C4932b bVar5 = new C4932b(2, C3922z.m9903a((int) R.string.hp3), new C4931a());
                    pVar.finishWithResult(bVar5);
                    return;
                }
                FragmentActivity activity6 = pVar.f13225c.getActivity();
                if (activity6 == null) {
                    pVar.mo10658e();
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pVar.f13223a);
                sb2.append("/");
                sb2.append(pVar.mo10657d());
                File file6 = new File(sb2.toString());
                if (!file6.exists()) {
                    C9432q.m18673a((Context) activity6, (int) R.drawable.bpe, (int) R.string.eyj);
                    pVar.mo10658e();
                } else if (!C4921p.m11415a(file6.getAbsolutePath(), pVar.f13230h, pVar.f13229g)) {
                    C4581b.m11003a((Activity) activity6, pVar.f13225c, 40003);
                } else {
                    String absolutePath2 = file6.getAbsolutePath();
                    File file7 = new File(absolutePath2);
                    if (!file7.exists()) {
                        pVar.mo10658e();
                    } else {
                        if (pVar.f13226d == null) {
                            pVar.f13226d = new ProgressDialog(pVar.f13225c.getActivity());
                            pVar.f13226d.setMessage(C3922z.m9903a((int) R.string.h07));
                            pVar.f13226d.setCancelable(false);
                        }
                        if (!pVar.f13226d.isShowing()) {
                            pVar.f13226d.show();
                        }
                        C1680ad.m5961a(pVar.f13231i).mo6155b(C2168a.m6521b()).mo6157b((C1711f<? super T, ? extends R>) new C4935r<Object,Object>(pVar, file7)).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<C4177d<C3011j>>(absolutePath2, file7) {

                            /* renamed from: a */
                            final /* synthetic */ String f13251a;

                            /* renamed from: b */
                            final /* synthetic */ File f13252b;

                            public final void onSubscribe(C1690c cVar) {
                                C4921p.this.f13224b = cVar;
                            }

                            public final void onError(Throwable th) {
                                Context context = C4921p.this.f13225c.getContext();
                                if (context != null) {
                                    C3844a.m9755a(context, th);
                                }
                                if (this.f13252b.length() > 0 || C4921p.this.f13228f >= 10) {
                                    C4575an.m10981a((int) R.string.eyk);
                                    C4921p.this.mo10658e();
                                }
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                C4177d dVar = (C4177d) obj;
                                ((C3011j) dVar.data).f8849b = this.f13251a;
                                C4921p pVar = C4921p.this;
                                C3011j jVar = (C3011j) dVar.data;
                                String str = this.f13251a;
                                pVar.mo10653a();
                                C4931a aVar = new C4931a();
                                aVar.f13255a = jVar.f8848a;
                                C4514j.m10883j().mo10323d().mo10332d();
                                aVar.f13257c = C4750d.m11316a(str);
                                C4932b bVar = new C4932b(0, C3922z.m9903a((int) R.string.hp6), aVar);
                                pVar.finishWithResult(bVar);
                            }

                            {
                                this.f13251a = r2;
                                this.f13252b = r3;
                            }
                        });
                    }
                }
            }
        }
    }
}

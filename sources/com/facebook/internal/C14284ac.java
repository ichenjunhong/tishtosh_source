package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.autofill.AutofillManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C2240a;
import com.example.p906a.C13482c;
import com.facebook.AccessToken;
import com.facebook.C14368j;
import com.facebook.C14457k;
import com.facebook.C14472l;
import com.facebook.C14529m;
import com.facebook.C14533n;
import com.facebook.C14696t;
import com.facebook.C14697u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.ac */
public class C14284ac extends Dialog {

    /* renamed from: k */
    private static final int f37203k = 2132607754;

    /* renamed from: m */
    private static volatile int f37204m;

    /* renamed from: a */
    public String f37205a;

    /* renamed from: b */
    public String f37206b;

    /* renamed from: c */
    public C14291c f37207c;

    /* renamed from: d */
    public WebView f37208d;

    /* renamed from: e */
    public ProgressDialog f37209e;

    /* renamed from: f */
    public ImageView f37210f;

    /* renamed from: g */
    public FrameLayout f37211g;

    /* renamed from: h */
    public boolean f37212h;

    /* renamed from: i */
    public boolean f37213i;

    /* renamed from: j */
    public boolean f37214j;

    /* renamed from: l */
    private C14292d f37215l;

    /* renamed from: n */
    private LayoutParams f37216n;

    /* renamed from: com.facebook.internal.ac$a */
    public static class C14289a {

        /* renamed from: a */
        public Context f37221a;

        /* renamed from: b */
        public String f37222b;

        /* renamed from: c */
        public int f37223c;

        /* renamed from: d */
        public C14291c f37224d;

        /* renamed from: e */
        public Bundle f37225e;

        /* renamed from: f */
        private String f37226f;

        /* renamed from: g */
        private AccessToken f37227g;

        /* renamed from: a */
        public C14284ac mo26502a() {
            if (this.f37227g != null) {
                this.f37225e.putString("app_id", this.f37227g.f35179h);
                this.f37225e.putString("access_token", this.f37227g.f35176e);
            } else {
                this.f37225e.putString("app_id", this.f37222b);
            }
            return C14284ac.m29315a(this.f37221a, this.f37226f, this.f37225e, this.f37223c, this.f37224d);
        }

        /* renamed from: a */
        public final C14289a mo26501a(C14291c cVar) {
            this.f37224d = cVar;
            return this;
        }

        /* renamed from: a */
        private void m29323a(Context context, String str, Bundle bundle) {
            this.f37221a = context;
            this.f37226f = str;
            if (bundle != null) {
                this.f37225e = bundle;
            } else {
                this.f37225e = new Bundle();
            }
        }

        public C14289a(Context context, String str, Bundle bundle) {
            this.f37227g = AccessToken.m27253a();
            if (!AccessToken.m27257b()) {
                String a = C14277aa.m29250a(context);
                if (a != null) {
                    this.f37222b = a;
                } else {
                    throw new C14457k("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m29323a(context, str, bundle);
        }

        public C14289a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = C14277aa.m29250a(context);
            }
            C14283ab.m29307a(str, "applicationId");
            this.f37222b = str;
            m29323a(context, str2, bundle);
        }
    }

    /* renamed from: com.facebook.internal.ac$b */
    class C14290b extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C13482c.m27234a(webView, renderProcessGoneDetail);
        }

        private C14290b() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C14284ac.this.f37213i) {
                C14284ac.this.f37209e.dismiss();
            }
            C14284ac.this.f37211g.setBackgroundColor(0);
            C14284ac.this.f37208d.setVisibility(0);
            C14284ac.this.f37210f.setVisibility(0);
            C14284ac.this.f37214j = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Redirect URL: "
                r6.<init>(r0)
                r6.append(r7)
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this
                java.lang.String r6 = r6.f37206b
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00a8
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this
                android.os.Bundle r6 = r6.mo26484a(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0029
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0029:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0037
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0037:
                if (r1 != 0) goto L_0x003f
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x003f:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = com.facebook.internal.C14277aa.m29276a(r2)
                r4 = -1
                if (r3 != 0) goto L_0x0051
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0051 }
                goto L_0x0052
            L_0x0051:
                r2 = -1
            L_0x0052:
                boolean r3 = com.facebook.internal.C14277aa.m29276a(r7)
                if (r3 == 0) goto L_0x0076
                boolean r3 = com.facebook.internal.C14277aa.m29276a(r1)
                if (r3 == 0) goto L_0x0076
                if (r2 != r4) goto L_0x0076
                com.facebook.internal.ac r7 = com.facebook.internal.C14284ac.this
                com.facebook.internal.ac$c r1 = r7.f37207c
                if (r1 == 0) goto L_0x00a7
                boolean r1 = r7.f37212h
                if (r1 != 0) goto L_0x00a7
                r7.f37212h = r0
                com.facebook.internal.ac$c r1 = r7.f37207c
                r2 = 0
                r1.mo26509a(r6, r2)
                r7.dismiss()
                goto L_0x00a7
            L_0x0076:
                if (r7 == 0) goto L_0x008e
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0088
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x008e
            L_0x0088:
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this
                r6.cancel()
                goto L_0x00a7
            L_0x008e:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x0098
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this
                r6.cancel()
                goto L_0x00a7
            L_0x0098:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                com.facebook.internal.ac r7 = com.facebook.internal.C14284ac.this
                com.facebook.p r2 = new com.facebook.p
                r2.<init>(r6, r1)
                r7.mo26487a(r2)
            L_0x00a7:
                return r0
            L_0x00a8:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00b6
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this
                r6.cancel()
                return r0
            L_0x00b6:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00c0
                return r1
            L_0x00c0:
                com.facebook.internal.ac r6 = com.facebook.internal.C14284ac.this     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00d5 }
                return r0
            L_0x00d5:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14284ac.C14290b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            new StringBuilder("Webview loading URL: ").append(str);
            super.onPageStarted(webView, str, bitmap);
            if (!C14284ac.this.f37213i) {
                C14284ac.this.f37209e.show();
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C14284ac.this.mo26487a((Throwable) new C14368j(null, -11, null));
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C14284ac.this.mo26487a((Throwable) new C14368j(str, i, str2));
        }
    }

    /* renamed from: com.facebook.internal.ac$c */
    public interface C14291c {
        /* renamed from: a */
        void mo26509a(Bundle bundle, C14457k kVar);
    }

    /* renamed from: com.facebook.internal.ac$d */
    class C14292d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public Exception[] f37229a;

        /* renamed from: c */
        private String f37231c;

        /* renamed from: d */
        private Bundle f37232d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            GraphRequest graphRequest;
            String[] stringArray = this.f37232d.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.f37229a = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken a = AccessToken.m27253a();
            final int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C14277aa.m29284b(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        C142931 r8 = new C13501b() {
                            /* renamed from: a */
                            public final void mo25316a(C14696t tVar) {
                                try {
                                    FacebookRequestError facebookRequestError = tVar.f38086d;
                                    if (facebookRequestError != null) {
                                        String a = facebookRequestError.mo25306a();
                                        if (a == null) {
                                            a = "Error staging photo.";
                                        }
                                        throw new C14472l(tVar, a);
                                    }
                                    JSONObject jSONObject = tVar.f38084b;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("uri");
                                        if (optString != null) {
                                            strArr[i] = optString;
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        throw new C14457k("Error staging photo.");
                                    }
                                    throw new C14457k("Error staging photo.");
                                } catch (Exception e) {
                                    C14292d.this.f37229a[i] = e;
                                }
                            }
                        };
                        if (C14277aa.m29292d(parse)) {
                            ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(parse.getPath()), 268435456), "image/png");
                            Bundle bundle = new Bundle(1);
                            bundle.putParcelable("file", parcelableResourceWithMimeType);
                            graphRequest = new GraphRequest(a, "me/staging_resources", bundle, C14697u.POST, r8);
                        } else if (C14277aa.m29288c(parse)) {
                            ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new ParcelableResourceWithMimeType(parse, "image/png");
                            Bundle bundle2 = new Bundle(1);
                            bundle2.putParcelable("file", parcelableResourceWithMimeType2);
                            graphRequest = new GraphRequest(a, "me/staging_resources", bundle2, C14697u.POST, r8);
                        } else {
                            throw new C14457k("The image Uri must be either a file:// or content:// Uri");
                        }
                        concurrentLinkedQueue.add(graphRequest.mo25314b());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Exception[] excArr;
            String[] strArr = (String[]) obj;
            C14284ac.this.f37209e.dismiss();
            for (Exception exc : this.f37229a) {
                if (exc != null) {
                    C14284ac.this.mo26487a((Throwable) exc);
                    return;
                }
            }
            if (strArr == null) {
                C14284ac.this.mo26487a((Throwable) new C14457k("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                C14284ac.this.mo26487a((Throwable) new C14457k("Failed to stage photos for web dialog"));
                return;
            }
            C14277aa.m29274a(this.f37232d, "media", (Object) new JSONArray(asList));
            String a = C14366y.m29468a();
            StringBuilder sb = new StringBuilder();
            sb.append(C14533n.m29774h());
            sb.append("/dialog/");
            sb.append(this.f37231c);
            C14284ac.this.f37205a = C14277aa.m29246a(a, sb.toString(), this.f37232d).toString();
            C14284ac.this.mo26486a((C14284ac.this.f37210f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        C14292d(String str, Bundle bundle) {
            this.f37231c = str;
            this.f37232d = bundle;
        }
    }

    /* renamed from: b */
    private static int m29317b() {
        C14283ab.m29303a();
        return f37204m;
    }

    public void onDetachedFromWindow() {
        this.f37213i = true;
        super.onDetachedFromWindow();
    }

    public void cancel() {
        if (this.f37207c != null && !this.f37212h) {
            mo26487a((Throwable) new C14529m());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f37215l != null) {
            this.f37215l.cancel(true);
            this.f37209e.dismiss();
        }
        super.onStop();
    }

    public void dismiss() {
        if (this.f37208d != null) {
            this.f37208d.stopLoading();
        }
        if (!this.f37213i && this.f37209e != null && this.f37209e.isShowing()) {
            this.f37209e.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f37215l == null || this.f37215l.getStatus() != Status.PENDING) {
            mo26485a();
            return;
        }
        this.f37215l.execute(new Void[0]);
        this.f37209e.show();
    }

    public void onAttachedToWindow() {
        boolean z = false;
        this.f37213i = false;
        Context context = getContext();
        if (VERSION.SDK_INT >= 26) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
                z = true;
            }
        }
        if (z && this.f37216n != null && this.f37216n.token == null) {
            this.f37216n.token = getOwnerActivity().getWindow().getAttributes().token;
            new StringBuilder("Set token on onAttachedToWindow(): ").append(this.f37216n.token);
        }
        super.onAttachedToWindow();
    }

    /* renamed from: a */
    public final void mo26485a() {
        int i;
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i = displayMetrics.widthPixels;
        } else {
            i = displayMetrics.heightPixels;
        }
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = displayMetrics.widthPixels;
        }
        getWindow().setLayout(Math.min(m29314a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m29314a(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* renamed from: b */
    private static void m29318b(int i) {
        if (i == 0) {
            i = f37203k;
        }
        f37204m = i;
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f37216n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo26484a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c = C14277aa.m29286c(parse.getQuery());
        c.putAll(C14277aa.m29286c(parse.getFragment()));
        return c;
    }

    /* renamed from: a */
    protected static void m29316a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo a = C14294ad.m29329a(context.getPackageManager(), context.getPackageName(), 128);
                if (!(a == null || a.metaData == null || f37204m != 0)) {
                    m29318b(a.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37209e = new ProgressDialog(getContext());
        this.f37209e.requestWindowFeature(1);
        this.f37209e.setMessage(getContext().getString(R.string.a6d));
        this.f37209e.setCanceledOnTouchOutside(false);
        this.f37209e.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                C14284ac.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f37211g = new FrameLayout(getContext());
        mo26485a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        this.f37210f = new ImageView(getContext());
        this.f37210f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C14284ac.this.cancel();
            }
        });
        this.f37210f.setImageDrawable(getContext().getResources().getDrawable(2131952663));
        this.f37210f.setVisibility(4);
        if (this.f37205a != null) {
            mo26486a((this.f37210f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f37211g.addView(this.f37210f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f37211g);
    }

    /* renamed from: a */
    public final void mo26486a(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f37208d = new WebView(getContext()) {
            public final void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f37208d.setVerticalScrollBarEnabled(false);
        this.f37208d.setHorizontalScrollBarEnabled(false);
        this.f37208d.setWebViewClient(C13482c.m27232a(new C14290b()));
        this.f37208d.getSettings().setJavaScriptEnabled(true);
        C14294ad.m29330a(this.f37208d, this.f37205a);
        this.f37208d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f37208d.setVisibility(4);
        this.f37208d.getSettings().setSavePassword(false);
        this.f37208d.getSettings().setSaveFormData(false);
        this.f37208d.setFocusable(true);
        this.f37208d.setFocusableInTouchMode(true);
        this.f37208d.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f37208d);
        linearLayout.setBackgroundColor(-872415232);
        this.f37211g.addView(linearLayout);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26487a(Throwable th) {
        C14457k kVar;
        if (this.f37207c != null && !this.f37212h) {
            this.f37212h = true;
            if (th instanceof C14457k) {
                kVar = (C14457k) th;
            } else {
                kVar = new C14457k(th);
            }
            this.f37207c.mo26509a(null, kVar);
            dismiss();
        }
    }

    protected C14284ac(Context context, String str) {
        this(context, str, m29317b());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    private C14284ac(Context context, String str, int i) {
        if (i == 0) {
            i = m29317b();
        }
        super(context, i);
        this.f37206b = "fbconnect://success";
        this.f37212h = false;
        this.f37213i = false;
        this.f37214j = false;
        this.f37205a = str;
    }

    /* renamed from: a */
    private static int m29314a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* renamed from: a */
    public static C14284ac m29315a(Context context, String str, Bundle bundle, int i, C14291c cVar) {
        m29316a(context);
        C14284ac acVar = new C14284ac(context, str, bundle, i, cVar);
        return acVar;
    }

    private C14284ac(Context context, String str, Bundle bundle, int i, C14291c cVar) {
        String str2;
        if (i == 0) {
            i = m29317b();
        }
        super(context, i);
        this.f37206b = "fbconnect://success";
        this.f37212h = false;
        this.f37213i = false;
        this.f37214j = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C14277aa.m29291d(context)) {
            str2 = "fbconnect://chrome_os_success";
        } else {
            str2 = "fbconnect://success";
        }
        this.f37206b = str2;
        bundle.putString("redirect_uri", this.f37206b);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C14533n.m29777k());
        bundle.putString("sdk", C2240a.m6773a(Locale.ROOT, "android-%s", new Object[]{C14533n.m29775i()}));
        this.f37207c = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String a = C14366y.m29468a();
            StringBuilder sb = new StringBuilder();
            sb.append(C14533n.m29774h());
            sb.append("/dialog/");
            sb.append(str);
            this.f37205a = C14277aa.m29246a(a, sb.toString(), bundle).toString();
            return;
        }
        this.f37215l = new C14292d(str, bundle);
    }
}

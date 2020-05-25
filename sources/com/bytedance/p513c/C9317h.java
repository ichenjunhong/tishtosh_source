package com.bytedance.p513c;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.p513c.p515b.C9292b;
import com.bytedance.p513c.p517d.C9308f;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.c.h */
final class C9317h extends Dialog {

    /* renamed from: A */
    private OnDismissListener f25499A;

    /* renamed from: B */
    private C9314e f25500B = new C9314e() {
        /* renamed from: b */
        public final void mo16922b() {
            C9317h.this.mo16927b();
        }

        /* renamed from: a */
        public final void mo16918a() {
            C9317h.this.f25506f = true;
            C9328j.m18487a().mo16941a(7, null);
            int i = C9317h.this.f25513m;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - C9302d.f25473a);
                jSONObject.put("type", i);
                C9302d.m18449a(C9302d.m18446a("turing_verify_webview_success", jSONObject).toString());
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo16919a(int i, int i2) {
            C9317h.this.mo16925a(i, i2, false);
        }

        /* renamed from: a */
        public final void mo16920a(int i, String str) {
            C9317h.this.f25506f = false;
            if (!C9317h.this.f25508h) {
                C9317h.this.f25510j = C9317h.this.f25504d.getResources().getString(R.string.gef, new Object[]{Integer.valueOf(i)});
                C9317h.this.mo16925a(300, 304, true);
            }
            int i2 = C9317h.this.f25513m;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - C9302d.f25473a);
                jSONObject.put("type", i2);
                jSONObject.put("code", i);
                if (str != null) {
                    jSONObject.put("msg", str);
                }
                C9302d.m18449a(C9302d.m18446a("turing_verify_webview_fail", jSONObject).toString());
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo16921a(int i, String str, String str2, String str3, String str4) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = C9317h.this.f25505e;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - C9302d.f25473a);
                jSONObject.put("mode", str);
                jSONObject.put("challenge_code", i2);
                jSONObject.put("result", i);
                C9302d.m18449a(C9302d.m18446a("turing_verify_result", jSONObject).toString());
            } catch (JSONException unused) {
            }
            if (C9317h.this.f25509i && C9317h.this.f25511k != null) {
                if (z) {
                    C9317h.this.f25511k.mo16880a(i, str3, str4);
                } else {
                    C9317h.this.f25511k.mo16879a(i);
                }
                C9317h.this.f25511k = null;
            }
            C9317h.this.f25507g = true;
            C9317h.this.dismiss();
        }
    };

    /* renamed from: a */
    public C9332k f25501a;

    /* renamed from: b */
    public ViewGroup f25502b;

    /* renamed from: c */
    public TextView f25503c;

    /* renamed from: d */
    Application f25504d;

    /* renamed from: e */
    public int f25505e = -1;

    /* renamed from: f */
    public boolean f25506f;

    /* renamed from: g */
    public boolean f25507g;

    /* renamed from: h */
    public boolean f25508h;

    /* renamed from: i */
    public boolean f25509i = true;

    /* renamed from: j */
    public String f25510j;

    /* renamed from: k */
    public C9289b f25511k;

    /* renamed from: l */
    public String f25512l = "app_close";

    /* renamed from: m */
    public int f25513m;

    /* renamed from: n */
    private ViewGroup f25514n;

    /* renamed from: o */
    private C9308f f25515o;

    /* renamed from: p */
    private Button f25516p;

    /* renamed from: q */
    private Button f25517q;

    /* renamed from: r */
    private LayoutParams f25518r;

    /* renamed from: s */
    private int f25519s = 300;

    /* renamed from: t */
    private int f25520t = 331;

    /* renamed from: u */
    private double f25521u = 0.5d;

    /* renamed from: v */
    private boolean f25522v;

    /* renamed from: w */
    private boolean f25523w = true;

    /* renamed from: x */
    private boolean f25524x;

    /* renamed from: y */
    private String f25525y;

    /* renamed from: z */
    private C9316g f25526z = new C9316g();

    /* renamed from: com.bytedance.c.h$a */
    class C9326a implements C9289b {
        /* renamed from: a */
        public final void mo16879a(int i) {
        }

        /* renamed from: a */
        public final void mo16880a(int i, String str, String str2) {
        }

        private C9326a() {
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
    }

    public final void onDetachedFromWindow() {
        this.f25523w = false;
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    public final synchronized void mo16927b() {
        if (this.f25504d != null || this.f25515o != null) {
            if (this.f25501a != null) {
                getWindow().getDecorView().post(new Runnable() {

                    /* renamed from: b */
                    private WebView f25531b = C9317h.this.f25501a;

                    public final void run() {
                        this.f25531b.stopLoading();
                        WebView webView = this.f25531b;
                        String str = QuickShopBusiness.f64351b;
                        C18984e.m46161a(str);
                        webView.loadUrl(str);
                        this.f25531b.clearCache(true);
                        this.f25531b.clearHistory();
                        ViewParent parent = this.f25531b.getParent();
                        if (parent != null && (parent instanceof ViewGroup)) {
                            ((ViewGroup) parent).removeView(this.f25531b);
                        }
                        this.f25531b.destroy();
                    }
                });
                this.f25501a = null;
            }
            this.f25504d = null;
            C9308f fVar = this.f25515o;
            fVar.f25484a = null;
            fVar.f25485b.f25491a.clear();
            this.f25515o = null;
            if (isShowing() && this.f25523w) {
                getWindow().getDecorView().post(new Runnable() {
                    public final void run() {
                        try {
                            C9317h.super.dismiss();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                });
            }
            C9282a a = C9282a.m18401a();
            if (a.f25386d == this) {
                a.f25386d = null;
            }
            C9328j.m18487a().mo16941a(5, null);
        }
    }

    /* renamed from: a */
    public final void mo16924a() {
        int i;
        int i2;
        if (this.f25519s <= 0 || this.f25520t <= 0) {
            i2 = this.f25519s;
            i = this.f25520t;
        } else {
            DisplayMetrics displayMetrics = this.f25504d.getResources().getDisplayMetrics();
            i2 = (int) ((displayMetrics.density * ((float) (this.f25519s + 0))) + 0.5f);
            i = (int) ((displayMetrics.density * ((float) (this.f25520t + 0))) + 0.5f);
            if (C9315f.m18472a()) {
                Application application = this.f25504d;
                StringBuilder sb = new StringBuilder("density = ");
                sb.append(displayMetrics.density);
                sb.append(", width = ");
                sb.append(i2);
                C9327i.m18486a(Toast.makeText(application, sb.toString(), 1));
                StringBuilder sb2 = new StringBuilder("density = ");
                sb2.append(displayMetrics.density);
                sb2.append(", width = ");
                sb2.append(i2);
            }
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = i2;
        attributes.height = i;
        attributes.gravity = 17;
        attributes.dimAmount = (float) this.f25521u;
        try {
            getWindow().setAttributes(attributes);
        } catch (IllegalArgumentException unused) {
        }
        if (this.f25518r == null) {
            this.f25518r = this.f25501a.getLayoutParams();
            if (this.f25518r != null) {
                this.f25518r.width = -1;
                this.f25518r.height = -1;
                this.f25501a.setLayoutParams(this.f25518r);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r1.equals("turing_verify_close_fb_feedback") != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dismiss() {
        /*
            r9 = this;
            boolean r0 = r9.f25508h
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r9.f25508h = r0
            android.content.DialogInterface$OnDismissListener r1 = r9.f25499A
            if (r1 == 0) goto L_0x0011
            android.content.DialogInterface$OnDismissListener r1 = r9.f25499A
            r1.onDismiss(r9)
        L_0x0011:
            com.bytedance.c.j r1 = com.bytedance.p513c.C9328j.m18487a()
            r2 = 8
            r3 = 10000(0x2710, double:4.9407E-320)
            r1.mo16942a(r2, r9, r3)
            android.view.Window r1 = r9.getWindow()
            android.view.View r1 = r1.getDecorView()
            com.bytedance.c.h$5 r2 = new com.bytedance.c.h$5
            r2.<init>()
            r1.post(r2)
            boolean r1 = r9.f25509i
            r2 = 0
            r3 = 3
            if (r1 == 0) goto L_0x0041
            com.bytedance.c.b r1 = r9.f25511k
            if (r1 == 0) goto L_0x0041
            boolean r1 = r9.f25506f
            if (r1 != 0) goto L_0x0041
            com.bytedance.c.b r1 = r9.f25511k
            r1.mo16879a(r3)
            r9.f25511k = r2
        L_0x0041:
            boolean r1 = r9.f25507g
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = r9.f25512l
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "style"
            r4.put(r5, r1)     // Catch:{ JSONException -> 0x0051 }
        L_0x0051:
            java.lang.String r1 = "bytedcert.goToClose"
            java.lang.String r5 = "call"
            java.lang.String r6 = "bytedcert.goToClose"
            java.lang.String r1 = com.bytedance.p513c.p517d.C9313i.m18464a(r0, r1, r5, r4, r6)
            r9.mo16926a(r1)
        L_0x005e:
            boolean r1 = r9.f25506f
            if (r1 != 0) goto L_0x00ca
            java.lang.String r1 = r9.f25512l
            r4 = -1
            int r5 = r1.hashCode()
            r6 = -847116780(0xffffffffcd820614, float:-2.72679552E8)
            if (r5 == r6) goto L_0x009b
            r6 = -512393751(0xffffffffe1757de9, float:-2.8303282E20)
            if (r5 == r6) goto L_0x0092
            r0 = -27038896(0xfffffffffe636b50, float:-7.557299E37)
            if (r5 == r0) goto L_0x0088
            r0 = -20623981(0xfffffffffec54d93, float:-1.3113035E38)
            if (r5 == r0) goto L_0x007e
            goto L_0x00a5
        L_0x007e:
            java.lang.String r0 = "turing_verify_close_fb_system"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 3
            goto L_0x00a6
        L_0x0088:
            java.lang.String r0 = "turing_verify_close_fb_mask"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 2
            goto L_0x00a6
        L_0x0092:
            java.lang.String r3 = "turing_verify_close_fb_feedback"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x009b:
            java.lang.String r0 = "turing_verify_close_fb_close"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 0
            goto L_0x00a6
        L_0x00a5:
            r0 = -1
        L_0x00a6:
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00aa;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00aa;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00c7
        L_0x00aa:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r3 = "duration"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00c7 }
            long r6 = com.bytedance.p513c.C9302d.f25473a     // Catch:{ JSONException -> 0x00c7 }
            r8 = 0
            long r4 = r4 - r6
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x00c7 }
            org.json.JSONObject r0 = com.bytedance.p513c.C9302d.m18446a(r1, r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.p513c.C9302d.m18449a(r0)
        L_0x00c7:
            r9.mo16927b()
        L_0x00ca:
            com.bytedance.c.j r0 = com.bytedance.p513c.C9328j.m18487a()
            r1 = 11
            r0.mo16941a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p513c.C9317h.dismiss():void");
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f25499A = onDismissListener;
    }

    /* renamed from: a */
    public final boolean mo16926a(String str) {
        if (this.f25501a == null || this.f25515o == null) {
            return false;
        }
        this.f25515o.mo16913a(str);
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25526z.mo16923a(false, motionEvent);
        if (this.f25522v) {
            if (this.f25502b.getVisibility() == 0) {
                this.f25512l = "turing_verify_close_fb_mask";
            } else {
                this.f25512l = "mask_click_close";
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25514n = (ViewGroup) LayoutInflater.from(this.f25504d).inflate(R.layout.bkn, null);
        setContentView(this.f25514n);
        this.f25502b = (ViewGroup) findViewById(R.id.f79);
        this.f25503c = (TextView) findViewById(R.id.ezp);
        this.f25516p = (Button) findViewById(R.id.e0m);
        this.f25517q = (Button) findViewById(R.id.e0n);
        this.f25501a = new C9332k(this.f25504d);
        this.f25514n.addView(this.f25501a);
        C93181 r7 = new OnClickListener() {
            public final void onClick(View view) {
                int id = view.getId();
                if (id == R.id.e0n) {
                    C9317h.this.f25512l = "turing_verify_close_fb_close";
                } else if (id == R.id.e0m) {
                    C9317h.this.f25512l = "turing_verify_close_fb_feedback";
                }
                C9317h.this.dismiss();
            }
        };
        this.f25516p.setOnClickListener(r7);
        this.f25517q.setOnClickListener(r7);
        this.f25518r = this.f25501a.getLayoutParams();
        if (this.f25518r != null) {
            this.f25518r.width = -1;
            this.f25518r.height = -1;
            this.f25501a.setLayoutParams(this.f25518r);
        }
        this.f25501a.setCallback(this.f25500B);
        C9332k kVar = this.f25501a;
        boolean z = this.f25524x;
        WebSettings settings = kVar.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        if (z && VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        kVar.setOverScrollMode(2);
        kVar.setScrollContainer(false);
        kVar.setHorizontalScrollBarEnabled(false);
        kVar.setVerticalScrollBarEnabled(false);
        if (C9315f.m18472a()) {
            kVar.setWebChromeClient(kVar.f25545d);
        }
        kVar.setWebViewClient(C13482c.m27232a(kVar.f25546e));
        mo16924a();
        setCanceledOnTouchOutside(this.f25522v);
        setCancelable(true);
        new StringBuilder("loadUrl = ").append(this.f25525y);
        this.f25515o = new C9308f(this.f25500B, this.f25501a);
        this.f25501a.loadUrl(this.f25525y);
    }

    /* renamed from: a */
    public final void mo16925a(int i, int i2, final boolean z) {
        if (i != this.f25519s || i2 != this.f25520t) {
            this.f25519s = i;
            this.f25520t = i2;
            if (!this.f25508h && isShowing()) {
                getWindow().getDecorView().post(new Runnable() {
                    public final void run() {
                        if (!C9317h.this.f25508h) {
                            C9317h.this.mo16924a();
                            if (z) {
                                C9317h.this.f25502b.setVisibility(0);
                                C9317h.this.f25503c.setText(C9317h.this.f25510j);
                                C9317h.this.f25501a.setVisibility(8);
                            }
                        }
                    }
                });
            }
        }
    }

    C9317h(Activity activity, int i, boolean z, String str, C9289b bVar) {
        super(activity, R.style.a1v);
        this.f25513m = i;
        this.f25524x = z;
        this.f25525y = str;
        this.f25511k = bVar;
        if (this.f25511k == null) {
            this.f25511k = new C9326a();
        }
        C9296c cVar = C9282a.m18401a().f25384b;
        if (cVar != null) {
            this.f25504d = (Application) cVar.f25441q;
            this.f25522v = cVar.f25448x;
            if (this.f25513m == 2) {
                this.f25505e = cVar.f25446v;
            }
        }
        if (this.f25513m == 2) {
            this.f25519s = C9292b.f25407f;
            this.f25520t = C9292b.f25408g;
            this.f25521u = C9292b.f25409h;
        } else if (this.f25513m == 1) {
            this.f25519s = -1;
            this.f25520t = -1;
        }
        setOnShowListener(new OnShowListener() {
            public final void onShow(DialogInterface dialogInterface) {
            }
        });
        setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                int action = keyEvent.getAction();
                if (keyCode == 4 && action == 1) {
                    if (C9317h.this.f25502b.getVisibility() == 0) {
                        C9317h.this.f25512l = "turing_verify_close_fb_system";
                    } else if (C9317h.this.f25501a == null || !C9317h.this.f25501a.canGoBack()) {
                        C9317h.this.f25512l = "back_close";
                    } else {
                        C9317h.this.f25501a.goBack();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}

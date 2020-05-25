package com.bytedance.android.livesdk.browser.p290d;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.browser.C3806b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.jsbridge.C4769b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4843at;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4904k;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.p299a.C4774a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p290d.C4720h.C4723a;
import com.bytedance.android.livesdk.browser.p290d.C4720h.C4726d;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4568ah;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.d.w */
public class C4742w extends C4104a implements C4723a, C4726d, C4762a {

    /* renamed from: A */
    private int f12923A;

    /* renamed from: B */
    private C3806b f12924B;

    /* renamed from: C */
    private String f12925C;

    /* renamed from: D */
    private boolean f12926D = true;

    /* renamed from: E */
    private Map<String, C10782e> f12927E = new HashMap();

    /* renamed from: e */
    private View f12928e;

    /* renamed from: f */
    int f12929f;

    /* renamed from: g */
    int f12930g;

    /* renamed from: h */
    int f12931h;

    /* renamed from: i */
    int f12932i;

    /* renamed from: j */
    int f12933j;

    /* renamed from: k */
    C4720h f12934k;

    /* renamed from: l */
    private View f12935l;

    /* renamed from: m */
    private View f12936m;

    /* renamed from: n */
    private String f12937n;

    /* renamed from: o */
    private int f12938o;

    /* renamed from: p */
    private int f12939p;

    /* renamed from: q */
    private int f12940q;

    /* renamed from: r */
    private int f12941r;

    /* renamed from: s */
    private String f12942s;

    /* renamed from: t */
    private boolean f12943t;

    /* renamed from: u */
    private long f12944u;

    /* renamed from: v */
    private long f12945v;

    /* renamed from: w */
    private boolean f12946w;

    /* renamed from: x */
    private boolean f12947x;

    /* renamed from: y */
    private boolean f12948y;

    /* renamed from: z */
    private boolean f12949z;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo10545d() {
        return R.layout.agh;
    }

    /* renamed from: a */
    public final void mo10525a(String str, JSONObject jSONObject) {
        if (this.f12934k != null) {
            this.f12934k.mo10525a(str, jSONObject);
        }
    }

    /* renamed from: f */
    private boolean m11297f() {
        if (this.f12938o == 0 && this.f12939p == 0) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        C4514j.m10883j().mo10322c().mo10502b((C0649f) this);
    }

    /* renamed from: b */
    public final void mo10541b() {
        this.f12945v = System.currentTimeMillis();
        this.f12943t = false;
        if (this.f11294b) {
            this.f12928e.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo10582e() {
        if (this.f12934k == null || this.f12934k.f12890n == null) {
            return "";
        }
        return this.f12934k.f12890n.getUrl();
    }

    /* renamed from: c */
    public void mo10542c() {
        if (this.f11294b) {
            if (this.f12943t || (this.f12934k.f12890n != null && TextUtils.equals(this.f12934k.f12890n.getUrl(), QuickShopBusiness.f64351b))) {
                this.f12928e.setVisibility(0);
            } else {
                this.f12928e.setVisibility(8);
            }
            if (this.f12946w) {
                if (this.f12929f > 0) {
                    mo10580b(this.f12929f);
                    return;
                }
                mo10578a(this.f12930g, this.f12931h, this.f12932i, this.f12933j);
            }
        }
    }

    /* renamed from: a */
    public final void mo10538a(int i) {
        this.f12943t = true;
    }

    /* renamed from: a */
    public static C4742w m11292a(C4700b bVar) {
        C4742w wVar = new C4742w();
        wVar.mo10581b(bVar);
        return wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo10580b(int i) {
        if (this.f12934k != null && this.f12934k.f12890n != null) {
            WebView webView = this.f12934k.f12890n;
            if (webView instanceof RoundRectWebView) {
                ((RoundRectWebView) webView).setRadius((float) C3922z.m9899a((float) i));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10581b(C4700b bVar) {
        this.f12937n = bVar.f12793a;
        this.f12938o = bVar.f12794b;
        this.f12939p = bVar.f12795c;
        this.f12940q = bVar.f12802j;
        this.f12929f = bVar.f12797e;
        this.f12941r = bVar.f12796d;
        this.f12930g = bVar.f12798f;
        this.f12931h = bVar.f12799g;
        this.f12933j = bVar.f12800h;
        this.f12932i = bVar.f12801i;
        this.f12942s = bVar.f12804l;
        this.f12946w = bVar.f12806n;
        this.f12924B = bVar.f12810r;
        this.f12947x = bVar.f12807o;
        this.f12948y = bVar.f12808p;
        this.f12949z = bVar.f12809q;
        this.f12923A = bVar.f12803k;
        this.f12925C = bVar.f12811s;
        this.f12926D = bVar.f12812t;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getDialog() != null) {
            m11294a(getDialog(), this.f12938o, this.f12939p, this.f12940q);
            if (this.f12929f != 0) {
                mo10580b(this.f12929f);
            } else {
                mo10578a(this.f12930g, this.f12931h, this.f12933j, this.f12932i);
            }
            Window window = getDialog().getWindow();
            if (window != null) {
                window.setLayout(C3922z.m9899a((float) this.f12938o), C3922z.m9899a((float) this.f12939p));
                if (m11297f()) {
                    window.addFlags(32);
                    window.getAttributes().dimAmount = 0.0f;
                }
                window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(this.f12926D);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            LayoutParams attributes = window.getAttributes();
            if (C3922z.m9901a() == null || C3922z.m9901a().getConfiguration().orientation != 2) {
                attributes.windowAnimations = R.style.zy;
            } else {
                attributes.windowAnimations = R.style.zx;
            }
            window.setAttributes(attributes);
            if (!this.f12949z) {
                window.setDimAmount(0.0f);
            }
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    private void m11296a(boolean z) {
        setCancelable(z);
        getDialog().setCanceledOnTouchOutside(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.y_);
        if (getActivity().getRequestedOrientation() == 0) {
            if (!this.f12947x) {
                this.f12941r = 8;
                this.f12929f = 8;
                this.f12939p = (int) C3922z.m9914e(C3922z.m9908b() - (this.f12941r * 2));
                this.f12938o = 300;
            }
            if (!this.f12948y) {
                this.f12940q = 8388693;
            }
        }
        if (this.f12938o <= 0) {
            this.f12938o = 300;
        }
        if (!TextUtils.isEmpty(this.f12937n)) {
            Uri parse = Uri.parse(this.f12937n);
            if (parse != null) {
                int b = C4568ah.m10970b(parse.getQueryParameter("height"));
                if (b > 0) {
                    this.f12939p = b;
                }
            }
        }
        if (getActivity().getRequestedOrientation() == 0 && ((float) this.f12939p) > C3922z.m9914e(C3922z.m9908b())) {
            this.f12939p = (int) C3922z.m9914e(C3922z.m9908b() - (this.f12941r * 2));
        }
        if (this.f12940q == 80 && ((float) this.f12939p) > C3922z.m9914e((int) (((float) C3922z.m9908b()) * 0.85f))) {
            this.f12939p = (int) C3922z.m9914e((int) (((float) C3922z.m9908b()) * 0.85f));
        }
        if (this.f12939p <= 0) {
            this.f12939p = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        if (this.f12946w) {
            this.f12939p += 48;
        }
        if (this.f12929f < 0) {
            this.f12929f = 0;
        }
        if (this.f12930g < 0) {
            this.f12930g = 0;
        }
        if (this.f12931h < 0) {
            this.f12931h = 0;
        }
        if (this.f12933j < 0) {
            this.f12933j = 0;
        }
        if (this.f12932i < 0) {
            this.f12932i = 0;
        }
        C4514j.m10883j().mo10322c().mo10491a((C0649f) this);
    }

    /* renamed from: a */
    public final void mo10539a(C4769b bVar) {
        bVar.mo10483a().mo19579a("close", (C10782e<?, ?>) new C4904k<Object,Object>((C0649f) this));
        bVar.mo10483a().mo19579a("setHotsoon", (C10782e<?, ?>) new C4843at<Object,Object>(this));
        bVar.mo10483a().mo19579a("setLive", (C10782e<?, ?>) new C4843at<Object,Object>(this));
        bVar.mo10593c().mo19585a("open_live", (C10762d) new C4774a(new WeakReference(getActivity()), this));
        if (this.f12927E != null) {
            for (String str : this.f12927E.keySet()) {
                bVar.mo10483a().mo19579a(str, (C10782e) this.f12927E.get(str));
            }
        }
    }

    /* renamed from: a */
    private void m11293a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12935l.getLayoutParams();
        layoutParams.width = C3922z.m9899a((float) i);
        layoutParams.height = C3922z.m9899a((float) i2);
        this.f12935l.setLayoutParams(layoutParams);
        this.f12935l.requestLayout();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MarginLayoutParams marginLayoutParams;
        this.f12944u = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(mo10545d(), viewGroup, false);
        this.f12928e = inflate.findViewById(R.id.cbv);
        this.f12935l = inflate.findViewById(R.id.du5);
        this.f12936m = inflate.findViewById(R.id.ayk);
        if (m11297f() || !this.f12926D) {
            getDialog().hide();
        } else {
            m11296a(true);
        }
        ViewGroup.LayoutParams layoutParams = this.f12935l.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            marginLayoutParams = (MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(C3922z.m9899a((float) this.f12941r), C3922z.m9899a((float) this.f12941r), C3922z.m9899a((float) this.f12941r), C3922z.m9899a((float) this.f12941r));
        this.f12935l.setLayoutParams(marginLayoutParams);
        C4720h hVar = new C4720h();
        hVar.f12870a = this.f12942s;
        hVar.f12881e = this;
        hVar.f12882f = this.f12924B;
        hVar.mo10553a(this.f12925C);
        this.f12934k = hVar;
        C4720h hVar2 = this.f12934k;
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", this.f12937n);
        bundle2.putBoolean("bundle_user_webview_title", false);
        bundle2.putBoolean("hide_nav_bar", true);
        if (this.f12923A != -1) {
            bundle2.putInt("bundle_web_view_background_color", this.f12923A);
        }
        hVar2.setArguments(bundle2);
        C0679r a = getChildFragmentManager().mo2225a();
        a.mo2191b(R.id.du5, this.f12934k);
        a.mo2195c();
        this.f12934k.f12879c = this;
        this.f12928e.setOnClickListener(new C4743x(this));
        inflate.post(new C4744y(this));
        if (this.f12946w) {
            this.f12936m.setVisibility(0);
            this.f12936m.setOnClickListener(new C4745z(this));
        }
        return inflate;
    }

    /* renamed from: a */
    private void m11294a(Dialog dialog, int i, int i2, int i3) {
        m11295a(dialog, i, i2, i3, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10578a(int i, int i2, int i3, int i4) {
        if (this.f12934k != null && this.f12934k.f12890n != null) {
            WebView webView = this.f12934k.f12890n;
            if (webView instanceof RoundRectWebView) {
                ((RoundRectWebView) webView).setRadius((float) C3922z.m9899a((float) i), (float) C3922z.m9899a((float) i2), (float) C3922z.m9899a((float) i3), (float) C3922z.m9899a((float) i4));
            }
        }
    }

    /* renamed from: a */
    private void m11295a(Dialog dialog, int i, int i2, int i3, boolean z) {
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = i3;
                attributes.width = C3922z.m9899a((float) i);
                attributes.height = C3922z.m9899a((float) i2);
                window.setAttributes(attributes);
                m11293a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo10579a(String str, int i, int i2, int i3, int i4) {
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().show();
            Window window = getDialog().getWindow();
            if (window != null) {
                window.clearFlags(32);
                window.getAttributes().dimAmount = 0.6f;
            }
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, mo10582e())) {
                mo10580b(i3);
                FragmentActivity activity = getActivity();
                boolean z = true;
                if (activity != null && activity.getRequestedOrientation() == 1) {
                    if (this.f12946w) {
                        i2 += 48;
                    }
                    m11294a(getDialog(), i, i2, this.f12940q);
                }
                if (i4 != 1) {
                    z = false;
                }
                m11296a(z);
            }
        }
    }
}

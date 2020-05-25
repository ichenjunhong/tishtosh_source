package com.bytedance.android.livesdk.browser.p290d;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3847a;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p234c.C3887a;
import com.bytedance.android.live.core.p230g.p234c.C3888b;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.browser.jsbridge.C4762a;
import com.bytedance.android.livesdk.browser.jsbridge.C4769b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4904k;
import com.bytedance.android.livesdk.browser.p290d.C4720h.C4723a;
import com.bytedance.android.livesdk.browser.p290d.C4720h.C4726d;
import com.bytedance.android.livesdk.browser.p290d.C4720h.C4727e;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.d.a */
public final class C4712a extends C4104a implements C4723a, C4726d, C4727e, C4762a {

    /* renamed from: e */
    protected View f12824e;

    /* renamed from: f */
    String f12825f;

    /* renamed from: g */
    private TextView f12826g;

    /* renamed from: h */
    private TextView f12827h;

    /* renamed from: i */
    private String f12828i;

    /* renamed from: j */
    private String f12829j;

    /* renamed from: k */
    private C4720h f12830k;

    /* renamed from: l */
    private long f12831l;

    /* renamed from: m */
    private long f12832m;

    /* renamed from: com.bytedance.android.livesdk.browser.d.a$a */
    public static class C4713a {

        /* renamed from: a */
        public String f12833a;

        /* renamed from: b */
        public String f12834b;

        /* renamed from: c */
        public String f12835c;

        /* renamed from: d */
        public boolean f12836d;

        public C4713a(String str) {
            this.f12833a = str;
        }
    }

    /* renamed from: a */
    public final void mo10538a(int i) {
    }

    /* renamed from: c */
    public final void mo10542c() {
    }

    /* renamed from: b */
    public final void mo10541b() {
        this.f12832m = System.currentTimeMillis();
    }

    public final void onStart() {
        Window window;
        boolean z;
        int i;
        super.onStart();
        if (getDialog() != null) {
            window = getDialog().getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
            }
        }
        Dialog dialog = getDialog();
        View findViewById = getView().findViewById(R.id.ada);
        boolean z2 = true;
        if (VERSION.SDK_INT >= 23) {
            if (!(dialog == null || dialog.getWindow() == null)) {
                int a = C3865ac.m9795a(dialog.getContext());
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = a;
                findViewById.setLayoutParams(layoutParams);
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    if (C3888b.m112779b()) {
                        int a2 = C3888b.m9829a();
                        if (a2 > 0 && a2 < 9) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        C3887a.m9825b(window2);
                    } else {
                        C3887a.m9823a(window2);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        window2.clearFlags(201326592);
                        int systemUiVisibility = window2.getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER | UnReadVideoExperiment.BROWSE_RECORD_LIST;
                        if (z2) {
                            i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
                        } else {
                            i = systemUiVisibility & -8193;
                        }
                        window2.getDecorView().setSystemUiVisibility(i);
                        window2.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                        window2.setStatusBarColor(0);
                    } else if (VERSION.SDK_INT >= 19) {
                        window2.addFlags(67108864);
                    }
                }
            }
        } else if (!(dialog == null || dialog.getWindow() == null)) {
            if (C3888b.f10899c) {
                if (VERSION.SDK_INT >= 21) {
                    Window window3 = dialog.getWindow();
                    window3.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                    window3.setStatusBarColor(C3922z.m9909b((int) R.color.abm));
                }
                C3887a.m9823a(dialog.getWindow());
            }
            if (dialog.getOwnerActivity() == null || dialog.getOwnerActivity().getWindow() == null) {
                z = false;
            } else {
                z = C3887a.m9828c(dialog.getOwnerActivity().getWindow());
            }
            if (!z && !C3887a.m9828c(dialog.getWindow())) {
                z2 = false;
            }
            if (z2) {
                int a3 = C3865ac.m9795a(findViewById.getContext());
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                layoutParams2.height = a3;
                findViewById.setLayoutParams(layoutParams2);
            }
        }
        View findViewById2 = getDialog().getWindow().findViewById(16908290);
        if (VERSION.SDK_INT >= 19) {
            new C3847a(findViewById2);
        }
    }

    /* renamed from: a */
    public final void mo10539a(C4769b bVar) {
        bVar.mo10483a().mo19579a("close", (C10782e<?, ?>) new C4904k<Object,Object>((C0649f) this));
    }

    /* renamed from: a */
    public final void mo10540a(String str) {
        this.f12829j = str;
        if (this.f12827h != null) {
            this.f12827h.setText(str);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.yu);
        this.f12828i = getArguments().getString("key_url");
        this.f12825f = getArguments().getString("key_from_type", "");
        this.f12829j = getArguments().getString("key_title", "");
        if (TextUtils.isEmpty(this.f12829j)) {
            this.f12829j = C3922z.m9903a((int) R.string.f1m);
        }
    }

    /* renamed from: a */
    public final void mo10525a(String str, JSONObject jSONObject) {
        if (this.f12830k != null) {
            this.f12830k.mo10525a(str, jSONObject);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setWindowAnimations(R.style.yu);
        this.f12831l = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ago, viewGroup, false);
        this.f12826g = (TextView) inflate.findViewById(R.id.ij);
        this.f12827h = (TextView) inflate.findViewById(R.id.title);
        this.f12824e = inflate.findViewById(R.id.d10);
        C4720h hVar = new C4720h();
        hVar.f12870a = this.f12825f;
        hVar.f12881e = this;
        hVar.f12880d = this;
        this.f12830k = hVar;
        C4720h hVar2 = this.f12830k;
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", this.f12828i);
        bundle2.putBoolean("bundle_user_webview_title", true);
        bundle2.putBoolean("hide_nav_bar", true);
        hVar2.setArguments(bundle2);
        C0679r a = getChildFragmentManager().mo2225a();
        a.mo2191b(R.id.n0, this.f12830k);
        a.mo2195c();
        this.f12830k.f12879c = this;
        this.f12826g.setOnClickListener(new C4714b(this));
        this.f12827h.setText(this.f12829j);
        if (!getArguments().getBoolean("key_with_title_bar", true)) {
            this.f12824e.setVisibility(8);
        }
        return inflate;
    }
}

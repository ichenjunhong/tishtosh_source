package com.p683ss.android.ugc.aweme.update;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.content.C0732g;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.update.n */
public final class C47532n extends Dialog implements C9382a {

    /* renamed from: a */
    public UpdateHelper f119917a;

    /* renamed from: b */
    public Handler f119918b;

    /* renamed from: c */
    private TextView f119919c;

    /* renamed from: d */
    private TextView f119920d;

    /* renamed from: e */
    private TextView f119921e;

    /* renamed from: f */
    private View f119922f;

    /* renamed from: g */
    private View f119923g;

    /* renamed from: h */
    private View f119924h;

    /* renamed from: i */
    private TextView f119925i;

    /* renamed from: j */
    private TextView f119926j;

    /* renamed from: k */
    private View f119927k;

    /* renamed from: l */
    private TextView f119928l;

    /* renamed from: m */
    private boolean f119929m;

    /* renamed from: n */
    private String f119930n = "upgrade_pop";

    /* renamed from: o */
    private String f119931o;

    /* renamed from: p */
    private final OnClickListener f119932p = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            view.setSelected(!view.isSelected());
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.update.n$a */
    class C47536a extends Thread {

        /* renamed from: a */
        C47513b f119942a = new C47513b();

        /* renamed from: b */
        volatile boolean f119943b = false;

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                if (!C47532n.this.f119917a.mo94800g()) {
                    break;
                }
                C47532n.this.f119917a.mo94792a(this.f119942a);
                Message obtainMessage = C47532n.this.f119918b.obtainMessage(1);
                obtainMessage.obj = this.f119942a;
                synchronized (this) {
                    if (!this.f119943b) {
                        C47532n.this.f119918b.sendMessage(obtainMessage);
                    }
                }
            }
            if (!this.f119943b) {
                C47532n.this.f119918b.sendEmptyMessage(2);
            }
        }

        C47536a() {
        }
    }

    /* renamed from: a */
    private void m102963a() {
        final boolean z;
        final boolean z2;
        int i;
        final UpdateHelper a = UpdateHelper.m102902a();
        this.f119917a = a;
        if (a != null) {
            if (a.mo94811r() != null) {
                z = true;
            } else {
                z = false;
            }
            boolean q = a.mo94810q();
            if (!a.mo94803j() || !this.f119929m) {
                z2 = false;
            } else {
                z2 = true;
            }
            String a2 = UpdateHelper.m102903a(a.mo94799f());
            if (!TextUtils.isEmpty(a2) && a2.charAt(a2.length() - 1) == 10) {
                a2 = a2.substring(0, a2.length() - 1);
            }
            String k = a.mo94804k();
            String l = a.mo94805l();
            int i2 = R.string.bvb;
            int i3 = R.string.bvd;
            if (z2) {
                if (z) {
                    i2 = R.string.bvc;
                } else {
                    i2 = R.string.bve;
                }
                i3 = R.string.bva;
            }
            if (z) {
                a2 = k;
            }
            this.f119919c.setText(l);
            TextView textView = this.f119920d;
            if (q) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f119921e.setText(a2);
            this.f119925i.setText(i2);
            this.f119926j.setText(i3);
            this.f119925i.setVisibility(0);
            this.f119922f.setVisibility(8);
            this.f119925i.setEnabled(true);
            this.f119926j.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (z2 && z) {
                        C47532n.this.onEvent("forcible_downloaded_refuse");
                    } else if (z2 && !z) {
                        C47532n.this.onEvent("forcible_refuse");
                    } else if (z) {
                        C47532n.this.onEvent("downloaded_refuse");
                    } else {
                        C47532n.this.onEvent("refuse");
                    }
                    if (z2) {
                        C0732g.m2130a(C47532n.this.getContext()).mo2404a(new Intent("com.ss.android.common.app.action.exit_app"));
                    }
                    UpdateHelper updateHelper = a;
                    if (updateHelper.f119838R != null) {
                        updateHelper.f119838R.mo94823b();
                    }
                    if (!z2 && !z) {
                        C47532n.this.mo94838a(a);
                    }
                    C47512a.m102941a(false);
                    C47532n.this.dismiss();
                    a.mo94793a("update", "cancel");
                }
            });
            this.f119925i.setEnabled(true);
            this.f119925i.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C47512a.m102941a(true);
                    if (z2 && z) {
                        C47532n.this.onEvent("forcible_downloaded_accept");
                    } else if (z2 && !z) {
                        C47532n.this.onEvent("forcible_accept");
                    } else if (z) {
                        C47532n.this.onEvent("downloaded_accept");
                    } else {
                        C47532n.this.onEvent("accept");
                    }
                    a.mo94795b();
                    File r = a.mo94811r();
                    if (r != null) {
                        a.mo94796c();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.addFlags(1);
                        intent.setDataAndType(C19547d.m47838a(C47532n.this.getContext(), r), "application/vnd.android.package-archive");
                        intent.addFlags(268435456);
                        C47532n.this.getContext().startActivity(intent);
                    } else {
                        a.mo94815w();
                        if (z2) {
                            new C47536a().start();
                        }
                    }
                    if (!z2 && !z) {
                        C47532n.this.mo94838a(a);
                        C10691a.m21548c(C47532n.this.getContext(), (int) R.string.f7l).mo19066a();
                    }
                    if (!z2) {
                        C47532n.this.dismiss();
                    }
                    a.mo94793a("update", "confirm");
                }
            });
            if (!z2 && !z) {
                a.mo94813u();
                if (a.mo94808o()) {
                    this.f119927k.setSelected(true);
                } else {
                    this.f119927k.setSelected(false);
                }
                if (a.mo94807n()) {
                    this.f119928l.setText(a.mo94809p());
                    this.f119927k.setVisibility(0);
                } else {
                    this.f119927k.setVisibility(8);
                }
                this.f119927k.setOnClickListener(this.f119932p);
            }
        }
    }

    public final void onEvent(String str) {
        if (getContext() != null) {
            C18898c.m46009a(getContext(), this.f119930n, str);
        }
    }

    /* renamed from: a */
    public final void mo94838a(UpdateHelper updateHelper) {
        if (updateHelper != null) {
            if (!this.f119927k.isSelected()) {
                updateHelper.mo94814v();
            } else if (TextUtils.isEmpty(updateHelper.f119824D) || TextUtils.isEmpty(updateHelper.f119822B)) {
                updateHelper.mo94814v();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("label", "detail_ad");
                    jSONObject.put("ext_json", null);
                } catch (Exception unused) {
                }
                String str = "android.permission.WRITE_EXTERNAL_STORAGE";
                if (updateHelper.f119844e != null) {
                    int a = C0726c.m2090a(updateHelper.f119844e, str);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        C47513b bVar;
        switch (message.what) {
            case 1:
                if (message.obj == null || !(message.obj instanceof C47513b)) {
                    bVar = new C47513b();
                } else {
                    bVar = (C47513b) message.obj;
                }
                long j = bVar.f119891a;
                long j2 = bVar.f119892b;
                int i = 0;
                this.f119925i.setEnabled(false);
                this.f119922f.setVisibility(0);
                if (j > 0) {
                    i = 5;
                }
                if (j2 > 0) {
                    i = (int) ((j * 100) / j2);
                    if (i > 99) {
                        i = 99;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("%");
                sb.append(this.f119931o);
                this.f119925i.setText(sb.toString());
                this.f119922f.getLayoutParams().width = (int) ((((float) i) * ((float) this.f119923g.getWidth())) / 100.0f);
                this.f119922f.requestLayout();
                break;
            case 2:
                m102963a();
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        boolean z2 = true;
        requestWindowFeature(1);
        setContentView(R.layout.abo);
        Window window = getWindow();
        LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = C10641a.f28183h;
        window.addFlags(2);
        window.setBackgroundDrawableResource(R.drawable.dhm);
        window.setGravity(17);
        window.setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f119918b = new C9381g(this);
        this.f119924h = findViewById(R.id.cfc);
        this.f119919c = (TextView) findViewById(R.id.d1k);
        this.f119920d = (TextView) findViewById(R.id.a8e);
        this.f119921e = (TextView) findViewById(R.id.a4m);
        this.f119922f = findViewById(R.id.dln);
        this.f119925i = (TextView) findViewById(R.id.dlj);
        this.f119926j = (TextView) findViewById(R.id.b6o);
        this.f119923g = findViewById(R.id.a6j);
        this.f119927k = findViewById(R.id.kx);
        this.f119928l = (TextView) findViewById(R.id.aow);
        if (UpdateHelper.m102902a().mo94811r() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!UpdateHelper.m102902a().mo94803j() || !this.f119929m) {
            z2 = false;
        }
        if (z2 && z) {
            onEvent("forcible_downloaded_show");
        } else if (z2) {
            onEvent("forcible_show");
        } else if (z) {
            onEvent("downloaded_show");
        } else {
            onEvent("show");
        }
        m102963a();
        C32458a.m75141a(4, "UpdateDialog", "dialog shown");
    }

    public C47532n(Context context, boolean z) {
        super(context);
        this.f119929m = z;
        this.f119931o = context.getString(R.string.bvf);
    }
}

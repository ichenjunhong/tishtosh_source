package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.p1382aq.C23202ai;
import com.p683ss.android.ugc.aweme.p1382aq.C23203aj;
import com.p683ss.android.ugc.aweme.qrcode.C40938b;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40990o;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40990o.C40996a;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.qrcode.view.QRCodeCardView;
import com.p683ss.android.ugc.aweme.qrcode.view.QRCodeCardView.C41046a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2 */
public class QRCodeActivityV2 extends AmeSSActivity implements OnClickListener, C40996a {

    /* renamed from: a */
    C40952c f104263a;

    /* renamed from: b */
    public QRCodeCardView f104264b;

    /* renamed from: c */
    public C41047a f104265c;

    /* renamed from: d */
    public C41029a f104266d;

    /* renamed from: e */
    public boolean f104267e;

    /* renamed from: f */
    private TextView f104268f;

    /* renamed from: g */
    private TextView f104269g;

    /* renamed from: h */
    private FrameLayout f104270h;

    /* renamed from: i */
    private View f104271i;

    /* renamed from: j */
    private TextTitleBar f104272j;

    /* renamed from: k */
    private C40990o f104273k;

    /* renamed from: l */
    private TextView f104274l;

    /* renamed from: m */
    private List<Aweme> f104275m;

    /* renamed from: a */
    public final View mo83487a() {
        return this.f104264b;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo83504c() {
        if (this.f104265c != null && this.f104265c.isShowing()) {
            this.f104265c.dismiss();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C31187c.m72821a(this.f104275m);
        C40990o oVar = this.f104273k;
        oVar.f104247a = null;
        oVar.f104248b = null;
        mo83504c();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: b */
    public final void mo83489b() {
        if (this.f104265c != null && !this.f104265c.isShowing()) {
            this.f104265c.show();
            this.f104265c.mo83562a();
        }
        C23203aj ajVar = new C23203aj();
        ajVar.f61707a = this.f104263a.enterFrom;
        ajVar.f61708b = C31483a.f82385b;
        ajVar.f61709c = "shaped";
        ajVar.mo48076e();
    }

    /* renamed from: a */
    public final void mo83488a(String str) {
        if (!isFinishing()) {
            mo83504c();
            C10691a.m21533a((Context) this, (int) R.string.d_h).mo19066a();
            this.f104268f.announceForAccessibility(getString(R.string.d_h));
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(Uri.fromFile(file));
                sendBroadcast(intent);
            }
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ay9) {
            finish();
            return;
        }
        if (id == R.id.df9) {
            if (this.f104266d != null) {
                z2 = this.f104266d.f104365f;
            } else {
                z2 = this.f104264b.f104365f;
            }
            if (z2) {
                C40990o oVar = this.f104273k;
                if (C0726c.m2090a((Context) oVar.f104248b, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    oVar.mo83481a();
                } else {
                    oVar.mo83482b();
                }
            } else {
                C10691a.m21551c((Context) AwemeApplication.m56199a(), getString(R.string.asv)).mo19066a();
                view.announceForAccessibility(getString(R.string.asv));
            }
        } else if (id == R.id.df_) {
            C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "qr_code_detail").mo47829a("previous_page", this.f104263a.enterFrom).f61491a);
            if (this.f104263a.type == 4) {
                z = true;
            } else {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - QRCodePermissionActivity.f104129c >= 1000) {
                QRCodePermissionActivity.f104129c = currentTimeMillis;
                Intent intent = new Intent(this, QRCodePermissionActivity.class);
                intent.putExtra("finishAfterScan", false);
                intent.putExtra("enter_from", z);
                startActivity(intent);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        QRCodeCardView qRCodeCardView;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dq);
        Intent intent = getIntent();
        if (intent != null) {
            this.f104263a = (C40952c) intent.getSerializableExtra("extra_params");
        }
        this.f104275m = C31187c.m72822b();
        this.f104271i = findViewById(R.id.z0);
        this.f104272j = (TextTitleBar) findViewById(R.id.d10);
        this.f104274l = (TextView) findViewById(R.id.ch8);
        this.f104268f = (TextView) findViewById(R.id.df9);
        this.f104269g = (TextView) findViewById(R.id.df_);
        this.f104270h = (FrameLayout) findViewById(R.id.c7i);
        this.f104268f.setOnClickListener(this);
        this.f104269g.setOnClickListener(this);
        this.f104272j.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                QRCodeActivityV2.this.finish();
            }
        });
        this.f104272j.getBackBtn().setContentDescription(getString(R.string.pc));
        TextTitleBar textTitleBar = this.f104272j;
        if (this.f104263a == null) {
            str = getString(C40938b.m90528a(0, "", null));
        } else {
            str = getString(C40938b.m90528a(this.f104263a.type, this.f104263a.objectId, this.f104263a.enterFrom));
        }
        textTitleBar.setTitle((CharSequence) str);
        int c = C9432q.m18692c(this, (float) C9432q.m18688b(this));
        if (c < 660) {
            float f = ((float) c) / 667.0f;
            this.f104270h.setScaleX(f);
            this.f104270h.setScaleY(f);
            float f2 = ((1.0f - f) * 400.0f) / 2.0f;
            float f3 = (32.0f * f) - f2;
            LayoutParams layoutParams = (LayoutParams) this.f104270h.getLayoutParams();
            layoutParams.topMargin = (int) C9432q.m18687b((Context) this, f3);
            this.f104270h.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = (LayoutParams) this.f104274l.getLayoutParams();
            layoutParams2.topMargin = (int) C9432q.m18687b((Context) this, 16.0f - f2);
            this.f104274l.setLayoutParams(layoutParams2);
        }
        if (this.f104263a == null || this.f104263a.type != 4) {
            qRCodeCardView = new QRCodeCardViewV2(this);
        } else {
            qRCodeCardView = new C41041m(this);
        }
        this.f104264b = qRCodeCardView;
        this.f104270h.addView(this.f104264b);
        if (this.f104265c == null) {
            this.f104265c = C41047a.m90709a(this, getResources().getString(R.string.d2k));
            this.f104265c.setIndeterminate(false);
            this.f104265c.getWindow().addFlags(32);
        }
        this.f104264b.setOnBindQrCodeListener(new C41046a() {
            /* renamed from: b */
            public final void mo83508b() {
                if (!QRCodeActivityV2.this.f104267e && QRCodeActivityV2.this.f104265c != null && QRCodeActivityV2.this.f104265c.isShowing()) {
                    QRCodeActivityV2.this.f104265c.dismiss();
                }
            }

            /* renamed from: c */
            public final void mo83509c() {
                QRCodeActivityV2.this.f104267e = true;
                if (QRCodeActivityV2.this.f104266d != null) {
                    QRCodeActivityV2.this.f104266d.setParams(QRCodeActivityV2.this.f104263a);
                }
                QRCodeActivityV2.this.mo83504c();
            }

            /* renamed from: a */
            public final void mo83507a() {
                C23202ai aiVar = new C23202ai();
                aiVar.f61705a = QRCodeActivityV2.this.f104263a.enterFrom;
                aiVar.f61706b = "shaped";
                aiVar.mo48076e();
                if (QRCodeActivityV2.this.f104266d != null) {
                    QRCodeActivityV2.this.f104266d.setParams(QRCodeActivityV2.this.f104263a);
                    QRCodeActivityV2.this.f104266d.setOnBindQrCodeListener(new C41046a() {
                        /* renamed from: b */
                        public final void mo83508b() {
                        }

                        /* renamed from: c */
                        public final void mo83509c() {
                        }

                        /* renamed from: a */
                        public final void mo83507a() {
                            QRCodeActivityV2.this.mo83504c();
                        }
                    });
                    if (QRCodeActivityV2.this.f104264b instanceof QRCodeCardViewV2) {
                        QRCodeActivityV2.this.f104266d.mo83462a(((QRCodeCardViewV2) QRCodeActivityV2.this.f104264b).getQrCodeInfo());
                    }
                } else {
                    QRCodeActivityV2.this.mo83504c();
                }
            }
        });
        this.f104264b.setData(this.f104263a);
        this.f104271i.setBackgroundColor(getResources().getColor(R.color.a0i));
        this.f104272j.setBackgroundColor(getResources().getColor(R.color.a3i));
        this.f104268f.setTextColor(getResources().getColor(R.color.a2a));
        this.f104269g.setTextColor(getResources().getColor(R.color.a2a));
        this.f104264b.setQRCodeCardTitleColor(getResources().getColor(R.color.ji));
        this.f104264b.setQRCodeCardSubtitleColor(getResources().getColor(R.color.jl));
        if (this.f104266d != null) {
            this.f104266d.setQRCodeCardTitleColor(getResources().getColor(R.color.ji));
            this.f104266d.setQRCodeCardSubtitleColor(getResources().getColor(R.color.jl));
        }
        this.f104273k = new C40990o(this, this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public static void m90640a(Context context, C40952c cVar) {
        Intent intent = new Intent(context, QRCodeActivityV2.class);
        intent.putExtra("extra_params", cVar);
        context.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C40990o oVar = this.f104273k;
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    oVar.mo83482b();
                    return;
                }
            }
            oVar.mo83481a();
        }
    }
}

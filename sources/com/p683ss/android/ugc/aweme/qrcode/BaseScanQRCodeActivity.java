package com.p683ss.android.ugc.aweme.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.facebook.Profile;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.commercialize.PoiCouponInputActivity;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.QRCodeActivityV2;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.BaseScanQRCodeActivity */
public abstract class BaseScanQRCodeActivity extends AmeSSActivity implements OnClickListener {

    /* renamed from: a */
    protected TextView f104123a;

    /* renamed from: b */
    protected TextTitleBar f104124b;

    /* renamed from: c */
    protected C41047a f104125c;

    /* renamed from: d */
    protected View f104126d;

    /* renamed from: e */
    protected boolean f104127e;

    /* renamed from: f */
    public int f104128f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo83399a(Bundle bundle) {
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo83398a() {
        this.f104123a = (TextView) findViewById(R.id.dcm);
        this.f104124b = (TextTitleBar) findViewById(R.id.d10);
        this.f104124b.getBackBtn().setImageResource(R.drawable.afk);
        this.f104126d = findViewById(R.id.csm);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo83400b() {
        User curUser = C20902b.m53242a().getCurUser();
        String o = C47915gg.m103666o(curUser);
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle(Profile.f35248a)) {
            o = C47915gg.m103656e(curUser);
        }
        QRCodeActivityV2.m90640a(this, new C40954a().mo83446a(4, C47915gg.m103665n(curUser), "scan").mo83449a(o, C47915gg.m103667p(curUser), C47915gg.m103661j(curUser)).f104177a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.dx);
        this.f104127e = getIntent().getBooleanExtra("enter_from", false);
        this.f104128f = getIntent().getIntExtra("scan_page_from", 0);
        mo83398a();
        mo83399a(bundle);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.dcm && !C32800a.m75679a(view)) {
            if (this.f104128f == 3) {
                Intent intent = new Intent(this, PoiCouponInputActivity.class);
                intent.putExtra("from_page", 1);
                startActivity(intent);
            } else if (!C20902b.m53242a().isLogin()) {
                C27965f.m66721a((Activity) this, "scan", "click_my_qr", (Bundle) null, (C23505g) new C40921a(this));
            } else if (this.f104127e) {
                finish();
            } else {
                mo83400b();
            }
        }
    }
}

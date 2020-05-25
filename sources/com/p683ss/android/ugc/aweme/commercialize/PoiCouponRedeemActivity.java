package com.p683ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25638a;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25639b;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.PoiCouponRedeemActivity */
public class PoiCouponRedeemActivity extends AmeActivity {

    /* renamed from: a */
    String f67729a;

    /* renamed from: b */
    String f67730b;

    /* renamed from: c */
    private boolean f67731c;

    /* renamed from: d */
    private C25639b f67732d;

    /* renamed from: e */
    private C25638a f67733e;

    public void onPause() {
        super.onPause();
        if (this.f67731c) {
            mo52726a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo52726a() {
        if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f67732d = (C25639b) getIntent().getSerializableExtra("coupon");
        this.f67729a = getIntent().getStringExtra("code");
        this.f67730b = getIntent().getStringExtra("action_type");
        this.f67731c = TextUtils.equals(this.f67730b, "scan");
        if (this.f67732d == null || this.f67732d.statusCode != 0 || this.f67732d.coupon == null) {
            View view = new View(this);
            view.setLayoutParams(new LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            setContentView(view);
            if (this.f67732d != null && !TextUtils.isEmpty(this.f67732d.statusMsg)) {
                C10691a.m21545b(getApplicationContext(), this.f67732d.statusMsg).mo19066a();
            }
            if (this.f67731c) {
                new Handler().postDelayed(new C26150o(this), 700);
            } else {
                mo52726a();
            }
        } else {
            this.f67733e = this.f67732d.coupon;
            setContentView((int) R.layout.dc);
            m62121a((int) R.id.anl, this.f67733e.headImage);
            m62121a((int) R.id.hi, this.f67733e.avatar);
            m62122a((int) R.id.title, this.f67733e.title);
            m62122a((int) R.id.bla, this.f67733e.merchantName);
            m62122a((int) R.id.do0, this.f67733e.username);
            m62120a((int) R.id.q7, (OnClickListener) new C26151p(this));
            m62120a((int) R.id.yn, (OnClickListener) new C26197q(this));
            C47795d.m103429a(findViewById(R.id.yn));
            C47795d.m103429a(findViewById(R.id.q7));
        }
    }

    /* renamed from: a */
    private void m62120a(int i, OnClickListener onClickListener) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    private void m62121a(int i, UrlModel urlModel) {
        if (urlModel != null) {
            RemoteImageView remoteImageView = (RemoteImageView) findViewById(i);
            if (remoteImageView != null) {
                C23515d.m57669a(remoteImageView, urlModel);
            }
        }
    }

    /* renamed from: a */
    private void m62122a(int i, String str) {
        if (str != null) {
            TextView textView = (TextView) findViewById(i);
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    /* renamed from: a */
    public static void m62123a(Context context, String str, C25639b bVar, String str2) {
        if (context != null && bVar != null) {
            Intent intent = new Intent(context, PoiCouponRedeemActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("code", str);
            intent.putExtra("coupon", bVar);
            intent.putExtra("action_type", str2);
            context.startActivity(intent);
        }
    }
}

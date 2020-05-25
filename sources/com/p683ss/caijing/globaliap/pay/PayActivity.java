package com.p683ss.caijing.globaliap.pay;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import com.p683ss.base.mvp.C51161a;
import com.p683ss.base.mvp.MvpActivity;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import com.p683ss.caijing.globaliap.p2564g.C51285a;
import com.p683ss.caijing.globaliap.p2565h.C51286a;
import com.p683ss.caijing.globaliap.pay.C51288a.C51289a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.caijing.globaliap.pay.PayActivity */
public class PayActivity extends MvpActivity implements C51289a {

    /* renamed from: a */
    private C51286a f128053a;

    /* renamed from: b */
    private boolean f128054b;

    /* renamed from: c */
    private String f128055c;

    /* renamed from: com.ss.caijing.globaliap.pay.PayActivity$a */
    class C51287a implements OnCancelListener {
        private C51287a() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
            PayActivity.this.mo101805d();
        }

        /* synthetic */ C51287a(PayActivity payActivity, byte b) {
            this();
        }
    }

    public void onBackPressed() {
        mo101805d();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        C51285a.m110261a(true);
    }

    /* renamed from: b */
    public final C51161a mo101694b() {
        C51290b bVar = new C51290b(C51289a.class);
        bVar.f128057e = new WeakReference<>(this);
        return bVar;
    }

    /* renamed from: c */
    public final void mo101804c() {
        this.f128054b = true;
        this.f128053a.setCancelable(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo101805d() {
        if (!this.f128054b) {
            mo101803a(C51294e.m110282a());
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f128053a.dismiss();
    }

    public void onResume() {
        super.onResume();
        C51285a.m110261a(false);
        this.f128053a.show();
    }

    /* renamed from: a */
    public final void mo101676a() {
        setContentView(R.layout.acf);
        this.f128053a = new C51286a(this);
        this.f128053a.setOnCancelListener(new C51287a(this, 0));
        this.f128055c = getIntent().getStringExtra("processId");
    }

    /* renamed from: a */
    public final void mo101803a(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("pay_result_extra");
            if (bundle2 != null) {
                String b = C51292c.m110281b(this.f128055c, "app_id", "");
                int i = bundle2.getInt("pay_result_detail_code");
                String string = bundle2.getString("pay_result_msg");
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", b);
                hashMap.put("detailCode", Integer.valueOf(i).toString());
                hashMap.put("detailMsg", string);
                C51284c.m110260a("caijing_iap_pay_activity_result", hashMap);
            }
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }
}

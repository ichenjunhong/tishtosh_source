package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.customtabs.C0374c;
import android.support.customtabs.C0374c.C0375a;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.content.C0732g;
import com.facebook.internal.C14311e;

public class CustomTabMainActivity extends Activity {

    /* renamed from: a */
    public static final String f35186a;

    /* renamed from: b */
    public static final String f35187b;

    /* renamed from: c */
    public static final String f35188c;

    /* renamed from: d */
    public static final String f35189d;

    /* renamed from: e */
    private boolean f35190e = true;

    /* renamed from: f */
    private BroadcastReceiver f35191f;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f35190e) {
            m27260a(0, null);
        }
        this.f35190e = true;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        f35186a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        f35187b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        f35188c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        f35189d = sb4.toString();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f35189d.equals(intent.getAction())) {
            C0732g.m2130a((Context) this).mo2404a(new Intent(CustomTabActivity.f35183b));
            m27260a(-1, intent);
            return;
        }
        if (CustomTabActivity.f35182a.equals(intent.getAction())) {
            m27260a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f35182a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f35186a);
            String stringExtra = getIntent().getStringExtra(f35187b);
            C14311e eVar = new C14311e("oauth", bundleExtra);
            C0374c a = new C0375a().mo865a();
            a.f1250a.setPackage(stringExtra);
            a.f1250a.addFlags(1073741824);
            a.f1250a.setData(eVar.f37253a);
            C0726c.m2094a((Context) this, a.f1250a, a.f1251b);
            this.f35190e = false;
            this.f35191f = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.f35189d);
                    intent2.putExtra(CustomTabMainActivity.f35188c, intent.getStringExtra(CustomTabMainActivity.f35188c));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            C0732g.m2130a((Context) this).mo2403a(this.f35191f, new IntentFilter(CustomTabActivity.f35182a));
        }
    }

    /* renamed from: a */
    private void m27260a(int i, Intent intent) {
        C0732g.m2130a((Context) this).mo2402a(this.f35191f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}

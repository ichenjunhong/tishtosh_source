package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;

public class CustomTabActivity extends Activity {

    /* renamed from: a */
    public static final String f35182a;

    /* renamed from: b */
    public static final String f35183b;

    /* renamed from: c */
    private BroadcastReceiver f35184c;

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0732g.m2130a((Context) this).mo2402a(this.f35184c);
        super.onDestroy();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        f35182a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        f35183b = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f35182a);
        intent.putExtra(CustomTabMainActivity.f35188c, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f35182a);
            intent2.putExtra(CustomTabMainActivity.f35188c, getIntent().getDataString());
            C0732g.m2130a((Context) this).mo2404a(intent2);
            this.f35184c = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C0732g.m2130a((Context) this).mo2403a(this.f35184c, new IntentFilter(f35183b));
        }
    }
}

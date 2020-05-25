package com.p683ss.base.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.MvpActivity */
public abstract class MvpActivity extends Activity implements C51163b, C51164c {

    /* renamed from: a */
    private String f127784a;

    /* renamed from: b */
    private Map<String, C51161a> f127785b = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo101676a();

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C51161a c = mo101804c();
        if (c != null) {
            c.mo101690b();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C51161a c = mo101804c();
        if (c != null) {
            c.mo101689a((C51164c) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C51161a c = mo101804c();
        if (c != null) {
            c.mo101685a();
        }
    }

    /* renamed from: c */
    private C51161a mo101804c() {
        C51161a aVar = (C51161a) this.f127785b.get(this.f127784a);
        if (aVar != null) {
            return aVar;
        }
        C51161a b = mo101694b();
        this.f127785b.put(this.f127784a, b);
        return b;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!isChangingConfigurations()) {
            for (C51161a c : this.f127785b.values()) {
                c.mo101691c();
            }
            this.f127785b.clear();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C51161a c = mo101804c();
        if (c != null) {
            Bundle bundle2 = new Bundle();
            c.mo101688a(bundle2);
            bundle.putBundle("KEY_SAVE_PRESENTER_DATA", bundle2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f127784a = UUID.randomUUID().toString();
        } else {
            this.f127784a = bundle.getString("SAVE_VIEW_UUID");
        }
        mo101676a();
        C51161a c = mo101804c();
        if (c != null) {
            Bundle bundle2 = null;
            if (bundle != null) {
                bundle2 = bundle.getBundle("KEY_SAVE_PRESENTER_DATA");
            }
            c.mo101687a((Context) this, getIntent().getExtras(), bundle2);
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        C51161a c = mo101804c();
        if (c != null) {
            c.mo101688a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (mo101804c() != null) {
            if (intent == null) {
                intent = new Intent();
            }
            mo101804c().mo101686a(i, i2, intent.getExtras());
        }
    }
}

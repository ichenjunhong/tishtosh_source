package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.ads.C16222ru;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.caa;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.p1027a.C14886d;
import com.p683ss.android.ugc.aweme.lancet.C18968a;

public class AdActivity extends Activity {

    /* renamed from: a */
    private C16222ru f38426a;

    /* renamed from: a */
    public final void mo27256a(int i) {
        super.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public final void mo27257a(Bundle bundle) {
        super.onCreate(bundle);
        caa caa = new caa(caf.m37097b(), this);
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = getIntent();
        boolean z = false;
        if (!intent.hasExtra(str)) {
            afc.m32794c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra(str, false);
        }
        this.f38426a = (C16222ru) caa.mo30891a(this, z);
        if (this.f38426a == null) {
            afc.m32797d("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            this.f38426a.mo27672a(bundle);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27681f();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27682g();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27683h();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27684i();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27677b(bundle);
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27685j();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            if (this.f38426a != null) {
                this.f38426a.mo27686k();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m30556a() {
        if (this.f38426a != null) {
            try {
                this.f38426a.mo27687l();
            } catch (RemoteException e) {
                afc.m32797d("#007 Could not call remote method.", e);
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m30556a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m30556a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m30556a();
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f38426a != null) {
                z = this.f38426a.mo27680e();
            }
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f38426a.mo27671a(i, i2, intent);
        } catch (Exception e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f38426a.mo27674a(C14886d.m30544a(configuration));
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C18968a.m46139a(this);
        mo27257a(bundle);
    }

    public void setRequestedOrientation(int i) {
        if (VERSION.SDK_INT != 26) {
            mo27256a(i);
            return;
        }
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            mo27256a(i);
        }
    }
}

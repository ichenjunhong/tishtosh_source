package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0699x.C0700a;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0729f;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.Status;

public class SignInHubActivity extends FragmentActivity {

    /* renamed from: c */
    private static boolean f39176c;

    /* renamed from: a */
    int f39177a;

    /* renamed from: b */
    Intent f39178b;

    /* renamed from: d */
    private boolean f39179d;

    /* renamed from: e */
    private SignInConfiguration f39180e;

    /* renamed from: f */
    private boolean f39181f;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    class C15145a implements C0700a<Void> {
        private C15145a() {
        }

        /* renamed from: a */
        public final void mo2348a(C0729f<Void> fVar) {
        }

        /* renamed from: a */
        public final C0729f<Void> mo2347a(int i, Bundle bundle) {
            return new C15150e(SignInHubActivity.this, C15233f.m31488a());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo2349a(C0729f fVar, Object obj) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f39177a, SignInHubActivity.this.f39178b);
            SignInHubActivity.this.finish();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m31314a(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            this.f39180e = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            if (this.f39180e == null) {
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f39181f = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f39181f) {
                    this.f39177a = bundle.getInt("signInResultCode");
                    this.f39178b = (Intent) bundle.getParcelable("signInResultData");
                    m31313a();
                }
            } else if (f39176c) {
                setResult(0);
                m31314a(12502);
            } else {
                f39176c = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f39180e);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f39179d = true;
                    m31314a(17);
                }
            }
        } else {
            String str = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f39181f);
        if (this.f39181f) {
            bundle.putInt("signInResultCode", this.f39177a);
            bundle.putParcelable("signInResultData", this.f39178b);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f39179d) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.f39164a != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.f39164a;
                        C15159n.m31354a(this).mo27971a(this.f39180e.f39174a, googleSignInAccount);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f39181f = true;
                        this.f39177a = i2;
                        this.f39178b = intent;
                        m31313a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m31314a(intExtra);
                        return;
                    }
                }
                m31314a(8);
            }
        }
    }

    /* renamed from: a */
    private final void m31313a() {
        getSupportLoaderManager().mo2081a(0, null, new C15145a());
        f39176c = false;
    }

    /* renamed from: a */
    private final void m31314a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f39176c = false;
    }
}

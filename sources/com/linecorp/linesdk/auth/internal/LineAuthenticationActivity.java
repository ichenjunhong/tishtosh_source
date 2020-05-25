package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.linecorp.linesdk.C18233b;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.ss.android.ugc.trill.R;

public class LineAuthenticationActivity extends Activity {

    /* renamed from: a */
    private boolean f50299a;

    /* renamed from: b */
    private C18230d f50300b;

    /* renamed from: c */
    private C18226c f50301c;

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f50299a = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f50300b.f50332d == C18232a.f50333a) {
            C18226c cVar = this.f50301c;
            cVar.f50325h.f50332d = C18232a.f50334b;
            new C18229c(cVar, 0).execute(new Void[0]);
        } else if (this.f50300b.f50332d != C18232a.f50335c) {
            new Handler(Looper.getMainLooper()).postDelayed(new C18228b(this.f50301c, 0), 1000);
        }
        this.f50299a = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("authenticationStatus", this.f50300b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36314a(LineLoginResult lineLoginResult) {
        if (this.f50300b == null) {
            finish();
            return;
        }
        if ((this.f50300b.f50332d == C18232a.f50334b && !this.f50299a) || this.f50300b.f50332d == C18232a.f50336d) {
            Intent intent = new Intent();
            intent.putExtra("authentication_result", lineLoginResult);
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C18230d dVar;
        super.onCreate(bundle);
        setContentView(R.layout.a9v);
        Intent intent = getIntent();
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) intent.getParcelableExtra("authentication_config");
        if (lineAuthenticationConfig == null) {
            mo36314a(new LineLoginResult(C18233b.INTERNAL_ERROR, new LineApiError("The requested parameter is illegal.")));
            return;
        }
        if (bundle == null) {
            dVar = new C18230d();
        } else {
            dVar = (C18230d) bundle.getParcelable("authenticationStatus");
            if (dVar == null) {
                dVar = new C18230d();
            }
        }
        this.f50300b = dVar;
        this.f50301c = new C18226c(this, lineAuthenticationConfig, this.f50300b, intent.getStringArrayExtra("permissions"));
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C18224c cVar;
        C18233b bVar;
        super.onNewIntent(intent);
        if (this.f50300b.f50332d == C18232a.f50334b) {
            C18226c cVar2 = this.f50301c;
            cVar2.f50325h.f50332d = C18232a.f50335c;
            C18221a aVar = cVar2.f50322e;
            Uri data = intent.getData();
            if (data == null) {
                cVar = C18224c.m44418a("Illegal redirection from external application.");
            } else {
                String str = aVar.f50303b.f50331c;
                String queryParameter = data.getQueryParameter("state");
                if (str == null || !str.equals(queryParameter)) {
                    cVar = C18224c.m44418a("Illegal parameter value of 'state'.");
                } else {
                    String queryParameter2 = data.getQueryParameter("code");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        cVar = new C18224c(queryParameter2, null, null, null);
                    } else {
                        cVar = new C18224c(null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
                    }
                }
            }
            if (!cVar.mo36322a()) {
                cVar2.f50325h.f50332d = C18232a.f50336d;
                LineAuthenticationActivity lineAuthenticationActivity = cVar2.f50318a;
                if (cVar.mo36323b()) {
                    bVar = C18233b.AUTHENTICATION_AGENT_ERROR;
                } else {
                    bVar = C18233b.INTERNAL_ERROR;
                }
                lineAuthenticationActivity.mo36314a(new LineLoginResult(bVar, cVar.mo36324c()));
                return;
            }
            C18227a aVar2 = new C18227a(cVar2, 0);
            String[] strArr = new String[1];
            if (!TextUtils.isEmpty(cVar.f50311a)) {
                strArr[0] = cVar.f50311a;
                aVar2.execute(strArr);
            } else {
                throw new UnsupportedOperationException("requestToken is null. Please check result by isSuccess before.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f50300b.f50332d == C18232a.f50334b) {
            C18226c cVar = this.f50301c;
            if (i == 3 && cVar.f50325h.f50332d != C18232a.f50335c) {
                new Handler(Looper.getMainLooper()).postDelayed(new C18228b(cVar, 0), 1000);
            }
        }
    }
}

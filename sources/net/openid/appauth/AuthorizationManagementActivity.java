package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import net.openid.appauth.C53459d.C53460a;
import net.openid.appauth.C53459d.C53461b;
import net.openid.appauth.C53466f.C53468a;
import net.openid.appauth.p2682c.C53455a;
import org.json.JSONException;

public class AuthorizationManagementActivity extends Activity {

    /* renamed from: a */
    public Intent f132160a;

    /* renamed from: b */
    private boolean f132161b;

    /* renamed from: c */
    private C53463e f132162c;

    /* renamed from: d */
    private PendingIntent f132163d;

    /* renamed from: e */
    private PendingIntent f132164e;

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.f132160a != null) {
            mo111194a();
            return;
        }
        try {
            mo111194a();
        } catch (NullPointerException unused) {
            finish();
        }
    }

    /* renamed from: b */
    private void m113493b() {
        Uri data = getIntent().getData();
        Intent a = m113491a(data);
        if (a == null) {
            C53455a.m113516d("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        a.setData(data);
        if (this.f132163d != null) {
            C53455a.m113512a("Authorization complete - invoking completion intent", new Object[0]);
            try {
                this.f132163d.send(this, 0, a);
            } catch (CanceledException e) {
                C53455a.m113516d("Failed to send completion intent", e);
            }
        } else {
            setResult(-1, a);
        }
    }

    /* renamed from: c */
    private void m113494c() {
        C53455a.m113512a("Authorization flow canceled by user", new Object[0]);
        Intent intent = C53459d.fromTemplate(C53461b.f132200b, null).toIntent();
        if (this.f132164e != null) {
            try {
                this.f132164e.send(this, 0, intent);
            } catch (CanceledException e) {
                C53455a.m113516d("Failed to send cancel intent", e);
            }
        } else {
            setResult(0, intent);
            C53455a.m113512a("No cancel intent set - will return to previous activity", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo111194a() {
        super.onResume();
        if (!this.f132161b) {
            startActivity(this.f132160a);
            this.f132161b = true;
            return;
        }
        if (getIntent().getData() != null) {
            m113493b();
        } else {
            m113494c();
        }
        finish();
    }

    /* renamed from: a */
    public static Intent m113490a(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            m113492a(getIntent().getExtras());
        } else {
            m113492a(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f132161b);
        bundle.putParcelable("authIntent", this.f132160a);
        bundle.putString("authRequest", this.f132162c.mo111216c());
        bundle.putParcelable("completeIntent", this.f132163d);
        bundle.putParcelable("cancelIntent", this.f132164e);
    }

    /* renamed from: a */
    private Intent m113491a(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return C53459d.fromOAuthRedirect(uri).toIntent();
        }
        C53466f a = new C53468a(this.f132162c).mo111221a(uri).mo111224a();
        if ((this.f132162c.f132225j != null || a.f132247c == null) && (this.f132162c.f132225j == null || this.f132162c.f132225j.equals(a.f132247c))) {
            return a.mo111220a();
        }
        C53455a.m113515c("State returned in authorization response (%s) does not match state from request (%s) - discarding response", a.f132247c, this.f132162c.f132225j);
        return C53460a.f132197j.toIntent();
    }

    /* renamed from: a */
    private void m113492a(Bundle bundle) {
        if (bundle == null) {
            C53455a.m113515c("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f132160a = (Intent) bundle.getParcelable("authIntent");
        this.f132161b = bundle.getBoolean("authStarted", false);
        C53463e eVar = null;
        try {
            String string = bundle.getString("authRequest", null);
            if (string != null) {
                eVar = C53463e.m113526a(string);
            }
            this.f132162c = eVar;
            this.f132163d = (PendingIntent) bundle.getParcelable("completeIntent");
            this.f132164e = (PendingIntent) bundle.getParcelable("cancelIntent");
        } catch (JSONException e) {
            throw new IllegalStateException("Unable to deserialize authorization request", e);
        }
    }
}

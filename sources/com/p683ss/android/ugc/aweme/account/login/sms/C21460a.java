package com.p683ss.android.ugc.aweme.account.login.sms;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.gms.auth.api.C15106a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C15118a;
import com.google.android.gms.auth.api.credentials.HintRequest.C15119a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15233f;
import com.google.android.gms.common.api.C15233f.C15234a;
import com.google.android.gms.common.api.C15233f.C15235b;
import com.google.android.gms.common.api.C15233f.C15236c;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22276p;
import com.p683ss.android.ugc.aweme.account.utils.C22297d;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.a */
public final class C21460a implements C15235b, C15236c {

    /* renamed from: b */
    private static final boolean f58216b = false;

    /* renamed from: a */
    public EditText f58217a;

    /* renamed from: c */
    private C15233f f58218c;

    /* renamed from: d */
    private Fragment f58219d;

    /* renamed from: e */
    private int f58220e = C22299f.m55186b(C23826bi.m58460b());

    /* renamed from: f */
    private boolean f58221f = C22276p.m55133a(C23826bi.m58460b());

    /* renamed from: g */
    private String f58222g;

    /* renamed from: h */
    private Exception f58223h;

    /* renamed from: i */
    private boolean f58224i;

    public final void onConnected(Bundle bundle) {
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public final void onConnectionSuspended(int i) {
    }

    /* renamed from: b */
    public final void mo45643b() {
        if (this.f58224i && this.f58218c != null && this.f58218c.mo28114j()) {
            this.f58218c.mo28099a(this.f58219d.getActivity());
            this.f58218c.mo28111g();
        }
    }

    /* renamed from: c */
    public final void mo45644c() {
        if (!this.f58224i) {
            m54089a(false, "Feature cannot be used", this.f58221f, this.f58220e);
        } else if (this.f58218c == null) {
            StringBuilder sb = new StringBuilder("Failed to create GoogleApiClient, exception: ");
            sb.append(C22297d.m55181a(this.f58223h));
            m54089a(false, sb.toString(), this.f58221f, this.f58220e);
        } else if (this.f58219d == null || !this.f58219d.isAdded()) {
            StringBuilder sb2 = new StringBuilder("Unexpected error occurred, fragment: ");
            sb2.append(this.f58219d);
            m54089a(false, sb2.toString(), this.f58221f, this.f58220e);
        } else {
            try {
                this.f58219d.startIntentSenderForResult(C15106a.f39008g.mo27895a(this.f58218c, new C15119a().mo27890a(new C15118a().mo27886a(true).mo27887a()).mo27891a(true).mo27892a()).getIntentSender(), 1000, null, 0, 0, 0, null);
            } catch (SendIntentException e) {
                StringBuilder sb3 = new StringBuilder("Error when calling startIntentSenderForResult: ");
                sb3.append(C22297d.m55181a(e));
                m54089a(false, sb3.toString(), this.f58221f, this.f58220e);
            }
        }
    }

    /* renamed from: a */
    public final void mo45640a() {
        if (this.f58224i) {
            try {
                this.f58218c = new C15234a(this.f58219d.getContext()).mo28118a((C15235b) this).mo28115a(this.f58219d.getActivity(), (C15236c) this).mo28116a(C15106a.f39005d).mo28120a();
            } catch (Exception e) {
                this.f58223h = e;
            }
        }
    }

    /* renamed from: a */
    public final void mo45642a(EditText editText) {
        this.f58217a = editText;
        mo45644c();
    }

    /* renamed from: b */
    private void m54090b(Intent intent) {
        C0013i.m16a((Callable<TResult>) new C21461b<TResult>(this, intent)).mo19a((C0011g<TResult, TContinuationResult>) new C21462c<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo45639a(C0013i iVar) throws Exception {
        if (!C47957v.m103770a(iVar) || !((Boolean) iVar.mo34e()).booleanValue()) {
            StringBuilder sb = new StringBuilder("Bolts result error: ");
            sb.append(C22297d.m55181a(iVar.mo35f()));
            m54089a(false, sb.toString(), this.f58221f, this.f58220e);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo45638a(Intent intent) throws Exception {
        String str;
        String str2;
        Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
        boolean z = false;
        if (credential == null) {
            str = "No \"Credential\" retrieved from Credential.EXTRA_KEY";
        } else {
            String str3 = credential.f39054a;
            PhoneNumber phoneNumber = null;
            try {
                str2 = null;
                phoneNumber = PhoneNumberUtil.getInstance().parse(str3, null);
            } catch (NumberParseException e) {
                StringBuilder sb = new StringBuilder("NumberParseException: ");
                sb.append(e.getMessage());
                str2 = sb.toString();
            }
            if (phoneNumber != null) {
                z = true;
            }
            if (phoneNumber != null) {
                str3 = String.valueOf(phoneNumber.getNationalNumber());
            }
            C47957v.m103768a((Runnable) new C21463d(this, str3));
            str = str2;
        }
        m54089a(TextUtils.isEmpty(str), str, this.f58221f, this.f58220e);
        return Boolean.valueOf(z);
    }

    public C21460a(Fragment fragment, String str) {
        boolean z;
        this.f58219d = fragment;
        this.f58222g = str;
        if (!this.f58221f || this.f58220e != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f58224i = z;
    }

    /* renamed from: a */
    public final void mo45641a(int i, int i2, Intent intent) {
        if (this.f58224i && i == 1000 && this.f58217a != null) {
            if (i2 == -1) {
                m54090b(intent);
                return;
            }
            this.f58217a.requestFocus();
            StringBuilder sb = new StringBuilder("onActivityResult result code: ");
            sb.append(i2);
            m54089a(false, sb.toString(), this.f58221f, this.f58220e);
        }
    }

    /* renamed from: a */
    private void m54089a(boolean z, String str, boolean z2, int i) {
        String str2;
        C20994a.m53365a(z, str, z2, i);
        C23088c a = C23088c.m56631a().mo47819a("success", Boolean.valueOf(z));
        String str3 = "error_desc";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        JSONObject b = a.mo47824a(str3, str2).mo47819a("has_sim_card", Boolean.valueOf(z2)).mo47822a("google_availability", Integer.valueOf(i)).mo47825b();
        boolean z3 = !z;
        C52711k.m112236a((Object) b, "json");
        C22089b.m54868a("phone_auto_fill", z3 ? 1 : 0, b);
        C26890h.m65011a("phone_auto_fill", new C20856a().mo44776a("enter_method", this.f58222g).mo44774a("is_successful", z ? 1 : 0).mo44776a("error_desc", str).mo44774a("has_sim_card", z2 ? 1 : 0).mo44774a("google_availability", i).f56798a);
    }
}

package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.FragmentActivity;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14284ac;
import com.facebook.internal.C14284ac.C14289a;
import com.facebook.internal.C14284ac.C14291c;
import com.facebook.internal.C14317i;
import com.facebook.login.LoginClient.Request;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<WebViewLoginMethodHandler> CREATOR = new Creator<WebViewLoginMethodHandler>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }
    };

    /* renamed from: c */
    private C14284ac f37674c;

    /* renamed from: d */
    private String f37675d;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    static class C14502a extends C14289a {

        /* renamed from: f */
        String f37678f;

        /* renamed from: g */
        String f37679g;

        /* renamed from: h */
        String f37680h = "fbconnect://success";

        /* renamed from: a */
        public final C14284ac mo26502a() {
            Bundle bundle = this.f37225e;
            bundle.putString("redirect_uri", this.f37680h);
            bundle.putString("client_id", this.f37222b);
            bundle.putString("e2e", this.f37678f);
            bundle.putString("response_type", "token,signed_request");
            bundle.putString("return_scopes", "true");
            bundle.putString("auth_type", this.f37679g);
            return C14284ac.m29315a(this.f37221a, "oauth", bundle, this.f37223c, this.f37224d);
        }

        public C14502a(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "web_view";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo26718d() {
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v_ */
    public final C13739d mo26641v_() {
        return C13739d.WEB_VIEW;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26672b() {
        if (this.f37674c != null) {
            this.f37674c.cancel();
            this.f37674c = null;
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f37675d = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26638a(final Request request) {
        String str;
        Bundle b = mo26723b(request);
        C145001 r1 = new C14291c() {
            /* renamed from: a */
            public final void mo26509a(Bundle bundle, C14457k kVar) {
                WebViewLoginMethodHandler.this.mo26724b(request, bundle, kVar);
            }
        };
        this.f37675d = LoginClient.m29645f();
        mo26716a("e2e", this.f37675d);
        FragmentActivity a = this.f37672b.mo26680a();
        boolean d = C14277aa.m29291d((Context) a);
        C14502a aVar = new C14502a(a, request.f37641d, b);
        aVar.f37678f = this.f37675d;
        if (d) {
            str = "fbconnect://chrome_os_success";
        } else {
            str = "fbconnect://success";
        }
        aVar.f37680h = str;
        aVar.f37679g = request.f37645h;
        this.f37674c = aVar.mo26501a(r1).mo26502a();
        C14317i iVar = new C14317i();
        iVar.setRetainInstance(true);
        iVar.f37260a = this.f37674c;
        iVar.show(a.getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37675d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26724b(Request request, Bundle bundle, C14457k kVar) {
        super.mo26722a(request, bundle, kVar);
    }
}

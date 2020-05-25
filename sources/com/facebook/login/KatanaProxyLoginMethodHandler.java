package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C14353v;
import com.facebook.login.LoginClient.Request;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<KatanaProxyLoginMethodHandler> CREATOR = new Creator<KatanaProxyLoginMethodHandler>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "katana_proxy_auth";
    }

    public int describeContents() {
        return 0;
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26638a(Request request) {
        String f = LoginClient.m29645f();
        Intent b = C14353v.m29442b(this.f37672b.mo26680a(), request.f37641d, request.f37639b, f, request.f37643f, request.mo26691a(), request.f37640c, mo26714a(request.f37642e), request.f37645h);
        mo26716a("e2e", f);
        return mo26719a(b, LoginClient.m29642b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}

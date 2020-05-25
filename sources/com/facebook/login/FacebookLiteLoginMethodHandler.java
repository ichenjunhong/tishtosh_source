package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.C14353v;
import com.facebook.login.LoginClient.Request;
import java.util.Collection;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Creator<FacebookLiteLoginMethodHandler> CREATOR = new Creator<FacebookLiteLoginMethodHandler>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "fb_lite_login";
    }

    public int describeContents() {
        return 0;
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26638a(Request request) {
        String f = LoginClient.m29645f();
        Intent a = C14353v.m29432a((Context) this.f37672b.mo26680a(), request.f37641d, (Collection<String>) request.f37639b, f, request.f37643f, request.mo26691a(), request.f37640c, mo26714a(request.f37642e), request.f37645h);
        mo26716a("e2e", f);
        return mo26719a(a, LoginClient.m29642b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}

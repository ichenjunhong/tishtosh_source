package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C13739d;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }
    };

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f37621c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo26635a() {
        return "device_auth";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: w_ */
    public final void mo26665w_() {
        this.f37672b.mo26682a(Result.m29659a(this.f37672b.f37634g, "User canceled log in."));
    }

    /* renamed from: c */
    public static synchronized ScheduledThreadPoolExecutor m29620c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f37621c == null) {
                f37621c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f37621c;
        }
        return scheduledThreadPoolExecutor;
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: a */
    public final void mo26662a(Exception exc) {
        this.f37672b.mo26682a(Result.m29660a(this.f37672b.f37634g, null, exc.getMessage()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26638a(Request request) {
        FragmentActivity a = this.f37672b.mo26680a();
        if (a != null && !a.isFinishing()) {
            DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
            deviceAuthDialog.show(a.getSupportFragmentManager(), "login_with_facebook");
            deviceAuthDialog.mo26649a(request);
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public final void mo26663a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C13739d dVar, Date date, Date date2, Date date3) {
        AccessToken accessToken = new AccessToken(str, str2, str3, collection, collection2, collection3, dVar, date, null, date3);
        this.f37672b.mo26682a(Result.m29658a(this.f37672b.f37634g, accessToken));
    }
}

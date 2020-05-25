package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14308d.C14310b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new Creator<LoginClient>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LoginClient[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }
    };

    /* renamed from: a */
    LoginMethodHandler[] f37628a;

    /* renamed from: b */
    int f37629b = -1;

    /* renamed from: c */
    public Fragment f37630c;

    /* renamed from: d */
    public C14493b f37631d;

    /* renamed from: e */
    public C14492a f37632e;

    /* renamed from: f */
    boolean f37633f;

    /* renamed from: g */
    public Request f37634g;

    /* renamed from: h */
    Map<String, String> f37635h;

    /* renamed from: i */
    Map<String, String> f37636i;

    /* renamed from: j */
    private C14525f f37637j;

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new Creator<Request>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Request[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Request(parcel);
            }
        };

        /* renamed from: a */
        public final C14521d f37638a;

        /* renamed from: b */
        public Set<String> f37639b;

        /* renamed from: c */
        public final C14503a f37640c;

        /* renamed from: d */
        public final String f37641d;

        /* renamed from: e */
        public final String f37642e;

        /* renamed from: f */
        public boolean f37643f;

        /* renamed from: g */
        public String f37644g;

        /* renamed from: h */
        public String f37645h;

        /* renamed from: i */
        public String f37646i;

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo26691a() {
            for (String b : this.f37639b) {
                if (LoginManager.m29675b(b)) {
                    return true;
                }
            }
            return false;
        }

        private Request(Parcel parcel) {
            C14521d dVar;
            boolean z;
            String readString = parcel.readString();
            C14503a aVar = null;
            if (readString != null) {
                dVar = C14521d.valueOf(readString);
            } else {
                dVar = null;
            }
            this.f37638a = dVar;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f37639b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                aVar = C14503a.valueOf(readString2);
            }
            this.f37640c = aVar;
            this.f37641d = parcel.readString();
            this.f37642e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f37643f = z;
            this.f37644g = parcel.readString();
            this.f37645h = parcel.readString();
            this.f37646i = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            String str2 = null;
            if (this.f37638a != null) {
                str = this.f37638a.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f37639b));
            if (this.f37640c != null) {
                str2 = this.f37640c.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f37641d);
            parcel.writeString(this.f37642e);
            parcel.writeByte(this.f37643f ? (byte) 1 : 0);
            parcel.writeString(this.f37644g);
            parcel.writeString(this.f37645h);
            parcel.writeString(this.f37646i);
        }

        Request(C14521d dVar, Set<String> set, C14503a aVar, String str, String str2, String str3) {
            this.f37638a = dVar;
            if (set == null) {
                set = new HashSet<>();
            }
            this.f37639b = set;
            this.f37640c = aVar;
            this.f37645h = str;
            this.f37641d = str2;
            this.f37642e = str3;
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new Creator<Result>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Result[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Result(parcel);
            }
        };

        /* renamed from: a */
        final C14491a f37647a;

        /* renamed from: b */
        final AccessToken f37648b;

        /* renamed from: c */
        final String f37649c;

        /* renamed from: d */
        final String f37650d;

        /* renamed from: e */
        final Request f37651e;

        /* renamed from: f */
        public Map<String, String> f37652f;

        /* renamed from: g */
        public Map<String, String> f37653g;

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        enum C14491a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: d */
            public final String f37658d;

            private C14491a(String str) {
                this.f37658d = str;
            }
        }

        public int describeContents() {
            return 0;
        }

        private Result(Parcel parcel) {
            this.f37647a = C14491a.valueOf(parcel.readString());
            this.f37648b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f37649c = parcel.readString();
            this.f37650d = parcel.readString();
            this.f37651e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f37652f = C14277aa.m29261a(parcel);
            this.f37653g = C14277aa.m29261a(parcel);
        }

        /* renamed from: a */
        static Result m29658a(Request request, AccessToken accessToken) {
            Result result = new Result(request, C14491a.SUCCESS, accessToken, null, null);
            return result;
        }

        /* renamed from: a */
        static Result m29659a(Request request, String str) {
            Result result = new Result(request, C14491a.CANCEL, null, str, null);
            return result;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37647a.name());
            parcel.writeParcelable(this.f37648b, i);
            parcel.writeString(this.f37649c);
            parcel.writeString(this.f37650d);
            parcel.writeParcelable(this.f37651e, i);
            C14277aa.m29266a(parcel, this.f37652f);
            C14277aa.m29266a(parcel, this.f37653g);
        }

        /* renamed from: a */
        static Result m29660a(Request request, String str, String str2) {
            return m29661a(request, str, str2, null);
        }

        /* renamed from: a */
        static Result m29661a(Request request, String str, String str2, String str3) {
            Request request2 = request;
            Result result = new Result(request2, C14491a.ERROR, null, TextUtils.join(": ", C14277aa.m29280b((T[]) new String[]{str, str2})), str3);
            return result;
        }

        private Result(Request request, C14491a aVar, AccessToken accessToken, String str, String str2) {
            C14283ab.m29306a((Object) aVar, "code");
            this.f37651e = request;
            this.f37648b = accessToken;
            this.f37649c = str;
            this.f37647a = aVar;
            this.f37650d = str2;
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C14492a {
        /* renamed from: a */
        void mo26700a();

        /* renamed from: b */
        void mo26701b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface C14493b {
        /* renamed from: a */
        void mo26702a(Result result);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public static int m29642b() {
        return C14310b.Login.toRequestCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final FragmentActivity mo26680a() {
        return this.f37630c.getActivity();
    }

    /* renamed from: h */
    private void m29647h() {
        mo26683b(Result.m29660a(this.f37634g, "Login attempt failed.", null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final LoginMethodHandler mo26684c() {
        if (this.f37629b >= 0) {
            return this.f37628a[this.f37629b];
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo26687e() {
        if (this.f37632e != null) {
            this.f37632e.mo26700a();
        }
    }

    /* renamed from: f */
    static String m29645f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: g */
    private boolean m29646g() {
        if (this.f37633f) {
            return true;
        }
        if (m29638a("android.permission.INTERNET") != 0) {
            FragmentActivity a = mo26680a();
            mo26683b(Result.m29660a(this.f37634g, a.getString(R.string.a6a), a.getString(R.string.a6_)));
            return false;
        }
        this.f37633f = true;
        return true;
    }

    /* renamed from: j */
    private C14525f m29649j() {
        if (this.f37637j == null || !this.f37637j.f37736a.equals(this.f37634g.f37641d)) {
            this.f37637j = new C14525f(mo26680a(), this.f37634g.f37641d);
        }
        return this.f37637j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo26685d() {
        if (this.f37629b >= 0) {
            m29640a(mo26684c().mo26635a(), "skipped", null, null, mo26684c().f37671a);
        }
        while (this.f37628a != null && this.f37629b < this.f37628a.length - 1) {
            this.f37629b++;
            if (m29648i()) {
                return;
            }
        }
        if (this.f37634g != null) {
            m29647h();
        }
    }

    /* renamed from: i */
    private boolean m29648i() {
        LoginMethodHandler c = mo26684c();
        if (!c.mo26718d() || m29646g()) {
            boolean a = c.mo26638a(this.f37634g);
            if (a) {
                m29649j().mo26772a(this.f37634g.f37642e, c.mo26635a());
            } else {
                m29649j().mo26776b(this.f37634g.f37642e, c.mo26635a());
                m29641a("not_tried", c.mo26635a(), true);
            }
            return a;
        }
        m29641a("no_internet_permission", "1", false);
        return false;
    }

    public LoginClient(Fragment fragment) {
        this.f37630c = fragment;
    }

    /* renamed from: a */
    private int m29638a(String str) {
        return mo26680a().checkCallingOrSelfPermission(str);
    }

    /* renamed from: d */
    private void m29644d(Result result) {
        if (this.f37631d != null) {
            this.f37631d.mo26702a(result);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26683b(Result result) {
        LoginMethodHandler c = mo26684c();
        if (c != null) {
            m29639a(c.mo26635a(), result, c.f37671a);
        }
        if (this.f37635h != null) {
            result.f37652f = this.f37635h;
        }
        if (this.f37636i != null) {
            result.f37653g = this.f37636i;
        }
        this.f37628a = null;
        this.f37629b = -1;
        this.f37634g = null;
        this.f37635h = null;
        m29644d(result);
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f37628a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.f37628a[i] = (LoginMethodHandler) readParcelableArray[i];
            this.f37628a[i].mo26715a(this);
        }
        this.f37629b = parcel.readInt();
        this.f37634g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f37635h = C14277aa.m29261a(parcel);
        this.f37636i = C14277aa.m29261a(parcel);
    }

    /* renamed from: c */
    private void m29643c(Result result) {
        Result result2;
        if (result.f37648b != null) {
            AccessToken a = AccessToken.m27253a();
            AccessToken accessToken = result.f37648b;
            if (!(a == null || accessToken == null)) {
                try {
                    if (a.f35180i.equals(accessToken.f35180i)) {
                        result2 = Result.m29658a(this.f37634g, result.f37648b);
                        mo26683b(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo26683b(Result.m29660a(this.f37634g, "Caught exception", e.getMessage()));
                    return;
                }
            }
            result2 = Result.m29660a(this.f37634g, "User logged in as different Facebook user.", null);
            mo26683b(result2);
            return;
        }
        throw new C14457k("Can't validate without a token");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26681a(Request request) {
        boolean z;
        if (this.f37634g == null || this.f37629b < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && request != null) {
            if (this.f37634g != null) {
                throw new C14457k("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.m27257b() || m29646g()) {
                this.f37634g = request;
                ArrayList arrayList = new ArrayList();
                C14521d dVar = request.f37638a;
                if (dVar.allowsGetTokenAuth) {
                    arrayList.add(new GetTokenLoginMethodHandler(this));
                }
                if (dVar.allowsKatanaAuth) {
                    arrayList.add(new KatanaProxyLoginMethodHandler(this));
                }
                if (dVar.allowsFacebookLiteAuth) {
                    arrayList.add(new FacebookLiteLoginMethodHandler(this));
                }
                if (dVar.allowsCustomTabAuth) {
                    arrayList.add(new CustomTabLoginMethodHandler(this));
                }
                if (dVar.allowsWebViewAuth) {
                    arrayList.add(new WebViewLoginMethodHandler(this));
                }
                if (dVar.allowsDeviceAuth) {
                    arrayList.add(new DeviceAuthMethodHandler(this));
                }
                LoginMethodHandler[] loginMethodHandlerArr = new LoginMethodHandler[arrayList.size()];
                arrayList.toArray(loginMethodHandlerArr);
                this.f37628a = loginMethodHandlerArr;
                mo26685d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26682a(Result result) {
        if (result.f37648b == null || !AccessToken.m27257b()) {
            mo26683b(result);
        } else {
            m29643c(result);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f37628a, i);
        parcel.writeInt(this.f37629b);
        parcel.writeParcelable(this.f37634g, i);
        C14277aa.m29266a(parcel, this.f37635h);
        C14277aa.m29266a(parcel, this.f37636i);
    }

    /* renamed from: a */
    private void m29639a(String str, Result result, Map<String, String> map) {
        m29640a(str, result.f37647a.f37658d, result.f37649c, result.f37650d, map);
    }

    /* renamed from: a */
    private void m29641a(String str, String str2, boolean z) {
        if (this.f37635h == null) {
            this.f37635h = new HashMap();
        }
        if (this.f37635h.containsKey(str) && z) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.f37635h.get(str));
            sb.append(",");
            sb.append(str2);
            str2 = sb.toString();
        }
        this.f37635h.put(str, str2);
    }

    /* renamed from: a */
    private void m29640a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f37634g == null) {
            m29649j().mo26773a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m29649j().mo26774a(this.f37634g.f37642e, str, str2, str3, str4, map);
        }
    }
}

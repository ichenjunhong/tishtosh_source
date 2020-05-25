package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14277aa.C14280a;
import com.facebook.internal.C14283ab;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Profile[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }
    };

    /* renamed from: a */
    public static final String f35248a = "Profile";

    /* renamed from: b */
    public final String f35249b;

    /* renamed from: c */
    public final String f35250c;

    /* renamed from: d */
    public final String f35251d;

    /* renamed from: e */
    public final String f35252e;

    /* renamed from: f */
    public final String f35253f;

    /* renamed from: g */
    public final Uri f35254g;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static Profile m27312a() {
        return C14702y.m30074a().f38097b;
    }

    /* renamed from: b */
    public static void m27314b() {
        AccessToken a = AccessToken.m27253a();
        if (!AccessToken.m27257b()) {
            m27313a(null);
        } else {
            C14277aa.m29269a(a.f35176e, (C14280a) new C14280a() {
                /* renamed from: a */
                public final void mo25330a(C14457k kVar) {
                }

                /* renamed from: a */
                public final void mo25331a(JSONObject jSONObject) {
                    Uri uri;
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        String optString3 = jSONObject.optString("first_name");
                        String optString4 = jSONObject.optString("middle_name");
                        String optString5 = jSONObject.optString("last_name");
                        String optString6 = jSONObject.optString(LeakCanaryFileProvider.f132049i);
                        if (optString2 != null) {
                            uri = Uri.parse(optString2);
                        } else {
                            uri = null;
                        }
                        Profile profile = new Profile(optString, optString3, optString4, optString5, optString6, uri);
                        Profile.m27313a(profile);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final JSONObject mo25325c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f35249b);
            jSONObject.put("first_name", this.f35250c);
            jSONObject.put("middle_name", this.f35251d);
            jSONObject.put("last_name", this.f35252e);
            jSONObject.put(LeakCanaryFileProvider.f132049i, this.f35253f);
            if (this.f35254g == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f35254g.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int hashCode() {
        int hashCode = this.f35249b.hashCode() + 527;
        if (this.f35250c != null) {
            hashCode = (hashCode * 31) + this.f35250c.hashCode();
        }
        if (this.f35251d != null) {
            hashCode = (hashCode * 31) + this.f35251d.hashCode();
        }
        if (this.f35252e != null) {
            hashCode = (hashCode * 31) + this.f35252e.hashCode();
        }
        if (this.f35253f != null) {
            hashCode = (hashCode * 31) + this.f35253f.hashCode();
        }
        if (this.f35254g != null) {
            return (hashCode * 31) + this.f35254g.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    public static void m27313a(Profile profile) {
        C14702y.m30074a().mo26970a(profile, true);
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f35249b = parcel.readString();
        this.f35250c = parcel.readString();
        this.f35251d = parcel.readString();
        this.f35252e = parcel.readString();
        this.f35253f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f35254g = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f35249b = jSONObject.optString("id", null);
        this.f35250c = jSONObject.optString("first_name", null);
        this.f35251d = jSONObject.optString("middle_name", null);
        this.f35252e = jSONObject.optString("last_name", null);
        this.f35253f = jSONObject.optString(LeakCanaryFileProvider.f132049i, null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f35254g = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.f35249b.equals(profile.f35249b) || this.f35250c != null) {
            if (!this.f35250c.equals(profile.f35250c) || this.f35251d != null) {
                if (!this.f35251d.equals(profile.f35251d) || this.f35252e != null) {
                    if (!this.f35252e.equals(profile.f35252e) || this.f35253f != null) {
                        if (!this.f35253f.equals(profile.f35253f) || this.f35254g != null) {
                            return this.f35254g.equals(profile.f35254g);
                        }
                        if (profile.f35254g == null) {
                            return true;
                        }
                        return false;
                    } else if (profile.f35253f == null) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (profile.f35252e == null) {
                    return true;
                } else {
                    return false;
                }
            } else if (profile.f35251d == null) {
                return true;
            } else {
                return false;
            }
        } else if (profile.f35250c == null) {
            return true;
        } else {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f35249b);
        parcel.writeString(this.f35250c);
        parcel.writeString(this.f35251d);
        parcel.writeString(this.f35252e);
        parcel.writeString(this.f35253f);
        if (this.f35254g == null) {
            str = null;
        } else {
            str = this.f35254g.toString();
        }
        parcel.writeString(str);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C14283ab.m29307a(str, "id");
        this.f35249b = str;
        this.f35250c = str2;
        this.f35251d = str3;
        this.f35252e = str4;
        this.f35253f = str5;
        this.f35254g = uri;
    }
}

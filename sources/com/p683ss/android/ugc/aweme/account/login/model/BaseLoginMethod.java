package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod */
public class BaseLoginMethod implements Parcelable {
    public static final C21381a CREATOR = new C21381a(null);
    private CommonUserInfo commonUserInfo;
    private Date expires;
    private int lastIsReliableLogin;
    private final LoginMethodName loginMethodName;
    private final String uid;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod$a */
    public static final class C21381a implements Creator<BaseLoginMethod> {
        private C21381a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BaseLoginMethod[i];
        }

        public /* synthetic */ C21381a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new BaseLoginMethod(parcel);
        }
    }

    public BaseLoginMethod() {
        this(null, null, null, null, 15, null);
    }

    public int describeContents() {
        return 0;
    }

    public final CommonUserInfo getCommonUserInfo() {
        return this.commonUserInfo;
    }

    public Date getExpires() {
        return this.expires;
    }

    public final int getLastIsReliableLogin() {
        return this.lastIsReliableLogin;
    }

    public LoginMethodName getLoginMethodName() {
        return this.loginMethodName;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean isExpired() {
        return new Date().after(getExpires());
    }

    public final void setLastIsReliableLogin(int i) {
        this.lastIsReliableLogin = i;
    }

    public final void setCommonUserInfo(CommonUserInfo commonUserInfo2) {
        C52711k.m112240b(commonUserInfo2, "<set-?>");
        this.commonUserInfo = commonUserInfo2;
    }

    public void setExpires(Date date) {
        C52711k.m112240b(date, "<set-?>");
        this.expires = date;
    }

    public void updateUserInfo(User user) {
        C52711k.m112240b(user, "user");
        if (!(!C52711k.m112239a((Object) user.getUid(), (Object) this.uid))) {
            this.commonUserInfo = C21382a.m54005a(user);
        }
    }

    public BaseLoginMethod(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "DEFAULT";
        }
        LoginMethodName valueOf = LoginMethodName.valueOf(readString2);
        CommonUserInfo commonUserInfo2 = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo2 == null) {
            commonUserInfo2 = C21382a.m54004a();
        }
        this(readString, valueOf, commonUserInfo2, new Date(parcel.readLong()));
        this.lastIsReliableLogin = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.uid);
        parcel.writeString(getLoginMethodName().name());
        parcel.writeParcelable(this.commonUserInfo, i);
        parcel.writeLong(getExpires().getTime());
        parcel.writeInt(this.lastIsReliableLogin);
    }

    public BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(loginMethodName2, "loginMethodName");
        C52711k.m112240b(commonUserInfo2, "commonUserInfo");
        C52711k.m112240b(date, "expires");
        this.uid = str;
        this.loginMethodName = loginMethodName2;
        this.commonUserInfo = commonUserInfo2;
        this.expires = date;
    }

    public /* synthetic */ BaseLoginMethod(String str, LoginMethodName loginMethodName2, CommonUserInfo commonUserInfo2, Date date, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            loginMethodName2 = LoginMethodName.DEFAULT;
        }
        if ((i & 4) != 0) {
            commonUserInfo2 = C21382a.m54004a();
        }
        if ((i & 8) != 0) {
            date = new Date(System.currentTimeMillis() + 2592000000L);
        }
        this(str, loginMethodName2, commonUserInfo2, date);
    }
}

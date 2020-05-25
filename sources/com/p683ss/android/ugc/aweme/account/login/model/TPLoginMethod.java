package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a;
import com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo.C21385a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Date;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod */
public final class TPLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21384a CREATOR = new C21384a(null);
    private boolean loginFromFeedPage;
    private final String platform;
    private TPUserInfo userInfo;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.TPLoginMethod$a */
    public static final class C21384a implements Creator<TPLoginMethod> {
        private C21384a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TPLoginMethod[i];
        }

        public /* synthetic */ C21384a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new TPLoginMethod(parcel);
        }
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo) {
        this(str, str2, tPUserInfo, false, null, 24, null);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z) {
        this(str, str2, tPUserInfo, z, null, 16, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean getLoginFromFeedPage() {
        return this.loginFromFeedPage;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final TPUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final void setLoginFromFeedPage(boolean z) {
        this.loginFromFeedPage = z;
    }

    public final void setUserInfo(TPUserInfo tPUserInfo) {
        C52711k.m112240b(tPUserInfo, "<set-?>");
        this.userInfo = tPUserInfo;
    }

    public final void updateUserInfo(User user) {
        C52711k.m112240b(user, "user");
        super.updateUserInfo(user);
        if (!(!C52711k.m112239a((Object) user.getUid(), (Object) getUid()))) {
            this.userInfo = C21385a.m54006a(user);
        }
    }

    public TPLoginMethod(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String str2 = readString2;
        TPUserInfo tPUserInfo = (TPUserInfo) parcel.readParcelable(TPUserInfo.class.getClassLoader());
        if (tPUserInfo == null) {
            tPUserInfo = new TPUserInfo("", "");
        }
        this(str, str2, tPUserInfo, false, null, 24, null);
        setExpires(new Date(parcel.readLong()));
        CommonUserInfo commonUserInfo = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo == null) {
            commonUserInfo = getCommonUserInfo();
        }
        setCommonUserInfo(commonUserInfo);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(this.platform);
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeLong(getExpires().getTime());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "platform");
        C52711k.m112240b(tPUserInfo, "userInfo");
        C52711k.m112240b(commonUserInfo, "commonUserInfo");
        super(str, LoginMethodName.THIRD_PARTY, commonUserInfo, null, 8, null);
        this.platform = str2;
        this.userInfo = tPUserInfo;
        this.loginFromFeedPage = z;
    }

    public /* synthetic */ TPLoginMethod(String str, String str2, TPUserInfo tPUserInfo, boolean z, CommonUserInfo commonUserInfo, int i, C52707g gVar) {
        boolean z2;
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            commonUserInfo = C21382a.m54004a();
        }
        this(str, str2, tPUserInfo, z2, commonUserInfo);
    }
}

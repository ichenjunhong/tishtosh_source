package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a;
import java.util.Date;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod */
public final class AccountPassLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21380a CREATOR = new C21380a(null);
    private final String name;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod$a */
    public static final class C21380a implements Creator<AccountPassLoginMethod> {
        private C21380a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccountPassLoginMethod[i];
        }

        public /* synthetic */ C21380a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new AccountPassLoginMethod(parcel);
        }
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2) {
        this(str, loginMethodName, str2, null, 8, null);
    }

    public AccountPassLoginMethod(String str, String str2) {
        this(str, null, str2, null, 10, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getName() {
        return this.name;
    }

    public AccountPassLoginMethod(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "DEFAULT";
        }
        LoginMethodName valueOf = LoginMethodName.valueOf(readString2);
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this(str, valueOf, readString3, null, 8, null);
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
        parcel.writeString(getLoginMethodName().name());
        parcel.writeString(this.name);
        parcel.writeLong(getExpires().getTime());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(loginMethodName, "loginMethodName");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(commonUserInfo, "commonUserInfo");
        super(str, loginMethodName, commonUserInfo, null, 8, null);
        this.name = str2;
    }

    public /* synthetic */ AccountPassLoginMethod(String str, LoginMethodName loginMethodName, String str2, CommonUserInfo commonUserInfo, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.EMAIL_PASS;
        }
        if ((i & 8) != 0) {
            commonUserInfo = C21382a.m54004a();
        }
        this(str, loginMethodName, str2, commonUserInfo);
    }
}

package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod */
public final class PhoneLoginMethod extends BaseLoginMethod implements Parcelable {
    public static final C21383a CREATOR = new C21383a(null);
    private final C21135a phoneNumber;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod$a */
    public static final class C21383a implements Creator<PhoneLoginMethod> {
        private C21383a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhoneLoginMethod[i];
        }

        public /* synthetic */ C21383a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new PhoneLoginMethod(parcel);
        }
    }

    public PhoneLoginMethod(String str, C21135a aVar) {
        this(str, null, aVar, null, 10, null);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C21135a aVar) {
        this(str, loginMethodName, aVar, null, 8, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final C21135a getPhoneNumber() {
        return this.phoneNumber;
    }

    public PhoneLoginMethod(Parcel parcel) {
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
        this(str, LoginMethodName.valueOf(readString2), new C21135a(), null, 8, null);
        C21135a aVar = this.phoneNumber;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        aVar.setCountryIso(readString3);
        this.phoneNumber.setCountryCode(parcel.readInt());
        this.phoneNumber.setNationalNumber(parcel.readLong());
        CommonUserInfo commonUserInfo = (CommonUserInfo) parcel.readParcelable(CommonUserInfo.class.getClassLoader());
        if (commonUserInfo == null) {
            commonUserInfo = getCommonUserInfo();
        }
        setCommonUserInfo(commonUserInfo);
    }

    private final String parseNumber(String str) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (int i = 0; i < charSequence.length(); i++) {
                int digit = Character.digit(charSequence.charAt(i), 10);
                if (digit != -1) {
                    sb.append(digit);
                }
            }
        }
        if (sb.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return "0";
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(getUid());
        parcel.writeString(getLoginMethodName().name());
        CharSequence countryIso = this.phoneNumber.getCountryIso();
        if (countryIso == null || countryIso.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Locale locale = Locale.CHINA;
            C52711k.m112236a((Object) locale, "Locale.CHINA");
            parcel.writeString(locale.getCountry());
        } else {
            parcel.writeString(this.phoneNumber.getCountryIso());
        }
        parcel.writeInt(this.phoneNumber.getCountryCode());
        parcel.writeLong(this.phoneNumber.getNationalNumber());
        parcel.writeParcelable(getCommonUserInfo(), i);
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, C21135a aVar, CommonUserInfo commonUserInfo) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(loginMethodName, "loginMethodName");
        C52711k.m112240b(aVar, "phoneNumber");
        C52711k.m112240b(commonUserInfo, "commonUserInfo");
        super(str, loginMethodName, commonUserInfo, null, 8, null);
        this.phoneNumber = aVar;
    }

    public PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4) {
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(loginMethodName, "loginMethodName");
        C52711k.m112240b(str2, "countryCodeName");
        C52711k.m112240b(str3, "countryCode");
        C52711k.m112240b(str4, "nationalNumber");
        this(str, loginMethodName, new C21135a(), null, 8, null);
        this.phoneNumber.setCountryIso(str2);
        this.phoneNumber.setCountryCode(Integer.parseInt(parseNumber(str3)));
        this.phoneNumber.setNationalNumber(Long.parseLong(parseNumber(str4)));
    }

    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, C21135a aVar, CommonUserInfo commonUserInfo, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.PHONE_SMS;
        }
        if ((i & 8) != 0) {
            commonUserInfo = C21382a.m54004a();
        }
        this(str, loginMethodName, aVar, commonUserInfo);
    }

    public /* synthetic */ PhoneLoginMethod(String str, LoginMethodName loginMethodName, String str2, String str3, String str4, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.PHONE_SMS;
        }
        LoginMethodName loginMethodName2 = loginMethodName;
        if ((i & 4) != 0) {
            str2 = "";
        }
        this(str, loginMethodName2, str2, str3, str4);
    }
}

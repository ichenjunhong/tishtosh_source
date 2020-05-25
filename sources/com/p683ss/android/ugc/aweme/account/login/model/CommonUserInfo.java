package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo */
public final class CommonUserInfo implements Parcelable {
    public static final C21382a CREATOR = new C21382a(null);
    private final String avatarUrl;
    private final String secUid;
    private final String userName;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.CommonUserInfo$a */
    public static final class C21382a implements Creator<CommonUserInfo> {
        private C21382a() {
        }

        /* renamed from: a */
        public static CommonUserInfo m54004a() {
            return new CommonUserInfo("", "", "");
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CommonUserInfo[i];
        }

        public /* synthetic */ C21382a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new CommonUserInfo(parcel);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo m54005a(com.p683ss.android.ugc.aweme.profile.model.User r4) {
            /*
                java.lang.String r0 = "user"
                p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
                com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r0 = new com.ss.android.ugc.aweme.account.login.model.CommonUserInfo
                java.lang.String r1 = r4.getNickname()
                if (r1 != 0) goto L_0x000f
                java.lang.String r1 = ""
            L_0x000f:
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarThumb()
                if (r2 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarThumb()
                java.lang.String r3 = "user.avatarThumb"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x004d
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarThumb()
                java.lang.String r3 = "user.avatarThumb"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List r2 = r2.getUrlList()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0038
                goto L_0x004d
            L_0x0038:
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r4.getAvatarThumb()
                java.lang.String r3 = "user.avatarThumb"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.util.List r2 = r2.getUrlList()
                r3 = 0
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x004f
            L_0x004d:
                java.lang.String r2 = ""
            L_0x004f:
                java.lang.String r3 = "if (user.avatarThumb == …er.avatarThumb.urlList[0]"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.lang.String r4 = r4.getSecUid()
                if (r4 != 0) goto L_0x005c
                java.lang.String r4 = ""
            L_0x005c:
                r0.<init>(r1, r2, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a.m54005a(com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.account.login.model.CommonUserInfo");
        }
    }

    public static /* synthetic */ CommonUserInfo copy$default(CommonUserInfo commonUserInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = commonUserInfo.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = commonUserInfo.secUid;
        }
        return commonUserInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.secUid;
    }

    public final CommonUserInfo copy(String str, String str2, String str3) {
        C52711k.m112240b(str, "userName");
        C52711k.m112240b(str2, "avatarUrl");
        return new CommonUserInfo(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.secUid, (java.lang.Object) r3.secUid) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.account.login.model.CommonUserInfo r3 = (com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo) r3
            java.lang.String r0 = r2.userName
            java.lang.String r1 = r3.userName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.avatarUrl
            java.lang.String r1 = r3.avatarUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.secUid
            java.lang.String r3 = r3.secUid
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.equals(java.lang.Object):boolean");
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secUid;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonUserInfo(userName=");
        sb.append(this.userName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isCommonInfoAvailable() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.userName.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.avatarUrl.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                CharSequence charSequence = this.secUid;
                if (charSequence == null || charSequence.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public CommonUserInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this(readString, readString2, readString3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
        String str = this.secUid;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
    }

    public CommonUserInfo(String str, String str2, String str3) {
        C52711k.m112240b(str, "userName");
        C52711k.m112240b(str2, "avatarUrl");
        this.userName = str;
        this.avatarUrl = str2;
        this.secUid = str3;
    }
}

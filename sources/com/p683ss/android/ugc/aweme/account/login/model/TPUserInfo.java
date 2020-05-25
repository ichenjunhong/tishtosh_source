package com.p683ss.android.ugc.aweme.account.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.util.C22288y;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.model.TPUserInfo */
public final class TPUserInfo implements Parcelable {
    public static final C21385a CREATOR = new C21385a(null);
    private final String avatarUrl;
    private final String userName;

    /* renamed from: com.ss.android.ugc.aweme.account.login.model.TPUserInfo$a */
    public static final class C21385a implements Creator<TPUserInfo> {
        private C21385a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TPUserInfo[i];
        }

        public /* synthetic */ C21385a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new TPUserInfo(parcel);
        }

        /* renamed from: a */
        public static TPUserInfo m54006a(User user) {
            String str;
            String str2;
            C52711k.m112240b(user, "user");
            if (((C22475af) C23826bi.m58450a(C22475af.class)).mo46777d()) {
                str = C22288y.m55172a(user);
            } else {
                str = user.getNickname();
            }
            C52711k.m112236a((Object) str, "if (ModuleStore.getServi…(user) else user.nickname");
            if (user.getAvatarThumb() != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                C52711k.m112236a((Object) avatarThumb, "user.avatarThumb");
                if (avatarThumb.getUrlList() != null) {
                    UrlModel avatarThumb2 = user.getAvatarThumb();
                    C52711k.m112236a((Object) avatarThumb2, "user.avatarThumb");
                    if (!avatarThumb2.getUrlList().isEmpty()) {
                        UrlModel avatarThumb3 = user.getAvatarThumb();
                        C52711k.m112236a((Object) avatarThumb3, "user.avatarThumb");
                        str2 = (String) avatarThumb3.getUrlList().get(0);
                        C52711k.m112236a((Object) str2, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
                        return new TPUserInfo(str, str2);
                    }
                }
            }
            str2 = "";
            C52711k.m112236a((Object) str2, "if (user.avatarThumb == …er.avatarThumb.urlList[0]");
            return new TPUserInfo(str, str2);
        }
    }

    public static /* synthetic */ TPUserInfo copy$default(TPUserInfo tPUserInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tPUserInfo.userName;
        }
        if ((i & 2) != 0) {
            str2 = tPUserInfo.avatarUrl;
        }
        return tPUserInfo.copy(str, str2);
    }

    public static final TPUserInfo from(User user) {
        return C21385a.m54006a(user);
    }

    public final String component1() {
        return this.userName;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final TPUserInfo copy(String str, String str2) {
        C52711k.m112240b(str, "userName");
        C52711k.m112240b(str2, "avatarUrl");
        return new TPUserInfo(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.avatarUrl, (java.lang.Object) r3.avatarUrl) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.account.login.model.TPUserInfo r3 = (com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo) r3
            java.lang.String r0 = r2.userName
            java.lang.String r1 = r3.userName
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.avatarUrl
            java.lang.String r3 = r3.avatarUrl
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo.equals(java.lang.Object):boolean");
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        String str = this.userName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.avatarUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TPUserInfo(userName=");
        sb.append(this.userName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(")");
        return sb.toString();
    }

    public TPUserInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this(readString, readString2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
    }

    public TPUserInfo(String str, String str2) {
        C52711k.m112240b(str, "userName");
        C52711k.m112240b(str2, "avatarUrl");
        this.userName = str;
        this.avatarUrl = str2;
    }
}

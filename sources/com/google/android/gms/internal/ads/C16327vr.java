package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bef.effectsdk.message.MessageCenter;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vr */
public final class C16327vr implements Creator<zzaxi> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        zzaxu zzaxu = null;
        String str7 = null;
        String str8 = null;
        zzbaz zzbaz = null;
        List list4 = null;
        List list5 = null;
        zzaxk zzaxk = null;
        String str9 = null;
        List list6 = null;
        String str10 = null;
        zzbbq zzbbq = null;
        String str11 = null;
        Bundle bundle = null;
        List list7 = null;
        String str12 = null;
        String str13 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 3:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 4:
                    list = C15467a.m32170u(parcel2, a);
                    break;
                case 5:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 6:
                    list2 = C15467a.m32170u(parcel2, a);
                    break;
                case 7:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 10:
                    list3 = C15467a.m32170u(parcel2, a);
                    break;
                case 11:
                    j3 = C15467a.m32156g(parcel2, a);
                    break;
                case 12:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 13:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 14:
                    j4 = C15467a.m32156g(parcel2, a);
                    break;
                case 15:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 18:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 19:
                    str5 = C15467a.m32163n(parcel2, a);
                    break;
                case 21:
                    str6 = C15467a.m32163n(parcel2, a);
                    break;
                case 22:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 23:
                    z4 = C15467a.m32152c(parcel2, a);
                    break;
                case 24:
                    z5 = C15467a.m32152c(parcel2, a);
                    break;
                case 25:
                    z6 = C15467a.m32152c(parcel2, a);
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    z7 = C15467a.m32152c(parcel2, a);
                    break;
                case 28:
                    zzaxu = (zzaxu) C15467a.m32145a(parcel2, a, zzaxu.CREATOR);
                    break;
                case 29:
                    str7 = C15467a.m32163n(parcel2, a);
                    break;
                case 30:
                    str8 = C15467a.m32163n(parcel2, a);
                    break;
                case 31:
                    z8 = C15467a.m32152c(parcel2, a);
                    break;
                case 32:
                    z9 = C15467a.m32152c(parcel2, a);
                    break;
                case 33:
                    zzbaz = (zzbaz) C15467a.m32145a(parcel2, a, zzbaz.CREATOR);
                    break;
                case 34:
                    list4 = C15467a.m32170u(parcel2, a);
                    break;
                case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                    list5 = C15467a.m32170u(parcel2, a);
                    break;
                case 36:
                    z10 = C15467a.m32152c(parcel2, a);
                    break;
                case 37:
                    zzaxk = (zzaxk) C15467a.m32145a(parcel2, a, zzaxk.CREATOR);
                    break;
                case 38:
                    z11 = C15467a.m32152c(parcel2, a);
                    break;
                case 39:
                    str9 = C15467a.m32163n(parcel2, a);
                    break;
                case 40:
                    list6 = C15467a.m32170u(parcel2, a);
                    break;
                case 42:
                    z12 = C15467a.m32152c(parcel2, a);
                    break;
                case 43:
                    str10 = C15467a.m32163n(parcel2, a);
                    break;
                case 44:
                    zzbbq = (zzbbq) C15467a.m32145a(parcel2, a, zzbbq.CREATOR);
                    break;
                case BaseNotice.f96882AT /*45*/:
                    str11 = C15467a.m32163n(parcel2, a);
                    break;
                case 46:
                    z13 = C15467a.m32152c(parcel2, a);
                    break;
                case 47:
                    z14 = C15467a.m32152c(parcel2, a);
                    break;
                case 48:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                case 49:
                    z15 = C15467a.m32152c(parcel2, a);
                    break;
                case 50:
                    i4 = C15467a.m32154e(parcel2, a);
                    break;
                case 51:
                    z16 = C15467a.m32152c(parcel2, a);
                    break;
                case 52:
                    list7 = C15467a.m32170u(parcel2, a);
                    break;
                case 53:
                    z17 = C15467a.m32152c(parcel2, a);
                    break;
                case 54:
                    str12 = C15467a.m32163n(parcel2, a);
                    break;
                case 55:
                    str13 = C15467a.m32163n(parcel2, a);
                    break;
                case 56:
                    z18 = C15467a.m32152c(parcel2, a);
                    break;
                case 57:
                    z19 = C15467a.m32152c(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzaxi zzaxi = new zzaxi(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, zzaxu, str7, str8, z8, z9, zzbaz, list4, list5, z10, zzaxk, z11, str9, list6, z12, str10, zzbbq, str11, z13, z14, bundle, z15, i4, z16, list7, z17, str12, str13, z18, z19);
        return zzaxi;
    }
}

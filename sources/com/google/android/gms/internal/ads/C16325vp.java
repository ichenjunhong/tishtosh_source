package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bef.effectsdk.message.MessageCenter;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vp */
public final class C16325vp implements Creator<zzaxe> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        Bundle bundle = null;
        zzyv zzyv = null;
        zzyz zzyz = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzbgz zzbgz = null;
        Bundle bundle2 = null;
        int i2 = 0;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzafl zzafl = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        zzabp zzabp = null;
        boolean z6 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z7 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzaks zzaks = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                case 3:
                    zzyv = (zzyv) C15467a.m32145a(parcel2, a, zzyv.CREATOR);
                    break;
                case 4:
                    zzyz = (zzyz) C15467a.m32145a(parcel2, a, zzyz.CREATOR);
                    break;
                case 5:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C15467a.m32145a(parcel2, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C15467a.m32145a(parcel2, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 9:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 10:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 11:
                    zzbgz = (zzbgz) C15467a.m32145a(parcel2, a, zzbgz.CREATOR);
                    break;
                case 12:
                    bundle2 = C15467a.m32165p(parcel2, a);
                    break;
                case 13:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 14:
                    arrayList = C15467a.m32170u(parcel2, a);
                    break;
                case 15:
                    bundle3 = C15467a.m32165p(parcel2, a);
                    break;
                case 16:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 18:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 19:
                    i4 = C15467a.m32154e(parcel2, a);
                    break;
                case 20:
                    f = C15467a.m32159j(parcel2, a);
                    break;
                case 21:
                    str5 = C15467a.m32163n(parcel2, a);
                    break;
                case 25:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    str6 = C15467a.m32163n(parcel2, a);
                    break;
                case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                    arrayList2 = C15467a.m32170u(parcel2, a);
                    break;
                case 28:
                    str7 = C15467a.m32163n(parcel2, a);
                    break;
                case 29:
                    zzafl = (zzafl) C15467a.m32145a(parcel2, a, zzafl.CREATOR);
                    break;
                case 30:
                    arrayList3 = C15467a.m32170u(parcel2, a);
                    break;
                case 31:
                    j2 = C15467a.m32156g(parcel2, a);
                    break;
                case 33:
                    str8 = C15467a.m32163n(parcel2, a);
                    break;
                case 34:
                    f2 = C15467a.m32159j(parcel2, a);
                    break;
                case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                    i5 = C15467a.m32154e(parcel2, a);
                    break;
                case 36:
                    i6 = C15467a.m32154e(parcel2, a);
                    break;
                case 37:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 38:
                    z4 = C15467a.m32152c(parcel2, a);
                    break;
                case 39:
                    str9 = C15467a.m32163n(parcel2, a);
                    break;
                case 40:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case BaseNotice.LIKE /*41*/:
                    str10 = C15467a.m32163n(parcel2, a);
                    break;
                case 42:
                    z5 = C15467a.m32152c(parcel2, a);
                    break;
                case 43:
                    i7 = C15467a.m32154e(parcel2, a);
                    break;
                case 44:
                    bundle4 = C15467a.m32165p(parcel2, a);
                    break;
                case BaseNotice.f96882AT /*45*/:
                    str11 = C15467a.m32163n(parcel2, a);
                    break;
                case 46:
                    zzabp = (zzabp) C15467a.m32145a(parcel2, a, zzabp.CREATOR);
                    break;
                case 47:
                    z6 = C15467a.m32152c(parcel2, a);
                    break;
                case 48:
                    bundle5 = C15467a.m32165p(parcel2, a);
                    break;
                case 49:
                    str12 = C15467a.m32163n(parcel2, a);
                    break;
                case 50:
                    str13 = C15467a.m32163n(parcel2, a);
                    break;
                case 51:
                    str14 = C15467a.m32163n(parcel2, a);
                    break;
                case 52:
                    z7 = C15467a.m32152c(parcel2, a);
                    break;
                case 53:
                    int a2 = C15467a.m32144a(parcel2, a);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt = parcel.readInt();
                        for (int i9 = 0; i9 < readInt; i9++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel2.setDataPosition(dataPosition + a2);
                        arrayList4 = arrayList7;
                        break;
                    } else {
                        arrayList4 = null;
                        break;
                    }
                case 54:
                    str15 = C15467a.m32163n(parcel2, a);
                    break;
                case 55:
                    arrayList5 = C15467a.m32170u(parcel2, a);
                    break;
                case 56:
                    i8 = C15467a.m32154e(parcel2, a);
                    break;
                case 57:
                    z8 = C15467a.m32152c(parcel2, a);
                    break;
                case 58:
                    z9 = C15467a.m32152c(parcel2, a);
                    break;
                case 59:
                    z10 = C15467a.m32152c(parcel2, a);
                    break;
                case 60:
                    arrayList6 = C15467a.m32170u(parcel2, a);
                    break;
                case BaseNotice.TCM /*61*/:
                    str16 = C15467a.m32163n(parcel2, a);
                    break;
                case 63:
                    zzaks = (zzaks) C15467a.m32145a(parcel2, a, zzaks.CREATOR);
                    break;
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    str17 = C15467a.m32163n(parcel2, a);
                    break;
                case 65:
                    bundle6 = C15467a.m32165p(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzaxe zzaxe = new zzaxe(i, bundle, zzyv, zzyz, str, applicationInfo, packageInfo, str2, str3, str4, zzbgz, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzafl, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzabp, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10, arrayList6, str16, zzaks, str17, bundle6);
        return zzaxe;
    }
}

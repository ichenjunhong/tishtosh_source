package com.p683ss.android.ugc.aweme.familiar;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.familiar.DuoshanSyncProp */
public final class DuoshanSyncProp {
    @C17952c(mo34828a = "avatar_urls")
    public final DuoshanUrlModel[] avatarUrls;
    @C17952c(mo34828a = "sync_duoshan_cmpl_toast")
    public final String cmplToast;
    @C17952c(mo34828a = "enable_sync_to_duoshan")
    public final boolean enableSyncToDuoshan;
    @C17952c(mo34828a = "sync_to_duoshan_guide_frequency")
    public final int guideFrequency;
    @C17952c(mo34828a = "sync_to_duoshan_guide_interval")
    public final long guideInterval;
    @C17952c(mo34828a = "is_registered_duoshan")
    public final boolean isRegisterDuoshan;
    @C17952c(mo34828a = "sync_to_duoshan_popup_frequency")
    public final int popupFrequency;
    @C17952c(mo34828a = "sync_to_duoshan_popup_interval")
    public final long popupInterval;
    @C17952c(mo34828a = "sync_duoshan_relation_count_toast")
    public final String relationCountToast;
    @C17952c(mo34828a = "sync_duoshan_relation_desc_toast")
    public final String relationDescToast;
    @C17952c(mo34828a = "sync_duoshan_relation_toast")
    public final String relationToast;
    @C17952c(mo34828a = "sync_history_to_duoshan_toast")
    public final String syncAllText;
    @C17952c(mo34828a = "sync_single_to_duoshan_toast")
    public final String syncSingleText;
    @C17952c(mo34828a = "synced_history_to_duoshan")
    public final boolean syncedHistoryToDuoshan;
    @C17952c(mo34828a = "sync_to_duoshan_toast_frequency")
    public final int toastFrequency;

    public DuoshanSyncProp() {
        this(false, null, null, 0, null, null, null, null, null, false, false, 0, 0, 0, 0, 32767, null);
    }

    public static /* synthetic */ DuoshanSyncProp copy$default(DuoshanSyncProp duoshanSyncProp, boolean z, String str, DuoshanUrlModel[] duoshanUrlModelArr, int i, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, int i2, long j, int i3, long j2, int i4, Object obj) {
        int i5;
        long j3;
        DuoshanSyncProp duoshanSyncProp2 = duoshanSyncProp;
        int i6 = i4;
        boolean z4 = (i6 & 1) != 0 ? duoshanSyncProp2.enableSyncToDuoshan : z;
        String str7 = (i6 & 2) != 0 ? duoshanSyncProp2.relationToast : str;
        DuoshanUrlModel[] duoshanUrlModelArr2 = (i6 & 4) != 0 ? duoshanSyncProp2.avatarUrls : duoshanUrlModelArr;
        int i7 = (i6 & 8) != 0 ? duoshanSyncProp2.toastFrequency : i;
        String str8 = (i6 & 16) != 0 ? duoshanSyncProp2.cmplToast : str2;
        String str9 = (i6 & 32) != 0 ? duoshanSyncProp2.relationCountToast : str3;
        String str10 = (i6 & 64) != 0 ? duoshanSyncProp2.relationDescToast : str4;
        String str11 = (i6 & 128) != 0 ? duoshanSyncProp2.syncAllText : str5;
        String str12 = (i6 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? duoshanSyncProp2.syncSingleText : str6;
        boolean z5 = (i6 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? duoshanSyncProp2.syncedHistoryToDuoshan : z2;
        boolean z6 = (i6 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? duoshanSyncProp2.isRegisterDuoshan : z3;
        int i8 = (i6 & 2048) != 0 ? duoshanSyncProp2.popupFrequency : i2;
        long j4 = (i6 & 4096) != 0 ? duoshanSyncProp2.popupInterval : j;
        int i9 = (i6 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? duoshanSyncProp2.guideFrequency : i3;
        if ((i6 & 16384) != 0) {
            i5 = i9;
            j3 = duoshanSyncProp2.guideInterval;
        } else {
            i5 = i9;
            j3 = j2;
        }
        return duoshanSyncProp.copy(z4, str7, duoshanUrlModelArr2, i7, str8, str9, str10, str11, str12, z5, z6, i8, j4, i5, j3);
    }

    public final boolean component1() {
        return this.enableSyncToDuoshan;
    }

    public final boolean component10() {
        return this.syncedHistoryToDuoshan;
    }

    public final boolean component11() {
        return this.isRegisterDuoshan;
    }

    public final int component12() {
        return this.popupFrequency;
    }

    public final long component13() {
        return this.popupInterval;
    }

    public final int component14() {
        return this.guideFrequency;
    }

    public final long component15() {
        return this.guideInterval;
    }

    public final String component2() {
        return this.relationToast;
    }

    public final DuoshanUrlModel[] component3() {
        return this.avatarUrls;
    }

    public final int component4() {
        return this.toastFrequency;
    }

    public final String component5() {
        return this.cmplToast;
    }

    public final String component6() {
        return this.relationCountToast;
    }

    public final String component7() {
        return this.relationDescToast;
    }

    public final String component8() {
        return this.syncAllText;
    }

    public final String component9() {
        return this.syncSingleText;
    }

    public final DuoshanSyncProp copy(boolean z, String str, DuoshanUrlModel[] duoshanUrlModelArr, int i, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, int i2, long j, int i3, long j2) {
        DuoshanSyncProp duoshanSyncProp = new DuoshanSyncProp(z, str, duoshanUrlModelArr, i, str2, str3, str4, str5, str6, z2, z3, i2, j, i3, j2);
        return duoshanSyncProp;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DuoshanSyncProp) {
                DuoshanSyncProp duoshanSyncProp = (DuoshanSyncProp) obj;
                if ((this.enableSyncToDuoshan == duoshanSyncProp.enableSyncToDuoshan) && C52711k.m112239a((Object) this.relationToast, (Object) duoshanSyncProp.relationToast) && C52711k.m112239a((Object) this.avatarUrls, (Object) duoshanSyncProp.avatarUrls)) {
                    if ((this.toastFrequency == duoshanSyncProp.toastFrequency) && C52711k.m112239a((Object) this.cmplToast, (Object) duoshanSyncProp.cmplToast) && C52711k.m112239a((Object) this.relationCountToast, (Object) duoshanSyncProp.relationCountToast) && C52711k.m112239a((Object) this.relationDescToast, (Object) duoshanSyncProp.relationDescToast) && C52711k.m112239a((Object) this.syncAllText, (Object) duoshanSyncProp.syncAllText) && C52711k.m112239a((Object) this.syncSingleText, (Object) duoshanSyncProp.syncSingleText)) {
                        if (this.syncedHistoryToDuoshan == duoshanSyncProp.syncedHistoryToDuoshan) {
                            if (this.isRegisterDuoshan == duoshanSyncProp.isRegisterDuoshan) {
                                if (this.popupFrequency == duoshanSyncProp.popupFrequency) {
                                    if (this.popupInterval == duoshanSyncProp.popupInterval) {
                                        if (this.guideFrequency == duoshanSyncProp.guideFrequency) {
                                            if (this.guideInterval == duoshanSyncProp.guideInterval) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final DuoshanUrlModel[] getAvatarUrls() {
        return this.avatarUrls;
    }

    public final String getCmplToast() {
        return this.cmplToast;
    }

    public final boolean getEnableSyncToDuoshan() {
        return this.enableSyncToDuoshan;
    }

    public final int getGuideFrequency() {
        return this.guideFrequency;
    }

    public final long getGuideInterval() {
        return this.guideInterval;
    }

    public final int getPopupFrequency() {
        return this.popupFrequency;
    }

    public final long getPopupInterval() {
        return this.popupInterval;
    }

    public final String getRelationCountToast() {
        return this.relationCountToast;
    }

    public final String getRelationDescToast() {
        return this.relationDescToast;
    }

    public final String getRelationToast() {
        return this.relationToast;
    }

    public final String getSyncAllText() {
        return this.syncAllText;
    }

    public final String getSyncSingleText() {
        return this.syncSingleText;
    }

    public final boolean getSyncedHistoryToDuoshan() {
        return this.syncedHistoryToDuoshan;
    }

    public final int getToastFrequency() {
        return this.toastFrequency;
    }

    public final int hashCode() {
        boolean z = this.enableSyncToDuoshan;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        String str = this.relationToast;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        DuoshanUrlModel[] duoshanUrlModelArr = this.avatarUrls;
        int hashCode2 = (((hashCode + (duoshanUrlModelArr != null ? Arrays.hashCode(duoshanUrlModelArr) : 0)) * 31) + this.toastFrequency) * 31;
        String str2 = this.cmplToast;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.relationCountToast;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.relationDescToast;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.syncAllText;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.syncSingleText;
        if (str6 != null) {
            i3 = str6.hashCode();
        }
        int i4 = (hashCode6 + i3) * 31;
        boolean z2 = this.syncedHistoryToDuoshan;
        if (z2) {
            z2 = true;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isRegisterDuoshan;
        if (!z3) {
            i = z3;
        }
        int i6 = (((i5 + i) * 31) + this.popupFrequency) * 31;
        long j = this.popupInterval;
        int i7 = (((i6 + ((int) (j ^ (j >>> 32)))) * 31) + this.guideFrequency) * 31;
        long j2 = this.guideInterval;
        return i7 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean isRegisterDuoshan() {
        return this.isRegisterDuoshan;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuoshanSyncProp(enableSyncToDuoshan=");
        sb.append(this.enableSyncToDuoshan);
        sb.append(", relationToast=");
        sb.append(this.relationToast);
        sb.append(", avatarUrls=");
        sb.append(Arrays.toString(this.avatarUrls));
        sb.append(", toastFrequency=");
        sb.append(this.toastFrequency);
        sb.append(", cmplToast=");
        sb.append(this.cmplToast);
        sb.append(", relationCountToast=");
        sb.append(this.relationCountToast);
        sb.append(", relationDescToast=");
        sb.append(this.relationDescToast);
        sb.append(", syncAllText=");
        sb.append(this.syncAllText);
        sb.append(", syncSingleText=");
        sb.append(this.syncSingleText);
        sb.append(", syncedHistoryToDuoshan=");
        sb.append(this.syncedHistoryToDuoshan);
        sb.append(", isRegisterDuoshan=");
        sb.append(this.isRegisterDuoshan);
        sb.append(", popupFrequency=");
        sb.append(this.popupFrequency);
        sb.append(", popupInterval=");
        sb.append(this.popupInterval);
        sb.append(", guideFrequency=");
        sb.append(this.guideFrequency);
        sb.append(", guideInterval=");
        sb.append(this.guideInterval);
        sb.append(")");
        return sb.toString();
    }

    public DuoshanSyncProp(boolean z, String str, DuoshanUrlModel[] duoshanUrlModelArr, int i, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, int i2, long j, int i3, long j2) {
        this.enableSyncToDuoshan = z;
        this.relationToast = str;
        this.avatarUrls = duoshanUrlModelArr;
        this.toastFrequency = i;
        this.cmplToast = str2;
        this.relationCountToast = str3;
        this.relationDescToast = str4;
        this.syncAllText = str5;
        this.syncSingleText = str6;
        this.syncedHistoryToDuoshan = z2;
        this.isRegisterDuoshan = z3;
        this.popupFrequency = i2;
        this.popupInterval = j;
        this.guideFrequency = i3;
        this.guideInterval = j2;
    }

    public /* synthetic */ DuoshanSyncProp(boolean z, String str, DuoshanUrlModel[] duoshanUrlModelArr, int i, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3, int i2, long j, int i3, long j2, int i4, C52707g gVar) {
        boolean z4;
        String str7;
        DuoshanUrlModel[] duoshanUrlModelArr2;
        int i5;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z5;
        boolean z6;
        int i6;
        long j3;
        int i7 = i4;
        int i8 = 0;
        if ((i7 & 1) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i7 & 2) != 0) {
            str7 = "";
        } else {
            str7 = str;
        }
        if ((i7 & 4) != 0) {
            duoshanUrlModelArr2 = null;
        } else {
            duoshanUrlModelArr2 = duoshanUrlModelArr;
        }
        if ((i7 & 8) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i7 & 16) != 0) {
            str8 = "";
        } else {
            str8 = str2;
        }
        if ((i7 & 32) != 0) {
            str9 = "";
        } else {
            str9 = str3;
        }
        if ((i7 & 64) != 0) {
            str10 = "";
        } else {
            str10 = str4;
        }
        if ((i7 & 128) != 0) {
            str11 = "";
        } else {
            str11 = str5;
        }
        if ((i7 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            str12 = "";
        } else {
            str12 = str6;
        }
        if ((i7 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i7 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i7 & 2048) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        long j4 = 0;
        if ((i7 & 4096) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i7 & VideoCacheReadBuffersizeExperiment.DEFAULT) == 0) {
            i8 = i3;
        }
        if ((i7 & 16384) == 0) {
            j4 = j2;
        }
        this(z4, str7, duoshanUrlModelArr2, i5, str8, str9, str10, str11, str12, z5, z6, i6, j3, i8, j4);
    }
}

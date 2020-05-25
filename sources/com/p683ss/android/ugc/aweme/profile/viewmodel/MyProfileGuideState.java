package com.p683ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.p1465bs.C24047a;
import com.p683ss.android.ugc.aweme.profile.model.SafeInfoNoticeMsg;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.vcd.C50511j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState */
public final class MyProfileGuideState implements C11932s {
    public static final C40596a Companion = new C40596a(null);
    private final boolean avatarHasLoaded;
    private final Integer currentDownloadSetting;
    private final boolean hasGuideShowed;
    private final boolean hasPermissionPopUp;
    private final Boolean hasSafeInfoNoticeMsg;
    private final boolean hasSurveyDetermined;
    private final boolean needCheckI18nRecommendUserDialog;
    private final Boolean needShowDiskManagerGuide;
    private final boolean postListHasLoaded;
    private final SafeInfoNoticeMsg safeInfoNoticeMsg;
    private final C24047a surveyData;
    private final C50511j vcdGuideData;
    private final boolean vcdGuideLoaded;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState$a */
    public static final class C40596a {
        private C40596a() {
        }

        public /* synthetic */ C40596a(C52707g gVar) {
            this();
        }
    }

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, null, null, false, null, false, false, 8191, null);
    }

    public static /* synthetic */ MyProfileGuideState copy$default(MyProfileGuideState myProfileGuideState, boolean z, boolean z2, boolean z3, boolean z4, C24047a aVar, Boolean bool, Boolean bool2, SafeInfoNoticeMsg safeInfoNoticeMsg2, Integer num, boolean z5, C50511j jVar, boolean z6, boolean z7, int i, Object obj) {
        MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
        int i2 = i;
        return myProfileGuideState.copy((i2 & 1) != 0 ? myProfileGuideState2.hasGuideShowed : z, (i2 & 2) != 0 ? myProfileGuideState2.postListHasLoaded : z2, (i2 & 4) != 0 ? myProfileGuideState2.avatarHasLoaded : z3, (i2 & 8) != 0 ? myProfileGuideState2.hasSurveyDetermined : z4, (i2 & 16) != 0 ? myProfileGuideState2.surveyData : aVar, (i2 & 32) != 0 ? myProfileGuideState2.needShowDiskManagerGuide : bool, (i2 & 64) != 0 ? myProfileGuideState2.hasSafeInfoNoticeMsg : bool2, (i2 & 128) != 0 ? myProfileGuideState2.safeInfoNoticeMsg : safeInfoNoticeMsg2, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? myProfileGuideState2.currentDownloadSetting : num, (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? myProfileGuideState2.vcdGuideLoaded : z5, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? myProfileGuideState2.vcdGuideData : jVar, (i2 & 2048) != 0 ? myProfileGuideState2.hasPermissionPopUp : z6, (i2 & 4096) != 0 ? myProfileGuideState2.needCheckI18nRecommendUserDialog : z7);
    }

    public final boolean component1() {
        return this.hasGuideShowed;
    }

    public final boolean component10() {
        return this.vcdGuideLoaded;
    }

    public final C50511j component11() {
        return this.vcdGuideData;
    }

    public final boolean component12() {
        return this.hasPermissionPopUp;
    }

    public final boolean component13() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final boolean component2() {
        return this.postListHasLoaded;
    }

    public final boolean component3() {
        return this.avatarHasLoaded;
    }

    public final boolean component4() {
        return this.hasSurveyDetermined;
    }

    public final C24047a component5() {
        return this.surveyData;
    }

    public final Boolean component6() {
        return this.needShowDiskManagerGuide;
    }

    public final Boolean component7() {
        return this.hasSafeInfoNoticeMsg;
    }

    public final SafeInfoNoticeMsg component8() {
        return this.safeInfoNoticeMsg;
    }

    public final Integer component9() {
        return this.currentDownloadSetting;
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, C24047a aVar, Boolean bool, Boolean bool2, SafeInfoNoticeMsg safeInfoNoticeMsg2, Integer num, boolean z5, C50511j jVar, boolean z6, boolean z7) {
        MyProfileGuideState myProfileGuideState = new MyProfileGuideState(z, z2, z3, z4, aVar, bool, bool2, safeInfoNoticeMsg2, num, z5, jVar, z6, z7);
        return myProfileGuideState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MyProfileGuideState) {
                MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
                if (this.hasGuideShowed == myProfileGuideState.hasGuideShowed) {
                    if (this.postListHasLoaded == myProfileGuideState.postListHasLoaded) {
                        if (this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded) {
                            if ((this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined) && C52711k.m112239a((Object) this.surveyData, (Object) myProfileGuideState.surveyData) && C52711k.m112239a((Object) this.needShowDiskManagerGuide, (Object) myProfileGuideState.needShowDiskManagerGuide) && C52711k.m112239a((Object) this.hasSafeInfoNoticeMsg, (Object) myProfileGuideState.hasSafeInfoNoticeMsg) && C52711k.m112239a((Object) this.safeInfoNoticeMsg, (Object) myProfileGuideState.safeInfoNoticeMsg) && C52711k.m112239a((Object) this.currentDownloadSetting, (Object) myProfileGuideState.currentDownloadSetting)) {
                                if ((this.vcdGuideLoaded == myProfileGuideState.vcdGuideLoaded) && C52711k.m112239a((Object) this.vcdGuideData, (Object) myProfileGuideState.vcdGuideData)) {
                                    if (this.hasPermissionPopUp == myProfileGuideState.hasPermissionPopUp) {
                                        if (this.needCheckI18nRecommendUserDialog == myProfileGuideState.needCheckI18nRecommendUserDialog) {
                                            return true;
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

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasPermissionPopUp() {
        return this.hasPermissionPopUp;
    }

    public final Boolean getHasSafeInfoNoticeMsg() {
        return this.hasSafeInfoNoticeMsg;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final boolean getNeedCheckI18nRecommendUserDialog() {
        return this.needCheckI18nRecommendUserDialog;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final SafeInfoNoticeMsg getSafeInfoNoticeMsg() {
        return this.safeInfoNoticeMsg;
    }

    public final C24047a getSurveyData() {
        return this.surveyData;
    }

    public final C50511j getVcdGuideData() {
        return this.vcdGuideData;
    }

    public final boolean getVcdGuideLoaded() {
        return this.vcdGuideLoaded;
    }

    public final int hashCode() {
        boolean z = this.hasGuideShowed;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.postListHasLoaded;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.avatarHasLoaded;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasSurveyDetermined;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        C24047a aVar = this.surveyData;
        int i6 = 0;
        int hashCode = (i5 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.hasSafeInfoNoticeMsg;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        SafeInfoNoticeMsg safeInfoNoticeMsg2 = this.safeInfoNoticeMsg;
        int hashCode4 = (hashCode3 + (safeInfoNoticeMsg2 != null ? safeInfoNoticeMsg2.hashCode() : 0)) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z5 = this.vcdGuideLoaded;
        if (z5) {
            z5 = true;
        }
        int i7 = (hashCode5 + (z5 ? 1 : 0)) * 31;
        C50511j jVar = this.vcdGuideData;
        if (jVar != null) {
            i6 = jVar.hashCode();
        }
        int i8 = (i7 + i6) * 31;
        boolean z6 = this.hasPermissionPopUp;
        if (z6) {
            z6 = true;
        }
        int i9 = (i8 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.needCheckI18nRecommendUserDialog;
        if (!z7) {
            i = z7;
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyProfileGuideState(hasGuideShowed=");
        sb.append(this.hasGuideShowed);
        sb.append(", postListHasLoaded=");
        sb.append(this.postListHasLoaded);
        sb.append(", avatarHasLoaded=");
        sb.append(this.avatarHasLoaded);
        sb.append(", hasSurveyDetermined=");
        sb.append(this.hasSurveyDetermined);
        sb.append(", surveyData=");
        sb.append(this.surveyData);
        sb.append(", needShowDiskManagerGuide=");
        sb.append(this.needShowDiskManagerGuide);
        sb.append(", hasSafeInfoNoticeMsg=");
        sb.append(this.hasSafeInfoNoticeMsg);
        sb.append(", safeInfoNoticeMsg=");
        sb.append(this.safeInfoNoticeMsg);
        sb.append(", currentDownloadSetting=");
        sb.append(this.currentDownloadSetting);
        sb.append(", vcdGuideLoaded=");
        sb.append(this.vcdGuideLoaded);
        sb.append(", vcdGuideData=");
        sb.append(this.vcdGuideData);
        sb.append(", hasPermissionPopUp=");
        sb.append(this.hasPermissionPopUp);
        sb.append(", needCheckI18nRecommendUserDialog=");
        sb.append(this.needCheckI18nRecommendUserDialog);
        sb.append(")");
        return sb.toString();
    }

    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C24047a aVar, Boolean bool, Boolean bool2, SafeInfoNoticeMsg safeInfoNoticeMsg2, Integer num, boolean z5, C50511j jVar, boolean z6, boolean z7) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = aVar;
        this.needShowDiskManagerGuide = bool;
        this.hasSafeInfoNoticeMsg = bool2;
        this.safeInfoNoticeMsg = safeInfoNoticeMsg2;
        this.currentDownloadSetting = num;
        this.vcdGuideLoaded = z5;
        this.vcdGuideData = jVar;
        this.hasPermissionPopUp = z6;
        this.needCheckI18nRecommendUserDialog = z7;
    }

    public /* synthetic */ MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, C24047a aVar, Boolean bool, Boolean bool2, SafeInfoNoticeMsg safeInfoNoticeMsg2, Integer num, boolean z5, C50511j jVar, boolean z6, boolean z7, int i, C52707g gVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C24047a aVar2;
        Boolean bool3;
        Boolean bool4;
        SafeInfoNoticeMsg safeInfoNoticeMsg3;
        Integer num2;
        boolean z12;
        boolean z13;
        int i2 = i;
        boolean z14 = false;
        if ((i2 & 1) != 0) {
            z8 = false;
        } else {
            z8 = z;
        }
        if ((i2 & 2) != 0) {
            z9 = false;
        } else {
            z9 = z2;
        }
        if ((i2 & 4) != 0) {
            z10 = false;
        } else {
            z10 = z3;
        }
        if ((i2 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z4;
        }
        C50511j jVar2 = null;
        if ((i2 & 16) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 32) != 0) {
            bool3 = null;
        } else {
            bool3 = bool;
        }
        if ((i2 & 64) != 0) {
            bool4 = null;
        } else {
            bool4 = bool2;
        }
        if ((i2 & 128) != 0) {
            safeInfoNoticeMsg3 = null;
        } else {
            safeInfoNoticeMsg3 = safeInfoNoticeMsg2;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            z12 = false;
        } else {
            z12 = z5;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) == 0) {
            jVar2 = jVar;
        }
        if ((i2 & 2048) == 0) {
            z14 = z6;
        }
        if ((i2 & 4096) != 0) {
            z13 = true;
        } else {
            z13 = z7;
        }
        this(z8, z9, z10, z11, aVar2, bool3, bool4, safeInfoNoticeMsg3, num2, z12, jVar2, z14, z13);
    }
}

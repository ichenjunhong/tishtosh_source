package com.p683ss.android.ugc.aweme.recommend;

import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.C11865l;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserListState */
public final class RecommendUserListState implements ICommonListState<User> {
    private final boolean isMySelf;
    private final C41112h recommendMobParams;
    private final int recommendUserType;
    private final String reportId;
    private final String secUserId;
    private final ListState<User, C11865l> substate;
    private final String userId;

    public RecommendUserListState() {
        this(null, null, false, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ RecommendUserListState copy$default(RecommendUserListState recommendUserListState, String str, String str2, boolean z, int i, String str3, C41112h hVar, ListState listState, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recommendUserListState.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = recommendUserListState.secUserId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            z = recommendUserListState.isMySelf;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = recommendUserListState.recommendUserType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = recommendUserListState.reportId;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            hVar = recommendUserListState.recommendMobParams;
        }
        C41112h hVar2 = hVar;
        if ((i2 & 64) != 0) {
            listState = recommendUserListState.getSubstate();
        }
        return recommendUserListState.copy(str, str4, z2, i3, str5, hVar2, listState);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isMySelf;
    }

    public final int component4() {
        return this.recommendUserType;
    }

    public final String component5() {
        return this.reportId;
    }

    public final C41112h component6() {
        return this.recommendMobParams;
    }

    public final ListState<User, C11865l> component7() {
        return getSubstate();
    }

    public final RecommendUserListState copy(String str, String str2, boolean z, int i, String str3, C41112h hVar, ListState<User, C11865l> listState) {
        String str4 = str;
        C52711k.m112240b(str, "userId");
        String str5 = str2;
        C52711k.m112240b(str2, "secUserId");
        String str6 = str3;
        C52711k.m112240b(str3, "reportId");
        C41112h hVar2 = hVar;
        C52711k.m112240b(hVar, "recommendMobParams");
        ListState<User, C11865l> listState2 = listState;
        C52711k.m112240b(listState2, "substate");
        RecommendUserListState recommendUserListState = new RecommendUserListState(str4, str5, z, i, str6, hVar2, listState2);
        return recommendUserListState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecommendUserListState) {
                RecommendUserListState recommendUserListState = (RecommendUserListState) obj;
                if (C52711k.m112239a((Object) this.userId, (Object) recommendUserListState.userId) && C52711k.m112239a((Object) this.secUserId, (Object) recommendUserListState.secUserId)) {
                    if (this.isMySelf == recommendUserListState.isMySelf) {
                        if (!(this.recommendUserType == recommendUserListState.recommendUserType) || !C52711k.m112239a((Object) this.reportId, (Object) recommendUserListState.reportId) || !C52711k.m112239a((Object) this.recommendMobParams, (Object) recommendUserListState.recommendMobParams) || !C52711k.m112239a((Object) getSubstate(), (Object) recommendUserListState.getSubstate())) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C41112h getRecommendMobParams() {
        return this.recommendMobParams;
    }

    public final int getRecommendUserType() {
        return this.recommendUserType;
    }

    public final String getReportId() {
        return this.reportId;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final ListState<User, C11865l> getSubstate() {
        return this.substate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isMySelf;
        if (z) {
            z = true;
        }
        int hashCode3 = (((hashCode2 + (z ? 1 : 0)) * 31) + Integer.hashCode(this.recommendUserType)) * 31;
        String str3 = this.reportId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C41112h hVar = this.recommendMobParams;
        int hashCode5 = (hashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        ListState substate2 = getSubstate();
        if (substate2 != null) {
            i = substate2.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean isMySelf() {
        return this.isMySelf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendUserListState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", isMySelf=");
        sb.append(this.isMySelf);
        sb.append(", recommendUserType=");
        sb.append(this.recommendUserType);
        sb.append(", reportId=");
        sb.append(this.reportId);
        sb.append(", recommendMobParams=");
        sb.append(this.recommendMobParams);
        sb.append(", substate=");
        sb.append(getSubstate());
        sb.append(")");
        return sb.toString();
    }

    public final NestedState<ListState<User, C11865l>> newSubstate(ListState<User, C11865l> listState) {
        C52711k.m112240b(listState, "sub");
        return copy$default(this, null, null, false, 0, null, null, listState, 63, null);
    }

    public RecommendUserListState(String str, String str2, boolean z, int i, String str3, C41112h hVar, ListState<User, C11865l> listState) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(str3, "reportId");
        C52711k.m112240b(hVar, "recommendMobParams");
        C52711k.m112240b(listState, "substate");
        this.userId = str;
        this.secUserId = str2;
        this.isMySelf = z;
        this.recommendUserType = i;
        this.reportId = str3;
        this.recommendMobParams = hVar;
        this.substate = listState;
    }

    public /* synthetic */ RecommendUserListState(String str, String str2, boolean z, int i, String str3, C41112h hVar, ListState listState, int i2, C52707g gVar) {
        String str4;
        String str5;
        boolean z2;
        int i3;
        String str6;
        C41112h hVar2;
        ListState listState2;
        if ((i2 & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i2 & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i2 & 32) != 0) {
            hVar2 = new C41112h(null, null, null, 7, null);
        } else {
            hVar2 = hVar;
        }
        if ((i2 & 64) != 0) {
            listState2 = new ListState(new C11865l(false, 0, 3, null), null, null, null, null, 30, null);
        } else {
            listState2 = listState;
        }
        this(str4, str5, z2, i3, str6, hVar2, listState2);
    }
}

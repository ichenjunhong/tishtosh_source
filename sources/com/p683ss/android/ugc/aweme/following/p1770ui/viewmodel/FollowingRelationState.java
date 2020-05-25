package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.following.repository.C32041i;
import java.util.HashMap;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState */
public final class FollowingRelationState implements C11932s {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final boolean isSelf;
    private final ListState<Object, C32041i> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    public FollowingRelationState() {
        this(null, null, false, null, null, false, 0, null, null, null, 1023, null);
    }

    public static /* synthetic */ FollowingRelationState copy$default(FollowingRelationState followingRelationState, String str, String str2, boolean z, List list, ListState listState2, boolean z2, int i, String str3, HashMap hashMap, List list2, int i2, Object obj) {
        FollowingRelationState followingRelationState2 = followingRelationState;
        int i3 = i2;
        return followingRelationState.copy((i3 & 1) != 0 ? followingRelationState2.userId : str, (i3 & 2) != 0 ? followingRelationState2.secUserId : str2, (i3 & 4) != 0 ? followingRelationState2.isSelf : z, (i3 & 8) != 0 ? followingRelationState2.recommendList : list, (i3 & 16) != 0 ? followingRelationState2.listState : listState2, (i3 & 32) != 0 ? followingRelationState2.isHotsoonHasMore : z2, (i3 & 64) != 0 ? followingRelationState2.vcdCount : i, (i3 & 128) != 0 ? followingRelationState2.hotsoonText : str3, (i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? followingRelationState2.unreadCountMap : hashMap, (i3 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? followingRelationState2.unreadUidList : list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final List<String> component10() {
        return this.unreadUidList;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isSelf;
    }

    public final List<Object> component4() {
        return this.recommendList;
    }

    public final ListState<Object, C32041i> component5() {
        return this.listState;
    }

    public final boolean component6() {
        return this.isHotsoonHasMore;
    }

    public final int component7() {
        return this.vcdCount;
    }

    public final String component8() {
        return this.hotsoonText;
    }

    public final HashMap<String, Integer> component9() {
        return this.unreadCountMap;
    }

    public final FollowingRelationState copy(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, C32041i> listState2, boolean z2, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        String str4 = str;
        C52711k.m112240b(str, "userId");
        String str5 = str2;
        C52711k.m112240b(str2, "secUserId");
        List<? extends Object> list3 = list;
        C52711k.m112240b(list3, "recommendList");
        ListState<Object, C32041i> listState3 = listState2;
        C52711k.m112240b(listState3, "listState");
        String str6 = str3;
        C52711k.m112240b(str6, "hotsoonText");
        HashMap<String, Integer> hashMap2 = hashMap;
        C52711k.m112240b(hashMap2, "unreadCountMap");
        List<String> list4 = list2;
        C52711k.m112240b(list4, "unreadUidList");
        FollowingRelationState followingRelationState = new FollowingRelationState(str4, str5, z, list3, listState3, z2, i, str6, hashMap2, list4);
        return followingRelationState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowingRelationState) {
                FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                if (C52711k.m112239a((Object) this.userId, (Object) followingRelationState.userId) && C52711k.m112239a((Object) this.secUserId, (Object) followingRelationState.secUserId)) {
                    if ((this.isSelf == followingRelationState.isSelf) && C52711k.m112239a((Object) this.recommendList, (Object) followingRelationState.recommendList) && C52711k.m112239a((Object) this.listState, (Object) followingRelationState.listState)) {
                        if (this.isHotsoonHasMore == followingRelationState.isHotsoonHasMore) {
                            if (!(this.vcdCount == followingRelationState.vcdCount) || !C52711k.m112239a((Object) this.hotsoonText, (Object) followingRelationState.hotsoonText) || !C52711k.m112239a((Object) this.unreadCountMap, (Object) followingRelationState.unreadCountMap) || !C52711k.m112239a((Object) this.unreadUidList, (Object) followingRelationState.unreadUidList)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<Object, C32041i> getListState() {
        return this.listState;
    }

    public final List<Object> getRecommendList() {
        return this.recommendList;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSelf;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        List<Object> list = this.recommendList;
        int hashCode3 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C32041i> listState2 = this.listState;
        int hashCode4 = (hashCode3 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        boolean z2 = this.isHotsoonHasMore;
        if (z2) {
            z2 = true;
        }
        int hashCode5 = (((hashCode4 + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.vcdCount)) * 31;
        String str3 = this.hotsoonText;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode7 = (hashCode6 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list2 = this.unreadUidList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode7 + i;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowingRelationState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", isSelf=");
        sb.append(this.isSelf);
        sb.append(", recommendList=");
        sb.append(this.recommendList);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(", isHotsoonHasMore=");
        sb.append(this.isHotsoonHasMore);
        sb.append(", vcdCount=");
        sb.append(this.vcdCount);
        sb.append(", hotsoonText=");
        sb.append(this.hotsoonText);
        sb.append(", unreadCountMap=");
        sb.append(this.unreadCountMap);
        sb.append(", unreadUidList=");
        sb.append(this.unreadUidList);
        sb.append(")");
        return sb.toString();
    }

    public FollowingRelationState(String str, String str2, boolean z, List<? extends Object> list, ListState<Object, C32041i> listState2, boolean z2, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(list, "recommendList");
        C52711k.m112240b(listState2, "listState");
        C52711k.m112240b(str3, "hotsoonText");
        C52711k.m112240b(hashMap, "unreadCountMap");
        C52711k.m112240b(list2, "unreadUidList");
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.recommendList = list;
        this.listState = listState2;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list2;
    }

    public /* synthetic */ FollowingRelationState(String str, String str2, boolean z, List list, ListState listState2, boolean z2, int i, String str3, HashMap hashMap, List list2, int i2, C52707g gVar) {
        String str4;
        String str5;
        boolean z3;
        List list3;
        ListState listState3;
        boolean z4;
        String str6;
        HashMap hashMap2;
        List list4;
        int i3 = i2;
        if ((i3 & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i3 & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        int i4 = 0;
        if ((i3 & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i3 & 8) != 0) {
            list3 = C52575l.m112097a();
        } else {
            list3 = list;
        }
        if ((i3 & 16) != 0) {
            C32041i iVar = new C32041i(false, 0, 0, false, 0, 0, 63, null);
            listState3 = new ListState(iVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        if ((i3 & 32) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i3 & 64) == 0) {
            i4 = i;
        }
        if ((i3 & 128) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            hashMap2 = new HashMap();
        } else {
            hashMap2 = hashMap;
        }
        if ((i3 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            list4 = C52575l.m112097a();
        } else {
            list4 = list2;
        }
        this(str4, str5, z3, list3, listState3, z4, i4, str6, hashMap2, list4);
    }
}

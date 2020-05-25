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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState */
public final class FollowerRelationState implements C11932s {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final ListState<Object, C32041i> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    public FollowerRelationState() {
        this(null, null, null, null, false, 0, null, null, null, 511, null);
    }

    public static /* synthetic */ FollowerRelationState copy$default(FollowerRelationState followerRelationState, String str, String str2, List list, ListState listState2, boolean z, int i, String str3, HashMap hashMap, List list2, int i2, Object obj) {
        FollowerRelationState followerRelationState2 = followerRelationState;
        int i3 = i2;
        return followerRelationState.copy((i3 & 1) != 0 ? followerRelationState2.userId : str, (i3 & 2) != 0 ? followerRelationState2.secUserId : str2, (i3 & 4) != 0 ? followerRelationState2.recommendList : list, (i3 & 8) != 0 ? followerRelationState2.listState : listState2, (i3 & 16) != 0 ? followerRelationState2.isHotsoonHasMore : z, (i3 & 32) != 0 ? followerRelationState2.vcdCount : i, (i3 & 64) != 0 ? followerRelationState2.hotsoonText : str3, (i3 & 128) != 0 ? followerRelationState2.unreadCountMap : hashMap, (i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? followerRelationState2.unreadUidList : list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final List<Object> component3() {
        return this.recommendList;
    }

    public final ListState<Object, C32041i> component4() {
        return this.listState;
    }

    public final boolean component5() {
        return this.isHotsoonHasMore;
    }

    public final int component6() {
        return this.vcdCount;
    }

    public final String component7() {
        return this.hotsoonText;
    }

    public final HashMap<String, Integer> component8() {
        return this.unreadCountMap;
    }

    public final List<String> component9() {
        return this.unreadUidList;
    }

    public final FollowerRelationState copy(String str, String str2, List<? extends Object> list, ListState<Object, C32041i> listState2, boolean z, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        String str4 = str;
        C52711k.m112240b(str, "userId");
        String str5 = str2;
        C52711k.m112240b(str2, "secUserId");
        List<? extends Object> list3 = list;
        C52711k.m112240b(list, "recommendList");
        ListState<Object, C32041i> listState3 = listState2;
        C52711k.m112240b(listState2, "listState");
        String str6 = str3;
        C52711k.m112240b(str6, "hotsoonText");
        HashMap<String, Integer> hashMap2 = hashMap;
        C52711k.m112240b(hashMap2, "unreadCountMap");
        List<String> list4 = list2;
        C52711k.m112240b(list4, "unreadUidList");
        FollowerRelationState followerRelationState = new FollowerRelationState(str4, str5, list3, listState3, z, i, str6, hashMap2, list4);
        return followerRelationState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FollowerRelationState) {
                FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                if (C52711k.m112239a((Object) this.userId, (Object) followerRelationState.userId) && C52711k.m112239a((Object) this.secUserId, (Object) followerRelationState.secUserId) && C52711k.m112239a((Object) this.recommendList, (Object) followerRelationState.recommendList) && C52711k.m112239a((Object) this.listState, (Object) followerRelationState.listState)) {
                    if (this.isHotsoonHasMore == followerRelationState.isHotsoonHasMore) {
                        if (!(this.vcdCount == followerRelationState.vcdCount) || !C52711k.m112239a((Object) this.hotsoonText, (Object) followerRelationState.hotsoonText) || !C52711k.m112239a((Object) this.unreadCountMap, (Object) followerRelationState.unreadCountMap) || !C52711k.m112239a((Object) this.unreadUidList, (Object) followerRelationState.unreadUidList)) {
                            return false;
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
        List<Object> list = this.recommendList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C32041i> listState2 = this.listState;
        int hashCode4 = (hashCode3 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        boolean z = this.isHotsoonHasMore;
        if (z) {
            z = true;
        }
        int hashCode5 = (((hashCode4 + (z ? 1 : 0)) * 31) + Integer.hashCode(this.vcdCount)) * 31;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowerRelationState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
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

    public FollowerRelationState(String str, String str2, List<? extends Object> list, ListState<Object, C32041i> listState2, boolean z, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(list, "recommendList");
        C52711k.m112240b(listState2, "listState");
        C52711k.m112240b(str3, "hotsoonText");
        C52711k.m112240b(hashMap, "unreadCountMap");
        C52711k.m112240b(list2, "unreadUidList");
        this.userId = str;
        this.secUserId = str2;
        this.recommendList = list;
        this.listState = listState2;
        this.isHotsoonHasMore = z;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list2;
    }

    public /* synthetic */ FollowerRelationState(String str, String str2, List list, ListState listState2, boolean z, int i, String str3, HashMap hashMap, List list2, int i2, C52707g gVar) {
        String str4;
        String str5;
        List list3;
        ListState listState3;
        boolean z2;
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
        if ((i3 & 4) != 0) {
            list3 = C52575l.m112097a();
        } else {
            list3 = list;
        }
        if ((i3 & 8) != 0) {
            C32041i iVar = new C32041i(false, 0, 0, false, 0, 0, 63, null);
            listState3 = new ListState(iVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        int i4 = 0;
        if ((i3 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 32) == 0) {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i3 & 128) != 0) {
            hashMap2 = new HashMap();
        } else {
            hashMap2 = hashMap;
        }
        if ((i3 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            list4 = C52575l.m112097a();
        } else {
            list4 = list2;
        }
        this(str4, str5, list3, listState3, z2, i4, str6, hashMap2, list4);
    }
}

package com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.HashMap;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState */
public final class ConnectedRelationState implements C11932s {
    private final ListState<Object, C32346c> listState;
    private final String reportId;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;

    public ConnectedRelationState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.c>, for r10v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.HashMap, code=java.util.HashMap<java.lang.String, java.lang.Integer>, for r8v0, types: [java.util.HashMap] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r9v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState copy$default(com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.HashMap<java.lang.String, java.lang.Integer> r8, java.util.List<java.lang.String> r9, com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.C32346c> r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = r4.userId
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = r4.secUserId
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.lang.String r7 = r4.reportId
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r4.unreadCountMap
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            java.util.List<java.lang.String> r9 = r4.unreadUidList
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.c> r10 = r4.listState
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState.copy$default(com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.List, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState");
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final String component3() {
        return this.reportId;
    }

    public final HashMap<String, Integer> component4() {
        return this.unreadCountMap;
    }

    public final List<String> component5() {
        return this.unreadUidList;
    }

    public final ListState<Object, C32346c> component6() {
        return this.listState;
    }

    public final ConnectedRelationState copy(String str, String str2, String str3, HashMap<String, Integer> hashMap, List<String> list, ListState<Object, C32346c> listState2) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(str3, "reportId");
        C52711k.m112240b(hashMap, "unreadCountMap");
        C52711k.m112240b(list, "unreadUidList");
        C52711k.m112240b(listState2, "listState");
        ConnectedRelationState connectedRelationState = new ConnectedRelationState(str, str2, str3, hashMap, list, listState2);
        return connectedRelationState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.listState, (java.lang.Object) r3.listState) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r3 = (com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState) r3
            java.lang.String r0 = r2.userId
            java.lang.String r1 = r3.userId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.secUserId
            java.lang.String r1 = r3.secUserId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.reportId
            java.lang.String r1 = r3.reportId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.unreadCountMap
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r3.unreadCountMap
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.String> r0 = r2.unreadUidList
            java.util.List<java.lang.String> r1 = r3.unreadUidList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.c> r0 = r2.listState
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.c> r3 = r3.listState
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.ConnectedRelationState.equals(java.lang.Object):boolean");
    }

    public final ListState<Object, C32346c> getListState() {
        return this.listState;
    }

    public final String getReportId() {
        return this.reportId;
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

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.reportId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode4 = (hashCode3 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list = this.unreadUidList;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C32346c> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectedRelationState(userId=");
        sb.append(this.userId);
        sb.append(", secUserId=");
        sb.append(this.secUserId);
        sb.append(", reportId=");
        sb.append(this.reportId);
        sb.append(", unreadCountMap=");
        sb.append(this.unreadCountMap);
        sb.append(", unreadUidList=");
        sb.append(this.unreadUidList);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public ConnectedRelationState(String str, String str2, String str3, HashMap<String, Integer> hashMap, List<String> list, ListState<Object, C32346c> listState2) {
        C52711k.m112240b(str, "userId");
        C52711k.m112240b(str2, "secUserId");
        C52711k.m112240b(str3, "reportId");
        C52711k.m112240b(hashMap, "unreadCountMap");
        C52711k.m112240b(list, "unreadUidList");
        C52711k.m112240b(listState2, "listState");
        this.userId = str;
        this.secUserId = str2;
        this.reportId = str3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list;
        this.listState = listState2;
    }

    public /* synthetic */ ConnectedRelationState(String str, String str2, String str3, HashMap hashMap, List list, ListState listState2, int i, C52707g gVar) {
        String str4;
        String str5;
        String str6;
        HashMap hashMap2;
        List list2;
        ListState listState3;
        if ((i & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            hashMap2 = new HashMap();
        } else {
            hashMap2 = hashMap;
        }
        if ((i & 16) != 0) {
            list2 = C52575l.m112097a();
        } else {
            list2 = list;
        }
        if ((i & 32) != 0) {
            C32346c cVar = new C32346c(null, 0, false, 0, 15, null);
            listState3 = new ListState(cVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str4, str5, str6, hashMap2, list2, listState3);
    }
}

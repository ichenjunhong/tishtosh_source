package com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState */
public final class RecommendFollowState implements C11932s {
    private final C52847n<String, Boolean> dislikeSuccess;
    private final ListState<C31907e, C31975b> listState;
    private final String previousPage;
    private final String relationInfo;
    private final int relationType;
    private final String secUid;
    private final String userId;

    public RecommendFollowState() {
        this(null, null, 0, null, null, null, null, 127, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.follow.recommend.follow.repo.e, com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.b>, for r12v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=d.n, code=d.n<java.lang.String, java.lang.Boolean>, for r11v0, types: [d.n] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState copy$default(com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, p2628d.C52847n<java.lang.String, java.lang.Boolean> r11, com.bytedance.jedi.arch.ext.list.ListState<com.p683ss.android.ugc.aweme.follow.recommend.follow.repo.C31907e, com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.C31975b> r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.String r6 = r5.userId
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            java.lang.String r7 = r5.secUid
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            int r8 = r5.relationType
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            java.lang.String r9 = r5.relationInfo
        L_0x001a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            java.lang.String r10 = r5.previousPage
        L_0x0021:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            d.n<java.lang.String, java.lang.Boolean> r11 = r5.dislikeSuccess
        L_0x0028:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            com.bytedance.jedi.arch.ext.list.ListState<com.ss.android.ugc.aweme.follow.recommend.follow.repo.e, com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.b> r12 = r5.listState
        L_0x002f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState.copy$default(com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, d.n, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowState");
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUid;
    }

    public final int component3() {
        return this.relationType;
    }

    public final String component4() {
        return this.relationInfo;
    }

    public final String component5() {
        return this.previousPage;
    }

    public final C52847n<String, Boolean> component6() {
        return this.dislikeSuccess;
    }

    public final ListState<C31907e, C31975b> component7() {
        return this.listState;
    }

    public final RecommendFollowState copy(String str, String str2, int i, String str3, String str4, C52847n<String, Boolean> nVar, ListState<C31907e, C31975b> listState2) {
        C52847n<String, Boolean> nVar2 = nVar;
        C52711k.m112240b(nVar, "dislikeSuccess");
        ListState<C31907e, C31975b> listState3 = listState2;
        C52711k.m112240b(listState3, "listState");
        RecommendFollowState recommendFollowState = new RecommendFollowState(str, str2, i, str3, str4, nVar2, listState3);
        return recommendFollowState;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecommendFollowState) {
                RecommendFollowState recommendFollowState = (RecommendFollowState) obj;
                if (C52711k.m112239a((Object) this.userId, (Object) recommendFollowState.userId) && C52711k.m112239a((Object) this.secUid, (Object) recommendFollowState.secUid)) {
                    if (!(this.relationType == recommendFollowState.relationType) || !C52711k.m112239a((Object) this.relationInfo, (Object) recommendFollowState.relationInfo) || !C52711k.m112239a((Object) this.previousPage, (Object) recommendFollowState.previousPage) || !C52711k.m112239a((Object) this.dislikeSuccess, (Object) recommendFollowState.dislikeSuccess) || !C52711k.m112239a((Object) this.listState, (Object) recommendFollowState.listState)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C52847n<String, Boolean> getDislikeSuccess() {
        return this.dislikeSuccess;
    }

    public final ListState<C31907e, C31975b> getListState() {
        return this.listState;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRelationInfo() {
        return this.relationInfo;
    }

    public final int getRelationType() {
        return this.relationType;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.relationType)) * 31;
        String str3 = this.relationInfo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.previousPage;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C52847n<String, Boolean> nVar = this.dislikeSuccess;
        int hashCode5 = (hashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        ListState<C31907e, C31975b> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendFollowState(userId=");
        sb.append(this.userId);
        sb.append(", secUid=");
        sb.append(this.secUid);
        sb.append(", relationType=");
        sb.append(this.relationType);
        sb.append(", relationInfo=");
        sb.append(this.relationInfo);
        sb.append(", previousPage=");
        sb.append(this.previousPage);
        sb.append(", dislikeSuccess=");
        sb.append(this.dislikeSuccess);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public RecommendFollowState(String str, String str2, int i, String str3, String str4, C52847n<String, Boolean> nVar, ListState<C31907e, C31975b> listState2) {
        C52711k.m112240b(nVar, "dislikeSuccess");
        C52711k.m112240b(listState2, "listState");
        this.userId = str;
        this.secUid = str2;
        this.relationType = i;
        this.relationInfo = str3;
        this.previousPage = str4;
        this.dislikeSuccess = nVar;
        this.listState = listState2;
    }

    public /* synthetic */ RecommendFollowState(String str, String str2, int i, String str3, String str4, C52847n nVar, ListState listState2, int i2, C52707g gVar) {
        String str5;
        String str6;
        int i3;
        String str7;
        String str8;
        C52847n nVar2;
        ListState listState3;
        if ((i2 & 1) != 0) {
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            i3 = 5;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            str8 = "";
        } else {
            str8 = str4;
        }
        if ((i2 & 32) != 0) {
            nVar2 = new C52847n(null, Boolean.valueOf(false));
        } else {
            nVar2 = nVar;
        }
        if ((i2 & 64) != 0) {
            C31975b bVar = new C31975b(false, 0, null, 7, null);
            listState3 = new ListState(bVar, null, null, null, null, 30, null);
        } else {
            listState3 = listState2;
        }
        this(str5, str6, i3, str7, str8, nVar2, listState3);
    }
}

package com.p683ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel */
public final class AtFriendsViewModel {
    public static final Companion Companion = new Companion(null);
    public String latestSearchKey = "";
    public List<IMUser> latestSearchUsers = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion */
    public static final class Companion {

        /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends */
        public static final class AllFriends {
            public final List<IMUser> allFollowingFriends;
            public final List<Integer> indexLabelCount;
            public final List<String> indexLabels;
            public final List<IMUser> mutualFriends;
            public final List<IMUser> recentFriends;

            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>, for r4v0, types: [java.util.List] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>, for r5v0, types: [java.util.List] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>, for r6v0, types: [java.util.List] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Integer>, for r8v0, types: [java.util.List] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r7v0, types: [java.util.List] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static /* synthetic */ com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends copy$default(com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends r3, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> r4, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> r5, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.Integer> r8, int r9, java.lang.Object r10) {
                /*
                    r10 = r9 & 1
                    if (r10 == 0) goto L_0x0006
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r4 = r3.recentFriends
                L_0x0006:
                    r10 = r9 & 2
                    if (r10 == 0) goto L_0x000c
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r5 = r3.mutualFriends
                L_0x000c:
                    r10 = r5
                    r5 = r9 & 4
                    if (r5 == 0) goto L_0x0013
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r6 = r3.allFollowingFriends
                L_0x0013:
                    r0 = r6
                    r5 = r9 & 8
                    if (r5 == 0) goto L_0x001a
                    java.util.List<java.lang.String> r7 = r3.indexLabels
                L_0x001a:
                    r1 = r7
                    r5 = r9 & 16
                    if (r5 == 0) goto L_0x0021
                    java.util.List<java.lang.Integer> r8 = r3.indexLabelCount
                L_0x0021:
                    r2 = r8
                    r5 = r3
                    r6 = r4
                    r7 = r10
                    r8 = r0
                    r9 = r1
                    r10 = r2
                    com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends r3 = r5.copy(r6, r7, r8, r9, r10)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends.copy$default(com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends");
            }

            public final AllFriends copy(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5) {
                C52711k.m112240b(list, "recentFriends");
                C52711k.m112240b(list2, "mutualFriends");
                C52711k.m112240b(list3, "allFollowingFriends");
                C52711k.m112240b(list4, "indexLabels");
                C52711k.m112240b(list5, "indexLabelCount");
                AllFriends allFriends = new AllFriends(list, list2, list3, list4, list5);
                return allFriends;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.indexLabelCount, (java.lang.Object) r3.indexLabelCount) != false) goto L_0x003d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x003d
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends
                    if (r0 == 0) goto L_0x003b
                    com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$AllFriends r3 = (com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends) r3
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r2.recentFriends
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r3.recentFriends
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x003b
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r2.mutualFriends
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r3.mutualFriends
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x003b
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r2.allFollowingFriends
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r3.allFollowingFriends
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x003b
                    java.util.List<java.lang.String> r0 = r2.indexLabels
                    java.util.List<java.lang.String> r1 = r3.indexLabels
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x003b
                    java.util.List<java.lang.Integer> r0 = r2.indexLabelCount
                    java.util.List<java.lang.Integer> r3 = r3.indexLabelCount
                    boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                    if (r3 == 0) goto L_0x003b
                    goto L_0x003d
                L_0x003b:
                    r3 = 0
                    return r3
                L_0x003d:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                List<IMUser> list = this.recentFriends;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.mutualFriends;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.allFollowingFriends;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.indexLabels;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.indexLabelCount;
                if (list5 != null) {
                    i = list5.hashCode();
                }
                return hashCode4 + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AllFriends(recentFriends=");
                sb.append(this.recentFriends);
                sb.append(", mutualFriends=");
                sb.append(this.mutualFriends);
                sb.append(", allFollowingFriends=");
                sb.append(this.allFollowingFriends);
                sb.append(", indexLabels=");
                sb.append(this.indexLabels);
                sb.append(", indexLabelCount=");
                sb.append(this.indexLabelCount);
                sb.append(")");
                return sb.toString();
            }

            public AllFriends(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<String> list4, List<Integer> list5) {
                C52711k.m112240b(list, "recentFriends");
                C52711k.m112240b(list2, "mutualFriends");
                C52711k.m112240b(list3, "allFollowingFriends");
                C52711k.m112240b(list4, "indexLabels");
                C52711k.m112240b(list5, "indexLabelCount");
                this.recentFriends = list;
                this.mutualFriends = list2;
                this.allFollowingFriends = list3;
                this.indexLabels = list4;
                this.indexLabelCount = list5;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult */
        public static final class SearchResult {
            public final List<IMUser> allFriends;
            public final List<IMUser> followingFriends;

            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>, for r1v0, types: [java.util.List] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser>, for r2v0, types: [java.util.List] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static /* synthetic */ com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult copy$default(com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult r0, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> r1, java.util.List<com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser> r2, int r3, java.lang.Object r4) {
                /*
                    r4 = r3 & 1
                    if (r4 == 0) goto L_0x0006
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r0.followingFriends
                L_0x0006:
                    r3 = r3 & 2
                    if (r3 == 0) goto L_0x000c
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r2 = r0.allFriends
                L_0x000c:
                    com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult r0 = r0.copy(r1, r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult.copy$default(com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult, java.util.List, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult");
            }

            public final SearchResult copy(List<? extends IMUser> list, List<? extends IMUser> list2) {
                C52711k.m112240b(list, "followingFriends");
                C52711k.m112240b(list2, "allFriends");
                return new SearchResult(list, list2);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
                if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.allFriends, (java.lang.Object) r3.allFriends) != false) goto L_0x001f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x001f
                    boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult
                    if (r0 == 0) goto L_0x001d
                    com.ss.android.ugc.aweme.friends.model.AtFriendsViewModel$Companion$SearchResult r3 = (com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult) r3
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r2.followingFriends
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r1 = r3.followingFriends
                    boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                    if (r0 == 0) goto L_0x001d
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r2.allFriends
                    java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r3 = r3.allFriends
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
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.SearchResult.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                List<IMUser> list = this.followingFriends;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.allFriends;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SearchResult(followingFriends=");
                sb.append(this.followingFriends);
                sb.append(", allFriends=");
                sb.append(this.allFriends);
                sb.append(")");
                return sb.toString();
            }

            public SearchResult(List<? extends IMUser> list, List<? extends IMUser> list2) {
                C52711k.m112240b(list, "followingFriends");
                C52711k.m112240b(list2, "allFriends");
                this.followingFriends = list;
                this.allFriends = list2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final C0013i<AllFriends> loadAllFriends() {
        C0013i<AllFriends> a = C0013i.m16a((Callable<TResult>) AtFriendsViewModel$loadAllFriends$1.INSTANCE);
        C52711k.m112236a((Object) a, "bolts.Task.callInBackgro…s, indexLabelCount)\n    }");
        return a;
    }

    private final AllFriends testData() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            IMUser iMUser = new IMUser();
            StringBuilder sb = new StringBuilder("recent_nick_");
            sb.append(i);
            iMUser.setNickName(sb.toString());
            StringBuilder sb2 = new StringBuilder("recent_signature_");
            sb2.append(i);
            iMUser.setSignature(sb2.toString());
            iMUser.setInitialLetter("R");
            arrayList.add(iMUser);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 1; i2 <= 10; i2++) {
            IMUser iMUser2 = new IMUser();
            StringBuilder sb3 = new StringBuilder("mutual_nick_");
            sb3.append(i2);
            iMUser2.setNickName(sb3.toString());
            StringBuilder sb4 = new StringBuilder("mutual_signature_");
            sb4.append(i2);
            iMUser2.setSignature(sb4.toString());
            iMUser2.setInitialLetter("m");
            arrayList2.add(iMUser2);
        }
        List c = C52575l.m112101c("Recent", "Friend");
        ArrayList arrayList3 = new ArrayList();
        List c2 = C52575l.m112101c(Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        for (char c3 = 'A'; c3 <= 'Z'; c3 = (char) (c3 + 1)) {
            IMUser iMUser3 = new IMUser();
            iMUser3.setNickName("follow_nick");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c3);
            sb5.append("_follow_signature");
            iMUser3.setSignature(sb5.toString());
            iMUser3.setInitialLetter(String.valueOf(c3));
            arrayList3.add(iMUser3);
            String initialLetter = iMUser3.getInitialLetter();
            C52711k.m112236a((Object) initialLetter, "user.initialLetter");
            c.add(initialLetter);
            c2.add(Integer.valueOf(1));
        }
        AllFriends allFriends = new AllFriends(arrayList, arrayList2, arrayList3, c, c2);
        return allFriends;
    }

    public final void setLatestSearchKey(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.latestSearchKey = str;
    }

    public final void setLatestSearchUsers(List<IMUser> list) {
        C52711k.m112240b(list, "<set-?>");
        this.latestSearchUsers = list;
    }

    public final boolean latestSearchUsersContain(String str) {
        C52711k.m112240b(str, "uid");
        for (IMUser uid : this.latestSearchUsers) {
            if (C52711k.m112239a((Object) uid.getUid(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean containKeyWord(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C52830p.m112456b((CharSequence) lowerCase, (CharSequence) str2, false, 2, (Object) null)) {
                    return true;
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    public final C0013i<List<IMUser>> searchKeyWord(String str, List<? extends IMUser> list) {
        C52711k.m112240b(str, "keyWord");
        C52711k.m112240b(list, "data");
        this.latestSearchKey = str;
        C0013i<List<IMUser>> b = C0013i.m16a((Callable<TResult>) new AtFriendsViewModel$searchKeyWord$1<TResult>(this, list, str)).mo24b(new AtFriendsViewModel$searchKeyWord$2(this), C0013i.f25b);
        C52711k.m112236a((Object) b, "Task.callInBackground { … Task.UI_THREAD_EXECUTOR)");
        return b;
    }

    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        boolean z;
        List<IMUser> searchFollowIMUser = C33194e.m76279d().searchFollowIMUser(list, str);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            for (IMUser iMUser : list) {
                CharSequence uniqueId = iMUser.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String uniqueId2 = iMUser.getUniqueId();
                    C52711k.m112236a((Object) uniqueId2, "it.uniqueId");
                    if (containKeyWord(uniqueId2, lowerCase)) {
                        iMUser.setSearchType(1);
                        searchFollowIMUser.add(iMUser);
                    }
                } else {
                    String shortId = iMUser.getShortId();
                    C52711k.m112236a((Object) shortId, "it.shortId");
                    if (containKeyWord(shortId, lowerCase)) {
                        iMUser.setSearchType(1);
                        searchFollowIMUser.add(iMUser);
                    }
                }
            }
            return searchFollowIMUser;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}

package com.p683ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.ext.list.ListState;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState */
public final class BiColAwemeListState implements C11932s {
    private final String chId;
    private final boolean isHashTag;
    private final ListState<Object, C24786a> listState;

    public BiColAwemeListState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bytedance.jedi.arch.ext.list.ListState, code=com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.challenge.viewmodel.a>, for r3v0, types: [com.bytedance.jedi.arch.ext.list.ListState] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState copy$default(com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState r0, java.lang.String r1, boolean r2, com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.p683ss.android.ugc.aweme.challenge.viewmodel.C24786a> r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.chId
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            boolean r2 = r0.isHashTag
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            com.bytedance.jedi.arch.ext.list.ListState<java.lang.Object, com.ss.android.ugc.aweme.challenge.viewmodel.a> r3 = r0.listState
        L_0x0012:
            com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState.copy$default(com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState, java.lang.String, boolean, com.bytedance.jedi.arch.ext.list.ListState, int, java.lang.Object):com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState");
    }

    public final String component1() {
        return this.chId;
    }

    public final boolean component2() {
        return this.isHashTag;
    }

    public final ListState<Object, C24786a> component3() {
        return this.listState;
    }

    public final BiColAwemeListState copy(String str, boolean z, ListState<Object, C24786a> listState2) {
        C52711k.m112240b(str, "chId");
        C52711k.m112240b(listState2, "listState");
        return new BiColAwemeListState(str, z, listState2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BiColAwemeListState) {
                BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
                if (C52711k.m112239a((Object) this.chId, (Object) biColAwemeListState.chId)) {
                    if (!(this.isHashTag == biColAwemeListState.isHashTag) || !C52711k.m112239a((Object) this.listState, (Object) biColAwemeListState.listState)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getChId() {
        return this.chId;
    }

    public final ListState<Object, C24786a> getListState() {
        return this.listState;
    }

    public final int hashCode() {
        String str = this.chId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isHashTag;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        ListState<Object, C24786a> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return i2 + i;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiColAwemeListState(chId=");
        sb.append(this.chId);
        sb.append(", isHashTag=");
        sb.append(this.isHashTag);
        sb.append(", listState=");
        sb.append(this.listState);
        sb.append(")");
        return sb.toString();
    }

    public BiColAwemeListState(String str, boolean z, ListState<Object, C24786a> listState2) {
        C52711k.m112240b(str, "chId");
        C52711k.m112240b(listState2, "listState");
        this.chId = str;
        this.isHashTag = z;
        this.listState = listState2;
    }

    public /* synthetic */ BiColAwemeListState(String str, boolean z, ListState listState2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            C24786a aVar = new C24786a(false, 0, 0, 0, 15, null);
            listState2 = new ListState(aVar, null, null, null, null, 30, null);
        }
        this(str, z, listState2);
    }
}

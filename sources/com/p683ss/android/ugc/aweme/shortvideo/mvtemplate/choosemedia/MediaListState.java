package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState */
public final class MediaListState implements C11932s {
    private final ArrayList<MyMediaModel> mediaList;
    private final long value;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.ArrayList, code=java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel>, for r1v0, types: [java.util.ArrayList] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState copy$default(com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r0, java.util.ArrayList<com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r1, long r2, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel> r1 = r0.mediaList
        L_0x0006:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x000c
            long r2 = r0.value
        L_0x000c:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState.copy$default(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState, java.util.ArrayList, long, int, java.lang.Object):com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState");
    }

    public final ArrayList<MyMediaModel> component1() {
        return this.mediaList;
    }

    public final long component2() {
        return this.value;
    }

    public final MediaListState copy(ArrayList<MyMediaModel> arrayList, long j) {
        C52711k.m112240b(arrayList, "mediaList");
        return new MediaListState(arrayList, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaListState) {
                MediaListState mediaListState = (MediaListState) obj;
                if (C52711k.m112239a((Object) this.mediaList, (Object) mediaListState.mediaList)) {
                    if (this.value == mediaListState.value) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList<MyMediaModel> getMediaList() {
        return this.mediaList;
    }

    public final long getValue() {
        return this.value;
    }

    public final int hashCode() {
        ArrayList<MyMediaModel> arrayList = this.mediaList;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        long j = this.value;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaListState(mediaList=");
        sb.append(this.mediaList);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(")");
        return sb.toString();
    }

    public MediaListState(ArrayList<MyMediaModel> arrayList, long j) {
        C52711k.m112240b(arrayList, "mediaList");
        this.mediaList = arrayList;
        this.value = j;
    }

    public /* synthetic */ MediaListState(ArrayList arrayList, long j, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        this(arrayList, j);
    }
}

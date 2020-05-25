package com.p683ss.android.ugc.aweme.sticker.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.TextStruct */
public final class TextStruct implements Parcelable {
    public static final Creator CREATOR = new C45867a();
    @C17952c(mo34828a = "anchors")
    private final List<CreateAnchorInfo> anchors;

    /* renamed from: com.ss.android.ugc.aweme.sticker.data.TextStruct$a */
    public static class C45867a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((CreateAnchorInfo) CreateAnchorInfo.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new TextStruct(arrayList);
        }

        public final Object[] newArray(int i) {
            return new TextStruct[i];
        }
    }

    public TextStruct() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.sticker.data.TextStruct copy$default(com.p683ss.android.ugc.aweme.sticker.data.TextStruct r0, java.util.List<com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r1 = r0.anchors
        L_0x0006:
            com.ss.android.ugc.aweme.sticker.data.TextStruct r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.data.TextStruct.copy$default(com.ss.android.ugc.aweme.sticker.data.TextStruct, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.sticker.data.TextStruct");
    }

    public final List<CreateAnchorInfo> component1() {
        return this.anchors;
    }

    public final TextStruct copy(List<CreateAnchorInfo> list) {
        C52711k.m112240b(list, CreateAnchorInfo.KEY_ANCHORS);
        return new TextStruct(list);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.anchors, (java.lang.Object) ((com.p683ss.android.ugc.aweme.sticker.data.TextStruct) r2).anchors) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.sticker.data.TextStruct
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.sticker.data.TextStruct r2 = (com.p683ss.android.ugc.aweme.sticker.data.TextStruct) r2
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r0 = r1.anchors
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r2 = r2.anchors
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.data.TextStruct.equals(java.lang.Object):boolean");
    }

    public final List<CreateAnchorInfo> getAnchors() {
        return this.anchors;
    }

    public final int hashCode() {
        List<CreateAnchorInfo> list = this.anchors;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStruct(anchors=");
        sb.append(this.anchors);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        List<CreateAnchorInfo> list = this.anchors;
        parcel.writeInt(list.size());
        for (CreateAnchorInfo writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public TextStruct(List<CreateAnchorInfo> list) {
        C52711k.m112240b(list, CreateAnchorInfo.KEY_ANCHORS);
        this.anchors = list;
    }

    public /* synthetic */ TextStruct(List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        this(list);
    }
}

package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap */
public final class InteractTextStructWrap implements Parcelable {
    public static final Creator CREATOR = new C46707a();
    private final TextStickerTextUnderlineIndexRange range;
    private final CreateAnchorInfo struct;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap$a */
    public static class C46707a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new InteractTextStructWrap((TextStickerTextUnderlineIndexRange) TextStickerTextUnderlineIndexRange.CREATOR.createFromParcel(parcel), (CreateAnchorInfo) parcel.readParcelable(InteractTextStructWrap.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new InteractTextStructWrap[i];
        }
    }

    public static /* synthetic */ InteractTextStructWrap copy$default(InteractTextStructWrap interactTextStructWrap, TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            textStickerTextUnderlineIndexRange = interactTextStructWrap.range;
        }
        if ((i & 2) != 0) {
            createAnchorInfo = interactTextStructWrap.struct;
        }
        return interactTextStructWrap.copy(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final TextStickerTextUnderlineIndexRange component1() {
        return this.range;
    }

    public final CreateAnchorInfo component2() {
        return this.struct;
    }

    public final InteractTextStructWrap copy(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        C52711k.m112240b(textStickerTextUnderlineIndexRange, "range");
        C52711k.m112240b(createAnchorInfo, "struct");
        return new InteractTextStructWrap(textStickerTextUnderlineIndexRange, createAnchorInfo);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.struct, (java.lang.Object) r3.struct) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap r3 = (com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap) r3
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextUnderlineIndexRange r0 = r2.range
            com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextUnderlineIndexRange r1 = r3.range
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r0 = r2.struct
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r3 = r3.struct
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.InteractTextStructWrap.equals(java.lang.Object):boolean");
    }

    public final TextStickerTextUnderlineIndexRange getRange() {
        return this.range;
    }

    public final CreateAnchorInfo getStruct() {
        return this.struct;
    }

    public final int hashCode() {
        TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = this.range;
        int i = 0;
        int hashCode = (textStickerTextUnderlineIndexRange != null ? textStickerTextUnderlineIndexRange.hashCode() : 0) * 31;
        CreateAnchorInfo createAnchorInfo = this.struct;
        if (createAnchorInfo != null) {
            i = createAnchorInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractTextStructWrap(range=");
        sb.append(this.range);
        sb.append(", struct=");
        sb.append(this.struct);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        this.range.writeToParcel(parcel, 0);
        parcel.writeParcelable(this.struct, i);
    }

    public final boolean isValid(int i) {
        return this.range.isValid(i);
    }

    public InteractTextStructWrap(TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange, CreateAnchorInfo createAnchorInfo) {
        C52711k.m112240b(textStickerTextUnderlineIndexRange, "range");
        C52711k.m112240b(createAnchorInfo, "struct");
        this.range = textStickerTextUnderlineIndexRange;
        this.struct = createAnchorInfo;
    }
}

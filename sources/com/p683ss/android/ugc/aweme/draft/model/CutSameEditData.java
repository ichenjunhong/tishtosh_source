package com.p683ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.draft.model.CutSameEditData */
public final class CutSameEditData implements Parcelable {
    public static final Creator CREATOR = new C29053a();
    @C17952c(mo34828a = "conactFilePath")

    /* renamed from: a */
    public final String f76008a;
    @C17952c(mo34828a = "conactWorksapceId")

    /* renamed from: b */
    public final String f76009b;
    @C17952c(mo34828a = "originTextList")

    /* renamed from: c */
    public final List<String> f76010c;
    @C17952c(mo34828a = "lastTextList")

    /* renamed from: d */
    public final List<String> f76011d;
    @C17952c(mo34828a = "cutsame_id")

    /* renamed from: e */
    public final String f76012e;
    @C17952c(mo34828a = "music_id")

    /* renamed from: f */
    public final String f76013f;
    @C17952c(mo34828a = "src_video_data_list")

    /* renamed from: g */
    public final List<EditVideoSegment> f76014g;

    /* renamed from: com.ss.android.ugc.aweme.draft.model.CutSameEditData$a */
    public static class C29053a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C52711k.m112240b(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            List createStringArrayList = parcel.createStringArrayList();
            List createStringArrayList2 = parcel.createStringArrayList();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((EditVideoSegment) parcel.readParcelable(CutSameEditData.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            CutSameEditData cutSameEditData = new CutSameEditData(readString, readString2, createStringArrayList, createStringArrayList2, readString3, readString4, arrayList);
            return cutSameEditData;
        }

        public final Object[] newArray(int i) {
            return new CutSameEditData[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f76014g, (java.lang.Object) r3.f76014g) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.draft.model.CutSameEditData
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.draft.model.CutSameEditData r3 = (com.p683ss.android.ugc.aweme.draft.model.CutSameEditData) r3
            java.lang.String r0 = r2.f76008a
            java.lang.String r1 = r3.f76008a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f76009b
            java.lang.String r1 = r3.f76009b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<java.lang.String> r0 = r2.f76010c
            java.util.List<java.lang.String> r1 = r3.f76010c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<java.lang.String> r0 = r2.f76011d
            java.util.List<java.lang.String> r1 = r3.f76011d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f76012e
            java.lang.String r1 = r3.f76012e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f76013f
            java.lang.String r1 = r3.f76013f
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r0 = r2.f76014g
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> r3 = r3.f76014g
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.draft.model.CutSameEditData.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f76008a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76009b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f76010c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f76011d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f76012e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f76013f;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<EditVideoSegment> list3 = this.f76014g;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CutSameEditData(conactFilePath=");
        sb.append(this.f76008a);
        sb.append(", conactWorksapceId=");
        sb.append(this.f76009b);
        sb.append(", originTextList=");
        sb.append(this.f76010c);
        sb.append(", lastTextList=");
        sb.append(this.f76011d);
        sb.append(", cutSameMvId=");
        sb.append(this.f76012e);
        sb.append(", musicId=");
        sb.append(this.f76013f);
        sb.append(", videoSegmentDataList=");
        sb.append(this.f76014g);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f76008a);
        parcel.writeString(this.f76009b);
        parcel.writeStringList(this.f76010c);
        parcel.writeStringList(this.f76011d);
        parcel.writeString(this.f76012e);
        parcel.writeString(this.f76013f);
        List<EditVideoSegment> list = this.f76014g;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EditVideoSegment writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: a */
    public final List<String> mo58681a() {
        if (this.f76011d == null || this.f76011d.isEmpty()) {
            return null;
        }
        if (this.f76010c == null || this.f76010c.isEmpty()) {
            return this.f76011d;
        }
        List<String> arrayList = new ArrayList<>();
        for (String str : this.f76011d) {
            if (!this.f76010c.contains(str) && !TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public CutSameEditData(String str, String str2, List<String> list, List<String> list2, String str3, String str4, List<EditVideoSegment> list3) {
        this.f76008a = str;
        this.f76009b = str2;
        this.f76010c = list;
        this.f76011d = list2;
        this.f76012e = str3;
        this.f76013f = str4;
        this.f76014g = list3;
    }
}

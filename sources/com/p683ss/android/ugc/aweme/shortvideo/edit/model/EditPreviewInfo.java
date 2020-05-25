package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo */
public final class EditPreviewInfo implements Parcelable, Serializable {
    public static final Creator<EditPreviewInfo> CREATOR = new C43660b();
    public static final C43659a Companion = new C43659a(null);
    private int calculateHeight;
    private int calculateSourceHeight;
    private int calculateSourceWidth;
    private int calculateWidth;
    private String draftDir;
    private final String initDraftDir;
    private final int previewHeight;
    private int previewVideoLength;
    private final int previewWidth;
    private String[] reverseAudioArray;
    private String[] reverseVideoArray;
    private final long sceneIn;
    private final long sceneOut;
    private String[] tempVideoArray;
    private final List<EditVideoSegment> videoList;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$a */
    public static final class C43659a {
        private C43659a() {
        }

        public /* synthetic */ C43659a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$b */
    public static final class C43660b implements Creator<EditPreviewInfo> {
        C43660b() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EditPreviewInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "source");
            return new EditPreviewInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getCalculateHeight() {
        return this.calculateHeight;
    }

    public final int getCalculateSourceHeight() {
        return this.calculateSourceHeight;
    }

    public final int getCalculateSourceWidth() {
        return this.calculateSourceWidth;
    }

    public final int getCalculateWidth() {
        return this.calculateWidth;
    }

    public final String getDraftDir() {
        return this.draftDir;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public final int[] getTotalVideoHeight() {
        Iterable<EditVideoSegment> iterable = this.videoList;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (EditVideoSegment videoFileInfo : iterable) {
            arrayList.add(Integer.valueOf(videoFileInfo.getVideoFileInfo().getHeight()));
        }
        return C52575l.m112134c((Collection<Integer>) (List) arrayList);
    }

    public final int[] getTotalVideoWidth() {
        Iterable<EditVideoSegment> iterable = this.videoList;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (EditVideoSegment videoFileInfo : iterable) {
            arrayList.add(Integer.valueOf(videoFileInfo.getVideoFileInfo().getWidth()));
        }
        return C52575l.m112134c((Collection<Integer>) (List) arrayList);
    }

    public final void setCalculateHeight(int i) {
        this.calculateHeight = i;
    }

    public final void setCalculateSourceHeight(int i) {
        this.calculateSourceHeight = i;
    }

    public final void setCalculateSourceWidth(int i) {
        this.calculateSourceWidth = i;
    }

    public final void setCalculateWidth(int i) {
        this.calculateWidth = i;
    }

    public final void setPreviewVideoLength(int i) {
        this.previewVideoLength = i;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    public EditPreviewInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "source");
        ArrayList createTypedArrayList = parcel.createTypedArrayList(EditVideoSegment.CREATOR);
        C52711k.m112236a((Object) createTypedArrayList, "source.createTypedArrayL…EditVideoSegment.CREATOR)");
        this(createTypedArrayList, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), "");
        String readString = parcel.readString();
        C52711k.m112236a((Object) readString, "source.readString()");
        this.draftDir = readString;
        this.calculateWidth = parcel.readInt();
        this.calculateHeight = parcel.readInt();
        this.previewVideoLength = parcel.readInt();
        this.reverseVideoArray = parcel.createStringArray();
        this.reverseAudioArray = parcel.createStringArray();
        this.tempVideoArray = parcel.createStringArray();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "dest");
        parcel.writeTypedList(this.videoList);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeLong(this.sceneIn);
        parcel.writeLong(this.sceneOut);
        parcel.writeString(this.draftDir);
        parcel.writeInt(this.calculateWidth);
        parcel.writeInt(this.calculateHeight);
        parcel.writeInt(this.previewVideoLength);
        parcel.writeStringArray(this.reverseVideoArray);
        parcel.writeStringArray(this.reverseAudioArray);
        parcel.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> list, int i, int i2, long j, long j2, String str) {
        C52711k.m112240b(list, "videoList");
        C52711k.m112240b(str, "initDraftDir");
        this.videoList = list;
        this.previewWidth = i;
        this.previewHeight = i2;
        this.sceneIn = j;
        this.sceneOut = j2;
        this.initDraftDir = str;
        this.draftDir = this.initDraftDir;
    }

    public /* synthetic */ EditPreviewInfo(List list, int i, int i2, long j, long j2, String str, int i3, C52707g gVar) {
        int i4;
        int i5;
        long j3;
        long j4;
        if ((i3 & 2) != 0) {
            i4 = -1;
        } else {
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            i5 = -1;
        } else {
            i5 = i2;
        }
        if ((i3 & 8) != 0) {
            j3 = -1;
        } else {
            j3 = j;
        }
        if ((i3 & 16) != 0) {
            j4 = -1;
        } else {
            j4 = j2;
        }
        this(list, i4, i5, j3, j4, str);
    }
}

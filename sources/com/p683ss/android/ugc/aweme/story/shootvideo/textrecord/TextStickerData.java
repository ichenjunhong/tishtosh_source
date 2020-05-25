package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.sticker.data.C45868a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData */
public final class TextStickerData implements Parcelable, C45868a, Cloneable {
    public static final Creator CREATOR = new C46708a();
    @C17952c(mo34828a = "align")
    private int align;
    private boolean autoSelect;
    @C17952c(mo34828a = "bg_mode")
    private int bgMode;
    @C17952c(mo34828a = "color")
    private int color;
    @C17952c(mo34828a = "edit_center_point")
    private Point editCenterPoint;
    @C17952c(mo34828a = "mEndTime")
    private int endTime;
    private int fontSize;
    @C17952c(mo34828a = "font_type")
    private String fontType;
    @C17952c(mo34828a = "r")
    private float rotation;
    @C17952c(mo34828a = "s")
    private float scale;
    @C17952c(mo34828a = "mStartTime")
    private int startTime;
    @C17952c(mo34828a = "text_str")
    private String textStr;
    @C17952c(mo34828a = "text_str_ary")
    private String[] textStrAry;
    @C17952c(mo34828a = "text_str_wrap")
    private TextStickerTextWrap textWrap;
    @C17952c(mo34828a = "mUIEndTime")
    private int uiEndTime;
    @C17952c(mo34828a = "mUIStartTime")
    private int uiStartTime;

    /* renamed from: x */
    private float f117836x;

    /* renamed from: y */
    private float f117837y;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData$a */
    public static class C46708a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C52711k.m112240b(parcel2, "in");
            TextStickerData textStickerData = new TextStickerData(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), (Point) parcel2.readParcelable(TextStickerData.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.createStringArray(), (TextStickerTextWrap) TextStickerTextWrap.CREATOR.createFromParcel(parcel2));
            return textStickerData;
        }

        public final Object[] newArray(int i) {
            return new TextStickerData[i];
        }
    }

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262143, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262142, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262140, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262136, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262128, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262112, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point) {
        this(str, i, i2, i3, str2, point, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262080, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4) {
        this(str, i, i2, i3, str2, point, i4, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262016, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5) {
        this(str, i, i2, i3, str2, point, i4, i5, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 261888, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 261632, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 261120, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 260096, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, 0.0f, 0.0f, false, 0, null, null, 258048, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, 0.0f, false, 0, null, null, 253952, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, false, 0, null, null, 245760, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, 0, null, null, 229376, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, int i8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, i8, null, null, 196608, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, int i8, String[] strArr) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, i8, strArr, null, 131072, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final int getAlign() {
        return this.align;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final int getBgMode() {
        return this.bgMode;
    }

    public final int getColor() {
        return this.color;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontType() {
        return this.fontType;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final String[] getTextStrAry() {
        return this.textStrAry;
    }

    public final TextStickerTextWrap getTextWrap() {
        return this.textWrap;
    }

    public final int getUiEndTime() {
        return this.uiEndTime;
    }

    public final int getUiStartTime() {
        return this.uiStartTime;
    }

    public final float getX() {
        return this.f117836x;
    }

    public final float getY() {
        return this.f117837y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.textStr);
        parcel.writeInt(this.bgMode);
        parcel.writeInt(this.color);
        parcel.writeInt(this.align);
        parcel.writeString(this.fontType);
        parcel.writeParcelable(this.editCenterPoint, i);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.f117836x);
        parcel.writeFloat(this.f117837y);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.autoSelect ? 1 : 0);
        parcel.writeInt(this.fontSize);
        parcel.writeStringArray(this.textStrAry);
        this.textWrap.writeToParcel(parcel, 0);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, int i8, String[] strArr, TextStickerTextWrap textStickerTextWrap) {
        Point point2 = point;
        String[] strArr2 = strArr;
        TextStickerTextWrap textStickerTextWrap2 = textStickerTextWrap;
        C52711k.m112240b(point, "editCenterPoint");
        C52711k.m112240b(strArr2, "textStrAry");
        C52711k.m112240b(textStickerTextWrap2, "textWrap");
        this.textStr = str;
        this.bgMode = i;
        this.color = i2;
        this.align = i3;
        this.fontType = str2;
        this.editCenterPoint = point2;
        this.startTime = i4;
        this.endTime = i5;
        this.uiStartTime = i6;
        this.uiEndTime = i7;
        this.f117836x = f;
        this.f117837y = f2;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z;
        this.fontSize = i8;
        this.textStrAry = strArr2;
        this.textWrap = textStickerTextWrap2;
    }

    public /* synthetic */ TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, int i8, String[] strArr, TextStickerTextWrap textStickerTextWrap, int i9, C52707g gVar) {
        int i10 = i9;
        String str3 = null;
        String str4 = (i10 & 1) != 0 ? null : str;
        int i11 = (i10 & 2) != 0 ? 0 : i;
        int i12 = (i10 & 4) != 0 ? 0 : i2;
        int i13 = (i10 & 8) != 0 ? 0 : i3;
        if ((i10 & 16) == 0) {
            str3 = str2;
        }
        Point point2 = (i10 & 32) != 0 ? new Point() : point;
        int i14 = (i10 & 64) != 0 ? 0 : i4;
        int i15 = (i10 & 128) != 0 ? 0 : i5;
        int i16 = (i10 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? 0 : i6;
        int i17 = (i10 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? 0 : i7;
        float f5 = (i10 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? 0.0f : f;
        float f6 = (i10 & 2048) != 0 ? 0.0f : f2;
        float f7 = (i10 & 4096) != 0 ? 0.0f : f3;
        float f8 = (i10 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? 0.0f : f4;
        boolean z2 = (i10 & 16384) != 0 ? false : z;
        int i18 = (i10 & 32768) != 0 ? 28 : i8;
        String[] strArr2 = (i10 & 65536) != 0 ? new String[0] : strArr;
        TextStickerTextWrap textStickerTextWrap2 = (i10 & 131072) != 0 ? new TextStickerTextWrap(null, null, 0, 7, null) : textStickerTextWrap;
        this(str4, i11, i12, i13, str3, point2, i14, i15, i16, i17, f5, f6, f7, f8, z2, i18, strArr2, textStickerTextWrap2);
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasPositionData() {
        if (this.scale != 0.0f) {
            return true;
        }
        return false;
    }

    public final TextStickerData clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (TextStickerData) clone;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData");
        } catch (CloneNotSupportedException unused) {
            TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, null, null, 262143, null);
            return textStickerData;
        }
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setAutoSelect(boolean z) {
        this.autoSelect = z;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontType(String str) {
        this.fontType = str;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setUiEndTime(int i) {
        this.uiEndTime = i;
    }

    public final void setUiStartTime(int i) {
        this.uiStartTime = i;
    }

    public final void setX(float f) {
        this.f117836x = f;
    }

    public final void setY(float f) {
        this.f117837y = f;
    }

    public final void setEditCenterPoint(Point point) {
        C52711k.m112240b(point, "<set-?>");
        this.editCenterPoint = point;
    }

    public final void setTextStrAry(String[] strArr) {
        C52711k.m112240b(strArr, "value");
        this.textStrAry = strArr;
        this.textWrap = C46717e.m101395a(this.textStrAry);
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        long j2 = (long) this.endTime;
        if (((long) this.startTime) <= j && j2 >= j) {
            return true;
        }
        return false;
    }

    public final void setTextWrap(TextStickerTextWrap textStickerTextWrap) {
        C52711k.m112240b(textStickerTextWrap, "value");
        this.textWrap = textStickerTextWrap;
        Iterable<TextStickerString> keySet = this.textWrap.getStrMap().keySet();
        Collection arrayList = new ArrayList(C52575l.m112104a(keySet, 10));
        for (TextStickerString str : keySet) {
            arrayList.add(str.getStr());
        }
        Object[] array = ((List) arrayList).toArray(new String[0]);
        if (array != null) {
            this.textStrAry = (String[]) array;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}

package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam */
public class VEMusicSRTEffectParam {
    private boolean mAddMask;
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public C50562a mGetMusicProgressInvoker;
    private int mMaskColor = 1291845632;
    private boolean mParamUpdated;
    private C50564c[] mSrtData;

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$a */
    public interface C50562a {
        /* renamed from: a */
        float mo98587a();
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$b */
    public interface C50563b extends C50562a {
        /* renamed from: a */
        VEMusicBitmapParam mo98588a(String str, int i, int i2, int i3, float f, int i4, int i5, int i6);
    }

    /* renamed from: com.ss.android.vesdk.VEMusicSRTEffectParam$c */
    public static class C50564c {

        /* renamed from: a */
        public String f126765a;

        /* renamed from: b */
        public int f126766b;

        /* renamed from: c */
        public int f126767c;

        /* renamed from: d */
        public int f126768d;
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private VEMusicSRTEffectParam() {
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        if (this.mGetMusicProgressInvoker != null) {
            return this.mGetMusicProgressInvoker.mo98587a();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        for (int i = 0; i < this.mSrtData.length; i++) {
            iArr[i] = convertDataToUnicode32(this.mSrtData[i]);
        }
        return iArr;
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mParamUpdated = true;
    }

    private int[] convertDataToUnicode32(C50564c cVar) {
        int codePointCount = cVar.f126765a.codePointCount(0, cVar.f126765a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = cVar.f126768d;
        iArr[1] = cVar.f126766b;
        iArr[2] = cVar.f126767c;
        for (int i = 0; i < codePointCount; i++) {
            iArr[i + 3] = cVar.f126765a.codePointAt(i);
        }
        return iArr;
    }

    public void updateEffectResPath(C50564c[] cVarArr, String str, String str2, int i, C50562a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(C50564c[] cVarArr, String str, String str2, int i, C50562a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        if (this.mGetMusicProgressInvoker == null || !(this.mGetMusicProgressInvoker instanceof C50563b)) {
            return null;
        }
        return ((C50563b) this.mGetMusicProgressInvoker).mo98588a(str, i, i2, i3, f, i4, i5, i6);
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i, int i2, int i3, float f, int i4, int i5, int i6) {
        int[] iArr2 = iArr;
        if (iArr2 == null || iArr2.length <= 0) {
            return null;
        }
        return generateBitmap(new String(iArr, 0, iArr2.length), i, i2, i3, f, i4, i5, i6);
    }
}

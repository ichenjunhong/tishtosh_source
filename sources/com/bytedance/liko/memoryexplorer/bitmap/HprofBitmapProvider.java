package com.bytedance.liko.memoryexplorer.bitmap;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTrace;
import com.bytedance.liko.memoryexplorer.bitmap.BitmapDecoder.BitmapDataProvider;
import java.awt.Dimension;
import java.io.File;

public class HprofBitmapProvider implements BitmapDataProvider {
    private final byte[] mBuffer;
    private final int mHeight;
    private final File mImageFile;
    private LeakTrace mLeakTrace;
    private final int mWidth;

    public File getImageFile() {
        return this.mImageFile;
    }

    public LeakTrace getLeakTrace() {
        return this.mLeakTrace;
    }

    public byte[] getPixelBytes() {
        return this.mBuffer;
    }

    public String getBitmapConfigName() {
        int i = this.mWidth * this.mHeight;
        int length = this.mBuffer.length / i;
        if (i > this.mBuffer.length) {
            return null;
        }
        if (length == 2) {
            return "RGB_565";
        }
        if (length != 4) {
            return "ALPHA_8";
        }
        return "ARGB_8888";
    }

    public Dimension getDimension() {
        if (this.mWidth < 0 || this.mHeight < 0) {
            return null;
        }
        return new Dimension(this.mWidth, this.mHeight);
    }

    public HprofBitmapProvider(LeakTrace leakTrace, byte[] bArr, int i, int i2, File file) {
        this.mLeakTrace = leakTrace;
        this.mBuffer = bArr;
        this.mWidth = i;
        this.mHeight = i2;
        this.mImageFile = file;
    }
}

package com.facebook.common.p928l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* renamed from: com.facebook.common.l.b */
public interface C13733b {

    /* renamed from: com.facebook.common.l.b$a */
    public interface C13734a {
        void onWebpErrorLog(String str, String str2);
    }

    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options);

    void setBitmapCreator(C13732a aVar);

    void setWebpErrorLogger(C13734a aVar);
}

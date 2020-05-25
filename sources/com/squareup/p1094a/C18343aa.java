package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.squareup.p1094a.C18396v.C18402d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.a.aa */
public abstract class C18343aa {

    /* renamed from: com.squareup.a.aa$a */
    public static final class C18344a {

        /* renamed from: a */
        public final C18402d f50662a;

        /* renamed from: b */
        public final Bitmap f50663b;

        /* renamed from: c */
        public final InputStream f50664c;

        /* renamed from: d */
        public final int f50665d;

        public C18344a(Bitmap bitmap, C18402d dVar) {
            this((Bitmap) C18356aj.m44592a(bitmap, "bitmap == null"), null, dVar, 0);
        }

        public C18344a(InputStream inputStream, C18402d dVar) {
            this(null, (InputStream) C18356aj.m44592a(inputStream, "stream == null"), dVar, 0);
        }

        C18344a(Bitmap bitmap, InputStream inputStream, C18402d dVar, int i) {
            boolean z;
            boolean z2 = false;
            if (bitmap != null) {
                z = true;
            } else {
                z = false;
            }
            if (inputStream != null) {
                z2 = true;
            }
            if (z2 ^ z) {
                this.f50663b = bitmap;
                this.f50664c = inputStream;
                this.f50662a = (C18402d) C18356aj.m44592a(dVar, "loadedFrom == null");
                this.f50665d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo36786a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C18344a mo36787a(C18409y yVar, int i) throws IOException;

    /* renamed from: a */
    public abstract boolean mo36788a(C18409y yVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36789a(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo36790b() {
        return false;
    }

    /* renamed from: a */
    static boolean m44565a(Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static Options m44566c(C18409y yVar) {
        boolean z;
        boolean c = yVar.mo36871c();
        if (yVar.f50855q != null) {
            z = true;
        } else {
            z = false;
        }
        Options options = null;
        if (c || z) {
            options = new Options();
            options.inJustDecodeBounds = c;
            if (z) {
                options.inPreferredConfig = yVar.f50855q;
            }
        }
        return options;
    }

    /* renamed from: a */
    static void m44564a(int i, int i2, Options options, C18409y yVar) {
        m44563a(i, i2, options.outWidth, options.outHeight, options, yVar);
    }

    /* renamed from: a */
    static void m44563a(int i, int i2, int i3, int i4, Options options, C18409y yVar) {
        int i5;
        if (i4 <= i2 && i3 <= i) {
            i5 = 1;
        } else if (i2 == 0) {
            i5 = (int) Math.floor((double) (((float) i3) / ((float) i)));
        } else if (i == 0) {
            i5 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
        } else {
            int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
            if (yVar.f50849k) {
                i5 = Math.max(floor, floor2);
            } else {
                i5 = Math.min(floor, floor2);
            }
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}

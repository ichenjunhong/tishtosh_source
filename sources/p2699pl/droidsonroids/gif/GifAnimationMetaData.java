package p2699pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C2240a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: pl.droidsonroids.gif.GifAnimationMetaData */
public class GifAnimationMetaData implements Parcelable, Serializable {
    public static final Creator<GifAnimationMetaData> CREATOR = new Creator<GifAnimationMetaData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GifAnimationMetaData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel);
        }
    };
    private static final long serialVersionUID = 5692363926580237325L;

    /* renamed from: a */
    private final int f133482a;

    /* renamed from: b */
    private final int f133483b;

    /* renamed from: c */
    private final int f133484c;

    /* renamed from: d */
    private final int f133485d;

    /* renamed from: e */
    private final int f133486e;

    /* renamed from: f */
    private final long f133487f;

    /* renamed from: g */
    private final long f133488g;

    public int describeContents() {
        return 0;
    }

    public long getAllocationByteCount() {
        return this.f133487f;
    }

    public int getDuration() {
        return this.f133483b;
    }

    public int getHeight() {
        return this.f133484c;
    }

    public int getLoopCount() {
        return this.f133482a;
    }

    public long getMetadataAllocationByteCount() {
        return this.f133488g;
    }

    public int getNumberOfFrames() {
        return this.f133486e;
    }

    public int getWidth() {
        return this.f133485d;
    }

    public GifAnimationMetaData(byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public GifAnimationMetaData(ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    private GifAnimationMetaData(GifInfoHandle gifInfoHandle) {
        this.f133482a = gifInfoHandle.mo113889e();
        this.f133483b = gifInfoHandle.mo113892g();
        this.f133485d = gifInfoHandle.mo113899n();
        this.f133484c = gifInfoHandle.mo113900o();
        this.f133486e = gifInfoHandle.mo113901p();
        this.f133488g = gifInfoHandle.mo113897l();
        this.f133487f = gifInfoHandle.mo113896k();
        gifInfoHandle.mo113884a();
    }

    public boolean isAnimated() {
        if (this.f133486e <= 1 || this.f133483b <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        if (this.f133482a == 0) {
            str = "Infinity";
        } else {
            str = Integer.toString(this.f133482a);
        }
        String a = C2240a.m6773a(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", new Object[]{Integer.valueOf(this.f133485d), Integer.valueOf(this.f133484c), Integer.valueOf(this.f133486e), str, Integer.valueOf(this.f133483b)});
        if (!isAnimated()) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Animated ");
        sb.append(a);
        return sb.toString();
    }

    public GifAnimationMetaData(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.f133482a = parcel.readInt();
        this.f133483b = parcel.readInt();
        this.f133484c = parcel.readInt();
        this.f133485d = parcel.readInt();
        this.f133486e = parcel.readInt();
        this.f133488g = parcel.readLong();
        this.f133487f = parcel.readLong();
    }

    public GifAnimationMetaData(File file) throws IOException {
        this(file.getPath());
    }

    public GifAnimationMetaData(FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public GifAnimationMetaData(InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public GifAnimationMetaData(String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public GifAnimationMetaData(AssetManager assetManager, String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public GifAnimationMetaData(Resources resources, int i) throws NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
    }

    public GifAnimationMetaData(ContentResolver contentResolver, Uri uri) throws IOException {
        GifInfoHandle gifInfoHandle;
        if ("file".equals(uri.getScheme())) {
            gifInfoHandle = new GifInfoHandle(uri.getPath());
        } else {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                gifInfoHandle = new GifInfoHandle(openAssetFileDescriptor);
            } else {
                StringBuilder sb = new StringBuilder("Could not open AssetFileDescriptor for ");
                sb.append(uri);
                throw new IOException(sb.toString());
            }
        }
        this(gifInfoHandle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f133482a);
        parcel.writeInt(this.f133483b);
        parcel.writeInt(this.f133484c);
        parcel.writeInt(this.f133485d);
        parcel.writeInt(this.f133486e);
        parcel.writeLong(this.f133488g);
        parcel.writeLong(this.f133487f);
    }

    public long getDrawableAllocationByteCount(C53874a aVar, int i) {
        long j;
        if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder("Sample size ");
            sb.append(i);
            sb.append(" out of range <1, ￿");
            sb.append(">");
            throw new IllegalStateException(sb.toString());
        }
        int i2 = i * i;
        if (aVar == null || aVar.f133496e.isRecycled()) {
            j = (long) (((this.f133485d * this.f133484c) * 4) / i2);
        } else if (VERSION.SDK_INT >= 19) {
            j = (long) aVar.f133496e.getAllocationByteCount();
        } else {
            j = (long) (aVar.f133496e.getRowBytes() * aVar.f133496e.getHeight());
        }
        return (this.f133487f / ((long) i2)) + j;
    }
}

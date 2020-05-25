package com.p683ss.android.ugc.aweme.photomovie;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.C38764a.C38765a;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld */
public class PhotoMovieContextOld extends BaseShortVideoContext implements Parcelable {
    public static final Creator<PhotoMovieContext> CREATOR = new Creator<PhotoMovieContext>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhotoMovieContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }
    };

    /* renamed from: a */
    public String f98500a;

    /* renamed from: b */
    public List<String> f98501b;

    /* renamed from: c */
    public String f98502c;

    /* renamed from: d */
    public List<C42482c> f98503d = new ArrayList();

    /* renamed from: e */
    public int f98504e;

    /* renamed from: f */
    public int f98505f;

    /* renamed from: g */
    public int f98506g;

    /* renamed from: h */
    public String f98507h;

    /* renamed from: i */
    public String f98508i;

    /* renamed from: j */
    public float f98509j;

    /* renamed from: k */
    public C42482c f98510k;

    /* renamed from: l */
    public String f98511l;

    /* renamed from: m */
    public int f98512m;

    /* renamed from: n */
    public String f98513n;

    /* renamed from: o */
    public int f98514o;

    /* renamed from: p */
    public int f98515p;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld$a */
    public interface C38721a {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo78671a() {
        if (C9376b.m18558a((Collection<T>) this.f98501b) || getVideoLength() == 0) {
            return null;
        }
        return (String) this.f98501b.get(new C38765a().mo78725a(this.f98501b.size(), this.f98509j / ((((float) getVideoLength()) * 1.0f) / 1000.0f)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f98500a);
        parcel.writeStringList(this.f98501b);
        parcel.writeString(this.f98513n);
        parcel.writeString(this.f98502c);
        parcel.writeInt(this.f98504e);
        parcel.writeInt(this.f98505f);
        parcel.writeInt(this.f98506g);
        parcel.writeString(this.f98507h);
        parcel.writeString(this.f98508i);
        parcel.writeFloat(this.f98509j);
        parcel.writeSerializable(this.f98510k);
        parcel.writeString(this.f98511l);
        parcel.writeInt(this.f98512m);
        parcel.writeInt(this.f98514o);
        parcel.writeInt(this.f98515p);
    }
}

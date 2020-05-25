package com.p683ss.android.ugc.aweme.livewallpaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean */
public class LiveWallPaperBean implements Parcelable {
    public static final Creator<LiveWallPaperBean> CREATOR = new Creator<LiveWallPaperBean>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LiveWallPaperBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LiveWallPaperBean(parcel);
        }
    };
    private int height;

    /* renamed from: id */
    private String f92777id;
    private String source;
    private String thumbnailPath;
    private String videoPath;
    private int width;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean$a */
    public static final class C36240a {

        /* renamed from: a */
        public String f92778a;

        /* renamed from: b */
        public String f92779b;

        /* renamed from: c */
        public String f92780c;

        /* renamed from: d */
        public int f92781d;

        /* renamed from: e */
        public int f92782e;

        /* renamed from: f */
        public String f92783f;

        private C36240a() {
        }

        /* renamed from: a */
        public final LiveWallPaperBean mo75039a() {
            return new LiveWallPaperBean(this);
        }

        /* renamed from: a */
        public final C36240a mo75037a(int i) {
            this.f92781d = i;
            return this;
        }

        /* renamed from: b */
        public final C36240a mo75040b(int i) {
            this.f92782e = i;
            return this;
        }

        /* renamed from: c */
        public final C36240a mo75042c(String str) {
            this.f92780c = str;
            return this;
        }

        /* renamed from: d */
        public final C36240a mo75043d(String str) {
            this.f92783f = str;
            return this;
        }

        /* renamed from: a */
        public final C36240a mo75038a(String str) {
            this.f92778a = str;
            return this;
        }

        /* renamed from: b */
        public final C36240a mo75041b(String str) {
            this.f92779b = str;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f92777id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public int getWidth() {
        return this.width;
    }

    public static C36240a newBuilder() {
        return new C36240a();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.f92777id) || !C48016e.m103944b(this.thumbnailPath) || !C48016e.m103944b(this.videoPath)) {
            return false;
        }
        return true;
    }

    public static LiveWallPaperBean buildEmptyBean() {
        return new C36240a().mo75038a("").mo75037a(0).mo75040b(0).mo75041b("").mo75042c("").mo75039a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveWallPaperBean{id='");
        sb.append(this.f92777id);
        sb.append('\'');
        sb.append(", thumbnailPath='");
        sb.append(this.thumbnailPath);
        sb.append('\'');
        sb.append(", videoPath='");
        sb.append(this.videoPath);
        sb.append('\'');
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", source=");
        sb.append(this.source);
        sb.append('}');
        return sb.toString();
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.f92777id = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private LiveWallPaperBean(C36240a aVar) {
        this.f92777id = aVar.f92778a;
        this.thumbnailPath = aVar.f92779b;
        this.videoPath = aVar.f92780c;
        this.width = aVar.f92781d;
        this.height = aVar.f92782e;
        this.source = aVar.f92783f;
    }

    private LiveWallPaperBean(Parcel parcel) {
        this.f92777id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92777id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
    }
}

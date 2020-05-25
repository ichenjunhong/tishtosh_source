package android.support.p030v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    };

    /* renamed from: a */
    public final int f3073a;

    /* renamed from: b */
    public final long f3074b;

    /* renamed from: c */
    public final long f3075c;

    /* renamed from: d */
    public final float f3076d;

    /* renamed from: e */
    public final long f3077e;

    /* renamed from: f */
    public final int f3078f;

    /* renamed from: g */
    public final CharSequence f3079g;

    /* renamed from: h */
    public final long f3080h;

    /* renamed from: i */
    public List<CustomAction> f3081i;

    /* renamed from: j */
    public final long f3082j;

    /* renamed from: k */
    public final Bundle f3083k;

    /* renamed from: l */
    Object f3084l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomAction[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };

        /* renamed from: a */
        public final String f3085a;

        /* renamed from: b */
        public final CharSequence f3086b;

        /* renamed from: c */
        public final int f3087c;

        /* renamed from: d */
        public final Bundle f3088d;

        /* renamed from: e */
        Object f3089e;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append(this.f3086b);
            sb.append(", mIcon=");
            sb.append(this.f3087c);
            sb.append(", mExtras=");
            sb.append(this.f3088d);
            return sb.toString();
        }

        CustomAction(Parcel parcel) {
            this.f3085a = parcel.readString();
            this.f3086b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3087c = parcel.readInt();
            this.f3088d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3085a);
            TextUtils.writeToParcel(this.f3086b, parcel, i);
            parcel.writeInt(this.f3087c);
            parcel.writeBundle(this.f3088d);
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f3085a = str;
            this.f3086b = charSequence;
            this.f3087c = i;
            this.f3088d = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static final class C0936a {

        /* renamed from: a */
        final List<CustomAction> f3090a = new ArrayList();

        /* renamed from: b */
        int f3091b;

        /* renamed from: c */
        long f3092c;

        /* renamed from: d */
        long f3093d;

        /* renamed from: e */
        float f3094e;

        /* renamed from: f */
        long f3095f;

        /* renamed from: g */
        int f3096g;

        /* renamed from: h */
        CharSequence f3097h;

        /* renamed from: i */
        long f3098i;

        /* renamed from: j */
        long f3099j = -1;

        /* renamed from: k */
        Bundle f3100k;

        public C0936a() {
        }

        public C0936a(PlaybackStateCompat playbackStateCompat) {
            this.f3091b = playbackStateCompat.f3073a;
            this.f3092c = playbackStateCompat.f3074b;
            this.f3094e = playbackStateCompat.f3076d;
            this.f3098i = playbackStateCompat.f3080h;
            this.f3093d = playbackStateCompat.f3075c;
            this.f3095f = playbackStateCompat.f3077e;
            this.f3096g = playbackStateCompat.f3078f;
            this.f3097h = playbackStateCompat.f3079g;
            if (playbackStateCompat.f3081i != null) {
                this.f3090a.addAll(playbackStateCompat.f3081i);
            }
            this.f3099j = playbackStateCompat.f3082j;
            this.f3100k = playbackStateCompat.f3083k;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f3073a);
        sb.append(", position=");
        sb.append(this.f3074b);
        sb.append(", buffered position=");
        sb.append(this.f3075c);
        sb.append(", speed=");
        sb.append(this.f3076d);
        sb.append(", updated=");
        sb.append(this.f3080h);
        sb.append(", actions=");
        sb.append(this.f3077e);
        sb.append(", error code=");
        sb.append(this.f3078f);
        sb.append(", error message=");
        sb.append(this.f3079g);
        sb.append(", custom actions=");
        sb.append(this.f3081i);
        sb.append(", active item id=");
        sb.append(this.f3082j);
        sb.append("}");
        return sb.toString();
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f3073a = parcel.readInt();
        this.f3074b = parcel.readLong();
        this.f3076d = parcel.readFloat();
        this.f3080h = parcel.readLong();
        this.f3075c = parcel.readLong();
        this.f3077e = parcel.readLong();
        this.f3079g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3081i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3082j = parcel.readLong();
        this.f3083k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f3078f = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3073a);
        parcel.writeLong(this.f3074b);
        parcel.writeFloat(this.f3076d);
        parcel.writeLong(this.f3080h);
        parcel.writeLong(this.f3075c);
        parcel.writeLong(this.f3077e);
        TextUtils.writeToParcel(this.f3079g, parcel, i);
        parcel.writeTypedList(this.f3081i);
        parcel.writeLong(this.f3082j);
        parcel.writeBundle(this.f3083k);
        parcel.writeInt(this.f3078f);
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f3073a = i;
        this.f3074b = j;
        this.f3075c = j2;
        this.f3076d = f;
        this.f3077e = j3;
        this.f3078f = i2;
        this.f3079g = charSequence;
        this.f3080h = j4;
        this.f3081i = new ArrayList(list);
        this.f3082j = j5;
        this.f3083k = bundle;
    }
}

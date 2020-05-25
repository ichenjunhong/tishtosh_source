package android.support.p030v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m2456a(MediaDescription.CREATOR.createFromParcel(parcel));
        }
    };

    /* renamed from: a */
    public final String f2925a;

    /* renamed from: b */
    public final CharSequence f2926b;

    /* renamed from: c */
    public final CharSequence f2927c;

    /* renamed from: d */
    public final CharSequence f2928d;

    /* renamed from: e */
    public final Bitmap f2929e;

    /* renamed from: f */
    public final Uri f2930f;

    /* renamed from: g */
    public final Bundle f2931g;

    /* renamed from: h */
    public final Uri f2932h;

    /* renamed from: i */
    private Object f2933i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0873a {

        /* renamed from: a */
        private String f2934a;

        /* renamed from: b */
        private CharSequence f2935b;

        /* renamed from: c */
        private CharSequence f2936c;

        /* renamed from: d */
        private CharSequence f2937d;

        /* renamed from: e */
        private Bitmap f2938e;

        /* renamed from: f */
        private Uri f2939f;

        /* renamed from: g */
        private Bundle f2940g;

        /* renamed from: h */
        private Uri f2941h;

        /* renamed from: a */
        public final MediaDescriptionCompat mo2748a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f2934a, this.f2935b, this.f2936c, this.f2937d, this.f2938e, this.f2939f, this.f2940g, this.f2941h);
            return mediaDescriptionCompat;
        }

        /* renamed from: a */
        public final C0873a mo2743a(Bitmap bitmap) {
            this.f2938e = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C0873a mo2749b(Uri uri) {
            this.f2941h = uri;
            return this;
        }

        /* renamed from: c */
        public final C0873a mo2751c(CharSequence charSequence) {
            this.f2937d = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0873a mo2744a(Uri uri) {
            this.f2939f = uri;
            return this;
        }

        /* renamed from: b */
        public final C0873a mo2750b(CharSequence charSequence) {
            this.f2936c = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0873a mo2745a(Bundle bundle) {
            this.f2940g = bundle;
            return this;
        }

        /* renamed from: a */
        public final C0873a mo2746a(CharSequence charSequence) {
            this.f2935b = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0873a mo2747a(String str) {
            this.f2934a = str;
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2926b);
        sb.append(", ");
        sb.append(this.f2927c);
        sb.append(", ");
        sb.append(this.f2928d);
        return sb.toString();
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f2925a = parcel.readString();
        this.f2926b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2927c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2928d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f2929e = (Bitmap) parcel.readParcelable(classLoader);
        this.f2930f = (Uri) parcel.readParcelable(classLoader);
        this.f2931g = parcel.readBundle(classLoader);
        this.f2932h = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p030v4.media.MediaDescriptionCompat m2456a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0085
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0085
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p030v4.media.C0887d.m2478a(r6)
            r1.mo2747a(r2)
            java.lang.CharSequence r2 = android.support.p030v4.media.C0887d.m2479b(r6)
            r1.mo2746a(r2)
            java.lang.CharSequence r2 = android.support.p030v4.media.C0887d.m2480c(r6)
            r1.mo2750b(r2)
            java.lang.CharSequence r2 = android.support.p030v4.media.C0887d.m2481d(r6)
            r1.mo2751c(r2)
            android.graphics.Bitmap r2 = android.support.p030v4.media.C0887d.m2482e(r6)
            r1.mo2743a(r2)
            android.net.Uri r2 = android.support.p030v4.media.C0887d.m2483f(r6)
            r1.mo2744a(r2)
            android.os.Bundle r2 = android.support.p030v4.media.C0887d.m2484g(r6)
            if (r2 == 0) goto L_0x004a
            android.support.p030v4.media.session.MediaSessionCompat.m2523a(r2)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x004b
        L_0x004a:
            r3 = r0
        L_0x004b:
            if (r3 == 0) goto L_0x0067
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005d
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005d
            goto L_0x0068
        L_0x005d:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0067:
            r0 = r2
        L_0x0068:
            r1.mo2745a(r0)
            if (r3 == 0) goto L_0x0071
            r1.mo2749b(r3)
            goto L_0x007e
        L_0x0071:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007e
            android.net.Uri r0 = android.support.p030v4.media.C0888e.m2485a(r6)
            r1.mo2749b(r0)
        L_0x007e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo2748a()
            r0.f2933i = r6
            return r0
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.media.MediaDescriptionCompat.m2456a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Object obj;
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f2925a);
            TextUtils.writeToParcel(this.f2926b, parcel, i);
            TextUtils.writeToParcel(this.f2927c, parcel, i);
            TextUtils.writeToParcel(this.f2928d, parcel, i);
            parcel.writeParcelable(this.f2929e, i);
            parcel.writeParcelable(this.f2930f, i);
            parcel.writeBundle(this.f2931g);
            parcel.writeParcelable(this.f2932h, i);
            return;
        }
        if (this.f2933i != null || VERSION.SDK_INT < 21) {
            obj = this.f2933i;
        } else {
            Builder builder = new Builder();
            builder.setMediaId(this.f2925a);
            builder.setTitle(this.f2926b);
            builder.setSubtitle(this.f2927c);
            builder.setDescription(this.f2928d);
            builder.setIconBitmap(this.f2929e);
            builder.setIconUri(this.f2930f);
            Bundle bundle = this.f2931g;
            if (VERSION.SDK_INT < 23 && this.f2932h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f2932h);
            }
            builder.setExtras(bundle);
            if (VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.f2932h);
            }
            this.f2933i = builder.build();
            obj = this.f2933i;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2925a = str;
        this.f2926b = charSequence;
        this.f2927c = charSequence2;
        this.f2928d = charSequence3;
        this.f2929e = bitmap;
        this.f2930f = uri;
        this.f2931g = bundle;
        this.f2932h = uri2;
    }
}

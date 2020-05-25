package android.support.p030v4.media;

import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RatingCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };

    /* renamed from: a */
    public final int f2948a;

    /* renamed from: b */
    private final float f2949b;

    /* renamed from: c */
    private Object f2950c;

    public final int describeContents() {
        return this.f2948a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f2948a);
        sb.append(" rating=");
        if (this.f2949b < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(this.f2949b);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static RatingCompat m2466a(Object obj) {
        RatingCompat ratingCompat;
        float f;
        RatingCompat ratingCompat2 = null;
        if (obj == null || VERSION.SDK_INT < 19) {
            return null;
        }
        Rating rating = (Rating) obj;
        int ratingStyle = rating.getRatingStyle();
        if (!rating.isRated()) {
            switch (ratingStyle) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                    break;
            }
        } else {
            float f2 = 1.0f;
            switch (ratingStyle) {
                case 1:
                    if (!rating.hasHeart()) {
                        f2 = 0.0f;
                    }
                    ratingCompat = new RatingCompat(1, f2);
                    break;
                case 2:
                    if (!rating.isThumbUp()) {
                        f2 = 0.0f;
                    }
                    ratingCompat = new RatingCompat(2, f2);
                    break;
                case 3:
                case 4:
                case 5:
                    float starRating = rating.getStarRating();
                    switch (ratingStyle) {
                        case 3:
                            f = 3.0f;
                            break;
                        case 4:
                            f = 4.0f;
                            break;
                        case 5:
                            f = 5.0f;
                            break;
                    }
                    if (starRating >= 0.0f && starRating <= f) {
                        ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                        break;
                    }
                    break;
                case 6:
                    float percentRating = rating.getPercentRating();
                    if (percentRating >= 0.0f && percentRating <= 100.0f) {
                        ratingCompat2 = new RatingCompat(6, percentRating);
                        break;
                    }
                default:
                    return null;
            }
            ratingCompat2 = ratingCompat;
        }
        ratingCompat2.f2950c = obj;
        return ratingCompat2;
    }

    RatingCompat(int i, float f) {
        this.f2948a = i;
        this.f2949b = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2948a);
        parcel.writeFloat(this.f2949b);
    }
}

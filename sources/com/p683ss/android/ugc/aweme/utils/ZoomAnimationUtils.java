package com.p683ss.android.ugc.aweme.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils */
public final class ZoomAnimationUtils {

    /* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils$ZoomInfo */
    public static class ZoomInfo implements Parcelable {
        public static final Creator<ZoomInfo> CREATOR = new Creator<ZoomInfo>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ZoomInfo[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ZoomInfo(parcel);
            }
        };

        /* renamed from: a */
        public int f120129a;

        /* renamed from: b */
        public int f120130b;

        /* renamed from: c */
        public int f120131c;

        /* renamed from: d */
        public int f120132d;

        public int describeContents() {
            return 0;
        }

        protected ZoomInfo(Parcel parcel) {
            this.f120129a = parcel.readInt();
            this.f120130b = parcel.readInt();
            this.f120131c = parcel.readInt();
            this.f120132d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f120129a);
            parcel.writeInt(this.f120130b);
            parcel.writeInt(this.f120131c);
            parcel.writeInt(this.f120132d);
        }

        public ZoomInfo(int i, int i2, int i3, int i4) {
            this.f120129a = i;
            this.f120130b = i2;
            this.f120131c = i3;
            this.f120132d = i4;
        }
    }

    /* renamed from: a */
    public static ZoomInfo m103150a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new ZoomInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }

    /* renamed from: a */
    public static void m103151a(final View view, final ColorDrawable colorDrawable, int... iArr) {
        if (view != null) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(colorDrawable, "alpha", iArr);
            ofInt.setDuration(300);
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view.setBackgroundDrawable(colorDrawable);
                }
            });
            ofInt.start();
        }
    }
}

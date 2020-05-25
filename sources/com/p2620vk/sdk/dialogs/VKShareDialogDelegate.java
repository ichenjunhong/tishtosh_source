package com.p2620vk.sdk.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate */
class VKShareDialogDelegate {

    /* renamed from: a */
    static final /* synthetic */ boolean f130761a = (!VKShareDialogDelegate.class.desiredAssertionStatus());

    /* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate$1 */
    class C524221 implements OnClickListener {
        public final void onClick(View view) {
        }
    }

    /* renamed from: com.vk.sdk.dialogs.VKShareDialogDelegate$UploadingLink */
    static class UploadingLink implements Parcelable {
        public static final Creator<UploadingLink> CREATOR = new Creator<UploadingLink>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new UploadingLink[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new UploadingLink(parcel, null);
            }
        };

        /* renamed from: a */
        public String f130762a;

        /* renamed from: b */
        public String f130763b;

        public int describeContents() {
            return 0;
        }

        private UploadingLink(Parcel parcel) {
            this.f130762a = parcel.readString();
            this.f130763b = parcel.readString();
        }

        /* synthetic */ UploadingLink(Parcel parcel, C524221 r2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f130762a);
            parcel.writeString(this.f130763b);
        }
    }
}

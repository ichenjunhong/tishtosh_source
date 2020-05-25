package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphValueContainer.C14654a;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C14651a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new Creator<ShareOpenGraphAction>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }
    };

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C14651a extends C14654a<ShareOpenGraphAction, C14651a> {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C14651a mo26904a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            C14651a aVar = (C14651a) super.mo26904a(shareOpenGraphAction);
            String a = shareOpenGraphAction.mo26900a();
            aVar.f37999a.putString("og:type", a);
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C14651a mo26903a(Parcel parcel) {
            return mo26904a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* renamed from: a */
    public final String mo26900a() {
        return mo26910b("og:type");
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(C14651a aVar) {
        super((C14654a<P, E>) aVar);
    }
}

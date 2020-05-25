package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.DragViewInfo */
public final class DragViewInfo implements Parcelable {
    public static final C34691a CREATOR = new C34691a(null);

    /* renamed from: a */
    public long f89367a;

    /* renamed from: b */
    public IViewInfo f89368b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.DragViewInfo$a */
    public static final class C34691a implements Creator<DragViewInfo> {
        private C34691a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DragViewInfo[i];
        }

        public /* synthetic */ C34691a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new DragViewInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public DragViewInfo() {
        this.f89367a = -1;
    }

    public DragViewInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this();
        this.f89367a = parcel.readLong();
        this.f89368b = (IViewInfo) parcel.readParcelable(IViewInfo.class.getClassLoader());
    }

    public DragViewInfo(long j, IViewInfo iViewInfo) {
        C52711k.m112240b(iViewInfo, "viewInfo");
        this();
        this.f89367a = j;
        this.f89368b = iViewInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeLong(this.f89367a);
        }
        if (parcel != null) {
            parcel.writeParcelable(this.f89368b, i);
        }
    }
}

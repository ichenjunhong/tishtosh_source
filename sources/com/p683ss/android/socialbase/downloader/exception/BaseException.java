package com.p683ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;

/* renamed from: com.ss.android.socialbase.downloader.exception.BaseException */
public class BaseException extends Exception implements Parcelable {
    public static final Creator<BaseException> CREATOR = new Creator<BaseException>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BaseException[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BaseException(parcel);
        }
    };

    /* renamed from: a */
    private int f54709a;

    /* renamed from: b */
    private String f54710b;

    public BaseException() {
    }

    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.f54709a;
    }

    public String getErrorMessage() {
        return this.f54710b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseException{errorCode=");
        sb.append(this.f54709a);
        sb.append(", errorMsg='");
        sb.append(this.f54710b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setErrorMsg(String str) {
        this.f54710b = str;
    }

    protected BaseException(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.f54709a = parcel.readInt();
        this.f54710b = parcel.readString();
    }

    public BaseException(int i, Throwable th) {
        this(i, C19994e.m49384e(th));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f54709a);
        parcel.writeString(this.f54710b);
    }

    public BaseException(int i, String str) {
        StringBuilder sb = new StringBuilder("[d-ex]:");
        sb.append(str);
        super(sb.toString());
        StringBuilder sb2 = new StringBuilder("[d-ex]:");
        sb2.append(str);
        this.f54710b = sb2.toString();
        this.f54709a = i;
    }
}

package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LineApiError implements Parcelable {
    public static final Creator<LineApiError> CREATOR = new Creator<LineApiError>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineApiError[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineApiError(parcel);
        }
    };

    /* renamed from: a */
    public static final LineApiError f50227a = new LineApiError(-1, "");

    /* renamed from: b */
    public final int f50228b;

    /* renamed from: c */
    public final String f50229c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = this.f50228b * 31;
        if (this.f50229c != null) {
            i = this.f50229c.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineApiError{httpResponseCode=");
        sb.append(this.f50228b);
        sb.append(", message='");
        sb.append(this.f50229c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private LineApiError(Parcel parcel) {
        this.f50228b = parcel.readInt();
        this.f50229c = parcel.readString();
    }

    /* renamed from: a */
    private static String m44388a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a((Throwable) exc, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public LineApiError(Exception exc) {
        this(-1, m44388a(exc));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineApiError lineApiError = (LineApiError) obj;
        if (this.f50228b != lineApiError.f50228b) {
            return false;
        }
        if (this.f50229c != null) {
            return this.f50229c.equals(lineApiError.f50229c);
        }
        if (lineApiError.f50229c == null) {
            return true;
        }
        return false;
    }

    public LineApiError(String str) {
        this(-1, str);
    }

    public LineApiError(int i, Exception exc) {
        this(i, m44388a(exc));
    }

    public LineApiError(int i, String str) {
        this.f50228b = i;
        this.f50229c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50228b);
        parcel.writeString(this.f50229c);
    }
}

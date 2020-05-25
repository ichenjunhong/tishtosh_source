package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.ss.android.ugc.trill.R;

public class Album implements Parcelable {
    public static final Creator<Album> CREATOR = new Creator<Album>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Album[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Album(parcel);
        }
    };

    /* renamed from: a */
    public static final String f114648a = "-1";

    /* renamed from: b */
    public final String f114649b;

    /* renamed from: c */
    public final String f114650c;

    /* renamed from: d */
    public long f114651d;

    /* renamed from: e */
    private final String f114652e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo91656a() {
        this.f114651d++;
    }

    /* renamed from: b */
    public final boolean mo91657b() {
        return f114648a.equals(this.f114649b);
    }

    /* renamed from: c */
    public final boolean mo91658c() {
        if (this.f114651d == 0) {
            return true;
        }
        return false;
    }

    Album(Parcel parcel) {
        this.f114649b = parcel.readString();
        this.f114650c = parcel.readString();
        this.f114652e = parcel.readString();
        this.f114651d = parcel.readLong();
    }

    /* renamed from: a */
    public final String mo91655a(Context context) {
        if (mo91657b()) {
            return context.getString(R.string.c4k);
        }
        return this.f114652e;
    }

    /* renamed from: a */
    public static Album m98883a(Cursor cursor) {
        Album album = new Album(cursor.getString(cursor.getColumnIndex("bucket_id")), cursor.getString(cursor.getColumnIndex("_data")), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
        return album;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114649b);
        parcel.writeString(this.f114650c);
        parcel.writeString(this.f114652e);
        parcel.writeLong(this.f114651d);
    }

    private Album(String str, String str2, String str3, long j) {
        this.f114649b = str;
        this.f114650c = str2;
        this.f114652e = str3;
        this.f114651d = j;
    }
}

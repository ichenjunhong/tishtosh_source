package com.zhihu.matisse.internal.entity;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.zhihu.matisse.C45333b;

public class Item implements Parcelable {
    public static final Creator<Item> CREATOR = new Creator<Item>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Item[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Item(parcel);
        }
    };

    /* renamed from: a */
    public final long f114653a;

    /* renamed from: b */
    public final String f114654b;

    /* renamed from: c */
    public final Uri f114655c;

    /* renamed from: d */
    public final long f114656d;

    /* renamed from: e */
    public final long f114657e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public final boolean mo91664b() {
        if (this.f114654b == null) {
            return false;
        }
        return this.f114654b.equals(C45333b.GIF.toString());
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.f114653a).hashCode() + 31;
        if (this.f114654b != null) {
            hashCode = (hashCode * 31) + this.f114654b.hashCode();
        }
        return (((((hashCode * 31) + this.f114655c.hashCode()) * 31) + Long.valueOf(this.f114656d).hashCode()) * 31) + Long.valueOf(this.f114657e).hashCode();
    }

    /* renamed from: a */
    public final boolean mo91663a() {
        if (this.f114654b == null) {
            return false;
        }
        if (this.f114654b.equals(C45333b.JPEG.toString()) || this.f114654b.equals(C45333b.PNG.toString()) || this.f114654b.equals(C45333b.GIF.toString()) || this.f114654b.equals(C45333b.BMP.toString()) || this.f114654b.equals(C45333b.WEBP.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo91665c() {
        if (this.f114654b == null) {
            return false;
        }
        if (this.f114654b.equals(C45333b.MPEG.toString()) || this.f114654b.equals(C45333b.MP4.toString()) || this.f114654b.equals(C45333b.QUICKTIME.toString()) || this.f114654b.equals(C45333b.THREEGPP.toString()) || this.f114654b.equals(C45333b.THREEGPP2.toString()) || this.f114654b.equals(C45333b.MKV.toString()) || this.f114654b.equals(C45333b.WEBM.toString()) || this.f114654b.equals(C45333b.TS.toString()) || this.f114654b.equals(C45333b.AVI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Item m98888a(Cursor cursor) {
        Item item = new Item(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
        return item;
    }

    private Item(Parcel parcel) {
        this.f114653a = parcel.readLong();
        this.f114654b = parcel.readString();
        this.f114655c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f114656d = parcel.readLong();
        this.f114657e = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.f114653a != item.f114653a || (((this.f114654b == null || !this.f114654b.equals(item.f114654b)) && (this.f114654b != null || item.f114654b != null)) || (((this.f114655c == null || !this.f114655c.equals(item.f114655c)) && (this.f114655c != null || item.f114655c != null)) || this.f114656d != item.f114656d || this.f114657e != item.f114657e))) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f114653a);
        parcel.writeString(this.f114654b);
        parcel.writeParcelable(this.f114655c, 0);
        parcel.writeLong(this.f114656d);
        parcel.writeLong(this.f114657e);
    }

    private Item(long j, String str, long j2, long j3) {
        Uri uri;
        this.f114653a = j;
        this.f114654b = str;
        if (mo91663a()) {
            uri = Media.EXTERNAL_CONTENT_URI;
        } else if (mo91665c()) {
            uri = Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = Files.getContentUri("external");
        }
        this.f114655c = ContentUris.withAppendedId(uri, j);
        this.f114656d = j2;
        this.f114657e = j3;
    }
}

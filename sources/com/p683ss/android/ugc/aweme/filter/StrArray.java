package com.p683ss.android.ugc.aweme.filter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.StrArray */
public class StrArray implements Parcelable, Serializable {
    public static final Creator<StrArray> CREATOR = new Creator<StrArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StrArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StrArray(parcel);
        }
    };

    /* renamed from: a */
    private List<String> f82211a;

    /* renamed from: b */
    private List<Integer> f82212b;

    public int describeContents() {
        return 0;
    }

    public StrArray() {
        this.f82211a = new ArrayList();
        this.f82212b = new ArrayList();
        this.f82212b.add(Integer.valueOf(-1));
    }

    public void addIndex() {
        int size = this.f82211a.size();
        if (size > 0) {
            this.f82212b.add(Integer.valueOf(size - 1));
        }
    }

    public void removeLast() {
        if (!this.f82211a.isEmpty()) {
            this.f82211a.remove(this.f82211a.size() - 1);
        }
    }

    public void removeLastArray() {
        int size = this.f82211a.size();
        int size2 = this.f82212b.size();
        if (size > 0 && size2 > 1) {
            int intValue = ((Integer) this.f82212b.get(size2 - 2)).intValue();
            for (int i = size - 1; i > intValue; i--) {
                this.f82211a.remove(i);
            }
            this.f82212b.remove(size2 - 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.f82211a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f82211a.get(i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void add(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f82211a.add(str);
        }
    }

    public static StrArray from(String str) {
        StrArray strArray = new StrArray();
        if (!TextUtils.isEmpty(str)) {
            for (String add : str.split(",")) {
                strArray.add(add);
            }
        }
        return strArray;
    }

    private StrArray(Parcel parcel) {
        this.f82212b = new ArrayList();
        this.f82211a = parcel.createStringArrayList();
        parcel.readList(this.f82212b, Integer.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f82211a);
        parcel.writeList(this.f82212b);
    }
}

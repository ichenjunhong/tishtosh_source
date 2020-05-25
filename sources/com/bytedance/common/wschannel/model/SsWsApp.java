package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.wschannel.app.IWsApp;
import java.util.ArrayList;
import java.util.List;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Creator<SsWsApp> CREATOR = new Creator<SsWsApp>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SsWsApp[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }
    };

    /* renamed from: a */
    private List<String> f25926a;

    /* renamed from: b */
    private int f25927b;

    /* renamed from: c */
    private String f25928c;

    /* renamed from: d */
    private int f25929d;

    /* renamed from: e */
    private String f25930e;

    /* renamed from: f */
    private String f25931f;

    /* renamed from: g */
    private int f25932g;

    /* renamed from: h */
    private int f25933h;

    /* renamed from: i */
    private int f25934i;

    /* renamed from: j */
    private String f25935j;

    /* renamed from: com.bytedance.common.wschannel.model.SsWsApp$a */
    public static class C9524a {

        /* renamed from: a */
        public int f25936a;

        /* renamed from: b */
        public String f25937b;

        /* renamed from: c */
        public String f25938c;

        /* renamed from: d */
        public int f25939d;

        /* renamed from: e */
        public int f25940e;

        /* renamed from: f */
        public int f25941f;

        /* renamed from: g */
        public String f25942g;

        /* renamed from: h */
        public String f25943h;

        /* renamed from: i */
        public int f25944i;

        /* renamed from: j */
        public List<String> f25945j;
    }

    /* renamed from: a */
    public final int mo17102a() {
        return this.f25927b;
    }

    /* renamed from: b */
    public final int mo17103b() {
        return this.f25929d;
    }

    /* renamed from: c */
    public final String mo17104c() {
        return this.f25930e;
    }

    /* renamed from: d */
    public final String mo17105d() {
        return this.f25931f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo17106e() {
        return this.f25932g;
    }

    /* renamed from: f */
    public final String mo17107f() {
        return this.f25935j;
    }

    /* renamed from: g */
    public final int mo17108g() {
        return this.f25934i;
    }

    /* renamed from: h */
    public final String mo17109h() {
        return this.f25928c;
    }

    /* renamed from: i */
    public final List<String> mo17110i() {
        return this.f25926a;
    }

    protected SsWsApp() {
        this.f25926a = new ArrayList();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = ((this.f25929d * 31) + this.f25927b) * 31;
        int i4 = 0;
        if (this.f25930e != null) {
            i = this.f25930e.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        if (this.f25931f != null) {
            i2 = this.f25931f.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f25928c != null) {
            i4 = this.f25928c.hashCode();
        }
        return ((((i6 + i4) * 31) + this.f25932g) * 31) + this.f25933h;
    }

    protected SsWsApp(Parcel parcel) {
        this.f25926a = new ArrayList();
        this.f25926a = parcel.createStringArrayList();
        this.f25927b = parcel.readInt();
        this.f25928c = parcel.readString();
        this.f25929d = parcel.readInt();
        this.f25930e = parcel.readString();
        this.f25931f = parcel.readString();
        this.f25932g = parcel.readInt();
        this.f25933h = parcel.readInt();
        this.f25934i = parcel.readInt();
        this.f25935j = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (this.f25927b != ssWsApp.f25927b || this.f25929d != ssWsApp.f25929d || this.f25932g != ssWsApp.f25932g || this.f25933h != ssWsApp.f25933h) {
            return false;
        }
        if (this.f25930e == null ? ssWsApp.f25930e != null : !this.f25930e.equals(ssWsApp.f25930e)) {
            return false;
        }
        if (this.f25931f == null ? ssWsApp.f25931f != null : !this.f25931f.equals(ssWsApp.f25931f)) {
            return false;
        }
        if (this.f25934i != ssWsApp.f25934i) {
            return false;
        }
        if (this.f25935j == null ? ssWsApp.f25935j != null : !this.f25935j.equals(ssWsApp.f25935j)) {
            return false;
        }
        if (this.f25926a.size() != ssWsApp.f25926a.size()) {
            return false;
        }
        for (String contains : this.f25926a) {
            if (!ssWsApp.f25926a.contains(contains)) {
                return false;
            }
        }
        return C9431p.m18665a(this.f25928c, ssWsApp.f25928c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f25926a);
        parcel.writeInt(this.f25927b);
        parcel.writeString(this.f25928c);
        parcel.writeInt(this.f25929d);
        parcel.writeString(this.f25930e);
        parcel.writeString(this.f25931f);
        parcel.writeInt(this.f25932g);
        parcel.writeInt(this.f25933h);
        parcel.writeInt(this.f25934i);
        parcel.writeString(this.f25935j);
    }

    private SsWsApp(int i, int i2, String str, String str2, List<String> list, int i3, int i4, int i5, String str3, String str4) {
        this.f25926a = new ArrayList();
        this.f25929d = i2;
        this.f25927b = i;
        this.f25930e = str;
        this.f25931f = str2;
        if (list != null) {
            this.f25926a.addAll(list);
        }
        this.f25932g = i3;
        this.f25933h = i4;
        this.f25934i = i5;
        this.f25935j = str3;
        this.f25928c = str4;
    }
}

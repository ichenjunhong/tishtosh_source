package com.p683ss.android.ugc.aweme.sharer.p2173ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage */
public class SharePackage implements Parcelable {
    public static final Creator<SharePackage> CREATOR = new C42328c();

    /* renamed from: k */
    public static final C42327b f106894k = new C42327b(null);

    /* renamed from: d */
    public final String f106895d;

    /* renamed from: e */
    public final String f106896e;

    /* renamed from: f */
    public final String f106897f;

    /* renamed from: g */
    public final String f106898g;

    /* renamed from: h */
    public final String f106899h;

    /* renamed from: i */
    public final Bundle f106900i = new Bundle();

    /* renamed from: j */
    public final C42326a f106901j;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$a */
    public static class C42326a {

        /* renamed from: a */
        public String f106902a;

        /* renamed from: b */
        public String f106903b;

        /* renamed from: c */
        public String f106904c;

        /* renamed from: d */
        public String f106905d;

        /* renamed from: e */
        public String f106906e;

        /* renamed from: f */
        public final Bundle f106907f = new Bundle();

        /* renamed from: a */
        public final SharePackage mo86238a() {
            return new SharePackage(this);
        }

        /* renamed from: a */
        public final C42326a mo86236a(String str) {
            C52711k.m112240b(str, "type");
            this.f106902a = str;
            return this;
        }

        /* renamed from: b */
        public final C42326a mo86239b(String str) {
            C52711k.m112240b(str, "id");
            this.f106903b = str;
            return this;
        }

        /* renamed from: c */
        public final C42326a mo86240c(String str) {
            C52711k.m112240b(str, "title");
            this.f106904c = str;
            return this;
        }

        /* renamed from: d */
        public final C42326a mo86241d(String str) {
            C52711k.m112240b(str, "desc");
            this.f106905d = str;
            return this;
        }

        /* renamed from: e */
        public final C42326a mo86242e(String str) {
            C52711k.m112240b(str, "url");
            this.f106906e = str;
            return this;
        }

        /* renamed from: a */
        public final C42326a mo86237a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "value");
            this.f106907f.putString(str, str2);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$b */
    public static final class C42327b {
        private C42327b() {
        }

        public /* synthetic */ C42327b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.SharePackage$c */
    public static final class C42328c implements Creator<SharePackage> {
        C42328c() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            C42326a aVar = new C42326a();
            C52711k.m112240b(parcel, "source");
            aVar.f106902a = parcel.readString();
            aVar.f106903b = parcel.readString();
            aVar.f106904c = parcel.readString();
            aVar.f106905d = parcel.readString();
            aVar.f106906e = parcel.readString();
            aVar.f106907f.putAll(parcel.readBundle(aVar.getClass().getClassLoader()));
            return new SharePackage(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        return false;
    }

    /* renamed from: a */
    public boolean mo86154a(C42357g gVar, Context context) {
        C52711k.m112240b(gVar, "action");
        C52711k.m112240b(context, "context");
        return false;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public C42318f mo73884a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        C42322h hVar = new C42322h(this.f106899h, null, null, 6, null);
        return hVar;
    }

    public SharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        this.f106901j = aVar;
        String str = this.f106901j.f106902a;
        if (str == null) {
            C52711k.m112234a();
        }
        this.f106895d = str;
        String str2 = this.f106901j.f106903b;
        if (str2 == null) {
            str2 = "";
        }
        this.f106896e = str2;
        String str3 = this.f106901j.f106904c;
        if (str3 == null) {
            str3 = "";
        }
        this.f106897f = str3;
        String str4 = this.f106901j.f106905d;
        if (str4 == null) {
            str4 = "";
        }
        this.f106898g = str4;
        String str5 = this.f106901j.f106906e;
        if (str5 == null) {
            str5 = "";
        }
        this.f106899h = str5;
        this.f106900i.putAll(this.f106901j.f106907f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.f106895d);
            parcel.writeString(this.f106896e);
            parcel.writeString(this.f106897f);
            parcel.writeString(this.f106898g);
            parcel.writeString(this.f106899h);
            parcel.writeBundle(this.f106900i);
        }
    }
}

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C14634a;
import com.facebook.share.model.ShareHashtag.C14636a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends C14634a> implements ShareModel {

    /* renamed from: h */
    public final Uri f37946h;

    /* renamed from: i */
    public final List<String> f37947i;

    /* renamed from: j */
    public final String f37948j;

    /* renamed from: k */
    public final String f37949k;

    /* renamed from: l */
    public final String f37950l;

    /* renamed from: m */
    public final ShareHashtag f37951m;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C14634a<P extends ShareContent, E extends C14634a> {

        /* renamed from: a */
        public Uri f37952a;

        /* renamed from: b */
        public List<String> f37953b;

        /* renamed from: c */
        public String f37954c;

        /* renamed from: d */
        public String f37955d;

        /* renamed from: e */
        public String f37956e;

        /* renamed from: f */
        public ShareHashtag f37957f;

        /* renamed from: a */
        public final E mo26870a(Uri uri) {
            this.f37952a = uri;
            return this;
        }

        /* renamed from: a */
        public E mo26871a(P p) {
            List<String> list;
            if (p == null) {
                return this;
            }
            E a = mo26870a(p.f37946h);
            List<String> list2 = p.f37947i;
            if (list2 == null) {
                list = null;
            } else {
                list = Collections.unmodifiableList(list2);
            }
            a.f37953b = list;
            a.f37954c = p.f37948j;
            a.f37955d = p.f37949k;
            a.f37956e = p.f37950l;
            return a;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareContent(C14634a aVar) {
        this.f37946h = aVar.f37952a;
        this.f37947i = aVar.f37953b;
        this.f37948j = aVar.f37954c;
        this.f37949k = aVar.f37955d;
        this.f37950l = aVar.f37956e;
        this.f37951m = aVar.f37957f;
    }

    protected ShareContent(Parcel parcel) {
        List<String> list;
        this.f37946h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            list = null;
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.f37947i = list;
        this.f37948j = parcel.readString();
        this.f37949k = parcel.readString();
        this.f37950l = parcel.readString();
        C14636a aVar = new C14636a();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            aVar.f37959a = shareHashtag.f37958a;
        }
        this.f37951m = new ShareHashtag(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37946h, 0);
        parcel.writeStringList(this.f37947i);
        parcel.writeString(this.f37948j);
        parcel.writeString(this.f37949k);
        parcel.writeString(this.f37950l);
        parcel.writeParcelable(this.f37951m, 0);
    }
}

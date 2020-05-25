package com.p683ss.android.ugc.aweme.search.model;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.search.model.a */
public final class C41434a implements Serializable {
    public static final C41436b Companion = new C41436b(null);
    public static final long serialVersionUID = 42;

    /* renamed from: a */
    private String f105008a;

    /* renamed from: b */
    private String f105009b;

    /* renamed from: c */
    private String f105010c;

    /* renamed from: d */
    private String f105011d;

    /* renamed from: e */
    private int f105012e;

    /* renamed from: f */
    private String f105013f;

    /* renamed from: com.ss.android.ugc.aweme.search.model.a$a */
    public static final class C41435a {

        /* renamed from: a */
        public String f105014a;

        /* renamed from: b */
        private String f105015b;

        /* renamed from: c */
        private String f105016c;

        /* renamed from: d */
        private String f105017d;

        /* renamed from: e */
        private int f105018e;

        /* renamed from: a */
        public final C41434a mo84114a() {
            C41434a aVar = new C41434a();
            aVar.setEnterSearchFrom(this.f105015b);
            aVar.setPreviousPage(this.f105014a);
            aVar.setGroupId(this.f105016c);
            aVar.setAuthorId(this.f105017d);
            aVar.setEnterSearchFromBusiness(this.f105018e);
            return aVar;
        }

        /* renamed from: a */
        public final C41435a mo84112a(int i) {
            this.f105018e = i;
            return this;
        }

        /* renamed from: b */
        public final C41435a mo84115b(String str) {
            this.f105016c = str;
            return this;
        }

        /* renamed from: c */
        public final C41435a mo84116c(String str) {
            this.f105017d = str;
            return this;
        }

        /* renamed from: a */
        public final C41435a mo84113a(String str) {
            this.f105015b = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.a$b */
    public static final class C41436b implements Serializable {
        private C41436b() {
        }

        public final C41435a newBuilder() {
            return new C41435a();
        }

        public /* synthetic */ C41436b(C52707g gVar) {
            this();
        }
    }

    public static final C41435a newBuilder() {
        return Companion.newBuilder();
    }

    public final String getAuthorId() {
        return this.f105011d;
    }

    public final String getEnterSearchFrom() {
        return this.f105008a;
    }

    public final int getEnterSearchFromBusiness() {
        return this.f105012e;
    }

    public final String getGidRequest() {
        return this.f105013f;
    }

    public final String getGroupId() {
        return this.f105010c;
    }

    public final String getPreviousPage() {
        return this.f105009b;
    }

    public final String consumeGid() {
        String str = this.f105013f;
        this.f105013f = null;
        return str;
    }

    public final void setAuthorId(String str) {
        this.f105011d = str;
    }

    public final void setEnterSearchFrom(String str) {
        this.f105008a = str;
    }

    public final void setEnterSearchFromBusiness(int i) {
        this.f105012e = i;
    }

    public final void setGidRequest(String str) {
        this.f105013f = str;
    }

    public final void setPreviousPage(String str) {
        this.f105009b = str;
    }

    public final void setGroupId(String str) {
        this.f105010c = str;
        this.f105013f = this.f105010c;
    }
}

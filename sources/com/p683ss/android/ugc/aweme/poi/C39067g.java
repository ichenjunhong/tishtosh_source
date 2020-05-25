package com.p683ss.android.ugc.aweme.poi;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.g */
public final class C39067g implements Serializable {

    /* renamed from: a */
    private String f99644a;

    /* renamed from: b */
    private String f99645b;

    /* renamed from: c */
    private String f99646c;

    /* renamed from: d */
    private String f99647d;

    /* renamed from: e */
    private String f99648e;

    /* renamed from: f */
    private String f99649f;

    /* renamed from: g */
    private String f99650g;

    /* renamed from: h */
    private String f99651h;

    /* renamed from: i */
    private Boolean f99652i = Boolean.valueOf(false);

    /* renamed from: j */
    private String f99653j;

    /* renamed from: k */
    private String f99654k;

    /* renamed from: com.ss.android.ugc.aweme.poi.g$a */
    public static final class C39068a {

        /* renamed from: a */
        public String f99655a;

        /* renamed from: b */
        public String f99656b;

        /* renamed from: c */
        public String f99657c;

        /* renamed from: d */
        public String f99658d;

        /* renamed from: e */
        public String f99659e;

        /* renamed from: f */
        public String f99660f;

        /* renamed from: g */
        public String f99661g;

        /* renamed from: h */
        public String f99662h;

        /* renamed from: i */
        public Boolean f99663i = Boolean.valueOf(false);

        /* renamed from: j */
        public String f99664j;

        /* renamed from: k */
        public String f99665k;

        /* renamed from: a */
        public final C39067g mo79256a() {
            C39067g gVar = new C39067g();
            gVar.setPoiId(this.f99655a);
            gVar.setPoiType(this.f99656b);
            gVar.setPoiChannel(this.f99657c);
            gVar.setActivityId(this.f99658d);
            gVar.setAwemeId(this.f99659e);
            gVar.setPreviousPage(this.f99660f);
            gVar.setBackendType(this.f99661g);
            gVar.setPoiCity(this.f99662h);
            gVar.setFromLive(this.f99663i);
            gVar.setAnchorId(this.f99664j);
            gVar.setRoomId(this.f99665k);
            return gVar;
        }

        /* renamed from: a */
        public final C39068a mo79255a(String str) {
            this.f99655a = str;
            return this;
        }

        /* renamed from: b */
        public final C39068a mo79257b(String str) {
            this.f99656b = str;
            return this;
        }

        /* renamed from: c */
        public final C39068a mo79258c(String str) {
            this.f99657c = str;
            return this;
        }

        /* renamed from: d */
        public final C39068a mo79259d(String str) {
            this.f99658d = str;
            return this;
        }

        /* renamed from: e */
        public final C39068a mo79260e(String str) {
            this.f99659e = str;
            return this;
        }

        /* renamed from: f */
        public final C39068a mo79261f(String str) {
            this.f99660f = str;
            return this;
        }

        /* renamed from: g */
        public final C39068a mo79262g(String str) {
            this.f99661g = str;
            return this;
        }

        /* renamed from: h */
        public final C39068a mo79263h(String str) {
            this.f99662h = str;
            return this;
        }
    }

    public final String getActivityId() {
        return this.f99647d;
    }

    public final String getAnchorId() {
        return this.f99653j;
    }

    public final String getAwemeId() {
        return this.f99648e;
    }

    public final String getBackendType() {
        return this.f99650g;
    }

    public final String getPoiChannel() {
        return this.f99646c;
    }

    public final String getPoiCity() {
        return this.f99651h;
    }

    public final String getPoiId() {
        return this.f99644a;
    }

    public final String getPoiType() {
        return this.f99645b;
    }

    public final String getPreviousPage() {
        return this.f99649f;
    }

    public final String getRoomId() {
        return this.f99654k;
    }

    public final Boolean isFromLive() {
        return this.f99652i;
    }

    public final void setActivityId(String str) {
        this.f99647d = str;
    }

    public final void setAnchorId(String str) {
        this.f99653j = str;
    }

    public final void setAwemeId(String str) {
        this.f99648e = str;
    }

    public final void setBackendType(String str) {
        this.f99650g = str;
    }

    public final void setFromLive(Boolean bool) {
        this.f99652i = bool;
    }

    public final void setPoiChannel(String str) {
        this.f99646c = str;
    }

    public final void setPoiCity(String str) {
        this.f99651h = str;
    }

    public final void setPoiId(String str) {
        this.f99644a = str;
    }

    public final void setPoiType(String str) {
        this.f99645b = str;
    }

    public final void setPreviousPage(String str) {
        this.f99649f = str;
    }

    public final void setRoomId(String str) {
        this.f99654k = str;
    }
}

package com.p683ss.android.ugc.aweme.p1308ad.comment;

import com.p683ss.android.ugc.aweme.p1308ad.comment.C22347a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.a */
public class C22347a<T extends C22347a> implements Serializable {
    private static final long serialVersionUID = 9148864135191458444L;

    /* renamed from: a */
    protected String f60204a;

    /* renamed from: b */
    protected String f60205b;

    /* renamed from: c */
    protected String f60206c;

    public String getAid() {
        return this.f60205b;
    }

    public String getAuthorUid() {
        return this.f60206c;
    }

    public String getCid() {
        return this.f60204a;
    }

    public C22347a setAid(String str) {
        this.f60205b = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.f60206c = str;
        return this;
    }

    public C22347a setCid(String str) {
        this.f60204a = str;
        return this;
    }

    public C22347a(String str) {
        this.f60205b = str;
    }
}

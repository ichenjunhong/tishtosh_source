package com.p683ss.android.ugc.aweme.comment.p1521f;

import com.p683ss.android.ugc.aweme.comment.p1521f.C25168d;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.f.d */
public class C25168d<T extends C25168d> implements Serializable {
    private static final long serialVersionUID = 9148864135191458444L;

    /* renamed from: a */
    protected String f66681a;

    /* renamed from: b */
    protected String f66682b;

    /* renamed from: c */
    protected String f66683c;

    public String getAid() {
        return this.f66682b;
    }

    public String getAuthorUid() {
        return this.f66683c;
    }

    public String getCid() {
        return this.f66681a;
    }

    public C25168d setAid(String str) {
        this.f66682b = str;
        return this;
    }

    public T setAuthorUid(String str) {
        this.f66683c = str;
        return this;
    }

    public C25168d setCid(String str) {
        this.f66681a = str;
        return this;
    }

    public C25168d(String str) {
        this.f66682b = str;
    }
}

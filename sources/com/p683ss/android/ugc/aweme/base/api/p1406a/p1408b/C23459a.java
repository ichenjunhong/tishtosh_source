package com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.base.api.p1406a.C23454a;

/* renamed from: com.ss.android.ugc.aweme.base.api.a.b.a */
public class C23459a extends C23454a {

    /* renamed from: d */
    private static C17971f f62521d;

    /* renamed from: a */
    protected String f62522a;

    /* renamed from: b */
    protected String f62523b;

    /* renamed from: c */
    protected String f62524c;

    /* renamed from: e */
    private Object f62525e;

    /* renamed from: f */
    private int f62526f;

    public int getBlockCode() {
        return this.f62526f;
    }

    public String getErrorMsg() {
        return this.f62522a;
    }

    public String getPrompt() {
        return this.f62523b;
    }

    public Object getRawResponse() {
        return this.f62525e;
    }

    public String getUrl() {
        return this.f62524c;
    }

    public String getResponse() {
        return convertResponseToString();
    }

    public String convertResponseToString() {
        if (this.f62525e instanceof String) {
            return (String) this.f62525e;
        }
        if (f62521d == null) {
            f62521d = new C17971f();
        }
        this.f62525e = f62521d.mo34889b(this.f62525e);
        return (String) this.f62525e;
    }

    public C23459a(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.f62526f = i;
    }

    public C23459a setErrorMsg(String str) {
        this.f62522a = str;
        return this;
    }

    public C23459a setPrompt(String str) {
        this.f62523b = str;
        return this;
    }

    public C23459a setResponse(Object obj) {
        this.f62525e = obj;
        return this;
    }

    public C23459a setUrl(String str) {
        this.f62524c = str;
        return this;
    }

    public C23459a setResponse(String str) {
        this.f62525e = str;
        return this;
    }
}

package com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.a */
public class C36952a implements Serializable {
    public int code;
    public String message;
    public boolean success;
    public String type;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a.a$a */
    public static final class C36953a {

        /* renamed from: a */
        public int f94321a;

        /* renamed from: b */
        private String f94322b;

        /* renamed from: c */
        private String f94323c;

        /* renamed from: d */
        private boolean f94324d;

        /* renamed from: a */
        public final C36952a mo76204a() {
            C36952a aVar = new C36952a();
            aVar.type = this.f94322b;
            aVar.message = this.f94323c;
            aVar.code = this.f94321a;
            aVar.success = this.f94324d;
            return aVar;
        }

        /* renamed from: a */
        public final C36953a mo76202a(String str) {
            this.f94322b = str;
            return this;
        }

        /* renamed from: b */
        public final C36953a mo76205b(String str) {
            this.f94323c = str;
            return this;
        }

        /* renamed from: a */
        public final C36953a mo76203a(boolean z) {
            this.f94324d = z;
            return this;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return this.type;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setType(String str) {
        this.type = str;
    }
}

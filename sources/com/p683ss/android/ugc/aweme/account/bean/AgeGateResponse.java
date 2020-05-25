package com.p683ss.android.ugc.aweme.account.bean;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse */
public final class AgeGateResponse implements Serializable {
    public static final C20932a Companion = new C20932a(null);
    public static final int DISABLE_AGE_GATE_TRUE = 1;
    @C17952c(mo34828a = "age_gate_post_action")
    private final int ageGatePostAction;
    private final boolean is_prompt;
    @C17952c(mo34828a = "register_age_gate_post_action")
    private final int registerAgeGatePostAction;
    private final int status_code;
    private final String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.account.bean.AgeGateResponse$a */
    public static final class C20932a {
        private C20932a() {
        }

        public /* synthetic */ C20932a(C52707g gVar) {
            this();
        }
    }

    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, int i, String str, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ageGateResponse.status_code;
        }
        if ((i4 & 2) != 0) {
            str = ageGateResponse.status_msg;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            z = ageGateResponse.is_prompt;
        }
        boolean z2 = z;
        if ((i4 & 8) != 0) {
            i2 = ageGateResponse.registerAgeGatePostAction;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = ageGateResponse.ageGatePostAction;
        }
        return ageGateResponse.copy(i, str2, z2, i5, i3);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final boolean component3() {
        return this.is_prompt;
    }

    public final int component4() {
        return this.registerAgeGatePostAction;
    }

    public final int component5() {
        return this.ageGatePostAction;
    }

    public final AgeGateResponse copy(int i, String str, boolean z, int i2, int i3) {
        AgeGateResponse ageGateResponse = new AgeGateResponse(i, str, z, i2, i3);
        return ageGateResponse;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeGateResponse) {
                AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
                if ((this.status_code == ageGateResponse.status_code) && C52711k.m112239a((Object) this.status_msg, (Object) ageGateResponse.status_msg)) {
                    if (this.is_prompt == ageGateResponse.is_prompt) {
                        if (this.registerAgeGatePostAction == ageGateResponse.registerAgeGatePostAction) {
                            if (this.ageGatePostAction == ageGateResponse.ageGatePostAction) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final int getRegisterAgeGatePostAction() {
        return this.registerAgeGatePostAction;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.is_prompt;
        if (z) {
            z = true;
        }
        return ((((hashCode + (z ? 1 : 0)) * 31) + this.registerAgeGatePostAction) * 31) + this.ageGatePostAction;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgeGateResponse(status_code=");
        sb.append(this.status_code);
        sb.append(", status_msg=");
        sb.append(this.status_msg);
        sb.append(", is_prompt=");
        sb.append(this.is_prompt);
        sb.append(", registerAgeGatePostAction=");
        sb.append(this.registerAgeGatePostAction);
        sb.append(", ageGatePostAction=");
        sb.append(this.ageGatePostAction);
        sb.append(")");
        return sb.toString();
    }

    public AgeGateResponse(int i, String str, boolean z, int i2, int i3) {
        this.status_code = i;
        this.status_msg = str;
        this.is_prompt = z;
        this.registerAgeGatePostAction = i2;
        this.ageGatePostAction = i3;
    }

    public /* synthetic */ AgeGateResponse(int i, String str, boolean z, int i2, int i3, int i4, C52707g gVar) {
        int i5;
        int i6;
        if ((i4 & 8) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 16) != 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        this(i, str, z, i5, i6);
    }
}

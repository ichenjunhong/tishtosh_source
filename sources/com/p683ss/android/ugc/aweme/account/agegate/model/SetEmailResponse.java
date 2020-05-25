package com.p683ss.android.ugc.aweme.account.agegate.model;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.SetEmailResponse */
public final class SetEmailResponse {
    private final int status_code;
    private final String status_msg;

    public static /* synthetic */ SetEmailResponse copy$default(SetEmailResponse setEmailResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setEmailResponse.status_code;
        }
        if ((i2 & 2) != 0) {
            str = setEmailResponse.status_msg;
        }
        return setEmailResponse.copy(i, str);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final SetEmailResponse copy(int i, String str) {
        C52711k.m112240b(str, "status_msg");
        return new SetEmailResponse(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetEmailResponse) {
                SetEmailResponse setEmailResponse = (SetEmailResponse) obj;
                if (!(this.status_code == setEmailResponse.status_code) || !C52711k.m112239a((Object) this.status_msg, (Object) setEmailResponse.status_msg)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.status_code) * 31;
        String str = this.status_msg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetEmailResponse(status_code=");
        sb.append(this.status_code);
        sb.append(", status_msg=");
        sb.append(this.status_msg);
        sb.append(")");
        return sb.toString();
    }

    public SetEmailResponse(int i, String str) {
        C52711k.m112240b(str, "status_msg");
        this.status_code = i;
        this.status_msg = str;
    }
}

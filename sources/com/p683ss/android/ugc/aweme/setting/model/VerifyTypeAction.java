package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyTypeAction */
public final class VerifyTypeAction {
    @C17952c(mo34828a = "action_type")
    public final int actionType;
    public final String link;
    @C17952c(mo34828a = "toast_key")
    public final String toastKey;

    public static /* synthetic */ VerifyTypeAction copy$default(VerifyTypeAction verifyTypeAction, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = verifyTypeAction.actionType;
        }
        if ((i2 & 2) != 0) {
            str = verifyTypeAction.toastKey;
        }
        if ((i2 & 4) != 0) {
            str2 = verifyTypeAction.link;
        }
        return verifyTypeAction.copy(i, str, str2);
    }

    public final VerifyTypeAction copy(int i, String str, String str2) {
        return new VerifyTypeAction(i, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VerifyTypeAction) {
                VerifyTypeAction verifyTypeAction = (VerifyTypeAction) obj;
                if (!(this.actionType == verifyTypeAction.actionType) || !C52711k.m112239a((Object) this.toastKey, (Object) verifyTypeAction.toastKey) || !C52711k.m112239a((Object) this.link, (Object) verifyTypeAction.link)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.actionType * 31;
        String str = this.toastKey;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyTypeAction(actionType=");
        sb.append(this.actionType);
        sb.append(", toastKey=");
        sb.append(this.toastKey);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(")");
        return sb.toString();
    }

    public VerifyTypeAction(int i, String str, String str2) {
        this.actionType = i;
        this.toastKey = str;
        this.link = str2;
    }
}

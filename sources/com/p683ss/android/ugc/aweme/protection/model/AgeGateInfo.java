package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.protection.model.AgeGateInfo */
public final class AgeGateInfo implements Serializable {
    @C17952c(mo34828a = "age_gate_action")
    private final int ageGateAction;
    @C17952c(mo34828a = "age_gate_post_action")
    private final int ageGatePostAction;
    @C17952c(mo34828a = "age_gate_time")
    private final long ageGateTime;
    @C17952c(mo34828a = "register_age_gate_action")
    private final int registerAgeGateAction;

    public AgeGateInfo() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ AgeGateInfo copy$default(AgeGateInfo ageGateInfo, int i, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ageGateInfo.registerAgeGateAction;
        }
        if ((i4 & 2) != 0) {
            i2 = ageGateInfo.ageGateAction;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = ageGateInfo.ageGatePostAction;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            j = ageGateInfo.ageGateTime;
        }
        return ageGateInfo.copy(i, i5, i6, j);
    }

    public final int component1() {
        return this.registerAgeGateAction;
    }

    public final int component2() {
        return this.ageGateAction;
    }

    public final int component3() {
        return this.ageGatePostAction;
    }

    public final long component4() {
        return this.ageGateTime;
    }

    public final AgeGateInfo copy(int i, int i2, int i3, long j) {
        AgeGateInfo ageGateInfo = new AgeGateInfo(i, i2, i3, j);
        return ageGateInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeGateInfo) {
                AgeGateInfo ageGateInfo = (AgeGateInfo) obj;
                if (this.registerAgeGateAction == ageGateInfo.registerAgeGateAction) {
                    if (this.ageGateAction == ageGateInfo.ageGateAction) {
                        if (this.ageGatePostAction == ageGateInfo.ageGatePostAction) {
                            if (this.ageGateTime == ageGateInfo.ageGateTime) {
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

    public final int getAgeGateAction() {
        return this.ageGateAction;
    }

    public final int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final long getAgeGateTime() {
        return this.ageGateTime;
    }

    public final int getRegisterAgeGateAction() {
        return this.registerAgeGateAction;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.registerAgeGateAction) * 31) + Integer.hashCode(this.ageGateAction)) * 31) + Integer.hashCode(this.ageGatePostAction)) * 31) + Long.hashCode(this.ageGateTime);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgeGateInfo(registerAgeGateAction=");
        sb.append(this.registerAgeGateAction);
        sb.append(", ageGateAction=");
        sb.append(this.ageGateAction);
        sb.append(", ageGatePostAction=");
        sb.append(this.ageGatePostAction);
        sb.append(", ageGateTime=");
        sb.append(this.ageGateTime);
        sb.append(")");
        return sb.toString();
    }

    public AgeGateInfo(int i, int i2, int i3, long j) {
        this.registerAgeGateAction = i;
        this.ageGateAction = i2;
        this.ageGatePostAction = i3;
        this.ageGateTime = j;
    }

    public /* synthetic */ AgeGateInfo(int i, int i2, int i3, long j, int i4, C52707g gVar) {
        int i5;
        int i6;
        int i7 = 0;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 4) == 0) {
            i7 = i3;
        }
        if ((i4 & 8) != 0) {
            j = 0;
        }
        this(i5, i6, i7, j);
    }
}

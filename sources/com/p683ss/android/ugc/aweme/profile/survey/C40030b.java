package com.p683ss.android.ugc.aweme.profile.survey;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.b */
public final class C40030b {
    @C17952c(mo34828a = "action_type")

    /* renamed from: a */
    public int f101971a;
    @C17952c(mo34828a = "dialog_id")

    /* renamed from: b */
    public int f101972b;
    @C17952c(mo34828a = "original_id")

    /* renamed from: c */
    public int f101973c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40030b) {
                C40030b bVar = (C40030b) obj;
                if (this.f101971a == bVar.f101971a) {
                    if (this.f101972b == bVar.f101972b) {
                        if (this.f101973c == bVar.f101973c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.f101971a) * 31) + Integer.hashCode(this.f101972b)) * 31) + Integer.hashCode(this.f101973c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurveyAnswer(actionType=");
        sb.append(this.f101971a);
        sb.append(", dialogId=");
        sb.append(this.f101972b);
        sb.append(", originalId=");
        sb.append(this.f101973c);
        sb.append(")");
        return sb.toString();
    }

    public C40030b(int i, int i2, int i3) {
        this.f101971a = i;
        this.f101972b = i2;
        this.f101973c = i3;
    }
}

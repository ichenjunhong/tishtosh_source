package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationTypeParameters */
public final class RelationTypeParameters {
    @C17952c(mo34828a = "event")
    public final String event;
    @C17952c(mo34828a = "type")
    public final int type;

    public static /* synthetic */ RelationTypeParameters copy$default(RelationTypeParameters relationTypeParameters, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = relationTypeParameters.type;
        }
        if ((i2 & 2) != 0) {
            str = relationTypeParameters.event;
        }
        return relationTypeParameters.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.event;
    }

    public final RelationTypeParameters copy(int i, String str) {
        C52711k.m112240b(str, "event");
        return new RelationTypeParameters(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RelationTypeParameters) {
                RelationTypeParameters relationTypeParameters = (RelationTypeParameters) obj;
                if (!(this.type == relationTypeParameters.type) || !C52711k.m112239a((Object) this.event, (Object) relationTypeParameters.event)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getEvent() {
        return this.event;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.event;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationTypeParameters(type=");
        sb.append(this.type);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(")");
        return sb.toString();
    }

    public RelationTypeParameters(int i, String str) {
        C52711k.m112240b(str, "event");
        this.type = i;
        this.event = str;
    }
}

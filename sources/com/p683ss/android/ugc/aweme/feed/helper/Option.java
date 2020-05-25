package com.p683ss.android.ugc.aweme.feed.helper;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.feed.helper.Option */
public final class Option {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public int f79275id;
    @C17952c(mo34828a = "name")
    public String name;

    public Option() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ Option copy$default(Option option, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = option.f79275id;
        }
        if ((i2 & 2) != 0) {
            str = option.name;
        }
        return option.copy(i, str);
    }

    public final int component1() {
        return this.f79275id;
    }

    public final String component2() {
        return this.name;
    }

    public final Option copy(int i, String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        return new Option(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Option) {
                Option option = (Option) obj;
                if (!(this.f79275id == option.f79275id) || !C52711k.m112239a((Object) this.name, (Object) option.name)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getId() {
        return this.f79275id;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f79275id) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option(id=");
        sb.append(this.f79275id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public final void setId(int i) {
        this.f79275id = i;
    }

    public final void setName(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.name = str;
    }

    public Option(int i, String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        this.f79275id = i;
        this.name = str;
    }

    public /* synthetic */ Option(int i, String str, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        this(i, str);
    }
}

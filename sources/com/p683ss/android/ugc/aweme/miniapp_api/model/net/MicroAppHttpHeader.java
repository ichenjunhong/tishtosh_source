package com.p683ss.android.ugc.aweme.miniapp_api.model.net;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader */
public final class MicroAppHttpHeader {
    private final String name;
    private final String value;

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(": ");
        String str2 = this.value;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C52711k.m112239a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        MicroAppHttpHeader microAppHttpHeader = (MicroAppHttpHeader) obj;
        if (true ^ C52711k.m112239a((Object) this.name, (Object) microAppHttpHeader.name)) {
            return false;
        }
        return C52711k.m112239a((Object) this.value, (Object) microAppHttpHeader.value);
    }

    public MicroAppHttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}

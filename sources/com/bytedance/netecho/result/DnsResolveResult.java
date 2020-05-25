package com.bytedance.netecho.result;

import p2628d.p2639f.p2641b.C52711k;

public final class DnsResolveResult extends Result {

    /* renamed from: ip */
    private final String f32643ip;
    private final boolean success;
    private final String throwableMsg;

    public static /* synthetic */ DnsResolveResult copy$default(DnsResolveResult dnsResolveResult, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dnsResolveResult.success;
        }
        if ((i & 2) != 0) {
            str = dnsResolveResult.f32643ip;
        }
        if ((i & 4) != 0) {
            str2 = dnsResolveResult.throwableMsg;
        }
        return dnsResolveResult.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.f32643ip;
    }

    public final String component3() {
        return this.throwableMsg;
    }

    public final DnsResolveResult copy(boolean z, String str, String str2) {
        return new DnsResolveResult(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DnsResolveResult) {
                DnsResolveResult dnsResolveResult = (DnsResolveResult) obj;
                if (!(this.success == dnsResolveResult.success) || !C52711k.m112239a((Object) this.f32643ip, (Object) dnsResolveResult.f32643ip) || !C52711k.m112239a((Object) this.throwableMsg, (Object) dnsResolveResult.throwableMsg)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getIp() {
        return this.f32643ip;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getThrowableMsg() {
        return this.throwableMsg;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f32643ip;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.throwableMsg;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DnsResolveResult(success=");
        sb.append(this.success);
        sb.append(", ip=");
        sb.append(this.f32643ip);
        sb.append(", throwableMsg=");
        sb.append(this.throwableMsg);
        sb.append(")");
        return sb.toString();
    }

    public DnsResolveResult(boolean z, String str, String str2) {
        this.success = z;
        this.f32643ip = str;
        this.throwableMsg = str2;
    }
}

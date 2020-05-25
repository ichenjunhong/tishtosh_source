package com.p683ss.android.ugc.network.observer.bean;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.network.observer.bean.DetectorParam */
public final class DetectorParam {
    @C17952c(mo34828a = "black_timeout")
    public int blackTimeout = 300000;
    @C17952c(mo34828a = "dns_timeout")
    public int dnsTimeout = 2000;
    @C17952c(mo34828a = "frequency_limit")
    public int frequencyLimit = 4;
    @C17952c(mo34828a = "ping_timeout")
    public int pingTimeout = 3000;
    @C17952c(mo34828a = "start_timeout")
    public int startTimeout = 5000;
    @C17952c(mo34828a = "target_list")
    public String[] targetList = {"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};
    @C17952c(mo34828a = "tcp_timeout")
    public int tcpTimeout = 4000;

    public final int getBlackTimeout() {
        return this.blackTimeout;
    }

    public final int getDnsTimeout() {
        return this.dnsTimeout;
    }

    public final int getFrequencyLimit() {
        return this.frequencyLimit;
    }

    public final int getPingTimeout() {
        return this.pingTimeout;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final String[] getTargetList() {
        return this.targetList;
    }

    public final int getTcpTimeout() {
        return this.tcpTimeout;
    }

    public DetectorParam() {
    }

    public final void setBlackTimeout(int i) {
        this.blackTimeout = i;
    }

    public final void setDnsTimeout(int i) {
        this.dnsTimeout = i;
    }

    public final void setFrequencyLimit(int i) {
        this.frequencyLimit = i;
    }

    public final void setPingTimeout(int i) {
        this.pingTimeout = i;
    }

    public final void setStartTimeout(int i) {
        this.startTimeout = i;
    }

    public final void setTcpTimeout(int i) {
        this.tcpTimeout = i;
    }

    public final void setTargetList(String[] strArr) {
        C52711k.m112240b(strArr, "<set-?>");
        this.targetList = strArr;
    }

    public DetectorParam(String[] strArr) {
        C52711k.m112240b(strArr, "targetList");
        this.targetList = strArr;
    }
}

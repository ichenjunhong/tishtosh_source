package com.bytedance.netecho;

import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

final class Netecho$resolveDns$1 implements Runnable {
    final /* synthetic */ String $hostName;
    final /* synthetic */ C52727e $ip;
    final /* synthetic */ C52727e $latch;
    final /* synthetic */ C52727e $throwableMsg;

    Netecho$resolveDns$1(C52727e eVar, String str, C52727e eVar2, C52727e eVar3) {
        this.$ip = eVar;
        this.$hostName = str;
        this.$throwableMsg = eVar2;
        this.$latch = eVar3;
    }

    public final void run() {
        try {
            C52727e eVar = this.$ip;
            InetAddress byName = InetAddress.getByName(this.$hostName);
            C52711k.m112236a((Object) byName, "InetAddress.getByName(hostName)");
            eVar.element = byName.getHostAddress();
        } catch (Throwable th) {
            for (th = th; th != null; th = th.getCause()) {
                C52727e eVar2 = this.$throwableMsg;
                StringBuilder sb = new StringBuilder();
                sb.append(th.getClass().getSimpleName());
                sb.append(":");
                sb.append(th.getMessage());
                eVar2.element = sb.toString();
            }
        }
        ((CountDownLatch) this.$latch.element).countDown();
    }
}

package com.bytedance.netecho;

import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    private static final String LIB_NAME = LIB_NAME;
    private static final int STAGE_ATON = 1;
    private static final int STAGE_FINISH = 6;
    private static final int STAGE_RECV = 5;
    private static final int STAGE_SEND = 4;
    private static final int STAGE_SET_OPT = 3;
    private static final int STAGE_SOCKET = 2;
    /* access modifiers changed from: private */
    public static final String TAG = TAG;

    private Netecho() {
    }

    private static final native IcmpDetectResult nativeDetectIcmp(String str, long j, int i);

    private static final native IcmpDetectResult nativeDetectIcmpV6(String str, int i, long j, int i2);

    private static final native TcpDetectResult nativeDetectTcp(String str, int i, long j);

    private static final native TcpDetectResult nativeDetectTcpV6(String str, int i, long j);

    static {
        NetechoConfig.INSTANCE.getLoadLibrary().invoke(LIB_NAME);
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i];
        for (int i2 = 0; i2 < i; i2++) {
            icmpPacketResultArr[i2] = null;
        }
        return icmpPacketResultArr;
    }

    public final DnsResolveResult resolveDns(String str, long j) {
        C52711k.m112240b(str, "hostName");
        C52727e eVar = new C52727e();
        boolean z = true;
        eVar.element = new CountDownLatch(1);
        C52727e eVar2 = new C52727e();
        eVar2.element = null;
        C52727e eVar3 = new C52727e();
        eVar3.element = null;
        new Thread(new Netecho$resolveDns$1(eVar2, str, eVar3, eVar)).start();
        ((CountDownLatch) eVar.element).await(j, TimeUnit.MILLISECONDS);
        if (((String) eVar2.element) == null) {
            z = false;
        }
        return new DnsResolveResult(z, (String) eVar2.element, (String) eVar3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final IcmpDetectResult detectIcmp(String str, long j, int i) {
        C52711k.m112240b(str, "hostIp");
        return nativeDetectIcmp(str, j, i);
    }

    public final TcpDetectResult detectTcp(String str, int i, long j) {
        C52711k.m112240b(str, "hostIp");
        return nativeDetectTcp(str, i, j);
    }

    public final TcpDetectResult detectTcpV6(String str, int i, long j) {
        C52711k.m112240b(str, "hostIp");
        return nativeDetectTcpV6(str, i, j);
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public final IcmpDetectResult detectIcmpV6(String str, int i, long j, int i2) {
        C52711k.m112240b(str, "hostIp");
        return nativeDetectIcmpV6(str, i, j, i2);
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] icmpPacketResultArr, int i, boolean z, int i2, float f, int i3) {
        C52711k.m112240b(icmpPacketResultArr, "packetResultsArray");
        icmpPacketResultArr[i] = new IcmpPacketResult(z, i2, f, i3);
    }
}

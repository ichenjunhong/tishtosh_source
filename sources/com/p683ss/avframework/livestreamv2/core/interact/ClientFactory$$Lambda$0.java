package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.Client;
import com.p683ss.avframework.livestreamv2.core.Client.EngineDestroyer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.ClientFactory$$Lambda$0 */
final /* synthetic */ class ClientFactory$$Lambda$0 implements Runnable {
    static final Runnable $instance = new ClientFactory$$Lambda$0();

    private ClientFactory$$Lambda$0() {
    }

    public final void run() {
        ((EngineDestroyer) Client.getEngineDestroyer()).destroyAuto();
    }
}

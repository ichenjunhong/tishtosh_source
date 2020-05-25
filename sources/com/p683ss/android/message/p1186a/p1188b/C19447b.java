package com.p683ss.android.message.p1186a.p1188b;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.message.a.b.b */
public enum C19447b {
    SOCKET_CONNECTING(1),
    SOCKET_CONNECTED(2),
    HANDSSHAKEING(4),
    HANDSSHAKEED(8),
    REGISTERING(16),
    REGISTERED(32),
    SOCKET_DISCONNECTING(64),
    SOCKET_DISCONNECTED(128),
    ALL(UnReadVideoExperiment.BROWSE_RECORD_LIST);
    

    /* renamed from: a */
    final int f53765a;

    public final int getStateValue() {
        return this.f53765a;
    }

    private C19447b(int i) {
        this.f53765a = i;
    }
}

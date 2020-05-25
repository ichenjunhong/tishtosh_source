package com.p683ss.android.websocket.p2539b.p2541b;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.websocket.b.b.e */
public enum C50825e {
    OK(0),
    INVALID_DEVICEDID(410),
    INVALID_APPID(411),
    UNSUPPORTED_SUBPROTOCOL(412),
    ALREADY_CONNECTED(413),
    TOO_MANY_CONNECTION(414),
    DEVICE_BLOCKED(415),
    ACCESS_DENIED(416),
    AUTHENTICATION_FAILED(417),
    INTERNAL_ERROR(510),
    SERVER_BUZY(511),
    SERVER_SHUTTING_DOWN(UnReadVideoExperiment.LIKE_USER_LIST);
    
    public final int value;

    private C50825e(int i) {
        this.value = i;
    }
}

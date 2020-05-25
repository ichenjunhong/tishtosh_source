package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.app.C9446a;
import com.bytedance.common.wschannel.p529c.C9459c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsConstants {
    private static C9446a sListener;
    private static Map<Integer, C9459c> sStates = new ConcurrentHashMap();

    public static C9446a getListener(int i) {
        return sListener;
    }

    static void setOnMessageReceiveListener(C9446a aVar) {
        sListener = aVar;
    }

    static void remove(int i) {
        sStates.remove(Integer.valueOf(i));
    }

    static boolean isWsChannelConnected(int i) {
        if (sStates.get(Integer.valueOf(i)) == C9459c.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void setConnectionState(int i, C9459c cVar) {
        sStates.put(Integer.valueOf(i), cVar);
    }
}

package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public class MessageCenter {
    public static final int MSG_CLIENT_TO_SDK_CHALLENGE_GAME = 4103;
    public static final int MSG_CLIENT_TO_SDK_PUASE_GAME = 4100;
    public static final int MSG_CLIENT_TO_SDK_RESTART_GAME = 4102;
    public static final int MSG_CLIENT_TO_SDK_RESUME_GAME = 4101;
    public static final int MSG_CLIENT_TO_SDK_START_GAME = 4097;
    public static final int MSG_CLINET_TO_SDK_FINISH_GAME = 4098;
    public static final int MSG_ERROR_TYPE_CONFIG = 4097;
    public static final int MSG_EVENT_2D_ANIMATION_CYCLE_FINISH = 5;
    public static final int MSG_EVENT_ALGORITHM_CHANGE_FACE_COUNT = 1;
    public static final int MSG_EVENT_BODY_DANCE_CATEGORY_ADJUST = 1;
    public static final int MSG_EVENT_BODY_DANCE_CATEGORY_SCORE = 2;
    public static final int MSG_EVENT_ENIGMA_COMPLETE = 1;
    public static final int MSG_EVENT_LOAD_FAIL = 4;
    public static final int MSG_EVENT_LOAD_INIT = 1;
    public static final int MSG_EVENT_LOAD_LOADING = 2;
    public static final int MSG_EVENT_LOAD_SUCCESS = 3;
    public static final int MSG_ID_BEGIN = 16;
    public static final int MSG_SDK_TO_CLIENT_END_GAME_REQ = 4099;
    public static final int MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED = 4104;
    public static final int MSG_TYPE_2D_ANIMATION_CYCLE = 18;
    public static final int MSG_TYPE_ALGORITHM_CHANGE = 23;
    public static final int MSG_TYPE_APP_STATUS = 22;
    public static final int MSG_TYPE_AUDIO_PLAYER = 21;
    public static final int MSG_TYPE_BODY_DANCE = 19;
    public static final int MSG_TYPE_EFFECT = 20;
    public static final int MSG_TYPE_FACE_ATTRIBUTIONS = 34;
    public static final int MSG_TYPE_FACE_VERIFY = 35;
    public static final int MSG_TYPE_HIDEINPUTMETHOD = 33;
    public static final int MSG_TYPE_RESOURCE = 17;
    public static final int MSG_TYPE_SHOWINPUTMETHOD = 32;
    public static final int MSG_TYPE_TYPE_ENIGMA = 24;
    private static final String TAG = "MessageCenter";
    private static final List<C2593a> sListeners = new ArrayList();
    private static HandlerThread sMessageCenterThread;
    private static final Object sMessageCenterThreadLock = new Object();
    private static Handler sMessageHandler;

    /* renamed from: com.bef.effectsdk.message.MessageCenter$a */
    public interface C2593a {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    /* renamed from: com.bef.effectsdk.message.MessageCenter$b */
    static class C2594b extends Handler {
        public C2594b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    public static void removeAllListener() {
        synchronized (sListeners) {
            sListeners.clear();
            destroy();
        }
    }

    public static void destroy() {
        synchronized (sListeners) {
            if (sListeners.isEmpty()) {
                synchronized (sMessageCenterThreadLock) {
                    if (sMessageHandler != null) {
                        sMessageHandler.removeCallbacksAndMessages(null);
                        sMessageHandler = null;
                    }
                    if (sMessageCenterThread != null) {
                        sMessageCenterThread.quit();
                        sMessageCenterThread = null;
                    }
                }
                sListeners.clear();
            }
        }
    }

    public static void init() {
        synchronized (sMessageCenterThreadLock) {
            if (sMessageCenterThread == null || !sMessageCenterThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                HandlerThread handlerThread = new HandlerThread(TAG);
                sMessageCenterThread = handlerThread;
                handlerThread.start();
                sMessageHandler = new C2594b(sMessageCenterThread.getLooper());
            }
        }
    }

    public static void setListener(C2593a aVar) {
        synchronized (sListeners) {
            addListener(aVar);
        }
    }

    public static void addListener(C2593a aVar) {
        synchronized (sListeners) {
            if (sListeners.isEmpty()) {
                init();
            }
            sListeners.add(aVar);
        }
    }

    public static void removeListener(C2593a aVar) {
        synchronized (sListeners) {
            sListeners.remove(aVar);
            if (sListeners.isEmpty()) {
                destroy();
            }
        }
    }

    public static void handleMessage(Message message) {
        synchronized (sListeners) {
            for (C2593a onMessageReceived : sListeners) {
                onMessageReceived.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
            }
        }
    }

    private static void postMessage(int i, int i2, int i3, String str) {
        synchronized (sMessageCenterThreadLock) {
            if (sMessageHandler != null) {
                Message.obtain(sMessageHandler, i, i2, i3, str).sendToTarget();
            }
        }
    }
}

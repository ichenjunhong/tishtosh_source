package com.bytedance.android.livesdk.p279af;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.bytedance.android.live.core.p230g.C3922z;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.af.i */
public final class C4597i {

    /* renamed from: a */
    public static final Set<OnAudioFocusChangeListener> f12561a = new HashSet();

    /* renamed from: b */
    private static ComponentName f12562b = new ComponentName(m11036c().getPackageName(), C4599a.class.getName());

    /* renamed from: c */
    private static AudioManager f12563c = ((AudioManager) m11036c().getSystemService("audio"));

    /* renamed from: d */
    private static OnAudioFocusChangeListener f12564d = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
            for (OnAudioFocusChangeListener onAudioFocusChange : new HashSet(C4597i.f12561a)) {
                onAudioFocusChange.onAudioFocusChange(i);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.af.i$a */
    static class C4599a extends BroadcastReceiver {
        private C4599a() {
        }

        public void onReceive(Context context, Intent intent) {
        }
    }

    /* renamed from: c */
    private static Context m11036c() {
        return C3922z.m9915e();
    }

    /* renamed from: b */
    public static void m11034b() {
        try {
            f12563c.unregisterMediaButtonEventReceiver(f12562b);
            f12563c.abandonAudioFocus(f12564d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static int m11032a() {
        try {
            int requestAudioFocus = f12563c.requestAudioFocus(f12564d, 3, 2);
            if (requestAudioFocus != 1) {
                return requestAudioFocus;
            }
            try {
                f12563c.registerMediaButtonEventReceiver(f12562b);
                return requestAudioFocus;
            } catch (Exception unused) {
                return requestAudioFocus;
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m11033a(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f12561a.add(onAudioFocusChangeListener);
    }

    /* renamed from: b */
    public static void m11035b(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        f12561a.remove(onAudioFocusChangeListener);
    }
}

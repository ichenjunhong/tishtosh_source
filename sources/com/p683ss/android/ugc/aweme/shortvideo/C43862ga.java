package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ga */
public final class C43862ga {
    /* renamed from: a */
    public static void m96320a(Activity activity) {
        if (activity != null) {
            m96322a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static Activity m96319a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    private static void m96322a(Window window) {
        if (window != null) {
            window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            if (VERSION.SDK_INT < 19) {
                window.getDecorView().setSystemUiVisibility(8);
            } else {
                window.getDecorView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: a */
    public static void m96321a(View view, int i) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m96323a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence)) {
                textView.setText(charSequence);
            }
        }
    }
}

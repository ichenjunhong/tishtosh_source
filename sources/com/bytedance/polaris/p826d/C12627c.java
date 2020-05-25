package com.bytedance.polaris.p826d;

import android.content.ClipData.Item;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.ClipboardManager;

/* renamed from: com.bytedance.polaris.d.c */
public final class C12627c {

    /* renamed from: a */
    public static final C12630b f33187a;

    /* renamed from: com.bytedance.polaris.d.c$a */
    static class C12629a implements C12630b {
        private C12629a() {
        }

        /* renamed from: a */
        public final String mo23730a(Context context) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                return "";
            }
            CharSequence text = clipboardManager.getText();
            if (text == null) {
                return "";
            }
            return text.toString();
        }
    }

    /* renamed from: com.bytedance.polaris.d.c$b */
    public interface C12630b {
        /* renamed from: a */
        String mo23730a(Context context);
    }

    /* renamed from: com.bytedance.polaris.d.c$c */
    static class C12631c implements C12630b {
        private C12631c() {
        }

        /* renamed from: a */
        public final String mo23730a(Context context) {
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                return "";
            }
            try {
                if (clipboardManager.hasPrimaryClip() && (clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain") || clipboardManager.getPrimaryClipDescription().hasMimeType("text/html"))) {
                    Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    if (itemAt.getText() == null) {
                        return "";
                    }
                    CharSequence text = itemAt.getText();
                    if (text == null) {
                        return "";
                    }
                    return text.toString();
                }
            } catch (Throwable unused) {
            }
            return "";
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f33187a = new C12631c();
        } else {
            f33187a = new C12629a();
        }
    }
}

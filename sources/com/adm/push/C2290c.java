package com.adm.push;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.adm.push.c */
final class C2290c {
    /* renamed from: a */
    static boolean m6820a(String str, Context context) {
        try {
            InputStream open = context.getAssets().open("api_key.txt");
            if (open == null) {
                return true;
            }
            try {
                open.close();
                return true;
            } catch (IOException unused) {
                return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }
}

package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import com.google.gson.C17971f;
import com.google.gson.C18086p;

/* renamed from: com.snapchat.kit.sdk.core.security.g */
public final class C18301g implements KeyValueStore {

    /* renamed from: a */
    private final SharedPreferences f50513a;

    /* renamed from: b */
    private final EncryptDecryptAlgorithm f50514b;

    /* renamed from: c */
    private final C17971f f50515c;

    public final void clearEntry(String str) {
        this.f50513a.edit().remove(str).apply();
    }

    public final void put(String str, Object obj) {
        putString(str, this.f50515c.mo34889b(obj));
    }

    public final <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return this.f50515c.mo34884a(string, cls);
        } catch (C18086p unused) {
            clearEntry(str);
            return null;
        }
    }

    public final String getString(String str, String str2) {
        String string = this.f50513a.getString(str, null);
        if (string == null) {
            return str2;
        }
        String decrypt = this.f50514b.decrypt(string);
        if (decrypt != null) {
            return decrypt;
        }
        clearEntry(str);
        return str2;
    }

    public final void putString(String str, String str2) {
        String str3;
        if (str2 == null) {
            str3 = null;
        } else {
            str3 = this.f50514b.encrypt(str2);
        }
        this.f50513a.edit().putString(str, str3).apply();
    }

    public C18301g(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, C17971f fVar) {
        this.f50513a = sharedPreferences;
        this.f50514b = encryptDecryptAlgorithm;
        this.f50515c = fVar;
    }
}

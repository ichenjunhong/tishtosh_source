package com.bytedance.common.utility.p525e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.common.utility.e.a */
public final class C9400a implements SharedPreferences {

    /* renamed from: a */
    private SharedPreferences f25648a;

    /* renamed from: com.bytedance.common.utility.e.a$a */
    public static class C9401a implements Editor {

        /* renamed from: a */
        private Editor f25649a;

        public final void apply() {
            this.f25649a.apply();
        }

        public final Editor clear() {
            this.f25649a.clear();
            return this;
        }

        public final boolean commit() {
            return this.f25649a.commit();
        }

        public C9401a(Editor editor) {
            this.f25649a = editor;
        }

        public final Editor remove(String str) {
            this.f25649a.remove(str);
            return this;
        }

        public final Editor putBoolean(String str, boolean z) {
            this.f25649a.putBoolean(str, z);
            return this;
        }

        public final Editor putFloat(String str, float f) {
            this.f25649a.putFloat(str, f);
            return this;
        }

        public final Editor putInt(String str, int i) {
            this.f25649a.putInt(str, i);
            return this;
        }

        public final Editor putLong(String str, long j) {
            this.f25649a.putLong(str, j);
            return this;
        }

        public final Editor putString(String str, String str2) {
            this.f25649a.putString(str, str2);
            return this;
        }

        public final Editor putStringSet(String str, Set<String> set) {
            this.f25649a.putStringSet(str, set);
            return this;
        }
    }

    public final Map<String, ?> getAll() {
        return this.f25648a.getAll();
    }

    /* renamed from: a */
    public final C9401a edit() {
        return new C9401a(this.f25648a.edit());
    }

    public C9400a(SharedPreferences sharedPreferences) {
        this.f25648a = sharedPreferences;
    }

    public final boolean contains(String str) {
        return this.f25648a.contains(str);
    }

    public final void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f25648a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f25648a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final boolean getBoolean(String str, boolean z) {
        return this.f25648a.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return this.f25648a.getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return this.f25648a.getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return this.f25648a.getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return this.f25648a.getString(str, str2);
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.f25648a.getStringSet(str, set);
    }
}

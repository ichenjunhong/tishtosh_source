package com.facebook.p909a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C14533n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.o */
public class C13594o {

    /* renamed from: a */
    public static final String f35460a = "o";

    /* renamed from: b */
    public static ConcurrentHashMap<String, String> f35461b;

    /* renamed from: c */
    public static SharedPreferences f35462c;

    /* renamed from: d */
    public static AtomicBoolean f35463d = new AtomicBoolean(false);

    /* renamed from: a */
    public static synchronized void m27438a() {
        synchronized (C13594o.class) {
            if (!f35463d.get()) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g());
                f35462c = defaultSharedPreferences;
                f35461b = new ConcurrentHashMap<>(m27437a(defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "")));
                f35463d.set(true);
            }
        }
    }

    /* renamed from: a */
    public static String m27436a(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static Map<String, String> m27437a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C14277aa;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14349t;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.v */
final class C14698v {

    /* renamed from: a */
    private static final String f38090a = "v";

    /* renamed from: b */
    private String f38091b;

    /* renamed from: c */
    private SharedPreferences f38092c;

    /* renamed from: b */
    public final void mo26963b() {
        this.f38092c.edit().clear().apply();
    }

    /* renamed from: a */
    public final Bundle mo26962a() {
        Bundle bundle = new Bundle();
        for (String str : this.f38092c.getAll().keySet()) {
            try {
                m30061a(str, bundle);
            } catch (JSONException e) {
                C14699w wVar = C14699w.CACHE;
                String str2 = f38090a;
                StringBuilder sb = new StringBuilder("Error reading cached value for key: '");
                sb.append(str);
                sb.append("' -- ");
                sb.append(e);
                C14349t.m29407a(wVar, 5, str2, sb.toString());
                return null;
            }
        }
        return bundle;
    }

    public C14698v(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static Date m30060a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    private C14698v(Context context, String str) {
        C14283ab.m29306a((Object) context, "context");
        String str2 = null;
        if (C14277aa.m29276a((String) null)) {
            str2 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.f38091b = str2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f38092c = C35807d.m80935a(context, this.f38091b, 0);
    }

    /* renamed from: a */
    private void m30061a(String str, Bundle bundle) throws JSONException {
        String str2;
        JSONObject jSONObject = new JSONObject(this.f38092c.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean("value"));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            boolean[] zArr = new boolean[jSONArray.length()];
            while (i < zArr.length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt("value"));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            byte[] bArr = new byte[jSONArray2.length()];
            while (i < bArr.length) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt("value"));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            short[] sArr = new short[jSONArray3.length()];
            while (i < sArr.length) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt("value"));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int[] iArr = new int[jSONArray4.length()];
            while (i < iArr.length) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong("value"));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            long[] jArr = new long[jSONArray5.length()];
            while (i < jArr.length) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            float[] fArr = new float[jSONArray6.length()];
            while (i < fArr.length) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble("value"));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            double[] dArr = new double[jSONArray7.length()];
            while (i < dArr.length) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString("value");
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            char[] cArr = new char[jSONArray8.length()];
            for (int i2 = 0; i2 < cArr.length; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString("value"));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
            int length = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                Object obj = jSONArray9.get(i);
                if (obj == JSONObject.NULL) {
                    str2 = null;
                } else {
                    str2 = (String) obj;
                }
                arrayList.add(i, str2);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else {
            if (string.equals("enum")) {
                try {
                    bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                } catch (ClassNotFoundException unused) {
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
    }
}

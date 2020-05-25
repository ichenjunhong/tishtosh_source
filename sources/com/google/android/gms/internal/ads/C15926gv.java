package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.C2240a;
import java.util.Iterator;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.gv */
public final class C15926gv implements C15948hq<Object> {

    /* renamed from: a */
    private final C15927gw f45006a;

    public C15926gv(C15927gw gwVar) {
        this.f45006a = gwVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        if (this.f45006a != null) {
            String str = (String) map.get(LeakCanaryFileProvider.f132049i);
            if (str == null) {
                abv.m32796d("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = m37707a(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    abv.m32793b("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                abv.m32794c("Failed to convert ad metadata to Bundle.");
            } else {
                this.f45006a.mo27472a(str, bundle);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m37707a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (!(jSONArray == null || jSONArray.length() == 0)) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj2 = null;
                        int i2 = 0;
                        while (obj2 == null && i2 < length) {
                            obj2 = !jSONArray.isNull(i2) ? jSONArray.get(i2) : null;
                            i2++;
                        }
                        if (obj2 == null) {
                            String str2 = "Expected JSONArray with at least 1 non-null element for key:";
                            String valueOf = String.valueOf(str);
                            abv.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        } else if (obj2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? m37707a(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(str, bundleArr);
                        } else if (obj2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(str, dArr);
                        } else if (obj2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(str, strArr);
                        } else if (obj2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(str, zArr);
                        } else {
                            abv.m32798e(C2240a.m6772a("JSONArray with unsupported type %s for key:%s", new Object[]{obj2.getClass().getCanonicalName(), str}));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m37707a((JSONObject) obj));
                } else {
                    String str3 = "Unsupported type for key:";
                    String valueOf2 = String.valueOf(str);
                    abv.m32798e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
            }
        }
        return bundle;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import com.C2240a;
import com.google.android.gms.common.internal.C15464q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class ako implements C15948hq<aib> {

    /* renamed from: a */
    private boolean f40775a;

    /* renamed from: a */
    private static int m33171a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                return aes.m32748a(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                abv.m32798e(sb.toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    private static void m33172a(ahm ahm, Map<String, String> map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                ahm.f40485b.mo28889b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                abv.m32798e(C2240a.m6772a("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            ahm.f40485b.mo28890c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            ahm.f40485b.mo28891d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            ahm.f40485b.mo28892e(Integer.parseInt(str4));
        }
        if (str5 != null) {
            ahm.f40485b.mo28893f(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        int i;
        boolean z;
        int i2;
        String[] split;
        Map map2 = map;
        aib aib = (aib) obj;
        String str = (String) map2.get("action");
        if (str == null) {
            abv.m32798e("Action missing from video GMSG.");
            return;
        }
        if (abv.m32791a(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            abv.m32792b(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map2.get("color");
            if (TextUtils.isEmpty(str2)) {
                abv.m32798e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                aib.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                abv.m32798e("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map2.get("mimeTypes");
                if (str3 == null) {
                    abv.m32798e("No MIME types specified for decoder properties inspection.");
                    ahm.m32918a(aib, "missingMimeTypes");
                } else if (VERSION.SDK_INT < 16) {
                    abv.m32798e("Video decoder properties available on API versions >= 16.");
                    ahm.m32918a(aib, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, aeq.m32739a(str4.trim()));
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("event", "decoderProps");
                    hashMap2.put("mimeTypes", hashMap);
                    aib.mo29242a("onVideoEvent", (Map<String, ?>) hashMap2);
                }
            } else {
                ahs a = aib.mo28930a();
                if (a == null) {
                    abv.m32798e("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = aib.getContext();
                    int a2 = m33171a(context, map2, "x", 0);
                    int a3 = m33171a(context, map2, "y", 0);
                    int a4 = m33171a(context, map2, "w", -1);
                    int a5 = m33171a(context, map2, "h", -1);
                    int min = Math.min(a4, aib.mo28946m() - a2);
                    int min2 = Math.min(a5, aib.mo28945l() - a3);
                    try {
                        i = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || a.mo28912a() != null) {
                        C15464q.m32132b("The underlay may only be modified from the UI thread.");
                        if (a.f40511d != null) {
                            a.f40511d.mo28895a(a2, a3, min, min2);
                        }
                        return;
                    }
                    aia aia = new aia((String) map2.get("flags"));
                    if (a.f40511d == null) {
                        C15799cd.m37136a(a.f40509b.mo28943j().f44780b, a.f40509b.mo28937c(), "vpr2");
                        ahm ahm = new ahm(a.f40508a, a.f40509b, i, parseBoolean, a.f40509b.mo28943j().f44780b, aia);
                        a.f40511d = ahm;
                        a.f40510c.addView(a.f40511d, 0, new LayoutParams(-1, -1));
                        a.f40511d.mo28895a(a2, a3, min, min2);
                        a.f40509b.mo28934a(false);
                    }
                    ahm a6 = a.mo28912a();
                    if (a6 != null) {
                        m33172a(a6, map2);
                    }
                    return;
                }
                ams b = aib.mo28936b();
                if (b != null) {
                    if ("timeupdate".equals(str)) {
                        String str5 = (String) map2.get("currentTime");
                        if (str5 == null) {
                            abv.m32798e("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            b.mo29347a(Float.parseFloat(str5));
                            return;
                        } catch (NumberFormatException unused3) {
                            String str6 = "Could not parse currentTime parameter from timeupdate video GMSG: ";
                            String valueOf = String.valueOf(str5);
                            abv.m32798e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        synchronized (b.f41036b) {
                            z = b.f41040f;
                            i2 = b.f41037c;
                            b.f41037c = 3;
                        }
                        b.mo29349a(i2, 3, z, z);
                        return;
                    }
                }
                ahm a7 = a.mo28912a();
                if (a7 == null) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("event", "no_video_view");
                    aib.mo29242a("onVideoEvent", (Map<String, ?>) hashMap3);
                } else if ("click".equals(str)) {
                    Context context2 = aib.getContext();
                    int a8 = m33171a(context2, map2, "x", 0);
                    int a9 = m33171a(context2, map2, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a8, (float) a9, 0);
                    if (a7.f40485b != null) {
                        a7.f40485b.dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        abv.m32798e("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        int parseFloat = (int) (Float.parseFloat(str7) * 1000.0f);
                        if (a7.f40485b != null) {
                            a7.f40485b.mo28843a(parseFloat);
                        }
                    } catch (NumberFormatException unused4) {
                        String str8 = "Could not parse time parameter from currentTime video GMSG: ";
                        String valueOf2 = String.valueOf(str7);
                        abv.m32798e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
                    }
                } else if ("hide".equals(str)) {
                    a7.setVisibility(4);
                } else if ("load".equals(str)) {
                    a7.mo28898h();
                } else if ("loadControl".equals(str)) {
                    m33172a(a7, map2);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map2.get("muted"))) {
                        a7.mo28900j();
                    } else {
                        a7.mo28901k();
                    }
                } else if ("pause".equals(str)) {
                    a7.mo28899i();
                } else if ("play".equals(str)) {
                    if (a7.f40485b != null) {
                        a7.f40485b.mo28846c();
                    }
                } else if ("show".equals(str)) {
                    a7.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str9 = (String) map2.get("src");
                    String[] strArr = {str9};
                    String str10 = (String) map2.get("demuxed");
                    if (str10 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str10);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                strArr2[i3] = jSONArray.getString(i3);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused5) {
                            String str11 = "Malformed demuxed URL list for playback: ";
                            String valueOf3 = String.valueOf(str10);
                            abv.m32798e(valueOf3.length() != 0 ? str11.concat(valueOf3) : new String(str11));
                            strArr = new String[]{str9};
                        }
                    }
                    a7.f40486c = str9;
                    a7.f40487d = strArr;
                } else if ("touchMove".equals(str)) {
                    Context context3 = aib.getContext();
                    int a10 = m33171a(context3, map2, "dx", 0);
                    int a11 = m33171a(context3, map2, "dy", 0);
                    float f = (float) a10;
                    float f2 = (float) a11;
                    if (a7.f40485b != null) {
                        a7.f40485b.mo28842a(f, f2);
                    }
                    if (!this.f40775a) {
                        aib.mo28940f();
                        this.f40775a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str12 = (String) map2.get("volume");
                    if (str12 == null) {
                        abv.m32798e("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        a7.setVolume(Float.parseFloat(str12));
                    } catch (NumberFormatException unused6) {
                        String str13 = "Could not parse volume parameter from volume video GMSG: ";
                        String valueOf4 = String.valueOf(str12);
                        abv.m32798e(valueOf4.length() != 0 ? str13.concat(valueOf4) : new String(str13));
                    }
                } else if ("watermark".equals(str)) {
                    a7.mo28902l();
                } else {
                    String str14 = "Unknown video action: ";
                    String valueOf5 = String.valueOf(str);
                    abv.m32798e(valueOf5.length() != 0 ? str14.concat(valueOf5) : new String(str14));
                }
            }
        }
    }
}

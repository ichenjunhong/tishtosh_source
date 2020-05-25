package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class aby implements abx {

    /* renamed from: a */
    final Object f40213a = new Object();

    /* renamed from: b */
    SharedPreferences f40214b;

    /* renamed from: c */
    Editor f40215c;

    /* renamed from: d */
    boolean f40216d = false;

    /* renamed from: e */
    boolean f40217e = true;

    /* renamed from: f */
    String f40218f;

    /* renamed from: g */
    String f40219g;

    /* renamed from: h */
    boolean f40220h = false;

    /* renamed from: i */
    String f40221i = "";

    /* renamed from: j */
    long f40222j = 0;

    /* renamed from: k */
    long f40223k = 0;

    /* renamed from: l */
    long f40224l = 0;

    /* renamed from: m */
    int f40225m = -1;

    /* renamed from: n */
    int f40226n = 0;

    /* renamed from: o */
    Set<String> f40227o = Collections.emptySet();

    /* renamed from: p */
    JSONObject f40228p = new JSONObject();

    /* renamed from: q */
    boolean f40229q = true;

    /* renamed from: r */
    boolean f40230r = true;

    /* renamed from: s */
    String f40231s = null;

    /* renamed from: t */
    private boolean f40232t;

    /* renamed from: u */
    private final List<Runnable> f40233u = new ArrayList();

    /* renamed from: v */
    private aga<?> f40234v;

    /* renamed from: w */
    private bwo f40235w = null;

    /* renamed from: a */
    public final void mo28654a(Context context, String str, boolean z) {
        this.f40234v = acb.m32566a((Runnable) new abz(this, context, "admob"));
        this.f40232t = true;
    }

    /* renamed from: q */
    private final void m32528q() {
        if (this.f40234v != null && !this.f40234v.isDone()) {
            try {
                this.f40234v.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                abv.m32795c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                abv.m32793b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final Bundle mo28656p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f40213a) {
            bundle.putBoolean("use_https", this.f40217e);
            bundle.putBoolean("content_url_opted_out", this.f40229q);
            bundle.putBoolean("content_vertical_opted_out", this.f40230r);
            bundle.putBoolean("auto_collect_location", this.f40220h);
            bundle.putInt("version_code", this.f40226n);
            bundle.putStringArray("never_pool_slots", (String[]) this.f40227o.toArray(new String[0]));
            bundle.putString("app_settings_json", this.f40221i);
            bundle.putLong("app_settings_last_update_ms", this.f40222j);
            bundle.putLong("app_last_background_time_ms", this.f40223k);
            bundle.putInt("request_in_session_count", this.f40225m);
            bundle.putLong("first_ad_req_time_ms", this.f40224l);
            bundle.putString("native_advanced_settings", this.f40228p.toString());
            bundle.putString("display_cutout", this.f40231s);
            if (this.f40218f != null) {
                bundle.putString("content_url_hashes", this.f40218f);
            }
            if (this.f40219g != null) {
                bundle.putString("content_vertical_hashes", this.f40219g);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28655a(Bundle bundle) {
        acb.f40240a.execute(new aca(this));
    }

    /* renamed from: a */
    public final bwo mo28623a() {
        if (!this.f40232t) {
            return null;
        }
        if (mo28636c() && mo28640e()) {
            return null;
        }
        if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44203Q)).booleanValue()) {
            return null;
        }
        synchronized (this.f40213a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f40235w == null) {
                this.f40235w = new bwo();
            }
            bwo bwo = this.f40235w;
            synchronized (bwo.f44151c) {
                if (bwo.f44149a) {
                    abv.m32792b("Content hash thread already started, quiting...");
                } else {
                    bwo.f44149a = true;
                    bwo.start();
                }
            }
            abv.m32796d("start fetching content...");
            bwo bwo2 = this.f40235w;
            return bwo2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28628a(boolean r4) {
        /*
            r3 = this;
            r3.m32528q()
            java.lang.Object r0 = r3.f40213a
            monitor-enter(r0)
            boolean r1 = r3.f40217e     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f40217e = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f40216d     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.mo28655a(r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aby.mo28628a(boolean):void");
    }

    /* renamed from: b */
    public final boolean mo28633b() {
        boolean z;
        m32528q();
        synchronized (this.f40213a) {
            if (!this.f40217e) {
                if (!this.f40216d) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo28632b(boolean z) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40229q != z) {
                this.f40229q = z;
                if (this.f40215c != null) {
                    this.f40215c.putBoolean("content_url_opted_out", z);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f40229q);
                bundle.putBoolean("content_vertical_opted_out", this.f40230r);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo28636c() {
        boolean z;
        m32528q();
        synchronized (this.f40213a) {
            z = this.f40229q;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28626a(java.lang.String r4) {
        /*
            r3 = this;
            r3.m32528q()
            java.lang.Object r0 = r3.f40213a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f40218f     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f40218f = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.mo28655a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aby.mo28626a(java.lang.String):void");
    }

    /* renamed from: d */
    public final String mo28637d() {
        String str;
        m32528q();
        synchronized (this.f40213a) {
            str = this.f40218f;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo28635c(boolean z) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40230r != z) {
                this.f40230r = z;
                if (this.f40215c != null) {
                    this.f40215c.putBoolean("content_vertical_opted_out", z);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f40229q);
                bundle.putBoolean("content_vertical_opted_out", this.f40230r);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo28640e() {
        boolean z;
        m32528q();
        synchronized (this.f40213a) {
            z = this.f40230r;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28631b(java.lang.String r4) {
        /*
            r3 = this;
            r3.m32528q()
            java.lang.Object r0 = r3.f40213a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = r3.f40219g     // Catch:{ all -> 0x0032 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0034
        L_0x0011:
            r3.f40219g = r4     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            android.content.SharedPreferences$Editor r1 = r3.f40215c     // Catch:{ all -> 0x0032 }
            r1.apply()     // Catch:{ all -> 0x0032 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0032 }
            r3.mo28655a(r1)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            goto L_0x0036
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aby.mo28631b(java.lang.String):void");
    }

    /* renamed from: f */
    public final String mo28642f() {
        String str;
        m32528q();
        synchronized (this.f40213a) {
            str = this.f40219g;
        }
        return str;
    }

    /* renamed from: d */
    public final void mo28639d(boolean z) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40220h != z) {
                this.f40220h = z;
                if (this.f40215c != null) {
                    this.f40215c.putBoolean("auto_collect_location", z);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo28645g() {
        boolean z;
        m32528q();
        synchronized (this.f40213a) {
            z = this.f40220h;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo28624a(int i) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40226n != i) {
                this.f40226n = i;
                if (this.f40215c != null) {
                    this.f40215c.putInt("version_code", i);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: h */
    public final int mo28646h() {
        int i;
        m32528q();
        synchronized (this.f40213a) {
            i = this.f40226n;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo28634c(String str) {
        m32528q();
        synchronized (this.f40213a) {
            if (!this.f40227o.contains(str)) {
                this.f40227o.add(str);
                if (this.f40215c != null) {
                    this.f40215c.putStringSet("never_pool_slots", this.f40227o);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f40227o.toArray(new String[0]));
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo28638d(String str) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40227o.contains(str)) {
                this.f40227o.remove(str);
                if (this.f40215c != null) {
                    this.f40215c.putStringSet("never_pool_slots", this.f40227o);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f40227o.toArray(new String[0]));
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo28641e(String str) {
        boolean contains;
        m32528q();
        synchronized (this.f40213a) {
            contains = this.f40227o.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28643f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m32528q()
            java.lang.Object r0 = r5.f40213a
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ all -> 0x0060 }
            long r1 = r1.mo28523a()     // Catch:{ all -> 0x0060 }
            r5.f40222j = r1     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x005e
            java.lang.String r3 = r5.f40221i     // Catch:{ all -> 0x0060 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x001b
            goto L_0x005e
        L_0x001b:
            r5.f40221i = r6     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f40215c     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f40215c     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f40215c     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x0060 }
            android.content.SharedPreferences$Editor r3 = r5.f40215c     // Catch:{ all -> 0x0060 }
            r3.apply()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x0060 }
            r5.mo28655a(r3)     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Runnable> r6 = r5.f40233u     // Catch:{ all -> 0x0060 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0060 }
        L_0x004c:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0060 }
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
            r1.run()     // Catch:{ all -> 0x0060 }
            goto L_0x004c
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aby.mo28643f(java.lang.String):void");
    }

    /* renamed from: i */
    public final abf mo28647i() {
        abf abf;
        m32528q();
        synchronized (this.f40213a) {
            abf = new abf(this.f40221i, this.f40222j);
        }
        return abf;
    }

    /* renamed from: a */
    public final void mo28625a(long j) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40223k != j) {
                this.f40223k = j;
                if (this.f40215c != null) {
                    this.f40215c.putLong("app_last_background_time_ms", j);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: j */
    public final long mo28648j() {
        long j;
        m32528q();
        synchronized (this.f40213a) {
            j = this.f40223k;
        }
        return j;
    }

    /* renamed from: b */
    public final void mo28629b(int i) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40225m != i) {
                this.f40225m = i;
                if (this.f40215c != null) {
                    this.f40215c.putInt("request_in_session_count", i);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: k */
    public final int mo28649k() {
        int i;
        m32528q();
        synchronized (this.f40213a) {
            i = this.f40225m;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo28630b(long j) {
        m32528q();
        synchronized (this.f40213a) {
            if (this.f40224l != j) {
                this.f40224l = j;
                if (this.f40215c != null) {
                    this.f40215c.putLong("first_ad_req_time_ms", j);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                mo28655a(bundle);
            }
        }
    }

    /* renamed from: l */
    public final long mo28650l() {
        long j;
        m32528q();
        synchronized (this.f40213a) {
            j = this.f40224l;
        }
        return j;
    }

    /* renamed from: a */
    public final void mo28627a(String str, String str2, boolean z) {
        m32528q();
        synchronized (this.f40213a) {
            JSONArray optJSONArray = this.f40228p.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString(MovieDetailAPi.f94892b))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MovieDetailAPi.f94892b, str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C14963ax.m30837g().mo28523a());
                optJSONArray.put(length, jSONObject);
                this.f40228p.put(str, optJSONArray);
            } catch (JSONException e) {
                abv.m32795c("Could not update native advanced settings", e);
            }
            if (this.f40215c != null) {
                this.f40215c.putString("native_advanced_settings", this.f40228p.toString());
                this.f40215c.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f40228p.toString());
            mo28655a(bundle);
        }
    }

    /* renamed from: m */
    public final JSONObject mo28651m() {
        JSONObject jSONObject;
        m32528q();
        synchronized (this.f40213a) {
            jSONObject = this.f40228p;
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final void mo28652n() {
        m32528q();
        synchronized (this.f40213a) {
            this.f40228p = new JSONObject();
            if (this.f40215c != null) {
                this.f40215c.remove("native_advanced_settings");
                this.f40215c.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            mo28655a(bundle);
        }
    }

    /* renamed from: o */
    public final String mo28653o() {
        String str;
        m32528q();
        synchronized (this.f40213a) {
            str = this.f40231s;
        }
        return str;
    }

    /* renamed from: g */
    public final void mo28644g(String str) {
        m32528q();
        synchronized (this.f40213a) {
            if (!TextUtils.equals(this.f40231s, str)) {
                this.f40231s = str;
                if (this.f40215c != null) {
                    this.f40215c.putString("display_cutout", str);
                    this.f40215c.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                mo28655a(bundle);
            }
        }
    }
}

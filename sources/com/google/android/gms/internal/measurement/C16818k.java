package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.C2240a;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C16818k extends C16860r {

    /* renamed from: a */
    private static boolean f47226a;

    /* renamed from: c */
    private C14903a f47227c;

    /* renamed from: d */
    private final C16584ca f47228d;

    /* renamed from: e */
    private String f47229e;

    /* renamed from: f */
    private boolean f47230f;

    /* renamed from: g */
    private final Object f47231g = new Object();

    C16818k(C16862t tVar) {
        super(tVar);
        this.f47228d = new C16584ca(tVar.f47336c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
    }

    /* renamed from: b */
    public final boolean mo32397b() {
        mo32516r();
        C14903a d = m40666d();
        if (d == null || d.f38443b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo32398c() {
        mo32516r();
        C14903a d = m40666d();
        String str = d != null ? d.f38442a : null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    private final synchronized C14903a m40666d() {
        if (this.f47228d.mo31858a(1000)) {
            this.f47228d.mo31857a();
            C14903a e = m40667e();
            if (m40665a(this.f47227c, e)) {
                this.f47227c = e;
            } else {
                mo32505f("Failed to reset client id on adid change. Not using adid");
                this.f47227c = new C14903a("", false);
            }
        }
        return this.f47227c;
    }

    /* renamed from: a */
    private final boolean m40665a(C14903a aVar, C14903a aVar2) {
        String str = null;
        CharSequence charSequence = aVar2 == null ? null : aVar2.f38442a;
        if (TextUtils.isEmpty(charSequence)) {
            return true;
        }
        String b = mo32514o().mo31796b();
        synchronized (this.f47231g) {
            if (!this.f47230f) {
                this.f47229e = m40669t();
                this.f47230f = true;
            } else if (TextUtils.isEmpty(this.f47229e)) {
                if (aVar != null) {
                    str = aVar.f38442a;
                }
                if (str == null) {
                    String valueOf = String.valueOf(charSequence);
                    String valueOf2 = String.valueOf(b);
                    boolean g = m40668g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    return g;
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(b);
                this.f47229e = m40664a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(charSequence);
            String valueOf6 = String.valueOf(b);
            String a = m40664a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            if (a.equals(this.f47229e)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f47229e)) {
                mo32493b("Resetting the client id because Advertising Id changed.");
                b = mo32514o().mo31797c();
                mo32490a("New client Id", b);
            }
            String valueOf7 = String.valueOf(charSequence);
            String valueOf8 = String.valueOf(b);
            boolean g2 = m40668g(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
            return g2;
        }
    }

    /* renamed from: e */
    private final C14903a m40667e() {
        try {
            return C14902a.m30575a(mo32506g());
        } catch (IllegalStateException unused) {
            mo32503e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Exception e) {
            if (!f47226a) {
                f47226a = true;
                mo32498c("Error getting advertiser id", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m40664a(String str) {
        MessageDigest b = C16585cb.m39592b("MD5");
        if (b == null) {
            return null;
        }
        return C2240a.m6773a(Locale.US, "%032X", new Object[]{new BigInteger(1, b.digest(str.getBytes()))});
    }

    /* renamed from: g */
    private final boolean m40668g(String str) {
        try {
            String a = m40664a(str);
            mo32493b("Storing hashed adid.");
            FileOutputStream openFileOutput = mo32506g().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f47229e = a;
            return true;
        } catch (IOException e) {
            mo32501d("Error creating hash file", e);
            return false;
        }
    }

    /* renamed from: t */
    private final String m40669t() {
        String str = null;
        try {
            FileInputStream openFileInput = mo32506g().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                mo32503e("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                mo32506g().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                mo32493b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    mo32498c("Error reading Hash file, deleting it", e);
                    mo32506g().deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (IOException e2) {
            e = e2;
            mo32498c("Error reading Hash file, deleting it", e);
            mo32506g().deleteFile("gaClientIdData");
            return str;
        }
    }
}

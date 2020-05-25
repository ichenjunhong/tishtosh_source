package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class beh {

    /* renamed from: a */
    static final String[] f42187a = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: b */
    public bed f42188b;

    /* renamed from: c */
    private String f42189c = "googleads.g.doubleclick.net";

    /* renamed from: d */
    private String f42190d = "/pagead/ads";

    /* renamed from: e */
    private String f42191e = "ad.doubleclick.net";

    /* renamed from: f */
    private String[] f42192f = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    public beh(bed bed) {
        this.f42188b = bed;
    }

    /* renamed from: b */
    private final boolean m35495b(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f42191e);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final boolean mo30081a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f42192f) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
                return false;
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final void mo30080a(MotionEvent motionEvent) {
        this.f42188b.mo27638a(motionEvent);
    }

    /* renamed from: a */
    public final Uri mo30078a(Uri uri, Context context, View view, Activity activity) throws bei {
        try {
            return mo30079a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new bei("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public final Uri mo30079a(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws bei {
        String str2;
        try {
            boolean b = m35495b(uri);
            if (b) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new bei("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new bei("Query parameter already exists: ms");
            }
            if (z) {
                str2 = this.f42188b.mo27636a(context, str, view, activity);
            } else {
                str2 = this.f42188b.mo27634a(context);
            }
            if (b) {
                String str3 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str2);
                    sb.append(";");
                    sb.append(uri2.substring(i));
                    return Uri.parse(sb.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                sb2.append(";");
                sb2.append(str3);
                sb2.append("=");
                sb2.append(str2);
                sb2.append(";");
                sb2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(sb2.toString());
            }
            String str4 = "ms";
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str4, str2).build();
            }
            int i2 = indexOf3 + 1;
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
            sb3.append(str4);
            sb3.append("=");
            sb3.append(str2);
            sb3.append("&");
            sb3.append(uri3.substring(i2));
            return Uri.parse(sb3.toString());
        } catch (UnsupportedOperationException unused) {
            throw new bei("Provided Uri is not in a valid state");
        }
    }
}

package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.internal.ads.C15828df;
import com.google.android.gms.internal.ads.C15830dh;
import com.google.android.gms.internal.ads.C15865eo;
import com.google.android.gms.internal.ads.C15866ep;
import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.C16125oe;
import com.google.android.gms.internal.ads.C16148pa;
import com.google.android.gms.internal.ads.C16151pd;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.t */
public final class C15033t {
    /* renamed from: a */
    public static View m31088a(abb abb) {
        if (abb == null) {
            abv.m32794c("AdState is null");
            return null;
        } else if (m31097b(abb) && abb.f40104b != null) {
            return abb.f40104b.getView();
        } else {
            try {
                C14882b a = abb.f40118p != null ? abb.f40118p.mo31238a() : null;
                if (a != null) {
                    return (View) C14886d.m30545a(a);
                }
                abv.m32798e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                abv.m32795c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m31095a(ama ama, C16125oe oeVar, CountDownLatch countDownLatch) {
        ama ama2 = ama;
        C16125oe oeVar2 = oeVar;
        CountDownLatch countDownLatch2 = countDownLatch;
        boolean z = false;
        try {
            View view = ama.getView();
            if (view == null) {
                abv.m32798e("AdWebView is null");
            } else {
                view.setVisibility(4);
                List<String> list = oeVar2.f45342b.f45290t;
                if (list != null) {
                    if (!list.isEmpty()) {
                        ama2.mo29157a("/nativeExpressAssetsLoaded", (C15948hq<? super ama>) new C15036w<Object>(countDownLatch2));
                        ama2.mo29157a("/nativeExpressAssetsLoadingFailed", (C15948hq<? super ama>) new C15037x<Object>(countDownLatch2));
                        C16148pa h = oeVar2.f45343c.mo31259h();
                        C16151pd i = oeVar2.f45343c.mo31260i();
                        View view2 = null;
                        if (list.contains("2") && h != null) {
                            String a = h.mo31268a();
                            List b = h.mo31271b();
                            String c = h.mo31273c();
                            C15865eo d = h.mo31275d();
                            String e = h.mo31276e();
                            double f = h.mo31277f();
                            String g = h.mo31278g();
                            String h2 = h.mo31279h();
                            Bundle l = h.mo31283l();
                            if (h.mo31287p() != null) {
                                view2 = (View) C14886d.m30545a(h.mo31287p());
                            }
                            C15828df dfVar = new C15828df(a, b, c, d, e, f, g, h2, null, l, null, view2, h.mo31288q(), null);
                            ama.mo29197w().mo29207a((ank) new C15034u(dfVar, oeVar2.f45342b.f45289s, ama2));
                        } else if (!list.contains("1") || i == null) {
                            abv.m32798e("No matching template id and mapper");
                        } else {
                            String a2 = i.mo31289a();
                            List b2 = i.mo31292b();
                            String c2 = i.mo31294c();
                            C15865eo d2 = i.mo31296d();
                            String e2 = i.mo31297e();
                            String f2 = i.mo31298f();
                            Bundle j = i.mo31302j();
                            if (i.mo31306n() != null) {
                                view2 = (View) C14886d.m30545a(i.mo31306n());
                            }
                            C15830dh dhVar = new C15830dh(a2, b2, c2, d2, e2, f2, null, j, null, view2, i.mo31307o(), null);
                            ama.mo29197w().mo29207a((ank) new C15035v(dhVar, oeVar2.f45342b.f45289s, ama2));
                        }
                        String str = oeVar2.f45342b.f45287q;
                        String str2 = oeVar2.f45342b.f45288r;
                        if (str2 != null) {
                            ama.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            ama2.loadData(str, "text/html", "UTF-8");
                        }
                        z = true;
                    }
                }
                abv.m32798e("No template ids present in mediation response");
            }
        } catch (RemoteException e3) {
            abv.m32795c("Unable to invoke load assets", e3);
        } catch (RuntimeException e4) {
            countDownLatch.countDown();
            throw e4;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m31097b(abb abb) {
        return (abb == null || !abb.f40116n || abb.f40117o == null || abb.f40117o.f45287q == null) ? false : true;
    }

    /* renamed from: a */
    static C15948hq<ama> m31090a(C16148pa paVar, C16151pd pdVar, C14992d dVar) {
        return new C15038y(paVar, dVar, pdVar);
    }

    /* renamed from: a */
    static JSONObject m31093a(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            if (bundle.containsKey(str2)) {
                if ("image".equals(jSONObject2.getString(str2))) {
                    Object obj = bundle.get(str2);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(str2, m31091a((Bitmap) obj));
                    } else {
                        abv.m32798e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(str2) instanceof Bitmap) {
                    abv.m32798e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static String m31092a(C15865eo eoVar) {
        if (eoVar == null) {
            abv.m32798e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = eoVar.mo30930b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            abv.m32798e("Unable to get image uri. Trying data uri next");
        }
        return m31096b(eoVar);
    }

    /* renamed from: b */
    private static String m31096b(C15865eo eoVar) {
        try {
            C14882b a = eoVar.mo30929a();
            if (a == null) {
                abv.m32798e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C14886d.m30545a(a);
            if (drawable instanceof BitmapDrawable) {
                return m31091a(((BitmapDrawable) drawable).getBitmap());
            }
            abv.m32798e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            abv.m32798e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* renamed from: a */
    private static String m31091a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            abv.m32798e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    static C15865eo m31089a(Object obj) {
        if (obj instanceof IBinder) {
            return C15866ep.m37470a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m31094a(ama ama) {
        OnClickListener onClickListener = ama.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(ama.getView());
        }
    }
}

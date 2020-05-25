package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.z */
public final class C35307z {

    /* renamed from: a */
    private static final String f90649a;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.z$a */
    public interface C35312a {
        /* renamed from: a */
        void mo71089a();

        /* renamed from: b */
        void mo71090b();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/");
        sb.append(C11010c.m22280a().getString(R.string.ip));
        sb.append("/");
        f90649a = sb.toString();
    }

    /* renamed from: b */
    private static void m79889b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            C11010c.m22280a().sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public static boolean m79888a(String str) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(f90649a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(simpleDateFormat.format(time));
        sb2.append(".jpg");
        sb.append(sb2.toString());
        String sb3 = sb.toString();
        if (!C9396a.m18583b(sb3)) {
            z = C9396a.m18580a(str, f90649a, new File(sb3).getName());
            if (!z) {
                return false;
            }
        } else {
            z = false;
        }
        m79889b(sb3);
        String str2 = Build.BRAND;
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase().equals("vivo")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Environment.getExternalStorageDirectory());
            sb4.append("/相机/");
            sb4.append(new File(sb3).getName());
            String sb5 = sb4.toString();
            C48016e.m103948c(sb3, sb5);
            StringBuilder sb6 = new StringBuilder("vivo: ");
            sb6.append(sb5);
            C32458a.m75144a(sb6.toString());
            m79889b(sb5);
        }
        return z;
    }

    /* renamed from: a */
    public static void m79887a(final UrlModel urlModel, final C35312a aVar) {
        if (!C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
            C23515d.m57667a(urlModel, (C23520a) new C23520a() {
                /* renamed from: a */
                public final void mo48680a(Exception exc) {
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (aVar != null) {
                                aVar.mo71090b();
                            }
                        }
                    });
                }

                /* renamed from: a */
                public final void mo48679a(C13745c<C13715a<C14042c>> cVar) {
                    String a = C23515d.m57664a(urlModel);
                    if (!C9431p.m18664a(a)) {
                        C35307z.m79888a(C23515d.m57663a(C11010c.m22280a(), a));
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    aVar.mo71089a();
                                }
                            }
                        });
                        return;
                    }
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (aVar != null) {
                                aVar.mo71090b();
                            }
                        }
                    });
                }
            });
        } else if (TextUtils.isEmpty(urlModel.getUri())) {
            aVar.mo71090b();
        } else if (m79888a(Uri.parse(urlModel.getUri()).getPath())) {
            aVar.mo71089a();
        } else {
            aVar.mo71090b();
        }
    }
}

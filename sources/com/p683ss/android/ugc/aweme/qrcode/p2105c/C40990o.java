package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.support.p030v4.app.C0636b;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9395d;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.o */
public final class C40990o {

    /* renamed from: a */
    public C40996a f104247a;

    /* renamed from: b */
    public Activity f104248b;

    /* renamed from: c */
    public String f104249c;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.o$a */
    public interface C40996a {
        /* renamed from: a */
        View mo83487a();

        /* renamed from: a */
        void mo83488a(String str);

        /* renamed from: b */
        void mo83489b();
    }

    /* renamed from: a */
    public void mo83481a() {
        this.f104247a.mo83489b();
        C18842a.m45934b(new Runnable() {
            public final void run() {
                Bitmap bitmap;
                if (TextUtils.isEmpty(C40990o.this.f104249c)) {
                    C40990o oVar = C40990o.this;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(System.currentTimeMillis());
                    sb.append(C9395d.m18571a(sb2.toString()));
                    sb.append(".png");
                    oVar.f104249c = sb.toString();
                }
                if (C40990o.this.f104247a != null) {
                    View a = C40990o.this.f104247a.mo83487a();
                    String a2 = C23967a.m58772a(C40990o.this.f104248b);
                    String str = C40990o.this.f104249c;
                    a.setDrawingCacheEnabled(true);
                    a.buildDrawingCache();
                    final String str2 = null;
                    if (a.getDrawingCache() != null) {
                        bitmap = Bitmap.createBitmap(a.getDrawingCache());
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null && BitmapUtils.saveBitmapToSD(bitmap, a2, str)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(a2);
                        sb3.append("/");
                        sb3.append(str);
                        str2 = sb3.toString();
                    }
                    C18842a.m45934b(new Runnable() {
                        public final void run() {
                            if (C40990o.this.f104247a != null) {
                                C40990o.this.f104247a.mo83488a(str2);
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: b */
    public void mo83482b() {
        C23361b.m57419a(this.f104248b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
            /* renamed from: a */
            public final void mo40906a(String[] strArr, int[] iArr) {
                if (iArr.length > 0 && iArr[0] == -1 && !C0636b.m1719a(C40990o.this.f104248b, strArr[0])) {
                    C47700ay.m103234a(C40990o.this.f104248b, R.string.kc, R.string.wf, new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }, R.string.ah4, new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C47720bh.m103294a(C40990o.this.f104248b);
                        }
                    }).show();
                }
            }
        });
    }

    public C40990o(C40996a aVar, Activity activity) {
        this(aVar, activity, "");
    }

    private C40990o(C40996a aVar, Activity activity, String str) {
        this.f104247a = aVar;
        this.f104248b = activity;
        this.f104249c = str;
    }
}

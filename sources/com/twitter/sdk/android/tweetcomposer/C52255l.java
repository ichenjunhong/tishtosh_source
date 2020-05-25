package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.C2240a;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52190l;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.internal.p2617a.C52103f;
import com.twitter.sdk.android.core.internal.scribe.C52143a;
import java.net.URL;
import java.util.Iterator;

/* renamed from: com.twitter.sdk.android.tweetcomposer.l */
public class C52255l {

    /* renamed from: a */
    static volatile C52255l f130104a;

    /* renamed from: b */
    C52189k<C52231v> f130105b = C52225r.m111638a().f130049b;

    /* renamed from: c */
    C52072e f130106c = C52225r.m111638a().mo108950c();

    /* renamed from: d */
    Context f130107d = C52190l.m111617a().mo108920a("com.twitter.sdk.android:tweet-composer");

    /* renamed from: e */
    public C52251i f130108e = new C52253j(null);

    /* renamed from: com.twitter.sdk.android.tweetcomposer.l$a */
    public static class C52256a {

        /* renamed from: a */
        private final Context f130109a;

        /* renamed from: b */
        private String f130110b;

        /* renamed from: c */
        private URL f130111c;

        /* renamed from: d */
        private Uri f130112d;

        /* renamed from: a */
        public final void mo109004a() {
            String str;
            Intent intent = new Intent("android.intent.action.SEND");
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f130110b)) {
                sb.append(this.f130110b);
            }
            if (this.f130111c != null) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(this.f130111c.toString());
            }
            intent.putExtra("android.intent.extra.TEXT", sb.toString());
            intent.setType("text/plain");
            if (this.f130112d != null) {
                intent.putExtra("android.intent.extra.STREAM", this.f130112d);
                intent.setType("image/jpeg");
            }
            Iterator it = this.f130109a.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    intent = null;
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                if (resolveInfo.activityInfo.packageName.startsWith("com.twitter.android")) {
                    intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                    break;
                }
            }
            if (intent == null) {
                if (this.f130111c == null) {
                    str = "";
                } else {
                    str = this.f130111c.toString();
                }
                intent = new Intent("android.intent.action.VIEW", Uri.parse(C2240a.m6772a("https://twitter.com/intent/tweet?text=%s&url=%s", new Object[]{C52103f.m111437a(this.f130110b), C52103f.m111437a(str)})));
            }
            this.f130109a.startActivity(intent);
        }

        public C52256a(Context context) {
            if (context != null) {
                this.f130109a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public final C52256a mo109002a(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("imageUri must not be null.");
            } else if (this.f130112d == null) {
                this.f130112d = uri;
                return this;
            } else {
                throw new IllegalStateException("imageUri already set.");
            }
        }

        /* renamed from: a */
        public final C52256a mo109003a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("text must not be null.");
            } else if (this.f130110b == null) {
                this.f130110b = str;
                return this;
            } else {
                throw new IllegalStateException("text already set.");
            }
        }
    }

    /* renamed from: a */
    public static C52255l m111678a() {
        if (f130104a == null) {
            synchronized (C52255l.class) {
                if (f130104a == null) {
                    f130104a = new C52255l();
                }
            }
        }
        return f130104a;
    }

    C52255l() {
        C52143a aVar = new C52143a(this.f130107d, this.f130105b, this.f130106c, C52190l.m111617a().f129905c, C52143a.m111517a("TweetComposer", "3.2.0.11"));
        this.f130108e = new C52253j(aVar);
    }
}

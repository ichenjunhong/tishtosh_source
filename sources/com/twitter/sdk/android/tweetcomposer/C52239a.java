package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.ss.android.ugc.trill.R;
import com.twitter.C52064d;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.models.C52213q;

/* renamed from: com.twitter.sdk.android.tweetcomposer.a */
final class C52239a {

    /* renamed from: a */
    final ComposerView f130088a;

    /* renamed from: b */
    final C52231v f130089b;

    /* renamed from: c */
    final Uri f130090c;

    /* renamed from: d */
    final C52233a f130091d;

    /* renamed from: e */
    final C52243c f130092e;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$a */
    interface C52241a {
        /* renamed from: a */
        void mo108990a();

        /* renamed from: a */
        void mo108991a(String str);

        /* renamed from: b */
        void mo108992b(String str);
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$b */
    class C52242b implements C52241a {
        /* renamed from: a */
        public final void mo108990a() {
            C52239a.this.mo108989a();
        }

        C52242b() {
        }

        /* renamed from: a */
        public final void mo108991a(String str) {
            int i;
            boolean z;
            C52239a aVar = C52239a.this;
            if (TextUtils.isEmpty(str)) {
                i = 0;
            } else {
                i = aVar.f130092e.f130095a.mo108752a(str);
            }
            C52239a.this.f130088a.setCharCount(140 - i);
            boolean z2 = true;
            if (i > 140) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C52239a.this.f130088a.setCharCountTextStyle(R.style.a05);
            } else {
                C52239a.this.f130088a.setCharCountTextStyle(R.style.a04);
            }
            ComposerView composerView = C52239a.this.f130088a;
            if (i <= 0 || i > 140) {
                z2 = false;
            }
            composerView.f130074e.setEnabled(z2);
        }

        /* renamed from: b */
        public final void mo108992b(String str) {
            C52243c.m111668a().mo108994a("tweet");
            Intent intent = new Intent(C52239a.this.f130088a.getContext(), TweetUploadService.class);
            intent.putExtra("EXTRA_USER_TOKEN", (Parcelable) C52239a.this.f130089b.f129901a);
            intent.putExtra("EXTRA_TWEET_TEXT", str);
            intent.putExtra("EXTRA_IMAGE_URI", C52239a.this.f130090c);
            Context context = C52239a.this.f130088a.getContext();
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                context.startService(intent);
            }
            C52239a.this.f130091d.mo108974a();
        }
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.a$c */
    static class C52243c {

        /* renamed from: a */
        public final C52064d f130095a = new C52064d();

        C52243c() {
        }

        /* renamed from: a */
        static C52244b m111668a() {
            return new C52245c(C52255l.m111678a().f130108e);
        }
    }

    /* renamed from: b */
    private void m111658b() {
        Intent intent = new Intent("com.twitter.sdk.android.tweetcomposer.TWEET_COMPOSE_CANCEL");
        intent.setPackage(this.f130088a.getContext().getPackageName());
        this.f130088a.getContext().sendBroadcast(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo108989a() {
        C52243c.m111668a().mo108994a("cancel");
        m111658b();
        this.f130091d.mo108974a();
    }

    C52239a(ComposerView composerView, C52231v vVar, Uri uri, String str, String str2, C52233a aVar) {
        this(composerView, vVar, uri, str, str2, aVar, new C52243c());
    }

    private C52239a(ComposerView composerView, C52231v vVar, Uri uri, String str, String str2, C52233a aVar, C52243c cVar) {
        this.f130088a = composerView;
        this.f130089b = vVar;
        this.f130090c = uri;
        this.f130091d = aVar;
        this.f130092e = cVar;
        composerView.setCallbacks(new C52242b());
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(str2);
        }
        composerView.setTweetText(sb.toString());
        C52225r.m111638a().mo108949a(this.f130089b).mo108921a().verifyCredentials(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false)).mo110595a(new C52068b<C52213q>() {
            /* renamed from: a */
            public final void mo23366a(C52077i<C52213q> iVar) {
                C52239a.this.f130088a.setProfilePhotoView((C52213q) iVar.f129666a);
            }

            /* renamed from: a */
            public final void mo23367a(C52229t tVar) {
                C52239a.this.f130088a.setProfilePhotoView(null);
            }
        });
        if (uri != null) {
            this.f130088a.setImageView(uri);
        }
        C52243c.m111668a().mo108993a();
    }
}

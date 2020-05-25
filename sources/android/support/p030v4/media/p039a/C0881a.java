package android.support.p030v4.media.p039a;

import android.app.Notification.Builder;
import android.app.Notification.MediaStyle;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0610aa.C0611a;
import android.support.p030v4.app.C0610aa.C0618g;
import android.support.p030v4.app.C0702z;
import android.support.p030v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import com.C2240a;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v4.media.a.a */
public final class C0881a {

    /* renamed from: android.support.v4.media.a.a$a */
    public static class C0882a extends C0618g {

        /* renamed from: a */
        int[] f2953a;

        /* renamed from: b */
        public Token f2954b;

        /* renamed from: c */
        boolean f2955c;

        /* renamed from: h */
        PendingIntent f2956h;

        /* renamed from: a */
        private RemoteViews m2472a(C0611a aVar) {
            boolean z;
            if (aVar.f2182i == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f2239d.f2202a.getPackageName(), R.layout.abu);
            remoteViews.setImageViewResource(R.id.a3, aVar.f2180g);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.a3, aVar.f2182i);
            }
            if (VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.a3, aVar.f2181h);
            }
            return remoteViews;
        }

        /* renamed from: a */
        public final void mo2105a(C0702z zVar) {
            if (VERSION.SDK_INT >= 21) {
                Builder a = zVar.mo2141a();
                MediaStyle mediaStyle = new MediaStyle();
                if (this.f2953a != null) {
                    mediaStyle.setShowActionsInCompactView(this.f2953a);
                }
                if (this.f2954b != null) {
                    mediaStyle.setMediaSession((MediaSession.Token) this.f2954b.f3003a);
                }
                a.setStyle(mediaStyle);
                return;
            }
            if (this.f2955c) {
                zVar.mo2141a().setOngoing(true);
            }
        }

        /* renamed from: c */
        public final RemoteViews mo2140c(C0702z zVar) {
            int i;
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            int min = Math.min(this.f2239d.f2203b.size(), 5);
            if (min <= 3) {
                i = R.layout.abz;
            } else {
                i = R.layout.abx;
            }
            RemoteViews a = mo2137a(false, i, false);
            a.removeAllViews(R.id.bkr);
            if (min > 0) {
                for (int i2 = 0; i2 < min; i2++) {
                    a.addView(R.id.bkr, m2472a((C0611a) this.f2239d.f2203b.get(i2)));
                }
            }
            if (this.f2955c) {
                a.setViewVisibility(R.id.q9, 0);
                a.setInt(R.id.q9, "setAlpha", this.f2239d.f2202a.getResources().getInteger(R.integer.f));
                a.setOnClickPendingIntent(R.id.q9, this.f2956h);
            } else {
                a.setViewVisibility(R.id.q9, 8);
            }
            return a;
        }

        /* renamed from: b */
        public final RemoteViews mo2139b(C0702z zVar) {
            int i;
            if (VERSION.SDK_INT >= 21) {
                return null;
            }
            RemoteViews a = mo2137a(false, R.layout.ac4, true);
            int size = this.f2239d.f2203b.size();
            if (this.f2953a == null) {
                i = 0;
            } else {
                i = Math.min(this.f2953a.length, 3);
            }
            a.removeAllViews(R.id.bkr);
            if (i > 0) {
                int i2 = 0;
                while (i2 < i) {
                    if (i2 < size) {
                        a.addView(R.id.bkr, m2472a((C0611a) this.f2239d.f2203b.get(this.f2953a[i2])));
                        i2++;
                    } else {
                        throw new IllegalArgumentException(C2240a.m6772a("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
                    }
                }
            }
            if (this.f2955c) {
                a.setViewVisibility(R.id.aaj, 8);
                a.setViewVisibility(R.id.q9, 0);
                a.setOnClickPendingIntent(R.id.q9, this.f2956h);
                a.setInt(R.id.q9, "setAlpha", this.f2239d.f2202a.getResources().getInteger(R.integer.f));
            } else {
                a.setViewVisibility(R.id.aaj, 0);
                a.setViewVisibility(R.id.q9, 8);
            }
            return a;
        }
    }
}

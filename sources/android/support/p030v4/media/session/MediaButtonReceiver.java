package android.support.p030v4.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.p030v4.media.MediaBrowserCompat;
import android.support.p030v4.media.MediaBrowserCompat.C0831b;
import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaButtonReceiver */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: android.support.v4.media.session.MediaButtonReceiver$a */
    static class C0899a extends C0831b {

        /* renamed from: c */
        public MediaBrowserCompat f2968c;

        /* renamed from: d */
        private final Context f2969d;

        /* renamed from: e */
        private final Intent f2970e;

        /* renamed from: f */
        private final PendingResult f2971f;

        /* renamed from: b */
        public final void mo2689b() {
            m2487d();
        }

        /* renamed from: c */
        public final void mo2690c() {
            m2487d();
        }

        /* renamed from: d */
        private void m2487d() {
            this.f2968c.mo2679a();
            this.f2971f.finish();
        }

        /* renamed from: a */
        public final void mo2688a() {
            try {
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f2969d, this.f2968c.f2799b.mo2698e());
                KeyEvent keyEvent = (KeyEvent) this.f2970e.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    mediaControllerCompat.f2972a.mo2775a(keyEvent);
                    m2487d();
                    return;
                }
                throw new IllegalArgumentException("KeyEvent may not be null");
            } catch (RemoteException unused) {
            }
        }

        C0899a(Context context, Intent intent, PendingResult pendingResult) {
            this.f2969d = context;
            this.f2970e = intent;
            this.f2971f = pendingResult;
        }
    }

    /* renamed from: a */
    private static ComponentName m2486a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a = m2486a(context, "android.intent.action.MEDIA_BUTTON");
            if (a != null) {
                intent.setComponent(a);
                if (VERSION.SDK_INT >= 26) {
                    context.startForegroundService(intent);
                    return;
                }
                if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                    context.startService(intent);
                }
                return;
            }
            ComponentName a2 = m2486a(context, "android.media.browse.MediaBrowserService");
            if (a2 != null) {
                PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                C0899a aVar = new C0899a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a2, aVar, null);
                aVar.f2968c = mediaBrowserCompat;
                mediaBrowserCompat.f2799b.mo2696c();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }
}

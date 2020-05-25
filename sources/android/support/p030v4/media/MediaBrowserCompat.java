package android.support.p030v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p030v4.app.C0647e;
import android.support.p030v4.media.session.C0940b;
import android.support.p030v4.media.session.C0940b.C0941a;
import android.support.p030v4.media.session.MediaSessionCompat;
import android.support.p030v4.media.session.MediaSessionCompat.Token;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p040os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f2798a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    public final C0835d f2799b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final C0834c f2800d;

        /* renamed from: a */
        public final void mo2680a(int i, Bundle bundle) {
            if (this.f2800d != null) {
                MediaSessionCompat.m2523a(bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    static class ItemReceiver extends ResultReceiver {
        /* renamed from: a */
        public final void mo2680a(int i, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaItem[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }
        };

        /* renamed from: a */
        public final int f2801a;

        /* renamed from: b */
        public final MediaDescriptionCompat f2802b;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f2801a);
            sb.append(", mDescription=");
            sb.append(this.f2802b);
            sb.append('}');
            return sb.toString();
        }

        MediaItem(Parcel parcel) {
            this.f2801a = parcel.readInt();
            this.f2802b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        /* renamed from: a */
        public static List<MediaItem> m2396a(List<?> list) {
            Object obj;
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next == null || VERSION.SDK_INT < 21) {
                    obj = null;
                } else {
                    android.media.browse.MediaBrowser.MediaItem mediaItem = (android.media.browse.MediaBrowser.MediaItem) next;
                    obj = new MediaItem(MediaDescriptionCompat.m2456a(mediaItem.getDescription()), mediaItem.getFlags());
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2801a);
            this.f2802b.writeToParcel(parcel, i);
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f2925a)) {
                this.f2801a = i;
                this.f2802b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public final void mo2680a(int i, Bundle bundle) {
            MediaSessionCompat.m2523a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    static class C0830a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0845i> f2803a;

        /* renamed from: b */
        private WeakReference<Messenger> f2804b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2686a(Messenger messenger) {
            this.f2804b = new WeakReference<>(messenger);
        }

        C0830a(C0845i iVar) {
            this.f2803a = new WeakReference<>(iVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.ref.WeakReference<android.os.Messenger> r0 = r9.f2804b
                if (r0 == 0) goto L_0x0081
                java.lang.ref.WeakReference<android.os.Messenger> r0 = r9.f2804b
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L_0x0081
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$i> r0 = r9.f2803a
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0015
                goto L_0x0081
            L_0x0015:
                android.os.Bundle r0 = r10.getData()
                android.support.p030v4.media.session.MediaSessionCompat.m2523a(r0)
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$i> r1 = r9.f2803a
                java.lang.Object r1 = r1.get()
                android.support.v4.media.MediaBrowserCompat$i r1 = (android.support.p030v4.media.MediaBrowserCompat.C0845i) r1
                java.lang.ref.WeakReference<android.os.Messenger> r2 = r9.f2804b
                java.lang.Object r2 = r2.get()
                r8 = r2
                android.os.Messenger r8 = (android.os.Messenger) r8
                int r2 = r10.what     // Catch:{ BadParcelableException -> 0x0077 }
                switch(r2) {
                    case 1: goto L_0x005b;
                    case 2: goto L_0x0057;
                    case 3: goto L_0x0033;
                    default: goto L_0x0032;
                }     // Catch:{ BadParcelableException -> 0x0077 }
            L_0x0032:
                goto L_0x0076
            L_0x0033:
                java.lang.String r2 = "data_options"
                android.os.Bundle r6 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p030v4.media.session.MediaSessionCompat.m2523a(r6)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_notify_children_changed_options"
                android.os.Bundle r7 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p030v4.media.session.MediaSessionCompat.m2523a(r7)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_media_item_id"
                java.lang.String r4 = r0.getString(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_media_item_list"
                java.util.ArrayList r5 = r0.getParcelableArrayList(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                r2 = r1
                r3 = r8
                r2.mo2701a(r3, r4, r5, r6, r7)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0076
            L_0x0057:
                r1.mo2699a(r8)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0080
            L_0x005b:
                java.lang.String r2 = "data_root_hints"
                android.os.Bundle r2 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p030v4.media.session.MediaSessionCompat.m2523a(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r3 = "data_media_item_id"
                java.lang.String r3 = r0.getString(r3)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r4 = "data_media_session_token"
                android.os.Parcelable r0 = r0.getParcelable(r4)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.v4.media.session.MediaSessionCompat$Token r0 = (android.support.p030v4.media.session.MediaSessionCompat.Token) r0     // Catch:{ BadParcelableException -> 0x0077 }
                r1.mo2700a(r8, r3, r0, r2)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0080
            L_0x0076:
                return
            L_0x0077:
                int r10 = r10.what
                r0 = 1
                if (r10 != r0) goto L_0x0080
                r1.mo2699a(r8)
            L_0x0080:
                return
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.media.MediaBrowserCompat.C0830a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0831b {

        /* renamed from: a */
        final Object f2805a;

        /* renamed from: b */
        public C0832a f2806b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0832a {
            /* renamed from: a */
            void mo2691a();

            /* renamed from: b */
            void mo2692b();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        class C0833b implements C0877a {
            /* renamed from: c */
            public final void mo2695c() {
                C0831b.this.mo2690c();
            }

            /* renamed from: a */
            public final void mo2693a() {
                if (C0831b.this.f2806b != null) {
                    C0831b.this.f2806b.mo2691a();
                }
                C0831b.this.mo2688a();
            }

            /* renamed from: b */
            public final void mo2694b() {
                if (C0831b.this.f2806b != null) {
                    C0831b.this.f2806b.mo2692b();
                }
                C0831b.this.mo2689b();
            }

            C0833b() {
            }
        }

        /* renamed from: a */
        public void mo2688a() {
        }

        /* renamed from: b */
        public void mo2689b() {
        }

        /* renamed from: c */
        public void mo2690c() {
        }

        public C0831b() {
            if (VERSION.SDK_INT >= 21) {
                this.f2805a = new C0878b(new C0833b());
            } else {
                this.f2805a = null;
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0834c {
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public interface C0835d {
        /* renamed from: c */
        void mo2696c();

        /* renamed from: d */
        void mo2697d();

        /* renamed from: e */
        Token mo2698e();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0836e implements C0832a, C0835d, C0845i {

        /* renamed from: a */
        final Context f2808a;

        /* renamed from: b */
        protected final Object f2809b;

        /* renamed from: c */
        protected final Bundle f2810c;

        /* renamed from: d */
        protected final C0830a f2811d = new C0830a(this);

        /* renamed from: e */
        protected int f2812e;

        /* renamed from: f */
        protected C0846j f2813f;

        /* renamed from: g */
        protected Messenger f2814g;

        /* renamed from: h */
        private final C0777a<String, C0847k> f2815h = new C0777a<>();

        /* renamed from: i */
        private Token f2816i;

        /* renamed from: j */
        private Bundle f2817j;

        /* renamed from: a */
        public final void mo2699a(Messenger messenger) {
        }

        /* renamed from: a */
        public final void mo2700a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public final void mo2696c() {
            ((MediaBrowser) this.f2809b).connect();
        }

        /* renamed from: b */
        public final void mo2692b() {
            this.f2813f = null;
            this.f2814g = null;
            this.f2816i = null;
            this.f2811d.mo2686a(null);
        }

        /* renamed from: d */
        public final void mo2697d() {
            if (!(this.f2813f == null || this.f2814g == null)) {
                try {
                    this.f2813f.mo2710a(7, null, this.f2814g);
                } catch (RemoteException unused) {
                }
            }
            ((MediaBrowser) this.f2809b).disconnect();
        }

        /* renamed from: e */
        public final Token mo2698e() {
            if (this.f2816i == null) {
                this.f2816i = Token.m2527a(C0876a.m2467a(this.f2809b), null);
            }
            return this.f2816i;
        }

        /* renamed from: a */
        public final void mo2691a() {
            Bundle extras = ((MediaBrowser) this.f2809b).getExtras();
            if (extras != null) {
                this.f2812e = extras.getInt("extra_service_version", 0);
                IBinder a = C0647e.m1767a(extras, "extra_messenger");
                if (a != null) {
                    this.f2813f = new C0846j(a, this.f2810c);
                    this.f2814g = new Messenger(this.f2811d);
                    this.f2811d.mo2686a(this.f2814g);
                    try {
                        C0846j jVar = this.f2813f;
                        Context context = this.f2808a;
                        Messenger messenger = this.f2814g;
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", jVar.f2840a);
                        jVar.mo2710a(6, bundle, messenger);
                    } catch (RemoteException unused) {
                    }
                }
                C0940b a2 = C0941a.m2735a(C0647e.m1767a(extras, "extra_session_binder"));
                if (a2 != null) {
                    this.f2816i = Token.m2527a(C0876a.m2467a(this.f2809b), a2);
                }
            }
        }

        C0836e(Context context, ComponentName componentName, C0831b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f2808a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f2810c = bundle2;
            this.f2810c.putInt("extra_client_version", 1);
            bVar.f2806b = this;
            this.f2809b = new MediaBrowser(context, componentName, (ConnectionCallback) bVar.f2805a, this.f2810c);
        }

        /* renamed from: a */
        public final void mo2701a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f2814g == messenger) {
                C0847k kVar = (C0847k) this.f2815h.get(str);
                if (!(kVar == null || kVar.mo2711a(bundle) == null)) {
                    if (bundle == null) {
                        if (list != null) {
                            this.f2817j = bundle2;
                            this.f2817j = null;
                        }
                    } else if (list != null) {
                        this.f2817j = bundle2;
                        this.f2817j = null;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0837f extends C0836e {
        C0837f(Context context, ComponentName componentName, C0831b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0838g extends C0837f {
        C0838g(Context context, ComponentName componentName, C0831b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0839h implements C0835d, C0845i {

        /* renamed from: a */
        final Context f2818a;

        /* renamed from: b */
        final ComponentName f2819b;

        /* renamed from: c */
        final C0831b f2820c;

        /* renamed from: d */
        final Bundle f2821d;

        /* renamed from: e */
        final C0830a f2822e = new C0830a(this);

        /* renamed from: f */
        int f2823f = 1;

        /* renamed from: g */
        C0842a f2824g;

        /* renamed from: h */
        C0846j f2825h;

        /* renamed from: i */
        Messenger f2826i;

        /* renamed from: j */
        private final C0777a<String, C0847k> f2827j = new C0777a<>();

        /* renamed from: k */
        private String f2828k;

        /* renamed from: l */
        private Token f2829l;

        /* renamed from: m */
        private Bundle f2830m;

        /* renamed from: n */
        private Bundle f2831n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$a */
        class C0842a implements ServiceConnection {
            C0842a() {
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                m2426a((Runnable) new Runnable() {
                    public final void run() {
                        if (C0842a.this.mo2705a("onServiceDisconnected")) {
                            C0839h.this.f2825h = null;
                            C0839h.this.f2826i = null;
                            C0839h.this.f2822e.mo2686a(null);
                            C0839h.this.f2823f = 4;
                            C0839h.this.f2820c.mo2689b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m2426a(Runnable runnable) {
                if (Thread.currentThread() == C0839h.this.f2822e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0839h.this.f2822e.post(runnable);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo2705a(String str) {
                if (C0839h.this.f2824g != this || C0839h.this.f2823f == 0 || C0839h.this.f2823f == 1) {
                    return false;
                }
                return true;
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m2426a((Runnable) new Runnable() {
                    public final void run() {
                        if (C0842a.this.mo2705a("onServiceConnected")) {
                            C0839h.this.f2825h = new C0846j(iBinder, C0839h.this.f2821d);
                            C0839h.this.f2826i = new Messenger(C0839h.this.f2822e);
                            C0839h.this.f2822e.mo2686a(C0839h.this.f2826i);
                            C0839h.this.f2823f = 2;
                            try {
                                C0846j jVar = C0839h.this.f2825h;
                                Context context = C0839h.this.f2818a;
                                Messenger messenger = C0839h.this.f2826i;
                                Bundle bundle = new Bundle();
                                bundle.putString("data_package_name", context.getPackageName());
                                bundle.putBundle("data_root_hints", jVar.f2840a);
                                jVar.mo2710a(1, bundle, messenger);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                });
            }
        }

        /* renamed from: d */
        public final void mo2697d() {
            this.f2823f = 0;
            this.f2822e.post(new Runnable() {
                public final void run() {
                    if (C0839h.this.f2826i != null) {
                        try {
                            C0839h.this.f2825h.mo2710a(2, null, C0839h.this.f2826i);
                        } catch (RemoteException unused) {
                        }
                    }
                    int i = C0839h.this.f2823f;
                    C0839h.this.mo2702a();
                    if (i != 0) {
                        C0839h.this.f2823f = i;
                    }
                }
            });
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2702a() {
            if (this.f2824g != null) {
                this.f2818a.unbindService(this.f2824g);
            }
            this.f2823f = 1;
            this.f2824g = null;
            this.f2825h = null;
            this.f2826i = null;
            this.f2822e.mo2686a(null);
            this.f2828k = null;
            this.f2829l = null;
        }

        /* renamed from: e */
        public final Token mo2698e() {
            boolean z;
            if (this.f2823f == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f2829l;
            }
            StringBuilder sb = new StringBuilder("getSessionToken() called while not connected(state=");
            sb.append(this.f2823f);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: c */
        public final void mo2696c() {
            String str;
            if (this.f2823f == 0 || this.f2823f == 1) {
                this.f2823f = 2;
                this.f2822e.post(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r6 = this;
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            int r0 = r0.f2823f
                            if (r0 != 0) goto L_0x0007
                            return
                        L_0x0007:
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            r1 = 2
                            r0.f2823f = r1
                            boolean r0 = android.support.p030v4.media.MediaBrowserCompat.f2798a
                            if (r0 == 0) goto L_0x002f
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$h$a r0 = r0.f2824g
                            if (r0 != 0) goto L_0x0017
                            goto L_0x002f
                        L_0x0017:
                            java.lang.RuntimeException r0 = new java.lang.RuntimeException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "mServiceConnection should be null. Instead it is "
                            r1.<init>(r2)
                            android.support.v4.media.MediaBrowserCompat$h r2 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$h$a r2 = r2.f2824g
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                        L_0x002f:
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$j r0 = r0.f2825h
                            if (r0 != 0) goto L_0x009b
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.os.Messenger r0 = r0.f2826i
                            if (r0 != 0) goto L_0x0083
                            android.content.Intent r0 = new android.content.Intent
                            java.lang.String r1 = "android.media.browse.MediaBrowserService"
                            r0.<init>(r1)
                            android.support.v4.media.MediaBrowserCompat$h r1 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.content.ComponentName r1 = r1.f2819b
                            r0.setComponent(r1)
                            android.support.v4.media.MediaBrowserCompat$h r1 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$h$a r2 = new android.support.v4.media.MediaBrowserCompat$h$a
                            android.support.v4.media.MediaBrowserCompat$h r3 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            r2.<init>()
                            r1.f2824g = r2
                            r1 = 0
                            android.support.v4.media.MediaBrowserCompat$h r2 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this     // Catch:{ Exception -> 0x0074 }
                            android.content.Context r2 = r2.f2818a     // Catch:{ Exception -> 0x0074 }
                            android.support.v4.media.MediaBrowserCompat$h r3 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this     // Catch:{ Exception -> 0x0074 }
                            android.support.v4.media.MediaBrowserCompat$h$a r3 = r3.f2824g     // Catch:{ Exception -> 0x0074 }
                            r4 = 1
                            if (r2 == 0) goto L_0x006f
                            boolean r5 = r2 instanceof android.content.Context     // Catch:{ Exception -> 0x0074 }
                            if (r5 == 0) goto L_0x006f
                            r5 = r2
                            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x0074 }
                            boolean r5 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r5, r0)     // Catch:{ Exception -> 0x0074 }
                            if (r5 == 0) goto L_0x006f
                            r1 = 1
                            goto L_0x0074
                        L_0x006f:
                            boolean r0 = r2.bindService(r0, r3, r4)     // Catch:{ Exception -> 0x0074 }
                            r1 = r0
                        L_0x0074:
                            if (r1 != 0) goto L_0x0082
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            r0.mo2702a()
                            android.support.v4.media.MediaBrowserCompat$h r0 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$b r0 = r0.f2820c
                            r0.mo2690c()
                        L_0x0082:
                            return
                        L_0x0083:
                            java.lang.RuntimeException r0 = new java.lang.RuntimeException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "mCallbacksMessenger should be null. Instead it is "
                            r1.<init>(r2)
                            android.support.v4.media.MediaBrowserCompat$h r2 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.os.Messenger r2 = r2.f2826i
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                        L_0x009b:
                            java.lang.RuntimeException r0 = new java.lang.RuntimeException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            java.lang.String r2 = "mServiceBinderWrapper should be null. Instead it is "
                            r1.<init>(r2)
                            android.support.v4.media.MediaBrowserCompat$h r2 = android.support.p030v4.media.MediaBrowserCompat.C0839h.this
                            android.support.v4.media.MediaBrowserCompat$j r2 = r2.f2825h
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.media.MediaBrowserCompat.C0839h.C08401.run():void");
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
            int i = this.f2823f;
            switch (i) {
                case 0:
                    str = "CONNECT_STATE_DISCONNECTING";
                    break;
                case 1:
                    str = "CONNECT_STATE_DISCONNECTED";
                    break;
                case 2:
                    str = "CONNECT_STATE_CONNECTING";
                    break;
                case 3:
                    str = "CONNECT_STATE_CONNECTED";
                    break;
                case 4:
                    str = "CONNECT_STATE_SUSPENDED";
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder("UNKNOWN/");
                    sb2.append(i);
                    str = sb2.toString();
                    break;
            }
            sb.append(str);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public final void mo2699a(Messenger messenger) {
            if (m2418a(messenger, "onConnectFailed") && this.f2823f == 2) {
                mo2702a();
                this.f2820c.mo2690c();
            }
        }

        /* renamed from: a */
        private boolean m2418a(Messenger messenger, String str) {
            if (this.f2826i != messenger || this.f2823f == 0 || this.f2823f == 1) {
                return false;
            }
            return true;
        }

        public C0839h(Context context, ComponentName componentName, C0831b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f2818a = context;
                this.f2819b = componentName;
                this.f2820c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f2821d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: a */
        public final void mo2700a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (m2418a(messenger, "onConnect") && this.f2823f == 2) {
                this.f2828k = str;
                this.f2829l = token;
                this.f2830m = bundle;
                this.f2823f = 3;
                this.f2820c.mo2688a();
                try {
                    for (Entry entry : this.f2827j.entrySet()) {
                        String str2 = (String) entry.getKey();
                        C0847k kVar = (C0847k) entry.getValue();
                        List<C0848l> list = kVar.f2842a;
                        List<Bundle> list2 = kVar.f2843b;
                        for (int i = 0; i < list.size(); i++) {
                            C0846j jVar = this.f2825h;
                            IBinder iBinder = ((C0848l) list.get(i)).f2845b;
                            Bundle bundle2 = (Bundle) list2.get(i);
                            Messenger messenger2 = this.f2826i;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("data_media_item_id", str2);
                            C0647e.m1768a(bundle3, "data_callback_token", iBinder);
                            bundle3.putBundle("data_options", bundle2);
                            jVar.mo2710a(3, bundle3, messenger2);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo2701a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m2418a(messenger, "onLoadChildren")) {
                C0847k kVar = (C0847k) this.f2827j.get(str);
                if (!(kVar == null || kVar.mo2711a(bundle) == null)) {
                    if (bundle == null) {
                        if (list != null) {
                            this.f2831n = bundle2;
                            this.f2831n = null;
                        }
                    } else if (list != null) {
                        this.f2831n = bundle2;
                        this.f2831n = null;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    interface C0845i {
        /* renamed from: a */
        void mo2699a(Messenger messenger);

        /* renamed from: a */
        void mo2700a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo2701a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    static class C0846j {

        /* renamed from: a */
        Bundle f2840a;

        /* renamed from: b */
        private Messenger f2841b;

        public C0846j(IBinder iBinder, Bundle bundle) {
            this.f2841b = new Messenger(iBinder);
            this.f2840a = bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2710a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f2841b.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    static class C0847k {

        /* renamed from: a */
        public final List<C0848l> f2842a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f2843b = new ArrayList();

        /* renamed from: a */
        public final C0848l mo2711a(Bundle bundle) {
            for (int i = 0; i < this.f2843b.size(); i++) {
                if (C0886c.m2477a((Bundle) this.f2843b.get(i), bundle)) {
                    return (C0848l) this.f2842a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static abstract class C0848l {

        /* renamed from: a */
        final Object f2844a;

        /* renamed from: b */
        final IBinder f2845b = new Binder();

        /* renamed from: c */
        WeakReference<C0847k> f2846c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$a */
        class C0849a implements C0879c {
            C0849a() {
            }

            /* renamed from: a */
            public final void mo2712a(String str, List<?> list) {
                C0847k kVar;
                if (C0848l.this.f2846c == null) {
                    kVar = null;
                } else {
                    kVar = (C0847k) C0848l.this.f2846c.get();
                }
                if (kVar == null) {
                    MediaItem.m2396a(list);
                    return;
                }
                List a = MediaItem.m2396a(list);
                List<C0848l> list2 = kVar.f2842a;
                List<Bundle> list3 = kVar.f2843b;
                for (int i = 0; i < list2.size(); i++) {
                    Bundle bundle = (Bundle) list3.get(i);
                    if (!(bundle == null || a == null)) {
                        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i2 != -1 || i3 != -1) {
                            int i4 = i3 * i2;
                            int i5 = i4 + i3;
                            if (i2 < 0 || i3 <= 0 || i4 >= a.size()) {
                                Collections.emptyList();
                            } else {
                                if (i5 > a.size()) {
                                    i5 = a.size();
                                }
                                a.subList(i4, i5);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$b */
        class C0850b extends C0849a implements C0884a {
            C0850b() {
                super();
            }

            /* renamed from: a */
            public final void mo2713a(String str, List<?> list, Bundle bundle) {
                MediaItem.m2396a(list);
            }
        }

        public C0848l() {
            if (VERSION.SDK_INT >= 26) {
                this.f2844a = new C0885b(new C0850b());
            } else if (VERSION.SDK_INT >= 21) {
                this.f2844a = new C0880d(new C0849a());
            } else {
                this.f2844a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo2679a() {
        this.f2799b.mo2697d();
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0831b bVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.f2799b = new C0838g(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 23) {
            this.f2799b = new C0837f(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 21) {
            this.f2799b = new C0836e(context, componentName, bVar, null);
        } else {
            this.f2799b = new C0839h(context, componentName, bVar, null);
        }
    }
}

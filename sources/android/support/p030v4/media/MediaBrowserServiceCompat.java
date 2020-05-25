package android.support.p030v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p030v4.app.C0647e;
import android.support.p030v4.media.C0889f.C0890a;
import android.support.p030v4.media.MediaBrowserCompat.MediaItem;
import android.support.p030v4.media.session.MediaSessionCompat;
import android.support.p030v4.media.session.MediaSessionCompat.Token;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.p040os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserServiceCompat */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    static final boolean f2849a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final C0777a<IBinder, C0856b> f2850b = new C0777a<>();

    /* renamed from: c */
    C0856b f2851c;

    /* renamed from: d */
    final C0871g f2852d = new C0871g();

    /* renamed from: e */
    public Token f2853e;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    public static final class C0855a {

        /* renamed from: a */
        public final String f2865a;

        /* renamed from: b */
        public final Bundle f2866b;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    class C0856b implements DeathRecipient {

        /* renamed from: a */
        public final String f2867a;

        /* renamed from: b */
        public final int f2868b;

        /* renamed from: c */
        public final int f2869c;

        /* renamed from: d */
        public final C0890a f2870d;

        /* renamed from: e */
        public final Bundle f2871e;

        /* renamed from: f */
        public final C0869e f2872f;

        /* renamed from: g */
        public final HashMap<String, List<C0794k<IBinder, Bundle>>> f2873g = new HashMap<>();

        /* renamed from: h */
        public C0855a f2874h;

        public final void binderDied() {
            MediaBrowserServiceCompat.this.f2852d.post(new Runnable() {
                public final void run() {
                    MediaBrowserServiceCompat.this.f2850b.remove(C0856b.this.f2872f.mo2731a());
                }
            });
        }

        C0856b(String str, int i, int i2, Bundle bundle, C0869e eVar) {
            this.f2867a = str;
            this.f2868b = i;
            this.f2869c = i2;
            this.f2870d = new C0890a(str, i, i2);
            this.f2871e = bundle;
            this.f2872f = eVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    public static class C0858c<T> {

        /* renamed from: a */
        private boolean f2877a;

        /* renamed from: f */
        final Object f2878f;

        /* renamed from: g */
        boolean f2879g;

        /* renamed from: h */
        boolean f2880h;

        /* renamed from: i */
        public int f2881i;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2716a(T t) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo2720a() {
            if (this.f2877a || this.f2879g || this.f2880h) {
                return true;
            }
            return false;
        }

        C0858c(Object obj) {
            this.f2878f = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2717a(Bundle bundle) {
            StringBuilder sb = new StringBuilder("It is not supported to send an error for ");
            sb.append(this.f2878f);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: b */
        public final void mo2721b(T t) {
            if (this.f2879g || this.f2880h) {
                StringBuilder sb = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f2878f);
                throw new IllegalStateException(sb.toString());
            }
            this.f2879g = true;
            mo2716a((T) null);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    class C0859d {
        C0859d() {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    interface C0869e {
        /* renamed from: a */
        IBinder mo2731a();

        /* renamed from: a */
        void mo2732a(String str, Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo2733a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        /* renamed from: b */
        void mo2734b() throws RemoteException;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    static class C0870f implements C0869e {

        /* renamed from: a */
        final Messenger f2922a;

        /* renamed from: a */
        public final IBinder mo2731a() {
            return this.f2922a.getBinder();
        }

        /* renamed from: b */
        public final void mo2734b() throws RemoteException {
            m2450a(2, null);
        }

        C0870f(Messenger messenger) {
            this.f2922a = messenger;
        }

        /* renamed from: a */
        private void m2450a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f2922a.send(obtain);
        }

        /* renamed from: a */
        public final void mo2732a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m2450a(1, bundle2);
        }

        /* renamed from: a */
        public final void mo2733a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                String str2 = "data_media_item_list";
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(list);
                }
                bundle3.putParcelableArrayList(str2, arrayList);
            }
            m2450a(3, bundle3);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    final class C0871g extends Handler {

        /* renamed from: b */
        private final C0859d f2924b = new C0859d();

        C0871g() {
        }

        /* renamed from: a */
        public final void mo2735a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m2523a(bundle);
                    C0859d dVar = this.f2924b;
                    String string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_pid");
                    int i2 = data.getInt("data_calling_uid");
                    C0870f fVar = new C0870f(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z = false;
                    if (string != null) {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i2);
                        int length = packagesForUid.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (packagesForUid[i3].equals(string)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (z) {
                        C0871g gVar = MediaBrowserServiceCompat.this.f2852d;
                        C08601 r2 = new Runnable(fVar, string, i, i2, bundle) {

                            /* renamed from: a */
                            final /* synthetic */ C0869e f2883a;

                            /* renamed from: b */
                            final /* synthetic */ String f2884b;

                            /* renamed from: c */
                            final /* synthetic */ int f2885c;

                            /* renamed from: d */
                            final /* synthetic */ int f2886d;

                            /* renamed from: e */
                            final /* synthetic */ Bundle f2887e;

                            public final void run() {
                                IBinder a = this.f2883a.mo2731a();
                                MediaBrowserServiceCompat.this.f2850b.remove(a);
                                C0856b bVar = new C0856b(this.f2884b, this.f2885c, this.f2886d, this.f2887e, this.f2883a);
                                MediaBrowserServiceCompat.this.f2851c = bVar;
                                bVar.f2874h = MediaBrowserServiceCompat.this.mo2714a(this.f2884b, this.f2886d, this.f2887e);
                                MediaBrowserServiceCompat.this.f2851c = null;
                                if (bVar.f2874h == null) {
                                    try {
                                        this.f2883a.mo2734b();
                                    } catch (RemoteException unused) {
                                    }
                                    return;
                                }
                                try {
                                    MediaBrowserServiceCompat.this.f2850b.put(a, bVar);
                                    a.linkToDeath(bVar, 0);
                                    if (MediaBrowserServiceCompat.this.f2853e != null) {
                                        this.f2883a.mo2732a(bVar.f2874h.f2865a, MediaBrowserServiceCompat.this.f2853e, bVar.f2874h.f2866b);
                                    }
                                } catch (RemoteException unused2) {
                                    MediaBrowserServiceCompat.this.f2850b.remove(a);
                                }
                            }

                            {
                                this.f2883a = r2;
                                this.f2884b = r3;
                                this.f2885c = r4;
                                this.f2886d = r5;
                                this.f2887e = r6;
                            }
                        };
                        gVar.mo2735a(r2);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Package/uid mismatch: uid=");
                    sb.append(i2);
                    sb.append(" package=");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                case 2:
                    C0859d dVar2 = this.f2924b;
                    MediaBrowserServiceCompat.this.f2852d.mo2735a(new Runnable(new C0870f(message.replyTo)) {

                        /* renamed from: a */
                        final /* synthetic */ C0869e f2889a;

                        public final void run() {
                            C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.remove(this.f2889a.mo2731a());
                            if (bVar != null) {
                                bVar.f2872f.mo2731a().unlinkToDeath(bVar, 0);
                            }
                        }

                        {
                            this.f2889a = r2;
                        }
                    });
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m2523a(bundle2);
                    C0859d dVar3 = this.f2924b;
                    String string2 = data.getString("data_media_item_id");
                    IBinder a = C0647e.m1767a(data, "data_callback_token");
                    C0870f fVar2 = new C0870f(message.replyTo);
                    C0871g gVar2 = MediaBrowserServiceCompat.this.f2852d;
                    C08623 r22 = new Runnable(fVar2, string2, a, bundle2) {

                        /* renamed from: a */
                        final /* synthetic */ C0869e f2891a;

                        /* renamed from: b */
                        final /* synthetic */ String f2892b;

                        /* renamed from: c */
                        final /* synthetic */ IBinder f2893c;

                        /* renamed from: d */
                        final /* synthetic */ Bundle f2894d;

                        public final void run() {
                            C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.get(this.f2891a.mo2731a());
                            if (bVar != null) {
                                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                                String str = this.f2892b;
                                F f = this.f2893c;
                                Bundle bundle = this.f2894d;
                                List list = (List) bVar.f2873g.get(str);
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        C0794k kVar = (C0794k) it.next();
                                        if (f == kVar.f2711a && C0886c.m2477a(bundle, (Bundle) kVar.f2712b)) {
                                            break;
                                        }
                                    } else {
                                        list.add(new C0794k(f, bundle));
                                        bVar.f2873g.put(str, list);
                                        C08511 r1 = new C0858c<List<MediaItem>>(str, bVar, str, bundle, null) {

                                            /* renamed from: a */
                                            final /* synthetic */ C0856b f2854a;

                                            /* renamed from: b */
                                            final /* synthetic */ String f2855b;

                                            /* renamed from: c */
                                            final /* synthetic */ Bundle f2856c;

                                            /* renamed from: d */
                                            final /* synthetic */ Bundle f2857d;

                                            /* access modifiers changed from: 0000 */
                                            /* renamed from: a */
                                            public final /* synthetic */ void mo2716a(Object obj) {
                                                List list = (List) obj;
                                                if (MediaBrowserServiceCompat.this.f2850b.get(this.f2854a.f2872f.mo2731a()) == this.f2854a) {
                                                    if ((this.f2881i & 1) != 0) {
                                                        Bundle bundle = this.f2856c;
                                                        if (list == null) {
                                                            list = null;
                                                        } else {
                                                            int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                                                            int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                                                            if (!(i == -1 && i2 == -1)) {
                                                                int i3 = i2 * i;
                                                                int i4 = i3 + i2;
                                                                if (i < 0 || i2 <= 0 || i3 >= list.size()) {
                                                                    list = Collections.emptyList();
                                                                } else {
                                                                    if (i4 > list.size()) {
                                                                        i4 = list.size();
                                                                    }
                                                                    list = list.subList(i3, i4);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        this.f2854a.f2872f.mo2733a(this.f2855b, list, this.f2856c, this.f2857d);
                                                    } catch (RemoteException unused) {
                                                    }
                                                }
                                            }

                                            {
                                                this.f2854a = r3;
                                                this.f2855b = r4;
                                                this.f2856c = r5;
                                                this.f2857d = r6;
                                            }
                                        };
                                        mediaBrowserServiceCompat.f2851c = bVar;
                                        if (bundle != null) {
                                            r1.f2881i = 1;
                                        }
                                        mediaBrowserServiceCompat.f2851c = null;
                                        if (r1.mo2720a()) {
                                            mediaBrowserServiceCompat.f2851c = bVar;
                                            mediaBrowserServiceCompat.f2851c = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
                                            sb.append(bVar.f2867a);
                                            sb.append(" id=");
                                            sb.append(str);
                                            throw new IllegalStateException(sb.toString());
                                        }
                                    }
                                }
                            }
                        }

                        {
                            this.f2891a = r2;
                            this.f2892b = r3;
                            this.f2893c = r4;
                            this.f2894d = r5;
                        }
                    };
                    gVar2.mo2735a(r22);
                    return;
                case 4:
                    C0859d dVar4 = this.f2924b;
                    String string3 = data.getString("data_media_item_id");
                    IBinder a2 = C0647e.m1767a(data, "data_callback_token");
                    MediaBrowserServiceCompat.this.f2852d.mo2735a(new Runnable(new C0870f(message.replyTo), string3, a2) {

                        /* renamed from: a */
                        final /* synthetic */ C0869e f2896a;

                        /* renamed from: b */
                        final /* synthetic */ String f2897b;

                        /* renamed from: c */
                        final /* synthetic */ IBinder f2898c;

                        public final void run() {
                            C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.get(this.f2896a.mo2731a());
                            if (bVar != null) {
                                MediaBrowserServiceCompat.this.mo2715a(this.f2897b, bVar, this.f2898c);
                            }
                        }

                        {
                            this.f2896a = r2;
                            this.f2897b = r3;
                            this.f2898c = r4;
                        }
                    });
                    return;
                case 5:
                    C0859d dVar5 = this.f2924b;
                    String string4 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0870f fVar3 = new C0870f(message.replyTo);
                    if (!TextUtils.isEmpty(string4) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.f2852d.mo2735a(new Runnable(fVar3, string4, resultReceiver) {

                            /* renamed from: a */
                            final /* synthetic */ C0869e f2900a;

                            /* renamed from: b */
                            final /* synthetic */ String f2901b;

                            /* renamed from: c */
                            final /* synthetic */ ResultReceiver f2902c;

                            public final void run() {
                                C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.get(this.f2900a.mo2731a());
                                if (bVar != null) {
                                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                                    String str = this.f2901b;
                                    C08522 r4 = new C0858c<MediaItem>(str, this.f2902c) {

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f2859a;

                                        /* access modifiers changed from: 0000 */
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo2716a(Object obj) {
                                            MediaItem mediaItem = (MediaItem) obj;
                                            if ((this.f2881i & 2) != 0) {
                                                this.f2859a.mo2932b(-1, null);
                                                return;
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelable("media_item", mediaItem);
                                            this.f2859a.mo2932b(0, bundle);
                                        }

                                        {
                                            this.f2859a = r3;
                                        }
                                    };
                                    mediaBrowserServiceCompat.f2851c = bVar;
                                    r4.f2881i = 2;
                                    r4.mo2721b(null);
                                    mediaBrowserServiceCompat.f2851c = null;
                                    if (!r4.mo2720a()) {
                                        StringBuilder sb = new StringBuilder("onLoadItem must call detach() or sendResult() before returning for id=");
                                        sb.append(str);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                }
                            }

                            {
                                this.f2900a = r2;
                                this.f2901b = r3;
                                this.f2902c = r4;
                            }
                        });
                        return;
                    }
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m2523a(bundle3);
                    C0859d dVar6 = this.f2924b;
                    C0870f fVar4 = new C0870f(message.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i4 = data.getInt("data_calling_pid");
                    int i5 = data.getInt("data_calling_uid");
                    C0871g gVar3 = MediaBrowserServiceCompat.this.f2852d;
                    C08656 r23 = new Runnable(fVar4, string5, i4, i5, bundle3) {

                        /* renamed from: a */
                        final /* synthetic */ C0869e f2904a;

                        /* renamed from: b */
                        final /* synthetic */ String f2905b;

                        /* renamed from: c */
                        final /* synthetic */ int f2906c;

                        /* renamed from: d */
                        final /* synthetic */ int f2907d;

                        /* renamed from: e */
                        final /* synthetic */ Bundle f2908e;

                        public final void run() {
                            IBinder a = this.f2904a.mo2731a();
                            MediaBrowserServiceCompat.this.f2850b.remove(a);
                            C0856b bVar = new C0856b(this.f2905b, this.f2906c, this.f2907d, this.f2908e, this.f2904a);
                            MediaBrowserServiceCompat.this.f2850b.put(a, bVar);
                            try {
                                a.linkToDeath(bVar, 0);
                            } catch (RemoteException unused) {
                            }
                        }

                        {
                            this.f2904a = r2;
                            this.f2905b = r3;
                            this.f2906c = r4;
                            this.f2907d = r5;
                            this.f2908e = r6;
                        }
                    };
                    gVar3.mo2735a(r23);
                    return;
                case 7:
                    C0859d dVar7 = this.f2924b;
                    MediaBrowserServiceCompat.this.f2852d.mo2735a(new Runnable(new C0870f(message.replyTo)) {

                        /* renamed from: a */
                        final /* synthetic */ C0869e f2910a;

                        public final void run() {
                            IBinder a = this.f2910a.mo2731a();
                            C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.remove(a);
                            if (bVar != null) {
                                a.unlinkToDeath(bVar, 0);
                            }
                        }

                        {
                            this.f2910a = r2;
                        }
                    });
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m2523a(bundle4);
                    C0859d dVar8 = this.f2924b;
                    String string6 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0870f fVar5 = new C0870f(message.replyTo);
                    if (!TextUtils.isEmpty(string6) && resultReceiver2 != null) {
                        C0871g gVar4 = MediaBrowserServiceCompat.this.f2852d;
                        C08678 r24 = new Runnable(fVar5, string6, bundle4, resultReceiver2) {

                            /* renamed from: a */
                            final /* synthetic */ C0869e f2912a;

                            /* renamed from: b */
                            final /* synthetic */ String f2913b;

                            /* renamed from: c */
                            final /* synthetic */ Bundle f2914c;

                            /* renamed from: d */
                            final /* synthetic */ ResultReceiver f2915d;

                            public final void run() {
                                C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.get(this.f2912a.mo2731a());
                                if (bVar != null) {
                                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                                    String str = this.f2913b;
                                    Bundle bundle = this.f2914c;
                                    C08533 r4 = new C0858c<List<MediaItem>>(str, this.f2915d) {

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f2861a;

                                        /* access modifiers changed from: 0000 */
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo2716a(Object obj) {
                                            List list = (List) obj;
                                            if ((this.f2881i & 4) != 0 || list == null) {
                                                this.f2861a.mo2932b(-1, null);
                                                return;
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
                                            this.f2861a.mo2932b(0, bundle);
                                        }

                                        {
                                            this.f2861a = r3;
                                        }
                                    };
                                    mediaBrowserServiceCompat.f2851c = bVar;
                                    r4.f2881i = 4;
                                    r4.mo2721b(null);
                                    mediaBrowserServiceCompat.f2851c = null;
                                    if (!r4.mo2720a()) {
                                        StringBuilder sb = new StringBuilder("onSearch must call detach() or sendResult() before returning for query=");
                                        sb.append(str);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                }
                            }

                            {
                                this.f2912a = r2;
                                this.f2913b = r3;
                                this.f2914c = r4;
                                this.f2915d = r5;
                            }
                        };
                        gVar4.mo2735a(r24);
                        return;
                    }
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m2523a(bundle5);
                    C0859d dVar9 = this.f2924b;
                    String string7 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    C0870f fVar6 = new C0870f(message.replyTo);
                    if (!TextUtils.isEmpty(string7) && resultReceiver3 != null) {
                        C0871g gVar5 = MediaBrowserServiceCompat.this.f2852d;
                        C08689 r25 = new Runnable(fVar6, string7, bundle5, resultReceiver3) {

                            /* renamed from: a */
                            final /* synthetic */ C0869e f2917a;

                            /* renamed from: b */
                            final /* synthetic */ String f2918b;

                            /* renamed from: c */
                            final /* synthetic */ Bundle f2919c;

                            /* renamed from: d */
                            final /* synthetic */ ResultReceiver f2920d;

                            public final void run() {
                                C0856b bVar = (C0856b) MediaBrowserServiceCompat.this.f2850b.get(this.f2917a.mo2731a());
                                if (bVar != null) {
                                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                                    String str = this.f2918b;
                                    Bundle bundle = this.f2919c;
                                    C08544 r5 = new C0858c<Bundle>(str, this.f2920d) {

                                        /* renamed from: a */
                                        final /* synthetic */ ResultReceiver f2863a;

                                        /* access modifiers changed from: 0000 */
                                        /* renamed from: a */
                                        public final void mo2717a(Bundle bundle) {
                                            this.f2863a.mo2932b(-1, bundle);
                                        }

                                        /* access modifiers changed from: 0000 */
                                        /* renamed from: a */
                                        public final /* synthetic */ void mo2716a(Object obj) {
                                            this.f2863a.mo2932b(0, (Bundle) obj);
                                        }

                                        {
                                            this.f2863a = r3;
                                        }
                                    };
                                    mediaBrowserServiceCompat.f2851c = bVar;
                                    if (r5.f2879g || r5.f2880h) {
                                        StringBuilder sb = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                                        sb.append(r5.f2878f);
                                        throw new IllegalStateException(sb.toString());
                                    }
                                    r5.f2880h = true;
                                    r5.mo2717a((Bundle) null);
                                    mediaBrowserServiceCompat.f2851c = null;
                                    if (!r5.mo2720a()) {
                                        StringBuilder sb2 = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
                                        sb2.append(str);
                                        sb2.append(" extras=");
                                        sb2.append(bundle);
                                        throw new IllegalStateException(sb2.toString());
                                    }
                                }
                            }

                            {
                                this.f2917a = r2;
                                this.f2918b = r3;
                                this.f2919c = r4;
                                this.f2920d = r5;
                            }
                        };
                        gVar5.mo2735a(r25);
                        break;
                    } else {
                        return;
                    }
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public abstract C0855a mo2714a(String str, int i, Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo2715a(String str, C0856b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.f2873g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f2851c = bVar;
                this.f2851c = null;
            }
        } else {
            List list = (List) bVar.f2873g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0794k) it.next()).f2711a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f2873g.remove(str);
                }
            }
            this.f2851c = bVar;
            this.f2851c = null;
            return z2;
        }
    }
}

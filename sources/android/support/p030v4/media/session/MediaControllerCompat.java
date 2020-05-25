package android.support.p030v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p030v4.app.C0647e;
import android.support.p030v4.media.MediaDescriptionCompat;
import android.support.p030v4.media.MediaMetadataCompat;
import android.support.p030v4.media.session.C0937a.C0938a;
import android.support.p030v4.media.session.C0940b.C0941a;
import android.support.p030v4.media.session.C0943c.C0944a;
import android.support.p030v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p030v4.media.session.MediaSessionCompat.Token;
import android.support.p030v4.media.session.PlaybackStateCompat.CustomAction;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    final C0905b f2972a;

    /* renamed from: b */
    public final Token f2973b;

    /* renamed from: c */
    private final HashSet<C0901a> f2974c = new HashSet<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0905b {

        /* renamed from: a */
        protected final Object f2975a;

        /* renamed from: b */
        final Object f2976b = new Object();

        /* renamed from: c */
        final List<C0901a> f2977c = new ArrayList();

        /* renamed from: d */
        HashMap<C0901a, C0900a> f2978d = new HashMap<>();

        /* renamed from: e */
        final Token f2979e;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f2980a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f2980a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f2980a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f2976b) {
                        mediaControllerImplApi21.f2979e.f3004b = C0941a.m2735a(C0647e.m1767a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.f2979e.f3005c = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                        if (mediaControllerImplApi21.f2979e.f3004b != null) {
                            for (C0901a aVar : mediaControllerImplApi21.f2977c) {
                                C0900a aVar2 = new C0900a(aVar);
                                mediaControllerImplApi21.f2978d.put(aVar, aVar2);
                                aVar.f2983c = aVar2;
                                try {
                                    mediaControllerImplApi21.f2979e.f3004b.mo2839a((C0937a) aVar2);
                                    aVar.mo2783a(13, null, null);
                                } catch (RemoteException unused) {
                                }
                            }
                            mediaControllerImplApi21.f2977c.clear();
                        }
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        static class C0900a extends C0904c {
            /* renamed from: a */
            public final void mo2777a() throws RemoteException {
                throw new AssertionError();
            }

            C0900a(C0901a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public final void mo2778a(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2779a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2780a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2781a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2782a(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final boolean mo2775a(KeyEvent keyEvent) {
            return ((MediaController) this.f2975a).dispatchMediaButtonEvent(keyEvent);
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f2979e = token;
            this.f2975a = new MediaController(context, (MediaSession.Token) this.f2979e.f3003a);
            if (this.f2975a == null) {
                throw new RemoteException();
            } else if (this.f2979e.f3004b == null) {
                MediaController mediaController = (MediaController) this.f2975a;
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0901a implements DeathRecipient {

        /* renamed from: a */
        final Object f2981a;

        /* renamed from: b */
        C0902a f2982b;

        /* renamed from: c */
        public C0937a f2983c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        class C0902a extends Handler {

            /* renamed from: a */
            boolean f2984a;

            public final void handleMessage(Message message) {
                if (this.f2984a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.m2523a(message.getData());
                            Object obj = message.obj;
                            return;
                        case 2:
                            Object obj2 = message.obj;
                            return;
                        case 3:
                            Object obj3 = message.obj;
                            return;
                        case 4:
                            Object obj4 = message.obj;
                            break;
                        case 5:
                            Object obj5 = message.obj;
                            return;
                        case 6:
                            Object obj6 = message.obj;
                            return;
                        case 7:
                            MediaSessionCompat.m2523a((Bundle) message.obj);
                            return;
                        case 9:
                            ((Integer) message.obj).intValue();
                            return;
                        case 11:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 12:
                            ((Integer) message.obj).intValue();
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        static class C0903b implements C0944a {

            /* renamed from: a */
            private final WeakReference<C0901a> f2985a;

            /* renamed from: a */
            public final void mo2785a() {
                this.f2985a.get();
            }

            C0903b(C0901a aVar) {
                this.f2985a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public final void mo2787a(Bundle bundle) {
                this.f2985a.get();
            }

            /* renamed from: a */
            public final void mo2788a(CharSequence charSequence) {
                this.f2985a.get();
            }

            /* renamed from: b */
            public final void mo2792b(Object obj) {
                if (((C0901a) this.f2985a.get()) != null && obj != null && VERSION.SDK_INT >= 21) {
                    Parcel obtain = Parcel.obtain();
                    ((MediaMetadata) obj).writeToParcel(obtain, 0);
                    obtain.setDataPosition(0);
                    MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    mediaMetadataCompat.f2947c = obj;
                }
            }

            /* renamed from: a */
            public final void mo2789a(Object obj) {
                List list;
                CustomAction customAction;
                Object obj2 = obj;
                C0901a aVar = (C0901a) this.f2985a.get();
                if (aVar != null && aVar.f2983c == null && obj2 != null && VERSION.SDK_INT >= 21) {
                    PlaybackState playbackState = (PlaybackState) obj2;
                    List customActions = playbackState.getCustomActions();
                    Bundle bundle = null;
                    if (customActions != null) {
                        ArrayList arrayList = new ArrayList(customActions.size());
                        for (Object next : customActions) {
                            if (next == null || VERSION.SDK_INT < 21) {
                                customAction = null;
                            } else {
                                PlaybackState.CustomAction customAction2 = (PlaybackState.CustomAction) next;
                                customAction = new CustomAction(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), customAction2.getExtras());
                                customAction.f3089e = next;
                            }
                            arrayList.add(customAction);
                        }
                        list = arrayList;
                    } else {
                        list = null;
                    }
                    if (VERSION.SDK_INT >= 22) {
                        bundle = playbackState.getExtras();
                    }
                    PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), bundle);
                    playbackStateCompat.f3084l = obj2;
                }
            }

            /* renamed from: a */
            public final void mo2791a(List<?> list) {
                QueueItem queueItem;
                if (((C0901a) this.f2985a.get()) != null && list != null && VERSION.SDK_INT >= 21) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list) {
                        if (next == null || VERSION.SDK_INT < 21) {
                            queueItem = null;
                        } else {
                            MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) next;
                            queueItem = new QueueItem(next, MediaDescriptionCompat.m2456a(queueItem2.getDescription()), queueItem2.getQueueId());
                        }
                        arrayList.add(queueItem);
                    }
                }
            }

            /* renamed from: a */
            public final void mo2790a(String str, Bundle bundle) {
                this.f2985a.get();
            }

            /* renamed from: a */
            public final void mo2786a(int i, int i2, int i3, int i4, int i5) {
                if (((C0901a) this.f2985a.get()) != null) {
                    new C0909f(i, i2, i3, i4, i5);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        static class C0904c extends C0938a {

            /* renamed from: a */
            private final WeakReference<C0901a> f2986a;

            /* renamed from: a */
            public final void mo2796a(boolean z) throws RemoteException {
            }

            /* renamed from: a */
            public void mo2782a(List<QueueItem> list) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo2777a() throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(8, null, null);
                }
            }

            /* renamed from: b */
            public final void mo2797b() throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(13, null, null);
                }
            }

            C0904c(C0901a aVar) {
                this.f2986a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo2778a(Bundle bundle) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public final void mo2793a(int i) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: b */
            public final void mo2798b(int i) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo2779a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: b */
            public final void mo2799b(boolean z) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: a */
            public void mo2780a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0909f fVar;
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        fVar = new C0909f(parcelableVolumeInfo.f3068a, parcelableVolumeInfo.f3069b, parcelableVolumeInfo.f3070c, parcelableVolumeInfo.f3071d, parcelableVolumeInfo.f3072e);
                    } else {
                        fVar = null;
                    }
                    aVar.mo2783a(4, fVar, null);
                }
            }

            /* renamed from: a */
            public final void mo2794a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: a */
            public void mo2781a(CharSequence charSequence) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(6, charSequence, null);
                }
            }

            /* renamed from: a */
            public final void mo2795a(String str, Bundle bundle) throws RemoteException {
                C0901a aVar = (C0901a) this.f2986a.get();
                if (aVar != null) {
                    aVar.mo2783a(1, str, bundle);
                }
            }
        }

        public C0901a() {
            if (VERSION.SDK_INT >= 21) {
                this.f2981a = new C0945b(new C0903b(this));
                return;
            }
            C0904c cVar = new C0904c(this);
            this.f2983c = cVar;
            this.f2981a = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2783a(int i, Object obj, Bundle bundle) {
            if (this.f2982b != null) {
                Message obtainMessage = this.f2982b.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0905b {
        /* renamed from: a */
        boolean mo2775a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0906c extends MediaControllerImplApi21 {
        public C0906c(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0907d extends C0906c {
        public C0907d(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0908e implements C0905b {

        /* renamed from: a */
        private C0940b f2987a;

        public C0908e(Token token) {
            this.f2987a = C0941a.m2735a((IBinder) token.f3003a);
        }

        /* renamed from: a */
        public final boolean mo2775a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f2987a.mo2844a(keyEvent);
                } catch (RemoteException unused) {
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0909f {

        /* renamed from: a */
        public final int f2988a;

        /* renamed from: b */
        public final int f2989b;

        /* renamed from: c */
        public final int f2990c;

        /* renamed from: d */
        public final int f2991d;

        /* renamed from: e */
        public final int f2992e;

        C0909f(int i, int i2, int i3, int i4, int i5) {
            this.f2988a = i;
            this.f2989b = i2;
            this.f2990c = i3;
            this.f2991d = i4;
            this.f2992e = i5;
        }
    }

    public MediaControllerCompat(Context context, Token token) throws RemoteException {
        if (token != null) {
            this.f2973b = token;
            if (VERSION.SDK_INT >= 24) {
                this.f2972a = new C0907d(context, token);
            } else if (VERSION.SDK_INT >= 23) {
                this.f2972a = new C0906c(context, token);
            } else if (VERSION.SDK_INT >= 21) {
                this.f2972a = new MediaControllerImplApi21(context, token);
            } else {
                this.f2972a = new C0908e(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        C0905b bVar;
        this.f2973b = mediaSessionCompat.mo2800a();
        try {
            if (VERSION.SDK_INT >= 24) {
                bVar = new C0907d(context, this.f2973b);
            } else if (VERSION.SDK_INT >= 23) {
                bVar = new C0906c(context, this.f2973b);
            } else if (VERSION.SDK_INT >= 21) {
                bVar = new MediaControllerImplApi21(context, this.f2973b);
            } else {
                bVar = new C0908e(this.f2973b);
            }
        } catch (RemoteException unused) {
            bVar = null;
        }
        this.f2972a = bVar;
    }
}

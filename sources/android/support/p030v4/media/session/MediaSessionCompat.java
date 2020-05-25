package android.support.p030v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p030v4.app.C0647e;
import android.support.p030v4.media.C0889f.C0890a;
import android.support.p030v4.media.C0897j;
import android.support.p030v4.media.C0897j.C0898a;
import android.support.p030v4.media.MediaDescriptionCompat;
import android.support.p030v4.media.MediaMetadataCompat;
import android.support.p030v4.media.RatingCompat;
import android.support.p030v4.media.session.C0940b.C0941a;
import android.support.p030v4.media.session.C0949e.C0950a;
import android.support.p030v4.media.session.C0952f.C0953a;
import android.support.p030v4.media.session.PlaybackStateCompat.C0936a;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: b */
    static int f2993b;

    /* renamed from: a */
    public final MediaControllerCompat f2994a;

    /* renamed from: c */
    private final C0920b f2995c;

    /* renamed from: d */
    private final ArrayList<Object> f2996d;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new QueueItem[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };

        /* renamed from: a */
        public final MediaDescriptionCompat f2999a;

        /* renamed from: b */
        public final long f3000b;

        /* renamed from: c */
        private Object f3001c;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f2999a);
            sb.append(", Id=");
            sb.append(this.f3000b);
            sb.append(" }");
            return sb.toString();
        }

        QueueItem(Parcel parcel) {
            this.f2999a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f3000b = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f2999a.writeToParcel(parcel, i);
            parcel.writeLong(this.f3000b);
        }

        QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f2999a = mediaDescriptionCompat;
                this.f3000b = j;
                this.f3001c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        };

        /* renamed from: a */
        ResultReceiver f3002a;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f3002a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f3002a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Token[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        };

        /* renamed from: a */
        public final Object f3003a;

        /* renamed from: b */
        public C0940b f3004b;

        /* renamed from: c */
        public Bundle f3005c;

        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            if (this.f3003a == null) {
                return 0;
            }
            return this.f3003a.hashCode();
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f3003a == null) {
                if (token.f3003a == null) {
                    return true;
                }
                return false;
            } else if (token.f3003a == null) {
                return false;
            } else {
                return this.f3003a.equals(token.f3003a);
            }
        }

        private Token(Object obj, C0940b bVar) {
            this(obj, bVar, null);
        }

        /* renamed from: a */
        public static Token m2527a(Object obj, C0940b bVar) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0946d.m2793a(obj), bVar);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f3003a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f3003a);
            }
        }

        Token(Object obj, C0940b bVar, Bundle bundle) {
            this.f3003a = obj;
            this.f3004b = bVar;
            this.f3005c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class C0915a {

        /* renamed from: a */
        private C0916a f3006a;

        /* renamed from: b */
        final Object f3007b;

        /* renamed from: c */
        WeakReference<C0920b> f3008c;

        /* renamed from: d */
        private boolean f3009d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        class C0916a extends Handler {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    C0915a.this.mo2816a((C0890a) message.obj);
                }
            }

            C0916a(Looper looper) {
                super(looper);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        class C0917b implements C0947a {
            /* renamed from: a */
            public final void mo2820a(Object obj) {
                RatingCompat.m2466a(obj);
            }

            C0917b() {
            }

            /* renamed from: a */
            public final boolean mo2823a(Intent intent) {
                return C0915a.this.mo2818a(intent);
            }

            /* renamed from: a */
            public final void mo2821a(String str, Bundle bundle) {
                MediaSessionCompat.m2523a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    return;
                }
                if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    }
                }
            }

            /* renamed from: a */
            public final void mo2822a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                IBinder iBinder;
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        C0925e eVar = (C0925e) C0915a.this.f3008c.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token a = eVar.mo2824a();
                            C0940b bVar = a.f3004b;
                            String str2 = "android.support.v4.media.session.EXTRA_BINDER";
                            if (bVar == null) {
                                iBinder = null;
                            } else {
                                iBinder = bVar.asBinder();
                            }
                            C0647e.m1768a(bundle2, str2, iBinder);
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", a.f3005c);
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            C0925e eVar2 = (C0925e) C0915a.this.f3008c.get();
                            if (!(eVar2 == null || eVar2.f3022f == null)) {
                                int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                if (i >= 0 && i < eVar2.f3022f.size()) {
                                    eVar2.f3022f.get(i);
                                }
                            }
                        }
                    }
                } catch (BadParcelableException unused) {
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$c */
        class C0918c extends C0917b implements C0950a {
            C0918c() {
                super();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$d */
        class C0919d extends C0918c implements C0953a {
            C0919d() {
                super();
            }
        }

        public C0915a() {
            if (VERSION.SDK_INT >= 24) {
                this.f3007b = new C0954b(new C0919d());
            } else if (VERSION.SDK_INT >= 23) {
                this.f3007b = new C0951b(new C0918c());
            } else if (VERSION.SDK_INT >= 21) {
                this.f3007b = new C0948b(new C0917b());
            } else {
                this.f3007b = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2816a(C0890a aVar) {
            if (this.f3009d) {
                this.f3009d = false;
                this.f3006a.removeMessages(1);
                C0920b bVar = (C0920b) this.f3008c.get();
                if (bVar != null) {
                    bVar.mo2826a(aVar);
                    bVar.mo2826a((C0890a) null);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo2818a(Intent intent) {
            if (VERSION.SDK_INT >= 27) {
                return false;
            }
            C0920b bVar = (C0920b) this.f3008c.get();
            if (bVar == null || this.f3006a == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null || keyEvent.getAction() != 0) {
                return false;
            }
            C0890a b = bVar.mo2828b();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo2816a(b);
                } else if (this.f3009d) {
                    this.f3006a.removeMessages(1);
                    this.f3009d = false;
                } else {
                    this.f3009d = true;
                    this.f3006a.sendMessageDelayed(this.f3006a.obtainMessage(1, b), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo2816a(b);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2817a(C0920b bVar, Handler handler) {
            this.f3008c = new WeakReference<>(bVar);
            if (this.f3006a != null) {
                this.f3006a.removeCallbacksAndMessages(null);
            }
            this.f3006a = new C0916a(handler.getLooper());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    interface C0920b {
        /* renamed from: a */
        Token mo2824a();

        /* renamed from: a */
        void mo2825a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo2826a(C0890a aVar);

        /* renamed from: a */
        void mo2827a(C0915a aVar, Handler handler);

        /* renamed from: b */
        C0890a mo2828b();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    static class C0921c extends C0928g {

        /* renamed from: x */
        private static boolean f3014x = true;

        /* renamed from: a */
        public void mo2827a(C0915a aVar, Handler handler) {
            super.mo2827a(aVar, handler);
            if (aVar == null) {
                this.f3039d.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f3039d.setPlaybackPositionUpdateListener(new OnPlaybackPositionUpdateListener() {
                public final void onPlaybackPositionUpdate(long j) {
                    C0921c.this.mo2881a(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }

        C0921c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0923d extends C0921c {
        /* renamed from: a */
        public final void mo2827a(C0915a aVar, Handler handler) {
            super.mo2827a(aVar, handler);
            if (aVar == null) {
                this.f3039d.setMetadataUpdateListener(null);
                return;
            }
            this.f3039d.setMetadataUpdateListener(new OnMetadataUpdateListener() {
                public final void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        C0923d.this.mo2881a(19, -1, -1, RatingCompat.m2466a(obj), null);
                    }
                }
            });
        }

        C0923d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0925e implements C0920b {

        /* renamed from: a */
        final Object f3017a;

        /* renamed from: b */
        final Token f3018b;

        /* renamed from: c */
        boolean f3019c;

        /* renamed from: d */
        final RemoteCallbackList<C0937a> f3020d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f3021e;

        /* renamed from: f */
        List<QueueItem> f3022f;

        /* renamed from: g */
        MediaMetadataCompat f3023g;

        /* renamed from: h */
        int f3024h;

        /* renamed from: i */
        boolean f3025i;

        /* renamed from: j */
        int f3026j;

        /* renamed from: k */
        int f3027k;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0926a extends C0941a {
            /* renamed from: b */
            public final void mo2853b(boolean z) throws RemoteException {
            }

            /* renamed from: i */
            public final List<QueueItem> mo2864i() {
                return null;
            }

            /* renamed from: o */
            public final boolean mo2870o() {
                return false;
            }

            /* renamed from: a */
            public final void mo2841a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final boolean mo2844a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2840a(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2842a(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final boolean mo2843a() {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final String mo2845b() {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final String mo2854c() {
                throw new AssertionError();
            }

            /* renamed from: d */
            public final PendingIntent mo2857d() {
                throw new AssertionError();
            }

            /* renamed from: e */
            public final long mo2859e() {
                throw new AssertionError();
            }

            /* renamed from: f */
            public final ParcelableVolumeInfo mo2861f() {
                throw new AssertionError();
            }

            /* renamed from: g */
            public final MediaMetadataCompat mo2862g() {
                throw new AssertionError();
            }

            /* renamed from: j */
            public final CharSequence mo2865j() {
                throw new AssertionError();
            }

            /* renamed from: k */
            public final Bundle mo2866k() {
                throw new AssertionError();
            }

            /* renamed from: l */
            public final int mo2867l() {
                return C0925e.this.f3024h;
            }

            /* renamed from: m */
            public final boolean mo2868m() {
                return C0925e.this.f3025i;
            }

            /* renamed from: n */
            public final int mo2869n() {
                return C0925e.this.f3026j;
            }

            /* renamed from: p */
            public final int mo2871p() {
                return C0925e.this.f3027k;
            }

            /* renamed from: q */
            public final void mo2872q() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r */
            public final void mo2873r() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s */
            public final void mo2874s() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t */
            public final void mo2875t() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: u */
            public final void mo2876u() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v */
            public final void mo2877v() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: w */
            public final void mo2878w() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: x */
            public final void mo2879x() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: h */
            public final PlaybackStateCompat mo2863h() {
                return MediaSessionCompat.m2522a(C0925e.this.f3021e, C0925e.this.f3023g);
            }

            C0926a() {
            }

            /* renamed from: a */
            public final void mo2831a(int i) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2846b(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final void mo2855c(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2833a(long j) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2848b(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2835a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2850b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2837a(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2851b(C0937a aVar) {
                C0925e.this.f3020d.unregister(aVar);
            }

            /* renamed from: a */
            public final void mo2839a(C0937a aVar) {
                String str;
                if (!C0925e.this.f3019c) {
                    C0925e eVar = C0925e.this;
                    if (VERSION.SDK_INT < 24) {
                        str = null;
                    } else {
                        str = C0952f.m2798a(eVar.f3017a);
                    }
                    if (str == null) {
                        str = "android.media.session.MediaController";
                    }
                    C0925e.this.f3020d.register(aVar, new C0890a(str, getCallingPid(), getCallingUid()));
                }
            }

            /* renamed from: d */
            public final void mo2858d(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: e */
            public final void mo2860e(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final void mo2856c(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2834a(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2849b(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2836a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2838a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2852b(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo2832a(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo2847b(int i, int i2, String str) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final Token mo2824a() {
            return this.f3018b;
        }

        /* renamed from: a */
        public void mo2826a(C0890a aVar) {
        }

        /* renamed from: b */
        public C0890a mo2828b() {
            return null;
        }

        /* renamed from: a */
        public final void mo2825a(PendingIntent pendingIntent) {
            ((MediaSession) this.f3017a).setMediaButtonReceiver(pendingIntent);
        }

        /* renamed from: a */
        public final void mo2827a(C0915a aVar, Handler handler) {
            Object obj;
            Object obj2 = this.f3017a;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f3007b;
            }
            ((MediaSession) obj2).setCallback((Callback) obj, handler);
            if (aVar != null) {
                aVar.mo2817a(this, handler);
            }
        }

        C0925e(Context context, String str, Bundle bundle) {
            this.f3017a = new MediaSession(context, str);
            this.f3018b = new Token(((MediaSession) this.f3017a).getSessionToken(), new C0926a(), bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0927f extends C0925e {
        /* renamed from: a */
        public final void mo2826a(C0890a aVar) {
        }

        /* renamed from: b */
        public final C0890a mo2828b() {
            return new C0890a(((MediaSession) this.f3017a).getCurrentControllerInfo());
        }

        C0927f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0928g implements C0920b {

        /* renamed from: A */
        private final C0931b f3029A;

        /* renamed from: B */
        private final Token f3030B;

        /* renamed from: C */
        private C0932c f3031C;

        /* renamed from: D */
        private boolean f3032D = false;

        /* renamed from: E */
        private boolean f3033E = false;

        /* renamed from: F */
        private C0890a f3034F;

        /* renamed from: G */
        private C0898a f3035G = new C0898a() {
        };

        /* renamed from: a */
        final String f3036a;

        /* renamed from: b */
        final String f3037b;

        /* renamed from: c */
        final AudioManager f3038c;

        /* renamed from: d */
        final RemoteControlClient f3039d;

        /* renamed from: e */
        final Object f3040e = new Object();

        /* renamed from: f */
        final RemoteCallbackList<C0937a> f3041f = new RemoteCallbackList<>();

        /* renamed from: g */
        boolean f3042g = false;

        /* renamed from: h */
        boolean f3043h = false;

        /* renamed from: i */
        volatile C0915a f3044i;

        /* renamed from: j */
        int f3045j;

        /* renamed from: k */
        MediaMetadataCompat f3046k;

        /* renamed from: l */
        PlaybackStateCompat f3047l;

        /* renamed from: m */
        PendingIntent f3048m;

        /* renamed from: n */
        List<QueueItem> f3049n;

        /* renamed from: o */
        CharSequence f3050o;

        /* renamed from: p */
        int f3051p;

        /* renamed from: q */
        boolean f3052q;

        /* renamed from: r */
        int f3053r;

        /* renamed from: s */
        int f3054s;

        /* renamed from: t */
        Bundle f3055t;

        /* renamed from: u */
        int f3056u;

        /* renamed from: v */
        int f3057v;

        /* renamed from: w */
        C0897j f3058w;

        /* renamed from: x */
        private final Context f3059x;

        /* renamed from: y */
        private final ComponentName f3060y;

        /* renamed from: z */
        private final PendingIntent f3061z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        static final class C0930a {

            /* renamed from: a */
            public final String f3063a;

            /* renamed from: b */
            public final Bundle f3064b;

            /* renamed from: c */
            public final ResultReceiver f3065c;

            public C0930a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3063a = str;
                this.f3064b = bundle;
                this.f3065c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$b */
        class C0931b extends C0941a {
            /* renamed from: b */
            public final void mo2853b(boolean z) throws RemoteException {
            }

            /* renamed from: o */
            public final boolean mo2870o() {
                return false;
            }

            /* renamed from: a */
            public final void mo2841a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                m2607a(1, (Object) new C0930a(str, bundle, resultReceiverWrapper.f3002a));
            }

            /* renamed from: a */
            public final boolean mo2844a(KeyEvent keyEvent) {
                boolean z = true;
                if ((C0928g.this.f3045j & 1) == 0) {
                    z = false;
                }
                if (z) {
                    m2607a(21, (Object) keyEvent);
                }
                return z;
            }

            /* renamed from: a */
            public final void mo2839a(C0937a aVar) {
                if (C0928g.this.f3042g) {
                    try {
                        aVar.mo2777a();
                    } catch (Exception unused) {
                    }
                } else {
                    C0928g.this.f3041f.register(aVar, new C0890a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            /* renamed from: a */
            public final void mo2840a(String str, Bundle bundle) throws RemoteException {
                m2608a(4, (Object) str, bundle);
            }

            /* renamed from: a */
            public final void mo2837a(RatingCompat ratingCompat) throws RemoteException {
                m2607a(19, (Object) ratingCompat);
            }

            /* renamed from: a */
            public final void mo2838a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                m2608a(31, (Object) ratingCompat, bundle);
            }

            /* renamed from: a */
            public final void mo2842a(boolean z) throws RemoteException {
                m2607a(29, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final boolean mo2843a() {
                return (C0928g.this.f3045j & 2) != 0;
            }

            /* renamed from: b */
            public final String mo2845b() {
                return C0928g.this.f3036a;
            }

            /* renamed from: c */
            public final String mo2854c() {
                return C0928g.this.f3037b;
            }

            /* renamed from: g */
            public final MediaMetadataCompat mo2862g() {
                return C0928g.this.f3046k;
            }

            /* renamed from: j */
            public final CharSequence mo2865j() {
                return C0928g.this.f3050o;
            }

            /* renamed from: l */
            public final int mo2867l() {
                return C0928g.this.f3051p;
            }

            /* renamed from: m */
            public final boolean mo2868m() {
                return C0928g.this.f3052q;
            }

            /* renamed from: n */
            public final int mo2869n() {
                return C0928g.this.f3053r;
            }

            /* renamed from: p */
            public final int mo2871p() {
                return C0928g.this.f3054s;
            }

            /* renamed from: q */
            public final void mo2872q() throws RemoteException {
                m2609d(3);
            }

            /* renamed from: r */
            public final void mo2873r() throws RemoteException {
                m2609d(7);
            }

            /* renamed from: s */
            public final void mo2874s() throws RemoteException {
                m2609d(12);
            }

            /* renamed from: t */
            public final void mo2875t() throws RemoteException {
                m2609d(13);
            }

            /* renamed from: u */
            public final void mo2876u() throws RemoteException {
                m2609d(14);
            }

            /* renamed from: v */
            public final void mo2877v() throws RemoteException {
                m2609d(15);
            }

            /* renamed from: w */
            public final void mo2878w() throws RemoteException {
                m2609d(16);
            }

            /* renamed from: x */
            public final void mo2879x() throws RemoteException {
                m2609d(17);
            }

            /* renamed from: e */
            public final long mo2859e() {
                long j;
                synchronized (C0928g.this.f3040e) {
                    j = (long) C0928g.this.f3045j;
                }
                return j;
            }

            /* renamed from: i */
            public final List<QueueItem> mo2864i() {
                List<QueueItem> list;
                synchronized (C0928g.this.f3040e) {
                    list = C0928g.this.f3049n;
                }
                return list;
            }

            /* renamed from: k */
            public final Bundle mo2866k() {
                Bundle bundle;
                synchronized (C0928g.this.f3040e) {
                    bundle = C0928g.this.f3055t;
                }
                return bundle;
            }

            /* renamed from: d */
            public final PendingIntent mo2857d() {
                PendingIntent pendingIntent;
                synchronized (C0928g.this.f3040e) {
                    pendingIntent = C0928g.this.f3048m;
                }
                return pendingIntent;
            }

            /* renamed from: h */
            public final PlaybackStateCompat mo2863h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0928g.this.f3040e) {
                    playbackStateCompat = C0928g.this.f3047l;
                    mediaMetadataCompat = C0928g.this.f3046k;
                }
                return MediaSessionCompat.m2522a(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: f */
            public final ParcelableVolumeInfo mo2861f() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0928g.this.f3040e) {
                    i = C0928g.this.f3056u;
                    i2 = C0928g.this.f3057v;
                    C0897j jVar = C0928g.this.f3058w;
                    if (i == 2) {
                        int i6 = jVar.f2965a;
                        int i7 = jVar.f2966b;
                        i3 = jVar.f2967c;
                        i4 = i7;
                        i5 = i6;
                    } else {
                        i4 = C0928g.this.f3038c.getStreamMaxVolume(i2);
                        i3 = C0928g.this.f3038c.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, i5, i4, i3);
                return parcelableVolumeInfo;
            }

            C0931b() {
            }

            /* renamed from: a */
            public final void mo2831a(int i) {
                m2606a(28, i);
            }

            /* renamed from: d */
            private void m2609d(int i) {
                C0928g.this.mo2881a(i, 0, 0, null, null);
            }

            /* renamed from: b */
            public final void mo2846b(int i) throws RemoteException {
                m2606a(23, i);
            }

            /* renamed from: c */
            public final void mo2855c(int i) throws RemoteException {
                m2606a(30, i);
            }

            /* renamed from: b */
            public final void mo2848b(long j) throws RemoteException {
                m2607a(18, (Object) Long.valueOf(j));
            }

            /* renamed from: a */
            public final void mo2833a(long j) {
                m2607a(11, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public final void mo2850b(MediaDescriptionCompat mediaDescriptionCompat) {
                m2607a(27, (Object) mediaDescriptionCompat);
            }

            /* renamed from: b */
            public final void mo2851b(C0937a aVar) {
                C0928g.this.f3041f.unregister(aVar);
            }

            /* renamed from: a */
            public final void mo2835a(MediaDescriptionCompat mediaDescriptionCompat) {
                m2607a(25, (Object) mediaDescriptionCompat);
            }

            /* renamed from: d */
            public final void mo2858d(String str, Bundle bundle) throws RemoteException {
                m2608a(9, (Object) str, bundle);
            }

            /* renamed from: e */
            public final void mo2860e(String str, Bundle bundle) throws RemoteException {
                m2608a(20, (Object) str, bundle);
            }

            /* renamed from: a */
            private void m2606a(int i, int i2) {
                C0928g.this.mo2881a(i, i2, 0, null, null);
            }

            /* renamed from: a */
            private void m2607a(int i, Object obj) {
                C0928g.this.mo2881a(i, 0, 0, obj, null);
            }

            /* renamed from: c */
            public final void mo2856c(String str, Bundle bundle) throws RemoteException {
                m2608a(8, (Object) str, bundle);
            }

            /* renamed from: b */
            public final void mo2849b(Uri uri, Bundle bundle) throws RemoteException {
                m2608a(10, (Object) uri, bundle);
            }

            /* renamed from: a */
            public final void mo2834a(Uri uri, Bundle bundle) throws RemoteException {
                m2608a(6, (Object) uri, bundle);
            }

            /* renamed from: b */
            public final void mo2852b(String str, Bundle bundle) throws RemoteException {
                m2608a(5, (Object) str, bundle);
            }

            /* renamed from: a */
            public final void mo2836a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                C0928g.this.mo2881a(26, i, 0, mediaDescriptionCompat, null);
            }

            /* renamed from: b */
            public final void mo2847b(int i, int i2, String str) {
                C0928g.this.mo2882b(i, i2);
            }

            /* renamed from: a */
            private void m2608a(int i, Object obj, Bundle bundle) {
                C0928g.this.mo2881a(i, 0, 0, obj, bundle);
            }

            /* renamed from: a */
            public final void mo2832a(int i, int i2, String str) {
                C0928g.this.mo2880a(i, i2);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$c */
        class C0932c extends Handler {
            public final void handleMessage(Message message) {
                C0915a aVar = C0928g.this.f3044i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m2523a(data);
                    C0928g.this.mo2826a(new C0890a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    MediaSessionCompat.m2523a(data.getBundle("data_extras"));
                    try {
                        switch (message.what) {
                            case 1:
                                Object obj = message.obj;
                                break;
                            case 2:
                                C0928g.this.mo2880a(message.arg1, 0);
                                break;
                            case 3:
                            case 7:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                break;
                            case 4:
                                Object obj2 = message.obj;
                                break;
                            case 5:
                                Object obj3 = message.obj;
                                break;
                            case 6:
                                Object obj4 = message.obj;
                                break;
                            case 8:
                                Object obj5 = message.obj;
                                break;
                            case 9:
                                Object obj6 = message.obj;
                                break;
                            case 10:
                                Object obj7 = message.obj;
                                break;
                            case 11:
                                ((Long) message.obj).longValue();
                                break;
                            case 18:
                                ((Long) message.obj).longValue();
                                break;
                            case 19:
                                Object obj8 = message.obj;
                                break;
                            case 20:
                                Object obj9 = message.obj;
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.mo2818a(intent) && keyEvent != null) {
                                    if (keyEvent.getAction() == 0) {
                                        keyEvent.getKeyCode();
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            case 22:
                                C0928g.this.mo2882b(message.arg1, 0);
                                break;
                            case 23:
                                int i = message.arg1;
                                break;
                            case 25:
                                Object obj10 = message.obj;
                                break;
                            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                                Object obj11 = message.obj;
                                int i2 = message.arg1;
                                break;
                            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                                Object obj12 = message.obj;
                                break;
                            case 28:
                                if (C0928g.this.f3049n != null && message.arg1 >= 0 && message.arg1 < C0928g.this.f3049n.size()) {
                                    C0928g.this.f3049n.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                int i3 = message.arg1;
                                break;
                            case 31:
                                Object obj13 = message.obj;
                                break;
                        }
                    } finally {
                        C0928g.this.mo2826a((C0890a) null);
                    }
                }
            }

            public C0932c(Looper looper) {
                super(looper);
            }
        }

        /* renamed from: a */
        public final Token mo2824a() {
            return this.f3030B;
        }

        /* renamed from: a */
        public final void mo2825a(PendingIntent pendingIntent) {
        }

        /* renamed from: b */
        public final C0890a mo2828b() {
            C0890a aVar;
            synchronized (this.f3040e) {
                aVar = this.f3034F;
            }
            return aVar;
        }

        /* renamed from: a */
        public final void mo2826a(C0890a aVar) {
            synchronized (this.f3040e) {
                this.f3034F = aVar;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2880a(int i, int i2) {
            if (this.f3056u != 2) {
                this.f3038c.adjustStreamVolume(this.f3057v, i, i2);
            } else if (this.f3058w != null) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo2882b(int i, int i2) {
            if (this.f3056u != 2) {
                this.f3038c.setStreamVolume(this.f3057v, i, i2);
            } else if (this.f3058w != null) {
            }
        }

        /* renamed from: a */
        public void mo2827a(C0915a aVar, Handler handler) {
            this.f3044i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f3040e) {
                    if (this.f3031C != null) {
                        this.f3031C.removeCallbacksAndMessages(null);
                    }
                    this.f3031C = new C0932c(handler.getLooper());
                    this.f3044i.mo2817a(this, handler);
                }
            }
        }

        public C0928g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f3059x = context;
                this.f3036a = context.getPackageName();
                this.f3038c = (AudioManager) context.getSystemService("audio");
                this.f3037b = str;
                this.f3060y = componentName;
                this.f3061z = pendingIntent;
                this.f3029A = new C0931b();
                this.f3030B = new Token(this.f3029A);
                this.f3051p = 0;
                this.f3056u = 1;
                this.f3057v = 3;
                this.f3039d = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2881a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f3040e) {
                if (this.f3031C != null) {
                    Message obtainMessage = this.f3031C.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    /* renamed from: a */
    public final Token mo2800a() {
        return this.f2995c.mo2824a();
    }

    /* renamed from: a */
    private void m2524a(C0915a aVar) {
        m2525a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public static void m2523a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    private void m2525a(C0915a aVar, Handler handler) {
        if (aVar == null) {
            this.f2995c.mo2827a(null, null);
        } else {
            this.f2995c.mo2827a(aVar, new Handler());
        }
    }

    /* renamed from: a */
    static PlaybackStateCompat m2522a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        PlaybackStateCompat playbackStateCompat2 = playbackStateCompat;
        MediaMetadataCompat mediaMetadataCompat2 = mediaMetadataCompat;
        if (playbackStateCompat2 != null) {
            long j = -1;
            if (playbackStateCompat2.f3074b != -1) {
                if (playbackStateCompat2.f3073a == 3 || playbackStateCompat2.f3073a == 4 || playbackStateCompat2.f3073a == 5) {
                    long j2 = playbackStateCompat2.f3080h;
                    if (j2 > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j3 = ((long) (playbackStateCompat2.f3076d * ((float) (elapsedRealtime - j2)))) + playbackStateCompat2.f3074b;
                        if (mediaMetadataCompat2 != null) {
                            if (mediaMetadataCompat2.f2946b.containsKey("android.media.metadata.DURATION")) {
                                j = mediaMetadataCompat2.f2946b.getLong("android.media.metadata.DURATION", 0);
                            }
                        }
                        if (j >= 0 && j3 > j) {
                            j3 = j;
                        } else if (j3 < 0) {
                            j3 = 0;
                        }
                        C0936a aVar = new C0936a(playbackStateCompat2);
                        int i = playbackStateCompat2.f3073a;
                        float f = playbackStateCompat2.f3076d;
                        aVar.f3091b = i;
                        aVar.f3092c = j3;
                        aVar.f3098i = elapsedRealtime;
                        aVar.f3094e = f;
                        PlaybackStateCompat playbackStateCompat3 = new PlaybackStateCompat(aVar.f3091b, aVar.f3092c, aVar.f3093d, aVar.f3094e, aVar.f3095f, aVar.f3096g, aVar.f3097h, aVar.f3098i, aVar.f3090a, aVar.f3099j, aVar.f3100k);
                        return playbackStateCompat3;
                    }
                }
                return playbackStateCompat2;
            }
        }
        return playbackStateCompat2;
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, null, null, null);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f2996d = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
                    componentName = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                } else {
                    queryBroadcastReceivers.size();
                    componentName = null;
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            if (VERSION.SDK_INT >= 28) {
                this.f2995c = new C0927f(context, str, null);
                m2524a((C0915a) new C0915a() {
                });
                this.f2995c.mo2825a(pendingIntent);
            } else if (VERSION.SDK_INT >= 21) {
                this.f2995c = new C0925e(context, str, null);
                m2524a((C0915a) new C0915a() {
                });
                this.f2995c.mo2825a(pendingIntent);
            } else if (VERSION.SDK_INT >= 19) {
                this.f2995c = new C0923d(context, str, componentName, pendingIntent);
            } else if (VERSION.SDK_INT >= 18) {
                this.f2995c = new C0921c(context, str, componentName, pendingIntent);
            } else {
                this.f2995c = new C0928g(context, str, componentName, pendingIntent);
            }
            this.f2994a = new MediaControllerCompat(context, this);
            if (f2993b == 0) {
                f2993b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}

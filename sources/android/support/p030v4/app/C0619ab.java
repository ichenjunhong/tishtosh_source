package android.support.p030v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0610aa.C0611a;
import android.support.p030v4.app.C0610aa.C0614d;
import android.support.p030v4.app.C0610aa.C0618g;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.ab */
final class C0619ab implements C0702z {

    /* renamed from: a */
    private final Builder f2243a;

    /* renamed from: b */
    private final C0614d f2244b;

    /* renamed from: c */
    private RemoteViews f2245c;

    /* renamed from: d */
    private RemoteViews f2246d;

    /* renamed from: e */
    private final List<Bundle> f2247e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2248f = new Bundle();

    /* renamed from: g */
    private int f2249g;

    /* renamed from: h */
    private RemoteViews f2250h;

    /* renamed from: a */
    public final Builder mo2141a() {
        return this.f2243a;
    }

    /* renamed from: b */
    public final Notification mo2142b() {
        RemoteViews remoteViews;
        Notification notification;
        C0618g gVar = this.f2244b.f2216o;
        if (gVar != null) {
            gVar.mo2105a((C0702z) this);
        }
        if (gVar != null) {
            remoteViews = gVar.mo2139b(this);
        } else {
            remoteViews = null;
        }
        if (VERSION.SDK_INT >= 26) {
            notification = this.f2243a.build();
        } else if (VERSION.SDK_INT >= 24) {
            notification = this.f2243a.build();
            if (this.f2249g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 || this.f2249g != 2)) {
                    m1689a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 && this.f2249g == 1) {
                    m1689a(notification);
                }
            }
        } else if (VERSION.SDK_INT >= 21) {
            this.f2243a.setExtras(this.f2248f);
            notification = this.f2243a.build();
            if (this.f2245c != null) {
                notification.contentView = this.f2245c;
            }
            if (this.f2246d != null) {
                notification.bigContentView = this.f2246d;
            }
            if (this.f2250h != null) {
                notification.headsUpContentView = this.f2250h;
            }
            if (this.f2249g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 || this.f2249g != 2)) {
                    m1689a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 && this.f2249g == 1) {
                    m1689a(notification);
                }
            }
        } else if (VERSION.SDK_INT >= 20) {
            this.f2243a.setExtras(this.f2248f);
            notification = this.f2243a.build();
            if (this.f2245c != null) {
                notification.contentView = this.f2245c;
            }
            if (this.f2246d != null) {
                notification.bigContentView = this.f2246d;
            }
            if (this.f2249g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 || this.f2249g != 2)) {
                    m1689a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & UnReadVideoExperiment.LIKE_USER_LIST) == 0 && this.f2249g == 1) {
                    m1689a(notification);
                }
            }
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0620ac.m1694a(this.f2247e);
            if (a != null) {
                this.f2248f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2243a.setExtras(this.f2248f);
            notification = this.f2243a.build();
            if (this.f2245c != null) {
                notification.contentView = this.f2245c;
            }
            if (this.f2246d != null) {
                notification.bigContentView = this.f2246d;
            }
        } else if (VERSION.SDK_INT >= 16) {
            notification = this.f2243a.build();
            Bundle a2 = C0610aa.m1640a(notification);
            Bundle bundle = new Bundle(this.f2248f);
            for (String str : this.f2248f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0620ac.m1694a(this.f2247e);
            if (a3 != null) {
                C0610aa.m1640a(notification).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f2245c != null) {
                notification.contentView = this.f2245c;
            }
            if (this.f2246d != null) {
                notification.bigContentView = this.f2246d;
            }
        } else {
            notification = this.f2243a.getNotification();
        }
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        } else if (this.f2244b.f2192F != null) {
            notification.contentView = this.f2244b.f2192F;
        }
        if (VERSION.SDK_INT >= 16 && gVar != null) {
            RemoteViews c = gVar.mo2140c(this);
            if (c != null) {
                notification.bigContentView = c;
            }
        }
        if (VERSION.SDK_INT >= 16 && gVar != null) {
            Bundle a4 = C0610aa.m1640a(notification);
            if (a4 != null) {
                gVar.mo2136a(a4);
            }
        }
        return notification;
    }

    /* renamed from: a */
    private static void m1689a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m1690a(C0611a aVar) {
        Bundle bundle;
        if (VERSION.SDK_INT >= 20) {
            Action.Builder builder = new Action.Builder(aVar.f2180g, aVar.f2181h, aVar.f2182i);
            if (aVar.f2175b != null) {
                for (RemoteInput addRemoteInput : C0630ag.m1712a(aVar.f2175b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.f2174a != null) {
                bundle = new Bundle(aVar.f2174a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2177d);
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f2177d);
            }
            bundle.putInt("android.support.action.semanticAction", aVar.f2179f);
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.f2179f);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.f2178e);
            builder.addExtras(bundle);
            this.f2243a.addAction(builder.build());
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            List<Bundle> list = this.f2247e;
            this.f2243a.addAction(aVar.f2180g, aVar.f2181h, aVar.f2182i);
            Bundle bundle2 = new Bundle(aVar.f2174a);
            if (aVar.f2175b != null) {
                bundle2.putParcelableArray("android.support.remoteInputs", C0620ac.m1695a(aVar.f2175b));
            }
            if (aVar.f2176c != null) {
                bundle2.putParcelableArray("android.support.dataRemoteInputs", C0620ac.m1695a(aVar.f2176c));
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.f2177d);
            list.add(bundle2);
        }
    }

    C0619ab(C0614d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Bundle bundle;
        this.f2244b = dVar;
        if (VERSION.SDK_INT >= 26) {
            this.f2243a = new Builder(dVar.f2202a, dVar.f2195I);
        } else {
            this.f2243a = new Builder(dVar.f2202a);
        }
        Notification notification = dVar.f2200N;
        Builder lights = this.f2243a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f2209h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(dVar.f2205d).setContentText(dVar.f2206e).setContentInfo(dVar.f2211j).setContentIntent(dVar.f2207f).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = dVar.f2208g;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(dVar.f2210i).setNumber(dVar.f2212k).setProgress(dVar.f2219r, dVar.f2220s, dVar.f2221t);
        if (VERSION.SDK_INT < 21) {
            this.f2243a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f2243a.setSubText(dVar.f2217p).setUsesChronometer(dVar.f2215n).setPriority(dVar.f2213l);
            Iterator it = dVar.f2203b.iterator();
            while (it.hasNext()) {
                m1690a((C0611a) it.next());
            }
            if (dVar.f2188B != null) {
                this.f2248f.putAll(dVar.f2188B);
            }
            if (VERSION.SDK_INT < 20) {
                if (dVar.f2225x) {
                    this.f2248f.putBoolean("android.support.localOnly", true);
                }
                if (dVar.f2222u != null) {
                    this.f2248f.putString("android.support.groupKey", dVar.f2222u);
                    if (dVar.f2223v) {
                        this.f2248f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2248f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (dVar.f2224w != null) {
                    this.f2248f.putString("android.support.sortKey", dVar.f2224w);
                }
            }
            this.f2245c = dVar.f2192F;
            this.f2246d = dVar.f2193G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f2243a.setShowWhen(dVar.f2214m);
            if (VERSION.SDK_INT < 21 && dVar.f2201O != null && !dVar.f2201O.isEmpty()) {
                this.f2248f.putStringArray("android.people", (String[]) dVar.f2201O.toArray(new String[dVar.f2201O.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f2243a.setLocalOnly(dVar.f2225x).setGroup(dVar.f2222u).setGroupSummary(dVar.f2223v).setSortKey(dVar.f2224w);
            this.f2249g = dVar.f2199M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f2243a.setCategory(dVar.f2187A).setColor(dVar.f2189C).setVisibility(dVar.f2190D).setPublicVersion(dVar.f2191E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = dVar.f2201O.iterator();
            while (it2.hasNext()) {
                this.f2243a.addPerson((String) it2.next());
            }
            this.f2250h = dVar.f2194H;
            if (dVar.f2204c.size() > 0) {
                Bundle bundle2 = dVar.mo2110a().getBundle("android.car.EXTENSIONS");
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                Bundle bundle3 = new Bundle();
                for (int i = 0; i < dVar.f2204c.size(); i++) {
                    String num = Integer.toString(i);
                    C0611a aVar = (C0611a) dVar.f2204c.get(i);
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("icon", aVar.f2180g);
                    bundle4.putCharSequence("title", aVar.f2181h);
                    bundle4.putParcelable("actionIntent", aVar.f2182i);
                    if (aVar.f2174a != null) {
                        bundle = new Bundle(aVar.f2174a);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2177d);
                    bundle4.putBundle("extras", bundle);
                    bundle4.putParcelableArray("remoteInputs", C0620ac.m1695a(aVar.f2175b));
                    bundle4.putBoolean("showsUserInterface", aVar.f2178e);
                    bundle4.putInt("semanticAction", aVar.f2179f);
                    bundle3.putBundle(num, bundle4);
                }
                bundle2.putBundle("invisible_actions", bundle3);
                dVar.mo2110a().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2248f.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f2243a.setExtras(dVar.f2188B).setRemoteInputHistory(dVar.f2218q);
            if (dVar.f2192F != null) {
                this.f2243a.setCustomContentView(dVar.f2192F);
            }
            if (dVar.f2193G != null) {
                this.f2243a.setCustomBigContentView(dVar.f2193G);
            }
            if (dVar.f2194H != null) {
                this.f2243a.setCustomHeadsUpContentView(dVar.f2194H);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f2243a.setBadgeIconType(dVar.f2196J).setShortcutId(dVar.f2197K).setTimeoutAfter(dVar.f2198L).setGroupAlertBehavior(dVar.f2199M);
            if (dVar.f2227z) {
                this.f2243a.setColorized(dVar.f2226y);
            }
            if (!TextUtils.isEmpty(dVar.f2195I)) {
                this.f2243a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }
}

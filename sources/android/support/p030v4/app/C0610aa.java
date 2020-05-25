package android.support.p030v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.InboxStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0628af.C0629a;
import android.support.p030v4.p037e.C0761a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.aa */
public final class C0610aa {

    /* renamed from: android.support.v4.app.aa$a */
    public static class C0611a {

        /* renamed from: a */
        public final Bundle f2174a;

        /* renamed from: b */
        public final C0630ag[] f2175b;

        /* renamed from: c */
        public final C0630ag[] f2176c;

        /* renamed from: d */
        public boolean f2177d;

        /* renamed from: e */
        public boolean f2178e;

        /* renamed from: f */
        public final int f2179f;

        /* renamed from: g */
        public int f2180g;

        /* renamed from: h */
        public CharSequence f2181h;

        /* renamed from: i */
        public PendingIntent f2182i;

        public C0611a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true);
        }

        private C0611a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0630ag[] agVarArr, C0630ag[] agVarArr2, boolean z, int i2, boolean z2) {
            this.f2178e = true;
            this.f2180g = i;
            this.f2181h = C0614d.m1649e(charSequence);
            this.f2182i = pendingIntent;
            this.f2174a = bundle;
            this.f2175b = null;
            this.f2176c = null;
            this.f2177d = true;
            this.f2179f = 0;
            this.f2178e = true;
        }
    }

    /* renamed from: android.support.v4.app.aa$b */
    public static class C0612b extends C0618g {

        /* renamed from: a */
        public Bitmap f2183a;

        /* renamed from: b */
        private Bitmap f2184b;

        /* renamed from: c */
        private boolean f2185c;

        /* renamed from: a */
        public final C0612b mo2103a(Bitmap bitmap) {
            this.f2184b = bitmap;
            this.f2185c = true;
            return this;
        }

        /* renamed from: a */
        public final C0612b mo2104a(CharSequence charSequence) {
            this.f2240e = C0614d.m1649e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0612b mo2106b(CharSequence charSequence) {
            this.f2241f = C0614d.m1649e(charSequence);
            this.f2242g = true;
            return this;
        }

        /* renamed from: a */
        public final void mo2105a(C0702z zVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(zVar.mo2141a()).setBigContentTitle(this.f2240e).bigPicture(this.f2183a);
                if (this.f2185c) {
                    bigPicture.bigLargeIcon(this.f2184b);
                }
                if (this.f2242g) {
                    bigPicture.setSummaryText(this.f2241f);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.aa$c */
    public static class C0613c extends C0618g {

        /* renamed from: a */
        private CharSequence f2186a;

        /* renamed from: a */
        public final C0613c mo2107a(CharSequence charSequence) {
            this.f2240e = C0614d.m1649e(charSequence);
            return this;
        }

        /* renamed from: c */
        public final C0613c mo2109c(CharSequence charSequence) {
            this.f2186a = C0614d.m1649e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0613c mo2108b(CharSequence charSequence) {
            this.f2241f = C0614d.m1649e(charSequence);
            this.f2242g = true;
            return this;
        }

        /* renamed from: a */
        public final void mo2105a(C0702z zVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(zVar.mo2141a()).setBigContentTitle(this.f2240e).bigText(this.f2186a);
                if (this.f2242g) {
                    bigText.setSummaryText(this.f2241f);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.aa$d */
    public static class C0614d {

        /* renamed from: A */
        public String f2187A;

        /* renamed from: B */
        Bundle f2188B;

        /* renamed from: C */
        public int f2189C;

        /* renamed from: D */
        int f2190D;

        /* renamed from: E */
        Notification f2191E;

        /* renamed from: F */
        public RemoteViews f2192F;

        /* renamed from: G */
        public RemoteViews f2193G;

        /* renamed from: H */
        public RemoteViews f2194H;

        /* renamed from: I */
        String f2195I;

        /* renamed from: J */
        int f2196J;

        /* renamed from: K */
        String f2197K;

        /* renamed from: L */
        long f2198L;

        /* renamed from: M */
        int f2199M;

        /* renamed from: N */
        public Notification f2200N;

        /* renamed from: O */
        public ArrayList<String> f2201O;

        /* renamed from: a */
        public Context f2202a;

        /* renamed from: b */
        public ArrayList<C0611a> f2203b;

        /* renamed from: c */
        ArrayList<C0611a> f2204c;

        /* renamed from: d */
        CharSequence f2205d;

        /* renamed from: e */
        CharSequence f2206e;

        /* renamed from: f */
        PendingIntent f2207f;

        /* renamed from: g */
        public PendingIntent f2208g;

        /* renamed from: h */
        RemoteViews f2209h;

        /* renamed from: i */
        Bitmap f2210i;

        /* renamed from: j */
        CharSequence f2211j;

        /* renamed from: k */
        int f2212k;

        /* renamed from: l */
        public int f2213l;

        /* renamed from: m */
        boolean f2214m;

        /* renamed from: n */
        boolean f2215n;

        /* renamed from: o */
        C0618g f2216o;

        /* renamed from: p */
        CharSequence f2217p;

        /* renamed from: q */
        CharSequence[] f2218q;

        /* renamed from: r */
        int f2219r;

        /* renamed from: s */
        int f2220s;

        /* renamed from: t */
        boolean f2221t;

        /* renamed from: u */
        public String f2222u;

        /* renamed from: v */
        public boolean f2223v;

        /* renamed from: w */
        String f2224w;

        /* renamed from: x */
        public boolean f2225x;

        /* renamed from: y */
        boolean f2226y;

        /* renamed from: z */
        boolean f2227z;

        /* renamed from: a */
        public final C0614d mo2120a(boolean z) {
            mo2121a(2, true);
            return this;
        }

        /* renamed from: a */
        public void mo2121a(int i, boolean z) {
            if (z) {
                Notification notification = this.f2200N;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2200N;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: a */
        public final Bundle mo2110a() {
            if (this.f2188B == null) {
                this.f2188B = new Bundle();
            }
            return this.f2188B;
        }

        /* renamed from: b */
        public final Notification mo2122b() {
            return new C0619ab(this).mo2142b();
        }

        /* renamed from: c */
        public final long mo2127c() {
            if (this.f2214m) {
                return this.f2200N.when;
            }
            return 0;
        }

        /* renamed from: a */
        public final C0614d mo2114a(PendingIntent pendingIntent) {
            this.f2207f = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public final C0614d mo2128c(int i) {
            this.f2213l = i;
            return this;
        }

        /* renamed from: d */
        public final C0614d mo2130d(int i) {
            this.f2189C = i;
            return this;
        }

        /* renamed from: e */
        public final C0614d mo2132e(int i) {
            this.f2190D = i;
            return this;
        }

        public C0614d(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final C0614d mo2111a(int i) {
            this.f2200N.icon = i;
            return this;
        }

        /* renamed from: b */
        public final C0614d mo2124b(PendingIntent pendingIntent) {
            this.f2200N.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public final C0614d mo2129c(CharSequence charSequence) {
            this.f2211j = m1649e(charSequence);
            return this;
        }

        /* renamed from: d */
        public final C0614d mo2131d(CharSequence charSequence) {
            this.f2200N.tickerText = m1649e(charSequence);
            return this;
        }

        /* renamed from: e */
        protected static CharSequence m1649e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: b */
        public final C0614d mo2123b(int i) {
            this.f2200N.defaults = i;
            if ((i & 4) != 0) {
                this.f2200N.flags |= 1;
            }
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2113a(long j) {
            this.f2200N.when = j;
            return this;
        }

        /* renamed from: b */
        public final C0614d mo2125b(CharSequence charSequence) {
            this.f2206e = m1649e(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2115a(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.f2202a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.er);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.eq);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double d = (double) dimensionPixelSize;
                    double max = (double) Math.max(1, bitmap.getWidth());
                    Double.isNaN(d);
                    Double.isNaN(max);
                    double d2 = d / max;
                    double d3 = (double) dimensionPixelSize2;
                    double max2 = (double) Math.max(1, bitmap.getHeight());
                    Double.isNaN(d3);
                    Double.isNaN(max2);
                    double min = Math.min(d2, d3 / max2);
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    int ceil = (int) Math.ceil(width * min);
                    double height = (double) bitmap.getHeight();
                    Double.isNaN(height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
                }
            }
            this.f2210i = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C0614d mo2126b(boolean z) {
            mo2121a(16, z);
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2116a(Uri uri) {
            this.f2200N.sound = uri;
            this.f2200N.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f2200N.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2117a(C0618g gVar) {
            if (this.f2216o != gVar) {
                this.f2216o = gVar;
                if (this.f2216o != null) {
                    this.f2216o.mo2138a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2118a(CharSequence charSequence) {
            this.f2205d = m1649e(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C0614d mo2119a(String str) {
            this.f2195I = str;
            return this;
        }

        public C0614d(Context context, String str) {
            this.f2203b = new ArrayList<>();
            this.f2204c = new ArrayList<>();
            this.f2214m = true;
            this.f2225x = false;
            this.f2189C = 0;
            this.f2190D = 0;
            this.f2196J = 0;
            this.f2199M = 0;
            this.f2200N = new Notification();
            this.f2202a = context;
            this.f2195I = str;
            this.f2200N.when = System.currentTimeMillis();
            this.f2200N.audioStreamType = -1;
            this.f2213l = 0;
            this.f2201O = new ArrayList<>();
        }

        /* renamed from: a */
        public final C0614d mo2112a(int i, int i2, boolean z) {
            this.f2219r = 100;
            this.f2220s = i2;
            this.f2221t = false;
            return this;
        }
    }

    /* renamed from: android.support.v4.app.aa$e */
    public static class C0615e extends C0618g {

        /* renamed from: a */
        private ArrayList<CharSequence> f2228a = new ArrayList<>();

        /* renamed from: a */
        public final C0615e mo2133a(CharSequence charSequence) {
            this.f2240e = C0614d.m1649e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0615e mo2134b(CharSequence charSequence) {
            this.f2241f = C0614d.m1649e(charSequence);
            this.f2242g = true;
            return this;
        }

        /* renamed from: c */
        public final C0615e mo2135c(CharSequence charSequence) {
            this.f2228a.add(C0614d.m1649e(charSequence));
            return this;
        }

        /* renamed from: a */
        public final void mo2105a(C0702z zVar) {
            if (VERSION.SDK_INT >= 16) {
                InboxStyle bigContentTitle = new InboxStyle(zVar.mo2141a()).setBigContentTitle(this.f2240e);
                if (this.f2242g) {
                    bigContentTitle.setSummaryText(this.f2241f);
                }
                Iterator it = this.f2228a.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.aa$f */
    public static class C0616f extends C0618g {

        /* renamed from: a */
        public final List<C0617a> f2229a = new ArrayList();

        /* renamed from: b */
        public C0628af f2230b;

        /* renamed from: c */
        public CharSequence f2231c;

        /* renamed from: h */
        private Boolean f2232h;

        /* renamed from: android.support.v4.app.aa$f$a */
        public static final class C0617a {

            /* renamed from: a */
            public final CharSequence f2233a;

            /* renamed from: b */
            public final long f2234b;

            /* renamed from: c */
            public final C0628af f2235c;

            /* renamed from: d */
            public Bundle f2236d = new Bundle();

            /* renamed from: e */
            public String f2237e;

            /* renamed from: f */
            public Uri f2238f;

            public C0617a(CharSequence charSequence, long j, C0628af afVar) {
                this.f2233a = charSequence;
                this.f2234b = j;
                this.f2235c = afVar;
            }
        }

        private C0616f() {
        }

        /* renamed from: a */
        private C0617a m1677a() {
            for (int size = this.f2229a.size() - 1; size >= 0; size--) {
                C0617a aVar = (C0617a) this.f2229a.get(size);
                if (aVar.f2235c != null && !TextUtils.isEmpty(aVar.f2235c.f2281a)) {
                    return aVar;
                }
            }
            if (!this.f2229a.isEmpty()) {
                return (C0617a) this.f2229a.get(this.f2229a.size() - 1);
            }
            return null;
        }

        /* renamed from: b */
        private boolean m1680b() {
            for (int size = this.f2229a.size() - 1; size >= 0; size--) {
                C0617a aVar = (C0617a) this.f2229a.get(size);
                if (aVar.f2235c != null && aVar.f2235c.f2281a == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private static TextAppearanceSpan m1678a(int i) {
            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
            return textAppearanceSpan;
        }

        public C0616f(CharSequence charSequence) {
            this.f2230b = new C0629a().mo2155a(charSequence).mo2156a();
        }

        /* renamed from: a */
        private CharSequence m1679a(C0617a aVar) {
            boolean z;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            C0761a a = C0761a.m2155a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (VERSION.SDK_INT >= 21) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -16777216;
            } else {
                i = -1;
            }
            if (aVar.f2235c == null) {
                charSequence = "";
            } else {
                charSequence = aVar.f2235c.f2281a;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f2230b.f2281a;
                if (z && this.f2239d.f2189C != 0) {
                    i = this.f2239d.f2189C;
                }
            }
            CharSequence a2 = a.mo2426a(charSequence);
            spannableStringBuilder.append(a2);
            spannableStringBuilder.setSpan(m1678a(i), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), 33);
            if (aVar.f2233a == null) {
                charSequence2 = "";
            } else {
                charSequence2 = aVar.f2233a;
            }
            spannableStringBuilder.append("  ").append(a.mo2426a(charSequence2));
            return spannableStringBuilder;
        }

        /* renamed from: a */
        public final void mo2136a(Bundle bundle) {
            super.mo2136a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f2230b.f2281a);
            bundle.putBundle("android.messagingStyleUser", this.f2230b.mo2153a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f2231c);
            if (this.f2231c != null && this.f2232h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f2231c);
            }
            if (!this.f2229a.isEmpty()) {
                String str = "android.messages";
                List<C0617a> list = this.f2229a;
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C0617a aVar = (C0617a) list.get(i);
                    Bundle bundle2 = new Bundle();
                    if (aVar.f2233a != null) {
                        bundle2.putCharSequence("text", aVar.f2233a);
                    }
                    bundle2.putLong("time", aVar.f2234b);
                    if (aVar.f2235c != null) {
                        bundle2.putCharSequence("sender", aVar.f2235c.f2281a);
                        if (VERSION.SDK_INT >= 28) {
                            bundle2.putParcelable("sender_person", aVar.f2235c.mo2154b());
                        } else {
                            bundle2.putBundle("person", aVar.f2235c.mo2153a());
                        }
                    }
                    if (aVar.f2237e != null) {
                        bundle2.putString("type", aVar.f2237e);
                    }
                    if (aVar.f2238f != null) {
                        bundle2.putParcelable("uri", aVar.f2238f);
                    }
                    if (aVar.f2236d != null) {
                        bundle2.putBundle("extras", aVar.f2236d);
                    }
                    bundleArr[i] = bundle2;
                }
                bundle.putParcelableArray(str, bundleArr);
            }
            if (this.f2232h != null) {
                bundle.putBoolean("android.isGroupConversation", this.f2232h.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2105a(android.support.p030v4.app.C0702z r11) {
            /*
                r10 = this;
                android.support.v4.app.aa$d r0 = r10.f2239d
                r1 = 1
                r2 = 0
                r3 = 28
                if (r0 == 0) goto L_0x001e
                android.support.v4.app.aa$d r0 = r10.f2239d
                android.content.Context r0 = r0.f2202a
                android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
                int r0 = r0.targetSdkVersion
                if (r0 >= r3) goto L_0x001e
                java.lang.Boolean r0 = r10.f2232h
                if (r0 != 0) goto L_0x001e
                java.lang.CharSequence r0 = r10.f2231c
                if (r0 == 0) goto L_0x0029
                r0 = 1
                goto L_0x002a
            L_0x001e:
                java.lang.Boolean r0 = r10.f2232h
                if (r0 == 0) goto L_0x0029
                java.lang.Boolean r0 = r10.f2232h
                boolean r0 = r0.booleanValue()
                goto L_0x002a
            L_0x0029:
                r0 = 0
            L_0x002a:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r10.f2232h = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r4 = 24
                r5 = 0
                if (r0 < r4) goto L_0x00c2
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r3) goto L_0x0047
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                android.support.v4.app.af r1 = r10.f2230b
                android.app.Person r1 = r1.mo2154b()
                r0.<init>(r1)
                goto L_0x0050
            L_0x0047:
                android.app.Notification$MessagingStyle r0 = new android.app.Notification$MessagingStyle
                android.support.v4.app.af r1 = r10.f2230b
                java.lang.CharSequence r1 = r1.f2281a
                r0.<init>(r1)
            L_0x0050:
                java.lang.Boolean r1 = r10.f2232h
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x005c
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r3) goto L_0x0061
            L_0x005c:
                java.lang.CharSequence r1 = r10.f2231c
                r0.setConversationTitle(r1)
            L_0x0061:
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r3) goto L_0x006e
                java.lang.Boolean r1 = r10.f2232h
                boolean r1 = r1.booleanValue()
                r0.setGroupConversation(r1)
            L_0x006e:
                java.util.List<android.support.v4.app.aa$f$a> r1 = r10.f2229a
                java.util.Iterator r1 = r1.iterator()
            L_0x0074:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00ba
                java.lang.Object r2 = r1.next()
                android.support.v4.app.aa$f$a r2 = (android.support.p030v4.app.C0610aa.C0616f.C0617a) r2
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r3) goto L_0x0098
                android.support.v4.app.af r4 = r2.f2235c
                android.app.Notification$MessagingStyle$Message r6 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r7 = r2.f2233a
                long r8 = r2.f2234b
                if (r4 != 0) goto L_0x0090
                r4 = r5
                goto L_0x0094
            L_0x0090:
                android.app.Person r4 = r4.mo2154b()
            L_0x0094:
                r6.<init>(r7, r8, r4)
                goto L_0x00ab
            L_0x0098:
                android.support.v4.app.af r4 = r2.f2235c
                if (r4 == 0) goto L_0x00a1
                android.support.v4.app.af r4 = r2.f2235c
                java.lang.CharSequence r4 = r4.f2281a
                goto L_0x00a2
            L_0x00a1:
                r4 = r5
            L_0x00a2:
                android.app.Notification$MessagingStyle$Message r6 = new android.app.Notification$MessagingStyle$Message
                java.lang.CharSequence r7 = r2.f2233a
                long r8 = r2.f2234b
                r6.<init>(r7, r8, r4)
            L_0x00ab:
                java.lang.String r4 = r2.f2237e
                if (r4 == 0) goto L_0x00b6
                java.lang.String r4 = r2.f2237e
                android.net.Uri r2 = r2.f2238f
                r6.setData(r4, r2)
            L_0x00b6:
                r0.addMessage(r6)
                goto L_0x0074
            L_0x00ba:
                android.app.Notification$Builder r11 = r11.mo2141a()
                r0.setBuilder(r11)
                return
            L_0x00c2:
                android.support.v4.app.aa$f$a r0 = r10.m1677a()
                java.lang.CharSequence r3 = r10.f2231c
                if (r3 == 0) goto L_0x00dc
                java.lang.Boolean r3 = r10.f2232h
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x00dc
                android.app.Notification$Builder r3 = r11.mo2141a()
                java.lang.CharSequence r4 = r10.f2231c
                r3.setContentTitle(r4)
                goto L_0x00f6
            L_0x00dc:
                if (r0 == 0) goto L_0x00f6
                android.app.Notification$Builder r3 = r11.mo2141a()
                java.lang.String r4 = ""
                r3.setContentTitle(r4)
                android.support.v4.app.af r3 = r0.f2235c
                if (r3 == 0) goto L_0x00f6
                android.app.Notification$Builder r3 = r11.mo2141a()
                android.support.v4.app.af r4 = r0.f2235c
                java.lang.CharSequence r4 = r4.f2281a
                r3.setContentTitle(r4)
            L_0x00f6:
                if (r0 == 0) goto L_0x010a
                android.app.Notification$Builder r3 = r11.mo2141a()
                java.lang.CharSequence r4 = r10.f2231c
                if (r4 == 0) goto L_0x0105
                java.lang.CharSequence r0 = r10.m1679a(r0)
                goto L_0x0107
            L_0x0105:
                java.lang.CharSequence r0 = r0.f2233a
            L_0x0107:
                r3.setContentText(r0)
            L_0x010a:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 16
                if (r0 < r3) goto L_0x0161
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r3 = r10.f2231c
                if (r3 != 0) goto L_0x0122
                boolean r3 = r10.m1680b()
                if (r3 == 0) goto L_0x0120
                goto L_0x0122
            L_0x0120:
                r3 = 0
                goto L_0x0123
            L_0x0122:
                r3 = 1
            L_0x0123:
                java.util.List<android.support.v4.app.aa$f$a> r4 = r10.f2229a
                int r4 = r4.size()
                int r4 = r4 - r1
            L_0x012a:
                if (r4 < 0) goto L_0x0151
                java.util.List<android.support.v4.app.aa$f$a> r6 = r10.f2229a
                java.lang.Object r6 = r6.get(r4)
                android.support.v4.app.aa$f$a r6 = (android.support.p030v4.app.C0610aa.C0616f.C0617a) r6
                if (r3 == 0) goto L_0x013b
                java.lang.CharSequence r6 = r10.m1679a(r6)
                goto L_0x013d
            L_0x013b:
                java.lang.CharSequence r6 = r6.f2233a
            L_0x013d:
                java.util.List<android.support.v4.app.aa$f$a> r7 = r10.f2229a
                int r7 = r7.size()
                int r7 = r7 - r1
                if (r4 == r7) goto L_0x014b
                java.lang.String r7 = "\n"
                r0.insert(r2, r7)
            L_0x014b:
                r0.insert(r2, r6)
                int r4 = r4 + -1
                goto L_0x012a
            L_0x0151:
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r11 = r11.mo2141a()
                r1.<init>(r11)
                android.app.Notification$BigTextStyle r11 = r1.setBigContentTitle(r5)
                r11.bigText(r0)
            L_0x0161:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0610aa.C0616f.mo2105a(android.support.v4.app.z):void");
        }
    }

    /* renamed from: android.support.v4.app.aa$g */
    public static abstract class C0618g {

        /* renamed from: d */
        protected C0614d f2239d;

        /* renamed from: e */
        CharSequence f2240e;

        /* renamed from: f */
        CharSequence f2241f;

        /* renamed from: g */
        boolean f2242g;

        /* renamed from: a */
        public void mo2136a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2105a(C0702z zVar) {
        }

        /* renamed from: b */
        public RemoteViews mo2139b(C0702z zVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo2140c(C0702z zVar) {
            return null;
        }

        /* renamed from: a */
        public final void mo2138a(C0614d dVar) {
            if (this.f2239d != dVar) {
                this.f2239d = dVar;
                if (this.f2239d != null) {
                    this.f2239d.mo2117a(this);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0141  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0190  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.RemoteViews mo2137a(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                android.support.v4.app.aa$d r13 = r12.f2239d
                android.content.Context r13 = r13.f2202a
                android.content.res.Resources r13 = r13.getResources()
                android.widget.RemoteViews r6 = new android.widget.RemoteViews
                android.support.v4.app.aa$d r0 = r12.f2239d
                android.content.Context r0 = r0.f2202a
                java.lang.String r0 = r0.getPackageName()
                r6.<init>(r0, r14)
                android.support.v4.app.aa$d r14 = r12.f2239d
                int r14 = r14.f2213l
                r7 = 1
                r8 = 0
                r0 = -1
                if (r14 >= r0) goto L_0x0020
                r14 = 1
                goto L_0x0021
            L_0x0020:
                r14 = 0
            L_0x0021:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 21
                r2 = 2132019564(0x7f14096c, float:1.9677466E38)
                r9 = 16
                if (r0 < r9) goto L_0x0056
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 >= r1) goto L_0x0056
                r0 = 2132021332(0x7f141054, float:1.9681052E38)
                if (r14 == 0) goto L_0x0046
                java.lang.String r14 = "setBackgroundResource"
                r3 = 2131954716(0x7f130c1c, float:1.954594E38)
                r6.setInt(r0, r14, r3)
                java.lang.String r14 = "setBackgroundResource"
                r0 = 2131954723(0x7f130c23, float:1.9545953E38)
                r6.setInt(r2, r14, r0)
                goto L_0x0056
            L_0x0046:
                java.lang.String r14 = "setBackgroundResource"
                r3 = 2131954715(0x7f130c1b, float:1.9545937E38)
                r6.setInt(r0, r14, r3)
                java.lang.String r14 = "setBackgroundResource"
                r0 = 2131954722(0x7f130c22, float:1.9545951E38)
                r6.setInt(r2, r14, r0)
            L_0x0056:
                android.support.v4.app.aa$d r14 = r12.f2239d
                android.graphics.Bitmap r14 = r14.f2210i
                r10 = 8
                if (r14 == 0) goto L_0x0070
                int r14 = android.os.Build.VERSION.SDK_INT
                if (r14 < r9) goto L_0x006d
                r6.setViewVisibility(r2, r8)
                android.support.v4.app.aa$d r14 = r12.f2239d
                android.graphics.Bitmap r14 = r14.f2210i
                r6.setImageViewBitmap(r2, r14)
                goto L_0x0070
            L_0x006d:
                r6.setViewVisibility(r2, r10)
            L_0x0070:
                android.support.v4.app.aa$d r14 = r12.f2239d
                java.lang.CharSequence r14 = r14.f2205d
                if (r14 == 0) goto L_0x0080
                r14 = 2132023392(0x7f141860, float:1.968523E38)
                android.support.v4.app.aa$d r0 = r12.f2239d
                java.lang.CharSequence r0 = r0.f2205d
                r6.setTextViewText(r14, r0)
            L_0x0080:
                android.support.v4.app.aa$d r14 = r12.f2239d
                java.lang.CharSequence r14 = r14.f2206e
                r0 = 2132023286(0x7f1417f6, float:1.9685016E38)
                if (r14 == 0) goto L_0x0092
                android.support.v4.app.aa$d r14 = r12.f2239d
                java.lang.CharSequence r14 = r14.f2206e
                r6.setTextViewText(r0, r14)
                r14 = 1
                goto L_0x0093
            L_0x0092:
                r14 = 0
            L_0x0093:
                int r2 = android.os.Build.VERSION.SDK_INT
                if (r2 >= r1) goto L_0x009f
                android.support.v4.app.aa$d r1 = r12.f2239d
                android.graphics.Bitmap r1 = r1.f2210i
                if (r1 == 0) goto L_0x009f
                r1 = 1
                goto L_0x00a0
            L_0x009f:
                r1 = 0
            L_0x00a0:
                android.support.v4.app.aa$d r2 = r12.f2239d
                java.lang.CharSequence r2 = r2.f2211j
                r3 = 2132019707(0x7f1409fb, float:1.9677756E38)
                if (r2 == 0) goto L_0x00b6
                android.support.v4.app.aa$d r14 = r12.f2239d
                java.lang.CharSequence r14 = r14.f2211j
                r6.setTextViewText(r3, r14)
                r6.setViewVisibility(r3, r8)
            L_0x00b3:
                r14 = 1
                r11 = 1
                goto L_0x00ed
            L_0x00b6:
                android.support.v4.app.aa$d r2 = r12.f2239d
                int r2 = r2.f2212k
                if (r2 <= 0) goto L_0x00e8
                r14 = 2132082730(0x7f15002a, float:1.9805582E38)
                int r14 = r13.getInteger(r14)
                android.support.v4.app.aa$d r1 = r12.f2239d
                int r1 = r1.f2212k
                if (r1 <= r14) goto L_0x00d4
                r14 = 2132549465(0x7f1c1f59, float:2.0752233E38)
                java.lang.String r14 = r13.getString(r14)
                r6.setTextViewText(r3, r14)
                goto L_0x00e4
            L_0x00d4:
                java.text.NumberFormat r14 = java.text.NumberFormat.getIntegerInstance()
                android.support.v4.app.aa$d r1 = r12.f2239d
                int r1 = r1.f2212k
                long r1 = (long) r1
                java.lang.String r14 = r14.format(r1)
                r6.setTextViewText(r3, r14)
            L_0x00e4:
                r6.setViewVisibility(r3, r8)
                goto L_0x00b3
            L_0x00e8:
                r6.setViewVisibility(r3, r10)
                r11 = r14
                r14 = r1
            L_0x00ed:
                android.support.v4.app.aa$d r1 = r12.f2239d
                java.lang.CharSequence r1 = r1.f2217p
                if (r1 == 0) goto L_0x0116
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r9) goto L_0x0116
                android.support.v4.app.aa$d r1 = r12.f2239d
                java.lang.CharSequence r1 = r1.f2217p
                r6.setTextViewText(r0, r1)
                android.support.v4.app.aa$d r1 = r12.f2239d
                java.lang.CharSequence r1 = r1.f2206e
                r2 = 2132023288(0x7f1417f8, float:1.968502E38)
                if (r1 == 0) goto L_0x0113
                android.support.v4.app.aa$d r1 = r12.f2239d
                java.lang.CharSequence r1 = r1.f2206e
                r6.setTextViewText(r2, r1)
                r6.setViewVisibility(r2, r8)
                r1 = 1
                goto L_0x0117
            L_0x0113:
                r6.setViewVisibility(r2, r10)
            L_0x0116:
                r1 = 0
            L_0x0117:
                if (r1 == 0) goto L_0x0135
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 < r9) goto L_0x0135
                if (r15 == 0) goto L_0x012a
                r15 = 2131886628(0x7f120224, float:1.940784E38)
                int r13 = r13.getDimensionPixelSize(r15)
                float r13 = (float) r13
                r6.setTextViewTextSize(r0, r8, r13)
            L_0x012a:
                r1 = 2132020594(0x7f140d72, float:1.9679556E38)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r6
                r0.setViewPadding(r1, r2, r3, r4, r5)
            L_0x0135:
                android.support.v4.app.aa$d r13 = r12.f2239d
                long r0 = r13.mo2127c()
                r2 = 0
                int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r13 == 0) goto L_0x017e
                android.support.v4.app.aa$d r13 = r12.f2239d
                boolean r13 = r13.f2215n
                if (r13 == 0) goto L_0x016c
                int r13 = android.os.Build.VERSION.SDK_INT
                if (r13 < r9) goto L_0x016c
                r13 = 2132018038(0x7f140376, float:1.9674371E38)
                r6.setViewVisibility(r13, r8)
                java.lang.String r14 = "setBase"
                android.support.v4.app.aa$d r15 = r12.f2239d
                long r0 = r15.mo2127c()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                r6.setLong(r13, r14, r0)
                java.lang.String r14 = "setStarted"
                r6.setBoolean(r13, r14, r7)
                goto L_0x017d
            L_0x016c:
                r13 = 2132023369(0x7f141849, float:1.9685184E38)
                r6.setViewVisibility(r13, r8)
                java.lang.String r14 = "setTime"
                android.support.v4.app.aa$d r15 = r12.f2239d
                long r0 = r15.mo2127c()
                r6.setLong(r13, r14, r0)
            L_0x017d:
                r14 = 1
            L_0x017e:
                r13 = 2132022283(0x7f14140b, float:1.9682981E38)
                if (r14 == 0) goto L_0x0185
                r14 = 0
                goto L_0x0187
            L_0x0185:
                r14 = 8
            L_0x0187:
                r6.setViewVisibility(r13, r14)
                r13 = 2132020595(0x7f140d73, float:1.9679558E38)
                if (r11 == 0) goto L_0x0190
                goto L_0x0192
            L_0x0190:
                r8 = 8
            L_0x0192:
                r6.setViewVisibility(r13, r8)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.app.C0610aa.C0618g.mo2137a(boolean, int, boolean):android.widget.RemoteViews");
        }
    }

    /* renamed from: a */
    public static Bundle m1640a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return C0620ac.m1693a(notification);
        }
        return null;
    }
}

package android.support.p043v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.widget.C1113m;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.aw */
final class C1444aw extends C1113m implements OnClickListener {

    /* renamed from: l */
    public int f5191l = 1;

    /* renamed from: m */
    private final SearchManager f5192m = ((SearchManager) this.f3528d.getSystemService("search"));

    /* renamed from: n */
    private final SearchView f5193n;

    /* renamed from: o */
    private final SearchableInfo f5194o;

    /* renamed from: p */
    private final Context f5195p;

    /* renamed from: q */
    private final WeakHashMap<String, ConstantState> f5196q;

    /* renamed from: r */
    private final int f5197r;

    /* renamed from: s */
    private boolean f5198s = false;

    /* renamed from: t */
    private ColorStateList f5199t;

    /* renamed from: u */
    private int f5200u = -1;

    /* renamed from: v */
    private int f5201v = -1;

    /* renamed from: w */
    private int f5202w = -1;

    /* renamed from: x */
    private int f5203x = -1;

    /* renamed from: y */
    private int f5204y = -1;

    /* renamed from: z */
    private int f5205z = -1;

    /* renamed from: android.support.v7.widget.aw$a */
    static final class C1445a {

        /* renamed from: a */
        public final TextView f5206a;

        /* renamed from: b */
        public final TextView f5207b;

        /* renamed from: c */
        public final ImageView f5208c;

        /* renamed from: d */
        public final ImageView f5209d;

        /* renamed from: e */
        public final ImageView f5210e;

        public C1445a(View view) {
            this.f5206a = (TextView) view.findViewById(16908308);
            this.f5207b = (TextView) view.findViewById(16908309);
            this.f5208c = (ImageView) view.findViewById(16908295);
            this.f5209d = (ImageView) view.findViewById(16908296);
            this.f5210e = (ImageView) view.findViewById(R.id.a9m);
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c A[Catch:{ RuntimeException -> 0x0080 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo3532a(java.lang.CharSequence r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0005
            java.lang.String r11 = ""
            goto L_0x0009
        L_0x0005:
            java.lang.String r11 = r11.toString()
        L_0x0009:
            android.support.v7.widget.SearchView r0 = r10.f5193n
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0081
            android.support.v7.widget.SearchView r0 = r10.f5193n
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x001b
            goto L_0x0081
        L_0x001b:
            android.app.SearchableInfo r0 = r10.f5194o     // Catch:{ RuntimeException -> 0x0080 }
            if (r0 != 0) goto L_0x0021
        L_0x001f:
            r11 = r1
            goto L_0x007a
        L_0x0021:
            java.lang.String r2 = r0.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x0080 }
            if (r2 != 0) goto L_0x0028
            goto L_0x001f
        L_0x0028:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x0080 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)     // Catch:{ RuntimeException -> 0x0080 }
            android.net.Uri$Builder r2 = r3.authority(r2)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.query(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.fragment(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r3 = r0.getSuggestPath()     // Catch:{ RuntimeException -> 0x0080 }
            if (r3 == 0) goto L_0x004c
            r2.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x0080 }
        L_0x004c:
            java.lang.String r3 = "search_suggest_query"
            r2.appendPath(r3)     // Catch:{ RuntimeException -> 0x0080 }
            java.lang.String r7 = r0.getSuggestSelection()     // Catch:{ RuntimeException -> 0x0080 }
            if (r7 == 0) goto L_0x005f
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ RuntimeException -> 0x0080 }
            r3 = 0
            r0[r3] = r11     // Catch:{ RuntimeException -> 0x0080 }
            r8 = r0
            goto L_0x0063
        L_0x005f:
            r2.appendPath(r11)     // Catch:{ RuntimeException -> 0x0080 }
            r8 = r1
        L_0x0063:
            java.lang.String r11 = "limit"
            java.lang.String r0 = "50"
            r2.appendQueryParameter(r11, r0)     // Catch:{ RuntimeException -> 0x0080 }
            android.net.Uri r5 = r2.build()     // Catch:{ RuntimeException -> 0x0080 }
            android.content.Context r11 = r10.f3528d     // Catch:{ RuntimeException -> 0x0080 }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x0080 }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0080 }
        L_0x007a:
            if (r11 == 0) goto L_0x0080
            r11.getCount()     // Catch:{ RuntimeException -> 0x0080 }
            return r11
        L_0x0080:
            return r1
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1444aw.mo3532a(java.lang.CharSequence):android.database.Cursor");
    }

    /* renamed from: a */
    public final void mo3534a(Cursor cursor) {
        if (this.f5198s) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo3534a(cursor);
            if (cursor != null) {
                this.f5200u = cursor.getColumnIndex("suggest_text_1");
                this.f5201v = cursor.getColumnIndex("suggest_text_2");
                this.f5202w = cursor.getColumnIndex("suggest_text_2_url");
                this.f5203x = cursor.getColumnIndex("suggest_icon_1");
                this.f5204y = cursor.getColumnIndex("suggest_icon_2");
                this.f5205z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final View mo3533a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo3533a(context, cursor, viewGroup);
        a.setTag(new C1445a(a));
        ((ImageView) a.findViewById(R.id.a9m)).setImageResource(this.f5197r);
        return a;
    }

    /* renamed from: a */
    public final void mo3535a(View view, Context context, Cursor cursor) {
        Drawable drawable;
        Object obj;
        CharSequence charSequence;
        Cursor cursor2 = cursor;
        C1445a aVar = (C1445a) view.getTag();
        int i = this.f5205z != -1 ? cursor2.getInt(this.f5205z) : 0;
        if (aVar.f5206a != null) {
            m5013a(aVar.f5206a, (CharSequence) m5010a(cursor2, this.f5200u));
        }
        if (aVar.f5207b != null) {
            String a = m5010a(cursor2, this.f5202w);
            if (a != null) {
                if (this.f5199t == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f3528d.getTheme().resolveAttribute(R.attr.a69, typedValue, true);
                    this.f5199t = this.f3528d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a);
                TextAppearanceSpan textAppearanceSpan = r10;
                TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(null, 0, 0, this.f5199t, null);
                spannableString.setSpan(textAppearanceSpan, 0, a.length(), 33);
                charSequence = spannableString;
            } else {
                charSequence = m5010a(cursor2, this.f5201v);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (aVar.f5206a != null) {
                    aVar.f5206a.setSingleLine(false);
                    aVar.f5206a.setMaxLines(2);
                }
            } else if (aVar.f5206a != null) {
                aVar.f5206a.setSingleLine(true);
                aVar.f5206a.setMaxLines(1);
            }
            m5013a(aVar.f5207b, charSequence);
        }
        Drawable drawable2 = null;
        if (aVar.f5208c != null) {
            ImageView imageView = aVar.f5208c;
            if (this.f5203x == -1) {
                drawable = null;
            } else {
                drawable = m5009a(cursor2.getString(this.f5203x));
                if (drawable == null) {
                    ComponentName searchActivity = this.f5194o.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f5196q.containsKey(flattenToShortString)) {
                        ConstantState constantState = (ConstantState) this.f5196q.get(flattenToShortString);
                        if (constantState == null) {
                            drawable = null;
                        } else {
                            drawable = constantState.newDrawable(this.f5195p.getResources());
                        }
                    } else {
                        drawable = m5007a(searchActivity);
                        if (drawable == null) {
                            obj = null;
                        } else {
                            obj = drawable.getConstantState();
                        }
                        this.f5196q.put(flattenToShortString, obj);
                    }
                    if (drawable == null) {
                        drawable = this.f3528d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            m5012a(imageView, drawable, 4);
        }
        if (aVar.f5209d != null) {
            ImageView imageView2 = aVar.f5209d;
            if (this.f5204y != -1) {
                drawable2 = m5009a(cursor2.getString(this.f5204y));
            }
            m5012a(imageView2, drawable2, 8);
        }
        if (this.f5191l == 2 || (this.f5191l == 1 && (i & 1) != 0)) {
            aVar.f5210e.setVisibility(0);
            aVar.f5210e.setTag(aVar.f5206a.getText());
            aVar.f5210e.setOnClickListener(this);
            return;
        }
        aVar.f5210e.setVisibility(8);
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m5017c(mo3531a());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m5017c(mo3531a());
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5193n.setQuery((CharSequence) tag);
        }
    }

    /* renamed from: b */
    private Drawable m5016b(String str) {
        ConstantState constantState = (ConstantState) this.f5196q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: c */
    private static void m5017c(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null && !bundle.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    private Drawable m5007a(ComponentName componentName) {
        PackageManager packageManager = this.f3528d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                return null;
            }
            return drawable;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo3537b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m5011a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f5194o.shouldRewriteQueryFromData()) {
            String a2 = m5011a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f5194o.shouldRewriteQueryFromText()) {
            String a3 = m5011a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:18|19|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder("Resource does not exist: ");
        r2.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:4:0x000d=Splitter:B:4:0x000d, B:21:0x003e=Splitter:B:21:0x003e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5008a(android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0053 }
            if (r1 == 0) goto L_0x0026
            android.graphics.drawable.Drawable r1 = r4.m5015b(r5)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r3 = "Resource does not exist: "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r5 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x0026:
            android.content.Context r1 = r4.f5195p     // Catch:{ FileNotFoundException -> 0x0053 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0053 }
            java.io.InputStream r1 = r1.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            if (r1 == 0) goto L_0x003f
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            return r5
        L_0x003a:
            r5 = move-exception
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r5     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x003f:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r3 = "Failed to open "
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            java.lang.String r5 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0053 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0053 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0053 }
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1444aw.m5008a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private Drawable m5009a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.f5195p.getPackageName());
            sb.append("/");
            sb.append(parseInt);
            String sb2 = sb.toString();
            Drawable b = m5016b(sb2);
            if (b != null) {
                return b;
            }
            Drawable a = C0726c.m2091a(this.f5195p, parseInt);
            m5014a(sb2, a);
            return a;
        } catch (NumberFormatException unused) {
            Drawable b2 = m5016b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = m5008a(Uri.parse(str));
            m5014a(str, a2);
            return a2;
        } catch (NotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m5015b(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f3528d.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: a */
    private static String m5010a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m5011a(Cursor cursor, String str) {
        return m5010a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static void m5013a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m5014a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f5196q.put(str, drawable.getConstantState());
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View b = mo3536b(this.f3528d, this.f3527c, viewGroup);
            if (b != null) {
                ((C1445a) b.getTag()).f5206a.setText(e.toString());
            }
            return b;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View a = mo3533a(this.f3528d, this.f3527c, viewGroup);
            if (a != null) {
                ((C1445a) a.getTag()).f5206a.setText(e.toString());
            }
            return a;
        }
    }

    /* renamed from: a */
    private static void m5012a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public C1444aw(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f5193n = searchView;
        this.f5194o = searchableInfo;
        this.f5197r = searchView.getSuggestionCommitIconResId();
        this.f5195p = context;
        this.f5196q = weakHashMap;
    }
}

package android.support.p043v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.p030v4.p031a.p032a.C0576b;
import android.support.p030v4.view.C1019b;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1252k;
import android.support.p043v7.widget.C1518y;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.ss.android.ugc.trill.R;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.g */
public final class C1225g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f4038a;

    /* renamed from: b */
    static final Class<?>[] f4039b;

    /* renamed from: c */
    final Object[] f4040c;

    /* renamed from: d */
    final Object[] f4041d = this.f4040c;

    /* renamed from: e */
    Context f4042e;

    /* renamed from: f */
    Object f4043f;

    /* renamed from: android.support.v7.view.g$a */
    static class C1226a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f4044a = {MenuItem.class};

        /* renamed from: b */
        private Object f4045b;

        /* renamed from: c */
        private Method f4046c;

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4046c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4046c.invoke(this.f4045b, new Object[]{menuItem})).booleanValue();
                }
                this.f4046c.invoke(this.f4045b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public C1226a(Object obj, String str) {
            this.f4045b = obj;
            Class cls = obj.getClass();
            try {
                this.f4046c = cls.getMethod(str, f4044a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    class C1227b {

        /* renamed from: A */
        private String f4047A;

        /* renamed from: B */
        private String f4048B;

        /* renamed from: C */
        private CharSequence f4049C;

        /* renamed from: D */
        private CharSequence f4050D;

        /* renamed from: E */
        private ColorStateList f4051E;

        /* renamed from: F */
        private Mode f4052F;

        /* renamed from: a */
        public boolean f4053a;

        /* renamed from: b */
        C1019b f4054b;

        /* renamed from: d */
        private Menu f4056d;

        /* renamed from: e */
        private int f4057e;

        /* renamed from: f */
        private int f4058f;

        /* renamed from: g */
        private int f4059g;

        /* renamed from: h */
        private int f4060h;

        /* renamed from: i */
        private boolean f4061i;

        /* renamed from: j */
        private boolean f4062j;

        /* renamed from: k */
        private int f4063k;

        /* renamed from: l */
        private int f4064l;

        /* renamed from: m */
        private CharSequence f4065m;

        /* renamed from: n */
        private CharSequence f4066n;

        /* renamed from: o */
        private int f4067o;

        /* renamed from: p */
        private char f4068p;

        /* renamed from: q */
        private int f4069q;

        /* renamed from: r */
        private char f4070r;

        /* renamed from: s */
        private int f4071s;

        /* renamed from: t */
        private int f4072t;

        /* renamed from: u */
        private boolean f4073u;

        /* renamed from: v */
        private boolean f4074v;

        /* renamed from: w */
        private boolean f4075w;

        /* renamed from: x */
        private int f4076x;

        /* renamed from: y */
        private int f4077y;

        /* renamed from: z */
        private String f4078z;

        /* renamed from: b */
        public final void mo3969b() {
            this.f4053a = true;
            m3728a(this.f4056d.add(this.f4057e, this.f4063k, this.f4064l, this.f4065m));
        }

        /* renamed from: c */
        public final SubMenu mo3971c() {
            this.f4053a = true;
            SubMenu addSubMenu = this.f4056d.addSubMenu(this.f4057e, this.f4063k, this.f4064l, this.f4065m);
            m3728a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public final void mo3967a() {
            this.f4057e = 0;
            this.f4058f = 0;
            this.f4059g = 0;
            this.f4060h = 0;
            this.f4061i = true;
            this.f4062j = true;
        }

        /* renamed from: a */
        private static char m3726a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        public final void mo3968a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1225g.this.f4042e.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232});
            this.f4057e = obtainStyledAttributes.getResourceId(1, 0);
            this.f4058f = obtainStyledAttributes.getInt(3, 0);
            this.f4059g = obtainStyledAttributes.getInt(4, 0);
            this.f4060h = obtainStyledAttributes.getInt(5, 0);
            this.f4061i = obtainStyledAttributes.getBoolean(2, true);
            this.f4062j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m3728a(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f4073u).setVisible(this.f4074v).setEnabled(this.f4075w);
            boolean z2 = false;
            if (this.f4072t > 0) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f4066n).setIcon(this.f4067o);
            if (this.f4076x >= 0) {
                menuItem.setShowAsAction(this.f4076x);
            }
            if (this.f4048B != null) {
                if (!C1225g.this.f4042e.isRestricted()) {
                    C1225g gVar = C1225g.this;
                    if (gVar.f4043f == null) {
                        gVar.f4043f = gVar.mo3964a(gVar.f4042e);
                    }
                    menuItem.setOnMenuItemClickListener(new C1226a(gVar.f4043f, this.f4048B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f4072t >= 2) {
                if (menuItem instanceof C1250j) {
                    ((C1250j) menuItem).mo4163a(true);
                } else if (menuItem instanceof C1252k) {
                    C1252k kVar = (C1252k) menuItem;
                    try {
                        if (kVar.f4276e == null) {
                            kVar.f4276e = ((C0576b) kVar.f4157d).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        kVar.f4276e.invoke(kVar.f4157d, new Object[]{Boolean.valueOf(true)});
                    } catch (Exception unused) {
                    }
                }
            }
            if (this.f4078z != null) {
                menuItem.setActionView((View) m3727a(this.f4078z, C1225g.f4038a, C1225g.this.f4040c));
                z2 = true;
            }
            if (this.f4077y > 0 && !z2) {
                menuItem.setActionView(this.f4077y);
            }
            if (this.f4054b != null) {
                C1019b bVar = this.f4054b;
                if (menuItem instanceof C0576b) {
                    ((C0576b) menuItem).mo1776a(bVar);
                }
            }
            CharSequence charSequence = this.f4049C;
            boolean z3 = menuItem instanceof C0576b;
            if (z3) {
                ((C0576b) menuItem).mo1777a(charSequence);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f4050D;
            if (z3) {
                ((C0576b) menuItem).mo1779b(charSequence2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f4068p;
            int i = this.f4069q;
            if (z3) {
                ((C0576b) menuItem).setAlphabeticShortcut(c, i);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i);
            }
            char c2 = this.f4070r;
            int i2 = this.f4071s;
            if (z3) {
                ((C0576b) menuItem).setNumericShortcut(c2, i2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i2);
            }
            if (this.f4052F != null) {
                Mode mode = this.f4052F;
                if (z3) {
                    ((C0576b) menuItem).setIconTintMode(mode);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            if (this.f4051E != null) {
                ColorStateList colorStateList = this.f4051E;
                if (z3) {
                    ((C0576b) menuItem).setIconTintList(colorStateList);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        /* renamed from: b */
        public final void mo3970b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1225g.this.f4042e.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.n, R.attr.a5, R.attr.a6, R.attr.ar, R.attr.i2, R.attr.nu, R.attr.nv, R.attr.uv, R.attr.a1w, R.attr.a7d});
            this.f4063k = obtainStyledAttributes.getResourceId(2, 0);
            this.f4064l = (obtainStyledAttributes.getInt(5, this.f4058f) & -65536) | (obtainStyledAttributes.getInt(6, this.f4059g) & 65535);
            this.f4065m = obtainStyledAttributes.getText(7);
            this.f4066n = obtainStyledAttributes.getText(8);
            this.f4067o = obtainStyledAttributes.getResourceId(0, 0);
            this.f4068p = m3726a(obtainStyledAttributes.getString(9));
            this.f4069q = obtainStyledAttributes.getInt(16, 4096);
            this.f4070r = m3726a(obtainStyledAttributes.getString(10));
            this.f4071s = obtainStyledAttributes.getInt(20, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.f4072t = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.f4072t = this.f4060h;
            }
            this.f4073u = obtainStyledAttributes.getBoolean(3, false);
            this.f4074v = obtainStyledAttributes.getBoolean(4, this.f4061i);
            boolean z = true;
            this.f4075w = obtainStyledAttributes.getBoolean(1, this.f4062j);
            this.f4076x = obtainStyledAttributes.getInt(21, -1);
            this.f4048B = obtainStyledAttributes.getString(12);
            this.f4077y = obtainStyledAttributes.getResourceId(13, 0);
            this.f4078z = obtainStyledAttributes.getString(15);
            this.f4047A = obtainStyledAttributes.getString(14);
            if (this.f4047A == null) {
                z = false;
            }
            if (z && this.f4077y == 0 && this.f4078z == null) {
                this.f4054b = (C1019b) m3727a(this.f4047A, C1225g.f4039b, C1225g.this.f4041d);
            } else {
                this.f4054b = null;
            }
            this.f4049C = obtainStyledAttributes.getText(17);
            this.f4050D = obtainStyledAttributes.getText(22);
            if (obtainStyledAttributes.hasValue(19)) {
                this.f4052F = C1518y.m5425a(obtainStyledAttributes.getInt(19, -1), this.f4052F);
            } else {
                this.f4052F = null;
            }
            if (obtainStyledAttributes.hasValue(18)) {
                this.f4051E = obtainStyledAttributes.getColorStateList(18);
            } else {
                this.f4051E = null;
            }
            obtainStyledAttributes.recycle();
            this.f4053a = false;
        }

        public C1227b(Menu menu) {
            this.f4056d = menu;
            mo3967a();
        }

        /* renamed from: a */
        private <T> T m3727a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C1225g.this.f4042e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f4038a = clsArr;
        f4039b = clsArr;
    }

    public C1225g(Context context) {
        super(context);
        this.f4042e = context;
        this.f4040c = new Object[]{context};
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo3964a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.p030v4.p031a.p032a.C0575a
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f4042e     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            r2.m3724a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            if (r3 == 0) goto L_0x0020
            r3.close()
            return
        L_0x0020:
            return
        L_0x0021:
            r4 = move-exception
            r0 = r3
            goto L_0x003e
        L_0x0024:
            r4 = move-exception
            r0 = r3
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            r0 = r3
            goto L_0x0036
        L_0x002a:
            r4 = move-exception
            goto L_0x003e
        L_0x002c:
            r4 = move-exception
        L_0x002d:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.view.C1225g.inflate(int, android.view.Menu):void");
    }

    /* renamed from: a */
    private void m3724a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C1227b bVar = new C1227b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        break;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m3724a(xmlPullParser, attributeSet, bVar.mo3971c());
                                    break;
                                }
                            } else {
                                bVar.mo3970b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo3968a(attributeSet);
                            break;
                        }
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.f4053a) {
                                if (bVar.f4054b != null && bVar.f4054b.mo3200e()) {
                                    bVar.mo3971c();
                                    break;
                                } else {
                                    bVar.mo3969b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo3967a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }
}

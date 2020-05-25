package com.bytedance.android.livesdk.feed.p347o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Editable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.livesdk.feed.p347o.C7052g.C7053a;
import com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b;
import com.bytedance.android.livesdk.feed.p347o.C7052g.C7054b.C7060b;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.google.gson.C17979h;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.android.livesdk.feed.o.b */
public final class C7035b {

    /* renamed from: a */
    public static Object f19180a;

    /* renamed from: b */
    public static final List<String> f19181b = new ArrayList();

    /* renamed from: c */
    public static final C7036a f19182c = new C7036a(null);

    /* renamed from: com.bytedance.android.livesdk.feed.o.b$a */
    public static final class C7036a {

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$a$a */
        static final class C7037a<T> implements C17979h<DST> {

            /* renamed from: a */
            final /* synthetic */ Object f19183a;

            C7037a(Object obj) {
                this.f19183a = obj;
            }

            /* renamed from: a */
            public final DST mo13189a(Type type) {
                return this.f19183a;
            }
        }

        private C7036a() {
        }

        /* renamed from: a */
        public static Object m14682a() {
            return C7035b.f19180a;
        }

        /* renamed from: b */
        public static List<String> m14685b() {
            return C7035b.f19181b;
        }

        public /* synthetic */ C7036a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Object m14683a(Object obj, String str) {
            C52711k.m112240b(obj, "obj");
            C52711k.m112240b(str, "field");
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                C52711k.m112236a((Object) declaredField, "f");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static <DST, SRC> void m14684a(DST dst, SRC src) {
            if (dst != null && src != null) {
                Class cls = dst.getClass();
                C17971f d = new C17978g().mo34896a((Type) cls, (Object) new C7037a(dst)).mo34900d();
                d.mo34884a(d.mo34889b(src), cls);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.o.b$b */
    public static abstract class C7038b<SELF extends C7038b<? extends SELF>> {

        /* renamed from: a */
        public final PopupWindow f19184a = new PopupWindow(this.f19186c);

        /* renamed from: b */
        public final LinearLayout f19185b = new LinearLayout(this.f19186c);

        /* renamed from: c */
        public final Context f19186c;

        /* renamed from: d */
        private final int f19187d;

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$b$a */
        static final class C7039a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Button f19188a;

            /* renamed from: b */
            final /* synthetic */ C7038b f19189b;

            /* renamed from: c */
            final /* synthetic */ String f19190c;

            /* renamed from: d */
            final /* synthetic */ boolean f19191d;

            /* renamed from: e */
            final /* synthetic */ C52670a f19192e;

            C7039a(Button button, C7038b bVar, String str, boolean z, C52670a aVar) {
                this.f19188a = button;
                this.f19189b = bVar;
                this.f19190c = str;
                this.f19191d = z;
                this.f19192e = aVar;
            }

            public final void onClick(View view) {
                this.f19192e.invoke();
                C7049d.m14702a(this.f19189b.f19184a);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$b$b */
        static final class C7040b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ LinearLayout f19193a;

            /* renamed from: b */
            final /* synthetic */ int f19194b;

            /* renamed from: c */
            final /* synthetic */ C7038b f19195c;

            /* renamed from: d */
            final /* synthetic */ String f19196d;

            /* renamed from: e */
            final /* synthetic */ Object f19197e;

            /* renamed from: f */
            final /* synthetic */ C52670a f19198f;

            C7040b(LinearLayout linearLayout, int i, C7038b bVar, String str, Object obj, C52670a aVar) {
                this.f19193a = linearLayout;
                this.f19194b = i;
                this.f19195c = bVar;
                this.f19196d = str;
                this.f19197e = obj;
                this.f19198f = aVar;
            }

            public final void onClick(View view) {
                this.f19198f.invoke();
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$b$c */
        static final class C7041c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7038b f19199a;

            /* renamed from: b */
            final /* synthetic */ String f19200b;

            /* renamed from: c */
            final /* synthetic */ Object f19201c;

            /* renamed from: d */
            final /* synthetic */ C52670a f19202d;

            C7041c(C7038b bVar, String str, Object obj, C52670a aVar) {
                this.f19199a = bVar;
                this.f19200b = str;
                this.f19201c = obj;
                this.f19202d = aVar;
            }

            public final void onClick(View view) {
                C7038b bVar = this.f19199a;
                String obj = this.f19201c.toString();
                Object systemService = bVar.f19186c.getSystemService("clipboard");
                if (!(systemService instanceof ClipboardManager)) {
                    systemService = null;
                }
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                if (clipboardManager != null) {
                    CharSequence charSequence = obj;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
                }
                C7048c.m14701a(Toast.makeText(bVar.f19186c, "Copied to clipboard", 0));
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$b$d */
        static final class C7042d extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C7038b f19203a;

            /* renamed from: b */
            final /* synthetic */ String f19204b;

            C7042d(C7038b bVar, String str) {
                this.f19203a = bVar;
                this.f19204b = str;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C7036a.m14685b().remove(this.f19204b);
                C7050e.m14703a(this.f19203a.f19184a);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$b$e */
        static final class C7043e implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ EditText f19205a;

            /* renamed from: b */
            final /* synthetic */ C7038b f19206b;

            C7043e(EditText editText, C7038b bVar) {
                this.f19205a = editText;
                this.f19206b = bVar;
            }

            public final void onClick(View view) {
                Object obj;
                Editable text = this.f19205a.getText();
                Object obj2 = null;
                if (text != null) {
                    obj = text.toString();
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Iterator it = C7036a.m14685b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C52711k.m112239a((Object) (String) next, obj)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        C7036a.m14685b().add(obj);
                        C7051f.m14704a(this.f19206b.f19184a);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract SELF mo13192a();

        /* renamed from: b */
        public final SELF mo13196b() {
            LinearLayout linearLayout = new LinearLayout(this.f19186c);
            EditText editText = new EditText(this.f19186c);
            editText.setHint("ObjPath");
            editText.setMaxWidth(mo13190a(180.0f));
            editText.setMaxLines(3);
            linearLayout.addView(editText);
            Button button = new Button(this.f19186c);
            button.setText("Watch");
            button.setBackgroundResource(mo13191a(16843534));
            button.setTransformationMethod(null);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            button.setLayoutParams(layoutParams);
            button.setOnClickListener(new C7043e(editText, this));
            linearLayout.addView(button);
            m14689a((View) linearLayout);
            return mo13192a();
        }

        /* renamed from: a */
        private final void m14689a(View view) {
            this.f19185b.addView(view);
        }

        /* renamed from: a */
        public final int mo13190a(float f) {
            Resources resources = this.f19186c.getResources();
            C52711k.m112236a((Object) resources, "r");
            return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }

        /* renamed from: a */
        public final int mo13191a(int i) {
            TypedValue typedValue = new TypedValue();
            this.f19186c.getTheme().resolveAttribute(i, typedValue, true);
            int i2 = typedValue.data;
            return typedValue.resourceId;
        }

        public C7038b(Context context) {
            C52711k.m112240b(context, "ctx");
            this.f19186c = context;
            this.f19185b.setOrientation(1);
            this.f19185b.setBackgroundColor(Color.argb(210, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255));
            TypedArray obtainStyledAttributes = this.f19186c.getTheme().obtainStyledAttributes(new int[]{16842806});
            this.f19187d = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final SELF mo13193a(Object obj) {
            for (String str : C7036a.m14685b()) {
                mo13194a(null, obj, str, new C7042d(this, str));
            }
            return mo13192a();
        }

        /* renamed from: a */
        private SELF m14688a(String str, Object obj, C52670a<C52860x> aVar) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(obj, "value");
            LinearLayout linearLayout = new LinearLayout(this.f19186c);
            linearLayout.setOrientation(0);
            int a = mo13190a(5.0f);
            int a2 = mo13190a(10.0f);
            linearLayout.setPadding(a2, a, a2, a);
            TextView textView = new TextView(this.f19186c);
            textView.setText(str);
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setMaxWidth(mo13190a(120.0f));
            linearLayout.addView(textView);
            linearLayout.addView(new Space(this.f19186c), a2, -2);
            TextView textView2 = new TextView(this.f19186c);
            textView2.setText(obj.toString());
            textView2.setMaxLines(3);
            textView2.setMaxWidth(mo13190a(160.0f));
            linearLayout.addView(textView2);
            if (aVar != null) {
                linearLayout.addView(new Space(this.f19186c), a2, -2);
                TextView textView3 = new TextView(this.f19186c);
                textView3.setText("(×)");
                textView3.setTextColor(-65536);
                C7040b bVar = new C7040b(linearLayout, a2, this, str, obj, aVar);
                textView3.setOnClickListener(bVar);
                linearLayout.addView(textView3);
            }
            linearLayout.setOnClickListener(new C7041c(this, str, obj, aVar));
            m14689a((View) linearLayout);
            return mo13192a();
        }

        /* renamed from: a */
        public final SELF mo13195a(String str, boolean z, C52670a<C52860x> aVar) {
            C52711k.m112240b(str, "caption");
            Button button = new Button(this.f19186c);
            button.setText(str);
            button.setBackgroundResource(mo13191a(16843534));
            button.setTransformationMethod(null);
            button.setEnabled(z);
            if (aVar != null) {
                C7039a aVar2 = new C7039a(button, this, str, z, aVar);
                button.setOnClickListener(aVar2);
            }
            m14689a((View) button);
            return mo13192a();
        }

        /* renamed from: a */
        public final SELF mo13194a(String str, Object obj, String str2, C52670a<C52860x> aVar) {
            C52711k.m112240b(str2, "objPath");
            List<C7060b> list = new C7054b(str2).f19214a;
            Object a = new C7052g(obj).mo13204a(list);
            if (str == null) {
                C7060b bVar = (C7060b) C52575l.m112144h((List) list);
                if (bVar != null) {
                    str = bVar.f19224b;
                } else {
                    str = null;
                }
            }
            if (str == null) {
                str = "(null key)";
            }
            return m14688a(str, (Object) C7053a.m14709a(a), aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.o.b$c */
    public static final class C7044c extends C7038b<C7044c> {

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$c$a */
        static final class C7045a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ Object f19207a;

            C7045a(Object obj) {
                this.f19207a = obj;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                C7035b.f19180a = this.f19207a;
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.feed.o.b$c$b */
        static final class C7046b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C52671b f19208a;

            C7046b(C52671b bVar) {
                this.f19208a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object a = C7036a.m14682a();
                if (a != null) {
                    this.f19208a.invoke(a);
                }
                return C52860x.f131107a;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C7044c mo13192a() {
            return this;
        }

        public C7044c(Context context) {
            C52711k.m112240b(context, "ctx");
            super(context);
        }

        /* renamed from: a */
        public final C7044c mo13201a(C52671b<Object, C52860x> bVar) {
            boolean z;
            C52711k.m112240b(bVar, "doPaste");
            String str = "Paste item";
            if (C7036a.m14682a() != null) {
                z = true;
            } else {
                z = false;
            }
            mo13195a(str, z, (C52670a<C52860x>) new C7046b<C52860x>(bVar));
            return mo13192a();
        }

        /* renamed from: b */
        public final C7044c mo13202b(Object obj) {
            C52711k.m112240b(obj, "item");
            mo13195a("Copy item", true, (C52670a<C52860x>) new C7045a<C52860x>(obj));
            return mo13192a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.o.b$d */
    public static final class C7047d implements OnTouchListener {

        /* renamed from: a */
        public final C52670a<C52860x> f19209a;

        /* renamed from: b */
        private boolean f19210b;

        public C7047d(C52670a<C52860x> aVar) {
            C52711k.m112240b(aVar, "onTriggered");
            this.f19209a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112240b(view, "v");
            C52711k.m112240b(motionEvent, "event");
            switch (motionEvent.getActionMasked()) {
                case 0:
                    this.f19210b = false;
                    break;
                case 1:
                case 6:
                    return this.f19210b;
                case 5:
                    this.f19210b = true;
                    this.f19209a.invoke();
                    return true;
            }
            return false;
        }
    }
}

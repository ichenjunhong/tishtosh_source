package com.p2620vk.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.p2620vk.sdk.api.C52351b;
import com.p2620vk.sdk.api.C52354e;
import com.p2620vk.sdk.api.C52354e.C52359a;
import com.p2620vk.sdk.dialogs.C52424a;
import com.p2620vk.sdk.dialogs.C52430b;
import com.p2620vk.sdk.p2621a.C52324b;
import com.p2620vk.sdk.p2621a.C52325c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.VKServiceActivity */
public class VKServiceActivity extends Activity implements OnDismissListener {

    /* renamed from: com.vk.sdk.VKServiceActivity$a */
    public enum C52321a {
        Authorization(10485),
        Captcha(14079),
        Validation(11477);
        

        /* renamed from: a */
        private int f130296a;

        public final int getOuterCode() {
            return this.f130296a;
        }

        private C52321a(int i) {
            this.f130296a = i;
        }
    }

    /* renamed from: a */
    public final long mo109128a() {
        return getIntent().getLongExtra("arg3", 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("arg4", false)) {
            VKSdk.m111754a((Context) this, 0, (String) null);
        }
        VKSdk.m111762a(getApplicationContext());
        switch (C52321a.valueOf(getIntent().getStringExtra("arg1"))) {
            case Authorization:
                Context applicationContext = getApplicationContext();
                Bundle bundle2 = new Bundle();
                bundle2.putString(C42311c.f106863g, VKSdk.m111768c());
                bundle2.putInt("client_id", VKSdk.f130275a);
                boolean z = true;
                bundle2.putBoolean("revoke", true);
                bundle2.putString("scope", C52324b.m111789a((Collection<?>) getIntent().getStringArrayListExtra("arg2"), ","));
                String[] a = C52325c.m111795a(applicationContext, "com.vkontakte.android");
                if (C52325c.m111797b(applicationContext, "com.vkontakte.android")) {
                    PackageManager packageManager = applicationContext.getPackageManager();
                    Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH");
                    if (C52325c.f130306a || packageManager != null) {
                        if (packageManager.queryIntentActivities(intent, 65536).size() <= 0) {
                            z = false;
                        }
                        if (z && a.length > 0 && a[0].equals("48761EEF50EE53AFC4CC9C5F10E6BDE7F8F5B82F")) {
                            if (bundle == null) {
                                Intent intent2 = new Intent("com.vkontakte.android.action.SDK_AUTH", null);
                                intent2.setPackage("com.vkontakte.android");
                                intent2.putExtras(bundle2);
                                startActivityForResult(intent2, C52321a.Authorization.getOuterCode());
                                return;
                            }
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
                new C52430b().mo109423a(this, bundle2, C52321a.Authorization.getOuterCode(), null);
                return;
            case Captcha:
                C52351b bVar = (C52351b) C52420c.m111974a(mo109128a());
                if (bVar != null) {
                    C52424a aVar = new C52424a(bVar);
                    View inflate = View.inflate(this, R.layout.awk, null);
                    if (C52424a.f130764f || inflate != null) {
                        aVar.f130766b = (EditText) inflate.findViewById(R.id.ql);
                        aVar.f130767c = (ImageView) inflate.findViewById(R.id.ar6);
                        aVar.f130768d = (ProgressBar) inflate.findViewById(R.id.c63);
                        aVar.f130769e = getResources().getDisplayMetrics().density;
                        AlertDialog create = new Builder(this).setView(inflate).create();
                        aVar.f130766b.setOnFocusChangeListener(new OnFocusChangeListener(create) {

                            /* renamed from: a */
                            final /* synthetic */ AlertDialog f130770a;

                            {
                                this.f130770a = r2;
                            }

                            public final void onFocusChange(View view, boolean z) {
                                if (z) {
                                    this.f130770a.getWindow().setSoftInputMode(5);
                                }
                            }
                        });
                        aVar.f130766b.setOnEditorActionListener(new OnEditorActionListener(create) {

                            /* renamed from: a */
                            final /* synthetic */ AlertDialog f130772a;

                            {
                                this.f130772a = r2;
                            }

                            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                                if (i != 4) {
                                    return false;
                                }
                                C52424a.this.mo109415a();
                                this.f130772a.dismiss();
                                return true;
                            }
                        });
                        create.setButton(-2, getString(17039370), new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C52424a.this.mo109415a();
                                dialogInterface.dismiss();
                            }
                        });
                        create.setOnCancelListener(new OnCancelListener(create) {

                            /* renamed from: a */
                            final /* synthetic */ AlertDialog f130775a;

                            public final void onCancel(DialogInterface dialogInterface) {
                                this.f130775a.dismiss();
                                C52424a.this.f130765a.f130349e.mo109168d();
                            }

                            {
                                this.f130775a = r2;
                            }
                        });
                        create.setOnDismissListener(this);
                        aVar.mo109416b();
                        create.show();
                        return;
                    }
                    throw new AssertionError();
                }
                finish();
                return;
            case Validation:
                C52351b bVar2 = (C52351b) C52420c.m111974a(mo109128a());
                if (bVar2 == null) {
                    finish();
                    break;
                } else {
                    if (!TextUtils.isEmpty(bVar2.f130356l) && !bVar2.f130356l.contains("&ui=vk_sdk") && !bVar2.f130356l.contains("?ui=vk_sdk")) {
                        if (bVar2.f130356l.indexOf(63) > 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bVar2.f130356l);
                            sb.append("&ui=vk_sdk");
                            bVar2.f130356l = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(bVar2.f130356l);
                            sb2.append("?ui=vk_sdk");
                            bVar2.f130356l = sb2.toString();
                        }
                    }
                    new C52430b().mo109423a(this, new Bundle(), C52321a.Validation.getOuterCode(), bVar2);
                    return;
                }
        }
    }

    /* renamed from: a */
    public static Intent m111772a(Context context, C52321a aVar) {
        Intent intent = new Intent(context, VKServiceActivity.class);
        intent.putExtra("arg1", aVar.name());
        intent.putExtra("arg4", VKSdk.m111761a());
        return intent;
    }

    /* renamed from: a */
    public final void mo109129a(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public static void m111773a(Context context, C52351b bVar, C52321a aVar) {
        Intent a = m111772a(context, aVar);
        a.setFlags(268435456);
        a.putExtra("arg3", bVar.mo109409a());
        if (context != null) {
            context.startActivity(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Map map;
        C52317a aVar;
        if (i == C52321a.Authorization.getOuterCode() || i == C52321a.Validation.getOuterCode()) {
            C523191 r7 = new C52419b<C52322a>() {
                /* renamed from: a */
                public final /* synthetic */ void mo23369a(Object obj) {
                    C52322a aVar = (C52322a) obj;
                    VKServiceActivity.this.setResult(-1);
                    VKServiceActivity.this.finish();
                }

                /* renamed from: a */
                public final void mo23368a(C52351b bVar) {
                    C52420c a = C52420c.m111974a(VKServiceActivity.this.mo109128a());
                    if (a instanceof C52351b) {
                        C52351b bVar2 = (C52351b) a;
                        if (bVar2.f130349e != null) {
                            bVar2.f130349e.mo109168d();
                            if (bVar2.f130349e.f130364j != null) {
                                bVar2.f130349e.f130364j.mo109126a(bVar);
                            }
                        }
                    }
                    if (bVar != null) {
                        VKServiceActivity.this.setResult(0, VKServiceActivity.this.getIntent().putExtra("vk_extra_error_id", bVar.mo109409a()));
                    } else {
                        VKServiceActivity.this.setResult(0);
                    }
                    VKServiceActivity.this.finish();
                }
            };
            if (i2 != -1 || intent == null) {
                r7.mo23368a(new C52351b(-102));
                VKSdk.m111769c(this);
                return;
            }
            if (intent.hasExtra("extra-token-data")) {
                map = C52325c.m111793a(intent.getStringExtra("extra-token-data"));
            } else if (intent.getExtras() != null) {
                map = new HashMap();
                for (String str : intent.getExtras().keySet()) {
                    map.put(str, String.valueOf(intent.getExtras().get(str)));
                }
            } else {
                map = null;
            }
            if (!(map == null || VKSdk.f130276b == null)) {
                map.put("scope", TextUtils.join(",", VKSdk.f130276b));
            }
            C52322a a = C52322a.m111779a(map);
            if (a != null && a.f130298a != null) {
                C52322a b = C52322a.m111781b();
                if (b != null) {
                    C52322a a2 = b.mo109135a(a);
                    C52322a.m111778a((Context) this, b.mo109135a(a));
                    VKSdk.m111759a(b, a2);
                    aVar = new C52317a(b, a);
                } else {
                    C52322a.m111778a((Context) this, a);
                    VKSdk.m111759a(b, a);
                    aVar = new C52317a(a);
                }
            } else if (map == null || !map.containsKey("success")) {
                C52351b bVar = new C52351b(map);
                if (!(bVar.f130351g == null && bVar.f130352h == null)) {
                    bVar = new C52351b(-102);
                }
                aVar = new C52317a(bVar);
            } else {
                C52322a b2 = C52322a.m111781b();
                if (a == null) {
                    a = C52322a.m111781b();
                }
                aVar = new C52317a(b2, a);
            }
            if (aVar.f130291c != null) {
                r7.mo23368a(aVar.f130291c);
            } else if (aVar.f130289a != null) {
                if (aVar.f130290b != null) {
                    C52354e eVar = (C52354e) C52354e.m111974a(intent.getLongExtra("extra-validation-request", 0));
                    if (eVar != null) {
                        C52420c.f130758a.remove(Long.valueOf(eVar.f130759b));
                        eVar.f130759b = 0;
                        eVar.mo109167c();
                    }
                } else {
                    VKSdk.m111760a((C52359a) null);
                }
                r7.mo23369a(aVar.f130289a);
            }
            VKSdk.f130276b = null;
            VKSdk.m111769c(this);
        }
    }
}

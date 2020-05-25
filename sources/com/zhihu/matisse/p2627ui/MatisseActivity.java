package com.zhihu.matisse.p2627ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.content.FileProvider;
import android.support.p030v4.p040os.C0960b;
import android.support.p043v7.app.ActionBar;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.view.menu.C1268s;
import android.support.p043v7.widget.C1407ac;
import android.support.p043v7.widget.ListPopupWindow;
import android.support.p043v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.C2240a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2252b.C45340a;
import com.zhihu.matisse.internal.p2252b.C45340a.C45341a;
import com.zhihu.matisse.internal.p2252b.C45344c;
import com.zhihu.matisse.internal.p2253c.C45345a;
import com.zhihu.matisse.internal.p2253c.C45346b;
import com.zhihu.matisse.internal.p2253c.C45347c;
import com.zhihu.matisse.internal.p2254ui.AlbumPreviewActivity;
import com.zhihu.matisse.internal.p2254ui.C45358a;
import com.zhihu.matisse.internal.p2254ui.C45358a.C45359a;
import com.zhihu.matisse.internal.p2254ui.SelectedPreviewActivity;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a.C52528b;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a.C52530d;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52525a.C52531e;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52532b;
import com.zhihu.matisse.internal.p2254ui.widget.C52539a;
import com.zhihu.matisse.internal.p2254ui.widget.C52542b;
import com.zhihu.matisse.internal.p2254ui.widget.CheckRadioView;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.zhihu.matisse.ui.MatisseActivity */
public class MatisseActivity extends AppCompatActivity implements OnClickListener, OnItemSelectedListener, C45341a, C45359a, C52528b, C52530d, C52531e {

    /* renamed from: a */
    public final C45340a f130849a = new C45340a();

    /* renamed from: b */
    public C52539a f130850b;

    /* renamed from: c */
    private C45345a f130851c;

    /* renamed from: d */
    private C45344c f130852d = new C45344c(this);

    /* renamed from: e */
    private C45353c f130853e;

    /* renamed from: f */
    private C52532b f130854f;

    /* renamed from: g */
    private TextView f130855g;

    /* renamed from: h */
    private TextView f130856h;

    /* renamed from: i */
    private View f130857i;

    /* renamed from: j */
    private View f130858j;

    /* renamed from: k */
    private LinearLayout f130859k;

    /* renamed from: l */
    private CheckRadioView f130860l;

    /* renamed from: m */
    private boolean f130861m;

    /* renamed from: c */
    public final C45344c mo91686c() {
        return this.f130852d;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: a */
    public final void mo91635a() {
        this.f130854f.swapCursor(null);
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    /* renamed from: b */
    public final void mo91685b() {
        m112030e();
        if (this.f130853e.f114680q != null) {
            this.f130852d.mo91648c();
            this.f130852d.mo91651d();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C45340a aVar = this.f130849a;
        if (aVar.f114632b != null) {
            aVar.f114632b.mo2083a(1);
        }
        aVar.f114633c = null;
        this.f130853e.f114684u = null;
        this.f130853e.f114680q = null;
    }

    /* renamed from: g */
    private int m112032g() {
        int f = this.f130852d.mo91654f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            Item item = (Item) this.f130852d.mo91645b().get(i2);
            if (item.mo91663a() && C45347c.m98877a(item.f114656d) > ((float) this.f130853e.f114683t)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private void m112030e() {
        int f = this.f130852d.mo91654f();
        if (f == 0) {
            this.f130855g.setEnabled(false);
            this.f130856h.setEnabled(false);
            this.f130856h.setText(getString(R.string.c4s));
        } else if (f != 1 || !this.f130853e.mo91672b()) {
            this.f130855g.setEnabled(true);
            this.f130856h.setEnabled(true);
            this.f130856h.setText(getString(R.string.c4r, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f130855g.setEnabled(true);
            this.f130856h.setText(R.string.c4s);
            this.f130856h.setEnabled(true);
        }
        if (this.f130853e.f114681r) {
            this.f130859k.setVisibility(0);
            m112031f();
            return;
        }
        this.f130859k.setVisibility(4);
    }

    /* renamed from: f */
    private void m112031f() {
        this.f130860l.setChecked(this.f130861m);
        if (m112032g() > 0 && this.f130861m) {
            C52542b.m112029a("", getString(R.string.c4z, new Object[]{Integer.valueOf(this.f130853e.f114683t)})).show(getSupportFragmentManager(), C52542b.class.getName());
            this.f130860l.setChecked(false);
            this.f130861m = false;
        }
    }

    /* renamed from: d */
    public final void mo110062d() {
        File file;
        if (this.f130851c != null) {
            C45345a aVar = this.f130851c;
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent.resolveActivity(getPackageManager()) != null) {
                File file2 = null;
                try {
                    String a = C2240a.m6772a("JPEG_%s.jpg", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())});
                    if (aVar.f114644c.f114658a) {
                        file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } else {
                        file = ((Activity) aVar.f114642a.get()).getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                    }
                    if (aVar.f114644c.f114660c != null) {
                        file = new File(file, aVar.f114644c.f114660c);
                    }
                    File file3 = new File(file, a);
                    if ("mounted".equals(C0960b.m2807a(file3))) {
                        file2 = file3;
                    }
                } catch (IOException unused) {
                }
                if (file2 != null) {
                    aVar.f114646e = file2.getAbsolutePath();
                    aVar.f114645d = FileProvider.getUriForFile((Context) aVar.f114642a.get(), aVar.f114644c.f114659b, file2);
                    intent.putExtra("output", aVar.f114645d);
                    intent.addFlags(2);
                    if (VERSION.SDK_INT < 21) {
                        for (ResolveInfo resolveInfo : getPackageManager().queryIntentActivities(intent, 65536)) {
                            grantUriPermission(resolveInfo.activityInfo.packageName, aVar.f114645d, 3);
                        }
                    }
                    if (aVar.f114643b != null) {
                        ((Fragment) aVar.f114643b.get()).startActivityForResult(intent, 24);
                        return;
                    }
                    ((Activity) aVar.f114642a.get()).startActivityForResult(intent, 24);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b = C33102c.m76095b(context);
        C27548d.m66217a(b);
        super.attachBaseContext(b);
    }

    /* renamed from: a */
    public final void mo91636a(final Cursor cursor) {
        this.f130854f.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                if (!cursor.isClosed()) {
                    cursor.moveToPosition(MatisseActivity.this.f130849a.f114634d);
                    C52539a aVar = MatisseActivity.this.f130850b;
                    MatisseActivity matisseActivity = MatisseActivity.this;
                    int i = MatisseActivity.this.f130849a.f114634d;
                    aVar.f130841c.mo4779e(i);
                    aVar.mo110089a(matisseActivity, i);
                    Album a = Album.m98883a(cursor);
                    if (a.mo91657b() && C45353c.m98893a().f114674k) {
                        a.mo91656a();
                    }
                    MatisseActivity.this.mo110093a(a);
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f130852d.mo91646b(bundle);
        bundle.putInt("state_current_selection", this.f130849a.f114634d);
        bundle.putBoolean("checkState", this.f130861m);
    }

    /* renamed from: a */
    public final void mo110093a(Album album) {
        if (!album.mo91657b() || !album.mo91658c()) {
            this.f130857i.setVisibility(0);
            this.f130858j.setVisibility(8);
            getSupportFragmentManager().mo2225a().mo2192b(R.id.yw, C45358a.m98907a(album), C45358a.class.getSimpleName()).mo2195c();
            return;
        }
        this.f130857i.setVisibility(8);
        this.f130858j.setVisibility(0);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.q2) {
            Intent intent = new Intent(this, SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.f130852d.mo91642a());
            intent.putExtra("extra_result_original_enable", this.f130861m);
            startActivityForResult(intent, 23);
        } else if (view.getId() == R.id.py) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.f130852d.mo91648c());
            intent2.putStringArrayListExtra("extra_result_selection_path", (ArrayList) this.f130852d.mo91651d());
            intent2.putExtra("extra_result_original_enable", this.f130861m);
            setResult(-1, intent2);
            finish();
        } else {
            if (view.getId() == R.id.bvh) {
                int g = m112032g();
                if (g > 0) {
                    C52542b.m112029a("", getString(R.string.c4y, new Object[]{Integer.valueOf(g), Integer.valueOf(this.f130853e.f114683t)})).show(getSupportFragmentManager(), C52542b.class.getName());
                    return;
                }
                this.f130861m = !this.f130861m;
                this.f130860l.setChecked(this.f130861m);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        this.f130853e = C45353c.m98893a();
        setTheme(this.f130853e.f114667d);
        super.onCreate(bundle);
        if (!this.f130853e.f114679p) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.cm);
        if (this.f130853e.mo91673c()) {
            setRequestedOrientation(this.f130853e.f114668e);
        }
        if (this.f130853e.f114674k) {
            this.f130851c = new C45345a(this);
            if (this.f130853e.f114675l != null) {
                this.f130851c.f114644c = this.f130853e.f114675l;
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.d22);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.mo3593b(false);
        supportActionBar.mo3589a(true);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{R.attr.af});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        navigationIcon.setColorFilter(color, Mode.SRC_IN);
        this.f130855g = (TextView) findViewById(R.id.q2);
        this.f130856h = (TextView) findViewById(R.id.py);
        this.f130855g.setOnClickListener(this);
        this.f130856h.setOnClickListener(this);
        this.f130857i = findViewById(R.id.yw);
        this.f130858j = findViewById(R.id.aa_);
        this.f130859k = (LinearLayout) findViewById(R.id.bvh);
        this.f130860l = (CheckRadioView) findViewById(R.id.bvg);
        this.f130859k.setOnClickListener(this);
        this.f130852d.mo91643a(bundle);
        if (bundle != null) {
            this.f130861m = bundle.getBoolean("checkState");
        }
        m112030e();
        this.f130854f = new C52532b(this, null, false);
        this.f130850b = new C52539a(this);
        this.f130850b.f130842d = this;
        C52539a aVar = this.f130850b;
        aVar.f130840b = (TextView) findViewById(R.id.ckr);
        Drawable drawable = aVar.f130840b.getCompoundDrawables()[2];
        TypedArray obtainStyledAttributes2 = aVar.f130840b.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.af});
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        drawable.setColorFilter(color2, Mode.SRC_IN);
        aVar.f130840b.setVisibility(8);
        aVar.f130840b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                int i;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.bn);
                ListPopupWindow listPopupWindow = C52539a.this.f130841c;
                if (C52539a.this.f130839a.getCount() > 6) {
                    i = dimensionPixelSize * 6;
                } else {
                    i = dimensionPixelSize * C52539a.this.f130839a.getCount();
                }
                listPopupWindow.mo4777c(i);
                C52539a.this.f130841c.mo4075d();
            }
        });
        aVar.f130840b.setOnTouchListener(new C1407ac(aVar.f130840b) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C1268s mo4009a() {
                return ListPopupWindow.this;
            }
        });
        this.f130850b.f130841c.f4612o = findViewById(R.id.d22);
        C52539a aVar2 = this.f130850b;
        C52532b bVar = this.f130854f;
        aVar2.f130841c.mo4588a((ListAdapter) bVar);
        aVar2.f130839a = bVar;
        C45340a aVar3 = this.f130849a;
        aVar3.f114631a = new WeakReference<>(this);
        aVar3.f114632b = getSupportLoaderManager();
        aVar3.f114633c = this;
        C45340a aVar4 = this.f130849a;
        if (bundle != null) {
            aVar4.f114634d = bundle.getInt("state_current_selection");
        }
        C45340a aVar5 = this.f130849a;
        aVar5.f114632b.mo2081a(1, null, aVar5);
    }

    /* renamed from: a */
    public final void mo91684a(Album album, Item item, int i) {
        Intent intent = new Intent(this, AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.f130852d.mo91642a());
        intent.putExtra("extra_result_original_enable", this.f130861m);
        startActivityForResult(intent, 23);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 23) {
                Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
                ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
                this.f130861m = intent.getBooleanExtra("extra_result_original_enable", false);
                int i3 = bundleExtra.getInt("state_collection_type", 0);
                if (intent.getBooleanExtra("extra_result_apply", false)) {
                    Intent intent2 = new Intent();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (parcelableArrayList != null) {
                        Iterator it = parcelableArrayList.iterator();
                        while (it.hasNext()) {
                            Item item = (Item) it.next();
                            arrayList.add(item.f114655c);
                            arrayList2.add(C45346b.m98872a(this, item.f114655c));
                        }
                    }
                    intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
                    intent2.putStringArrayListExtra("extra_result_selection_path", arrayList2);
                    intent2.putExtra("extra_result_original_enable", this.f130861m);
                    setResult(-1, intent2);
                    finish();
                } else {
                    C45344c cVar = this.f130852d;
                    if (parcelableArrayList.size() == 0) {
                        cVar.f114640b = 0;
                    } else {
                        cVar.f114640b = i3;
                    }
                    cVar.f114639a.clear();
                    cVar.f114639a.addAll(parcelableArrayList);
                    Fragment a = getSupportFragmentManager().mo2224a(C45358a.class.getSimpleName());
                    if (a instanceof C45358a) {
                        ((C45358a) a).f114705a.notifyDataSetChanged();
                    }
                    m112030e();
                }
            } else if (i == 24) {
                Uri uri = this.f130851c.f114645d;
                String str = this.f130851c.f114646e;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(uri);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(str);
                Intent intent3 = new Intent();
                intent3.putParcelableArrayListExtra("extra_result_selection", arrayList3);
                intent3.putStringArrayListExtra("extra_result_selection_path", arrayList4);
                setResult(-1, intent3);
                if (VERSION.SDK_INT < 21) {
                    revokeUriPermission(uri, 3);
                }
                finish();
            }
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f130849a.f114634d = i;
        this.f130854f.getCursor().moveToPosition(i);
        Album a = Album.m98883a(this.f130854f.getCursor());
        if (a.mo91657b() && C45353c.m98893a().f114674k) {
            a.mo91656a();
        }
        mo110093a(a);
    }
}

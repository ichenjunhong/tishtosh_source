package android.support.p043v7.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0634aj;
import android.support.p030v4.app.C0634aj.C0635a;
import android.support.p030v4.app.C0701y;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.app.C1158a.C1159a;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.support.p043v7.widget.C1460bg;
import android.support.p043v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.p683ss.android.ugc.aweme.setting.TiktokSkinHelper;

/* renamed from: android.support.v7.app.AppCompatActivity */
public class AppCompatActivity extends FragmentActivity implements C0635a, C1162c {
    private C1163d mDelegate;
    private Resources mResources;
    private int mThemeId;

    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onPrepareSupportNavigateUpTaskStack(C0634aj ajVar) {
    }

    public void onSupportActionModeFinished(C1218b bVar) {
    }

    public void onSupportActionModeStarted(C1218b bVar) {
    }

    public void onSupportContentChanged() {
    }

    public C1218b onWindowStartingSupportActionMode(C1219a aVar) {
        return null;
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public Resources getResources() {
        Resources resources$___twin___ = getResources$___twin___();
        TiktokSkinHelper.m91332a(resources$___twin___);
        return resources$___twin___;
    }

    public Intent getSupportParentActivityIntent() {
        return C0701y.m2029a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo3686f();
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().mo3686f();
    }

    public C1159a getDrawerToggleDelegate() {
        return getDelegate().mo3690h();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo3674b();
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo3659a();
    }

    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo3689g();
    }

    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo3684e();
    }

    public void onStart() {
        super.onStart();
        getDelegate().mo3679c();
    }

    public void onStop() {
        super.onStop();
        getDelegate().mo3682d();
    }

    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo3597d()) {
            super.closeOptionsMenu();
        }
    }

    public C1163d getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new AppCompatDelegateImpl(this, getWindow(), this);
        }
        return this.mDelegate;
    }

    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo3595c()) {
            super.openOptionsMenu();
        }
    }

    public Resources getResources$___twin___() {
        if (this.mResources == null && C1460bg.m5100a()) {
            this.mResources = new C1460bg(this, super.getResources());
        }
        if (this.mResources == null) {
            return super.getResources();
        }
        return this.mResources;
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0634aj ajVar = new C0634aj(this);
            onCreateSupportNavigateUpTaskStack(ajVar);
            onPrepareSupportNavigateUpTaskStack(ajVar);
            if (!ajVar.f2300a.isEmpty()) {
                Intent[] intentArr = (Intent[]) ajVar.f2300a.toArray(new Intent[ajVar.f2300a.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                C0726c.m2095a(ajVar.f2301b, intentArr, (Bundle) null);
                try {
                    if (VERSION.SDK_INT >= 16) {
                        finishAffinity();
                    } else {
                        finish();
                    }
                } catch (IllegalStateException unused) {
                    finish();
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
        }
        return true;
    }

    public void setContentView(int i) {
        getDelegate().mo3675b(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo3668a(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    public <T extends View> T findViewById(int i) {
        return getDelegate().mo3663a(i);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo3676b(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo3680c(bundle);
    }

    public void setContentView(View view) {
        getDelegate().mo3669a(view);
    }

    public C1218b startSupportActionMode(C1219a aVar) {
        return getDelegate().mo3662a(aVar);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo3681c(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo3591a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo3665a(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void supportNavigateUpTo(Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        C1163d delegate = getDelegate();
        delegate.mo3691i();
        delegate.mo3666a(bundle);
        if (delegate.mo3692j() && this.mThemeId != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(this.mThemeId);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(C0634aj ajVar) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0701y.m2029a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(ajVar.f2301b.getPackageManager());
            }
            ajVar.mo2158a(component);
            ajVar.f2300a.add(supportParentActivityIntent);
        }
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        if (VERSION.SDK_INT >= 16) {
            return shouldUpRecreateTask(intent);
        }
        String action = getIntent().getAction();
        if (action == null || action.equals("android.intent.action.MAIN")) {
            return false;
        }
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo3678b(view, layoutParams);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo3671a(charSequence);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        getDelegate().mo3670a(view, layoutParams);
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                return true;
            }
        }
        return false;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo3583a() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }
}

package android.support.p043v7.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.ao */
class C1430ao extends Resources {

    /* renamed from: a */
    private final Resources f5128a;

    public Configuration getConfiguration() {
        return this.f5128a.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f5128a.getDisplayMetrics();
    }

    public XmlResourceParser getAnimation(int i) throws NotFoundException {
        return this.f5128a.getAnimation(i);
    }

    public boolean getBoolean(int i) throws NotFoundException {
        return this.f5128a.getBoolean(i);
    }

    public int getColor(int i) throws NotFoundException {
        return this.f5128a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) throws NotFoundException {
        return this.f5128a.getColorStateList(i);
    }

    public float getDimension(int i) throws NotFoundException {
        return this.f5128a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) throws NotFoundException {
        return this.f5128a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) throws NotFoundException {
        return this.f5128a.getDimensionPixelSize(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        return this.f5128a.getDrawable(i);
    }

    public int[] getIntArray(int i) throws NotFoundException {
        return this.f5128a.getIntArray(i);
    }

    public int getInteger(int i) throws NotFoundException {
        return this.f5128a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) throws NotFoundException {
        return this.f5128a.getLayout(i);
    }

    public Movie getMovie(int i) throws NotFoundException {
        return this.f5128a.getMovie(i);
    }

    public String getResourceEntryName(int i) throws NotFoundException {
        return this.f5128a.getResourceEntryName(i);
    }

    public String getResourceName(int i) throws NotFoundException {
        return this.f5128a.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws NotFoundException {
        return this.f5128a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws NotFoundException {
        return this.f5128a.getResourceTypeName(i);
    }

    public String getString(int i) throws NotFoundException {
        return this.f5128a.getString(i);
    }

    public String[] getStringArray(int i) throws NotFoundException {
        return this.f5128a.getStringArray(i);
    }

    public CharSequence getText(int i) throws NotFoundException {
        return this.f5128a.getText(i);
    }

    public CharSequence[] getTextArray(int i) throws NotFoundException {
        return this.f5128a.getTextArray(i);
    }

    public XmlResourceParser getXml(int i) throws NotFoundException {
        return this.f5128a.getXml(i);
    }

    public TypedArray obtainTypedArray(int i) throws NotFoundException {
        return this.f5128a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) throws NotFoundException {
        return this.f5128a.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) throws NotFoundException {
        return this.f5128a.openRawResourceFd(i);
    }

    public C1430ao(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f5128a = resources;
    }

    public Drawable getDrawableForDensity(int i, int i2) throws NotFoundException {
        return this.f5128a.getDrawableForDensity(i, i2);
    }

    public String getQuantityString(int i, int i2) throws NotFoundException {
        return this.f5128a.getQuantityString(i, i2);
    }

    public CharSequence getQuantityText(int i, int i2) throws NotFoundException {
        return this.f5128a.getQuantityText(i, i2);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f5128a.obtainAttributes(attributeSet, iArr);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f5128a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public Drawable getDrawable(int i, Theme theme) throws NotFoundException {
        return this.f5128a.getDrawable(i, theme);
    }

    public String getString(int i, Object... objArr) throws NotFoundException {
        return this.f5128a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f5128a.getText(i, charSequence);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) throws NotFoundException {
        return this.f5128a.openRawResource(i, typedValue);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.f5128a != null) {
            this.f5128a.updateConfiguration(configuration, displayMetrics);
        }
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f5128a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f5128a.getIdentifier(str, str2, str3);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f5128a.getValue(i, typedValue, z);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f5128a.parseBundleExtra(str, attributeSet, bundle);
    }

    public Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.f5128a.getDrawableForDensity(i, i2, theme);
    }

    public String getQuantityString(int i, int i2, Object... objArr) throws NotFoundException {
        return this.f5128a.getQuantityString(i, i2, objArr);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f5128a.getValue(str, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws NotFoundException {
        this.f5128a.getValueForDensity(i, i2, typedValue, z);
    }
}

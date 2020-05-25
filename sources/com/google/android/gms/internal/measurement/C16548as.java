package com.google.android.gms.internal.measurement;

import android.content.res.Resources.NotFoundException;
import com.google.android.gms.internal.measurement.C16547ar;

/* renamed from: com.google.android.gms.internal.measurement.as */
class C16548as<T extends C16547ar> extends C16859q {

    /* renamed from: a */
    private C16549at<T> f46487a;

    public C16548as(C16862t tVar, C16549at<T> atVar) {
        super(tVar);
        this.f46487a = atVar;
    }

    /* renamed from: a */
    public final T mo31804a(int i) {
        try {
            return m39474a(this.f47329b.f47335b.getResources().getXml(i));
        } catch (NotFoundException e) {
            mo32498c("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        mo32499c("Error parsing bool configuration value", r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        mo32501d("Error parsing tracker configuration file", r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc A[ExcHandler: IOException | XmlPullParserException (r5v3 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final T m39474a(android.content.res.XmlResourceParser r5) {
        /*
            r4 = this;
            r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            int r0 = r5.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
        L_0x0007:
            r1 = 1
            if (r0 == r1) goto L_0x00d2
            int r0 = r5.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            r1 = 2
            if (r0 != r1) goto L_0x00c6
            java.lang.String r0 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = "screenname"
            boolean r1 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            r2 = 0
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = "name"
            java.lang.String r0 = r5.getAttributeValue(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r0 != 0) goto L_0x00c6
            android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            goto L_0x00c6
        L_0x003d:
            java.lang.String r1 = "string"
            boolean r1 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = "name"
            java.lang.String r0 = r5.getAttributeValue(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r2 != 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00c6
            com.google.android.gms.internal.measurement.at<T> r2 = r4.f46487a     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            r2.mo31807a(r0, r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            goto L_0x00c6
        L_0x0061:
            java.lang.String r1 = "bool"
            boolean r1 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "name"
            java.lang.String r0 = r5.getAttributeValue(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r2 != 0) goto L_0x00c6
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r2 != 0) goto L_0x00c6
            boolean r2 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ NumberFormatException -> 0x008d, IOException | XmlPullParserException -> 0x00cc }
            com.google.android.gms.internal.measurement.at<T> r3 = r4.f46487a     // Catch:{ NumberFormatException -> 0x008d, IOException | XmlPullParserException -> 0x00cc }
            r3.mo31808a(r0, r2)     // Catch:{ NumberFormatException -> 0x008d, IOException | XmlPullParserException -> 0x00cc }
            goto L_0x00c6
        L_0x008d:
            r0 = move-exception
            java.lang.String r2 = "Error parsing bool configuration value"
            r4.mo32499c(r2, r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            goto L_0x00c6
        L_0x0094:
            java.lang.String r1 = "integer"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "name"
            java.lang.String r0 = r5.getAttributeValue(r2, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r5.nextText()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            java.lang.String r1 = r1.trim()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r2 != 0) goto L_0x00c6
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            if (r2 != 0) goto L_0x00c6
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00c0, IOException | XmlPullParserException -> 0x00cc }
            com.google.android.gms.internal.measurement.at<T> r3 = r4.f46487a     // Catch:{ NumberFormatException -> 0x00c0, IOException | XmlPullParserException -> 0x00cc }
            r3.mo31806a(r0, r2)     // Catch:{ NumberFormatException -> 0x00c0, IOException | XmlPullParserException -> 0x00cc }
            goto L_0x00c6
        L_0x00c0:
            r0 = move-exception
            java.lang.String r2 = "Error parsing int configuration value"
            r4.mo32499c(r2, r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
        L_0x00c6:
            int r0 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x00cc }
            goto L_0x0007
        L_0x00cc:
            r5 = move-exception
            java.lang.String r0 = "Error parsing tracker configuration file"
            r4.mo32501d(r0, r5)
        L_0x00d2:
            com.google.android.gms.internal.measurement.at<T> r5 = r4.f46487a
            com.google.android.gms.internal.measurement.ar r5 = r5.mo31805a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16548as.m39474a(android.content.res.XmlResourceParser):com.google.android.gms.internal.measurement.ar");
    }
}

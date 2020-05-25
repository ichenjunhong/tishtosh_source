package com.p683ss.android.ugc.aweme.services;

import android.content.Context;
import com.p683ss.android.ugc.aweme.photo.C38681j;
import com.p683ss.android.ugc.aweme.photo.C38706r;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.p683ss.android.ugc.aweme.services.photo.IPhotoService;

/* renamed from: com.ss.android.ugc.aweme.services.PhotoService */
public class PhotoService implements IPhotoService {
    public int[] getImageWidthHeight(String str) {
        return C38681j.m86037a(str);
    }

    public void toPhotoEditActivity(Context context, PhotoContext photoContext) {
        PhotoEditActivity.m86002a(context, photoContext);
    }

    public PhotoContext compress(String str, C38706r rVar) {
        return C38681j.m86035a(str, rVar);
    }

    public PhotoContext compress(String str, C38706r rVar, int i, int i2) {
        return C38681j.m86036a(str, rVar, i, i2);
    }
}

package com.p683ss.p2568f.p2569a.p2573d;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p683ss.ttm.player.IMediaDataSource;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p683ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p683ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p683ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p683ss.ttm.player.MediaPlayer.OnLogListener;
import com.p683ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p683ss.ttm.player.MediaPlayer.OnScreenshotListener;
import com.p683ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p683ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p683ss.ttm.player.MediaPlayer.TrackInfo;
import com.p683ss.ttm.player.MediaPlayer.onSARChangedListener;
import com.p683ss.ttm.player.MediaPlayerClient;
import com.p683ss.ttm.player.PlaybackParams;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.f.a.d.b */
public final class C51332b implements MediaPlayer {

    /* renamed from: a */
    private MediaPlayerClient f128274a;

    public final void selectTrack(int i) {
    }

    public final void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public final void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public final void switchStream(int i, int i2) {
    }

    public final int getCurrentPosition() {
        if (this.f128274a != null) {
            return this.f128274a.getCurrentPosition();
        }
        return 0;
    }

    public final String getDataSource() {
        if (this.f128274a != null) {
            return this.f128274a.getDataSource();
        }
        return null;
    }

    public final int getDuration() {
        if (this.f128274a != null) {
            return this.f128274a.getDuration();
        }
        return 0;
    }

    public final int getPlayerType() {
        if (this.f128274a != null) {
            return this.f128274a.getType();
        }
        return 0;
    }

    public final TrackInfo[] getTrackInfo() {
        if (this.f128274a != null) {
            return this.f128274a.getTrackInfo();
        }
        return null;
    }

    public final int getVideoHeight() {
        if (this.f128274a != null) {
            return this.f128274a.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoType() {
        if (this.f128274a != null) {
            return this.f128274a.getVideoType();
        }
        return 0;
    }

    public final int getVideoWidth() {
        if (this.f128274a != null) {
            return this.f128274a.getVideoWidth();
        }
        return 0;
    }

    public final boolean isLooping() {
        if (this.f128274a != null) {
            return this.f128274a.isLooping();
        }
        return false;
    }

    public final boolean isMute() {
        if (this.f128274a != null) {
            return this.f128274a.isMute();
        }
        return false;
    }

    public final boolean isPlaying() {
        if (this.f128274a != null) {
            return this.f128274a.isPlaying();
        }
        return false;
    }

    public final void pause() {
        if (this.f128274a != null) {
            this.f128274a.pause();
        }
    }

    public final void prepare() {
        if (this.f128274a != null) {
            this.f128274a.prepare();
        }
    }

    public final void prepareAsync() {
        if (this.f128274a != null) {
            this.f128274a.prepareAsync();
        }
    }

    public final void prevClose() {
        if (this.f128274a != null) {
            this.f128274a.prevClose();
        }
    }

    public final void release() {
        if (this.f128274a != null) {
            this.f128274a.release();
        }
    }

    public final void releaseAsync() {
        if (this.f128274a != null) {
            this.f128274a.releaseAsync();
        }
    }

    public final void reset() {
        if (this.f128274a != null) {
            this.f128274a.reset();
        }
    }

    public final void start() {
        if (this.f128274a != null) {
            this.f128274a.start();
        }
    }

    public final void stop() {
        if (this.f128274a != null) {
            this.f128274a.stop();
        }
    }

    public final boolean isOSPlayer() {
        if (this.f128274a == null || this.f128274a.getType() == 0) {
            return true;
        }
        return false;
    }

    public final void deselectTrack(int i) {
        if (this.f128274a != null) {
            this.f128274a.deselectTrack(i);
        }
    }

    public final int getSelectedTrack(int i) {
        if (this.f128274a != null) {
            return this.f128274a.getSelectedTrack(i);
        }
        return -1;
    }

    public final String getStringOption(int i) {
        if (this.f128274a != null) {
            return this.f128274a.getStringOption(i);
        }
        return null;
    }

    public final void seekTo(int i) {
        if (this.f128274a != null) {
            this.f128274a.seekTo(i);
        }
    }

    public final void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f128274a != null) {
            this.f128274a.setDisplay(surfaceHolder);
        }
    }

    public final void setIsMute(boolean z) {
        if (this.f128274a != null) {
            this.f128274a.setIsMute(z);
        }
    }

    public final void setLooping(boolean z) {
        if (this.f128274a != null) {
            this.f128274a.setLooping(z);
        }
    }

    public final void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public final void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnCompletionListener(onCompletionListener);
        }
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnErrorListener(onErrorListener);
        }
    }

    public final void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public final void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnInfoListener(onInfoListener);
        }
    }

    public final void setOnLogListener(OnLogListener onLogListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnLogListener(onLogListener);
        }
    }

    public final void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnPreparedListener(onPreparedListener);
        }
    }

    public final void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
        if (this.f128274a != null) {
            this.f128274a.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    public final void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public final void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f128274a != null) {
            this.f128274a.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public final void setPanoVideoControlModel(int i) {
        if (this.f128274a != null) {
            this.f128274a.setPanoVideoControlModel(i);
        }
    }

    public final void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f128274a != null) {
            this.f128274a.setPlaybackParams(playbackParams);
        }
    }

    public final void setScreenOnWhilePlaying(boolean z) {
        if (this.f128274a != null) {
            this.f128274a.setScreenOnWhilePlaying(z);
        }
    }

    public final void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f128274a != null) {
            this.f128274a.takeScreenshot(onScreenshotListener);
        }
    }

    public final void setSurface(Surface surface) {
        if (this.f128274a != null && surface != null && surface.isValid()) {
            this.f128274a.setSurface(surface);
        }
    }

    public final void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f128274a != null) {
            this.f128274a.setDataSource(str);
        }
    }

    public final float getFloatOption(int i, float f) {
        if (this.f128274a != null) {
            return this.f128274a.getFloatOption(i, f);
        }
        return f;
    }

    public final int getIntOption(int i, int i2) {
        if (this.f128274a != null) {
            return this.f128274a.getIntOption(i, i2);
        }
        return i2;
    }

    public final long getLongOption(int i, long j) {
        if (this.f128274a != null) {
            return this.f128274a.getLongOption(i, j);
        }
        return j;
    }

    public final void rotateCamera(float f, float f2) {
        if (this.f128274a != null) {
            this.f128274a.rotateCamera(f, f2);
        }
    }

    public final void setCacheFile(String str, int i) {
        if (this.f128274a != null) {
            this.f128274a.setCacheFile(str, i);
        }
    }

    public final void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f128274a != null) {
            this.f128274a.setDataSource(context, uri);
        }
    }

    public final int setFloatOption(int i, float f) {
        if (this.f128274a != null) {
            return this.f128274a.setFloatOption(i, f);
        }
        return -1;
    }

    public final void setIntOption(int i, int i2) {
        if (this.f128274a != null) {
            this.f128274a.setIntOption(i, i2);
        }
    }

    public final long setLongOption(int i, long j) {
        if (this.f128274a != null) {
            return (long) this.f128274a.setLongOption(i, j);
        }
        return -1;
    }

    public final void setStringOption(int i, String str) {
        if (this.f128274a != null) {
            this.f128274a.setStringOption(i, str);
        }
    }

    public final void setVolume(float f, float f2) {
        if (this.f128274a != null) {
            this.f128274a.setVolume(f, f2);
        }
    }

    public final void setWakeMode(Context context, int i) {
        if (this.f128274a != null) {
            this.f128274a.setWakeMode(context, i);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.ttm.player.MediaPlayer m110391a(android.content.Context r9, int r10) {
        /*
            com.ss.f.a.d.b r0 = new com.ss.f.a.d.b
            r0.<init>()
            java.lang.Class<com.ss.f.a.d.b> r1 = com.p683ss.p2568f.p2569a.p2573d.C51332b.class
            monitor-enter(r1)
            boolean r2 = com.p683ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x0065
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r6 = "create"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0038 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r8 = com.p683ss.ttm.player.MediaPlayer.class
            r7[r2] = r8     // Catch:{ Throwable -> 0x0038 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r4] = r8     // Catch:{ Throwable -> 0x0038 }
            java.lang.reflect.Method r6 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Throwable -> 0x0038 }
            r6.setAccessible(r4)     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0038 }
            r7[r2] = r0     // Catch:{ Throwable -> 0x0038 }
            r7[r4] = r9     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r5 = r6.invoke(r5, r7)     // Catch:{ Throwable -> 0x0038 }
            com.ss.ttm.player.MediaPlayerClient r5 = (com.p683ss.ttm.player.MediaPlayerClient) r5     // Catch:{ Throwable -> 0x0038 }
            r0.f128274a = r5     // Catch:{ Throwable -> 0x0038 }
        L_0x0038:
            com.ss.ttm.player.MediaPlayerClient r5 = r0.f128274a     // Catch:{ all -> 0x0071 }
            if (r5 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            java.lang.String r10 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "create"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0065 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r7 = com.p683ss.ttm.player.MediaPlayer.class
            r6[r2] = r7     // Catch:{ Throwable -> 0x0065 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch:{ Throwable -> 0x0065 }
            java.lang.reflect.Method r5 = r10.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x0065 }
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x0065 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0065 }
            r3[r2] = r0     // Catch:{ Throwable -> 0x0065 }
            r3[r4] = r9     // Catch:{ Throwable -> 0x0065 }
            java.lang.Object r10 = r5.invoke(r10, r3)     // Catch:{ Throwable -> 0x0065 }
            com.ss.ttm.player.MediaPlayerClient r10 = (com.p683ss.ttm.player.MediaPlayerClient) r10     // Catch:{ Throwable -> 0x0065 }
            r0.f128274a = r10     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            com.ss.ttm.player.MediaPlayerClient r10 = r0.f128274a     // Catch:{ all -> 0x0071 }
            if (r10 != 0) goto L_0x006f
            com.ss.ttm.player.OSPlayerClient r9 = com.p683ss.ttm.player.OSPlayerClient.create(r0, r9)     // Catch:{ all -> 0x0071 }
            r0.f128274a = r9     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0071:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.p2568f.p2569a.p2573d.C51332b.m110391a(android.content.Context, int):com.ss.ttm.player.MediaPlayer");
    }

    public final void mouseEvent(int i, int i2, int i3) {
        if (this.f128274a != null) {
            this.f128274a.mouseEvent(i, i2, i3);
        }
    }

    public final void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f128274a != null) {
            this.f128274a.setDataSource(context, uri, map);
        }
    }
}

package com.bytedance.android.livesdk.gift.effect.video.p374a;

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
import com.p683ss.ttm.player.OSPlayerClient;
import com.p683ss.ttm.player.PlaybackParams;
import com.p683ss.ttm.player.TTPlayerConfiger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.d */
public class C7445d implements MediaPlayer {

    /* renamed from: d */
    private static boolean f20425d;

    /* renamed from: a */
    public boolean f20426a;

    /* renamed from: b */
    public String f20427b = "";

    /* renamed from: c */
    private MediaPlayerClient f20428c;

    public void selectTrack(int i) {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public int getCurrentPosition() {
        if (this.f20428c != null) {
            return this.f20428c.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.f20428c != null) {
            return this.f20428c.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.f20428c != null) {
            return this.f20428c.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        if (this.f20428c != null) {
            return this.f20428c.getType();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.f20428c != null) {
            this.f20428c.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.f20428c != null) {
            return this.f20428c.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.f20428c != null) {
            return this.f20428c.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.f20428c != null) {
            return this.f20428c.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.f20428c != null) {
            return this.f20428c.isLooping();
        }
        return false;
    }

    public boolean isMute() {
        if (this.f20428c != null) {
            return this.f20428c.isMute();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.f20428c != null) {
            return this.f20428c.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.f20428c != null) {
            this.f20428c.pause();
        }
    }

    public void prepare() {
        if (this.f20428c != null) {
            this.f20428c.prepare();
        }
    }

    public void prepareAsync() {
        if (this.f20428c != null) {
            this.f20428c.prepareAsync();
        }
    }

    public void prevClose() {
        if (this.f20428c != null) {
            this.f20428c.prevClose();
        }
    }

    public void release() {
        if (this.f20428c != null) {
            this.f20428c.release();
        }
    }

    public void releaseAsync() {
        if (this.f20428c != null) {
            this.f20428c.releaseAsync();
        }
    }

    public void reset() {
        if (this.f20428c != null) {
            this.f20428c.reset();
        }
    }

    public void start() {
        if (this.f20428c != null) {
            this.f20428c.start();
        }
    }

    public void stop() {
        if (this.f20428c != null) {
            this.f20428c.stop();
        }
    }

    public boolean isOSPlayer() {
        if (this.f20428c == null || this.f20428c.getType() == 0) {
            return true;
        }
        return false;
    }

    public void deselectTrack(int i) {
        if (this.f20428c != null) {
            this.f20428c.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.f20428c != null) {
            this.f20428c.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.f20428c != null) {
            return this.f20428c.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.f20428c != null) {
            this.f20428c.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f20428c != null) {
            this.f20428c.setDisplay(surfaceHolder);
        }
    }

    public void setIsMute(boolean z) {
        if (this.f20428c != null) {
            this.f20428c.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (this.f20428c != null) {
            this.f20428c.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f20428c != null) {
            this.f20428c.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.f20428c != null) {
            this.f20428c.setPanoVideoControlModel(i);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f20428c != null) {
            this.f20428c.setPlaybackParams(playbackParams);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.f20428c != null) {
            this.f20428c.setScreenOnWhilePlaying(z);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f20428c != null) {
            this.f20428c.takeScreenshot(onScreenshotListener);
        }
    }

    public void setSurface(Surface surface) {
        if ((surface == null || surface.isValid()) && this.f20428c != null) {
            this.f20428c.setSurface(surface);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f20428c != null) {
            this.f20428c.setDataSource(str);
        }
    }

    /* renamed from: a */
    public static MediaPlayer m15380a(Context context) {
        C7445d dVar = new C7445d();
        synchronized (C7445d.class) {
            if (TTPlayerConfiger.isOnTTPlayer()) {
                try {
                    Class cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                    declaredMethod.setAccessible(true);
                    dVar.f20428c = (MediaPlayerClient) declaredMethod.invoke(cls, new Object[]{dVar, context});
                    f20425d = true;
                } catch (Throwable th) {
                    dVar.f20426a = true;
                    dVar.f20427b = th.toString();
                }
                if (dVar.f20428c == null) {
                    try {
                        Class cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                        declaredMethod2.setAccessible(true);
                        dVar.f20428c = (MediaPlayerClient) declaredMethod2.invoke(cls2, new Object[]{dVar, context});
                    } catch (Throwable th2) {
                        dVar.f20426a = true;
                        dVar.f20427b = th2.toString();
                    }
                }
            }
            if (dVar.f20428c == null) {
                dVar.f20428c = OSPlayerClient.create(dVar, context);
            }
        }
        return dVar;
    }

    public float getFloatOption(int i, float f) {
        if (this.f20428c != null) {
            return this.f20428c.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.f20428c != null) {
            return this.f20428c.getIntOption(i, i2);
        }
        return i2;
    }

    public long getLongOption(int i, long j) {
        if (this.f20428c != null) {
            return this.f20428c.getLongOption(i, j);
        }
        return j;
    }

    public void rotateCamera(float f, float f2) {
        if (this.f20428c != null) {
            this.f20428c.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.f20428c != null) {
            this.f20428c.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f20428c != null) {
            this.f20428c.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.f20428c != null) {
            this.f20428c.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.f20428c != null) {
            this.f20428c.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.f20428c != null) {
            return (long) this.f20428c.setLongOption(i, j);
        }
        return -1;
    }

    public void setStringOption(int i, String str) {
        if (this.f20428c != null) {
            this.f20428c.setStringOption(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        if (this.f20428c != null) {
            this.f20428c.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.f20428c != null) {
            this.f20428c.setWakeMode(context, i);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.f20428c != null) {
            this.f20428c.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f20428c != null) {
            this.f20428c.setDataSource(context, uri, map);
        }
    }
}

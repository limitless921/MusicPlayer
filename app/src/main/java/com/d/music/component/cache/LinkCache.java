package com.d.music.component.cache;

import android.content.Context;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import android.view.View;

import com.d.lib.common.R;
import com.d.lib.common.component.cache.base.AbstractCache;
import com.d.lib.common.component.cache.exception.CacheException;
import com.d.lib.common.component.cache.listener.CacheListener;
import com.d.music.component.cache.manager.LinkCacheManager;
import com.d.music.component.cache.manager.LrcCacheManager;
import com.d.music.component.media.controler.Player;
import com.d.music.data.database.greendao.bean.MusicModel;

public class LinkCache extends AbstractCache<LinkCache, Player, MusicModel, String, String> {

    private LinkCache(Context context) {
        super(context);
    }

    private static int getTag() {
        return R.id.lib_pub_cache_tag_link;
    }

    @UiThread
    public static LinkCache with(Context context) {
        return new LinkCache(context);
    }

    @Override
    public void into(final Player view) {
        if (isFinishing() || view == null) {
            return;
        }
        if (mKey == null || TextUtils.isEmpty(mKey.songId)) {
            // Just error
            // TODO: @dsiner 2018/10/10
            return;
        }
        setTarget(view);
        Object tag = view.getTag(getTag());
        if (tag != null && tag instanceof String && TextUtils.equals((String) tag, mKey.songId)) {
            // Not refresh
            // return;
        }
        view.setTag(getTag(), mKey.songId);
        LinkCacheManager.getIns(getContext()).load(getContext(), mKey,
                new CacheListener<String>() {
                    @Override
                    public void onLoading() {
                        if (isFinished()) {
                            return;
                        }
                        if (mPlaceHolder == null) {
                            return;
                        }
                        setTarget(mPlaceHolder);
                    }

                    @Override
                    public void onSuccess(String result) {
                        if (isFinished()) {
                            return;
                        }
                        setTarget(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (isFinished()) {
                            return;
                        }
                        if (mError == null) {
                            return;
                        }
                        setTarget(mError);
                    }

                    private void setTarget(String value) {
                        // TODO: @dsiner 2018/10/10
                    }

                    private boolean isFinished() {
                        if (isFinishing() || getTarget() == null) {
                            return true;
                        }
                        Object tag = getTarget().getTag(getTag());
                        return tag == null || !(tag instanceof String) || !TextUtils.equals((String) tag, mKey.songId);
                    }
                });
    }

    public void listener(final Player view, final CacheListener<String> l) {
        if (isFinishing() || view == null) {
            return;
        }
        if (mKey == null || TextUtils.isEmpty(mKey.songId)) {
            // Just error
            if (l != null) {
                l.onError(new CacheException("Url must not be empty!"));
            }
            return;
        }
        setTarget(view);
        Object tag = view.getTag(getTag());
        if (tag != null && tag instanceof String && TextUtils.equals((String) tag, mKey.songId)) {
            // Not refresh
            // return;
        }
        view.setTag(getTag(), mKey.songId);
        LinkCacheManager.getIns(getContext()).load(getContext(), mKey,
                new CacheListener<String>() {
                    @Override
                    public void onLoading() {
                        if (isFinished()) {
                            return;
                        }
                        if (l != null) {
                            l.onLoading();
                        }
                    }

                    @Override
                    public void onSuccess(String result) {
                        if (isFinished()) {
                            return;
                        }
                        if (l != null) {
                            l.onSuccess(result);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (isFinished()) {
                            return;
                        }
                        if (l != null) {
                            l.onError(e);
                        }
                    }

                    private boolean isFinished() {
                        if (isFinishing() || getTarget() == null) {
                            return true;
                        }
                        Object tag = getTarget().getTag(getTag());
                        return tag == null || !(tag instanceof String) || !TextUtils.equals((String) tag, mKey.songId);
                    }
                });
    }

    @Override
    public void listener(CacheListener<String> l) {
        if (isFinishing()) {
            return;
        }
        if (TextUtils.isEmpty(mKey.songId)) {
            // Just error
            if (l != null) {
                l.onError(new CacheException("Url must not be empty!"));
            }
            return;
        }
        LinkCacheManager.getIns(getContext()).load(getContext(), mKey, l);
    }

    @SuppressWarnings("unused")
    @UiThread
    public static void clear(View view) {
        if (view == null) {
            return;
        }
        view.setTag(getTag(), "");
    }

    @SuppressWarnings("unused")
    @UiThread
    public static void release(Context context) {
        if (context == null) {
            return;
        }
        LrcCacheManager.getIns(context).release();
    }
}

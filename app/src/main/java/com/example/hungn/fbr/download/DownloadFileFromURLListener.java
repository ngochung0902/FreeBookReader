package com.example.hungn.fbr.download;

/**
 * Created by hieu.truongvan on 5/15/2017.
 */

public interface DownloadFileFromURLListener {
    public void OnStartDownload();
    public void OnDownloading(Integer... percent);
    public void OnFinishedDownload(int status);
}

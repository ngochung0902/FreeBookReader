package com.example.hungn.fbr.download;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.hungn.fbr.R;

public class Maindownload extends AppCompatActivity implements DownloadFileFromURLListener {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindownload);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        DownloadFileFromURL downloadFileFromURL = new DownloadFileFromURL();
        downloadFileFromURL.SetListener(this);

        downloadFileFromURL.execute("https://drive.google.com/uc?export=download&id=0Bx3MF54Iqf4OclFBOGlFNTJtRDA",
                getExternalFilesDir(null).getAbsolutePath() + "/dataBaoCaoAndroid.txt");
    }


    @Override
    public void OnStartDownload() {

    }

    @Override
    public void OnDownloading(Integer... percent) {
        progressBar.setProgress(percent[0]);
    }

    @Override
    public void OnFinishedDownload(int status) {
        Toast.makeText(this,"ĐÃ DOWNLOAND THÀNH CÔNG",Toast.LENGTH_LONG).show();
    }
}
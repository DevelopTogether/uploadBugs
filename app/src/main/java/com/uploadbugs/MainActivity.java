package com.uploadbugs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.uploadbugs.utils.BugPublicUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BugPublicUtils.checkToUploadBugInfos(this,"SCPS_crash","http://zc.xun365.net/WebService/SoftWare.asmx/SetBugInfo","201801160920","SCPS");

    }

}
